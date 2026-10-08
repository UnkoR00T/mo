package dq1;

import d1.a3;
import d1.e0;
import d1.h0;
import d1.r3;
import n40.FilePickerData;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Ldq1/a0;", "viewModel", "Lkotlin/Function0;", "Loq/i0;", "onClosed", "c", "(Ldq1/a0;Ler/a;Lm2/r;I)V", "Ldq1/a0$a;", "data", "f", "(Ldq1/a0$a;Ler/a;Lm2/r;I)V", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    public static final void c(final a0 a0Var, final er.a<i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-704069430);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(a0Var) : rVarH.G(a0Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-704069430, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.filepicker.DeveloperFilePickerScreen (DeveloperFilePickerScreen.kt:30)");
            }
            f(d(m7.b.c(a0Var.getState(), null, null, null, rVarH, 0, 7)), aVar, rVarH, (i16 & 112) | FilePickerData.f131319k);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: dq1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.e(a0Var, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final a0.Data d(f6<a0.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(a0 a0Var, er.a aVar, int i15, p076m2.r rVar, int i16) {
        c(a0Var, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void f(final a0.Data data, final er.a<i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(711196347);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(data) : rVarH.G(data) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(711196347, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.filepicker.FilePickerScreenContent (DeveloperFilePickerScreen.kt:42)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(companion, aVar2.a(rVarH, i17).getBase().a(), null, 2, null);
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
            p70.g.f153260a.o(mx.b.b("File Picker (1.1.0)", ""), aVar, rVarH, (i16 & 112) | (p70.g.f153262c << 6));
            j70.h.g(a3.r(companion, aVar2.b(rVarH, i17).getSpacing200(), 0.0f, aVar2.b(rVarH, i17).getSpacing200(), 0.0f, 10, null), null, mx.b.b("File Picker", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33030138);
            j70.h.g(a3.n(companion, aVar2.b(rVarH, i17).getSpacing200()), null, mx.b.b("Uploader file to komponent służący do przesyłania plików z urządzenia na server. Pozwala wybrać plik zgodnie z wytycznymi dla kontekstu użycia, informując użytkownika o przebiegu procesu.", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030138);
            f3.c.b bVarK = companion2.k();
            f3.m mVarB = h0.b(i0Var, t70.i.S(a3.p(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), aVar2.b(rVarH, i17).getSpacing200(), 0.0f, 2, null), null, rVarH, 0, 1), 1.0f, false, 2, null);
            w0 w0VarA2 = e0.a(iVar.k(), bVarK, rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarB);
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
            m40.c.c(null, data.getData(), rVarH, FilePickerData.f131319k << 3, 1);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing200()), rVarH, 0);
            j70.h.g(a3.p(companion, 0.0f, aVar2.b(rVarH, i17).getSpacing200(), 1, null), null, mx.b.b("Parametry i obsługa błędów biznesowych (np. poprzez pokazanie ich na dialogu) już w ramach procesu, który będzie używał komponentu i tych useCase'ów \n- można się wzorować na wniosku o dowód (feature-physicalidcardapplication, AddPhoto#, AdditionalAttachments#)", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030138);
            rVarH.x();
            f3.m mVarN = a3.n(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), aVar2.b(rVarH, i17).getSpacing200());
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, mVarN);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarI, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            d1.x xVar = d1.x.f39368a;
            h30.q.p(data.getNextButton(), false, null, rVarH, 0, 6);
            rVar2 = rVarH;
            rVar2.x();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: dq1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.g(data, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(a0.Data data, er.a aVar, int i15, p076m2.r rVar, int i16) {
        f(data, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
