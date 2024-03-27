package net.amentum.niomedic.catalogos.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class CatEntidadesDomView implements Serializable {
   private Integer idCatEntidades;
   private Integer catalogKey;
   @Size(max = 40)
   private String descripcionEntidades;
   @Size(max = 4)
   private String abreviatura;
//   private String datosBusqueda;
}
