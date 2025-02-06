/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Miguel Angel Patiño
 */
public class TransferenciaBancaria implements Pagable {
    
private String cuentaDestino;

    public TransferenciaBancaria(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando transferencia bancaria de $" + monto + " a la cuenta " + cuentaDestino);
    }

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }
    
    
    
}
