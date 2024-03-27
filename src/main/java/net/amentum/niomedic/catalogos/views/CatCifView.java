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
public class CatCifView implements Serializable {

   private static final long serialVersionUID = -4213985610246425803L;
   private Integer idCatCif;
   @Size(max = 10, message="No puede contener más de 10 caracteres")
   @NotEmpty(message="No puede ser nulo/vacio")
   private String discCodigo;
   @Size(max = 200, message="No puede contener más de 200 caracteres")
   @NotEmpty(message="No puede ser nulo/vacio")
   private String discDescripcion;
   @NotNull(message="No puede ser nulo")
   private Boolean activo;
   private Date fechaUltimaModificacion;
}
