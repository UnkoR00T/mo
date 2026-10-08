package y30;

import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.x;
import er.r;
import f1.b1;
import f1.q0;
import f1.y0;
import java.util.List;
import mx.Label;
import n3.y2;
import oq.i0;
import oq.p;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;
import q4.TextStyle;
import t70.s;
import w0.r1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ly30/n$a;", "data", "Lf1/y0;", "state", "Loq/i0;", "c", "(Ly30/n$a;Lf1/y0;Lm2/r;II)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.a<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n.Filter f223667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f223668b;

        a(n.Filter filter, int i15) {
            this.f223667a = filter;
            this.f223668b = i15;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            this.f223667a.b().b(Integer.valueOf(this.f223668b));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f223669a;

        public b(List list) {
            this.f223669a = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            this.f223669a.get(i15);
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements r<f1.e, Integer, p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f223670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n.Filter f223671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ y2 f223672c;

        public c(List list, n.Filter filter, y2 y2Var) {
            this.f223670a = list;
            this.f223671b = filter;
            this.f223672c = y2Var;
        }

        public final void c(f1.e eVar, int i15, p076m2.r rVar, int i16) {
            int i17;
            long jG;
            TextStyle textStyleD;
            long jB;
            if ((i16 & 6) == 0) {
                i17 = i16 | (rVar.W(eVar) ? 4 : 2);
            } else {
                i17 = i16;
            }
            if ((i16 & 48) == 0) {
                i17 |= rVar.c(i15) ? 32 : 16;
            }
            if (!rVar.r((i17 & 147) != 146, i17 & 1)) {
                rVar.O();
                return;
            }
            if (t.k()) {
                t.o(2039820996, i17, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            rVar.X(-1736063373);
            Object objE = rVar.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = b1.k.a();
                rVar.v(objE);
            }
            b1.l lVar = (b1.l) objE;
            f6<Boolean> f6VarA = b1.f.a(lVar, rVar, 6);
            f3.m.Companion companion2 = f3.m.INSTANCE;
            boolean z15 = this.f223671b.getSelectedItemIndex() == i15;
            if (z15) {
                rVar.X(359648265);
                jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getSecondary();
                rVar.R();
            } else {
                if (z15) {
                    rVar.X(359645658);
                    rVar.R();
                    throw new p();
                }
                rVar.X(359649579);
                rVar.R();
                jG = Color.INSTANCE.g();
            }
            f3.m mVarB = s.B(w0.i.c(companion2, jG, this.f223672c), f6VarA, this.f223672c, rVar, 0);
            r1 r1VarE = s.E(0.0f, rVar, 0, 1);
            boolean zG = ((((i17 & 112) ^ 48) > 32 && rVar.c(i15)) || (i17 & 48) == 32) | rVar.G(this.f223671b);
            Object objE2 = rVar.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new a(this.f223671b, i15);
                rVar.v(objE2);
            }
            f3.m mVarL = androidx.compose.foundation.b.l(mVarB, lVar, r1VarE, false, null, null, (er.a) objE2, 28, null);
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarO = a3.o(mVarL, aVar.b(rVar, i18).getSpacing200(), aVar.b(rVar, i18).getSpacing50());
            f3.c.Companion companion3 = f3.c.INSTANCE;
            f3.m mVarG = androidx.compose.foundation.layout.d.G(mVarO, companion3.g(), false, 2, null);
            w0 w0VarI = d1.r.i(companion3.e(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarG);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            x xVar = x.f39368a;
            Label label = this.f223671b.a().get(i15);
            int iA = b5.j.INSTANCE.a();
            boolean z16 = this.f223671b.getSelectedItemIndex() == i15;
            if (z16) {
                rVar.X(-455271722);
                textStyleD = aVar.f(rVar, i18).c();
                rVar.R();
            } else {
                if (z16) {
                    rVar.X(-455274220);
                    rVar.R();
                    throw new p();
                }
                rVar.X(-455269801);
                textStyleD = aVar.f(rVar, i18).d();
                rVar.R();
            }
            TextStyle textStyle = textStyleD;
            boolean z17 = this.f223671b.getSelectedItemIndex() == i15;
            if (z17) {
                rVar.X(-455265427);
                jB = aVar.a(rVar, i18).getBase().getPrimary();
                rVar.R();
            } else {
                if (z17) {
                    rVar.X(-455267959);
                    rVar.R();
                    throw new p();
                }
                rVar.X(-455263664);
                jB = aVar.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
                rVar.R();
            }
            j70.h.g(null, null, label, null, null, jB, 0L, null, null, null, 0L, null, b5.j.h(iA), 0L, 0, false, 1, 0, null, textStyle, null, null, false, false, null, rVar, 0, 1572864, 0, 32960475);
            rVar.x();
            rVar.R();
            if (t.k()) {
                t.n();
            }
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ i0 g(f1.e eVar, Integer num, p076m2.r rVar, Integer num2) {
            c(eVar, num.intValue(), rVar, num2.intValue());
            return i0.f148189a;
        }
    }

    public static final void c(final n.Filter filter, y0 y0Var, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        final y0 y0VarC;
        p076m2.r rVarH = rVar.h(-255817053);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(filter) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            if ((i16 & 2) == 0) {
                y0VarC = y0Var;
                int i18 = rVarH.W(y0VarC) ? 32 : 16;
                i17 |= i18;
            } else {
                y0VarC = y0Var;
            }
            i17 |= i18;
        } else {
            y0VarC = y0Var;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0 && !rVarH.Q()) {
                rVarH.O();
                if ((i16 & 2) != 0) {
                    i17 &= -113;
                }
            } else if ((i16 & 2) != 0) {
                y0VarC = b1.c(0, 0, rVarH, 0, 3);
                i17 &= -113;
            }
            rVarH.y();
            if (t.k()) {
                t.o(-255817053, i17, -1, "pl.gov.coi.common.ui.ds.controllers.ControllerFilter (ControllerFilter.kt:34)");
            }
            k70.a aVar = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            final y2 radius200 = aVar.e(rVarH, i19).getRadius200();
            d1.i.f fVarR = d1.i.f39152a.r(aVar.b(rVarH, i19).getSpacing50());
            boolean zG = rVarH.G(filter) | rVarH.W(radius200);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: y30.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return f.d(filter, radius200, (q0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f1.d.e(null, y0VarC, null, false, fVarR, null, null, false, null, (er.l) objE, rVarH, i17 & 112, 493);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: y30.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.e(filter, y0VarC, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(n.Filter filter, y2 y2Var, q0 q0Var) {
        List<Label> listA = filter.a();
        q0Var.j(listA.size(), null, new b(listA), y2.m.b(2039820996, true, new c(listA, filter, y2Var)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(n.Filter filter, y0 y0Var, int i15, int i16, p076m2.r rVar, int i17) {
        c(filter, y0Var, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }
}
