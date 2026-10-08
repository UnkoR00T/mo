package iq1;

import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.e0;
import d1.i0;
import d1.r3;
import i30.ButtonIconData;
import java.util.List;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import v40.InputDateTimeData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Liq1/a0;", "viewModel", "Loq/i0;", "b", "(Liq1/a0;Lm2/r;I)V", "Liq1/a0$a;", "state", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f96429a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-1624935111);
            if (p076m2.t.k()) {
                p076m2.t.o(-1624935111, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.inputdate.DeveloperInputDateScreen.<anonymous>.<anonymous> (DeveloperInputDateScreen.kt:37)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public static final void b(final a0 a0Var, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(108988928);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(a0Var) : rVarH.G(a0Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(108988928, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.inputdate.DeveloperInputDateScreen (DeveloperInputDateScreen.kt:29)");
            }
            f6 f6VarC = m7.b.c(a0Var.getState(), null, null, null, rVarH, 0, 7);
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(companion, aVar.a(rVarH, i17).getBase().a(), null, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarD);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            i0 i0Var = i0.f39176a;
            p70.n.g(null, null, mx.b.b("Input Date (1.1.0)", ""), null, null, 0L, null, new ButtonIconData(null, jz.a.U, a.f96429a, null, null, c(f6VarC).b(), 25, null), rVarH, ButtonIconData.f88935g << 21, 123);
            rVarH = rVarH;
            f3.c.b bVarK = companion2.k();
            f3.m mVarR = a3.r(companion, aVar.b(rVarH, i17).getSpacing200(), 0.0f, aVar.b(rVarH, i17).getSpacing200(), 0.0f, 10, null);
            float f15 = 0.0f;
            Object obj = null;
            int i18 = 0;
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(mVarR, 0.0f, 1, null), null, rVarH, 0, 1);
            w0 w0VarA2 = e0.a(iVar.k(), bVarK, rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarS);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            rVarH.X(1351742102);
            List<a0.Data.Field> listA = c(f6VarC).a();
            int size = listA.size();
            int i19 = 0;
            while (i19 < size) {
                a0.Data.Field field = listA.get(i19);
                f3.m.Companion companion4 = f3.m.INSTANCE;
                k70.a aVar2 = k70.a.f108864a;
                int i25 = k70.a.f108865b;
                p076m2.r rVar2 = rVarH;
                j70.h.g(a3.p(companion4, f15, aVar2.b(rVarH, i25).getSpacing200(), 1, obj), null, field.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i25).q(), null, null, false, false, null, rVar2, 0, 0, 0, 33030138);
                rVarH = rVar2;
                v40.i.h(field.getInput(), rVarH, InputDateTimeData.f203769m);
                i19++;
                i18 = i18;
                f15 = f15;
                obj = obj;
                size = size;
                listA = listA;
            }
            rVarH.R();
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing300()), rVarH, i18);
            rVarH.x();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: iq1.j
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return k.d(a0Var, i15, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final a0.Data c(f6<a0.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d(a0 a0Var, int i15, p076m2.r rVar, int i16) {
        b(a0Var, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
