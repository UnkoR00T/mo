package po1;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00138\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lpo1/y0;", "Ll00/g;", "Lpo1/m0;", "", "Lpo1/n0;", "Lyy/a;", "stateMachineFactory", "Lpo1/u0;", "mapper", "<init>", "(Lyy/a;Lpo1/u0;)V", "Lpo1/n0$a;", "k9", "(Lpo1/m0;)Lpo1/n0$a;", "b", "Lpo1/u0;", "c", "Lpo1/m0;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lpo1/l0;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y0 extends l00.g<m0, Object> implements n0, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u0 mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m0 initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k10.t<m0, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<l0> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<n0.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<n0.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f161523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y0 f161524b;

        /* JADX INFO: renamed from: po1.y0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3978a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f161525a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ y0 f161526b;

            /* JADX INFO: renamed from: po1.y0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3979a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f161527d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f161528e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f161529f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f161531h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f161532j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f161533k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f161534l;

                public C3979a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f161527d = obj;
                    this.f161528e |= PKIFailureInfo.systemUnavail;
                    return C3978a.this.F(null, this);
                }
            }

            public C3978a(mu.h hVar, y0 y0Var) {
                this.f161525a = hVar;
                this.f161526b = y0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3979a c3979a;
                if (eVar instanceof C3979a) {
                    c3979a = (C3979a) eVar;
                    int i15 = c3979a.f161528e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3979a.f161528e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3979a = new C3979a(eVar);
                    }
                } else {
                    c3979a = new C3979a(eVar);
                }
                Object obj2 = c3979a.f161527d;
                Object objE = uq.b.e();
                int i16 = c3979a.f161528e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f161525a;
                    n0.Data dataK9 = this.f161526b.k9((m0) obj);
                    c3979a.f161529f = vq.j.a(obj);
                    c3979a.f161531h = vq.j.a(c3979a);
                    c3979a.f161532j = vq.j.a(obj);
                    c3979a.f161533k = vq.j.a(hVar);
                    c3979a.f161534l = 0;
                    c3979a.f161528e = 1;
                    if (hVar.F(dataK9, c3979a) == objE) {
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

        public a(mu.g gVar, y0 y0Var) {
            this.f161523a = gVar;
            this.f161524b = y0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super n0.Data> hVar, tq.e eVar) {
            Object objA = this.f161523a.a(new C3978a(hVar, this.f161524b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpo1/l0;", "action", "Lpo1/m0;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpo1/l0;Lpo1/m0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<l0, m0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161535e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f161536f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            l0 l0Var = (l0) this.f161536f;
            Object objE = uq.b.e();
            int i15 = this.f161535e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<l0> bVarY1 = y0.this.Y1();
                this.f161536f = vq.j.a(l0Var);
                this.f161535e = 1;
                if (bVarY1.F(l0Var, this) == objE) {
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
        public final Object w(l0 l0Var, m0 m0Var, tq.e<? super oq.i0> eVar) {
            b bVar = y0.this.new b(eVar);
            bVar.f161536f = l0Var;
            return bVar.J(oq.i0.f148189a);
        }
    }

    public y0(yy.a aVar, u0 u0Var) {
        this.mapper = u0Var;
        m0 m0Var = m0.f161452a;
        this.initialState = m0Var;
        this.stateMachine = aVar.a(m0Var, new er.l() { // from class: po1.v0
            @Override // er.l
            public final Object b(Object obj) {
                return y0.n9(this.f161511a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), k9(m0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n0.Data k9(m0 m0Var) {
        return this.mapper.b(new u0.Params(m0Var, b9(l0.a.f161449a), new er.l() { // from class: po1.w0
            @Override // er.l
            public final Object b(Object obj) {
                return y0.l9(this.f161513a, (oo1.p.i) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l9(y0 y0Var, oo1.p.i iVar) {
        y0Var.d9(new l0.GoToDestination(iVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n9(final y0 y0Var, k10.v vVar) {
        vVar.c(fr.q0.c(m0.class), new er.l() { // from class: po1.x0
            @Override // er.l
            public final Object b(Object obj) {
                return y0.o9(this.f161516a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o9(y0 y0Var, k10.z zVar) {
        b bVar = y0Var.new b(null);
        zVar.x(fr.q0.c(l0.class), k10.o.CANCEL_PREVIOUS, bVar);
        return oq.i0.f148189a;
    }

    @Override // zx.b
    public xw.b<l0> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<m0, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<n0.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }
}
