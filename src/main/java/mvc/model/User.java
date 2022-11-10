package mvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "age")
    private int age;

    public User() {
    }

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o.getClass() == null || this.getClass() != o.getClass()) return false;
        User user = (User) o;
        return this.name.equals(user.name)
                && this.surname.equals(user.surname)
                && this.age == user.age;
    }

    @Override
    public int hashCode() {
        int seed = 31;
        int result = 1;
        result = seed * result + (name == null ? 0 : name.hashCode());
        result = seed * result + (surname == null ? 0 : surname.hashCode());
        result = seed * result + age;
        return result;
    }

    /*@Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }*/

    @Override
    public String toString() {
        return "name = \"" + name + "\"," +
                " surname = \"" + surname + "\"," +
                " age = " + age;
    }
}
