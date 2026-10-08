package g40;

import d1.a3;
import d1.h0;
import d1.x;
import h30.ButtonData;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.C6456g5;
import p046f2.w4;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aI\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lf2/w4;", "colors", "", "isSaveEnabled", "Lkotlin/Function0;", "Loq/i0;", "onDismiss", "onSave", "content", "e", "(Lf2/w4;ZLer/a;Ler/a;Ler/p;Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class o {
    public static final void e(final w4 w4Var, final boolean z15, final er.a<i0> aVar, final er.a<i0> aVar2, final er.p<? super p076m2.r, ? super Integer, i0> pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(482171544);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(w4Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.a(z15) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(aVar2) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= rVarH.G(pVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (rVarH.r((i16 & 9363) != 9362, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(482171544, i16, -1, "pl.gov.coi.common.ui.ds.datepicker.DatePickerDialog (DatePickerDialog.kt:27)");
            }
            final float fN = c5.h.n(6);
            f3.m mVarS = t70.i.S(f3.m.INSTANCE, null, rVarH, 6, 1);
            k70.a aVar3 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            C6456g5.f(aVar, y2.m.d(1829070918, true, new er.p() { // from class: g40.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.f(fN, z15, aVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), a3.p(mVarS, 0.0f, aVar3.b(rVarH, i17).getSpacing600(), 1, null), y2.m.d(-136915836, true, new er.p() { // from class: g40.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.g(aVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), aVar3.e(rVarH, i17).getRadius200(), 0.0f, w4Var, null, y2.m.d(-218475121, true, new er.q() { // from class: g40.m
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return o.h(pVar, (h0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, ((i16 >> 6) & 14) | 100666416 | ((i16 << 18) & 3670016), 160);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: g40.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o.i(w4Var, z15, aVar, aVar2, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(float f15, boolean z15, er.a aVar, p076m2.r rVar, int i15) {
        k30.b bVar;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1829070918, i15, -1, "pl.gov.coi.common.ui.ds.datepicker.DatePickerDialog.<anonymous> (DatePickerDialog.kt:38)");
            }
            f3.m mVarR = a3.r(f3.m.INSTANCE, 0.0f, 0.0f, f15, 0.0f, 11, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            x xVar = x.f39368a;
            k30.a.b bVar2 = k30.a.b.f107765a;
            k30.c.WithText withText = new k30.c.WithText(c70.a.f23835a.a().q(), null, 2, null);
            k30.d.c cVar = k30.d.c.f107775a;
            if (z15) {
                bVar = k30.b.c.f107768a;
            } else {
                if (z15) {
                    throw new oq.p();
                }
                bVar = k30.b.C2562b.f107767a;
            }
            h30.q.p(new ButtonData(null, null, bVar2, withText, cVar, bVar, aVar, 3, null), false, null, rVar, 0, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(er.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-136915836, i15, -1, "pl.gov.coi.common.ui.ds.datepicker.DatePickerDialog.<anonymous> (DatePickerDialog.kt:59)");
            }
            h30.q.p(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(c70.a.f23835a.a().c0(), null, 2, null), k30.d.c.f107775a, null, aVar, 35, null), false, null, rVar, 0, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(er.p pVar, h0 h0Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-218475121, i15, -1, "pl.gov.coi.common.ui.ds.datepicker.DatePickerDialog.<anonymous> (DatePickerDialog.kt:70)");
            }
            pVar.B(rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(w4 w4Var, boolean z15, er.a aVar, er.a aVar2, er.p pVar, int i15, p076m2.r rVar, int i16) {
        e(w4Var, z15, aVar, aVar2, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
