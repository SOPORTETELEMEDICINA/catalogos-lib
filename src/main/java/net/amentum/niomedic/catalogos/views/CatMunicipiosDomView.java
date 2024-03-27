package net.amentum.niomedic.catalogos.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.io.Serializable;

@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class CatMunicipiosDomView implements Serializable {
   private Integer idCatMunicipios;
   private Integer cveMunicipio;
   private String descripcionMunicipios;
   private Integer efeKey;
//   private String datosBusqueda;
}
