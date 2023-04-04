import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		LocalDate minhaData = LocalDate.now();
		int ano = minhaData.getYear();
		
		System.out.print("Digite a data de nascimento: ");
		Date dtnascimento = sdf.parse(sc.nextLine());
		
		
		
		
		sc.close();

	}

}
