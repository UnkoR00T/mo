package o24;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: o24.z, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0007R\u001a\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\r\u001a\u0004\b!\u0010\u0004R\u001a\u0010%\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\r\u001a\u0004\b$\u0010\u0004R\u001a\u0010(\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\r\u001a\u0004\b'\u0010\u0004R\u001a\u0010.\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00101\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\r\u001a\u0004\b0\u0010\u0004R\u001c\u00106\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lo24/z;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPesel", "pesel", "b", "getInternalDocumentId", "internalDocumentId", "c", "getVersion", "version", "Lo24/t;", "d", "Lo24/t;", "getDocumentType", "()Lo24/t;", "documentType", "e", "I", "getDocumentVersion", "documentVersion", "f", "getCertificateSubjectDn", "certificateSubjectDn", "g", "getCertificateSerialNumber", "certificateSerialNumber", "h", "getCertificateIssuerDn", "certificateIssuerDn", "Ljava/time/OffsetDateTime;", "i", "Ljava/time/OffsetDateTime;", "getCreationTimestamp", "()Ljava/time/OffsetDateTime;", "creationTimestamp", "j", "getDocumentIssuer", "documentIssuer", "k", "Ljava/lang/Integer;", "getDocumentSubtype", "()Ljava/lang/Integer;", "documentSubtype", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@oq.a
public final /* data */ class HeaderContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pesel")
    private final String pesel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("internalDocumentId")
    private final String internalDocumentId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("version")
    private final String version;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentType")
    private final t documentType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentVersion")
    private final int documentVersion;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("certificateSubjectDn")
    private final String certificateSubjectDn;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("certificateSerialNumber")
    private final String certificateSerialNumber;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("certificateIssuerDn")
    private final String certificateIssuerDn;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("creationTimestamp")
    private final OffsetDateTime creationTimestamp;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentIssuer")
    private final String documentIssuer;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentSubtype")
    private final Integer documentSubtype;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderContainer)) {
            return false;
        }
        HeaderContainer headerContainer = (HeaderContainer) other;
        return fr.t.c(this.pesel, headerContainer.pesel) && fr.t.c(this.internalDocumentId, headerContainer.internalDocumentId) && fr.t.c(this.version, headerContainer.version) && this.documentType == headerContainer.documentType && this.documentVersion == headerContainer.documentVersion && fr.t.c(this.certificateSubjectDn, headerContainer.certificateSubjectDn) && fr.t.c(this.certificateSerialNumber, headerContainer.certificateSerialNumber) && fr.t.c(this.certificateIssuerDn, headerContainer.certificateIssuerDn) && fr.t.c(this.creationTimestamp, headerContainer.creationTimestamp) && fr.t.c(this.documentIssuer, headerContainer.documentIssuer) && fr.t.c(this.documentSubtype, headerContainer.documentSubtype);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((this.pesel.hashCode() * 31) + this.internalDocumentId.hashCode()) * 31) + this.version.hashCode()) * 31) + this.documentType.hashCode()) * 31) + Integer.hashCode(this.documentVersion)) * 31) + this.certificateSubjectDn.hashCode()) * 31) + this.certificateSerialNumber.hashCode()) * 31) + this.certificateIssuerDn.hashCode()) * 31) + this.creationTimestamp.hashCode()) * 31) + this.documentIssuer.hashCode()) * 31;
        Integer num = this.documentSubtype;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "HeaderContainer(pesel=" + this.pesel + ", internalDocumentId=" + this.internalDocumentId + ", version=" + this.version + ", documentType=" + this.documentType + ", documentVersion=" + this.documentVersion + ", certificateSubjectDn=" + this.certificateSubjectDn + ", certificateSerialNumber=" + this.certificateSerialNumber + ", certificateIssuerDn=" + this.certificateIssuerDn + ", creationTimestamp=" + this.creationTimestamp + ", documentIssuer=" + this.documentIssuer + ", documentSubtype=" + this.documentSubtype + ')';
    }
}
