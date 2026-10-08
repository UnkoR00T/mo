package om2;

import cb4.DialogData;
import er.q;
import fr.q0;
import java.util.List;
import k10.c0;
import k10.o;
import k10.t;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0004B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001a\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010)R&\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030+8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u00107\u001a\b\u0012\u0004\u0012\u000202018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R&\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0002088\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b=\u0010%\u001a\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lom2/e;", "Ll00/g;", "Lom2/b;", "Lom2/a;", "", "Lyy/a;", "stateMachineFactory", "Lpn2/b;", "networkSecurityIssuesCloseFormDialogMapper", "<init>", "(Lyy/a;Lpn2/b;)V", "Lcb4/d;", "l9", "()Lcb4/d;", "Lsm2/a$a;", "data", "Loq/i0;", "v2", "(Lsm2/a$a;)V", "n8", "()Lsm2/a$a;", "", "Lwx/i;", "h", "()Ljava/util/List;", "attachments", "d0", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Lkm2/a$a;", "k1", "(Lkm2/a$a;)V", "p3", "()Lkm2/a$a;", "Lum2/a$a;", "c", "()Lum2/a$a;", "t", "()V", "n9", "b", "Lpn2/b;", "Lom2/b;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lom2/a$c;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "state", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e extends l00.g<State, om2.a> implements l00.e, sm2.a, qm2.a, km2.a, um2.a, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pn2.b networkSecurityIssuesCloseFormDialogMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<State, om2.a> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<om2.a.c> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<State> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lom2/a$g;", "<unused var>", "Lom2/b;", "Loq/i0;", "<anonymous>", "(Lom2/a$g;Lom2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements q<om2.a.g, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146765e;

        a(tq.e<? super a> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146765e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<om2.a.c> bVarY1 = e.this.Y1();
                om2.a.c.ShowCloseDialog showCloseDialog = new om2.a.c.ShowCloseDialog(e.this.l9());
                this.f146765e = 1;
                if (bVarY1.F(showCloseDialog, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(om2.a.g gVar, State state, tq.e<? super i0> eVar) {
            return e.this.new a(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lom2/a$b;", "<unused var>", "Lom2/b;", "Loq/i0;", "<anonymous>", "(Lom2/a$b;Lom2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<om2.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146767e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f146767e;
            if (i15 == 0) {
                u.b(obj);
                e.this.d9(om2.a.C3653a.f146745a);
                xw.b<om2.a.c> bVarY1 = e.this.Y1();
                om2.a.c.C3654a c3654a = om2.a.c.C3654a.f146747a;
                this.f146767e = 1;
                if (bVarY1.F(c3654a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(om2.a.b bVar, State state, tq.e<? super i0> eVar) {
            return e.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lom2/a$a;", "<unused var>", "Lk10/c0;", "Lom2/b;", "state", "Lk10/l;", "<anonymous>", "(Lom2/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<om2.a.C3653a, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146769e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f146770f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(e eVar, State state) {
            return eVar.initialState;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f146770f;
            uq.b.e();
            if (this.f146769e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final e eVar = e.this;
            return c0Var.b(new er.l() { // from class: om2.f
                @Override // er.l
                public final Object b(Object obj2) {
                    return e.c.O(eVar, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(om2.a.C3653a c3653a, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = e.this.new c(eVar);
            cVar.f146770f = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lom2/a$f;", "action", "Lk10/c0;", "Lom2/b;", "state", "Lk10/l;", "<anonymous>", "(Lom2/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<om2.a.SaveFraudDescriptionData, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146772e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f146773f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f146774g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(om2.a.SaveFraudDescriptionData saveFraudDescriptionData, State state) {
            return State.b(state, saveFraudDescriptionData.getData(), null, null, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final om2.a.SaveFraudDescriptionData saveFraudDescriptionData = (om2.a.SaveFraudDescriptionData) this.f146773f;
            c0 c0Var = (c0) this.f146774g;
            uq.b.e();
            if (this.f146772e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: om2.g
                @Override // er.l
                public final Object b(Object obj2) {
                    return e.d.O(saveFraudDescriptionData, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(om2.a.SaveFraudDescriptionData saveFraudDescriptionData, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f146773f = saveFraudDescriptionData;
            dVar.f146774g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: om2.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lom2/a$d;", "action", "Lk10/c0;", "Lom2/b;", "state", "Lk10/l;", "<anonymous>", "(Lom2/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class C3655e extends vq.k implements q<om2.a.SaveAttachments, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146775e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f146776f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f146777g;

        C3655e(tq.e<? super C3655e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(om2.a.SaveAttachments saveAttachments, State state) {
            return State.b(state, null, saveAttachments.a(), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final om2.a.SaveAttachments saveAttachments = (om2.a.SaveAttachments) this.f146776f;
            c0 c0Var = (c0) this.f146777g;
            uq.b.e();
            if (this.f146775e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: om2.h
                @Override // er.l
                public final Object b(Object obj2) {
                    return e.C3655e.O(saveAttachments, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(om2.a.SaveAttachments saveAttachments, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            C3655e c3655e = new C3655e(eVar);
            c3655e.f146776f = saveAttachments;
            c3655e.f146777g = c0Var;
            return c3655e.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lom2/a$e;", "action", "Lk10/c0;", "Lom2/b;", "state", "Lk10/l;", "<anonymous>", "(Lom2/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements q<om2.a.SaveContactData, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f146778e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f146779f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f146780g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(om2.a.SaveContactData saveContactData, State state) {
            return State.b(state, null, null, saveContactData.getContactData(), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final om2.a.SaveContactData saveContactData = (om2.a.SaveContactData) this.f146779f;
            c0 c0Var = (c0) this.f146780g;
            uq.b.e();
            if (this.f146778e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: om2.i
                @Override // er.l
                public final Object b(Object obj2) {
                    return e.f.O(saveContactData, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(om2.a.SaveContactData saveContactData, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f146779f = saveContactData;
            fVar.f146780g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    public e(yy.a aVar, pn2.b bVar) {
        this.networkSecurityIssuesCloseFormDialogMapper = bVar;
        sm2.a.FraudIssueDescriptionData fraudIssueDescriptionData = new sm2.a.FraudIssueDescriptionData("", hz.b.d.f86848c);
        List listN = v.n();
        km2.b bVar2 = km2.b.FRAUD_WIZARD;
        hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
        State state = new State(fraudIssueDescriptionData, listN, new km2.a.ContactData(bVar2, false, "", c2039b, false, c2039b));
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: om2.c
            @Override // er.l
            public final Object b(Object obj) {
                return e.o9(this.f146758a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(e9().getState(), state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData l9() {
        return this.networkSecurityIssuesCloseFormDialogMapper.b(new pn2.b.Params(b9(om2.a.b.f146746a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final e eVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: om2.d
            @Override // er.l
            public final Object b(Object obj) {
                return e.p9(this.f146759a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(e eVar, z zVar) {
        a aVar = eVar.new a(null);
        o oVar = o.CANCEL_PREVIOUS;
        zVar.x(q0.c(om2.a.g.class), oVar, aVar);
        zVar.x(q0.c(om2.a.b.class), oVar, eVar.new b(null));
        zVar.v(q0.c(om2.a.C3653a.class), oVar, eVar.new c(null));
        zVar.v(q0.c(om2.a.SaveFraudDescriptionData.class), oVar, new d(null));
        zVar.v(q0.c(om2.a.SaveAttachments.class), oVar, new C3655e(null));
        zVar.v(q0.c(om2.a.SaveContactData.class), oVar, new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<om2.a.c> Y1() {
        return this.navAction;
    }

    @Override // um2.a
    public um2.a.SummaryData c() {
        State value = getState().getValue();
        String description = value.getFraudDescriptionData().getDescription();
        String email = value.getContactData().getEmail();
        if (value.getContactData().getIsAnonymous()) {
            email = null;
        }
        return new um2.a.SummaryData(description, email, value.c());
    }

    @Override // qm2.a
    public Object d0(List<? extends wx.i> list, tq.e<? super i0> eVar) {
        d9(new om2.a.SaveAttachments(list));
        return i0.f148189a;
    }

    @Override // l00.g
    protected t<State, om2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<State> getState() {
        return this.state;
    }

    @Override // qm2.a
    public List<wx.i> h() {
        return getState().getValue().c();
    }

    @Override // km2.a
    public void k1(km2.a.ContactData data) {
        d9(new om2.a.SaveContactData(data));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // sm2.a
    public sm2.a.FraudIssueDescriptionData n8() {
        return getState().getValue().getFraudDescriptionData();
    }

    public void n9() {
        d9(om2.a.g.f146754a);
    }

    @Override // km2.a
    public km2.a.ContactData p3() {
        return getState().getValue().getContactData();
    }

    @Override // um2.a
    public void t() {
        d9(om2.a.C3653a.f146745a);
    }

    @Override // sm2.a
    public void v2(sm2.a.FraudIssueDescriptionData data) {
        d9(new om2.a.SaveFraudDescriptionData(data));
    }
}
