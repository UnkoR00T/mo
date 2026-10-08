package qe1;

import de1.KrusData;
import f00.j0;
import fr.q0;
import hb1.TaxOffices;
import k10.c0;
import k10.z;
import ld1.SearchModel;
import ld1.TaxOfficeModel;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001<B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u00100\u001a\b\u0012\u0004\u0012\u00020+0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R&\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003018\u0014X\u0094\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0015078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lqe1/p;", "Ll00/g;", "Lqe1/b;", "Lqe1/a;", "Lqe1/c;", "", "Lyy/a;", "stateMachineFactory", "Lre1/d;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lla1/a;", "interactor", "Lib4/c;", "genericDomainErrorMapper", "Lce1/a;", "contract", "<init>", "(Lyy/a;Lre1/d;Lac4/a;Lla1/a;Lib4/c;Lce1/a;)V", "state", "Lqe1/c$a;", "v9", "(Lqe1/b;)Lqe1/c$a;", "Ldx/b;", "domainError", "Ljb4/b;", "t9", "(Ldx/b;)Ljb4/b;", "b", "Lre1/d;", "c", "Lac4/a;", "d", "Lla1/a;", "e", "Lib4/c;", "f", "Lce1/a;", "g", "Lqe1/b;", "initialState", "Lxw/b;", "Lqe1/a$e;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, qe1.a> implements qe1.c, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final re1.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final la1.a interactor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ce1.a contract;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<qe1.a.e> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, qe1.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<qe1.c.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lqe1/p$a;", "Lf00/j0;", "Lce1/a;", "Lqe1/p;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<ce1.a, p> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<qe1.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f166216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f166217b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f166218a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f166219b;

            /* JADX INFO: renamed from: qe1.p$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4166a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f166220d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f166221e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f166222f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f166224h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f166225j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f166226k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f166227l;

                public C4166a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f166220d = obj;
                    this.f166221e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, p pVar) {
                this.f166218a = hVar;
                this.f166219b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4166a c4166a;
                if (eVar instanceof C4166a) {
                    c4166a = (C4166a) eVar;
                    int i15 = c4166a.f166221e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4166a.f166221e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4166a = new C4166a(eVar);
                    }
                } else {
                    c4166a = new C4166a(eVar);
                }
                Object obj2 = c4166a.f166220d;
                Object objE = uq.b.e();
                int i16 = c4166a.f166221e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f166218a;
                    qe1.c.a aVarV9 = this.f166219b.v9((State) obj);
                    c4166a.f166222f = vq.j.a(obj);
                    c4166a.f166224h = vq.j.a(c4166a);
                    c4166a.f166225j = vq.j.a(obj);
                    c4166a.f166226k = vq.j.a(hVar);
                    c4166a.f166227l = 0;
                    c4166a.f166221e = 1;
                    if (hVar.F(aVarV9, c4166a) == objE) {
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

        public b(mu.g gVar, p pVar) {
            this.f166216a = gVar;
            this.f166217b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super qe1.c.a> hVar, tq.e eVar) {
            Object objA = this.f166216a.a(new a(hVar, this.f166217b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqe1/a$a;", "<unused var>", "Lqe1/b;", "Loq/i0;", "<anonymous>", "(Lqe1/a$a;Lqe1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<qe1.a.C4162a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166228e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f166228e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<qe1.a.e> bVarY1 = p.this.Y1();
                qe1.a.e.C4163a c4163a = qe1.a.e.C4163a.f166176a;
                this.f166228e = 1;
                if (bVarY1.F(c4163a, this) == objE) {
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
        public final Object w(qe1.a.C4162a c4162a, State state, tq.e<? super i0> eVar) {
            return p.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqe1/a$b;", "<unused var>", "Lqe1/b;", "Loq/i0;", "<anonymous>", "(Lqe1/a$b;Lqe1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<qe1.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166230e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f166230e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<qe1.a.e> bVarY1 = p.this.Y1();
                qe1.a.e.b bVar = qe1.a.e.b.f166177a;
                this.f166230e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(qe1.a.b bVar, State state, tq.e<? super i0> eVar) {
            return p.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqe1/b;", "it", "Loq/i0;", "<anonymous>", "(Lqe1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166232e;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f166232e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p.this.d9(qe1.a.c.f166174a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(State state, tq.e<? super i0> eVar) {
            return ((e) v(state, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return p.this.new e(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lqe1/a$c;", "<unused var>", "Lk10/c0;", "Lqe1/b;", "state", "Lk10/l;", "<anonymous>", "(Lqe1/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<qe1.a.c, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166234e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166235f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lqe1/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f166237e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f166238f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f166239g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f166240h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f166241j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f166242k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ p f166243l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ c0<State> f166244m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, c0<State> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f166243l = pVar;
                this.f166244m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final State V(TaxOffices taxOffices, State state) {
                return State.b(state, taxOffices.a(), null, false, true, 6, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                c0<State> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f166242k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    la1.a aVar = this.f166243l.interactor;
                    this.f166242k = 1;
                    obj = aVar.f(this);
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
                    c0Var = (c0) this.f166238f;
                    oq.u.b(obj);
                }
                return c0Var.c();
                dx.i iVar = (dx.i) obj;
                p pVar = this.f166243l;
                c0<State> c0Var2 = this.f166244m;
                if (!(iVar instanceof dx.i.Left)) {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    final TaxOffices taxOffices = (TaxOffices) ((dx.i.Right) iVar).b();
                    return c0Var2.b(new er.l() { // from class: qe1.q
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p.f.a.V(taxOffices, (State) obj2);
                        }
                    });
                }
                dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                xw.b<qe1.a.e> bVarY1 = pVar.Y1();
                qe1.a.e.Error error = new qe1.a.e.Error(pVar.t9(bVar));
                this.f166237e = vq.j.a(iVar);
                this.f166238f = c0Var2;
                this.f166239g = vq.j.a(bVar);
                this.f166240h = 0;
                this.f166241j = 0;
                this.f166242k = 2;
                if (bVarY1.F(error, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f166243l, this.f166244m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<State>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f166235f;
            Object objE = uq.b.e();
            int i15 = this.f166234e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = p.this.callActionWithLoaderUseCase;
            a aVar2 = new a(p.this, c0Var, null);
            this.f166235f = vq.j.a(c0Var);
            this.f166234e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(qe1.a.c cVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = p.this.new f(eVar);
            fVar.f166235f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqe1/a$d;", "action", "Lqe1/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lqe1/a$d;Lqe1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<qe1.a.GoToSearch, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166246f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            qe1.a.GoToSearch goToSearch = (qe1.a.GoToSearch) this.f166246f;
            Object objE = uq.b.e();
            int i15 = this.f166245e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                qe1.a.e.GoToSearch goToSearch2 = new qe1.a.e.GoToSearch(goToSearch.getModel());
                this.f166246f = vq.j.a(goToSearch);
                this.f166245e = 1;
                if (pVar.F(goToSearch2, this) == objE) {
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
        public final Object w(qe1.a.GoToSearch goToSearch, State state, tq.e<? super i0> eVar) {
            g gVar = p.this.new g(eVar);
            gVar.f166246f = goToSearch;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lqe1/a$g;", "action", "Lk10/c0;", "Lqe1/b;", "state", "Lk10/l;", "<anonymous>", "(Lqe1/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<qe1.a.OnOfficeSelected, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166248e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f166249f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f166250g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(qe1.a.OnOfficeSelected onOfficeSelected, State state) {
            return State.b(state, null, onOfficeSelected.getOffice(), true, false, 9, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final qe1.a.OnOfficeSelected onOfficeSelected = (qe1.a.OnOfficeSelected) this.f166249f;
            c0 c0Var = (c0) this.f166250g;
            uq.b.e();
            if (this.f166248e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: qe1.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.h.O(onOfficeSelected, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qe1.a.OnOfficeSelected onOfficeSelected, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = new h(eVar);
            hVar.f166249f = onOfficeSelected;
            hVar.f166250g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lqe1/a$f;", "<unused var>", "Lk10/c0;", "Lqe1/b;", "state", "Lk10/l;", "<anonymous>", "(Lqe1/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<qe1.a.f, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f166251e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f166252f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f166253g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f166254h;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, false, false, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f166254h;
            Object objE = uq.b.e();
            int i15 = this.f166253g;
            if (i15 == 0) {
                oq.u.b(obj);
                TaxOfficeModel selectedTaxOffice = ((State) c0Var.a()).getSelectedTaxOffice();
                if (selectedTaxOffice != null) {
                    p pVar = p.this;
                    pVar.contract.F4(selectedTaxOffice);
                    qe1.a.e.C4164e c4164e = qe1.a.e.C4164e.f166180a;
                    this.f166254h = c0Var;
                    this.f166251e = vq.j.a(selectedTaxOffice);
                    this.f166252f = 0;
                    this.f166253g = 1;
                    if (pVar.F(c4164e, this) == objE) {
                        return objE;
                    }
                }
                return c0Var.b(new er.l() { // from class: qe1.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.i.O((State) obj2);
                    }
                });
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            k10.l lVarC = c0Var.c();
            if (lVarC != null) {
                return lVarC;
            }
            return c0Var.b(new er.l() { // from class: qe1.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.i.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(qe1.a.f fVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar = p.this.new i(eVar);
            iVar.f166254h = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, re1.d dVar, ac4.a aVar2, la1.a aVar3, ib4.c cVar, ce1.a aVar4) {
        this.mapper = dVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.interactor = aVar3;
        this.genericDomainErrorMapper = cVar;
        this.contract = aVar4;
        KrusData krusDataM3 = aVar4.m3();
        State state = new State(null, krusDataM3 != null ? krusDataM3.getTaxOffice() : null, false, false, 13, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: qe1.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.z9(this.f166206a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), v9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(p pVar, z zVar) {
        c cVar = pVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(qe1.a.C4162a.class), oVar, cVar);
        zVar.x(q0.c(qe1.a.b.class), oVar, pVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(p pVar, z zVar) {
        zVar.C(pVar.new e(null));
        f fVar = pVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(qe1.a.c.class), oVar, fVar);
        zVar.x(q0.c(qe1.a.GoToSearch.class), oVar, pVar.new g(null));
        zVar.v(q0.c(qe1.a.OnOfficeSelected.class), oVar, new h(null));
        zVar.v(q0.c(qe1.a.f.class), oVar, pVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b t9(dx.b domainError) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: qe1.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.u9(this.f166205a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(p pVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            pVar.d9(qe1.a.C4162a.f166172a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            pVar.d9(qe1.a.c.f166174a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qe1.c.a v9(State state) {
        return this.mapper.b(new re1.d.Params(state, new er.l() { // from class: qe1.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.w9(this.f166203a, (SearchModel) obj);
            }
        }, new er.l() { // from class: qe1.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.x9(this.f166204a, (TaxOfficeModel) obj);
            }
        }, b9(qe1.a.f.f166181a), b9(qe1.a.C4162a.f166172a), b9(qe1.a.b.f166173a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(p pVar, SearchModel searchModel) {
        pVar.d9(new qe1.a.GoToSearch(searchModel));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(p pVar, TaxOfficeModel taxOfficeModel) {
        pVar.d9(new qe1.a.OnOfficeSelected(taxOfficeModel));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: qe1.j
            @Override // er.l
            public final Object b(Object obj) {
                return p.A9(this.f166201a, (z) obj);
            }
        });
        vVar.c(q0.c(State.class), new er.l() { // from class: qe1.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.B9(this.f166202a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<qe1.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, qe1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<qe1.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(qe1.a.e eVar, tq.e<? super i0> eVar2) {
        return super.F(eVar, eVar2);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
