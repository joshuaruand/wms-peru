import { Component, OnInit } from '@angular/core';
import { DatosPaquete } from '../interfaces';

@Component({
  selector: 'app-busqueda-bienes',
  templateUrl: './busqueda-bienes.component.html',
  styleUrls: ['./busqueda-bienes.component.scss']
})
export class BusquedaBienesComponent implements OnInit {

  codPaquete: number = null;
  valor: boolean = false;
  tituloPaquete: number = null;

  paqueteEncontrado:DatosPaquete = null;

  /*Ejemplo de respuesta*/
  respuesta:DatosPaquete[] = [];

  constructor() { }

  ngOnInit(): void {
    /*Ejemplo de lo de que debe hacer la API*/
    this.respuesta[0] = new DatosPaquete(1, "Polo", "S", "Rojo", 1, 1, 1);
    this.respuesta[1] = new DatosPaquete(2, "Polo", "S", "Rojo", 2, 1, 1);
    this.respuesta[2] = new DatosPaquete(3, "Polo", "S", "Rojo", 3, 1, 1);
    this.respuesta[3] = new DatosPaquete(4, "Polo", "S", "Rojo", 4, 1, 1);
    this.respuesta[4] = new DatosPaquete(5, "Polo", "L", "Rojo", 1, 2, 1);
    this.respuesta[5] = new DatosPaquete(6, "Polo", "L", "Rojo", 2, 2, 1);
    this.respuesta[6] = new DatosPaquete(7, "Polo", "L", "Rojo", 3, 2, 1);
    this.respuesta[7] = new DatosPaquete(8, "Polo", "L", "Rojo", 4, 2, 1);
    this.respuesta[8] = new DatosPaquete(9, "Polo", "M", "Azul", 1, 3, 1);
  }

  buscar() {
    console.log(this.codPaquete + " " + typeof(this.codPaquete));

    this.respuesta.forEach(paquete => {
      if(paquete.idPaquete == this.codPaquete) {
        this.paqueteEncontrado = paquete;
      }
    });

    this.valor = this.validar(this.paqueteEncontrado?.idPaquete);

  }

  validar(a) {
    if(typeof(a) == typeof(2) && this.paqueteEncontrado.idPaquete == this.codPaquete) {
      this.tituloPaquete = a;
      return true;
    }
    console.log(false);
    return false;
  }

}
