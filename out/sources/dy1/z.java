package dy1;

import fr.q0;
import gy1.ElectronicLayerData;
import lw1.j0;
import mu.p0;
import oq.i0;
import p071kotlin.Metadata;
import sw1.EdoCanScreenData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00178\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Ldy1/z;", "Ll00/g;", "Ldy1/u;", "", "Ldy1/v;", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "<init>", "(Lyy/a;Lmx/c;)V", "Liy/b0;", "can", "Loq/i0;", "Z", "(Liy/b0;)V", "Lgy1/e1;", "data", "h5", "(Lgy1/e1;)V", "b", "Ldy1/u;", "initialState", "Lk10/t;", "c", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "d", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lsw1/e;", "i8", "()Lsw1/e;", "canScreenData", "O", "()Liy/b0;", "canValue", "A0", "()Lgy1/e1;", "eLayerData", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<State, Object> implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p0<State> state;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldy1/s;", "action", "Lk10/c0;", "Ldy1/u;", "state", "Lk10/l;", "<anonymous>", "(Ldy1/s;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.q<CanDataChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f45557f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f45558g;

        a(tq.e<? super a> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(CanDataChanged canDataChanged, State state) {
            return State.b(state, null, canDataChanged.getCan(), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final CanDataChanged canDataChanged = (CanDataChanged) this.f45557f;
            k10.c0 c0Var = (k10.c0) this.f45558g;
            uq.b.e();
            if (this.f45556e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: dy1.y
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
            aVar.f45557f = canDataChanged;
            aVar.f45558g = c0Var;
            return aVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldy1/t;", "action", "Lk10/c0;", "Ldy1/u;", "state", "Lk10/l;", "<anonymous>", "(Ldy1/t;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ElectronicLayerDataChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45559e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f45560f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f45561g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ElectronicLayerDataChanged electronicLayerDataChanged, State state) {
            return State.b(state, null, null, electronicLayerDataChanged.getData(), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ElectronicLayerDataChanged electronicLayerDataChanged = (ElectronicLayerDataChanged) this.f45560f;
            k10.c0 c0Var = (k10.c0) this.f45561g;
            uq.b.e();
            if (this.f45559e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: dy1.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.b.O(electronicLayerDataChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ElectronicLayerDataChanged electronicLayerDataChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = new b(eVar);
            bVar.f45560f = electronicLayerDataChanged;
            bVar.f45561g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    public z(yy.a aVar, mx.c cVar) {
        EdoCanScreenData edoCanScreenData = new EdoCanScreenData(cVar.c(j0.f120775q), true, null, 4, null);
        gy1.a.c cVar2 = gy1.a.c.f78260a;
        State state = new State(edoCanScreenData, null, new ElectronicLayerData(cVar2, cVar2, cVar2), 2, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: dy1.w
            @Override // er.l
            public final Object b(Object obj) {
                return z.i9((k10.v) obj);
            }
        });
        this.state = a9(e9().getState(), state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i9(k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: dy1.x
            @Override // er.l
            public final Object b(Object obj) {
                return z.j9((k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j9(k10.z zVar) {
        a aVar = new a(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(CanDataChanged.class), oVar, aVar);
        zVar.v(q0.c(ElectronicLayerDataChanged.class), oVar, new b(null));
        return i0.f148189a;
    }

    @Override // ky1.d, ey1.f
    public ElectronicLayerData A0() {
        return getState().getValue().getElectronicLayerData();
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

    @Override // gy1.e
    public void h5(ElectronicLayerData data) {
        d9(new ElectronicLayerDataChanged(data));
    }

    @Override // sw1.d
    public EdoCanScreenData i8() {
        return getState().getValue().getCanScreenData();
    }
}
