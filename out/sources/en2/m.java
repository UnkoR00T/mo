package en2;

import bo2.NetworkSecurityIssuesWelcomePageNavigationParams;
import er.q;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00148\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Len2/m;", "Ll00/g;", "Len2/e;", "", "Len2/f;", "Lyy/a;", "stateMachineFactory", "Lfn2/a;", "mapper", "<init>", "(Lyy/a;Lfn2/a;)V", "state", "Len2/f$a;", "l9", "(Len2/e;)Len2/f$a;", "b", "Lfn2/a;", "c", "Len2/e;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Len2/d;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<e, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fn2.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<e, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<en2.d> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f52112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f52113b;

        /* JADX INFO: renamed from: en2.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1234a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f52114a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f52115b;

            /* JADX INFO: renamed from: en2.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1235a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f52116d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f52117e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f52118f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f52120h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f52121j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f52122k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f52123l;

                public C1235a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f52116d = obj;
                    this.f52117e |= PKIFailureInfo.systemUnavail;
                    return C1234a.this.F(null, this);
                }
            }

            public C1234a(mu.h hVar, m mVar) {
                this.f52114a = hVar;
                this.f52115b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1235a c1235a;
                if (eVar instanceof C1235a) {
                    c1235a = (C1235a) eVar;
                    int i15 = c1235a.f52117e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1235a.f52117e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1235a = new C1235a(eVar);
                    }
                } else {
                    c1235a = new C1235a(eVar);
                }
                Object obj2 = c1235a.f52116d;
                Object objE = uq.b.e();
                int i16 = c1235a.f52117e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f52114a;
                    f.Data dataL9 = this.f52115b.l9((e) obj);
                    c1235a.f52118f = vq.j.a(obj);
                    c1235a.f52120h = vq.j.a(c1235a);
                    c1235a.f52121j = vq.j.a(obj);
                    c1235a.f52122k = vq.j.a(hVar);
                    c1235a.f52123l = 0;
                    c1235a.f52117e = 1;
                    if (hVar.F(dataL9, c1235a) == objE) {
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
            this.f52112a = gVar;
            this.f52113b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f52112a.a(new C1234a(hVar, this.f52113b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Len2/a;", "<unused var>", "Len2/e;", "Loq/i0;", "<anonymous>", "(Len2/a;Len2/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<en2.a, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f52124e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f52124e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                en2.d.a aVar = en2.d.a.f52092a;
                this.f52124e = 1;
                if (mVar.F(aVar, this) == objE) {
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
        public final Object w(en2.a aVar, e eVar, tq.e<? super i0> eVar2) {
            return m.this.new b(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Len2/b;", "<unused var>", "Len2/e;", "Loq/i0;", "<anonymous>", "(Len2/b;Len2/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<en2.b, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f52126e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f52126e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                en2.d.b bVar = en2.d.b.f52093a;
                this.f52126e = 1;
                if (mVar.F(bVar, this) == objE) {
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
        public final Object w(en2.b bVar, e eVar, tq.e<? super i0> eVar2) {
            return m.this.new c(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Len2/c;", "<unused var>", "Len2/e;", "Loq/i0;", "<anonymous>", "(Len2/c;Len2/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<en2.c, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f52128e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f52128e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                en2.d.ToWelcomePage toWelcomePage = new en2.d.ToWelcomePage(new NetworkSecurityIssuesWelcomePageNavigationParams(bo2.e.ILLEGAL_CONTENT, m.this.mapper.c(), co2.a.ILLEGAL_CONTENT));
                this.f52128e = 1;
                if (mVar.F(toWelcomePage, this) == objE) {
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
        public final Object w(en2.c cVar, e eVar, tq.e<? super i0> eVar2) {
            return m.this.new d(eVar2).J(i0.f148189a);
        }
    }

    public m(yy.a aVar, fn2.a aVar2) {
        this.mapper = aVar2;
        e eVar = e.f52095a;
        this.initialState = eVar;
        this.stateMachine = aVar.a(eVar, new er.l() { // from class: en2.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.n9(this.f52105a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), l9(eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data l9(e state) {
        return this.mapper.b(new fn2.a.Params(state, b9(en2.b.f52090a), b9(en2.c.f52091a), b9(en2.a.f52089a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(final m mVar, v vVar) {
        vVar.c(q0.c(e.class), new er.l() { // from class: en2.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.o9(this.f52106a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(en2.a.class), oVar, bVar);
        zVar.x(q0.c(en2.b.class), oVar, mVar.new c(null));
        zVar.x(q0.c(en2.c.class), oVar, mVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<en2.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<e, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(en2.d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
