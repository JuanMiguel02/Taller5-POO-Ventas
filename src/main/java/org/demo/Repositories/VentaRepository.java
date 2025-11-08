package org.demo.Repositories;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import org.demo.Models.Cliente;
import org.demo.Models.Producto;
import org.demo.Models.Venta;

public class VentaRepository {
    private static VentaRepository instancia;
    private final ObservableList<Venta> ventas;

    private VentaRepository(){
        ventas = FXCollections.observableArrayList();
        cargarDatosEjemplo();
    }

    public static VentaRepository getInstancia(){
        if(instancia == null){
            instancia = new VentaRepository();
        }
        return instancia;
    }

    public ObservableList<Venta> getVentas() {
        return ventas;
    }

    public void guardarVenta(Venta venta){
        ventas.add(venta);
    }

    private void cargarDatosEjemplo(){
        Cliente c1 = new Cliente("Julian Casablancas", "2131231", "312312", "Armenia", "julian@gmail");
        Cliente c2 = new Cliente("Jhonatan Davis", "213532", "31253212", "Armenia", "jonathan@gmail");

        Producto p1 = new Producto("Botella Agua", 1500, 3, "Bebida");
        Producto p2 = new Producto("Leche", 2000, 2, "Lácteo");

        Venta v1 = new Venta(c1, p1, 2);
        Venta v2 = new Venta(c2, p2, 1);

        guardarVenta(v1);
        guardarVenta(v2);
    }
}
