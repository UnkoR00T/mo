package wk3;

import fr.q0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lwk3/w;", "Ll00/g;", "Lwk3/s;", "", "Lwk3/t;", "Lyy/a;", "stateMachineFactory", "Lhm3/a;", "mapper", "<init>", "(Lyy/a;Lhm3/a;)V", "state", "Lwk3/t$a;", "k9", "(Lwk3/s;)Lwk3/t$a;", "b", "Lhm3/a;", "c", "Lwk3/s;", "initialState", "Lxw/b;", "Lwk3/p;", "d", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w extends l00.g<s, Object> implements t, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hm3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xw.b<p> navAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k10.t<s, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<t.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<t.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f213980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f213981b;

        /* JADX INFO: renamed from: wk3.w$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5661a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f213982a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f213983b;

            /* JADX INFO: renamed from: wk3.w$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5662a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f213984d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f213985e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f213986f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f213988h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f213989j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f213990k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f213991l;

                public C5662a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f213984d = obj;
                    this.f213985e |= PKIFailureInfo.systemUnavail;
                    return C5661a.this.F(null, this);
                }
            }

            public C5661a(mu.h hVar, w wVar) {
                this.f213982a = hVar;
                this.f213983b = wVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5662a c5662a;
                if (eVar instanceof C5662a) {
                    c5662a = (C5662a) eVar;
                    int i15 = c5662a.f213985e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5662a.f213985e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5662a = new C5662a(eVar);
                    }
                } else {
                    c5662a = new C5662a(eVar);
                }
                Object obj2 = c5662a.f213984d;
                Object objE = uq.b.e();
                int i16 = c5662a.f213985e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f213982a;
                    t.Data dataK9 = this.f213983b.k9((s) obj);
                    c5662a.f213986f = vq.j.a(obj);
                    c5662a.f213988h = vq.j.a(c5662a);
                    c5662a.f213989j = vq.j.a(obj);
                    c5662a.f213990k = vq.j.a(hVar);
                    c5662a.f213991l = 0;
                    c5662a.f213985e = 1;
                    if (hVar.F(dataK9, c5662a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, w wVar) {
            this.f213980a = gVar;
            this.f213981b = wVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super t.Data> hVar, tq.e eVar) {
            Object objA = this.f213980a.a(new C5661a(hVar, this.f213981b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwk3/q;", "<unused var>", "Lwk3/s;", "Loq/i0;", "<anonymous>", "(Lwk3/q;Lwk3/s;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<q, s, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f213992e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f213992e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                p.a aVar = p.a.f213965a;
                this.f213992e = 1;
                if (wVar.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(q qVar, s sVar, tq.e<? super i0> eVar) {
            return w.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwk3/r;", "<unused var>", "Lwk3/s;", "Loq/i0;", "<anonymous>", "(Lwk3/r;Lwk3/s;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<r, s, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f213994e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f213994e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                p.b bVar = p.b.f213966a;
                this.f213994e = 1;
                if (wVar.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(r rVar, s sVar, tq.e<? super i0> eVar) {
            return w.this.new c(eVar).J(i0.f148189a);
        }
    }

    public w(yy.a aVar, hm3.a aVar2) {
        this.mapper = aVar2;
        s sVar = s.f213969a;
        this.initialState = sVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(sVar, new er.l() { // from class: wk3.u
            @Override // er.l
            public final Object b(Object obj) {
                return w.m9(this.f213973a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), k9(sVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t.Data k9(s state) {
        return this.mapper.b(new hm3.a.Params(state, b9(q.f213967a), b9(r.f213968a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final w wVar, k10.v vVar) {
        vVar.c(q0.c(s.class), new er.l() { // from class: wk3.v
            @Override // er.l
            public final Object b(Object obj) {
                return w.n9(this.f213974a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(w wVar, k10.z zVar) {
        b bVar = wVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(q.class), oVar, bVar);
        zVar.x(q0.c(r.class), oVar, wVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<p> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<s, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<t.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(p pVar, tq.e<? super i0> eVar) {
        return super.F(pVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
