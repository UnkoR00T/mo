package iw1;

import android.graphics.Bitmap;
import d1.a3;
import d1.d3;
import d1.e0;
import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import o20.BaseDocumentData;
import oq.i0;
import p036e4.w0;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import w0.f3;
import w0.u2;
import wv1.DynamicDocumentBottomSheetData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Liw1/c;", "viewModel", "Loq/i0;", "n", "(Liw1/c;Lm2/r;I)V", "Liw1/c$a;", "screenData", "Li70/p;", "snackBarState", "g", "(Liw1/c$a;Li70/p;Lm2/r;I)V", "Liw1/c$a$b;", "i", "(Liw1/c$a$b;Li70/p;Lm2/r;I)V", "dynamicdocument_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {
    public static final void g(final c.a aVar, final i70.p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1916192340);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1916192340, i16, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.single.DynamicMultiDocumentSingleContent (DynamicMultiDocumentSingleScreen.kt:43)");
            }
            if (fr.t.c(aVar, c.a.C2283a.f97295a)) {
                rVarH.X(-1080124475);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVar instanceof c.a.Initialized)) {
                    rVarH.X(-1080126681);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1080121756);
                i((c.a.Initialized) aVar, pVar, rVarH, i16 & 126);
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
            d5VarM.a(new er.p() { // from class: iw1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.h(aVar, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(c.a aVar, i70.p pVar, int i15, p076m2.r rVar, int i16) {
        g(aVar, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void i(final c.a.Initialized initialized, final i70.p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1631963741);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1631963741, i16, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.single.DynamicMultiDocumentSingleInitialized (DynamicMultiDocumentSingleScreen.kt:57)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            i70.m.d(alVar, pVar, initialized.d(), null, null, rVarH, (i16 & 112) | 6, 24);
            final f3 f3VarB = u2.b(0, rVarH, 0, 1);
            g30.m.j(initialized.getBottomSheetData(), initialized.getBaseDocumentData().getBaseScaffoldData(), 0.0f, f3VarB, y2.m.d(-2040252314, true, new er.p() { // from class: iw1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.j(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, y2.m.d(-1264004760, true, new er.p() { // from class: iw1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.k(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(2109007916, true, new er.q() { // from class: iw1.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return j.l(f3VarB, initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 14180352 | ModalBottomSheetData.f70192e | (BaseScaffoldData.f89350g << 3), 36);
            rVarH = rVarH;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: iw1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.m(initialized, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2040252314, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.single.DynamicMultiDocumentSingleInitialized.<anonymous> (DynamicMultiDocumentSingleScreen.kt:71)");
            }
            i70.d.d(alVar, pVar, false, rVar, 6, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(c.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1264004760, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.single.DynamicMultiDocumentSingleInitialized.<anonymous> (DynamicMultiDocumentSingleScreen.kt:74)");
            }
            DynamicDocumentBottomSheetData bottomSheetContentData = initialized.getBottomSheetContentData();
            if (bottomSheetContentData == null) {
                rVar.X(-1987470938);
            } else {
                rVar.X(-1987470937);
                Bitmap bitmap = bottomSheetContentData.getBitmap();
                if (bitmap == null) {
                    rVar.X(1449807797);
                } else {
                    rVar.X(1449807798);
                    a70.b.b(bitmap, bottomSheetContentData.getButtonText(), bottomSheetContentData.c(), rVar, 0);
                }
                rVar.R();
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(f3 f3Var, c.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2109007916, i16, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.single.DynamicMultiDocumentSingleInitialized.<anonymous> (DynamicMultiDocumentSingleScreen.kt:85)");
            }
            f3.m mVarS = t70.i.S(a3.l(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var), f3Var, rVar, 0, 0);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(mVarS, aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing100(), aVar.b(rVar, i17).getSpacing200(), 0.0f, 8, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            o20.i.p(initialized.getBaseDocumentData(), null, rVar, BaseDocumentData.f140741h, 2);
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
    public static final i0 m(c.a.Initialized initialized, i70.p pVar, int i15, p076m2.r rVar, int i16) {
        i(initialized, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void n(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-291787259);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-291787259, i16, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.single.DynamicMultiDocumentSingleScreen (DynamicMultiDocumentSingleScreen.kt:27)");
            }
            f6 f6VarC = m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(cVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            g(o(f6VarC), p(f6VarB), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: iw1.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return j.q(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final c.a o(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p p(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(c cVar, int i15, p076m2.r rVar, int i16) {
        n(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
