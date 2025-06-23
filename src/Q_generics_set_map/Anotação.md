# Generics

Permiti parametrizar suas classes, métodos, interfaces por tipo.

Benefícios: Reuso, Type safety, Performance

Uso comum: coleções

````
List<String> list = new ArrayList<>();
List.add("Maria");
String name = list.age(0);
````

## Problema Motivador 02 (type safety & performace)

Caso eu queria guardar um método tipo Object numa variável, por exemplo, Integer, não será possível.

``Integer a = printService.first();``

``java: incompatible types: java.lang.Object cannot be converted to java.lang.Integer``

Terá que realizar um cast por tipo desejado.

``Integer a = (Integer) printService.first();``

A nossa lista dentro do PrintService deveria aceitar todos os Objects(String, Integer, dentro outros).
Mas caso queria colocar uma ‘String’ e pega posição dela, ocorrerá uma exceção: ``ClassCastException``.

Não tendo um "Type Safety" e uma "Desempenho" bom.

## Solução com Generics

Vamos criar um "PrintService" que será com ``<T>`` , podendo ser: Tipo primitivo, Classe Wrapper ou um Classe criado pelo desenvolvedor.

REUSO: Usa o "PrintService" para qualquer tipo.\
TYPE SAFETY: Caso instancie com String, so aceitará String e vice versa.

### Genéricos delimitados

~~~
package services;
import java.util.List;
public class CalculationService {
    public static <T extends Comparable<T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
~~~

``public static <T extends Comparable<T>> T max(List<T> list)``

Quando se coloca o ``<T>`` está declarando que o método é genérico que opera sobre o tipo ``T``.
``T`` pode ser qualquer tipo, como ``Integer`` , ``String``, ou classe que você criou.\
``extends Comparable<T>`` significa que é uma **restrição de tipo (bounded type)**. O ``T`` não pode ser qualquer tipo,
deve ser um tipo que implementa a interface ``Comparable<T>``, essa interface exige a implementação do método ``compareTo()``
, que permite que as classes sejam ordenadas. Sem essa restrição, o compílador não teria como saber se os objetos do tipo
`T` podem ser comparados entre si.


> "Por que se usa ``extends`` e não ``implements``, já que é uma interface?"
+ Os projetistas da linguagem decider simplificar e usar apenas `extends` para todos os tipos de restrições.

## Tipos curinga (wildcard types)

`<?>` é um tipo curinga, supertipo de qualquer classe/objeto.\
Com os tipos curingas podemos fazer métodos que recebem um genérico de "qualquer tipo".

~~~
List<Object> myObjts = new ArrayList<Object>();
List<Integer> myNumbers = new ArrayList<Integer>();
myObjs = myNumbers; // ERRO DE COMPILAÇÃO
~~~

A lista de inteiros não é uma lista de objetos.
(Não é possível, converte o `List<Integer>` para `List<Object>`)

~~~
List<?> myObjts = new ArrayList<Object>();
List<Integer> myNumbers = new ArrayList<Integer>();
myObjs = myNumbers; // SEM ERRO DE COMPILAÇÂO
~~~

! NÃO É POSSÍVEL ADICIONAR DADOS A UMA COLEÇÃO DE TIPO CURINGA

No "Program01", é usado no método "printList" o tipo curinga (wildcard) `<?>` em uma lista. Assim podendo usar qualquer
tipo ou classe criada.

No "Program02", em declarado a assinatura do método como `public static <T extends Comparable<? super T>> T pesoMax(List<T> matilha)`.\
Usada bastante em hieraquia de classe. Tente ler como `<Cachorro extends Comparable<? super Cachorro>>`, "A classe `Cachorro`"
implementa `Comparable` de algum tipo que seja `Cachorro` ou uma superclasse de `Cachorro`"?\
SIM! porque o `Cachorro` implementa o `Comparable<Animal>`. Se usasse apenas o `T`, seria algo como `<T extends Comparable<T>` 
= `Cachorro extends Comparable<Cachorro>>`, o compilador derá erro, porque o `Cachorro` não implementa `Comparable<Cachorro`,
mas sim sua superclasse `Comparable<Animal>`.

## Curingas delimitados (bounded wildcards) 

Veja o "f_wildcardBounded" -> "problema2" -> "Program1";

**PECS: Producer Extends, Consumer Super**
+ `extends`: Ler (obter/get) uma estrutura genérica, ou seja, itens da coleção com segurança, mas sem escrever (adicionar/put) nela.
+ `super`: Escrever (adicionar/put)  uma estrutura genérica, ou seja, itens do tipo `T` na coleção com segurança, mas sem ler(obter/get) nela.

### --> `? extends T` (Wildcard de Limite Superior - Upper Bounded Wildcard)
Pense em `extends` como "é um subtipo de", por exemplo, `List<? extends Number>` significa "Uma lista de algum tipo
desconhecido, que é `Number` ou uma subclasse de `Number`(Como `Integer`, `Double`, `Float`, etc"\

### --> `? super T` (Wildcard de Limite Inferior - Lower Bounded Wildcard)
Pense em `super` como "é um supertipo de", por exemplo. `List<? super Integer>` significa "Uma lista de algum tipo desconhecido
, que é `Integer` ou uma superclasse de `Integer`(Como `Number` ou `Objetct`)"

## Qual a diferença entre `<T>` e `<?>`?
