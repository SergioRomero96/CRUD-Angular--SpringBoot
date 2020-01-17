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
    return this.http.post<Persona>(this.url+'/new', persona);
  }
}
