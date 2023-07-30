import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mock;
import com.example.Feline;
import org.junit.Test;
import com.example.Lion;
import org.mockito.Mockito;
import org.junit.Assert;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    private Feline feline;
    @Test
    public void lionDifferentSexTest() {
        try {
            Lion lion = new Lion("Неопределенный");
        } catch (AssertionError | Exception e) {
            Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }
    @Test
    public void getKittensTest() {
        Lion lion = new Lion(feline);
        int expectedNumber = 1;
        Mockito.when(feline.getKittens()).thenReturn(expectedNumber);
        Assert.assertEquals(expectedNumber,lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception{
        Lion lion = new Lion(feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood()).thenReturn(expectedFood);
        Assert.assertEquals(expectedFood,lion.getFood());
    }


}

