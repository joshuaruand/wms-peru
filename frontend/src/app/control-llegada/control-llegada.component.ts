import { Component, OnInit } from '@angular/core';
import { ApiService } from '../ApiService';
import { CodigoCitaDto, RptaCodigoCita } from '../interfaces';

@Component({
  selector: 'app-control-llegada',
  templateUrl: './control-llegada.component.html',
  styleUrls: ['./control-llegada.component.scss']
})
export class ControlLlegadaComponent implements OnInit {

  verificadorDirecto1 = "";
  verificadorDirecto2 = "";

  equis1 = "";
  estado = true;

  equis2 = "";
  estado2 = true;

  fechaBase = "";
  horaBase = "";
  dniBase = "Ingrese el dato";
  nombresBase = "Ingrese el dato";
  dniReal = "";
  nombresReal = "";

  codigos:CodigoCitaDto[];

  codCita:number = null;

  codCitaVerificado:number = null;

  codOrden:number = null;

  mensajeOrden = "Esperando código de cita";
  constructor(private api:ApiService) { }

  ngOnInit(): void {
    this.api.obtenerIdCitasRecepcion().subscribe(respuesta => {
      this.codigos = respuesta.codigosRecepcion;
    })
  }

  verificar() {
    console.log(this.codCita);
    this.codigos.forEach(element => {
      if(element.idCita == this.codCita) this.codCitaVerificado = element.idCita;
    });
    this.enviarValor();
  }

  enviarValor() {
    this.api.obtenerIdOrdenPorIdCita({
      "idCita": this.codCitaVerificado,
      "tipoCita": null,
      "fechaCita": null,
      "horaCita": null,
      "idAlmacen": null,
      "nombreCliente": null,
      "documentoCliente": null
    }).subscribe(respuesta => {
      this.codOrden = respuesta.idOrden;
      console.log("Codigo de orden " + respuesta.idOrden)
      if(respuesta.idOrden < 4 && respuesta.idOrden != null) this.mensajeOrden = "CO" + respuesta.idOrden;
      else this.mensajeOrden = "No hay orden asociada";
    })


  }

  traerTiempo(){
    if(this.codCita==1) {
      this.fechaBase = "2022-04-10";
      this.horaBase = "12:30:00";
      this.nombresBase = "Juan Lopez";
      this.dniBase = "76587655"
    }
    else if(this.codCita==2) {
      this.fechaBase = "2022-05-10";
      this.horaBase = "15:30:00";
      this.nombresBase = "Juan Lopez";
      this.dniBase = "76587655";
    }
    else if(this.codCita==3) {
      this.fechaBase = "2022-05-10";
      this.horaBase = "15:35:00";
      this.nombresBase = "Pedro Casas";
      this.dniBase = "77697655";
    }
    else {
      this.fechaBase = "NO CITA";
      this.horaBase = "NO CITA";
      this.nombresBase = "NO NOMBRE";
      this.dniBase = "NO DNI";
    }
  }

  click1() {
    if(this.estado) {
      this.equis1 = "X";
      this.estado = false;
      this.equis2 = "";
      this.estado2 = true;
    }
    else{
      this.equis1 = "";
      this.estado = true;
    }
  }

  click2() {
    if(this.estado2) {
      this.equis2 = "X";
      this.estado2 = false;
      this.equis1 = "";
      this.estado = true;
    }
    else{
      this.equis2 = "";
      this.estado2 = true;
    }
  }
  verificarTransportista() {

  }
}
