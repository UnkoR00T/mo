package q63;

import fr.q0;
import jb4.PayloadErrorData;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B[\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0002H\u0002¢\u0006\u0004\b%\u0010&J\u0013\u0010)\u001a\u00020(*\u00020'H\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R,\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003088\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b=\u0010>\u001a\u0004\b;\u0010<R \u0010F\u001a\b\u0012\u0004\u0012\u00020A0@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER&\u0010#\u001a\b\u0012\u0004\u0012\u00020H0G8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bI\u0010J\u0012\u0004\bM\u0010>\u001a\u0004\bK\u0010L¨\u0006N"}, d2 = {"Lq63/q;", "Ll00/g;", "Lq63/c;", "Lq63/a;", "Lq63/d;", "", "Lr63/d;", "addEmailScreenMapper", "Lib4/c;", "genericDomainErrorMapper", "La14/w;", "openUrlIntentUseCase", "Li70/e;", "globalSnackBarManager", "Lj14/a;", "checkEmailCorrectUC", "Lfj0/c;", "createEmailContactDetailUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Ld74/b;", "getWKTokenForMIDUC", "Lyy/a;", "stateMachineFactory", "Lq63/b;", "setupData", "<init>", "(Lr63/d;Lib4/c;La14/w;Li70/e;Lj14/a;Lfj0/c;Lac4/a;Ld74/b;Lyy/a;Lq63/b;)V", "", "url", "Ldx/i;", "Ldx/b$c;", "Loq/i0;", "y9", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "state", "Lq63/d$a$b;", "t9", "(Lq63/c;)Lq63/d$a$b;", "Ldx/b;", "", "s9", "(Ldx/b;)Z", "b", "Lr63/d;", "c", "Lib4/c;", "d", "La14/w;", "e", "Li70/e;", "f", "Lj14/a;", "g", "Lq63/c;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lxw/b;", "Lq63/a$c;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Lq63/d$a;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<State, q63.a> implements q63.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r63.d addEmailScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final j14.a checkEmailCorrectUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, q63.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<q63.a.c> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<q63.d.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f165110d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f165111e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f165113g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f165111e = obj;
            this.f165113g |= PKIFailureInfo.systemUnavail;
            return q.this.y9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<q63.d.a.Initialized> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f165114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f165115b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f165116a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f165117b;

            /* JADX INFO: renamed from: q63.q$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4113a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f165118d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f165119e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f165120f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f165122h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f165123j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f165124k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f165125l;

                public C4113a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f165118d = obj;
                    this.f165119e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, q qVar) {
                this.f165116a = hVar;
                this.f165117b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4113a c4113a;
                if (eVar instanceof C4113a) {
                    c4113a = (C4113a) eVar;
                    int i15 = c4113a.f165119e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4113a.f165119e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4113a = new C4113a(eVar);
                    }
                } else {
                    c4113a = new C4113a(eVar);
                }
                Object obj2 = c4113a.f165118d;
                Object objE = uq.b.e();
                int i16 = c4113a.f165119e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f165116a;
                    q63.d.a.Initialized initializedT9 = this.f165117b.t9((State) obj);
                    c4113a.f165120f = vq.j.a(obj);
                    c4113a.f165122h = vq.j.a(c4113a);
                    c4113a.f165123j = vq.j.a(obj);
                    c4113a.f165124k = vq.j.a(hVar);
                    c4113a.f165125l = 0;
                    c4113a.f165119e = 1;
                    if (hVar.F(initializedT9, c4113a) == objE) {
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

        public b(mu.g gVar, q qVar) {
            this.f165114a = gVar;
            this.f165115b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super q63.d.a.Initialized> hVar, tq.e eVar) {
            Object objA = this.f165114a.a(new a(hVar, this.f165115b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lq63/c;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165126e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165127f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, iy.b0.INSTANCE.a(), null, false, false, false, false, null, 253, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f165127f;
            uq.b.e();
            if (this.f165126e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: q63.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.c.O((State) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = new c(eVar);
            cVar.f165127f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lq63/a$b;", "action", "Lk10/c0;", "Lq63/c;", "state", "Lk10/l;", "<anonymous>", "(Lq63/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<q63.a.EmailChange, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165129f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f165130g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(q63.a.EmailChange emailChange, State state) {
            return State.b(state, hz.b.d.f86848c, emailChange.getEmail(), null, false, false, false, false, null, 252, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final q63.a.EmailChange emailChange = (q63.a.EmailChange) this.f165129f;
            k10.c0 c0Var = (k10.c0) this.f165130g;
            uq.b.e();
            if (this.f165128e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: q63.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.d.O(emailChange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(q63.a.EmailChange emailChange, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f165129f = emailChange;
            dVar.f165130g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lq63/a$a;", "action", "Lk10/c0;", "Lq63/c;", "state", "Lk10/l;", "<anonymous>", "(Lq63/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<q63.a.CheckGdprCheckbox, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165131e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165132f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f165133g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(q63.a.CheckGdprCheckbox checkGdprCheckbox, State state) {
            return State.b(state, null, null, null, checkGdprCheckbox.getGdprChecked(), false, false, false, null, 183, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final q63.a.CheckGdprCheckbox checkGdprCheckbox = (q63.a.CheckGdprCheckbox) this.f165132f;
            k10.c0 c0Var = (k10.c0) this.f165133g;
            uq.b.e();
            if (this.f165131e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: q63.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.e.O(checkGdprCheckbox, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(q63.a.CheckGdprCheckbox checkGdprCheckbox, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f165132f = checkGdprCheckbox;
            eVar2.f165133g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lq63/a$f;", "action", "Lk10/c0;", "Lq63/c;", "state", "Lk10/l;", "<anonymous>", "(Lq63/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<q63.a.f, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165134e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165135f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, null, false, false, false, false, null, CertificateBody.profileType, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f165135f;
            uq.b.e();
            if (this.f165134e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: q63.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.f.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(q63.a.f fVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar2 = new f(eVar);
            fVar2.f165135f = c0Var;
            return fVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lq63/a$e;", "action", "Lk10/c0;", "Lq63/c;", "state", "Lk10/l;", "<anonymous>", "(Lq63/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<q63.a.OnNext, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f165136e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f165137f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f165138g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f165139h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f165140j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ ac4.a f165142l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ d74.b f165143m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ fj0.c f165144n;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lq63/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f165145e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f165146f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f165147g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f165148h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f165149j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ d74.b f165150k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ k10.c0<State> f165151l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ fj0.c f165152m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ q63.a.OnNext f165153n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ q f165154p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d74.b bVar, k10.c0<State> c0Var, fj0.c cVar, q63.a.OnNext onNext, q qVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f165150k = bVar;
                this.f165151l = c0Var;
                this.f165152m = cVar;
                this.f165153n = onNext;
                this.f165154p = qVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 X(q qVar, q63.a.OnNext onNext, ib4.c.b bVar) {
                if ((bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    qVar.d9(new q63.a.OnNext(onNext.getEmail()));
                }
                return i0.f148189a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final State Y(State state) {
                return State.b(state, null, null, null, false, false, false, false, null, 223, null);
            }

            /* JADX WARN: Code duplicated, block: B:30:0x00b2  */
            /* JADX WARN: Code duplicated, block: B:32:0x00c2  */
            /* JADX WARN: Code duplicated, block: B:35:0x00e1  */
            /* JADX WARN: Code duplicated, block: B:38:0x011a  */
            /* JADX WARN: Code duplicated, block: B:40:0x011e  */
            /* JADX WARN: Code duplicated, block: B:45:0x0159  */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00a4, code lost:
            
                if (r15 == r0) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00de, code lost:
            
                if (r1.F(r2, r14) == r0) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x0117, code lost:
            
                if (r2.F(r4, r14) == r0) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x014a, code lost:
            
                if (r1.F(r4, r14) == r0) goto L42;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r15) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 357
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: q63.q.g.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f165150k, this.f165151l, this.f165152m, this.f165153n, this.f165154p, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<State>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ac4.a aVar, d74.b bVar, fj0.c cVar, tq.e<? super g> eVar) {
            super(3, eVar);
            this.f165142l = aVar;
            this.f165143m = bVar;
            this.f165144n = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State V(k10.c0 c0Var, boolean z15, hz.b bVar, State state) {
            return State.b(state, bVar, null, null, ((State) c0Var.a()).getIsGdprCheckboxChecked(), false, false, !((State) c0Var.a()).getIsGdprCheckboxChecked(), !z15 ? c0.EMAIL : c0.STATEMENT, 54, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(State state) {
            return State.b(state, null, null, null, false, false, true, false, null, 223, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00c3, code lost:
        
            if (r0 == r11) goto L26;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 211
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: q63.q.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(q63.a.OnNext onNext, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = q.this.new g(this.f165142l, this.f165143m, this.f165144n, eVar);
            gVar.f165139h = onNext;
            gVar.f165140j = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq63/a$d;", "<unused var>", "Lq63/c;", "Loq/i0;", "<anonymous>", "(Lq63/a$d;Lq63/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<q63.a.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165155e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f165155e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<q63.a.c> bVarY1 = q.this.Y1();
                q63.a.c.C4109a c4109a = q63.a.c.C4109a.f165030a;
                this.f165155e = 1;
                if (bVarY1.F(c4109a, this) == objE) {
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
        public final Object w(q63.a.d dVar, State state, tq.e<? super i0> eVar) {
            return q.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lq63/a$g;", "action", "Lq63/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lq63/a$g;Lq63/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<q63.a.OpenGdprRegulationInWeb, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165157e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165158f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            q63.a.OpenGdprRegulationInWeb openGdprRegulationInWeb = (q63.a.OpenGdprRegulationInWeb) this.f165158f;
            Object objE = uq.b.e();
            int i15 = this.f165157e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                String url = openGdprRegulationInWeb.getUrl();
                this.f165158f = vq.j.a(openGdprRegulationInWeb);
                this.f165157e = 1;
                if (qVar.y9(url, this) == objE) {
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
        public final Object w(q63.a.OpenGdprRegulationInWeb openGdprRegulationInWeb, State state, tq.e<? super i0> eVar) {
            i iVar = q.this.new i(eVar);
            iVar.f165158f = openGdprRegulationInWeb;
            return iVar.J(i0.f148189a);
        }
    }

    public q(r63.d dVar, ib4.c cVar, a14.w wVar, i70.e eVar, j14.a aVar, final fj0.c cVar2, final ac4.a aVar2, final d74.b bVar, yy.a aVar3, SetupData setupData) {
        this.addEmailScreenMapper = dVar;
        this.genericDomainErrorMapper = cVar;
        this.openUrlIntentUseCase = wVar;
        this.globalSnackBarManager = eVar;
        this.checkEmailCorrectUC = aVar;
        State state = new State(null, null, setupData.getPreviousEmail(), false, setupData.getIsGdprNeeded(), false, false, null, 235, null);
        this.initialState = state;
        this.stateMachine = aVar3.a(state, new er.l() { // from class: q63.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.A9(this.f165097a, aVar2, bVar, cVar2, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), t9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(final q qVar, final ac4.a aVar, final d74.b bVar, final fj0.c cVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: q63.k
            @Override // er.l
            public final Object b(Object obj) {
                return q.B9(this.f165089a, aVar, bVar, cVar, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(q qVar, ac4.a aVar, d74.b bVar, fj0.c cVar, k10.z zVar) {
        zVar.A(new c(null));
        d dVar = new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(q63.a.EmailChange.class), oVar, dVar);
        zVar.v(q0.c(q63.a.CheckGdprCheckbox.class), oVar, new e(null));
        zVar.v(q0.c(q63.a.f.class), oVar, new f(null));
        zVar.v(q0.c(q63.a.OnNext.class), oVar, qVar.new g(aVar, bVar, cVar, null));
        zVar.x(q0.c(q63.a.d.class), oVar, qVar.new h(null));
        zVar.x(q0.c(q63.a.OpenGdprRegulationInWeb.class), oVar, qVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean s9(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        Object objB = http != null ? http.b() : null;
        PayloadErrorData payloadErrorData = objB instanceof PayloadErrorData ? (PayloadErrorData) objB : null;
        return fr.t.c(payloadErrorData != null ? payloadErrorData.getCode() : null, "EDITION_ATTEMPTS_LIMIT_EXCEED");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q63.d.a.Initialized t9(State state) {
        return this.addEmailScreenMapper.b(new r63.d.Params(state, b9(q63.a.d.f165035a), new er.l() { // from class: q63.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.u9(this.f165093a, ((Boolean) obj).booleanValue());
            }
        }, b9(q63.a.f.f165038a), new er.l() { // from class: q63.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.v9(this.f165094a, (iy.b0) obj);
            }
        }, new er.l() { // from class: q63.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.w9(this.f165095a, (iy.b0) obj);
            }
        }, new er.l() { // from class: q63.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.x9(this.f165096a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(q qVar, boolean z15) {
        qVar.d9(new q63.a.CheckGdprCheckbox(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(q qVar, iy.b0 b0Var) {
        qVar.d9(new q63.a.OnNext(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(q qVar, iy.b0 b0Var) {
        qVar.d9(new q63.a.EmailChange(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(q qVar, String str) {
        qVar.d9(new q63.a.OpenGdprRegulationInWeb(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y9(String str, tq.e<? super dx.i<dx.b.Business, i0>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f165113g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f165113g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f165111e;
        Object objE = uq.b.e();
        int i16 = aVar.f165113g;
        if (i16 == 0) {
            oq.u.b(objC);
            a14.w wVar = this.openUrlIntentUseCase;
            a14.w.Params params = new a14.w.Params(str, false, 2, null);
            aVar.f165110d = vq.j.a(str);
            aVar.f165113g = 1;
            objC = wVar.c(params, aVar);
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
        if (iVar instanceof dx.i.Left) {
            this.globalSnackBarManager.y(new p50.a.Default(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, 6, null));
        }
        return iVar;
    }

    @Override // zx.b
    public xw.b<q63.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, q63.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<q63.d.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
