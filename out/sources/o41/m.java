package o41;

import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030 8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010,\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u00102\u001a\b\u0012\u0004\u0012\u00020\u00120-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lo41/m;", "Ll00/g;", "Lo41/b;", "Lo41/a;", "Lo41/c;", "", "Lyy/a;", "stateMachineFactory", "Lq41/q;", "mapper", "Lmx/c;", "labelProvider", "Lq31/c;", "exitDialogMapper", "Lp41/a;", "contract", "<init>", "(Lyy/a;Lq41/q;Lmx/c;Lq31/c;Lp41/a;)V", "Lo41/c$a;", "o9", "(Lo41/b;)Lo41/c$a;", "b", "Lq41/q;", "c", "Lmx/c;", "d", "Lq31/c;", "e", "Lp41/a;", "f", "Lo41/b;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lo41/a$a;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<State, o41.a> implements o41.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q41.q mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q31.c exitDialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p41.a contract;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t<State, o41.a> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<o41.a.InterfaceC3514a> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<o41.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<o41.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f142302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f142303b;

        /* JADX INFO: renamed from: o41.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3516a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f142304a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f142305b;

            /* JADX INFO: renamed from: o41.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3517a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f142306d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f142307e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f142308f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f142310h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f142311j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f142312k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f142313l;

                public C3517a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f142306d = obj;
                    this.f142307e |= PKIFailureInfo.systemUnavail;
                    return C3516a.this.F(null, this);
                }
            }

            public C3516a(mu.h hVar, m mVar) {
                this.f142304a = hVar;
                this.f142305b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3517a c3517a;
                if (eVar instanceof C3517a) {
                    c3517a = (C3517a) eVar;
                    int i15 = c3517a.f142307e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3517a.f142307e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3517a = new C3517a(eVar);
                    }
                } else {
                    c3517a = new C3517a(eVar);
                }
                Object obj2 = c3517a.f142306d;
                Object objE = uq.b.e();
                int i16 = c3517a.f142307e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f142304a;
                    o41.c.Data dataO9 = this.f142305b.o9((State) obj);
                    c3517a.f142308f = vq.j.a(obj);
                    c3517a.f142310h = vq.j.a(c3517a);
                    c3517a.f142311j = vq.j.a(obj);
                    c3517a.f142312k = vq.j.a(hVar);
                    c3517a.f142313l = 0;
                    c3517a.f142307e = 1;
                    if (hVar.F(dataO9, c3517a) == objE) {
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
            this.f142302a = gVar;
            this.f142303b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super o41.c.Data> hVar, tq.e eVar) {
            Object objA = this.f142302a.a(new C3516a(hVar, this.f142303b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo41/a$c;", "<unused var>", "Lo41/b;", "Loq/i0;", "<anonymous>", "(Lo41/a$c;Lo41/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<o41.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142314e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f142316e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ m f142317f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f142317f = mVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f142316e;
                if (i15 == 0) {
                    u.b(obj);
                    xw.b<o41.a.InterfaceC3514a> bVarY1 = this.f142317f.Y1();
                    o41.a.InterfaceC3514a.b bVar = o41.a.InterfaceC3514a.b.f142271a;
                    this.f142316e = 1;
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
                return new a(this.f142317f, eVar);
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(m mVar) {
            i00.a.a(mVar, new a(mVar, null));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f142314e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<o41.a.InterfaceC3514a> bVarY1 = m.this.Y1();
                q31.c cVar = m.this.exitDialogMapper;
                final m mVar = m.this;
                o41.a.InterfaceC3514a.ShowDialog showDialog = new o41.a.InterfaceC3514a.ShowDialog(cVar.b(new q31.c.Params(new er.a() { // from class: o41.n
                    @Override // er.a
                    public final Object a() {
                        return m.b.O(mVar);
                    }
                })));
                this.f142314e = 1;
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(o41.a.c cVar, State state, tq.e<? super i0> eVar) {
            return m.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo41/a$a;", "action", "Lo41/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lo41/a$a;Lo41/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<o41.a.InterfaceC3514a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142319f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            o41.a.InterfaceC3514a interfaceC3514a = (o41.a.InterfaceC3514a) this.f142319f;
            Object objE = uq.b.e();
            int i15 = this.f142318e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<o41.a.InterfaceC3514a> bVarY1 = m.this.Y1();
                this.f142319f = vq.j.a(interfaceC3514a);
                this.f142318e = 1;
                if (bVarY1.F(interfaceC3514a, this) == objE) {
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
        public final Object w(o41.a.InterfaceC3514a interfaceC3514a, State state, tq.e<? super i0> eVar) {
            c cVar = m.this.new c(eVar);
            cVar.f142319f = interfaceC3514a;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo41/a$b;", "action", "Lo41/b;", "state", "Loq/i0;", "<anonymous>", "(Lo41/a$b;Lo41/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<o41.a.OnAddressChildSelection, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f142321e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f142322f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f142323g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f142324h;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f142326a;

            static {
                int[] iArr = new int[bl0.s.values().length];
                try {
                    iArr[bl0.s.MeAndFatherAreNotRegistered.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[bl0.s.MeAndMotherAreNotRegistered.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[bl0.s.IAmNotRegistered.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[bl0.s.DoesNotRegisterChild.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f142326a = iArr;
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 V(m mVar) {
            mVar.d9(o41.a.InterfaceC3514a.c.f142272a);
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X() {
            return i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
        
            if (r6.F(r7, r21) == r3) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0126, code lost:
        
            if (r5.F(r7, r21) == r3) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0128, code lost:
        
            return r3;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r22) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 319
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o41.m.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(o41.a.OnAddressChildSelection onAddressChildSelection, State state, tq.e<? super i0> eVar) {
            d dVar = m.this.new d(eVar);
            dVar.f142323g = onAddressChildSelection;
            dVar.f142324h = state;
            return dVar.J(i0.f148189a);
        }
    }

    public m(yy.a aVar, q41.q qVar, mx.c cVar, q31.c cVar2, p41.a aVar2) {
        this.mapper = qVar;
        this.labelProvider = cVar;
        this.exitDialogMapper = cVar2;
        this.contract = aVar2;
        State state = new State(aVar2.V0(), aVar2.x(), aVar2.l());
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: o41.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.r9(this.f142293a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), o9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o41.c.Data o9(State state) {
        return this.mapper.b(new q41.q.Params(state, new er.l() { // from class: o41.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.p9(this.f142292a, (bl0.s) obj);
            }
        }, b9(o41.a.c.f142276a), b9(o41.a.InterfaceC3514a.C3515a.f142270a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(m mVar, bl0.s sVar) {
        mVar.d9(new o41.a.OnAddressChildSelection(sVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(final m mVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: o41.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.s9(this.f142291a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(o41.a.c.class), oVar, bVar);
        zVar.x(q0.c(o41.a.InterfaceC3514a.class), oVar, mVar.new c(null));
        zVar.x(q0.c(o41.a.OnAddressChildSelection.class), oVar, mVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<o41.a.InterfaceC3514a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, o41.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<o41.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(p41.a aVar) {
        super.P5(aVar);
    }
}
