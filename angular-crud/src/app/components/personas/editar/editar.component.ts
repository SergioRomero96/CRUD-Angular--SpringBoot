import { Component, OnInit } from '@angular/core';
import { Persona } from 'src/app/models/Persona';
import { Router } from '@angular/router';
import { PersonaService } from 'src/app/services/persona.service';

@Component({
  selector: 'app-editar',
  templateUrl: './editar.component.html',
  styleUrls: ['./editar.component.css']
})
export class EditarComponent implements OnInit {
  persona: Persona;

  constructor(private router: Router, private service: PersonaService) {
    this.persona = new Persona();
  }

  ngOnInit() {
    this.getPersona();
  }

  getPersona() {
    let id = localStorage.getItem("id");
    console.log("id:" + id);
    this.service.getPersona(+id)
      .subscribe(data => {
        this.persona = data;
        console.log(this.persona);
      })
  }

  updatePersona() {
    this.service.updatePersona(this.persona)
      .subscribe(data => {
        this.persona = data;
        alert("Se Actualizo con exito!!");
        this.router.navigate(["listar"]);
      })
  }

}
