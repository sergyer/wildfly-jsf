package entities;

import lombok.*;

import javax.persistence.*;
import java.awt.*;
import java.util.Objects;

/**
 * Created by sergy on 15-Feb-17.
 */


@Entity
@Table(name = "user")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String age;
    private String ssn = "255";








}
