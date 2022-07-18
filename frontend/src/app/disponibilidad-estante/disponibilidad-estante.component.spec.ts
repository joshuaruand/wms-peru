import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisponibilidadEstanteComponent } from './disponibilidad-estante.component';

describe('DisponibilidadEstanteComponent', () => {
  let component: DisponibilidadEstanteComponent;
  let fixture: ComponentFixture<DisponibilidadEstanteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DisponibilidadEstanteComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DisponibilidadEstanteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
