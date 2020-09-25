import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SobreNosComponent } from './sobre-nos/sobre-nos.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { ContatoComponent } from './contato/contato.component';
import { FaqComponent } from './faq/faq.component';
import { ParceirosComponent } from './parceiros/parceiros.component';
import { PoliticasComponent } from './politicas/politicas.component';
import { TermosDeUsoComponent } from './termos-de-uso/termos-de-uso.component';
import { HttpClientModule } from '@angular/common/http';
import { UsuarioComponent } from './usuario/usuario.component';
import { CadastrarUsuariosComponent } from './cadastrar-usuarios/cadastrar-usuarios.component';
import { FormsModule } from '@angular/forms';
import { EditarUsuarioComponent } from './editar-usuario/editar-usuario.component';
import { LoginComponent } from './login/login.component';
import { DoacaoComponent } from './doacao/doacao.component';
import { ScrollToModule } from '@nicky-lenaers/ngx-scroll-to';
import { ProdutosComponent } from './produtos/produtos.component';
import { ReactiveFormsModule } from '@angular/forms';
import {JwPaginationModule} from 'jw-angular-pagination';
import { CarrinhoComponent } from './carrinho/carrinho.component';

@NgModule({
  declarations: [
    AppComponent,
    SobreNosComponent,
    NavbarComponent,
    FooterComponent,
    HomeComponent,
    ContatoComponent,
    FaqComponent,
    ParceirosComponent,
    PoliticasComponent,
    TermosDeUsoComponent,
    UsuarioComponent,
    CadastrarUsuariosComponent,
    EditarUsuarioComponent,
    LoginComponent,
    DoacaoComponent,
    ProdutosComponent,
    CarrinhoComponent,
    

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FontAwesomeModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    ReactiveFormsModule,
    ScrollToModule.forRoot(),
    JwPaginationModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
