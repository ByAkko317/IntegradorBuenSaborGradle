import java.time.LocalDate;

public class Factura extends Base{
    private String mpPreferenceId, mpPaymentType;
    private Integer mpPaymentId, mpMerchantOrderId;
    private FormaPago formaPago;
    private Double totalVenta;
    private LocalDate fechaFacturacion;

    public Factura() {
    }

    public Factura(double totalVenta, FormaPago formaPago, LocalDate fechaFacturacion) {
        this.totalVenta = totalVenta;
        this.formaPago = formaPago;
        this.fechaFacturacion = fechaFacturacion;
    }

    public LocalDate getFechaFacturacion() {
        return fechaFacturacion;
    }

    public void setFechaFacturacion(LocalDate fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public Integer getMpMerchantOrderId() {
        return mpMerchantOrderId;
    }

    public void setMpMerchantOrderId(Integer mpMerchantOrderId) {
        this.mpMerchantOrderId = mpMerchantOrderId;
    }

    public Integer getMpPaymentId() {
        return mpPaymentId;
    }

    public void setMpPaymentId(Integer mpPaymentId) {
        this.mpPaymentId = mpPaymentId;
    }

    public String getMpPaymentType() {
        return mpPaymentType;
    }

    public void setMpPaymentType(String mpPaymentType) {
        this.mpPaymentType = mpPaymentType;
    }

    public String getMpPreferenceId() {
        return mpPreferenceId;
    }

    public void setMpPreferenceId(String mpPreferenceId) {
        this.mpPreferenceId = mpPreferenceId;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }
}
