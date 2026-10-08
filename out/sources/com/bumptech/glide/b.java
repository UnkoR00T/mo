package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import androidx.fragment.app.p;
import io.sentry.android.core.c2;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oe.o;

/* JADX INFO: loaded from: classes3.dex */
public class b implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile b f28720l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile boolean f28721m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final be.k f28722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ce.d f28723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final de.h f28724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f28725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ce.b f28726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o f28727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final oe.c f28728g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a f28730j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<l> f28729h = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private f f28731k = f.NORMAL;

    public interface a {
        re.g build();
    }

    b(Context context, be.k kVar, de.h hVar, ce.d dVar, ce.b bVar, o oVar, oe.c cVar, int i15, a aVar, Map<Class<?>, m<?, ?>> map, List<re.f<Object>> list, List<pe.b> list2, pe.a aVar2, e eVar) {
        this.f28722a = kVar;
        this.f28723b = dVar;
        this.f28726e = bVar;
        this.f28724c = hVar;
        this.f28727f = oVar;
        this.f28728g = cVar;
        this.f28730j = aVar;
        this.f28725d = new d(context, bVar, j.d(this, list2, aVar2), new se.f(), aVar, map, list, kVar, eVar, i15);
    }

    static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f28721m) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f28721m = true;
        try {
            m(context, generatedAppGlideModule);
        } finally {
            f28721m = false;
        }
    }

    public static b c(Context context) {
        if (f28720l == null) {
            GeneratedAppGlideModule generatedAppGlideModuleD = d(context.getApplicationContext());
            synchronized (b.class) {
                try {
                    if (f28720l == null) {
                        a(context, generatedAppGlideModuleD);
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        return f28720l;
    }

    private static GeneratedAppGlideModule d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            c2.g("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e15) {
            q(e15);
            return null;
        } catch (InstantiationException e16) {
            q(e16);
            return null;
        } catch (NoSuchMethodException e17) {
            q(e17);
            return null;
        } catch (InvocationTargetException e18) {
            q(e18);
            return null;
        }
    }

    private static o l(Context context) {
        ve.k.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return c(context).k();
    }

    private static void m(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        n(context, new c(), generatedAppGlideModule);
    }

    private static void n(Context context, c cVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<pe.b> listB = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            listB = new pe.d(applicationContext).b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set<Class<?>> setD = generatedAppGlideModule.d();
            Iterator<pe.b> it = listB.iterator();
            while (it.hasNext()) {
                pe.b next = it.next();
                if (setD.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        next.toString();
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<pe.b> it4 = listB.iterator();
            while (it4.hasNext()) {
                it4.next().getClass().toString();
            }
        }
        cVar.b(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        Iterator<pe.b> it5 = listB.iterator();
        while (it5.hasNext()) {
            it5.next().a(applicationContext, cVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, cVar);
        }
        b bVarA = cVar.a(applicationContext, listB, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(bVarA);
        f28720l = bVarA;
    }

    private static void q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static l t(Context context) {
        return l(context).d(context);
    }

    public static l u(p pVar) {
        return l(pVar).e(pVar);
    }

    public void b() {
        ve.l.a();
        this.f28724c.b();
        this.f28723b.b();
        this.f28726e.b();
    }

    public ce.b e() {
        return this.f28726e;
    }

    public ce.d f() {
        return this.f28723b;
    }

    oe.c g() {
        return this.f28728g;
    }

    public Context h() {
        return this.f28725d.getBaseContext();
    }

    d i() {
        return this.f28725d;
    }

    public i j() {
        return this.f28725d.i();
    }

    public o k() {
        return this.f28727f;
    }

    void o(l lVar) {
        synchronized (this.f28729h) {
            try {
                if (this.f28729h.contains(lVar)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f28729h.add(lVar);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i15) {
        r(i15);
    }

    boolean p(se.h<?> hVar) {
        synchronized (this.f28729h) {
            try {
                Iterator<l> it = this.f28729h.iterator();
                while (it.hasNext()) {
                    if (it.next().A(hVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void r(int i15) {
        ve.l.a();
        synchronized (this.f28729h) {
            try {
                Iterator<l> it = this.f28729h.iterator();
                while (it.hasNext()) {
                    it.next().onTrimMemory(i15);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f28724c.a(i15);
        this.f28723b.a(i15);
        this.f28726e.a(i15);
    }

    void s(l lVar) {
        synchronized (this.f28729h) {
            try {
                if (!this.f28729h.contains(lVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f28729h.remove(lVar);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
