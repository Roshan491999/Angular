import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class UserRegisterationService {

  constructor(private Http:HttpClient) { }

    public doRegisteration(employee:Employee){
      return this.Http.post("localhost:8080/register",employee,{responseType:'text' as 'json'})
  }
}
