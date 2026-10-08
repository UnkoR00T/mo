package go0;

import eo0.OwTokens;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lgo0/d0;", "", "Lgo0/d0$a;", "Leo0/i0;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d0 extends gz.b {

    /* JADX INFO: renamed from: go0.d0$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, d2 = {"Lgo0/d0$a;", "Lgz/b$a;", "", "url", "Leo0/x;", "edorAddress", "Leo0/i0$c;", "token", "<init>", "(Ljava/lang/String;Liy/b0;Leo0/i0$c;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Liy/b0;", "()Liy/b0;", "Leo0/i0$c;", "()Leo0/i0$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 edorAddress;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final OwTokens.Refresh token;

        public /* synthetic */ Params(String str, iy.b0 b0Var, OwTokens.Refresh refresh, fr.k kVar) {
            this(str, b0Var, refresh);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final iy.b0 getEdorAddress() {
            return this.edorAddress;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final OwTokens.Refresh getToken() {
            return this.token;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.url, params.url) && eo0.x.b(this.edorAddress, params.edorAddress) && fr.t.c(this.token, params.token);
        }

        public int hashCode() {
            return (((this.url.hashCode() * 31) + eo0.x.c(this.edorAddress)) * 31) + this.token.hashCode();
        }

        public String toString() {
            return "Params(url=" + this.url + ", edorAddress=" + eo0.x.d(this.edorAddress) + ", token=" + this.token + ")";
        }

        private Params(String str, iy.b0 b0Var, OwTokens.Refresh refresh) {
            this.url = str;
            this.edorAddress = b0Var;
            this.token = refresh;
        }
    }
}
