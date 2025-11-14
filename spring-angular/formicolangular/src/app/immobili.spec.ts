import { TestBed } from '@angular/core/testing';

import { Immobili } from './immobili';

describe('Immobili', () => {
  let service: Immobili;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Immobili);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
