import { Component, OnInit } from '@angular/core';
import { Curso } from './curso';

@Component({
  selector: 'app-form-add-curso',
  templateUrl: './form-add-curso.component.html'
})
export class FormAddCursoComponent implements OnInit {

  constructor() { }
  titulo: string= "Añadir Curso";
  curso: Curso = new Curso();
  ngOnInit(): void {

  }

}
