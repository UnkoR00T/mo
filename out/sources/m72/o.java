package m72;

import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R&\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00198\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lm72/o;", "Ll00/g;", "Lm72/e;", "", "Lm72/f;", "Lyy/a;", "stateMachineFactory", "Ln72/a;", "mapper", "Lm72/d;", "setupData", "<init>", "(Lyy/a;Ln72/a;Lm72/d;)V", "state", "Lm72/f$a;", "k9", "(Lm72/e;)Lm72/f$a;", "b", "Ln72/a;", "c", "Lm72/d;", "Lm72/e$b;", "d", "Lm72/e$b;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lm72/b;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<e, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n72.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AlarmStateDetailsNavigationParams setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e.Initialized initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<e, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<m72.b> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<f.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f124093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f124094b;

        /* JADX INFO: renamed from: m72.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3042a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f124095a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f124096b;

            /* JADX INFO: renamed from: m72.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3043a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f124097d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f124098e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f124099f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f124101h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f124102j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f124103k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f124104l;

                public C3043a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f124097d = obj;
                    this.f124098e |= PKIFailureInfo.systemUnavail;
                    return C3042a.this.F(null, this);
                }
            }

            public C3042a(mu.h hVar, o oVar) {
                this.f124095a = hVar;
                this.f124096b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3043a c3043a;
                if (eVar instanceof C3043a) {
                    c3043a = (C3043a) eVar;
                    int i15 = c3043a.f124098e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3043a.f124098e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3043a = new C3043a(eVar);
                    }
                } else {
                    c3043a = new C3043a(eVar);
                }
                Object obj2 = c3043a.f124097d;
                Object objE = uq.b.e();
                int i16 = c3043a.f124098e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f124095a;
                    f.a aVarK9 = this.f124096b.k9((e) obj);
                    c3043a.f124099f = vq.j.a(obj);
                    c3043a.f124101h = vq.j.a(c3043a);
                    c3043a.f124102j = vq.j.a(obj);
                    c3043a.f124103k = vq.j.a(hVar);
                    c3043a.f124104l = 0;
                    c3043a.f124098e = 1;
                    if (hVar.F(aVarK9, c3043a) == objE) {
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

        public a(mu.g gVar, o oVar) {
            this.f124093a = gVar;
            this.f124094b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.a> hVar, tq.e eVar) {
            Object objA = this.f124093a.a(new C3042a(hVar, this.f124094b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm72/a;", "<unused var>", "Lm72/e;", "Loq/i0;", "<anonymous>", "(Lm72/a;Lm72/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<m72.a, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124105e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f124105e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<m72.b> bVarY1 = o.this.Y1();
                m72.b.a aVar = m72.b.a.f124061a;
                this.f124105e = 1;
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
        public final Object w(m72.a aVar, e eVar, tq.e<? super i0> eVar2) {
            return o.this.new b(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm72/c;", "<unused var>", "Lm72/e;", "Loq/i0;", "<anonymous>", "(Lm72/c;Lm72/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<m72.c, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124107e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f124107e;
            if (i15 == 0) {
                u.b(obj);
                o oVar = o.this;
                m72.b.C3040b c3040b = m72.b.C3040b.f124062a;
                this.f124107e = 1;
                if (oVar.F(c3040b, this) == objE) {
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
        public final Object w(m72.c cVar, e eVar, tq.e<? super i0> eVar2) {
            return o.this.new c(eVar2).J(i0.f148189a);
        }
    }

    public o(yy.a aVar, n72.a aVar2, AlarmStateDetailsNavigationParams alarmStateDetailsNavigationParams) {
        this.mapper = aVar2;
        this.setupData = alarmStateDetailsNavigationParams;
        e.Initialized initialized = new e.Initialized(alarmStateDetailsNavigationParams.getHydroWarning());
        this.initialState = initialized;
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: m72.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.m9(this.f124086a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), k9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.a k9(e state) {
        return this.mapper.b(new n72.a.Params(state, b9(m72.a.f124060a), b9(m72.c.f124063a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final o oVar, v vVar) {
        vVar.c(q0.c(e.class), new er.l() { // from class: m72.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.n9(this.f124085a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(o oVar, z zVar) {
        b bVar = oVar.new b(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(m72.a.class), oVar2, bVar);
        zVar.x(q0.c(m72.c.class), oVar2, oVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<m72.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<e, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(m72.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(AlarmStateDetailsNavigationParams alarmStateDetailsNavigationParams) {
        super.P5(alarmStateDetailsNavigationParams);
    }
}
