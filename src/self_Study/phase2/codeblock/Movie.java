package self_Study.phase2.codeblock;

class Movie {
    private String name;
    private int director;
    private double price;
    {
        System.out.println("123");
    }
    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name, int director) {
        this.name = name;
        this.director = director;
    }

    public Movie(String name, int director, double price) {
        this.name = name;
        this.director = director;
        this.price = price;
    }
}
class Test{
    public static void main(String[] args) {
        Movie movie = new Movie("123");

    }
}