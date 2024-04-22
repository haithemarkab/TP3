package org.example;


public class UserService {
    private UserRepository userRepository;

    // Constructeur
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Méthode pour récupérer un utilisateur par son ID
    public User getUserById(long id) {
        return userRepository.findUserById(id);
    }

    // Autres méthodes du service utilisateur (si nécessaire)
    // Par exemple, méthodes pour créer, mettre à jour ou supprimer un utilisateur
}