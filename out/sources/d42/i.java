package d42;

import e42.WebViewResultParam;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0003\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Ld42/i;", "", "Le42/c;", "a", "()Le42/c;", "webViewResultParam", "c", "b", "Ld42/i$a;", "Ld42/i$b;", "Ld42/i$c;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i extends f {

    /* JADX INFO: renamed from: d42.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0015"}, d2 = {"Ld42/i$a;", "Ld42/i;", "Le42/c;", "webViewResultParam", "<init>", "(Le42/c;)V", "d", "()Le42/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Le42/c;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dispatching implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final WebViewResultParam webViewResultParam;

        public Dispatching(WebViewResultParam webViewResultParam) {
            this.webViewResultParam = webViewResultParam;
        }

        @Override // d42.i
        /* JADX INFO: renamed from: a, reason: from getter */
        public WebViewResultParam getWebViewResultParam() {
            return this.webViewResultParam;
        }

        public final WebViewResultParam d() {
            return this.webViewResultParam;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Dispatching) && fr.t.c(this.webViewResultParam, ((Dispatching) other).webViewResultParam);
        }

        public int hashCode() {
            return this.webViewResultParam.hashCode();
        }

        public String toString() {
            return "Dispatching(webViewResultParam=" + this.webViewResultParam + ')';
        }
    }

    /* JADX INFO: renamed from: d42.i$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ld42/i$b;", "Ld42/i;", "Le42/c;", "webViewResultParam", "Lhb4/c;", "errorVMS", "<init>", "(Le42/c;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Le42/c;", "()Le42/c;", "b", "Lhb4/c;", "d", "()Lhb4/c;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final WebViewResultParam webViewResultParam;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        public Error(WebViewResultParam webViewResultParam, hb4.c cVar) {
            this.webViewResultParam = webViewResultParam;
            this.errorVMS = cVar;
        }

        @Override // d42.i
        /* JADX INFO: renamed from: a, reason: from getter */
        public WebViewResultParam getWebViewResultParam() {
            return this.webViewResultParam;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
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
            return fr.t.c(this.webViewResultParam, error.webViewResultParam) && fr.t.c(this.errorVMS, error.errorVMS);
        }

        public int hashCode() {
            return (this.webViewResultParam.hashCode() * 31) + this.errorVMS.hashCode();
        }

        public String toString() {
            return "Error(webViewResultParam=" + this.webViewResultParam + ", errorVMS=" + this.errorVMS + ')';
        }
    }

    /* JADX INFO: renamed from: d42.i$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ld42/i$c;", "Ld42/i;", "Le42/c;", "webViewResultParam", "<init>", "(Le42/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Le42/c;", "()Le42/c;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Loading implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final WebViewResultParam webViewResultParam;

        public Loading(WebViewResultParam webViewResultParam) {
            this.webViewResultParam = webViewResultParam;
        }

        @Override // d42.i
        /* JADX INFO: renamed from: a, reason: from getter */
        public WebViewResultParam getWebViewResultParam() {
            return this.webViewResultParam;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && fr.t.c(this.webViewResultParam, ((Loading) other).webViewResultParam);
        }

        public int hashCode() {
            return this.webViewResultParam.hashCode();
        }

        public String toString() {
            return "Loading(webViewResultParam=" + this.webViewResultParam + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    WebViewResultParam getWebViewResultParam();
}
