import { Component } from '@angular/core';
import { Router } from "@angular/router";
import { AuthenticationService } from "../shared/authentication-service";

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {

  public email;
  public password;

  constructor(
    public authService: AuthenticationService,
    public router: Router) {}

  logIn() {
    if(this.email!=null && this.password!=null){
      this.authService.SignIn(this.email, this.password)
        .then((res) => {
          this.router.navigate(['dashboard']);          
        })
        .catch((error) => {
          window.alert(error.message)
        });
    }
  }

  clear(){
    this.email=null;
    this.password=null;
  }
}
