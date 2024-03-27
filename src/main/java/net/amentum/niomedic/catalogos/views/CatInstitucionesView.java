package net.amentum.niomedic.catalogos.views;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class CatInstitucionesView implements Serializable {

    private Integer idinstitucion;
    @Size(max = 150)
    private String instcve;
    private String instcvecorta;
    private String instnombre;
}
