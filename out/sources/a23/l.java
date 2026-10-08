package a23;

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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"La23/l;", "Ll00/g;", "La23/c;", "", "La23/d;", "Lyy/a;", "stateMachineFactory", "La14/g;", "dialIntentUseCase", "Lb23/b;", "mapper", "<init>", "(Lyy/a;La14/g;Lb23/b;)V", "state", "La23/d$a;", "m9", "(La23/c;)La23/d$a;", "b", "La14/g;", "c", "Lb23/b;", "d", "La23/c;", "initialState", "Lxw/b;", "La23/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<a23.c, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a14.g dialIntentUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b23.b mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a23.c initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a23.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<a23.c, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f2182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f2183b;

        /* JADX INFO: renamed from: a23.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0026a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f2184a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f2185b;

            /* JADX INFO: renamed from: a23.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0027a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f2186d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f2187e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f2188f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f2190h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f2191j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f2192k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f2193l;

                public C0027a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f2186d = obj;
                    this.f2187e |= PKIFailureInfo.systemUnavail;
                    return C0026a.this.F(null, this);
                }
            }

            public C0026a(mu.h hVar, l lVar) {
                this.f2184a = hVar;
                this.f2185b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0027a c0027a;
                if (eVar instanceof C0027a) {
                    c0027a = (C0027a) eVar;
                    int i15 = c0027a.f2187e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0027a.f2187e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0027a = new C0027a(eVar);
                    }
                } else {
                    c0027a = new C0027a(eVar);
                }
                Object obj2 = c0027a.f2186d;
                Object objE = uq.b.e();
                int i16 = c0027a.f2187e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f2184a;
                    d.Data dataM9 = this.f2185b.m9((a23.c) obj);
                    c0027a.f2188f = vq.j.a(obj);
                    c0027a.f2190h = vq.j.a(c0027a);
                    c0027a.f2191j = vq.j.a(obj);
                    c0027a.f2192k = vq.j.a(hVar);
                    c0027a.f2193l = 0;
                    c0027a.f2187e = 1;
                    if (hVar.F(dataM9, c0027a) == objE) {
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
            this.f2182a = gVar;
            this.f2183b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f2182a.a(new C0026a(hVar, this.f2183b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La23/a;", "action", "La23/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(La23/a;La23/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<Dial, a23.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2194e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2195f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Dial dial = (Dial) this.f2195f;
            Object objE = uq.b.e();
            int i15 = this.f2194e;
            if (i15 == 0) {
                u.b(obj);
                a14.g gVar = l.this.dialIntentUseCase;
                a14.g.Params params = new a14.g.Params(dial.getNumber());
                this.f2195f = vq.j.a(dial);
                this.f2194e = 1;
                if (gVar.c(params, this) == objE) {
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
        public final Object w(Dial dial, a23.c cVar, tq.e<? super i0> eVar) {
            b bVar = l.this.new b(eVar);
            bVar.f2195f = dial;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La23/b;", "action", "La23/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(La23/b;La23/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<a23.b, a23.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2197e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f2198f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a23.b bVar = (a23.b) this.f2198f;
            Object objE = uq.b.e();
            int i15 = this.f2197e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                this.f2198f = vq.j.a(bVar);
                this.f2197e = 1;
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
        public final Object w(a23.b bVar, a23.c cVar, tq.e<? super i0> eVar) {
            c cVar2 = l.this.new c(eVar);
            cVar2.f2198f = bVar;
            return cVar2.J(i0.f148189a);
        }
    }

    public l(yy.a aVar, a14.g gVar, b23.b bVar) {
        this.dialIntentUseCase = gVar;
        this.mapper = bVar;
        a23.c cVar = a23.c.f2165a;
        this.initialState = cVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(cVar, new er.l() { // from class: a23.i
            @Override // er.l
            public final Object b(Object obj) {
                return l.p9(this.f2173a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), m9(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data m9(a23.c state) {
        return this.mapper.b(new b23.b.Params(state, b9(a23.b.a.f2164a), new er.l() { // from class: a23.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.n9(this.f2174a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(l lVar, String str) {
        lVar.d9(new Dial(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final l lVar, v vVar) {
        vVar.c(q0.c(a23.c.class), new er.l() { // from class: a23.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.q9(this.f2175a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(Dial.class), oVar, bVar);
        zVar.x(q0.c(a23.b.class), oVar, lVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<a23.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<a23.c, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(a23.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
