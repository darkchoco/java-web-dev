package darkchoco.spring.narasrest.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Getter
@Entity
@Table(name = "country_capital")
public class CountryCapital {

    @Id
    private String id;
    private String code;
    private String capital;
}
