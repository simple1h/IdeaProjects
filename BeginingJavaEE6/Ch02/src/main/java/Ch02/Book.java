package Ch02;

import javax.persistence.*;

/**
 * Created by Simple on 11.05.14.
 */
@Entity
@NamedQuery(name = "findAllBooks", query = "SELECT b FROM Book b")
public class Book
{
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String title;
    private Float price;
    @Column(length = 2000)
    private String description;
    private String isbn;
    private Integer nbOfPage;
    private Boolean illustrations;

    public Book() {
    }


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getIsbn() {
        return isbn;
    }

    public Integer getNbOfPage() {
        return nbOfPage;
    }

    public Boolean getIllustrations() {
        return illustrations;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNbOfPage(Integer nbOfPage) {
        this.nbOfPage = nbOfPage;
    }

    public void setIllustrations(Boolean illustrations) {
        this.illustrations = illustrations;
    }
}
