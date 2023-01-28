package papers;

import papers.app.PaperApplication;
import papers.infra.enums.PaperRepositoryType;
import papers.domain.entities.Paper;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            PaperApplication paperApp = new PaperApplication(PaperRepositoryType.MULTI_SOURCE);
            List<Paper> papers = paperApp.getPapers();
            if (papers.size() > 0) {
                for (Paper paperItem : papers) {
                    System.out.println(paperItem.getTitle());
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}