export class Educacion {
    id?: number;
    nombreEd: string;
    contenidoEd: string;

    constructor(nombreEd: string, contenidoEd: string){
        this.contenidoEd = contenidoEd;
        this.nombreEd = nombreEd;
    }
}
