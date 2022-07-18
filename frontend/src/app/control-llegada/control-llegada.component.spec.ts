import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ControlLlegadaComponent } from './control-llegada.component';

describe('ControlLlegadaComponent', () => {
  let component: ControlLlegadaComponent;
  let fixture: ComponentFixture<ControlLlegadaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ControlLlegadaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ControlLlegadaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
