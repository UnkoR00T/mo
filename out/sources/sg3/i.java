package sg3;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import q4.TextStyle;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r²\u0006\f\u0010\f\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lsg3/c;", "viewModel", "Loq/i0;", "l", "(Lsg3/c;Lm2/r;I)V", "Lsg3/c$a;", "data", "f", "(Lsg3/c$a;Lm2/r;I)V", "Lsg3/c$a$b;", "h", "(Lsg3/c$a$b;Lm2/r;I)V", "state", "vehiclecollision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final void f(final c.a aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1970982242);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1970982242, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.readytosignwaiting.ReadyToSignWaitingContent (ReadyToSignWaitingScreen.kt:40)");
            }
            if (aVar instanceof c.a.C4671a) {
                rVarH.X(-1033926878);
                rVarH.R();
            } else {
                if (!(aVar instanceof c.a.Initialized)) {
                    rVarH.X(-33354356);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-33350607);
                h((c.a.Initialized) aVar, rVarH, i16 & 14);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sg3.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.g(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(c.a aVar, int i15, p076m2.r rVar, int i16) {
        f(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void h(final c.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1216959433);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1216959433, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.readytosignwaiting.ReadyToSignWaitingInitialized (ReadyToSignWaitingScreen.kt:50)");
            }
            boolean z15 = (i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(initialized));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: sg3.f
                    @Override // er.a
                    public final Object a() {
                        return i.i(initialized);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            rVar2 = rVarH;
            i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(212012266, true, new er.q() { // from class: sg3.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.j(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sg3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.k(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(c.a.Initialized initialized) {
        initialized.c().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(c.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(212012266, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.readytosignwaiting.ReadyToSignWaitingInitialized.<anonymous> (ReadyToSignWaitingScreen.kt:56)");
            }
            d1.i.f fVarE = d1.i.f39152a.e();
            f3.c.b bVarG = f3.c.INSTANCE.g();
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(t70.i.S(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), null, rVar, 6, 1), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(mVarL, aVar.b(rVar, i17).getSpacing500(), 0.0f, 2, null);
            w0 w0VarA = e0.a(fVarE, bVarG, rVar, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            x70.f.g(initialized.getLoaderData(), rVar, x70.a.f217278b);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            Label title = initialized.getTitle();
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            TextStyle textStyleG = aVar.f(rVar, i17).g();
            b5.j.Companion companion3 = b5.j.INSTANCE;
            j70.h.g(mVarH, null, title, null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, b5.j.h(companion3.a()), 0L, 0, false, 0, 0, null, textStyleG, null, Float.valueOf(-2.0f), false, false, null, rVar, 6, 0, 0, 30928858);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            j70.h.g(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), null, initialized.getDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, b5.j.h(companion3.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 6, 0, 0, 33026010);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(c.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        h(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void l(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1547238511);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1547238511, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.readytosignwaiting.ReadyToSignWaitingScreen (ReadyToSignWaitingScreen.kt:29)");
            }
            f(m(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sg3.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.n(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a m(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(c cVar, int i15, p076m2.r rVar, int i16) {
        l(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
