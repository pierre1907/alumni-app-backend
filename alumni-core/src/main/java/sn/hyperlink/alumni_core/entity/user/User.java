package sn.hyperlink.alumni_core.entity.user;

import lombok.*;
import sn.hyperlink.alumni_core.utils.ValidEmailDomain;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Builder

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private Long id;

    @ValidEmailDomain
    @Email(message = "Email non valide")
    @Column(unique = true, name = "email")
    @NotBlank(message = "L'email est obligatoire")
    private String email;

    @Column(name= "prenom")
    @NotBlank(message = "Le prénom est obligatoire")
    private String prenom;

    @Column(name= "nom")
    @NotBlank(message = "Le nom est obligatoire")
    private String nom;

    @Column(name= "date_de_naissance")
    private Date dateDeNaissance;

    @Column(name= "genre")
    @NotBlank(message = "Le genre est obligatoire")
    private String genre;

    @Column(name= "adresse")
    private String adresse;

    @Column(name= "telephone")
    @NotBlank(message = "Le numéro de téléphone est obligatoire")
    private String phoneNumber;

    @Column(name= "insitut")
    @NotBlank(message = "Le batiment est obligatoire")
    private String batiment;

    @Column(name= "nom_programme")
    @NotBlank(message = "Le programme est obligatoire")
    private String programme;

    @Column(name= "diplome_alumni")
    @NotBlank(message = "Le niveau est obligatoire")
    private String plusGrandDiplome;

    @Column(name= "annee_de_sortie")
    private int anneeDeSortie;

    @Column(name= "travail_actuel")
    private String currentJobTitle;

    @Column(name= "employé")
    private String currentEmployer;

    @Column(name= "annee_exp")
    private int yearsOfExperience;

    @Column(name= "biographie")
    private String biographie;

    @Column(name= "photo")
    private String profilePictureUrl;

    @NotBlank(message = "Veuillez entrer un mot de passe")
    @Column(name= "mdp")
    private String password;

    @Transient
    @NotBlank(message = "Veuillez confirmer votre mot de passe")
    @Column(name= "mdp_confirm")
    private String passwordRepeat;

}
