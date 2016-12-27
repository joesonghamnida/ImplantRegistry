package entities;

import javax.persistence.*;

/**
 * Created by joe on 12/26/16.
 */
@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue
    int id;

    @Column (nullable = false)
    String firstName;

    @Column (nullable = true)
    String middleName;

    @Column (nullable = false)
    String lastName;
}
