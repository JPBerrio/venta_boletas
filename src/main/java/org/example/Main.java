package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaTeclado=new Scanner(System.in);

        String cedulaComprador, nombresComprador, apellidosComprador, ciudadDeResidenciaComprador;
        Byte edadComprador;
        Short numeroBoletasComprador;
        Integer costoIndividualBoletas=450000;
        Integer costoTotalBoletas;


        System.out.println("HECTOR Y TITO GRAN GIRA DE DESPEDIDA POR COLOMBIA");
        System.out.println("*************************************************");
        System.out.println("Buen dia entusiasta del reggaeton, por favor diligencia los datos que te pedimos a continuacion: ");
        System.out.print("nombres completos: ");
        nombresComprador=entradaTeclado.nextLine();
        System.out.print("apellidos completos: ");
        apellidosComprador=entradaTeclado.nextLine();
        System.out.print("cedula de ciudadania colombiana: ");
        cedulaComprador=entradaTeclado.nextLine();
        System.out.print("ciudad de residencia: ");
        ciudadDeResidenciaComprador=entradaTeclado.nextLine();
        System.out.print("edad: ");
        edadComprador=entradaTeclado.nextByte();
        System.out.print("cantidad de boletas a comprar: ");
        numeroBoletasComprador=entradaTeclado.nextShort();

        costoTotalBoletas=numeroBoletasComprador*costoIndividualBoletas;

        if (edadComprador<=17||numeroBoletasComprador>4){
            System.out.println("no puedes comprar boletas porque eres menor de edad o quieres comprar mas de 4, mejor deja de pensar en rumba y ponte a estudiar: ");
        }else {
            System.out.println("Buena tarde amigo reggaetonero tu compra ha sido exitosa, podras disfrutar de la ultima gira de hector y tito por colombia, el costo total de tus boletas es de: "+costoTotalBoletas + " pesos colombianos.");
        }






    }
}