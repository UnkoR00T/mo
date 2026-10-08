package z11;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: z11.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Lz11/a;", "", "Liy/b0;", "serialNumber", "", "documentTypeName", "Lrq0/b;", "documentType", "<init>", "(Liy/b0;Ljava/lang/String;Lrq0/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "c", "()Liy/b0;", "b", "Ljava/lang/String;", "Lrq0/b;", "()Lrq0/b;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CertificateData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 serialNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentTypeName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final rq0.b documentType;

    public CertificateData(b0 b0Var, String str, rq0.b bVar) {
        this.serialNumber = b0Var;
        this.documentTypeName = str;
        this.documentType = bVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final rq0.b getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDocumentTypeName() {
        return this.documentTypeName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getSerialNumber() {
        return this.serialNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CertificateData)) {
            return false;
        }
        CertificateData certificateData = (CertificateData) other;
        return t.c(this.serialNumber, certificateData.serialNumber) && t.c(this.documentTypeName, certificateData.documentTypeName) && t.c(this.documentType, certificateData.documentType);
    }

    public int hashCode() {
        int iHashCode = ((this.serialNumber.hashCode() * 31) + this.documentTypeName.hashCode()) * 31;
        rq0.b bVar = this.documentType;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        return "CertificateData(serialNumber=" + this.serialNumber + ", documentTypeName=" + this.documentTypeName + ", documentType=" + this.documentType + ')';
    }
}
