import java.time.LocalDate;
import java.time.LocalTime;

public class Principal {
    public static void main(String[] args) {
        //Instanciamos un país
        Pais pais = new Pais("Argentina");

        //Instanciamos provincias
        Provincia prov1 = new Provincia("Mendoza");
        Provincia prov2 = new Provincia("Buenos Aires");
        //Seteamos el pais a las provincias
        prov1.setPais(pais);
        prov2.setPais(pais);

        //Instanciamos localidades
        Localidad loc1 = new Localidad("Ciudad de Mendoza");
        Localidad loc2 = new Localidad("CABA");
        //Seteamos las provincias a las localidades
        loc1.setProvincia(prov1);
        loc2.setProvincia(prov2);

        //Instanciamos domicilios
        Domicilio dom1 = new Domicilio("Avenida Belgrano", 1200, 5501);
        Domicilio dom2 = new Domicilio("Avenida Libertadores", 500, 1499);
        //Seteamos las localidades a los domicilios
        dom1.setLocalidad(loc1);
        dom2.setLocalidad(loc2);

        //Instanciamos sucursales
        Sucursal suc1 = new Sucursal("Sucursal Mendoza", LocalTime.of(8, 30), LocalTime.of(22, 30));
        Sucursal suc2 = new Sucursal("Sucursal Buenos Aires", LocalTime.of(9, 0), LocalTime.of(23, 0));
        //Seteamos los domicilios a las sucursales
        suc1.setDomicilio(dom1);
        suc2.setDomicilio(dom2);

        //Instanciamos la empresa
        Empresa empresa = new Empresa("Smash Burgers", "Smash Burgers S.A.", 332084567);
        //Agregamos las sucursales a la empresa
        empresa.addSucursal(suc1);
        empresa.addSucursal(suc2);

        //Instanciamos ArticuloInsumo
        ArticuloInsumo articuloInsumo1 = new ArticuloInsumo("Cheddar", "100", 100.00, true, 50.00, 15, 5, 25, true);
        ArticuloInsumo articuloInsumo2= new ArticuloInsumo("Carne","101",300.00,true,120.00,30,4,50,true);
        ArticuloInsumo articuloInsumo3 = new ArticuloInsumo("Bacon", "101", 120.00, true, 50.00, 15, 5, 25, true);
        ArticuloInsumo articuloInsumo4 = new ArticuloInsumo("Pan de papa", "102", 150.00, true, 50.00, 15, 5, 25, true);
        ArticuloInsumo articuloInsumo5 = new ArticuloInsumo("Cerveza","200",1500.00,true,60.00,20,2,30,false);
        //Instanciamos la imagen del artículo insumo (cerveza) y la agregamos
        ImagenArticulo imgCerveza = new ImagenArticulo("Cerveza Andes", "cervezaandes.jpg");
        articuloInsumo5.addImagen(imgCerveza);

        //Instanciamos unidades de medidas
        UnidadMedida gramos = new UnidadMedida("gr");
        articuloInsumo1.setUnidadMedida(gramos);
        articuloInsumo2.setUnidadMedida(gramos);
        UnidadMedida unidad = new UnidadMedida("unidad");
        articuloInsumo3.setUnidadMedida(unidad);
        UnidadMedida litros = new UnidadMedida("lt");
        articuloInsumo5.setUnidadMedida(litros);

        //Instanciamos Artículo Manufacturado
        ArticuloManufacturado articuloManufacturado1 = new ArticuloManufacturado("Doble cheese burger", "1500", 9000.00, true, "Hamburguesa de pan de papa con cheddar, bacon y doble medallón", 18, "Coccion media");
        //Instanciamos la imagen del artículo manufacturado y la agregamos
        ImagenArticulo imgArticuloMan = new ImagenArticulo("Doble cheese imagen", "bcheese.jpg");
        articuloManufacturado1.addImagen(imgArticuloMan);
        //Instanciamos los detalles de los articulos manufacturados
        ArticuloManufacturadoDetalle detalleArticuloManufacturado1 = new ArticuloManufacturadoDetalle(1);
        ArticuloManufacturadoDetalle detalleArticuloManufacturado2 = new ArticuloManufacturadoDetalle(2);
        ArticuloManufacturadoDetalle detalleArticuloManufacturado3 = new ArticuloManufacturadoDetalle(1);
        ArticuloManufacturadoDetalle detalleArticuloManufacturado4 = new ArticuloManufacturadoDetalle(1);
        //Seteamos los articulos insumos en los detalles
        detalleArticuloManufacturado1.setArticuloInsumo(articuloInsumo1);
        detalleArticuloManufacturado2.setArticuloInsumo(articuloInsumo2);
        detalleArticuloManufacturado3.setArticuloInsumo(articuloInsumo3);
        detalleArticuloManufacturado4.setArticuloInsumo(articuloInsumo4);
        //Añadimos los detalles al artículo manufacturado
        articuloManufacturado1.addDetalle(detalleArticuloManufacturado1);
        articuloManufacturado1.addDetalle(detalleArticuloManufacturado2);
        articuloManufacturado1.addDetalle(detalleArticuloManufacturado3);
        articuloManufacturado1.addDetalle(detalleArticuloManufacturado4);

        //Instanciamos subcategorias y categorias padres
        Categoria categoriaPadre1 = new Categoria("Hamburguesas");
        Categoria categoriaPadre2 = new Categoria("Bebidas");
        Categoria categoria1 = new Categoria("Hamburguesas dobles");
        Categoria categoria2 = new Categoria("Con alcohol");
        categoriaPadre1.addCategoria(categoria1);
        categoriaPadre2.addCategoria(categoria2);

        //Agregamos articulos a las categorias
        categoria1.addArticulo(articuloManufacturado1);
        categoria2.addArticulo(articuloInsumo5);

        //Agregamos categorias a las sucursales
        suc1.addCategoria(categoriaPadre1);
        suc1.addCategoria(categoriaPadre2);
        suc2.addCategoria(categoriaPadre1);
        suc2.addCategoria(categoriaPadre2);

        //Instanciamos promociones
        Promocion promocion1 = new Promocion("Promo 10%", LocalDate.MIN, LocalDate.MAX, LocalTime.MIN, LocalTime.MAX, "Descuento por el aniversario del restaurante", 8000.00, TipoPromocion.PROMOCION);
        //Promocion promocion2 = new Promocion("Promo compartir", LocalDate.MIN, LocalDate.MAX, LocalTime.MIN, LocalTime.MAX, "Descuento disponible días martes", 15000.00, TipoPromocion.PROMOCION);
        //Agregamos artÍculo a las promociones
        promocion1.addArticulo(articuloManufacturado1);
        promocion1.addArticulo(articuloInsumo5);
        //Instanciamos ImagenPromocion
        ImagenPromocion imagenPromocion = new ImagenPromocion("Imagen de doble cheese con cerveza","imagenpromo.jpg");
        //Agregamos ImagenPromocion a promocion
        promocion1.addImagen(imagenPromocion);
        //Agregamos Promoción a Sucursal
        suc1.addPromocion(promocion1);

        //Instanciamos el pedido
        Pedido pedido = new Pedido(LocalTime.of(10, 30), /*1000.00, 1000.00,*/ Estado.PENDIENTE, TipoEnvio.DELIVERY, FormaPago.EFECTIVO, LocalDate.now());
        //Pedido pedido = new Pedido(LocalTime.of(10, 30), detalle, 1000.00, Estado.PENDIENTE, TipoEnvio.DELIVERY, FormaPago.EFECTIVO, LocalDate.now());
        //Instanciamos el detalle1 del pedido
        DetallePedido detalle1 = new DetallePedido(2);
        //Agregamos el articulo manufacturado al detalle1
        detalle1.setArticulo(articuloManufacturado1);
        //Instanciamos el detalle2 del pedido
        DetallePedido detalle2 = new DetallePedido(2);
        //Agregamos el articulo insumo al detalle2
        detalle2.setArticulo(articuloInsumo5);
        //Agregamos los detalles al pedido
        pedido.addDetallePedido(detalle1);
        pedido.addDetallePedido(detalle2);
        //Agregamos domicilio al pedido
        pedido.setDomicilio(dom1);
        //Agregamos la sucursal al pedido
        pedido.setSucursal(suc1);

        //Instanciamos facturas
        Factura factura = new Factura(20000.00, FormaPago.MERCADO_PAGO, LocalDate.now());
        // Factura factura2 = new Factura(10000.00, FormaPago.EFECTIVO, LocalDate.now());
        //Agregamos la factura al pedido
        pedido.setFactura(factura);


        //Instanciamos cliente con su usuario e imagen
        Usuario user = new Usuario("227", "mfernandez");
        ImagenCliente imgCliente = new ImagenCliente("imagen.jpg");
        Cliente cliente = new Cliente("Mariana", "Fernandez", "2611234567", "mfernandez@uc.cl", LocalDate.of(2000, 10, 10));
        cliente.setImagen(imgCliente);
        cliente.setUsuario(user);
        //Istanciamos el domicilio del cliente y se lo agregamos a la lista de domicilios
        Domicilio dom3 = new Domicilio("Avenida Lavalle", 1500, 5601);
        cliente.addDomicilio(dom3);
        //Agregamos pedido a cliente
        cliente.addPedido(pedido);

        //Imprimimos la empresa
        System.out.println(empresa);
        //Luego usaremos la librería lombok para el código (incluyendo los ToString)

    }
}