public class Terminal extends Thread{
    private double importeTerminal=0;
    private int id;
    private Caja caja;

    public Terminal(int id, Caja caja) {
        this.id = id;
        this.caja = caja;
    }

    @Override
    public void run() {
        for (int i=0; i<5; i++){
            double nuevaVenta = (double) (Math.random()*100);
            importeTerminal= importeTerminal+nuevaVenta;
            caja.IncrementarImporte(nuevaVenta);



            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("El terminal "+id+" facturó: "+importeTerminal);
    }
}
