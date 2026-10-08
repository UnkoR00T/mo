package vk;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import e6.m;
import io.sentry.android.core.c2;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jg.r;
import jg.s;
import yk.n;
import yk.w;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f207135k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final Map<String, e> f207136l = new r0.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f207137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f207138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f207139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n f207140d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w<ql.a> f207143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final kl.b<il.f> f207144h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f207141e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f207142f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<a> f207145i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<Object> f207146j = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z15);
    }

    @TargetApi(14)
    private static class b implements ig.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static AtomicReference<b> f207147a = new AtomicReference<>();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (com.google.android.gms.common.util.j.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f207147a.get() == null) {
                    b bVar = new b();
                    if (androidx.camera.view.i.a(f207147a, null, bVar)) {
                        ig.c.c(application);
                        ig.c.b().a(bVar);
                    }
                }
            }
        }

        @Override // ig.c.a
        public void a(boolean z15) {
            synchronized (e.f207135k) {
                try {
                    for (e eVar : new ArrayList(e.f207136l.values())) {
                        if (eVar.f207141e.get()) {
                            eVar.v(z15);
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    @TargetApi(24)
    private static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static AtomicReference<c> f207148b = new AtomicReference<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f207149a;

        public c(Context context) {
            this.f207149a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f207148b.get() == null) {
                c cVar = new c(context);
                if (androidx.camera.view.i.a(f207148b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f207149a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (e.f207135k) {
                try {
                    Iterator<e> it = e.f207136l.values().iterator();
                    while (it.hasNext()) {
                        it.next().o();
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            c();
        }
    }

    protected e(final Context context, String str, k kVar) {
        this.f207137a = (Context) s.l(context);
        this.f207138b = s.f(str);
        this.f207139c = (k) s.l(kVar);
        l lVarB = FirebaseInitProvider.b();
        ul.c.b("Firebase");
        ul.c.b("ComponentDiscovery");
        List<kl.b<ComponentRegistrar>> listB = yk.f.c(context, ComponentDiscoveryService.class).b();
        ul.c.a();
        ul.c.b("Runtime");
        n.b bVarF = n.k(zk.k.INSTANCE).d(listB).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(yk.c.q(context, Context.class, new Class[0])).b(yk.c.q(this, e.class, new Class[0])).b(yk.c.q(kVar, k.class, new Class[0])).f(new ul.b());
        if (m.a(context) && FirebaseInitProvider.c()) {
            bVarF.b(yk.c.q(lVarB, l.class, new Class[0]));
        }
        n nVarE = bVarF.e();
        this.f207140d = nVarE;
        ul.c.a();
        this.f207143g = new w<>(new kl.b() { // from class: vk.c
            @Override // kl.b
            public final Object get() {
                return e.b(this.f207132a, context);
            }
        });
        this.f207144h = nVarE.d(il.f.class);
        g(new a() { // from class: vk.d
            @Override // vk.e.a
            public final void a(boolean z15) {
                e.a(this.f207134a, z15);
            }
        });
        ul.c.a();
    }

    public static /* synthetic */ void a(e eVar, boolean z15) {
        if (z15) {
            eVar.getClass();
        } else {
            eVar.f207144h.get().h();
        }
    }

    public static /* synthetic */ ql.a b(e eVar, Context context) {
        return new ql.a(context, eVar.n(), (hl.c) eVar.f207140d.a(hl.c.class));
    }

    private void h() {
        s.p(!this.f207142f.get(), "FirebaseApp was deleted");
    }

    public static e k() {
        e eVar;
        synchronized (f207135k) {
            try {
                eVar = f207136l.get("[DEFAULT]");
                if (eVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + com.google.android.gms.common.util.k.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                eVar.f207144h.get().h();
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (!m.a(this.f207137a)) {
            l();
            c.b(this.f207137a);
        } else {
            l();
            this.f207140d.n(t());
            this.f207144h.get().h();
        }
    }

    public static e p(Context context) {
        synchronized (f207135k) {
            try {
                if (f207136l.containsKey("[DEFAULT]")) {
                    return k();
                }
                k kVarA = k.a(context);
                if (kVarA == null) {
                    c2.g("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return q(context, kVarA);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public static e q(Context context, k kVar) {
        return r(context, kVar, "[DEFAULT]");
    }

    public static e r(Context context, k kVar, String str) {
        e eVar;
        b.c(context);
        String strU = u(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f207135k) {
            Map<String, e> map = f207136l;
            s.p(!map.containsKey(strU), "FirebaseApp name " + strU + " already exists!");
            s.m(context, "Application context cannot be null.");
            eVar = new e(context, strU, kVar);
            map.put(strU, eVar);
        }
        eVar.o();
        return eVar;
    }

    private static String u(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(boolean z15) {
        Iterator<a> it = this.f207145i.iterator();
        while (it.hasNext()) {
            it.next().a(z15);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f207138b.equals(((e) obj).l());
        }
        return false;
    }

    public void g(a aVar) {
        h();
        if (this.f207141e.get() && ig.c.b().d()) {
            aVar.a(true);
        }
        this.f207145i.add(aVar);
    }

    public int hashCode() {
        return this.f207138b.hashCode();
    }

    public <T> T i(Class<T> cls) {
        h();
        return (T) this.f207140d.a(cls);
    }

    public Context j() {
        h();
        return this.f207137a;
    }

    public String l() {
        h();
        return this.f207138b;
    }

    public k m() {
        h();
        return this.f207139c;
    }

    public String n() {
        return com.google.android.gms.common.util.c.a(l().getBytes(Charset.defaultCharset())) + "+" + com.google.android.gms.common.util.c.a(m().c().getBytes(Charset.defaultCharset()));
    }

    public boolean s() {
        h();
        return this.f207143g.get().b();
    }

    public boolean t() {
        return "[DEFAULT]".equals(l());
    }

    public String toString() {
        return r.c(this).a("name", this.f207138b).a("options", this.f207139c).toString();
    }
}
