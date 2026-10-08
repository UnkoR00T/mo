package d30;

import c5.h;
import d1.a3;
import d1.o2;
import d1.x;
import er.l;
import er.p;
import er.q;
import f3.j;
import f3.m;
import n4.v;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t70.s;
import w0.i;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"CONTENT_DATA", "Ld30/a;", "data", "Lkotlin/Function1;", "Loq/i0;", "content", "c", "(Ld30/a;Ler/q;Lm2/r;II)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:48:0x0119  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:54:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:59:0x0261  */
    /* JADX WARN: Code duplicated, block: B:60:0x0265  */
    /* JADX WARN: Code duplicated, block: B:63:0x0271  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public static final <CONTENT_DATA> void c(final BadgeData<CONTENT_DATA> badgeData, q<? super CONTENT_DATA, ? super r, ? super Integer, i0> qVar, r rVar, final int i15, final int i16) {
        int i17;
        q qVar2;
        boolean z15;
        r rVar2;
        final q qVar3;
        d5 d5VarM;
        q qVarC;
        er.a<androidx.compose.ui.node.c> aVarB;
        Object objE;
        er.a<androidx.compose.ui.node.c> aVarB2;
        r rVarH = rVar.h(-214168521);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(badgeData) : rVarH.G(badgeData) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 == 0) {
            if ((i15 & 48) == 0) {
                qVar2 = qVar;
                i17 |= rVarH.G(qVar2) ? 32 : 16;
            }
            if ((i17 & 19) != 18) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i18 != 0) {
                    qVarC = g.f39539a.c();
                } else {
                    qVarC = qVar2;
                }
                if (t.k()) {
                    t.o(-214168521, i17, -1, "pl.gov.coi.common.ui.ds.badge.Badge (Badge.kt:35)");
                }
                if (badgeData.getValue() == 0) {
                    rVarH.X(2027131596);
                    qVarC.w(badgeData.a(), rVarH, Integer.valueOf(i17 & 112));
                    rVarH.R();
                    rVar2 = rVarH;
                    qVar3 = qVarC;
                } else {
                    rVarH.X(2027200137);
                    m.Companion companion = m.INSTANCE;
                    m mVarE = androidx.compose.foundation.layout.d.E(companion, null, false, 3, null);
                    f3.c.Companion companion2 = f3.c.INSTANCE;
                    w0 w0VarI = d1.r.i(companion2.n(), false);
                    int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT = rVarH.t();
                    m mVarE2 = j.e(rVarH, mVarE);
                    androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
                    aVarB = companion3.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB);
                    } else {
                        rVarH.u();
                    }
                    r rVarC = n6.c(rVarH);
                    n6.i(rVarC, w0VarI, companion3.d());
                    n6.i(rVarC, e0VarT, companion3.f());
                    n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
                    n6.g(rVarC, companion3.a());
                    n6.i(rVarC, mVarE2, companion3.e());
                    x xVar = x.f39368a;
                    qVarC.w(badgeData.a(), rVarH, Integer.valueOf(i17 & 112));
                    objE = rVarH.E();
                    if (objE == r.INSTANCE.a()) {
                        objE = new l() { // from class: d30.b
                            @Override // er.l
                            public final Object b(Object obj) {
                                return d.d((n4.i0) obj);
                            }
                        };
                        rVarH.v(objE);
                    }
                    m mVarD = xVar.d(v.d(companion, false, (l) objE, 1, null), companion2.n());
                    k70.a aVar = k70.a.f108864a;
                    int i19 = k70.a.f108865b;
                    m mVarO = a3.o(i.d(k3.f.a(androidx.compose.foundation.layout.d.a(o2.e(mVarD, aVar.b(rVarH, i19).getSpacing150(), h.n(-aVar.b(rVarH, i19).getSpacing100())), aVar.b(rVarH, i19).getSpacing250(), aVar.b(rVarH, i19).getSpacing250()), aVar.e(rVarH, i19).getRadius150()), aVar.a(rVarH, i19).getSupport().g(), null, 2, null), aVar.b(rVarH, i19).getSpacing50(), aVar.b(rVarH, i19).getSpacing25());
                    w0 w0VarI2 = d1.r.i(companion2.e(), false);
                    int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    e0 e0VarT2 = rVarH.t();
                    m mVarE3 = j.e(rVarH, mVarO);
                    aVarB2 = companion3.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB2);
                    } else {
                        rVarH.u();
                    }
                    r rVarC2 = n6.c(rVarH);
                    n6.i(rVarC2, w0VarI2, companion3.d());
                    n6.i(rVarC2, e0VarT2, companion3.f());
                    n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                    n6.g(rVarC2, companion3.a());
                    n6.i(rVarC2, mVarE3, companion3.e());
                    rVar2 = rVarH;
                    qVar3 = qVarC;
                    j70.h.g(null, null, mx.b.b(badgeData.b(), "BagdeCounter"), null, null, aVar.a(rVarH, i19).getSupport().h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, s.L(aVar.f(rVarH, i19).f(), rVarH, 0), null, null, false, true, null, rVar2, 0, 0, 3072, 24641499);
                    rVar2.x();
                    rVar2.x();
                    rVar2.R();
                }
                if (t.k()) {
                    t.n();
                }
            } else {
                rVar2 = rVarH;
                rVar2.O();
                qVar3 = qVar2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: d30.c
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return d.e(badgeData, qVar3, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        qVar2 = qVar;
        if ((i17 & 19) != 18) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i18 != 0) {
                qVarC = g.f39539a.c();
            } else {
                qVarC = qVar2;
            }
            if (t.k()) {
                t.o(-214168521, i17, -1, "pl.gov.coi.common.ui.ds.badge.Badge (Badge.kt:35)");
            }
            if (badgeData.getValue() == 0) {
                rVarH.X(2027131596);
                qVarC.w(badgeData.a(), rVarH, Integer.valueOf(i17 & 112));
                rVarH.R();
                rVar2 = rVarH;
                qVar3 = qVarC;
            } else {
                rVarH.X(2027200137);
                m.Companion companion4 = m.INSTANCE;
                m mVarE4 = androidx.compose.foundation.layout.d.E(companion4, null, false, 3, null);
                f3.c.Companion companion5 = f3.c.INSTANCE;
                w0 w0VarI3 = d1.r.i(companion5.n(), false);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT3 = rVarH.t();
                m mVarE5 = j.e(rVarH, mVarE4);
                androidx.compose.ui.node.c.Companion companion6 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion6.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC3 = n6.c(rVarH);
                n6.i(rVarC3, w0VarI3, companion6.d());
                n6.i(rVarC3, e0VarT3, companion6.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion6.c());
                n6.g(rVarC3, companion6.a());
                n6.i(rVarC3, mVarE5, companion6.e());
                x xVar2 = x.f39368a;
                qVarC.w(badgeData.a(), rVarH, Integer.valueOf(i17 & 112));
                objE = rVarH.E();
                if (objE == r.INSTANCE.a()) {
                    objE = new l() { // from class: d30.b
                        @Override // er.l
                        public final Object b(Object obj) {
                            return d.d((n4.i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                m mVarD2 = xVar2.d(v.d(companion4, false, (l) objE, 1, null), companion5.n());
                k70.a aVar2 = k70.a.f108864a;
                int i110 = k70.a.f108865b;
                m mVarO2 = a3.o(i.d(k3.f.a(androidx.compose.foundation.layout.d.a(o2.e(mVarD2, aVar2.b(rVarH, i110).getSpacing150(), h.n(-aVar2.b(rVarH, i110).getSpacing100())), aVar2.b(rVarH, i110).getSpacing250(), aVar2.b(rVarH, i110).getSpacing250()), aVar2.e(rVarH, i110).getRadius150()), aVar2.a(rVarH, i110).getSupport().g(), null, 2, null), aVar2.b(rVarH, i110).getSpacing50(), aVar2.b(rVarH, i110).getSpacing25());
                w0 w0VarI4 = d1.r.i(companion5.e(), false);
                int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT4 = rVarH.t();
                m mVarE6 = j.e(rVarH, mVarO2);
                aVarB2 = companion6.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB2);
                } else {
                    rVarH.u();
                }
                r rVarC4 = n6.c(rVarH);
                n6.i(rVarC4, w0VarI4, companion6.d());
                n6.i(rVarC4, e0VarT4, companion6.f());
                n6.i(rVarC4, Integer.valueOf(iHashCode4), companion6.c());
                n6.g(rVarC4, companion6.a());
                n6.i(rVarC4, mVarE6, companion6.e());
                rVar2 = rVarH;
                qVar3 = qVarC;
                j70.h.g(null, null, mx.b.b(badgeData.b(), "BagdeCounter"), null, null, aVar2.a(rVarH, i110).getSupport().h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, s.L(aVar2.f(rVarH, i110).f(), rVarH, 0), null, null, false, true, null, rVar2, 0, 0, 3072, 24641499);
                rVar2.x();
                rVar2.x();
                rVar2.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
            qVar3 = qVar2;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: d30.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.e(badgeData, qVar3, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(BadgeData badgeData, q qVar, int i15, int i16, r rVar, int i17) {
        c(badgeData, qVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
