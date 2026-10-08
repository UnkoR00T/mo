package hj1;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import mj1.ContactDetailsData;
import p071kotlin.Metadata;
import vi1.ChildParticipant;
import vi1.ChosenTrainingUnitAndDate;
import zp0.AvailableDefenceTrainings;
import zp0.BEUnitDefenceTrainingsByType;
import zp0.DefenceTraining;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u001b\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R&\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030'8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u00103\u001a\b\u0012\u0004\u0012\u00020.0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u00109\u001a\b\u0012\u0004\u0012\u00020\u0002048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020:0\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0016\u0010G\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR \u0010L\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u00100H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0016\u0010O\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0016\u0010R\u001a\u0004\u0018\u00010\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010<R \u0010V\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020T0H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010K¨\u0006W"}, d2 = {"Lhj1/w0;", "Ll00/g;", "Lhj1/r;", "", "Lhj1/s;", "Lyy/a;", "stateMachineFactory", "Lhj1/q;", "setupData", "<init>", "(Lyy/a;Lhj1/q;)V", "", "typeCode", "Loq/i0;", "K6", "(Ljava/lang/String;)V", "Lzp0/a;", "data", "d8", "(Lzp0/a;)V", "Lmj1/f;", "r5", "(Lmj1/f;)V", "", "Lvi1/a;", "children", "G", "(Ljava/util/List;)V", "C2", "()V", "Lvi1/b;", "chosenTraining", "o4", "(Lvi1/b;)V", "b", "Lhj1/q;", "c", "Lhj1/r;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lhj1/l;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lzp0/s;", "S1", "()Ljava/util/List;", "trainingPlaces", "E5", "()Lzp0/s;", "trainingPlacesFiltered", "", "m1", "()Z", "showTypesList", "r4", "()Lzp0/a;", "trainingLocation", "Ldx/i;", "Ldx/b;", "Y0", "()Ldx/i;", "selectedTrainingLocation", "z0", "()Lmj1/f;", "contactDetailsData", "K4", "()Lvi1/b;", "chosenTrainingUnitAndDate", "getChildren", "", "V5", "chosenTrainingId", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w0 extends l00.g<State, Object> implements s, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<l> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<State> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhj1/j;", "<unused var>", "Lhj1/r;", "Loq/i0;", "<anonymous>", "(Lhj1/j;Lhj1/r;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.q<j, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85114e;

        a(tq.e<? super a> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f85114e;
            if (i15 == 0) {
                oq.u.b(obj);
                w0 w0Var = w0.this;
                l.a aVar = l.a.f85072a;
                this.f85114e = 1;
                if (w0Var.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(j jVar, State state, tq.e<? super oq.i0> eVar) {
            return w0.this.new a(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhj1/n;", "action", "Lhj1/r;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lhj1/n;Lhj1/r;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ToDetails, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85116e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f85117f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ToDetails toDetails = (ToDetails) this.f85117f;
            Object objE = uq.b.e();
            int i15 = this.f85116e;
            if (i15 == 0) {
                oq.u.b(obj);
                w0 w0Var = w0.this;
                l.ToDetails toDetails2 = new l.ToDetails(toDetails.getTraining());
                this.f85117f = vq.j.a(toDetails);
                this.f85116e = 1;
                if (w0Var.F(toDetails2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ToDetails toDetails, State state, tq.e<? super oq.i0> eVar) {
            b bVar = w0.this.new b(eVar);
            bVar.f85117f = toDetails;
            return bVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lhj1/o;", "action", "Lk10/c0;", "Lhj1/r;", "state", "Lk10/l;", "<anonymous>", "(Lhj1/o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<TrainingLocationChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85119e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f85120f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f85121g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(TrainingLocationChanged trainingLocationChanged, k10.c0 c0Var, State state) {
            AvailableDefenceTrainings data = trainingLocationChanged.getData();
            ChosenTrainingUnitAndDate chosenTrainingUnitAndDate = ((State) c0Var.a()).getChosenTrainingUnitAndDate();
            return State.b(state, null, null, data, null, null, fr.t.c(chosenTrainingUnitAndDate != null ? chosenTrainingUnitAndDate.getUnit() : null, trainingLocationChanged.getData().getUnit()) ? ((State) c0Var.a()).getChosenTrainingUnitAndDate() : null, 19, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final TrainingLocationChanged trainingLocationChanged = (TrainingLocationChanged) this.f85120f;
            final k10.c0 c0Var = (k10.c0) this.f85121g;
            uq.b.e();
            if (this.f85119e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: hj1.x0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.c.O(trainingLocationChanged, c0Var, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(TrainingLocationChanged trainingLocationChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f85120f = trainingLocationChanged;
            cVar.f85121g = c0Var;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lhj1/k;", "action", "Lk10/c0;", "Lhj1/r;", "state", "Lk10/l;", "<anonymous>", "(Lhj1/k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ContactDetailsChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85122e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f85123f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f85124g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ContactDetailsChanged contactDetailsChanged, State state) {
            return State.b(state, null, null, null, contactDetailsChanged.getData(), null, null, 55, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ContactDetailsChanged contactDetailsChanged = (ContactDetailsChanged) this.f85123f;
            k10.c0 c0Var = (k10.c0) this.f85124g;
            uq.b.e();
            if (this.f85122e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: hj1.y0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.d.O(contactDetailsChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ContactDetailsChanged contactDetailsChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f85123f = contactDetailsChanged;
            dVar.f85124g = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lhj1/i;", "action", "Lk10/c0;", "Lhj1/r;", "state", "Lk10/l;", "<anonymous>", "(Lhj1/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ChosenTrainingUnitAndDateChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85125e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f85126f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f85127g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ChosenTrainingUnitAndDateChanged chosenTrainingUnitAndDateChanged, State state) {
            return State.b(state, null, null, null, null, null, chosenTrainingUnitAndDateChanged.getChosenTraining(), 31, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChosenTrainingUnitAndDateChanged chosenTrainingUnitAndDateChanged = (ChosenTrainingUnitAndDateChanged) this.f85126f;
            k10.c0 c0Var = (k10.c0) this.f85127g;
            uq.b.e();
            if (this.f85125e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: hj1.z0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.e.O(chosenTrainingUnitAndDateChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChosenTrainingUnitAndDateChanged chosenTrainingUnitAndDateChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f85126f = chosenTrainingUnitAndDateChanged;
            eVar2.f85127g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lhj1/m;", "action", "Lk10/c0;", "Lhj1/r;", "state", "Lk10/l;", "<anonymous>", "(Lhj1/m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<SaveChildren, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f85129f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f85130g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SaveChildren saveChildren, State state) {
            return State.b(state, null, null, null, null, saveChildren.a(), null, 47, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SaveChildren saveChildren = (SaveChildren) this.f85129f;
            k10.c0 c0Var = (k10.c0) this.f85130g;
            uq.b.e();
            if (this.f85128e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: hj1.a1
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.f.O(saveChildren, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveChildren saveChildren, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f85129f = saveChildren;
            fVar.f85130g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lhj1/p;", "action", "Lk10/c0;", "Lhj1/r;", "state", "Lk10/l;", "<anonymous>", "(Lhj1/p;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<TrainingTypeChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85131e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f85132f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f85133g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(TrainingTypeChanged trainingTypeChanged, State state) {
            return State.b(state, null, trainingTypeChanged.getTypeCode(), null, null, null, null, 17, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final TrainingTypeChanged trainingTypeChanged = (TrainingTypeChanged) this.f85132f;
            k10.c0 c0Var = (k10.c0) this.f85133g;
            uq.b.e();
            if (this.f85131e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: hj1.b1
                @Override // er.l
                public final Object b(Object obj2) {
                    return w0.g.O(trainingTypeChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(TrainingTypeChanged trainingTypeChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f85132f = trainingTypeChanged;
            gVar.f85133g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    public w0(yy.a aVar, SetupData setupData) {
        this.setupData = setupData;
        State state = new State(setupData, null, null, null, null, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: hj1.u0
            @Override // er.l
            public final Object b(Object obj) {
                return w0.k9(this.f85105a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(e9().getState(), state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k9(final w0 w0Var, k10.v vVar) {
        vVar.c(fr.q0.c(State.class), new er.l() { // from class: hj1.v0
            @Override // er.l
            public final Object b(Object obj) {
                return w0.l9(this.f85107a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l9(w0 w0Var, k10.z zVar) {
        a aVar = w0Var.new a(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(j.class), oVar, aVar);
        zVar.x(fr.q0.c(ToDetails.class), oVar, w0Var.new b(null));
        zVar.v(fr.q0.c(TrainingLocationChanged.class), oVar, new c(null));
        zVar.v(fr.q0.c(ContactDetailsChanged.class), oVar, new d(null));
        zVar.v(fr.q0.c(ChosenTrainingUnitAndDateChanged.class), oVar, new e(null));
        zVar.v(fr.q0.c(SaveChildren.class), oVar, new f(null));
        zVar.v(fr.q0.c(TrainingTypeChanged.class), oVar, new g(null));
        return oq.i0.f148189a;
    }

    @Override // hj1.s
    public void C2() {
        d9(j.f85065a);
    }

    @Override // qj1.k
    public BEUnitDefenceTrainingsByType E5() {
        Object next;
        if (getState().getValue().getTrainingTypeCode() == null) {
            return (BEUnitDefenceTrainingsByType) pq.v.l0(S1());
        }
        Iterator<T> it = getState().getValue().getSetupData().b().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fr.t.c(((BEUnitDefenceTrainingsByType) next).getType().getCode(), getState().getValue().getTrainingTypeCode()));
        BEUnitDefenceTrainingsByType bEUnitDefenceTrainingsByType = (BEUnitDefenceTrainingsByType) next;
        return bEUnitDefenceTrainingsByType == null ? (BEUnitDefenceTrainingsByType) pq.v.l0(S1()) : bEUnitDefenceTrainingsByType;
    }

    @Override // mj1.e, ij1.e
    public void G(List<ChildParticipant> children) {
        d9(new SaveChildren(children));
    }

    @Override // kj1.e
    public ChosenTrainingUnitAndDate K4() {
        return getState().getValue().getChosenTrainingUnitAndDate();
    }

    @Override // uj1.f
    public void K6(String typeCode) {
        d9(new TrainingTypeChanged(typeCode));
    }

    @Override // uj1.f
    public List<BEUnitDefenceTrainingsByType> S1() {
        return getState().getValue().getSetupData().b();
    }

    @Override // mj1.e
    public dx.i<dx.b, Integer> V5() {
        Object objB;
        DefenceTraining trainingDate;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    ChosenTrainingUnitAndDate chosenTrainingUnitAndDate = getState().getValue().getChosenTrainingUnitAndDate();
                    Integer numValueOf = (chosenTrainingUnitAndDate == null || (trainingDate = chosenTrainingUnitAndDate.getTrainingDate()) == null) ? null : Integer.valueOf(trainingDate.getId());
                    if (numValueOf != null) {
                        return new dx.i.Right(Integer.valueOf(numValueOf.intValue()));
                    }
                    aVar.b(new dx.b.Generic(new IllegalStateException("trainingId is null")));
                    throw new oq.g();
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    @Override // kj1.e
    public dx.i<dx.b, AvailableDefenceTrainings> Y0() {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    AvailableDefenceTrainings availableDefenceTrainingsR4 = r4();
                    if (availableDefenceTrainingsR4 != null) {
                        return new dx.i.Right(availableDefenceTrainingsR4);
                    }
                    aVar.b(new dx.b.Generic(new IllegalStateException("trainingLocation can not be null")));
                    throw new oq.g();
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    @Override // zx.b
    public xw.b<l> Y1() {
        return this.navAction;
    }

    @Override // qj1.k
    public void d8(AvailableDefenceTrainings data) {
        d9(new TrainingLocationChanged(data));
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // mj1.e, ij1.e
    public List<ChildParticipant> getChildren() {
        return getState().getValue().c();
    }

    @Override // l00.e
    public mu.p0<State> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: i9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(l lVar, tq.e<? super oq.i0> eVar) {
        return super.F(lVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // hj1.s
    public boolean m1() {
        return this.setupData.getShowTypesList();
    }

    @Override // kj1.e
    public void o4(ChosenTrainingUnitAndDate chosenTraining) {
        d9(new ChosenTrainingUnitAndDateChanged(chosenTraining));
    }

    @Override // qj1.k
    public AvailableDefenceTrainings r4() {
        return getState().getValue().getTrainingLocation();
    }

    @Override // mj1.e
    public void r5(ContactDetailsData data) {
        d9(new ContactDetailsChanged(data));
    }

    @Override // mj1.e
    public ContactDetailsData z0() {
        return getState().getValue().getContactDetailsData();
    }
}
