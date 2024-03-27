package net.amentum.niomedic.catalogos.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class CatTipoVialidadDomView implements Serializable {
   private Integer idCatTipoVialidad;
   private Integer vialCve;
   @Size(max = 20)
   private String descripcionVialidad;
//   private String datosBusqueda;
}
