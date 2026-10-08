package qt1;

import al0.PhysicalIdCardRestrictions;
import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010.\u001a\b\u0012\u0004\u0012\u00020)0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R&\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030/8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0015058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Lqt1/r;", "Ll00/g;", "Lqt1/c;", "Lqt1/a;", "Lqt1/d;", "", "Lyy/a;", "stateMachineFactory", "Lml0/r;", "getRestrictionsUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lib4/c;", "genericDomainErrorHandler", "Lqt1/f;", "mapper", "Lqt1/b;", "setupData", "<init>", "(Lyy/a;Lml0/r;Lac4/a;Lib4/c;Lqt1/f;Lqt1/b;)V", "state", "Lqt1/d$a;", "q9", "(Lqt1/c;)Lqt1/d$a;", "data", "Loq/i0;", "r9", "(Lqt1/b;)V", "b", "Lml0/r;", "c", "Lac4/a;", "d", "Lib4/c;", "e", "Lqt1/f;", "Lqt1/c$a;", "f", "Lqt1/c$a;", "initialState", "Lxw/b;", "Lqt1/a$c;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<qt1.c, qt1.a> implements qt1.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ml0.r getRestrictionsUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorHandler;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final qt1.f mapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final qt1.c.a initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<qt1.a.c> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<qt1.c, qt1.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<qt1.d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<qt1.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f168484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f168485b;

        /* JADX INFO: renamed from: qt1.r$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4259a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f168486a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f168487b;

            /* JADX INFO: renamed from: qt1.r$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4260a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f168488d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f168489e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f168490f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f168492h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f168493j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f168494k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f168495l;

                public C4260a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f168488d = obj;
                    this.f168489e |= PKIFailureInfo.systemUnavail;
                    return C4259a.this.F(null, this);
                }
            }

            public C4259a(mu.h hVar, r rVar) {
                this.f168486a = hVar;
                this.f168487b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4260a c4260a;
                if (eVar instanceof C4260a) {
                    c4260a = (C4260a) eVar;
                    int i15 = c4260a.f168489e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4260a.f168489e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4260a = new C4260a(eVar);
                    }
                } else {
                    c4260a = new C4260a(eVar);
                }
                Object obj2 = c4260a.f168488d;
                Object objE = uq.b.e();
                int i16 = c4260a.f168489e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f168486a;
                    qt1.d.a aVarQ9 = this.f168487b.q9((qt1.c) obj);
                    c4260a.f168490f = vq.j.a(obj);
                    c4260a.f168492h = vq.j.a(c4260a);
                    c4260a.f168493j = vq.j.a(obj);
                    c4260a.f168494k = vq.j.a(hVar);
                    c4260a.f168495l = 0;
                    c4260a.f168489e = 1;
                    if (hVar.F(aVarQ9, c4260a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, r rVar) {
            this.f168484a = gVar;
            this.f168485b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super qt1.d.a> hVar, tq.e eVar) {
            Object objA = this.f168484a.a(new C4259a(hVar, this.f168485b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqt1/a$b;", "action", "Lqt1/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lqt1/a$b;Lqt1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<qt1.a.Error, qt1.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f168496e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f168497f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(r rVar, qt1.a.Error error, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    rVar.d9(qt1.a.C4255a.f168435a);
                } else {
                    if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                        throw new oq.p();
                    }
                    rVar.d9(error);
                }
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final qt1.a.Error error = (qt1.a.Error) this.f168497f;
            Object objE = uq.b.e();
            int i15 = this.f168496e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                ib4.c cVar = r.this.genericDomainErrorHandler;
                dx.b domainError = error.getDomainError();
                final r rVar2 = r.this;
                qt1.a.c.Error error2 = new qt1.a.c.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: qt1.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.b.O(rVar2, error, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f168497f = vq.j.a(error);
                this.f168496e = 1;
                if (rVar.F(error2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qt1.a.Error error, qt1.c cVar, tq.e<? super i0> eVar) {
            b bVar = r.this.new b(eVar);
            bVar.f168497f = error;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqt1/a$a;", "<unused var>", "Lqt1/c;", "Loq/i0;", "<anonymous>", "(Lqt1/a$a;Lqt1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<qt1.a.C4255a, qt1.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f168499e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f168499e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                qt1.a.c.C4256a c4256a = qt1.a.c.C4256a.f168437a;
                this.f168499e = 1;
                if (rVar.F(c4256a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qt1.a.C4255a c4255a, qt1.c cVar, tq.e<? super i0> eVar) {
            return r.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lqt1/c$a;", "state", "Lk10/l;", "Lqt1/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<c0<qt1.c.a>, tq.e<? super k10.l<? extends qt1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f168501e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f168502f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lqt1/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends qt1.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f168504e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ r f168505f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<qt1.c.a> f168506g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, c0<qt1.c.a> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f168505f = rVar;
                this.f168506g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final qt1.c.Initialized V(PhysicalIdCardRestrictions physicalIdCardRestrictions, qt1.c.a aVar) {
                return new qt1.c.Initialized(physicalIdCardRestrictions);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f168504e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ml0.r rVar = this.f168505f.getRestrictionsUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f168504e = 1;
                    obj = rVar.c(c1792a, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                r rVar2 = this.f168505f;
                c0<qt1.c.a> c0Var = this.f168506g;
                if (iVar instanceof dx.i.Left) {
                    rVar2.d9(new qt1.a.Error((dx.b) ((dx.i.Left) iVar).b()));
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final PhysicalIdCardRestrictions physicalIdCardRestrictions = (PhysicalIdCardRestrictions) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: qt1.t
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.d.a.V(physicalIdCardRestrictions, (c.a) obj2);
                    }
                });
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f168505f, this.f168506g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends qt1.c>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f168502f;
            Object objE = uq.b.e();
            int i15 = this.f168501e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = r.this.callActionWithLoaderUseCase;
            a aVar2 = new a(r.this, c0Var, null);
            this.f168502f = vq.j.a(c0Var);
            this.f168501e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<qt1.c.a> c0Var, tq.e<? super k10.l<? extends qt1.c>> eVar) {
            return ((d) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = r.this.new d(eVar);
            dVar.f168502f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lqt1/a$d;", "<unused var>", "Lk10/c0;", "Lqt1/c$b;", "state", "Lk10/l;", "Lqt1/c;", "<anonymous>", "(Lqt1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<qt1.a.d, c0<qt1.c.Initialized>, tq.e<? super k10.l<? extends qt1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f168507e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f168508f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lqt1/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends qt1.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f168510e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ r f168511f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<qt1.c.Initialized> f168512g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, c0<qt1.c.Initialized> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f168511f = rVar;
                this.f168512g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final qt1.c.Initialized V(PhysicalIdCardRestrictions physicalIdCardRestrictions, qt1.c.Initialized initialized) {
                return initialized.a(physicalIdCardRestrictions);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f168510e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ml0.r rVar = this.f168511f.getRestrictionsUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f168510e = 1;
                    obj = rVar.c(c1792a, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                r rVar2 = this.f168511f;
                c0<qt1.c.Initialized> c0Var = this.f168512g;
                if (iVar instanceof dx.i.Left) {
                    rVar2.d9(new qt1.a.Error((dx.b) ((dx.i.Left) iVar).b()));
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final PhysicalIdCardRestrictions physicalIdCardRestrictions = (PhysicalIdCardRestrictions) ((dx.i.Right) iVar).b();
                return c0Var.b(new er.l() { // from class: qt1.u
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.e.a.V(physicalIdCardRestrictions, (c.Initialized) obj2);
                    }
                });
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f168511f, this.f168512g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends qt1.c>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f168508f;
            Object objE = uq.b.e();
            int i15 = this.f168507e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = r.this.callActionWithLoaderUseCase;
            a aVar2 = new a(r.this, c0Var, null);
            this.f168508f = vq.j.a(c0Var);
            this.f168507e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qt1.a.d dVar, c0<qt1.c.Initialized> c0Var, tq.e<? super k10.l<? extends qt1.c>> eVar) {
            e eVar2 = r.this.new e(eVar);
            eVar2.f168508f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqt1/a$e;", "<unused var>", "Lqt1/c$b;", "state", "Loq/i0;", "<anonymous>", "(Lqt1/a$e;Lqt1/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<qt1.a.e, qt1.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f168513e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f168514f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qt1.c.Initialized initialized = (qt1.c.Initialized) this.f168514f;
            Object objE = uq.b.e();
            int i15 = this.f168513e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                qt1.a.c.RestrictIdCard restrictIdCard = new qt1.a.c.RestrictIdCard(initialized.getPhysicalIdCardRestrictions());
                this.f168514f = vq.j.a(initialized);
                this.f168513e = 1;
                if (rVar.F(restrictIdCard, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qt1.a.e eVar, qt1.c.Initialized initialized, tq.e<? super i0> eVar2) {
            f fVar = r.this.new f(eVar2);
            fVar.f168514f = initialized;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqt1/a$f;", "<unused var>", "Lqt1/c$b;", "state", "Loq/i0;", "<anonymous>", "(Lqt1/a$f;Lqt1/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<qt1.a.f, qt1.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f168516e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f168517f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qt1.c.Initialized initialized = (qt1.c.Initialized) this.f168517f;
            Object objE = uq.b.e();
            int i15 = this.f168516e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                qt1.a.c.UndoRestrictionIdCard undoRestrictionIdCard = new qt1.a.c.UndoRestrictionIdCard(initialized.getPhysicalIdCardRestrictions());
                this.f168517f = vq.j.a(initialized);
                this.f168516e = 1;
                if (rVar.F(undoRestrictionIdCard, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qt1.a.f fVar, qt1.c.Initialized initialized, tq.e<? super i0> eVar) {
            g gVar = r.this.new g(eVar);
            gVar.f168517f = initialized;
            return gVar.J(i0.f148189a);
        }
    }

    public r(yy.a aVar, ml0.r rVar, ac4.a aVar2, ib4.c cVar, qt1.f fVar, SetupData setupData) {
        this.getRestrictionsUseCase = rVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.genericDomainErrorHandler = cVar;
        this.mapper = fVar;
        qt1.c.a aVar3 = qt1.c.a.f168445a;
        this.initialState = aVar3;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: qt1.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.s9(this.f168475a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), q9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qt1.d.a q9(qt1.c state) {
        return this.mapper.b(new qt1.f.Params(state, b9(qt1.a.e.f168442a), b9(qt1.a.f.f168443a), b9(qt1.a.C4255a.f168435a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(qt1.c.class), new er.l() { // from class: qt1.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.t9(this.f168472a, (z) obj);
            }
        });
        vVar.c(q0.c(qt1.c.a.class), new er.l() { // from class: qt1.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.u9(this.f168473a, (z) obj);
            }
        });
        vVar.c(q0.c(qt1.c.Initialized.class), new er.l() { // from class: qt1.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.v9(this.f168474a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(r rVar, z zVar) {
        b bVar = rVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(qt1.a.Error.class), oVar, bVar);
        zVar.x(q0.c(qt1.a.C4255a.class), oVar, rVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(r rVar, z zVar) {
        zVar.A(rVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(r rVar, z zVar) {
        e eVar = rVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(qt1.a.d.class), oVar, eVar);
        zVar.x(q0.c(qt1.a.e.class), oVar, rVar.new f(null));
        zVar.x(q0.c(qt1.a.f.class), oVar, rVar.new g(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<qt1.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<qt1.c, qt1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<qt1.d.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(qt1.a.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public void P5(SetupData data) {
        super.P5(data);
        if (data.getRefreshData()) {
            d9(qt1.a.d.f168441a);
        }
    }
}
