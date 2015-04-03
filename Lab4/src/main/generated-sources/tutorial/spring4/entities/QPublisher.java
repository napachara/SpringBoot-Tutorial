package tutorial.spring4.entities;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPublisher is a Querydsl query type for Publisher
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPublisher extends EntityPathBase<Publisher> {

    private static final long serialVersionUID = 47161862L;

    public static final QPublisher publisher = new QPublisher("publisher");

    public final StringPath city = createString("city");

    public final StringPath publisherCode = createString("publisherCode");

    public final StringPath publisherName = createString("publisherName");

    public QPublisher(String variable) {
        super(Publisher.class, forVariable(variable));
    }

    public QPublisher(Path<? extends Publisher> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPublisher(PathMetadata<?> metadata) {
        super(Publisher.class, metadata);
    }

}

