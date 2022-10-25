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
  filterdEmployees: any[] = this.employees;
  private _designationFilter: string = '';

  set designationFilter(value: string){
    this._designationFilter=value;
    this.filterByDesignation();
  }
  
  get designationFilter(): string{
    return this._designationFilter;
  }

  constructor() { }

  ngOnInit(): void {
  }
  
  showIcons(){
    this.showIcon = !this.showIcon;
  }
  filterByDesignation(){
    this.filterdEmployees = this.employees.filter(employee => employee.designation.includes(this.designationFilter));
  }
}
