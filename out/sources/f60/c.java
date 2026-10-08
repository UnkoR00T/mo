package f60;

import androidx.compose.foundation.layout.d;
import d1.i;
import d1.m3;
import d1.q3;
import er.l;
import er.p;
import f3.j;
import f3.m;
import j70.h;
import mx.Label;
import n4.f0;
import n4.v;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmx/a;", AnnotatedPrivateKey.LABEL, "Lkotlin/Function0;", "Loq/i0;", "buttonSmall", "c", "(Lmx/a;Ler/p;Lm2/r;II)V", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:51:0x0171  */
    /* JADX WARN: Code duplicated, block: B:53:0x017b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0192  */
    /* JADX WARN: Code duplicated, block: B:57:0x0196  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    public static final void c(final Label label, p<? super r, ? super Integer, i0> pVar, r rVar, final int i15, final int i16) {
        int i17;
        p<? super r, ? super Integer, i0> pVar2;
        boolean z15;
        r rVar2;
        final p<? super r, ? super Integer, i0> pVar3;
        d5 d5VarM;
        er.a<androidx.compose.ui.node.c> aVarB;
        boolean z16;
        Object objE;
        r rVarH = rVar.h(853134401);
        if ((i15 & 6) == 0) {
            i17 = i15 | (rVarH.W(label) ? 4 : 2);
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 == 0) {
            if ((i15 & 48) == 0) {
                pVar2 = pVar;
                i17 |= rVarH.G(pVar2) ? 32 : 16;
            }
            if ((i17 & 19) != 18) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i18 != 0) {
                    pVar2 = null;
                }
                if (t.k()) {
                    t.o(853134401, i17, -1, "pl.gov.coi.common.ui.heading.Heading (Heading.kt:26)");
                }
                m.Companion companion = m.INSTANCE;
                m mVarH = d.h(companion, 0.0f, 1, null);
                w0 w0VarB = m3.b(i.f39152a.h(), f3.c.INSTANCE.i(), rVarH, 54);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT = rVarH.t();
                m mVarE = j.e(rVarH, mVarH);
                androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion2.b();
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
                n6.i(rVarC, w0VarB, companion2.d());
                n6.i(rVarC, e0VarT, companion2.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                n6.g(rVarC, companion2.a());
                n6.i(rVarC, mVarE, companion2.e());
                q3 q3Var = q3.f39261a;
                if ((i17 & 14) == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objE = rVarH.E();
                if (z16 || objE == r.INSTANCE.a()) {
                    objE = new l() { // from class: f60.a
                        @Override // er.l
                        public final Object b(Object obj) {
                            return c.d(label, (n4.i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                m mVarD = v.d(companion, false, (l) objE, 1, null);
                k70.a aVar = k70.a.f108864a;
                int i19 = k70.a.f108865b;
                h.g(mVarD, null, label, null, null, aVar.a(rVarH, i19).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, b5.v.INSTANCE.b(), false, 1, 0, null, aVar.f(rVarH, i19).j(), null, null, false, false, null, rVarH, (i17 << 6) & 896, 1597440, 0, 32948186);
                rVar2 = rVarH;
                pVar3 = pVar2;
                if (pVar3 == null) {
                    rVar2.X(-374050384);
                } else {
                    rVar2.X(-374050383);
                    pVar3.B(rVar2, 0);
                }
                rVar2.R();
                rVar2.x();
                if (t.k()) {
                    t.n();
                }
            } else {
                rVar2 = rVarH;
                rVar2.O();
                pVar3 = pVar2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: f60.b
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return c.e(label, pVar3, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        pVar2 = pVar;
        if ((i17 & 19) != 18) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i18 != 0) {
                pVar2 = null;
            }
            if (t.k()) {
                t.o(853134401, i17, -1, "pl.gov.coi.common.ui.heading.Heading (Heading.kt:26)");
            }
            m.Companion companion3 = m.INSTANCE;
            m mVarH2 = d.h(companion3, 0.0f, 1, null);
            w0 w0VarB2 = m3.b(i.f39152a.h(), f3.c.INSTANCE.i(), rVarH, 54);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarH2);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarB2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            q3 q3Var2 = q3.f39261a;
            if ((i17 & 14) == 4) {
                z16 = true;
            } else {
                z16 = false;
            }
            objE = rVarH.E();
            if (z16) {
                objE = new l() { // from class: f60.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return c.d(label, (n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            } else {
                objE = new l() { // from class: f60.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return c.d(label, (n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            m mVarD2 = v.d(companion3, false, (l) objE, 1, null);
            k70.a aVar2 = k70.a.f108864a;
            int i110 = k70.a.f108865b;
            h.g(mVarD2, null, label, null, null, aVar2.a(rVarH, i110).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, b5.v.INSTANCE.b(), false, 1, 0, null, aVar2.f(rVarH, i110).j(), null, null, false, false, null, rVarH, (i17 << 6) & 896, 1597440, 0, 32948186);
            rVar2 = rVarH;
            pVar3 = pVar2;
            if (pVar3 == null) {
                rVar2.X(-374050384);
            } else {
                rVar2.X(-374050383);
                pVar3.B(rVar2, 0);
            }
            rVar2.R();
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
            pVar3 = pVar2;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f60.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c.e(label, pVar3, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(Label label, n4.i0 i0Var) {
        f0.c0(i0Var, label.getText());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(Label label, p pVar, int i15, int i16, r rVar, int i17) {
        c(label, pVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
