package net.amentum.niomedic.catalogos.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.io.Serializable;


@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class CatSexoView implements Serializable {
    private Integer idSexo;
    @Size(max = 100)
    private String descripcionSexo;
}
