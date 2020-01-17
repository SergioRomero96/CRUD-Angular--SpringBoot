import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Persona } from '../models/Persona';

@Injectable({
  providedIn: 'root'
})
export class PersonaService {
  private url = 'http://localhost:8080/api/personas';

  constructor(private http: HttpClient) { }

  getPersonas() {
    return this.http.get<Persona[]>(this.url);
  }

  addPersona(persona: Persona) {
    return this.http.post<Persona>(this.url + '/new', persona);
  }

  getPersona(id: number) {
    return this.http.get<Persona>(this.url + `/${id}`);
  }

  updatePersona(persona: Persona) {
    return this.http.put<Persona>(this.url + `/${persona.id}`, persona);
  }

  deletePersona(persona: Persona) {
    console.log(persona.id);
    return this.http.delete<Persona>(this.url + `/${persona.id}`);
  }
}
