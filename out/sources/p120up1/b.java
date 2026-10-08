package p120up1;

import androidx.compose.foundation.layout.d;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import er.q;
import f3.c;
import f3.j;
import j70.h;
import java.util.Iterator;
import k70.a;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t30.e;
import t30.n;
import t70.i;
import u30.CheckBoxGroupData;
import v30.p;
import w30.CheckBoxSingleData;
import y2.m;
import z60.DSScreenShotTestData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f199584a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static q<d3, r, Integer, i0> f199585b = m.b(1553045308, false, new q() { // from class: up1.a
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
                t.o(1553045308, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.checkbox.ComposableSingletons$DeveloperCheckBoxScreenKt.lambda$1553045308.<anonymous> (DeveloperCheckBoxScreen.kt:35)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            a aVar = a.f108864a;
            int i17 = a.f108865b;
            f3.m mVarS = i.S(d.f(a3.n(a3.l(w0.i.d(companion, aVar.a(rVar, i17).getBase().a(), null, 2, null), d3Var), aVar.b(rVar, i17).getSpacing200()), 0.0f, 1, null), null, rVar, 0, 1);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), c.INSTANCE.k(), rVar, 0);
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
            h.g(null, null, mx.b.b("Group CheckBox", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).q(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(a3.n(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            rVar.X(-1860925971);
            Iterator<DSScreenShotTestData<CheckBoxGroupData>> it = new n().d().iterator();
            while (it.hasNext()) {
                e.e(it.next().a(), rVar, CheckBoxGroupData.f194954g);
                r3.a(a3.n(f3.m.INSTANCE, a.f108864a.b(rVar, a.f108865b).getSpacing100()), rVar, 0);
            }
            rVar.R();
            f3.m.Companion companion3 = f3.m.INSTANCE;
            a aVar2 = a.f108864a;
            int i18 = a.f108865b;
            r3.a(a3.n(companion3, aVar2.b(rVar, i18).getSpacing200()), rVar, 0);
            h.g(null, null, mx.b.b("Single CheckBox", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i18).q(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(a3.n(companion3, aVar2.b(rVar, i18).getSpacing200()), rVar, 0);
            rVar.X(-1860911474);
            Iterator<DSScreenShotTestData<CheckBoxSingleData>> it4 = new p().d().iterator();
            while (it4.hasNext()) {
                v30.d.f(it4.next().a(), rVar, CheckBoxSingleData.f210090f);
                r3.a(a3.n(f3.m.INSTANCE, a.f108864a.b(rVar, a.f108865b).getSpacing100()), rVar, 0);
            }
            rVar.R();
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
        return f199585b;
    }
}
