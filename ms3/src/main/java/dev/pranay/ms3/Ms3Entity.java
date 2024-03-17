package dev.pranay.ms3;


import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name="ms3")
public class Ms3Entity implements Serializable {
    @Column(name="m3_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int m3Id;
    @Column(name="m3_value")
    private String m3value;
}
