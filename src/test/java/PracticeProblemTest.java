import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PracticeProblemTest
{
    // -------------------------------------------------------------------------
    // q1 – Absolute value: reads one number, prints its absolute value as double
    // -------------------------------------------------------------------------

    @Test
    public void testQ1_NegativeInput()
    {
        String data = "-3\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q1();

        assertEquals("Input a number: 3.0\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ1_PositiveInput()
    {
        String data = "5\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q1();

        assertEquals("Input a number: 5.0\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ1_ZeroInput()
    {
        String data = "0\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q1();

        assertEquals("Input a number: 0.0\n", bos.toString());
        System.setOut(originalOut);
    }

    // -------------------------------------------------------------------------
    // q2 – Floor AND Ceiling division: reads two numbers,
    //      prints Math.floor(input1 / input2) on line 1
    //      prints Math.ceil(input1 / input2)  on line 2
    // -------------------------------------------------------------------------

    @Test
    public void testQ2_NegativeDividendPositiveDivisor()
    {
        String data = "-10\n3\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q2();

        // floor(-10/3) = floor(-3.33) = -4.0
        // ceil(-10/3)  = ceil(-3.33)  = -3.0
        assertEquals("Input a number: Input another number: -4.0\n-3.0\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ2_PositiveDividendEvenDivision()
    {
        String data = "4\n2\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q2();

        // floor(4/2) = 2.0
        // ceil(4/2)  = 2.0
        assertEquals("Input a number: Input another number: 2.0\n2.0\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ2_PositiveDividendUnevenDivision()
    {
        String data = "8\n3\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q2();

        // floor(8/3) = floor(2.66) = 2.0
        // ceil(8/3)  = ceil(2.66)  = 3.0
        assertEquals("Input a number: Input another number: 2.0\n3.0\n", bos.toString());
        System.setOut(originalOut);
    }

    // -------------------------------------------------------------------------
    // q3 – Square root rounded: reads one number, prints Math.round(Math.sqrt(n))
    // -------------------------------------------------------------------------

    @Test
    public void testQ3_PerfectSquare()
    {
        String data = "25\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q3();

        // sqrt(25) = 5.0, rounded = 5
        assertEquals("Input a number: 5\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ3_NonPerfectSquare()
    {
        String data = "10\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q3();

        // sqrt(10) = 3.162, rounded = 3
        assertEquals("Input a number: 3\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ3_ZeroInput()
    {
        String data = "0\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q3();

        // sqrt(0) = 0, rounded = 0
        assertEquals("Input a number: 0\n", bos.toString());
        System.setOut(originalOut);
    }

    // -------------------------------------------------------------------------
    // q4 – Power: reads two numbers, prints input1 ^ input2
    // -------------------------------------------------------------------------

    @Test
    public void testQ4_PositiveBasePositiveExponent()
    {
        String data = "3\n4\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q4();

        // 3^4 = 81.0
        assertEquals("Input a number: Input another number: 81.0\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ4_BaseToZeroExponent()
    {
        String data = "5\n0\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q4();

        // 5^0 = 1.0
        assertEquals("Input a number: Input another number: 1.0\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ4_BaseToNegativeExponent()
    {
        String data = "2\n-2\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q4();

        // 2^-2 = 0.25
        assertEquals("Input a number: Input another number: 0.25\n", bos.toString());
        System.setOut(originalOut);
    }

    // -------------------------------------------------------------------------
    // q5 – Max and Min of three numbers: prints max on line 1, min on line 2
    // -------------------------------------------------------------------------

    @Test
    public void testQ5_MaxIsLastMinIsMiddle()
    {
        String data = "5\n0\n99\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q5();

        // max = 99.0, min = 0.0
        assertEquals("Input a number: Input another number: Input one more number: 99.0\n0.0\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ5_MaxIsMiddleMinIsLast()
    {
        String data = "3\n8\n-1\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q5();

        // max = 8.0, min = -1.0
        assertEquals("Input a number: Input another number: Input one more number: 8.0\n-1.0\n", bos.toString());
        System.setOut(originalOut);
    }

    @Test
    public void testQ5_DecimalInputs()
    {
        String data = "3.5\n4.2\n0\n";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PracticeProblem.q5();

        // max = 4.2, min = 0.0
        assertEquals("Input a number: Input another number: Input one more number: 4.2\n0.0\n", bos.toString());
        System.setOut(originalOut);
    }
}