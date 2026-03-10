export class Immobile{

    nome: string | undefined;
    anno: number | undefined;

    constructor(nome:string, anno:number){
        this.nome = nome;
        this.anno = anno;
    }

    informazioni(){
        return `Nome immobile: ${this.nome} è stato costruito nel ${this.anno} bla bla`;
    }

}