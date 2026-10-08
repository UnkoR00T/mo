package ph;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c3.SnapshotStateList;
import nb.WindowSizeClass;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p076m2.Function0;
import p076m2.d5;
import p076m2.g4;
import p076m2.x5;
import p7.CreationExtras;

/* JADX INFO: loaded from: classes3.dex */
public final class o {
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v40 */
    public static final void a(e0 e0Var, final String str, final boolean z15, p076m2.r rVar, final int i15, int i16) {
        final String str2;
        final e0 e0Var2;
        int i17;
        ?? r15;
        e0 e0Var3;
        int i18 = i15 & 6;
        p076m2.r rVarH = rVar.h(1574643533);
        int i19 = i18 == 0 ? i15 | 2 : i15;
        if ((i15 & 48) == 0) {
            str2 = str;
            i19 |= true != rVarH.W(str2) ? 16 : 32;
        } else {
            str2 = str;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i19 |= true != rVarH.a(z15) ? 128 : 256;
        }
        if (rVarH.r((i19 & 147) != 146, i19 & 1)) {
            rVarH.I();
            if ((i15 & 1) == 0 || rVarH.Q()) {
                androidx.p016lifecycle.y0 y0VarC = q7.b.f165175a.c(rVarH, 6);
                if (y0VarC == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                i17 = i19 & (-15);
                r15 = 0;
                e0Var3 = (e0) q7.d.c(fr.q0.c(e0.class), y0VarC, null, null, y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVarH, 0, 0);
            } else {
                i17 = i19 & (-15);
                rVarH.O();
                e0Var3 = e0Var;
                r15 = 0;
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(1574643533, i17, -1, "com.google.android.gms.oss.licenses.v2.OssLicensesNavGraph (OssLicensesNavGraph.kt:44)");
            }
            Activity activity = null;
            if (z15) {
                rVarH.X(572838453);
                boolean zG = rVarH.G(e0Var3);
                Object objE = rVarH.E();
                if (zG || objE == p076m2.r.INSTANCE.a()) {
                    objE = new e(e0Var3, null);
                    rVarH.v(objE);
                }
                Function0.d(e0Var3, (er.p) objE, rVarH, r15);
            } else {
                rVarH.X(571569685);
            }
            rVarH.R();
            Object objE2 = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE2 == companion.a()) {
                ea.q[] qVarArr = new ea.q[1];
                qVarArr[r15] = q0.f157606a;
                objE2 = x5.g(qVarArr);
                rVarH.v(objE2);
            }
            final SnapshotStateList snapshotStateList = (SnapshotStateList) objE2;
            if (p076m2.t.k()) {
                p076m2.t.o(1031713680, r15, -1, "com.google.android.gms.oss.licenses.v2.rememberListDetailSceneStrategy (ListDetailSceneStrategy.kt:50)");
            }
            WindowSizeClass windowSizeClass = g2.h.a(r15, rVarH, r15, 1).getWindowSizeClass();
            boolean zW = rVarH.W(windowSizeClass);
            Object objE3 = rVarH.E();
            if (zW || objE3 == companion.a()) {
                objE3 = new c(windowSizeClass);
                rVarH.v(objE3);
            }
            c cVar = (c) objE3;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            for (Context baseContext = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c()); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
                if (baseContext instanceof Activity) {
                    activity = (Activity) baseContext;
                    break;
                }
            }
            Object objE4 = rVarH.E();
            if (objE4 == p076m2.r.INSTANCE.a()) {
                objE4 = new er.a() { // from class: ph.n
                    @Override // er.a
                    public final /* synthetic */ Object a() {
                        return o.d(snapshotStateList);
                    }
                };
                rVarH.v(objE4);
            }
            rVarH.X(1403965950);
            ea.j jVar = new ea.j(d.f157553a);
            final Activity activity2 = activity;
            e0Var2 = e0Var3;
            jVar.b(fr.q0.c(q0.class), f.f157559a, b.b(), y2.m.d(2057248279, true, new er.q() { // from class: ph.h
                @Override // er.q
                public final /* synthetic */ Object w(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    p076m2.r rVar2 = (p076m2.r) obj2;
                    if (rVar2.r((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (p076m2.t.k()) {
                            p076m2.t.o(2057248279, iIntValue, -1, "com.google.android.gms.oss.licenses.v2.OssLicensesNavGraph.<anonymous>.<anonymous> (OssLicensesNavGraph.kt:59)");
                        }
                        final Activity activity3 = activity2;
                        boolean zG2 = rVar2.G(activity3);
                        Object objE5 = rVar2.E();
                        if (zG2 || objE5 == p076m2.r.INSTANCE.a()) {
                            objE5 = new er.a() { // from class: ph.k
                                @Override // er.a
                                public final /* synthetic */ Object a() {
                                    Activity activity4 = activity3;
                                    if (activity4 != null) {
                                        activity4.finish();
                                    }
                                    return oq.i0.f148189a;
                                }
                            };
                            rVar2.v(objE5);
                        }
                        er.a aVar = (er.a) objE5;
                        Object objE6 = rVar2.E();
                        if (objE6 == p076m2.r.INSTANCE.a()) {
                            final SnapshotStateList snapshotStateList2 = snapshotStateList;
                            er.l lVar = new er.l() { // from class: ph.l
                                @Override // er.l
                                public final /* synthetic */ Object b(Object obj4) {
                                    snapshotStateList2.add(new h0(((Integer) obj4).intValue()));
                                    return oq.i0.f148189a;
                                }
                            };
                            rVar2.v(lVar);
                            objE6 = lVar;
                        }
                        a1.a(e0Var2, str2, aVar, (er.l) objE6, z15, rVar2, 3072, 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                    } else {
                        rVar2.O();
                    }
                    return oq.i0.f148189a;
                }
            }, rVarH, 54));
            jVar.b(fr.q0.c(h0.class), g.f157561a, b.a(), y2.m.d(613731955, true, new er.q() { // from class: ph.i
                @Override // er.q
                public final /* synthetic */ Object w(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    p076m2.r rVar2 = (p076m2.r) obj2;
                    h0 h0Var = (h0) obj;
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= true != rVar2.W(h0Var) ? 2 : 4;
                    }
                    if (rVar2.r((iIntValue & 19) != 18, iIntValue & 1)) {
                        if (p076m2.t.k()) {
                            p076m2.t.o(613731955, iIntValue, -1, "com.google.android.gms.oss.licenses.v2.OssLicensesNavGraph.<anonymous>.<anonymous> (OssLicensesNavGraph.kt:70)");
                        }
                        int iA = h0Var.a();
                        Object objE5 = rVar2.E();
                        if (objE5 == p076m2.r.INSTANCE.a()) {
                            final SnapshotStateList snapshotStateList2 = snapshotStateList;
                            er.a aVar = new er.a() { // from class: ph.m
                                @Override // er.a
                                public final /* synthetic */ Object a() {
                                    return o.e(snapshotStateList2);
                                }
                            };
                            rVar2.v(aVar);
                            objE5 = aVar;
                        }
                        p0.a(iA, e0Var2, (er.a) objE5, rVar2, MLKEMEngine.KyberPolyBytes, 0);
                        if (p076m2.t.k()) {
                            p076m2.t.n();
                        }
                    } else {
                        rVar2.O();
                    }
                    return oq.i0.f148189a;
                }
            }, rVarH, 54));
            oq.i0 i0Var = oq.i0.f148189a;
            er.l lVarC = jVar.c();
            rVarH.R();
            ga.c.b(snapshotStateList, null, null, (er.a) objE4, null, cVar, null, null, null, null, null, lVarC, rVarH, 3078, 0, 2006);
            rVarH = rVarH;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
            e0Var2 = e0Var;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            final int i25 = 1;
            d5VarM.a(new er.p(str, z15, i15, i25) { // from class: ph.j

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final /* synthetic */ String f157578b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final /* synthetic */ boolean f157579c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private final /* synthetic */ int f157580d;

                @Override // er.p
                public final /* synthetic */ Object B(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o.a(this.f157577a, this.f157578b, this.f157579c, (p076m2.r) obj, g4.a(this.f157580d | 1), 1);
                    return oq.i0.f148189a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d(SnapshotStateList snapshotStateList) {
        pq.v.N(snapshotStateList);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(SnapshotStateList snapshotStateList) {
        pq.v.N(snapshotStateList);
        return oq.i0.f148189a;
    }
}
