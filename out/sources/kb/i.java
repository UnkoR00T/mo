package kb;

import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public class i extends jb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebResourceError f109670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WebResourceErrorBoundaryInterface f109671b;

    public i(InvocationHandler invocationHandler) {
        this.f109671b = (WebResourceErrorBoundaryInterface) xv.a.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    private WebResourceError c() {
        if (this.f109670a == null) {
            this.f109670a = k.c().c(Proxy.getInvocationHandler(this.f109671b));
        }
        return this.f109670a;
    }

    @Override // jb.b
    public CharSequence a() {
        return c().getDescription();
    }

    @Override // jb.b
    public int b() {
        return c().getErrorCode();
    }

    public i(WebResourceError webResourceError) {
        this.f109670a = webResourceError;
    }
}
