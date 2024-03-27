package net.amentum.niomedic.catalogos.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class CatNumerosEmergenciaView implements Serializable {
   private Integer idCatNumerosEmergencia;
   @Size(max = 20)
   private String numeroTelefonico;
   @Size(max = 20)
   private String numeroEmergenciaDescripcion;
//   private String datosBusqueda;
}
