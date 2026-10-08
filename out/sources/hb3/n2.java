package hb3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;
import vy.Coordinates;
import y93.TripDetailsEditableData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a[\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f²\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lmb3/b;", "contract", "Lkotlin/Function0;", "Loq/i0;", "onCloseTripProcess", "showCloseTripProcessDialog", "onTripAdded", "Lkotlin/Function2;", "Ly93/a;", "", "onOpenTripDetails", "B", "(Lmb3/b;Ler/a;Ler/a;Ler/a;Ler/p;Lm2/r;I)V", "", "currentStartPointRoute", "travelabroad_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n2 {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f82950a;

        /* JADX INFO: renamed from: hb3.n2$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1908a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f82951a;

            /* JADX INFO: renamed from: hb3.n2$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1909a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f82952d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f82953e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f82954f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                Object f82955g;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f82957j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f82958k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f82959l;

                public C1909a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f82952d = obj;
                    this.f82953e |= PKIFailureInfo.systemUnavail;
                    return C1908a.this.F(null, this);
                }
            }

            public C1908a(mu.h hVar) {
                this.f82951a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1909a c1909a;
                if (eVar instanceof C1909a) {
                    c1909a = (C1909a) eVar;
                    int i15 = c1909a.f82953e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1909a.f82953e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1909a = new C1909a(eVar);
                    }
                } else {
                    c1909a = new C1909a(eVar);
                }
                Object obj2 = c1909a.f82952d;
                Object objE = uq.b.e();
                int i16 = c1909a.f82953e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f82951a;
                    if (obj instanceof ka3.g.a.InterfaceC2612g) {
                        c1909a.f82954f = vq.j.a(obj);
                        c1909a.f82955g = vq.j.a(c1909a);
                        c1909a.f82957j = vq.j.a(obj);
                        c1909a.f82958k = vq.j.a(hVar);
                        c1909a.f82959l = 0;
                        c1909a.f82953e = 1;
                        if (hVar.F(obj, c1909a) == objE) {
                            return objE;
                        }
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public a(mu.g gVar) {
            this.f82950a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super Object> hVar, tq.e eVar) {
            Object objA = this.f82950a.a(new C1908a(hVar), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    public static final void B(final mb3.b bVar, final er.a<oq.i0> aVar, final er.a<oq.i0> aVar2, final er.a<oq.i0> aVar3, final er.p<? super TripDetailsEditableData, ? super Boolean, oq.i0> pVar, p076m2.r rVar, final int i15) {
        int i16;
        er.a<oq.i0> aVar4;
        er.a<oq.i0> aVar5;
        er.a<oq.i0> aVar6;
        er.p<? super TripDetailsEditableData, ? super Boolean, oq.i0> pVar2;
        final zx.a aVar7;
        final f00.s sVar;
        p076m2.r rVarH = rVar.h(1558392127);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(bVar) : rVarH.G(bVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            aVar4 = aVar;
            i16 |= rVarH.G(aVar4) ? 32 : 16;
        } else {
            aVar4 = aVar;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            aVar5 = aVar2;
            i16 |= rVarH.G(aVar5) ? 256 : 128;
        } else {
            aVar5 = aVar2;
        }
        if ((i15 & 3072) == 0) {
            aVar6 = aVar3;
            i16 |= rVarH.G(aVar6) ? 2048 : 1024;
        } else {
            aVar6 = aVar3;
        }
        if ((i15 & 24576) == 0) {
            pVar2 = pVar;
            i16 |= rVarH.G(pVar2) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            pVar2 = pVar;
        }
        if (rVarH.r((i16 & 9363) != 9362, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1558392127, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.TripNavContent (TripNavContent.kt:51)");
            }
            f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            mb3.a tripContext = bVar.getTripContext();
            if (fr.t.c(tripContext, mb3.a.C3081a.f125261a)) {
                aVar7 = l1.d.i.f82935d;
            } else {
                if (!(tripContext instanceof mb3.a.Edit)) {
                    throw new oq.p();
                }
                aVar7 = l1.d.C1907d.f82930d;
            }
            Object[] objArr = new Object[0];
            boolean zG = rVarH.G(aVar7);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: hb3.m1
                    @Override // er.a
                    public final Object a() {
                        return n2.D(aVar7);
                    }
                };
                rVarH.v(objE);
            }
            final a3 a3Var = (a3) b3.f.k(objArr, (er.a) objE, rVarH, 0);
            boolean zG2 = ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(bVar))) | ((i16 & 112) == 32) | rVarH.G(sVarJ) | rVarH.W(a3Var) | ((i16 & 896) == 256) | ((57344 & i16) == 16384) | ((i16 & 7168) == 2048);
            Object objE2 = rVarH.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                sVar = sVarJ;
                final er.a<oq.i0> aVar8 = aVar4;
                final er.a<oq.i0> aVar9 = aVar5;
                final er.a<oq.i0> aVar10 = aVar6;
                final er.p<? super TripDetailsEditableData, ? super Boolean, oq.i0> pVar3 = pVar2;
                er.l lVar = new er.l() { // from class: hb3.x1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n2.G(sVar, aVar8, bVar, a3Var, aVar9, pVar3, aVar10, (p136y9.d1) obj);
                    }
                };
                rVarH.v(lVar);
                objE2 = lVar;
            } else {
                sVar = sVarJ;
            }
            f00.d0.j(sVar, aVar7, (er.l) objE2, rVarH, f00.s.f54562e);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: hb3.f2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n2.f0(bVar, aVar, aVar2, aVar3, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void C(mb3.b bVar, er.a<oq.i0> aVar, f00.s sVar, a3<String> a3Var, l1.d dVar) {
        if ((bVar.getTripContext() instanceof mb3.a.Edit) && fr.t.c(dVar.getRoute(), E(a3Var))) {
            aVar.a();
        } else {
            sVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a3 D(zx.a aVar) {
        return c6.e(((l1) aVar).getRoute(), null, 2, null);
    }

    private static final String E(a3<String> a3Var) {
        return a3Var.getValue();
    }

    private static final void F(a3<String> a3Var, String str) {
        a3Var.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G(final f00.s sVar, final er.a aVar, final mb3.b bVar, final a3 a3Var, final er.a aVar2, final er.p pVar, final er.a aVar3, p136y9.d1 d1Var) {
        f00.r.u(d1Var, l1.d.i.f82935d, null, y2.m.b(-573113826, true, new er.r() { // from class: hb3.g2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return n2.H(aVar, sVar, bVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l1.d.C1907d.f82930d, null, y2.m.b(-61329323, true, new er.r() { // from class: hb3.h2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return n2.K(bVar, a3Var, aVar, sVar, aVar2, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l1.d.f.f82932d, null, y2.m.b(-619313386, true, new er.r() { // from class: hb3.i2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return n2.N(sVar, bVar, a3Var, aVar, aVar2, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        uw.m.c(d1Var, l1.d.b.f82928d, sVar);
        f00.r.u(d1Var, l1.d.e.f82931d, null, y2.m.b(-1177297449, true, new er.r() { // from class: hb3.j2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return n2.Q(sVar, bVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l1.d.c.f82929d, null, y2.m.b(-1735281512, true, new er.r() { // from class: hb3.k2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return n2.T(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l1.d.a.f82927d, null, y2.m.b(2001701721, true, new er.r() { // from class: hb3.l2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return n2.W(sVar, bVar, aVar2, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l1.d.h.f82934d, null, y2.m.b(1443717658, true, new er.r() { // from class: hb3.m2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return n2.Z(sVar, aVar2, pVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l1.d.g.f82933d, null, y2.m.b(885733595, true, new er.r() { // from class: hb3.n1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return n2.c0(aVar3, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(final er.a aVar, final f00.s sVar, final mb3.b bVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-573113826, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.TripNavContent.<anonymous>.<anonymous>.<anonymous> (TripNavContent.kt:72)");
        }
        f00.r.n(wVar, fr.q0.c(fc3.n.class), y2.m.d(2035769008, true, new er.q() { // from class: hb3.o1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return n2.I(aVar, sVar, bVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), t.f82975a.p(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(final er.a aVar, final f00.s sVar, final mb3.b bVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2035769008, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.TripNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TripNavContent.kt:76)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar) | rVar.G(bVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hb3.c2
                @Override // er.l
                public final Object b(Object obj) {
                    return n2.J(aVar, sVar, bVar, (fc3.a) obj);
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
    public static final oq.i0 J(er.a aVar, f00.s sVar, mb3.b bVar, fc3.a aVar2) {
        if (fr.t.c(aVar2, fc3.a.C1381a.f61114a)) {
            aVar.a();
        } else {
            if (!fr.t.c(aVar2, fc3.a.b.f61115a)) {
                throw new oq.p();
            }
            f00.s.l(sVar, l1.d.C1907d.f82930d, bVar, null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(final mb3.b bVar, final a3 a3Var, final er.a aVar, final f00.s sVar, final er.a aVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-61329323, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.TripNavContent.<anonymous>.<anonymous>.<anonymous> (TripNavContent.kt:93)");
        }
        f00.r.o(wVar, fr.q0.c(sb3.w.class), bVar, y2.m.d(641672326, true, new er.q() { // from class: hb3.v1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return n2.L(bVar, a3Var, aVar, sVar, aVar2, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), t.f82975a.o(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(final mb3.b bVar, final a3 a3Var, final er.a aVar, final f00.s sVar, final er.a aVar2, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(641672326, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.TripNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TripNavContent.kt:98)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(bVar) | rVar.W(a3Var) | rVar.W(aVar) | rVar.G(sVar) | rVar.W(aVar2);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar = new er.l() { // from class: hb3.y1
                @Override // er.l
                public final Object b(Object obj) {
                    return n2.M(aVar2, sVar, bVar, aVar, a3Var, (sb3.c.a) obj);
                }
            };
            rVar.v(lVar);
            objE = lVar;
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(er.a aVar, f00.s sVar, mb3.b bVar, er.a aVar2, a3 a3Var, sb3.c.a aVar3) {
        l1.d.C1907d c1907d;
        if (fr.t.c(aVar3, sb3.c.a.C4632a.f179908a)) {
            C(bVar, aVar2, sVar, a3Var, l1.d.C1907d.f82930d);
        } else if (fr.t.c(aVar3, sb3.c.a.b.f179909a)) {
            aVar.a();
        } else {
            if (!(aVar3 instanceof sb3.c.a.Next)) {
                throw new oq.p();
            }
            l1.d.f fVar = l1.d.f.f82932d;
            boolean popCurrentDestination = ((sb3.c.a.Next) aVar3).getPopCurrentDestination();
            if (popCurrentDestination) {
                F(a3Var, fVar.getRoute());
                c1907d = l1.d.C1907d.f82930d;
            } else {
                if (popCurrentDestination) {
                    throw new oq.p();
                }
                c1907d = null;
            }
            sVar.j(fVar, bVar, c1907d);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(final f00.s sVar, final mb3.b bVar, final a3 a3Var, final er.a aVar, final er.a aVar2, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-619313386, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.TripNavContent.<anonymous>.<anonymous>.<anonymous> (TripNavContent.kt:123)");
        }
        f00.r.o(wVar, fr.q0.c(yb3.j0.class), sVar.g(l1.d.f.f82932d), y2.m.d(83688263, true, new er.q() { // from class: hb3.u1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return n2.O(sVar, bVar, a3Var, aVar, aVar2, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), t.f82975a.m(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(final f00.s sVar, final mb3.b bVar, final a3 a3Var, final er.a aVar, final er.a aVar2, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(83688263, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.TripNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TripNavContent.kt:128)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(bVar) | rVar.W(a3Var) | rVar.W(aVar) | rVar.W(aVar2);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            er.l lVar = new er.l() { // from class: hb3.d2
                @Override // er.l
                public final Object b(Object obj) {
                    return n2.P(sVar, aVar2, bVar, aVar, a3Var, (yb3.c) obj);
                }
            };
            rVar.v(lVar);
            objE = lVar;
        }
        f00.f0.b(gVarY1, (er.l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P(f00.s sVar, er.a aVar, mb3.b bVar, er.a aVar2, a3 a3Var, yb3.c cVar) {
        if (cVar instanceof yb3.c.DateRangePicker) {
            f00.s.l(sVar, l1.d.b.f82928d, ((yb3.c.DateRangePicker) cVar).getData(), null, 4, null);
        } else if (cVar instanceof yb3.c.Map) {
            f00.s.l(sVar, l1.d.c.f82929d, ((yb3.c.Map) cVar).getData(), null, 4, null);
        } else if (fr.t.c(cVar, yb3.c.a.f226120a)) {
            C(bVar, aVar2, sVar, a3Var, l1.d.f.f82932d);
        } else if (fr.t.c(cVar, yb3.c.b.f226121a)) {
            aVar.a();
        } else {
            if (!fr.t.c(cVar, yb3.c.e.f226126a)) {
                throw new oq.p();
            }
            f00.s.l(sVar, l1.d.a.f82927d, bVar, null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q(final f00.s sVar, final mb3.b bVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1177297449, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.TripNavContent.<anonymous>.<anonymous>.<anonymous> (TripNavContent.kt:161)");
        }
        f00.r.n(wVar, fr.q0.c(wb3.l.class), y2.m.d(1993172457, true, new er.q() { // from class: hb3.q1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return n2.R(sVar, bVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), t.f82975a.n(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(final f00.s sVar, final mb3.b bVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1993172457, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.TripNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TripNavContent.kt:165)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(bVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hb3.b2
                @Override // er.l
                public final Object b(Object obj) {
                    return n2.S(sVar, bVar, (wb3.a) obj);
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
    public static final oq.i0 S(f00.s sVar, mb3.b bVar, wb3.a aVar) {
        if (fr.t.c(aVar, wb3.a.C5582a.f211842a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar, wb3.a.b.f211843a)) {
                throw new oq.p();
            }
            f00.s.l(sVar, l1.d.f.f82932d, bVar, null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1735281512, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.TripNavContent.<anonymous>.<anonymous>.<anonymous> (TripNavContent.kt:182)");
        }
        f00.r.o(wVar, fr.q0.c(ob3.y0.class), sVar.g(l1.d.c.f82929d), y2.m.d(-1032279863, true, new er.q() { // from class: hb3.s1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return n2.U(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), t.f82975a.i(), rVar, ((i15 >> 3) & 14) | 27648 | (Coordinates.f208679c << 6));
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1032279863, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.TripNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TripNavContent.kt:187)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hb3.w1
                @Override // er.l
                public final Object b(Object obj) {
                    return n2.V(sVar, (ob3.g.a) obj);
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
    public static final oq.i0 V(f00.s sVar, ob3.g.a aVar) {
        if (!fr.t.c(aVar, ob3.g.a.C3577a.f144292a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W(final f00.s sVar, final mb3.b bVar, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2001701721, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.TripNavContent.<anonymous>.<anonymous>.<anonymous> (TripNavContent.kt:200)");
        }
        f00.r.o(wVar, fr.q0.c(ib3.a0.class), sVar.g(l1.d.a.f82927d), y2.m.d(-1590263926, true, new er.q() { // from class: hb3.t1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return n2.X(sVar, bVar, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), t.f82975a.k(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X(final f00.s sVar, final mb3.b bVar, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1590263926, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.TripNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TripNavContent.kt:205)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.G(bVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hb3.e2
                @Override // er.l
                public final Object b(Object obj) {
                    return n2.Y(sVar, bVar, aVar, (ib3.c) obj);
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
    public static final oq.i0 Y(f00.s sVar, mb3.b bVar, er.a aVar, ib3.c cVar) {
        if (fr.t.c(cVar, ib3.c.a.f90785a)) {
            sVar.c();
        } else if (fr.t.c(cVar, ib3.c.C2153c.f90787a)) {
            f00.s.l(sVar, l1.d.h.f82934d, new ka3.h.Summary(bVar), null, 4, null);
        } else {
            if (!fr.t.c(cVar, ib3.c.b.f90786a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z(final f00.s sVar, final er.a aVar, final er.p pVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1443717658, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.TripNavContent.<anonymous>.<anonymous>.<anonymous> (TripNavContent.kt:226)");
        }
        f00.r.o(wVar, fr.q0.c(ka3.o0.class), sVar.g(l1.d.h.f82934d), y2.m.d(2146719307, true, new er.q() { // from class: hb3.p1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return n2.a0(sVar, aVar, pVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), t.f82975a.j(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 a0(final f00.s sVar, final er.a aVar, final er.p pVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2146719307, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.TripNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TripNavContent.kt:231)");
        }
        a aVar2 = new a(dVar.Y1());
        boolean zG = rVar.G(sVar) | rVar.W(aVar) | rVar.W(pVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hb3.z1
                @Override // er.l
                public final Object b(Object obj) {
                    return n2.b0(sVar, aVar, pVar, (ka3.g.a.InterfaceC2612g) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(aVar2, (er.l) objE, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b0(f00.s sVar, er.a aVar, er.p pVar, ka3.g.a.InterfaceC2612g interfaceC2612g) {
        if (fr.t.c(interfaceC2612g, ka3.g.a.C2611a.f109411a)) {
            sVar.c();
        } else if (fr.t.c(interfaceC2612g, ka3.g.a.b.f109412a)) {
            aVar.a();
        } else if (fr.t.c(interfaceC2612g, ka3.g.a.e.f109414a)) {
            f00.s.m(sVar, l1.d.g.f82933d, null, 2, null);
        } else {
            if (!(interfaceC2612g instanceof ka3.g.a.OpenTrip)) {
                throw new oq.p();
            }
            pVar.B(((ka3.g.a.OpenTrip) interfaceC2612g).getTripData(), Boolean.TRUE);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c0(final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(885733595, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.TripNavContent.<anonymous>.<anonymous>.<anonymous> (TripNavContent.kt:251)");
        }
        f00.r.n(wVar, fr.q0.c(dc3.n.class), y2.m.d(-238763795, true, new er.q() { // from class: hb3.r1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return n2.d0(aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), t.f82975a.l(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d0(final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-238763795, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.TripNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TripNavContent.kt:255)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hb3.a2
                @Override // er.l
                public final Object b(Object obj) {
                    return n2.e0(aVar, (dc3.c) obj);
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
    public static final oq.i0 e0(er.a aVar, dc3.c cVar) {
        if (!fr.t.c(cVar, dc3.c.a.f40909a)) {
            throw new oq.p();
        }
        aVar.a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f0(mb3.b bVar, er.a aVar, er.a aVar2, er.a aVar3, er.p pVar, int i15, p076m2.r rVar, int i16) {
        B(bVar, aVar, aVar2, aVar3, pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
