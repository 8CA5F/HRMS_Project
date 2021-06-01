package com.emin.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "jobseeker_pictures")
public class JobseekerPicture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NotNull
    private int id;

    @Column(name = "picture_url")
    private String pictureUrl;

    @JsonIgnore
    @OneToMany(mappedBy = "jobseekerPicture")
    private List<CurriculaVitae> curriculaVitaes;

}