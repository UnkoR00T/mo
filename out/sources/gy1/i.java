package gy1;

import i50.BaseScaffoldData;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lgy1/d;", "viewModel", "Loq/i0;", "d", "(Lgy1/d;Lm2/r;I)V", "Lgy1/d$a$a;", "data", "g", "(Lgy1/d$a$a;Lm2/r;I)V", "Lgy1/d$a;", "state", "eidservices_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final void d(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-651893597);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-651893597, i16, -1, "pl.gov.coi.mobywatel.feature.eidservices.electroniclayersettings.certificatesreading.CertificatesReadingScreen (CertificatesReadingScreen.kt:12)");
            }
            d.a aVarE = e(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarE instanceof d.a.NfcInfo) {
                rVarH.X(595485872);
                bx1.i.k(((d.a.NfcInfo) aVarE).getData(), rVarH, BaseScaffoldData.f89350g);
                rVarH.R();
            } else if (aVarE instanceof d.a.NfcScanning) {
                rVarH.X(595489172);
                bx1.i.p(((d.a.NfcScanning) aVarE).getData(), rVarH, BaseScaffoldData.f89350g);
                rVarH.R();
            } else {
                if (!(aVarE instanceof d.a.Error)) {
                    rVarH.X(595483400);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(595492386);
                g((d.a.Error) aVarE, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: gy1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.f(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a e(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(d dVar, int i15, p076m2.r rVar, int i16) {
        d(dVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void g(final d.a.Error error, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1888680321);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(error) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1888680321, i16, -1, "pl.gov.coi.mobywatel.feature.eidservices.electroniclayersettings.certificatesreading.ErrorScreen (CertificatesReadingScreen.kt:25)");
            }
            error.getErrorVMS().b(rVarH, 0);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: gy1.g
                    @Override // er.a
                    public final Object a() {
                        return i.h();
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 48, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gy1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.i(error, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(d.a.Error error, int i15, p076m2.r rVar, int i16) {
        g(error, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
