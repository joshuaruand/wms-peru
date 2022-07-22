import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BusquedaBienesComponent } from './busqueda-bienes.component';

describe('BusquedaBienesComponent', () => {
  let component: BusquedaBienesComponent;
  let fixture: ComponentFixture<BusquedaBienesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BusquedaBienesComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BusquedaBienesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
