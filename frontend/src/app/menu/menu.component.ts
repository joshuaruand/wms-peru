import { Component, OnInit, Input, Output, EventEmitter} from '@angular/core';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss']
})
export class MenuComponent implements OnInit {


  @Output() valorMenu = new EventEmitter<number>();

  valorInterno = 0;

  otrosValores:string = "boton-menu-activado hover:border-2 hover:border-neutral-800";

  colorBoton1:string = "#FFC700";
  colorBoton2:string = "#FFFFFF";
  colorBoton3:string = "#FFFFFF";
  colorBoton4:string = "#FFFFFF";
  colorBoton5:string = "#FFFFFF";

  constructor() { }

  ngOnInit(): void {
  }

  dandoValor(a:number) {
    this.valorMenu.emit(a);
  }

  click(a:number){
    if(a==1){
      this.colorBoton1 = "#FFC700";
      this.colorBoton2 = "#FFFFFF";
      this.colorBoton3= "#FFFFFF";
      this.colorBoton4 = "#FFFFFF";
      this.colorBoton5 = "#FFFFFF";
      this.dandoValor(1);
      this.valorInterno = 1;
    }
    else if(a==2){
      this.colorBoton2 = "#FFC700";
      this.colorBoton1 = "#FFFFFF";
      this.colorBoton3= "#FFFFFF";
      this.colorBoton4 = "#FFFFFF";
      this.colorBoton5 = "#FFFFFF";
      this.dandoValor(2);
      this.valorInterno = 2;
    }
    else if(a==3){
      this.colorBoton3 = "#FFC700";
      this.colorBoton2 = "#FFFFFF";
      this.colorBoton1= "#FFFFFF";
      this.colorBoton4 = "#FFFFFF";
      this.colorBoton5 = "#FFFFFF";
      this.dandoValor(3);
      this.valorInterno = 3;
    }
    else if (a==4){
      this.colorBoton4 = "#FFC700";
      this.colorBoton2 = "#FFFFFF";
      this.colorBoton3= "#FFFFFF";
      this.colorBoton1 = "#FFFFFF";
      this.colorBoton5 = "#FFFFFF";
      this.dandoValor(4);
      this.valorInterno = 4;
    }

    else{
      this.colorBoton4 = "#FFFFFF";
      this.colorBoton2 = "#FFFFFF";
      this.colorBoton3= "#FFFFFF";
      this.colorBoton1 = "#FFFFFF";
      this.colorBoton5 = "#FFC700";
      this.dandoValor(5);
      this.valorInterno = 5;
    }
  }

  funcionRegresar(){
    if(this.valorInterno == 1) this.click(1);
    if(this.valorInterno == 2) this.click(1);
    if(this.valorInterno == 3) this.click(2);
    if(this.valorInterno == 4) this.click(3);
    if(this.valorInterno == 5) this.click(5);
  }
}
