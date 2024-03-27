package net.amentum.niomedic.catalogos.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class CatFormacionView implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4167549452606445371L;
	private Integer idCatFormacion;
	@Size(max = 110, message="No puede contener más de 110 caracteres")
	@NotEmpty(message="No puede ser nulo/vació")
	private String formDescripcion;
	@Size(max = 70, message="No puede contener más de 70 caracteres")
	@NotEmpty(message="No puede ser nulo/vació")
	private String formAgrupacion;
	@NotNull(message="No puede se nulo")
	private Integer formGrado;
	private Boolean activo;
}
