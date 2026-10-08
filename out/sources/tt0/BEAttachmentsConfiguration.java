package tt0;

import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: tt0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u001f\u0010\u0012¨\u0006#"}, d2 = {"Ltt0/b;", "", "Lry/a;", "fileEncryptionKey", "domainCertificate", "", "url", "Liy/b0;", "jwtToken", "Lfz/b$f;", "expiredDate", "", "maxFileAmount", "<init>", "(Liy/b0;Liy/b0;Ljava/lang/String;Liy/b0;Lfz/b$f;ILfr/k;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "c", "()Liy/b0;", "b", "Ljava/lang/String;", "f", "d", "e", "Lfz/b$f;", "()Lfz/b$f;", "I", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEAttachmentsConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 fileEncryptionKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 domainCertificate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 jwtToken;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.OffsetDateTime expiredDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxFileAmount;

    public /* synthetic */ BEAttachmentsConfiguration(b0 b0Var, b0 b0Var2, String str, b0 b0Var3, fz.b.OffsetDateTime offsetDateTime, int i15, fr.k kVar) {
        this(b0Var, b0Var2, str, b0Var3, offsetDateTime, i15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getDomainCertificate() {
        return this.domainCertificate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final fz.b.OffsetDateTime getExpiredDate() {
        return this.expiredDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getFileEncryptionKey() {
        return this.fileEncryptionKey;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getJwtToken() {
        return this.jwtToken;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMaxFileAmount() {
        return this.maxFileAmount;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEAttachmentsConfiguration)) {
            return false;
        }
        BEAttachmentsConfiguration bEAttachmentsConfiguration = (BEAttachmentsConfiguration) other;
        return ry.a.d(this.fileEncryptionKey, bEAttachmentsConfiguration.fileEncryptionKey) && ry.a.d(this.domainCertificate, bEAttachmentsConfiguration.domainCertificate) && fr.t.c(this.url, bEAttachmentsConfiguration.url) && fr.t.c(this.jwtToken, bEAttachmentsConfiguration.jwtToken) && fr.t.c(this.expiredDate, bEAttachmentsConfiguration.expiredDate) && this.maxFileAmount == bEAttachmentsConfiguration.maxFileAmount;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((((ry.a.e(this.fileEncryptionKey) * 31) + ry.a.e(this.domainCertificate)) * 31) + this.url.hashCode()) * 31) + this.jwtToken.hashCode()) * 31) + this.expiredDate.hashCode()) * 31) + Integer.hashCode(this.maxFileAmount);
    }

    public String toString() {
        return "BEAttachmentsConfiguration(fileEncryptionKey=" + ry.a.f(this.fileEncryptionKey) + ", domainCertificate=" + ry.a.f(this.domainCertificate) + ", url=" + this.url + ", jwtToken=" + this.jwtToken + ", expiredDate=" + this.expiredDate + ", maxFileAmount=" + this.maxFileAmount + ")";
    }

    private BEAttachmentsConfiguration(b0 b0Var, b0 b0Var2, String str, b0 b0Var3, fz.b.OffsetDateTime offsetDateTime, int i15) {
        this.fileEncryptionKey = b0Var;
        this.domainCertificate = b0Var2;
        this.url = str;
        this.jwtToken = b0Var3;
        this.expiredDate = offsetDateTime;
        this.maxFileAmount = i15;
    }
}
