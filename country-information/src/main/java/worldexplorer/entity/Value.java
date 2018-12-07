package worldexplorer.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter @Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Value implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String quote;

    public Value(String quote) {
        this.quote = quote;
    }
}
