import { Component, EventEmitter, OnInit, Output, Input } from '@angular/core';
import { ApiService } from '../ApiService';
import { OrdenDto, OrdenesRecepcionDetallado } from '../interfaces';

@Component({
  selector: 'app-revision-llegada-s',
  templateUrl: './revision-llegada-s.component.html',
  styleUrls: ['./revision-llegada-s.component.scss']
})
export class RevisionLlegadaSComponent implements OnInit {

  @Output() tituloValor = new EventEmitter<boolean>();

  @Input() valorFinality;

  lista:OrdenesRecepcionDetallado[] = [];

  constructor(private api:ApiService) { }

  ngOnInit(): void {
    this.api.obtenerOrdenesRecepcionDetallado({"idOrden":this.valorFinality}).subscribe(respuesta =>{
      this.lista = respuesta.detalle;
      console.log(this.lista);
    })
  }

  funcionVolver() {
    this.tituloValor.emit(false);
  }
}
