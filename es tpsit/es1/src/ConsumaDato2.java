class ConsumaDato2 {

    Semaforo pieno;
    Semaforo vuoto;
    int dato;
    String nome;

    public ConsumaDato2(Semaforo s1, Semaforo s2){
        pieno = s1;
        vuoto = s2;
    }


    public void run(){
        while (true)
        {
            pieno.p();
            dato = ProdConsSem.Contatore;
            System.out.println("lettore : dato leto " + dato + nome ) ;
            vuoto.v();
        }
    }
}
