package programa;

class Multi_encadeada
{
    static class No
    {
        int dado;
        No prox;
        
        No(int dado){
            this.dado = dado;
            prox = null;
        }
    }
    static long multiDuasListas(No primeira, No segunda)
    {
        long N = 1000000007;
        long num1 = 0, num2 = 0;

        while (primeira != null || segunda != null){
            
            if(primeira != null){
                num1 = ((num1)*10)%N + primeira.dado;
                primeira = primeira.prox;
            }
            
            if(segunda != null)
            {
                num2 = ((num2)*10)%N + segunda.dado;
                segunda = segunda.prox;
            }
            
        }
        return ((num1%N)*(num2%N))%N;
    }
    static void printarLista(No node)
    {
        while(node != null)
        {
            System.out.print(node.dado);
            if(node.prox != null)
                System.out.print(" -> ");
            node = node.prox;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        
        No primeira = new No(5);
        primeira.prox = new No(3);
        primeira.prox.prox = new No(8);
        System.out.print("primeira lista é: ");
        printarLista(primeira);

        No segunda = new No(2);
        segunda.prox = new No(4);
        System.out.print("segunda lista é: ");
        printarLista(segunda);

  
        System.out.print("O resultado da multiplicação das duas listas é: ");
        System.out.println(multiDuasListas(primeira, segunda));
    }
}