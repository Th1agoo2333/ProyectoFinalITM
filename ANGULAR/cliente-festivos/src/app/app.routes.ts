
import { Routes } from '@angular/router';
import { Validar } from './componentes/validar/validar';
import { Festivos } from './componentes/festivos/festivos';

export const routes: Routes = [
  { path: '', redirectTo: 'validar', pathMatch: 'full' },
  { path: 'validar', component: Validar },
  { path: 'festivos', component: Festivos }
];
