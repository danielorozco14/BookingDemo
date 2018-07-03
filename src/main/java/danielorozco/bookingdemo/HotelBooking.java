package danielorozco.bookingdemo;

public class HotelBooking {
    private String nombreHotel;
    private double precioPorNoche;
    private int numeroDeNoches;


    public HotelBooking(){

    }

    public HotelBooking(String nombreHotel,double precioPorNoche,int numeroDeNoches){

        this.nombreHotel = nombreHotel;
        this.precioPorNoche = precioPorNoche;
        this.numeroDeNoches = numeroDeNoches;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public int getNumeroDeNoches() {
        return numeroDeNoches;
    }

    public String getPrecioTotal(){
        String precioTotal= "$"+Double.toString(precioPorNoche*numeroDeNoches);
        return precioTotal;
    }


}
