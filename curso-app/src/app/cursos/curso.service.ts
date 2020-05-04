import { Injectable } from '@angular/core';
import { Curso } from './curso';
import { Observable, throwError } from 'rxjs';
import { map, catchError, tap } from 'rxjs/operators';
import { HttpClient} from '@angular/common/http';

import { Router } from '@angular/router';

@Injectable()
export class CursoService {
  private urlEndPoint: string = "http://localhost:2003/api/cursos";

  constructor(
    private http: HttpClient,
    private router: Router
  ) { }

  getCurso(): Observable<Curso[]> {
    return this.http.get<Curso[]>(this.urlEndPoint).pipe();
  }

  create(curso: Curso): Observable<Curso> {
    return this.http.post(this.urlEndPoint, curso).pipe(
      map((response: any) => response.cliente as Curso),
      catchError(e => {
        if (e.status == 400) {
          return throwError(e);
        }
        if (e.error.mensaje) {
          console.log(e.error.mensaje);
        }
        return throwError(e);
      })
    );
  }
  update(curso: Curso): Observable<any> {
    return this.http.put<any>(`${this.urlEndPoint}/${curso.id}`, curso).pipe(
      catchError(e => {
        if (e.status == 400) {
          return throwError(e);
        }
        if (e.error.mensaje) {
          console.log(e.error.mensaje);
        }
        return throwError(e);
      })
    );
  }

  getCliente(id): Observable<Curso> {
    return this.http.get<Curso>(`${this.urlEndPoint}/${id}`).pipe(
      catchError(e => {
        if (e.status != 401 && e.error.mensaje) {
          this.router.navigate(['/clientes']);
          console.log(e.error.mensaje);
        }
        return throwError(e);
      })
    );
  }

  delete(id: number): Observable<Curso> {
    return this.http.delete<Curso>(`${this.urlEndPoint}/${id}`).pipe(
      catchError(e => {
        if (e.error.mensaje) {
          console.log(e.error.mensaje);
        }
        return throwError(e);
      })
    );
  }
}
