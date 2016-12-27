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
    String first_name;

    @Column (nullable = true)
    String middle_name;

    @Column (nullable = false)
    String last_name;

    //TODO: replace string with some date thing
    @Column (nullable = false)
    String date_of_birth;

    @Column(nullable = true)
    String date_of_death;

    //TODO: think about security for this. Make private?
    @Column(nullable = false)
    int SSN;

    @Column(nullable = false)
    String gender;

    //TODO: figure out how to do address properly
    @Column(nullable = false)
    String address;

    @Column(nullable = false)
    String phone_number;

    //pcp

    //date created
}
