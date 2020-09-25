import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Usuario } from '../model/usuario';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

usuario: Usuario;

  constructor(private http: HttpClient) {}

  putUsuario(usuario: Usuario){
    return this.http.put('http://localhost:8080/usuarios/cadastrar',usuario)
  }
}
