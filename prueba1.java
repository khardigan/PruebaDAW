public class prueba1{
    private int x;
    private String palabra;

    public prueba1(int x,String palabra){
        this.x=x;
        this.palabra=palabra;
    }
    public String getPalabra() {
        return palabra;
    }
    public int getX() {
        return x;
    }
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    public void setX(int x) {
        this.x = x;
    }
    @Override
    public String toString() {
        String total ="";
        for(int i=0;i<x;i++){
            total +=palabra;
        }
        return total;
    }
}
