package yn2;

import cu0.ReportedIncidentReference;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010)\u001a\b\u0012\u0004\u0012\u00020$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lyn2/p;", "Ll00/g;", "Lyn2/f;", "", "Lyn2/g;", "Lyy/a;", "stateMachineFactory", "Lyn2/h;", "mapper", "Lyn2/e;", "setupData", "<init>", "(Lyy/a;Lyn2/h;Lyn2/e;)V", "state", "Lyn2/g$a;", "k9", "(Lyn2/f;)Lyn2/g$a;", "b", "Lyn2/h;", "c", "Lyn2/e;", "d", "Lyn2/f;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lyn2/d;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, Object> implements g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final NetworkSecurityIssuesSuccessData setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<g.Data> state;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<d> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f228213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f228214b;

        /* JADX INFO: renamed from: yn2.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6127a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f228215a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f228216b;

            /* JADX INFO: renamed from: yn2.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6128a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f228217d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f228218e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f228219f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f228221h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f228222j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f228223k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f228224l;

                public C6128a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f228217d = obj;
                    this.f228218e |= PKIFailureInfo.systemUnavail;
                    return C6127a.this.F(null, this);
                }
            }

            public C6127a(mu.h hVar, p pVar) {
                this.f228215a = hVar;
                this.f228216b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6128a c6128a;
                if (eVar instanceof C6128a) {
                    c6128a = (C6128a) eVar;
                    int i15 = c6128a.f228218e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6128a.f228218e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6128a = new C6128a(eVar);
                    }
                } else {
                    c6128a = new C6128a(eVar);
                }
                Object obj2 = c6128a.f228217d;
                Object objE = uq.b.e();
                int i16 = c6128a.f228218e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f228215a;
                    g.Data dataK9 = this.f228216b.k9((State) obj);
                    c6128a.f228219f = vq.j.a(obj);
                    c6128a.f228221h = vq.j.a(c6128a);
                    c6128a.f228222j = vq.j.a(obj);
                    c6128a.f228223k = vq.j.a(hVar);
                    c6128a.f228224l = 0;
                    c6128a.f228218e = 1;
                    if (hVar.F(dataK9, c6128a) == objE) {
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

        public a(mu.g gVar, p pVar) {
            this.f228213a = gVar;
            this.f228214b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.Data> hVar, tq.e eVar) {
            Object objA = this.f228213a.a(new C6127a(hVar, this.f228214b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyn2/c;", "<unused var>", "Lyn2/f;", "state", "Loq/i0;", "<anonymous>", "(Lyn2/c;Lyn2/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f228225e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f228226f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f228227g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f228228h;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            if (r2.F(r3, r5) == r1) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
        
            if (r6.F(r2, r5) == r1) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f228228h
                yn2.f r0 = (yn2.State) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f228227g
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L23
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L13
                goto L1f
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                java.lang.Object r0 = r5.f228225e
                java.lang.String r0 = (java.lang.String) r0
            L1f:
                oq.u.b(r6)
                goto L5e
            L23:
                oq.u.b(r6)
                java.lang.String r6 = r0.getIncidentId()
                if (r6 == 0) goto L48
                yn2.p r2 = yn2.p.this
                yn2.d$b r3 = yn2.d.b.f228189a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f228228h = r0
                java.lang.Object r6 = vq.j.a(r6)
                r5.f228225e = r6
                r6 = 0
                r5.f228226f = r6
                r5.f228227g = r4
                java.lang.Object r6 = r2.F(r3, r5)
                if (r6 != r1) goto L5e
                goto L5d
            L48:
                yn2.p r6 = yn2.p.this
                yn2.d$a r2 = yn2.d.a.f228188a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f228228h = r0
                r0 = 0
                r5.f228225e = r0
                r5.f228227g = r3
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L5e
            L5d:
                return r1
            L5e:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: yn2.p.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(c cVar, State state, tq.e<? super i0> eVar) {
            b bVar = p.this.new b(eVar);
            bVar.f228228h = state;
            return bVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, h hVar, NetworkSecurityIssuesSuccessData networkSecurityIssuesSuccessData) {
        this.mapper = hVar;
        this.setupData = networkSecurityIssuesSuccessData;
        ReportedIncidentReference reference = networkSecurityIssuesSuccessData.getReference();
        State state = new State(reference != null ? reference.getTicketId() : null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: yn2.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.m9(this.f228206a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), k9(state));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.Data k9(State state) {
        return this.mapper.b(new h.Params(state, b9(c.f228187a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final p pVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: yn2.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.n9(this.f228205a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        zVar.x(q0.c(c.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(NetworkSecurityIssuesSuccessData networkSecurityIssuesSuccessData) {
        super.P5(networkSecurityIssuesSuccessData);
    }
}
