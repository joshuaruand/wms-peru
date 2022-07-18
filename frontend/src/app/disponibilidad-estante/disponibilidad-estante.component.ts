import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { ApiService } from '../ApiService';

@Component({
  selector: 'app-disponibilidad-estante',
  templateUrl: './disponibilidad-estante.component.html',
  styleUrls: ['./disponibilidad-estante.component.scss']
})
export class DisponibilidadEstanteComponent implements OnInit {

  @Output() tituloValor = new EventEmitter<boolean>();

  @Output() valorUbicar = new EventEmitter<number>();

  ubicacionAlmacen = "F";
  tipoAlmacen = "F";

  constructor(private api:ApiService) { }

  ngOnInit(): void {
    this.api.obtenerInfoAlmacen().subscribe(respuesta => {
      this.ubicacionAlmacen = respuesta.direccionAlmacen;
      this.tipoAlmacen = respuesta.tipoAlmacen;
    })
  }

  funcionVolver(){
    this.tituloValor.emit(false);
  }

  ubicarBien() {
    this.valorUbicar.emit(4);
  }

}
