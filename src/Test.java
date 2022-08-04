

import one.digital.innovation.gof.facade.Facade;
import one.digital.innovation.gof.singleton.SingletonLazyHolder;
import one.digital.innovation.gof.singleton.SingletonLazy;
import one.digital.innovation.gof.singleton.SingletonEager;
import one.digital.innovation.gof.strategy.Comportamento;
import one.digital.innovation.gof.strategy.ComportamentoAgressivo;
import one.digital.innovation.gof.strategy.ComportamentoDefensivo;
import one.digital.innovation.gof.strategy.ComportamentoNormal;
import one.digital.innovation.gof.strategy.Robot;

public class Test {

    public static void main(String[] args) {
        
        //Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        
        
        //Strategy
        
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
    
    Robot robo = new Robot();
    robo.setStrategy(normal);
    robo.mover();
    robo.mover();
    robo.setStrategy(defensivo);
    robo.mover();
    robo.mover();
    robo.mover();
    robo.setStrategy(agressivo);
    robo.mover();
    
    
    //Facade 
    
    Facade facade = new Facade();
    facade.migrarCliente("Vanya", "14156000");
    
    
    
    
    }
    
    
    

}
