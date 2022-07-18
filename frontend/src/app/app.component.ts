import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'frontend';

  valor = 1;

  funcionCambiar(e:number){
    this.valor = e;
  }

  funcionUbicarFinal(e:number) {
    this.valor = e;
  }
}
