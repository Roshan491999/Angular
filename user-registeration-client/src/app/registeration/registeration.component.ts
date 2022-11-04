import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { UserRegisterationService } from '../user-registeration.service';

@Component({
  selector: 'app-registeration',
  templateUrl: './registeration.component.html',
  styleUrls: ['./registeration.component.css']
})
export class RegisterationComponent implements OnInit {

  employee: Employee = new Employee("","",0,"");
  message:any;

  constructor(private service:UserRegisterationService) { }

  ngOnInit() {
  }

  public registerNow(){
    let resp =this.service.doRegisteration(this.employee);
    resp.subscribe((data)=>this.message=data);

  }

}
