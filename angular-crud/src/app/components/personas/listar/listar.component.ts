import { Component, OnInit } from '@angular/core';
import { PersonaService } from 'src/app/services/persona.service';
import { Router } from '@angular/router';
import { Persona } from 'src/app/models/Persona';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css']
})
export class ListarComponent implements OnInit {
  personas: Persona[];

  constructor(private personaService:PersonaService, private router:Router) { }

  ngOnInit() {
    this.personaService.getPersonas()
    .subscribe(data =>{
      this.personas=data;
    })
  }

  editPersona(persona:Persona):void{
    console.log(persona);
    localStorage.setItem("id",persona.id.toString());
    this.router.navigate(["editar"]);
  }



}
