package fr2;

import al0.o0;
import al0.y;
import fr.q0;
import k10.c0;
import k10.v;
import k10.z;
import ml0.u;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R&\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030,8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u00108\u001a\b\u0012\u0004\u0012\u000203028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R \u0010>\u001a\b\u0012\u0004\u0012\u00020\u001b098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lfr2/o;", "Ll00/g;", "Lfr2/b;", "Lfr2/a;", "Lfr2/c;", "", "Lyy/a;", "stateMachineFactory", "Lhr2/c;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lib4/c;", "genericDomainErrorMapper", "Lml0/u;", "isAdultUC", "Lgr2/a;", "contract", "<init>", "(Lyy/a;Lhr2/c;Lac4/a;Lib4/c;Lml0/u;Lgr2/a;)V", "Ldx/b;", "domainError", "Lkotlin/Function0;", "Loq/i0;", "onRetryAction", "u9", "(Ldx/b;Ler/a;Ltq/e;)Ljava/lang/Object;", "Lfr2/c$a;", "w9", "(Lfr2/b;)Lfr2/c$a;", "b", "Lhr2/c;", "c", "Lac4/a;", "d", "Lib4/c;", "e", "Lml0/u;", "f", "Lgr2/a;", "Lfr2/b$b;", "g", "Lfr2/b$b;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lfr2/a$d;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<fr2.b, fr2.a> implements fr2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hr2.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final u isAdultUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final gr2.a contract;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final fr2.b.C1480b initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<fr2.b, fr2.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<fr2.a.d> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<fr2.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<fr2.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f66530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f66531b;

        /* JADX INFO: renamed from: fr2.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1483a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f66532a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f66533b;

            /* JADX INFO: renamed from: fr2.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1484a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f66534d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f66535e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f66536f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f66538h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f66539j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f66540k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f66541l;

                public C1484a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f66534d = obj;
                    this.f66535e |= PKIFailureInfo.systemUnavail;
                    return C1483a.this.F(null, this);
                }
            }

            public C1483a(mu.h hVar, o oVar) {
                this.f66532a = hVar;
                this.f66533b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1484a c1484a;
                if (eVar instanceof C1484a) {
                    c1484a = (C1484a) eVar;
                    int i15 = c1484a.f66535e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1484a.f66535e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1484a = new C1484a(eVar);
                    }
                } else {
                    c1484a = new C1484a(eVar);
                }
                Object obj2 = c1484a.f66534d;
                Object objE = uq.b.e();
                int i16 = c1484a.f66535e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f66532a;
                    fr2.c.a aVarW9 = this.f66533b.w9((fr2.b) obj);
                    c1484a.f66536f = vq.j.a(obj);
                    c1484a.f66538h = vq.j.a(c1484a);
                    c1484a.f66539j = vq.j.a(obj);
                    c1484a.f66540k = vq.j.a(hVar);
                    c1484a.f66541l = 0;
                    c1484a.f66535e = 1;
                    if (hVar.F(aVarW9, c1484a) == objE) {
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

        public a(mu.g gVar, o oVar) {
            this.f66530a = gVar;
            this.f66531b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super fr2.c.a> hVar, tq.e eVar) {
            Object objA = this.f66530a.a(new C1483a(hVar, this.f66531b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfr2/a$a;", "<unused var>", "Lfr2/b;", "Loq/i0;", "<anonymous>", "(Lfr2/a$a;Lfr2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<fr2.a.C1478a, fr2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66542e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f66542e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<fr2.a.d> bVarY1 = o.this.Y1();
                fr2.a.d.C1479a c1479a = fr2.a.d.C1479a.f66493a;
                this.f66542e = 1;
                if (bVarY1.F(c1479a, this) == objE) {
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
        public final Object w(fr2.a.C1478a c1478a, fr2.b bVar, tq.e<? super i0> eVar) {
            return o.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfr2/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfr2/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<fr2.b.C1480b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66544e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f66544e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            o.this.d9(fr2.a.b.f66491a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(fr2.b.C1480b c1480b, tq.e<? super i0> eVar) {
            return ((c) v(c1480b, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return o.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfr2/a$c;", "<unused var>", "Lk10/c0;", "Lfr2/b$b;", "state", "Lk10/l;", "Lfr2/b;", "<anonymous>", "(Lfr2/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<fr2.a.c, c0<fr2.b.C1480b>, tq.e<? super k10.l<? extends fr2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66546e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66547f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fr2.b.c O(fr2.b.C1480b c1480b) {
            return fr2.b.c.f66499a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f66547f;
            uq.b.e();
            if (this.f66546e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: fr2.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.d.O((b.C1480b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fr2.a.c cVar, c0<fr2.b.C1480b> c0Var, tq.e<? super k10.l<? extends fr2.b>> eVar) {
            d dVar = new d(eVar);
            dVar.f66547f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfr2/a$b;", "action", "Lk10/c0;", "Lfr2/b$b;", "state", "Lk10/l;", "Lfr2/b;", "<anonymous>", "(Lfr2/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<fr2.a.b, c0<fr2.b.C1480b>, tq.e<? super k10.l<? extends fr2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66548e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66549f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f66550g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lfr2/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends fr2.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f66552e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f66553f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f66554g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f66555h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f66556j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f66557k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ o f66558l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ fr2.a.b f66559m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ c0<fr2.b.C1480b> f66560n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o oVar, fr2.a.b bVar, c0<fr2.b.C1480b> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f66558l = oVar;
                this.f66559m = bVar;
                this.f66560n = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final fr2.b.a V(fr2.b.C1480b c1480b) {
                return fr2.b.a.f66497a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                c0<fr2.b.C1480b> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f66557k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    u uVar = this.f66558l.isAdultUC;
                    u.Params params = new u.Params(y.PASSPORT_INVALIDATION);
                    this.f66557k = 1;
                    obj = uVar.c(params, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = (c0) this.f66553f;
                    oq.u.b(obj);
                }
                return c0Var.c();
                dx.i iVar = (dx.i) obj;
                o oVar = this.f66558l;
                fr2.a.b bVar = this.f66559m;
                c0<fr2.b.C1480b> c0Var2 = this.f66560n;
                if (!(iVar instanceof dx.i.Left)) {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    if (!((Boolean) ((dx.i.Right) iVar).b()).booleanValue()) {
                        return c0Var2.d(new er.l() { // from class: fr2.q
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return o.e.a.V((b.C1480b) obj2);
                            }
                        });
                    }
                    oVar.d9(fr2.a.c.f66492a);
                    return c0Var2.c();
                }
                dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                er.a aVarB9 = oVar.b9(bVar);
                this.f66552e = vq.j.a(iVar);
                this.f66553f = c0Var2;
                this.f66554g = vq.j.a(bVar2);
                this.f66555h = 0;
                this.f66556j = 0;
                this.f66557k = 2;
                if (oVar.u9(bVar2, aVarB9, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f66558l, this.f66559m, this.f66560n, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends fr2.b>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fr2.a.b bVar = (fr2.a.b) this.f66549f;
            c0 c0Var = (c0) this.f66550g;
            Object objE = uq.b.e();
            int i15 = this.f66548e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = o.this.callActionWithLoaderUseCase;
            a aVar2 = new a(o.this, bVar, c0Var, null);
            this.f66549f = vq.j.a(bVar);
            this.f66550g = vq.j.a(c0Var);
            this.f66548e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fr2.a.b bVar, c0<fr2.b.C1480b> c0Var, tq.e<? super k10.l<? extends fr2.b>> eVar) {
            e eVar2 = o.this.new e(eVar);
            eVar2.f66549f = bVar;
            eVar2.f66550g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfr2/a$e;", "action", "Lfr2/b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfr2/a$e;Lfr2/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<fr2.a.OnReasonChosen, fr2.b.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f66561e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f66562f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fr2.a.OnReasonChosen onReasonChosen = (fr2.a.OnReasonChosen) this.f66562f;
            Object objE = uq.b.e();
            int i15 = this.f66561e;
            if (i15 == 0) {
                oq.u.b(obj);
                o.this.contract.G7(new gr2.a.Data(onReasonChosen.getPassportInvalidationReason()));
                xw.b<fr2.a.d> bVarY1 = o.this.Y1();
                fr2.a.d.c cVar = fr2.a.d.c.f66495a;
                this.f66562f = vq.j.a(onReasonChosen);
                this.f66561e = 1;
                if (bVarY1.F(cVar, this) == objE) {
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
        public final Object w(fr2.a.OnReasonChosen onReasonChosen, fr2.b.c cVar, tq.e<? super i0> eVar) {
            f fVar = o.this.new f(eVar);
            fVar.f66562f = onReasonChosen;
            return fVar.J(i0.f148189a);
        }
    }

    public o(yy.a aVar, hr2.c cVar, ac4.a aVar2, ib4.c cVar2, u uVar, gr2.a aVar3) {
        this.mapper = cVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.genericDomainErrorMapper = cVar2;
        this.isAdultUC = uVar;
        this.contract = aVar3;
        fr2.b.C1480b c1480b = fr2.b.C1480b.f66498a;
        this.initialState = c1480b;
        this.stateMachine = aVar.a(c1480b, new er.l() { // from class: fr2.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.z9(this.f66520a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), w9(c1480b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(o oVar, z zVar) {
        b bVar = oVar.new b(null);
        zVar.x(q0.c(fr2.a.C1478a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(o oVar, z zVar) {
        zVar.C(oVar.new c(null));
        d dVar = new d(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(fr2.a.c.class), oVar2, dVar);
        zVar.v(q0.c(fr2.a.b.class), oVar2, oVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(o oVar, z zVar) {
        f fVar = oVar.new f(null);
        zVar.x(q0.c(fr2.a.OnReasonChosen.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u9(dx.b bVar, final er.a<i0> aVar, tq.e<? super i0> eVar) {
        Object objF = F(new fr2.a.d.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: fr2.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.v9(this.f66518a, aVar, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(o oVar, er.a aVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || (bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            oVar.d9(fr2.a.C1478a.f66490a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            if (aVar != null) {
                aVar.a();
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fr2.c.a w9(fr2.b bVar) {
        return this.mapper.b(new hr2.c.Params(bVar, new er.l() { // from class: fr2.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.x9(this.f66517a, (o0) obj);
            }
        }, b9(fr2.a.C1478a.f66490a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(o oVar, o0 o0Var) {
        oVar.d9(new fr2.a.OnReasonChosen(o0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(final o oVar, v vVar) {
        vVar.c(q0.c(fr2.b.class), new er.l() { // from class: fr2.i
            @Override // er.l
            public final Object b(Object obj) {
                return o.A9(this.f66514a, (z) obj);
            }
        });
        vVar.c(q0.c(fr2.b.C1480b.class), new er.l() { // from class: fr2.j
            @Override // er.l
            public final Object b(Object obj) {
                return o.B9(this.f66515a, (z) obj);
            }
        });
        vVar.c(q0.c(fr2.b.c.class), new er.l() { // from class: fr2.k
            @Override // er.l
            public final Object b(Object obj) {
                return o.C9(this.f66516a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<fr2.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<fr2.b, fr2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<fr2.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(fr2.a.d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(gr2.a aVar) {
        super.P5(aVar);
    }
}
