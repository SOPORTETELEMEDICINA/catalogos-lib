package net.amentum.niomedic.catalogos.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class CatEstadoConsultaView implements Serializable {
   private Integer idEstadoConsulta;
   @Size(max = 30)
   private String descripcion;
   @Size(max = 10)
   private String color;
   private Boolean activo;
//   private String datosBusqueda;
}
