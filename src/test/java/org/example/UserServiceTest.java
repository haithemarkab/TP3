package org.example;

import junit.framework.TestCase;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
public class UserServiceTest {
    @Mock
    private UserRepository mockUserRepository;
    private UserService userService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        userService = new UserService(mockUserRepository);
    }

    @Test
    public void testGetUserById() {
        // ID de l'utilisateur pour le test
        long userId = 1L;

        User mockUser = new User(userId, "hadil_benseid", "hadilbenseid.com");

        // Définir le comportement attendu du mockUserRepository
        when(mockUserRepository.findUserById(userId)).thenReturn(mockUser);
        // Appeler la méthode à tester
        User returnedUser = userService.getUserById(userId);
        // Vérifier que la méthode findUserById du mockUserRepository a été appelée avec le bon argument (userId)
        verify(mockUserRepository).findUserById(userId);
        // Vérifier que l'utilisateur retourné correspond à celui retourné par le mockUserRepository
        assertNotNull(returnedUser);
        assertEquals(userId, returnedUser.getId());
        assertEquals("hadil_benseid", returnedUser.getUsername());
        assertEquals("hadilbenseid.com", returnedUser.getEmail());
    }


}