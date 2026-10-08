package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import io.sentry.b7;
import io.sentry.i5;
import io.sentry.n8;
import io.sentry.protocol.DebugImage;
import io.sentry.q7;
import io.sentry.r6;
import io.sentry.s6;
import io.sentry.w7;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements io.sentry.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f94061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SentryAndroidOptions f94062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t0 f94063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s6 f94064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.cache.r f94065e;

    public n0(Context context, SentryAndroidOptions sentryAndroidOptions, t0 t0Var) {
        this.f94061a = a1.g(context);
        this.f94062b = sentryAndroidOptions;
        this.f94063c = t0Var;
        this.f94065e = sentryAndroidOptions.findPersistingScopeObserver();
        this.f94064d = new s6(new w7(sentryAndroidOptions));
    }

    private void A(i5 i5Var) {
        Map map = (Map) io.sentry.cache.h.i(this.f94062b, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (i5Var.N() == null) {
            i5Var.e0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!i5Var.N().containsKey(entry.getKey())) {
                i5Var.d0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    private void B(i5 i5Var) {
        if (i5Var.I() == null) {
            i5Var.Y("java");
        }
    }

    private void C(i5 i5Var) {
        if (i5Var.J() == null) {
            i5Var.Z((String) io.sentry.cache.h.i(this.f94062b, "release.json", String.class));
        }
    }

    private void D(r6 r6Var) {
        String str = (String) l(this.f94062b, "replay.json", String.class);
        if (!new File(this.f94062b.getCacheDirPath(), "replay_" + str).exists()) {
            if (!n(r6Var)) {
                return;
            }
            File[] fileArrListFiles = new File(this.f94062b.getCacheDirPath()).listFiles();
            String strSubstring = null;
            if (fileArrListFiles != null) {
                long jLastModified = Long.MIN_VALUE;
                for (File file : fileArrListFiles) {
                    if (file.isDirectory() && file.getName().startsWith("replay_") && file.lastModified() > jLastModified && file.lastModified() <= r6Var.v0().getTime()) {
                        jLastModified = file.lastModified();
                        strSubstring = file.getName().substring(7);
                    }
                }
            }
            str = strSubstring;
        }
        if (str == null) {
            return;
        }
        io.sentry.cache.r.y(this.f94062b, str, "replay.json");
        r6Var.C().k("replay_id", str);
    }

    private void E(i5 i5Var) {
        if (i5Var.K() == null) {
            i5Var.a0((io.sentry.protocol.m) l(this.f94062b, "request.json", io.sentry.protocol.m.class));
        }
    }

    private void F(i5 i5Var) {
        Map map = (Map) l(this.f94062b, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (i5Var.N() == null) {
            i5Var.e0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!i5Var.N().containsKey(entry.getKey())) {
                i5Var.d0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    private void G(i5 i5Var) {
        if (i5Var.L() == null) {
            i5Var.b0((io.sentry.protocol.p) io.sentry.cache.h.i(this.f94062b, "sdk-version.json", io.sentry.protocol.p.class));
        }
    }

    private void H(i5 i5Var) {
        try {
            a1.a aVarL = g1.i(this.f94061a, this.f94062b).l();
            if (aVarL != null) {
                for (Map.Entry<String, String> entry : aVarL.a().entrySet()) {
                    i5Var.d0(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th4) {
            this.f94062b.getLogger().b(b7.ERROR, "Error getting side loaded info.", th4);
        }
    }

    private void I(r6 r6Var) {
        k(r6Var);
        H(r6Var);
    }

    private void J(r6 r6Var) {
        n8 n8Var = (n8) l(this.f94062b, "trace.json", n8.class);
        if (r6Var.C().i() != null || n8Var == null || n8Var.k() == null || n8Var.n() == null) {
            return;
        }
        r6Var.C().x(n8Var);
    }

    private void K(r6 r6Var) {
        String str = (String) l(this.f94062b, "transaction.json", String.class);
        if (r6Var.w0() == null) {
            r6Var.H0(str);
        }
    }

    private void L(i5 i5Var) {
        if (i5Var.Q() == null) {
            i5Var.f0((io.sentry.protocol.g0) l(this.f94062b, "user.json", io.sentry.protocol.g0.class));
        }
    }

    private void a(r6 r6Var, Object obj) {
        C(r6Var);
        v(r6Var);
        u(r6Var);
        s(r6Var);
        G(r6Var);
        o(r6Var, obj);
        A(r6Var);
    }

    private void c(r6 r6Var, Object obj) {
        E(r6Var);
        L(r6Var);
        F(r6Var);
        q(r6Var);
        x(r6Var);
        r(r6Var);
        K(r6Var);
        y(r6Var, obj);
        z(r6Var);
        J(r6Var);
        D(r6Var);
    }

    private io.sentry.protocol.b0 d(List<io.sentry.protocol.b0> list) {
        if (list == null) {
            return null;
        }
        for (io.sentry.protocol.b0 b0Var : list) {
            String strM = b0Var.m();
            if (strM != null && strM.equals("main")) {
                return b0Var;
            }
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    private io.sentry.protocol.e e() {
        io.sentry.protocol.e eVar = new io.sentry.protocol.e();
        eVar.b0(Build.MANUFACTURER);
        eVar.P(Build.BRAND);
        eVar.V(a1.l(this.f94062b.getLogger()));
        eVar.d0(Build.MODEL);
        eVar.e0(Build.ID);
        eVar.L(a1.j());
        ActivityManager.MemoryInfo memoryInfoN = a1.n(this.f94061a, this.f94062b.getLogger());
        if (memoryInfoN != null) {
            eVar.c0(g(memoryInfoN));
        }
        eVar.n0(this.f94063c.f());
        DisplayMetrics displayMetricsK = a1.k(this.f94061a, this.f94062b.getLogger());
        if (displayMetricsK != null) {
            eVar.m0(Integer.valueOf(displayMetricsK.widthPixels));
            eVar.l0(Integer.valueOf(displayMetricsK.heightPixels));
            eVar.j0(Float.valueOf(displayMetricsK.density));
            eVar.k0(Integer.valueOf(displayMetricsK.densityDpi));
        }
        if (eVar.J() == null) {
            eVar.Y(f());
        }
        List<Integer> listC = io.sentry.android.core.internal.util.k.a().c();
        if (!listC.isEmpty()) {
            eVar.i0(Double.valueOf(((Integer) Collections.max(listC)).doubleValue()));
            eVar.h0(Integer.valueOf(listC.size()));
        }
        return eVar;
    }

    private String f() {
        try {
            return l1.a(this.f94061a);
        } catch (Throwable th4) {
            this.f94062b.getLogger().b(b7.ERROR, "Error getting installationId.", th4);
            return null;
        }
    }

    private Long g(ActivityManager.MemoryInfo memoryInfo) {
        return Long.valueOf(memoryInfo.totalMem);
    }

    private boolean i(Object obj) {
        if (obj instanceof io.sentry.hints.a) {
            return "anr_background".equals(((io.sentry.hints.a) obj).h());
        }
        return false;
    }

    private void j(i5 i5Var) {
        String str;
        io.sentry.protocol.l lVarG = i5Var.C().g();
        i5Var.C().s(g1.i(this.f94061a, this.f94062b).j());
        if (lVarG != null) {
            String strG = lVarG.g();
            if (strG == null || strG.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + strG.trim().toLowerCase(Locale.ROOT);
            }
            i5Var.C().k(str, lVarG);
        }
    }

    private void k(i5 i5Var) {
        io.sentry.protocol.g0 g0VarQ = i5Var.Q();
        if (g0VarQ == null) {
            g0VarQ = new io.sentry.protocol.g0();
            i5Var.f0(g0VarQ);
        }
        if (g0VarQ.i() == null) {
            g0VarQ.l(f());
        }
        if (g0VarQ.j() == null && this.f94062b.isSendDefaultPii()) {
            g0VarQ.m("{{auto}}");
        }
    }

    private <T> T l(q7 q7Var, String str, Class<T> cls) {
        io.sentry.cache.r rVar = this.f94065e;
        if (rVar == null) {
            return null;
        }
        return (T) rVar.u(q7Var, str, cls);
    }

    private boolean n(r6 r6Var) {
        String str = (String) io.sentry.cache.h.i(this.f94062b, "replay-error-sample-rate.json", String.class);
        if (str == null) {
            return false;
        }
        try {
            if (Double.parseDouble(str) >= io.sentry.util.b0.a().c()) {
                return true;
            }
            this.f94062b.getLogger().c(b7.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", r6Var.G());
            return false;
        } catch (Throwable th4) {
            this.f94062b.getLogger().b(b7.ERROR, "Error parsing replay sample rate.", th4);
            return false;
        }
    }

    private void o(i5 i5Var, Object obj) {
        io.sentry.protocol.a aVarD = i5Var.C().d();
        if (aVarD == null) {
            aVarD = new io.sentry.protocol.a();
        }
        aVarD.o(a1.i(this.f94061a));
        aVarD.r(Boolean.valueOf(!i(obj)));
        PackageInfo packageInfoP = a1.p(this.f94061a, this.f94063c);
        if (packageInfoP != null) {
            aVarD.n(packageInfoP.packageName);
        }
        String strJ = i5Var.J() != null ? i5Var.J() : (String) io.sentry.cache.h.i(this.f94062b, "release.json", String.class);
        if (strJ != null) {
            try {
                String strSubstring = strJ.substring(strJ.indexOf(64) + 1, strJ.indexOf(43));
                String strSubstring2 = strJ.substring(strJ.indexOf(43) + 1);
                aVarD.q(strSubstring);
                aVarD.m(strSubstring2);
            } catch (Throwable unused) {
                this.f94062b.getLogger().c(b7.WARNING, "Failed to parse release from scope cache: %s", strJ);
            }
        }
        try {
            a1.b bVarM = g1.i(this.f94061a, this.f94062b).m();
            if (bVarM != null) {
                aVarD.t(Boolean.valueOf(bVarM.b()));
                if (bVarM.a() != null) {
                    aVarD.u(Arrays.asList(bVarM.a()));
                }
            }
        } catch (Throwable th4) {
            this.f94062b.getLogger().b(b7.ERROR, "Error getting split apks info.", th4);
        }
        i5Var.C().n(aVarD);
    }

    private void q(i5 i5Var) {
        List<io.sentry.f> list = (List) l(this.f94062b, "breadcrumbs.json", List.class);
        if (list == null) {
            return;
        }
        if (i5Var.B() == null) {
            i5Var.S(list);
        } else {
            i5Var.B().addAll(list);
        }
    }

    private void r(i5 i5Var) {
        io.sentry.protocol.c cVar = (io.sentry.protocol.c) l(this.f94062b, "contexts.json", io.sentry.protocol.c.class);
        if (cVar == null) {
            return;
        }
        io.sentry.protocol.c cVarC = i5Var.C();
        for (Map.Entry<String, Object> entry : new io.sentry.protocol.c(cVar).b()) {
            Object value = entry.getValue();
            if (!"trace".equals(entry.getKey()) || !(value instanceof n8)) {
                if (!cVarC.a(entry.getKey())) {
                    cVarC.k(entry.getKey(), value);
                }
            }
        }
    }

    private void s(i5 i5Var) {
        io.sentry.protocol.d dVarD = i5Var.D();
        if (dVarD == null) {
            dVarD = new io.sentry.protocol.d();
        }
        if (dVarD.d() == null) {
            dVarD.e(new ArrayList());
        }
        List<DebugImage> listD = dVarD.d();
        if (listD != null) {
            String str = (String) io.sentry.cache.h.i(this.f94062b, "proguard-uuid.json", String.class);
            if (str != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(str);
                listD.add(debugImage);
            }
            i5Var.T(dVarD);
        }
    }

    private void t(i5 i5Var) {
        if (i5Var.C().e() == null) {
            i5Var.C().p(e());
        }
    }

    private void u(i5 i5Var) {
        String str;
        if (i5Var.E() == null) {
            i5Var.U((String) io.sentry.cache.h.i(this.f94062b, "dist.json", String.class));
        }
        if (i5Var.E() != null || (str = (String) io.sentry.cache.h.i(this.f94062b, "release.json", String.class)) == null) {
            return;
        }
        try {
            i5Var.U(str.substring(str.indexOf(43) + 1));
        } catch (Throwable unused) {
            this.f94062b.getLogger().c(b7.WARNING, "Failed to parse release from scope cache: %s", str);
        }
    }

    private void v(i5 i5Var) {
        if (i5Var.F() == null) {
            String environment = (String) io.sentry.cache.h.i(this.f94062b, "environment.json", String.class);
            if (environment == null) {
                environment = this.f94062b.getEnvironment();
            }
            i5Var.V(environment);
        }
    }

    private void w(r6 r6Var, Object obj) {
        io.sentry.protocol.j jVar = new io.sentry.protocol.j();
        if (((io.sentry.hints.c) obj).a()) {
            jVar.p("AppExitInfo");
        } else {
            jVar.p("HistoricalAppExitInfo");
        }
        String str = "ANR";
        if (i(obj)) {
            str = "Background ANR";
        }
        ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(str, Thread.currentThread());
        io.sentry.protocol.b0 b0VarD = d(r6Var.u0());
        if (b0VarD == null) {
            b0VarD = new io.sentry.protocol.b0();
            b0VarD.y(new io.sentry.protocol.a0());
        }
        r6Var.A0(this.f94064d.f(b0VarD, jVar, applicationNotResponding));
    }

    private void x(i5 i5Var) {
        Map map = (Map) l(this.f94062b, "extras.json", Map.class);
        if (map == null) {
            return;
        }
        if (i5Var.H() == null) {
            i5Var.X(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!i5Var.H().containsKey(entry.getKey())) {
                i5Var.H().put((String) entry.getKey(), entry.getValue());
            }
        }
    }

    private void y(r6 r6Var, Object obj) {
        List<String> list = (List) l(this.f94062b, "fingerprint.json", List.class);
        if (r6Var.q0() == null) {
            r6Var.B0(list);
        }
        boolean zI = i(obj);
        if (r6Var.q0() == null) {
            r6Var.B0(Arrays.asList("{{ default }}", zI ? "background-anr" : "foreground-anr"));
        }
    }

    private void z(r6 r6Var) {
        b7 b7Var = (b7) l(this.f94062b, "level.json", b7.class);
        if (r6Var.r0() == null) {
            r6Var.C0(b7Var);
        }
    }

    @Override // io.sentry.e0
    public r6 m(r6 r6Var, io.sentry.j0 j0Var) {
        Object objG = io.sentry.util.m.g(j0Var);
        if (!(objG instanceof io.sentry.hints.c)) {
            this.f94062b.getLogger().c(b7.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return r6Var;
        }
        w(r6Var, objG);
        B(r6Var);
        j(r6Var);
        t(r6Var);
        if (!((io.sentry.hints.c) objG).a()) {
            this.f94062b.getLogger().c(b7.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return r6Var;
        }
        c(r6Var, objG);
        a(r6Var, objG);
        I(r6Var);
        return r6Var;
    }

    @Override // io.sentry.e0
    public io.sentry.protocol.c0 p(io.sentry.protocol.c0 c0Var, io.sentry.j0 j0Var) {
        return c0Var;
    }
}
