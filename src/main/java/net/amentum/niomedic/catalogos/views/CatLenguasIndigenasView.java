package net.amentum.niomedic.catalogos.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class CatLenguasIndigenasView implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2435051662375535972L;
	private Integer idCatLenguasIndigenas;
	private Integer lengCatalogKey;
	@Size(min=3, max = 50, message="Ingrese minimo 3 caracteres y máximo 50 ")
	@NotNull(message = "no puede ser nulo")
	private String lengDescripcion;
	private Boolean activo;
}
