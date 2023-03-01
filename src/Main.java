public class Main {
    public static void main(String[] args) {

        Caja caja = new Caja();
        Terminal t1 = new Terminal(1,caja);
        Terminal t2 = new Terminal(1,caja);
        Terminal t3 = new Terminal(1,caja);
        Terminal t4 = new Terminal(1,caja);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        double totalFacturado= caja.mostrarImporte();

        System.out.println("El global facturado ha sido de "+ totalFacturado);

    }
}