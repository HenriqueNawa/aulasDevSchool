# Java Collection - Interface Queue

<p align="center">
  <img src="https://arquivo.devmedia.com.br/REVISTAS/easyjava/imagens/1/4/image001.jpg" >
</p>
O framework Java Collections é um conjunto de classes e interfaces para armazenar e manipular um grupo de objetos, nela temos a Interface Collection que está no topo da hierarquia,
conforme representado na Figura acima. Podemos a partir dela, ter operações básicas para as coleções, como adicionar, remover, entre outros.<br/> E a partir da Collection, podemos implementar outras Interfaces como Set, List e Queue. Onde cada um tem sua particulariedade e métodos específicos. Neste repositório, será abordado um pouco sobre a interface Queue e sua utilização.

### Características da Queue

A interface Queue irá herdar os métodos da Interface Collection, com está coleção normalmente temos os elementos organizados pelo conceito FIFO (<i>First In, First Out</i>), onde o primeiro a entrar é o primeiro a sair
. Porém, temos exceções quando utilizamos as <i>priority queues</i> ou filas de prioridade que podem ser organizados de acordo com um comparador fornecido ou pela ordem natural. 
Assim, podemos organizar as Queues como filas ou pilhas que se comportam pelo conceito de LIFO (<i>Last In, First Out</i>), onde o último a entrar é o primeiro a sair.
<br/>
Quando utilizamos a Queue como fila, ele ordena os elementos em ordem de chegada.
A Figura abaixo, demonstra a estrutura de uma Queue-utilizando LinkedList, onde inserimos um elemento no fim(<i>"Tail"</i>) e removemos o elemento inicial(<i>"Head"</i>).<br/>
O processo de adicionar um elemento chamamos de <i>Enqueue</i> e quando removemos um elemento chamamos de <i>Dequeue</i>.
<br/><br/>
<p align="center">
  <img src="http://tutorials.jenkov.com/images/java-collections/java-queue.png">
</p>


### Métodos úteis
<ul>
  <li>Criar uma Queue</li>
    <p>Para iniciar uma Queue podemos utilizar: AbstractQueue, ArrayBlockingQueue, ArrayDeque, ConcurrentLinkedQueue, DelayQueue, LinkedBlockingQueue, LinkedList, PriorityBlockingQueue, PriorityQueue, ou SynchronousQueue. Lembrando que como ela é uma interface, não podemos construir de forma direta.</p>
   
~~~
Queue<String> filaClientes = new LinkedList<>();
~~~

  <li>boolean add(object)</li>
    <p>Adiciona uma elemento a Queue e retorna <i>true</i> em caso de sucesso ou retorna um <i>IllegalStateException</i> se não há espaço disponível</p>
   
~~~		
filaClientes.add("José Silva");
filaClientes.add("Maria Silva");
~~~

  <li>element()</li>
    <p>Retorna o elemento inicial da Queue, porém sem removê-lo. E caso esteja nulo, retorna um erro</p>

~~~
System.out.println (filaClientes.element()); //Imprimi "José Silva" 
~~~

<li>boolean offer(object)</li>
    <p>Adiciona um elemento a Queue, a diferença para o método add, é que no add quando a Queue está cheia ele gera um exceção, já no offer ele retorna <i>false</i></p>

~~~
filaClientes.offer("Henrique");
~~~

<li>peek()</li>
    <p>Retorna o elemento inicial da Queue, porém sem removê-lo. E caso esteja vazio, retorna "null"</p>

~~~
System.out.println (filaClientes.peek()); //Imprimi "José Silva"
~~~

<li>remove()</li>
    <p>Remove o <i>head</i> da Queue</p>

~~~
filaClientes.remove() //Remove o primeiro elemento da Queue
~~~

<li>poll()</li>
    <p>Remove o <i>head</i> da Queue, com a diferença que retorna "null" se estiver vazio</p>

~~~
filaClientes.poll() //Remove o primeiro elemento da Queue
~~~

</ul>

### Exemplos

- Com a Interface Queue, podemos aplicar ela para organizar uma fila de atendimento de chats on-line, onde por ordem de chegada os clientes serão atendidos.
  
  [Ver código implementado](https://github.com/HenriqueNawa/aulasDevSchool/blob/main/Collections/src/collections/QueueExemplo.java)
  
<p align="center">
  <img src="https://rockcontent.com/br/wp-content/uploads/sites/2/2020/02/chat-online-funil-de-vendas.png" width="400">
</p>
  
- Utilizando a PriorityQueue, podemos ter como exemplo a campanha de vacinação que tem por prioridade a idade. Neste caso, ao criarmos uma lista através da PriorityQueue, 
  elá sera ordenada de acordo com o que for passado como prioridade no comparador fornecido, neste exemplo é a maior idade.

  [Ver código implementado](https://github.com/HenriqueNawa/aulasDevSchool/tree/main/Collections/src/collections/priorityQueue)

  
<p align="center">
  <img src="https://super.abril.com.br/wp-content/uploads/2021/02/fila-vacinac%CC%A7a%CC%83o_site.jpg" width="420">
</p>

### Sites para mais informações
- [Documentação da Oracle sobre Queue](https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html)<br/>
- [Java Collections: Como Utilizar Collections - DevMedia](https://www.devmedia.com.br/java-collections-como-utilizar-collections/18450)<br/>
- [Java Queue Interface Tutorial with Examples - Callicoder](https://www.callicoder.com/java-queue/)<br/>
- [Guide to the Java Queue - Baeldung](https://www.baeldung.com/java-queue)<br/>
- [Java Queue Interface - Javatpoint](https://www.javatpoint.com/java-priorityqueue)<br/>
- [Queue Interface In Java - Geek for Geeks](https://www.geeksforgeeks.org/queue-interface-java/)<br/>
- [Java Queue - Jenkov](http://tutorials.jenkov.com/java-collections/queue.html)<br/>
- [Priority Queues in Java Explained with Examples - freeCodeCamp](https://www.freecodecamp.org/news/priority-queue-implementation-in-java/)
