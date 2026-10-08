package en0;

import fr.t;
import iy.b0;
import java.security.KeyPair;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Len0/b;", "", "Len0/b$a;", "Ldn0/d;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b extends gz.b {

    /* JADX INFO: renamed from: en0.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"Len0/b$a;", "Lgz/b$a;", "", "sessionId", "Liy/b0;", "secret", "Ljava/security/KeyPair;", "keyPair", "<init>", "(Ljava/lang/String;Liy/b0;Ljava/security/KeyPair;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Liy/b0;", "()Liy/b0;", "Ljava/security/KeyPair;", "()Ljava/security/KeyPair;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 secret;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final KeyPair keyPair;

        public Params(String str, b0 b0Var, KeyPair keyPair) {
            this.sessionId = str;
            this.secret = b0Var;
            this.keyPair = keyPair;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final KeyPair getKeyPair() {
            return this.keyPair;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getSecret() {
            return this.secret;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.sessionId, params.sessionId) && t.c(this.secret, params.secret) && t.c(this.keyPair, params.keyPair);
        }

        public int hashCode() {
            return (((this.sessionId.hashCode() * 31) + this.secret.hashCode()) * 31) + this.keyPair.hashCode();
        }

        public String toString() {
            return "Params(sessionId=" + this.sessionId + ", secret=" + this.secret + ", keyPair=" + this.keyPair + ")";
        }
    }
}
