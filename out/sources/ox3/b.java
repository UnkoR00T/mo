package ox3;

import er.l;
import fr.t;
import jb4.ErrorActionData;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lox3/b;", "Lxw/f;", "Lox3/b$a;", "Ljb4/b;", "Lib4/c;", "genericDomainErrorMapper", "Lox3/d;", "webViewErrorMapper", "Lmx/c;", "labelProvider", "<init>", "(Lib4/c;Lox3/d;Lmx/c;)V", "params", "e", "(Lox3/b$a;)Ljb4/b;", "a", "Lib4/c;", "b", "Lox3/d;", "c", "Lmx/c;", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<a, jb4.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d webViewErrorMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lox3/b$a;", "", "a", "c", "b", "Lox3/b$a$a;", "Lox3/b$a$b;", "Lox3/b$a$c;", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: ox3.b$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lox3/b$a$a;", "Lox3/b$a;", "Ldx/b;", "error", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "<init>", "(Ldx/b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx/b;", "b", "()Ldx/b;", "Ler/a;", "()Ler/a;", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Domain implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final dx.b error;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> closeAction;

            public Domain(dx.b bVar, er.a<i0> aVar) {
                this.error = bVar;
                this.closeAction = aVar;
            }

            public final er.a<i0> a() {
                return this.closeAction;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final dx.b getError() {
                return this.error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Domain)) {
                    return false;
                }
                Domain domain = (Domain) other;
                return t.c(this.error, domain.error) && t.c(this.closeAction, domain.closeAction);
            }

            public int hashCode() {
                return (this.error.hashCode() * 31) + this.closeAction.hashCode();
            }

            public String toString() {
                return "Domain(error=" + this.error + ", closeAction=" + this.closeAction + ')';
            }
        }

        /* JADX INFO: renamed from: ox3.b$a$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0017"}, d2 = {"Lox3/b$a$b;", "Lox3/b$a;", "Lkotlin/Function0;", "Loq/i0;", "openWeb", "closeAction", "<init>", "(Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "b", "()Ler/a;", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MissingEdorAddress implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> openWeb;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> closeAction;

            public MissingEdorAddress(er.a<i0> aVar, er.a<i0> aVar2) {
                this.openWeb = aVar;
                this.closeAction = aVar2;
            }

            public final er.a<i0> a() {
                return this.closeAction;
            }

            public final er.a<i0> b() {
                return this.openWeb;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MissingEdorAddress)) {
                    return false;
                }
                MissingEdorAddress missingEdorAddress = (MissingEdorAddress) other;
                return t.c(this.openWeb, missingEdorAddress.openWeb) && t.c(this.closeAction, missingEdorAddress.closeAction);
            }

            public int hashCode() {
                return (this.openWeb.hashCode() * 31) + this.closeAction.hashCode();
            }

            public String toString() {
                return "MissingEdorAddress(openWeb=" + this.openWeb + ", closeAction=" + this.closeAction + ')';
            }
        }

        /* JADX INFO: renamed from: ox3.b$a$c, reason: from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lox3/b$a$c;", "Lox3/b$a;", "Lnx3/a;", "error", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "<init>", "(Lnx3/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnx3/a;", "b", "()Lnx3/a;", "Ler/a;", "()Ler/a;", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class WebView implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final nx3.a error;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> closeAction;

            public WebView(nx3.a aVar, er.a<i0> aVar2) {
                this.error = aVar;
                this.closeAction = aVar2;
            }

            public final er.a<i0> a() {
                return this.closeAction;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final nx3.a getError() {
                return this.error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof WebView)) {
                    return false;
                }
                WebView webView = (WebView) other;
                return t.c(this.error, webView.error) && t.c(this.closeAction, webView.closeAction);
            }

            public int hashCode() {
                return (this.error.hashCode() * 31) + this.closeAction.hashCode();
            }

            public String toString() {
                return "WebView(error=" + this.error + ", closeAction=" + this.closeAction + ')';
            }
        }
    }

    public b(ib4.c cVar, d dVar, mx.c cVar2) {
        this.genericDomainErrorMapper = cVar;
        this.webViewErrorMapper = dVar;
        this.labelProvider = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(a aVar, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.a.Primary) {
            a.Domain domain = (a.Domain) aVar;
            if ((domain.getError() instanceof dx.b.Business) && ((dx.b.Business) domain.getError()).getType() == jx3.a.GENERAL) {
                domain.a().a();
            }
        } else if (t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) || (bVar instanceof ib4.c.b.a.Close)) {
            ((a.Domain) aVar).a().a();
        } else if (!(bVar instanceof ib4.c.b.a.Secondary) && !t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            throw new p();
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public jb4.b b(final a params) {
        if (params instanceof a.Domain) {
            return this.genericDomainErrorMapper.b(new ib4.c.Params(((a.Domain) params).getError(), false, new l() { // from class: ox3.a
                @Override // er.l
                public final Object b(Object obj) {
                    return b.f(params, (ib4.c.b) obj);
                }
            }, 2, null));
        }
        if (params instanceof a.WebView) {
            a.WebView webView = (a.WebView) params;
            return this.webViewErrorMapper.b(new d.Params(webView.getError(), webView.a()));
        }
        if (!(params instanceof a.MissingEdorAddress)) {
            throw new p();
        }
        a.MissingEdorAddress missingEdorAddress = (a.MissingEdorAddress) params;
        return new jb4.b.Warning(this.labelProvider.c(gx3.a.f78224f), this.labelProvider.c(gx3.a.f78223e), null, new ErrorActionData(this.labelProvider.c(gx3.a.f78222d), missingEdorAddress.b()), new ErrorActionData(this.labelProvider.c(gx3.a.f78219a), missingEdorAddress.a()), null, new ErrorActionData(null, missingEdorAddress.a(), 1, null), 36, null);
    }
}
