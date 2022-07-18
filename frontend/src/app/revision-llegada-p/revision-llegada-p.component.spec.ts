import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RevisionLlegadaPComponent } from './revision-llegada-p.component';

describe('RevisionLlegadaPComponent', () => {
  let component: RevisionLlegadaPComponent;
  let fixture: ComponentFixture<RevisionLlegadaPComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RevisionLlegadaPComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RevisionLlegadaPComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
