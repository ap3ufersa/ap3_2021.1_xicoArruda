# Unidade 2
## Exercícios - 5,0 pontos se entregar até 17/10/2021
### Exercícios de Java e Orientação a Objetos.
#### Coloque as classes no *package br.com.ap3.u2.primeiroNome1900101010;*. Substitua *primeiroNome1900101010* pelo seu primeiro nome e número de matrícula.

---

## Questao 1 (1,0 ponto):
Crie uma classe Televisão e uma classe ControleRemoto. O controle remoto é capaz de controlar o volume e trocar os canais da televisão. Saiba que:
- O controle de volume permite aumentar ou diminuir a potência do volume de som em uma unidade de cada vez.
- O controle de canal também permite aumentar e diminuir o número do canal em uma unidade, porém, também possibilita trocar para um canal indicado.
- Devem existir métodos para consultar o valor do volume de som e o canal atualmente selecionado.
Pense no "é um" *versus* "tem um" visto em aula. Faça uma classe com o método main() que teste as funcionalidades das classes.

---

## Questao 2 (3,0 pontos):
Construa a classe **Contato** em Java, que obedeça à descrição abaixo:

* A classe deve possuir os seguintes atributos: nome, e-Mail*s*, telefone*s*.
* Um e-Mail tem um tipo (pessoal, profissional) e um valor que tem obrigatoriamente um "@".
* O e-mail deve ser validado.
* Um telefone tem um tipo (pessoal, profissional) e um valor no formato (XX)XXXX-XXXX.
* Um contato pode ter uma quantidade indeterminada de telefones.
* Um contato pode ter uma quantidade indeterminada de e-Mails.
* Crie um construtor para a classe que recebe como parâmetro o nome.
* Crie os métodos de acesso (*get* e *set*) para os atributos da classe.

## Subquestão

Construa a classe **Agenda** em Java que obedeça à descrição abaixo:
* Crie um método *main()* na classe;
* Crie uma coleção de objetos Contato do tipo *ArrayList* (ex: ArrayList<Contato> agendaDeContatos...);
* Exiba um menu na tela que ofereça as opções abaixo. O seu programa deve ficar executando enquanto o usuário não digitar a opção 5 (sair).

```
1) Cadastrar Contato
2) Buscar Contato
3) Excluir Contato
4) Imprimir Agenda
5) Sair
```

* Solicite que o usuário informe a opção desejada;
* Na opção **Cadastrar Contato** (opção 1), solicite que o usuário digite os atributos do contato que ele deseja inserir. Crie um objeto do tipo Contato com as informações digitadas pelo usuário e insira o objeto na coleção;
* Na opção **Buscar Contato** (opção 2), solicite que o usuário informe o nome do contato que ele deseja buscar. Percorra a coleção de objetos de forma a verificar se o contato que o usuário deseja buscar existe na coleção. Caso exista, escreva na tela as informações do contato;
* Na opção **Excluir Contato** (opção 3), solicite que o usuário informe o nome do contato que ele deseja excluir. Percorra a coleção de objetos de forma a verificar se o contato que o usuário deseja excluir existe na coleção. Caso exista, remova o contato da coleção;
* Na opção **Imprimir Agenda** (opção 4), escreva na tela as informações ( nome e telefone ) de todos os contatos que existem na coleção;
* Encerre a execução quando a opção Sair (opção 5) for digitada.
---

## Questao 3 (1,0 ponto):
Identifique as classes e implemente um programa para a seguinte especificação:
Um supermercado vende diferentes tipos de produtos. Cada produto tem um preço e uma quantidade em estoque. Um pedido de um cliente é composto de itens, onde cada item especifica o produto que o cliente deseja e a respectiva quantidade. Esse pedido pode ser pago em dinheiro, cheque ou cartão.
Pense no "é um" versus "tem um" visto em aula. Faça uma classe com o método main() que teste as funcionalidades das classes.
