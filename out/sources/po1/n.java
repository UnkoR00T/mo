package po1;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00138\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lpo1/n;", "Ll00/g;", "Lpo1/b;", "", "Lpo1/c;", "Lyy/a;", "stateMachineFactory", "Lpo1/j;", "mapper", "<init>", "(Lyy/a;Lpo1/j;)V", "Lpo1/c$a;", "k9", "(Lpo1/b;)Lpo1/c$a;", "b", "Lpo1/j;", "c", "Lpo1/b;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lpo1/a;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<po1.b, Object> implements c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final po1.b initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k10.t<po1.b, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<po1.a> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f161458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f161459b;

        /* JADX INFO: renamed from: po1.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3975a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f161460a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f161461b;

            /* JADX INFO: renamed from: po1.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3976a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f161462d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f161463e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f161464f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f161466h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f161467j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f161468k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f161469l;

                public C3976a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f161462d = obj;
                    this.f161463e |= PKIFailureInfo.systemUnavail;
                    return C3975a.this.F(null, this);
                }
            }

            public C3975a(mu.h hVar, n nVar) {
                this.f161460a = hVar;
                this.f161461b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3976a c3976a;
                if (eVar instanceof C3976a) {
                    c3976a = (C3976a) eVar;
                    int i15 = c3976a.f161463e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3976a.f161463e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3976a = new C3976a(eVar);
                    }
                } else {
                    c3976a = new C3976a(eVar);
                }
                Object obj2 = c3976a.f161462d;
                Object objE = uq.b.e();
                int i16 = c3976a.f161463e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f161460a;
                    c.Data dataK9 = this.f161461b.k9((po1.b) obj);
                    c3976a.f161464f = vq.j.a(obj);
                    c3976a.f161466h = vq.j.a(c3976a);
                    c3976a.f161467j = vq.j.a(obj);
                    c3976a.f161468k = vq.j.a(hVar);
                    c3976a.f161469l = 0;
                    c3976a.f161463e = 1;
                    if (hVar.F(dataK9, c3976a) == objE) {
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

        public a(mu.g gVar, n nVar) {
            this.f161458a = gVar;
            this.f161459b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super c.Data> hVar, tq.e eVar) {
            Object objA = this.f161458a.a(new C3975a(hVar, this.f161459b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpo1/a;", "action", "Lpo1/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpo1/a;Lpo1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<po1.a, po1.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f161470e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f161471f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            po1.a aVar = (po1.a) this.f161471f;
            Object objE = uq.b.e();
            int i15 = this.f161470e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<po1.a> bVarY1 = n.this.Y1();
                this.f161471f = vq.j.a(aVar);
                this.f161470e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(po1.a aVar, po1.b bVar, tq.e<? super oq.i0> eVar) {
            b bVar2 = n.this.new b(eVar);
            bVar2.f161471f = aVar;
            return bVar2.J(oq.i0.f148189a);
        }
    }

    public n(yy.a aVar, j jVar) {
        this.mapper = jVar;
        po1.b bVar = po1.b.f161395a;
        this.initialState = bVar;
        this.stateMachine = aVar.a(bVar, new er.l() { // from class: po1.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.n9(this.f161446a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), k9(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c.Data k9(po1.b bVar) {
        return this.mapper.b(new j.Params(bVar, b9(po1.a.C3972a.f161392a), new er.l() { // from class: po1.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.l9(this.f161451a, (oo1.p.g) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l9(n nVar, oo1.p.g gVar) {
        nVar.d9(new po1.a.GoToDestination(gVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n9(final n nVar, k10.v vVar) {
        vVar.c(fr.q0.c(po1.b.class), new er.l() { // from class: po1.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.o9(this.f161448a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o9(n nVar, k10.z zVar) {
        b bVar = nVar.new b(null);
        zVar.x(fr.q0.c(po1.a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return oq.i0.f148189a;
    }

    @Override // zx.b
    public xw.b<po1.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<po1.b, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }
}
