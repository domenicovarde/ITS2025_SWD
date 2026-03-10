import { Injectable } from '@angular/core';
import { Immobile } from '../model/immobile';

@Injectable({
  providedIn: 'root',
})
export class Immobili {
  
  lista: string[] = ['Casa signorile Via Roma', 'Casa con piscina Via Po', 'Tenda giardini Cavour'];

  listaImmobiliVendita: Immobile[] = [
    new Immobile("Casa a Parigi", 1789),
    new Immobile("Casa a New York", 1789),
    new Immobile("Casa a Roma", 1989),
    new Immobile("Capanna a Santo Domingo", 1960),
  ]

  listaImmobili(){
    return this.lista;
  }

  getListaImmobiliVendita(){
    return this.listaImmobiliVendita;
  }

}
