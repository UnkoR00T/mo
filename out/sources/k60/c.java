package k60;

import c5.h;
import er.l;
import er.p;
import f3.m;
import n3.a3;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.C6457hh;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p3.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lf3/m;", "modifier", "Lkotlin/Function0;", "", "progress", "Ln3/a3;", "strokeCap", "Landroidx/compose/ui/graphics/Color;", "color", "Loq/i0;", "c", "(Lf3/m;Ler/a;IJLm2/r;II)V", "Lc5/h;", "f", "(ILm2/r;I)F", "a", "F", "GAP_SIZE", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f108699a = h.n(-15);

    public static final void c(final m mVar, final er.a<Float> aVar, int i15, long j15, r rVar, final int i16, final int i17) {
        int i18;
        final int iA;
        final long jC;
        r rVar2;
        r rVarH = rVar.h(1491120355);
        if ((i16 & 6) == 0) {
            i18 = (rVarH.W(mVar) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= rVarH.G(aVar) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            if ((i17 & 4) == 0) {
                iA = i15;
                int i19 = rVarH.c(iA) ? 256 : 128;
                i18 |= i19;
            } else {
                iA = i15;
            }
            i18 |= i19;
        } else {
            iA = i15;
        }
        if ((i16 & 3072) == 0) {
            if ((i17 & 8) == 0) {
                jC = j15;
                int i25 = rVarH.d(jC) ? 2048 : 1024;
                i18 |= i25;
            } else {
                jC = j15;
            }
            i18 |= i25;
        } else {
            jC = j15;
        }
        if (rVarH.r((i18 & 1171) != 1170, i18 & 1)) {
            rVarH.I();
            if ((i16 & 1) == 0 || rVarH.Q()) {
                if ((i17 & 4) != 0) {
                    iA = a3.INSTANCE.a();
                    i18 &= -897;
                }
                if ((i17 & 8) != 0) {
                    jC = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().c();
                    i18 &= -7169;
                }
            } else {
                rVarH.O();
                if ((i17 & 4) != 0) {
                    i18 &= -897;
                }
                if ((i17 & 8) != 0) {
                    i18 &= -7169;
                }
            }
            int i26 = iA;
            long j16 = jC;
            rVarH.y();
            if (t.k()) {
                t.o(1491120355, i18, -1, "pl.gov.coi.common.ui.linearprogressindicator.LinearProgressIndicator (LinearProgressIndicator.kt:16)");
            }
            long jG = k70.a.f108864a.a(rVarH, k70.a.f108865b).getNeutral().g();
            float f15 = f(i26, rVarH, (i18 >> 6) & 14);
            Object objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = new l() { // from class: k60.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return c.d((f) obj);
                    }
                };
                rVarH.v(objE);
            }
            l lVar = (l) objE;
            int i27 = i18 >> 3;
            rVar2 = rVarH;
            C6457hh.m(aVar, mVar, j16, jG, i26, f15, lVar, rVar2, (i27 & 896) | (i27 & 14) | 1572864 | ((i18 << 3) & 112) | ((i18 << 6) & 57344), 0);
            if (t.k()) {
                t.n();
            }
            jC = j16;
            iA = i26;
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: k60.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c.e(mVar, aVar, iA, jC, i16, i17, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(f fVar) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(m mVar, er.a aVar, int i15, long j15, int i16, int i17, r rVar, int i18) {
        c(mVar, aVar, i15, j15, rVar, g4.a(i16 | 1), i17);
        return i0.f148189a;
    }

    private static final float f(int i15, r rVar, int i16) {
        float zero;
        if (t.k()) {
            t.o(1698663707, i16, -1, "pl.gov.coi.common.ui.linearprogressindicator.getGapSize (LinearProgressIndicator.kt:30)");
        }
        a3.Companion companion = a3.INSTANCE;
        if (a3.e(i15, companion.a()) || a3.e(i15, companion.c())) {
            rVar.X(328253791);
            zero = k70.a.f108864a.b(rVar, k70.a.f108865b).getZero();
            rVar.R();
        } else if (a3.e(i15, companion.b())) {
            rVar.X(328254691);
            rVar.R();
            zero = f108699a;
        } else {
            rVar.X(328255999);
            zero = k70.a.f108864a.b(rVar, k70.a.f108865b).getZero();
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return zero;
    }
}
