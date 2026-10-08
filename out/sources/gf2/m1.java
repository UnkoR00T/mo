package gf2;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import java.util.ArrayList;
import java.util.List;
import kf2.InternetContactInfoData;
import mf2.FormSummaryContractData;
import p071kotlin.Metadata;
import pf2.InternetParametersData;
import st3.AddressData;
import uf2.OperatorItem;
import zi0.InternetAddressPoint;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010'\u001a\u00020&2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100$H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R&\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030.8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u00109\u001a\b\u0012\u0004\u0012\u00020\u0002048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001c\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0016\u0010!\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0016\u0010C\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\r¨\u0006D"}, d2 = {"Lgf2/m1;", "Ll00/g;", "Lgf2/g1;", "", "Lgf2/h1;", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "<init>", "(Lyy/a;Lmx/c;)V", "Lmf2/g;", "k9", "()Lmf2/g;", "Lpf2/e;", "parameters", "Loq/i0;", "L3", "(Lpf2/e;)V", "", "Luf2/a;", "operatorList", "R4", "(Ljava/util/List;)V", "Lst3/b;", "address", "D7", "(Lst3/b;)V", "Lzi0/a;", "addressPoint", "d7", "(Lzi0/a;)V", "Lkf2/k;", "contactInfo", "L7", "(Lkf2/k;)V", "Lkotlin/Function0;", "primaryButtonAction", "Lcb4/d;", "p7", "(Ler/a;)Lcb4/d;", "b", "Lmx/c;", "c", "Lgf2/g1;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "e", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "o", "()Lst3/b;", "R0", "()Lzi0/a;", "u7", "()Ljava/util/List;", "B6", "()Lkf2/k;", "u8", "formData", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m1 extends l00.g<State, Object> implements h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<State> state;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgf2/e1;", "action", "Lk10/c0;", "Lgf2/g1;", "state", "Lk10/l;", "<anonymous>", "(Lgf2/e1;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.q<InternetParametersChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72632e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f72633f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f72634g;

        a(tq.e<? super a> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(InternetParametersChanged internetParametersChanged, State state) {
            return State.b(state, internetParametersChanged.getParameters(), null, null, null, null, 30, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final InternetParametersChanged internetParametersChanged = (InternetParametersChanged) this.f72633f;
            k10.c0 c0Var = (k10.c0) this.f72634g;
            uq.b.e();
            if (this.f72632e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: gf2.l1
                @Override // er.l
                public final Object b(Object obj2) {
                    return m1.a.O(internetParametersChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(InternetParametersChanged internetParametersChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            a aVar = new a(eVar);
            aVar.f72633f = internetParametersChanged;
            aVar.f72634g = c0Var;
            return aVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgf2/b1;", "action", "Lk10/c0;", "Lgf2/g1;", "state", "Lk10/l;", "<anonymous>", "(Lgf2/b1;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<AddressDataChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72635e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f72636f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f72637g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(AddressDataChanged addressDataChanged, State state) {
            return State.b(state, null, addressDataChanged.getAddress(), null, null, null, 17, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final AddressDataChanged addressDataChanged = (AddressDataChanged) this.f72636f;
            k10.c0 c0Var = (k10.c0) this.f72637g;
            uq.b.e();
            if (this.f72635e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return fr.t.c(addressDataChanged.getAddress(), ((State) c0Var.a()).getAddress()) ? c0Var.c() : c0Var.b(new er.l() { // from class: gf2.n1
                @Override // er.l
                public final Object b(Object obj2) {
                    return m1.b.O(addressDataChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(AddressDataChanged addressDataChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            b bVar = new b(eVar);
            bVar.f72636f = addressDataChanged;
            bVar.f72637g = c0Var;
            return bVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgf2/c1;", "action", "Lk10/c0;", "Lgf2/g1;", "state", "Lk10/l;", "<anonymous>", "(Lgf2/c1;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<AddressPointChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72638e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f72639f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f72640g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(AddressPointChanged addressPointChanged, State state) {
            return State.b(state, null, null, addressPointChanged.getAddressPoint(), null, null, 27, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final AddressPointChanged addressPointChanged = (AddressPointChanged) this.f72639f;
            k10.c0 c0Var = (k10.c0) this.f72640g;
            uq.b.e();
            if (this.f72638e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: gf2.o1
                @Override // er.l
                public final Object b(Object obj2) {
                    return m1.c.O(addressPointChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(AddressPointChanged addressPointChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f72639f = addressPointChanged;
            cVar.f72640g = c0Var;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgf2/f1;", "action", "Lk10/c0;", "Lgf2/g1;", "state", "Lk10/l;", "<anonymous>", "(Lgf2/f1;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<OperatorListChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72641e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f72642f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f72643g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OperatorListChanged operatorListChanged, State state) {
            return State.b(state, null, null, null, operatorListChanged.a(), null, 23, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OperatorListChanged operatorListChanged = (OperatorListChanged) this.f72642f;
            k10.c0 c0Var = (k10.c0) this.f72643g;
            uq.b.e();
            if (this.f72641e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: gf2.p1
                @Override // er.l
                public final Object b(Object obj2) {
                    return m1.d.O(operatorListChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OperatorListChanged operatorListChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f72642f = operatorListChanged;
            dVar.f72643g = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgf2/d1;", "action", "Lk10/c0;", "Lgf2/g1;", "state", "Lk10/l;", "<anonymous>", "(Lgf2/d1;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ContactInfoChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f72644e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f72645f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f72646g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ContactInfoChanged contactInfoChanged, State state) {
            return State.b(state, null, null, null, null, contactInfoChanged.getContactInfo(), 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ContactInfoChanged contactInfoChanged = (ContactInfoChanged) this.f72645f;
            k10.c0 c0Var = (k10.c0) this.f72646g;
            uq.b.e();
            if (this.f72644e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: gf2.q1
                @Override // er.l
                public final Object b(Object obj2) {
                    return m1.e.O(contactInfoChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ContactInfoChanged contactInfoChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f72645f = contactInfoChanged;
            eVar2.f72646g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    public m1(yy.a aVar, mx.c cVar) {
        this.labelProvider = cVar;
        State state = new State(null, null, null, null, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: gf2.j1
            @Override // er.l
            public final Object b(Object obj) {
                return m1.l9((k10.v) obj);
            }
        });
        this.state = a9(e9().getState(), state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j9() {
        return oq.i0.f148189a;
    }

    private final FormSummaryContractData k9() {
        AddressData address;
        InternetAddressPoint addressPoint;
        List<OperatorItem> listF;
        InternetContactInfoData contactInfo;
        InternetParametersData parameters = getState().getValue().getParameters();
        if (parameters == null || (address = getState().getValue().getAddress()) == null || (addressPoint = getState().getValue().getAddressPoint()) == null || (listF = getState().getValue().f()) == null || (contactInfo = getState().getValue().getContactInfo()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (((OperatorItem) obj).getIsSelected()) {
                arrayList.add(obj);
            }
        }
        return new FormSummaryContractData(parameters, address, addressPoint, arrayList, contactInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l9(k10.v vVar) {
        vVar.c(fr.q0.c(State.class), new er.l() { // from class: gf2.k1
            @Override // er.l
            public final Object b(Object obj) {
                return m1.m9((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m9(k10.z zVar) {
        a aVar = new a(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(InternetParametersChanged.class), oVar, aVar);
        zVar.v(fr.q0.c(AddressDataChanged.class), oVar, new b(null));
        zVar.v(fr.q0.c(AddressPointChanged.class), oVar, new c(null));
        zVar.v(fr.q0.c(OperatorListChanged.class), oVar, new d(null));
        zVar.v(fr.q0.c(ContactInfoChanged.class), oVar, new e(null));
        return oq.i0.f148189a;
    }

    @Override // kf2.j
    public InternetContactInfoData B6() {
        return getState().getValue().getContactInfo();
    }

    @Override // hf2.d
    public void D7(AddressData address) {
        d9(new AddressDataChanged(address));
    }

    @Override // pf2.d
    public void L3(InternetParametersData parameters) {
        d9(new InternetParametersChanged(parameters));
    }

    @Override // kf2.j
    public void L7(InternetContactInfoData contactInfo) {
        d9(new ContactInfoChanged(contactInfo));
    }

    @Override // hf2.d, sf2.f
    public InternetAddressPoint R0() {
        return getState().getValue().getAddressPoint();
    }

    @Override // sf2.f
    public void R4(List<OperatorItem> operatorList) {
        d9(new OperatorListChanged(operatorList));
    }

    @Override // hf2.d
    public void d7(InternetAddressPoint addressPoint) {
        d9(new AddressPointChanged(addressPoint));
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<State> getState() {
        return this.state;
    }

    @Override // hf2.d
    public AddressData o() {
        return getState().getValue().getAddress();
    }

    @Override // gf2.h1
    public DialogData p7(er.a<oq.i0> primaryButtonAction) {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(df2.a.f41398p), null, new DialogButtonTextData(this.labelProvider.c(df2.a.f41370b), null, primaryButtonAction, 2, null), new DialogButtonTextData(this.labelProvider.c(df2.a.f41412w), null, new er.a() { // from class: gf2.i1
            @Override // er.a
            public final Object a() {
                return m1.j9();
            }
        }, 2, null), null, null, 100, null);
    }

    @Override // sf2.f
    public List<OperatorItem> u7() {
        return getState().getValue().f();
    }

    @Override // mf2.f
    public FormSummaryContractData u8() {
        return k9();
    }
}
