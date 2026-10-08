package k34;

import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: k34.h, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lk34/h;", "", "Ljava/security/cert/X509Certificate;", "userCert", "Ljava/security/PrivateKey;", "userPrivateKey", "<init>", "(Ljava/security/cert/X509Certificate;Ljava/security/PrivateKey;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/security/cert/X509Certificate;", "()Ljava/security/cert/X509Certificate;", "b", "Ljava/security/PrivateKey;", "()Ljava/security/PrivateKey;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentCertsSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final X509Certificate userCert;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final PrivateKey userPrivateKey;

    public DocumentCertsSet(X509Certificate x509Certificate, PrivateKey privateKey) {
        this.userCert = x509Certificate;
        this.userPrivateKey = privateKey;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final X509Certificate getUserCert() {
        return this.userCert;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PrivateKey getUserPrivateKey() {
        return this.userPrivateKey;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentCertsSet)) {
            return false;
        }
        DocumentCertsSet documentCertsSet = (DocumentCertsSet) other;
        return fr.t.c(this.userCert, documentCertsSet.userCert) && fr.t.c(this.userPrivateKey, documentCertsSet.userPrivateKey);
    }

    public int hashCode() {
        return (this.userCert.hashCode() * 31) + this.userPrivateKey.hashCode();
    }

    public String toString() {
        return "DocumentCertsSet(userCert=" + this.userCert + ", userPrivateKey=" + this.userPrivateKey + ")";
    }
}
