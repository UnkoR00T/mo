package p133xq1;

import androidx.compose.foundation.layout.d;
import d1.a3;
import d1.d3;
import d1.e0;
import er.q;
import f3.c;
import f3.j;
import j70.h;
import k70.a;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import r50.e;
import r50.f;
import r50.g;
import t70.i;
import y2.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f220513a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q<d3, r, Integer, i0> f220514b = m.b(-1221224498, false, new q() { // from class: xq1.a
        @Override // er.q
        public final Object w(Object obj, Object obj2, Object obj3) {
            return b.c((d3) obj, (r) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(d3 d3Var, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1221224498, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.statusbadge.ComposableSingletons$DeveloperStatusBadgeScreenKt.lambda$-1221224498.<anonymous> (DeveloperStatusBadgeScreen.kt:35)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            a aVar = a.f108864a;
            int i17 = a.f108865b;
            f3.m mVarS = i.S(d.f(a3.n(a3.l(w0.i.d(companion, aVar.a(rVar, i17).getBase().a(), null, 2, null), d3Var), aVar.b(rVar, i17).getSpacing200()), 0.0f, 1, null), null, rVar, 0, 1);
            w0 w0VarA = e0.a(d1.i.f39152a.r(aVar.b(rVar, i17).getSpacing150()), c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = j.e(rVar, mVarS);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            h.g(null, null, mx.b.b("StatusBadge", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).q(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            h.g(null, null, mx.b.b("Komponent reprezentujacy status", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            h.g(null, null, mx.b.b("StatusBadge WithDot - Positive", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r50.a.WithDot withDot = new r50.a.WithDot(null, mx.b.b("Roboto, Medium, 16, Neutral-500", ""), null, 0, f.POSITIVE, 13, null);
            int i18 = r50.a.WithDot.f171869l;
            e.f(withDot, false, null, false, rVar, i18, 14);
            h.g(null, null, mx.b.b("StatusBadge WithDot - Warning", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            e.f(new r50.a.WithDot(null, mx.b.b("Roboto, Medium, 16, Neutral-500", ""), null, 0, f.WARNING, 13, null), false, null, false, rVar, i18, 14);
            h.g(null, null, mx.b.b("StatusBadge WithDot - Informative", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            e.f(new r50.a.WithDot(null, mx.b.b("Roboto, Medium, 16, Neutral-500", ""), null, 0, f.INFORMATIVE, 13, null), false, null, false, rVar, i18, 14);
            h.g(null, null, mx.b.b("StatusBadge WithDot - Negative", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            e.f(new r50.a.WithDot(null, mx.b.b("Roboto, Medium, 16, Neutral-500", ""), null, 0, f.NEGATIVE, 13, null), false, null, false, rVar, i18, 14);
            h.g(null, null, mx.b.b("StatusBadge WithIcon, without border - Positive", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            Label labelB = mx.b.b("Roboto, Medium, 16, Neutral-500", "");
            g gVar = g.POSITIVE;
            r50.a.WithIcon withIcon = new r50.a.WithIcon(null, labelB, null, 0, false, gVar, 13, null);
            int i19 = r50.a.WithIcon.f171875m;
            e.f(withIcon, false, null, false, rVar, i19, 14);
            h.g(null, null, mx.b.b("StatusBadge WithIcon, without border - Negative", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            Label labelB2 = mx.b.b("Roboto, Medium, 16, Neutral-500", "");
            g gVar2 = g.NEGATIVE;
            e.f(new r50.a.WithIcon(null, labelB2, null, 0, false, gVar2, 13, null), false, null, false, rVar, i19, 14);
            h.g(null, null, mx.b.b("StatusBadge WithIcon, without border - Informative", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            Label labelB3 = mx.b.b("Roboto, Medium, 16, Neutral-500", "");
            g gVar3 = g.INFORMATIVE;
            e.f(new r50.a.WithIcon(null, labelB3, null, 0, false, gVar3, 13, null), false, null, false, rVar, i19, 14);
            h.g(null, null, mx.b.b("StatusBadge WithIcon, without border - Notice", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            Label labelB4 = mx.b.b("Roboto, Medium, 16, Neutral-500", "");
            g gVar4 = g.NOTICE;
            e.f(new r50.a.WithIcon(null, labelB4, null, 0, false, gVar4, 13, null), false, null, false, rVar, i19, 14);
            h.g(null, null, mx.b.b("StatusBadge WithIcon, without border - Minus", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            Label labelB5 = mx.b.b("Roboto, Medium, 16, Neutral-500", "");
            g gVar5 = g.MINUS;
            e.f(new r50.a.WithIcon(null, labelB5, null, 0, false, gVar5, 13, null), false, null, false, rVar, i19, 14);
            h.g(null, null, mx.b.b("StatusBadge WithIcon, without border - Warning", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            Label labelB6 = mx.b.b("Roboto, Medium, 16, Neutral-500", "");
            g gVar6 = g.WARNING;
            e.f(new r50.a.WithIcon(null, labelB6, null, 0, false, gVar6, 13, null), false, null, false, rVar, i19, 14);
            h.g(null, null, mx.b.b("StatusBadge WithIcon, with border - Positive", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            e.f(new r50.a.WithIcon(null, mx.b.b("Roboto, Regular, 12, Neutral-500", ""), null, 0, false, gVar, 29, null), false, null, false, rVar, i19, 14);
            h.g(null, null, mx.b.b("StatusBadge WithIcon, with border - Negative", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            e.f(new r50.a.WithIcon(null, mx.b.b("Roboto, Regular, 12, Neutral-500", ""), null, 0, false, gVar2, 29, null), false, null, false, rVar, i19, 14);
            h.g(null, null, mx.b.b("StatusBadge WithIcon, with border - Informative", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            e.f(new r50.a.WithIcon(null, mx.b.b("Roboto, Regular, 12, Neutral-500", ""), null, 0, false, gVar3, 29, null), false, null, false, rVar, i19, 14);
            h.g(null, null, mx.b.b("StatusBadge WithIcon, with border - Notice", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            e.f(new r50.a.WithIcon(null, mx.b.b("Roboto, Regular, 12, Neutral-500", ""), null, 0, false, gVar4, 29, null), false, null, false, rVar, i19, 14);
            h.g(null, null, mx.b.b("StatusBadge WithIcon, with border - Minus", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            e.f(new r50.a.WithIcon(null, mx.b.b("Roboto, Regular, 12, Neutral-500", ""), null, 0, false, gVar5, 29, null), false, null, false, rVar, i19, 14);
            h.g(null, null, mx.b.b("StatusBadge WithIcon, with border - Warning", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            e.f(new r50.a.WithIcon(null, mx.b.b("Roboto, Regular, 12, Neutral-500", ""), null, 0, false, gVar6, 29, null), false, null, false, rVar, i19, 14);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    public final q<d3, r, Integer, i0> b() {
        return f220514b;
    }
}
