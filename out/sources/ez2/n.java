package ez2;

import f00.j0;
import fr.q0;
import iy.b0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001/B+\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001d8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010)\u001a\b\u0012\u0004\u0012\u00020$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lez2/n;", "Ll00/g;", "Lez2/i;", "Lez2/h;", "Lez2/j;", "", "Lyy/a;", "stateMachineFactory", "Lfz2/d;", "mapper", "Lyy2/a;", "checkIfCanIsValidUseCase", "Lez2/a;", "setupContract", "<init>", "(Lyy/a;Lfz2/d;Lyy2/a;Lez2/a;)V", "state", "Lez2/j$a;", "n9", "(Lez2/i;)Lez2/j$a;", "b", "Lfz2/d;", "c", "Lyy2/a;", "d", "Lez2/a;", "e", "Lez2/i;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lez2/h$e;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, h> implements j, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fz2.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yy2.a checkIfCanIsValidUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ez2.a setupContract;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, h> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<h.e> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<j.Data> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lez2/n$a;", "Lf00/j0;", "Lez2/a;", "Lez2/n;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<ez2.a, n> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<j.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f54419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f54420b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f54421a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f54422b;

            /* JADX INFO: renamed from: ez2.n$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1282a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f54423d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f54424e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f54425f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f54427h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f54428j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f54429k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f54430l;

                public C1282a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f54423d = obj;
                    this.f54424e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, n nVar) {
                this.f54421a = hVar;
                this.f54422b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1282a c1282a;
                if (eVar instanceof C1282a) {
                    c1282a = (C1282a) eVar;
                    int i15 = c1282a.f54424e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1282a.f54424e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1282a = new C1282a(eVar);
                    }
                } else {
                    c1282a = new C1282a(eVar);
                }
                Object obj2 = c1282a.f54423d;
                Object objE = uq.b.e();
                int i16 = c1282a.f54424e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f54421a;
                    j.Data dataN9 = this.f54422b.n9((State) obj);
                    c1282a.f54425f = vq.j.a(obj);
                    c1282a.f54427h = vq.j.a(c1282a);
                    c1282a.f54428j = vq.j.a(obj);
                    c1282a.f54429k = vq.j.a(hVar);
                    c1282a.f54430l = 0;
                    c1282a.f54424e = 1;
                    if (hVar.F(dataN9, c1282a) == objE) {
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
            this.f54419a = gVar;
            this.f54420b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super j.Data> hVar, tq.e eVar) {
            Object objA = this.f54419a.a(new a(hVar, this.f54420b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lez2/h$c;", "<unused var>", "Lez2/i;", "Loq/i0;", "<anonymous>", "(Lez2/h$c;Lez2/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<h.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54431e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f54431e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<h.e> bVarY1 = n.this.Y1();
                h.e.b bVar = h.e.b.f54396a;
                this.f54431e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(h.c cVar, State state, tq.e<? super i0> eVar) {
            return n.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lez2/h$a;", "<unused var>", "Lez2/i;", "Loq/i0;", "<anonymous>", "(Lez2/h$a;Lez2/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<h.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54433e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f54433e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<h.e> bVarY1 = n.this.Y1();
                h.e.a aVar = h.e.a.f54395a;
                this.f54433e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(h.a aVar, State state, tq.e<? super i0> eVar) {
            return n.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lez2/h$b;", "action", "Lk10/c0;", "Lez2/i;", "state", "Lk10/l;", "<anonymous>", "(Lez2/h$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<h.CanNumberInputChange, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54435e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f54436f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f54437g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(h.CanNumberInputChange canNumberInputChange, State state) {
            return state.a(state.getCanData().a(canNumberInputChange.getNumber()), hz.b.C2039b.f86846c);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final h.CanNumberInputChange canNumberInputChange = (h.CanNumberInputChange) this.f54436f;
            c0 c0Var = (c0) this.f54437g;
            uq.b.e();
            if (this.f54435e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: ez2.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.e.O(canNumberInputChange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h.CanNumberInputChange canNumberInputChange, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f54436f = canNumberInputChange;
            eVar2.f54437g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lez2/h$f;", "<unused var>", "Lk10/c0;", "Lez2/i;", "state", "Lk10/l;", "<anonymous>", "(Lez2/h$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<h.f, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54438e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f54439f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(hz.b bVar, State state) {
            return State.b(state, null, bVar, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f54439f;
            Object objE = uq.b.e();
            int i15 = this.f54438e;
            if (i15 == 0) {
                u.b(obj);
                yy2.a aVar = n.this.checkIfCanIsValidUseCase;
                yy2.a.Params params = new yy2.a.Params(((State) c0Var.a()).getCanData().getCan());
                this.f54439f = c0Var;
                this.f54438e = 1;
                obj = aVar.d(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            final hz.b bVarA = hz.b.INSTANCE.a((hz.g) obj);
            if (bVarA instanceof hz.b.d) {
                n.this.setupContract.o7(new CanSharedData(((State) c0Var.a()).getCanData().getCan()));
                n.this.d9(h.d.f54394a);
            }
            return c0Var.b(new er.l() { // from class: ez2.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.f.O(bVarA, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h.f fVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar2 = n.this.new f(eVar);
            fVar2.f54439f = c0Var;
            return fVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lez2/h$d;", "<unused var>", "Lez2/i;", "Loq/i0;", "<anonymous>", "(Lez2/h$d;Lez2/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<h.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54441e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f54441e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<h.e> bVarY1 = n.this.Y1();
                h.e.c cVar = h.e.c.f54397a;
                this.f54441e = 1;
                if (bVarY1.F(cVar, this) == objE) {
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
        public final Object w(h.d dVar, State state, tq.e<? super i0> eVar) {
            return n.this.new g(eVar).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, fz2.d dVar, yy2.a aVar2, ez2.a aVar3) {
        this.mapper = dVar;
        this.checkIfCanIsValidUseCase = aVar2;
        this.setupContract = aVar3;
        State state = new State(new CanSharedData(null, 1, null), null, 2, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: ez2.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.q9(this.f54411a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), n9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j.Data n9(State state) {
        return this.mapper.b(new fz2.d.Params(state, new er.l() { // from class: ez2.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.o9(this.f54410a, (b0) obj);
            }
        }, b9(h.a.f54390a), b9(h.c.f54393a), b9(h.f.f54398a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(n nVar, b0 b0Var) {
        nVar.d9(new h.CanNumberInputChange(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final n nVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ez2.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.r9(this.f54409a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(n nVar, z zVar) {
        c cVar = nVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(h.c.class), oVar, cVar);
        zVar.x(q0.c(h.a.class), oVar, nVar.new d(null));
        zVar.v(q0.c(h.CanNumberInputChange.class), oVar, new e(null));
        zVar.v(q0.c(h.f.class), oVar, nVar.new f(null));
        zVar.x(q0.c(h.d.class), oVar, nVar.new g(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<h.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, h> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<j.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
