package pz1;

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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lpz1/l;", "Ll00/g;", "Lpz1/c;", "", "Lpz1/d;", "Lqz1/a;", "mapper", "Lac4/o;", "openUrlIntentUseCase", "Lyy/a;", "stateMachineFactory", "<init>", "(Lqz1/a;Lac4/o;Lyy/a;)V", "state", "Lpz1/d$a;", "m9", "(Lpz1/c;)Lpz1/d$a;", "b", "Lqz1/a;", "c", "Lac4/o;", "d", "Lpz1/c;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lpz1/a;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<pz1.c, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qz1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.o openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final pz1.c initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<pz1.c, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<pz1.a> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f163323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f163324b;

        /* JADX INFO: renamed from: pz1.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4049a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f163325a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f163326b;

            /* JADX INFO: renamed from: pz1.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4050a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f163327d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f163328e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f163329f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f163331h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f163332j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f163333k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f163334l;

                public C4050a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f163327d = obj;
                    this.f163328e |= PKIFailureInfo.systemUnavail;
                    return C4049a.this.F(null, this);
                }
            }

            public C4049a(mu.h hVar, l lVar) {
                this.f163325a = hVar;
                this.f163326b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4050a c4050a;
                if (eVar instanceof C4050a) {
                    c4050a = (C4050a) eVar;
                    int i15 = c4050a.f163328e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4050a.f163328e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4050a = new C4050a(eVar);
                    }
                } else {
                    c4050a = new C4050a(eVar);
                }
                Object obj2 = c4050a.f163327d;
                Object objE = uq.b.e();
                int i16 = c4050a.f163328e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f163325a;
                    d.Data dataM9 = this.f163326b.m9((pz1.c) obj);
                    c4050a.f163329f = vq.j.a(obj);
                    c4050a.f163331h = vq.j.a(c4050a);
                    c4050a.f163332j = vq.j.a(obj);
                    c4050a.f163333k = vq.j.a(hVar);
                    c4050a.f163334l = 0;
                    c4050a.f163328e = 1;
                    if (hVar.F(dataM9, c4050a) == objE) {
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
            this.f163323a = gVar;
            this.f163324b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f163323a.a(new C4049a(hVar, this.f163324b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpz1/a;", "action", "Lpz1/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpz1/a;Lpz1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<pz1.a, pz1.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163335e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f163336f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            pz1.a aVar = (pz1.a) this.f163336f;
            Object objE = uq.b.e();
            int i15 = this.f163335e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                this.f163336f = vq.j.a(aVar);
                this.f163335e = 1;
                if (lVar.F(aVar, this) == objE) {
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
        public final Object w(pz1.a aVar, pz1.c cVar, tq.e<? super i0> eVar) {
            b bVar = l.this.new b(eVar);
            bVar.f163336f = aVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpz1/b;", "action", "Lpz1/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lpz1/b;Lpz1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<OpenUrl, pz1.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163338e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f163339f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenUrl openUrl = (OpenUrl) this.f163339f;
            Object objE = uq.b.e();
            int i15 = this.f163338e;
            if (i15 == 0) {
                u.b(obj);
                ac4.o oVar = l.this.openUrlIntentUseCase;
                ac4.o.Params params = new ac4.o.Params(openUrl.getUrl(), false, 2, null);
                this.f163339f = vq.j.a(openUrl);
                this.f163338e = 1;
                if (oVar.c(params, this) == objE) {
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
        public final Object w(OpenUrl openUrl, pz1.c cVar, tq.e<? super i0> eVar) {
            c cVar2 = l.this.new c(eVar);
            cVar2.f163339f = openUrl;
            return cVar2.J(i0.f148189a);
        }
    }

    public l(qz1.a aVar, ac4.o oVar, yy.a aVar2) {
        this.mapper = aVar;
        this.openUrlIntentUseCase = oVar;
        pz1.c cVar = pz1.c.f163302a;
        this.initialState = cVar;
        this.stateMachine = aVar2.a(cVar, new er.l() { // from class: pz1.i
            @Override // er.l
            public final Object b(Object obj) {
                return l.p9(this.f163314a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), m9(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data m9(pz1.c state) {
        return this.mapper.b(new qz1.a.Params(state, b9(pz1.a.C4048a.f163300a), new er.l() { // from class: pz1.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.n9(this.f163315a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(l lVar, String str) {
        lVar.d9(new OpenUrl(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final l lVar, v vVar) {
        vVar.c(q0.c(pz1.c.class), new er.l() { // from class: pz1.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.q9(this.f163316a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(pz1.a.class), oVar, bVar);
        zVar.x(q0.c(OpenUrl.class), oVar, lVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<pz1.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<pz1.c, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(pz1.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
