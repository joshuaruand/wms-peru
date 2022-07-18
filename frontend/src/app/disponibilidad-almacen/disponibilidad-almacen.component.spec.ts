import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisponibilidadAlmacenComponent } from './disponibilidad-almacen.component';

describe('DisponibilidadAlmacenComponent', () => {
  let component: DisponibilidadAlmacenComponent;
  let fixture: ComponentFixture<DisponibilidadAlmacenComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DisponibilidadAlmacenComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DisponibilidadAlmacenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
