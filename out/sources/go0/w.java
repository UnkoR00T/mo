package go0;

import eo0.OwTokens;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lgo0/w;", "", "Lgo0/w$a;", "", "Lfo0/c;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface w extends gz.b {

    /* JADX INFO: renamed from: go0.w$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lgo0/w$a;", "Lgz/b$a;", "Leo0/i0$a;", "owAccessToken", "Leo0/r;", "directoryId", "", "pageId", "<init>", "(Leo0/i0$a;Ljava/lang/String;Ljava/lang/String;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/i0$a;", "b", "()Leo0/i0$a;", "Ljava/lang/String;", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final OwTokens.Access owAccessToken;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String directoryId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String pageId;

        public /* synthetic */ Params(OwTokens.Access access, String str, String str2, fr.k kVar) {
            this(access, str, str2);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDirectoryId() {
            return this.directoryId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final OwTokens.Access getOwAccessToken() {
            return this.owAccessToken;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPageId() {
            return this.pageId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.owAccessToken, params.owAccessToken) && eo0.r.d(this.directoryId, params.directoryId) && fr.t.c(this.pageId, params.pageId);
        }

        public int hashCode() {
            int iHashCode = ((this.owAccessToken.hashCode() * 31) + eo0.r.e(this.directoryId)) * 31;
            String str = this.pageId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Params(owAccessToken=" + this.owAccessToken + ", directoryId=" + eo0.r.f(this.directoryId) + ", pageId=" + this.pageId + ")";
        }

        private Params(OwTokens.Access access, String str, String str2) {
            this.owAccessToken = access;
            this.directoryId = str;
            this.pageId = str2;
        }
    }
}
