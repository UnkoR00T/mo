package xp1;

import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.e0;
import d1.i0;
import i30.ButtonIconData;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lxp1/f;", "viewModel", "Loq/i0;", "b", "(Lxp1/f;Lm2/r;I)V", "Lxp1/f$a;", "state", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f220446a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(-1201765828);
            if (t.k()) {
                t.o(-1201765828, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.controllers.DeveloperControllersScreen.<anonymous>.<anonymous> (DeveloperControllersScreen.kt:35)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public static final void b(final f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1305401917);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1305401917, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.controllers.DeveloperControllersScreen (DeveloperControllersScreen.kt:27)");
            }
            f6 f6VarC = m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7);
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
            p70.n.g(null, null, mx.b.b("Controllers (1.1.0)", ""), null, null, 0L, null, new ButtonIconData(null, jz.a.U, a.f220446a, null, null, c(f6VarC).c(), 25, null), rVarH, ButtonIconData.f88935g << 21, 123);
            f3.c.b bVarK = companion2.k();
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(a3.r(companion, aVar.b(rVarH, i17).getSpacing200(), 0.0f, aVar.b(rVarH, i17).getSpacing200(), 0.0f, 10, null), 0.0f, 1, null), null, rVarH, 0, 1);
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
            j70.h.g(a3.p(companion, 0.0f, aVar.b(rVarH, i17).getSpacing200(), 1, null), null, mx.b.b("Controller", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33030138);
            y30.m.g(c(f6VarC).getControllersSwitch(), rVarH, y30.n.Switch.f223693f);
            j70.h.g(a3.p(companion, 0.0f, aVar.b(rVarH, i17).getSpacing200(), 1, null), null, mx.b.b("Filter controller", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33030138);
            rVarH = rVarH;
            y30.f.c(c(f6VarC).getControllersFilter(), null, rVarH, y30.n.Filter.f223689d, 2);
            rVarH.x();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: xp1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.d(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final f.Data c(f6<f.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d(f fVar, int i15, p076m2.r rVar, int i16) {
        b(fVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
