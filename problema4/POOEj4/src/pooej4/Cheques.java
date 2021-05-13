package pooej4;

/**
 *
 * @author 0zzda
 */
public class Cheques {

    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;

    public Cheques(String nomClie, String nomBanc, double vChe) {
        nombreCliente = nomClie;
        nombreBanco = nomBanc;
        valorCheque = vChe;
    }

    public void establecerNombreCliente(String nomClie) {
        nombreCliente = nomClie;
    }

    public void establecerNombreBanco(String nomBanc) {
        nombreBanco = nomBanc;
    }

    public void establecerValorCheque(double vChe) {
        valorCheque = vChe;
    }

    public void establecerComisionBanco() {
        comisionBanco = (valorCheque * 0.003) / 100;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenerComisionBanco() {
        return comisionBanco;
    }

    @Override
    public String toString() {
        String e1 = String.format("El señor: %s, cliente del banco: %s, con cheque de una cantidad de %s\nEl banco cobrará una comision de: %s",
                 obtenerNombreCliente(), obtenerNombreBanco(), obtenerValorCheque(), obtenerComisionBanco());
        return e1;
    }

}
