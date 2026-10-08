package hb3;

import na3.SetupData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import y93.TripDetailsEditableData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a/\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\t\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lja3/a;", "colorScheme", "Lkotlin/Function0;", "Loq/i0;", "navResult", "", "countryIso", "Q", "(Lja3/a;Ler/a;Ljava/lang/String;Lm2/r;I)V", "T", "(Ler/a;Ljava/lang/String;Lm2/r;I)V", "travelabroad_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k1 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<oq.i0> {
        a(Object obj) {
            super(0, obj, mb3.l.class, "showCloseTripProcessDialog", "showCloseTripProcessDialog()V", 0);
        }

        public final void E() {
            ((mb3.l) this.f66391b).u9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements er.a<oq.i0> {
        b(Object obj) {
            super(0, obj, mb3.l.class, "onCloseTripProcess", "onCloseTripProcess()V", 0);
        }

        public final void E() {
            ((mb3.l) this.f66391b).r9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class c extends fr.q implements er.a<oq.i0> {
        c(Object obj) {
            super(0, obj, mb3.l.class, "onTripAdded", "onTripAdded()V", 0);
        }

        public final void E() {
            ((mb3.l) this.f66391b).s9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f82900a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f82901a;

            /* JADX INFO: renamed from: hb3.k1$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1905a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f82902d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f82903e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f82904f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                Object f82905g;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f82907j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f82908k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f82909l;

                public C1905a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f82902d = obj;
                    this.f82903e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar) {
                this.f82901a = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1905a c1905a;
                if (eVar instanceof C1905a) {
                    c1905a = (C1905a) eVar;
                    int i15 = c1905a.f82903e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1905a.f82903e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1905a = new C1905a(eVar);
                    }
                } else {
                    c1905a = new C1905a(eVar);
                }
                Object obj2 = c1905a.f82902d;
                Object objE = uq.b.e();
                int i16 = c1905a.f82903e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f82901a;
                    if (obj instanceof ka3.g.a.c) {
                        c1905a.f82904f = vq.j.a(obj);
                        c1905a.f82905g = vq.j.a(c1905a);
                        c1905a.f82907j = vq.j.a(obj);
                        c1905a.f82908k = vq.j.a(hVar);
                        c1905a.f82909l = 0;
                        c1905a.f82903e = 1;
                        if (hVar.F(obj, c1905a) == objE) {
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

        public d(mu.g gVar) {
            this.f82900a = gVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super Object> hVar, tq.e eVar) {
            Object objA = this.f82900a.a(new a(hVar), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A0(f00.s sVar, cb3.b bVar) {
        if (!fr.t.c(bVar, cb3.b.a.f24908a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2011986067, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:297)");
        }
        f00.r.o(wVar, fr.q0.c(ua3.r.class), sVar.g(l1.b.C1906b.f82920d), y2.m.d(604649822, true, new er.q() { // from class: hb3.y0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k1.C0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f82888a.m(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(604649822, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:302)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hb3.v
                @Override // er.l
                public final Object b(Object obj) {
                    return k1.D0(sVar, (ua3.c) obj);
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
    public static final oq.i0 D0(f00.s sVar, ua3.c cVar) {
        if (!fr.t.c(cVar, ua3.c.a.f196823a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(197138414, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:315)");
        }
        f00.r.o(wVar, fr.q0.c(ya3.x.class), sVar.g(l1.b.d.f82922d), y2.m.d(-1481192993, true, new er.q() { // from class: hb3.p0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k1.F0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f82888a.l(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1481192993, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:320)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hb3.w
                @Override // er.l
                public final Object b(Object obj) {
                    return k1.G0(sVar, (ya3.a) obj);
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
    public static final oq.i0 G0(f00.s sVar, ya3.a aVar) {
        if (!fr.t.c(aVar, ya3.a.C6045a.f225802a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H0(er.a aVar, String str, int i15, p076m2.r rVar, int i16) {
        T(aVar, str, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void Q(final ja3.a aVar, final er.a<oq.i0> aVar2, final String str, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1221558076);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.W(str) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1221558076, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavContent (NavContent.kt:55)");
            }
            p076m2.d0.c(ja3.c.c().d(aVar), y2.m.d(1310119300, true, new er.p() { // from class: hb3.y
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k1.R(aVar2, str, (p076m2.r) obj, ((Integer) obj2).intValue());
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
            d5VarM.a(new er.p() { // from class: hb3.z
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k1.S(aVar, aVar2, str, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(er.a aVar, String str, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1310119300, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavContent.<anonymous> (NavContent.kt:57)");
            }
            T(aVar, str, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S(ja3.a aVar, er.a aVar2, String str, int i15, p076m2.r rVar, int i16) {
        Q(aVar, aVar2, str, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void T(final er.a<oq.i0> aVar, final String str, p076m2.r rVar, final int i15) {
        int i16;
        zx.a aVar2;
        p076m2.r rVarH = rVar.h(625293904);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(str) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(625293904, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph (NavContent.kt:66)");
            }
            final f00.s sVarJ = f00.r.J(null, rVarH, 0, 1);
            if (str == null || (aVar2 = l1.b.a.f82918d) == null) {
                aVar2 = l1.g.f82938c;
            }
            boolean zG = ((i16 & 14) == 4) | rVarH.G(sVarJ) | ((i16 & 112) == 32);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: hb3.a0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return k1.U(aVar, sVarJ, str, (p136y9.d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            f00.d0.j(sVarJ, aVar2, (er.l) objE, rVarH, f00.s.f54562e);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: hb3.b0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k1.H0(aVar, str, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final oq.i0 U(final er.a aVar, final f00.s sVar, final String str, p136y9.d1 d1Var) {
        f00.r.u(d1Var, l1.g.f82938c, null, y2.m.b(1265739119, true, new er.r() { // from class: hb3.c0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k1.V(aVar, sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l1.h.f82939c, null, y2.m.b(-295988250, true, new er.r() { // from class: hb3.g0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k1.Y(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l1.e.f82936d, null, y2.m.b(1913136231, true, new er.r() { // from class: hb3.h0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k1.j0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l1.c.f82925d, null, y2.m.b(-172706584, true, new er.r() { // from class: hb3.i0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k1.m0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l1.b.c.f82921d, null, y2.m.b(2036417897, true, new er.r() { // from class: hb3.j0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k1.p0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l1.b.f.f82924d, null, y2.m.b(-49424918, true, new er.r() { // from class: hb3.k0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k1.s0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l1.b.a.f82918d, null, y2.m.b(-2135267733, true, new er.r() { // from class: hb3.l0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k1.v0(sVar, str, aVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l1.b.e.f82923d, null, y2.m.b(73856748, true, new er.r() { // from class: hb3.m0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k1.y0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l1.b.C1906b.f82920d, null, y2.m.b(-2011986067, true, new er.r() { // from class: hb3.n0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k1.B0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l1.b.d.f82922d, null, y2.m.b(197138414, true, new er.r() { // from class: hb3.o0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k1.E0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, l1.f.f82937c, null, y2.m.b(-81282842, true, new er.r() { // from class: hb3.d0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k1.b0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, l1.a.f82916c, new f00.g0.Dialog(null, 1, 0 == true ? 1 : 0), y2.m.b(2127841639, true, new er.r() { // from class: hb3.e0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return k1.g0(sVar, (p114t0.f) obj, (p136y9.w) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V(final er.a aVar, final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1265739119, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:76)");
        }
        f00.r.n(wVar, fr.q0.c(hc3.m.class), y2.m.d(-394897023, true, new er.q() { // from class: hb3.d1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k1.W(aVar, sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f82888a.r(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W(final er.a aVar, final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-394897023, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:80)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hb3.u
                @Override // er.l
                public final Object b(Object obj) {
                    return k1.X(aVar, sVar, (hc3.a) obj);
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
    public static final oq.i0 X(er.a aVar, f00.s sVar, hc3.a aVar2) {
        if (fr.t.c(aVar2, hc3.a.C1916a.f83257a)) {
            aVar.a();
        } else if (fr.t.c(aVar2, hc3.a.c.f83259a)) {
            f00.s.m(sVar, l1.h.f82939c, null, 2, null);
        } else {
            if (!fr.t.c(aVar2, hc3.a.b.f83258a)) {
                throw new oq.p();
            }
            f00.s.l(sVar, l1.b.c.f82921d, wa3.j.b.f211629a, null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-295988250, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:101)");
        }
        f00.r.n(wVar, fr.q0.c(kc3.e0.class), y2.m.d(1560513400, true, new er.q() { // from class: hb3.r0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k1.Z(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f82888a.k(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1560513400, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:105)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hb3.b1
                @Override // er.l
                public final Object b(Object obj) {
                    return k1.a0(sVar, (kc3.e.a) obj);
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
    public static final oq.i0 a0(f00.s sVar, kc3.e.a aVar) {
        if (fr.t.c(aVar, kc3.e.a.C2627a.f110004a)) {
            sVar.c();
        } else if (aVar instanceof kc3.e.a.ToRegisterNewTravel) {
            f00.s.l(sVar, l1.f.f82937c, new mb3.g.NewTrip(((kc3.e.a.ToRegisterNewTravel) aVar).getPersonalData()), null, 4, null);
        } else {
            if (!(aVar instanceof kc3.e.a.ToTripDetails)) {
                throw new oq.p();
            }
            f00.s.l(sVar, l1.e.f82936d, new ka3.h.Details(((kc3.e.a.ToTripDetails) aVar).getDetailsData(), false, 2, null), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 b0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-81282842, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:333)");
        }
        f00.r.o(wVar, fr.q0.c(mb3.l.class), sVar.g(l1.f.f82937c), y2.m.d(-569948907, true, new er.q() { // from class: hb3.u0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k1.c0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), y2.m.d(1524630822, true, new er.q() { // from class: hb3.v0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k1.e0(sVar, (mb3.l) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-569948907, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:338)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hb3.f0
                @Override // er.l
                public final Object b(Object obj) {
                    return k1.d0(sVar, (mb3.f.a) obj);
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
    public static final oq.i0 d0(f00.s sVar, mb3.f.a aVar) {
        if (aVar instanceof mb3.f.a.CloseTripProcessDialog) {
            f00.s.l(sVar, l1.a.f82916c, ((mb3.f.a.CloseTripProcessDialog) aVar).getData(), null, 4, null);
        } else if (fr.t.c(aVar, mb3.f.a.C3082a.f125271a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar, mb3.f.a.c.f125273a)) {
                throw new oq.p();
            }
            l1.h hVar = l1.h.f82939c;
            sVar.k(hVar, hVar);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e0(final f00.s sVar, mb3.l lVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1524630822, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:354)");
        }
        mb3.d dVarO9 = lVar.getContract();
        boolean zG = rVar.G(lVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new a(lVar);
            rVar.v(objE);
        }
        mr.g gVar = (mr.g) objE;
        boolean zG2 = rVar.G(lVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new b(lVar);
            rVar.v(objE2);
        }
        mr.g gVar2 = (mr.g) objE2;
        boolean zG3 = rVar.G(lVar);
        Object objE3 = rVar.E();
        if (zG3 || objE3 == p076m2.r.INSTANCE.a()) {
            objE3 = new c(lVar);
            rVar.v(objE3);
        }
        er.a aVar = (er.a) gVar2;
        er.a aVar2 = (er.a) gVar;
        er.a aVar3 = (er.a) ((mr.g) objE3);
        boolean zG4 = rVar.G(sVar);
        Object objE4 = rVar.E();
        if (zG4 || objE4 == p076m2.r.INSTANCE.a()) {
            objE4 = new er.p() { // from class: hb3.h1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k1.f0(sVar, (TripDetailsEditableData) obj, ((Boolean) obj2).booleanValue());
                }
            };
            rVar.v(objE4);
        }
        n2.B(dVarO9, aVar, aVar2, aVar3, (er.p) objE4, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f0(f00.s sVar, TripDetailsEditableData tripDetailsEditableData, boolean z15) {
        l1.e eVar = l1.e.f82936d;
        sVar.j(eVar, new ka3.h.Details(tripDetailsEditableData, z15), eVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2127841639, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:378)");
        }
        l1.a aVar = l1.a.f82916c;
        f00.r.r(wVar, aVar, sVar.g(aVar), y2.m.d(-1467290564, true, new er.q() { // from class: hb3.s0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k1.h0(sVar, (cb4.f) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h0(final f00.s sVar, cb4.f fVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1467290564, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:383)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hb3.g1
                @Override // er.l
                public final Object b(Object obj) {
                    return k1.i0(sVar, (cb4.f.a) obj);
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
    public static final oq.i0 i0(f00.s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1913136231, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:129)");
        }
        f00.r.o(wVar, fr.q0.c(ka3.o0.class), sVar.g(l1.e.f82936d), y2.m.d(234804824, true, new er.q() { // from class: hb3.w0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k1.k0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f82888a.o(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(234804824, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:134)");
        }
        d dVar2 = new d(dVar.Y1());
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hb3.q0
                @Override // er.l
                public final Object b(Object obj) {
                    return k1.l0(sVar, (ka3.g.a.c) obj);
                }
            };
            rVar.v(objE);
        }
        f00.f0.b(dVar2, (er.l) objE, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l0(f00.s sVar, ka3.g.a.c cVar) {
        if (fr.t.c(cVar, ka3.g.a.C2611a.f109411a)) {
            sVar.c();
        } else if (fr.t.c(cVar, ka3.g.a.b.f109412a)) {
            l1.h hVar = l1.h.f82939c;
            sVar.k(hVar, hVar);
        } else if (cVar instanceof ka3.g.a.OpenTrip) {
            f00.s.l(sVar, l1.f.f82937c, new mb3.g.ExistingTrip(((ka3.g.a.OpenTrip) cVar).getTripData()), null, 4, null);
        } else {
            if (!(cVar instanceof ka3.g.a.DownloadConfirmation)) {
                throw new oq.p();
            }
            f00.s.l(sVar, l1.c.f82925d, new SetupData(((ka3.g.a.DownloadConfirmation) cVar).getTripUuid(), null), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-172706584, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:167)");
        }
        f00.r.o(wVar, fr.q0.c(na3.q.class), sVar.g(l1.c.f82925d), y2.m.d(-1851037991, true, new er.q() { // from class: hb3.a1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k1.n0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f82888a.p(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1851037991, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:172)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hb3.x
                @Override // er.l
                public final Object b(Object obj) {
                    return k1.o0(sVar, (na3.c.a) obj);
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
    public static final oq.i0 o0(f00.s sVar, na3.c.a aVar) {
        if (!fr.t.c(aVar, na3.c.a.C3316a.f133726a) && !fr.t.c(aVar, na3.c.a.b.f133727a)) {
            throw new oq.p();
        }
        sVar.c();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2036417897, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:187)");
        }
        mr.c cVarC = fr.q0.c(wa3.p0.class);
        Object obj = (wa3.j) sVar.g(l1.b.c.f82921d);
        if (obj == null) {
            obj = wa3.j.b.f211629a;
        }
        f00.r.o(wVar, cVarC, obj, y2.m.d(358086490, true, new er.q() { // from class: hb3.z0
            @Override // er.q
            public final Object w(Object obj2, Object obj3, Object obj4) {
                return k1.q0(sVar, (zx.d) obj2, (p076m2.r) obj3, ((Integer) obj4).intValue());
            }
        }, rVar, 54), k.f82888a.t(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(358086490, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:193)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hb3.i1
                @Override // er.l
                public final Object b(Object obj) {
                    return k1.r0(sVar, (wa3.e.a) obj);
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
    public static final oq.i0 r0(f00.s sVar, wa3.e.a aVar) {
        if (fr.t.c(aVar, wa3.e.a.C5565a.f211609a)) {
            sVar.c();
        } else {
            if (!(aVar instanceof wa3.e.a.GoToCountryDetails)) {
                throw new oq.p();
            }
            f00.s.l(sVar, l1.b.a.f82918d, ((wa3.e.a.GoToCountryDetails) aVar).getData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-49424918, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:210)");
        }
        f00.r.n(wVar, fr.q0.c(fb3.l.class), y2.m.d(1807076732, true, new er.q() { // from class: hb3.x0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k1.t0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f82888a.s(), rVar, ((i15 >> 3) & 14) | 3456);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1807076732, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:214)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hb3.f1
                @Override // er.l
                public final Object b(Object obj) {
                    return k1.u0(sVar, (fb3.a) obj);
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
    public static final oq.i0 u0(f00.s sVar, fb3.a aVar) {
        if (fr.t.c(aVar, fb3.a.C1373a.f61004a)) {
            sVar.c();
        } else {
            if (!fr.t.c(aVar, fb3.a.b.f61005a)) {
                throw new oq.p();
            }
            f00.s.l(sVar, l1.b.c.f82921d, wa3.j.b.f211629a, null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v0(final f00.s sVar, final String str, final er.a aVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2135267733, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:231)");
        }
        mr.c cVarC = fr.q0.c(ra3.l0.class);
        ra3.SetupData setupData = (ra3.SetupData) sVar.g(l1.b.a.f82918d);
        if (setupData == null) {
            setupData = str != null ? new ra3.SetupData(str, true) : null;
            if (setupData == null) {
                setupData = new ra3.SetupData("", false);
                sVar.c();
                oq.i0 i0Var = oq.i0.f148189a;
            }
        }
        f00.r.o(wVar, cVarC, setupData, y2.m.d(481368156, true, new er.q() { // from class: hb3.t0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k1.w0(sVar, str, aVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f82888a.q(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w0(final f00.s sVar, final String str, final er.a aVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(481368156, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:241)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(str) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hb3.e1
                @Override // er.l
                public final Object b(Object obj) {
                    return k1.x0(sVar, str, aVar, (ra3.e.a) obj);
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
    public static final oq.i0 x0(f00.s sVar, String str, er.a aVar, ra3.e.a aVar2) {
        if (fr.t.c(aVar2, ra3.e.a.C4398a.f172579a)) {
            sVar.c();
        } else if (aVar2 instanceof ra3.e.a.ToCountryList) {
            if (str == null) {
                ra3.e.a.ToCountryList toCountryList = (ra3.e.a.ToCountryList) aVar2;
                sVar.j(l1.b.c.f82921d, new wa3.j.CountryToUpdateSubscriptionStatus(toCountryList.getIsoCode(), toCountryList.getIsSubscribed()), l1.b.a.f82918d);
            } else {
                aVar.a();
            }
        } else if (aVar2 instanceof ra3.e.a.ToProfileDetails) {
            f00.s.l(sVar, l1.b.e.f82923d, ((ra3.e.a.ToProfileDetails) aVar2).getData(), null, 4, null);
        } else if (aVar2 instanceof ra3.e.a.ToEmergencyContacts) {
            f00.s.l(sVar, l1.b.C1906b.f82920d, ((ra3.e.a.ToEmergencyContacts) aVar2).getData(), null, 4, null);
        } else {
            if (!(aVar2 instanceof ra3.e.a.ToMapPreview)) {
                throw new oq.p();
            }
            f00.s.l(sVar, l1.b.d.f82922d, ((ra3.e.a.ToMapPreview) aVar2).getData(), null, 4, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y0(final f00.s sVar, p114t0.f fVar, p136y9.w wVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(73856748, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:279)");
        }
        f00.r.o(wVar, fr.q0.c(cb3.p.class), sVar.g(l1.b.e.f82923d), y2.m.d(-1604474659, true, new er.q() { // from class: hb3.c1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return k1.z0(sVar, (zx.d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), k.f82888a.n(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z0(final f00.s sVar, zx.d dVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1604474659, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.navigation.NavGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavContent.kt:284)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: hb3.j1
                @Override // er.l
                public final Object b(Object obj) {
                    return k1.A0(sVar, (cb3.b) obj);
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
