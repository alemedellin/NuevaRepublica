import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ConversionCilindrosComponent } from './conversion-cilindros/conversion-cilindros.component';
import { ConversionComponent } from './conversion/conversion.component';
import { PreconversionComponent } from './preconversion/preconversion.component';

const routes: Routes = [
  {
    path: '',
    children: [
      { path: 'conversion', component: ConversionComponent },
      { path: 'preconversion', component: PreconversionComponent },
      { path: 'conversionCilindros', component: ConversionCilindrosComponent },
      { path: '**', redirectTo: 'conversion' }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class FormatosRoutingModule { }