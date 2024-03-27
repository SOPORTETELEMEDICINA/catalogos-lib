package net.amentum.niomedic.catalogos.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class CatMedicamentosView implements Serializable {

   private static final long serialVersionUID = 4579949867262590993L;

   private Integer idCatMedicamentos;
   @Size(max = 25, message = "No puede contener más de 25 caracteres")
   @NotEmpty(message = "No puede ser nulo/vacio")
   private String cveCodigo;
   @Size(max = 25, message = "No puede contener más de 25 caracteres")
   @NotEmpty(message = "No puede ser nulo/vacio")
   private String subCveCodigo;
   @Size(max = 255, message = "No puede contener más de 255 caracteres")
   private String nombreGenerico;
   @Size(max = 100, message = "No puede contener más de 100 caracteres")
   private String formaFarmaceutica;
   private String concentracion;
   private String presentacion;
   private String principalIndicaciones;
   private String demasIndicaciones;
   @Size(max = 25, message = "No puede contener más de 25 caracteres")
   private String tipoActualizacion;
   @Size(max = 180, message = "No puede contener más de 180 caracteres")
   private String numActualizacion;
   private String descripcionCompleta;
//   relaciones
//   @NotNull(message = "No puede ser nulo/vacio")
   private Integer catTipoInsumoId;
//   @NotNull(message = "No puede ser nulo/vacio")
   private Integer catCuadroIoId;
//   @NotNull(message = "No puede ser nulo/vacio")
   private Integer catGpoTerapeuticoId;
   //   valores de retorno
//   private String _descripcionTipoInsumo;
//   private String _descripcionCuadroIo;
//   private String _descripcionGpoTerapeutico;
   @NotNull(message = "No puede ser nulo")
   private Boolean activo;
   private Date fechaUltimaModificacion;

}
