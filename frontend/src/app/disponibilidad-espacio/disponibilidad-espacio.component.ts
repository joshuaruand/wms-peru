import { Component, Input, OnInit } from '@angular/core';
import { ApiService } from '../ApiService';
import { CabeceraBienesLugarDto, PaquetesDto } from '../interfaces';

@Component({
  selector: 'app-disponibilidad-espacio',
  templateUrl: './disponibilidad-espacio.component.html',
  styleUrls: ['./disponibilidad-espacio.component.scss']
})
export class DisponibilidadEspacioComponent implements OnInit {

  @Input() valorEstanteLlegada = 0;
  @Input() valorEspacioLlegada = 0;

  paquete1:PaquetesDto;
  paquete2:PaquetesDto;
  paquete3:PaquetesDto;
  paquete4:PaquetesDto;

  paquetes:PaquetesDto[] = [];


  lista:number[] = []

  lugaresOcupados = 0;

  cabecera:CabeceraBienesLugarDto;

  constructor(private api:ApiService) { }

  ngOnInit(): void {

    this.lista[0] = 1;
    this.lista[1] = 2;
    this.lista[2] = 3;
    this.lista[3] = 4;

    console.log("Estante " + this.valorEstanteLlegada + " Espacio " + this.valorEspacioLlegada);

    const valor = ((this.valorEstanteLlegada-1)*8) + this.valorEspacioLlegada

    console.log(valor);

    this.api.obtenerBienesLugarDto({"idEspacio":valor,"numeroFila": null,"numeroColumna":null,"tipoEspacio":null,
    "cantPaquetesUbicados":null,"capacidad":null}).subscribe(respuesta => {
      this.cabecera = respuesta;
      console.log(this.cabecera);
    })

    this.api.obtenerPaquetesUbicados({"idEspacio":valor,"numeroFila": null,"numeroColumna":null,"tipoEspacio":null,
    "cantPaquetesUbicados":null,"capacidad":null}).subscribe(respuesta => {
      console.log(respuesta.paquetesUbicados.length)
      console.log(respuesta.paquetesUbicados)
      this.lugaresOcupados = respuesta.paquetesUbicados.length;
      if(respuesta.paquetesUbicados.length>0){
        this.paquete1 = respuesta.paquetesUbicados[0];
        this.paquetes[0] = this.paquete1;
      }
      if(respuesta.paquetesUbicados.length>1) {
        this.paquete2 = respuesta.paquetesUbicados[1];
        this.paquetes[1] = this.paquete2;
      }
      if(respuesta.paquetesUbicados.length>2) {
        this.paquete3 = respuesta.paquetesUbicados[2];
        this.paquetes[2] = this.paquete3;
      }
      if(respuesta.paquetesUbicados.length>3) {
        this.paquete4 = respuesta.paquetesUbicados[3];
        this.paquetes[3] = this.paquete4;
      }
    })
  }


  obtenerBool(a:number){

    if(a<=this.lugaresOcupados) return true;
    return false;
  }

}
