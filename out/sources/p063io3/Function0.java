package p063io3;

import android.annotation.SuppressLint;
import androidx.p016lifecycle.h;
import androidx.p016lifecycle.y0;
import dp3.n;
import er.a;
import er.l;
import er.p;
import er.q;
import f00.d0;
import f00.f0;
import f00.s;
import fr.q0;
import gx.b;
import jo3.PersonPayloadData;
import mu.g;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import p7.CreationExtras;
import wn3.c;
import xo3.i;
import xo3.x;
import y2.m;
import zx.d;

/* JADX INFO: renamed from: io3.t0, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\n\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "navResult", "Lkotlin/Function1;", "Lgx/b;", "sendGlobalEvent", "Lwn3/c;", "entryPoint", "Lio3/k;", "startDestination", "I", "(Ler/a;Ler/l;Lwn3/c;Lio3/k;Lm2/r;I)V", "verification_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    @SuppressLint({"RestrictedApi"})
    public static final void I(final a<i0> aVar, final l<? super b, i0> lVar, final c cVar, final k kVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1911472075);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(lVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(cVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= (i15 & PKIFailureInfo.certConfirmed) == 0 ? rVarH.W(kVar) : rVarH.G(kVar) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (t.k()) {
                t.o(-1911472075, i16, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.VerificationNavContent (VerificationNavContent.kt:57)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            boolean zG = ((i16 & 14) == 4) | rVarH.G(sVarJ) | rVarH.G(cVar) | ((i16 & 112) == 32);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: io3.l
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.J(sVarJ, aVar, cVar, lVar, (d1) obj);
                    }
                };
                rVarH.v(objE);
            }
            d0.j(sVarJ, kVar, (l) objE, rVarH, ((i16 >> 6) & 112) | s.f54562e);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: io3.w
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.q0(aVar, lVar, cVar, kVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(final s sVar, final a aVar, final c cVar, final l lVar, d1 d1Var) {
        f00.r.u(d1Var, k.f.f96073a, null, m.b(1191948534, true, new er.r() { // from class: io3.h0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.K(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, k.e.f96071a, null, m.b(1441253727, true, new er.r() { // from class: io3.n0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.N(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, k.h.f96077a, null, m.b(-431959810, true, new er.r() { // from class: io3.o0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.T(aVar, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, k.i.f96079a, null, m.b(1989793949, true, new er.r() { // from class: io3.p0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.V(cVar, sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, k.a.f96063a, null, m.b(116580412, true, new er.r() { // from class: io3.q0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.Y(cVar, sVar, aVar, lVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, k.b.f96065a, null, m.b(-1756633125, true, new er.r() { // from class: io3.r0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.b0(sVar, aVar, lVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, k.c.f96067a, null, m.b(665120634, true, new er.r() { // from class: io3.s0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.e0(sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, k.C2246k.f96083a, null, m.b(-1208092903, true, new er.r() { // from class: io3.m
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.h0(sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, k.j.f96081a, null, m.b(1213660856, true, new er.r() { // from class: io3.n
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.k0(sVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, k.g.f96075a, null, m.b(-659552681, true, new er.r() { // from class: io3.o
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.n0(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, k.d.f96069a, null, m.b(558384223, true, new er.r() { // from class: io3.m0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.Q(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1191948534, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.VerificationNavContent.<anonymous>.<anonymous>.<anonymous> (VerificationNavContent.kt:65)");
        }
        f00.r.o(wVar, q0.c(so3.m.class), uo3.a.WELCOME, m.d(290948325, true, new q() { // from class: io3.y
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.L(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f96051a.r(), rVar, ((i15 >> 3) & 14) | 28032);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(290948325, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.VerificationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VerificationNavContent.kt:69)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: io3.b0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.M(sVar, (so3.c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(s sVar, so3.c cVar) {
        if (!(cVar instanceof so3.c.a)) {
            throw new oq.p();
        }
        sVar.k(k.i.f96079a, k.f.f96073a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1441253727, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.VerificationNavContent.<anonymous>.<anonymous>.<anonymous> (VerificationNavContent.kt:82)");
        }
        f00.r.o(wVar, q0.c(so3.m.class), uo3.a.INFO, m.d(-1131520626, true, new q() { // from class: io3.r
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.O(sVar, (d) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f96051a.p(), rVar, ((i15 >> 3) & 14) | 28032);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1131520626, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.VerificationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VerificationNavContent.kt:86)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: io3.e0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.P(sVar, (so3.c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(s sVar, so3.c cVar) {
        if (!(cVar instanceof so3.c.a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(558384223, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.VerificationNavContent.<anonymous>.<anonymous>.<anonymous> (VerificationNavContent.kt:315)");
        }
        k.d dVar = k.d.f96069a;
        f00.r.r(wVar, dVar, sVar.g(dVar), m.d(-1788546688, true, new q() { // from class: io3.p
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.R(sVar, (hb4.b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(final s sVar, hb4.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1788546688, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.VerificationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VerificationNavContent.kt:319)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: io3.c0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.S(sVar, (hb4.b.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T(final a aVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-431959810, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.VerificationNavContent.<anonymous>.<anonymous>.<anonymous> (VerificationNavContent.kt:96)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        xo3.p pVar = (xo3.p) q7.d.c(q0.c(xo3.p.class), y0VarC, null, j7.a.a(y0VarC, rVar, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVar, 0, 0);
        xw.b<x.d> bVarY1 = pVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: io3.x
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.U(aVar, sVar, (xo3.x.d) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        i.i(pVar, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(a aVar, s sVar, x.d dVar) {
        if (dVar instanceof x.d.a) {
            aVar.a();
        } else if (dVar instanceof x.d.Error) {
            s.l(sVar, k.d.f96069a, ((x.d.Error) dVar).getErrorData(), null, 4, null);
        } else {
            if (!(dVar instanceof x.d.GoToVerificationDetail)) {
                throw new oq.p();
            }
            s.l(sVar, k.C2246k.f96083a, ((x.d.GoToVerificationDetail) dVar).getResponse(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V(c cVar, final s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1989793949, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.VerificationNavContent.<anonymous>.<anonymous>.<anonymous> (VerificationNavContent.kt:116)");
        }
        f00.r.o(wVar, q0.c(zo3.r.class), cVar, m.d(-582980404, true, new q() { // from class: io3.q
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.W(sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f96051a.l(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W(final s sVar, final a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-582980404, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.VerificationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VerificationNavContent.kt:120)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: io3.i0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.X(sVar, aVar, (zo3.a.f) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X(s sVar, a aVar, zo3.a.f fVar) {
        if (fVar instanceof zo3.a.f.GoToInstitutions) {
            s.l(sVar, k.a.f96063a, ((zo3.a.f.GoToInstitutions) fVar).getInstitutionPayloadData(), null, 4, null);
        } else if (fVar instanceof zo3.a.f.GoToPerson) {
            zo3.a.f.GoToPerson c6377f = (zo3.a.f.GoToPerson) fVar;
            s.l(sVar, k.b.f96065a, new PersonPayloadData(c6377f.getQrCodeData(), c6377f.getEntryPoint()), null, 4, null);
        } else if (fVar instanceof zo3.a.f.GoToWeb) {
            s.l(sVar, k.c.f96067a, ((zo3.a.f.GoToWeb) fVar).getQrCodeData(), null, 4, null);
        } else if (fVar instanceof zo3.a.f.C6376a) {
            aVar.a();
        } else if (fVar instanceof zo3.a.f.Error) {
            s.l(sVar, k.d.f96069a, ((zo3.a.f.Error) fVar).getErrorData(), null, 4, null);
        } else if (fVar instanceof zo3.a.f.b) {
            aVar.a();
        } else {
            if (!fr.t.c(fVar, zo3.a.f.e.f235907a)) {
                throw new oq.p();
            }
            s.l(sVar, k.e.f96071a, uo3.a.INFO, null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y(c cVar, final s sVar, final a aVar, final l lVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(116580412, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.VerificationNavContent.<anonymous>.<anonymous>.<anonymous> (VerificationNavContent.kt:160)");
        }
        f00.r.o(wVar, q0.c(mo3.t.class), cVar instanceof c.b.WithDeeplink ? new jo3.a.QrText(((c.b.WithDeeplink) cVar).getData()) : (jo3.a) sVar.g(k.a.f96063a), m.d(1838773355, true, new q() { // from class: io3.v
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.Z(sVar, aVar, lVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f96051a.m(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z(final s sVar, final a aVar, final l lVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1838773355, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.VerificationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VerificationNavContent.kt:168)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: io3.k0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.a0(sVar, aVar, lVar, (mo3.a.f) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 a0(s sVar, a aVar, l lVar, mo3.a.f fVar) {
        if (fVar instanceof mo3.a.f.C3142a) {
            if (!sVar.c()) {
                aVar.a();
            }
        } else if (fVar instanceof mo3.a.f.Next) {
            s.l(sVar, k.j.f96081a, ((mo3.a.f.Next) fVar).getData(), null, 4, null);
        } else if (fVar instanceof mo3.a.f.Error) {
            s.l(sVar, k.d.f96069a, ((mo3.a.f.Error) fVar).getErrorData(), null, 4, null);
        } else if (fVar instanceof mo3.a.f.b) {
            aVar.a();
        } else if (fVar instanceof mo3.a.f.e) {
            lVar.b(ju1.a.C2508a.f105876a);
        } else if (fVar instanceof mo3.a.f.GoToPinAuthentication) {
            s.l(sVar, k.g.f96075a, ((mo3.a.f.GoToPinAuthentication) fVar).getPinAuthResult(), null, 4, null);
        } else {
            if (!(fVar instanceof mo3.a.f.d)) {
                throw new oq.p();
            }
            lVar.b(l74.a.C2827a.f116925a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b0(final s sVar, final a aVar, final l lVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1756633125, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.VerificationNavContent.<anonymous>.<anonymous>.<anonymous> (VerificationNavContent.kt:206)");
        }
        f00.r.o(wVar, q0.c(oo3.w.class), sVar.g(k.b.f96065a), m.d(-34440182, true, new q() { // from class: io3.s
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.c0(sVar, aVar, lVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f96051a.o(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c0(final s sVar, final a aVar, final l lVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-34440182, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.VerificationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VerificationNavContent.kt:210)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar) | rVar.W(lVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: io3.f0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.d0(sVar, aVar, lVar, (oo3.a.h) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d0(s sVar, a aVar, l lVar, oo3.a.h hVar) {
        if (hVar instanceof oo3.a.h.C3671a) {
            sVar.c();
        } else if (hVar instanceof oo3.a.h.Next) {
            s.l(sVar, k.j.f96081a, ((oo3.a.h.Next) hVar).getData(), null, 4, null);
        } else if (hVar instanceof oo3.a.h.Error) {
            s.l(sVar, k.d.f96069a, ((oo3.a.h.Error) hVar).getErrorData(), null, 4, null);
        } else if (hVar instanceof oo3.a.h.b) {
            aVar.a();
        } else {
            if (!fr.t.c(hVar, oo3.a.h.d.f147880a)) {
                throw new oq.p();
            }
            lVar.b(ju1.a.C2508a.f105876a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e0(final s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(665120634, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.VerificationNavContent.<anonymous>.<anonymous>.<anonymous> (VerificationNavContent.kt:240)");
        }
        f00.r.o(wVar, q0.c(qo3.r.class), sVar.g(k.c.f96067a), m.d(-1907653719, true, new q() { // from class: io3.z
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.f0(sVar, aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f96051a.k(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f0(final s sVar, final a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1907653719, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.VerificationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VerificationNavContent.kt:244)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar) | rVar.W(aVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: io3.g0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.g0(sVar, aVar, (qo3.a.c) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g0(s sVar, a aVar, qo3.a.c cVar) {
        if (cVar instanceof qo3.a.c.C4227a) {
            sVar.c();
        } else if (cVar instanceof qo3.a.c.NavigateToWebSummary) {
            s.l(sVar, k.j.f96081a, ((qo3.a.c.NavigateToWebSummary) cVar).getData(), null, 4, null);
        } else if (cVar instanceof qo3.a.c.Error) {
            s.l(sVar, k.d.f96069a, ((qo3.a.c.Error) cVar).getErrorData(), null, 4, null);
        } else {
            if (!(cVar instanceof qo3.a.c.b)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h0(final s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1208092903, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.VerificationNavContent.<anonymous>.<anonymous>.<anonymous> (VerificationNavContent.kt:266)");
        }
        f00.r.o(wVar, q0.c(n.class), sVar.g(k.C2246k.f96083a), m.d(514100040, true, new q() { // from class: io3.t
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.i0(aVar, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f96051a.n(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i0(final a aVar, final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(514100040, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.VerificationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VerificationNavContent.kt:270)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: io3.j0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.j0(aVar, sVar, (dp3.a.b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j0(a aVar, s sVar, dp3.a.b bVar) {
        if (bVar instanceof dp3.a.b.C0981a) {
            aVar.a();
        } else {
            if (!(bVar instanceof dp3.a.b.Error)) {
                throw new oq.p();
            }
            s.l(sVar, k.d.f96069a, ((dp3.a.b.Error) bVar).getErrorData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k0(s sVar, final a aVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1213660856, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.VerificationNavContent.<anonymous>.<anonymous>.<anonymous> (VerificationNavContent.kt:285)");
        }
        f00.r.o(wVar, q0.c(bp3.l.class), sVar.g(k.j.f96081a), m.d(-1359113497, true, new q() { // from class: io3.a0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.l0(aVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f96051a.q(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l0(final a aVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1359113497, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.VerificationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VerificationNavContent.kt:289)");
        }
        g gVarY1 = dVar.Y1();
        boolean zW = rVar.W(aVar);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: io3.d0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.m0(aVar, (bp3.b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m0(a aVar, bp3.b bVar) {
        if (!(bVar instanceof bp3.b.a)) {
            throw new oq.p();
        }
        aVar.a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n0(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-659552681, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.VerificationNavContent.<anonymous>.<anonymous>.<anonymous> (VerificationNavContent.kt:300)");
        }
        f00.r.o(wVar, q0.c(vo3.m.class), sVar.g(k.g.f96075a), m.d(1062640262, true, new q() { // from class: io3.u
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.o0(sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), j.f96051a.j(), rVar, ((i15 >> 3) & 14) | 27648);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o0(final s sVar, d dVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1062640262, i15, -1, "pl.gov.coi.mobywatel.feature.verification.presentation.VerificationNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VerificationNavContent.kt:304)");
        }
        g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: io3.l0
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.p0(sVar, (vo3.a.b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p0(s sVar, vo3.a.b bVar) {
        if (!(bVar instanceof vo3.a.b.C5454a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q0(a aVar, l lVar, c cVar, k kVar, int i15, r rVar, int i16) {
        I(aVar, lVar, cVar, kVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
