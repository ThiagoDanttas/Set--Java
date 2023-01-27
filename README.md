# Set Java

---

### Set\<T>
• Representa um conjunto de elementos (similar ao da Álgebra) <br>
• Não admite repetições <br>
• Elementos não possuem posição <br>
• Acesso, inserção e remoção de elementos são rápidos <br>
• Oferece operações eficientes de conjunto: interseção, união, diferença. <br>

### Principais implementações:
• HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado <br>
• TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo <br>
compareTo do objeto (ou Comparator) <br>
• LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados <br>

[Clique para acessar a Documentação Set](https://docs.oracle.com/javase/10/docs/api/java/util/Set.html)

### Alguns métodos importantes
• add(obj), remove(obj), contains(obj)  <br>
    • Baseado em equals e hashCode <br>
    • Se equals e hashCode não existir, é usada comparação de ponteiros <br>
• clear() <br>
• size() <br>
• removeIf(predicate) <br>
• addAll(other) - união: adiciona no conjunto os elementos do outro conjunto, sem repetição <br>
• retainAll(other) - interseção: remove do conjunto os elementos não contitos em other <br>
• removeAll(other) - diferença: remove do conjunto os elementos contidos em other

## Como Set testa igualdade?

### Como as coleções Hash testam igualdade?
• Se hashCode e equals estiverem implementados: <br>
• Primeiro hashCode. Se der igual, usa equals para confirmar.<br>
• Lembre-se: String, Integer, Double, etc. já possuem equals e hashCode<br>
• Se hashCode e equals NÃO estiverem implementados:<br>
• Compara as referências (ponteiros) dos objetos.<br>

### Como TreeSet compara os elementos?

#### Recordando as implementações
• Principais implementações: <br>
• HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado <br>
• TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado <br>
pelo compareTo do objeto (ou Comparator) <br>
• LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados

### Exercício proposto (Set)

Em um portal de cursos online, cada usuário possui um código único, representado por
um número inteiro.
Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor não
é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
alunos repetidos em mais de um curso.
O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a
quantidade total e alunos dele, conforme exemplo.

~~~~java

import java.util.*;

public class Program {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new TreeSet<>();

        System.out.print("How many students for course A ?");
        int a = sc.nextInt();

        for(int i = 0; i < a; i++){
            set.add(sc.nextInt());
        }

        System.out.print("How many students for course B ?");
        int b = sc.nextInt();
        for(int i = 0; i < b; i++){
            set.add(sc.nextInt());
        }

        System.out.print("How many students for course C ?");
        int c = sc.nextInt();
        for(int i = 0; i < c; i++){
            set.add(sc.nextInt());
        }

        System.out.println("Total students: " + set.size());

        sc.close();
    }

}

~~~~