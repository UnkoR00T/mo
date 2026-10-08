package a53;

import p071kotlin.Metadata;
import w43.OnlineServiceUrls;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"La53/b;", "", "b", "c", "a", "La53/b$a;", "La53/b$b;", "La53/b$c;", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: a53.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"La53/b$a;", "La53/b;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        public Error(hb4.c cVar) {
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

    /* JADX INFO: renamed from: a53.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"La53/b$b;", "La53/b;", "Lw43/c;", "onlineServiceType", "<init>", "(Lw43/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lw43/c;", "()Lw43/c;", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initial implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final w43.c onlineServiceType;

        public Initial(w43.c cVar) {
            this.onlineServiceType = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final w43.c getOnlineServiceType() {
            return this.onlineServiceType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initial) && fr.t.c(this.onlineServiceType, ((Initial) other).onlineServiceType);
        }

        public int hashCode() {
            return this.onlineServiceType.hashCode();
        }

        public String toString() {
            return "Initial(onlineServiceType=" + this.onlineServiceType + ')';
        }
    }

    /* JADX INFO: renamed from: a53.b$c, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJN\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\b \u0010(R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b)\u0010&¨\u0006*"}, d2 = {"La53/b$c;", "La53/b;", "", "requestId", "Lw43/d;", "serviceUrls", "Lw43/c;", "onlineServiceType", "", "loaderOnTop", "Lw43/a;", "loadWebData", "sslEnabled", "<init>", "(Ljava/lang/String;Lw43/d;Lw43/c;ZLw43/a;Z)V", "a", "(Ljava/lang/String;Lw43/d;Lw43/c;ZLw43/a;Z)La53/b$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Lw43/d;", "f", "()Lw43/d;", "c", "Lw43/c;", "d", "()Lw43/c;", "Z", "getLoaderOnTop", "()Z", "Lw43/a;", "()Lw43/a;", "g", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WebView implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String requestId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final OnlineServiceUrls serviceUrls;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final w43.c onlineServiceType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean loaderOnTop;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final w43.a loadWebData;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean sslEnabled;

        public WebView(String str, OnlineServiceUrls onlineServiceUrls, w43.c cVar, boolean z15, w43.a aVar, boolean z16) {
            this.requestId = str;
            this.serviceUrls = onlineServiceUrls;
            this.onlineServiceType = cVar;
            this.loaderOnTop = z15;
            this.loadWebData = aVar;
            this.sslEnabled = z16;
        }

        public static /* synthetic */ WebView b(WebView webView, String str, OnlineServiceUrls onlineServiceUrls, w43.c cVar, boolean z15, w43.a aVar, boolean z16, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                str = webView.requestId;
            }
            if ((i15 & 2) != 0) {
                onlineServiceUrls = webView.serviceUrls;
            }
            if ((i15 & 4) != 0) {
                cVar = webView.onlineServiceType;
            }
            if ((i15 & 8) != 0) {
                z15 = webView.loaderOnTop;
            }
            if ((i15 & 16) != 0) {
                aVar = webView.loadWebData;
            }
            if ((i15 & 32) != 0) {
                z16 = webView.sslEnabled;
            }
            w43.a aVar2 = aVar;
            boolean z17 = z16;
            return webView.a(str, onlineServiceUrls, cVar, z15, aVar2, z17);
        }

        public final WebView a(String requestId, OnlineServiceUrls serviceUrls, w43.c onlineServiceType, boolean loaderOnTop, w43.a loadWebData, boolean sslEnabled) {
            return new WebView(requestId, serviceUrls, onlineServiceType, loaderOnTop, loadWebData, sslEnabled);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final w43.a getLoadWebData() {
            return this.loadWebData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final w43.c getOnlineServiceType() {
            return this.onlineServiceType;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getRequestId() {
            return this.requestId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebView)) {
                return false;
            }
            WebView webView = (WebView) other;
            return fr.t.c(this.requestId, webView.requestId) && fr.t.c(this.serviceUrls, webView.serviceUrls) && fr.t.c(this.onlineServiceType, webView.onlineServiceType) && this.loaderOnTop == webView.loaderOnTop && fr.t.c(this.loadWebData, webView.loadWebData) && this.sslEnabled == webView.sslEnabled;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final OnlineServiceUrls getServiceUrls() {
            return this.serviceUrls;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getSslEnabled() {
            return this.sslEnabled;
        }

        public int hashCode() {
            int iHashCode = ((((((this.requestId.hashCode() * 31) + this.serviceUrls.hashCode()) * 31) + this.onlineServiceType.hashCode()) * 31) + Boolean.hashCode(this.loaderOnTop)) * 31;
            w43.a aVar = this.loadWebData;
            return ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + Boolean.hashCode(this.sslEnabled);
        }

        public String toString() {
            return "WebView(requestId=" + this.requestId + ", serviceUrls=" + this.serviceUrls + ", onlineServiceType=" + this.onlineServiceType + ", loaderOnTop=" + this.loaderOnTop + ", loadWebData=" + this.loadWebData + ", sslEnabled=" + this.sslEnabled + ')';
        }
    }
}
