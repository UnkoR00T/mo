package s11;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;
import th0.q;

/* JADX INFO: renamed from: s11.c, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Ls11/c;", "", "", "documentTypeName", "Ljava/time/OffsetDateTime;", "revokeDate", "Lth0/q;", "revokeReason", "<init>", "(Ljava/lang/String;Ljava/time/OffsetDateTime;Lth0/q;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "c", "Lth0/q;", "()Lth0/q;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CertificateRevokeConfirmationData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentTypeName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime revokeDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final q revokeReason;

    public CertificateRevokeConfirmationData(String str, OffsetDateTime offsetDateTime, q qVar) {
        this.documentTypeName = str;
        this.revokeDate = offsetDateTime;
        this.revokeReason = qVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDocumentTypeName() {
        return this.documentTypeName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OffsetDateTime getRevokeDate() {
        return this.revokeDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final q getRevokeReason() {
        return this.revokeReason;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CertificateRevokeConfirmationData)) {
            return false;
        }
        CertificateRevokeConfirmationData certificateRevokeConfirmationData = (CertificateRevokeConfirmationData) other;
        return t.c(this.documentTypeName, certificateRevokeConfirmationData.documentTypeName) && t.c(this.revokeDate, certificateRevokeConfirmationData.revokeDate) && this.revokeReason == certificateRevokeConfirmationData.revokeReason;
    }

    public int hashCode() {
        return (((this.documentTypeName.hashCode() * 31) + this.revokeDate.hashCode()) * 31) + this.revokeReason.hashCode();
    }

    public String toString() {
        return "CertificateRevokeConfirmationData(documentTypeName=" + this.documentTypeName + ", revokeDate=" + this.revokeDate + ", revokeReason=" + this.revokeReason + ')';
    }
}
