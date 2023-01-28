package papers.infra.persistence;

import papers.domain.abstractions.PaperRepository;
import papers.domain.entities.Paper;

import java.util.ArrayList;
import java.util.List;

public class PaperJSONRepository implements PaperRepository {
    public List<Paper> getPapers() {
        List<Paper> papers = new ArrayList<Paper>();
        papers.add(new Paper("Paper1 from JSON"));
        papers.add(new Paper("Paper2 from JSON"));
        papers.add(new Paper("Paper3 from JSON"));
        papers.add(new Paper("Paper4 from JSON"));
        papers.add(new Paper("Paper5 from JSON"));
        return papers;
    }
}