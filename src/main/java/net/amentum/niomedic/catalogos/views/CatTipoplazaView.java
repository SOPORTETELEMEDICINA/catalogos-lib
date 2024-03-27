package net.amentum.niomedic.catalogos.views;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.io.Serializable;
@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class CatTipoplazaView implements Serializable {

    private Integer plaid;
    @Size(max = 30)
    private String tipo;
}
