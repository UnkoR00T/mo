package dc3;

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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Ldc3/n;", "Ll00/g;", "Ldc3/e;", "", "Ldc3/f;", "Lyy/a;", "stateMachineFactory", "Lec3/a;", "mapper", "<init>", "(Lyy/a;Lec3/a;)V", "state", "Ldc3/f$a;", "k9", "(Ldc3/e;)Ldc3/f$a;", "b", "Lec3/a;", "c", "Ldc3/e;", "initialState", "Lxw/b;", "Ldc3/c;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<e, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ec3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<c> navAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<e, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f40927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f40928b;

        /* JADX INFO: renamed from: dc3.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0906a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f40929a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f40930b;

            /* JADX INFO: renamed from: dc3.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0907a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f40931d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f40932e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f40933f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f40935h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f40936j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f40937k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f40938l;

                public C0907a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f40931d = obj;
                    this.f40932e |= PKIFailureInfo.systemUnavail;
                    return C0906a.this.F(null, this);
                }
            }

            public C0906a(mu.h hVar, n nVar) {
                this.f40929a = hVar;
                this.f40930b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0907a c0907a;
                if (eVar instanceof C0907a) {
                    c0907a = (C0907a) eVar;
                    int i15 = c0907a.f40932e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0907a.f40932e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0907a = new C0907a(eVar);
                    }
                } else {
                    c0907a = new C0907a(eVar);
                }
                Object obj2 = c0907a.f40931d;
                Object objE = uq.b.e();
                int i16 = c0907a.f40932e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f40929a;
                    f.Data dataK9 = this.f40930b.k9((e) obj);
                    c0907a.f40933f = vq.j.a(obj);
                    c0907a.f40935h = vq.j.a(c0907a);
                    c0907a.f40936j = vq.j.a(obj);
                    c0907a.f40937k = vq.j.a(hVar);
                    c0907a.f40938l = 0;
                    c0907a.f40932e = 1;
                    if (hVar.F(dataK9, c0907a) == objE) {
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
            this.f40927a = gVar;
            this.f40928b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f40927a.a(new C0906a(hVar, this.f40928b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldc3/d;", "<unused var>", "Ldc3/e;", "Loq/i0;", "<anonymous>", "(Ldc3/d;Ldc3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<d, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f40939e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f40939e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                c.a aVar = c.a.f40909a;
                this.f40939e = 1;
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
        public final Object w(d dVar, e eVar, tq.e<? super i0> eVar2) {
            return n.this.new b(eVar2).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, ec3.a aVar2) {
        this.mapper = aVar2;
        e eVar = e.f40911a;
        this.initialState = eVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(eVar, new er.l() { // from class: dc3.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.m9(this.f40920a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), k9(eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data k9(e state) {
        return this.mapper.b(new ec3.a.Params(state, b9(d.f40910a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final n nVar, v vVar) {
        vVar.c(q0.c(e.class), new er.l() { // from class: dc3.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.n9(this.f40921a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        zVar.x(q0.c(d.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<c> Y1() {
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
    public /* bridge */ Object F(c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
