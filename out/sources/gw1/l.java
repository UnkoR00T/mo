package gw1;

import android.graphics.Bitmap;
import d1.a3;
import d1.d3;
import d1.m3;
import d1.q3;
import d1.r3;
import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import n50.DefaultSingleCardData;
import o20.BaseDocumentData;
import p036e4.w0;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r0;
import p076m2.s0;
import p088nul.q0;
import w0.f3;
import w0.u2;
import wv1.DynamicDocumentBottomSheetData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lgw1/d;", "viewModel", "Loq/i0;", "p", "(Lgw1/d;Lm2/r;I)V", "Lgw1/d$a;", "screenData", "Li70/p;", "snackBarState", "h", "(Lgw1/d$a;Li70/p;Lm2/r;I)V", "Lgw1/d$a$b;", "j", "(Lgw1/d$a$b;Li70/p;Lm2/r;I)V", "dynamicdocument_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"gw1/l$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d.a.b f77946a;

        public a(d.a.b bVar) {
            this.f77946a = bVar;
        }

        @Override // p076m2.r0
        public void j() {
            this.f77946a.e().a();
        }
    }

    public static final void h(final d.a aVar, final i70.p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1504549523);
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
                p076m2.t.o(1504549523, i16, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.main.DynamicMultiDocumentContent (DynamicMultiDocumentScreen.kt:51)");
            }
            if (fr.t.c(aVar, d.a.C1765a.f77906a)) {
                rVarH.X(-1531880956);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVar instanceof d.a.b)) {
                    rVarH.X(-1531882988);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1531878435);
                j((d.a.b) aVar, pVar, rVarH, i16 & 126);
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
            d5VarM.a(new er.p() { // from class: gw1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.i(aVar, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(d.a aVar, i70.p pVar, int i15, p076m2.r rVar, int i16) {
        h(aVar, pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void j(final d.a.b bVar, final i70.p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(33204626);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(bVar) : rVarH.G(bVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        int i17 = i16;
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(33204626, i17, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.main.DynamicMultiDocumentInitialized (DynamicMultiDocumentScreen.kt:65)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            i70.m.d(alVar, pVar, bVar.e(), null, null, rVarH, (i17 & 112) | 6, 24);
            oq.i0 i0Var = oq.i0.f148189a;
            boolean z15 = (i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(bVar));
            Object objE2 = rVarH.E();
            if (z15 || objE2 == companion.a()) {
                objE2 = new er.l() { // from class: gw1.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l.k(bVar, (s0) obj);
                    }
                };
                rVarH.v(objE2);
            }
            Function0.a(i0Var, (er.l) objE2, rVarH, 6);
            final f3 f3VarB = u2.b(0, rVarH, 0, 1);
            g30.m.j(bVar.getBottomSheetData(), bVar.getBaseScaffoldData(), 0.0f, f3VarB, y2.m.d(-482775659, true, new er.p() { // from class: gw1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.l(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, y2.m.d(-1203695081, true, new er.p() { // from class: gw1.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.m(bVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(892243931, true, new er.q() { // from class: gw1.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.n(bVar, f3VarB, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 14180352 | ModalBottomSheetData.f70192e | (BaseScaffoldData.f89350g << 3), 36);
            q0.g(false, bVar.a(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gw1.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.o(bVar, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 k(d.a.b bVar, s0 s0Var) {
        return new a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-482775659, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.main.DynamicMultiDocumentInitialized.<anonymous> (DynamicMultiDocumentScreen.kt:85)");
            }
            i70.d.d(alVar, pVar, false, rVar, 6, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(d.a.b bVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1203695081, i15, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.main.DynamicMultiDocumentInitialized.<anonymous> (DynamicMultiDocumentScreen.kt:88)");
            }
            DynamicDocumentBottomSheetData bottomSheetContentData = bVar.getBottomSheetContentData();
            if (bottomSheetContentData == null) {
                rVar.X(-598153577);
            } else {
                rVar.X(-598153576);
                Bitmap bitmap = bottomSheetContentData.getBitmap();
                if (bitmap == null) {
                    rVar.X(1108737638);
                } else {
                    rVar.X(1108737639);
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
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(d.a.b bVar, f3 f3Var, d3 d3Var, p076m2.r rVar, int i15) {
        int i16 = (i15 & 6) == 0 ? i15 | (rVar.W(d3Var) ? 4 : 2) : i15;
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(892243931, i16, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.main.DynamicMultiDocumentInitialized.<anonymous> (DynamicMultiDocumentScreen.kt:99)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(mVarL, aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarP);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            y30.n.Switch controllerData = bVar.getControllerData();
            if (controllerData == null) {
                rVar.X(-2090591622);
            } else {
                rVar.X(-2090591621);
                f3.m mVarR = a3.r(companion, 0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
                w0 w0VarB = m3.b(iVar.j(), companion2.l(), rVar, 0);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT2 = rVar.t();
                f3.m mVarE2 = f3.j.e(rVar, mVarR);
                er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
                if (rVar.l() == null) {
                    p076m2.m.d();
                }
                rVar.K();
                if (rVar.getInserting()) {
                    rVar.H(aVarB2);
                } else {
                    rVar.u();
                }
                p076m2.r rVarC2 = n6.c(rVar);
                n6.i(rVarC2, w0VarB, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                q3 q3Var = q3.f39261a;
                y30.m.g(controllerData, rVar, y30.n.Switch.f223693f);
                rVar.x();
                oq.i0 i0Var2 = oq.i0.f148189a;
            }
            rVar.R();
            if (bVar instanceof d.a.b.SingleDocument) {
                rVar.X(-1729993870);
                f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), f3Var, rVar, 6, 0);
                w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT3 = rVar.t();
                f3.m mVarE3 = f3.j.e(rVar, mVarS);
                er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
                if (rVar.l() == null) {
                    p076m2.m.d();
                }
                rVar.K();
                if (rVar.getInserting()) {
                    rVar.H(aVarB3);
                } else {
                    rVar.u();
                }
                p076m2.r rVarC3 = n6.c(rVar);
                n6.i(rVarC3, w0VarA2, companion3.d());
                n6.i(rVarC3, e0VarT3, companion3.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
                n6.g(rVarC3, companion3.a());
                n6.i(rVarC3, mVarE3, companion3.e());
                o20.i.p(((d.a.b.SingleDocument) bVar).getDocumentData(), null, rVar, BaseDocumentData.f140741h, 2);
                rVar.x();
                rVar.R();
            } else {
                if (!(bVar instanceof d.a.b.DocumentsList)) {
                    rVar.X(-1729996117);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(-1729983353);
                w0 w0VarA3 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
                int iHashCode4 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT4 = rVar.t();
                f3.m mVarE4 = f3.j.e(rVar, companion);
                er.a<androidx.compose.ui.node.c> aVarB4 = companion3.b();
                if (rVar.l() == null) {
                    p076m2.m.d();
                }
                rVar.K();
                if (rVar.getInserting()) {
                    rVar.H(aVarB4);
                } else {
                    rVar.u();
                }
                p076m2.r rVarC4 = n6.c(rVar);
                n6.i(rVarC4, w0VarA3, companion3.d());
                n6.i(rVarC4, e0VarT4, companion3.f());
                n6.i(rVarC4, Integer.valueOf(iHashCode4), companion3.c());
                n6.g(rVarC4, companion3.a());
                n6.i(rVarC4, mVarE4, companion3.e());
                f3.m mVarR2 = a3.r(d1.h0.b(i0Var, t70.i.S(companion, f3Var, rVar, 6, 0), 1.0f, false, 2, null), 0.0f, 0.0f, 0.0f, aVar.b(rVar, i17).getSpacing200(), 7, null);
                w0 w0VarA4 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
                int iHashCode5 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT5 = rVar.t();
                f3.m mVarE5 = f3.j.e(rVar, mVarR2);
                er.a<androidx.compose.ui.node.c> aVarB5 = companion3.b();
                if (rVar.l() == null) {
                    p076m2.m.d();
                }
                rVar.K();
                if (rVar.getInserting()) {
                    rVar.H(aVarB5);
                } else {
                    rVar.u();
                }
                p076m2.r rVarC5 = n6.c(rVar);
                n6.i(rVarC5, w0VarA4, companion3.d());
                n6.i(rVarC5, e0VarT5, companion3.f());
                n6.i(rVarC5, Integer.valueOf(iHashCode5), companion3.c());
                n6.g(rVarC5, companion3.a());
                n6.i(rVarC5, mVarE5, companion3.e());
                rVar.X(-1673626210);
                d.a.b.DocumentsList documentsList = (d.a.b.DocumentsList) bVar;
                for (DefaultSingleCardData defaultSingleCardData : documentsList.g()) {
                    r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), rVar, 0);
                    n50.h0.v(defaultSingleCardData, null, rVar, 0, 2);
                }
                rVar.R();
                rVar.x();
                f3.m.Companion companion4 = f3.m.INSTANCE;
                k70.a aVar2 = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar2.b(rVar, i18).getSpacing200()), rVar, 0);
                h30.q.p(documentsList.getUpdateButtonData(), false, null, rVar, 0, 6);
                r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar2.b(rVar, i18).getSpacing200()), rVar, 0);
                rVar.x();
                rVar.R();
            }
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(d.a.b bVar, i70.p pVar, int i15, p076m2.r rVar, int i16) {
        j(bVar, pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void p(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(865998148);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(865998148, i16, -1, "pl.gov.coi.mobywatel.feature.dynamicdocument.presentation.multidocument.main.DynamicMultiDocumentScreen (DynamicMultiDocumentScreen.kt:35)");
            }
            f6 f6VarC = m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(dVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            h(q(f6VarC), r(f6VarB), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gw1.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.s(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a q(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p r(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(d dVar, int i15, p076m2.r rVar, int i16) {
        p(dVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
