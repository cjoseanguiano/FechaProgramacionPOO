package com.generarenteros.company;

/**
 * Created by carlosjoseanguiano on 21/03/17.
 */
public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha() {

    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public void setDia(int d) {
        dia = d;
    }

    public void setMes(int m) {
        mes = m;
    }

    public void setAño(int a) {
        año = a;
    }

    public boolean fechaCorrecta() {
        boolean dCorrecto, mCorrecto, aCorrecto;
        dCorrecto = dia > 0;
        mCorrecto = mes >= 1 && mes <= 12;
        aCorrecto = año > 0 && año <= 2017;

        switch (mes) {
            case 2:
                if (esBisiesto()) {
                    dCorrecto = dia >= 1 && dia <= 29;
                } else {
                    dCorrecto = dia >= 1 && dia <= 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dCorrecto = dia >= 1 && dia <= 30;
                break;
            default:
                dCorrecto = dia >= 1 && dia <= 31;
        }
        return dCorrecto && mCorrecto && aCorrecto;
    }

    private boolean esBisiesto() {
        return (año % 4 == 0 && año % 100 != 0 || año % 400 == 0);
    }

    public void diaSiguiente() {
        dia++;
        if (!fechaCorrecta()) {
            dia = 1;
            mes++;
            if (!fechaCorrecta()) {
                mes = 1;
                año++;
            }
        }
    }

    @Override
    public String toString() {
/*        return "Fecha{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", año=" + año +
                '}';*/
        StringBuilder stringBuilder = new StringBuilder();
        if (dia < 10) {
            stringBuilder.append("0");
        }
        stringBuilder.append(dia);
        stringBuilder.append("-");
        if (mes < 10) {
            stringBuilder.append("0");
        }
        stringBuilder.append(mes);
        stringBuilder.append("-");
        stringBuilder.append(año);
        return stringBuilder.toString();
    }

}

