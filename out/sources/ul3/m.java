package ul3;

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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lul3/m;", "Ll00/g;", "Lul3/e;", "", "Lul3/f;", "Lyy/a;", "stateMachineFactory", "Lzk3/b;", "mapper", "<init>", "(Lyy/a;Lzk3/b;)V", "state", "Lul3/f$a;", "k9", "(Lul3/e;)Lul3/f$a;", "b", "Lzk3/b;", "c", "Lul3/e;", "initialState", "Lxw/b;", "Lul3/a;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<e, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zk3.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ul3.a> navAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<e, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f198992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f198993b;

        /* JADX INFO: renamed from: ul3.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5183a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f198994a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f198995b;

            /* JADX INFO: renamed from: ul3.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5184a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f198996d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f198997e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f198998f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f199000h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f199001j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f199002k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f199003l;

                public C5184a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f198996d = obj;
                    this.f198997e |= PKIFailureInfo.systemUnavail;
                    return C5183a.this.F(null, this);
                }
            }

            public C5183a(mu.h hVar, m mVar) {
                this.f198994a = hVar;
                this.f198995b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5184a c5184a;
                if (eVar instanceof C5184a) {
                    c5184a = (C5184a) eVar;
                    int i15 = c5184a.f198997e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5184a.f198997e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5184a = new C5184a(eVar);
                    }
                } else {
                    c5184a = new C5184a(eVar);
                }
                Object obj2 = c5184a.f198996d;
                Object objE = uq.b.e();
                int i16 = c5184a.f198997e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f198994a;
                    f.Data dataK9 = this.f198995b.k9((e) obj);
                    c5184a.f198998f = vq.j.a(obj);
                    c5184a.f199000h = vq.j.a(c5184a);
                    c5184a.f199001j = vq.j.a(obj);
                    c5184a.f199002k = vq.j.a(hVar);
                    c5184a.f199003l = 0;
                    c5184a.f198997e = 1;
                    if (hVar.F(dataK9, c5184a) == objE) {
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
            this.f198992a = gVar;
            this.f198993b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f198992a.a(new C5183a(hVar, this.f198993b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lul3/b;", "<unused var>", "Lul3/e;", "Loq/i0;", "<anonymous>", "(Lul3/b;Lul3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<ul3.b, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f199004e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f199004e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                ul3.a.C5182a c5182a = ul3.a.C5182a.f198969a;
                this.f199004e = 1;
                if (mVar.F(c5182a, this) == objE) {
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
        public final Object w(ul3.b bVar, e eVar, tq.e<? super i0> eVar2) {
            return m.this.new b(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lul3/d;", "<unused var>", "Lul3/e;", "Loq/i0;", "<anonymous>", "(Lul3/d;Lul3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<ul3.d, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f199006e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f199006e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                ul3.a.c cVar = ul3.a.c.f198971a;
                this.f199006e = 1;
                if (mVar.F(cVar, this) == objE) {
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
        public final Object w(ul3.d dVar, e eVar, tq.e<? super i0> eVar2) {
            return m.this.new c(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lul3/c;", "<unused var>", "Lul3/e;", "Loq/i0;", "<anonymous>", "(Lul3/c;Lul3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<ul3.c, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f199008e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f199008e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                ul3.a.b bVar = ul3.a.b.f198970a;
                this.f199008e = 1;
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
        public final Object w(ul3.c cVar, e eVar, tq.e<? super i0> eVar2) {
            return m.this.new d(eVar2).J(i0.f148189a);
        }
    }

    public m(yy.a aVar, zk3.b bVar) {
        this.mapper = bVar;
        e eVar = e.f198975a;
        this.initialState = eVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(eVar, new er.l() { // from class: ul3.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.m9(this.f198985a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), k9(eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data k9(e state) {
        return this.mapper.b(new zk3.b.Params(state, b9(ul3.b.f198972a), b9(ul3.d.f198974a), b9(ul3.c.f198973a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final m mVar, v vVar) {
        vVar.c(q0.c(e.class), new er.l() { // from class: ul3.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.n9(this.f198986a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ul3.b.class), oVar, bVar);
        zVar.x(q0.c(ul3.d.class), oVar, mVar.new c(null));
        zVar.x(q0.c(ul3.c.class), oVar, mVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ul3.a> Y1() {
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
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ul3.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
