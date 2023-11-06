package com.example.Library.Management.Systems.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity //This means it's a structure that will be reflected in Database
@Table(name = "student") //This class will have a table whose name is studentTable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    private Integer studentId; //This will behave as the Primary Key

    private String name;

    private int age;

    @Column(name = "contactNo",unique = true,nullable = false)
    private String mobNo;

    private String emailId;

    private String bloodGroup;

    @JsonIgnore
    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private LibraryCard libraryCard;


    //This should also have libraryCard Information

}
