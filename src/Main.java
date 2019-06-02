import CKYalgorithm.CΥΚalgorithm;
import CKYalgorithm.TreeParse;
import CNFParser.Parser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Parser p = new Parser();
        p.parse("grammar.txt");
        p.printListOfRules();
        CΥΚalgorithm ckYalgorithm = new CΥΚalgorithm(p, true);
        ckYalgorithm.runAlgorithm("I saw the man with the telescope");
        ckYalgorithm.printMatrix(false);
        TreeParse tree = new TreeParse(ckYalgorithm.getNumOfColumns(), ckYalgorithm.getNumOfRows(), ckYalgorithm.getMatrix());
        tree.printTree();
    }
}
