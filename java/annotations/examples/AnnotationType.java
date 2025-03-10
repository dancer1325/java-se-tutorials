// to use @Documented       -> be displayed | Javadoc-generated documentation
import java.lang.annotation.*;

@Documented
@interface AnnotationType {
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    String[] reviewers();
}