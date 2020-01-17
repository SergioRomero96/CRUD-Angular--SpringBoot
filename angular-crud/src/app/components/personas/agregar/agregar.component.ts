import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PersonaService } from 'src/app/services/persona.service';
import { Persona } from 'src/app/models/Persona';

@Component({
  selector: 'app-agregar',
  templateUrl: './agregar.component.html',
  styleUrls: ['./agregar.component.css']
})
export class AgregarComponent implements OnInit {
  persona: Persona;

  constructor(private router: Router, private service: PersonaService) {
    this.persona = new Persona();
  }

  ngOnInit() {
  }

  addPersona() {
    console.log(this.persona);
    this.service.addPersona(this.persona)
      .subscribe(data => {
        alert("Persona agregada correctamente!!");
        this.router.navigate(["listar"]);
      })
  }

}
