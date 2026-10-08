package mg2;

import java.util.Comparator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.e1;
import tq0.LandRegisterDocument;
import tq0.LandRegisterDocumentTypesFee;
import tq0.LandRegisterSubDocument;
import tq0.MyRegistry;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00170\u0012H\u0096@¢\u0006\u0004\b\"\u0010\u0016J\u001d\u0010%\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020$0#H\u0016¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#H\u0016¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e0\u0012H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R&\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003008\u0014X\u0094\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R \u0010<\u001a\b\u0012\u0004\u0012\u000207068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R \u0010B\u001a\b\u0012\u0004\u0012\u00020\u00020=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lmg2/l0;", "Ll00/g;", "Lmg2/m;", "", "Lmg2/n;", "Lvq0/e;", "getDocumentTypesFeeUC", "Lyy/a;", "stateMachineFactory", "<init>", "(Lvq0/e;Lyy/a;)V", "Loq/i0;", "X1", "()V", "Ltq0/j;", "orderId", "j7", "(Ljava/lang/String;)V", "Ldx/i;", "Ldx/b;", "Ltq0/r;", "v0", "(Ltq/e;)Ljava/lang/Object;", "Ltq0/p;", "data", "a4", "(Ltq0/p;)V", "Ltq0/u$b;", "h0", "()Ltq0/u$b;", "Ltq0/u;", "myRegistry", "W5", "(Ltq0/u;)V", "o0", "", "Ltq0/s;", "K2", "(Ljava/util/Set;)V", "D0", "()Ljava/util/Set;", "x0", "()Ldx/i;", "b", "Lvq0/e;", "c", "Lmg2/m;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lmg2/i;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l0 extends l00.g<State, Object> implements n, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vq0.e getDocumentTypesFeeUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<i> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<State> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f126458d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f126460f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f126458d = obj;
            this.f126460f |= PKIFailureInfo.systemUnavail;
            return l0.this.v0(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmg2/i;", "action", "Lmg2/m;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lmg2/i;Lmg2/m;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<i, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126461e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126462f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i iVar = (i) this.f126462f;
            Object objE = uq.b.e();
            int i15 = this.f126461e;
            if (i15 == 0) {
                oq.u.b(obj);
                l0 l0Var = l0.this;
                this.f126462f = vq.j.a(iVar);
                this.f126461e = 1;
                if (l0Var.F(iVar, this) == objE) {
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
        public final Object w(i iVar, State state, tq.e<? super oq.i0> eVar) {
            b bVar = l0.this.new b(eVar);
            bVar.f126462f = iVar;
            return bVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmg2/j;", "action", "Lk10/c0;", "Lmg2/m;", "state", "Lk10/l;", "<anonymous>", "(Lmg2/j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<OnChosenMyRegistry, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126464e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126465f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f126466g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnChosenMyRegistry onChosenMyRegistry, State state) {
            return State.b(state, null, null, onChosenMyRegistry.getData(), null, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnChosenMyRegistry onChosenMyRegistry = (OnChosenMyRegistry) this.f126465f;
            k10.c0 c0Var = (k10.c0) this.f126466g;
            uq.b.e();
            if (this.f126464e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: mg2.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.c.O(onChosenMyRegistry, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnChosenMyRegistry onChosenMyRegistry, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f126465f = onChosenMyRegistry;
            cVar.f126466g = c0Var;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmg2/h;", "action", "Lk10/c0;", "Lmg2/m;", "state", "Lk10/l;", "<anonymous>", "(Lmg2/h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<DocumentTypesDataChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126467e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126468f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f126469g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(DocumentTypesDataChanged documentTypesDataChanged, State state) {
            return State.b(state, documentTypesDataChanged.getData(), null, null, null, 14, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final DocumentTypesDataChanged documentTypesDataChanged = (DocumentTypesDataChanged) this.f126468f;
            k10.c0 c0Var = (k10.c0) this.f126469g;
            uq.b.e();
            if (this.f126467e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: mg2.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.d.O(documentTypesDataChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(DocumentTypesDataChanged documentTypesDataChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f126468f = documentTypesDataChanged;
            dVar.f126469g = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmg2/k;", "action", "Lk10/c0;", "Lmg2/m;", "state", "Lk10/l;", "<anonymous>", "(Lmg2/k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<SaveSelectedDocument, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126470e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126471f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f126472g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f126473a;

            static {
                int[] iArr = new int[tq0.g.values().length];
                try {
                    iArr[tq0.g.Extract.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f126473a = iArr;
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(LandRegisterDocument landRegisterDocument, k10.c0 c0Var, State state) {
            return State.b(state, null, landRegisterDocument, null, a.f126473a[landRegisterDocument.getType().ordinal()] == 1 ? ((State) c0Var.a()).d() : e1.e(), 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SaveSelectedDocument saveSelectedDocument = (SaveSelectedDocument) this.f126471f;
            final k10.c0 c0Var = (k10.c0) this.f126472g;
            uq.b.e();
            if (this.f126470e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final LandRegisterDocument data = saveSelectedDocument.getData();
            return c0Var.b(new er.l() { // from class: mg2.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.e.O(data, c0Var, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveSelectedDocument saveSelectedDocument, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f126471f = saveSelectedDocument;
            eVar2.f126472g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmg2/l;", "action", "Lk10/c0;", "Lmg2/m;", "state", "Lk10/l;", "<anonymous>", "(Lmg2/l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<SaveSelectedExtractDocument, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f126474e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f126475f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f126476g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t15, T t16) {
                return sq.a.e(Integer.valueOf(((LandRegisterSubDocument) t15).getSubtype().getOrder()), Integer.valueOf(((LandRegisterSubDocument) t16).getSubtype().getOrder()));
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SaveSelectedExtractDocument saveSelectedExtractDocument, State state) {
            return State.b(state, null, null, null, pq.v.k1(pq.v.U0(saveSelectedExtractDocument.a(), new a())), 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SaveSelectedExtractDocument saveSelectedExtractDocument = (SaveSelectedExtractDocument) this.f126475f;
            k10.c0 c0Var = (k10.c0) this.f126476g;
            uq.b.e();
            if (this.f126474e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: mg2.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return l0.f.O(saveSelectedExtractDocument, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SaveSelectedExtractDocument saveSelectedExtractDocument, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f126475f = saveSelectedExtractDocument;
            fVar.f126476g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    public l0(vq0.e eVar, yy.a aVar) {
        this.getDocumentTypesFeeUC = eVar;
        State state = new State(null, null, null, null, 15, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: mg2.j0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.k9(this.f126449a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(e9().getState(), state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k9(final l0 l0Var, k10.v vVar) {
        vVar.c(fr.q0.c(State.class), new er.l() { // from class: mg2.k0
            @Override // er.l
            public final Object b(Object obj) {
                return l0.l9(this.f126451a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l9(l0 l0Var, k10.z zVar) {
        b bVar = l0Var.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(i.class), oVar, bVar);
        zVar.v(fr.q0.c(OnChosenMyRegistry.class), oVar, new c(null));
        zVar.v(fr.q0.c(DocumentTypesDataChanged.class), oVar, new d(null));
        zVar.v(fr.q0.c(SaveSelectedDocument.class), oVar, new e(null));
        zVar.v(fr.q0.c(SaveSelectedExtractDocument.class), oVar, new f(null));
        return oq.i0.f148189a;
    }

    @Override // tg2.f, ng2.g
    public Set<LandRegisterSubDocument> D0() {
        return getState().getValue().d();
    }

    @Override // ng2.g
    public void K2(Set<LandRegisterSubDocument> data) {
        d9(new SaveSelectedExtractDocument(data));
    }

    @Override // vg2.d
    public void W5(MyRegistry myRegistry) {
        d9(new OnChosenMyRegistry(myRegistry));
    }

    @Override // mg2.n
    public void X1() {
        d9(i.a.f126446a);
    }

    @Override // zx.b
    public xw.b<i> Y1() {
        return this.navAction;
    }

    @Override // pg2.d
    public void a4(LandRegisterDocument data) {
        d9(new SaveSelectedDocument(data));
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<State> getState() {
        return this.state;
    }

    @Override // pg2.d
    public MyRegistry.b h0() {
        MyRegistry myRegistry = getState().getValue().getMyRegistry();
        if (myRegistry != null) {
            return myRegistry.getOpen();
        }
        return null;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: i9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(i iVar, tq.e<? super oq.i0> eVar) {
        return super.F(iVar, eVar);
    }

    @Override // mg2.n
    public void j7(String orderId) {
        d9(new i.GoToDownloadDocument(orderId, null));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // tg2.f, ng2.g
    public Object o0(tq.e<? super dx.i<? extends dx.b, LandRegisterDocument>> eVar) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    LandRegisterDocument selectedDocument = getState().getValue().getSelectedDocument();
                    if (selectedDocument != null) {
                        return new dx.i.Right(selectedDocument);
                    }
                    aVar.b(new dx.b.Generic(new IllegalStateException("selectedDocument does not exist")));
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pg2.d
    public Object v0(tq.e<? super dx.i<? extends dx.b, LandRegisterDocumentTypesFee>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f126460f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f126460f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f126458d;
        Object objE = uq.b.e();
        int i16 = aVar.f126460f;
        if (i16 == 0) {
            oq.u.b(objC);
            LandRegisterDocumentTypesFee documentTypes = getState().getValue().getDocumentTypes();
            if (documentTypes != null) {
                return new dx.i.Right(documentTypes);
            }
            vq0.e eVar2 = this.getDocumentTypesFeeUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            aVar.f126460f = 1;
            objC = eVar2.c(c1792a, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Right) {
            d9(new DocumentTypesDataChanged((LandRegisterDocumentTypesFee) ((dx.i.Right) iVar).b()));
        }
        return iVar;
    }

    @Override // tg2.f
    public dx.i<dx.b, MyRegistry> x0() {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    MyRegistry myRegistry = getState().getValue().getMyRegistry();
                    if (myRegistry != null) {
                        return new dx.i.Right(myRegistry);
                    }
                    aVar.b(new dx.b.Generic(new IllegalStateException("myRegistry is null")));
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
}
