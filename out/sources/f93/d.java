package f93;

import fr.t;
import java.security.KeyPair;
import java.security.cert.X509Certificate;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lf93/d;", "", "Lgz/b$a$a;", "Lf93/d$a;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends gz.b {

    /* JADX INFO: renamed from: f93.d$a, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lf93/d$a;", "", "Ljava/security/KeyPair;", "keyPair1", "", "Ljava/security/cert/X509Certificate;", "keyPair1CertificateChain", "", "differentKeys", "<init>", "(Ljava/security/KeyPair;Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/security/KeyPair;", "b", "()Ljava/security/KeyPair;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Z", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final KeyPair keyPair1;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<X509Certificate> keyPair1CertificateChain;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean differentKeys;

        /* JADX WARN: Multi-variable type inference failed */
        public Result(KeyPair keyPair, List<? extends X509Certificate> list, boolean z15) {
            this.keyPair1 = keyPair;
            this.keyPair1CertificateChain = list;
            this.differentKeys = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getDifferentKeys() {
            return this.differentKeys;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final KeyPair getKeyPair1() {
            return this.keyPair1;
        }

        public final List<X509Certificate> c() {
            return this.keyPair1CertificateChain;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return t.c(this.keyPair1, result.keyPair1) && t.c(this.keyPair1CertificateChain, result.keyPair1CertificateChain) && this.differentKeys == result.differentKeys;
        }

        public int hashCode() {
            return (((this.keyPair1.hashCode() * 31) + this.keyPair1CertificateChain.hashCode()) * 31) + Boolean.hashCode(this.differentKeys);
        }

        public String toString() {
            return "Result(keyPair1=" + this.keyPair1 + ", keyPair1CertificateChain=" + this.keyPair1CertificateChain + ", differentKeys=" + this.differentKeys + ")";
        }
    }
}
