package kf1;

import f00.j0;
import fr.q0;
import hb1.TaxOffices;
import k10.c0;
import k10.v;
import k10.z;
import ld1.SearchModel;
import ld1.TaxOfficeModel;
import lf1.TaxOfficeContractData;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001<B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u00100\u001a\b\u0012\u0004\u0012\u00020+0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R&\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003018\u0014X\u0094\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0015078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lkf1/n;", "Ll00/g;", "Lkf1/b;", "Lkf1/a;", "Lkf1/c;", "", "Lyy/a;", "stateMachineFactory", "Lmf1/d;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lla1/a;", "interactor", "Lib4/c;", "genericDomainErrorMapper", "Llf1/a;", "contract", "<init>", "(Lyy/a;Lmf1/d;Lac4/a;Lla1/a;Lib4/c;Llf1/a;)V", "state", "Lkf1/c$a;", "v9", "(Lkf1/b;)Lkf1/c$a;", "Ldx/b;", "domainError", "Ljb4/b;", "t9", "(Ldx/b;)Ljb4/b;", "b", "Lmf1/d;", "c", "Lac4/a;", "d", "Lla1/a;", "e", "Lib4/c;", "f", "Llf1/a;", "g", "Lkf1/b;", "initialState", "Lxw/b;", "Lkf1/a$d;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, kf1.a> implements kf1.c, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mf1.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final la1.a interactor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final lf1.a contract;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<kf1.a.d> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, kf1.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<kf1.c.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lkf1/n$a;", "Lf00/j0;", "Llf1/a;", "Lkf1/n;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<lf1.a, n> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<kf1.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f110523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f110524b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f110525a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f110526b;

            /* JADX INFO: renamed from: kf1.n$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2651a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f110527d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f110528e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f110529f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f110531h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f110532j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f110533k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f110534l;

                public C2651a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f110527d = obj;
                    this.f110528e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, n nVar) {
                this.f110525a = hVar;
                this.f110526b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2651a c2651a;
                if (eVar instanceof C2651a) {
                    c2651a = (C2651a) eVar;
                    int i15 = c2651a.f110528e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2651a.f110528e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2651a = new C2651a(eVar);
                    }
                } else {
                    c2651a = new C2651a(eVar);
                }
                Object obj2 = c2651a.f110527d;
                Object objE = uq.b.e();
                int i16 = c2651a.f110528e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f110525a;
                    kf1.c.a aVarV9 = this.f110526b.v9((State) obj);
                    c2651a.f110529f = vq.j.a(obj);
                    c2651a.f110531h = vq.j.a(c2651a);
                    c2651a.f110532j = vq.j.a(obj);
                    c2651a.f110533k = vq.j.a(hVar);
                    c2651a.f110534l = 0;
                    c2651a.f110528e = 1;
                    if (hVar.F(aVarV9, c2651a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public b(mu.g gVar, n nVar) {
            this.f110523a = gVar;
            this.f110524b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super kf1.c.a> hVar, tq.e eVar) {
            Object objA = this.f110523a.a(new a(hVar, this.f110524b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkf1/a$a;", "<unused var>", "Lkf1/b;", "Loq/i0;", "<anonymous>", "(Lkf1/a$a;Lkf1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<kf1.a.C2647a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110535e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f110535e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<kf1.a.d> bVarY1 = n.this.Y1();
                kf1.a.d.C2648a c2648a = kf1.a.d.C2648a.f110488a;
                this.f110535e = 1;
                if (bVarY1.F(c2648a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(kf1.a.C2647a c2647a, State state, tq.e<? super i0> eVar) {
            return n.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkf1/b;", "it", "Loq/i0;", "<anonymous>", "(Lkf1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110537e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f110537e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            n.this.d9(kf1.a.b.f110486a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(State state, tq.e<? super i0> eVar) {
            return ((d) v(state, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return n.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkf1/a$b;", "<unused var>", "Lk10/c0;", "Lkf1/b;", "state", "Lk10/l;", "<anonymous>", "(Lkf1/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<kf1.a.b, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110539e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110540f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lkf1/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f110542e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f110543f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f110544g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f110545h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f110546j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f110547k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ n f110548l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ c0<State> f110549m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n nVar, c0<State> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f110548l = nVar;
                this.f110549m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final State V(TaxOffices taxOffices, State state) {
                return State.b(state, taxOffices.a(), null, false, true, 6, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                c0<State> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f110547k;
                if (i15 == 0) {
                    u.b(obj);
                    la1.a aVar = this.f110548l.interactor;
                    this.f110547k = 1;
                    obj = aVar.f(this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = (c0) this.f110543f;
                    u.b(obj);
                }
                return c0Var.c();
                dx.i iVar = (dx.i) obj;
                n nVar = this.f110548l;
                c0<State> c0Var2 = this.f110549m;
                if (!(iVar instanceof dx.i.Left)) {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    final TaxOffices taxOffices = (TaxOffices) ((dx.i.Right) iVar).b();
                    return c0Var2.b(new er.l() { // from class: kf1.o
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return n.e.a.V(taxOffices, (State) obj2);
                        }
                    });
                }
                dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                xw.b<kf1.a.d> bVarY1 = nVar.Y1();
                kf1.a.d.Error error = new kf1.a.d.Error(nVar.t9(bVar));
                this.f110542e = vq.j.a(iVar);
                this.f110543f = c0Var2;
                this.f110544g = vq.j.a(bVar);
                this.f110545h = 0;
                this.f110546j = 0;
                this.f110547k = 2;
                if (bVarY1.F(error, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f110548l, this.f110549m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<State>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f110540f;
            Object objE = uq.b.e();
            int i15 = this.f110539e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            ac4.a aVar = n.this.callActionWithLoaderUseCase;
            a aVar2 = new a(n.this, c0Var, null);
            this.f110540f = vq.j.a(c0Var);
            this.f110539e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(kf1.a.b bVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = n.this.new e(eVar);
            eVar2.f110540f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkf1/a$c;", "action", "Lkf1/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lkf1/a$c;Lkf1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<kf1.a.GoToSearch, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110550e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110551f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            kf1.a.GoToSearch goToSearch = (kf1.a.GoToSearch) this.f110551f;
            Object objE = uq.b.e();
            int i15 = this.f110550e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                kf1.a.d.GoToSearch goToSearch2 = new kf1.a.d.GoToSearch(goToSearch.getModel());
                this.f110551f = vq.j.a(goToSearch);
                this.f110550e = 1;
                if (nVar.F(goToSearch2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(kf1.a.GoToSearch goToSearch, State state, tq.e<? super i0> eVar) {
            f fVar = n.this.new f(eVar);
            fVar.f110551f = goToSearch;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkf1/a$f;", "action", "Lk10/c0;", "Lkf1/b;", "state", "Lk10/l;", "<anonymous>", "(Lkf1/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<kf1.a.OnOfficeSelected, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f110553e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f110554f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f110555g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(kf1.a.OnOfficeSelected onOfficeSelected, State state) {
            return State.b(state, null, onOfficeSelected.getOffice(), true, false, 9, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final kf1.a.OnOfficeSelected onOfficeSelected = (kf1.a.OnOfficeSelected) this.f110554f;
            c0 c0Var = (c0) this.f110555g;
            uq.b.e();
            if (this.f110553e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: kf1.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.g.O(onOfficeSelected, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(kf1.a.OnOfficeSelected onOfficeSelected, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f110554f = onOfficeSelected;
            gVar.f110555g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkf1/a$e;", "<unused var>", "Lk10/c0;", "Lkf1/b;", "state", "Lk10/l;", "<anonymous>", "(Lkf1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<kf1.a.e, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f110556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f110557f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f110558g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f110559h;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, false, false, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f110559h;
            Object objE = uq.b.e();
            int i15 = this.f110558g;
            if (i15 == 0) {
                u.b(obj);
                TaxOfficeModel selectedTaxOffice = ((State) c0Var.a()).getSelectedTaxOffice();
                if (selectedTaxOffice != null) {
                    n nVar = n.this;
                    nVar.contract.j8(new TaxOfficeContractData(selectedTaxOffice));
                    kf1.a.d.C2649d c2649d = kf1.a.d.C2649d.f110491a;
                    this.f110559h = c0Var;
                    this.f110556e = vq.j.a(selectedTaxOffice);
                    this.f110557f = 0;
                    this.f110558g = 1;
                    if (nVar.F(c2649d, this) == objE) {
                        return objE;
                    }
                }
                return c0Var.b(new er.l() { // from class: kf1.q
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return n.h.O((State) obj2);
                    }
                });
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            k10.l lVarC = c0Var.c();
            if (lVarC != null) {
                return lVarC;
            }
            return c0Var.b(new er.l() { // from class: kf1.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.h.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(kf1.a.e eVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar2) {
            h hVar = n.this.new h(eVar2);
            hVar.f110559h = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, mf1.d dVar, ac4.a aVar2, la1.a aVar3, ib4.c cVar, lf1.a aVar4) {
        this.mapper = dVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.interactor = aVar3;
        this.genericDomainErrorMapper = cVar;
        this.contract = aVar4;
        TaxOfficeContractData taxOfficeContractDataI6 = aVar4.I6();
        State state = new State(null, taxOfficeContractDataI6 != null ? taxOfficeContractDataI6.getOffice() : null, false, false, 13, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: kf1.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.z9(this.f110513a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), v9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(n nVar, z zVar) {
        c cVar = nVar.new c(null);
        zVar.x(q0.c(kf1.a.C2647a.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(n nVar, z zVar) {
        zVar.C(nVar.new d(null));
        e eVar = nVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(kf1.a.b.class), oVar, eVar);
        zVar.x(q0.c(kf1.a.GoToSearch.class), oVar, nVar.new f(null));
        zVar.v(q0.c(kf1.a.OnOfficeSelected.class), oVar, new g(null));
        zVar.v(q0.c(kf1.a.e.class), oVar, nVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b t9(dx.b domainError) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: kf1.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.u9(this.f110512a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(n nVar, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            nVar.d9(kf1.a.b.f110486a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kf1.c.a v9(State state) {
        return this.mapper.b(new mf1.d.Params(state, new er.l() { // from class: kf1.h
            @Override // er.l
            public final Object b(Object obj) {
                return n.w9(this.f110508a, (SearchModel) obj);
            }
        }, new er.l() { // from class: kf1.i
            @Override // er.l
            public final Object b(Object obj) {
                return n.x9(this.f110509a, (TaxOfficeModel) obj);
            }
        }, b9(kf1.a.e.f110492a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(n nVar, SearchModel searchModel) {
        nVar.d9(new kf1.a.GoToSearch(searchModel));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(n nVar, TaxOfficeModel taxOfficeModel) {
        nVar.d9(new kf1.a.OnOfficeSelected(taxOfficeModel));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(final n nVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: kf1.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.A9(this.f110510a, (z) obj);
            }
        });
        vVar.c(q0.c(State.class), new er.l() { // from class: kf1.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.B9(this.f110511a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<kf1.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, kf1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<kf1.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(kf1.a.d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
