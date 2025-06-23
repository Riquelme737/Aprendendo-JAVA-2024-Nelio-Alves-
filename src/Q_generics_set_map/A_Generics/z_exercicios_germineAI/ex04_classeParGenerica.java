package Q_generics_set_map.A_Generics.z_exercicios_germineAI;

public class ex04_classeParGenerica {
    public static void main(String[] args) {
        Par<String, String> nome = new Par<>("Nome", "Riquelme");
        System.out.println(nome.getChave());
        System.out.println(nome.getValor());

    }
}

class Par<K, V> {
    private K chave;
    private V valor;

   public Par(K chave, V valor) {
       this.chave = chave;
       this.valor = valor;
   }

    public K getChave() {
        return chave;
    }

    public V getValor() {
       return valor;
    }

}
