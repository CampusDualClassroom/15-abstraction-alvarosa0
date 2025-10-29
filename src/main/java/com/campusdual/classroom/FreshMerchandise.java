package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
    private Date expirationDate;


    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area,
                            String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public Object getSpecificData() {
        SimpleDateFormat formateador = new SimpleDateFormat( "dd-MM-yyyy");
        String formateador2 = formateador.format(expirationDate);
        return "Localizacion: " + getLocation() + "Caducidad" + formateador2;
    }
    public String getFormattedDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return (formatter.format(date));
    }
    public Date getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
    public void printSpecificData(){
        System.out.println(getSpecificData());
    }
}
