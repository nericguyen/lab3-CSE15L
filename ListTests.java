import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {

	// @Test
    // public void testFilterOrder(){
    //     List<String> arrayTest = new ArrayList<>();
    //     arrayTest.add("Panda1");
    //     arrayTest.add("Panda2");
    //     arrayTest.add("Bear1");
    //     arrayTest.add("Panda3");
    //     arrayTest.add("Bear2");

    //     assertEquals("[Panda1, Panda2, Panda3]", 
    //         ListExamples.filter(arrayTest, StringChecker("Panda")).toString());
    // }

    @Test
    public void testMerge(){
        List<String> arrayTest2 = new ArrayList<>();
        arrayTest2.add("a1");
        arrayTest2.add("c1");
        arrayTest2.add("e1");
        arrayTest2.add("g1");
        arrayTest2.add("i1");

        List<String> arrayTest1 = new ArrayList<>();
        arrayTest1.add("b2");
        arrayTest1.add("d2");
        arrayTest1.add("f2");

        assertEquals("[a1, b2, c1, d2, e1, f2, g1, i1]", 
        ListExamples.merge(arrayTest1, arrayTest2).toString());
    }
}