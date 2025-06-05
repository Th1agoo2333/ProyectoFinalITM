
import { Component } from '@angular/core';
import { FestivoService, Festivo } from '../../servicios/festivo';

@Component({
  selector: 'app-festivos',
  templateUrl: './festivos.html',
  styleUrls: ['./festivos.css']
})
export class Festivos {
  anio: number = new Date().getFullYear();
  festivos: Festivo[] = [];

  constructor(private servicio: FestivoService) {}

  buscarFestivos() {
    if (this.anio) {
      this.servicio.listarFestivos(this.anio).subscribe(data => {
        this.festivos = data;
      });
    }
  }
}
