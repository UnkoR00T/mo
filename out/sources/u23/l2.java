package u23;

import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import x23.SetupData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\b\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lu23/g0;", "sharedVM", "Loq/i0;", "e0", "(Lu23/g0;Lm2/r;I)V", "Ly9/d1;", "Lf00/s;", "navigator", "X0", "(Ly9/d1;Lu23/g0;Lf00/s;)V", "sanitary_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l2 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f194769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f194770b;

        static {
            int[] iArr = new int[tt0.e.values().length];
            try {
                iArr[tt0.e.LOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[tt0.e.PRODUCT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f194769a = iArr;
            int[] iArr2 = new int[k23.c.values().length];
            try {
                iArr2[k23.c.SUPPLIER.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[k23.c.SELLER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f194770b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A0(f00.s sVar, g0 g0Var, z23.a.g gVar) {
        if (fr.t.c(gVar, z23.a.g.C6243a.f232465a)) {
            sVar.c();
        } else if (fr.t.c(gVar, z23.a.g.d.f232468a)) {
            f00.s.m(sVar, p080n23.r.f130887a, null, 2, null);
        } else if (gVar instanceof z23.a.g.DatePicker) {
            f00.s.l(sVar, p080n23.j.f130860a, ((z23.a.g.DatePicker) gVar).getData(), null, 4, null);
        } else if (gVar instanceof z23.a.g.TimePicker) {
            f00.s.l(sVar, p080n23.z.f130903a, ((z23.a.g.TimePicker) gVar).getData(), null, 4, null);
        } else if (gVar instanceof z23.a.g.ShowError) {
            f00.s.l(sVar, p080n23.m.f130870a, ((z23.a.g.ShowError) gVar).getErrorData(), null, 4, null);
        } else if (gVar instanceof z23.a.g.ShowImagePreview) {
            f00.s.l(sVar, p080n23.n.f130874a, ((z23.a.g.ShowImagePreview) gVar).getData(), null, 4, null);
        } else {
            if (!fr.t.c(gVar, z23.a.g.c.f232467a)) {
                throw new oq.p();
            }
            g0Var.K5();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B0(final g0 g0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1559874555, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:166)");
        }
        f00.r.o(wVar, fr.q0.c(r33.u.class), g0Var, y2.m.d(757275244, true, new er.q() { // from class: u23.z0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l2.C0(sVar, g0Var, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194780a.v(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C0(final f00.s sVar, final g0 g0Var, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(757275244, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:170)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u23.a2
                @Override // er.l
                public final Object b(Object obj) {
                    return l2.D0(sVar, g0Var, (r33.a.c) obj);
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
    public static final oq.i0 D0(f00.s sVar, g0 g0Var, r33.a.c cVar) {
        if (fr.t.c(cVar, r33.a.c.C4351a.f171354a)) {
            sVar.c();
        } else if (fr.t.c(cVar, r33.a.c.b.f171355a)) {
            g0Var.K5();
        } else {
            if (!fr.t.c(cVar, r33.a.c.C4352c.f171356a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, p080n23.t.f130891a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E0(final g0 g0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1469021956, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:187)");
        }
        f00.r.o(wVar, fr.q0.c(o33.t.class), g0Var, y2.m.d(2023346029, true, new er.q() { // from class: u23.c1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l2.F0(sVar, g0Var, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194780a.r(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F0(final f00.s sVar, final g0 g0Var, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2023346029, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:191)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u23.w1
                @Override // er.l
                public final Object b(Object obj) {
                    return l2.G0(sVar, g0Var, (o33.a.b) obj);
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
    public static final oq.i0 G0(f00.s sVar, g0 g0Var, o33.a.b bVar) {
        zx.c cVar;
        if (fr.t.c(bVar, o33.a.b.C3502a.f142058a)) {
            sVar.c();
        } else if (fr.t.c(bVar, o33.a.b.C3503b.f142059a)) {
            g0Var.K5();
        } else {
            if (!(bVar instanceof o33.a.b.GoToNextScreen)) {
                throw new oq.p();
            }
            int i15 = a.f194770b[((o33.a.b.GoToNextScreen) bVar).getBusinessSelection().ordinal()];
            if (i15 == 1) {
                cVar = p080n23.y.f130901a;
            } else {
                if (i15 != 2) {
                    throw new oq.p();
                }
                cVar = p080n23.w.f130897a;
            }
            f00.s.m(sVar, cVar, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H0(g0 g0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-202951171, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:211)");
        }
        f00.r.o(wVar, fr.q0.c(x23.s.class), new SetupData(k23.c.SELLER, g0Var), y2.m.d(-1005550482, true, new er.q() { // from class: u23.p0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l2.I0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194780a.q(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1005550482, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:218)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u23.n1
                @Override // er.l
                public final Object b(Object obj) {
                    return l2.J0(sVar, (x23.a.InterfaceC5771a) obj);
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
    public static final oq.i0 J0(f00.s sVar, x23.a.InterfaceC5771a interfaceC5771a) {
        zx.c cVar;
        if (fr.t.c(interfaceC5771a, x23.a.InterfaceC5771a.C5772a.f216609a)) {
            sVar.c();
        } else if (interfaceC5771a instanceof x23.a.InterfaceC5771a.GoToBusinessDetails) {
            int i15 = a.f194770b[((x23.a.InterfaceC5771a.GoToBusinessDetails) interfaceC5771a).getBusinessSelection().ordinal()];
            if (i15 == 1) {
                cVar = p080n23.y.f130901a;
            } else {
                if (i15 != 2) {
                    throw new oq.p();
                }
                cVar = p080n23.w.f130897a;
            }
            f00.s.m(sVar, cVar, null, 2, null);
        } else if (interfaceC5771a instanceof x23.a.InterfaceC5771a.c) {
            f00.s.m(sVar, p080n23.k.f130863a, null, 2, null);
        } else if (interfaceC5771a instanceof x23.a.InterfaceC5771a.ShowError) {
            f00.s.l(sVar, p080n23.m.f130870a, ((x23.a.InterfaceC5771a.ShowError) interfaceC5771a).getErrorData(), null, 4, null);
        } else {
            if (!(interfaceC5771a instanceof x23.a.InterfaceC5771a.ShowSearch)) {
                throw new oq.p();
            }
            f00.s.l(sVar, p080n23.h.f130854a, ((x23.a.InterfaceC5771a.ShowSearch) interfaceC5771a).getAddressSearchData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K0(g0 g0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1063119614, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:251)");
        }
        f00.r.o(wVar, fr.q0.c(x23.s.class), new SetupData(k23.c.SUPPLIER, g0Var), y2.m.d(260520303, true, new er.q() { // from class: u23.h1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l2.L0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194780a.B(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(260520303, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:258)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u23.l1
                @Override // er.l
                public final Object b(Object obj) {
                    return l2.M0(sVar, (x23.a.InterfaceC5771a) obj);
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
    public static final oq.i0 M0(f00.s sVar, x23.a.InterfaceC5771a interfaceC5771a) {
        zx.c cVar;
        if (fr.t.c(interfaceC5771a, x23.a.InterfaceC5771a.C5772a.f216609a)) {
            sVar.c();
        } else if (interfaceC5771a instanceof x23.a.InterfaceC5771a.GoToBusinessDetails) {
            int i15 = a.f194770b[((x23.a.InterfaceC5771a.GoToBusinessDetails) interfaceC5771a).getBusinessSelection().ordinal()];
            if (i15 == 1) {
                cVar = p080n23.y.f130901a;
            } else {
                if (i15 != 2) {
                    throw new oq.p();
                }
                cVar = p080n23.w.f130897a;
            }
            f00.s.m(sVar, cVar, null, 2, null);
        } else if (interfaceC5771a instanceof x23.a.InterfaceC5771a.c) {
            f00.s.m(sVar, p080n23.k.f130863a, null, 2, null);
        } else if (interfaceC5771a instanceof x23.a.InterfaceC5771a.ShowError) {
            f00.s.l(sVar, p080n23.m.f130870a, ((x23.a.InterfaceC5771a.ShowError) interfaceC5771a).getErrorData(), null, 4, null);
        } else {
            if (!(interfaceC5771a instanceof x23.a.InterfaceC5771a.ShowSearch)) {
                throw new oq.p();
            }
            f00.s.l(sVar, p080n23.h.f130854a, ((x23.a.InterfaceC5771a.ShowSearch) interfaceC5771a).getAddressSearchData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N0(final g0 g0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1965776897, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:291)");
        }
        f00.r.o(wVar, fr.q0.c(k33.n.class), g0Var, y2.m.d(1526591088, true, new er.q() { // from class: u23.r0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l2.O0(sVar, g0Var, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194780a.t(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O0(final f00.s sVar, final g0 g0Var, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1526591088, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:295)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u23.r1
                @Override // er.l
                public final Object b(Object obj) {
                    return l2.P0(sVar, g0Var, (k33.a.b) obj);
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
    public static final oq.i0 P0(f00.s sVar, g0 g0Var, k33.a.b bVar) {
        if (fr.t.c(bVar, k33.a.b.C2565a.f107784a)) {
            sVar.c();
        } else if (fr.t.c(bVar, k33.a.b.C2566b.f107785a)) {
            g0Var.K5();
        } else if (fr.t.c(bVar, k33.a.b.c.f107786a)) {
            f00.s.m(sVar, p080n23.s.f130889a, null, 2, null);
        } else {
            if (!fr.t.c(bVar, k33.a.b.d.f107787a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, p080n23.q.f130884a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q0(final g0 g0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-699706112, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:316)");
        }
        f00.r.o(wVar, fr.q0.c(m33.t.class), g0Var, y2.m.d(-1502305423, true, new er.q() { // from class: u23.g1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l2.R0(sVar, g0Var, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194780a.A(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R0(final f00.s sVar, final g0 g0Var, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1502305423, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:320)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u23.p1
                @Override // er.l
                public final Object b(Object obj) {
                    return l2.S0(sVar, g0Var, (m33.a.d) obj);
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
    public static final oq.i0 S0(f00.s sVar, g0 g0Var, m33.a.d dVar) {
        if (fr.t.c(dVar, m33.a.d.C3021a.f123556a)) {
            sVar.c();
        } else if (fr.t.c(dVar, m33.a.d.b.f123557a)) {
            g0Var.K5();
        } else if (fr.t.c(dVar, m33.a.d.C3022d.f123559a)) {
            f00.s.m(sVar, p080n23.q.f130884a, null, 2, null);
        } else {
            if (!(dVar instanceof m33.a.d.GoToDatePicker)) {
                throw new oq.p();
            }
            f00.s.l(sVar, p080n23.j.f130860a, ((m33.a.d.GoToDatePicker) dVar).getData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T0(final g0 g0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(566364673, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:342)");
        }
        f00.r.o(wVar, fr.q0.c(h33.x.class), g0Var, y2.m.d(-236234638, true, new er.q() { // from class: u23.e1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l2.U0(sVar, g0Var, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194780a.z(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U0(final f00.s sVar, final g0 g0Var, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-236234638, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:346)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u23.s1
                @Override // er.l
                public final Object b(Object obj) {
                    return l2.V0(sVar, g0Var, (h33.a.f) obj);
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
    public static final oq.i0 V0(f00.s sVar, g0 g0Var, h33.a.f fVar) {
        if (fr.t.c(fVar, h33.a.f.C1844a.f80616a)) {
            sVar.c();
        } else if (fr.t.c(fVar, h33.a.f.b.f80617a)) {
            g0Var.K5();
        } else if (fr.t.c(fVar, h33.a.f.d.f80619a)) {
            f00.s.m(sVar, p080n23.x.f130899a, null, 2, null);
        } else {
            if (!(fVar instanceof h33.a.f.GoToEdorAuth)) {
                throw new oq.p();
            }
            f00.s.l(sVar, p080n23.l.f130866a, ((h33.a.f.GoToEdorAuth) fVar).getEdorAuthData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W0(g0 g0Var, int i15, p076m2.r rVar, int i16) {
        e0(g0Var, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void X0(p136y9.d1 d1Var, final g0 g0Var, final f00.s sVar) {
        f00.r.u(d1Var, p080n23.p.f130881a, null, y2.m.b(-1407765494, true, new er.r() { // from class: u23.v0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return l2.Y0(g0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p080n23.o.f130878a, null, y2.m.b(1598207987, true, new er.r() { // from class: u23.w0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return l2.b1(g0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p080n23.h.f130854a, null, y2.m.b(-586067950, true, new er.r() { // from class: u23.x0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return l2.e1(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p080n23.m.f130870a, null, y2.m.b(1524623409, true, new er.r() { // from class: u23.y0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return l2.h1(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y0(final g0 g0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1407765494, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.addLocationReportDestinations.<anonymous> (NewReportSharedNavContent.kt:464)");
        }
        f00.r.o(wVar, fr.q0.c(e33.s.class), g0Var, y2.m.d(1430548601, true, new er.q() { // from class: u23.b2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l2.Z0(sVar, g0Var, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194780a.p(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z0(final f00.s sVar, final g0 g0Var, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1430548601, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.addLocationReportDestinations.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:468)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u23.c2
                @Override // er.l
                public final Object b(Object obj) {
                    return l2.a1(sVar, g0Var, (e33.a.b) obj);
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
    public static final oq.i0 a1(f00.s sVar, g0 g0Var, e33.a.b bVar) {
        if (fr.t.c(bVar, e33.a.b.C1077a.f47075a)) {
            sVar.c();
        } else if (fr.t.c(bVar, e33.a.b.C1078b.f47076a)) {
            g0Var.K5();
        } else {
            if (!fr.t.c(bVar, e33.a.b.c.f47077a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, p080n23.o.f130878a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b1(final g0 g0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1598207987, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.addLocationReportDestinations.<anonymous> (NewReportSharedNavContent.kt:486)");
        }
        f00.r.o(wVar, fr.q0.c(c33.j.class), g0Var, y2.m.d(1913820322, true, new er.q() { // from class: u23.q1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l2.c1(sVar, g0Var, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194780a.o(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c1(final f00.s sVar, final g0 g0Var, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1913820322, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.addLocationReportDestinations.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:490)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u23.e2
                @Override // er.l
                public final Object b(Object obj) {
                    return l2.d1(sVar, g0Var, (c33.a.b) obj);
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
    public static final oq.i0 d1(f00.s sVar, g0 g0Var, c33.a.b bVar) {
        if (fr.t.c(bVar, c33.a.b.C0611a.f22997a)) {
            sVar.c();
        } else if (fr.t.c(bVar, c33.a.b.C0612b.f22998a)) {
            g0Var.K5();
        } else if (fr.t.c(bVar, c33.a.b.c.f22999a)) {
            f00.s.m(sVar, p080n23.k.f130863a, null, 2, null);
        } else if (bVar instanceof c33.a.b.ShowSearch) {
            f00.s.l(sVar, p080n23.h.f130854a, ((c33.a.b.ShowSearch) bVar).getAddressSearchData(), null, 4, null);
        } else {
            if (!(bVar instanceof c33.a.b.ShowError)) {
                throw new oq.p();
            }
            f00.s.l(sVar, p080n23.m.f130870a, ((c33.a.b.ShowError) bVar).getErrorData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    public static final void e0(final g0 g0Var, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-558520989);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(g0Var) : rVarH.G(g0Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-558520989, i16, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent (NewReportSharedNavContent.kt:64)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            p080n23.v vVar = p080n23.v.f130895a;
            if ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(g0Var))) {
                z15 = true;
            }
            boolean zG = rVarH.G(sVarJ) | z15;
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: u23.h0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l2.f0(g0Var, sVarJ, (p136y9.d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, vVar, (er.l) objE, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: u23.s0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l2.W0(g0Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e1(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-586067950, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.addLocationReportDestinations.<anonymous> (NewReportSharedNavContent.kt:518)");
        }
        p080n23.h hVar = p080n23.h.f130854a;
        f00.r.r(wVar, hVar, sVar.g(hVar), y2.m.d(-98646011, true, new er.q() { // from class: u23.t1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l2.f1(sVar, (tt3.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f0(final g0 g0Var, final f00.s sVar, p136y9.d1 d1Var) {
        f00.r.u(d1Var, p080n23.v.f130895a, null, y2.m.b(-1341113342, true, new er.r() { // from class: u23.d1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return l2.g0(g0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p080n23.a0.f130833a, null, y2.m.b(-972267015, true, new er.r() { // from class: u23.i2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return l2.j0(g0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        X0(d1Var, g0Var, sVar);
        f00.r.u(d1Var, p080n23.k.f130863a, null, y2.m.b(293803770, true, new er.r() { // from class: u23.j2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return l2.y0(g0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p080n23.u.f130893a, null, y2.m.b(1559874555, true, new er.r() { // from class: u23.k2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return l2.B0(g0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p080n23.t.f130891a, null, y2.m.b(-1469021956, true, new er.r() { // from class: u23.i0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return l2.E0(g0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p080n23.w.f130897a, null, y2.m.b(-202951171, true, new er.r() { // from class: u23.j0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return l2.H0(g0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p080n23.y.f130901a, null, y2.m.b(1063119614, true, new er.r() { // from class: u23.k0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return l2.K0(g0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p080n23.r.f130887a, null, y2.m.b(-1965776897, true, new er.r() { // from class: u23.l0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return l2.N0(g0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p080n23.s.f130889a, null, y2.m.b(-699706112, true, new er.r() { // from class: u23.m0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return l2.Q0(g0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p080n23.q.f130884a, null, y2.m.b(566364673, true, new er.r() { // from class: u23.n0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return l2.T0(g0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p080n23.x.f130899a, null, y2.m.b(1960773369, true, new er.r() { // from class: u23.o1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return l2.m0(g0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p080n23.i.f130857a, null, y2.m.b(-1068123142, true, new er.r() { // from class: u23.z1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return l2.p0(g0Var, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p080n23.l.f130866a, null, y2.m.b(197947643, true, new er.r() { // from class: u23.g2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return l2.s0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p080n23.n.f130874a, null, y2.m.b(1464018428, true, new er.r() { // from class: u23.h2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return l2.v0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        uw.m.c(d1Var, p080n23.j.f130860a, sVar);
        ww.d.c(d1Var, p080n23.z.f130903a, sVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f1(final f00.s sVar, tt3.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-98646011, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.addLocationReportDestinations.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:522)");
        }
        xw.b<tt3.d.a> bVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u23.f2
                @Override // er.l
                public final Object b(Object obj) {
                    return l2.g1(sVar, (tt3.d.a) obj);
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
    public static final oq.i0 g0(final g0 g0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1341113342, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:73)");
        }
        f00.r.o(wVar, fr.q0.c(t33.s.class), g0Var, y2.m.d(-1502842189, true, new er.q() { // from class: u23.q0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l2.h0(g0Var, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194780a.w(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g1(f00.s sVar, tt3.d.a aVar) {
        if (!fr.t.c(aVar, tt3.d.a.C5021a.f192310a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h0(final g0 g0Var, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1502842189, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:77)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(g0Var) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u23.i1
                @Override // er.l
                public final Object b(Object obj) {
                    return l2.i0(g0Var, sVar, (t33.a.c) obj);
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
    public static final oq.i0 h1(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1524623409, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.addLocationReportDestinations.<anonymous> (NewReportSharedNavContent.kt:532)");
        }
        p080n23.m mVar = p080n23.m.f130870a;
        f00.r.r(wVar, mVar, sVar.g(mVar), y2.m.d(-391081104, true, new er.q() { // from class: u23.k1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l2.i1(sVar, (hb4.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i0(g0 g0Var, f00.s sVar, t33.a.c cVar) {
        if (fr.t.c(cVar, t33.a.c.C4868a.f187516a)) {
            g0Var.K5();
        } else {
            if (!fr.t.c(cVar, t33.a.c.b.f187517a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, p080n23.a0.f130833a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i1(final f00.s sVar, hb4.b bVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-391081104, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.addLocationReportDestinations.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:536)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u23.d2
                @Override // er.l
                public final Object b(Object obj) {
                    return l2.j1(sVar, (hb4.b.a) obj);
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
    public static final oq.i0 j0(final g0 g0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-972267015, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:93)");
        }
        f00.r.o(wVar, fr.q0.c(y33.q.class), g0Var, y2.m.d(-1774866326, true, new er.q() { // from class: u23.o0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l2.k0(sVar, g0Var, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194780a.x(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j1(f00.s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k0(final f00.s sVar, final g0 g0Var, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1774866326, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:97)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u23.j1
                @Override // er.l
                public final Object b(Object obj) {
                    return l2.l0(sVar, g0Var, (y33.a.b) obj);
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
    public static final oq.i0 l0(f00.s sVar, g0 g0Var, y33.a.b bVar) {
        if (fr.t.c(bVar, y33.a.b.C5976a.f223714a)) {
            sVar.c();
        } else if (fr.t.c(bVar, y33.a.b.C5977b.f223715a)) {
            g0Var.K5();
        } else {
            if (!(bVar instanceof y33.a.b.GoToNextScreen)) {
                throw new oq.p();
            }
            int i15 = a.f194769a[((y33.a.b.GoToNextScreen) bVar).getCategory().getCode().ordinal()];
            if (i15 == 1) {
                f00.s.m(sVar, p080n23.p.f130881a, null, 2, null);
            } else {
                if (i15 != 2) {
                    throw new oq.p();
                }
                f00.s.m(sVar, p080n23.u.f130893a, null, 2, null);
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m0(final g0 g0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1960773369, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:369)");
        }
        f00.r.o(wVar, fr.q0.c(v33.d0.class), g0Var, y2.m.d(-1444968792, true, new er.q() { // from class: u23.t0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l2.n0(sVar, g0Var, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194780a.s(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n0(final f00.s sVar, final g0 g0Var, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1444968792, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:373)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u23.v1
                @Override // er.l
                public final Object b(Object obj) {
                    return l2.o0(sVar, g0Var, (v33.f.e) obj);
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
    public static final oq.i0 o0(f00.s sVar, g0 g0Var, v33.f.e eVar) {
        if (fr.t.c(eVar, v33.f.e.a.f203515a)) {
            sVar.c();
        } else if (fr.t.c(eVar, v33.f.e.b.f203516a)) {
            g0Var.K5();
        } else {
            if (!fr.t.c(eVar, v33.f.e.c.f203517a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, p080n23.i.f130857a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p0(g0 g0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1068123142, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:390)");
        }
        f00.r.o(wVar, fr.q0.c(v23.n.class), g0Var, y2.m.d(-178898007, true, new er.q() { // from class: u23.a1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l2.q0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194780a.y(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-178898007, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:394)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u23.u1
                @Override // er.l
                public final Object b(Object obj) {
                    return l2.r0(sVar, (v23.a) obj);
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
    public static final oq.i0 r0(f00.s sVar, v23.a aVar) {
        if (fr.t.c(aVar, v23.a.C5292a.f203335a)) {
            sVar.c();
        } else {
            if (!(aVar instanceof v23.a.ShowImagePreview)) {
                throw new oq.p();
            }
            f00.s.l(sVar, p080n23.n.f130874a, ((v23.a.ShowImagePreview) aVar).getData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(197947643, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:413)");
        }
        p080n23.l lVar = p080n23.l.f130866a;
        f00.r.r(wVar, lVar, sVar.g(lVar), y2.m.d(1775934230, true, new er.q() { // from class: u23.b1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l2.t0(sVar, (mv3.c) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t0(final f00.s sVar, mv3.c cVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1775934230, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:419)");
        }
        xw.b<mv3.c.a> bVarY1 = cVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u23.x1
                @Override // er.l
                public final Object b(Object obj) {
                    return l2.u0(sVar, (mv3.c.a) obj);
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
    public static final oq.i0 u0(f00.s sVar, mv3.c.a aVar) {
        if (!fr.t.c(aVar, mv3.c.a.C3193a.f128686a) && !fr.t.c(aVar, mv3.c.a.b.f128687a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1464018428, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:432)");
        }
        p080n23.n nVar = p080n23.n.f130874a;
        f00.r.r(wVar, nVar, sVar.g(nVar), y2.m.d(324297206, true, new er.q() { // from class: u23.f1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l2.w0(sVar, (dx3.c) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w0(final f00.s sVar, dx3.c cVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(324297206, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:438)");
        }
        xw.b<dx3.c.a> bVarY1 = cVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u23.y1
                @Override // er.l
                public final Object b(Object obj) {
                    return l2.x0(sVar, (dx3.c.a) obj);
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
    public static final oq.i0 x0(f00.s sVar, dx3.c.a aVar) {
        if (!fr.t.c(aVar, dx3.c.a.C1047a.f45490a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y0(final g0 g0Var, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(293803770, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:123)");
        }
        f00.r.o(wVar, fr.q0.c(z23.b0.class), g0Var, y2.m.d(-508795541, true, new er.q() { // from class: u23.u0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l2.z0(sVar, g0Var, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), o.f194780a.u(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z0(final f00.s sVar, final g0 g0Var, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-508795541, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.NewReportSharedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewReportSharedNavContent.kt:127)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(g0Var);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: u23.m1
                @Override // er.l
                public final Object b(Object obj) {
                    return l2.A0(sVar, g0Var, (z23.a.g) obj);
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
}
