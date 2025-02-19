package gr.aueb.cf.ch16.challenges.challenge1;

/**
 * IShape skeletal implementation
 */
public abstract class AbstractShape implements IShape {
    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
