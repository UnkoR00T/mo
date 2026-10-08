package c02;

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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lc02/n;", "Ll00/g;", "Lc02/e;", "", "Lc02/f;", "Ld02/a;", "mapper", "Lc02/d;", "setupData", "Lyy/a;", "stateMachineFactory", "<init>", "(Ld02/a;Lc02/d;Lyy/a;)V", "state", "Lc02/f$a;", "k9", "(Lc02/e;)Lc02/f$a;", "b", "Ld02/a;", "c", "Lc02/d;", "d", "Lc02/e;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lc02/b;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d02.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<c02.b> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f22323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f22324b;

        /* JADX INFO: renamed from: c02.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0594a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f22325a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f22326b;

            /* JADX INFO: renamed from: c02.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0595a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f22327d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f22328e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f22329f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f22331h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f22332j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f22333k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f22334l;

                public C0595a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f22327d = obj;
                    this.f22328e |= PKIFailureInfo.systemUnavail;
                    return C0594a.this.F(null, this);
                }
            }

            public C0594a(mu.h hVar, n nVar) {
                this.f22325a = hVar;
                this.f22326b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0595a c0595a;
                if (eVar instanceof C0595a) {
                    c0595a = (C0595a) eVar;
                    int i15 = c0595a.f22328e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0595a.f22328e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0595a = new C0595a(eVar);
                    }
                } else {
                    c0595a = new C0595a(eVar);
                }
                Object obj2 = c0595a.f22327d;
                Object objE = uq.b.e();
                int i16 = c0595a.f22328e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f22325a;
                    f.Data dataK9 = this.f22326b.k9((State) obj);
                    c0595a.f22329f = vq.j.a(obj);
                    c0595a.f22331h = vq.j.a(c0595a);
                    c0595a.f22332j = vq.j.a(obj);
                    c0595a.f22333k = vq.j.a(hVar);
                    c0595a.f22334l = 0;
                    c0595a.f22328e = 1;
                    if (hVar.F(dataK9, c0595a) == objE) {
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

        public a(mu.g gVar, n nVar) {
            this.f22323a = gVar;
            this.f22324b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f22323a.a(new C0594a(hVar, this.f22324b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc02/a;", "<unused var>", "Lc02/e;", "Loq/i0;", "<anonymous>", "(Lc02/a;Lc02/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<c02.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22335e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f22335e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                c02.b.a aVar = c02.b.a.f22295a;
                this.f22335e = 1;
                if (nVar.F(aVar, this) == objE) {
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
        public final Object w(c02.a aVar, State state, tq.e<? super i0> eVar) {
            return n.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lc02/c;", "<unused var>", "Lc02/e;", "state", "Loq/i0;", "<anonymous>", "(Lc02/c;Lc02/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<c02.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22337e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f22338f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f22340a;

            static {
                int[] iArr = new int[un0.e.values().length];
                try {
                    iArr[un0.e.PRESIDENTIAL_ELECTION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f22340a = iArr;
            }
        }

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
        
            if (r7.F(r2, r6) == r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
        
            if (r7.F(r2, r6) == r1) goto L24;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f22338f
                c02.e r0 = (c02.State) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f22337e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L26
                if (r2 == r5) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                goto L1e
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                oq.u.b(r7)
                goto L86
            L22:
                oq.u.b(r7)
                goto L40
            L26:
                oq.u.b(r7)
                un0.n r7 = r0.getTrustedProfileStatus()
                un0.n r2 = un0.n.AVAILABLE
                if (r7 == r2) goto L40
                c02.n r7 = c02.n.this
                c02.b$b r2 = c02.b.C0593b.f22296a
                r6.f22338f = r0
                r6.f22337e = r5
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L40
                goto L85
            L40:
                un0.a r7 = r0.getAvailableElectionSupport()
                un0.e r7 = r7.getElectionActionType()
                int[] r2 = c02.n.c.a.f22340a
                int r7 = r7.ordinal()
                r7 = r2[r7]
                if (r7 != r5) goto L6c
                c02.n r7 = c02.n.this
                c02.b$d r2 = new c02.b$d
                un0.a r3 = r0.getAvailableElectionSupport()
                r2.<init>(r3)
                java.lang.Object r0 = vq.j.a(r0)
                r6.f22338f = r0
                r6.f22337e = r4
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L86
                goto L85
            L6c:
                c02.n r7 = c02.n.this
                c02.b$c r2 = new c02.b$c
                un0.a r4 = r0.getAvailableElectionSupport()
                r2.<init>(r4)
                java.lang.Object r0 = vq.j.a(r0)
                r6.f22338f = r0
                r6.f22337e = r3
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L86
            L85:
                return r1
            L86:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: c02.n.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(c02.c cVar, State state, tq.e<? super i0> eVar) {
            c cVar2 = n.this.new c(eVar);
            cVar2.f22338f = state;
            return cVar2.J(i0.f148189a);
        }
    }

    public n(d02.a aVar, SetupData setupData, yy.a aVar2) {
        this.mapper = aVar;
        this.setupData = setupData;
        State state = new State(setupData.getTrustedProfileStatus(), setupData.getAvailableElectionSupport());
        this.initialState = state;
        this.stateMachine = aVar2.a(state, new er.l() { // from class: c02.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.m9(this.f22316a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), k9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data k9(State state) {
        return this.mapper.b(new d02.a.Params(state, b9(c02.a.f22294a), b9(c02.c.f22299a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final n nVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: c02.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.n9(this.f22315a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(c02.a.class), oVar, bVar);
        zVar.x(q0.c(c02.c.class), oVar, nVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<c02.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(c02.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
