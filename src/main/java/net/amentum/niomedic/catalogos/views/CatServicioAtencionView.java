package net.amentum.niomedic.catalogos.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class CatServicioAtencionView implements Serializable {
    private Integer idServicioAtencion;
    @Size(max = 100)
    private String descripcionServicioAtencion;

    private Collection<CatPersonalmedicoView> personalmedicoViewList = new ArrayList<>();

}
