import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dimensão = tk.getScreenSize();
		System.out.println("A resolução da tela é: ");
		System.out.print(+dimensão.width);
		System.out.print("x");
		System.out.print(+dimensão.height);
		
		
		

	}

}
