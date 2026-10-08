package io.sentry.android.core;

import io.sentry.n8;
import io.sentry.r6;
import io.sentry.s8;
import io.sentry.u8;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
final class t1 implements io.sentry.e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f94147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SentryAndroidOptions f94148c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f94146a = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.util.a f94149d = new io.sentry.util.a();

    t1(SentryAndroidOptions sentryAndroidOptions, h hVar) {
        this.f94148c = (SentryAndroidOptions) io.sentry.util.v.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f94147b = (h) io.sentry.util.v.c(hVar, "ActivityFramesTracker is required");
    }

    private void a(io.sentry.android.core.performance.h hVar, io.sentry.protocol.c0 c0Var) {
        n8 n8VarI;
        s8 s8VarE;
        if (hVar.m() == io.sentry.android.core.performance.h.a.COLD && (n8VarI = c0Var.C().i()) != null) {
            io.sentry.protocol.v vVarN = n8VarI.n();
            Iterator<io.sentry.protocol.y> it = c0Var.o0().iterator();
            while (true) {
                if (!it.hasNext()) {
                    s8VarE = null;
                    break;
                }
                io.sentry.protocol.y next = it.next();
                if (next.d().contentEquals("app.start.cold")) {
                    s8VarE = next.e();
                    break;
                }
            }
            io.sentry.android.core.performance.i iVarG = hVar.g();
            if (iVarG.t() && Math.abs(iVarG.g()) <= 10000) {
                c0Var.o0().add(f(iVarG, s8VarE, vVarN, "process.load"));
            }
            List<io.sentry.android.core.performance.i> listO = hVar.o();
            if (!listO.isEmpty()) {
                Iterator<io.sentry.android.core.performance.i> it4 = listO.iterator();
                while (it4.hasNext()) {
                    c0Var.o0().add(f(it4.next(), s8VarE, vVarN, "contentprovider.load"));
                }
            }
            io.sentry.android.core.performance.i iVarN = hVar.n();
            if (iVarN.v()) {
                c0Var.o0().add(f(iVarN, s8VarE, vVarN, "application.load"));
            }
        }
    }

    private boolean c(io.sentry.protocol.c0 c0Var) {
        for (io.sentry.protocol.y yVar : c0Var.o0()) {
            if (yVar.d().contentEquals("app.start.cold") || yVar.d().contentEquals("app.start.warm")) {
                return true;
            }
        }
        n8 n8VarI = c0Var.C().i();
        if (n8VarI != null) {
            return n8VarI.e().equals("app.start.cold") || n8VarI.e().equals("app.start.warm");
        }
        return false;
    }

    private static boolean d(double d15, io.sentry.protocol.y yVar) {
        if (d15 >= yVar.f().doubleValue()) {
            return yVar.g() == null || d15 <= yVar.g().doubleValue();
        }
        return false;
    }

    private void e(io.sentry.protocol.c0 c0Var) {
        Object obj;
        io.sentry.protocol.y yVar = null;
        io.sentry.protocol.y yVar2 = null;
        for (io.sentry.protocol.y yVar3 : c0Var.o0()) {
            if ("ui.load.initial_display".equals(yVar3.d())) {
                yVar = yVar3;
            } else if ("ui.load.full_display".equals(yVar3.d())) {
                yVar2 = yVar3;
            }
            if (yVar != null && yVar2 != null) {
                break;
            }
        }
        if (yVar == null && yVar2 == null) {
            return;
        }
        for (io.sentry.protocol.y yVar4 : c0Var.o0()) {
            if (yVar4 != yVar && yVar4 != yVar2) {
                Map<String, Object> mapB = yVar4.b();
                boolean z15 = false;
                boolean z16 = yVar != null && d(yVar4.f().doubleValue(), yVar) && (mapB == null || (obj = mapB.get("thread.name")) == null || "main".equals(obj));
                if (yVar2 != null && d(yVar4.f().doubleValue(), yVar2)) {
                    z15 = true;
                }
                if (z16 || z15) {
                    Map<String, Object> mapB2 = yVar4.b();
                    if (mapB2 == null) {
                        mapB2 = new ConcurrentHashMap<>();
                        yVar4.h(mapB2);
                    }
                    if (z16) {
                        mapB2.put("ui.contributes_to_ttid", Boolean.TRUE);
                    }
                    if (z15) {
                        mapB2.put("ui.contributes_to_ttfd", Boolean.TRUE);
                    }
                }
            }
        }
    }

    private static io.sentry.protocol.y f(io.sentry.android.core.performance.i iVar, s8 s8Var, io.sentry.protocol.v vVar, String str) {
        HashMap map = new HashMap(2);
        map.put("thread.id", Long.valueOf(io.sentry.android.core.internal.util.h.f93991b));
        map.put("thread.name", "main");
        Boolean bool = Boolean.TRUE;
        map.put("ui.contributes_to_ttid", bool);
        map.put("ui.contributes_to_ttfd", bool);
        return new io.sentry.protocol.y(Double.valueOf(iVar.p()), Double.valueOf(iVar.l()), vVar, new s8(), s8Var, str, iVar.e(), u8.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), map);
    }

    @Override // io.sentry.e0
    public r6 m(r6 r6Var, io.sentry.j0 j0Var) {
        return r6Var;
    }

    @Override // io.sentry.e0
    public io.sentry.protocol.c0 p(io.sentry.protocol.c0 c0Var, io.sentry.j0 j0Var) {
        Map<String, io.sentry.protocol.i> mapM;
        io.sentry.g1 g1VarA = this.f94149d.a();
        try {
            if (!this.f94148c.isTracingEnabled()) {
                if (g1VarA != null) {
                    g1VarA.close();
                }
                return c0Var;
            }
            io.sentry.android.core.performance.h hVarP = io.sentry.android.core.performance.h.p();
            if (c(c0Var)) {
                if (hVarP.B()) {
                    long jG = hVarP.l(this.f94148c).g();
                    if (jG != 0) {
                        c0Var.m0().put(hVarP.m() == io.sentry.android.core.performance.h.a.COLD ? "app_start_cold" : "app_start_warm", new io.sentry.protocol.i(Float.valueOf(jG), io.sentry.h2.a.MILLISECOND.apiName()));
                        a(hVarP, c0Var);
                        hVarP.r();
                    }
                }
                io.sentry.protocol.a aVarD = c0Var.C().d();
                if (aVarD == null) {
                    aVarD = new io.sentry.protocol.a();
                    c0Var.C().n(aVarD);
                }
                aVarD.v(hVarP.m() == io.sentry.android.core.performance.h.a.COLD ? "cold" : "warm");
            }
            e(c0Var);
            io.sentry.protocol.v vVarG = c0Var.G();
            n8 n8VarI = c0Var.C().i();
            if (vVarG != null && n8VarI != null && n8VarI.e().contentEquals("ui.load") && (mapM = this.f94147b.m(vVarG)) != null) {
                c0Var.m0().putAll(mapM);
            }
            if (g1VarA != null) {
                g1VarA.close();
            }
            return c0Var;
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }
}
