
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Festivo {
  fecha: string;
  nombre: string;
}

@Injectable({
  providedIn: 'root'
})
export class FestivoService {

  private apiUrl = 'http://localhost:8080/api/festivos';

  constructor(private http: HttpClient) {}

  validarFecha(fecha: string): Observable<string> {
    return this.http.get(`${this.apiUrl}/validar?fecha=${fecha}`, { responseType: 'text' });
  }

  listarFestivos(anio: number): Observable<Festivo[]> {
    return this.http.get<Festivo[]>(`${this.apiUrl}/listar?anio=${anio}`);
  }
}
