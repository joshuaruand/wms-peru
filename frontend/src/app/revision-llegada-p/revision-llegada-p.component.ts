import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { ApiService } from '../ApiService';
import { OrdenesRecepcionDto } from '../interfaces';

@Component({
  selector: 'app-revision-llegada-p',
  templateUrl: './revision-llegada-p.component.html',
  styleUrls: ['./revision-llegada-p.component.scss']
})
export class RevisionLlegadaPComponent implements OnInit {

  lista:OrdenesRecepcionDto[] = [];

  @Output() valorSeleccionado = new EventEmitter<number>();

  @Output() lupaValor = new EventEmitter<boolean>();

  constructor(private api:ApiService) { }

  ngOnInit(): void {
    this.api.obtenerOrdenesRecepcion().subscribe(respuesta => {
      this.lista = respuesta.lista;

      console.log(this.lista);
    })
  }

  irRevision(a:number){
    this.lupaValor.emit(true);
    this.valorSeleccionado.emit(a);
  }
}
