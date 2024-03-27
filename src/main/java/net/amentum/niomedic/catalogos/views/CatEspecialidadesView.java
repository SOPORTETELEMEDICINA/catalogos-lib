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
public class CatEspecialidadesView implements Serializable {

   private static final long serialVersionUID = -1318293042314277981L;

   private Integer idCatEspecialidades;
   @Size(max = 10, message="No puede contener más de 10 caracteres")
   @NotEmpty(message="No puede ser nulo/vacio")
   private String especialidadCodigo;
   @Size(max = 100, message="No puede contener más de 100 caracteres")
   @NotEmpty(message="No puede ser nulo/vacio")
   private String especialidadDescripcion;
   @NotNull(message="No puede ser nulo")
   private Boolean activo;
   private Date fechaUltimaModificacion;

}
