package eg0;

import java.security.PrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Leg0/w;", "", "Leg0/w$a;", "Loq/i0;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface w extends gz.b {

    /* JADX INFO: renamed from: eg0.w$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010 ¨\u0006!"}, d2 = {"Leg0/w$a;", "Lgz/b$a;", "", "certPKCS12Base64", "certPKCS12AESSecretKeyBase64", "publicCertBase64", "passwordPKCS12Base64", "peselTicket", "Ljava/security/PrivateKey;", "usedPrivateKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/security/PrivateKey;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "getPublicCertBase64", "d", "e", "getPeselTicket", "f", "Ljava/security/PrivateKey;", "()Ljava/security/PrivateKey;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String certPKCS12Base64;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String certPKCS12AESSecretKeyBase64;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String publicCertBase64;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String passwordPKCS12Base64;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String peselTicket;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final PrivateKey usedPrivateKey;

        public Params(String str, String str2, String str3, String str4, String str5, PrivateKey privateKey) {
            this.certPKCS12Base64 = str;
            this.certPKCS12AESSecretKeyBase64 = str2;
            this.publicCertBase64 = str3;
            this.passwordPKCS12Base64 = str4;
            this.peselTicket = str5;
            this.usedPrivateKey = privateKey;
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
        public final PrivateKey getUsedPrivateKey() {
            return this.usedPrivateKey;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.certPKCS12Base64, params.certPKCS12Base64) && fr.t.c(this.certPKCS12AESSecretKeyBase64, params.certPKCS12AESSecretKeyBase64) && fr.t.c(this.publicCertBase64, params.publicCertBase64) && fr.t.c(this.passwordPKCS12Base64, params.passwordPKCS12Base64) && fr.t.c(this.peselTicket, params.peselTicket) && fr.t.c(this.usedPrivateKey, params.usedPrivateKey);
        }

        public int hashCode() {
            return (((((((((this.certPKCS12Base64.hashCode() * 31) + this.certPKCS12AESSecretKeyBase64.hashCode()) * 31) + this.publicCertBase64.hashCode()) * 31) + this.passwordPKCS12Base64.hashCode()) * 31) + this.peselTicket.hashCode()) * 31) + this.usedPrivateKey.hashCode();
        }

        public String toString() {
            return "Params(certPKCS12Base64=" + this.certPKCS12Base64 + ", certPKCS12AESSecretKeyBase64=" + this.certPKCS12AESSecretKeyBase64 + ", publicCertBase64=" + this.publicCertBase64 + ", passwordPKCS12Base64=" + this.passwordPKCS12Base64 + ", peselTicket=" + this.peselTicket + ", usedPrivateKey=" + this.usedPrivateKey + ")";
        }
    }
}
