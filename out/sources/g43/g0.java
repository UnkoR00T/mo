package g43;

import f43.ChildStudent;
import fr.q0;
import java.util.List;
import mu.p0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R&\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00158\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lg43/g0;", "Ll00/g;", "Lg43/b0;", "", "Lg43/c0;", "Lyy/a;", "stateMachineFactory", "<init>", "(Lyy/a;)V", "", "Lf43/a;", "children", "Loq/i0;", "G", "(Ljava/util/List;)V", "child", "h4", "(Lf43/a;)V", "b", "Lg43/b0;", "initialState", "Lk10/t;", "c", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "d", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "y2", "()Lf43/a;", "selectedChild", "schooldashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g0 extends l00.g<State, Object> implements c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p0<State> state;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lg43/z;", "action", "Lk10/c0;", "Lg43/b0;", "state", "Lk10/l;", "<anonymous>", "(Lg43/z;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.q<ChildrenChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f70550e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f70551f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f70552g;

        a(tq.e<? super a> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ChildrenChanged childrenChanged, State state) {
            return State.b(state, childrenChanged.a(), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChildrenChanged childrenChanged = (ChildrenChanged) this.f70551f;
            k10.c0 c0Var = (k10.c0) this.f70552g;
            uq.b.e();
            if (this.f70550e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: g43.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return g0.a.O(childrenChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChildrenChanged childrenChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            a aVar = new a(eVar);
            aVar.f70551f = childrenChanged;
            aVar.f70552g = c0Var;
            return aVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lg43/a0;", "action", "Lk10/c0;", "Lg43/b0;", "state", "Lk10/l;", "<anonymous>", "(Lg43/a0;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<SelectedChildChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f70553e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f70554f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f70555g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SelectedChildChanged selectedChildChanged, State state) {
            return State.b(state, null, selectedChildChanged.getChild(), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SelectedChildChanged selectedChildChanged = (SelectedChildChanged) this.f70554f;
            k10.c0 c0Var = (k10.c0) this.f70555g;
            uq.b.e();
            if (this.f70553e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: g43.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return g0.b.O(selectedChildChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SelectedChildChanged selectedChildChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = new b(eVar);
            bVar.f70554f = selectedChildChanged;
            bVar.f70555g = c0Var;
            return bVar.J(oq.i0.f148189a);
        }
    }

    public g0(yy.a aVar) {
        State state = new State(null, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: g43.d0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.i9((k10.v) obj);
            }
        });
        this.state = a9(e9().getState(), state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i9(k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: g43.e0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.j9((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j9(k10.z zVar) {
        a aVar = new a(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(ChildrenChanged.class), oVar, aVar);
        zVar.v(q0.c(SelectedChildChanged.class), oVar, new b(null));
        return oq.i0.f148189a;
    }

    @Override // o43.a
    public void G(List<ChildStudent> children) {
        d9(new ChildrenChanged(children));
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<State> getState() {
        return this.state;
    }

    @Override // o43.a
    public void h4(ChildStudent child) {
        d9(new SelectedChildChanged(child));
    }

    @Override // j43.a
    public ChildStudent y2() {
        return getState().getValue().getSelectedChild();
    }
}
