package l62;

import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Ll62/o;", "viewModel", "Loq/i0;", "b", "(Ll62/o;Lm2/r;I)V", "Ll62/o$a;", "screenState", "Li70/p;", "snackBarState", "familycard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a0 {

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

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements er.a<oq.i0> {
        b(Object obj) {
            super(0, obj, o.class, "onBack", "onBack()V", 0);
        }

        public final void E() {
            ((o) this.f66391b).P();
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
        p076m2.r rVarH = rVar.h(1460682028);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(oVar) : rVarH.G(oVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1460682028, i16, -1, "pl.gov.coi.mobywatel.feature.familycard.presentation.screens.FamilyCardScreen (FamilyCardScreen.kt:15)");
            }
            f6 f6VarC = m7.b.c(oVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(oVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVar2 = rVarH;
            o.a aVarC = c(f6VarC);
            if (fr.t.c(aVarC, o.a.b.f116556a)) {
                rVar2.X(-1430012556);
                rVar2.R();
            } else {
                if (!(aVarC instanceof o.a.DataLoaded)) {
                    rVar2.X(-738868194);
                    rVar2.R();
                    throw new oq.p();
                }
                rVar2.X(-738864354);
                o.a.DataLoaded dataLoaded = (o.a.DataLoaded) aVarC;
                i70.p pVarD = d(f6VarB);
                boolean z15 = (i16 & 14) == 4 || ((i16 & 8) != 0 && rVar2.G(oVar));
                Object objE = rVar2.E();
                if (z15 || objE == p076m2.r.INSTANCE.a()) {
                    objE = new a(oVar);
                    rVar2.v(objE);
                }
                y.j(dataLoaded, pVarD, (er.a) ((mr.g) objE), rVar2, 0, 0);
                rVar2 = rVar2;
                rVar2.R();
            }
            boolean z16 = (i16 & 14) == 4 || ((i16 & 8) != 0 && rVar2.G(oVar));
            Object objE2 = rVar2.E();
            if (z16 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new b(oVar);
                rVar2.v(objE2);
            }
            p088nul.q0.g(false, (er.a) ((mr.g) objE2), rVar2, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: l62.z
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return a0.e(oVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final o.a c(f6<? extends o.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p d(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(o oVar, int i15, p076m2.r rVar, int i16) {
        b(oVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
