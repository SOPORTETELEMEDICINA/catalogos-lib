package net.amentum.niomedic.catalogos.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class CatDolometroView implements Serializable {
   private Integer idCatDolometro;
   private Integer nivel;
   @Size(max = 20)
   private String doloDescripcion;
//   private String datosBusqueda;
}
