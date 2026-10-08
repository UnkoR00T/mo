package y50;

import b5.v;
import d1.m3;
import d1.p3;
import d1.q3;
import er.l;
import er.p;
import er.q;
import f3.j;
import j70.h;
import mx.Label;
import n4.f0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.Function0;
import p046f2.rr;
import p046f2.ur;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import x50.i;
import y2.m;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lx50/i$a;", "data", "Lf2/ur;", "scrollBehavior", "Loq/i0;", "f", "(Lx50/i$a;Lf2/ur;Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    public static final void f(final i.Large large, final ur urVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1222957988);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(large) : rVarH.G(large) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(urVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(1222957988, i16, -1, "pl.gov.coi.common.ui.ds.topappbar.large.LargeTopAppBar (LargeTopAppBar.kt:27)");
            }
            Function0.q(m.d(-256958389, true, new p() { // from class: y50.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.g(urVar, large, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, m.d(-797387895, true, new p() { // from class: y50.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.i(large, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), m.d(-1802231168, true, new q() { // from class: y50.c
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return f.j(large, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), 0.0f, 0.0f, null, rr.f57664a.s(large.b().B(rVarH, 0).m20unboximpl(), large.b().B(rVarH, 0).m20unboximpl(), 0L, 0L, 0L, 0L, rVarH, rr.f57675l << 18, 60), urVar, rVarH, ((i16 << 21) & 234881024) | 3462, 114);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: y50.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.k(large, urVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(ur urVar, final i.Large large, r rVar, int i15) {
        int i16;
        r rVar2 = rVar;
        if (rVar2.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-256958389, i15, -1, "pl.gov.coi.common.ui.ds.topappbar.large.LargeTopAppBar.<anonymous> (LargeTopAppBar.kt:34)");
            }
            if (urVar.getState().g() < 0.35d) {
                rVar2.X(-1415566237);
                Label title = large.getTitle();
                k70.a aVar = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                i16 = -1417008233;
                h.g(null, null, title, null, null, aVar.a(rVar2, i17).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, v.INSTANCE.b(), false, 2, 0, null, aVar.f(rVar2, i17).g(), null, null, false, false, large.getAccessibilityReadMode(), rVar, 0, 1597440, MLKEMEngine.KyberPolyBytes, 11976667);
                rVar2 = rVar;
            } else {
                i16 = -1417008233;
                rVar2.X(-1417008233);
            }
            rVar2.R();
            if (urVar.getState().g() > 0.75d) {
                rVar2.X(-1415156200);
                f3.m.Companion companion = f3.m.INSTANCE;
                f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
                w0 w0VarB = m3.b(d1.i.f39152a.e(), f3.c.INSTANCE.l(), rVar2, 6);
                int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
                e0 e0VarT = rVar2.t();
                f3.m mVarE = j.e(rVar2, mVarH);
                androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
                if (rVar2.l() == null) {
                    p076m2.m.d();
                }
                rVar2.K();
                if (rVar2.getInserting()) {
                    rVar2.H(aVarB);
                } else {
                    rVar2.u();
                }
                r rVarC = n6.c(rVar2);
                n6.i(rVarC, w0VarB, companion2.d());
                n6.i(rVarC, e0VarT, companion2.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                n6.g(rVarC, companion2.a());
                n6.i(rVarC, mVarE, companion2.e());
                q3 q3Var = q3.f39261a;
                boolean zG = rVar2.G(large);
                Object objE = rVar2.E();
                if (zG || objE == r.INSTANCE.a()) {
                    objE = new l() { // from class: y50.e
                        @Override // er.l
                        public final Object b(Object obj) {
                            return f.h(large, (n4.i0) obj);
                        }
                    };
                    rVar2.v(objE);
                }
                f3.m mVarD = n4.v.d(companion, false, (l) objE, 1, null);
                Label title2 = large.getTitle();
                k70.a aVar2 = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                h.g(mVarD, null, title2, null, null, aVar2.a(rVar2, i18).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, v.INSTANCE.b(), false, 1, 0, null, aVar2.f(rVar2, i18).j(), null, null, false, false, large.getAccessibilityReadMode(), rVar, 0, 1597440, 0, 16170970);
                rVar2 = rVar;
                rVar2.x();
            } else {
                rVar2.X(i16);
            }
            rVar2.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(i.Large large, n4.i0 i0Var) {
        f0.n0(i0Var, large.getTitle().getText());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(i.Large large, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-797387895, i15, -1, "pl.gov.coi.common.ui.ds.topappbar.large.LargeTopAppBar.<anonymous> (LargeTopAppBar.kt:64)");
            }
            x50.h.h(large.getNavigationButtonData(), null, null, null, rVar, 0, 7);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(i.Large large, p3 p3Var, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(-1802231168, i15, -1, "pl.gov.coi.common.ui.ds.topappbar.large.LargeTopAppBar.<anonymous> (LargeTopAppBar.kt:66)");
            }
            x50.h.f(large.getMenuType(), null, null, null, rVar, 0, 7);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(i.Large large, ur urVar, int i15, r rVar, int i16) {
        f(large, urVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
