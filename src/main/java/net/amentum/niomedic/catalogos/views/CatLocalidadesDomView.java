package net.amentum.niomedic.catalogos.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class CatLocalidadesDomView implements Serializable {
   private Integer idCatLocalidades;
   private Integer catalogKey;
   @Size(max = 100)
   private String descripcionLocalidades;
//   @Size(max = 3)
   private Integer efeKey;
//   @Size(max = 4)
   private Integer munKey;
//   private String datosBusqueda;
}
