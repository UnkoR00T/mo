package fb3;

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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lfb3/l;", "Ll00/g;", "Lfb3/d;", "", "Lfb3/e;", "Lyy/a;", "stateMachineFactory", "Lgb3/a;", "mapper", "<init>", "(Lyy/a;Lgb3/a;)V", "state", "Lfb3/e$a;", "k9", "(Lfb3/d;)Lfb3/e$a;", "b", "Lgb3/a;", "c", "Lfb3/d;", "initialState", "Lxw/b;", "Lfb3/a;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<d, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gb3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<fb3.a> navAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<d, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f61024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f61025b;

        /* JADX INFO: renamed from: fb3.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1374a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f61026a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f61027b;

            /* JADX INFO: renamed from: fb3.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1375a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f61028d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f61029e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f61030f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f61032h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f61033j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f61034k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f61035l;

                public C1375a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f61028d = obj;
                    this.f61029e |= PKIFailureInfo.systemUnavail;
                    return C1374a.this.F(null, this);
                }
            }

            public C1374a(mu.h hVar, l lVar) {
                this.f61026a = hVar;
                this.f61027b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1375a c1375a;
                if (eVar instanceof C1375a) {
                    c1375a = (C1375a) eVar;
                    int i15 = c1375a.f61029e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1375a.f61029e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1375a = new C1375a(eVar);
                    }
                } else {
                    c1375a = new C1375a(eVar);
                }
                Object obj2 = c1375a.f61028d;
                Object objE = uq.b.e();
                int i16 = c1375a.f61029e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f61026a;
                    e.Data dataK9 = this.f61027b.k9((d) obj);
                    c1375a.f61030f = vq.j.a(obj);
                    c1375a.f61032h = vq.j.a(c1375a);
                    c1375a.f61033j = vq.j.a(obj);
                    c1375a.f61034k = vq.j.a(hVar);
                    c1375a.f61035l = 0;
                    c1375a.f61029e = 1;
                    if (hVar.F(dataK9, c1375a) == objE) {
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

        public a(mu.g gVar, l lVar) {
            this.f61024a = gVar;
            this.f61025b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f61024a.a(new C1374a(hVar, this.f61025b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfb3/b;", "<unused var>", "Lfb3/d;", "Loq/i0;", "<anonymous>", "(Lfb3/b;Lfb3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<fb3.b, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f61036e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f61036e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                fb3.a.C1373a c1373a = fb3.a.C1373a.f61004a;
                this.f61036e = 1;
                if (lVar.F(c1373a, this) == objE) {
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
        public final Object w(fb3.b bVar, d dVar, tq.e<? super i0> eVar) {
            return l.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfb3/c;", "<unused var>", "Lfb3/d;", "Loq/i0;", "<anonymous>", "(Lfb3/c;Lfb3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<fb3.c, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f61038e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f61038e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                fb3.a.b bVar = fb3.a.b.f61005a;
                this.f61038e = 1;
                if (lVar.F(bVar, this) == objE) {
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
        public final Object w(fb3.c cVar, d dVar, tq.e<? super i0> eVar) {
            return l.this.new c(eVar).J(i0.f148189a);
        }
    }

    public l(yy.a aVar, gb3.a aVar2) {
        this.mapper = aVar2;
        d dVar = d.f61008a;
        this.initialState = dVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(dVar, new er.l() { // from class: fb3.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.m9(this.f61017a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), k9(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data k9(d state) {
        return this.mapper.b(new gb3.a.Params(state, b9(fb3.b.f61006a), b9(fb3.c.f61007a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final l lVar, v vVar) {
        vVar.c(q0.c(d.class), new er.l() { // from class: fb3.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.n9(this.f61018a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(fb3.b.class), oVar, bVar);
        zVar.x(q0.c(fb3.c.class), oVar, lVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<fb3.a> Y1() {
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
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(fb3.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
