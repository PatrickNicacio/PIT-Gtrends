
public class teste {

	public static void main(String[] args) {
		arquivoCSV file = new arquivoCSV();
		file.ler();
		
		// COLOQUE UM BREAKPOINT NESTA LINHA PARA CONFERIR SE GRAVOU TODOS OS DADOS DO CSV NO OBJETO "file"
		System.out.println("===================================");
		System.out.println("Imprimindo arrays para confer�ncia:");
		System.out.println("-----------------------------------");
		if (file.ListaPorMinuto.size()>0){
			System.out.println("Hor�rio | Valor");
			System.out.println("---------------");
			for (int i = 0; i<file.ListaPorMinuto.size(); i++){
				System.out.println(file.ListaPorMinuto.get(i).atributo + " | " + file.ListaPorMinuto.get(i).valor);
			}
			System.out.println("==============");
		}
		if (file.ListaRegi�o.size()>0){
			System.out.println("Regi�o | Valor");
			System.out.println("--------------");
			for (int i = 0; i<file.ListaRegi�o.size(); i++){
				System.out.println(file.ListaRegi�o.get(i).atributo + " | " + file.ListaRegi�o.get(i).valor);
			}
			System.out.println("==============");
		}
		if (file.ListaCidade.size()>0){
			System.out.println("Cidade | Valor");
			System.out.println("--------------");
			for (int i = 0; i<file.ListaCidade.size(); i++){
				System.out.println(file.ListaCidade.get(i).atributo + " | " + file.ListaCidade.get(i).valor);
			}
			System.out.println("==============================");
		}
		if (file.ListaRelacionadas.size()>0){
			System.out.println("Pesquisas Relacionadas | Valor");
			System.out.println("------------------------------");
			for (int i = 0; i<file.ListaRelacionadas.size(); i++){
				System.out.println(file.ListaRelacionadas.get(i).atributo + " | " + file.ListaRelacionadas.get(i).valor);
			}
			System.out.println("=============================");
		}
		if (file.ListaAscens�o.size()>0){
			System.out.println("Pesquisas em Ascens�o | Valor");
			System.out.println("-----------------------------");
			for (int i = 0; i<file.ListaAscens�o.size(); i++){
				System.out.println(file.ListaAscens�o.get(i).atributo + " | " + file.ListaAscens�o.get(i).valor);
			}
			System.out.println("===================");
		}
		System.out.println("FIM!");
	}
}
