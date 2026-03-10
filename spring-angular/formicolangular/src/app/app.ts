import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Prodotto } from './prodotto/prodotto';
import { Negozio } from './negozio/negozio';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Prodotto, Negozio],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('Ti piace angular?');
}
