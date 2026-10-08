package p077m74;

import androidx.compose.foundation.layout.d;
import c5.w;
import d1.e0;
import d1.i;
import d1.i0;
import d1.r3;
import er.a;
import f3.c;
import f3.j;
import f3.m;
import gu.b;
import j70.h;
import java.util.Arrays;
import mx.Label;
import n3.o1;
import oq.p;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf3/m;", "modifier", "Lm74/h0;", "timerData", "Loq/i0;", "c", "(Lf3/m;Lm74/h0;Lm2/r;II)V", "applicationlock_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k0 {
    public static final void c(m mVar, TimerData timerData, r rVar, final int i15, final int i16) {
        final m mVar2;
        int i17;
        r rVar2;
        Object[] objArr;
        final TimerData timerData2 = timerData;
        r rVarH = rVar.h(-1990296985);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = i15 | (rVarH.W(mVar2) ? 4 : 2);
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.W(timerData2) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            m mVar3 = i18 != 0 ? m.INSTANCE : mVar2;
            if (t.k()) {
                t.o(-1990296985, i17, -1, "pl.gov.coi.shared.feature.applicationlock.presentation.TimerWithProgress (TimerWithProgress.kt:31)");
            }
            long jD = o1.d(4278211237L);
            m mVarH = d.h(mVar3, 0.0f, 1, null);
            w0 w0VarA = e0.a(i.f39152a.k(), c.INSTANCE.g(), rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarH);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            i0 i0Var = i0.f39176a;
            long timeLeft = timerData2.getTimeLeft();
            long jZ = b.z(timeLeft);
            int iG = b.G(timeLeft);
            int I = b.I(timeLeft);
            b.H(timeLeft);
            String formatStyle = timerData2.getFormatter().getFormatStyle();
            g0 formatter = timerData2.getFormatter();
            if (fr.t.c(formatter, g0.c.f124172b)) {
                objArr = new Integer[]{Integer.valueOf(I)};
            } else if (fr.t.c(formatter, g0.b.f124171b)) {
                objArr = new Integer[]{Integer.valueOf(iG), Integer.valueOf(I)};
            } else {
                if (!fr.t.c(formatter, g0.a.f124170b)) {
                    throw new p();
                }
                objArr = new Long[]{Long.valueOf(jZ), Long.valueOf(iG), Long.valueOf(I)};
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Label labelB = mx.b.b(String.format(formatStyle, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)), "timerTimeLeftTag");
            k70.a aVar = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            m mVar4 = mVar3;
            h.g(null, null, labelB, null, null, 0L, w.g(45), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i19).a(), null, null, false, false, null, rVarH, 1572864, 0, 0, 33030075);
            m.Companion companion2 = m.INSTANCE;
            r3.a(d.i(companion2, aVar.b(rVarH, i19).getSpacing200()), rVarH, 0);
            m mVarH2 = d.h(companion2, 0.0f, 1, null);
            timerData2 = timerData;
            boolean zW = rVarH.W(timerData2) | ((i17 & 112) == 32);
            Object objE = rVarH.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new a() { // from class: m74.i0
                    @Override // er.a
                    public final Object a() {
                        return Float.valueOf(k0.d(timerData2, timerData2));
                    }
                };
                rVarH.v(objE);
            }
            k60.c.c(mVarH2, (a) objE, 0, jD, rVarH, 3078, 4);
            rVar2 = rVarH;
            rVar2.x();
            if (t.k()) {
                t.n();
            }
            mVar2 = mVar4;
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: m74.j0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k0.e(mVar2, timerData2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(TimerData timerData, TimerData timerData2) {
        return (float) b.s(timerData.getTimeLeft(), timerData2.getStartDuration());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(m mVar, TimerData timerData, int i15, int i16, r rVar, int i17) {
        c(mVar, timerData, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
