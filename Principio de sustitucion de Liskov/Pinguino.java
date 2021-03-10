public class Pinguino implements Ave {
    
    //esto nos traera problemas si queremos implementar mas tipo de aves
    @Override
    void volar(){
        throw UnsupportedOperationException("pinguinos no pueden volar"); 
    }
    @Override    
    void comer(){

    }
    @Override    
    void piar(){

    }

}
