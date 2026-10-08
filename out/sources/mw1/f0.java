package mw1;

import dx1.EdoPinScreenData;
import fr.q0;
import mu.p0;
import mx.Label;
import nw1.ChangePinContractData;
import p071kotlin.Metadata;
import sw1.EdoCanScreenData;
import zw1.EdoNewPinScreenData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u001fH\u0016¢\u0006\u0004\b$\u0010\"J\u0017\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R&\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030,8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u00107\u001a\b\u0012\u0004\u0012\u00020\u0002028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lmw1/f0;", "Ll00/g;", "Lmw1/a0;", "", "Lmw1/b0;", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "<init>", "(Lyy/a;Lmx/c;)V", "Lyw1/a;", "i9", "()Lyw1/a;", "Lmx/a;", "k9", "()Lmx/a;", "j9", "certificateType", "Loq/i0;", "l9", "(Lyw1/a;)V", "Llw1/a;", "destination", "n4", "(Llw1/a;)V", "m9", "", "isAvailable", "n9", "(Z)V", "Liy/b0;", "can", "Z", "(Liy/b0;)V", "pin", "x3", "newPin", "t2", "b", "Lmx/c;", "c", "Lmw1/a0;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "e", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lsw1/e;", "i8", "()Lsw1/e;", "canScreenData", "O", "()Liy/b0;", "canValue", "Ldx1/e;", "F1", "()Ldx1/e;", "pinScreenData", "Lzw1/e;", "o3", "()Lzw1/e;", "newPinScreenData", "Lnw1/e;", "z2", "()Lnw1/e;", "changePinContractData", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f0 extends l00.g<State, Object> implements b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0<State> state;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmw1/t;", "action", "Lk10/c0;", "Lmw1/a0;", "state", "Lk10/l;", "<anonymous>", "(Lmw1/t;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.q<CanDataChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128735e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f128736f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f128737g;

        a(tq.e<? super a> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(CanDataChanged canDataChanged, State state) {
            return State.b(state, null, canDataChanged.getCan(), null, null, null, null, null, null, 253, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final CanDataChanged canDataChanged = (CanDataChanged) this.f128736f;
            k10.c0 c0Var = (k10.c0) this.f128737g;
            uq.b.e();
            if (this.f128735e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: mw1.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.a.O(canDataChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(CanDataChanged canDataChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            a aVar = new a(eVar);
            aVar.f128736f = canDataChanged;
            aVar.f128737g = c0Var;
            return aVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmw1/w;", "action", "Lk10/c0;", "Lmw1/a0;", "state", "Lk10/l;", "<anonymous>", "(Lmw1/w;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<PinDataChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128738e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f128739f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f128740g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(PinDataChanged pinDataChanged, State state) {
            return State.b(state, null, null, null, pinDataChanged.getPin(), null, null, null, null, 247, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final PinDataChanged pinDataChanged = (PinDataChanged) this.f128739f;
            k10.c0 c0Var = (k10.c0) this.f128740g;
            uq.b.e();
            if (this.f128738e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: mw1.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.b.O(pinDataChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(PinDataChanged pinDataChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = new b(eVar);
            bVar.f128739f = pinDataChanged;
            bVar.f128740g = c0Var;
            return bVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmw1/v;", "action", "Lk10/c0;", "Lmw1/a0;", "state", "Lk10/l;", "<anonymous>", "(Lmw1/v;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<NewPinDataChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128741e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f128742f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f128743g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(NewPinDataChanged newPinDataChanged, State state) {
            return State.b(state, null, null, null, null, null, newPinDataChanged.getNewPin(), null, null, 223, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final NewPinDataChanged newPinDataChanged = (NewPinDataChanged) this.f128742f;
            k10.c0 c0Var = (k10.c0) this.f128743g;
            uq.b.e();
            if (this.f128741e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: mw1.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.c.O(newPinDataChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(NewPinDataChanged newPinDataChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f128742f = newPinDataChanged;
            cVar.f128743g = c0Var;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmw1/u;", "action", "Lk10/c0;", "Lmw1/a0;", "state", "Lk10/l;", "<anonymous>", "(Lmw1/u;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<CertificateTypeDataChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128744e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f128745f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f128746g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(k10.c0 c0Var, CertificateTypeDataChanged certificateTypeDataChanged, State state) {
            return State.b(state, null, null, EdoPinScreenData.b(((State) c0Var.a()).getPinScreenData(), null, certificateTypeDataChanged.getCertificateType(), false, null, false, 29, null), null, EdoNewPinScreenData.b(((State) c0Var.a()).getNewPinScreenData(), null, certificateTypeDataChanged.getCertificateType(), null, 5, null), null, null, null, 235, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final CertificateTypeDataChanged certificateTypeDataChanged = (CertificateTypeDataChanged) this.f128745f;
            final k10.c0 c0Var = (k10.c0) this.f128746g;
            uq.b.e();
            if (this.f128744e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: mw1.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.d.O(c0Var, certificateTypeDataChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(CertificateTypeDataChanged certificateTypeDataChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f128745f = certificateTypeDataChanged;
            dVar.f128746g = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmw1/y;", "action", "Lk10/c0;", "Lmw1/a0;", "state", "Lk10/l;", "<anonymous>", "(Lmw1/y;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<SetFirstScreenInFlow, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128747e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f128748f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f128749g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SetFirstScreenInFlow setFirstScreenInFlow, k10.c0 c0Var, State state) {
            lw1.a destination = setFirstScreenInFlow.getDestination();
            return State.b(state, EdoCanScreenData.b(((State) c0Var.a()).getCanScreenData(), null, fr.t.c(setFirstScreenInFlow.getDestination(), lw1.a.AbstractC2944a.C2945a.f120620b), null, 5, null), null, EdoPinScreenData.b(((State) c0Var.a()).getPinScreenData(), null, null, fr.t.c(setFirstScreenInFlow.getDestination(), lw1.a.AbstractC2944a.d.f120623b), null, false, 27, null), null, null, null, null, destination, 122, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SetFirstScreenInFlow setFirstScreenInFlow = (SetFirstScreenInFlow) this.f128748f;
            final k10.c0 c0Var = (k10.c0) this.f128749g;
            uq.b.e();
            if (this.f128747e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: mw1.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.e.O(setFirstScreenInFlow, c0Var, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SetFirstScreenInFlow setFirstScreenInFlow, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f128748f = setFirstScreenInFlow;
            eVar2.f128749g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmw1/x;", "action", "Lk10/c0;", "Lmw1/a0;", "state", "Lk10/l;", "<anonymous>", "(Lmw1/x;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<SetEntryDestination, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128750e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f128751f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f128752g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SetEntryDestination setEntryDestination, State state) {
            return State.b(state, null, null, null, null, null, null, setEntryDestination.getDestination(), null, 191, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SetEntryDestination setEntryDestination = (SetEntryDestination) this.f128751f;
            k10.c0 c0Var = (k10.c0) this.f128752g;
            uq.b.e();
            if (this.f128750e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: mw1.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.f.O(setEntryDestination, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SetEntryDestination setEntryDestination, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f128751f = setEntryDestination;
            fVar.f128752g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmw1/z;", "action", "Lk10/c0;", "Lmw1/a0;", "state", "Lk10/l;", "<anonymous>", "(Lmw1/z;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<SetResetPinAvailable, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f128753e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f128754f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f128755g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(k10.c0 c0Var, SetResetPinAvailable setResetPinAvailable, State state) {
            return State.b(state, null, null, EdoPinScreenData.b(((State) c0Var.a()).getPinScreenData(), null, null, false, null, setResetPinAvailable.getIsAvailable(), 15, null), null, null, null, null, null, 251, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SetResetPinAvailable setResetPinAvailable = (SetResetPinAvailable) this.f128754f;
            final k10.c0 c0Var = (k10.c0) this.f128755g;
            uq.b.e();
            if (this.f128753e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: mw1.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.g.O(c0Var, setResetPinAvailable, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SetResetPinAvailable setResetPinAvailable, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f128754f = setResetPinAvailable;
            gVar.f128755g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    public f0(yy.a aVar, mx.c cVar) {
        this.labelProvider = cVar;
        State state = new State(new EdoCanScreenData(k9(), true, j9()), null, new EdoPinScreenData(k9(), i9(), false, j9(), false, 20, null), null, new EdoNewPinScreenData(k9(), i9(), j9()), null, null, lw1.a.AbstractC2944a.d.f120623b, 106, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: mw1.c0
            @Override // er.l
            public final Object b(Object obj) {
                return f0.o9((k10.v) obj);
            }
        });
        this.state = a9(e9().getState(), state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o9(k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: mw1.d0
            @Override // er.l
            public final Object b(Object obj) {
                return f0.p9((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p9(k10.z zVar) {
        a aVar = new a(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(CanDataChanged.class), oVar, aVar);
        zVar.v(q0.c(PinDataChanged.class), oVar, new b(null));
        zVar.v(q0.c(NewPinDataChanged.class), oVar, new c(null));
        zVar.v(q0.c(CertificateTypeDataChanged.class), oVar, new d(null));
        zVar.v(q0.c(SetFirstScreenInFlow.class), oVar, new e(null));
        zVar.v(q0.c(SetEntryDestination.class), oVar, new f(null));
        zVar.v(q0.c(SetResetPinAvailable.class), oVar, new g(null));
        return oq.i0.f148189a;
    }

    @Override // dx1.d
    public EdoPinScreenData F1() {
        return getState().getValue().getPinScreenData();
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
        return yw1.a.AUTHORIZATION;
    }

    public Label j9() {
        return this.labelProvider.c(lw1.j0.f120719e3);
    }

    public Label k9() {
        return this.labelProvider.c(lw1.j0.f120779q3);
    }

    public void l9(yw1.a certificateType) {
        d9(new CertificateTypeDataChanged(certificateType));
    }

    public void m9(lw1.a destination) {
        d9(new SetEntryDestination(destination));
    }

    public void n4(lw1.a destination) {
        d9(new SetFirstScreenInFlow(destination));
    }

    public void n9(boolean isAvailable) {
        d9(new SetResetPinAvailable(isAvailable));
    }

    @Override // zw1.d
    public EdoNewPinScreenData o3() {
        return getState().getValue().getNewPinScreenData();
    }

    @Override // zw1.d
    public void t2(iy.b0 newPin) {
        d9(new NewPinDataChanged(newPin));
    }

    @Override // dx1.d
    public void x3(iy.b0 pin) {
        d9(new PinDataChanged(pin));
    }

    @Override // nw1.d
    public ChangePinContractData z2() {
        return new ChangePinContractData(getState().getValue().getPin(), getState().getValue().getCan(), getState().getValue().getNewPin(), getState().getValue().getPinScreenData().getCertificateType(), getState().getValue().getFirstScreenInFlow(), getState().getValue().getEntryDestination(), getState().getValue().getPinScreenData().getResetPinAvailable());
    }
}
