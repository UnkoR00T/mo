package cl0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: cl0.h, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001c\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcl0/h;", "", "Lry/a;", "fileEncryptionKey", "Lcl0/f;", "jwtFileServiceToken", "sslPinningCert", "Liy/b0;", "urlToFileUpload", "<init>", "(Liy/b0;Lcl0/f;Liy/b0;Liy/b0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "Lcl0/f;", "()Lcl0/f;", "c", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEPassportChildApplicationAttachmentConfigResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 fileEncryptionKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEFileServiceJwtToken jwtFileServiceToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 sslPinningCert;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 urlToFileUpload;

    public /* synthetic */ BEPassportChildApplicationAttachmentConfigResponse(iy.b0 b0Var, BEFileServiceJwtToken bEFileServiceJwtToken, iy.b0 b0Var2, iy.b0 b0Var3, fr.k kVar) {
        this(b0Var, bEFileServiceJwtToken, b0Var2, b0Var3);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final iy.b0 getFileEncryptionKey() {
        return this.fileEncryptionKey;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BEFileServiceJwtToken getJwtFileServiceToken() {
        return this.jwtFileServiceToken;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final iy.b0 getSslPinningCert() {
        return this.sslPinningCert;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final iy.b0 getUrlToFileUpload() {
        return this.urlToFileUpload;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEPassportChildApplicationAttachmentConfigResponse)) {
            return false;
        }
        BEPassportChildApplicationAttachmentConfigResponse bEPassportChildApplicationAttachmentConfigResponse = (BEPassportChildApplicationAttachmentConfigResponse) other;
        return ry.a.d(this.fileEncryptionKey, bEPassportChildApplicationAttachmentConfigResponse.fileEncryptionKey) && fr.t.c(this.jwtFileServiceToken, bEPassportChildApplicationAttachmentConfigResponse.jwtFileServiceToken) && ry.a.d(this.sslPinningCert, bEPassportChildApplicationAttachmentConfigResponse.sslPinningCert) && fr.t.c(this.urlToFileUpload, bEPassportChildApplicationAttachmentConfigResponse.urlToFileUpload);
    }

    public int hashCode() {
        return (((((ry.a.e(this.fileEncryptionKey) * 31) + this.jwtFileServiceToken.hashCode()) * 31) + ry.a.e(this.sslPinningCert)) * 31) + this.urlToFileUpload.hashCode();
    }

    public String toString() {
        return "BEPassportChildApplicationAttachmentConfigResponse(fileEncryptionKey=" + ry.a.f(this.fileEncryptionKey) + ", jwtFileServiceToken=" + this.jwtFileServiceToken + ", sslPinningCert=" + ry.a.f(this.sslPinningCert) + ", urlToFileUpload=" + this.urlToFileUpload + ")";
    }

    private BEPassportChildApplicationAttachmentConfigResponse(iy.b0 b0Var, BEFileServiceJwtToken bEFileServiceJwtToken, iy.b0 b0Var2, iy.b0 b0Var3) {
        this.fileEncryptionKey = b0Var;
        this.jwtFileServiceToken = bEFileServiceJwtToken;
        this.sslPinningCert = b0Var2;
        this.urlToFileUpload = b0Var3;
    }
}
