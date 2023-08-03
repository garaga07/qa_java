import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Spy;
import org.junit.Test;
import com.example.Feline;
import java.util.List;
import org.mockito.Mockito;
import org.junit.Assert;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    Feline feline;
    @Test
    public void eatMeatTest() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        Assert.assertEquals(expectedFood, feline.eatMeat());
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void getFamilyTest(){
        Assert.assertEquals("Кошачьи",feline.getFamily());
    }

    @Test
    public void getCountWithParametrTest(){
        Assert.assertEquals(1, feline.getKittens(1));
    }

    @Test
    public void getCountWithoutParametrTest(){
        Assert.assertEquals(1, feline.getKittens());
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void getFoodTest() throws Exception{
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        Assert.assertEquals(expectedFood, feline.getFood());
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }
}