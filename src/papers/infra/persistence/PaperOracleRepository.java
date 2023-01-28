package papers.infra.persistence;

import papers.domain.abstractions.PaperRepository;
import papers.domain.entities.Paper;
import java.util.ArrayList;
import java.util.List;

public class PaperOracleRepository implements PaperRepository {
    public List<Paper> getPapers() {
        List<Paper> papers = new ArrayList<Paper>();
        papers.add(new Paper("Paper1 from Oracle"));
        papers.add(new Paper("Paper2 from Oracle"));
        papers.add(new Paper("Paper3 from Oracle"));
        return papers;
    }
}