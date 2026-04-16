/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafeteria;
import java.util.ArrayList;
/**
 *
 * @author Richa
 */
public class Pedido {
    
    String pedido;
    String pedidoExtra;
    int cantidad;
    double precio;
    double preciosExtra;
    
    public Pedido(String pedido, int cantidad, double precio, String pedidoExtra, double preciosExtra){
        this.pedido = pedido;
        this.pedidoExtra = pedidoExtra;
        this.cantidad = cantidad;
        this.precio = precio;
        this.preciosExtra = preciosExtra;
    }
    
    // Métodos getters para acceder a los datos
    public String getPedido() {
        return pedido;
    }
    public String getPedidoExtra() {
        return pedidoExtra;
    }
    public int getCantidad() {
        return cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public double getPreciosExtra() {
        return preciosExtra;
    }    
}
