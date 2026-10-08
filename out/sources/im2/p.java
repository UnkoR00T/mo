package im2;

import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B[\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020%H\u0096\u0001¢\u0006\u0004\b(\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R&\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003098\u0014X\u0094\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R \u0010E\u001a\b\u0012\u0004\u0012\u00020@0?8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lim2/p;", "Ll00/g;", "Lim2/b;", "Lim2/a;", "Lim2/c;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lhm2/a;", "checkIfEmailValidUC", "Lhm2/j;", "getPreviewContactPrivacyPolicyUrlUC", "globalSnackBarManager", "Lhm2/k;", "openContactPrivacyPolicyUC", "Lmx/c;", "labelProvider", "Ljm2/c;", "mapper", "Lhm2/h;", "getNaskPrivacyPolicyUrlUC", "Lhm2/i;", "getNaskReportIllegalContentUrlUC", "Lkm2/a;", "contract", "<init>", "(Lyy/a;Lhm2/a;Lhm2/j;Li70/e;Lhm2/k;Lmx/c;Ljm2/c;Lhm2/h;Lhm2/i;Lkm2/a;)V", "Lkm2/a$a;", "C9", "(Lim2/b;)Lkm2/a$a;", "state", "Lim2/c$a;", "v9", "(Lim2/b;)Lim2/c$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "c", "Lhm2/k;", "d", "Lmx/c;", "e", "Ljm2/c;", "f", "Lhm2/h;", "g", "Lhm2/i;", "h", "Lkm2/a;", "j", "Lim2/b;", "initialState", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lim2/a$e;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, im2.a> implements im2.c, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ i70.e f93383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hm2.k openContactPrivacyPolicyUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final jm2.c mapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hm2.h getNaskPrivacyPolicyUrlUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final hm2.i getNaskReportIllegalContentUrlUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final km2.a contract;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, im2.a> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<im2.a.e> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<im2.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<im2.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f93394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f93395b;

        /* JADX INFO: renamed from: im2.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2205a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f93396a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f93397b;

            /* JADX INFO: renamed from: im2.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2206a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f93398d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f93399e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f93400f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f93402h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f93403j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f93404k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f93405l;

                public C2206a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f93398d = obj;
                    this.f93399e |= PKIFailureInfo.systemUnavail;
                    return C2205a.this.F(null, this);
                }
            }

            public C2205a(mu.h hVar, p pVar) {
                this.f93396a = hVar;
                this.f93397b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2206a c2206a;
                if (eVar instanceof C2206a) {
                    c2206a = (C2206a) eVar;
                    int i15 = c2206a.f93399e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2206a.f93399e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2206a = new C2206a(eVar);
                    }
                } else {
                    c2206a = new C2206a(eVar);
                }
                Object obj2 = c2206a.f93398d;
                Object objE = uq.b.e();
                int i16 = c2206a.f93399e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f93396a;
                    im2.c.Data dataV9 = this.f93397b.v9((State) obj);
                    c2206a.f93400f = vq.j.a(obj);
                    c2206a.f93402h = vq.j.a(c2206a);
                    c2206a.f93403j = vq.j.a(obj);
                    c2206a.f93404k = vq.j.a(hVar);
                    c2206a.f93405l = 0;
                    c2206a.f93399e = 1;
                    if (hVar.F(dataV9, c2206a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, p pVar) {
            this.f93394a = gVar;
            this.f93395b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super im2.c.Data> hVar, tq.e eVar) {
            Object objA = this.f93394a.a(new C2205a(hVar, this.f93395b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lim2/a$e;", "action", "Lim2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lim2/a$e;Lim2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<im2.a.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f93406e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f93407f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            im2.a.e eVar = (im2.a.e) this.f93407f;
            Object objE = uq.b.e();
            int i15 = this.f93406e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                this.f93407f = vq.j.a(eVar);
                this.f93406e = 1;
                if (pVar.F(eVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(im2.a.e eVar, State state, tq.e<? super i0> eVar2) {
            b bVar = p.this.new b(eVar2);
            bVar.f93407f = eVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lim2/a$c;", "action", "Lk10/c0;", "Lim2/b;", "state", "Lk10/l;", "<anonymous>", "(Lim2/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<im2.a.ChangeSwitch, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f93409e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f93410f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f93411g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state, State state2) {
            return state;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            im2.a.ChangeSwitch changeSwitch = (im2.a.ChangeSwitch) this.f93410f;
            c0 c0Var = (c0) this.f93411g;
            uq.b.e();
            if (this.f93409e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            Object objA = c0Var.a();
            p pVar = p.this;
            final State stateB = State.b((State) objA, null, changeSwitch.getChecked(), false, null, null, null, 61, null);
            pVar.contract.k1(pVar.C9(stateB));
            return c0Var.b(new er.l() { // from class: im2.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.c.O(stateB, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(im2.a.ChangeSwitch changeSwitch, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = p.this.new c(eVar);
            cVar.f93410f = changeSwitch;
            cVar.f93411g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lim2/a$b;", "action", "Lk10/c0;", "Lim2/b;", "state", "Lk10/l;", "<anonymous>", "(Lim2/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<im2.a.ChangeEmail, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f93413e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f93414f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f93415g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state, State state2) {
            return state;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            im2.a.ChangeEmail changeEmail = (im2.a.ChangeEmail) this.f93414f;
            c0 c0Var = (c0) this.f93415g;
            uq.b.e();
            if (this.f93413e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            Object objA = c0Var.a();
            p pVar = p.this;
            final State stateB = State.b((State) objA, null, false, false, changeEmail.getEmail(), hz.b.C2039b.f86846c, null, 39, null);
            pVar.contract.k1(pVar.C9(stateB));
            return c0Var.b(new er.l() { // from class: im2.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.d.O(stateB, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(im2.a.ChangeEmail changeEmail, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = p.this.new d(eVar);
            dVar.f93414f = changeEmail;
            dVar.f93415g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lim2/a$a;", "action", "Lk10/c0;", "Lim2/b;", "state", "Lk10/l;", "<anonymous>", "(Lim2/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<im2.a.ChangeConsent, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f93417e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f93418f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f93419g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state, State state2) {
            return state;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            im2.a.ChangeConsent changeConsent = (im2.a.ChangeConsent) this.f93418f;
            c0 c0Var = (c0) this.f93419g;
            uq.b.e();
            if (this.f93417e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            Object objA = c0Var.a();
            p pVar = p.this;
            final State stateB = State.b((State) objA, null, false, changeConsent.getChecked(), null, null, hz.b.d.f86848c, 27, null);
            pVar.contract.k1(pVar.C9(stateB));
            return c0Var.b(new er.l() { // from class: im2.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.e.O(stateB, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(im2.a.ChangeConsent changeConsent, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = p.this.new e(eVar);
            eVar2.f93418f = changeConsent;
            eVar2.f93419g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lim2/a$f;", "<unused var>", "Lim2/b;", "state", "Loq/i0;", "<anonymous>", "(Lim2/a$f;Lim2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<im2.a.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f93421e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f93422f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f93423g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f93424h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f93425j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ hm2.j f93427l;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f93428a;

            static {
                int[] iArr = new int[km2.b.values().length];
                try {
                    iArr[km2.b.MALICIOUS_WEBSITE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[km2.b.FRAUD_WIZARD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[km2.b.OTHER_WIZARD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[km2.b.ILLEGAL_CONTENT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f93428a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(hm2.j jVar, tq.e<? super f> eVar) {
            super(3, eVar);
            this.f93427l = jVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00dd, code lost:
        
            if (r4.F(r13, r12) == r1) goto L27;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 227
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: im2.p.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(im2.a.f fVar, State state, tq.e<? super i0> eVar) {
            f fVar2 = p.this.new f(this.f93427l, eVar);
            fVar2.f93425j = state;
            return fVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lim2/a$d;", "<unused var>", "Lim2/b;", "Loq/i0;", "<anonymous>", "(Lim2/a$d;Lim2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<im2.a.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f93429e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f93429e;
            if (i15 == 0) {
                oq.u.b(obj);
                hm2.k kVar = p.this.openContactPrivacyPolicyUC;
                hm2.k.Params params = new hm2.k.Params(p.this.getNaskPrivacyPolicyUrlUC.b(gz.b.a.C1792a.f78542a));
                this.f93429e = 1;
                obj = kVar.h(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            p pVar = p.this;
            if (iVar instanceof dx.i.Left) {
                dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                i0 i0Var = null;
                dx.b.Business business = bVar instanceof dx.b.Business ? (dx.b.Business) bVar : null;
                if (business != null) {
                    pVar.y(new p50.a.DefaultWithIcon(business.getMessage(), false, null, null, 14, null));
                    i0Var = i0.f148189a;
                }
                new dx.i.Left(i0Var);
            } else if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(im2.a.d dVar, State state, tq.e<? super i0> eVar) {
            return p.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lim2/a$g;", "<unused var>", "Lk10/c0;", "Lim2/b;", "state", "Lk10/l;", "<anonymous>", "(Lim2/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<im2.a.g, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f93431e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f93432f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f93433g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f93434h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f93435j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f93436k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f93437l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ hm2.a f93438m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ p f93439n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(hm2.a aVar, p pVar, tq.e<? super h> eVar) {
            super(3, eVar);
            this.f93438m = aVar;
            this.f93439n = pVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state, State state2) {
            return state;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objD;
            hz.b.Companion companion;
            p pVar;
            State state;
            int i15;
            hz.b invalid;
            hz.b bVar;
            hz.b bVar2;
            State state2;
            p pVar2;
            hz.b bVar3;
            State state3;
            p pVar3;
            c0 c0Var = (c0) this.f93437l;
            Object objE = uq.b.e();
            int i16 = this.f93436k;
            if (i16 == 0) {
                oq.u.b(obj);
                Object objA = c0Var.a();
                hm2.a aVar = this.f93438m;
                p pVar4 = this.f93439n;
                State state4 = (State) objA;
                hz.b.Companion companion2 = hz.b.INSTANCE;
                String email = state4.getEmail();
                if (email == null) {
                    email = "";
                }
                hm2.a.Params params = new hm2.a.Params(email);
                this.f93437l = c0Var;
                this.f93431e = pVar4;
                this.f93432f = state4;
                this.f93433g = companion2;
                this.f93435j = 0;
                this.f93436k = 1;
                objD = aVar.d(params, this);
                if (objD != objE) {
                    companion = companion2;
                    pVar = pVar4;
                    state = state4;
                    i15 = 0;
                }
                return objE;
            }
            if (i16 == 1) {
                i15 = this.f93435j;
                hz.b.Companion companion3 = (hz.b.Companion) this.f93433g;
                state = (State) this.f93432f;
                pVar = (p) this.f93431e;
                oq.u.b(obj);
                companion = companion3;
                objD = obj;
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar2 = (hz.b) this.f93434h;
                bVar = (hz.b) this.f93433g;
                state2 = (State) this.f93432f;
                pVar2 = (p) this.f93431e;
                oq.u.b(obj);
            }
            bVar3 = bVar2;
            state3 = state2;
            pVar3 = pVar2;
            invalid = bVar;
            if (state3.getIsAnonymous()) {
                invalid = state3.getConsentValidationState();
            }
            final State stateB = State.b(state3, null, false, false, null, bVar3, invalid, 15, null);
            pVar3.contract.k1(pVar3.C9(stateB));
            return c0Var.d(new er.l() { // from class: im2.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.h.O(stateB, (State) obj2);
                }
            });
            hz.b bVarA = companion.a((hz.g) objD);
            boolean consentChecked = state.getConsentChecked();
            if (consentChecked) {
                invalid = hz.b.d.f86848c;
            } else {
                if (consentChecked) {
                    throw new oq.p();
                }
                invalid = new hz.b.Invalid(pVar.mapper.f());
            }
            if (state.getIsAnonymous() || (state.getConsentChecked() && bVarA.a())) {
                im2.a.e.d dVar = im2.a.e.d.f93345a;
                this.f93437l = c0Var;
                this.f93431e = pVar;
                this.f93432f = state;
                this.f93433g = invalid;
                this.f93434h = bVarA;
                this.f93435j = i15;
                this.f93436k = 2;
                if (pVar.F(dVar, this) != objE) {
                    bVar = invalid;
                    bVar2 = bVarA;
                    state2 = state;
                    pVar2 = pVar;
                    bVar3 = bVar2;
                    state3 = state2;
                    pVar3 = pVar2;
                    invalid = bVar;
                }
                return objE;
            }
            bVar3 = bVarA;
            state3 = state;
            pVar3 = pVar;
            if (state3.getIsAnonymous()) {
                invalid = state3.getConsentValidationState();
            }
            final State stateB2 = State.b(state3, null, false, false, null, bVar3, invalid, 15, null);
            pVar3.contract.k1(pVar3.C9(stateB2));
            return c0Var.d(new er.l() { // from class: im2.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.h.O(stateB2, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(im2.a.g gVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = new h(this.f93438m, this.f93439n, eVar);
            hVar.f93437l = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, final hm2.a aVar2, final hm2.j jVar, i70.e eVar, hm2.k kVar, mx.c cVar, jm2.c cVar2, hm2.h hVar, hm2.i iVar, km2.a aVar3) {
        this.f93383b = eVar;
        this.openContactPrivacyPolicyUC = kVar;
        this.labelProvider = cVar;
        this.mapper = cVar2;
        this.getNaskPrivacyPolicyUrlUC = hVar;
        this.getNaskReportIllegalContentUrlUC = iVar;
        this.contract = aVar3;
        km2.a.ContactData contactDataP3 = aVar3.p3();
        State state = new State(contactDataP3.getProcessType(), contactDataP3.getIsAnonymous(), contactDataP3.getConsent(), contactDataP3.getEmail(), contactDataP3.getEmailValidation(), contactDataP3.getConsentValidation());
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: im2.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.A9(this.f93380a, jVar, aVar2, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), v9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(final p pVar, final hm2.j jVar, final hm2.a aVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: im2.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.B9(this.f93377a, jVar, aVar, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(p pVar, hm2.j jVar, hm2.a aVar, z zVar) {
        b bVar = pVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(im2.a.e.class), oVar, bVar);
        zVar.v(q0.c(im2.a.ChangeSwitch.class), oVar, pVar.new c(null));
        zVar.v(q0.c(im2.a.ChangeEmail.class), oVar, pVar.new d(null));
        zVar.v(q0.c(im2.a.ChangeConsent.class), oVar, pVar.new e(null));
        zVar.x(q0.c(im2.a.f.class), oVar, pVar.new f(jVar, null));
        zVar.x(q0.c(im2.a.d.class), oVar, pVar.new g(null));
        zVar.v(q0.c(im2.a.g.class), oVar, new h(aVar, pVar, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final km2.a.ContactData C9(State state) {
        return new km2.a.ContactData(state.getProcessType(), state.getIsAnonymous(), state.getEmail(), state.getEmailValidationState(), state.getConsentChecked(), state.getConsentValidationState());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final im2.c.Data v9(State state) {
        return this.mapper.b(new jm2.c.Params(state, b9(im2.a.g.f93347a), b9(im2.a.e.C2204a.f93342a), b9(im2.a.e.b.f93343a), new er.l() { // from class: im2.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.w9(this.f93374a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: im2.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.x9(this.f93375a, (String) obj);
            }
        }, new er.l() { // from class: im2.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.y9(this.f93376a, ((Boolean) obj).booleanValue());
            }
        }, b9(im2.a.f.f93346a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(p pVar, boolean z15) {
        pVar.d9(new im2.a.ChangeSwitch(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(p pVar, String str) {
        pVar.d9(new im2.a.ChangeEmail(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(p pVar, boolean z15) {
        pVar.d9(new im2.a.ChangeConsent(z15));
        return i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.f93383b.B0();
    }

    @Override // zx.b
    public xw.b<im2.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, im2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<im2.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(im2.a.e eVar, tq.e<? super i0> eVar2) {
        return super.F(eVar, eVar2);
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.f93383b.y(snackBarData);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(km2.a aVar) {
        super.P5(aVar);
    }
}
