package ru.adementev.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id",nullable = false)
    private long id;
    @Column(name ="last_name",length = 50,nullable = false)
    private String lastName;
    @Column(name ="first_name",length = 50,nullable = false)
    private String firstName;
    @Column(name ="middle_name",length = 50)
    private String middleName;
    @Column(name = "birthday")
    private Date birthday;

    public Author() {
    }

    public Author(Author author) {
        this.lastName = author.lastName;
        this.firstName = author.firstName;
        this.middleName = author.middleName;
        this.birthday = author.birthday;
    }


    public Author(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Author(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public Author(String lastName, String firstName, String middleName, Date birthday) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthday = birthday;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;

        Author author = (Author) o;

        if (getId() != author.getId()) return false;
        if (getLastName() != null ? !getLastName().equals(author.getLastName()) : author.getLastName() != null)
            return false;
        if (getFirstName() != null ? !getFirstName().equals(author.getFirstName()) : author.getFirstName() != null)
            return false;
        if (getMiddleName() != null ? !getMiddleName().equals(author.getMiddleName()) : author.getMiddleName() != null)
            return false;
        return getBirthday() != null ? getBirthday().equals(author.getBirthday()) : author.getBirthday() == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + (getFirstName() != null ? getFirstName().hashCode() : 0);
        result = 31 * result + (getMiddleName() != null ? getMiddleName().hashCode() : 0);
        result = 31 * result + (getBirthday() != null ? getBirthday().hashCode() : 0);
        return result;
    }
}
