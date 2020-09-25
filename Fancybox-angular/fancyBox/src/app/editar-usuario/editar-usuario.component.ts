import { Component, OnInit } from '@angular/core';

import { Usuario } from '../model/usuario';
import { ActivatedRoute, Router } from '@angular/router';
import { UsuarioService } from '../service/usuario.service';
import { CarrinhoComponent } from '../carrinho/carrinho.component';


@Component({
  selector: 'app-editar-usuario',
  templateUrl: './editar-usuario.component.html',
  styleUrls: ['./editar-usuario.component.css']
})
export class EditarUsuarioComponent implements OnInit {
  usuario : Usuario = new Usuario


  data = {
    senha: '',
    confirmaSenha: '',
  };

  constructor(private usuarioService: UsuarioService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    let id = this.route.snapshot.params['id']
  }

  salvar(){
    this.usuarioService.putUsuario(this.usuario).subscribe((resp: Usuario)=>{
      this.usuario = resp
      this.router.navigate(['/cadastro'])
      location.assign('/cadastro')
    })
  }

}
