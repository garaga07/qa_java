import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mock;
import com.example.Feline;
import org.junit.Test;
import com.example.Cat;
import org.junit.Assert;
import java.util.List;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    private Feline feline;

    @Test
    public void getSoundTest(){
        Cat cat = new Cat(feline);
        String sound = cat.getSound();
        Assert.assertEquals("Мяу", sound);
    }
    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        Assert.assertEquals(expectedFood, cat.getFood());
    }
}