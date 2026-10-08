package z70;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: z70.j, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lz70/j;", "", "", "publicCertBase64", "peselTicket", "certPKCS12Base64", "certPKCS12AESSecretKeyBase64", "passwordPKCS12Base64", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "d", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UpdatedCertificate {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String publicCertBase64;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String peselTicket;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String certPKCS12Base64;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String certPKCS12AESSecretKeyBase64;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String passwordPKCS12Base64;

    public UpdatedCertificate(String str, String str2, String str3, String str4, String str5) {
        this.publicCertBase64 = str;
        this.peselTicket = str2;
        this.certPKCS12Base64 = str3;
        this.certPKCS12AESSecretKeyBase64 = str4;
        this.passwordPKCS12Base64 = str5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCertPKCS12AESSecretKeyBase64() {
        return this.certPKCS12AESSecretKeyBase64;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCertPKCS12Base64() {
        return this.certPKCS12Base64;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPasswordPKCS12Base64() {
        return this.passwordPKCS12Base64;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPeselTicket() {
        return this.peselTicket;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPublicCertBase64() {
        return this.publicCertBase64;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdatedCertificate)) {
            return false;
        }
        UpdatedCertificate updatedCertificate = (UpdatedCertificate) other;
        return t.c(this.publicCertBase64, updatedCertificate.publicCertBase64) && t.c(this.peselTicket, updatedCertificate.peselTicket) && t.c(this.certPKCS12Base64, updatedCertificate.certPKCS12Base64) && t.c(this.certPKCS12AESSecretKeyBase64, updatedCertificate.certPKCS12AESSecretKeyBase64) && t.c(this.passwordPKCS12Base64, updatedCertificate.passwordPKCS12Base64);
    }

    public int hashCode() {
        return (((((((this.publicCertBase64.hashCode() * 31) + this.peselTicket.hashCode()) * 31) + this.certPKCS12Base64.hashCode()) * 31) + this.certPKCS12AESSecretKeyBase64.hashCode()) * 31) + this.passwordPKCS12Base64.hashCode();
    }

    public String toString() {
        return "UpdatedCertificate(publicCertBase64=" + this.publicCertBase64 + ", peselTicket=" + this.peselTicket + ", certPKCS12Base64=" + this.certPKCS12Base64 + ", certPKCS12AESSecretKeyBase64=" + this.certPKCS12AESSecretKeyBase64 + ", passwordPKCS12Base64=" + this.passwordPKCS12Base64 + ")";
    }
}
