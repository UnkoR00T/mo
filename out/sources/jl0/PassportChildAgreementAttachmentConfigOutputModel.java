package jl0;

import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jl0.s, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006 "}, d2 = {"Ljl0/s;", "", "", "urlToFileUpload", "Liy/b0;", "jwtToken", "Lry/a;", "fileEncryptionKey", "Lfz/b$f;", "expirationDate", "sslPinningCert", "<init>", "(Ljava/lang/String;Liy/b0;Liy/b0;Lfz/b$f;Liy/b0;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Liy/b0;", "c", "()Liy/b0;", "d", "Lfz/b$f;", "()Lfz/b$f;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PassportChildAgreementAttachmentConfigOutputModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String urlToFileUpload;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 jwtToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 fileEncryptionKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.OffsetDateTime expirationDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 sslPinningCert;

    public /* synthetic */ PassportChildAgreementAttachmentConfigOutputModel(String str, b0 b0Var, b0 b0Var2, fz.b.OffsetDateTime offsetDateTime, b0 b0Var3, fr.k kVar) {
        this(str, b0Var, b0Var2, offsetDateTime, b0Var3);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final fz.b.OffsetDateTime getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getFileEncryptionKey() {
        return this.fileEncryptionKey;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getJwtToken() {
        return this.jwtToken;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getSslPinningCert() {
        return this.sslPinningCert;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getUrlToFileUpload() {
        return this.urlToFileUpload;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportChildAgreementAttachmentConfigOutputModel)) {
            return false;
        }
        PassportChildAgreementAttachmentConfigOutputModel passportChildAgreementAttachmentConfigOutputModel = (PassportChildAgreementAttachmentConfigOutputModel) other;
        return fr.t.c(this.urlToFileUpload, passportChildAgreementAttachmentConfigOutputModel.urlToFileUpload) && fr.t.c(this.jwtToken, passportChildAgreementAttachmentConfigOutputModel.jwtToken) && ry.a.d(this.fileEncryptionKey, passportChildAgreementAttachmentConfigOutputModel.fileEncryptionKey) && fr.t.c(this.expirationDate, passportChildAgreementAttachmentConfigOutputModel.expirationDate) && ry.a.d(this.sslPinningCert, passportChildAgreementAttachmentConfigOutputModel.sslPinningCert);
    }

    public int hashCode() {
        return (((((((this.urlToFileUpload.hashCode() * 31) + this.jwtToken.hashCode()) * 31) + ry.a.e(this.fileEncryptionKey)) * 31) + this.expirationDate.hashCode()) * 31) + ry.a.e(this.sslPinningCert);
    }

    public String toString() {
        return "PassportChildAgreementAttachmentConfigOutputModel(urlToFileUpload=" + this.urlToFileUpload + ", jwtToken=" + this.jwtToken + ", fileEncryptionKey=" + ry.a.f(this.fileEncryptionKey) + ", expirationDate=" + this.expirationDate + ", sslPinningCert=" + ry.a.f(this.sslPinningCert) + ")";
    }

    private PassportChildAgreementAttachmentConfigOutputModel(String str, b0 b0Var, b0 b0Var2, fz.b.OffsetDateTime offsetDateTime, b0 b0Var3) {
        this.urlToFileUpload = str;
        this.jwtToken = b0Var;
        this.fileEncryptionKey = b0Var2;
        this.expirationDate = offsetDateTime;
        this.sslPinningCert = b0Var3;
    }
}
