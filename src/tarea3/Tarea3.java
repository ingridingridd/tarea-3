package tarea3;
public class Tarea3 {

    public static void main(String[] args) throws PagoIncorrectoException, PagoInsuficienteException, NoHayBebidaException {
        System.out.println("INSTRUCCIONES");
        System.out.print("Debes elegir primero la cantidad de dinero que quieras y posteriormente la bebida\n(Asegúrate que la cantidad de dinero sea mayor al precio de las bebidas, el cual es 3000 pesos)\n");
        System.out.println("Depósitos:\nMonedas-Gris-NO INTERACCION\nBlanco-Vuelto-INTERACCION CLICK DERECHO E IZQUIERDO\nNegro-Retirar-INTERACCION CLICK IZQUIERDO\n");
        Ventana v= new Ventana();
    }
}
