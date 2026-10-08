package zp0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: zp0.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, d2 = {"Lzp0/f;", "", "Lry/a;", "fileEncryptionKey", "domainCertificate", "", "url", "Liy/b0;", "jwtToken", "Lfz/b$f;", "expiredDate", "<init>", "(Liy/b0;Liy/b0;Ljava/lang/String;Liy/b0;Lfz/b$f;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "c", "()Liy/b0;", "b", "Ljava/lang/String;", "e", "d", "Lfz/b$f;", "()Lfz/b$f;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEIncidentReportFileServiceConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 fileEncryptionKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 domainCertificate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 jwtToken;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.OffsetDateTime expiredDate;

    public /* synthetic */ BEIncidentReportFileServiceConfiguration(iy.b0 b0Var, iy.b0 b0Var2, String str, iy.b0 b0Var3, fz.b.OffsetDateTime offsetDateTime, fr.k kVar) {
        this(b0Var, b0Var2, str, b0Var3, offsetDateTime);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final iy.b0 getDomainCertificate() {
        return this.domainCertificate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final fz.b.OffsetDateTime getExpiredDate() {
        return this.expiredDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final iy.b0 getFileEncryptionKey() {
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
        if (!(other instanceof BEIncidentReportFileServiceConfiguration)) {
            return false;
        }
        BEIncidentReportFileServiceConfiguration bEIncidentReportFileServiceConfiguration = (BEIncidentReportFileServiceConfiguration) other;
        return ry.a.d(this.fileEncryptionKey, bEIncidentReportFileServiceConfiguration.fileEncryptionKey) && ry.a.d(this.domainCertificate, bEIncidentReportFileServiceConfiguration.domainCertificate) && fr.t.c(this.url, bEIncidentReportFileServiceConfiguration.url) && fr.t.c(this.jwtToken, bEIncidentReportFileServiceConfiguration.jwtToken) && fr.t.c(this.expiredDate, bEIncidentReportFileServiceConfiguration.expiredDate);
    }

    public int hashCode() {
        return (((((((ry.a.e(this.fileEncryptionKey) * 31) + ry.a.e(this.domainCertificate)) * 31) + this.url.hashCode()) * 31) + this.jwtToken.hashCode()) * 31) + this.expiredDate.hashCode();
    }

    public String toString() {
        return "BEIncidentReportFileServiceConfiguration(fileEncryptionKey=" + ry.a.f(this.fileEncryptionKey) + ", domainCertificate=" + ry.a.f(this.domainCertificate) + ", url=" + this.url + ", jwtToken=" + this.jwtToken + ", expiredDate=" + this.expiredDate + ")";
    }

    private BEIncidentReportFileServiceConfiguration(iy.b0 b0Var, iy.b0 b0Var2, String str, iy.b0 b0Var3, fz.b.OffsetDateTime offsetDateTime) {
        this.fileEncryptionKey = b0Var;
        this.domainCertificate = b0Var2;
        this.url = str;
        this.jwtToken = b0Var3;
        this.expiredDate = offsetDateTime;
    }
}
