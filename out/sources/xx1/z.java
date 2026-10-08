package xx1;

import dx1.EdoPinScreenData;
import fr.q0;
import lw1.j0;
import mu.p0;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import sw1.EdoCanScreenData;
import yx1.EIdActivationData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001d8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lxx1/z;", "Ll00/g;", "Lxx1/u;", "", "Lxx1/v;", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "<init>", "(Lyy/a;Lmx/c;)V", "Lmx/a;", "j9", "()Lmx/a;", "Lyw1/a;", "i9", "()Lyw1/a;", "Liy/b0;", "can", "Loq/i0;", "Z", "(Liy/b0;)V", "pin", "x3", "b", "Lmx/c;", "c", "Lxx1/u;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "e", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lsw1/e;", "i8", "()Lsw1/e;", "canScreenData", "O", "()Liy/b0;", "canValue", "Ldx1/e;", "F1", "()Ldx1/e;", "pinScreenData", "Lyx1/d;", "G8", "()Lyx1/d;", "eIdActivationData", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<State, Object> implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0<State> state;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lxx1/s;", "action", "Lk10/c0;", "Lxx1/u;", "state", "Lk10/l;", "<anonymous>", "(Lxx1/s;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.q<CanDataChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221844e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f221845f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f221846g;

        a(tq.e<? super a> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(CanDataChanged canDataChanged, State state) {
            return State.b(state, null, canDataChanged.getCan(), null, null, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final CanDataChanged canDataChanged = (CanDataChanged) this.f221845f;
            k10.c0 c0Var = (k10.c0) this.f221846g;
            uq.b.e();
            if (this.f221844e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: xx1.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.a.O(canDataChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(CanDataChanged canDataChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            a aVar = new a(eVar);
            aVar.f221845f = canDataChanged;
            aVar.f221846g = c0Var;
            return aVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lxx1/t;", "action", "Lk10/c0;", "Lxx1/u;", "state", "Lk10/l;", "<anonymous>", "(Lxx1/t;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<PinDataChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221847e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f221848f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f221849g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(PinDataChanged pinDataChanged, State state) {
            return State.b(state, null, null, null, pinDataChanged.getPin(), 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final PinDataChanged pinDataChanged = (PinDataChanged) this.f221848f;
            k10.c0 c0Var = (k10.c0) this.f221849g;
            uq.b.e();
            if (this.f221847e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: xx1.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.b.O(pinDataChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(PinDataChanged pinDataChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = new b(eVar);
            bVar.f221848f = pinDataChanged;
            bVar.f221849g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    public z(yy.a aVar, mx.c cVar) {
        this.labelProvider = cVar;
        State state = new State(new EdoCanScreenData(j9(), false, null, 6, null), null, new EdoPinScreenData(j9(), i9(), false, null, false, 12, null), null, 10, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: xx1.w
            @Override // er.l
            public final Object b(Object obj) {
                return z.k9((k10.v) obj);
            }
        });
        this.state = a9(e9().getState(), state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k9(k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: xx1.x
            @Override // er.l
            public final Object b(Object obj) {
                return z.l9((k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(k10.z zVar) {
        a aVar = new a(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(CanDataChanged.class), oVar, aVar);
        zVar.v(q0.c(PinDataChanged.class), oVar, new b(null));
        return i0.f148189a;
    }

    @Override // dx1.d
    public EdoPinScreenData F1() {
        return getState().getValue().getPinScreenData();
    }

    @Override // yx1.c
    public EIdActivationData G8() {
        return new EIdActivationData(getState().getValue().getCan(), getState().getValue().getPin());
    }

    @Override // sw1.d, gy1.e, ky1.d
    public iy.b0 O() {
        return getState().getValue().getCan();
    }

    @Override // sw1.d, gy1.e
    public void Z(iy.b0 can) {
        d9(new CanDataChanged(can));
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<State> getState() {
        return this.state;
    }

    @Override // sw1.d
    public EdoCanScreenData i8() {
        return getState().getValue().getCanScreenData();
    }

    public yw1.a i9() {
        return yw1.a.AUTHENTICATION;
    }

    public Label j9() {
        return this.labelProvider.c(j0.f120802w1);
    }

    @Override // dx1.d
    public void x3(iy.b0 pin) {
        d9(new PinDataChanged(pin));
    }
}
