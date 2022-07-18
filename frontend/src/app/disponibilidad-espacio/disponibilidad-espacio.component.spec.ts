import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisponibilidadEspacioComponent } from './disponibilidad-espacio.component';

describe('DisponibilidadEspacioComponent', () => {
  let component: DisponibilidadEspacioComponent;
  let fixture: ComponentFixture<DisponibilidadEspacioComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DisponibilidadEspacioComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DisponibilidadEspacioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
