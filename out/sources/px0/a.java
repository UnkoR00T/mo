package px0;

import fr.t;
import ox0.c;
import ox0.d;
import p071kotlin.Metadata;
import w70.n;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lpx0/a;", "Lxw/f;", "Lpx0/a$a;", "Lox0/d$a;", "a", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a extends f<Params, d.a> {

    /* JADX INFO: renamed from: px0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001b\u0010\r¨\u0006\u001f"}, d2 = {"Lpx0/a$a;", "", "Lox0/c;", "state", "", "isWebViewSSLEnabled", "Lw70/n;", "webViewActions", "", "wkDomain", "<init>", "(Lox0/c;ZLw70/n;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lox0/c;", "()Lox0/c;", "b", "Z", "d", "()Z", "c", "Lw70/n;", "()Lw70/n;", "Ljava/lang/String;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isWebViewSSLEnabled;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final n webViewActions;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String wkDomain;

        public Params(c cVar, boolean z15, n nVar, String str) {
            this.state = cVar;
            this.isWebViewSSLEnabled = z15;
            this.webViewActions = nVar;
            this.wkDomain = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final n getWebViewActions() {
            return this.webViewActions;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getWkDomain() {
            return this.wkDomain;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsWebViewSSLEnabled() {
            return this.isWebViewSSLEnabled;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && this.isWebViewSSLEnabled == params.isWebViewSSLEnabled && t.c(this.webViewActions, params.webViewActions) && t.c(this.wkDomain, params.wkDomain);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + Boolean.hashCode(this.isWebViewSSLEnabled)) * 31) + this.webViewActions.hashCode()) * 31) + this.wkDomain.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", isWebViewSSLEnabled=" + this.isWebViewSSLEnabled + ", webViewActions=" + this.webViewActions + ", wkDomain=" + this.wkDomain + ')';
        }
    }
}
