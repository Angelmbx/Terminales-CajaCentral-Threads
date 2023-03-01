public class Caja {
    private double importeTotal=0;

    public synchronized void IncrementarImporte(double importeTerminal){
        importeTotal=importeTotal+importeTerminal;
    }
    public synchronized double mostrarImporte(){
        return importeTotal;
    }
}
