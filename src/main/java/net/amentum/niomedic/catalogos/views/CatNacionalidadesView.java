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
public class CatNacionalidadesView implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7905521806093827725L;
	private Integer idCatNacionalidades;
	@NotNull(message = "No puede ser nulo")
	private Integer nacPaisCodigo;
	@NotEmpty(message = "No puede ser nulo/vacio")
	@Size(max = 40)
	private String nacPaisDescripcion;
	@NotEmpty(message = "No puede ser nulo/vacio")
	@Size(max = 5)
	private String nacPaisClave;
	private Boolean activo;
}
