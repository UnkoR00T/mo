package sy2;

import d1.a3;
import d1.d3;
import i50.BaseScaffoldData;
import o20.BaseDocumentData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a1\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e²\u0006\f\u0010\u0006\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lsy2/q;", "viewModel", "Loq/i0;", "k", "(Lsy2/q;Lm2/r;I)V", "Lsy2/q$a$a;", "data", "Li70/p;", "snackBarState", "Lkotlin/Function0;", "onSnackBarHidden", "f", "(Lsy2/q$a$a;Li70/p;Ler/a;Lm2/r;II)V", "Lsy2/q$a;", "pwzcard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class w {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<oq.i0> {
        a(Object obj) {
            super(0, obj, q.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((q) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d A[PHI: r2 r3
      0x007d: PHI (r2v16 int) = (r2v9 int), (r2v6 int), (r2v17 int) binds: [B:50:0x0088, B:44:0x0079, B:45:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r3v14 i70.p) = (r3v5 i70.p), (r3v2 i70.p), (r3v2 i70.p) binds: [B:50:0x0088, B:44:0x0079, B:45:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:68:0x0144  */
    /* JADX WARN: Code duplicated, block: B:70:0x014a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0155  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void f(final q.a.DocumentView documentView, i70.p pVar, er.a<oq.i0> aVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        i70.p pVar2;
        er.a<oq.i0> aVar2;
        boolean z15;
        final i70.p pVar3;
        final er.a<oq.i0> aVar3;
        d5 d5VarM;
        Object objE;
        i70.p pVar4;
        er.a<oq.i0> aVar4;
        cb4.i dialogVMS;
        Object objE2;
        p076m2.r rVarH = rVar.h(25385599);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(documentView) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            if ((i16 & 2) == 0) {
                pVar2 = pVar;
                int i18 = rVarH.G(pVar2) ? 32 : 16;
                i17 |= i18;
            } else {
                pVar2 = pVar;
            }
            i17 |= i18;
        } else {
            pVar2 = pVar;
        }
        int i19 = i16 & 4;
        if (i19 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                aVar2 = aVar;
                i17 |= rVarH.G(aVar2) ? 256 : 128;
            }
            if ((i17 & 147) != 146) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0 || rVarH.Q()) {
                    if ((i16 & 2) != 0) {
                        pVar2 = i70.p.a.f89857a;
                        i17 &= -113;
                    }
                    if (i19 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new er.a() { // from class: sy2.s
                                @Override // er.a
                                public final Object a() {
                                    return w.g();
                                }
                            };
                            rVarH.v(objE);
                        }
                        pVar4 = pVar2;
                        aVar4 = (er.a) objE;
                    }
                    rVarH.y();
                    if (p076m2.t.k()) {
                        p076m2.t.o(25385599, i17, -1, "pl.gov.coi.mobywatel.feature.pwzcard.presentation.screen.main.PwzCardDocumentContent (PwzCardScreen.kt:50)");
                    }
                    dialogVMS = documentView.getDialogVMS();
                    if (dialogVMS == null) {
                        rVarH.X(348321466);
                    } else {
                        rVarH.X(-1374237145);
                        dialogVMS.b(rVarH, 0);
                    }
                    rVarH.R();
                    objE2 = rVarH.E();
                    if (objE2 == p076m2.r.INSTANCE.a()) {
                        objE2 = new al();
                        rVarH.v(objE2);
                    }
                    final al alVar = (al) objE2;
                    p088nul.q0.g(false, documentView.c(), rVarH, 0, 1);
                    i70.m.d(alVar, pVar4, aVar4, null, null, rVarH, (i17 & 112) | 6 | (i17 & 896), 24);
                    final i70.p pVar5 = pVar4;
                    er.a<oq.i0> aVar5 = aVar4;
                    i50.s.r(documentView.getScaffoldData(), null, y2.m.d(-128533687, true, new er.p() { // from class: sy2.t
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return w.h(alVar, pVar5, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-767629710, true, new er.q() { // from class: sy2.u
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return w.i(documentView, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
                    rVarH = rVarH;
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    pVar3 = pVar5;
                    aVar3 = aVar5;
                } else {
                    rVarH.O();
                    if ((i16 & 2) != 0) {
                        i17 &= -113;
                    }
                }
                aVar4 = aVar2;
                pVar4 = pVar2;
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(25385599, i17, -1, "pl.gov.coi.mobywatel.feature.pwzcard.presentation.screen.main.PwzCardDocumentContent (PwzCardScreen.kt:50)");
                }
                dialogVMS = documentView.getDialogVMS();
                if (dialogVMS == null) {
                    rVarH.X(348321466);
                } else {
                    rVarH.X(-1374237145);
                    dialogVMS.b(rVarH, 0);
                }
                rVarH.R();
                objE2 = rVarH.E();
                if (objE2 == p076m2.r.INSTANCE.a()) {
                    objE2 = new al();
                    rVarH.v(objE2);
                }
                final al alVar2 = (al) objE2;
                p088nul.q0.g(false, documentView.c(), rVarH, 0, 1);
                i70.m.d(alVar2, pVar4, aVar4, null, null, rVarH, (i17 & 112) | 6 | (i17 & 896), 24);
                final i70.p pVar6 = pVar4;
                er.a<oq.i0> aVar6 = aVar4;
                i50.s.r(documentView.getScaffoldData(), null, y2.m.d(-128533687, true, new er.p() { // from class: sy2.t
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return w.h(alVar2, pVar6, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-767629710, true, new er.q() { // from class: sy2.u
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return w.i(documentView, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
                rVarH = rVarH;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                pVar3 = pVar6;
                aVar3 = aVar6;
            } else {
                rVarH.O();
                pVar3 = pVar2;
                aVar3 = aVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: sy2.v
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return w.j(documentView, pVar3, aVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        aVar2 = aVar;
        if ((i17 & 147) != 146) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if ((i16 & 2) != 0) {
                    pVar2 = i70.p.a.f89857a;
                    i17 &= -113;
                }
                if (i19 != 0) {
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = new er.a() { // from class: sy2.s
                            @Override // er.a
                            public final Object a() {
                                return w.g();
                            }
                        };
                        rVarH.v(objE);
                    }
                    pVar4 = pVar2;
                    aVar4 = (er.a) objE;
                } else {
                    aVar4 = aVar2;
                    pVar4 = pVar2;
                }
            } else {
                if ((i16 & 2) != 0) {
                    pVar2 = i70.p.a.f89857a;
                    i17 &= -113;
                }
                if (i19 != 0) {
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = new er.a() { // from class: sy2.s
                            @Override // er.a
                            public final Object a() {
                                return w.g();
                            }
                        };
                        rVarH.v(objE);
                    }
                    pVar4 = pVar2;
                    aVar4 = (er.a) objE;
                } else {
                    aVar4 = aVar2;
                    pVar4 = pVar2;
                }
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(25385599, i17, -1, "pl.gov.coi.mobywatel.feature.pwzcard.presentation.screen.main.PwzCardDocumentContent (PwzCardScreen.kt:50)");
            }
            dialogVMS = documentView.getDialogVMS();
            if (dialogVMS == null) {
                rVarH.X(348321466);
            } else {
                rVarH.X(-1374237145);
                dialogVMS.b(rVarH, 0);
            }
            rVarH.R();
            objE2 = rVarH.E();
            if (objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new al();
                rVarH.v(objE2);
            }
            final al alVar3 = (al) objE2;
            p088nul.q0.g(false, documentView.c(), rVarH, 0, 1);
            i70.m.d(alVar3, pVar4, aVar4, null, null, rVarH, (i17 & 112) | 6 | (i17 & 896), 24);
            final i70.p pVar7 = pVar4;
            er.a<oq.i0> aVar7 = aVar4;
            i50.s.r(documentView.getScaffoldData(), null, y2.m.d(-128533687, true, new er.p() { // from class: sy2.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.h(alVar3, pVar7, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-767629710, true, new er.q() { // from class: sy2.u
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return w.i(documentView, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            rVarH = rVarH;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            pVar3 = pVar7;
            aVar3 = aVar7;
        } else {
            rVarH.O();
            pVar3 = pVar2;
            aVar3 = aVar2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sy2.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.j(documentView, pVar3, aVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-128533687, i15, -1, "pl.gov.coi.mobywatel.feature.pwzcard.presentation.screen.main.PwzCardDocumentContent.<anonymous> (PwzCardScreen.kt:64)");
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
    public static final oq.i0 i(q.a.DocumentView documentView, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-767629710, i15, -1, "pl.gov.coi.mobywatel.feature.pwzcard.presentation.screen.main.PwzCardDocumentContent.<anonymous> (PwzCardScreen.kt:66)");
            }
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.d(f3.m.INSTANCE, 0.0f, 1, null), d3Var);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.g(), rVar, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
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
            o20.i.m(documentView.getBaseDocumentData(), rVar, BaseDocumentData.f140741h);
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
    public static final oq.i0 j(q.a.DocumentView documentView, i70.p pVar, er.a aVar, int i15, int i16, p076m2.r rVar, int i17) {
        f(documentView, pVar, aVar, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    public static final void k(final q qVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-353088371);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(qVar) : rVarH.G(qVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = true;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-353088371, i16, -1, "pl.gov.coi.mobywatel.feature.pwzcard.presentation.screen.main.PwzCardScreen (PwzCardScreen.kt:28)");
            }
            f6 f6VarC = m7.b.c(qVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(qVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVar2 = rVarH;
            q.a aVarL = l(f6VarC);
            if (fr.t.c(aVarL, q.a.c.f185831a)) {
                rVar2.X(-15497890);
                c60.b.b(rVar2, 0);
                rVar2.R();
            } else if (aVarL instanceof q.a.DocumentView) {
                rVar2.X(-15495716);
                q.a.DocumentView documentView = (q.a.DocumentView) aVarL;
                i70.p pVarM = m(f6VarB);
                if ((i16 & 14) != 4 && ((i16 & 8) == 0 || !rVar2.G(qVar))) {
                    z15 = false;
                }
                Object objE = rVar2.E();
                if (z15 || objE == p076m2.r.INSTANCE.a()) {
                    objE = new a(qVar);
                    rVar2.v(objE);
                }
                f(documentView, pVarM, (er.a) ((mr.g) objE), rVar2, 0, 0);
                rVar2 = rVar2;
                rVar2.R();
            } else {
                if (!(aVarL instanceof q.a.Error)) {
                    rVar2.X(-15499827);
                    rVar2.R();
                    throw new oq.p();
                }
                rVar2.X(-15489291);
                ((q.a.Error) aVarL).getErrorVMS().b(rVar2, 0);
                rVar2.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sy2.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.n(qVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final q.a l(f6<? extends q.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p m(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(q qVar, int i15, p076m2.r rVar, int i16) {
        k(qVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
