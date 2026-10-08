package f24;

import fr.t;
import p071kotlin.Metadata;
import ry.CertKeyPair;

/* JADX INFO: renamed from: f24.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b\u0018\u0010\u0010¨\u0006 "}, d2 = {"Lf24/a;", "", "Lry/c;", "certKeyPair", "Lf24/c;", "certificateType", "Lf24/b;", "certificateStatus", "", "certificateId", "<init>", "(Lry/c;Lf24/c;Lf24/b;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lry/c;", "()Lry/c;", "b", "Lf24/c;", "d", "()Lf24/c;", "c", "Lf24/b;", "()Lf24/b;", "I", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CertificateData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final CertKeyPair certKeyPair;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final c certificateType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b certificateStatus;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int certificateId;

    public CertificateData(CertKeyPair certKeyPair, c cVar, b bVar, int i15) {
        this.certKeyPair = certKeyPair;
        this.certificateType = cVar;
        this.certificateStatus = bVar;
        this.certificateId = i15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CertKeyPair getCertKeyPair() {
        return this.certKeyPair;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCertificateId() {
        return this.certificateId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getCertificateStatus() {
        return this.certificateStatus;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getCertificateType() {
        return this.certificateType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CertificateData)) {
            return false;
        }
        CertificateData certificateData = (CertificateData) other;
        return t.c(this.certKeyPair, certificateData.certKeyPair) && this.certificateType == certificateData.certificateType && this.certificateStatus == certificateData.certificateStatus && this.certificateId == certificateData.certificateId;
    }

    public int hashCode() {
        return (((((this.certKeyPair.hashCode() * 31) + this.certificateType.hashCode()) * 31) + this.certificateStatus.hashCode()) * 31) + Integer.hashCode(this.certificateId);
    }

    public String toString() {
        return "CertificateData(certKeyPair=" + this.certKeyPair + ", certificateType=" + this.certificateType + ", certificateStatus=" + this.certificateStatus + ", certificateId=" + this.certificateId + ")";
    }
}
