package o;

import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.impl.MetadataHolderService;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p105prN.o2;
import v.d3;
import v.e3;
import v.f3;
import v.x3;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Object f139912s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final SparseArray<Integer> f139913t = new SparseArray<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final v.h1 f139914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f139915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f139916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f139917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f139918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HandlerThread f139919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private v.l0 f139920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private v.k0 f139921h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private x3 f139922i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b0.m f139923j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private v f139924k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final o1 f139925l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.common.util.concurrent.q<Void> f139926m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final v.c1 f139927n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final oq.k<p1> f139928o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a f139929p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.google.common.util.concurrent.q<Void> f139930q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Integer f139931r;

    /* JADX INFO: Access modifiers changed from: private */
    enum a {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public d0(Context context, e0.b bVar) {
        this(context, bVar, new f3());
    }

    public static /* synthetic */ void a(d0 d0Var, androidx.concurrent.futures.c.a aVar) {
        d0Var.f139920g.shutdown();
        if (d0Var.f139919f != null) {
            Executor executor = d0Var.f139917d;
            if (executor instanceof n) {
                ((n) executor).p();
            }
            d0Var.f139919f.quit();
        }
        aVar.c(null);
    }

    public static /* synthetic */ p1 b(Context context) {
        return new p1(context);
    }

    public static /* synthetic */ Object c(final d0 d0Var, final androidx.concurrent.futures.c.a aVar) {
        d0Var.f139927n.Q();
        if (d0Var.f139928o.c()) {
            d0Var.f139928o.getValue().f();
        }
        d0Var.f139914a.k().b(new Runnable() { // from class: o.a0
            @Override // java.lang.Runnable
            public final void run() {
                d0.a(this.f139883a, aVar);
            }
        }, d0Var.f139917d);
        return "CameraX shutdownInternal";
    }

    public static /* synthetic */ Object d(d0 d0Var, Context context, androidx.concurrent.futures.c.a aVar) {
        d0Var.p(d0Var.f139917d, SystemClock.elapsedRealtime(), 1, context, aVar);
        return "CameraX initInternal";
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0133  */
    /* JADX WARN: Code duplicated, block: B:39:0x0170 A[Catch: all -> 0x01d1, TryCatch #0 {all -> 0x01d1, blocks: (B:3:0x0015, B:5:0x001d, B:7:0x003d, B:9:0x005c, B:11:0x0077, B:18:0x0089, B:19:0x00b2, B:21:0x00b8, B:22:0x00c8, B:24:0x00eb, B:25:0x00ee, B:28:0x00f8, B:29:0x0104, B:30:0x0105, B:31:0x0111, B:32:0x0112, B:33:0x011e, B:34:0x011f, B:38:0x0138, B:53:0x01c5, B:39:0x0170, B:40:0x0172, B:43:0x0178, B:45:0x017e, B:46:0x0185, B:48:0x0189, B:49:0x01b5, B:51:0x01b9, B:52:0x01bd, B:58:0x01d0, B:41:0x0173, B:42:0x0177), top: B:62:0x0015, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x017e A[Catch: all -> 0x01d1, TryCatch #0 {all -> 0x01d1, blocks: (B:3:0x0015, B:5:0x001d, B:7:0x003d, B:9:0x005c, B:11:0x0077, B:18:0x0089, B:19:0x00b2, B:21:0x00b8, B:22:0x00c8, B:24:0x00eb, B:25:0x00ee, B:28:0x00f8, B:29:0x0104, B:30:0x0105, B:31:0x0111, B:32:0x0112, B:33:0x011e, B:34:0x011f, B:38:0x0138, B:53:0x01c5, B:39:0x0170, B:40:0x0172, B:43:0x0178, B:45:0x017e, B:46:0x0185, B:48:0x0189, B:49:0x01b5, B:51:0x01b9, B:52:0x01bd, B:58:0x01d0, B:41:0x0173, B:42:0x0177), top: B:62:0x0015, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0185 A[Catch: all -> 0x01d1, TryCatch #0 {all -> 0x01d1, blocks: (B:3:0x0015, B:5:0x001d, B:7:0x003d, B:9:0x005c, B:11:0x0077, B:18:0x0089, B:19:0x00b2, B:21:0x00b8, B:22:0x00c8, B:24:0x00eb, B:25:0x00ee, B:28:0x00f8, B:29:0x0104, B:30:0x0105, B:31:0x0111, B:32:0x0112, B:33:0x011e, B:34:0x011f, B:38:0x0138, B:53:0x01c5, B:39:0x0170, B:40:0x0172, B:43:0x0178, B:45:0x017e, B:46:0x0185, B:48:0x0189, B:49:0x01b5, B:51:0x01b9, B:52:0x01bd, B:58:0x01d0, B:41:0x0173, B:42:0x0177), top: B:62:0x0015, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0189 A[Catch: all -> 0x01d1, TryCatch #0 {all -> 0x01d1, blocks: (B:3:0x0015, B:5:0x001d, B:7:0x003d, B:9:0x005c, B:11:0x0077, B:18:0x0089, B:19:0x00b2, B:21:0x00b8, B:22:0x00c8, B:24:0x00eb, B:25:0x00ee, B:28:0x00f8, B:29:0x0104, B:30:0x0105, B:31:0x0111, B:32:0x0112, B:33:0x011e, B:34:0x011f, B:38:0x0138, B:53:0x01c5, B:39:0x0170, B:40:0x0172, B:43:0x0178, B:45:0x017e, B:46:0x0185, B:48:0x0189, B:49:0x01b5, B:51:0x01b9, B:52:0x01bd, B:58:0x01d0, B:41:0x0173, B:42:0x0177), top: B:62:0x0015, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x01b5 A[Catch: all -> 0x01d1, TryCatch #0 {all -> 0x01d1, blocks: (B:3:0x0015, B:5:0x001d, B:7:0x003d, B:9:0x005c, B:11:0x0077, B:18:0x0089, B:19:0x00b2, B:21:0x00b8, B:22:0x00c8, B:24:0x00eb, B:25:0x00ee, B:28:0x00f8, B:29:0x0104, B:30:0x0105, B:31:0x0111, B:32:0x0112, B:33:0x011e, B:34:0x011f, B:38:0x0138, B:53:0x01c5, B:39:0x0170, B:40:0x0172, B:43:0x0178, B:45:0x017e, B:46:0x0185, B:48:0x0189, B:49:0x01b5, B:51:0x01b9, B:52:0x01bd, B:58:0x01d0, B:41:0x0173, B:42:0x0177), top: B:62:0x0015, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x01b9 A[Catch: all -> 0x01d1, TryCatch #0 {all -> 0x01d1, blocks: (B:3:0x0015, B:5:0x001d, B:7:0x003d, B:9:0x005c, B:11:0x0077, B:18:0x0089, B:19:0x00b2, B:21:0x00b8, B:22:0x00c8, B:24:0x00eb, B:25:0x00ee, B:28:0x00f8, B:29:0x0104, B:30:0x0105, B:31:0x0111, B:32:0x0112, B:33:0x011e, B:34:0x011f, B:38:0x0138, B:53:0x01c5, B:39:0x0170, B:40:0x0172, B:43:0x0178, B:45:0x017e, B:46:0x0185, B:48:0x0189, B:49:0x01b5, B:51:0x01b9, B:52:0x01bd, B:58:0x01d0, B:41:0x0173, B:42:0x0177), top: B:62:0x0015, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x01bd A[Catch: all -> 0x01d1, TryCatch #0 {all -> 0x01d1, blocks: (B:3:0x0015, B:5:0x001d, B:7:0x003d, B:9:0x005c, B:11:0x0077, B:18:0x0089, B:19:0x00b2, B:21:0x00b8, B:22:0x00c8, B:24:0x00eb, B:25:0x00ee, B:28:0x00f8, B:29:0x0104, B:30:0x0105, B:31:0x0111, B:32:0x0112, B:33:0x011e, B:34:0x011f, B:38:0x0138, B:53:0x01c5, B:39:0x0170, B:40:0x0172, B:43:0x0178, B:45:0x017e, B:46:0x0185, B:48:0x0189, B:49:0x01b5, B:51:0x01b9, B:52:0x01bd, B:58:0x01d0, B:41:0x0173, B:42:0x0177), top: B:62:0x0015, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x0189, please report this as an issue */
    public static /* synthetic */ void f(final d0 d0Var, final Context context, final Executor executor, final int i15, final androidx.concurrent.futures.c.a aVar, final long j15) {
        o1.c cVarE;
        d0Var.getClass();
        eb.a.c("CX:initAndRetryRecursively");
        try {
            try {
                v.l0.b bVarK0 = d0Var.f139916c.k0(null);
                if (bVarK0 == null) {
                    throw new c1(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                }
                v.i1 i1VarA = v.i1.a(d0Var.f139917d, d0Var.f139918e);
                s sVarI0 = d0Var.f139916c.i0(null);
                v.k1 k1VarB = v.k1.b(context, sVarI0);
                long jL0 = d0Var.f139916c.l0();
                x3.c cVarQ0 = d0Var.f139916c.q0(null);
                if (cVarQ0 == null) {
                    throw new c1(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                }
                d0Var.f139922i = cVarQ0.a(context);
                b0.o oVar = new b0.o(d0Var.f139922i, null);
                d0Var.f139923j = oVar;
                d0Var.f139920g = bVarK0.a(context, i1VarA, sVarI0, jL0, d0Var.f139916c, oVar);
                v.k0.a aVarN0 = d0Var.f139916c.n0(null);
                if (aVarN0 == null) {
                    throw new c1(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                }
                v.k0 k0VarA = aVarN0.a(context, d0Var.f139920g.f(), d0Var.f139920g.c());
                d0Var.f139921h = k0VarA;
                d0Var.f139923j.a(k0VarA);
                if (executor instanceof n) {
                    ((n) executor).r(d0Var.f139920g);
                }
                d0Var.f139914a.n(d0Var.f139920g);
                p.a aVarG = d0Var.f139920g.g();
                aVarG.b(d0Var.f139914a);
                d0Var.f139924k = new w(d0Var.f139914a, aVarG, d0Var.f139922i, d0Var.f139923j);
                Iterator<v.n0> it = d0Var.f139914a.m().iterator();
                while (it.hasNext()) {
                    it.next().getCameraInfo().j(d0Var.f139924k);
                }
                d0Var.f139927n.R(k1VarB, d0Var.f139920g, d0Var.f139914a);
                d0Var.f139927n.v(d0Var.f139921h);
                d0Var.f139927n.v(d0Var.f139920g.g());
                k1VarB.a(d0Var.f139914a);
                if (i15 > 1) {
                    d0Var.u(null);
                }
                d0Var.r();
                aVar.c(null);
                eb.a.f();
            } catch (Throwable th4) {
                eb.a.f();
                throw th4;
            }
        } catch (RuntimeException e15) {
            e = e15;
            v.d1 d1Var = new v.d1(j15, i15, e);
            cVarE = d0Var.f139925l.e(d1Var);
            d0Var.u(d1Var);
            if (cVarE.d() || i15 >= Integer.MAX_VALUE) {
                synchronized (d0Var.f139915b) {
                    d0Var.f139929p = a.INITIALIZING_ERROR;
                }
                if (cVarE.c()) {
                    d0Var.r();
                    aVar.c(null);
                } else if (e instanceof v.k1.a) {
                    String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((v.k1.a) e).getAvailableCameraCount();
                    e1.d("CameraX", str, e);
                    aVar.f(new c1(new u(3, str)));
                } else if (e instanceof c1) {
                    aVar.f(e);
                } else {
                    aVar.f(new c1(e));
                }
                eb.a.f();
            }
            e1.p("CameraX", "Retry init. Start time " + j15 + " current time " + SystemClock.elapsedRealtime(), e);
            e6.g.b(d0Var.f139918e, new Runnable() { // from class: o.c0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f139899a.p(executor, j15, i15 + 1, context, aVar);
                }
            }, "retry_token", cVarE.b());
            d0Var.f139927n.Q();
            eb.a.f();
        } catch (c1 e16) {
            e = e16;
            v.d1 d1Var2 = new v.d1(j15, i15, e);
            cVarE = d0Var.f139925l.e(d1Var2);
            d0Var.u(d1Var2);
            if (cVarE.d()) {
                synchronized (d0Var.f139915b) {
                    d0Var.f139929p = a.INITIALIZING_ERROR;
                    if (cVarE.c()) {
                        d0Var.r();
                        aVar.c(null);
                    } else {
                        if (e instanceof v.k1.a) {
                            String str2 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((v.k1.a) e).getAvailableCameraCount();
                            e1.d("CameraX", str2, e);
                            aVar.f(new c1(new u(3, str2)));
                        } else if (e instanceof c1) {
                            aVar.f(e);
                        } else {
                            aVar.f(new c1(e));
                        }
                        d0Var.f139927n.Q();
                    }
                }
            } else {
                synchronized (d0Var.f139915b) {
                    d0Var.f139929p = a.INITIALIZING_ERROR;
                    if (cVarE.c()) {
                        d0Var.r();
                        aVar.c(null);
                    } else {
                        if (e instanceof v.k1.a) {
                            String str3 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((v.k1.a) e).getAvailableCameraCount();
                            e1.d("CameraX", str3, e);
                            aVar.f(new c1(new u(3, str3)));
                        } else if (e instanceof c1) {
                            aVar.f(e);
                        } else {
                            aVar.f(new c1(e));
                        }
                        d0Var.f139927n.Q();
                    }
                }
            }
            eb.a.f();
        } catch (v.k1.a e17) {
            e = e17;
            v.d1 d1Var3 = new v.d1(j15, i15, e);
            cVarE = d0Var.f139925l.e(d1Var3);
            d0Var.u(d1Var3);
            if (cVarE.d()) {
                synchronized (d0Var.f139915b) {
                    d0Var.f139929p = a.INITIALIZING_ERROR;
                    if (cVarE.c()) {
                        d0Var.r();
                        aVar.c(null);
                    } else {
                        if (e instanceof v.k1.a) {
                            String str4 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((v.k1.a) e).getAvailableCameraCount();
                            e1.d("CameraX", str4, e);
                            aVar.f(new c1(new u(3, str4)));
                        } else if (e instanceof c1) {
                            aVar.f(e);
                        } else {
                            aVar.f(new c1(e));
                        }
                        d0Var.f139927n.Q();
                    }
                }
            } else {
                synchronized (d0Var.f139915b) {
                    d0Var.f139929p = a.INITIALIZING_ERROR;
                    if (cVarE.c()) {
                        d0Var.r();
                        aVar.c(null);
                    } else {
                        if (e instanceof v.k1.a) {
                            String str5 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((v.k1.a) e).getAvailableCameraCount();
                            e1.d("CameraX", str5, e);
                            aVar.f(new c1(new u(3, str5)));
                        } else if (e instanceof c1) {
                            aVar.f(e);
                        } else {
                            aVar.f(new c1(e));
                        }
                        d0Var.f139927n.Q();
                    }
                }
            }
            eb.a.f();
        }
    }

    private static void g(Integer num) {
        synchronized (f139912s) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray<Integer> sparseArray = f139913t;
                int iIntValue = sparseArray.get(num.intValue()).intValue() - 1;
                if (iIntValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                }
                v();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private static e0.b l(Context context) {
        ComponentCallbacks2 componentCallbacks2A = y.e.a(context);
        if (componentCallbacks2A instanceof e0.b) {
            return (e0.b) componentCallbacks2A;
        }
        try {
            Context contextF = y.e.f(context);
            Bundle bundle = contextF.getPackageManager().getServiceInfo(new ComponentName(contextF, (Class<?>) MetadataHolderService.class), 640).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (e0.b) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
            }
            e1.c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException e15) {
            e = e15;
            e1.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (ClassNotFoundException e16) {
            e = e16;
            e1.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (IllegalAccessException e17) {
            e = e17;
            e1.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InstantiationException e18) {
            e = e18;
            e1.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NoSuchMethodException e19) {
            e = e19;
            e1.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NullPointerException e25) {
            e = e25;
            e1.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InvocationTargetException e26) {
            e = e26;
            e1.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    private static void o(Integer num) {
        synchronized (f139912s) {
            try {
                if (num == null) {
                    return;
                }
                i6.i.c(num.intValue(), 3, 6, "minLogLevel");
                SparseArray<Integer> sparseArray = f139913t;
                sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + sparseArray.get(num.intValue()).intValue() : 1));
                v();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(final Executor executor, final long j15, final int i15, final Context context, final androidx.concurrent.futures.c.a<Void> aVar) {
        executor.execute(new Runnable() { // from class: o.b0
            @Override // java.lang.Runnable
            public final void run() {
                d0.f(this.f139889a, context, executor, i15, aVar, j15);
            }
        });
    }

    private com.google.common.util.concurrent.q<Void> q(final Context context) {
        com.google.common.util.concurrent.q<Void> qVarA;
        synchronized (this.f139915b) {
            i6.i.j(this.f139929p == a.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.f139929p = a.INITIALIZING;
            qVarA = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: o.y
                @Override // androidx.concurrent.futures.c.InterfaceC0250c
                public final Object a(androidx.concurrent.futures.c.a aVar) {
                    return d0.d(this.f140189a, context, aVar);
                }
            });
        }
        return qVarA;
    }

    private void r() {
        synchronized (this.f139915b) {
            this.f139929p = a.INITIALIZED;
        }
    }

    private com.google.common.util.concurrent.q<Void> t() {
        synchronized (this.f139915b) {
            try {
                this.f139918e.removeCallbacksAndMessages("retry_token");
                int iOrdinal = this.f139929p.ordinal();
                if (iOrdinal == 0) {
                    this.f139929p = a.SHUTDOWN;
                    return a0.f.h(null);
                }
                if (iOrdinal == 1) {
                    throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                }
                if (iOrdinal == 2 || iOrdinal == 3) {
                    this.f139929p = a.SHUTDOWN;
                    g(this.f139931r);
                    this.f139930q = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0250c() { // from class: o.z
                        @Override // androidx.concurrent.futures.c.InterfaceC0250c
                        public final Object a(androidx.concurrent.futures.c.a aVar) {
                            return d0.c(this.f140195a, aVar);
                        }
                    });
                }
                return this.f139930q;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private void u(o1.b bVar) throws Throwable {
        if (eb.a.h()) {
            eb.a.j("CX:CameraProvider-RetryStatus", bVar != null ? bVar.b() : -1);
        }
    }

    private static void v() {
        SparseArray<Integer> sparseArray = f139913t;
        if (sparseArray.size() == 0) {
            e1.l();
            return;
        }
        if (sparseArray.get(3) != null) {
            e1.m(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            e1.m(4);
        } else if (sparseArray.get(5) != null) {
            e1.m(5);
        } else if (sparseArray.get(6) != null) {
            e1.m(6);
        }
    }

    private static void w(Context context, d3 d3Var, o2<Context, d3> o2Var) {
        if (d3Var != null) {
            e1.a("CameraX", "QuirkSettings from CameraXConfig: " + d3Var);
        } else {
            d3Var = o2Var.apply(context);
            e1.a("CameraX", "QuirkSettings from app metadata: " + d3Var);
        }
        if (d3Var == null) {
            d3Var = e3.f202560b;
            e1.a("CameraX", "QuirkSettings by default: " + d3Var);
        }
        e3.b().d(d3Var);
    }

    public v.c1 h() {
        return this.f139927n;
    }

    public v.l0 i() {
        v.l0 l0Var = this.f139920g;
        if (l0Var != null) {
            return l0Var;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public v.h1 j() {
        return this.f139914a;
    }

    public v k() {
        v vVar = this.f139924k;
        if (vVar != null) {
            return vVar;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public com.google.common.util.concurrent.q<Void> m() {
        return this.f139926m;
    }

    public p1 n() {
        return this.f139928o.getValue();
    }

    public com.google.common.util.concurrent.q<Void> s() {
        return t();
    }

    d0(Context context, e0.b bVar, o2<Context, d3> o2Var) {
        this.f139914a = new v.h1();
        this.f139915b = new Object();
        this.f139929p = a.UNINITIALIZED;
        this.f139930q = a0.f.h(null);
        final Context contextF = y.e.f(context);
        if (bVar != null) {
            this.f139916c = bVar.getCameraXConfig();
        } else {
            e0.b bVarL = l(context);
            if (bVarL == null) {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
            this.f139916c = bVarL.getCameraXConfig();
        }
        w(contextF, this.f139916c.o0(), o2Var);
        Executor executorJ0 = this.f139916c.j0(null);
        Handler handlerP0 = this.f139916c.p0(null);
        executorJ0 = executorJ0 == null ? new n() : executorJ0;
        this.f139917d = executorJ0;
        if (handlerP0 == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f139919f = handlerThread;
            handlerThread.start();
            this.f139918e = e6.g.a(handlerThread.getLooper());
        } else {
            this.f139919f = null;
            this.f139918e = handlerP0;
        }
        Integer num = (Integer) this.f139916c.f(e0.X, null);
        this.f139931r = num;
        o(num);
        this.f139925l = new o1.a(this.f139916c.m0()).a();
        this.f139927n = new v.c1(executorJ0, z.a.e(this.f139918e));
        this.f139928o = oq.l.a(new er.a() { // from class: o.x
            @Override // er.a
            public final Object a() {
                return d0.b(contextF);
            }
        });
        this.f139926m = q(contextF);
    }
}
