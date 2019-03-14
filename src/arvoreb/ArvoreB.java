package arvoreb;

/**
 *
 * @author Henrique K. Secchi
 */
public class ArvoreB {

    public static void main(String[] args) {
        BPTree bptree = new BPTree();
        bptree.inserir_info(7);
        bptree.inserir_info(9);
        bptree.inserir_info(13);
        bptree.inserir_info(15);
        bptree.inserir_info(8);
        
        bptree.inserir_info(16);
        bptree.inserir_info(18);
        
        bptree.inserir_info(25);
        bptree.inserir_info(35);
        bptree.inserir_info(45);
        bptree.inserir_info(56);
        bptree.inserir_info(77);
        bptree.inserir_info(57);
        bptree.inserir_info(21);
        bptree.inserir_info(32);
        bptree.inserir_info(17);
        bptree.inserir_info(79);
        bptree.inserir_info(80);
        
        bptree.exibe();
        
    }
    
}
