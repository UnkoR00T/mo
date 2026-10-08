package l10;

import er.p;
import er.q;
import k10.c0;
import k10.o;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00028\u0002*\b\b\u0001\u0010\u0002*\u00028\u0003*\b\b\u0002\u0010\u0004*\u00020\u0003*\b\b\u0003\u0010\u0005*\u00020\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006Ba\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u00124\u0010\u0011\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014*\b\u0012\u0004\u0012\u00028\u00030\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00100\u00142\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00028\u00020\u0017j\b\u0012\u0004\u0012\u00028\u0002`\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&RH\u0010\u0011\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Ll10/d;", "InputState", "SubAction", "", ip.a.f96137b, "A", "Ll10/a;", "Ll10/h$a;", "isInState", "Lmr/c;", "subActionClass", "Lk10/o;", "executionPolicy", "Lkotlin/Function3;", "Lk10/c0;", "Ltq/e;", "Lk10/l;", "handler", "<init>", "(Ll10/h$a;Lmr/c;Lk10/o;Ler/q;)V", "Lmu/g;", "g", "(Lmu/g;)Lmu/g;", "Lkotlin/Function0;", "Lpl/gov/coi/common/statemachine/sideeffects/GetState;", "getState", "b", "(Ler/a;)Lmu/g;", "Ll10/h$a;", "a", "()Ll10/h$a;", "c", "Lmr/c;", "i", "()Lmr/c;", "d", "Lk10/o;", "getExecutionPolicy$statemachine_release", "()Lk10/o;", "e", "Ler/q;", "h", "()Ler/q;", "statemachine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d<InputState extends S, SubAction extends A, S, A> extends l10.a<InputState, S, A> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h.a<S> isInState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mr.c<SubAction> subActionClass;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final o executionPolicy;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final q<SubAction, c0<InputState>, tq.e<? super k10.l<? extends S>>, Object> handler;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<SubAction> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f114057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f114058b;

        /* JADX INFO: renamed from: l10.d$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2769a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f114059a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f114060b;

            /* JADX INFO: renamed from: l10.d$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2770a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f114061d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f114062e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f114063f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f114065h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f114066j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f114067k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                Object f114068l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                int f114069m;

                public C2770a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f114061d = obj;
                    this.f114062e |= PKIFailureInfo.systemUnavail;
                    return C2769a.this.F(null, this);
                }
            }

            public C2769a(mu.h hVar, d dVar) {
                this.f114059a = hVar;
                this.f114060b = dVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2770a c2770a;
                if (eVar instanceof C2770a) {
                    c2770a = (C2770a) eVar;
                    int i15 = c2770a.f114062e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2770a.f114062e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2770a = new C2770a(eVar);
                    }
                } else {
                    c2770a = new C2770a(eVar);
                }
                Object obj2 = c2770a.f114061d;
                Object objE = uq.b.e();
                int i16 = c2770a.f114062e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f114059a;
                    Object obj3 = this.f114060b.i().A(obj) ? obj : null;
                    Object obj4 = obj3 != null ? obj3 : null;
                    if (obj4 != null) {
                        c2770a.f114063f = vq.j.a(obj);
                        c2770a.f114065h = vq.j.a(c2770a);
                        c2770a.f114066j = vq.j.a(obj);
                        c2770a.f114067k = vq.j.a(hVar);
                        c2770a.f114068l = vq.j.a(obj4);
                        c2770a.f114069m = 0;
                        c2770a.f114062e = 1;
                        if (hVar.F(obj4, c2770a) == objE) {
                            return objE;
                        }
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

        public a(mu.g gVar, d dVar) {
            this.f114057a = gVar;
            this.f114058b = dVar;
        }

        @Override // mu.g
        public Object a(mu.h hVar, tq.e eVar) {
            Object objA = this.f114057a.a(new C2769a(hVar, this.f114058b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00028\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"", ip.a.f96137b, "SubAction", "action", "Lmu/g;", "Lk10/l;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements p<SubAction, tq.e<? super mu.g<? extends k10.l<? extends S>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f114070e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f114071f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ d<InputState, SubAction, S, A> f114072g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.a<S> f114073h;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {ip.a.f96137b, "Lmu/h;", "Lk10/l;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 2, 0})
        public static final class a extends vq.k implements p<mu.h<? super k10.l<? extends S>>, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f114074e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f114075f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f114076g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f114077h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f114078j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f114079k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f114080l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f114081m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f114082n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f114083p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private /* synthetic */ Object f114084q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ h f114085r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ er.a f114086s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ d f114087t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ Object f114088v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            Object f114089w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            int f114090x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h hVar, er.a aVar, tq.e eVar, d dVar, Object obj) {
                super(2, eVar);
                this.f114085r = hVar;
                this.f114086s = aVar;
                this.f114087t = dVar;
                this.f114088v = obj;
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x00f5, code lost:
            
                if (r0.F(r13, r12) == r1) goto L18;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 251
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: l10.d.b.a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(mu.h<? super k10.l<? extends S>> hVar, tq.e<? super i0> eVar) {
                return ((a) v(hVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f114085r, this.f114086s, eVar, this.f114087t, this.f114088v);
                aVar.f114084q = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(d<InputState, SubAction, S, A> dVar, er.a<? extends S> aVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f114072g = dVar;
            this.f114073h = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object obj2 = this.f114071f;
            uq.b.e();
            if (this.f114070e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            d<InputState, SubAction, S, A> dVar = this.f114072g;
            return mu.i.I(new a(dVar, this.f114073h, null, dVar, obj2));
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(SubAction subaction, tq.e<? super mu.g<? extends k10.l<? extends S>>> eVar) {
            return ((b) v(subaction, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(this.f114072g, this.f114073h, eVar);
            bVar.f114071f = obj;
            return bVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(h.a<S> aVar, mr.c<SubAction> cVar, o oVar, q<? super SubAction, ? super c0<InputState>, ? super tq.e<? super k10.l<? extends S>>, ? extends Object> qVar) {
        this.isInState = aVar;
        this.subActionClass = cVar;
        this.executionPolicy = oVar;
        this.handler = qVar;
    }

    private final mu.g<SubAction> g(mu.g<? extends A> gVar) {
        return new a(gVar, this);
    }

    @Override // l10.h
    public h.a<S> a() {
        return this.isInState;
    }

    @Override // l10.h
    public mu.g<k10.l<S>> b(er.a<? extends S> getState) {
        return k10.p.a(g(e()), this.executionPolicy, new b(this, getState, null));
    }

    public final q<SubAction, c0<InputState>, tq.e<? super k10.l<? extends S>>, Object> h() {
        return this.handler;
    }

    public final mr.c<SubAction> i() {
        return this.subActionClass;
    }
}
