package sv0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: sv0.q0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\n\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001c¨\u0006 "}, d2 = {"Lsv0/q0;", "", "", "url", "Liy/b0;", "jwtToken", "Lfz/b$f;", "expiredDate", "Lry/a;", "fileEncryptionKey", "domainCertificate", "<init>", "(Ljava/lang/String;Liy/b0;Lfz/b$f;Liy/b0;Liy/b0;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Liy/b0;", "d", "()Liy/b0;", "c", "Lfz/b$f;", "()Lfz/b$f;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Uploader {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 jwtToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.OffsetDateTime expiredDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 fileEncryptionKey;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 domainCertificate;

    public /* synthetic */ Uploader(String str, iy.b0 b0Var, fz.b.OffsetDateTime offsetDateTime, iy.b0 b0Var2, iy.b0 b0Var3, fr.k kVar) {
        this(str, b0Var, offsetDateTime, b0Var2, b0Var3);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public iy.b0 getDomainCertificate() {
        return this.domainCertificate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final fz.b.OffsetDateTime getExpiredDate() {
        return this.expiredDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public iy.b0 getFileEncryptionKey() {
        return this.fileEncryptionKey;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final iy.b0 getJwtToken() {
        return this.jwtToken;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Uploader)) {
            return false;
        }
        Uploader uploader = (Uploader) other;
        return fr.t.c(this.url, uploader.url) && fr.t.c(this.jwtToken, uploader.jwtToken) && fr.t.c(this.expiredDate, uploader.expiredDate) && ry.a.d(this.fileEncryptionKey, uploader.fileEncryptionKey) && ry.a.d(this.domainCertificate, uploader.domainCertificate);
    }

    public int hashCode() {
        return (((((((this.url.hashCode() * 31) + this.jwtToken.hashCode()) * 31) + this.expiredDate.hashCode()) * 31) + ry.a.e(this.fileEncryptionKey)) * 31) + ry.a.e(this.domainCertificate);
    }

    public String toString() {
        return "Uploader(url=" + this.url + ", jwtToken=" + this.jwtToken + ", expiredDate=" + this.expiredDate + ", fileEncryptionKey=" + ry.a.f(this.fileEncryptionKey) + ", domainCertificate=" + ry.a.f(this.domainCertificate) + ")";
    }

    private Uploader(String str, iy.b0 b0Var, fz.b.OffsetDateTime offsetDateTime, iy.b0 b0Var2, iy.b0 b0Var3) {
        this.url = str;
        this.jwtToken = b0Var;
        this.expiredDate = offsetDateTime;
        this.fileEncryptionKey = b0Var2;
        this.domainCertificate = b0Var3;
    }
}
