
import { Component } from '@angular/core';
import { FestivoService } from '../../servicios/festivo';

@Component({
  selector: 'app-validar',
  templateUrl: './validar.html',
  styleUrls: ['./validar.css']
})
export class Validar {
  fecha: string = '';
  resultado: string = '';

  constructor(private servicio: FestivoService) {}

  verificar() {
    if (this.fecha) {
      this.servicio.validarFecha(this.fecha).subscribe(resp => {
        this.resultado = resp;
      });
    }
  }
}
