package Prog875s;

public class Fasta implements Sequence {
    private String header,sequence;

    public Fasta(String header,String sequence) {
        this.header = header;
        this.sequence = sequence;
    }

    public boolean compare(Fasta other) {return this.header == other.getHeader() && this.sequence == other.getSequence();}
    public String getHeader() {return header;}
    public String getSequence() {return sequence;}
}
