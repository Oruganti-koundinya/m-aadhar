import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, NgForm } from '@angular/forms';
import { AdminhomeComponent } from '../adminhome/adminhome.component';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  url='http://localhost:8080/citizens';
  constructor(private formBuilder: FormBuilder,private http: HttpClient , private router:Router) { }

  ngOnInit(): void {
  }
  onAddCitizen(citizenData: {name:string,dob:string,emailid:string,gender:string,mobileno:string,address:string }, form: NgForm) {
    this.http.post(this.url, citizenData).subscribe((responseData: AdminhomeComponent) => {
      console.log(responseData);
      alert("Registered Successfully!!");
      this.router.navigate(['adminhome']);
      form.reset();
    },err=>{
      alert("Something Happened!!")
    });
  }

}