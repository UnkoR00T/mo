package o12;

import d1.r3;
import java.util.List;
import n30.CardListData;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lo12/f;", "viewModel", "Loq/i0;", "g", "(Lo12/f;Lm2/r;I)V", "Lo12/f$a$a;", "data", "k", "(Lo12/f$a$a;Lm2/r;I)V", "Lo12/f$a$b;", "e", "(Lo12/f$a$b;Lm2/r;I)V", "Lo12/f$a;", "state", "electronicdelivery_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    private static final void e(final f.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(466223883);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(initialized) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(466223883, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagedetails.epuap.EpuapMessageDetailsContent (EpuapMessageDetailsScreen.kt:48)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            k12.g.d(initialized.getMessageInitialized(), rVarH, 0);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            n50.h0.v(initialized.getPreviewSectionData(), null, rVarH, 0, 2);
            CardListData attachmentsCardListData = initialized.getAttachmentsCardListData();
            List<n50.k> listD = attachmentsCardListData != null ? attachmentsCardListData.d() : null;
            if (listD == null || listD.isEmpty()) {
                rVarH.X(-583720735);
            } else {
                rVarH.X(-581423232);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
                j70.h.g(null, null, initialized.getAttachmentsHeader(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
                CardListData attachmentsCardListData2 = initialized.getAttachmentsCardListData();
                if (attachmentsCardListData2 == null) {
                    rVarH = rVarH;
                    rVarH.X(-581083225);
                } else {
                    rVarH = rVarH;
                    rVarH.X(-581083224);
                    m30.i.d(attachmentsCardListData2, null, null, rVarH, 0, 6);
                }
                rVarH.R();
            }
            rVarH.R();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: o12.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.f(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(f.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        e(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void g(final f fVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1471885628);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(fVar) : rVarH.G(fVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1471885628, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagedetails.epuap.EpuapMessageDetailsScreen (EpuapMessageDetailsScreen.kt:24)");
            }
            final f.a aVarH = h(m7.b.c(fVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarH instanceof f.a.Initialized) {
                rVarH.X(1437855480);
                k12.k.d(((f.a.Initialized) aVarH).getMessageInitialized(), y2.m.d(-10499119, true, new er.q() { // from class: o12.g
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return k.i(aVarH, (d1.h0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVarH, 48);
                rVarH.R();
            } else if (fr.t.c(aVarH, f.a.c.f140329a)) {
                rVarH.X(1437861005);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarH instanceof f.a.Error)) {
                    rVarH.X(1437853063);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1437863227);
                k((f.a.Error) aVarH, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: o12.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.j(fVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final f.a h(f6<? extends f.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(f.a aVar, d1.h0 h0Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-10499119, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagedetails.epuap.EpuapMessageDetailsScreen.<anonymous> (EpuapMessageDetailsScreen.kt:30)");
            }
            e((f.a.Initialized) aVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(f fVar, int i15, p076m2.r rVar, int i16) {
        g(fVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void k(final f.a.Error error, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1447118273);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(error) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1447118273, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagedetails.epuap.MessageDetailsErrorScreen (EpuapMessageDetailsScreen.kt:41)");
            }
            error.getErrorVMS().b(rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: o12.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.l(error, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(f.a.Error error, int i15, p076m2.r rVar, int i16) {
        k(error, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
