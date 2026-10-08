package xh0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: xh0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, d2 = {"Lxh0/b;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lxh0/i;", "a", "Lxh0/i;", "()Lxh0/i;", "documentToGenerate", "b", "Ljava/lang/String;", "peselTicket", "c", "sourceDocumentAccessToken", "Lxh0/d;", "d", "Lxh0/d;", "()Lxh0/d;", "userCertificateWithKeys", "authenticationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsyncAppActivationWithKeysResponseDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("documentToGenerate")
    private final DocumentToGenerateDtoDto documentToGenerate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("peselTicket")
    private final String peselTicket;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("sourceDocumentAccessToken")
    private final String sourceDocumentAccessToken;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("userCertificateWithKeys")
    private final CertContainerDtoDto userCertificateWithKeys;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DocumentToGenerateDtoDto getDocumentToGenerate() {
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
    public final CertContainerDtoDto getUserCertificateWithKeys() {
        return this.userCertificateWithKeys;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AsyncAppActivationWithKeysResponseDto)) {
            return false;
        }
        AsyncAppActivationWithKeysResponseDto asyncAppActivationWithKeysResponseDto = (AsyncAppActivationWithKeysResponseDto) other;
        return fr.t.c(this.documentToGenerate, asyncAppActivationWithKeysResponseDto.documentToGenerate) && fr.t.c(this.peselTicket, asyncAppActivationWithKeysResponseDto.peselTicket) && fr.t.c(this.sourceDocumentAccessToken, asyncAppActivationWithKeysResponseDto.sourceDocumentAccessToken) && fr.t.c(this.userCertificateWithKeys, asyncAppActivationWithKeysResponseDto.userCertificateWithKeys);
    }

    public int hashCode() {
        return (((((this.documentToGenerate.hashCode() * 31) + this.peselTicket.hashCode()) * 31) + this.sourceDocumentAccessToken.hashCode()) * 31) + this.userCertificateWithKeys.hashCode();
    }

    public String toString() {
        return "AsyncAppActivationWithKeysResponseDto(documentToGenerate=" + this.documentToGenerate + ", peselTicket=" + this.peselTicket + ", sourceDocumentAccessToken=" + this.sourceDocumentAccessToken + ", userCertificateWithKeys=" + this.userCertificateWithKeys + ')';
    }
}
