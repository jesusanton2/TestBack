import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { persona } from 'src/app/model/persona.model';
import { PersonaService } from 'src/app/service/persona.service';

@Component({
  selector: 'app-datos-personales',
  templateUrl: './datos-personales.component.html',
  styleUrls: ['./datos-personales.component.css']
})
export class DatosPersonalesComponent implements OnInit {
  persona: persona= new persona("", "");
  
  constructor (public personaService: PersonaService, private httpClient: HttpClient){}

  ngOnInit(): void{

    this.personaService.getPersona().subscribe(data => (this.persona = data));
  }


   
}
