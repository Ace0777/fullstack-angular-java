import { Injectable } from '@angular/core';
import { Client } from './clients/Client';

import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ClientsService {

  constructor(private http : HttpClient) {

    
   }

   save( client: Client) : Observable<Client>{
    return this.http.post<Client>('http://localhost:8080/api/clients', client )
   }
   

  getClients() : Client{
    let client : Client = new Client (); 
    client.name = 'Teste';
    client.documentType = '28389012389';
    return client;
  }
}
