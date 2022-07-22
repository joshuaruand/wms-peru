import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { ApiService } from '../ApiService';
import { EspaciosDto, EstanteDto } from '../interfaces';

@Component({
  selector: 'app-disponibilidad-estante',
  templateUrl: './disponibilidad-estante.component.html',
  styleUrls: ['./disponibilidad-estante.component.scss']
})
export class DisponibilidadEstanteComponent implements OnInit {

  colorCuadro1 = "";
  colorCuadro2 = "";
  colorCuadro3 = "";
  colorCuadro4 = "";
  colorCuadro5 = "";
  colorCuadro6 = "";
  colorCuadro7 = "";
  colorCuadro8 = "";

  @Input() valorFinality2 = 1;

  @Output() tituloValor = new EventEmitter<boolean>();

  @Output() valorUbicar = new EventEmitter<number>();

  @Output() valorClickeado1 = new EventEmitter<number>();
  @Output() valorClickeado2 = new EventEmitter<number>();

  espacio1:EspaciosDto;
  espacio2:EspaciosDto;
  espacio3:EspaciosDto;
  espacio4:EspaciosDto;
  espacio5:EspaciosDto;
  espacio6:EspaciosDto;
  espacio7:EspaciosDto;
  espacio8:EspaciosDto;

  ubicacionAlmacen = "F";
  tipoAlmacen = "F";
  tipoEstante = "F";

  constructor(private api:ApiService) { }

  ngOnInit(): void {
    this.api.obtenerInfoAlmacen().subscribe(respuesta => {
      this.ubicacionAlmacen = respuesta.direccionAlmacen;
      this.tipoAlmacen = respuesta.tipoAlmacen;
    })

    this.api.obtenerGrillaEstantes().subscribe(respuesta => {
      this.tipoEstante = respuesta.grillaEstantes[this.valorFinality2-1].idEstante + " - " + respuesta.grillaEstantes[this.valorFinality2-1].tipoBien;
    })

    this.api.obtenerGrillaEspacios({"idEstante":this.valorFinality2}).subscribe(respuesta => {
      this.espacio1 = respuesta.grillaEspacios[0];
      this.espacio2 = respuesta.grillaEspacios[1];
      this.espacio3 = respuesta.grillaEspacios[2];
      this.espacio4 = respuesta.grillaEspacios[3];
      this.espacio5 = respuesta.grillaEspacios[4];
      this.espacio6 = respuesta.grillaEspacios[5];
      this.espacio7 = respuesta.grillaEspacios[6];
      this.espacio8 = respuesta.grillaEspacios[7];
      console.log(this.espacio2);
      this.funcionIniciar();
    })

  }

  funcionVolver(){
    this.tituloValor.emit(false);
  }

  ubicarBien(e:number) {
    this.valorUbicar.emit(4);
    this.valorClickeado1.emit(this.valorFinality2);
    this.valorClickeado2.emit(e);

  }

  coloreandoCuadro(a:number, b:number, c:number) {
    if(c==1) {
      if(a>=b) this.colorCuadro1 = "background: #F56363 !important";
      else this.colorCuadro1 = "";
    }
    if(c==2) {
      if(a>=b) this.colorCuadro2 = "background: #F56363 !important";
      else this.colorCuadro2 = "";
    }
    if(c==3) {
      if(a>=b) this.colorCuadro3 = "background: #F56363 !important";
      else this.colorCuadro3 = "";
    }
    if(c==4) {
      if(a>=b) this.colorCuadro4 = "background: #F56363 !important";
      else this.colorCuadro4 = "";
    }
    if(c==5) {
      if(a>=b) this.colorCuadro5 = "background: #F56363 !important";
      else this.colorCuadro5 = "";
    }
    if(c==6) {
      if(a>=b) this.colorCuadro6 = "background: #F56363 !important";
      else this.colorCuadro6 = "";
    }
    if(c==7) {
      if(a>=b) this.colorCuadro7 = "background: #F56363 !important";
      else this.colorCuadro7 = "";
    }
    if(c==8) {
      if(a>=b) this.colorCuadro8 = "background: #F56363 !important";
      else this.colorCuadro8 = "";
    }
  }

  funcionIniciar(){
    console.log(this.espacio2?.cantPaquetesUbicados, this.espacio2?.capacidad)
    this.coloreandoCuadro(this.espacio1?.cantPaquetesUbicados, this.espacio1?.capacidad, 1)
    this.coloreandoCuadro(this.espacio2?.cantPaquetesUbicados, this.espacio2?.capacidad, 2)
    this.coloreandoCuadro(this.espacio3?.cantPaquetesUbicados, this.espacio3?.capacidad, 3)
    this.coloreandoCuadro(this.espacio4?.cantPaquetesUbicados, this.espacio4?.capacidad, 4)
    this.coloreandoCuadro(this.espacio5?.cantPaquetesUbicados, this.espacio5?.capacidad, 5)
    this.coloreandoCuadro(this.espacio6?.cantPaquetesUbicados, this.espacio6?.capacidad, 6)
    this.coloreandoCuadro(this.espacio7?.cantPaquetesUbicados, this.espacio7?.capacidad, 7)
    this.coloreandoCuadro(this.espacio8?.cantPaquetesUbicados, this.espacio8?.capacidad, 8)
  }

}
