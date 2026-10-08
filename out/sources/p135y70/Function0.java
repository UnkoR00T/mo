package p135y70;

import aa0.AddDocumentsEntryData;
import androidx.p016lifecycle.h;
import androidx.p016lifecycle.t0;
import androidx.p016lifecycle.y0;
import bc0.VerificationFamilyCardData;
import cb4.DialogData;
import e84.n;
import er.l;
import er.p;
import er.q;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.h0;
import f00.s;
import fr.q0;
import hb4.b;
import ju.p0;
import k90.g;
import k94.o;
import l84.i;
import m90.x;
import me0.VerificationUutCardData;
import oq.i0;
import oq.u;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p031db0.DocumentLoaderEntryData;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p112se0.d;
import p136y9.d1;
import p136y9.w;
import p7.CreationExtras;
import pe0.VerificationDocumentData;
import px.c;
import px.f;
import r74.DefaultNotificationDetailsData;
import tq.e;
import vq.k;
import y2.m;

/* JADX INFO: renamed from: y70.v3, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "goToSplashScreen", "goToAppLicense", "closeApp", "o1", "(Ler/a;Ler/a;Ler/a;Lm2/r;I)V", "app_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: y70.v3$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f225124e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f225125f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ y3 f225126g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y3 y3Var, e<? super a> eVar) {
            super(2, eVar);
            this.f225126g = y3Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p0 p0Var = (p0) this.f225125f;
            uq.b.e();
            if (this.f225124e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            f.f163100a.b("MJunior launch app cast", c.a(p0Var));
            this.f225126g.u9();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            a aVar = new a(this.f225126g, eVar);
            aVar.f225125f = obj;
            return aVar;
        }
    }

    /* JADX INFO: renamed from: y70.v3$b */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f225127a;

        static {
            int[] iArr = new int[xg0.a.values().length];
            try {
                iArr[xg0.a.ENERGY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xg0.a.GEOMETRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[xg0.a.COSMOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f225127a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A1(s sVar, VerificationDocumentData verificationDocumentData) {
        s.l(sVar, d.f181007a, verificationDocumentData, null, 4, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A2(s sVar, VerificationDocumentData verificationDocumentData) {
        s.l(sVar, d.f181007a, verificationDocumentData, null, 4, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A3(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-454916450, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:409)");
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.a() { // from class: y70.q2
                @Override // er.a
                public final Object a() {
                    return Function0.B3(sVar);
                }
            };
            rVar.v(objE);
        }
        p093oj2.Function0.e((er.a) objE, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B1(s sVar, String str) {
        sVar.j(p031db0.e.f40607a, new DocumentLoaderEntryData(str, cf0.c.JUNIOR_STUDENT_CARD), p069kd0.c.f110129a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B2(s sVar, String str) {
        sVar.j(p031db0.e.f40607a, new DocumentLoaderEntryData(str, cf0.c.DRIVING_LICENCE), p054gb0.b.f71562a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B3(s sVar) {
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C1(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-943378537, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:441)");
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.a() { // from class: y70.o1
                @Override // er.a
                public final Object a() {
                    return Function0.D1(sVar);
                }
            };
            rVar.v(objE);
        }
        er.a aVar = (er.a) objE;
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == r.INSTANCE.a()) {
            objE2 = new l() { // from class: y70.p1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.E1(sVar, (String) obj);
                }
            };
            rVar.v(objE2);
        }
        l lVar = (l) objE2;
        boolean zG3 = rVar.G(sVar);
        Object objE3 = rVar.E();
        if (zG3 || objE3 == r.INSTANCE.a()) {
            objE3 = new l() { // from class: y70.q1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.F1(sVar, (String) obj);
                }
            };
            rVar.v(objE3);
        }
        l lVar2 = (l) objE3;
        boolean zG4 = rVar.G(sVar);
        Object objE4 = rVar.E();
        if (zG4 || objE4 == r.INSTANCE.a()) {
            objE4 = new l() { // from class: y70.s1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.G1(sVar, (String) obj);
                }
            };
            rVar.v(objE4);
        }
        l lVar3 = (l) objE4;
        boolean zG5 = rVar.G(sVar);
        Object objE5 = rVar.E();
        if (zG5 || objE5 == r.INSTANCE.a()) {
            objE5 = new l() { // from class: y70.t1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.H1(sVar, (String) obj);
                }
            };
            rVar.v(objE5);
        }
        l lVar4 = (l) objE5;
        boolean zG6 = rVar.G(sVar);
        Object objE6 = rVar.E();
        if (zG6 || objE6 == r.INSTANCE.a()) {
            objE6 = new l() { // from class: y70.u1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.I1(sVar, (String) obj);
                }
            };
            rVar.v(objE6);
        }
        p031db0.Function0.f(aVar, lVar, lVar2, lVar3, lVar4, (l) objE6, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C2(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1805149116, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:698)");
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.a() { // from class: y70.d2
                @Override // er.a
                public final Object a() {
                    return Function0.D2(sVar);
                }
            };
            rVar.v(objE);
        }
        er.a aVar = (er.a) objE;
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == r.INSTANCE.a()) {
            objE2 = new l() { // from class: y70.e2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.E2(sVar, (VerificationUutCardData) obj);
                }
            };
            rVar.v(objE2);
        }
        l lVar = (l) objE2;
        boolean zG3 = rVar.G(sVar);
        Object objE3 = rVar.E();
        if (zG3 || objE3 == r.INSTANCE.a()) {
            objE3 = new l() { // from class: y70.f2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.F2(sVar, (String) obj);
                }
            };
            rVar.v(objE3);
        }
        p070ke0.Function0.f(aVar, lVar, (l) objE3, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C3(er.a aVar, er.a aVar2, er.a aVar3, int i15, r rVar, int i16) {
        o1(aVar, aVar2, aVar3, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D1(s sVar) {
        sVar.k(p092oa0.c.f143852a, p031db0.e.f40607a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D2(s sVar) {
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E1(s sVar, String str) {
        sVar.j(p069kd0.c.f110129a, str, p031db0.e.f40607a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E2(s sVar, VerificationUutCardData verificationUutCardData) {
        s.l(sVar, d.f181007a, bf0.b.h(verificationUutCardData), null, 4, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F1(s sVar, String str) {
        sVar.j(p054gb0.b.f71562a, str, p031db0.e.f40607a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F2(s sVar, String str) {
        sVar.j(p031db0.e.f40607a, new DocumentLoaderEntryData(str, cf0.c.UUT_CARD), p070ke0.b.f110246a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G1(s sVar, String str) {
        sVar.j(p137yb0.b.f225958a, str, p031db0.e.f40607a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G2(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-674330691, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:723)");
        }
        e eVar = e.f224996a;
        f00.r.r(wVar, eVar, sVar.g(eVar), m.d(1828660242, true, new q() { // from class: y70.w2
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.H2(sVar, (cb4.f) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H1(s sVar, String str) {
        sVar.j(p070ke0.b.f110246a, str, p031db0.e.f40607a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H2(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1828660242, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:727)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: y70.a3
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.I2(sVar, (cb4.f.a) obj);
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
    public static final i0 I1(s sVar, String str) {
        sVar.j(p102pb0.b.f154034a, str, p031db0.e.f40607a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I2(s sVar, cb4.f.a aVar) {
        if (!fr.t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J1(f6 f6Var, final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(872108952, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:487)");
        }
        x.c((xg0.a) f6Var.getValue(), m.d(-1734164795, true, new p() { // from class: y70.g2
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Function0.K1(sVar, (r) obj, ((Integer) obj2).intValue());
            }
        }, rVar, 54), rVar, 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J2(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1141156798, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:737)");
        }
        f fVar2 = f.f225003a;
        f00.r.r(wVar, fVar2, sVar.g(fVar2), m.d(-1535075587, true, new q() { // from class: y70.b1
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return Function0.K2(sVar, (b) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K1(final s sVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1734164795, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:488)");
            }
            boolean zG = rVar.G(sVar);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: y70.k3
                    @Override // er.a
                    public final Object a() {
                        return Function0.L1(sVar);
                    }
                };
                rVar.v(objE);
            }
            p112se0.Function0.k((er.a) objE, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K2(final s sVar, hb4.b bVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1535075587, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:741)");
        }
        xw.b<hb4.b.a> bVarY1 = bVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: y70.d3
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.L2(sVar, (b.a) obj);
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
    public static final i0 L1(s sVar) {
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L2(s sVar, hb4.b.a aVar) {
        if (!fr.t.c(aVar, hb4.b.a.C1910a.f83033a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M1(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1607370855, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:495)");
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.a() { // from class: y70.v1
                @Override // er.a
                public final Object a() {
                    return Function0.N1(sVar);
                }
            };
            rVar.v(objE);
        }
        er.a aVar = (er.a) objE;
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == r.INSTANCE.a()) {
            objE2 = new p() { // from class: y70.w1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.O1(sVar, (String) obj, (cf0.c) obj2);
                }
            };
            rVar.v(objE2);
        }
        p pVar = (p) objE2;
        boolean zG3 = rVar.G(sVar);
        Object objE3 = rVar.E();
        if (zG3 || objE3 == r.INSTANCE.a()) {
            objE3 = new l() { // from class: y70.x1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.P1(sVar, (VerificationDocumentData) obj);
                }
            };
            rVar.v(objE3);
        }
        p102pb0.Function0.f(aVar, pVar, (l) objE3, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M2(f6 f6Var, final er.a aVar, final s sVar, final er.a aVar2, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1537060504, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:201)");
        }
        m90.f.c((xg0.a) f6Var.getValue(), m.d(-2027848116, true, new p() { // from class: y70.j2
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Function0.N2(aVar, sVar, aVar2, (r) obj, ((Integer) obj2).intValue());
            }
        }, rVar, 54), rVar, 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N1(s sVar) {
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N2(er.a aVar, final s sVar, er.a aVar2, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-2027848116, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:202)");
            }
            boolean zG = rVar.G(sVar);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: y70.n3
                    @Override // er.a
                    public final Object a() {
                        return Function0.O2(sVar);
                    }
                };
                rVar.v(objE);
            }
            er.a aVar3 = (er.a) objE;
            boolean zG2 = rVar.G(sVar);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: y70.m
                    @Override // er.a
                    public final Object a() {
                        return Function0.P2(sVar);
                    }
                };
                rVar.v(objE2);
            }
            er.a aVar4 = (er.a) objE2;
            boolean zG3 = rVar.G(sVar);
            Object objE3 = rVar.E();
            if (zG3 || objE3 == r.INSTANCE.a()) {
                objE3 = new er.a() { // from class: y70.n
                    @Override // er.a
                    public final Object a() {
                        return Function0.a3(sVar);
                    }
                };
                rVar.v(objE3);
            }
            er.a aVar5 = (er.a) objE3;
            boolean zG4 = rVar.G(sVar);
            Object objE4 = rVar.E();
            if (zG4 || objE4 == r.INSTANCE.a()) {
                objE4 = new er.a() { // from class: y70.o
                    @Override // er.a
                    public final Object a() {
                        return Function0.b3(sVar);
                    }
                };
                rVar.v(objE4);
            }
            er.a aVar6 = (er.a) objE4;
            boolean zG5 = rVar.G(sVar);
            Object objE5 = rVar.E();
            if (zG5 || objE5 == r.INSTANCE.a()) {
                objE5 = new er.a() { // from class: y70.p
                    @Override // er.a
                    public final Object a() {
                        return Function0.c3(sVar);
                    }
                };
                rVar.v(objE5);
            }
            er.a aVar7 = (er.a) objE5;
            boolean zG6 = rVar.G(sVar);
            Object objE6 = rVar.E();
            if (zG6 || objE6 == r.INSTANCE.a()) {
                objE6 = new er.a() { // from class: y70.q
                    @Override // er.a
                    public final Object a() {
                        return Function0.d3(sVar);
                    }
                };
                rVar.v(objE6);
            }
            er.a aVar8 = (er.a) objE6;
            boolean zG7 = rVar.G(sVar);
            Object objE7 = rVar.E();
            if (zG7 || objE7 == r.INSTANCE.a()) {
                objE7 = new l() { // from class: y70.r
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.e3(sVar, (jb4.b) obj);
                    }
                };
                rVar.v(objE7);
            }
            l lVar = (l) objE7;
            boolean zG8 = rVar.G(sVar);
            Object objE8 = rVar.E();
            if (zG8 || objE8 == r.INSTANCE.a()) {
                objE8 = new l() { // from class: y70.t
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.f3(sVar, (String) obj);
                    }
                };
                rVar.v(objE8);
            }
            l lVar2 = (l) objE8;
            boolean zG9 = rVar.G(sVar);
            Object objE9 = rVar.E();
            if (zG9 || objE9 == r.INSTANCE.a()) {
                objE9 = new p() { // from class: y70.u
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return Function0.g3(sVar, (String) obj, (cf0.c) obj2);
                    }
                };
                rVar.v(objE9);
            }
            p pVar = (p) objE9;
            boolean zG10 = rVar.G(sVar);
            Object objE10 = rVar.E();
            if (zG10 || objE10 == r.INSTANCE.a()) {
                objE10 = new l() { // from class: y70.v
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.h3(sVar, (AddDocumentsEntryData) obj);
                    }
                };
                rVar.v(objE10);
            }
            l lVar3 = (l) objE10;
            boolean zG11 = rVar.G(sVar);
            Object objE11 = rVar.E();
            if (zG11 || objE11 == r.INSTANCE.a()) {
                objE11 = new l() { // from class: y70.o3
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.Q2(sVar, (String) obj);
                    }
                };
                rVar.v(objE11);
            }
            l lVar4 = (l) objE11;
            boolean zG12 = rVar.G(sVar);
            Object objE12 = rVar.E();
            if (zG12 || objE12 == r.INSTANCE.a()) {
                objE12 = new l() { // from class: y70.p3
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.R2(sVar, (String) obj);
                    }
                };
                rVar.v(objE12);
            }
            l lVar5 = (l) objE12;
            boolean zG13 = rVar.G(sVar);
            Object objE13 = rVar.E();
            if (zG13 || objE13 == r.INSTANCE.a()) {
                objE13 = new l() { // from class: y70.q3
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.S2(sVar, (String) obj);
                    }
                };
                rVar.v(objE13);
            }
            l lVar6 = (l) objE13;
            boolean zG14 = rVar.G(sVar);
            Object objE14 = rVar.E();
            if (zG14 || objE14 == r.INSTANCE.a()) {
                objE14 = new l() { // from class: y70.r3
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.T2(sVar, (String) obj);
                    }
                };
                rVar.v(objE14);
            }
            l lVar7 = (l) objE14;
            boolean zG15 = rVar.G(sVar);
            Object objE15 = rVar.E();
            if (zG15 || objE15 == r.INSTANCE.a()) {
                objE15 = new er.a() { // from class: y70.s3
                    @Override // er.a
                    public final Object a() {
                        return Function0.U2(sVar);
                    }
                };
                rVar.v(objE15);
            }
            er.a aVar9 = (er.a) objE15;
            boolean zG16 = rVar.G(sVar);
            Object objE16 = rVar.E();
            if (zG16 || objE16 == r.INSTANCE.a()) {
                objE16 = new er.a() { // from class: y70.t3
                    @Override // er.a
                    public final Object a() {
                        return Function0.V2(sVar);
                    }
                };
                rVar.v(objE16);
            }
            er.a aVar10 = (er.a) objE16;
            boolean zG17 = rVar.G(sVar);
            Object objE17 = rVar.E();
            if (zG17 || objE17 == r.INSTANCE.a()) {
                objE17 = new er.a() { // from class: y70.i
                    @Override // er.a
                    public final Object a() {
                        return Function0.W2(sVar);
                    }
                };
                rVar.v(objE17);
            }
            er.a aVar11 = (er.a) objE17;
            boolean zG18 = rVar.G(sVar);
            Object objE18 = rVar.E();
            if (zG18 || objE18 == r.INSTANCE.a()) {
                objE18 = new er.a() { // from class: y70.j
                    @Override // er.a
                    public final Object a() {
                        return Function0.X2(sVar);
                    }
                };
                rVar.v(objE18);
            }
            er.a aVar12 = (er.a) objE18;
            boolean zG19 = rVar.G(sVar);
            Object objE19 = rVar.E();
            if (zG19 || objE19 == r.INSTANCE.a()) {
                objE19 = new er.a() { // from class: y70.k
                    @Override // er.a
                    public final Object a() {
                        return Function0.Y2(sVar);
                    }
                };
                rVar.v(objE19);
            }
            er.a aVar13 = (er.a) objE19;
            boolean zG20 = rVar.G(sVar);
            Object objE20 = rVar.E();
            if (zG20 || objE20 == r.INSTANCE.a()) {
                objE20 = new er.a() { // from class: y70.l
                    @Override // er.a
                    public final Object a() {
                        return Function0.Z2(sVar);
                    }
                };
                rVar.v(objE20);
            }
            p092oa0.Function0.i(aVar, aVar3, aVar4, aVar5, aVar2, aVar6, aVar7, aVar8, lVar, lVar2, pVar, lVar3, lVar4, lVar5, lVar6, lVar7, aVar9, aVar10, aVar11, aVar12, aVar13, (er.a) objE20, rVar, 0, 0, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O1(s sVar, String str, cf0.c cVar) {
        sVar.j(p031db0.e.f40607a, new DocumentLoaderEntryData(str, cVar), p102pb0.b.f154034a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O2(s sVar) {
        sVar.k(p068kc0.c.f109893a, p092oa0.c.f143852a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P1(s sVar, VerificationDocumentData verificationDocumentData) {
        s.l(sVar, d.f181007a, verificationDocumentData, null, 4, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P2(s sVar) {
        s.i(sVar, p123uw0.b.f201850a, null, null, 6, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q1(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(208116634, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:517)");
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.a() { // from class: y70.l1
                @Override // er.a
                public final Object a() {
                    return Function0.R1(sVar);
                }
            };
            rVar.v(objE);
        }
        er.a aVar = (er.a) objE;
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == r.INSTANCE.a()) {
            objE2 = new p() { // from class: y70.m1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.S1(sVar, (String) obj, (cf0.c) obj2);
                }
            };
            rVar.v(objE2);
        }
        p pVar = (p) objE2;
        boolean zG3 = rVar.G(sVar);
        Object objE3 = rVar.E();
        if (zG3 || objE3 == r.INSTANCE.a()) {
            objE3 = new l() { // from class: y70.n1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.T1(sVar, (VerificationDocumentData) obj);
                }
            };
            rVar.v(objE3);
        }
        p102pb0.Function0.f(aVar, pVar, (l) objE3, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q2(s sVar, String str) {
        s.l(sVar, p054gb0.b.f71562a, str, null, 4, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R1(s sVar) {
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R2(s sVar, String str) {
        s.l(sVar, p137yb0.b.f225958a, str, null, 4, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S1(s sVar, String str, cf0.c cVar) {
        sVar.j(p031db0.e.f40607a, new DocumentLoaderEntryData(str, cVar), p102pb0.b.f154034a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S2(s sVar, String str) {
        s.l(sVar, p070ke0.b.f110246a, str, null, 4, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T1(s sVar, VerificationDocumentData verificationDocumentData) {
        s.l(sVar, d.f181007a, verificationDocumentData, null, 4, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T2(s sVar, String str) {
        s.l(sVar, p102pb0.b.f154034a, str, null, 4, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U1(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(2023604123, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:539)");
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.a() { // from class: y70.l2
                @Override // er.a
                public final Object a() {
                    return Function0.V1(sVar);
                }
            };
            rVar.v(objE);
        }
        er.a aVar = (er.a) objE;
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == r.INSTANCE.a()) {
            objE2 = new l() { // from class: y70.m2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.W1(sVar, (String) obj);
                }
            };
            rVar.v(objE2);
        }
        l lVar = (l) objE2;
        boolean zG3 = rVar.G(sVar);
        Object objE3 = rVar.E();
        if (zG3 || objE3 == r.INSTANCE.a()) {
            objE3 = new l() { // from class: y70.o2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.X1(sVar, (VerificationFamilyCardData) obj);
                }
            };
            rVar.v(objE3);
        }
        p137yb0.Function0.f(aVar, lVar, (l) objE3, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U2(s sVar) {
        s.m(sVar, x94.d.f217643a, null, 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V1(s sVar) {
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V2(s sVar) {
        s.m(sVar, t84.d.f188873a, null, 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W1(s sVar, String str) {
        sVar.j(p031db0.e.f40607a, new DocumentLoaderEntryData(str, cf0.c.FAMILY_CARD), p137yb0.b.f225958a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W2(s sVar) {
        s.m(sVar, pa4.d.f153980a, null, 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X1(s sVar, VerificationFamilyCardData verificationFamilyCardData) {
        s.l(sVar, d.f181007a, bf0.a.b(verificationFamilyCardData), null, 4, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X2(s sVar) {
        s.m(sVar, k94.c.f109268a, null, 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y1(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-455875684, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:561)");
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.a() { // from class: y70.h1
                @Override // er.a
                public final Object a() {
                    return Function0.Z1(sVar);
                }
            };
            rVar.v(objE);
        }
        p055gc0.Function0.e((er.a) objE, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y2(s sVar) {
        s.m(sVar, i.f117086a, null, 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z1(s sVar) {
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z2(s sVar) {
        s.m(sVar, e84.e.f48531a, null, 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 a2(f6 f6Var, final er.a aVar, final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1359611805, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:567)");
        }
        m90.i.c((xg0.a) f6Var.getValue(), m.d(-763439095, true, new p() { // from class: y70.a1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Function0.b2(aVar, sVar, (r) obj, ((Integer) obj2).intValue());
            }
        }, rVar, 54), rVar, 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 a3(s sVar) {
        s.m(sVar, p124vd0.b.f206239a, null, 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b2(er.a aVar, final s sVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-763439095, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:568)");
            }
            boolean zG = rVar.G(sVar);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: y70.z2
                    @Override // er.a
                    public final Object a() {
                        return Function0.c2(sVar);
                    }
                };
                rVar.v(objE);
            }
            p138yc0.Function0.h(aVar, (er.a) objE, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b3(s sVar) {
        s.m(sVar, p033de0.b.f41127a, null, 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c2(s sVar) {
        sVar.k(p068kc0.c.f109893a, p138yc0.c.f226308a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c3(s sVar) {
        s.l(sVar, t90.f.f188971a, t90.e.b.f188970a, null, 4, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d2(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1119868002, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:581)");
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.a() { // from class: y70.p2
                @Override // er.a
                public final Object a() {
                    return Function0.e2(sVar);
                }
            };
            rVar.v(objE);
        }
        p048fa0.Function0.f((er.a) objE, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d3(s sVar) {
        s.m(sVar, p055gc0.b.f71756a, null, 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e2(s sVar) {
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e3(s sVar, jb4.b bVar) {
        s.l(sVar, f.f225003a, bVar, null, 4, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f2(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(695619487, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:587)");
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.a() { // from class: y70.e1
                @Override // er.a
                public final Object a() {
                    return Function0.g2(sVar);
                }
            };
            rVar.v(objE);
        }
        p090o74.Function0.f((er.a) objE, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f3(s sVar, String str) {
        s.l(sVar, p069kd0.c.f110129a, str, null, 4, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g2(s sVar) {
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g3(s sVar, String str, cf0.c cVar) {
        sVar.j(p031db0.e.f40607a, new DocumentLoaderEntryData(str, cVar), p069kd0.c.f110129a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h2(f6 f6Var, final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-278426985, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:181)");
        }
        m90.c.c((xg0.a) f6Var.getValue(), m.d(-1982428049, true, new p() { // from class: y70.i1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Function0.i2(sVar, (r) obj, ((Integer) obj2).intValue());
            }
        }, rVar, 54), rVar, 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h3(s sVar, AddDocumentsEntryData addDocumentsEntryData) {
        s.l(sVar, p048fa0.b.f60398a, addDocumentsEntryData, null, 4, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i2(final s sVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1982428049, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:182)");
            }
            t90.e eVar = (t90.e) sVar.g(t90.f.f188971a);
            boolean zG = rVar.G(sVar);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: y70.h3
                    @Override // er.a
                    public final Object a() {
                        return Function0.j2(sVar);
                    }
                };
                rVar.v(objE);
            }
            er.a aVar = (er.a) objE;
            boolean zG2 = rVar.G(sVar);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: y70.i3
                    @Override // er.a
                    public final Object a() {
                        return Function0.k2(sVar);
                    }
                };
                rVar.v(objE2);
            }
            t90.r.l(eVar, aVar, (er.a) objE2, rVar, 0, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i3(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-942419303, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:324)");
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.a() { // from class: y70.v2
                @Override // er.a
                public final Object a() {
                    return Function0.j3(sVar);
                }
            };
            rVar.v(objE);
        }
        p033de0.Function0.e((er.a) objE, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j2(s sVar) {
        sVar.k(p092oa0.c.f143852a, t90.f.f188971a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j3(s sVar) {
        s.i(sVar, p092oa0.c.f143852a, null, null, 6, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k2(s sVar) {
        s.i(sVar, p092oa0.c.f143852a, null, t90.f.f188971a, 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k3(f6 f6Var, final er.a aVar, final y3 y3Var, final s sVar, final er.a aVar2, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(873068186, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:334)");
        }
        m90.l.c((xg0.a) f6Var.getValue(), m.d(-89137895, true, new p() { // from class: y70.d1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Function0.l3(aVar, y3Var, sVar, aVar2, (r) obj, ((Integer) obj2).intValue());
            }
        }, rVar, 54), rVar, 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l2(final s sVar, final y3 y3Var, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1981638581, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:593)");
        }
        w74.a aVar = w74.a.MJUNIOR;
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.a() { // from class: y70.h2
                @Override // er.a
                public final Object a() {
                    return Function0.m2(sVar);
                }
            };
            rVar.v(objE);
        }
        er.a aVar2 = (er.a) objE;
        boolean zG2 = rVar.G(y3Var);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == r.INSTANCE.a()) {
            objE2 = new l() { // from class: y70.i2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.n2(y3Var, (l84.d.e) obj);
                }
            };
            rVar.v(objE2);
        }
        l84.r.i(aVar, aVar2, (l) objE2, rVar, 6);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l3(er.a aVar, final y3 y3Var, final s sVar, er.a aVar2, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-89137895, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:335)");
            }
            boolean zG = rVar.G(y3Var);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: y70.y
                    @Override // er.a
                    public final Object a() {
                        return Function0.m3(y3Var);
                    }
                };
                rVar.v(objE);
            }
            er.a aVar3 = (er.a) objE;
            boolean zG2 = rVar.G(sVar);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: y70.z
                    @Override // er.a
                    public final Object a() {
                        return Function0.n3(sVar);
                    }
                };
                rVar.v(objE2);
            }
            er.a aVar4 = (er.a) objE2;
            boolean zG3 = rVar.G(sVar);
            Object objE3 = rVar.E();
            if (zG3 || objE3 == r.INSTANCE.a()) {
                objE3 = new er.a() { // from class: y70.a0
                    @Override // er.a
                    public final Object a() {
                        return Function0.o3(sVar);
                    }
                };
                rVar.v(objE3);
            }
            p068kc0.Function0.g(aVar, aVar3, aVar4, (er.a) objE3, aVar2, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m2(s sVar) {
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m3(y3 y3Var) {
        y3Var.v9();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n2(y3 y3Var, l84.d.e eVar) {
        if (eVar instanceof l84.d.e.GoToNotificationDetail) {
            l84.d.e.GoToNotificationDetail goToNotificationDetail = (l84.d.e.GoToNotificationDetail) eVar;
            y3Var.w9(new DefaultNotificationDetailsData(goToNotificationDetail.getRecord().getId(), goToNotificationDetail.getRecord().getDisplayed(), goToNotificationDetail.getRecord().getSendingDateTime(), goToNotificationDetail.getRecord().getTitle(), goToNotificationDetail.getRecord().getContent(), goToNotificationDetail.getRecord().getPrivateContent()));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n3(s sVar) {
        sVar.j(t90.f.f188971a, t90.e.a.f188969a, p068kc0.c.f109893a);
        return i0.f148189a;
    }

    public static final void o1(final er.a<i0> aVar, final er.a<i0> aVar2, final er.a<i0> aVar3, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1962965505);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(aVar2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar3) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (t.k()) {
                t.o(1962965505, i16, -1, "pl.gov.coi.mjunior.AppNavigationContent (AppNavigationContent.kt:108)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            y0 y0VarC = q7.b.f165175a.c(rVarH, q7.b.f165177c);
            if (y0VarC == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            t0 t0VarC = q7.d.c(q0.c(y3.class), y0VarC, null, j7.a.a(y0VarC, rVarH, 0), y0VarC instanceof h ? ((h) y0VarC).x() : CreationExtras.b.f153222c, rVarH, 0, 0);
            rVarH = rVarH;
            final y3 y3Var = (y3) t0VarC;
            final f6 f6VarC = m7.b.c(y3Var.r9(), null, null, null, rVarH, 0, 7);
            oz.l.b(y3Var.getLifecycleConnector(), rVarH, 0);
            xw.b<p135y70.b> bVarY1 = y3Var.Y1();
            boolean zG = rVarH.G(sVarJ);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: y70.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.p1(sVarJ, (b) obj);
                    }
                };
                rVarH.v(objE);
            }
            f0.b(bVarY1, (l) objE, rVarH, xw.b.f221619c);
            g.i((xg0.a) f6VarC.getValue(), m.d(809345024, true, new p() { // from class: y70.k0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.q1(sVarJ, y3Var, f6VarC, aVar, aVar3, aVar2, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: y70.v0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.C3(aVar, aVar2, aVar3, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o2(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-497841226, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:617)");
        }
        w74.a aVar = w74.a.MJUNIOR;
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.a() { // from class: y70.t2
                @Override // er.a
                public final Object a() {
                    return Function0.p2(sVar);
                }
            };
            rVar.v(objE);
        }
        n.i(aVar, (er.a) objE, rVar, 6);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o3(s sVar) {
        sVar.k(p138yc0.c.f226308a, p068kc0.c.f109893a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p1(s sVar, p135y70.b bVar) {
        if (fr.t.c(bVar, p135y70.b.C6029b.f224968a)) {
            sVar.k(p068kc0.c.f109893a, h0.ALL);
        } else if (fr.t.c(bVar, y70.b.e.f224971a)) {
            sVar.k(p032dd0.c.f40955a, h0.ALL);
        } else if (fr.t.c(bVar, y70.b.a.f224967a)) {
            sVar.k(p092oa0.c.f143852a, h0.ALL);
        } else if (fr.t.c(bVar, y70.b.c.f224969a)) {
            sVar.k(p138yc0.c.f226308a, h0.ALL);
        } else if (fr.t.c(bVar, y70.b.f.f224972a)) {
            sVar.k(p068kc0.c.f109893a, h0.ALL);
        } else {
            if (!(bVar instanceof p135y70.b.GoToNotificationDetails)) {
                throw new oq.p();
            }
            s.l(sVar, p090o74.f.f142952a, ((p135y70.b.GoToNotificationDetails) bVar).getData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p2(s sVar) {
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p3(f6 f6Var, final s sVar, final er.a aVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1606411621, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:359)");
        }
        m90.u.c((xg0.a) f6Var.getValue(), m.d(-159759530, true, new p() { // from class: y70.c1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Function0.q3(sVar, aVar, (r) obj, ((Integer) obj2).intValue());
            }
        }, rVar, 54), rVar, 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q1(final s sVar, final y3 y3Var, final f6 f6Var, final er.a aVar, final er.a aVar2, final er.a aVar3, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(809345024, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous> (AppNavigationContent.kt:151)");
            }
            g gVar = g.f225012a;
            boolean zG = rVar.G(y3Var) | rVar.W(f6Var) | rVar.W(aVar) | rVar.G(sVar) | rVar.W(aVar2) | rVar.W(aVar3);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                l lVar = new l() { // from class: y70.g1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.r1(y3Var, f6Var, aVar, sVar, aVar2, aVar3, (d1) obj);
                    }
                };
                rVar.v(lVar);
                objE = lVar;
            }
            d0.j(sVar, gVar, (l) objE, rVar, s.f54562e | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q2(f6 f6Var, final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        y94.a aVar;
        if (t.k()) {
            t.o(1317646263, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:624)");
        }
        u94.a aVar2 = u94.a.MJUNIOR;
        int i16 = b.f225127a[((xg0.a) f6Var.getValue()).ordinal()];
        if (i16 == 1 || i16 == 2) {
            aVar = y94.e.f225692a;
        } else {
            if (i16 != 3) {
                throw new oq.p();
            }
            aVar = y94.d.f225691a;
        }
        y94.a aVar3 = aVar;
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.a() { // from class: y70.j1
                @Override // er.a
                public final Object a() {
                    return Function0.r2(sVar);
                }
            };
            rVar.v(objE);
        }
        x94.s.o(aVar3, aVar2, null, null, (er.a) objE, rVar, 432, 8);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q3(final s sVar, er.a aVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-159759530, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:360)");
            }
            boolean zG = rVar.G(sVar);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: y70.l3
                    @Override // er.a
                    public final Object a() {
                        return Function0.r3(sVar);
                    }
                };
                rVar.v(objE);
            }
            er.a aVar2 = (er.a) objE;
            boolean zG2 = rVar.G(sVar);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: y70.m3
                    @Override // er.a
                    public final Object a() {
                        return Function0.s3(sVar);
                    }
                };
                rVar.v(objE2);
            }
            p111sd0.Function0.e(aVar2, aVar, (er.a) objE2, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final i0 r1(final y3 y3Var, final f6 f6Var, final er.a aVar, final s sVar, final er.a aVar2, final er.a aVar3, d1 d1Var) {
        f00.r.u(d1Var, g.f225012a, null, m.b(925050783, true, new er.r() { // from class: y70.r1
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.s1(y3Var, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p032dd0.c.f40955a, null, m.b(-2093914474, true, new er.r() { // from class: y70.f0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.t1(f6Var, aVar, sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, t90.f.f188971a, null, m.b(-278426985, true, new er.r() { // from class: y70.r0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.h2(f6Var, sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p092oa0.c.f143852a, null, m.b(1537060504, true, new er.r() { // from class: y70.s0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.M2(f6Var, aVar2, sVar, aVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p033de0.b.f41127a, null, m.b(-942419303, true, new er.r() { // from class: y70.t0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.i3(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p068kc0.c.f109893a, null, m.b(873068186, true, new er.r() { // from class: y70.u0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.k3(f6Var, aVar2, y3Var, sVar, aVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p111sd0.b.f180267a, null, m.b(-1606411621, true, new er.r() { // from class: y70.w0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.p3(f6Var, sVar, aVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p124vd0.b.f206239a, null, m.b(209075868, true, new er.r() { // from class: y70.x0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.t3(f6Var, sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p123uw0.b.f201850a, null, m.b(2024563357, true, new er.r() { // from class: y70.y0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.x3(sVar, aVar3, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p093oj2.b.f146360a, null, m.b(-454916450, true, new er.r() { // from class: y70.z0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.A3(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p069kd0.c.f110129a, null, m.b(1536101270, true, new er.r() { // from class: y70.c2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.x1(f6Var, sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p031db0.e.f40607a, null, m.b(-943378537, true, new er.r() { // from class: y70.n2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.C1(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, d.f181007a, null, m.b(872108952, true, new er.r() { // from class: y70.y2
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.J1(f6Var, sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        p102pb0.b bVar = p102pb0.b.f154034a;
        f00.r.u(d1Var, bVar, null, m.b(-1607370855, true, new er.r() { // from class: y70.j3
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.M1(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, bVar, null, m.b(208116634, true, new er.r() { // from class: y70.u3
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.Q1(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p137yb0.b.f225958a, null, m.b(2023604123, true, new er.r() { // from class: y70.s
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.U1(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p055gc0.b.f71756a, null, m.b(-455875684, true, new er.r() { // from class: y70.b0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.Y1(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p138yc0.c.f226308a, null, m.b(1359611805, true, new er.r() { // from class: y70.c0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.a2(f6Var, aVar, sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p048fa0.b.f60398a, null, m.b(-1119868002, true, new er.r() { // from class: y70.d0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.d2(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p090o74.f.f142952a, null, m.b(695619487, true, new er.r() { // from class: y70.e0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.f2(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, i.f117086a, null, m.b(1981638581, true, new er.r() { // from class: y70.g0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.l2(sVar, y3Var, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, e84.e.f48531a, null, m.b(-497841226, true, new er.r() { // from class: y70.h0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.o2(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, x94.d.f217643a, null, m.b(1317646263, true, new er.r() { // from class: y70.i0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.q2(f6Var, sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, k94.c.f109268a, null, m.b(-1161833544, true, new er.r() { // from class: y70.j0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.s2(f6Var, sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, t84.d.f188873a, null, m.b(653653945, true, new er.r() { // from class: y70.l0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.u2(f6Var, sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, pa4.d.f153980a, null, m.b(-1825825862, true, new er.r() { // from class: y70.m0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.w2(f6Var, sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p054gb0.b.f71562a, null, m.b(-10338373, true, new er.r() { // from class: y70.n0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.y2(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, p070ke0.b.f110246a, null, m.b(1805149116, true, new er.r() { // from class: y70.o0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.C2(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, e.f224996a, new g0.Dialog(null, 1, 0 == true ? 1 : 0), m.b(-674330691, true, new er.r() { // from class: y70.p0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.G2(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        f00.r.u(d1Var, f.f225003a, null, m.b(1141156798, true, new er.r() { // from class: y70.q0
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return Function0.J2(sVar, (p114t0.f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r2(s sVar) {
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r3(s sVar) {
        sVar.j(t90.f.f188971a, t90.e.b.f188970a, p111sd0.b.f180267a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s1(y3 y3Var, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(925050783, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:156)");
        }
        i0 i0Var = i0.f148189a;
        boolean zG = rVar.G(y3Var);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new a(y3Var, null);
            rVar.v(objE);
        }
        p076m2.Function0.d(i0Var, (p) objE, rVar, 6);
        if (t.k()) {
            t.n();
        }
        return i0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s2(f6 f6Var, final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        l94.a aVar;
        if (t.k()) {
            t.o(-1161833544, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:637)");
        }
        h94.a aVar2 = h94.a.MJUNIOR;
        int i16 = b.f225127a[((xg0.a) f6Var.getValue()).ordinal()];
        if (i16 == 1 || i16 == 2) {
            aVar = l94.e.f117390a;
        } else {
            if (i16 != 3) {
                throw new oq.p();
            }
            aVar = l94.d.f117377a;
        }
        l94.a aVar3 = aVar;
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.a() { // from class: y70.u2
                @Override // er.a
                public final Object a() {
                    return Function0.t2(sVar);
                }
            };
            rVar.v(objE);
        }
        o.l(aVar3, aVar2, null, (er.a) objE, rVar, 432);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s3(s sVar) {
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t1(f6 f6Var, final er.a aVar, final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-2093914474, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:163)");
        }
        m90.o.c((xg0.a) f6Var.getValue(), m.d(883054217, true, new p() { // from class: y70.k2
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Function0.u1(aVar, sVar, (r) obj, ((Integer) obj2).intValue());
            }
        }, rVar, 54), rVar, 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t2(s sVar) {
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t3(f6 f6Var, final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(209075868, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:377)");
        }
        m90.u.c((xg0.a) f6Var.getValue(), m.d(1655727959, true, new p() { // from class: y70.k1
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Function0.u3(sVar, (r) obj, ((Integer) obj2).intValue());
            }
        }, rVar, 54), rVar, 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u1(er.a aVar, final s sVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(883054217, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:164)");
            }
            boolean zG = rVar.G(sVar);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: y70.b3
                    @Override // er.a
                    public final Object a() {
                        return Function0.v1(sVar);
                    }
                };
                rVar.v(objE);
            }
            er.a aVar2 = (er.a) objE;
            boolean zG2 = rVar.G(sVar);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: y70.c3
                    @Override // er.a
                    public final Object a() {
                        return Function0.w1(sVar);
                    }
                };
                rVar.v(objE2);
            }
            p032dd0.Function0.g(aVar, aVar2, (er.a) objE2, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u2(f6 f6Var, final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        u84.a aVar;
        if (t.k()) {
            t.o(653653945, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:650)");
        }
        q84.a aVar2 = q84.a.MJUNIOR;
        int i16 = b.f225127a[((xg0.a) f6Var.getValue()).ordinal()];
        if (i16 == 1 || i16 == 2) {
            aVar = u84.e.f196518a;
        } else {
            if (i16 != 3) {
                throw new oq.p();
            }
            aVar = u84.d.f196517a;
        }
        u84.a aVar3 = aVar;
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.a() { // from class: y70.f1
                @Override // er.a
                public final Object a() {
                    return Function0.v2(sVar);
                }
            };
            rVar.v(objE);
        }
        t84.s.o(aVar3, aVar2, null, null, null, (er.a) objE, rVar, 432, 24);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u3(final s sVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1655727959, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:378)");
            }
            boolean zG = rVar.G(sVar);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: y70.w
                    @Override // er.a
                    public final Object a() {
                        return Function0.v3(sVar);
                    }
                };
                rVar.v(objE);
            }
            er.a aVar = (er.a) objE;
            boolean zG2 = rVar.G(sVar);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == r.INSTANCE.a()) {
                objE2 = new l() { // from class: y70.x
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.w3(sVar, (DialogData) obj);
                    }
                };
                rVar.v(objE2);
            }
            p124vd0.Function0.e(aVar, (l) objE2, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v1(s sVar) {
        s.m(sVar, p111sd0.b.f180267a, null, 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v2(s sVar) {
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v3(s sVar) {
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w1(s sVar) {
        s.m(sVar, p055gc0.b.f71756a, null, 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w2(f6 f6Var, final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        qa4.a aVar;
        if (t.k()) {
            t.o(-1825825862, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:663)");
        }
        ma4.a aVar2 = ma4.a.MJUNIOR;
        int i16 = b.f225127a[((xg0.a) f6Var.getValue()).ordinal()];
        if (i16 == 1 || i16 == 2) {
            aVar = qa4.e.f165677a;
        } else {
            if (i16 != 3) {
                throw new oq.p();
            }
            aVar = qa4.d.f165676a;
        }
        qa4.a aVar3 = aVar;
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.a() { // from class: y70.x2
                @Override // er.a
                public final Object a() {
                    return Function0.x2(sVar);
                }
            };
            rVar.v(objE);
        }
        pa4.p.l(aVar3, aVar2, null, null, (er.a) objE, rVar, 432, 8);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w3(s sVar, DialogData dialogData) {
        sVar.j(e.f224996a, dialogData, p124vd0.b.f206239a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x1(f6 f6Var, final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(1536101270, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:417)");
        }
        m90.r.c((xg0.a) f6Var.getValue(), m.d(86811084, true, new p() { // from class: y70.b2
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return Function0.y1(sVar, (r) obj, ((Integer) obj2).intValue());
            }
        }, rVar, 54), rVar, 48);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x2(s sVar) {
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x3(final s sVar, er.a aVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(2024563357, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:394)");
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.a() { // from class: y70.r2
                @Override // er.a
                public final Object a() {
                    return Function0.y3(sVar);
                }
            };
            rVar.v(objE);
        }
        er.a aVar2 = (er.a) objE;
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == r.INSTANCE.a()) {
            objE2 = new er.a() { // from class: y70.s2
                @Override // er.a
                public final Object a() {
                    return Function0.z3(sVar);
                }
            };
            rVar.v(objE2);
        }
        p123uw0.Function0.f(aVar2, aVar, (er.a) objE2, false, rVar, 3072);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y1(final s sVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(86811084, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:418)");
            }
            boolean zG = rVar.G(sVar);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: y70.e3
                    @Override // er.a
                    public final Object a() {
                        return Function0.z1(sVar);
                    }
                };
                rVar.v(objE);
            }
            er.a aVar = (er.a) objE;
            boolean zG2 = rVar.G(sVar);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == r.INSTANCE.a()) {
                objE2 = new l() { // from class: y70.f3
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.A1(sVar, (VerificationDocumentData) obj);
                    }
                };
                rVar.v(objE2);
            }
            l lVar = (l) objE2;
            boolean zG3 = rVar.G(sVar);
            Object objE3 = rVar.E();
            if (zG3 || objE3 == r.INSTANCE.a()) {
                objE3 = new l() { // from class: y70.g3
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.B1(sVar, (String) obj);
                    }
                };
                rVar.v(objE3);
            }
            p069kd0.Function0.i(aVar, lVar, (l) objE3, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y2(final s sVar, p114t0.f fVar, w wVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-10338373, i15, -1, "pl.gov.coi.mjunior.AppNavigationContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNavigationContent.kt:676)");
        }
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.a() { // from class: y70.y1
                @Override // er.a
                public final Object a() {
                    return Function0.z2(sVar);
                }
            };
            rVar.v(objE);
        }
        er.a aVar = (er.a) objE;
        boolean zG2 = rVar.G(sVar);
        Object objE2 = rVar.E();
        if (zG2 || objE2 == r.INSTANCE.a()) {
            objE2 = new l() { // from class: y70.z1
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.A2(sVar, (VerificationDocumentData) obj);
                }
            };
            rVar.v(objE2);
        }
        l lVar = (l) objE2;
        boolean zG3 = rVar.G(sVar);
        Object objE3 = rVar.E();
        if (zG3 || objE3 == r.INSTANCE.a()) {
            objE3 = new l() { // from class: y70.a2
                @Override // er.l
                public final Object b(Object obj) {
                    return Function0.B2(sVar, (String) obj);
                }
            };
            rVar.v(objE3);
        }
        p054gb0.Function0.f(aVar, lVar, (l) objE3, rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y3(s sVar) {
        s.m(sVar, p093oj2.b.f146360a, null, 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z1(s sVar) {
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z2(s sVar) {
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z3(s sVar) {
        sVar.c();
        return i0.f148189a;
    }
}
