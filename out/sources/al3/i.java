package al3;

import er.p;
import i50.BaseScaffoldData;
import i50.s;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lal3/f;", "viewModel", "Loq/i0;", "e", "(Lal3/f;Lm2/r;I)V", "Lal3/f$a;", "data", "c", "(Lal3/f$a;Lm2/r;I)V", "vehicleregistration_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    private static final void c(final f.Data data, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(1609077514);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1609077514, i16, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.form.infoaboutdocuments.InfoAboutDocumentsContent (InfoAboutDocumentsScreen.kt:27)");
            }
            rVar2 = rVarH;
            s.r(data.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, b.f7725a.b(), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: al3.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.d(data, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(f.Data data, int i15, r rVar, int i16) {
        c(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void e(final f fVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-660025831);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-660025831, i16, -1, "pl.gov.coi.mobywatel.feature.vehicleregistration.presentation.form.infoaboutdocuments.InfoAboutDocumentsScreen (InfoAboutDocumentsScreen.kt:19)");
            }
            c(f(m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, BaseScaffoldData.f89350g);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: al3.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.g(fVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final f.Data f(f6<f.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(f fVar, int i15, r rVar, int i16) {
        e(fVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
