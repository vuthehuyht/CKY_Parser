package Utils;

public class Rule<K, V, T> {
    private K nonTerminalSymbol;
    private V firstSymbol;
    private T secondSymbol;

    public Rule(K nonTerminalSymbol) {
        this.nonTerminalSymbol = nonTerminalSymbol;
    }

    public K getNonTerminalSymbol() {
        return nonTerminalSymbol;
    }

    public V getFirstSymbol() {
        return firstSymbol;
    }

    public void setFirstSymbol(V firstSymbol) {
        this.firstSymbol = firstSymbol;
    }

    public T getSecondSymbol() {
        return secondSymbol;
    }

    public void setSecondSymbol(T secondSymbol) {
        this.secondSymbol = secondSymbol;
    }
}
