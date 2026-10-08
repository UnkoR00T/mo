package pl.gov.coi.mobywatel.technical.documents.data.storage;

import java.time.LocalDate;
import k34.DocumentSummaryData;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.documents.data.model.DocumentSummaryDataDto;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk34/n;", "Lpl/gov/coi/mobywatel/technical/documents/data/model/DocumentSummaryDataDto;", "d", "(Lk34/n;)Lpl/gov/coi/mobywatel/technical/documents/data/model/DocumentSummaryDataDto;", "c", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/DocumentSummaryDataDto;)Lk34/n;", "documents_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentSummaryData c(DocumentSummaryDataDto documentSummaryDataDto) throws Exception {
        rq0.b bVarA = rq0.b.INSTANCE.a(documentSummaryDataDto.getDocumentType());
        if (bVarA == null) {
            throw new Exception("Invalid documentType");
        }
        String documentIID = documentSummaryDataDto.getDocumentIID();
        er0.h hVarA = er0.h.INSTANCE.a(documentSummaryDataDto.getDocumentStatus());
        if (hVarA == null) {
            throw new Exception("Invalid documentStatus");
        }
        LocalDate expirationDate = documentSummaryDataDto.getExpirationDate();
        return new DocumentSummaryData(bVarA, documentIID, hVarA, expirationDate != null ? new fz.b.LocalDate(expirationDate) : null, documentSummaryDataDto.getTimestamp());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentSummaryDataDto d(DocumentSummaryData documentSummaryData) {
        String referenceName = documentSummaryData.getDocumentType().getReferenceName();
        String documentIID = documentSummaryData.getDocumentIID();
        String strName = documentSummaryData.getDocumentStatus().name();
        fz.b.LocalDate expirationDate = documentSummaryData.getExpirationDate();
        return new DocumentSummaryDataDto(referenceName, documentIID, strName, expirationDate != null ? expirationDate.getDate() : null, documentSummaryData.getTimestamp());
    }
}
