package ox0;

import p071kotlin.Metadata;
import th0.InitExternalAuthMobileResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lox0/c;", "", "<init>", "()V", "b", "c", "a", "Lox0/c$a;", "Lox0/c$b;", "Lox0/c$c;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: ox0.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lox0/c$a;", "Lox0/c;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        public Error(hb4.c cVar) {
            super(null);
            this.errorVMS = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final hb4.c getErrorVMS() {
            return this.errorVMS;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && fr.t.c(this.errorVMS, ((Error) other).errorVMS);
        }

        public int hashCode() {
            return this.errorVMS.hashCode();
        }

        public String toString() {
            return "Error(errorVMS=" + this.errorVMS + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lox0/c$b;", "Lox0/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f150381a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -38268394;
        }

        public String toString() {
            return "Initial";
        }
    }

    public /* synthetic */ c(fr.k kVar) {
        this();
    }

    private c() {
    }

    /* JADX INFO: renamed from: ox0.c$c, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\r¨\u0006\u001e"}, d2 = {"Lox0/c$c;", "Lox0/c;", "Lth0/l;", "webViewData", "", "isSslError", "", "loadedPage", "<init>", "(Lth0/l;ZLjava/lang/String;)V", "a", "(Lth0/l;ZLjava/lang/String;)Lox0/c$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lth0/l;", "d", "()Lth0/l;", "b", "Z", "e", "()Z", "c", "Ljava/lang/String;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PzReady extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final InitExternalAuthMobileResponse webViewData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSslError;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String loadedPage;

        public PzReady(InitExternalAuthMobileResponse initExternalAuthMobileResponse, boolean z15, String str) {
            super(null);
            this.webViewData = initExternalAuthMobileResponse;
            this.isSslError = z15;
            this.loadedPage = str;
        }

        public static /* synthetic */ PzReady b(PzReady pzReady, InitExternalAuthMobileResponse initExternalAuthMobileResponse, boolean z15, String str, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                initExternalAuthMobileResponse = pzReady.webViewData;
            }
            if ((i15 & 2) != 0) {
                z15 = pzReady.isSslError;
            }
            if ((i15 & 4) != 0) {
                str = pzReady.loadedPage;
            }
            return pzReady.a(initExternalAuthMobileResponse, z15, str);
        }

        public final PzReady a(InitExternalAuthMobileResponse webViewData, boolean isSslError, String loadedPage) {
            return new PzReady(webViewData, isSslError, loadedPage);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getLoadedPage() {
            return this.loadedPage;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InitExternalAuthMobileResponse getWebViewData() {
            return this.webViewData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsSslError() {
            return this.isSslError;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PzReady)) {
                return false;
            }
            PzReady pzReady = (PzReady) other;
            return fr.t.c(this.webViewData, pzReady.webViewData) && this.isSslError == pzReady.isSslError && fr.t.c(this.loadedPage, pzReady.loadedPage);
        }

        public int hashCode() {
            int iHashCode = ((this.webViewData.hashCode() * 31) + Boolean.hashCode(this.isSslError)) * 31;
            String str = this.loadedPage;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "PzReady(webViewData=" + this.webViewData + ", isSslError=" + this.isSslError + ", loadedPage=" + this.loadedPage + ')';
        }

        public /* synthetic */ PzReady(InitExternalAuthMobileResponse initExternalAuthMobileResponse, boolean z15, String str, int i15, fr.k kVar) {
            this(initExternalAuthMobileResponse, (i15 & 2) != 0 ? false : z15, (i15 & 4) != 0 ? null : str);
        }
    }
}
