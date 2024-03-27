package net.amentum.niomedic.catalogos.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class CatGpoTerapeuticoMedView implements Serializable {
   private Integer idCatGpoTerapeutico;
   private Integer medGpoTerapeutico;
   @Size(max = 60)
   private String descripcionGpoTerapeutico;
   @Size(max = 20)
   private String nivelAtencionGpoTerapeutico;
//   private String datosBusqueda;
}
