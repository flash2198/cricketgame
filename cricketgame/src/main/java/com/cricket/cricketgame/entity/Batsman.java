package com.cricket.cricketgame.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
//@NoArgsConstructor
@AllArgsConstructor
public class Batsman {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long batsmanId;
    private String batsmanName;
    private int ballsPlayed;
    private int runsScored;
    private double strikeRate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Batsman batsman = (Batsman) o;
        return batsmanId != null && Objects.equals(batsmanId, batsman.batsmanId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
