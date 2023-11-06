package com.example.Library.Management.Systems.Entities;

import com.example.Library.Management.Systems.Enums.TransactionStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transactionId;

    @Enumerated(value = EnumType.STRING)
    private TransactionStatus transactionStatus;


    private Date returnDate;
    private Integer fine;

    @CreationTimestamp
    private Date CreatedOn;

    @UpdateTimestamp
    private Date lastModifiedOn;

    @ManyToOne
    @JoinColumn
    private Book book;


    @ManyToOne
    @JoinColumn
    private LibraryCard card;

}