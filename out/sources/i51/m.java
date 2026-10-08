package i51;

import er.q;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\"8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010.\u001a\b\u0012\u0004\u0012\u00020)0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u00104\u001a\b\u0012\u0004\u0012\u00020\u00140/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Li51/m;", "Ll00/g;", "Li51/b;", "Li51/a;", "Li51/c;", "", "Lyy/a;", "stateMachineFactory", "Lk51/e;", "mapper", "Lcx/a;", "eventThrottler", "Lo31/a;", "getReceiveDocumentsMethods", "Lq31/c;", "exitDialogMapper", "Lj51/a;", "contract", "<init>", "(Lyy/a;Lk51/e;Lcx/a;Lo31/a;Lq31/c;Lj51/a;)V", "Li51/c$a;", "p9", "(Li51/b;)Li51/c$a;", "b", "Lk51/e;", "c", "Lcx/a;", "d", "Lq31/c;", "e", "Lj51/a;", "f", "Li51/b;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Li51/a$b;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<State, i51.a> implements i51.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k51.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final cx.a eventThrottler;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q31.c exitDialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j51.a contract;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t<State, i51.a> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<i51.a.b> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<i51.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<i51.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f89537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f89538b;

        /* JADX INFO: renamed from: i51.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2115a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f89539a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f89540b;

            /* JADX INFO: renamed from: i51.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2116a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f89541d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f89542e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f89543f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f89545h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f89546j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f89547k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f89548l;

                public C2116a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f89541d = obj;
                    this.f89542e |= PKIFailureInfo.systemUnavail;
                    return C2115a.this.F(null, this);
                }
            }

            public C2115a(mu.h hVar, m mVar) {
                this.f89539a = hVar;
                this.f89540b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2116a c2116a;
                if (eVar instanceof C2116a) {
                    c2116a = (C2116a) eVar;
                    int i15 = c2116a.f89542e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2116a.f89542e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2116a = new C2116a(eVar);
                    }
                } else {
                    c2116a = new C2116a(eVar);
                }
                Object obj2 = c2116a.f89541d;
                Object objE = uq.b.e();
                int i16 = c2116a.f89542e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f89539a;
                    i51.c.Data dataP9 = this.f89540b.p9((State) obj);
                    c2116a.f89543f = vq.j.a(obj);
                    c2116a.f89545h = vq.j.a(c2116a);
                    c2116a.f89546j = vq.j.a(obj);
                    c2116a.f89547k = vq.j.a(hVar);
                    c2116a.f89548l = 0;
                    c2116a.f89542e = 1;
                    if (hVar.F(dataP9, c2116a) == objE) {
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

        public a(mu.g gVar, m mVar) {
            this.f89537a = gVar;
            this.f89538b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super i51.c.Data> hVar, tq.e eVar) {
            Object objA = this.f89537a.a(new C2115a(hVar, this.f89538b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li51/a$b;", "action", "Li51/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Li51/a$b;Li51/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<i51.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f89550f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f89552e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ m f89553f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ i51.a.b f89554g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, i51.a.b bVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f89553f = mVar;
                this.f89554g = bVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f89552e;
                if (i15 == 0) {
                    u.b(obj);
                    xw.b<i51.a.b> bVarY1 = this.f89553f.Y1();
                    i51.a.b bVar = this.f89554g;
                    this.f89552e = 1;
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

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f89553f, this.f89554g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i51.a.b bVar = (i51.a.b) this.f89550f;
            Object objE = uq.b.e();
            int i15 = this.f89549e;
            if (i15 == 0) {
                u.b(obj);
                cx.a aVar = m.this.eventThrottler;
                a aVar2 = new a(m.this, bVar, null);
                this.f89550f = vq.j.a(bVar);
                this.f89549e = 1;
                if (cx.a.d(aVar, 0L, aVar2, this, 1, null) == objE) {
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
        public final Object w(i51.a.b bVar, State state, tq.e<? super i0> eVar) {
            b bVar2 = m.this.new b(eVar);
            bVar2.f89550f = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li51/a$c;", "<unused var>", "Li51/b;", "Loq/i0;", "<anonymous>", "(Li51/a$c;Li51/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<i51.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89555e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f89555e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<i51.a.b> bVarY1 = m.this.Y1();
                i51.a.b.ShowDialog showDialog = new i51.a.b.ShowDialog(m.this.exitDialogMapper.b(new q31.c.Params(m.this.b9(i51.a.b.C2114b.f89503a))));
                this.f89555e = 1;
                if (bVarY1.F(showDialog, this) == objE) {
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
        public final Object w(i51.a.c cVar, State state, tq.e<? super i0> eVar) {
            return m.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Li51/a$a;", "action", "Lk10/c0;", "Li51/b;", "state", "Lk10/l;", "<anonymous>", "(Li51/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<i51.a.GoToNextStep, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f89557e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f89558f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f89559g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f89561a;

            static {
                int[] iArr = new int[bl0.g.values().length];
                try {
                    iArr[bl0.g.MyEdorBox.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[bl0.g.InOffice.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[bl0.g.MyRegisteredAddress.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[bl0.g.SpecifiedAddress.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f89561a = iArr;
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i51.a.GoToNextStep goToNextStep = (i51.a.GoToNextStep) this.f89558f;
            c0 c0Var = (c0) this.f89559g;
            uq.b.e();
            if (this.f89557e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            m.this.contract.q1(goToNextStep.getMethod());
            int i15 = a.f89561a[goToNextStep.getMethod().ordinal()];
            if (i15 == 1 || i15 == 2) {
                m.this.contract.l7();
                m.this.d9(i51.a.b.d.f89505a);
            } else if (i15 == 3) {
                m.this.d9(i51.a.b.e.f89506a);
            } else {
                if (i15 != 4) {
                    throw new oq.p();
                }
                m.this.d9(i51.a.b.f.f89507a);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(i51.a.GoToNextStep goToNextStep, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = m.this.new d(eVar);
            dVar.f89558f = goToNextStep;
            dVar.f89559g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    public m(yy.a aVar, k51.e eVar, cx.a aVar2, o31.a aVar3, q31.c cVar, j51.a aVar4) {
        this.mapper = eVar;
        this.eventThrottler = aVar2;
        this.exitDialogMapper = cVar;
        this.contract = aVar4;
        State state = new State(aVar3.b(aVar4.r0()), aVar4.l(), aVar4.K(), aVar4.s2());
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: i51.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.s9(this.f89528a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), p9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i51.c.Data p9(State state) {
        return this.mapper.b(new k51.e.Params(state, b9(i51.a.b.c.f89504a), new er.l() { // from class: i51.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.q9(this.f89527a, (bl0.g) obj);
            }
        }, b9(i51.a.b.C2113a.f89502a), b9(i51.a.c.f89509a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(m mVar, bl0.g gVar) {
        mVar.d9(new i51.a.GoToNextStep(gVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final m mVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: i51.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.t9(this.f89526a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(i51.a.b.class), oVar, bVar);
        zVar.x(q0.c(i51.a.c.class), oVar, mVar.new c(null));
        zVar.v(q0.c(i51.a.GoToNextStep.class), oVar, mVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<i51.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, i51.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<i51.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(j51.a aVar) {
        super.P5(aVar);
    }
}
