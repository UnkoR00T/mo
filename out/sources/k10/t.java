package k10;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0011\u001a\u00020\u000b2\u001e\u0010\u0010\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f\u0012\u0004\u0012\u00020\u000b0\u000eH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00028\u0001H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lk10/t;", "", ip.a.f96137b, "A", "Lk10/e0;", "Lkotlin/Function0;", "initialStateSupplier", "<init>", "(Ler/a;)V", "initialState", "(Ljava/lang/Object;)V", "Loq/i0;", "e", "()V", "Lkotlin/Function1;", "Lk10/v;", "specBlock", "g", "(Ler/l;)V", "action", "a", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "Ler/a;", "Llu/g;", "b", "Llu/g;", "inputActions", "Lmu/g;", "c", "Lmu/g;", "outputState", "Lk10/a;", "d", "Lk10/a;", "activeFlowCounter", "getState", "()Lmu/g;", "state", "statemachine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class t<S, A> implements e0<S, A> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f107399e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final er.a<S> initialStateSupplier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final lu.g<A> inputActions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private mu.g<? extends S> outputState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k10.a activeFlowCounter;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", ip.a.f96137b, "Lmu/h;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<mu.h<? super S>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f107404e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ t<S, A> f107405f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(t<S, A> tVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f107405f = tVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f107404e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (((t) this.f107405f).activeFlowCounter.c() <= 1) {
                return i0.f148189a;
            }
            throw new IllegalStateException("Can not collect state more than once at the same time. Make sure theprevious collection is cancelled before starting a new one. Collecting state in parallel would lead to subtle bugs.");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mu.h<? super S> hVar, tq.e<? super i0> eVar) {
            return ((a) v(hVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f107405f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", ip.a.f96137b, "Lmu/h;", "", "it", "Loq/i0;", "<anonymous>", "(Lmu/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<mu.h<? super S>, Throwable, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f107406e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ t<S, A> f107407f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t<S, A> tVar, tq.e<? super b> eVar) {
            super(3, eVar);
            this.f107407f = tVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f107406e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            ((t) this.f107407f).activeFlowCounter.a();
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mu.h<? super S> hVar, Throwable th4, tq.e<? super i0> eVar) {
            return new b(this.f107407f, eVar).J(i0.f148189a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(er.a<? extends S> aVar) {
        this.initialStateSupplier = aVar;
        this.inputActions = lu.j.b(0, null, null, 7, null);
        this.activeFlowCounter = new k10.a(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(Object obj) {
        return obj;
    }

    private final void e() {
        if (this.outputState == null) {
            throw new IllegalStateException("No state machine specs are defined. Did you call spec { ... } in init {...}?\nExample usage:\n\nclass MyStateMachine : FlowReduxStateMachine<State, Action>(InitialState) {\n\n    init{\n        spec {\n            inState<FooState> {\n                on<BarAction> { ... }\n            }\n            ...\n        }\n    }\n}");
        }
    }

    static /* synthetic */ <S, A> Object f(t<S, A> tVar, A a15, tq.e<? super i0> eVar) {
        tVar.e();
        if (((t) tVar).activeFlowCounter.b() > 0) {
            Object objL = ((t) tVar).inputActions.l(a15, eVar);
            return objL == uq.b.e() ? objL : i0.f148189a;
        }
        throw new IllegalStateException("Cannot dispatch action " + a15 + " because state Flow of this FlowReduxStateMachine is not collected yet. Start collecting the state Flow before dispatching any action.");
    }

    @Override // k10.e0
    public Object a(A a15, tq.e<? super i0> eVar) {
        return f(this, a15, eVar);
    }

    protected final void g(er.l<? super v<S, A>, i0> specBlock) {
        if (this.outputState != null) {
            throw new IllegalStateException("State machine spec has already been set. It's only allowed to call spec {...} once.");
        }
        v vVar = new v();
        specBlock.b(vVar);
        this.outputState = mu.i.R(mu.i.U(r.a(mu.i.W(this.inputActions), this.initialStateSupplier, vVar.b()), new a(this, null)), new b(this, null));
    }

    @Override // k10.e0
    public mu.g<S> getState() {
        e();
        mu.g<? extends S> gVar = this.outputState;
        if (gVar == null) {
            return null;
        }
        return gVar;
    }

    public t(final S s15) {
        this(new er.a() { // from class: k10.s
            @Override // er.a
            public final Object a() {
                return t.c(s15);
            }
        });
    }
}
