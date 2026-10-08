package kp1;

import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.e0;
import d1.r3;
import d30.BadgeData;
import er.p;
import er.q;
import i30.ButtonIconData;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lkp1/j;", "viewModel", "Lkotlin/Function0;", "Loq/i0;", "close", "b", "(Lkp1/j;Ler/a;Lm2/r;I)V", "Lkp1/j$a;", "state", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f112150a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-470361012);
            if (t.k()) {
                t.o(-470361012, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.badge.DeveloperBadgeScreen.<anonymous>.<anonymous> (DeveloperBadgeScreen.kt:40)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public static final void b(final j jVar, final er.a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1871907117);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(jVar) : rVarH.G(jVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1871907117, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.badge.DeveloperBadgeScreen (DeveloperBadgeScreen.kt:33)");
            }
            f6 f6VarC = m7.b.c(jVar.getState(), null, null, null, rVarH, 0, 7);
            f3.m.Companion companion = f3.m.INSTANCE;
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
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
            Label labelB = mx.b.b("DS16 Badge (1.0)", "");
            ButtonIconData buttonIconData = new ButtonIconData(null, jz.a.U, a.f112150a, null, c70.a.f23835a.a().R(), aVar, 9, null);
            int i17 = ButtonIconData.f88935g;
            p70.n.g(null, null, labelB, null, null, 0L, null, buttonIconData, rVarH, i17 << 21, 123);
            f3.c.b bVarK = companion2.k();
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar2 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarS = t70.i.S(a3.p(w0.i.d(mVarF, aVar2.a(rVarH, i18).getBase().a(), null, 2, null), aVar2.b(rVarH, i18).getSpacing200(), 0.0f, 2, null), null, rVarH, 0, 1);
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
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            j70.h.g(null, null, mx.b.b("Badge", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            j70.h.g(a3.p(companion, 0.0f, aVar2.b(rVarH, i18).getSpacing200(), 1, null), null, mx.b.b("Badge pokazuje notyfikację lub informację o statusie na elementach nawigacyjnych i ikonach", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030138);
            j70.h.g(null, null, mx.b.b("Badge standalone", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i18).getSpacing200()), rVarH, 0);
            BadgeData<d40.b.C0864b> badgeDataA = c(f6VarC).a();
            d dVar = d.f112142a;
            q<d40.b.C0864b, r, Integer, i0> qVarD = dVar.d();
            int i19 = BadgeData.f39532d;
            int i25 = d40.b.C0864b.f39687h;
            d30.d.c(badgeDataA, qVarD, rVarH, i19 | i25 | 48, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i18).getSpacing200()), rVarH, 0);
            d30.d.c(c(f6VarC).b(), dVar.f(), rVarH, i25 | i19 | 48, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i18).getSpacing200()), rVarH, 0);
            d30.d.c(c(f6VarC).c(), dVar.e(), rVarH, i19 | i17 | 48, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i18).getSpacing200()), rVarH, 0);
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
            d5VarM.a(new p() { // from class: kp1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.d(jVar, aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final j.Data c(f6<j.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(j jVar, er.a aVar, int i15, r rVar, int i16) {
        b(jVar, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
