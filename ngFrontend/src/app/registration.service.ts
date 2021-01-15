import { Injectable } from '@angular/core';
import { User } from './user';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http'
import { Product } from './product';
import { Comment } from './comment';

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {

  constructor(private _http: HttpClient) { }

  public loginUserFromRemote(user: User): Observable<any> {
    return this._http.post<any>('http://localhost:8111/login', user)
  }

  public registerUserFromRemote(user: User): Observable<any> {
    return this._http.post<any>('http://localhost:8111/registeruser', user)
  }

  public getProducts(): Observable<any> {
    console.log('Test Call');
    return this._http.get<Product[]>('http://localhost:8111/products');
  }

  public sendCommentFromRemote(comment: Comment): Observable<any> {
    console.log('Test CommentSave');
    return this._http.post<any>('http://localhost:8111/savecomment', comment);
  }

  
    public getComments(): Observable<any> {
    console.log('Test getComments');
    return this._http.get<any>('http://localhost:8111/getcomments');
  }
}
