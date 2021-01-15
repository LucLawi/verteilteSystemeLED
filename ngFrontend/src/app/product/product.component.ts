import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { RegistrationService } from '../registration.service';
import { Comment } from '../comment';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  products: Product[] | undefined;
  comment: Comment = new Comment();
  readcomment: Comment[] | undefined;
  //warenProduct = new Product();

  constructor(private _service: RegistrationService, private _router: Router) { }

  ngOnInit(): void {
    this._service.getProducts().subscribe(
      response => this.handleSuccessfulResponse(response),
    );

    this._service.getComments().subscribe(
      response => {
        console.log("getcomment received" + response);
        this.readcomment = response;
      },
      error => {
        console.log("exception occured getcomment")
      }
    );
  }


  handleSuccessfulResponse(response: Product[]) {
    this.products = response;
  }


  sendComment() {
    console.log(this.comment);
    this._service.sendCommentFromRemote(this.comment).subscribe(
      data => {
        console.log("sendcomment received");
        this._service.getComments().subscribe(
          response => {
            console.log("getcomment received" + response);
            this.readcomment = response;
          },
          error => {
            console.log("exception occured getcomment")
          }
        );
      },
      error => {
        console.log("exception occured sendcomment")
      }
    );
  }

  // addToWarenkorb() {
  //   console.log(this.warenProduct.name );
  //   return this.products
  // }

}