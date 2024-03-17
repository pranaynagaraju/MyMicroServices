package dev.pranay.ms1;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="ms1")
public class Ms1Entity {
    @Column(name="m1_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int m1Id;
    @Column(name="m1_value")
    private String m1value;
}
