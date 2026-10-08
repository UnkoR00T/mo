package b22;

import eo0.SearchRequest;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0003R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lb22/b;", "", "Leo0/w0;", "a", "()Leo0/w0;", "searchRequest", "b", "Lb22/b$a;", "Lb22/b$b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: b22.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lb22/b$b;", "Lb22/b;", "Leo0/w0;", "searchRequest", "<init>", "(Leo0/w0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/w0;", "()Leo0/w0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final SearchRequest searchRequest;

        /* JADX WARN: Multi-variable type inference failed */
        public Initialized() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // b22.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public SearchRequest getSearchRequest() {
            return this.searchRequest;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initialized) && fr.t.c(this.searchRequest, ((Initialized) other).searchRequest);
        }

        public int hashCode() {
            SearchRequest searchRequest = this.searchRequest;
            if (searchRequest == null) {
                return 0;
            }
            return searchRequest.hashCode();
        }

        public String toString() {
            return "Initialized(searchRequest=" + this.searchRequest + ')';
        }

        public Initialized(SearchRequest searchRequest) {
            this.searchRequest = searchRequest;
        }

        public /* synthetic */ Initialized(SearchRequest searchRequest, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : searchRequest);
        }
    }

    /* JADX INFO: renamed from: a */
    SearchRequest getSearchRequest();

    /* JADX INFO: renamed from: b22.b$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lb22/b$a;", "Lb22/b;", "Leo0/w0;", "searchRequest", "Lhb4/c;", "errorVMS", "<init>", "(Leo0/w0;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/w0;", "()Leo0/w0;", "b", "Lhb4/c;", "()Lhb4/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final SearchRequest searchRequest;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        public Error(SearchRequest searchRequest, hb4.c cVar) {
            this.searchRequest = searchRequest;
            this.errorVMS = cVar;
        }

        @Override // b22.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public SearchRequest getSearchRequest() {
            return this.searchRequest;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final hb4.c getErrorVMS() {
            return this.errorVMS;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return fr.t.c(this.searchRequest, error.searchRequest) && fr.t.c(this.errorVMS, error.errorVMS);
        }

        public int hashCode() {
            SearchRequest searchRequest = this.searchRequest;
            return ((searchRequest == null ? 0 : searchRequest.hashCode()) * 31) + this.errorVMS.hashCode();
        }

        public String toString() {
            return "Error(searchRequest=" + this.searchRequest + ", errorVMS=" + this.errorVMS + ')';
        }

        public /* synthetic */ Error(SearchRequest searchRequest, hb4.c cVar, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : searchRequest, cVar);
        }
    }
}
