package tutorial.spring4.entities;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QAuthor is a Querydsl query type for Author
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QAuthor extends EntityPathBase<Author> {

    private static final long serialVersionUID = -1370477119L;

    public static final QAuthor author = new QAuthor("author");

    public final StringPath authorCode = createString("authorCode");

    public final StringPath firstname = createString("firstname");

    public final StringPath lastname = createString("lastname");

    public QAuthor(String variable) {
        super(Author.class, forVariable(variable));
    }

    public QAuthor(Path<? extends Author> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuthor(PathMetadata<?> metadata) {
        super(Author.class, metadata);
    }

}

