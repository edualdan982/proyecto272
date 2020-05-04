import { Component, OnInit } from '@angular/core';
import { Curso } from './curso';
import { CursoService } from './curso.service';


@Component({
  selector: 'app-cursos',
  templateUrl: './cursos.component.html'
})
export class CursosComponent implements OnInit {
  cursos: Curso[];
  paginador: any;
  cursoSeleccionado: Curso;

  constructor(
    private cursoService : CursoService
  ) { }

  ngOnInit(): void {
    this.cargarCursos();
  }
  cargarCursos(): void{
    this.cursoService.getCurso().subscribe(
      cursos => this.cursos = cursos
    );
  }

}
