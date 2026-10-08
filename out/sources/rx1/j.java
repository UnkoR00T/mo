package rx1;

import dx1.EdoPinScreenData;
import er.q;
import fr.q0;
import iy.b0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import lw1.j0;
import mu.p0;
import mx.Label;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import sw1.EdoCanScreenData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R&\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030%8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u00100\u001a\b\u0012\u0004\u0012\u00020\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00107\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lrx1/j;", "Ll00/g;", "Lrx1/f;", "", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "<init>", "(Lyy/a;Lmx/c;)V", "", "fileName", "", "fileBytes", "Loq/i0;", "n9", "(Ljava/lang/String;[B)V", "j9", "()V", "Lmx/a;", "k9", "()Lmx/a;", "m9", "Lyw1/a;", "l9", "()Lyw1/a;", "Liy/b0;", "can", "Z", "(Liy/b0;)V", "pin", "x3", "b", "Lmx/c;", "c", "Lrx1/f;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "e", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lsw1/e;", "i8", "()Lsw1/e;", "canScreenData", "O", "()Liy/b0;", "canValue", "Ldx1/e;", "F1", "()Ldx1/e;", "pinScreenData", "Lrx1/a;", "I3", "()Lrx1/a;", "signFileSharedData", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends l00.g<State, Object> implements l00.e, sw1.d, dx1.d, sx1.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0<State> state;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lrx1/b;", "action", "Lk10/c0;", "Lrx1/f;", "state", "Lk10/l;", "<anonymous>", "(Lrx1/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements q<rx1.b, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176641e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176642f;

        a(tq.e<? super a> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(j jVar, State state) {
            return jVar.initialState;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f176642f;
            uq.b.e();
            if (this.f176641e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final j jVar = j.this;
            return c0Var.b(new er.l() { // from class: rx1.i
                @Override // er.l
                public final Object b(Object obj2) {
                    return j.a.O(jVar, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(rx1.b bVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            a aVar = j.this.new a(eVar);
            aVar.f176642f = c0Var;
            return aVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lrx1/c;", "action", "Lk10/c0;", "Lrx1/f;", "state", "Lk10/l;", "<anonymous>", "(Lrx1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<SaveCan, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176644e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176645f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f176646g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SaveCan saveCan, State state) {
            return State.b(state, null, null, null, saveCan.getCan(), null, null, 55, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SaveCan saveCan = (SaveCan) this.f176645f;
            c0 c0Var = (c0) this.f176646g;
            uq.b.e();
            if (this.f176644e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: rx1.k
                @Override // er.l
                public final Object b(Object obj2) {
                    return j.b.O(saveCan, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveCan saveCan, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = new b(eVar);
            bVar.f176645f = saveCan;
            bVar.f176646g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lrx1/d;", "action", "Lk10/c0;", "Lrx1/f;", "state", "Lk10/l;", "<anonymous>", "(Lrx1/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<SavePin, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176647e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176648f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f176649g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SavePin savePin, State state) {
            return State.b(state, null, null, null, null, null, savePin.getPin(), 31, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SavePin savePin = (SavePin) this.f176648f;
            c0 c0Var = (c0) this.f176649g;
            uq.b.e();
            if (this.f176647e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: rx1.l
                @Override // er.l
                public final Object b(Object obj2) {
                    return j.c.O(savePin, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SavePin savePin, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f176648f = savePin;
            cVar.f176649g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lrx1/e;", "action", "Lk10/c0;", "Lrx1/f;", "state", "Lk10/l;", "<anonymous>", "(Lrx1/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<SetSelectedFileBytesAndName, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f176650e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f176651f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f176652g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SetSelectedFileBytesAndName setSelectedFileBytesAndName, State state) {
            return State.b(state, setSelectedFileBytesAndName.getFileName(), setSelectedFileBytesAndName.getFileBytes(), null, null, null, null, 60, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SetSelectedFileBytesAndName setSelectedFileBytesAndName = (SetSelectedFileBytesAndName) this.f176651f;
            c0 c0Var = (c0) this.f176652g;
            uq.b.e();
            if (this.f176650e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: rx1.m
                @Override // er.l
                public final Object b(Object obj2) {
                    return j.d.O(setSelectedFileBytesAndName, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SetSelectedFileBytesAndName setSelectedFileBytesAndName, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f176651f = setSelectedFileBytesAndName;
            dVar.f176652g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    public j(yy.a aVar, mx.c cVar) {
        this.labelProvider = cVar;
        State state = new State(null, null, new EdoCanScreenData(k9(), false, m9(), 2, null), null, new EdoPinScreenData(cVar.c(j0.S0), l9(), false, m9(), false, 20, null), null, 43, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: rx1.g
            @Override // er.l
            public final Object b(Object obj) {
                return j.o9(this.f176634a, (v) obj);
            }
        });
        this.state = a9(e9().getState(), state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final j jVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: rx1.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.p9(this.f176635a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(j jVar, z zVar) {
        a aVar = jVar.new a(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(rx1.b.class), oVar, aVar);
        zVar.v(q0.c(SaveCan.class), oVar, new b(null));
        zVar.v(q0.c(SavePin.class), oVar, new c(null));
        zVar.v(q0.c(SetSelectedFileBytesAndName.class), oVar, new d(null));
        return i0.f148189a;
    }

    @Override // dx1.d
    public EdoPinScreenData F1() {
        return getState().getValue().getPinScreenData();
    }

    @Override // sx1.f
    public SignFileSharedData I3() {
        return new SignFileSharedData(getState().getValue().getSelectedFileName(), getState().getValue().getSelectedFileBytes(), getState().getValue().getCanScreenData(), getState().getValue().getCan(), getState().getValue().getPinScreenData(), getState().getValue().getPin());
    }

    @Override // sw1.d, gy1.e, ky1.d
    public b0 O() {
        return getState().getValue().getCan();
    }

    @Override // sw1.d, gy1.e
    public void Z(b0 can) {
        d9(new SaveCan(can));
    }

    @Override // l00.g
    protected t<State, Object> e9() {
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

    public void j9() {
        d9(rx1.b.f176621a);
    }

    public Label k9() {
        return this.labelProvider.c(j0.S0);
    }

    public yw1.a l9() {
        return yw1.a.AUTHORIZATION;
    }

    public Label m9() {
        return this.labelProvider.c(j0.f120812z);
    }

    public void n9(String fileName, byte[] fileBytes) {
        d9(new SetSelectedFileBytesAndName(fileName, fileBytes));
    }

    @Override // dx1.d
    public void x3(b0 pin) {
        d9(new SavePin(pin));
    }
}
