package go0;

import eo0.OwTokens;
import eo0.SearchRequest;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lgo0/f0;", "", "Lgo0/f0$a;", "", "Leo0/n0;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f0 extends gz.b {

    /* JADX INFO: renamed from: go0.f0$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001c"}, d2 = {"Lgo0/f0$a;", "Lgz/b$a;", "", "nextPageId", "Leo0/w0;", "searchRequest", "Leo0/i0$a;", "owAccessToken", "<init>", "(Ljava/lang/String;Leo0/w0;Leo0/i0$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Leo0/w0;", "c", "()Leo0/w0;", "Leo0/i0$a;", "()Leo0/i0$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String nextPageId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final SearchRequest searchRequest;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final OwTokens.Access owAccessToken;

        public Params(String str, SearchRequest searchRequest, OwTokens.Access access) {
            this.nextPageId = str;
            this.searchRequest = searchRequest;
            this.owAccessToken = access;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getNextPageId() {
            return this.nextPageId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final OwTokens.Access getOwAccessToken() {
            return this.owAccessToken;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final SearchRequest getSearchRequest() {
            return this.searchRequest;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.nextPageId, params.nextPageId) && fr.t.c(this.searchRequest, params.searchRequest) && fr.t.c(this.owAccessToken, params.owAccessToken);
        }

        public int hashCode() {
            String str = this.nextPageId;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.searchRequest.hashCode()) * 31) + this.owAccessToken.hashCode();
        }

        public String toString() {
            return "Params(nextPageId=" + this.nextPageId + ", searchRequest=" + this.searchRequest + ", owAccessToken=" + this.owAccessToken + ")";
        }
    }
}
