package mh1;

import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import java.util.List;
import n50.DefaultSingleCardData;
import n50.h0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p088nul.q0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n²\u0006\f\u0010\u0006\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lmh1/k;", "viewModel", "Loq/i0;", "k", "(Lmh1/k;Lm2/r;I)V", "Lmh1/k$a$b;", "screenData", "f", "(Lmh1/k$a$b;Lm2/r;I)V", "Lmh1/k$a;", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    public static final void f(final k.a.Screen screen, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1066732679);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(screen) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1066732679, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documentsdeletion.DocumentsDeletionContent (DocumentsDeletionScreen.kt:33)");
            }
            q0.g(false, screen.d(), rVarH, 0, 1);
            cb4.i dialogVMSAdapter = screen.getDialogVMSAdapter();
            if (dialogVMSAdapter == null) {
                rVarH.X(1389456864);
            } else {
                rVarH.X(-93726143);
                dialogVMSAdapter.b(rVarH, 0);
            }
            rVarH.R();
            rVar2 = rVarH;
            i50.s.r(screen.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1432052602, true, new er.q() { // from class: mh1.d
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.g(screen, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: mh1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.j(screen, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(final k.a.Screen screen, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1432052602, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documentsdeletion.DocumentsDeletionContent.<anonymous>.<anonymous> (DocumentsDeletionScreen.kt:41)");
            }
            f3.m mVarD = androidx.compose.foundation.layout.d.d(t70.s.n(a3.l(f3.m.INSTANCE, d3Var), rVar, 0), 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            d3 d3VarI = a3.i(0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
            boolean zG = rVar.G(screen);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: mh1.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h.h(screen, (f1.q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(mVarD, null, d3VarI, false, null, null, null, false, null, (er.l) objE, rVar, 0, 506);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(k.a.Screen screen, f1.q0 q0Var) {
        List<DefaultSingleCardData> listC = screen.c();
        int size = listC.size();
        for (int i15 = 0; i15 < size; i15++) {
            final DefaultSingleCardData defaultSingleCardData = listC.get(i15);
            f1.q0.c(q0Var, null, null, y2.m.b(-61538645, true, new er.q() { // from class: mh1.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.i(defaultSingleCardData, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(DefaultSingleCardData defaultSingleCardData, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-61538645, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documentsdeletion.DocumentsDeletionContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DocumentsDeletionScreen.kt:53)");
            }
            h0.v(defaultSingleCardData, null, rVar, 0, 2);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(k.a.Screen screen, int i15, p076m2.r rVar, int i16) {
        f(screen, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void k(final k kVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-5891494);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(kVar) : rVarH.G(kVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-5891494, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documentsdeletion.DocumentsDeletionScreen (DocumentsDeletionScreen.kt:23)");
            }
            k.a aVarL = l(m7.b.c(kVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarL instanceof k.a.Screen) {
                rVarH.X(-1366751207);
                f((k.a.Screen) aVarL, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarL instanceof k.a.Error)) {
                    rVarH.X(-1366753725);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1366747870);
                ((k.a.Error) aVarL).getErrorVMSAdapter().b(rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: mh1.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.m(kVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final k.a l(f6<? extends k.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(k kVar, int i15, p076m2.r rVar, int i16) {
        k(kVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
