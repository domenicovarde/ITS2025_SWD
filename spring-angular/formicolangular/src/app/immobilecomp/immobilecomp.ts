import { Component, Input } from '@angular/core';
import { Immobile } from '../../model/immobile';

@Component({
  selector: 'app-immobilecomp',
  imports: [],
  templateUrl: './immobilecomp.html',
  styleUrl: './immobilecomp.css',
})
export class Immobilecomp {
  @Input()
  immobile: Immobile | undefined;

  constructor(){
    console.log('prova', this.immobile);
    
  }

}
