package cp1;

import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.e0;
import d1.i;
import d1.r3;
import er.p;
import f3.j;
import f3.m;
import fr.q;
import g60.a0;
import g60.z;
import i30.ButtonIconData;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p70.n;
import w0.f3;
import w0.u2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcp1/d;", "viewModel", "Loq/i0;", "b", "(Lcp1/d;Lm2/r;I)V", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f37238a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(396496157);
            if (t.k()) {
                t.o(396496157, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.designer.hologramEmblem.DeveloperHologramEmblemScreen.<anonymous>.<anonymous> (DeveloperHologramEmblemScreen.kt:34)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends q implements er.a<i0> {
        b(Object obj) {
            super(0, obj, d.class, "onBackPressed", "onBackPressed()V", 0);
        }

        public final void E() {
            ((d) this.f66391b).d();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    public static final void b(final d dVar, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-1058745500);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1058745500, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.designer.hologramEmblem.DeveloperHologramEmblemScreen (DeveloperHologramEmblemScreen.kt:26)");
            }
            f3 f3VarB = u2.b(0, rVarH, 0, 1);
            m.Companion companion = m.INSTANCE;
            i iVar = i.f39152a;
            i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, companion);
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
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label labelB = mx.b.b("HologramEmblem", "");
            int i17 = jz.a.U;
            a aVar = a.f37238a;
            Label labelR = c70.a.f23835a.a().R();
            boolean z15 = (i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(dVar));
            Object objE = rVarH.E();
            if (z15 || objE == r.INSTANCE.a()) {
                objE = new b(dVar);
                rVarH.v(objE);
            }
            n.g(null, null, labelB, null, null, 0L, null, new ButtonIconData(null, i17, aVar, null, labelR, (er.a) ((mr.g) objE), 9, null), rVarH, ButtonIconData.f88935g << 21, 123);
            f3.c.b bVarK = companion2.k();
            m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar2 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            m mVarS = t70.i.S(a3.n(w0.i.d(mVarF, aVar2.a(rVarH, i18).getBase().a(), null, 2, null), aVar2.b(rVarH, i18).getSpacing100()), f3VarB, rVarH, 0, 0);
            w0 w0VarA2 = e0.a(iVar.k(), bVarK, rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarS);
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
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i18).getSpacing300()), rVarH, 0);
            rVar2 = rVarH;
            j70.h.g(null, null, mx.b.b("Hologram emblem.", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).q(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar2, i18).getSpacing200()), rVar2, 0);
            j70.h.g(null, null, mx.b.b("Example of usage:", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i18).p(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar2, i18).getSpacing200()), rVar2, 0);
            j70.h.g(null, null, mx.b.b("HologramEmblemSize.SMALL", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i18).a(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar2, i18).getSpacing100()), rVar2, 0);
            z.q(null, a0.SMALL, dVar.w(), false, rVar2, 48, 9);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar2, i18).getSpacing200()), rVar2, 0);
            j70.h.g(null, null, mx.b.b("HologramEmblemSize.MEDIUM", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i18).a(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar2, i18).getSpacing100()), rVar2, 0);
            z.q(null, a0.MEDIUM, dVar.w(), false, rVar2, 48, 9);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar2, i18).getSpacing200()), rVar2, 0);
            j70.h.g(null, null, mx.b.b("HologramEmblemSize.LARGE", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i18).a(), null, null, false, false, null, rVar2, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVar2, i18).getSpacing100()), rVar2, 0);
            z.q(null, a0.LARGE, dVar.w(), false, rVar2, 48, 9);
            rVar2.x();
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: cp1.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c.c(dVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(d dVar, int i15, r rVar, int i16) {
        b(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
