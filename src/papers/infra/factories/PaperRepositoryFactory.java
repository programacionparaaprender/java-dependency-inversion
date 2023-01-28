package papers.infra.factories;

import papers.domain.abstractions.PaperRepository;
import papers.infra.enums.PaperRepositoryType;
import papers.infra.persistence.*;

public class PaperRepositoryFactory {
    public static PaperRepository getPaperInstance(PaperRepositoryType repositoryType) {
        switch (repositoryType) {
            case MySQL: return new PaperMySQLRepository();
            case SQLServer: return new PaperSQLServerRepository();
            case CSV: return new PaperCSVRepository();
            case MongoDB: return new PaperMongoRepository();
            case Oracle: return new PaperOracleRepository();
            case XML: return new PaperXMLRepository();
            case JSON: return new PaperJSONRepository();
            case MULTI_SOURCE: return new PaperMultiSourceRepository();
            default: return new PaperFakeRepository();
        }
    }
}