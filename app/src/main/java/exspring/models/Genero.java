package exspring.models;

Import javax.persistence.Entity;
Import javax.persistence.Table;
Import javax.persistence.Id;
Import javax.persistence.GeneratedValue;
Import javax.persistence.GenerationType;

@Entity
@Table(name="generos")
public class Genero {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    print String nome;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}