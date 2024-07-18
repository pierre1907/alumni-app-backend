package sn.hyperlink.alumni_core.repository;


import sn.hyperlink.alumni_core.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Rechercher un utilisateur par email
    User findByEmail(String email);

    // Rechercher des utilisateurs par prénom
    List<User> findByPrenomAndNom(String prenom, String nom);

    // Rechercher des utilisateurs par nom
    List<User> findByNom(String nom);

    // Rechercher des utilisateurs par année de sortie
    List<User> findByAnneeDeSortie(int anneeDeSortie);

    // Rechercher des utilisateurs par programme
    List<User> findByProgramme(String programme);

    // Rechercher des utilisateurs par diplôme
    List<User> findByPlusGrandDiplome(String diplome);

    // Rechercher des utilisateurs par entreprise actuelle
    List<User> findByCurrentEmployer(String employer);

    // Supprimer un utilisateur par email
    void deleteByEmail(String email);

    // Compter le nombre d'utilisateurs par programme
    long countByProgramme(String programme);

    // Vérifier si un utilisateur avec cet email existe
    boolean existsByEmail(String email);

    // Supprimer tous les utilisateurs par année de sortie
    void deleteAllByAnneeDeSortie(int annee);

    // Trouver un utilisateur par email et mot de passe
    User findByEmailAndPassword(String email, String password);

}