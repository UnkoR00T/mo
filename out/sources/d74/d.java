package d74;

import fr.k;
import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Ld74/d;", "", "Ld74/d$a;", "Lny/a;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends gz.b {

    /* JADX INFO: renamed from: d74.d$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Ld74/d$a;", "Lgz/b$a;", "Liy/b0;", "encryptionKeyId", "encryptionKey", "Lmy/e;", "jwsToken", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 encryptionKeyId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 encryptionKey;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 jwsToken;

        public /* synthetic */ Params(b0 b0Var, b0 b0Var2, b0 b0Var3, k kVar) {
            this(b0Var, b0Var2, b0Var3);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getEncryptionKey() {
            return this.encryptionKey;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getEncryptionKeyId() {
            return this.encryptionKeyId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getJwsToken() {
            return this.jwsToken;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.encryptionKeyId, params.encryptionKeyId) && t.c(this.encryptionKey, params.encryptionKey) && my.e.b(this.jwsToken, params.jwsToken);
        }

        public int hashCode() {
            return (((this.encryptionKeyId.hashCode() * 31) + this.encryptionKey.hashCode()) * 31) + my.e.c(this.jwsToken);
        }

        public String toString() {
            return "Params(encryptionKeyId=" + this.encryptionKeyId + ", encryptionKey=" + this.encryptionKey + ", jwsToken=" + my.e.d(this.jwsToken) + ")";
        }

        private Params(b0 b0Var, b0 b0Var2, b0 b0Var3) {
            this.encryptionKeyId = b0Var;
            this.encryptionKey = b0Var2;
            this.jwsToken = b0Var3;
        }
    }
}
