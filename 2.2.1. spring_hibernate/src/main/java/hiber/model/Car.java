package hiber.model;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "user")
@EqualsAndHashCode(exclude = "user")
@Builder
@Entity
@Table(name = "cars")
public class Car {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;

    private Integer series;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public void setUser(User user) {
        user.setCar(this);
        this.user = user;
    }
}
