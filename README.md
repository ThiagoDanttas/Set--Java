# Set Java

---

### Set\<T>
� Representa um conjunto de elementos (similar ao da �lgebra) <br>
� N�o admite repeti��es <br>
� Elementos n�o possuem posi��o <br>
� Acesso, inser��o e remo��o de elementos s�o r�pidos <br>
� Oferece opera��es eficientes de conjunto: interse��o, uni�o, diferen�a. <br>

### Principais implementa��es:
� HashSet - mais r�pido (opera��es O(1) em tabela hash) e n�o ordenado <br>
� TreeSet - mais lento (opera��es O(log(n)) em �rvore rubro-negra) e ordenado pelo <br>
compareTo do objeto (ou Comparator) <br>
� LinkedHashSet - velocidade intermedi�ria e elementos na ordem em que s�o adicionados <br>

[Clique para acessar a Documenta��o Set](https://docs.oracle.com/javase/10/docs/api/java/util/Set.html)

### Alguns m�todos importantes
� add(obj), remove(obj), contains(obj)  <br>
    � Baseado em equals e hashCode <br>
    � Se equals e hashCode n�o existir, � usada compara��o de ponteiros <br>
� clear() <br>
� size() <br>
� removeIf(predicate) <br>
� addAll(other) - uni�o: adiciona no conjunto os elementos do outro conjunto, sem repeti��o <br>
� retainAll(other) - interse��o: remove do conjunto os elementos n�o contitos em other <br>
� removeAll(other) - diferen�a: remove do conjunto os elementos contidos em other

## Como Set testa igualdade?

### Como as cole��es Hash testam igualdade?
� Se hashCode e equals estiverem implementados: <br>
� Primeiro hashCode. Se der igual, usa equals para confirmar.<br>
� Lembre-se: String, Integer, Double, etc. j� possuem equals e hashCode<br>
� Se hashCode e equals N�O estiverem implementados:<br>
� Compara as refer�ncias (ponteiros) dos objetos.<br>

### Como TreeSet compara os elementos?

#### Recordando as implementa��es
� Principais implementa��es: <br>
� HashSet - mais r�pido (opera��es O(1) em tabela hash) e n�o ordenado <br>
� TreeSet - mais lento (opera��es O(log(n)) em �rvore rubro-negra) e ordenado <br>
pelo compareTo do objeto (ou Comparator) <br>
� LinkedHashSet - velocidade intermedi�ria e elementos na ordem em que s�o adicionados

### Exerc�cio proposto (Set)

Em um portal de cursos online, cada usu�rio possui um c�digo �nico, representado por
um n�mero inteiro.
Cada instrutor do portal pode ter v�rios cursos, sendo que um mesmo aluno pode se
matricular em quantos cursos quiser. Assim, o n�mero total de alunos de um instrutor n�o
� simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
alunos repetidos em mais de um curso.
O instrutor Alex possui tr�s cursos A, B e C, e deseja saber seu n�mero total de alunos.
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