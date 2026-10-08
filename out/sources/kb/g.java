package kb;

import android.webkit.SafeBrowsingResponse;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public class g extends jb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SafeBrowsingResponse f109665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SafeBrowsingResponseBoundaryInterface f109666b;

    public g(InvocationHandler invocationHandler) {
        this.f109666b = (SafeBrowsingResponseBoundaryInterface) xv.a.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    private SafeBrowsingResponseBoundaryInterface b() {
        if (this.f109666b == null) {
            this.f109666b = (SafeBrowsingResponseBoundaryInterface) xv.a.a(SafeBrowsingResponseBoundaryInterface.class, k.c().b(this.f109665a));
        }
        return this.f109666b;
    }

    private SafeBrowsingResponse c() {
        if (this.f109665a == null) {
            this.f109665a = k.c().a(Proxy.getInvocationHandler(this.f109666b));
        }
        return this.f109665a;
    }

    @Override // jb.a
    public void a(boolean z15) {
        a.f fVar = j.f109722z;
        if (fVar.c()) {
            c.a(c(), z15);
        } else {
            if (!fVar.d()) {
                throw j.a();
            }
            b().showInterstitial(z15);
        }
    }

    public g(SafeBrowsingResponse safeBrowsingResponse) {
        this.f109665a = safeBrowsingResponse;
    }
}
