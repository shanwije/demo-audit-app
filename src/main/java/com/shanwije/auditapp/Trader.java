package com.shanwije.auditapp;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "trader")
@Data
public class Trader {
    @Id
    @GeneratedValue
    Long id;
    String name;
    String designation;
}
