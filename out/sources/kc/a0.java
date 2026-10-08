package kc;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import fr.q0;
import ju.w0;
import p071kotlin.Metadata;
import zc.ImageRequest;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\u0002*\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lzc/f;", "request", "", "d", "(Lzc/f;)Z", "Lju/w0;", "Lzc/i;", "job", "Lzc/d;", "c", "(Lzc/f;Lju/w0;)Lzc/d;", "Lkc/h$a;", "Lkc/w$a;", "options", "a", "(Lkc/h$a;Lkc/w$a;)Lkc/h$a;", "b", "(Lkc/w$a;)Z", "coil-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a0 {
    public static final h.a a(h.a aVar, w.Options options) {
        aVar.k(new tc.a(), q0.c(Uri.class));
        aVar.k(new tc.e(), q0.c(Integer.class));
        aVar.j(new sc.a(), q0.c(h0.class));
        aVar.h(new qc.a.C4146a(), q0.c(h0.class));
        aVar.h(new qc.f.a(), q0.c(h0.class));
        aVar.h(new qc.n.a(), q0.c(h0.class));
        aVar.h(new qc.h.a(), q0.c(Drawable.class));
        su.h hVarB = su.l.b(u.b(options), 0, 2, null);
        if (b(options)) {
            aVar.g(new oc.x.a(hVarB));
        }
        aVar.g(new oc.c.C3586c(hVarB, u.a(options)));
        return aVar;
    }

    private static final boolean b(w.Options options) {
        return Build.VERSION.SDK_INT >= 29 && u.c(options) && fr.t.c(u.a(options), oc.o.f144543c);
    }

    public static final zc.d c(ImageRequest imageRequest, w0<? extends zc.i> w0Var) {
        return imageRequest.getTarget() instanceof bd.b ? zc.v.a(((bd.b) imageRequest.getTarget()).m()).b(w0Var) : new zc.m(w0Var);
    }

    public static final boolean d(ImageRequest imageRequest) {
        return (imageRequest.getTarget() instanceof bd.b) || (imageRequest.getSizeResolver() instanceof ad.k) || zc.h.i(imageRequest) != null;
    }
}
