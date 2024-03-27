package net.amentum.niomedic.catalogos.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class CatCapitulosCie10View implements Serializable {
   private Integer idCatCapitulos;
   @Size(max = 10)
   private String codigosCapitulosCie10;
   @Size(max = 150)
   private String descripcionCapitulosCie10;
//   private String datosBusqueda;
}
