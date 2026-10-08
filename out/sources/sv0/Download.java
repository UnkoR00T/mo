package sv0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: sv0.p0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Lsv0/p0;", "", "Lry/a;", "fileEncryptionKey", "domainCertificate", "<init>", "(Liy/b0;Liy/b0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Download {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 fileEncryptionKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 domainCertificate;

    public /* synthetic */ Download(iy.b0 b0Var, iy.b0 b0Var2, fr.k kVar) {
        this(b0Var, b0Var2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public iy.b0 getDomainCertificate() {
        return this.domainCertificate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public iy.b0 getFileEncryptionKey() {
        return this.fileEncryptionKey;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Download)) {
            return false;
        }
        Download download = (Download) other;
        return ry.a.d(this.fileEncryptionKey, download.fileEncryptionKey) && ry.a.d(this.domainCertificate, download.domainCertificate);
    }

    public int hashCode() {
        return (ry.a.e(this.fileEncryptionKey) * 31) + ry.a.e(this.domainCertificate);
    }

    public String toString() {
        return "Download(fileEncryptionKey=" + ry.a.f(this.fileEncryptionKey) + ", domainCertificate=" + ry.a.f(this.domainCertificate) + ")";
    }

    private Download(iy.b0 b0Var, iy.b0 b0Var2) {
        this.fileEncryptionKey = b0Var;
        this.domainCertificate = b0Var2;
    }
}
