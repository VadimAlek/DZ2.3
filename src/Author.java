public class Author extends Object {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object obj) {
        Author ob = (Author) obj;
        if (this == obj)
            return true;


        @Override
        public int hashCode()
        {

            return this.name.hashCode() + this.surname.hashCode();
        }
        @Override
        public String toString ()
        {
            return "Имя автора:" + this.name + this.surname + ".";
        }
    }
}


