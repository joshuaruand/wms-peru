import { ThisReceiver } from '@angular/compiler';
import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { ApiService } from '../ApiService';
import { AlmacenDto, EstanteDto } from '../interfaces';

@Component({
  selector: 'app-disponibilidad-almacen',
  templateUrl: './disponibilidad-almacen.component.html',
  styleUrls: ['./disponibilidad-almacen.component.scss']
})
export class DisponibilidadAlmacenComponent implements OnInit {

  ubicacionAlmacen:string = "F";
  tipoAlmacen:string = "F";

  listaEstantes: EstanteDto[] = [];

  estante1?: EstanteDto = undefined;
  estante2?: EstanteDto = undefined;
  estante3?: EstanteDto = undefined;
  estante4?: EstanteDto = undefined;


  @Output() lupaValor = new EventEmitter<boolean>();

  constructor(private api:ApiService) {

  }

  ngOnInit(): void {
    this.api.obtenerInfoAlmacen().subscribe(respuesta => {
      this.ubicacionAlmacen = respuesta.direccionAlmacen;
      this.tipoAlmacen = respuesta.tipoAlmacen;
    })

    this.api.obtenerGrillaEstantes().subscribe(respuesta => {
      this.listaEstantes = respuesta.grillaEstantes;
      this.estante1 = this.listaEstantes[0];
      this.estante2 = this.listaEstantes[1];
      this.estante3 = this.listaEstantes[2];
      this.estante4 = this.listaEstantes[3];
      console.log(this.listaEstantes[0]);
      console.log(this.listaEstantes[0].cantEspaciosTotal);
      console.log(this.estante1.cantEspaciosTotal);
    })
  }

  funcionRevisar(){
    this.lupaValor.emit(true);
  }
}
