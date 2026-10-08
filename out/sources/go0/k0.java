package go0;

import eo0.OwTokens;
import eo0.z0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lgo0/k0;", "", "Lgo0/k0$a;", "Loq/i0;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k0 extends gz.b {

    /* JADX INFO: renamed from: go0.k0$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, d2 = {"Lgo0/k0$a;", "Lgz/b$a;", "Leo0/g0;", "messageId", "Leo0/i0$a;", "owAccessToken", "Leo0/z0;", "cmsSignedUpd", "<init>", "(Ljava/lang/String;Leo0/i0$a;Liy/b0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Leo0/i0$a;", "c", "()Leo0/i0$a;", "Liy/b0;", "()Liy/b0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String messageId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final OwTokens.Access owAccessToken;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 cmsSignedUpd;

        public /* synthetic */ Params(String str, OwTokens.Access access, iy.b0 b0Var, fr.k kVar) {
            this(str, access, b0Var);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final iy.b0 getCmsSignedUpd() {
            return this.cmsSignedUpd;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final OwTokens.Access getOwAccessToken() {
            return this.owAccessToken;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return eo0.g0.d(this.messageId, params.messageId) && fr.t.c(this.owAccessToken, params.owAccessToken) && z0.b(this.cmsSignedUpd, params.cmsSignedUpd);
        }

        public int hashCode() {
            return (((eo0.g0.e(this.messageId) * 31) + this.owAccessToken.hashCode()) * 31) + z0.c(this.cmsSignedUpd);
        }

        public String toString() {
            return "Params(messageId=" + eo0.g0.f(this.messageId) + ", owAccessToken=" + this.owAccessToken + ", cmsSignedUpd=" + z0.d(this.cmsSignedUpd) + ")";
        }

        private Params(String str, OwTokens.Access access, iy.b0 b0Var) {
            this.messageId = str;
            this.owAccessToken = access;
            this.cmsSignedUpd = b0Var;
        }
    }
}
