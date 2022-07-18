import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent implements OnInit {

  @Output() valorInicio = new EventEmitter<number>();

  constructor() { }

  ngOnInit(): void {
  }

  funcionInicio() {
    this.valorInicio.emit(1);
  }

}
