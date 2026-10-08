package l10;

import er.p;
import ju.a0;
import ju.p0;
import k10.c0;
import k10.e0;
import k10.n;
import lu.w;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00028\u0003*\b\b\u0003\u0010\u0005*\u00020\u0001*\u0004\b\u0004\u0010\u00062\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0007Be\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00030\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00010\f\u0012$\u0010\u0011\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00100\u000e¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00100\u00172\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00028\u00030\u0014j\b\u0012\u0004\u0012\u00028\u0003`\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00030\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R2\u0010\u0011\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00100\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Ll10/g;", "", "SubStateMachineState", "SubStateMachineAction", "InputState", ip.a.f96137b, "A", "Ll10/a;", "Ll10/h$a;", "isInState", "Lk10/e0;", "subStateMachine", "Lkotlin/Function1;", "actionMapper", "Lkotlin/Function2;", "Lk10/c0;", "Lk10/l;", "stateMapper", "<init>", "(Ll10/h$a;Lk10/e0;Ler/l;Ler/p;)V", "Lkotlin/Function0;", "Lpl/gov/coi/common/statemachine/sideeffects/GetState;", "getState", "Lmu/g;", "b", "(Ler/a;)Lmu/g;", "Ll10/h$a;", "a", "()Ll10/h$a;", "c", "Lk10/e0;", "d", "Ler/l;", "e", "Ler/p;", "statemachine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g<SubStateMachineState, SubStateMachineAction, InputState extends S, S, A> extends l10.a<InputState, S, A> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h.a<S> isInState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e0<SubStateMachineState, SubStateMachineAction> subStateMachine;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final er.l<A, SubStateMachineAction> actionMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p<c0<InputState>, SubStateMachineState, k10.l<S>> stateMapper;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", ip.a.f96137b, "Llu/w;", "Lk10/l;", "Loq/i0;", "<anonymous>", "(Llu/w;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements p<w<? super k10.l<? extends S>>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f114177e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f114178f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f114179g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f114180h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f114181j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ g<SubStateMachineState, SubStateMachineAction, InputState, S, A> f114182k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ er.a<S> f114183l;

        /* JADX INFO: renamed from: l10.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class C2776a extends vq.k implements p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f114184e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ g<SubStateMachineState, SubStateMachineAction, InputState, S, A> f114185f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ a0 f114186g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ er.a<S> f114187h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ w<k10.l<? extends S>> f114188j;

            /* JADX INFO: renamed from: l10.g$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "SubStateMachineState", "Lmu/h;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 2, 0})
            static final class C2777a extends vq.k implements p<mu.h<? super SubStateMachineState>, tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f114189e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ a0 f114190f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2777a(a0 a0Var, tq.e<? super C2777a> eVar) {
                    super(2, eVar);
                    this.f114190f = a0Var;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    uq.b.e();
                    if (this.f114189e != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                    n.e(this.f114190f);
                    return i0.f148189a;
                }

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(mu.h<? super SubStateMachineState> hVar, tq.e<? super i0> eVar) {
                    return ((C2777a) v(hVar, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    return new C2777a(this.f114190f, eVar);
                }
            }

            /* JADX INFO: renamed from: l10.g$a$a$b */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"", ip.a.f96137b, "SubStateMachineState", "subStateMachineState", "Lmu/g;", "Lk10/l;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
            static final class b extends vq.k implements p<SubStateMachineState, tq.e<? super mu.g<? extends k10.l<? extends S>>>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f114191e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                /* synthetic */ Object f114192f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ g<SubStateMachineState, SubStateMachineAction, InputState, S, A> f114193g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ er.a<S> f114194h;

                /* JADX INFO: renamed from: l10.g$a$a$b$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {ip.a.f96137b, "Lmu/h;", "Lk10/l;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 2, 0})
                public static final class C2778a extends vq.k implements p<mu.h<? super k10.l<? extends S>>, tq.e<? super i0>, Object> {

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    Object f114195e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    Object f114196f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    Object f114197g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    Object f114198h;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    Object f114199j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    Object f114200k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    Object f114201l;

                    /* JADX INFO: renamed from: m, reason: collision with root package name */
                    int f114202m;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    int f114203n;

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    int f114204p;

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    private /* synthetic */ Object f114205q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ h f114206r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ er.a f114207s;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ g f114208t;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    final /* synthetic */ Object f114209v;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C2778a(h hVar, er.a aVar, tq.e eVar, g gVar, Object obj) {
                        super(2, eVar);
                        this.f114206r = hVar;
                        this.f114207s = aVar;
                        this.f114208t = gVar;
                        this.f114209v = obj;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // vq.a
                    public final Object J(Object obj) throws Throwable {
                        mu.h hVar = (mu.h) this.f114205q;
                        Object objE = uq.b.e();
                        int i15 = this.f114204p;
                        if (i15 == 0) {
                            u.b(obj);
                            h hVar2 = this.f114206r;
                            er.a aVar = this.f114207s;
                            Object objA = aVar.a();
                            if (hVar2.a().a(objA)) {
                                k10.l lVar = (k10.l) this.f114208t.stateMapper.B(new c0(objA), this.f114209v);
                                this.f114205q = vq.j.a(hVar);
                                this.f114195e = vq.j.a(hVar2);
                                this.f114196f = vq.j.a(aVar);
                                this.f114197g = vq.j.a(objA);
                                this.f114198h = vq.j.a(objA);
                                this.f114199j = vq.j.a(this);
                                this.f114200k = vq.j.a(objA);
                                this.f114201l = vq.j.a(lVar);
                                this.f114202m = 0;
                                this.f114203n = 0;
                                this.f114204p = 1;
                                if (hVar.F(lVar, this) == objE) {
                                    return objE;
                                }
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            u.b(obj);
                        }
                        return i0.f148189a;
                    }

                    @Override // er.p
                    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                    public final Object B(mu.h<? super k10.l<? extends S>> hVar, tq.e<? super i0> eVar) {
                        return ((C2778a) v(hVar, eVar)).J(i0.f148189a);
                    }

                    @Override // vq.a
                    public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                        C2778a c2778a = new C2778a(this.f114206r, this.f114207s, eVar, this.f114208t, this.f114209v);
                        c2778a.f114205q = obj;
                        return c2778a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(g<SubStateMachineState, SubStateMachineAction, InputState, S, A> gVar, er.a<? extends S> aVar, tq.e<? super b> eVar) {
                    super(2, eVar);
                    this.f114193g = gVar;
                    this.f114194h = aVar;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object obj2 = this.f114192f;
                    uq.b.e();
                    if (this.f114191e != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                    g<SubStateMachineState, SubStateMachineAction, InputState, S, A> gVar = this.f114193g;
                    return mu.i.I(new C2778a(gVar, this.f114194h, null, gVar, obj2));
                }

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(SubStateMachineState substatemachinestate, tq.e<? super mu.g<? extends k10.l<? extends S>>> eVar) {
                    return ((b) v(substatemachinestate, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    b bVar = new b(this.f114193g, this.f114194h, eVar);
                    bVar.f114192f = obj;
                    return bVar;
                }
            }

            /* JADX INFO: renamed from: l10.g$a$a$c */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            static final class c<T> implements mu.h {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ w<k10.l<? extends S>> f114210a;

                /* JADX WARN: Multi-variable type inference failed */
                c(w<? super k10.l<? extends S>> wVar) {
                    this.f114210a = wVar;
                }

                @Override // mu.h
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object F(k10.l<? extends S> lVar, tq.e<? super i0> eVar) {
                    Object objL = this.f114210a.l(lVar, eVar);
                    return objL == uq.b.e() ? objL : i0.f148189a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2776a(g<SubStateMachineState, SubStateMachineAction, InputState, S, A> gVar, a0 a0Var, er.a<? extends S> aVar, w<? super k10.l<? extends S>> wVar, tq.e<? super C2776a> eVar) {
                super(2, eVar);
                this.f114185f = gVar;
                this.f114186g = a0Var;
                this.f114187h = aVar;
                this.f114188j = wVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f114184e;
                if (i15 == 0) {
                    u.b(obj);
                    mu.g gVarD = mu.i.D(mu.i.U(((g) this.f114185f).subStateMachine.getState(), new C2777a(this.f114186g, null)), new b(this.f114185f, this.f114187h, null));
                    c cVar = new c(this.f114188j);
                    this.f114184e = 1;
                    if (gVarD.a(cVar, this) == objE) {
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

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((C2776a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new C2776a(this.f114185f, this.f114186g, this.f114187h, this.f114188j, eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ g<SubStateMachineState, SubStateMachineAction, InputState, S, A> f114211a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ er.a<S> f114212b;

            /* JADX WARN: Multi-variable type inference failed */
            b(g<SubStateMachineState, SubStateMachineAction, InputState, S, A> gVar, er.a<? extends S> aVar) {
                this.f114211a = gVar;
                this.f114212b = aVar;
            }

            @Override // mu.h
            public final Object F(SubStateMachineAction substatemachineaction, tq.e<? super i0> eVar) {
                Object objA;
                g<SubStateMachineState, SubStateMachineAction, InputState, S, A> gVar = this.f114211a;
                return (gVar.a().a(this.f114212b.a()) && (objA = ((g) gVar).subStateMachine.a(substatemachineaction, eVar)) == uq.b.e()) ? objA : i0.f148189a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c implements mu.g<SubStateMachineAction> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.g f114213a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g f114214b;

            /* JADX INFO: renamed from: l10.g$a$c$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2779a<T> implements mu.h {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ mu.h f114215a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ g f114216b;

                /* JADX INFO: renamed from: l10.g$a$c$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class C2780a extends vq.d {

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f114217d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    int f114218e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    Object f114219f;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    Object f114221h;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    Object f114222j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    Object f114223k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    Object f114224l;

                    /* JADX INFO: renamed from: m, reason: collision with root package name */
                    int f114225m;

                    public C2780a(tq.e eVar) {
                        super(eVar);
                    }

                    @Override // vq.a
                    public final Object J(Object obj) {
                        this.f114217d = obj;
                        this.f114218e |= PKIFailureInfo.systemUnavail;
                        return C2779a.this.F(null, this);
                    }
                }

                public C2779a(mu.h hVar, g gVar) {
                    this.f114215a = hVar;
                    this.f114216b = gVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // mu.h
                public final Object F(Object obj, tq.e eVar) throws Throwable {
                    C2780a c2780a;
                    if (eVar instanceof C2780a) {
                        c2780a = (C2780a) eVar;
                        int i15 = c2780a.f114218e;
                        if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                            c2780a.f114218e = i15 - PKIFailureInfo.systemUnavail;
                        } else {
                            c2780a = new C2780a(eVar);
                        }
                    } else {
                        c2780a = new C2780a(eVar);
                    }
                    Object obj2 = c2780a.f114217d;
                    Object objE = uq.b.e();
                    int i16 = c2780a.f114218e;
                    if (i16 == 0) {
                        u.b(obj2);
                        mu.h hVar = this.f114215a;
                        Object objB = this.f114216b.actionMapper.b(obj);
                        if (objB != null) {
                            c2780a.f114219f = vq.j.a(obj);
                            c2780a.f114221h = vq.j.a(c2780a);
                            c2780a.f114222j = vq.j.a(obj);
                            c2780a.f114223k = vq.j.a(hVar);
                            c2780a.f114224l = vq.j.a(objB);
                            c2780a.f114225m = 0;
                            c2780a.f114218e = 1;
                            if (hVar.F(objB, c2780a) == objE) {
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

            public c(mu.g gVar, g gVar2) {
                this.f114213a = gVar;
                this.f114214b = gVar2;
            }

            @Override // mu.g
            public Object a(mu.h hVar, tq.e eVar) {
                Object objA = this.f114213a.a(new C2779a(hVar, this.f114214b), eVar);
                return objA == uq.b.e() ? objA : i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(g<SubStateMachineState, SubStateMachineAction, InputState, S, A> gVar, er.a<? extends S> aVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f114182k = gVar;
            this.f114183l = aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
        
            if (r3.a(r11, r10) == r0) goto L16;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = r10.f114181j
                r1 = r0
                lu.w r1 = (lu.w) r1
                java.lang.Object r0 = uq.b.e()
                int r2 = r10.f114180h
                r7 = 2
                r8 = 0
                r9 = 1
                if (r2 == 0) goto L32
                if (r2 == r9) goto L25
                if (r2 != r7) goto L1d
                java.lang.Object r0 = r10.f114177e
                ju.a0 r0 = (ju.a0) r0
                oq.u.b(r11)
                goto L9c
            L1d:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L25:
                java.lang.Object r2 = r10.f114178f
                ju.a0 r2 = (ju.a0) r2
                java.lang.Object r2 = r10.f114177e
                ju.a0 r2 = (ju.a0) r2
                oq.u.b(r11)
                r5 = r1
                goto L6f
            L32:
                oq.u.b(r11)
                ju.a0 r3 = k10.n.b(r8, r9, r8)
                l10.g$a$a r4 = new l10.g$a$a
                l10.g<SubStateMachineState, SubStateMachineAction, InputState extends S, S, A> r2 = r10.f114182k
                r5 = r1
                r1 = r4
                er.a<S> r4 = r10.f114183l
                r6 = 0
                r1.<init>(r2, r3, r4, r5, r6)
                r11 = r3
                r2 = 3
                r4 = r1
                r1 = r5
                r5 = r2
                r2 = 0
                r3 = 0
                ju.i.d(r1, r2, r3, r4, r5, r6)
                r5 = r1
                java.lang.Object r1 = vq.j.a(r5)
                r10.f114181j = r1
                java.lang.Object r1 = vq.j.a(r11)
                r10.f114177e = r1
                java.lang.Object r1 = vq.j.a(r11)
                r10.f114178f = r1
                r1 = 0
                r10.f114179g = r1
                r10.f114180h = r9
                java.lang.Object r1 = r11.T0(r10)
                if (r1 != r0) goto L6e
                goto L9b
            L6e:
                r2 = r11
            L6f:
                l10.g<SubStateMachineState, SubStateMachineAction, InputState extends S, S, A> r11 = r10.f114182k
                mu.g r11 = r11.e()
                l10.g<SubStateMachineState, SubStateMachineAction, InputState extends S, S, A> r1 = r10.f114182k
                l10.g$a$c r3 = new l10.g$a$c
                r3.<init>(r11, r1)
                l10.g$a$b r11 = new l10.g$a$b
                l10.g<SubStateMachineState, SubStateMachineAction, InputState extends S, S, A> r1 = r10.f114182k
                er.a<S> r4 = r10.f114183l
                r11.<init>(r1, r4)
                java.lang.Object r1 = vq.j.a(r5)
                r10.f114181j = r1
                java.lang.Object r1 = vq.j.a(r2)
                r10.f114177e = r1
                r10.f114178f = r8
                r10.f114180h = r7
                java.lang.Object r11 = r3.a(r11, r10)
                if (r11 != r0) goto L9c
            L9b:
                return r0
            L9c:
                oq.i0 r11 = oq.i0.f148189a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: l10.g.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(w<? super k10.l<? extends S>> wVar, tq.e<? super i0> eVar) {
            return ((a) v(wVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f114182k, this.f114183l, eVar);
            aVar.f114181j = obj;
            return aVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(h.a<S> aVar, e0<SubStateMachineState, SubStateMachineAction> e0Var, er.l<? super A, ? extends SubStateMachineAction> lVar, p<? super c0<InputState>, ? super SubStateMachineState, ? extends k10.l<? extends S>> pVar) {
        this.isInState = aVar;
        this.subStateMachine = e0Var;
        this.actionMapper = lVar;
        this.stateMapper = pVar;
    }

    @Override // l10.h
    public h.a<S> a() {
        return this.isInState;
    }

    @Override // l10.h
    public mu.g<k10.l<S>> b(er.a<? extends S> getState) {
        return mu.i.h(new a(this, getState, null));
    }
}
