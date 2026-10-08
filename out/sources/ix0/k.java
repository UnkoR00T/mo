package ix0;

import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.e0;
import d1.r3;
import i30.ButtonIconData;
import n50.h0;
import oq.i0;
import org.bouncycastle.asn1.eac.CertificateBody;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lix0/h;", "viewModel", "Loq/i0;", "c", "(Lix0/h;Lm2/r;I)V", "Lix0/h$a$a;", "data", "f", "(Lix0/h$a$a;Lm2/r;I)V", "Lix0/h$a;", "state", "adddocument_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f97564a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(1746429917);
            if (t.k()) {
                t.o(1746429917, i15, -1, "pl.gov.coi.mobywatel.feature.adddocument.presentation.screen.confirmationmethod.ConfirmationMethodScreenDisplayInitialized.<anonymous>.<anonymous> (ConfirmationMethodScreen.kt:50)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public static final void c(final h hVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(777487419);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(hVar) : rVarH.G(hVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(777487419, i16, -1, "pl.gov.coi.mobywatel.feature.adddocument.presentation.screen.confirmationmethod.ConfirmationMethodScreen (ConfirmationMethodScreen.kt:28)");
            }
            h.a aVarD = d(m7.b.c(hVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarD instanceof h.a.DataLoaded) {
                rVarH.X(-158892295);
                f((h.a.DataLoaded) aVarD, rVarH, 0);
                rVarH.R();
            } else {
                if (!fr.t.c(aVarD, h.a.b.f97559a)) {
                    rVarH.X(-158895150);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-158888737);
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ix0.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.e(hVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final h.a d(f6<? extends h.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(h hVar, int i15, p076m2.r rVar, int i16) {
        c(hVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void f(final h.a.DataLoaded dataLoaded, p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(-91616540);
        int i16 = (i15 & 6) == 0 ? i15 | (rVarH.G(dataLoaded) ? 4 : 2) : i15;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-91616540, i16, -1, "pl.gov.coi.mobywatel.feature.adddocument.presentation.screen.confirmationmethod.ConfirmationMethodScreenDisplayInitialized (ConfirmationMethodScreen.kt:41)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(mVarF, aVar.a(rVarH, i17).getBase().a(), null, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarD);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            p70.n.g(null, null, null, null, null, 0L, null, new ButtonIconData(null, jz.a.U, a.f97564a, null, c70.a.f23835a.a().R(), dataLoaded.c(), 9, null), rVarH, ButtonIconData.f88935g << 21, CertificateBody.profileType);
            f3.m mVarS = t70.i.S(a3.q(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), aVar.b(rVarH, i17).getSpacing200(), aVar.b(rVarH, i17).getSpacing100(), aVar.b(rVarH, i17).getSpacing200(), aVar.b(rVarH, i17).getSpacing200()), null, rVarH, 0, 1);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarS);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            j70.h.g(a3.r(companion, 0.0f, aVar.b(rVarH, i17).getSpacing50(), 0.0f, aVar.b(rVarH, i17).getSpacing300(), 5, null), null, dataLoaded.getTitle(), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).g(), null, null, false, false, null, rVarH, 0, 0, 0, 33030138);
            j70.h.g(a3.p(companion, 0.0f, aVar.b(rVarH, i17).getSpacing100(), 1, null), null, dataLoaded.getDescription(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).d(), null, null, false, false, null, rVarH, 0, 0, 0, 33030106);
            rVarH = rVarH;
            rVarH.X(1029197662);
            for (n50.k kVar : dataLoaded.a()) {
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100()), rVarH, 0);
                h0.v(kVar, null, rVarH, 0, 2);
            }
            rVarH.R();
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
            d5VarM.a(new er.p() { // from class: ix0.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.g(dataLoaded, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(h.a.DataLoaded dataLoaded, int i15, p076m2.r rVar, int i16) {
        f(dataLoaded, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
