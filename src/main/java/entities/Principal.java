package entities;
import Services.ClienteService;

import java.time.LocalDate;
import java.time.LocalTime;

public class Principal {
    public static void main(String[] args) {
        //Instanciamos un país
        Pais pais = Pais.builder()
                .nombre("Argentina")
                .build();

        //Instanciamos provincias
        Provincia prov1 = Provincia.builder()
                .nombre("Mendoza")
                .build();

        Provincia prov2 = Provincia.builder()
                .nombre("Buenos Aires")
                .build();

        //Seteamos el pais a las provincias
        prov1.setPais(pais);
        prov2.setPais(pais);

        //Instanciamos localidades
        Localidad loc1 = Localidad.builder()
                .nombre("Ciudad de Mendoza")
                .build();

        Localidad loc2 = Localidad.builder()
                .nombre("CABA")
                .build();

        //Seteamos las provincias a las localidades
        loc1.setProvincia(prov1);
        loc2.setProvincia(prov2);

        //Instanciamos domicilios
        Domicilio dom1 = Domicilio.builder()
                .calle("Avenida Belgrano")
                .numero(1200)
                .cp(5501)
                .build();

        Domicilio dom2 = Domicilio.builder()
                .calle("Avenida Libertadores")
                .numero(500)
                .cp(1499)
                .build();
        //Seteamos las localidades a los domicilios
        dom1.setLocalidad(loc1);
        dom2.setLocalidad(loc2);

        //Instanciamos sucursales
          Sucursal suc1 = Sucursal.builder()
                  .nombre("Sucursal Mendoza")
                  .horarioApertura(LocalTime.of(8, 30))
                  .horarioCierre(LocalTime.of(22, 30))
                  .build();

          Sucursal suc2 = Sucursal.builder()
                  .nombre("Sucursal Buenos Aires")
                  .horarioApertura(LocalTime.of(9, 0))
                  .horarioCierre(LocalTime.of(23, 0))
                  .build();
        //Seteamos los domicilios a las sucursales
        suc1.setDomicilio(dom1);
        suc2.setDomicilio(dom2);

        //Instanciamos la empresa
//        Empresa empresa = new Empresa("Smash Burgers", "Smash Burgers S.A.", 332084567);
        Empresa empresa = Empresa.builder()
                .nombre("Smash Burgers")
                .razonSocial("Smash Burgers S.A.")
                .cuil(332084567)
                .build();
        //Agregamos las sucursales a la empresa
        empresa.addSucursal(suc1);
        empresa.addSucursal(suc2);

        //Instanciamos ArticuloInsumo
        ArticuloInsumo articuloInsumo1 = ArticuloInsumo.builder()
                .denominacion("Cheddar")
                .codigo("100")
                .precioVenta(100.00)
                .habilitado(true)
                .precioCompra(50.00)
                .stockActual(15)
                .stockMinimo(5)
                .stockMaximo(25)
                .esParaElaborar(true)
                .build();

        ArticuloInsumo articuloInsumo2 = ArticuloInsumo.builder()
                .denominacion("Carne")
                .codigo("101")
                .precioVenta(300.00)
                .habilitado(true)
                .precioCompra(120.00)
                .stockActual(30)
                .stockMinimo(4)
                .stockMaximo(50)
                .esParaElaborar(true)
                .build();

        ArticuloInsumo articuloInsumo3 = ArticuloInsumo.builder()
                .denominacion("Bacon")
                .codigo("101")
                .precioVenta(120.00)
                .habilitado(true)
                .precioCompra(50.00)
                .stockActual(15)
                .stockMinimo(5)
                .stockMaximo(25)
                .esParaElaborar(true)
                .build();

        ArticuloInsumo articuloInsumo4 = ArticuloInsumo.builder()
                .denominacion("Pan de papa")
                .codigo("102")
                .precioVenta(150.00)
                .habilitado(true)
                .precioCompra(50.00)
                .stockActual(15)
                .stockMinimo(5)
                .stockMaximo(25)
                .esParaElaborar(true)
                .build();

        ArticuloInsumo articuloInsumo5 = ArticuloInsumo.builder()
                .denominacion("Cerveza")
                .codigo("200")
                .precioVenta(1500.00)
                .habilitado(true)
                .precioCompra(60.00)
                .stockActual(20)
                .stockMinimo(2)
                .stockMaximo(30)
                .esParaElaborar(false)
                .build();

        //Instanciamos la imagen del artículo insumo (cerveza) y la agregamos
        ImagenArticulo imgCerveza = ImagenArticulo.builder()
                .nombre("Cerveza Andes")
                .url("cervezaandes.jpg")
                .build();
        articuloInsumo5.addImagen(imgCerveza);

        //Instanciamos unidades de medidas
        UnidadMedida gramos = UnidadMedida.builder().denominacion("gr").build();
        articuloInsumo1.setUnidadMedida(gramos);
        articuloInsumo2.setUnidadMedida(gramos);
        UnidadMedida unidad = UnidadMedida.builder().denominacion("unidad").build();
        articuloInsumo3.setUnidadMedida(unidad);
        UnidadMedida litros = UnidadMedida.builder().denominacion("lt").build();
        articuloInsumo5.setUnidadMedida(litros);

        //Instanciamos Artículo Manufacturado
        ArticuloManufacturado articuloManufacturado1 = ArticuloManufacturado.builder()
                .denominacion("Doble cheese burger")
                .codigo("1500")
                .precioVenta(9000.00)
                .habilitado(true)
                .descripcion("Hamburguesa de pan de papa con cheddar, bacon y doble medallón")
                .tiempoEstimadoMinutos(18)
                .preparacion("Cocción media")
                .build();
        //Instanciamos la imagen del artículo manufacturado y la agregamos
        ImagenArticulo imgArticuloMan = ImagenArticulo.builder()
                .nombre("Doble cheese imagen")
                .url("bcheese.jpg")
                .build();
        articuloManufacturado1.addImagen(imgArticuloMan);
        //Instanciamos los detalles de los articulos manufacturados
        ArticuloManufacturadoDetalle detalleArticuloManufacturado1 = ArticuloManufacturadoDetalle.builder()
                .cantidad(1)
                .build();

        ArticuloManufacturadoDetalle detalleArticuloManufacturado2 = ArticuloManufacturadoDetalle.builder()
                .cantidad(2)
                .build();

        ArticuloManufacturadoDetalle detalleArticuloManufacturado3 = ArticuloManufacturadoDetalle.builder()
                .cantidad(1)
                .build();

        ArticuloManufacturadoDetalle detalleArticuloManufacturado4 = ArticuloManufacturadoDetalle.builder()
                .cantidad(1)
                .build();
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
        //Categoria categoriaPadre1 = new Categoria("Hamburguesas");
        Categoria categoriaPadre1 = Categoria.builder()
                .denominacion("Hamburguesas")
                .build();

        Categoria categoriaPadre2 = Categoria.builder()
                .denominacion("Bebidas")
                .build();

        Categoria categoria1 = Categoria.builder()
                .denominacion("Hamburguesas dobles")
                .build();

        Categoria categoria2 = Categoria.builder()
                .denominacion("Con alcohol")
                .build();
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
        Promocion promocion1 = Promocion.builder()
                .denominacion("Promo 10%")
                .fechaDesde(LocalDate.MIN)
                .fechaHasta(LocalDate.MAX)
                .HoraDesde(LocalTime.MIN)
                .HoraHasta(LocalTime.MAX)
                .descripcionDescuento("Descuento por el aniversario del restaurante")
                .precioPromocional(8000.00)
                .tipoPromocion(TipoPromocion.PROMOCION)
                .build();
        //Promocion promocion2 = new Promocion("Promo compartir", LocalDate.MIN, LocalDate.MAX, LocalTime.MIN, LocalTime.MAX, "Descuento disponible días martes", 15000.00, TipoPromocion.PROMOCION);
        //Agregamos artÍculo a las promociones
        promocion1.addArticulo(articuloManufacturado1);
        promocion1.addArticulo(articuloInsumo5);
        //Instanciamos ImagenPromocion
        ImagenPromocion imagenPromocion = ImagenPromocion.builder()
                .denominacion("Imagen de doble cheese con cerveza")
                .url("imagenpromo.jpg")
                .build();
        //Agregamos ImagenPromocion a promocion
        promocion1.addImagen(imagenPromocion);
        //Agregamos Promoción a Sucursal
        suc1.addPromocion(promocion1);

        //Instanciamos el pedido
        Pedido pedido = Pedido.builder()
                .horaEstimadaFinalizacion(LocalTime.of(10, 30))
                .estado(Estado.PENDIENTE)
                .tipoEnvio(TipoEnvio.DELIVERY)
                .formaPago(FormaPago.EFECTIVO)
                .fechaPedido(LocalDate.now())
                .build();
        //Pedido pedido = new Pedido(LocalTime.of(10, 30), detalle, 1000.00, Estado.PENDIENTE, TipoEnvio.DELIVERY, FormaPago.EFECTIVO, LocalDate.now());
        //Instanciamos el detalle1 del pedido
        DetallePedido detalle1 = DetallePedido.builder()
                .cantidad(2)
                .build();
        //Agregamos el articulo manufacturado al detalle1
        detalle1.setArticulo(articuloManufacturado1);
        //Instanciamos el detalle2 del pedido
        DetallePedido detalle2 = DetallePedido.builder()
                .cantidad(2)
                .build();
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
        //Factura factura = new Factura(20000.00, FormaPago.MERCADO_PAGO, LocalDate.now());
        Factura factura = Factura.builder()
                .totalVenta(20000.00)
                .formaPago(FormaPago.MERCADO_PAGO)
                .fechaFacturacion(LocalDate.now())
                .build();
        // Factura factura2 = new Factura(10000.00, FormaPago.EFECTIVO, LocalDate.now());
        //Agregamos la factura al pedido
        pedido.setFactura(factura);


        //Instanciamos cliente con su usuario e imagen
        Usuario user = Usuario.builder()
                .authOId("227")
                .username("mfernandez")
                .build();

        ImagenCliente imgCliente = ImagenCliente.builder()
                .denominacion("imagen.jpg")
                .build();

        ClienteService service = new ClienteService();

        Cliente cliente = Cliente.builder()
                .nombre("Luciano")
                .apellido("Molaro")
                .email("luciano@mail.com")
                .fechaNacimiento(LocalDate.of(2000,9,27))
                .telefono(123456789)
                .build();
        try {
            service.registrarCliente(cliente);
            System.out.println("Cliente guardado.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        cliente.setImagen(imgCliente);
        cliente.setUsuario(user);
        //Istanciamos el domicilio del cliente y se lo agregamos a la lista de domicilios
        Domicilio dom3 = Domicilio.builder()
                .calle("Avenida Lavalle")
                .numero(1500)
                .cp(5601)
                .build();
        cliente.addDomicilio(dom3);
        //Agregamos pedido a cliente
        cliente.addPedido(pedido);

        //Imprimimos la empresa
        System.out.println(empresa);

    }
}