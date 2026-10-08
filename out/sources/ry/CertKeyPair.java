package ry;

import fr.t;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ry.c, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lry/c;", "", "Ljava/security/cert/X509Certificate;", "certificate", "Ljava/security/PrivateKey;", "privateKey", "<init>", "(Ljava/security/cert/X509Certificate;Ljava/security/PrivateKey;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/security/cert/X509Certificate;", "()Ljava/security/cert/X509Certificate;", "b", "Ljava/security/PrivateKey;", "()Ljava/security/PrivateKey;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CertKeyPair {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final X509Certificate certificate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final PrivateKey privateKey;

    public CertKeyPair(X509Certificate x509Certificate, PrivateKey privateKey) {
        this.certificate = x509Certificate;
        this.privateKey = privateKey;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final X509Certificate getCertificate() {
        return this.certificate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PrivateKey getPrivateKey() {
        return this.privateKey;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CertKeyPair)) {
            return false;
        }
        CertKeyPair certKeyPair = (CertKeyPair) other;
        return t.c(this.certificate, certKeyPair.certificate) && t.c(this.privateKey, certKeyPair.privateKey);
    }

    public int hashCode() {
        return (this.certificate.hashCode() * 31) + this.privateKey.hashCode();
    }

    public String toString() {
        return "CertKeyPair(certificate=" + this.certificate + ", privateKey=" + this.privateKey + ")";
    }
}
