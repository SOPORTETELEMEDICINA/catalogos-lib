package net.amentum.niomedic.catalogos.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class CatCodigoPostalDomView implements Serializable {
   private Long idCatCodigoPostal;
   @Size(max = 6)
   private String codigoPostal;
   @Size(max = 100)
   private String asentamiento;
   @Size(max = 100)
   private String ciudad;
   private Integer idAsentaCpcons;
   @Size(max = 15)
   private String zona;
   @Size(max = 6)
   private String cveCiudad;
//   private String datosBusqueda;
//   relaciones
   private Integer catTipoAsentamientoId;
   private Integer catMunicipiosId;
   private Integer catEntidadesId;
//   valores de retorno
   private String descripcionAsentamiento;
   private String descripcionMunicipios;
   private String descripcionEntidades;
}
