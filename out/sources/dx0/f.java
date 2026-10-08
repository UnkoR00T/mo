package dx0;

import fr.t;
import java.security.KeyPair;
import p071kotlin.Metadata;
import th0.AsyncAppActivationWithKeysResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Ldx0/f;", "", "Ldx0/f$a;", "Loq/i0;", "a", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends gz.b {

    /* JADX INFO: renamed from: dx0.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e¨\u0006\u001f"}, d2 = {"Ldx0/f$a;", "Lgz/b$a;", "Lth0/c;", "certResponse", "Lrq0/b;", "documentType", "Ljava/security/KeyPair;", "keyPair", "<init>", "(Lth0/c;Lrq0/b;Ljava/security/KeyPair;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lth0/c;", "()Lth0/c;", "b", "Lrq0/b;", "g", "()Lrq0/b;", "c", "Ljava/security/KeyPair;", "()Ljava/security/KeyPair;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AsyncAppActivationWithKeysResponse certResponse;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b documentType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final KeyPair keyPair;

        public Params(AsyncAppActivationWithKeysResponse asyncAppActivationWithKeysResponse, rq0.b bVar, KeyPair keyPair) {
            this.certResponse = asyncAppActivationWithKeysResponse;
            this.documentType = bVar;
            this.keyPair = keyPair;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AsyncAppActivationWithKeysResponse getCertResponse() {
            return this.certResponse;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final KeyPair getKeyPair() {
            return this.keyPair;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.certResponse, params.certResponse) && t.c(this.documentType, params.documentType) && t.c(this.keyPair, params.keyPair);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final rq0.b getDocumentType() {
            return this.documentType;
        }

        public int hashCode() {
            return (((this.certResponse.hashCode() * 31) + this.documentType.hashCode()) * 31) + this.keyPair.hashCode();
        }

        public String toString() {
            return "Params(certResponse=" + this.certResponse + ", documentType=" + this.documentType + ", keyPair=" + this.keyPair + ')';
        }
    }
}
