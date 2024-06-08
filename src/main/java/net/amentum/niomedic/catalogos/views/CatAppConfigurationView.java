package net.amentum.niomedic.catalogos.views;

import lombok.*;
import org.hibernate.validator.constraints.NotEmpty;

@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CatAppConfigurationView {
    private Integer idCliente;
    @NotEmpty(message = "Debe agregar un nombre de cliente")
    private String cliente;
    @NotEmpty(message = "Debe agregar un telefono")
    private String telefono;
    private String telefono_emergencia;
    private String url_agenda;
    private String urlvideollamadas;
    private String urlchat;
    private String urlmail;
    private String urlprivacidad;
    private String urlsms;
    private String campo1;
    private String campo2;
    private String campo3;
    private String campo4;

    @Override
    public String toString() {
        return "AppConfiguration{" +
                "id_cliente=" + idCliente +
                ", cliente='" + cliente + '\'' +
                ", telefono='" + telefono + '\'' +
                ", telefono_emergencia='" + telefono_emergencia + '\'' +
                ", url_agenda='" + url_agenda + '\'' +
                ", urlvideollamadas='" + urlvideollamadas + '\'' +
                ", urlchat='" + urlchat + '\'' +
                ", urlmail='" + urlmail + '\'' +
                ", urlprivacidad='" + urlprivacidad + '\'' +
                ", urlsms='" + urlsms + '\'' +
                ", campo1='" + campo1 + '\'' +
                ", campo2='" + campo2 + '\'' +
                ", campo3='" + campo3 + '\'' +
                ", campo4='" + campo4 + '\'' +
                '}';
    }
}
