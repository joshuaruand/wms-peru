import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-principal',
  templateUrl: './principal.component.html',
  styleUrls: ['./principal.component.scss']
})
export class PrincipalComponent implements OnInit {

  @Input() valorComponente = 1;

  @Output() valorUbicar2 = new EventEmitter<number>();

  valorRecibido = 0;
  valorRecibido2 = 0;

  valorEstante = 0;
  valorEspacio = 0;

  valorTrueFalse = true;
  valorTrueFalse2 = true;

  constructor() { }

  ngOnInit(): void {
  }

  funcionComponente(a:number){
    if(this.valorComponente == a) return true;
    else return false;
  }

  funcionCambiar(e:boolean){
    this.valorTrueFalse = !e;
  }

  funcionCambiar2(e:boolean){
    this.valorTrueFalse2 = !e;
  }

  funcionIrUbicar(e:number){
    this.valorUbicar2.emit(e);
  }

  funcionAparecer(e:number) {
    console.log("Funcion aparecer " + e);
    this.valorRecibido = e;
  }

  funcionAparecer2(e:number) {
    console.log("Funcion aparecer2 " + e);
    this.valorRecibido2 = e;
  }

  funcionClickeador1(e:number){
    this.valorEstante = e;
  }

  funcionClickeador2(e:number){
    this.valorEspacio = e;
  }
}
