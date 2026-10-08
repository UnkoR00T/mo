package so1;

import fr.q0;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B9\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016*\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016*\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0082@¢\u0006\u0004\b\u0019\u0010\u0018J0\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016*\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016*\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R&\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003038\u0014X\u0094\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R \u0010?\u001a\b\u0012\u0004\u0012\u00020:098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020A0@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lso1/z;", "Ll00/g;", "Lso1/c;", "Lso1/a;", "Lso1/d;", "", "Lyy/a;", "stateMachineFactory", "Lso1/j;", "mapper", "Lf93/d;", "verifyKeyJCASafetyUseCase", "Lso1/g0;", "generateKeyUseCase", "Lso1/k0;", "importKeyUseCase", "Lso1/f0;", "exportKeyUseCase", "<init>", "(Lyy/a;Lso1/j;Lf93/d;Lso1/g0;Lso1/k0;Lso1/f0;)V", "Lk10/c0;", "state", "Lk10/l;", "K9", "(Lso1/z;Lk10/c0;Ltq/e;)Ljava/lang/Object;", "C9", "Lso1/a$d;", "action", "G9", "(Lso1/z;Lk10/c0;Lso1/a$d;Ltq/e;)Ljava/lang/Object;", "Lso1/a$a;", "z9", "(Lso1/z;Lk10/c0;Lso1/a$a;Ltq/e;)Ljava/lang/Object;", "Lso1/j$b;", "w9", "(Lso1/c;)Lso1/j$b;", "Loq/i0;", "d", "()V", "b", "Lso1/j;", "c", "Lf93/d;", "Lso1/g0;", "e", "Lso1/k0;", "f", "Lso1/f0;", "g", "Lso1/c;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lso1/a$f;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Lso1/d$a;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<State, so1.a> implements so1.d, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final so1.j mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f93.d verifyKeyJCASafetyUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g0 generateKeyUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k0 importKeyUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final f0 exportKeyUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, so1.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<so1.a.f> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<so1.d.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f183187a;

        static {
            int[] iArr = new int[so1.b.values().length];
            try {
                iArr[so1.b.ANDROID_KEYSTORE_RSA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[so1.b.BC_RSA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[so1.b.ANDROID_KEYSTORE_AES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[so1.b.BC_AES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[so1.b.BC_AES_PASSWORD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f183187a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f183188d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f183189e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f183190f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f183191g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f183193j;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f183191g = obj;
            this.f183193j |= PKIFailureInfo.systemUnavail;
            return z.this.z9(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f183194d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f183195e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f183196f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f183198h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f183196f = obj;
            this.f183198h |= PKIFailureInfo.systemUnavail;
            return z.this.C9(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f183199d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f183200e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f183201f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f183202g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f183203h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f183204j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f183205k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f183207m;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f183205k = obj;
            this.f183207m |= PKIFailureInfo.systemUnavail;
            return z.this.G9(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements mu.g<so1.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f183208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f183209b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f183210a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f183211b;

            /* JADX INFO: renamed from: so1.z$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4714a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f183212d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f183213e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f183214f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f183216h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f183217j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f183218k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f183219l;

                public C4714a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f183212d = obj;
                    this.f183213e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, z zVar) {
                this.f183210a = hVar;
                this.f183211b = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4714a c4714a;
                if (eVar instanceof C4714a) {
                    c4714a = (C4714a) eVar;
                    int i15 = c4714a.f183213e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4714a.f183213e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4714a = new C4714a(eVar);
                    }
                } else {
                    c4714a = new C4714a(eVar);
                }
                Object obj2 = c4714a.f183212d;
                Object objE = uq.b.e();
                int i16 = c4714a.f183213e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f183210a;
                    so1.d.Data dataB = this.f183211b.mapper.b(this.f183211b.w9((State) obj));
                    c4714a.f183214f = vq.j.a(obj);
                    c4714a.f183216h = vq.j.a(c4714a);
                    c4714a.f183217j = vq.j.a(obj);
                    c4714a.f183218k = vq.j.a(hVar);
                    c4714a.f183219l = 0;
                    c4714a.f183213e = 1;
                    if (hVar.F(dataB, c4714a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public e(mu.g gVar, z zVar) {
            this.f183208a = gVar;
            this.f183209b = zVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super so1.d.Data> hVar, tq.e eVar) {
            Object objA = this.f183208a.a(new a(hVar, this.f183209b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lso1/a$f$a;", "action", "Lso1/c;", "state", "Loq/i0;", "<anonymous>", "(Lso1/a$f$a;Lso1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<so1.a.f.C4709a, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f183220e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f183220e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<so1.a.f> bVarY1 = z.this.Y1();
                so1.a.f.C4709a c4709a = so1.a.f.C4709a.f183018a;
                this.f183220e = 1;
                if (bVarY1.F(c4709a, this) == objE) {
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
        public final Object w(so1.a.f.C4709a c4709a, State state, tq.e<? super oq.i0> eVar) {
            return z.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lso1/a$e;", "action", "Lk10/c0;", "Lso1/c;", "state", "Lk10/l;", "<anonymous>", "(Lso1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<so1.a.KeyAliasChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f183222e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f183223f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f183224g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(k10.c0 c0Var, so1.a.KeyAliasChanged keyAliasChanged, State state) {
            return State.b((State) c0Var.a(), keyAliasChanged.getAlias(), null, null, null, null, 30, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final so1.a.KeyAliasChanged keyAliasChanged = (so1.a.KeyAliasChanged) this.f183223f;
            final k10.c0 c0Var = (k10.c0) this.f183224g;
            uq.b.e();
            if (this.f183222e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: so1.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.g.O(c0Var, keyAliasChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(so1.a.KeyAliasChanged keyAliasChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f183223f = keyAliasChanged;
            gVar.f183224g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lso1/a$c;", "action", "Lk10/c0;", "Lso1/c;", "state", "Lk10/l;", "<anonymous>", "(Lso1/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<so1.a.GenerateKeyTypeChanged, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f183225e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f183226f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f183227g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(k10.c0 c0Var, so1.a.GenerateKeyTypeChanged generateKeyTypeChanged, State state) {
            return State.b((State) c0Var.a(), null, generateKeyTypeChanged.getKeyType(), null, null, null, 29, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final so1.a.GenerateKeyTypeChanged generateKeyTypeChanged = (so1.a.GenerateKeyTypeChanged) this.f183226f;
            final k10.c0 c0Var = (k10.c0) this.f183227g;
            uq.b.e();
            if (this.f183225e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: so1.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.h.O(c0Var, generateKeyTypeChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(so1.a.GenerateKeyTypeChanged generateKeyTypeChanged, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = new h(eVar);
            hVar.f183226f = generateKeyTypeChanged;
            hVar.f183227g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lso1/a$g;", "action", "Lk10/c0;", "Lso1/c;", "state", "Lk10/l;", "<anonymous>", "(Lso1/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<so1.a.g, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f183228e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f183229f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f183229f;
            Object objE = uq.b.e();
            int i15 = this.f183228e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            z zVar = z.this;
            this.f183229f = vq.j.a(c0Var);
            this.f183228e = 1;
            Object objK9 = zVar.K9(zVar, c0Var, this);
            return objK9 == objE ? objE : objK9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(so1.a.g gVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            i iVar = z.this.new i(eVar);
            iVar.f183229f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lso1/a$b;", "action", "Lk10/c0;", "Lso1/c;", "state", "Lk10/l;", "<anonymous>", "(Lso1/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<so1.a.b, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f183231e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f183232f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f183232f;
            Object objE = uq.b.e();
            int i15 = this.f183231e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            z zVar = z.this;
            this.f183232f = vq.j.a(c0Var);
            this.f183231e = 1;
            Object objC9 = zVar.C9(zVar, c0Var, this);
            return objC9 == objE ? objE : objC9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(so1.a.b bVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            j jVar = z.this.new j(eVar);
            jVar.f183232f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lso1/a$d;", "action", "Lk10/c0;", "Lso1/c;", "state", "Lk10/l;", "<anonymous>", "(Lso1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<so1.a.ImportKey, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f183234e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f183235f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f183236g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            so1.a.ImportKey importKey = (so1.a.ImportKey) this.f183235f;
            k10.c0 c0Var = (k10.c0) this.f183236g;
            Object objE = uq.b.e();
            int i15 = this.f183234e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            z zVar = z.this;
            this.f183235f = vq.j.a(importKey);
            this.f183236g = vq.j.a(c0Var);
            this.f183234e = 1;
            Object objG9 = zVar.G9(zVar, c0Var, importKey, this);
            return objG9 == objE ? objE : objG9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(so1.a.ImportKey importKey, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            k kVar = z.this.new k(eVar);
            kVar.f183235f = importKey;
            kVar.f183236g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lso1/a$a;", "action", "Lk10/c0;", "Lso1/c;", "state", "Lk10/l;", "<anonymous>", "(Lso1/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<so1.a.ExportKey, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f183238e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f183239f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f183240g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            so1.a.ExportKey exportKey = (so1.a.ExportKey) this.f183239f;
            k10.c0 c0Var = (k10.c0) this.f183240g;
            Object objE = uq.b.e();
            int i15 = this.f183238e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            z zVar = z.this;
            this.f183239f = vq.j.a(exportKey);
            this.f183240g = vq.j.a(c0Var);
            this.f183238e = 1;
            Object objZ9 = zVar.z9(zVar, c0Var, exportKey, this);
            return objZ9 == objE ? objE : objZ9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(so1.a.ExportKey exportKey, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            l lVar = z.this.new l(eVar);
            lVar.f183239f = exportKey;
            lVar.f183240g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class m extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f183242d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f183243e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f183244f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f183246h;

        m(tq.e<? super m> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f183244f = obj;
            this.f183246h |= PKIFailureInfo.systemUnavail;
            return z.this.K9(null, null, this);
        }
    }

    public z(yy.a aVar, so1.j jVar, f93.d dVar, g0 g0Var, k0 k0Var, f0 f0Var) {
        this.mapper = jVar;
        this.verifyKeyJCASafetyUseCase = dVar;
        this.generateKeyUseCase = g0Var;
        this.importKeyUseCase = k0Var;
        this.exportKeyUseCase = f0Var;
        State state = new State("", so1.b.BC_AES, null, null, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: so1.p
            @Override // er.l
            public final Object b(Object obj) {
                return z.I9(this.f183167a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new e(e9().getState(), this), jVar.b(w9(state)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State A9(k10.c0 c0Var, f0.b bVar, State state) {
        return State.b((State) c0Var.a(), null, null, null, ((f0.b.Key) bVar).getKey(), null, 23, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State B9(k10.c0 c0Var, f0.b bVar, State state) {
        return State.b((State) c0Var.a(), null, null, null, null, ((f0.b.KeyPair) bVar).getKeyPair(), 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C9(z zVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) throws Throwable {
        c cVar;
        g0.a androidKeyStoreKeyPairParams;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f183198h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f183198h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objD = cVar.f183196f;
        Object objE = uq.b.e();
        int i16 = cVar.f183198h;
        if (i16 == 0) {
            oq.u.b(objD);
            g0 g0Var = zVar.generateKeyUseCase;
            int i17 = a.f183187a[c0Var.a().getGenerateKeyType().ordinal()];
            if (i17 == 1) {
                androidKeyStoreKeyPairParams = new g0.a.AndroidKeyStoreKeyPairParams(c0Var.a().getKeyAlias());
            } else if (i17 == 2) {
                androidKeyStoreKeyPairParams = new g0.a.c(new byte[0]);
            } else if (i17 == 3) {
                androidKeyStoreKeyPairParams = new g0.a.AndroidKeyStoreSecretKeyParams(c0Var.a().getKeyAlias());
            } else if (i17 == 4) {
                androidKeyStoreKeyPairParams = h0.f183090a;
            } else {
                if (i17 != 5) {
                    throw new oq.p();
                }
                androidKeyStoreKeyPairParams = new j0(new iy.b0("admin123".toCharArray()), iy.a0.INSTANCE.a(), 0, 4, null);
            }
            cVar.f183194d = vq.j.a(zVar);
            cVar.f183195e = c0Var;
            cVar.f183198h = 1;
            objD = g0Var.d(androidKeyStoreKeyPairParams, cVar);
            if (objD == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (k10.c0) cVar.f183195e;
            oq.u.b(objD);
        }
        final g0.b bVar = (g0.b) objD;
        if (bVar instanceof g0.b.KeyPairResult) {
            return c0Var.b(new er.l() { // from class: so1.t
                @Override // er.l
                public final Object b(Object obj) {
                    return z.D9(bVar, (State) obj);
                }
            });
        }
        if (bVar instanceof g0.b.SecretKeyResult) {
            return c0Var.b(new er.l() { // from class: so1.u
                @Override // er.l
                public final Object b(Object obj) {
                    return z.E9(bVar, (State) obj);
                }
            });
        }
        if (!(bVar instanceof g0.b.Error)) {
            throw new oq.p();
        }
        px.f.c(px.f.f163100a, "Key generation error: " + ((g0.b.Error) bVar).getDomainError(), null, 2, null);
        return c0Var.b(new er.l() { // from class: so1.v
            @Override // er.l
            public final Object b(Object obj) {
                return z.F9((State) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State D9(g0.b bVar, State state) {
        return State.b(state, null, null, null, null, ((g0.b.KeyPairResult) bVar).getKeyPair(), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State E9(g0.b bVar, State state) {
        return State.b(state, null, null, null, ((g0.b.SecretKeyResult) bVar).getSecretKey(), null, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State F9(State state) {
        return State.b(state, null, null, null, null, null, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c0, code lost:
    
        if (r14 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0116, code lost:
    
        if (r14 == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G9(so1.z r11, k10.c0<so1.State> r12, so1.a.ImportKey r13, tq.e<? super k10.l<so1.State>> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: so1.z.G9(so1.z, k10.c0, so1.a$d, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(final z zVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: so1.q
            @Override // er.l
            public final Object b(Object obj) {
                return z.J9(this.f183168a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(z zVar, k10.z zVar2) {
        f fVar = zVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.x(q0.c(so1.a.f.C4709a.class), oVar, fVar);
        zVar2.v(q0.c(so1.a.KeyAliasChanged.class), oVar, new g(null));
        zVar2.v(q0.c(so1.a.GenerateKeyTypeChanged.class), oVar, new h(null));
        zVar2.v(q0.c(so1.a.g.class), oVar, zVar.new i(null));
        zVar2.v(q0.c(so1.a.b.class), oVar, zVar.new j(null));
        zVar2.v(q0.c(so1.a.ImportKey.class), oVar, zVar.new k(null));
        zVar2.v(q0.c(so1.a.ExportKey.class), oVar, zVar.new l(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object K9(z zVar, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) throws Throwable {
        m mVar;
        if (eVar instanceof m) {
            mVar = (m) eVar;
            int i15 = mVar.f183246h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                mVar.f183246h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                mVar = new m(eVar);
            }
        } else {
            mVar = new m(eVar);
        }
        Object objC = mVar.f183244f;
        Object objE = uq.b.e();
        int i16 = mVar.f183246h;
        if (i16 == 0) {
            oq.u.b(objC);
            f93.d dVar = zVar.verifyKeyJCASafetyUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            mVar.f183242d = vq.j.a(zVar);
            mVar.f183243e = c0Var;
            mVar.f183246h = 1;
            objC = dVar.c(c1792a, mVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (k10.c0) mVar.f183243e;
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return c0Var.c();
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        final f93.d.Result result = (f93.d.Result) ((dx.i.Right) iVar).b();
        return c0Var.b(new er.l() { // from class: so1.w
            @Override // er.l
            public final Object b(Object obj) {
                return z.L9(result, (State) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State L9(f93.d.Result result, State state) {
        return State.b(state, null, null, result, null, null, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final so1.j.Params w9(State state) {
        return new so1.j.Params(state, b9(so1.a.f.C4709a.f183018a), b9(so1.a.g.f183019a), b9(so1.a.b.f183014a), b9(new so1.a.ImportKey(false)), b9(new so1.a.ExportKey(false)), b9(new so1.a.ImportKey(true)), b9(new so1.a.ExportKey(true)), new er.l() { // from class: so1.r
            @Override // er.l
            public final Object b(Object obj) {
                return z.x9(this.f183169a, (String) obj);
            }
        }, new er.l() { // from class: so1.s
            @Override // er.l
            public final Object b(Object obj) {
                return z.y9(this.f183170a, (b) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x9(z zVar, String str) {
        zVar.d9(new so1.a.KeyAliasChanged(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y9(z zVar, so1.b bVar) {
        zVar.d9(new so1.a.GenerateKeyTypeChanged(bVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        if (r10 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        if (r10 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z9(so1.z r7, final k10.c0<so1.State> r8, so1.a.ExportKey r9, tq.e<? super k10.l<so1.State>> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: so1.z.z9(so1.z, k10.c0, so1.a$a, tq.e):java.lang.Object");
    }

    @Override // zx.b
    /* JADX INFO: renamed from: H9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<so1.a.f> Y1() {
        return this.navAction;
    }

    @Override // so1.d
    public void d() {
        d9(so1.a.f.C4709a.f183018a);
    }

    @Override // l00.g
    protected k10.t<State, so1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<so1.d.Data> getState() {
        return this.state;
    }
}
