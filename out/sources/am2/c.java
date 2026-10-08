package am2;

import androidx.p016lifecycle.u0;
import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006BA\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001bH\u0096\u0001¢\u0006\u0004\b \u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00106\u001a\b\u0012\u0004\u0012\u000201008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u0010<\u001a\u0002078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R&\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030=8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006H"}, d2 = {"Lam2/c;", "Ll00/g;", "Lam2/l;", "Lam2/k;", "Lam2/m;", "", "Lnx/b;", "Lyy/a;", "stateMachineFactory", "Lam2/n;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Llt0/b;", "getSecurityNotificationsEnabledUseCase", "Lho2/a;", "getSystemNotificationsStatusUseCase", "Loz/q;", "ownerViewLifecycleManager", "Lzl2/a;", "isSecurityKnowledgeBaseFeatureFlagActiveUC", "<init>", "(Lyy/a;Lam2/n;Lac4/a;Llt0/b;Lho2/a;Loz/q;Lzl2/a;)V", "state", "Lam2/m$a;", "p9", "(Lam2/l;)Lam2/m$a;", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "b", "Lam2/n;", "c", "Lac4/a;", "d", "Llt0/b;", "e", "Lho2/a;", "f", "Loz/q;", "g", "Lzl2/a;", "h", "Lam2/l;", "initialState", "Lxw/b;", "Lam2/k$e;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Loz/j;", "k", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c extends l00.g<State, k> implements m, zx.d, nx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final lt0.b getSecurityNotificationsEnabledUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ho2.a getSystemNotificationsStatusUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final zl2.a isSecurityKnowledgeBaseFeatureFlagActiveUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<k.e> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final t<State, k> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<m.Data> state;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7821e;

        /* JADX INFO: renamed from: am2.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnx/a;", "viewLifecycle", "Loq/i0;", "<anonymous>", "(Lnx/a;)V"}, k = 3, mv = {2, 2, 0})
        static final class C0172a extends vq.k implements er.p<nx.a, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f7823e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f7824f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c f7825g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0172a(c cVar, tq.e<? super C0172a> eVar) {
                super(2, eVar);
                this.f7825g = cVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                nx.a aVar = (nx.a) this.f7824f;
                uq.b.e();
                if (this.f7823e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                if (aVar == nx.a.RESUMED) {
                    this.f7825g.d9(k.a.f7866a);
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(nx.a aVar, tq.e<? super i0> eVar) {
                return ((C0172a) v(aVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                C0172a c0172a = new C0172a(this.f7825g, eVar);
                c0172a.f7824f = obj;
                return c0172a;
            }
        }

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f7821e;
            if (i15 == 0) {
                u.b(obj);
                mu.g gVarS = mu.i.S(c.this.x8(), new C0172a(c.this, null));
                this.f7821e = 1;
                if (mu.i.i(gVarS, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return c.this.new a(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<m.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f7826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f7827b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f7828a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f7829b;

            /* JADX INFO: renamed from: am2.c$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0173a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f7830d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f7831e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f7832f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f7834h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f7835j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f7836k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f7837l;

                public C0173a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f7830d = obj;
                    this.f7831e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, c cVar) {
                this.f7828a = hVar;
                this.f7829b = cVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0173a c0173a;
                if (eVar instanceof C0173a) {
                    c0173a = (C0173a) eVar;
                    int i15 = c0173a.f7831e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0173a.f7831e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0173a = new C0173a(eVar);
                    }
                } else {
                    c0173a = new C0173a(eVar);
                }
                Object obj2 = c0173a.f7830d;
                Object objE = uq.b.e();
                int i16 = c0173a.f7831e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f7828a;
                    m.Data dataP9 = this.f7829b.p9((State) obj);
                    c0173a.f7832f = vq.j.a(obj);
                    c0173a.f7834h = vq.j.a(c0173a);
                    c0173a.f7835j = vq.j.a(obj);
                    c0173a.f7836k = vq.j.a(hVar);
                    c0173a.f7837l = 0;
                    c0173a.f7831e = 1;
                    if (hVar.F(dataP9, c0173a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public b(mu.g gVar, c cVar) {
            this.f7826a = gVar;
            this.f7827b = cVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super m.Data> hVar, tq.e eVar) {
            Object objA = this.f7826a.a(new a(hVar, this.f7827b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    /* JADX INFO: renamed from: am2.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lam2/l;", "it", "Loq/i0;", "<anonymous>", "(Lam2/l;)V"}, k = 3, mv = {2, 2, 0})
    static final class C0174c extends vq.k implements er.p<State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7838e;

        C0174c(tq.e<? super C0174c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f7838e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            c.this.d9(k.b.f7867a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(State state, tq.e<? super i0> eVar) {
            return ((C0174c) v(state, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return c.this.new C0174c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lam2/k$b;", "<unused var>", "Lk10/c0;", "Lam2/l;", "state", "Lk10/l;", "<anonymous>", "(Lam2/k$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<k.b, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f7840e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f7841f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f7842g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lam2/l;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends State>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f7844e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ c f7845f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<State> f7846g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f7847h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, c0<State> c0Var, boolean z15, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f7845f = cVar;
                this.f7846g = c0Var;
                this.f7847h = z15;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final State X(boolean z15, State state) {
                return State.b(state, false, z15, false, 4, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final State Y(boolean z15, boolean z16, State state) {
                return State.b(state, !z15, z16, false, 4, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f7844e;
                if (i15 == 0) {
                    u.b(obj);
                    lt0.b bVar = this.f7845f.getSecurityNotificationsEnabledUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f7844e = 1;
                    obj = bVar.c(c1792a, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                c0<State> c0Var = this.f7846g;
                final boolean z15 = this.f7847h;
                if (iVar instanceof dx.i.Left) {
                    return c0Var.b(new er.l() { // from class: am2.e
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return c.d.a.X(z15, (State) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final boolean zBooleanValue = ((Boolean) ((dx.i.Right) iVar).b()).booleanValue();
                return c0Var.b(new er.l() { // from class: am2.f
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c.d.a.Y(zBooleanValue, z15, (State) obj2);
                    }
                });
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f7845f, this.f7846g, this.f7847h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<State>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(boolean z15, State state) {
            return State.b(state, true, z15, false, 4, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
        
            if (r12 == r1) goto L18;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = r11.f7842g
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r11.f7841f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L24
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r12)
                goto L77
            L16:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1e:
                boolean r2 = r11.f7840e
                oq.u.b(r12)
                goto L4d
            L24:
                oq.u.b(r12)
                am2.c r12 = am2.c.this
                zl2.a r12 = am2.c.m9(r12)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                java.lang.Boolean r12 = r12.b(r2)
                boolean r12 = r12.booleanValue()
                am2.c r5 = am2.c.this
                ho2.a r5 = am2.c.l9(r5)
                r11.f7842g = r0
                r11.f7840e = r12
                r11.f7841f = r4
                java.lang.Object r2 = r5.c(r2, r11)
                if (r2 != r1) goto L4a
                goto L76
            L4a:
                r10 = r2
                r2 = r12
                r12 = r10
            L4d:
                ho2.a$a r12 = (ho2.a.InterfaceC2001a) r12
                boolean r12 = r12.isEnabled()
                if (r12 == 0) goto L7a
                am2.c r12 = am2.c.this
                ac4.a r4 = am2.c.j9(r12)
                am2.c$d$a r6 = new am2.c$d$a
                am2.c r12 = am2.c.this
                r5 = 0
                r6.<init>(r12, r0, r2, r5)
                java.lang.Object r12 = vq.j.a(r0)
                r11.f7842g = r12
                r11.f7840e = r2
                r11.f7841f = r3
                r8 = 1
                r9 = 0
                r7 = r11
                java.lang.Object r12 = ac4.a.a(r4, r5, r6, r7, r8, r9)
                if (r12 != r1) goto L77
            L76:
                return r1
            L77:
                k10.l r12 = (k10.l) r12
                return r12
            L7a:
                am2.d r12 = new am2.d
                r12.<init>()
                k10.l r12 = r0.b(r12)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: am2.c.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(k.b bVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = c.this.new d(eVar);
            dVar.f7842g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lam2/k$f;", "<unused var>", "Lam2/l;", "Loq/i0;", "<anonymous>", "(Lam2/k$f;Lam2/l;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<k.f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7848e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f7848e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<k.e> bVarY1 = c.this.Y1();
                k.e.b bVar = k.e.b.f7871a;
                this.f7848e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(k.f fVar, State state, tq.e<? super i0> eVar) {
            return c.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lam2/k$d;", "<unused var>", "Lk10/c0;", "Lam2/l;", "state", "Lk10/l;", "<anonymous>", "(Lam2/k$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<k.d, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7850e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f7851f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, false, false, true, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f7851f;
            Object objE = uq.b.e();
            int i15 = this.f7850e;
            if (i15 == 0) {
                u.b(obj);
                c cVar = c.this;
                k.e.d dVar = k.e.d.f7873a;
                this.f7851f = c0Var;
                this.f7850e = 1;
                if (cVar.F(dVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: am2.g
                @Override // er.l
                public final Object b(Object obj2) {
                    return c.f.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(k.d dVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = c.this.new f(eVar);
            fVar.f7851f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lam2/k$g;", "<unused var>", "Lam2/l;", "Loq/i0;", "<anonymous>", "(Lam2/k$g;Lam2/l;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<k.g, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7853e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f7853e;
            if (i15 == 0) {
                u.b(obj);
                c cVar = c.this;
                k.e.c cVar2 = k.e.c.f7872a;
                this.f7853e = 1;
                if (cVar.F(cVar2, this) == objE) {
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
        public final Object w(k.g gVar, State state, tq.e<? super i0> eVar) {
            return c.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lam2/k$a;", "<unused var>", "Lam2/l;", "state", "Loq/i0;", "<anonymous>", "(Lam2/k$a;Lam2/l;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<k.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7855e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f7856f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f7856f;
            Object objE = uq.b.e();
            int i15 = this.f7855e;
            if (i15 == 0) {
                u.b(obj);
                ho2.a aVar = c.this.getSystemNotificationsStatusUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f7856f = state;
                this.f7855e = 1;
                obj = aVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            if (((ho2.a.InterfaceC2001a) obj).isEnabled() || state.getNotificationsSettingsChangePending()) {
                c.this.d9(k.b.f7867a);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(k.a aVar, State state, tq.e<? super i0> eVar) {
            h hVar = c.this.new h(eVar);
            hVar.f7856f = state;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lam2/k$c;", "<unused var>", "Lam2/l;", "Loq/i0;", "<anonymous>", "(Lam2/k$c;Lam2/l;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<k.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7858e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f7858e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<k.e> bVarY1 = c.this.Y1();
                k.e.a aVar = k.e.a.f7870a;
                this.f7858e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(k.c cVar, State state, tq.e<? super i0> eVar) {
            return c.this.new i(eVar).J(i0.f148189a);
        }
    }

    public c(yy.a aVar, n nVar, ac4.a aVar2, lt0.b bVar, ho2.a aVar3, oz.q qVar, zl2.a aVar4) {
        this.mapper = nVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.getSecurityNotificationsEnabledUseCase = bVar;
        this.getSystemNotificationsStatusUseCase = aVar3;
        this.ownerViewLifecycleManager = qVar;
        this.isSecurityKnowledgeBaseFeatureFlagActiveUC = aVar4;
        State state = new State(false, false, false);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.lifecycleConnector = qVar;
        ju.k.d(u0.a(this), null, null, new a(null), 3, null);
        this.stateMachine = aVar.a(state, new er.l() { // from class: am2.a
            @Override // er.l
            public final Object b(Object obj) {
                return c.r9(this.f7808a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), p9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m.Data p9(State state) {
        return this.mapper.b(new n.Params(state, b9(k.d.f7869a), b9(k.c.f7868a), b9(k.f.f7875a), b9(k.g.f7876a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(final c cVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: am2.b
            @Override // er.l
            public final Object b(Object obj) {
                return c.s9(this.f7809a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(c cVar, z zVar) {
        zVar.C(cVar.new C0174c(null));
        d dVar = cVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(k.b.class), oVar, dVar);
        zVar.x(q0.c(k.f.class), oVar, cVar.new e(null));
        zVar.v(q0.c(k.d.class), oVar, cVar.new f(null));
        zVar.x(q0.c(k.g.class), oVar, cVar.new g(null));
        zVar.x(q0.c(k.a.class), oVar, cVar.new h(null));
        zVar.x(q0.c(k.c.class), oVar, cVar.new i(null));
        return i0.f148189a;
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    public xw.b<k.e> Y1() {
        return this.navAction;
    }

    @Override // am2.m
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected t<State, k> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<m.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(k.e eVar, tq.e<? super i0> eVar2) {
        return super.F(eVar, eVar2);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }
}
