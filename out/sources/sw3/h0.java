package sw3;

import fr.q0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p136y9.d1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsw3/j;", "photoViewModel", "Loq/i0;", "x", "(Lsw3/j;Lm2/r;I)V", "identityphoto_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(final j jVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2010621754, i15, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.identityphoto.IdentityPhotoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IdentityPhotoScreen.kt:46)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(jVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: sw3.s
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.B(jVar, sVar, (uw3.a.InterfaceC5251a) obj);
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
    public static final oq.i0 B(j jVar, f00.s sVar, uw3.a.InterfaceC5251a interfaceC5251a) {
        if (fr.t.c(interfaceC5251a, uw3.a.InterfaceC5251a.C5252a.f202001a)) {
            jVar.close();
        } else if (interfaceC5251a instanceof uw3.a.InterfaceC5251a.Error) {
            f00.s.l(sVar, kw3.e.c.f112910b, ((uw3.a.InterfaceC5251a.Error) interfaceC5251a).getData(), null, 4, null);
        } else if (interfaceC5251a instanceof uw3.a.InterfaceC5251a.NavigationDialog) {
            f00.s.l(sVar, kw3.e.b.f112909b, ((uw3.a.InterfaceC5251a.NavigationDialog) interfaceC5251a).getData(), null, 4, null);
        } else if (interfaceC5251a instanceof uw3.a.InterfaceC5251a.ToVerification) {
            f00.s.l(sVar, kw3.e.g.f112914b, ((uw3.a.InterfaceC5251a.ToVerification) interfaceC5251a).getData(), null, 4, null);
        } else {
            if (!(interfaceC5251a instanceof uw3.a.InterfaceC5251a.ToTakePhoto)) {
                throw new oq.p();
            }
            f00.s.l(sVar, kw3.e.f.f112913b, ((uw3.a.InterfaceC5251a.ToTakePhoto) interfaceC5251a).getData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(final f00.s sVar, final j jVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2040186560, i15, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.identityphoto.IdentityPhotoScreen.<anonymous>.<anonymous>.<anonymous> (IdentityPhotoScreen.kt:77)");
        }
        f00.r.o(wVar, q0.c(ax3.h0.class), sVar.g(kw3.e.g.f112914b), y2.m.d(2145159023, true, new er.q() { // from class: sw3.g0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return h0.D(sVar, jVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f185099a.f(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(final f00.s sVar, final j jVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2145159023, i15, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.identityphoto.IdentityPhotoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IdentityPhotoScreen.kt:82)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(jVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: sw3.w
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.E(sVar, jVar, (ax3.c.a) obj);
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
    public static final oq.i0 E(f00.s sVar, j jVar, ax3.c.a aVar) {
        if (fr.t.c(aVar, ax3.c.a.b.f14902a)) {
            sVar.c();
        } else if (fr.t.c(aVar, ax3.c.a.C0340c.f14903a)) {
            jVar.close();
        } else if (aVar instanceof ax3.c.a.TakeNewPhoto) {
            f00.s.l(sVar, kw3.e.f.f112913b, ((ax3.c.a.TakeNewPhoto) aVar).getData(), null, 4, null);
        } else if (aVar instanceof ax3.c.a.PhotoSelected) {
            jVar.Q8(((ax3.c.a.PhotoSelected) aVar).getImage());
        } else if (aVar instanceof ax3.c.a.PreviewPhoto) {
            f00.s.l(sVar, kw3.e.d.f112911b, ((ax3.c.a.PreviewPhoto) aVar).getData(), null, 4, null);
        } else {
            if (!(aVar instanceof ax3.c.a.AdjustPhoto)) {
                throw new oq.p();
            }
            f00.s.l(sVar, kw3.e.a.f112908b, ((ax3.c.a.AdjustPhoto) aVar).getData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(final f00.s sVar, final j jVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1827511007, i15, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.identityphoto.IdentityPhotoScreen.<anonymous>.<anonymous>.<anonymous> (IdentityPhotoScreen.kt:112)");
        }
        f00.r.o(wVar, q0.c(yw3.s.class), sVar.g(kw3.e.f.f112913b), y2.m.d(1717889294, true, new er.q() { // from class: sw3.m
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return h0.G(sVar, jVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f185099a.i(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G(final f00.s sVar, final j jVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1717889294, i15, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.identityphoto.IdentityPhotoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IdentityPhotoScreen.kt:116)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(jVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: sw3.r
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.H(sVar, jVar, (yw3.c.b) obj);
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
    public static final oq.i0 H(f00.s sVar, j jVar, yw3.c.b bVar) {
        if (fr.t.c(bVar, yw3.c.b.a.f230010a)) {
            sVar.c();
        } else if (fr.t.c(bVar, yw3.c.b.C6175b.f230011a)) {
            jVar.close();
        } else if (bVar instanceof yw3.c.b.Error) {
            f00.s.l(sVar, kw3.e.c.f112910b, ((yw3.c.b.Error) bVar).getData(), null, 4, null);
        } else {
            if (!(bVar instanceof yw3.c.b.PhotoTaken)) {
                throw new oq.p();
            }
            sVar.j(kw3.e.g.f112914b, ((yw3.c.b.PhotoTaken) bVar).getData(), kw3.e.f.f112913b);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1400241278, i15, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.identityphoto.IdentityPhotoScreen.<anonymous>.<anonymous>.<anonymous> (IdentityPhotoScreen.kt:140)");
        }
        f00.r.o(wVar, q0.c(ww3.s.class), sVar.g(kw3.e.d.f112911b), y2.m.d(1290619565, true, new er.q() { // from class: sw3.n
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return h0.J(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f185099a.g(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1290619565, i15, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.identityphoto.IdentityPhotoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IdentityPhotoScreen.kt:144)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: sw3.t
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.K(sVar, (ww3.a) obj);
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
    public static final oq.i0 K(f00.s sVar, ww3.a aVar) {
        if (fr.t.c(aVar, ww3.a.b.f215573a)) {
            sVar.c();
        } else {
            if (!(aVar instanceof ww3.a.AdjustPhoto)) {
                throw new oq.p();
            }
            sVar.j(kw3.e.a.f112908b, ((ww3.a.AdjustPhoto) aVar).getData(), kw3.e.d.f112911b);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(972971549, i15, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.identityphoto.IdentityPhotoScreen.<anonymous>.<anonymous>.<anonymous> (IdentityPhotoScreen.kt:162)");
        }
        f00.r.o(wVar, q0.c(lw3.x.class), sVar.g(kw3.e.a.f112908b), y2.m.d(863349836, true, new er.q() { // from class: sw3.q
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return h0.M(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f185099a.h(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(863349836, i15, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.identityphoto.IdentityPhotoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IdentityPhotoScreen.kt:166)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: sw3.x
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.N(sVar, (lw3.a.InterfaceC2951a) obj);
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
    public static final oq.i0 N(f00.s sVar, lw3.a.InterfaceC2951a interfaceC2951a) {
        if (fr.t.c(interfaceC2951a, lw3.a.InterfaceC2951a.C2952a.f120858a)) {
            sVar.c();
        } else if (interfaceC2951a instanceof lw3.a.InterfaceC2951a.Verification) {
            f00.s.l(sVar, kw3.e.g.f112914b, ((lw3.a.InterfaceC2951a.Verification) interfaceC2951a).getData(), null, 4, null);
        } else if (interfaceC2951a instanceof lw3.a.InterfaceC2951a.Dialog) {
            f00.s.l(sVar, kw3.e.b.f112909b, ((lw3.a.InterfaceC2951a.Dialog) interfaceC2951a).getData(), null, 4, null);
        } else {
            if (!(interfaceC2951a instanceof lw3.a.InterfaceC2951a.Error)) {
                throw new oq.p();
            }
            f00.s.l(sVar, kw3.e.c.f112910b, ((lw3.a.InterfaceC2951a.Error) interfaceC2951a).getData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(545701820, i15, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.identityphoto.IdentityPhotoScreen.<anonymous>.<anonymous>.<anonymous> (IdentityPhotoScreen.kt:194)");
        }
        kw3.e.b bVar = kw3.e.b.f112909b;
        f00.r.r(wVar, bVar, sVar.g(bVar), y2.m.d(-1173415791, true, new er.q() { // from class: sw3.l
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return h0.P(sVar, (cb4.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P(final f00.s sVar, cb4.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1173415791, i15, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.identityphoto.IdentityPhotoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IdentityPhotoScreen.kt:199)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: sw3.u
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.Q(sVar, (cb4.f.a) obj);
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
    public static final oq.i0 Q(f00.s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(118432091, i15, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.identityphoto.IdentityPhotoScreen.<anonymous>.<anonymous>.<anonymous> (IdentityPhotoScreen.kt:209)");
        }
        kw3.e.c cVar = kw3.e.c.f112910b;
        f00.r.r(wVar, cVar, sVar.g(cVar), y2.m.d(-1804212710, true, new er.q() { // from class: sw3.o
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return h0.S(sVar, (hb4.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S(final f00.s sVar, hb4.b bVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1804212710, i15, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.identityphoto.IdentityPhotoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (IdentityPhotoScreen.kt:214)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: sw3.y
                @Override // er.l
                public final Object b(Object obj) {
                    return h0.T(sVar, (hb4.b.a) obj);
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
    public static final oq.i0 T(f00.s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(j jVar, int i15, p076m2.r rVar, int i16) {
        x(jVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void x(final j jVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-610012138);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(jVar) : rVarH.G(jVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-610012138, i16, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.identityphoto.IdentityPhotoScreen (IdentityPhotoScreen.kt:31)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            m7.b.c(jVar.getState(), null, null, null, rVarH, 0, 7);
            kw3.e.C2733e c2733e = kw3.e.C2733e.f112912b;
            if ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(jVar))) {
                z15 = true;
            }
            boolean zG = rVarH.G(sVarJ) | z15;
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: sw3.k
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h0.y(jVar, sVarJ, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, c2733e, (er.l) objE, rVarH, f00.s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: sw3.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h0.U(jVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(final j jVar, final f00.s sVar, d1 d1Var) {
        f00.r.u(d1Var, kw3.e.C2733e.f112912b, null, y2.m.b(438651607, true, new er.r() { // from class: sw3.z
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h0.z(jVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, kw3.e.g.f112914b, null, y2.m.b(-2040186560, true, new er.r() { // from class: sw3.a0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h0.C(sVar, jVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, kw3.e.f.f112913b, null, y2.m.b(1827511007, true, new er.r() { // from class: sw3.b0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h0.F(sVar, jVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, kw3.e.d.f112911b, null, y2.m.b(1400241278, true, new er.r() { // from class: sw3.c0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h0.I(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, kw3.e.a.f112908b, null, y2.m.b(972971549, true, new er.r() { // from class: sw3.d0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h0.L(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, kw3.e.b.f112909b, new f00.g0.Dialog(null, 1, null), y2.m.b(545701820, true, new er.r() { // from class: sw3.e0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h0.O(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }));
        f00.r.u(d1Var, kw3.e.c.f112910b, null, y2.m.b(118432091, true, new er.r() { // from class: sw3.f0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return h0.R(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(final j jVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(438651607, i15, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.identityphoto.IdentityPhotoScreen.<anonymous>.<anonymous>.<anonymous> (IdentityPhotoScreen.kt:42)");
        }
        f00.r.o(wVar, q0.c(uw3.l.class), jVar.getData(), y2.m.d(-2010621754, true, new er.q() { // from class: sw3.p
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return h0.A(jVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f185099a.j(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }
}
