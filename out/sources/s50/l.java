package s50;

import mx.Label;
import n4.f0;
import n4.g0;
import n4.i0;
import p036e4.w0;
import p046f2.em;
import p046f2.hd;
import p046f2.hm;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import w0.q0;
import w0.r1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ls50/a$a;", "data", "Loq/i0;", "h", "(Ls50/a$a;Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    public static final void h(final a.C4550a c4550a, p076m2.r rVar, final int i15) {
        int i16;
        f3.m mVarB;
        p076m2.r rVarH = rVar.h(-840822866);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(c4550a) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-840822866, i16, -1, "pl.gov.coi.common.ui.ds.switchcomponent.SwitchOnly (SwitchOnly.kt:33)");
            }
            f3.c cVarE = f3.c.INSTANCE.e();
            f3.m.Companion companion = f3.m.INSTANCE;
            if (c4550a.getInvisibleToUser()) {
                rVarH.X(-704558682);
                Object objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.l() { // from class: s50.e
                        @Override // er.l
                        public final Object b(Object obj) {
                            return l.i((i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                mVarB = n4.v.d(companion, false, (er.l) objE, 1, null);
                rVarH.R();
            } else if (c4550a.getEnabled()) {
                rVarH.X(-704400799);
                Object objE2 = rVarH.E();
                p076m2.r.Companion companion2 = p076m2.r.INSTANCE;
                if (objE2 == companion2.a()) {
                    objE2 = b1.k.a();
                    rVarH.v(objE2);
                }
                b1.l lVar = (b1.l) objE2;
                f6<Boolean> f6VarA = b1.f.a(lVar, rVarH, 6);
                Label contentDescription = c4550a.getContentDescription();
                f3.m mVarQ = t70.i.Q(t70.i.O(companion, contentDescription != null ? contentDescription.getText() : null, false, null, rVarH, 6, 6), c4550a.getChecked(), c4550a.getAdditionalStateDescription(), rVarH, 0);
                k70.a aVar = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                f3.m mVarA = k3.f.a(t70.s.w(mVarQ, f6VarA, aVar.b(rVarH, i17).getSpacing50(), 0.0f, 4, null), aVar.e(rVarH, i17).getRadius50());
                r1 r1VarE = t70.s.E(0.0f, rVarH, 0, 1);
                int iG = n4.l.INSTANCE.g();
                boolean checked = c4550a.getChecked();
                n4.l lVarJ = n4.l.j(iG);
                boolean z15 = (i16 & 14) == 4;
                Object objE3 = rVarH.E();
                if (z15 || objE3 == companion2.a()) {
                    objE3 = new er.l() { // from class: s50.f
                        @Override // er.l
                        public final Object b(Object obj) {
                            return l.j(c4550a, ((Boolean) obj).booleanValue());
                        }
                    };
                    rVarH.v(objE3);
                }
                mVarB = k1.g.b(mVarA, checked, lVar, r1VarE, false, lVarJ, (er.l) objE3, 8, null);
                rVarH.R();
            } else {
                rVarH.X(-703514602);
                rVarH.R();
                mVarB = companion;
            }
            f3.m mVarU = companion.u(mVarB);
            Object objE4 = rVarH.E();
            p076m2.r.Companion companion3 = p076m2.r.INSTANCE;
            if (objE4 == companion3.a()) {
                objE4 = new er.l() { // from class: s50.g
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l.k((i0) obj);
                    }
                };
                rVarH.v(objE4);
            }
            f3.m mVarD = n4.v.d(mVarU, false, (er.l) objE4, 1, null);
            boolean z16 = (i16 & 14) == 4;
            Object objE5 = rVarH.E();
            if (z16 || objE5 == companion3.a()) {
                objE5 = new er.l() { // from class: s50.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l.l(c4550a, (i0) obj);
                    }
                };
                rVarH.v(objE5);
            }
            f3.m mVarD2 = n4.v.d(mVarD, false, (er.l) objE5, 1, null);
            w0 w0VarI = d1.r.i(cVarE, false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarD2);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarI, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            d1.x xVar = d1.x.f39368a;
            d0.c(hd.e().d(Boolean.FALSE), y2.m.d(-114041228, true, new er.p() { // from class: s50.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.m(c4550a, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: s50.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.o(c4550a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(i0 i0Var) {
        t70.i.A(i0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(a.C4550a c4550a, boolean z15) {
        er.l<Boolean, oq.i0> lVarF = c4550a.f();
        if (lVarF != null) {
            lVarF.b(Boolean.valueOf(!c4550a.getChecked()));
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(i0 i0Var) {
        g0.a(i0Var, true);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0031  */
    public static final oq.i0 l(a.C4550a c4550a, i0 i0Var) {
        String string;
        String testTag = c4550a.getTestTag();
        if (testTag == null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("switch");
            if (c4550a.getTestIndexTag() != null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append('_');
                sb6.append(c4550a.getTestIndexTag().intValue());
                string = sb6.toString();
                if (string == null) {
                    string = "";
                }
            } else {
                string = "";
            }
            sb5.append(string);
            testTag = sb5.toString();
        }
        f0.y0(i0Var, testTag);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(a.C4550a c4550a, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-114041228, i15, -1, "pl.gov.coi.common.ui.ds.switchcomponent.SwitchOnly.<anonymous>.<anonymous> (SwitchOnly.kt:72)");
            }
            f3.m mVarC = q0.c(f3.m.INSTANCE, false, null, 2, null);
            Object objE = rVar.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: s50.k
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l.n((i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarD = n4.v.d(mVarC, false, (er.l) objE, 1, null);
            boolean checked = c4550a.getChecked();
            boolean enabled = c4550a.getEnabled();
            em emVar = em.f55799a;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            hm.c(checked, null, mVarD, null, enabled, emVar.b(aVar.a(rVar, i16).getNeutral().c(), aVar.a(rVar, i16).getBase().getPrimary(), 0L, 0L, aVar.a(rVar, i16).getNeutral().a(), aVar.a(rVar, i16).getNeutral().e(), aVar.a(rVar, i16).getNeutral().a(), 0L, aVar.a(rVar, i16).getNeutral().c(), aVar.a(rVar, i16).getNeutral().e(), 0L, 0L, aVar.a(rVar, i16).getNeutral().k(), aVar.a(rVar, i16).getNeutral().e(), aVar.a(rVar, i16).getNeutral().g(), 0L, rVar, 0, em.f55801c << 18, 35980), null, rVar, 48, 72);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(i0 i0Var) {
        t70.i.A(i0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(a.C4550a c4550a, int i15, p076m2.r rVar, int i16) {
        h(c4550a, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
