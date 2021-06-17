# language: pt
# encoding: utf-8
 
Funcionalidade: Preencher formulário z	

Cenário: Acesasr no site da tricentis e preencher o formulario 
    Dado que estou no site da tricentis
  	Quando preencher <Marca> <Modelo> <Cilindrada> <Desempenho> <DataFabricacao> <Assentos> <Assentos2> <TipoCom> <Payload> <TotalWheit> <PesoT> <PrecoTabela> <KM> do formulario da aba enteer Vehicle Data e clicar em Next
  	E preencher <PrimeiroNome> <UltimoNome> <Nascimento> <Genero> <Cep> <Pais>  <Ocupacao> <Hobbies> os dados do formulario da aba enter Insurante Data e clicar em Next
    E <DataInicio> <SomaSeguro> <Classificao> <Segurodanos> <Produtos> <Carro> preencher os dados do formulario da aba enter Product Data e clicar em Next
  	E selecionar <Opcao> do formulario da aba Select Prince Option e clicar em Next
    E preencher <Email> <User> <Senha> <ConfirmaSenha>  dados do formulario da aba Send Quote
    Quando clico em Send
    Entao O cadastro deve ser criado com sucesso e clicar em ok 
  
		
	
Exemplos:
| Marca | Modelo   | Cilindrada | Desempenho | DataFabricacao | Assentos | Assentos2 | TipoCom | Payload | TotalWheit | PesoT    | PrecoTabela | KM      | PrimeiroNome | UltimoNome | Nascimento   | Genero     | Cep    |  Pais   | Ocupacao | Hobbies | DataInicio   | SomaSeguro | Classificao   | Segurodanos   | Produtos         | Carro | Opcao   |  Email                     | User   |    Senha         | ConfirmaSenha   |
| "BMW" |"Moped"   | "123"      | "1"   		 | "05/05/1999"   | "1"      | "2"       | "Gas"   | "800"   | "20500"		|  "5000"  | "10000"		 | "11000" | "Caio"			  | "Augusto" | "05/06/1999" | "Masculino"| "5555"	| "Brazil"| "Farmer" | "Other" | "05/07/2030" | "3000000"  | "Super Bonus" | "No Coverage" | "Euro Protection"| "No"  | "Silver"| "caio18augusto@outlook.com"| "caioo"| "Caioaugusto2312"| "Caioaugusto2312"|
 
 
  


