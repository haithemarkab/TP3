package org.example;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
public class ProductServiceTest {
    private ProductApiClient productApiClient;
    private ProductService productService;
    @Before
    public void setUp() {
        productService = new ProductService(productApiClient);
        productApiClient = mock(ProductApiClient.class);
    }
    @Test
    public void testGetProduct_Success() {
        String productId = "1919";
        Product expectedProduct = new Product(productId, "nokia", 1900.0);
        when(productApiClient.getProduct(productId)).thenReturn(expectedProduct);
        Product actualProduct = productService.getProduct(productId);
        assertEquals(expectedProduct, actualProduct);
        verify(productApiClient, times(1)).getProduct(productId);
    }

    @Test(expected = RuntimeException.class)
    public void testGetProduct_APIFailure() {
        String productId = "100";
        when(productApiClient.getProduct(productId)).thenThrow(new RuntimeException("API unavailable"));
        productService.getProduct(productId);
    }
    @Test
    public void testGetProduct_IncompatibleDataFormat() {

        String productId = "200";
        when(productApiClient.getProduct(productId)).thenReturn(null);
        Product actualProduct = productService.getProduct(productId);
        assertNull(actualProduct);
        verify(productApiClient, times(1)).getProduct(productId);
    }


 /*   public void testGetProduct_Success() {
        Product expectedProduct = new Product();
        when(productApiClient.getProduct(productId)).thenReturn(expectedProduct);
        Product actualProduct = productService.getProduct(productId);
        assertEquals(expectedProduct, actualProduct);
        verify(productApiClient, times(1)).getProduct(productId);
    }*/
}