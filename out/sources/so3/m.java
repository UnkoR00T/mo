package so3;

import er.q;
import fr.q0;
import go3.n0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR&\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001c8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lso3/m;", "Ll00/g;", "Lso3/d;", "", "Lso3/e;", "Lyy/a;", "stateMachineFactory", "Lto3/a;", "introScannerScreenMapper", "Lgo3/n0;", "setIntroScannerStateUseCase", "Luo3/a;", "setupData", "<init>", "(Lyy/a;Lto3/a;Lgo3/n0;Luo3/a;)V", "state", "Lso3/e$a;", "k9", "(Lso3/d;)Lso3/e$a;", "b", "Lto3/a;", "c", "Lgo3/n0;", "d", "Luo3/a;", "e", "Lso3/d;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lso3/c;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<State, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final to3.a introScannerScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n0 setIntroScannerStateUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final uo3.a setupData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<so3.c> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f183326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f183327b;

        /* JADX INFO: renamed from: so3.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4715a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f183328a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f183329b;

            /* JADX INFO: renamed from: so3.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4716a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f183330d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f183331e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f183332f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f183334h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f183335j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f183336k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f183337l;

                public C4716a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f183330d = obj;
                    this.f183331e |= PKIFailureInfo.systemUnavail;
                    return C4715a.this.F(null, this);
                }
            }

            public C4715a(mu.h hVar, m mVar) {
                this.f183328a = hVar;
                this.f183329b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4716a c4716a;
                if (eVar instanceof C4716a) {
                    c4716a = (C4716a) eVar;
                    int i15 = c4716a.f183331e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4716a.f183331e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4716a = new C4716a(eVar);
                    }
                } else {
                    c4716a = new C4716a(eVar);
                }
                Object obj2 = c4716a.f183330d;
                Object objE = uq.b.e();
                int i16 = c4716a.f183331e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f183328a;
                    e.Data dataK9 = this.f183329b.k9((State) obj);
                    c4716a.f183332f = vq.j.a(obj);
                    c4716a.f183334h = vq.j.a(c4716a);
                    c4716a.f183335j = vq.j.a(obj);
                    c4716a.f183336k = vq.j.a(hVar);
                    c4716a.f183337l = 0;
                    c4716a.f183331e = 1;
                    if (hVar.F(dataK9, c4716a) == objE) {
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
            this.f183326a = gVar;
            this.f183327b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f183326a.a(new C4715a(hVar, this.f183327b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lso3/b;", "<unused var>", "Lso3/d;", "Loq/i0;", "<anonymous>", "(Lso3/b;Lso3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<so3.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f183338e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f183338e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<so3.c> bVarY1 = m.this.Y1();
                so3.c.a aVar = so3.c.a.f183303a;
                this.f183338e = 1;
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
        public final Object w(so3.b bVar, State state, tq.e<? super i0> eVar) {
            return m.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lso3/a;", "<unused var>", "Lso3/d;", "Loq/i0;", "<anonymous>", "(Lso3/a;Lso3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<so3.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f183340e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r5.F(r1, r4) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f183340e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L43
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
                so3.m r5 = so3.m.this
                go3.n0 r5 = so3.m.i9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f183340e = r3
                java.lang.Object r5 = r5.a(r1, r4)
                if (r5 != r0) goto L32
                goto L42
            L32:
                so3.m r5 = so3.m.this
                xw.b r5 = r5.Y1()
                so3.c$a r1 = so3.c.a.f183303a
                r4.f183340e = r2
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L43
            L42:
                return r0
            L43:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: so3.m.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(so3.a aVar, State state, tq.e<? super i0> eVar) {
            return m.this.new c(eVar).J(i0.f148189a);
        }
    }

    public m(yy.a aVar, to3.a aVar2, n0 n0Var, uo3.a aVar3) {
        this.introScannerScreenMapper = aVar2;
        this.setIntroScannerStateUseCase = n0Var;
        this.setupData = aVar3;
        State state = new State(aVar3);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: so3.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.m9(this.f183318a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), k9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data k9(State state) {
        return this.introScannerScreenMapper.b(new to3.a.Params(state, b9(so3.b.f183302a), b9(so3.a.f183301a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final m mVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: so3.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.n9(this.f183317a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(so3.b.class), oVar, bVar);
        zVar.x(q0.c(so3.a.class), oVar, mVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<so3.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(uo3.a aVar) {
        super.P5(aVar);
    }
}
