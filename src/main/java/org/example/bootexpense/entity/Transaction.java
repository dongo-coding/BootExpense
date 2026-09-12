package org.example.bootexpense.entity;

import jakarta.persistence.*; // Đảm bảo import dòng này
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "transactions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    @Id // <--- THIẾU HOẶC IMPORT SAI ANNOTATION NÀY
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private BigDecimal amount;
    private LocalDate date;
    private String category;
    private String type;
}