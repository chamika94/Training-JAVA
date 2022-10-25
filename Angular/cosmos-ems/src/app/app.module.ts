import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { EmployeesComponent } from './employees/employees.component';
import { LkrformatterPipe } from './shared/lkrformatter.pipe';

@NgModule({
  declarations: [
    AppComponent,
    EmployeesComponent,
    LkrformatterPipe
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
