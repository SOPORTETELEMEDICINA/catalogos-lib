package net.amentum.niomedic.catalogos.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class CatViaAdministracionView implements Serializable {
	/**
	 * 
	 **/
	private static final long serialVersionUID = 7360410379860541467L;
	private Integer idCatViaAdministracion;
	@Size(max = 50, message = "Maximo 50 caracteres")
	@NotEmpty(message="No puede ser nulo/vació")
	private String vaDescripcion;
	private Boolean activo;

}
