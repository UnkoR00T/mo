package p127vq2;

import cr2.SetupData;
import er.l;
import er.p;
import er.q;
import f00.d0;
import f00.f0;
import f00.g0;
import f00.s;
import fr.q0;
import fr.t;
import fr2.a;
import fr2.o;
import ir2.e;
import ju.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p114t0.f;
import p136y9.d1;
import p136y9.w;
import vq.k;
import wq2.g;
import y2.m;
import zq2.b;
import zq2.n;
import zx.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwq2/g;", "nestedNavigation", "Lwq2/a;", "dataSourceContract", "Liy/b0;", "passportNumber", "Loq/i0;", "v", "(Lwq2/g;Lwq2/a;Liy/b0;Lm2/r;I)V", "passportinvalidation_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207906e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g f207907f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g gVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f207907f = gVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f207906e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            this.f207907f.O6(e0.b.f207922a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f207907f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207908e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g f207909f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g gVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f207909f = gVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f207908e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            this.f207909f.O6(e0.c.f207924a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f207909f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207910e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g f207911f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g gVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f207911f = gVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f207910e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            this.f207911f.O6(e0.a.f207920a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f207911f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207912e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g f207913f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(g gVar, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f207913f = gVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f207912e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            this.f207913f.O6(e0.e.f207928a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new d(this.f207913f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207914e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g f207915f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(g gVar, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f207915f = gVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f207914e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            this.f207915f.O6(e0.d.f207926a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new e(this.f207915f, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(g gVar, s sVar, cr2.a.e eVar) {
        e0.c cVar = e0.c.f207924a;
        if (t.c(eVar, cr2.a.e.C0781a.f37359a)) {
            gVar.A();
        } else if (t.c(eVar, cr2.a.e.c.f37361a)) {
            s.m(sVar, cVar, null, 2, null);
        } else if (t.c(eVar, cr2.a.e.d.f37362a)) {
            sVar.k(cVar, e0.b.f207922a);
        } else if (eVar instanceof cr2.a.e.Error) {
            gVar.P6(((cr2.a.e.Error) eVar).getErrorData());
        } else {
            if (!(eVar instanceof cr2.a.e.ShowDialog)) {
                throw new oq.p();
            }
            s.l(sVar, c0.f207916a, ((cr2.a.e.ShowDialog) eVar).getDialogData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(final g gVar, wq2.a aVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1709734342, i15, -1, "pl.gov.coi.mobywatel.feature.passportinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:93)");
        }
        i0 i0Var = i0.f148189a;
        boolean zG = rVar.G(gVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new b(gVar, null);
            rVar.v(objE);
        }
        Function0.d(i0Var, (p) objE, rVar, 6);
        f00.r.o(wVar, q0.c(o.class), aVar, m.d(-848144279, true, new q() { // from class: vq2.i
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return b0.C(gVar, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f207930a.h(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(final g gVar, final s sVar, zx.d dVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-848144279, i15, -1, "pl.gov.coi.mobywatel.feature.passportinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:100)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(gVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: vq2.s
                @Override // er.l
                public final Object b(Object obj) {
                    return b0.D(gVar, sVar, (a.d) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(g gVar, s sVar, fr2.a.d dVar) {
        if (t.c(dVar, fr2.a.d.C1479a.f66493a)) {
            gVar.A();
        } else if (t.c(dVar, fr2.a.d.c.f66495a)) {
            s.m(sVar, e0.a.f207920a, null, 2, null);
        } else {
            if (!(dVar instanceof fr2.a.d.Error)) {
                throw new oq.p();
            }
            gVar.P6(((fr2.a.d.Error) dVar).getErrorData());
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(final g gVar, wq2.a aVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1205447641, i15, -1, "pl.gov.coi.mobywatel.feature.passportinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:120)");
        }
        i0 i0Var = i0.f148189a;
        boolean zG = rVar.G(gVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new c(gVar, null);
            rVar.v(objE);
        }
        Function0.d(i0Var, (p) objE, rVar, 6);
        f00.r.o(wVar, q0.c(n.class), aVar, m.d(2067037704, true, new q() { // from class: vq2.j
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return b0.F(gVar, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f207930a.i(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(final g gVar, final s sVar, zx.d dVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(2067037704, i15, -1, "pl.gov.coi.mobywatel.feature.passportinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:127)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(gVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: vq2.q
                @Override // er.l
                public final Object b(Object obj) {
                    return b0.G(gVar, sVar, (b) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(g gVar, s sVar, zq2.b bVar) {
        if (t.c(bVar, zq2.b.a.f236357a)) {
            gVar.A();
        } else {
            if (!t.c(bVar, zq2.b.C6387b.f236358a)) {
                throw new oq.p();
            }
            s.m(sVar, e0.e.f207928a, null, 2, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(final g gVar, wq2.a aVar, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-174337672, i15, -1, "pl.gov.coi.mobywatel.feature.passportinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:143)");
        }
        i0 i0Var = i0.f148189a;
        boolean zG = rVar.G(gVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new d(gVar, null);
            rVar.v(objE);
        }
        Function0.d(i0Var, (p) objE, rVar, 6);
        f00.r.o(wVar, q0.c(lr2.l.class), aVar, m.d(687252391, true, new q() { // from class: vq2.k
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return b0.I(gVar, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f207930a.g(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(final g gVar, final s sVar, zx.d dVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(687252391, i15, -1, "pl.gov.coi.mobywatel.feature.passportinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:150)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(gVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: vq2.m
                @Override // er.l
                public final Object b(Object obj) {
                    return b0.J(gVar, sVar, (lr2.a.d) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(g gVar, s sVar, lr2.a.d dVar) {
        if (t.c(dVar, lr2.a.d.C2923a.f119958a)) {
            gVar.A();
        } else if (t.c(dVar, lr2.a.d.c.f119960a)) {
            s.m(sVar, e0.d.f207926a, null, 2, null);
        } else if (dVar instanceof lr2.a.d.GoToError) {
            gVar.P6(((lr2.a.d.GoToError) dVar).getError());
        } else {
            if (!(dVar instanceof lr2.a.d.ShowDialog)) {
                throw new oq.p();
            }
            s.l(sVar, c0.f207916a, ((lr2.a.d.ShowDialog) dVar).getDialogData(), null, 4, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(final g gVar, wq2.a aVar, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1554122985, i15, -1, "pl.gov.coi.mobywatel.feature.passportinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:175)");
        }
        i0 i0Var = i0.f148189a;
        boolean zG = rVar.G(gVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new e(gVar, null);
            rVar.v(objE);
        }
        Function0.d(i0Var, (p) objE, rVar, 6);
        f00.r.o(wVar, q0.c(ir2.p.class), aVar, m.d(-692532922, true, new q() { // from class: vq2.a0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return b0.L(gVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f207930a.j(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(final g gVar, zx.d dVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-692532922, i15, -1, "pl.gov.coi.mobywatel.feature.passportinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:182)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(gVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: vq2.n
                @Override // er.l
                public final Object b(Object obj) {
                    return b0.M(gVar, (e) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(g gVar, ir2.e eVar) {
        if (!t.c(eVar, ir2.e.a.f96727a)) {
            throw new oq.p();
        }
        gVar.p8();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(1361058998, i15, -1, "pl.gov.coi.mobywatel.feature.passportinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:198)");
        }
        c0 c0Var = c0.f207916a;
        f00.r.r(wVar, c0Var, sVar.g(c0Var), m.d(-1480072821, true, new q() { // from class: vq2.h
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return b0.O(sVar, (cb4.f) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), rVar, ((i15 >> 3) & 14) | 3120);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(final s sVar, cb4.f fVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1480072821, i15, -1, "pl.gov.coi.mobywatel.feature.passportinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:202)");
        }
        xw.b<cb4.f.a> bVarY1 = fVar.Y1();
        boolean zG = rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: vq2.o
                @Override // er.l
                public final Object b(Object obj) {
                    return b0.P(sVar, (cb4.f.a) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(bVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(s sVar, cb4.f.a aVar) {
        if (!t.c(aVar, cb4.f.a.C0669a.f24980a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q(g gVar, wq2.a aVar, iy.b0 b0Var, int i15, r rVar, int i16) {
        v(gVar, aVar, b0Var, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void v(final g gVar, final wq2.a aVar, final iy.b0 b0Var, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1749379344);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(gVar) : rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= (i15 & 512) == 0 ? rVarH.W(b0Var) : rVarH.G(b0Var) ? 256 : 128;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1749379344, i16, -1, "pl.gov.coi.mobywatel.feature.passportinvalidation.presentation.NestedNavContent (NestedNavContent.kt:37)");
            }
            final s sVarJ = f00.r.J(null, rVarH, 0, 1);
            xw.b<wq2.e.d> bVarG = gVar.g();
            boolean zG = rVarH.G(sVarJ);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: vq2.g
                    @Override // er.l
                    public final Object b(Object obj) {
                        return b0.w(sVarJ, (wq2.e.d) obj);
                    }
                };
                rVarH.v(objE);
            }
            f0.b(bVarG, (l) objE, rVarH, xw.b.f221619c);
            e0.b bVar = e0.b.f207922a;
            boolean z16 = ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(gVar))) | ((i16 & 112) == 32 || ((i16 & 64) != 0 && rVarH.G(aVar)));
            if ((i16 & 896) == 256 || ((i16 & 512) != 0 && rVarH.G(b0Var))) {
                z15 = true;
            }
            boolean zG2 = z16 | z15 | rVarH.G(sVarJ);
            Object objE2 = rVarH.E();
            if (zG2 || objE2 == r.INSTANCE.a()) {
                objE2 = new l() { // from class: vq2.r
                    @Override // er.l
                    public final Object b(Object obj) {
                        return b0.x(gVar, aVar, b0Var, sVarJ, (d1) obj);
                    }
                };
                rVarH.v(objE2);
            }
            d0.j(sVarJ, bVar, (l) objE2, rVarH, s.f54562e | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: vq2.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b0.Q(gVar, aVar, b0Var, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(s sVar, wq2.e.d dVar) {
        if (!t.c(dVar, wq2.e.d.a.f214413a)) {
            throw new oq.p();
        }
        sVar.c();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(final g gVar, final wq2.a aVar, final iy.b0 b0Var, final s sVar, d1 d1Var) {
        f00.r.u(d1Var, e0.b.f207922a, null, m.b(-1147962415, true, new er.r() { // from class: vq2.u
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return b0.y(gVar, aVar, b0Var, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, e0.c.f207924a, null, m.b(-1709734342, true, new er.r() { // from class: vq2.v
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return b0.B(gVar, aVar, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, e0.a.f207920a, null, m.b(1205447641, true, new er.r() { // from class: vq2.w
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return b0.E(gVar, aVar, sVar, (f) obj, (p136y9.w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, e0.e.f207928a, null, m.b(-174337672, true, new er.r() { // from class: vq2.x
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return b0.H(gVar, aVar, sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.u(d1Var, e0.d.f207926a, null, m.b(-1554122985, true, new er.r() { // from class: vq2.y
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return b0.K(gVar, aVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }), 2, null);
        f00.r.t(d1Var, c0.f207916a, new g0.Dialog(null, 1, null), m.b(1361058998, true, new er.r() { // from class: vq2.z
            @Override // er.r
            public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                return b0.N(sVar, (f) obj, (w) obj2, (r) obj3, ((Integer) obj4).intValue());
            }
        }));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(final g gVar, wq2.a aVar, iy.b0 b0Var, final s sVar, f fVar, w wVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1147962415, i15, -1, "pl.gov.coi.mobywatel.feature.passportinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:51)");
        }
        i0 i0Var = i0.f148189a;
        boolean zG = rVar.G(gVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new a(gVar, null);
            rVar.v(objE);
        }
        Function0.d(i0Var, (p) objE, rVar, 6);
        f00.r.o(wVar, q0.c(cr2.t.class), new SetupData(aVar, b0Var), m.d(-829747776, true, new q() { // from class: vq2.l
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return b0.z(gVar, sVar, (d) obj, (r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), f.f207930a.f(), rVar, ((i15 >> 3) & 14) | 27648);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(final g gVar, final s sVar, zx.d dVar, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-829747776, i15, -1, "pl.gov.coi.mobywatel.feature.passportinvalidation.presentation.NestedNavContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestedNavContent.kt:61)");
        }
        mu.g gVarY1 = dVar.Y1();
        boolean zG = rVar.G(gVar) | rVar.G(sVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: vq2.p
                @Override // er.l
                public final Object b(Object obj) {
                    return b0.A(gVar, sVar, (cr2.a.e) obj);
                }
            };
            rVar.v(objE);
        }
        f0.b(gVarY1, (l) objE, rVar, xw.b.f221619c);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return i0.f148189a;
    }
}
