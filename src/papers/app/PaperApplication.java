package papers.app;

import papers.domain.abstractions.PaperRepository;
import papers.infra.enums.PaperRepositoryType;
import papers.domain.entities.Paper;
import papers.infra.factories.PaperRepositoryFactory;

import java.util.*;

public class PaperApplication {
    private PaperRepository paperRepository;

    public PaperApplication(PaperRepositoryType paperTypeRepository) {
        this.paperRepository = PaperRepositoryFactory.getPaperInstance(paperTypeRepository);
    }

    public List<Paper> getPapers() {
        return this.paperRepository.getPapers();
    }
}