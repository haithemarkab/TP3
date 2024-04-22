package org.example;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
public class UserServiceTest {
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        userService = new UserService(mockUserRepository);
    }
    private UserService userService;
    @Mock
    private UserRepository mockUserRepository;


    @Before


    @Test
    public void testGetUserById() {
        long userId = 1L;
        User mockUser = new User(userId, "Arkab_mohamed_haithem", "haithemarkab.com");
        when(mockUserRepository.findUserById(userId)).thenReturn(mockUser);
        User returnedUser = userService.getUserById(userId);
        verify(mockUserRepository).findUserById(userId);
        assertNotNull(returnedUser);
        assertEquals(userId, returnedUser.getId());
        assertEquals("Arkab_mohamed_haithem", returnedUser.getUsername());
        assertEquals("haithemarkab.com", returnedUser.getEmail());
    }


}