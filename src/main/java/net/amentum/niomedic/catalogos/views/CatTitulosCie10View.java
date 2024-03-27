package net.amentum.niomedic.catalogos.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class CatTitulosCie10View implements Serializable {
   private Integer idCatTitulos;
   @Size(max = 15)
   private String codigosTitulosCie10;
   @Size(max = 120)
   private String descripcionTitulosCie10;
   @Size(max = 150)
   private String aliasTitulosCie10;
//   private String datosBusqueda;
//   relaciones
   private Integer catCapitulosId;
//   valores de retorno
   private String _descripcionCapitulosCie10;
}
