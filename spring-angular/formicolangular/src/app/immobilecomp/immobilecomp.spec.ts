import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Immobilecomp } from './immobilecomp';

describe('Immobilecomp', () => {
  let component: Immobilecomp;
  let fixture: ComponentFixture<Immobilecomp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Immobilecomp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Immobilecomp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
