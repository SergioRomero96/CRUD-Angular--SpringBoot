import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListarComponent } from './components/personas/listar/listar.component';
import { AgregarComponent } from './components/personas/agregar/agregar.component';
import { EditarComponent } from './components/personas/editar/editar.component';
import {FormsModule} from '@angular/forms';
import {PersonaService} from '../app/services/persona.service';
import {HttpClientModule}from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    ListarComponent,
    AgregarComponent,
    EditarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [
    PersonaService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
