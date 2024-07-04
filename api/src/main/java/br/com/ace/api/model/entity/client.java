package br.com.ace.api.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Table
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String name;

    @Column(name = "document_type", nullable = false, length = 11)
    private String documentType;

    @Column(name = "registration_date", updatable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate registrationDate;

    @PrePersist
    public void prePersist(){
        setRegistrationDate(LocalDate.now());
    }


}
