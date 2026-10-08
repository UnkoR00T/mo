package x30;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.x;
import er.l;
import er.p;
import f3.j;
import f3.m;
import k3.f;
import n4.v;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import w0.i;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf3/m;", "modifier", "", "alpha", "Lkotlin/Function0;", "Loq/i0;", "content", "c", "(Lf3/m;FLer/p;Lm2/r;II)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x010a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0116  */
    /* JADX WARN: Code duplicated, block: B:55:0x011a  */
    /* JADX WARN: Code duplicated, block: B:58:0x015e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0162  */
    /* JADX WARN: Code duplicated, block: B:62:0x016d  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public static final void c(m mVar, float f15, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15, final int i16) {
        m mVar2;
        int i17;
        float f16;
        boolean z15;
        m mVar3;
        float f17;
        d5 d5VarM;
        Object objE;
        er.a<androidx.compose.ui.node.c> aVarB;
        int i18;
        r rVarH = rVar.h(-632325189);
        int i19 = i16 & 1;
        if (i19 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        int i25 = i16 & 2;
        if (i25 == 0) {
            if ((i15 & 48) == 0) {
                f16 = f15;
                i17 |= rVarH.b(f16) ? 32 : 16;
            }
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                if (rVarH.G(pVar)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i17 |= i18;
            }
            if ((i17 & 147) != 146) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i19 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (i25 != 0) {
                    f17 = 1.0f;
                } else {
                    f17 = f16;
                }
                if (t.k()) {
                    t.o(-632325189, i17, -1, "pl.gov.coi.common.ui.ds.contentbox.ContentBox (ContentBox.kt:24)");
                }
                objE = rVarH.E();
                if (objE == r.INSTANCE.a()) {
                    objE = new l() { // from class: x30.a
                        @Override // er.l
                        public final Object b(Object obj) {
                            return c.d((n4.i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                m mVarH = d.h(v.d(mVar3, false, (l) objE, 1, null), 0.0f, 1, null);
                k70.a aVar = k70.a.f108864a;
                int i26 = k70.a.f108865b;
                m mVarN = a3.n(i.d(f.a(mVarH, aVar.e(rVarH, i26).getRadius200()), Color.m9copywmQWz5c$default(aVar.a(rVarH, i26).getSurface().a(), f17, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), aVar.b(rVarH, i26).getSpacing200());
                w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT = rVarH.t();
                m mVarE = j.e(rVarH, mVarN);
                androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion.b();
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
                n6.i(rVarC, w0VarI, companion.d());
                n6.i(rVarC, e0VarT, companion.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
                n6.g(rVarC, companion.a());
                n6.i(rVarC, mVarE, companion.e());
                x xVar = x.f39368a;
                pVar.B(rVarH, Integer.valueOf((i17 >> 6) & 14));
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
            } else {
                rVarH.O();
                mVar3 = mVar2;
                f17 = f16;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final m mVar4 = mVar3;
                final float f18 = f17;
                d5VarM.a(new p() { // from class: x30.b
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return c.e(mVar4, f18, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        f16 = f15;
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            if (rVarH.G(pVar)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i17 |= i18;
        }
        if ((i17 & 147) != 146) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i19 != 0) {
                mVar3 = m.INSTANCE;
            } else {
                mVar3 = mVar2;
            }
            if (i25 != 0) {
                f17 = 1.0f;
            } else {
                f17 = f16;
            }
            if (t.k()) {
                t.o(-632325189, i17, -1, "pl.gov.coi.common.ui.ds.contentbox.ContentBox (ContentBox.kt:24)");
            }
            objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = new l() { // from class: x30.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return c.d((n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            m mVarH2 = d.h(v.d(mVar3, false, (l) objE, 1, null), 0.0f, 1, null);
            k70.a aVar2 = k70.a.f108864a;
            int i27 = k70.a.f108865b;
            m mVarN2 = a3.n(i.d(f.a(mVarH2, aVar2.e(rVarH, i27).getRadius200()), Color.m9copywmQWz5c$default(aVar2.a(rVarH, i27).getSurface().a(), f17, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), aVar2.b(rVarH, i27).getSpacing200());
            w0 w0VarI2 = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarN2);
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
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarI2, companion2.d());
            n6.i(rVarC2, e0VarT2, companion2.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
            n6.g(rVarC2, companion2.a());
            n6.i(rVarC2, mVarE2, companion2.e());
            x xVar2 = x.f39368a;
            pVar.B(rVarH, Integer.valueOf((i17 >> 6) & 14));
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
            mVar3 = mVar2;
            f17 = f16;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            final m mVar5 = mVar3;
            final float f19 = f17;
            d5VarM.a(new p() { // from class: x30.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c.e(mVar5, f19, pVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
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
    public static final i0 e(m mVar, float f15, p pVar, int i15, int i16, r rVar, int i17) {
        c(mVar, f15, pVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
