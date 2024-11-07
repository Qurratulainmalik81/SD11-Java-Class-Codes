package ArraysPractice;

public class Person {
    private String fn;
    private String ln;

    public Person(String fn, String ln)
    {
        this.fn = fn;
        this.ln = ln;

    }
    public String getFn() {
        return fn;
    }
    public void setFn(String fn) {
        this.fn = fn;
    }
    public String getLn() {
        return ln;
    }
    public void setLn(String ln) {
        this.ln = ln;
    }

    public String toString()
    {
        return (this.fn + " " + this.ln);
    }
    
}
