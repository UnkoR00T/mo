package hh1;

import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import d1.r3;
import d1.x;
import er.p;
import er.q;
import i50.BaseScaffoldData;
import i50.s;
import java.io.IOException;
import oq.i0;
import org.xmlpull.v1.XmlPullParserException;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p088nul.q0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lhh1/g;", "viewModel", "Loq/i0;", "d", "(Lhh1/g;Lm2/r;I)V", "Lhh1/g$a;", "screenData", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f84637a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(474641207);
            if (t.k()) {
                t.o(474641207, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documentexpired.DocumentCertificateExpiredScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DocumentCertificateExpiredScreen.kt:57)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return primary;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f84638a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1490861334);
            if (t.k()) {
                t.o(1490861334, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documentexpired.DocumentCertificateExpiredScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DocumentCertificateExpiredScreen.kt:58)");
            }
            long secondary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getSecondary();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return secondary;
        }
    }

    public static final void d(final g gVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(2103955176);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(2103955176, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documentexpired.DocumentCertificateExpiredScreen (DocumentCertificateExpiredScreen.kt:32)");
            }
            final f6 f6VarC = m7.b.c(gVar.getState(), null, null, null, rVarH, 0, 7);
            int i17 = i16;
            s.r(e(f6VarC).getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1156256987, true, new q() { // from class: hh1.a
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return d.f(f6VarC, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196992, 28670);
            rVarH = rVarH;
            boolean z15 = (i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(gVar));
            Object objE = rVarH.E();
            if (z15 || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: hh1.b
                    @Override // er.a
                    public final Object a() {
                        return d.g(gVar);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: hh1.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.h(gVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final g.Data e(f6<g.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(f6 f6Var, d3 d3Var, r rVar, int i15) throws XmlPullParserException, IOException {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(1156256987, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documentexpired.DocumentCertificateExpiredScreen.<anonymous> (DocumentCertificateExpiredScreen.kt:40)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(a3.p(mVarL, aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null), aVar.a(rVar, i17).getBase().a(), null, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarD);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            f3.m mVarS = t70.i.S(h0.b(i0Var, companion, 1.0f, false, 2, null), null, rVar, 0, 1);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVar, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarS);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            o40.j.i(new o40.a.Icon(jz.a.F, a.f84637a, b.f84638a, e(f6Var).getTitle(), e(f6Var).getDescriptionFirst(), null, 32, null), rVar, o40.a.Icon.f142232h);
            rVar.x();
            f3.m mVarP = a3.p(companion, 0.0f, aVar.b(rVar, i17).getSpacing250(), 1, null);
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT3 = rVar.t();
            f3.m mVarE3 = f3.j.e(rVar, mVarP);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB3);
            } else {
                rVar.u();
            }
            r rVarC3 = n6.c(rVar);
            n6.i(rVarC3, w0VarI, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            x xVar = x.f39368a;
            h30.q.p(e(f6Var).getRevokeButtonData(), false, null, rVar, 0, 6);
            rVar.x();
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(g gVar) {
        gVar.d();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(g gVar, int i15, r rVar, int i16) {
        d(gVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
