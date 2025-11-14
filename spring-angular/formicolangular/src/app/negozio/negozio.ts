import { Component } from '@angular/core';
import { Prodotto } from '../prodotto/prodotto';
import { Immobili } from '../immobili';
import { CommonModule } from '@angular/common';
import { Immobile } from '../../model/immobile';
import { Immobilecomp } from '../immobilecomp/immobilecomp';

@Component({
  selector: 'app-negozio',
  imports: [CommonModule, Prodotto, Immobilecomp],
  templateUrl: './negozio.html',
  styleUrl: './negozio.css',
})
export class Negozio {

  listaImmobili: string[];
  listaImmobiliVendita: Immobile[];

  constructor(service: Immobili){
    this.listaImmobili = service.listaImmobili();
    this.listaImmobiliVendita = service.getListaImmobiliVendita();
    
    console.log(this.listaImmobili);
    
  }

}
