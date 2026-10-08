package l80;

import fr.t;
import java.security.cert.X509Certificate;
import k80.UserDataRequest;
import p071kotlin.Metadata;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Ll80/d;", "", "Ll80/d$a;", "Loq/i0;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends gz.b {

    /* JADX INFO: renamed from: l80.d$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\u0016\u0010 ¨\u0006!"}, d2 = {"Ll80/d$a;", "Lgz/b$a;", "", "sessionUuid", "Lk80/i;", "dataRequest", "Ljava/security/cert/X509Certificate;", "certificate", "Lry/c;", "certKeyPair", "<init>", "(Ljava/lang/String;Lk80/i;Ljava/security/cert/X509Certificate;Lry/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Lk80/i;", "c", "()Lk80/i;", "Ljava/security/cert/X509Certificate;", "()Ljava/security/cert/X509Certificate;", "Lry/c;", "()Lry/c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionUuid;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final UserDataRequest dataRequest;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final X509Certificate certificate;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final CertKeyPair certKeyPair;

        public Params(String str, UserDataRequest userDataRequest, X509Certificate x509Certificate, CertKeyPair certKeyPair) {
            this.sessionUuid = str;
            this.dataRequest = userDataRequest;
            this.certificate = x509Certificate;
            this.certKeyPair = certKeyPair;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CertKeyPair getCertKeyPair() {
            return this.certKeyPair;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final X509Certificate getCertificate() {
            return this.certificate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final UserDataRequest getDataRequest() {
            return this.dataRequest;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSessionUuid() {
            return this.sessionUuid;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.sessionUuid, params.sessionUuid) && t.c(this.dataRequest, params.dataRequest) && t.c(this.certificate, params.certificate) && t.c(this.certKeyPair, params.certKeyPair);
        }

        public int hashCode() {
            return (((((this.sessionUuid.hashCode() * 31) + this.dataRequest.hashCode()) * 31) + this.certificate.hashCode()) * 31) + this.certKeyPair.hashCode();
        }

        public String toString() {
            return "Params(sessionUuid=" + this.sessionUuid + ", dataRequest=" + this.dataRequest + ", certificate=" + this.certificate + ", certKeyPair=" + this.certKeyPair + ")";
        }
    }
}
