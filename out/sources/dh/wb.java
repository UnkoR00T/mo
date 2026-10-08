package dh;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class wb {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static mc f42423k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final oc f42424l = oc.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f42425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f42426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pb f42427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final pm.n f42428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final vh.l f42429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final vh.l f42430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f42431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f42432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f42433i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f42434j = new HashMap();

    public wb(Context context, final pm.n nVar, pb pbVar, String str) {
        this.f42425a = context.getPackageName();
        this.f42426b = pm.c.a(context);
        this.f42428d = nVar;
        this.f42427c = pbVar;
        jc.a();
        this.f42431g = str;
        this.f42429e = pm.g.a().b(new Callable() { // from class: dh.tb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f42298a.a();
            }
        });
        pm.g gVarA = pm.g.a();
        nVar.getClass();
        this.f42430f = gVarA.b(new Callable() { // from class: dh.ub
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return nVar.a();
            }
        });
        oc ocVar = f42424l;
        this.f42432h = ocVar.containsKey(str) ? DynamiteModule.c(context, (String) ocVar.get(str)) : -1;
    }

    private static synchronized mc d() {
        try {
            mc mcVar = f42423k;
            if (mcVar != null) {
                return mcVar;
            }
            e6.h hVarA = e6.e.a(Resources.getSystem().getConfiguration());
            mb mbVar = new mb();
            for (int i15 = 0; i15 < hVarA.g(); i15++) {
                mbVar.c(pm.c.b(hVarA.c(i15)));
            }
            mc mcVarD = mbVar.d();
            f42423k = mcVarD;
            return mcVarD;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    final /* synthetic */ String a() {
        return jg.p.a().b(this.f42431g);
    }

    final /* synthetic */ void b(ob obVar, e8 e8Var, String str) {
        obVar.b(e8Var);
        String strA = obVar.a();
        ja jaVar = new ja();
        jaVar.b(this.f42425a);
        jaVar.c(this.f42426b);
        jaVar.h(d());
        jaVar.g(Boolean.TRUE);
        jaVar.l(strA);
        jaVar.j(str);
        jaVar.i(this.f42430f.q() ? (String) this.f42430f.m() : this.f42428d.a());
        jaVar.d(10);
        jaVar.k(Integer.valueOf(this.f42432h));
        obVar.c(jaVar);
        this.f42427c.a(obVar);
    }

    public final void c(gc gcVar, final e8 e8Var) {
        r7 r7Var;
        x7 x7Var;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f42433i.get(e8Var) != null && jElapsedRealtime - ((Long) this.f42433i.get(e8Var)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        this.f42433i.put(e8Var, Long.valueOf(jElapsedRealtime));
        int i15 = gcVar.f41844a;
        int i16 = gcVar.f41845b;
        int i17 = gcVar.f41846c;
        int i18 = gcVar.f41847d;
        int i19 = gcVar.f41848e;
        long j15 = gcVar.f41849f;
        int i25 = gcVar.f41850g;
        w7 w7Var = new w7();
        if (i15 == -1) {
            r7Var = r7.BITMAP;
        } else if (i15 == 35) {
            r7Var = r7.YUV_420_888;
        } else if (i15 == 842094169) {
            r7Var = r7.YV12;
        } else if (i15 != 16) {
            r7Var = i15 != 17 ? r7.UNKNOWN_FORMAT : r7.NV21;
        } else {
            r7Var = r7.NV16;
        }
        w7Var.d(r7Var);
        if (i16 == 1) {
            x7Var = x7.BITMAP;
        } else if (i16 == 2) {
            x7Var = x7.BYTEARRAY;
        } else if (i16 != 3) {
            x7Var = i16 != 4 ? x7.ANDROID_MEDIA_IMAGE : x7.FILEPATH;
        } else {
            x7Var = x7.BYTEBUFFER;
        }
        w7Var.f(x7Var);
        w7Var.c(Integer.valueOf(i17));
        w7Var.e(Integer.valueOf(i18));
        w7Var.g(Integer.valueOf(i19));
        w7Var.b(Long.valueOf(j15));
        w7Var.h(Integer.valueOf(i25));
        z7 z7VarJ = w7Var.j();
        f8 f8Var = new f8();
        f8Var.d(z7VarJ);
        final ob obVarE = xb.e(f8Var);
        final String strB = this.f42429e.q() ? (String) this.f42429e.m() : jg.p.a().b(this.f42431g);
        pm.g.d().execute(new Runnable() { // from class: dh.vb
            @Override // java.lang.Runnable
            public final void run() {
                this.f42374a.b(obVarE, e8Var, strB);
            }
        });
    }
}
