import { Component, OnInit } from '@angular/core';
import employees from './data/employees.json';

@Component({
  selector: 'em-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.scss']
})
export class EmployeesComponent implements OnInit {

  title: string = 'Employee Management Solution';
  showIcon: boolean = false;
  employees: any[] = employees;

  constructor() { }

  ngOnInit(): void {
  }
  
  showIcons(){
    this.showIcon = !this.showIcon;
  }
}
