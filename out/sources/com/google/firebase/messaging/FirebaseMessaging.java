package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import io.sentry.android.core.c2;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static x0 f36436n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static ScheduledExecutorService f36438p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vk.e f36439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jl.a f36440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f36441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d0 f36442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s0 f36443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f36444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f36445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Executor f36446h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final vh.l<c1> f36447i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final i0 f36448j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f36449k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f36450l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f36435m = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static kl.b<ye.i> f36437o = new kl.b() { // from class: com.google.firebase.messaging.p
        @Override // kl.b
        public final Object get() {
            return FirebaseMessaging.e();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final hl.d f36451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f36452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private hl.b<vk.b> f36453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Boolean f36454d;

        a(hl.d dVar) {
            this.f36451a = dVar;
        }

        public static /* synthetic */ void a(a aVar, hl.a aVar2) {
            if (aVar.c()) {
                FirebaseMessaging.this.E();
            }
        }

        private Boolean d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context contextJ = FirebaseMessaging.this.f36439a.j();
            SharedPreferences sharedPreferences = contextJ.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextJ.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextJ.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void b() {
            try {
                if (this.f36452b) {
                    return;
                }
                Boolean boolD = d();
                this.f36454d = boolD;
                if (boolD == null) {
                    hl.b<vk.b> bVar = new hl.b() { // from class: com.google.firebase.messaging.a0
                        @Override // hl.b
                        public final void a(hl.a aVar) {
                            FirebaseMessaging.a.a(this.f36479a, aVar);
                        }
                    };
                    this.f36453c = bVar;
                    this.f36451a.a(vk.b.class, bVar);
                }
                this.f36452b = true;
            } catch (Throwable th4) {
                throw th4;
            }
        }

        synchronized boolean c() {
            Boolean bool;
            try {
                b();
                bool = this.f36454d;
            } catch (Throwable th4) {
                throw th4;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f36439a.s();
        }
    }

    FirebaseMessaging(vk.e eVar, jl.a aVar, kl.b<tl.i> bVar, kl.b<il.j> bVar2, ll.e eVar2, kl.b<ye.i> bVar3, hl.d dVar) {
        this(eVar, aVar, bVar, bVar2, eVar2, bVar3, dVar, new i0(eVar.j()));
    }

    private boolean C() {
        m0.c(this.f36441c);
        if (!m0.d(this.f36441c)) {
            return false;
        }
        if (this.f36439a.i(wk.a.class) != null) {
            return true;
        }
        return h0.a() && f36437o != null;
    }

    private synchronized void D() {
        if (!this.f36449k) {
            F(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        jl.a aVar = this.f36440b;
        if (aVar != null) {
            aVar.b();
        } else if (G(u())) {
            D();
        }
    }

    public static /* synthetic */ vh.l a(FirebaseMessaging firebaseMessaging, String str, x0.a aVar, String str2) {
        r(firebaseMessaging.f36441c).g(firebaseMessaging.s(), str, str2, firebaseMessaging.f36448j.a());
        if (aVar == null || !str2.equals(aVar.f36614a)) {
            firebaseMessaging.y(str2);
        }
        return vh.o.f(str2);
    }

    public static /* synthetic */ void b(FirebaseMessaging firebaseMessaging) {
        if (firebaseMessaging.z()) {
            firebaseMessaging.E();
        }
    }

    public static /* synthetic */ void c(FirebaseMessaging firebaseMessaging, vh.m mVar) {
        firebaseMessaging.getClass();
        try {
            mVar.c(firebaseMessaging.m());
        } catch (Exception e15) {
            mVar.b(e15);
        }
    }

    public static /* synthetic */ void d(FirebaseMessaging firebaseMessaging, vh.m mVar) {
        firebaseMessaging.getClass();
        try {
            firebaseMessaging.f36440b.c(i0.c(firebaseMessaging.f36439a), "FCM");
            mVar.c(null);
        } catch (Exception e15) {
            mVar.b(e15);
        }
    }

    public static /* synthetic */ ye.i e() {
        return null;
    }

    public static /* synthetic */ void g(FirebaseMessaging firebaseMessaging, fg.a aVar) {
        firebaseMessaging.getClass();
        if (aVar != null) {
            h0.y(aVar.h());
            firebaseMessaging.w();
        }
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(vk.e eVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) eVar.i(FirebaseMessaging.class);
        jg.s.m(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public static /* synthetic */ void i(FirebaseMessaging firebaseMessaging, c1 c1Var) {
        if (firebaseMessaging.z()) {
            c1Var.n();
        }
    }

    public static /* synthetic */ void j(FirebaseMessaging firebaseMessaging, vh.m mVar) {
        firebaseMessaging.getClass();
        try {
            vh.o.a(firebaseMessaging.f36442d.c());
            r(firebaseMessaging.f36441c).d(firebaseMessaging.s(), i0.c(firebaseMessaging.f36439a));
            mVar.c(null);
        } catch (Exception e15) {
            mVar.b(e15);
        }
    }

    public static synchronized FirebaseMessaging q() {
        return getInstance(vk.e.k());
    }

    private static synchronized x0 r(Context context) {
        try {
            if (f36436n == null) {
                f36436n = new x0(context);
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return f36436n;
    }

    private String s() {
        return "[DEFAULT]".equals(this.f36439a.l()) ? "" : this.f36439a.n();
    }

    public static ye.i v() {
        return f36437o.get();
    }

    private void w() {
        this.f36442d.f().f(this.f36445g, new vh.h() { // from class: com.google.firebase.messaging.v
            @Override // vh.h
            public final void a(Object obj) {
                FirebaseMessaging.g(this.f36599a, (fg.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        m0.c(this.f36441c);
        o0.f(this.f36441c, this.f36442d, C());
        if (C()) {
            w();
        }
    }

    private void y(String str) {
        if ("[DEFAULT]".equals(this.f36439a.l())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                this.f36439a.l();
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new m(this.f36441c).g(intent);
        }
    }

    boolean A() {
        return this.f36448j.g();
    }

    synchronized void B(boolean z15) {
        this.f36449k = z15;
    }

    synchronized void F(long j15) {
        o(new y0(this, Math.min(Math.max(30L, 2 * j15), f36435m)), j15);
        this.f36449k = true;
    }

    boolean G(x0.a aVar) {
        return aVar == null || aVar.b(this.f36448j.a());
    }

    String m() throws IOException {
        jl.a aVar = this.f36440b;
        if (aVar != null) {
            try {
                return (String) vh.o.a(aVar.d());
            } catch (InterruptedException | ExecutionException e15) {
                throw new IOException(e15);
            }
        }
        final x0.a aVarU = u();
        if (!G(aVarU)) {
            return aVarU.f36614a;
        }
        final String strC = i0.c(this.f36439a);
        try {
            return (String) vh.o.a(this.f36443e.b(strC, new s0.a() { // from class: com.google.firebase.messaging.w
                @Override // com.google.firebase.messaging.s0.a
                public final vh.l start() {
                    FirebaseMessaging firebaseMessaging = this.f36601a;
                    return firebaseMessaging.f36442d.g().r(firebaseMessaging.f36446h, new vh.k() { // from class: com.google.firebase.messaging.q
                        @Override // vh.k
                        public final vh.l a(Object obj) {
                            return FirebaseMessaging.a(this.f36582a, str, aVar, (String) obj);
                        }
                    });
                }
            }));
        } catch (InterruptedException | ExecutionException e16) {
            throw new IOException(e16);
        }
    }

    public vh.l<Void> n() {
        if (this.f36440b != null) {
            final vh.m mVar = new vh.m();
            this.f36445g.execute(new Runnable() { // from class: com.google.firebase.messaging.y
                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging.d(this.f36617a, mVar);
                }
            });
            return mVar.a();
        }
        if (u() == null) {
            return vh.o.f(null);
        }
        final vh.m mVar2 = new vh.m();
        n.e().execute(new Runnable() { // from class: com.google.firebase.messaging.z
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.j(this.f36625a, mVar2);
            }
        });
        return mVar2.a();
    }

    @SuppressLint({"ThreadPoolCreation"})
    void o(Runnable runnable, long j15) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f36438p == null) {
                    f36438p = new ScheduledThreadPoolExecutor(1, new pg.b("TAG"));
                }
                f36438p.schedule(runnable, j15, TimeUnit.SECONDS);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    Context p() {
        return this.f36441c;
    }

    public vh.l<String> t() {
        jl.a aVar = this.f36440b;
        if (aVar != null) {
            return aVar.d();
        }
        final vh.m mVar = new vh.m();
        this.f36445g.execute(new Runnable() { // from class: com.google.firebase.messaging.x
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.c(this.f36610a, mVar);
            }
        });
        return mVar.a();
    }

    x0.a u() {
        return r(this.f36441c).e(s(), i0.c(this.f36439a));
    }

    public boolean z() {
        return this.f36444f.c();
    }

    FirebaseMessaging(vk.e eVar, jl.a aVar, kl.b<tl.i> bVar, kl.b<il.j> bVar2, ll.e eVar2, kl.b<ye.i> bVar3, hl.d dVar, i0 i0Var) {
        this(eVar, aVar, bVar3, dVar, i0Var, new d0(eVar, i0Var, bVar, bVar2, eVar2), n.f(), n.c(), n.b());
    }

    FirebaseMessaging(vk.e eVar, jl.a aVar, kl.b<ye.i> bVar, hl.d dVar, i0 i0Var, d0 d0Var, Executor executor, Executor executor2, Executor executor3) {
        this.f36449k = false;
        f36437o = bVar;
        this.f36439a = eVar;
        this.f36440b = aVar;
        this.f36444f = new a(dVar);
        Context contextJ = eVar.j();
        this.f36441c = contextJ;
        o oVar = new o();
        this.f36450l = oVar;
        this.f36448j = i0Var;
        this.f36442d = d0Var;
        this.f36443e = new s0(executor);
        this.f36445g = executor2;
        this.f36446h = executor3;
        Context contextJ2 = eVar.j();
        if (contextJ2 instanceof Application) {
            ((Application) contextJ2).registerActivityLifecycleCallbacks(oVar);
        } else {
            c2.g("FirebaseMessaging", "Context " + contextJ2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.a(new jl.a.InterfaceC2463a() { // from class: com.google.firebase.messaging.r
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.s
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.b(this.f36588a);
            }
        });
        vh.l<c1> lVarE = c1.e(this, i0Var, d0Var, contextJ, n.g());
        this.f36447i = lVarE;
        lVarE.f(executor2, new vh.h() { // from class: com.google.firebase.messaging.t
            @Override // vh.h
            public final void a(Object obj) {
                FirebaseMessaging.i(this.f36591a, (c1) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.u
            @Override // java.lang.Runnable
            public final void run() {
                this.f36593a.x();
            }
        });
    }
}
