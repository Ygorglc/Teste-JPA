package domain.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_cozinha")
public class Cozinha {

    @Id
    private Long id;

    @Column(name = "nom_cozinha")
    private String nome;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }


}
