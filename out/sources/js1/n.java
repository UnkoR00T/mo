package js1;

import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00138\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Ljs1/n;", "Ll00/g;", "Ljs1/d;", "", "Ljs1/e;", "Lyy/a;", "stateMachineFactory", "Lks1/a;", "mapper", "<init>", "(Lyy/a;Lks1/a;)V", "Ljs1/e$a;", "j9", "(Ljs1/d;)Ljs1/e$a;", "b", "Lks1/a;", "c", "Ljs1/d;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ljs1/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<d, Object> implements e, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ks1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<d, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<js1.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f105138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f105139b;

        /* JADX INFO: renamed from: js1.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2488a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f105140a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f105141b;

            /* JADX INFO: renamed from: js1.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2489a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f105142d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f105143e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f105144f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f105146h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f105147j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f105148k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f105149l;

                public C2489a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f105142d = obj;
                    this.f105143e |= PKIFailureInfo.systemUnavail;
                    return C2488a.this.F(null, this);
                }
            }

            public C2488a(mu.h hVar, n nVar) {
                this.f105140a = hVar;
                this.f105141b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2489a c2489a;
                if (eVar instanceof C2489a) {
                    c2489a = (C2489a) eVar;
                    int i15 = c2489a.f105143e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2489a.f105143e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2489a = new C2489a(eVar);
                    }
                } else {
                    c2489a = new C2489a(eVar);
                }
                Object obj2 = c2489a.f105142d;
                Object objE = uq.b.e();
                int i16 = c2489a.f105143e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f105140a;
                    e.Data dataJ9 = this.f105141b.j9((d) obj);
                    c2489a.f105144f = vq.j.a(obj);
                    c2489a.f105146h = vq.j.a(c2489a);
                    c2489a.f105147j = vq.j.a(obj);
                    c2489a.f105148k = vq.j.a(hVar);
                    c2489a.f105149l = 0;
                    c2489a.f105143e = 1;
                    if (hVar.F(dataJ9, c2489a) == objE) {
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
            this.f105138a = gVar;
            this.f105139b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f105138a.a(new C2488a(hVar, this.f105139b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljs1/a;", "<unused var>", "Ljs1/d;", "Loq/i0;", "<anonymous>", "(Ljs1/a;Ljs1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<js1.a, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105150e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f105150e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<js1.b> bVarY1 = n.this.Y1();
                js1.b.a aVar = js1.b.a.f105115a;
                this.f105150e = 1;
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
        public final Object w(js1.a aVar, d dVar, tq.e<? super i0> eVar) {
            return n.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljs1/c;", "<unused var>", "Ljs1/d;", "Loq/i0;", "<anonymous>", "(Ljs1/c;Ljs1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<js1.c, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105152e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f105152e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<js1.b> bVarY1 = n.this.Y1();
                js1.b.C2487b c2487b = js1.b.C2487b.f105116a;
                this.f105152e = 1;
                if (bVarY1.F(c2487b, this) == objE) {
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
        public final Object w(js1.c cVar, d dVar, tq.e<? super i0> eVar) {
            return n.this.new c(eVar).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, ks1.a aVar2) {
        this.mapper = aVar2;
        d dVar = d.f105118a;
        this.initialState = dVar;
        this.stateMachine = aVar.a(dVar, new er.l() { // from class: js1.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.l9(this.f105131a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), j9(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data j9(d dVar) {
        return this.mapper.b(new ks1.a.Params(dVar, b9(js1.a.f105114a), b9(js1.c.f105117a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final n nVar, v vVar) {
        vVar.c(q0.c(d.class), new er.l() { // from class: js1.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.m9(this.f105132a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(js1.a.class), oVar, bVar);
        zVar.x(q0.c(js1.c.class), oVar, nVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<js1.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<d, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
