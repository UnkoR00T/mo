package dz2;

import ez2.CanSharedData;
import fr.q0;
import gz2.ConfirmMidSharedData;
import gz2.DeeplinkSharedData;
import gz2.i0;
import iz2.QrScannerSharedData;
import kz2.VerificationSharedData;
import mu.p0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R&\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001a8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Ldz2/b0;", "Ll00/g;", "Ldz2/w;", "", "Ldz2/x;", "Lyy/a;", "stateMachineFactory", "<init>", "(Lyy/a;)V", "Liz2/q;", "data", "Loq/i0;", "u5", "(Liz2/q;)V", "Lgz2/m;", "B4", "(Lgz2/m;)V", "Lgz2/h0;", "i9", "(Lgz2/h0;)V", "Lez2/g;", "o7", "(Lez2/g;)V", "b", "Ldz2/w;", "initialState", "Lk10/t;", "c", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "d", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "k5", "()Liz2/q;", "qrScannerData", "a5", "()Lgz2/m;", "confirmMidData", "n6", "()Lgz2/h0;", "deeplinkData", "Lgz2/i0;", "q4", "()Lgz2/i0;", "entryPoint", "Lkz2/l;", "P3", "()Lkz2/l;", "verificationData", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 extends l00.g<State, Object> implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p0<State> state;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldz2/v;", "action", "Lk10/c0;", "Ldz2/w;", "state", "Lk10/l;", "<anonymous>", "(Ldz2/v;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.q<QrScannerDataChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45631e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f45632f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f45633g;

        a(tq.e<? super a> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(QrScannerDataChanged qrScannerDataChanged, State state) {
            return State.b(state, qrScannerDataChanged.getData(), null, null, null, i0.QR_CODE, 14, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final QrScannerDataChanged qrScannerDataChanged = (QrScannerDataChanged) this.f45632f;
            k10.c0 c0Var = (k10.c0) this.f45633g;
            uq.b.e();
            if (this.f45631e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: dz2.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.a.O(qrScannerDataChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(QrScannerDataChanged qrScannerDataChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            a aVar = new a(eVar);
            aVar.f45632f = qrScannerDataChanged;
            aVar.f45633g = c0Var;
            return aVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldz2/t;", "action", "Lk10/c0;", "Ldz2/w;", "state", "Lk10/l;", "<anonymous>", "(Ldz2/t;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ConfirmMidDataChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45634e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f45635f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f45636g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ConfirmMidDataChanged confirmMidDataChanged, State state) {
            return State.b(state, null, confirmMidDataChanged.getData(), null, null, null, 29, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ConfirmMidDataChanged confirmMidDataChanged = (ConfirmMidDataChanged) this.f45635f;
            k10.c0 c0Var = (k10.c0) this.f45636g;
            uq.b.e();
            if (this.f45634e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: dz2.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.b.O(confirmMidDataChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ConfirmMidDataChanged confirmMidDataChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = new b(eVar);
            bVar.f45635f = confirmMidDataChanged;
            bVar.f45636g = c0Var;
            return bVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldz2/u;", "action", "Lk10/c0;", "Ldz2/w;", "state", "Lk10/l;", "<anonymous>", "(Ldz2/u;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<DeeplinkDataChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45637e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f45638f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f45639g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(DeeplinkDataChanged deeplinkDataChanged, State state) {
            return State.b(state, null, null, deeplinkDataChanged.getData(), null, i0.DEEPLINK, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final DeeplinkDataChanged deeplinkDataChanged = (DeeplinkDataChanged) this.f45638f;
            k10.c0 c0Var = (k10.c0) this.f45639g;
            uq.b.e();
            if (this.f45637e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: dz2.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.c.O(deeplinkDataChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(DeeplinkDataChanged deeplinkDataChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f45638f = deeplinkDataChanged;
            cVar.f45639g = c0Var;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ldz2/s;", "action", "Lk10/c0;", "Ldz2/w;", "state", "Lk10/l;", "<anonymous>", "(Ldz2/s;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<CanDataChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f45640e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f45641f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f45642g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(CanDataChanged canDataChanged, State state) {
            return State.b(state, null, null, null, canDataChanged.getData(), null, 23, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final CanDataChanged canDataChanged = (CanDataChanged) this.f45641f;
            k10.c0 c0Var = (k10.c0) this.f45642g;
            uq.b.e();
            if (this.f45640e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: dz2.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.d.O(canDataChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(CanDataChanged canDataChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f45641f = canDataChanged;
            dVar.f45642g = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    public b0(yy.a aVar) {
        State state = new State(new QrScannerSharedData(null, 1, null), new ConfirmMidSharedData(null, null, null, null, null, 31, null), new DeeplinkSharedData(null, 1, null), new CanSharedData(null, 1, null), i0.QR_CODE);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: dz2.y
            @Override // er.l
            public final Object b(Object obj) {
                return b0.j9((k10.v) obj);
            }
        });
        this.state = a9(e9().getState(), state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j9(k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: dz2.z
            @Override // er.l
            public final Object b(Object obj) {
                return b0.k9((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k9(k10.z zVar) {
        a aVar = new a(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(QrScannerDataChanged.class), oVar, aVar);
        zVar.v(q0.c(ConfirmMidDataChanged.class), oVar, new b(null));
        zVar.v(q0.c(DeeplinkDataChanged.class), oVar, new c(null));
        zVar.v(q0.c(CanDataChanged.class), oVar, new d(null));
        return oq.i0.f148189a;
    }

    @Override // gz2.a
    public void B4(ConfirmMidSharedData data) {
        d9(new ConfirmMidDataChanged(data));
    }

    @Override // kz2.c
    public VerificationSharedData P3() {
        return new VerificationSharedData(getState().getValue().getQrScannerData(), getState().getValue().getConfirmMidData(), getState().getValue().getCanSharedData(), getState().getValue().getEntryPoint());
    }

    @Override // gz2.a
    public ConfirmMidSharedData a5() {
        return getState().getValue().getConfirmMidData();
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<State> getState() {
        return this.state;
    }

    public void i9(DeeplinkSharedData data) {
        d9(new DeeplinkDataChanged(data));
    }

    @Override // gz2.a
    public QrScannerSharedData k5() {
        return getState().getValue().getQrScannerData();
    }

    @Override // gz2.a
    public DeeplinkSharedData n6() {
        return getState().getValue().getDeeplinkData();
    }

    @Override // ez2.a
    public void o7(CanSharedData data) {
        d9(new CanDataChanged(data));
    }

    @Override // gz2.a
    public i0 q4() {
        return getState().getValue().getEntryPoint();
    }

    @Override // iz2.d
    public void u5(QrScannerSharedData data) {
        d9(new QrScannerDataChanged(data));
    }
}
