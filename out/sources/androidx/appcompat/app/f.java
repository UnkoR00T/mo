package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static c f8168a = new c(new d());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f8169b = -100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static e6.h f8170c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static e6.h f8171d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Boolean f8172e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f8173f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final r0.b<WeakReference<f>> f8174g = new r0.b<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f8175h = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Object f8176j = new Object();

    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    static class c implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f8177a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Queue<Runnable> f8178b = new ArrayDeque();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Executor f8179c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Runnable f8180d;

        c(Executor executor) {
            this.f8179c = executor;
        }

        public static /* synthetic */ void a(c cVar, Runnable runnable) {
            cVar.getClass();
            try {
                runnable.run();
            } finally {
                cVar.c();
            }
        }

        protected void c() {
            synchronized (this.f8177a) {
                try {
                    Runnable runnablePoll = this.f8178b.poll();
                    this.f8180d = runnablePoll;
                    if (runnablePoll != null) {
                        this.f8179c.execute(runnablePoll);
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f8177a) {
                try {
                    this.f8178b.add(new Runnable() { // from class: androidx.appcompat.app.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            f.c.a(this.f8181a, runnable);
                        }
                    });
                    if (this.f8180d == null) {
                        c();
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    static class d implements Executor {
        d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    f() {
    }

    static void F(f fVar) {
        synchronized (f8175h) {
            G(fVar);
        }
    }

    private static void G(f fVar) {
        synchronized (f8175h) {
            try {
                Iterator<WeakReference<f>> it = f8174g.iterator();
                while (it.hasNext()) {
                    f fVar2 = it.next().get();
                    if (fVar2 == fVar || fVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public static void L(int i15) {
        if ((i15 == -1 || i15 == 0 || i15 == 1 || i15 == 2 || i15 == 3) && f8169b != i15) {
            f8169b = i15;
            g();
        }
    }

    static void P(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (m().f()) {
                    String strB = s5.e.b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.b(systemService, a.a(strB));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    static void Q(final Context context) {
        if (w(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f8173f) {
                    return;
                }
                f8168a.execute(new Runnable() { // from class: androidx.appcompat.app.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.c(context);
                    }
                });
                return;
            }
            synchronized (f8176j) {
                try {
                    e6.h hVar = f8170c;
                    if (hVar == null) {
                        if (f8171d == null) {
                            f8171d = e6.h.b(s5.e.b(context));
                        }
                        if (f8171d.f()) {
                        } else {
                            f8170c = f8171d;
                        }
                    } else if (!hVar.equals(f8171d)) {
                        e6.h hVar2 = f8170c;
                        f8171d = hVar2;
                        s5.e.a(context, hVar2.h());
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    public static /* synthetic */ void c(Context context) {
        P(context);
        f8173f = true;
    }

    static void d(f fVar) {
        synchronized (f8175h) {
            G(fVar);
            f8174g.add(new WeakReference<>(fVar));
        }
    }

    private static void g() {
        synchronized (f8175h) {
            try {
                Iterator<WeakReference<f>> it = f8174g.iterator();
                while (it.hasNext()) {
                    f fVar = it.next().get();
                    if (fVar != null) {
                        fVar.f();
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public static f j(Activity activity, androidx.appcompat.app.d dVar) {
        return new h(activity, dVar);
    }

    public static f k(Dialog dialog, androidx.appcompat.app.d dVar) {
        return new h(dialog, dVar);
    }

    public static e6.h m() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objQ = q();
            if (objQ != null) {
                return e6.h.j(b.a(objQ));
            }
        } else {
            e6.h hVar = f8170c;
            if (hVar != null) {
                return hVar;
            }
        }
        return e6.h.e();
    }

    public static int o() {
        return f8169b;
    }

    static Object q() {
        Context contextN;
        Iterator<WeakReference<f>> it = f8174g.iterator();
        while (it.hasNext()) {
            f fVar = it.next().get();
            if (fVar != null && (contextN = fVar.n()) != null) {
                return contextN.getSystemService("locale");
            }
        }
        return null;
    }

    static e6.h s() {
        return f8170c;
    }

    static boolean w(Context context) {
        if (f8172e == null) {
            try {
                Bundle bundle = AppLocalesMetadataHolderService.a(context).metaData;
                if (bundle != null) {
                    f8172e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f8172e = Boolean.FALSE;
            }
        }
        return f8172e.booleanValue();
    }

    public abstract void A(Bundle bundle);

    public abstract void B();

    public abstract void C(Bundle bundle);

    public abstract void D();

    public abstract void E();

    public abstract boolean H(int i15);

    public abstract void I(int i15);

    public abstract void J(View view);

    public abstract void K(View view, ViewGroup.LayoutParams layoutParams);

    public void M(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public void N(int i15) {
    }

    public abstract void O(CharSequence charSequence);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean f();

    @Deprecated
    public void h(Context context) {
    }

    public Context i(Context context) {
        h(context);
        return context;
    }

    public abstract <T extends View> T l(int i15);

    public Context n() {
        return null;
    }

    public int p() {
        return -100;
    }

    public abstract MenuInflater r();

    public abstract androidx.appcompat.app.a t();

    public abstract void u();

    public abstract void v();

    public abstract void x(Configuration configuration);

    public abstract void y(Bundle bundle);

    public abstract void z();
}
