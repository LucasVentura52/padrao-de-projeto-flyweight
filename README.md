Exercício: Sistema de Gestão de Cores

Descrição: Implemente um sistema que gerencia diferentes tipos de cores usando o padrão Flyweight. As cores podem ser compartilhadas entre formas geométricas (como círculos e quadrados) que têm um estado específico, como posição e tamanho.

Classe Cor (Flyweight):
Crie uma classe Cor que armazena o nome da cor.
Atributo: nome, uma string que representa o nome da cor (ex: "Vermelho", "Verde").
Métodos:
Construtor: Cor(String nome): inicializa o nome da cor.
Getter: getNome(): retorna o nome da cor.
Classe CorFactory:
Implemente uma CorFactory que cria e gerencia instâncias de Cor. Use um HashMap para armazenar cores criadas e reutilizá-las.
Atributo: cores: um Map<String, Cor> que armazena instâncias de Cor, permitindo a reutilização.
Métodos: getCor(String nome): verifica se uma cor com o nome fornecido já existe. Se não existir, cria uma nova instância de Cor e a armazena no mapa. Retorna a cor correspondente.
Classe Forma:
Crie uma classe Forma que usa um objeto Cor e armazena atributos específicos como posicao (posição) e tamanho (tamanho).
Sobreescreva (@Override) o método toString para exibir as informações da forma.
Atributos:
cor: um objeto da classe Color que representa a cor da forma.
posicao: uma string que representa a posição da forma (ex: "0,0").
tamanho: um inteiro que representa o tamanho da forma.
Métodos:
Construtor: Forma(Cor cor, String posicao, int tamanho): inicializa os atributos da forma com os valores fornecidos.
Método: toString(): retorna uma representação em string das propriedades da forma, incluindo a cor, a posição e o tamanho.

Classe FormaManager:
Implemente uma classe FormaManager que adiciona formas e exibe suas informações.
Atributos:
formas: uma lista (List<Forma>) que armazena as instâncias de Forma.
corFactory: uma instância da classe CorFactory para gerenciar as cores.
Métodos:
Construtor:
FormaManager(): inicializa a lista de formas e a fábrica de cores.
Método:
addForma(String nomeCor, String posicao, int tamanho): adiciona uma nova forma à lista. Utiliza a CorFactory para obter a cor correspondente.
Método:
apresentar(): itera sobre a lista de formas e imprime a representação em string de cada forma, utilizando o método toString().
