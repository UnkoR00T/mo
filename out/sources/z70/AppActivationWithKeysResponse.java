package z70;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: z70.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lz70/b;", "", "Lz70/e;", "documentToGenerate", "", "peselTicket", "sourceDocumentAccessToken", "Lz70/c;", "userCertificateWithKeys", "<init>", "(Lz70/e;Ljava/lang/String;Ljava/lang/String;Lz70/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz70/e;", "()Lz70/e;", "b", "Ljava/lang/String;", "c", "d", "Lz70/c;", "()Lz70/c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AppActivationWithKeysResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentToGenerate documentToGenerate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String peselTicket;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sourceDocumentAccessToken;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final CertContainer userCertificateWithKeys;

    public AppActivationWithKeysResponse(DocumentToGenerate documentToGenerate, String str, String str2, CertContainer certContainer) {
        this.documentToGenerate = documentToGenerate;
        this.peselTicket = str;
        this.sourceDocumentAccessToken = str2;
        this.userCertificateWithKeys = certContainer;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DocumentToGenerate getDocumentToGenerate() {
        return this.documentToGenerate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPeselTicket() {
        return this.peselTicket;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSourceDocumentAccessToken() {
        return this.sourceDocumentAccessToken;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final CertContainer getUserCertificateWithKeys() {
        return this.userCertificateWithKeys;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppActivationWithKeysResponse)) {
            return false;
        }
        AppActivationWithKeysResponse appActivationWithKeysResponse = (AppActivationWithKeysResponse) other;
        return t.c(this.documentToGenerate, appActivationWithKeysResponse.documentToGenerate) && t.c(this.peselTicket, appActivationWithKeysResponse.peselTicket) && t.c(this.sourceDocumentAccessToken, appActivationWithKeysResponse.sourceDocumentAccessToken) && t.c(this.userCertificateWithKeys, appActivationWithKeysResponse.userCertificateWithKeys);
    }

    public int hashCode() {
        return (((((this.documentToGenerate.hashCode() * 31) + this.peselTicket.hashCode()) * 31) + this.sourceDocumentAccessToken.hashCode()) * 31) + this.userCertificateWithKeys.hashCode();
    }

    public String toString() {
        return "AppActivationWithKeysResponse(documentToGenerate=" + this.documentToGenerate + ", peselTicket=" + this.peselTicket + ", sourceDocumentAccessToken=" + this.sourceDocumentAccessToken + ", userCertificateWithKeys=" + this.userCertificateWithKeys + ")";
    }
}
