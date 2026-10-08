package qb0;

import android.graphics.Bitmap;
import d1.d3;
import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import o20.BaseDocumentData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import sb0.DynamicDocumentBottomSheetData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Lqb0/p;", "viewModel", "Loq/i0;", "i", "(Lqb0/p;Lm2/r;I)V", "Lhb4/c;", "errorVMSAdapter", "s", "(Lhb4/c;Lm2/r;I)V", "Lqb0/p$a$a;", "data", "Li70/p;", "snackBarState", "Lkotlin/Function0;", "hideSnackBar", "m", "(Lqb0/p$a$a;Li70/p;Ler/a;Lm2/r;I)V", "Lqb0/p$a;", "state", "dynamicdocument_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class y {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<oq.i0> {
        a(Object obj) {
            super(0, obj, p.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((p) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    public static final void i(final p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-938694822);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(pVar) : rVarH.G(pVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = true;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-938694822, i16, -1, "pl.gov.coi.mjunior.feature.dynamicdocument.presentation.singledocument.DynamicDocumentScreen (DynamicDocumentScreen.kt:26)");
            }
            f6 f6VarC = m7.b.c(pVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(pVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            p.a aVarJ = j(f6VarC);
            if (aVarJ instanceof p.a.DynamicDocumentData) {
                rVarH.X(-142580213);
                p.a.DynamicDocumentData dynamicDocumentData = (p.a.DynamicDocumentData) aVarJ;
                i70.p pVarK = k(f6VarB);
                if ((i16 & 14) != 4 && ((i16 & 8) == 0 || !rVarH.G(pVar))) {
                    z15 = false;
                }
                Object objE = rVarH.E();
                if (z15 || objE == p076m2.r.INSTANCE.a()) {
                    objE = new a(pVar);
                    rVarH.v(objE);
                }
                m(dynamicDocumentData, pVarK, (er.a) ((mr.g) objE), rVarH, 0);
                rVarH.R();
            } else if (aVarJ instanceof p.a.c) {
                rVarH.X(-142574101);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarJ instanceof p.a.Error)) {
                    rVarH.X(-142583008);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-142572007);
                s(((p.a.Error) aVarJ).getError(), rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: qb0.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.l(pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final p.a j(f6<? extends p.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p k(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(p pVar, int i15, p076m2.r rVar, int i16) {
        i(pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void m(final p.a.DynamicDocumentData dynamicDocumentData, final i70.p pVar, final er.a<oq.i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1166854289);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(dynamicDocumentData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1166854289, i16, -1, "pl.gov.coi.mjunior.feature.dynamicdocument.presentation.singledocument.DynamicDocumentScreenContent (DynamicDocumentScreen.kt:57)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            i70.m.d(alVar, pVar, aVar, null, null, rVarH, (i16 & 112) | 6 | (i16 & 896), 24);
            i50.s.r(new BaseScaffoldData(null, null, null, null, null, null, 63, null), null, y2.m.d(147626681, true, new er.p() { // from class: qb0.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.n(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(262117410, true, new er.q() { // from class: qb0.s
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return y.o(dynamicDocumentData, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            cb4.i dialogVMSAdapter = dynamicDocumentData.getDialogVMSAdapter();
            if (dialogVMSAdapter == null) {
                rVarH.X(1710265642);
            } else {
                rVarH.X(-360472137);
                dialogVMSAdapter.b(rVarH, 0);
            }
            rVarH.R();
            p088nul.q0.g(false, dynamicDocumentData.d(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: qb0.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.r(dynamicDocumentData, pVar, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(147626681, i15, -1, "pl.gov.coi.mjunior.feature.dynamicdocument.presentation.singledocument.DynamicDocumentScreenContent.<anonymous> (DynamicDocumentScreen.kt:68)");
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
    public static final oq.i0 o(final p.a.DynamicDocumentData dynamicDocumentData, d3 d3Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(262117410, i15, -1, "pl.gov.coi.mjunior.feature.dynamicdocument.presentation.singledocument.DynamicDocumentScreenContent.<anonymous> (DynamicDocumentScreen.kt:74)");
            }
            g30.t.f(dynamicDocumentData.getBottomSheetData(), 0.0f, false, null, null, y2.m.d(-948032215, true, new er.p() { // from class: qb0.w
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.p(dynamicDocumentData, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), y2.m.d(1147803336, true, new er.p() { // from class: qb0.x
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.q(dynamicDocumentData, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, ModalBottomSheetData.f70192e | 1769472, 30);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(p.a.DynamicDocumentData dynamicDocumentData, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-948032215, i15, -1, "pl.gov.coi.mjunior.feature.dynamicdocument.presentation.singledocument.DynamicDocumentScreenContent.<anonymous>.<anonymous> (DynamicDocumentScreen.kt:77)");
            }
            DynamicDocumentBottomSheetData bottomSheetContentData = dynamicDocumentData.getBottomSheetContentData();
            if (bottomSheetContentData == null) {
                rVar.X(877268149);
            } else {
                rVar.X(877268150);
                Bitmap bitmap = bottomSheetContentData.getBitmap();
                if (bitmap == null) {
                    rVar.X(92208262);
                } else {
                    rVar.X(92208263);
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
    public static final oq.i0 q(p.a.DynamicDocumentData dynamicDocumentData, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1147803336, i15, -1, "pl.gov.coi.mjunior.feature.dynamicdocument.presentation.singledocument.DynamicDocumentScreenContent.<anonymous>.<anonymous> (DynamicDocumentScreen.kt:88)");
            }
            o20.i.m(dynamicDocumentData.getScreenData(), rVar, BaseDocumentData.f140741h);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(p.a.DynamicDocumentData dynamicDocumentData, i70.p pVar, er.a aVar, int i15, p076m2.r rVar, int i16) {
        m(dynamicDocumentData, pVar, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void s(final hb4.c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-621235745);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-621235745, i16, -1, "pl.gov.coi.mjunior.feature.dynamicdocument.presentation.singledocument.ErrorScreen (DynamicDocumentScreen.kt:45)");
            }
            cVar.b(rVarH, i16 & 14);
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: qb0.u
                    @Override // er.a
                    public final Object a() {
                        return y.t();
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
            d5VarM.a(new er.p() { // from class: qb0.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.u(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(hb4.c cVar, int i15, p076m2.r rVar, int i16) {
        s(cVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
