package i82;

import cb4.DialogData;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import p7.CreationExtras;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln82/a;", "colorScheme", "Lkotlin/Function0;", "Loq/i0;", "navResult", ip.a.f96138c, "(Ln82/a;Ler/a;Lm2/r;I)V", "G", "(Ler/a;Lm2/r;I)V", "gios_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class w0 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.a implements er.a<oq.i0> {
        a(Object obj) {
            super(0, obj, f00.s.class, "pop", "pop()Z", 8);
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            c();
            return oq.i0.f148189a;
        }

        public final void c() {
            ((f00.s) this.f66376a).c();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements er.l<c92.a, oq.i0> {
        b(Object obj) {
            super(1, obj, b92.y.class, "openBottomSheet", "openBottomSheet(Lpl/gov/coi/mobywatel/feature/gios/presentation/reportviolationwizard/bottomsheet/BottomSheetAction;)V", 0);
        }

        public final void E(c92.a aVar) {
            ((b92.y) this.f66391b).q9(aVar);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(c92.a aVar) {
            E(aVar);
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class c extends fr.q implements er.l<dx3.a, oq.i0> {
        c(Object obj) {
            super(1, obj, b92.y.class, "showImagePreview", "showImagePreview(Lpl/gov/coi/mobywatel/segment/imagepreview/contract/ImagePreviewData;)V", 0);
        }

        public final void E(dx3.a aVar) {
            ((b92.y) this.f66391b).s9(aVar);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(dx3.a aVar) {
            E(aVar);
            return oq.i0.f148189a;
        }
    }

    public static final void D(final n82.a aVar, final er.a<oq.i0> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1893679285);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1893679285, i16, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.GiosNavContent (GiosNavContent.kt:34)");
            }
            p076m2.d0.c(n82.c.c().d(aVar), y2.m.d(94766453, true, new er.p() { // from class: i82.u
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w0.E(aVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: i82.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w0.F(aVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(er.a aVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(94766453, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.GiosNavContent.<anonymous> (GiosNavContent.kt:38)");
            }
            G(aVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(n82.a aVar, er.a aVar2, int i15, p076m2.r rVar, int i16) {
        D(aVar, aVar2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void G(final er.a<oq.i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(416252790);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(416252790, i16, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.GiosNavGraph (GiosNavContent.kt:45)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            o oVar = o.f90190a;
            boolean zG = rVarH.G(sVarJ) | ((i16 & 14) == 4);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: i82.w
                    @Override // er.l
                    public final Object b(Object obj) {
                        return w0.H(aVar, sVarJ, (p136y9.d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, oVar, (er.l) objE, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: i82.x
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w0.h0(aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final oq.i0 H(final er.a aVar, final f00.s sVar, p136y9.d1 d1Var) {
        f00.r.u(d1Var, o.f90190a, null, y2.m.b(1410975829, true, new er.r() { // from class: i82.y
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return w0.I(aVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, s.d.f90223b, null, y2.m.b(-387434868, true, new er.r() { // from class: i82.z
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return w0.K(sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, q.f90199a, null, y2.m.b(2084345165, true, new er.r() { // from class: i82.a0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return w0.S(sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, n.f90185a, null, y2.m.b(261157902, true, new er.r() { // from class: i82.b0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return w0.V(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, r.f90207a, null, y2.m.b(-1562029361, true, new er.r() { // from class: i82.c0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return w0.Y(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m.f90180a, null, y2.m.b(909750672, true, new er.r() { // from class: i82.d0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return w0.b0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, p.f90194a, new f00.g0.Dialog(null, 1, 0 == true ? 1 : 0), y2.m.b(-913436591, true, new er.r() { // from class: i82.f0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return w0.e0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(final er.a aVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1410975829, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.GiosNavGraph.<anonymous>.<anonymous>.<anonymous> (GiosNavContent.kt:52)");
        }
        androidx.p016lifecycle.y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        q82.l lVar = (q82.l) q7.d.c(fr.q0.c(q82.l.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<q82.a.b> bVarY1 = lVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: i82.n0
                @Override // er.l
                public final Object b(Object obj) {
                    return w0.J(aVar, sVar, (q82.a.b) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        q82.i.f(lVar, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(er.a aVar, f00.s sVar, q82.a.b bVar) {
        if (fr.t.c(bVar, q82.a.b.C4118a.f165299a)) {
            aVar.a();
        } else if (bVar instanceof q82.a.b.GoToWizard) {
            f00.s.l(sVar, s.d.f90223b, ((q82.a.b.GoToWizard) bVar).getIntroData(), null, 4, null);
        } else {
            if (!(bVar instanceof q82.a.b.ShowReportConfirmationDialog)) {
                throw new oq.p();
            }
            f00.s.l(sVar, p.f90194a, ((q82.a.b.ShowReportConfirmationDialog) bVar).getDialogData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-387434868, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.GiosNavGraph.<anonymous>.<anonymous>.<anonymous> (GiosNavContent.kt:77)");
        }
        f00.r.o(wVar, fr.q0.c(b92.y.class), sVar.g(s.d.f90223b), y2.m.d(-1224133955, true, new er.q() { // from class: i82.j0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return w0.L(aVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y2.m.d(-2135911393, true, new er.q() { // from class: i82.k0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return w0.N(sVar, (b92.y) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(final er.a aVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1224133955, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.GiosNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GiosNavContent.kt:82)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: i82.s0
                @Override // er.l
                public final Object b(Object obj) {
                    return w0.M(aVar, sVar, (b92.d.c) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(er.a aVar, f00.s sVar, b92.d.c cVar) {
        if (fr.t.c(cVar, b92.d.c.b.f17615a)) {
            aVar.a();
        } else if (cVar instanceof b92.d.c.ToOutro) {
            f00.s.l(sVar, q.f90199a, ((b92.d.c.ToOutro) cVar).getReportNumber(), null, 4, null);
        } else if (cVar instanceof b92.d.c.ShowExitDialog) {
            f00.s.l(sVar, p.f90194a, ((b92.d.c.ShowExitDialog) cVar).getDialogData(), null, 4, null);
        } else if (cVar instanceof b92.d.c.ShowImagePreview) {
            f00.s.l(sVar, r.f90207a, ((b92.d.c.ShowImagePreview) cVar).getData(), null, 4, null);
        } else {
            if (!fr.t.c(cVar, b92.d.c.e.f17618a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, n.f90185a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(final f00.s sVar, final b92.y yVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2135911393, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.GiosNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GiosNavContent.kt:110)");
        }
        b92.t.h(yVar, y2.m.d(91413251, true, new er.p() { // from class: i82.p0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return w0.O(sVar, yVar, (p076m2.r) obj, ((Integer) obj2).intValue());
            }
        }, rVar, 54), rVar, (i15 & 14) | 48, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(final f00.s sVar, final b92.y yVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(91413251, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.GiosNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GiosNavContent.kt:111)");
            }
            boolean zG = rVar.G(sVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(sVar);
                rVar.v(objE);
            }
            er.a aVar = (er.a) objE;
            boolean zG2 = rVar.G(yVar);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new b(yVar);
                rVar.v(objE2);
            }
            mr.g gVar = (mr.g) objE2;
            boolean zG3 = rVar.G(yVar);
            Object objE3 = rVar.E();
            if (zG3 || objE3 == p076m2.r.INSTANCE.a()) {
                objE3 = new c(yVar);
                rVar.v(objE3);
            }
            mr.g gVar2 = (mr.g) objE3;
            boolean zG4 = rVar.G(sVar);
            Object objE4 = rVar.E();
            if (zG4 || objE4 == p076m2.r.INSTANCE.a()) {
                objE4 = new er.l() { // from class: i82.t0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return w0.P(sVar, (jb4.b) obj);
                    }
                };
                rVar.v(objE4);
            }
            er.l lVar = (er.l) objE4;
            boolean zG5 = rVar.G(sVar);
            Object objE5 = rVar.E();
            if (zG5 || objE5 == p076m2.r.INSTANCE.a()) {
                objE5 = new er.l() { // from class: i82.u0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return w0.Q(sVar, (DialogData) obj);
                    }
                };
                rVar.v(objE5);
            }
            er.l lVar2 = (er.l) objE5;
            er.l lVar3 = (er.l) gVar;
            er.l lVar4 = (er.l) gVar2;
            boolean zG6 = rVar.G(yVar);
            Object objE6 = rVar.E();
            if (zG6 || objE6 == p076m2.r.INSTANCE.a()) {
                objE6 = new er.a() { // from class: i82.v0
                    @Override // er.a
                    public final Object a() {
                        return w0.R(yVar);
                    }
                };
                rVar.v(objE6);
            }
            z1.B(aVar, lVar, lVar2, yVar, lVar3, lVar4, (er.a) objE6, yVar, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P(f00.s sVar, jb4.b bVar) {
        f00.s.l(sVar, m.f90180a, bVar, null, 4, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q(f00.s sVar, DialogData dialogData) {
        f00.s.l(sVar, p.f90194a, dialogData, null, 4, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(b92.y yVar) {
        yVar.V7(b92.d.g.f17623a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S(f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2084345165, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.GiosNavGraph.<anonymous>.<anonymous>.<anonymous> (GiosNavContent.kt:137)");
        }
        f00.r.o(wVar, fr.q0.c(z82.l.class), sVar.g(q.f90199a), y2.m.d(1247646078, true, new er.q() { // from class: i82.i0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return w0.T(aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), i82.c.f90131a.c(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T(final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1247646078, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.GiosNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GiosNavContent.kt:142)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: i82.t
                @Override // er.l
                public final Object b(Object obj) {
                    return w0.U(aVar, (z82.b) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(er.a aVar, z82.b bVar) {
        if (!(bVar instanceof z82.b.a)) {
            throw new oq.p();
        }
        aVar.a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(261157902, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.GiosNavGraph.<anonymous>.<anonymous>.<anonymous> (GiosNavContent.kt:153)");
        }
        f00.r.n(wVar, fr.q0.c(o82.k.class), y2.m.d(-103543776, true, new er.q() { // from class: i82.h0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return w0.W(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), i82.c.f90131a.d(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-103543776, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.GiosNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GiosNavContent.kt:157)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: i82.e0
                @Override // er.l
                public final Object b(Object obj) {
                    return w0.X(sVar, (o82.b) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X(f00.s sVar, o82.b bVar) {
        if (bVar instanceof o82.b.a) {
            sVar.c();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1562029361, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.GiosNavGraph.<anonymous>.<anonymous>.<anonymous> (GiosNavContent.kt:168)");
        }
        r rVar2 = r.f90207a;
        f00.r.r(wVar, rVar2, sVar.g(rVar2), y2.m.d(-1830454763, true, new er.q() { // from class: i82.g0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return w0.Z(sVar, (dx3.c) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z(final f00.s sVar, dx3.c cVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1830454763, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.GiosNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GiosNavContent.kt:173)");
        }
        xw.b<dx3.c.a> bVarY1 = cVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: i82.o0
                @Override // er.l
                public final Object b(Object obj) {
                    return w0.a0(sVar, (dx3.c.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a0(f00.s sVar, dx3.c.a aVar) {
        if (!fr.t.c(aVar, dx3.c.a.C1047a.f45490a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(909750672, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.GiosNavGraph.<anonymous>.<anonymous>.<anonymous> (GiosNavContent.kt:183)");
        }
        m mVar = m.f90180a;
        f00.r.r(wVar, mVar, sVar.g(mVar), y2.m.d(1801126193, true, new er.q() { // from class: i82.m0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return w0.c0(sVar, (hb4.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c0(final f00.s sVar, hb4.b bVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1801126193, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.GiosNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GiosNavContent.kt:188)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: i82.r0
                @Override // er.l
                public final Object b(Object obj) {
                    return w0.d0(sVar, (hb4.b.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d0(f00.s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-913436591, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.GiosNavGraph.<anonymous>.<anonymous>.<anonymous> (GiosNavContent.kt:201)");
        }
        p pVar = p.f90194a;
        f00.r.r(wVar, pVar, sVar.g(pVar), y2.m.d(-1871750244, true, new er.q() { // from class: i82.l0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return w0.f0(sVar, (cb4.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f0(final f00.s sVar, cb4.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1871750244, i15, -1, "pl.gov.coi.mobywatel.feature.gios.presentation.GiosNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GiosNavContent.kt:206)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: i82.q0
                @Override // er.l
                public final Object b(Object obj) {
                    return w0.g0(sVar, (cb4.f.a) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(bVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g0(f00.s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h0(er.a aVar, int i15, p076m2.r rVar, int i16) {
        G(aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
