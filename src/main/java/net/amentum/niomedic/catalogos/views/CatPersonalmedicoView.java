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
public class CatPersonalmedicoView implements Serializable {

    private Integer perid;
    @Size(max = 30)
    private String descripcion;

    // las relaciones
    private Collection<CatServicioAtencionView> servicioAtencionViewList = new ArrayList<>();

}
