package hackerRank.kit_03_months_preparation.week_03.q02;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;


public class Exe02 {

	/*
	 * INPUT 1          OUTPUT 1
	 * 5                2
	 * 1 2 1 3 2
	 * 3 2							
	 * 
	 * INPUT 2          OUTPUT 2
	 * 1                1 
	 * 4
	 * 4 1
	 * 
	 * INPUT 3          OUTPUT 3
	 * 6                0
	 * 1 1 1 1 1 1
	 * 3 2
	 * 
	 * INPUT 4          OUTPUT 4
	 * 19               3 
	 * 2 5 1 3 4 4 3 5 1 1 2 1 4 1 3 3 4 2 1
	 * 18 7
	 * 
   	 * OBS 5:00 para leitura e entendimento
     *     31:00 para resolver a logica     
     *     20:00 ap�s pesquisa
     *     Erros, minha l�gica n�o estava de acordo, n�o primeira tentativa n�o prestei aten��o 
     *     que o subArray deveria ser um sequencia. tive que olhar o d�gido de outros desenvolvedores
     *     
     *     Aten��o: pesquisar "windowLength" para ver solu��es semelhantes 
	 */
    public static void main(String[] args) throws IOException {
    	
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        SubarrayDivision2.birthday(s, d, m);

        bufferedReader.close();
    }
}
