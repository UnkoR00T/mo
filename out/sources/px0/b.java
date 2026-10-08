package px0;

import fu.r;
import iy.b0;
import iy.c0;
import java.util.List;
import ox0.d;
import p071kotlin.Metadata;
import pq.v;
import th0.InitExternalAuthMobileResponse;
import w70.c;
import w70.p;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpx0/b;", "Lpx0/a;", "<init>", "()V", "Liy/b0;", "externalToken", "", "wkDomain", "e", "(Liy/b0;Ljava/lang/String;)Ljava/lang/String;", "", "isWebViewSSLEnabled", "Lw70/p;", "c", "(Z)Lw70/p;", "Lpx0/a$a;", "params", "Lox0/d$a;", "f", "(Lpx0/a$a;)Lox0/d$a;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements px0.a {

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"px0/b$a", "Lw70/p;", "", "g", "()Z", "b", "a", "Lw70/p$a;", "j", "()Lw70/p$a;", "i", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f163107a;

        a(boolean z15) {
            this.f163107a = z15;
        }

        @Override // w70.o
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getF163107a() {
            return this.f163107a;
        }

        @Override // w70.p
        public boolean b() {
            return true;
        }

        @Override // w70.p
        public /* bridge */ int c() {
            return super.c();
        }

        @Override // w70.p
        /* JADX INFO: renamed from: d */
        public /* bridge */ String getF150620b() {
            return super.getF150620b();
        }

        @Override // w70.p
        public /* bridge */ int e() {
            return super.e();
        }

        @Override // w70.o
        public /* bridge */ List<Object> f() {
            return super.f();
        }

        @Override // w70.p
        public boolean g() {
            return true;
        }

        @Override // w70.p
        public /* bridge */ boolean h() {
            return super.h();
        }

        @Override // w70.p
        public boolean i() {
            return false;
        }

        @Override // w70.p
        public p.a j() {
            return p.a.ONLY_LOAD_FIRST_PAGE;
        }
    }

    private final p c(boolean isWebViewSSLEnabled) {
        return new a(isWebViewSSLEnabled);
    }

    private final String e(b0 externalToken, String wkDomain) {
        return r.n("\n      <!DOCTYPE html>\n      <html>\n        <body onload=\"document.forms[0].submit()\">\n          <form method=\"post\" action=\"" + wkDomain + "/login/SingleSignOnService\">\n            <input type=\"hidden\" name=\"SAMLRequest\" \n            value=\"" + c0.e(externalToken) + "\"/>\n          </form>\n        </body>\n      </html>\n    ");
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d.a b(px0.a.Params params) {
        c url;
        ox0.c state = params.getState();
        if (state instanceof ox0.c.b) {
            return d.a.b.f150386a;
        }
        if (!(state instanceof ox0.c.PzReady)) {
            if (state instanceof ox0.c.Error) {
                return new d.a.Error(((ox0.c.Error) params.getState()).getErrorVMS());
            }
            throw new oq.p();
        }
        InitExternalAuthMobileResponse webViewData = ((ox0.c.PzReady) params.getState()).getWebViewData();
        if (((ox0.c.PzReady) params.getState()).getLoadedPage() == null) {
            url = new c.HtmlData(c(params.getIsWebViewSSLEnabled()), params.getWebViewActions(), v.e("edohub"), e(((ox0.c.PzReady) params.getState()).getWebViewData().getExternalToken(), params.getWkDomain()), null, null, null, null, 240, null);
        } else {
            url = new c.Url(c(params.getIsWebViewSSLEnabled()), params.getWebViewActions(), v.e("edohub"), ((ox0.c.PzReady) params.getState()).getLoadedPage(), null, 16, null);
        }
        return new d.a.Ready(webViewData, url);
    }
}
