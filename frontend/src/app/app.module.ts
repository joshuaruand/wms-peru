import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PrincipalComponent } from './principal/principal.component';
import { MenuComponent } from './menu/menu.component';
import { NavbarComponent } from './navbar/navbar.component';
import { UsuarioComponent } from './usuario/usuario.component';
import { ControlLlegadaComponent } from './control-llegada/control-llegada.component';
import { RevisionLlegadaPComponent } from './revision-llegada-p/revision-llegada-p.component';
import { RevisionLlegadaSComponent } from './revision-llegada-s/revision-llegada-s.component';
import { DisponibilidadAlmacenComponent } from './disponibilidad-almacen/disponibilidad-almacen.component';
import { DisponibilidadEstanteComponent } from './disponibilidad-estante/disponibilidad-estante.component';
import { DisponibilidadEspacioComponent } from './disponibilidad-espacio/disponibilidad-espacio.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { BusquedaBienesComponent } from './busqueda-bienes/busqueda-bienes.component';

@NgModule({
  declarations: [
    AppComponent,
    PrincipalComponent,
    MenuComponent,
    NavbarComponent,
    UsuarioComponent,
    ControlLlegadaComponent,
    RevisionLlegadaPComponent,
    RevisionLlegadaSComponent,
    DisponibilidadAlmacenComponent,
    DisponibilidadEstanteComponent,
    DisponibilidadEspacioComponent,
    BusquedaBienesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
