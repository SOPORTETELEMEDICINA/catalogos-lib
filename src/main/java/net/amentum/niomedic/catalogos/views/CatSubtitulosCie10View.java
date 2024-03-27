package net.amentum.niomedic.catalogos.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class CatSubtitulosCie10View implements Serializable {
   private Integer idCatSubtitulos;
   @Size(max = 10)
   private String codigosSubtitulosCie10;
   @Size(max = 200)
   private String descripcionSubtitulosCie10;
   @Size(max = 200)
   private String aliasSubtitulosCie10;
//   private String datosBusqueda;
//   relaciones
   private Integer catCapitulosId;
   private Integer catTitulosId;
//   valores de retorno
   private String _descripcionCapitulosCie10;
   private String _descripcionTitulosCie10;
}
