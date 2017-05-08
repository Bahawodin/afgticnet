package se.javatar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
@SuppressWarnings("serial")
@Entity
public class Section implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;


}
