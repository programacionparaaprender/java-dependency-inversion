package papers.domain.abstractions;

import papers.domain.entities.Paper;
import java.util.List;

public interface PaperRepository {
    public List<Paper> getPapers();
}