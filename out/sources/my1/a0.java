package my1;

import fr.q0;
import fx1.EdoPukScreenData;
import lw1.j0;
import mu.p0;
import mx.Label;
import ny1.ResetPinContractData;
import p071kotlin.Metadata;
import sw1.EdoCanScreenData;
import zw1.EdoNewPinScreenData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R&\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030(8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u00103\u001a\b\u0012\u0004\u0012\u00020\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010:\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lmy1/a0;", "Ll00/g;", "Lmy1/v;", "", "Lmy1/w;", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "<init>", "(Lyy/a;Lmx/c;)V", "Lyw1/a;", "i9", "()Lyw1/a;", "Lmx/a;", "k9", "()Lmx/a;", "j9", "certificateType", "Loq/i0;", "l9", "(Lyw1/a;)V", "Llw1/a;", "destination", "n4", "(Llw1/a;)V", "m9", "Liy/b0;", "can", "Z", "(Liy/b0;)V", "puk", "F2", "newPin", "t2", "b", "Lmx/c;", "c", "Lmy1/v;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "e", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lsw1/e;", "i8", "()Lsw1/e;", "canScreenData", "O", "()Liy/b0;", "canValue", "Lfx1/e;", "R8", "()Lfx1/e;", "pukScreenData", "Lzw1/e;", "o3", "()Lzw1/e;", "newPinScreenData", "Lny1/g;", "j4", "()Lny1/g;", "resetPinContractData", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a0 extends l00.g<State, Object> implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0<State> state;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmy1/p;", "action", "Lk10/c0;", "Lmy1/v;", "state", "Lk10/l;", "<anonymous>", "(Lmy1/p;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.q<CanDataChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129396e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129397f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f129398g;

        a(tq.e<? super a> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(CanDataChanged canDataChanged, State state) {
            return State.b(state, null, canDataChanged.getCan(), null, null, null, null, null, null, 253, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final CanDataChanged canDataChanged = (CanDataChanged) this.f129397f;
            k10.c0 c0Var = (k10.c0) this.f129398g;
            uq.b.e();
            if (this.f129396e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: my1.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.a.O(canDataChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(CanDataChanged canDataChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            a aVar = new a(eVar);
            aVar.f129397f = canDataChanged;
            aVar.f129398g = c0Var;
            return aVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmy1/s;", "action", "Lk10/c0;", "Lmy1/v;", "state", "Lk10/l;", "<anonymous>", "(Lmy1/s;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<PukDataChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129399e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129400f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f129401g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(PukDataChanged pukDataChanged, State state) {
            return State.b(state, null, null, null, pukDataChanged.getPuk(), null, null, null, null, 247, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final PukDataChanged pukDataChanged = (PukDataChanged) this.f129400f;
            k10.c0 c0Var = (k10.c0) this.f129401g;
            uq.b.e();
            if (this.f129399e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: my1.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.b.O(pukDataChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(PukDataChanged pukDataChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = new b(eVar);
            bVar.f129400f = pukDataChanged;
            bVar.f129401g = c0Var;
            return bVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmy1/r;", "action", "Lk10/c0;", "Lmy1/v;", "state", "Lk10/l;", "<anonymous>", "(Lmy1/r;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<NewPinDataChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129402e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129403f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f129404g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(NewPinDataChanged newPinDataChanged, State state) {
            return State.b(state, null, null, null, null, null, newPinDataChanged.getNewPin(), null, null, 223, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final NewPinDataChanged newPinDataChanged = (NewPinDataChanged) this.f129403f;
            k10.c0 c0Var = (k10.c0) this.f129404g;
            uq.b.e();
            if (this.f129402e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: my1.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.c.O(newPinDataChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(NewPinDataChanged newPinDataChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f129403f = newPinDataChanged;
            cVar.f129404g = c0Var;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmy1/q;", "action", "Lk10/c0;", "Lmy1/v;", "state", "Lk10/l;", "<anonymous>", "(Lmy1/q;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<CertificateTypeDataChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129405e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129406f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f129407g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(k10.c0 c0Var, CertificateTypeDataChanged certificateTypeDataChanged, State state) {
            return State.b(state, null, null, null, null, EdoNewPinScreenData.b(((State) c0Var.a()).getNewPinScreenData(), null, certificateTypeDataChanged.getCertificateType(), null, 5, null), null, null, null, 239, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final CertificateTypeDataChanged certificateTypeDataChanged = (CertificateTypeDataChanged) this.f129406f;
            final k10.c0 c0Var = (k10.c0) this.f129407g;
            uq.b.e();
            if (this.f129405e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: my1.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.d.O(c0Var, certificateTypeDataChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(CertificateTypeDataChanged certificateTypeDataChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f129406f = certificateTypeDataChanged;
            dVar.f129407g = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmy1/u;", "action", "Lk10/c0;", "Lmy1/v;", "state", "Lk10/l;", "<anonymous>", "(Lmy1/u;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<SetFirstScreenInFlow, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129408e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129409f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f129410g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SetFirstScreenInFlow setFirstScreenInFlow, k10.c0 c0Var, State state) {
            lw1.a destination = setFirstScreenInFlow.getDestination();
            return State.b(state, EdoCanScreenData.b(((State) c0Var.a()).getCanScreenData(), null, fr.t.c(setFirstScreenInFlow.getDestination(), lw1.a.j.C2949a.f120647b), null, 5, null), null, EdoPukScreenData.b(((State) c0Var.a()).getPukScreenData(), null, fr.t.c(setFirstScreenInFlow.getDestination(), lw1.a.j.c.f120649b), null, 5, null), null, null, null, null, destination, 122, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SetFirstScreenInFlow setFirstScreenInFlow = (SetFirstScreenInFlow) this.f129409f;
            final k10.c0 c0Var = (k10.c0) this.f129410g;
            uq.b.e();
            if (this.f129408e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: my1.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.e.O(setFirstScreenInFlow, c0Var, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SetFirstScreenInFlow setFirstScreenInFlow, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f129409f = setFirstScreenInFlow;
            eVar2.f129410g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmy1/t;", "action", "Lk10/c0;", "Lmy1/v;", "state", "Lk10/l;", "<anonymous>", "(Lmy1/t;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<SetEntryDestination, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129411e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129412f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f129413g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SetEntryDestination setEntryDestination, State state) {
            return State.b(state, null, null, null, null, null, null, setEntryDestination.getDestination(), null, 191, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SetEntryDestination setEntryDestination = (SetEntryDestination) this.f129412f;
            k10.c0 c0Var = (k10.c0) this.f129413g;
            uq.b.e();
            if (this.f129411e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: my1.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.f.O(setEntryDestination, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SetEntryDestination setEntryDestination, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f129412f = setEntryDestination;
            fVar.f129413g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    public a0(yy.a aVar, mx.c cVar) {
        this.labelProvider = cVar;
        State state = new State(new EdoCanScreenData(k9(), false, j9(), 2, null), null, new EdoPukScreenData(k9(), true, j9()), null, new EdoNewPinScreenData(k9(), i9(), j9()), null, null, lw1.a.j.c.f120649b, 106, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: my1.x
            @Override // er.l
            public final Object b(Object obj) {
                return a0.n9((k10.v) obj);
            }
        });
        this.state = a9(e9().getState(), state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n9(k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: my1.y
            @Override // er.l
            public final Object b(Object obj) {
                return a0.o9((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o9(k10.z zVar) {
        a aVar = new a(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(CanDataChanged.class), oVar, aVar);
        zVar.v(q0.c(PukDataChanged.class), oVar, new b(null));
        zVar.v(q0.c(NewPinDataChanged.class), oVar, new c(null));
        zVar.v(q0.c(CertificateTypeDataChanged.class), oVar, new d(null));
        zVar.v(q0.c(SetFirstScreenInFlow.class), oVar, new e(null));
        zVar.v(q0.c(SetEntryDestination.class), oVar, new f(null));
        return oq.i0.f148189a;
    }

    @Override // fx1.d
    public void F2(iy.b0 puk) {
        d9(new PukDataChanged(puk));
    }

    @Override // sw1.d, gy1.e, ky1.d
    public iy.b0 O() {
        return getState().getValue().getCan();
    }

    @Override // fx1.d
    public EdoPukScreenData R8() {
        return getState().getValue().getPukScreenData();
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

    @Override // ny1.f
    public ResetPinContractData j4() {
        return new ResetPinContractData(getState().getValue().getCan(), getState().getValue().getPuk(), getState().getValue().getNewPin(), getState().getValue().getNewPinScreenData().getCertificateType(), getState().getValue().getEntryDestination(), getState().getValue().getFirstScreenInFlow());
    }

    public Label j9() {
        return this.labelProvider.c(j0.f120719e3);
    }

    public Label k9() {
        return this.labelProvider.c(j0.f120779q3);
    }

    public void l9(yw1.a certificateType) {
        d9(new CertificateTypeDataChanged(certificateType));
    }

    public void m9(lw1.a destination) {
        d9(new SetEntryDestination(destination));
    }

    @Override // my1.w
    public void n4(lw1.a destination) {
        d9(new SetFirstScreenInFlow(destination));
    }

    @Override // zw1.d
    public EdoNewPinScreenData o3() {
        return getState().getValue().getNewPinScreenData();
    }

    @Override // zw1.d
    public void t2(iy.b0 newPin) {
        d9(new NewPinDataChanged(newPin));
    }
}
