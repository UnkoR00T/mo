package p021bq1;

import androidx.compose.foundation.layout.d;
import d1.a3;
import d1.e0;
import d1.r3;
import er.a;
import er.p;
import f3.c;
import f3.j;
import f3.m;
import h30.ButtonData;
import j70.h;
import k40.EmptyStateData;
import mx.Label;
import mx.b;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p70.g;
import w0.i;

/* JADX INFO: renamed from: bq1.d, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "close", "d", "(Ler/a;Lm2/r;I)V", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    public static final void d(final a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1863468072);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(aVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1863468072, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.emptystate.DeveloperEmptyStateScreen (DeveloperEmptyStateScreen.kt:25)");
            }
            m.Companion companion = m.INSTANCE;
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            m mVarD = i.d(companion, aVar2.a(rVarH, i17).getBase().a(), null, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            c.Companion companion2 = c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarD);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            g.f153260a.o(b.b("EmptyState (1.1.0)", ""), aVar, rVarH, ((i16 << 3) & 112) | (g.f153262c << 6));
            c.b bVarK = companion2.k();
            m mVarS = t70.i.S(a3.p(d.f(companion, 0.0f, 1, null), aVar2.b(rVarH, i17).getSpacing200(), 0.0f, 2, null), null, rVarH, 0, 1);
            w0 w0VarA2 = e0.a(iVar.k(), bVarK, rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarS);
            a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
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
            h.g(null, null, b.b("Body", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            EmptyStateData emptyStateData = new EmptyStateData(null, b.b("Body section", ""), null, 5, null);
            int i18 = EmptyStateData.f108236d;
            k40.d.c(null, emptyStateData, rVarH, i18 << 3, 1);
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing200()), rVarH, 0);
            h.g(null, null, b.b("With title", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            k40.d.c(null, new EmptyStateData(b.b("Title section (optional)", ""), b.b("Body section", ""), null, 4, null), rVarH, i18 << 3, 1);
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing200()), rVarH, 0);
            h.g(null, null, b.b("With button", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            Label labelB = b.b("Body section", "");
            k30.a.b bVar = k30.a.b.f107765a;
            k30.d.c cVar = k30.d.c.f107775a;
            k30.c.WithText withText = new k30.c.WithText(b.b("Tertiary small button (optional)", ""), null, 2, null);
            Object objE = rVarH.E();
            r.Companion companion4 = r.INSTANCE;
            if (objE == companion4.a()) {
                objE = new a() { // from class: bq1.a
                    @Override // er.a
                    public final Object a() {
                        return Function0.e();
                    }
                };
                rVarH.v(objE);
            }
            k40.d.c(null, new EmptyStateData(null, labelB, new ButtonData(null, null, bVar, withText, cVar, null, (a) objE, 35, null), 1, null), rVarH, i18 << 3, 1);
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing200()), rVarH, 0);
            h.g(null, null, b.b("With title and button", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            Label labelB2 = b.b("Title section (optional)", "");
            Label labelB3 = b.b("Body section", "");
            k30.c.WithText withText2 = new k30.c.WithText(b.b("Tertiary small button (optional)", ""), null, 2, null);
            Object objE2 = rVarH.E();
            if (objE2 == companion4.a()) {
                objE2 = new a() { // from class: bq1.b
                    @Override // er.a
                    public final Object a() {
                        return Function0.f();
                    }
                };
                rVarH.v(objE2);
            }
            k40.d.c(null, new EmptyStateData(labelB2, labelB3, new ButtonData(null, null, bVar, withText2, cVar, null, (a) objE2, 35, null)), rVarH, i18 << 3, 1);
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
            d5VarM.a(new p() { // from class: bq1.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.g(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(a aVar, int i15, r rVar, int i16) {
        d(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
