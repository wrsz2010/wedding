package com.javadub1.organizer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wedding implements IBaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Person bride;
    @OneToOne
    private Person groom;

    private LocalDate weddingDate;

    @OneToOne
    private AddressLocation weddingLocation;

    @OneToMany(mappedBy = "wedding")
    private Set<Expense> expenses;

    @OneToMany(mappedBy = "wedding")
    private Set<Invitation> invitations;

}
