package jd3;

import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Ljd3/o;", "viewModel", "Loq/i0;", "b", "(Ljd3/o;Lm2/r;I)V", "Li70/p;", "snackBarState", "Ljd3/o$a;", "screenState", "uut_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class y {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<oq.i0> {
        a(Object obj) {
            super(0, obj, o.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((o) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    public static final void b(final o oVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1575386979);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(oVar) : rVarH.G(oVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = true;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1575386979, i16, -1, "pl.gov.coi.mobywatel.feature.uut.presentation.card.UutCardScreen (UutCardScreen.kt:14)");
            }
            f6 f6VarB = m7.b.b(oVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVar2 = rVarH;
            o.a aVarD = d(m7.b.c(oVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarD instanceof o.a.DataLoaded) {
                rVar2.X(2118409428);
                o.a.DataLoaded dataLoaded = (o.a.DataLoaded) aVarD;
                i70.p pVarC = c(f6VarB);
                if ((i16 & 14) != 4 && ((i16 & 8) == 0 || !rVar2.G(oVar))) {
                    z15 = false;
                }
                Object objE = rVar2.E();
                if (z15 || objE == p076m2.r.INSTANCE.a()) {
                    objE = new a(oVar);
                    rVar2.v(objE);
                }
                w.h(dataLoaded, pVarC, (er.a) ((mr.g) objE), rVar2, 0);
                rVar2.R();
            } else {
                if (!fr.t.c(aVarD, o.a.b.f102116a)) {
                    rVar2.X(2118407086);
                    rVar2.R();
                    throw new oq.p();
                }
                rVar2.X(1246360925);
                rVar2.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: jd3.x
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.e(oVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final i70.p c(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    private static final o.a d(f6<? extends o.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(o oVar, int i15, p076m2.r rVar, int i16) {
        b(oVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
