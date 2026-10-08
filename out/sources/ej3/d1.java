package ej3;

import nj3.SetupData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import pj3.VehicleIdentificationPayload;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aC\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a;\u0010\f\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ldj3/a;", "colorScheme", "Lkotlin/Function1;", "Lf00/s;", "Loq/i0;", "navGraphReady", "Lkotlin/Function0;", "navResult", "Lpj3/a;", "vehicleIdentificationData", "I", "(Ldj3/a;Ler/l;Ler/a;Lpj3/a;Lm2/r;I)V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Ler/l;Ler/a;Lpj3/a;Lm2/r;I)V", "vehiclehistory_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d1 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51680a;

        static {
            int[] iArr = new int[nj3.b.values().length];
            try {
                iArr[nj3.b.JUST_ABROAD_MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[nj3.b.BOTH_MISSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[nj3.b.LOCAL_EMPTY_ABROAD_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f51680a = iArr;
        }
    }

    public static final void I(final dj3.a aVar, final er.l<? super f00.s, oq.i0> lVar, final er.a<oq.i0> aVar2, final VehicleIdentificationPayload vehicleIdentificationPayload, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1055900086);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(lVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(vehicleIdentificationPayload) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1055900086, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.VehicleHistoryNavContent (VehicleHistoryNavContent.kt:53)");
            }
            p076m2.d0.c(dj3.c.c().d(aVar), y2.m.d(-2095597962, true, new er.p() { // from class: ej3.w
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d1.J(lVar, aVar2, vehicleIdentificationPayload, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: ej3.x
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d1.K(aVar, lVar, aVar2, vehicleIdentificationPayload, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(er.l lVar, er.a aVar, VehicleIdentificationPayload vehicleIdentificationPayload, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2095597962, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.VehicleHistoryNavContent.<anonymous> (VehicleHistoryNavContent.kt:57)");
            }
            L(lVar, aVar, vehicleIdentificationPayload, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(dj3.a aVar, er.l lVar, er.a aVar2, VehicleIdentificationPayload vehicleIdentificationPayload, int i15, p076m2.r rVar, int i16) {
        I(aVar, lVar, aVar2, vehicleIdentificationPayload, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void L(final er.l<? super f00.s, oq.i0> lVar, final er.a<oq.i0> aVar, final VehicleIdentificationPayload vehicleIdentificationPayload, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1267666869);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(lVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(vehicleIdentificationPayload) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1267666869, i16, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.VehicleHistoryNavGraph (VehicleHistoryNavContent.kt:70)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            r rVar2 = r.f51719a;
            boolean zG = rVarH.G(vehicleIdentificationPayload) | ((i16 & 112) == 32) | rVarH.G(sVarJ);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: ej3.y
                    @Override // er.l
                    public final Object b(Object obj) {
                        return d1.M(sVarJ, vehicleIdentificationPayload, aVar, (p136y9.d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, rVar2, (er.l) objE, rVarH, f00.s.f54562e | 48);
            lVar.b(sVarJ);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ej3.z
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d1.r0(lVar, aVar, vehicleIdentificationPayload, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(final f00.s sVar, final VehicleIdentificationPayload vehicleIdentificationPayload, final er.a aVar, p136y9.d1 d1Var) {
        f00.r.u(d1Var, r.f51719a, null, y2.m.b(-1310542060, true, new er.r() { // from class: ej3.a0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return d1.N(vehicleIdentificationPayload, aVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, s.f51722a, null, y2.m.b(2122951627, true, new er.r() { // from class: ej3.b0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return d1.Q(sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, q.f51715a, null, y2.m.b(-112093172, true, new er.r() { // from class: ej3.c0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return d1.T(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, m.f51703a, null, y2.m.b(1947829325, true, new er.r() { // from class: ej3.d0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return d1.W(sVar, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, k.f51697a, null, y2.m.b(-287215474, true, new er.r() { // from class: ej3.e0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return d1.Z(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p.f51712a, null, y2.m.b(1772707023, true, new er.r() { // from class: ej3.f0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return d1.c0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l.f51700a, null, y2.m.b(-462337776, true, new er.r() { // from class: ej3.h0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return d1.f0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, t.f51725a, null, y2.m.b(1597584721, true, new er.r() { // from class: ej3.i0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return d1.i0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, u.f51728a, null, y2.m.b(-637460078, true, new er.r() { // from class: ej3.j0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return d1.l0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, o.f51709a, null, y2.m.b(1422462419, true, new er.r() { // from class: ej3.k0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return d1.o0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        uw.m.c(d1Var, n.f51706a, sVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(VehicleIdentificationPayload vehicleIdentificationPayload, final er.a aVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1310542060, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.VehicleHistoryNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleHistoryNavContent.kt:78)");
        }
        f00.r.o(wVar, fr.q0.c(nj3.u.class), new SetupData(vehicleIdentificationPayload), y2.m.d(823222533, true, new er.q() { // from class: ej3.q0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d1.O(aVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f51686a.m(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(final er.a aVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(823222533, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.VehicleHistoryNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleHistoryNavContent.kt:82)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ej3.x0
                @Override // er.l
                public final Object b(Object obj) {
                    return d1.P(aVar, sVar, (nj3.a.g) obj);
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
    public static final oq.i0 P(er.a aVar, f00.s sVar, nj3.a.g gVar) {
        Object obj;
        if (gVar instanceof nj3.a.g.b) {
            aVar.a();
        } else {
            if (gVar instanceof nj3.a.g.Details) {
                nj3.a.g.Details cVar = (nj3.a.g.Details) gVar;
                sVar.j(s.f51722a, cVar.getPayloadData(), cVar.getPayloadData().getSkipForm() ? r.f51719a : null);
            } else if (gVar instanceof nj3.a.g.Abroad) {
                nj3.a.g.Abroad c3375a = (nj3.a.g.Abroad) gVar;
                sVar.j(m.f51703a, c3375a.getPayloadData(), c3375a.getPayloadData().getSkipForm() ? r.f51719a : null);
            } else if (gVar instanceof nj3.a.g.Empty) {
                p pVar = p.f51712a;
                int i15 = a.f51680a[((nj3.a.g.Empty) gVar).getEmptyData().ordinal()];
                if (i15 == 1) {
                    obj = tj3.b.c.f190523a;
                } else if (i15 == 2) {
                    obj = tj3.b.C4976b.f190522a;
                } else {
                    if (i15 != 3) {
                        throw new oq.p();
                    }
                    obj = tj3.b.a.f190521a;
                }
                f00.s.l(sVar, pVar, obj, null, 4, null);
            } else if (gVar instanceof nj3.a.g.Error) {
                f00.s.l(sVar, o.f51709a, ((nj3.a.g.Error) gVar).getError(), null, 4, null);
            } else {
                if (!(gVar instanceof nj3.a.g.ShowDatePicker)) {
                    throw new oq.p();
                }
                nj3.a.g.ShowDatePicker fVar = (nj3.a.g.ShowDatePicker) gVar;
                f00.s.l(sVar, n.f51706a, new uw.j.Single(null, fVar.getSelected(), fVar.b(), null, fVar.getMaxDate(), 9, null), null, 4, null);
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q(final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2122951627, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.VehicleHistoryNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleHistoryNavContent.kt:142)");
        }
        f00.r.o(wVar, fr.q0.c(xj3.n.class), sVar.g(s.f51722a), y2.m.d(-323641988, true, new er.q() { // from class: ej3.v0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d1.R(sVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f51686a.r(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(final f00.s sVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-323641988, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.VehicleHistoryNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleHistoryNavContent.kt:146)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ej3.w0
                @Override // er.l
                public final Object b(Object obj) {
                    return d1.S(sVar, aVar, (xj3.b.e) obj);
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
    public static final oq.i0 S(f00.s sVar, er.a aVar, xj3.b.e eVar) {
        if (fr.t.c(eVar, xj3.b.e.C5858b.f219136a)) {
            if (!sVar.getNavController().J()) {
                aVar.a();
            }
        } else if (eVar instanceof xj3.b.e.Timeline) {
            f00.s.l(sVar, q.f51715a, ((xj3.b.e.Timeline) eVar).getPayload(), null, 4, null);
        } else if (eVar instanceof xj3.b.e.AbroadList) {
            f00.s.l(sVar, m.f51703a, ((xj3.b.e.AbroadList) eVar).getPayload(), null, 4, null);
        } else if (eVar instanceof xj3.b.e.f) {
            f00.s.l(sVar, p.f51712a, tj3.b.c.f190523a, null, 4, null);
        } else if (eVar instanceof xj3.b.e.Error) {
            f00.s.l(sVar, o.f51709a, ((xj3.b.e.Error) eVar).getError(), null, 4, null);
        } else if (fr.t.c(eVar, xj3.b.e.d.f219138a)) {
            f00.s.m(sVar, t.f51725a, null, 2, null);
        } else {
            if (!fr.t.c(eVar, xj3.b.e.C5859e.f219139a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, u.f51728a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-112093172, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.VehicleHistoryNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleHistoryNavContent.kt:189)");
        }
        f00.r.o(wVar, fr.q0.c(uj3.k.class), sVar.g(q.f51715a), y2.m.d(1736280509, true, new er.q() { // from class: ej3.l0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d1.U(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f51686a.q(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1736280509, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.VehicleHistoryNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleHistoryNavContent.kt:193)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ej3.r0
                @Override // er.l
                public final Object b(Object obj) {
                    return d1.V(sVar, (uj3.f) obj);
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
    public static final oq.i0 V(f00.s sVar, uj3.f fVar) {
        if (!(fVar instanceof uj3.f.a)) {
            throw new oq.p();
        }
        sVar.getNavController().J();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W(final f00.s sVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1947829325, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.VehicleHistoryNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleHistoryNavContent.kt:204)");
        }
        f00.r.o(wVar, fr.q0.c(kj3.o.class), sVar.g(m.f51703a), y2.m.d(-498764290, true, new er.q() { // from class: ej3.u0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d1.X(sVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f51686a.p(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X(final f00.s sVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-498764290, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.VehicleHistoryNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleHistoryNavContent.kt:208)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ej3.z0
                @Override // er.l
                public final Object b(Object obj) {
                    return d1.Y(sVar, aVar, (kj3.b) obj);
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
    public static final oq.i0 Y(f00.s sVar, er.a aVar, kj3.b bVar) {
        if (bVar instanceof kj3.b.C2681b) {
            if (!sVar.getNavController().J()) {
                aVar.a();
            }
        } else if (bVar instanceof kj3.b.Details) {
            f00.s.l(sVar, k.f51697a, ((kj3.b.Details) bVar).getPayload(), null, 4, null);
        } else if (bVar instanceof kj3.b.AbroadNoData) {
            f00.s.l(sVar, p.f51712a, ((kj3.b.AbroadNoData) bVar).getPayload(), null, 4, null);
        } else {
            if (!fr.t.c(bVar, kj3.b.d.f111233a)) {
                throw new oq.p();
            }
            f00.s.m(sVar, l.f51700a, null, 2, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-287215474, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.VehicleHistoryNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleHistoryNavContent.kt:235)");
        }
        f00.r.o(wVar, fr.q0.c(fj3.s.class), sVar.g(k.f51697a), y2.m.d(1561158207, true, new er.q() { // from class: ej3.o0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d1.a0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f51686a.n(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1561158207, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.VehicleHistoryNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleHistoryNavContent.kt:239)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ej3.a1
                @Override // er.l
                public final Object b(Object obj) {
                    return d1.b0(sVar, (fj3.b) obj);
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
    public static final oq.i0 b0(f00.s sVar, fj3.b bVar) {
        if (bVar instanceof fj3.b.a) {
            sVar.getNavController().J();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1772707023, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.VehicleHistoryNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleHistoryNavContent.kt:250)");
        }
        f00.r.o(wVar, fr.q0.c(rj3.e.class), sVar.g(p.f51712a), y2.m.d(-673886592, true, new er.q() { // from class: ej3.n0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d1.d0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f51686a.j(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-673886592, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.VehicleHistoryNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleHistoryNavContent.kt:254)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ej3.b1
                @Override // er.l
                public final Object b(Object obj) {
                    return d1.e0(sVar, (rj3.j) obj);
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
    public static final oq.i0 e0(f00.s sVar, rj3.j jVar) {
        if (!(jVar instanceof rj3.j.a)) {
            throw new oq.p();
        }
        sVar.getNavController().J();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-462337776, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.VehicleHistoryNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleHistoryNavContent.kt:265)");
        }
        f00.r.n(wVar, fr.q0.c(ij3.k.class), y2.m.d(-1877470174, true, new er.q() { // from class: ej3.s0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d1.g0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f51686a.o(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1877470174, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.VehicleHistoryNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleHistoryNavContent.kt:268)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ej3.c1
                @Override // er.l
                public final Object b(Object obj) {
                    return d1.h0(sVar, (ij3.b) obj);
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
    public static final oq.i0 h0(f00.s sVar, ij3.b bVar) {
        if (bVar instanceof ij3.b.a) {
            sVar.getNavController().J();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1597584721, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.VehicleHistoryNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleHistoryNavContent.kt:279)");
        }
        f00.r.n(wVar, fr.q0.c(zj3.k.class), y2.m.d(182452323, true, new er.q() { // from class: ej3.m0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d1.j0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f51686a.k(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(182452323, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.VehicleHistoryNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleHistoryNavContent.kt:282)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ej3.y0
                @Override // er.l
                public final Object b(Object obj) {
                    return d1.k0(sVar, (zj3.b) obj);
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
    public static final oq.i0 k0(f00.s sVar, zj3.b bVar) {
        if (bVar instanceof zj3.b.a) {
            sVar.getNavController().J();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-637460078, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.VehicleHistoryNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleHistoryNavContent.kt:293)");
        }
        f00.r.n(wVar, fr.q0.c(dk3.k.class), y2.m.d(-2052592476, true, new er.q() { // from class: ej3.t0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d1.m0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f51686a.l(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2052592476, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.VehicleHistoryNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleHistoryNavContent.kt:296)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ej3.g0
                @Override // er.l
                public final Object b(Object obj) {
                    return d1.n0(sVar, (dk3.b) obj);
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
    public static final oq.i0 n0(f00.s sVar, dk3.b bVar) {
        if (bVar instanceof dk3.b.a) {
            sVar.getNavController().J();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1422462419, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.VehicleHistoryNavGraph.<anonymous>.<anonymous>.<anonymous> (VehicleHistoryNavContent.kt:308)");
        }
        o oVar = o.f51709a;
        f00.r.r(wVar, oVar, sVar.g(oVar), y2.m.d(-924468492, true, new er.q() { // from class: ej3.p0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d1.p0(sVar, (hb4.b) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p0(final f00.s sVar, hb4.b bVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-924468492, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclehistory.presentation.vehiclehistory.VehicleHistoryNavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VehicleHistoryNavContent.kt:312)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: ej3.v
                @Override // er.l
                public final Object b(Object obj) {
                    return d1.q0(sVar, (hb4.b.a) obj);
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
    public static final oq.i0 q0(f00.s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r0(er.l lVar, er.a aVar, VehicleIdentificationPayload vehicleIdentificationPayload, int i15, p076m2.r rVar, int i16) {
        L(lVar, aVar, vehicleIdentificationPayload, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
