import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RevisionLlegadaSComponent } from './revision-llegada-s.component';

describe('RevisionLlegadaSComponent', () => {
  let component: RevisionLlegadaSComponent;
  let fixture: ComponentFixture<RevisionLlegadaSComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RevisionLlegadaSComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RevisionLlegadaSComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
