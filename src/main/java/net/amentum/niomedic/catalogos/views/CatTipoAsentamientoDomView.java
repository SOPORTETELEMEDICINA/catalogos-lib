package net.amentum.niomedic.catalogos.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class CatTipoAsentamientoDomView implements Serializable {
   private Integer idCatTipoAsentamiento;
   @Size(max = 30)
   private String descripcionAsentamiento;
   @Size(max = 15)
   private String abreviatura;
   private Integer idAsentCve;
//   private String datosBusqueda;
}
