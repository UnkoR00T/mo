package lt3;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: lt3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\f\u0010\u0015¨\u0006\u0017"}, d2 = {"Llt3/a;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getCertificateUpdateRequired", "()Z", "certificateUpdateRequired", "", "Llt3/b;", "b", "Ljava/util/List;", "()Ljava/util/List;", "documents", "juniorservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentAndCertificateStatusResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("certificateUpdateRequired")
    private final boolean certificateUpdateRequired;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documents")
    private final List<DocumentDto> documents;

    public final List<DocumentDto> a() {
        return this.documents;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentAndCertificateStatusResponse)) {
            return false;
        }
        DocumentAndCertificateStatusResponse documentAndCertificateStatusResponse = (DocumentAndCertificateStatusResponse) other;
        return this.certificateUpdateRequired == documentAndCertificateStatusResponse.certificateUpdateRequired && t.c(this.documents, documentAndCertificateStatusResponse.documents);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.certificateUpdateRequired) * 31) + this.documents.hashCode();
    }

    public String toString() {
        return "DocumentAndCertificateStatusResponse(certificateUpdateRequired=" + this.certificateUpdateRequired + ", documents=" + this.documents + ')';
    }
}
