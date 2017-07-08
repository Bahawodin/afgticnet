package se.javatar.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author Ajmal Bahawodin {@literal <mailto:ajmal@javatar.se/>}
 */
public class Show implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @NotNull
    private Event event;

    @ManyToOne
    @NotNull
    private Venue venue;


}
