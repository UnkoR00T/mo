package pm;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f160827b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static i f160828c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private yk.n f160829a;

    private i() {
    }

    public static i c() {
        i iVar;
        synchronized (f160827b) {
            jg.s.p(f160828c != null, "MlKitContext has not been initialized");
            iVar = (i) jg.s.l(f160828c);
        }
        return iVar;
    }

    public static i d(Context context) {
        i iVarE;
        synchronized (f160827b) {
            iVarE = e(context, vh.n.f206828a);
        }
        return iVarE;
    }

    public static i e(Context context, Executor executor) {
        i iVar;
        synchronized (f160827b) {
            jg.s.p(f160828c == null, "MlKitContext is already initialized");
            i iVar2 = new i();
            f160828c = iVar2;
            Context contextF = f(context);
            yk.n nVarE = yk.n.k(executor).d(yk.f.c(contextF, MlKitComponentDiscoveryService.class).b()).b(yk.c.q(contextF, Context.class, new Class[0])).b(yk.c.q(iVar2, i.class, new Class[0])).e();
            iVar2.f160829a = nVarE;
            nVarE.n(true);
            iVar = f160828c;
        }
        return iVar;
    }

    private static Context f(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public <T> T a(Class<T> cls) {
        jg.s.p(f160828c == this, "MlKitContext has been deleted");
        jg.s.l(this.f160829a);
        return (T) this.f160829a.a(cls);
    }

    public Context b() {
        return (Context) a(Context.class);
    }
}
