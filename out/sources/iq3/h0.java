package iq3;

import fr.q0;
import oo0.Idea;
import oo0.IdeasRoundDetails;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 W2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001XBI\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%JH\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0006\u0010'\u001a\u00020&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020#0(2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020#0(2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0082@¢\u0006\u0004\b+\u0010,J\u0018\u0010/\u001a\u00020#2\u0006\u0010.\u001a\u00020-H\u0096\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020#H\u0096\u0001¢\u0006\u0004\b1\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R&\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030A8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010M\u001a\b\u0012\u0004\u0012\u00020H0G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020T0S8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010U¨\u0006Y"}, d2 = {"Liq3/h0;", "Ll00/g;", "Liq3/e;", "Liq3/d;", "Liq3/f;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Ljq3/e;", "voteIdeaListMapper", "Lpo0/d;", "fetchIdeasUC", "La14/w;", "openUrlIntentUseCase", "snackBarManagerStateHolder", "Lib4/c;", "genericDomainErrorMapper", "Lc54/b;", "isFeatureEnabledUseCase", "Lac4/a;", "callActionWithLoaderUC", "<init>", "(Lyy/a;Ljq3/e;Lpo0/d;La14/w;Li70/n;Lib4/c;Lc54/b;Lac4/a;)V", "state", "Liq3/f$a;", "F9", "(Liq3/e;)Liq3/f$a;", "Lk10/c0;", "Liq3/e$b;", "Lk10/l;", "B9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "", "url", "Loq/i0;", "L9", "(Ljava/lang/String;)V", "Ldx/b;", "domainError", "Lkotlin/Function0;", "retryAction", "closeAction", "C9", "(Ldx/b;Ler/a;Ler/a;Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Ljq3/e;", "c", "Lpo0/d;", "d", "La14/w;", "e", "Li70/n;", "f", "Lib4/c;", "g", "Lc54/b;", "h", "Lac4/a;", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Liq3/d$j;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "m", "a", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h0 extends l00.g<iq3.e, iq3.d> implements iq3.f, zx.d, i70.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f96599n = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jq3.e voteIdeaListMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final po0.d fetchIdeasUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<iq3.e, iq3.d> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<iq3.d.j> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<iq3.f.a> state;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Liq3/e;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super k10.l<? extends iq3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f96610e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f96611f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f96612g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f96613h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f96614j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ k10.c0<iq3.e.b> f96616l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k10.c0<iq3.e.b> c0Var, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f96616l = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iq3.e.Initialized V(IdeasRoundDetails ideasRoundDetails, h0 h0Var, iq3.e.b bVar) {
            return new iq3.e.Initialized(kq3.a.ALL, ideasRoundDetails, false, "", h0Var.isFeatureEnabledUseCase.a(b54.c.VOTE_IDEA_DEV).booleanValue());
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
        
            if (r10 == r0) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r9.f96614j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r9.f96611f
                dx.b r0 = (dx.b) r0
                java.lang.Object r0 = r9.f96610e
                dx.i r0 = (dx.i) r0
                oq.u.b(r10)
                goto L75
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                oq.u.b(r10)
                goto L3a
            L26:
                oq.u.b(r10)
                iq3.h0 r10 = iq3.h0.this
                po0.d r10 = iq3.h0.v9(r10)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r9.f96614j = r3
                java.lang.Object r10 = r10.c(r1, r9)
                if (r10 != r0) goto L3a
                goto L74
            L3a:
                dx.i r10 = (dx.i) r10
                iq3.h0 r3 = iq3.h0.this
                k10.c0<iq3.e$b> r7 = r9.f96616l
                boolean r1 = r10 instanceof dx.i.Left
                if (r1 == 0) goto L78
                r1 = r10
                dx.i$b r1 = (dx.i.Left) r1
                java.lang.Object r1 = r1.b()
                r4 = r1
                dx.b r4 = (dx.b) r4
                iq3.d$f r1 = iq3.d.f.f96552a
                er.a r5 = iq3.h0.s9(r3, r1)
                iq3.d$e r1 = iq3.d.e.f96551a
                er.a r6 = iq3.h0.s9(r3, r1)
                java.lang.Object r10 = vq.j.a(r10)
                r9.f96610e = r10
                java.lang.Object r10 = vq.j.a(r4)
                r9.f96611f = r10
                r10 = 0
                r9.f96612g = r10
                r9.f96613h = r10
                r9.f96614j = r2
                r8 = r9
                java.lang.Object r10 = iq3.h0.x9(r3, r4, r5, r6, r7, r8)
                if (r10 != r0) goto L75
            L74:
                return r0
            L75:
                k10.l r10 = (k10.l) r10
                return r10
            L78:
                boolean r0 = r10 instanceof dx.i.Right
                if (r0 == 0) goto L8e
                dx.i$c r10 = (dx.i.Right) r10
                java.lang.Object r10 = r10.b()
                oo0.r r10 = (oo0.IdeasRoundDetails) r10
                iq3.i0 r0 = new iq3.i0
                r0.<init>()
                k10.l r10 = r7.d(r0)
                return r10
            L8e:
                oq.p r10 = new oq.p
                r10.<init>()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: iq3.h0.b.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<oq.i0> N(tq.e<?> eVar) {
            return h0.this.new b(this.f96616l, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super k10.l<? extends iq3.e>> eVar) {
            return ((b) N(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f96617d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f96618e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f96619f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f96620g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f96621h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f96622j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f96624l;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f96622j = obj;
            this.f96624l |= PKIFailureInfo.systemUnavail;
            return h0.this.C9(null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f96625e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f96627g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f96627g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f96625e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = h0.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(this.f96627g, false, 2, null);
                this.f96625e = 1;
                obj = wVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            h0 h0Var = h0.this;
            if (iVar instanceof dx.i.Left) {
                h0Var.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return h0.this.new d(this.f96627g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((d) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements mu.g<iq3.f.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f96628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f96629b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f96630a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h0 f96631b;

            /* JADX INFO: renamed from: iq3.h0$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2258a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f96632d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f96633e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f96634f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f96636h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f96637j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f96638k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f96639l;

                public C2258a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f96632d = obj;
                    this.f96633e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, h0 h0Var) {
                this.f96630a = hVar;
                this.f96631b = h0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2258a c2258a;
                if (eVar instanceof C2258a) {
                    c2258a = (C2258a) eVar;
                    int i15 = c2258a.f96633e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2258a.f96633e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2258a = new C2258a(eVar);
                    }
                } else {
                    c2258a = new C2258a(eVar);
                }
                Object obj2 = c2258a.f96632d;
                Object objE = uq.b.e();
                int i16 = c2258a.f96633e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f96630a;
                    iq3.f.a aVarF9 = this.f96631b.F9((iq3.e) obj);
                    c2258a.f96634f = vq.j.a(obj);
                    c2258a.f96636h = vq.j.a(c2258a);
                    c2258a.f96637j = vq.j.a(obj);
                    c2258a.f96638k = vq.j.a(hVar);
                    c2258a.f96639l = 0;
                    c2258a.f96633e = 1;
                    if (hVar.F(aVarF9, c2258a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public e(mu.g gVar, h0 h0Var) {
            this.f96628a = gVar;
            this.f96629b = h0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super iq3.f.a> hVar, tq.e eVar) {
            Object objA = this.f96628a.a(new a(hVar, this.f96629b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Liq3/d$e;", "<unused var>", "Liq3/e;", "Loq/i0;", "<anonymous>", "(Liq3/d$e;Liq3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<iq3.d.e, iq3.e, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f96640e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f96640e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<iq3.d.j> bVarY1 = h0.this.Y1();
                iq3.d.j.a aVar = iq3.d.j.a.f96556a;
                this.f96640e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(iq3.d.e eVar, iq3.e eVar2, tq.e<? super oq.i0> eVar3) {
            return h0.this.new f(eVar3).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Liq3/d$i;", "<unused var>", "Liq3/e;", "Loq/i0;", "<anonymous>", "(Liq3/d$i;Liq3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<iq3.d.i, iq3.e, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f96642e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f96642e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<iq3.d.j> bVarY1 = h0.this.Y1();
                iq3.d.j.e eVar = iq3.d.j.e.f96560a;
                this.f96642e = 1;
                if (bVarY1.F(eVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(iq3.d.i iVar, iq3.e eVar, tq.e<? super oq.i0> eVar2) {
            return h0.this.new g(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Liq3/d$l;", "<unused var>", "Liq3/e;", "Loq/i0;", "<anonymous>", "(Liq3/d$l;Liq3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<iq3.d.l, iq3.e, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f96644e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f96644e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<iq3.d.j> bVarY1 = h0.this.Y1();
                iq3.d.j.g gVar = iq3.d.j.g.f96562a;
                this.f96644e = 1;
                if (bVarY1.F(gVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(iq3.d.l lVar, iq3.e eVar, tq.e<? super oq.i0> eVar2) {
            return h0.this.new h(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liq3/e$b;", "it", "Loq/i0;", "<anonymous>", "(Liq3/e$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<iq3.e.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f96646e;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f96646e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            h0.this.d9(iq3.d.f.f96552a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(iq3.e.b bVar, tq.e<? super oq.i0> eVar) {
            return ((i) v(bVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return h0.this.new i(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Liq3/d$f;", "<unused var>", "Lk10/c0;", "Liq3/e$b;", "state", "Lk10/l;", "Liq3/e;", "<anonymous>", "(Liq3/d$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<iq3.d.f, k10.c0<iq3.e.b>, tq.e<? super k10.l<? extends iq3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f96648e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f96649f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f96649f;
            Object objE = uq.b.e();
            int i15 = this.f96648e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            h0 h0Var = h0.this;
            this.f96649f = vq.j.a(c0Var);
            this.f96648e = 1;
            Object objB9 = h0Var.B9(c0Var, this);
            return objB9 == objE ? objE : objB9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(iq3.d.f fVar, k10.c0<iq3.e.b> c0Var, tq.e<? super k10.l<? extends iq3.e>> eVar) {
            j jVar = h0.this.new j(eVar);
            jVar.f96649f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Liq3/d$h;", "<unused var>", "Liq3/e$a;", "state", "Loq/i0;", "<anonymous>", "(Liq3/d$h;Liq3/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<iq3.d.h, iq3.e.Empty, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f96651e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f96652f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r6.F(r2, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
        
            if (r6.F(r2, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f96652f
                iq3.e$a r0 = (iq3.e.Empty) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f96651e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1f
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L13
                goto L1b
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                oq.u.b(r6)
                goto L56
            L1f:
                oq.u.b(r6)
                boolean r6 = r0.getIsVoteIdeaDevFFEnabled()
                if (r6 == 0) goto L3f
                iq3.h0 r6 = iq3.h0.this
                xw.b r6 = r6.Y1()
                iq3.d$j$d r2 = iq3.d.j.C2256d.f96559a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f96652f = r0
                r5.f96651e = r4
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L56
                goto L55
            L3f:
                iq3.h0 r6 = iq3.h0.this
                xw.b r6 = r6.Y1()
                iq3.d$j$f r2 = iq3.d.j.f.f96561a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f96652f = r0
                r5.f96651e = r3
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L56
            L55:
                return r1
            L56:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: iq3.h0.k.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(iq3.d.h hVar, iq3.e.Empty empty, tq.e<? super oq.i0> eVar) {
            k kVar = h0.this.new k(eVar);
            kVar.f96652f = empty;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Liq3/d$g;", "action", "Liq3/e$c;", "state", "Loq/i0;", "<anonymous>", "(Liq3/d$g;Liq3/e$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<iq3.d.GoToDetails, iq3.e.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f96654e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f96655f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f96656g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            iq3.d.GoToDetails goToDetails = (iq3.d.GoToDetails) this.f96655f;
            iq3.e.Initialized initialized = (iq3.e.Initialized) this.f96656g;
            Object objE = uq.b.e();
            int i15 = this.f96654e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<iq3.d.j> bVarY1 = h0.this.Y1();
                iq3.d.j.GoToDetails goToDetails2 = new iq3.d.j.GoToDetails(new kp3.a.ActiveRoundIdea(goToDetails.getIdea(), initialized.getIdeasRoundDetails().getActiveRoundEndDate()));
                this.f96655f = vq.j.a(goToDetails);
                this.f96656g = vq.j.a(initialized);
                this.f96654e = 1;
                if (bVarY1.F(goToDetails2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(iq3.d.GoToDetails goToDetails, iq3.e.Initialized initialized, tq.e<? super oq.i0> eVar) {
            l lVar = h0.this.new l(eVar);
            lVar.f96655f = goToDetails;
            lVar.f96656g = initialized;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Liq3/d$k;", "action", "Liq3/e$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Liq3/d$k;Liq3/e$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<iq3.d.OpenUrlIntent, iq3.e.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f96658e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f96659f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            iq3.d.OpenUrlIntent openUrlIntent = (iq3.d.OpenUrlIntent) this.f96659f;
            uq.b.e();
            if (this.f96658e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            h0.this.L9(openUrlIntent.getUrl());
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(iq3.d.OpenUrlIntent openUrlIntent, iq3.e.Initialized initialized, tq.e<? super oq.i0> eVar) {
            m mVar = h0.this.new m(eVar);
            mVar.f96659f = openUrlIntent;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Liq3/d$a;", "action", "Lk10/c0;", "Liq3/e$c;", "state", "Lk10/l;", "Liq3/e;", "<anonymous>", "(Liq3/d$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<iq3.d.ChangeFilterCategory, k10.c0<iq3.e.Initialized>, tq.e<? super k10.l<? extends iq3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f96661e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f96662f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f96663g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iq3.e.Initialized O(iq3.d.ChangeFilterCategory changeFilterCategory, iq3.e.Initialized initialized) {
            return iq3.e.Initialized.b(initialized, changeFilterCategory.getFilterCategory(), null, false, null, false, 30, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final iq3.d.ChangeFilterCategory changeFilterCategory = (iq3.d.ChangeFilterCategory) this.f96662f;
            k10.c0 c0Var = (k10.c0) this.f96663g;
            uq.b.e();
            if (this.f96661e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: iq3.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.n.O(changeFilterCategory, (e.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(iq3.d.ChangeFilterCategory changeFilterCategory, k10.c0<iq3.e.Initialized> c0Var, tq.e<? super k10.l<? extends iq3.e>> eVar) {
            n nVar = new n(eVar);
            nVar.f96662f = changeFilterCategory;
            nVar.f96663g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Liq3/d$c;", "action", "Lk10/c0;", "Liq3/e$c;", "state", "Lk10/l;", "Liq3/e;", "<anonymous>", "(Liq3/d$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<iq3.d.ChangeSearchState, k10.c0<iq3.e.Initialized>, tq.e<? super k10.l<? extends iq3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f96664e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f96665f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f96666g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iq3.e.Initialized O(iq3.d.ChangeSearchState changeSearchState, iq3.e.Initialized initialized) {
            return iq3.e.Initialized.b(initialized, null, null, changeSearchState.getIsActive(), "", false, 19, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final iq3.d.ChangeSearchState changeSearchState = (iq3.d.ChangeSearchState) this.f96665f;
            k10.c0 c0Var = (k10.c0) this.f96666g;
            uq.b.e();
            if (this.f96664e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: iq3.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.o.O(changeSearchState, (e.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(iq3.d.ChangeSearchState changeSearchState, k10.c0<iq3.e.Initialized> c0Var, tq.e<? super k10.l<? extends iq3.e>> eVar) {
            o oVar = new o(eVar);
            oVar.f96665f = changeSearchState;
            oVar.f96666g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Liq3/d$b;", "action", "Lk10/c0;", "Liq3/e$c;", "state", "Lk10/l;", "Liq3/e;", "<anonymous>", "(Liq3/d$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<iq3.d.ChangeSearchQuery, k10.c0<iq3.e.Initialized>, tq.e<? super k10.l<? extends iq3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f96667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f96668f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f96669g;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iq3.e.Initialized O(iq3.d.ChangeSearchQuery changeSearchQuery, iq3.e.Initialized initialized) {
            return iq3.e.Initialized.b(initialized, null, null, false, changeSearchQuery.getQuery(), false, 23, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final iq3.d.ChangeSearchQuery changeSearchQuery = (iq3.d.ChangeSearchQuery) this.f96668f;
            k10.c0 c0Var = (k10.c0) this.f96669g;
            uq.b.e();
            if (this.f96667e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: iq3.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.p.O(changeSearchQuery, (e.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(iq3.d.ChangeSearchQuery changeSearchQuery, k10.c0<iq3.e.Initialized> c0Var, tq.e<? super k10.l<? extends iq3.e>> eVar) {
            p pVar = new p(eVar);
            pVar.f96668f = changeSearchQuery;
            pVar.f96669g = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Liq3/d$d;", "<unused var>", "Lk10/c0;", "Liq3/e$c;", "state", "Lk10/l;", "Liq3/e;", "<anonymous>", "(Liq3/d$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<iq3.d.C2255d, k10.c0<iq3.e.Initialized>, tq.e<? super k10.l<? extends iq3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f96670e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f96671f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iq3.e.Initialized O(iq3.e.Initialized initialized) {
            return iq3.e.Initialized.b(initialized, null, null, false, "", false, 23, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f96671f;
            uq.b.e();
            if (this.f96670e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: iq3.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.q.O((e.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(iq3.d.C2255d c2255d, k10.c0<iq3.e.Initialized> c0Var, tq.e<? super k10.l<? extends iq3.e>> eVar) {
            q qVar = new q(eVar);
            qVar.f96671f = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Liq3/d$h;", "<unused var>", "Liq3/e$c;", "state", "Loq/i0;", "<anonymous>", "(Liq3/d$h;Liq3/e$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<iq3.d.h, iq3.e.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f96672e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f96673f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r6.F(r2, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
        
            if (r6.F(r2, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f96673f
                iq3.e$c r0 = (iq3.e.Initialized) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f96672e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1f
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L13
                goto L1b
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                oq.u.b(r6)
                goto L56
            L1f:
                oq.u.b(r6)
                boolean r6 = r0.getIsVoteIdeaDevFFEnabled()
                if (r6 == 0) goto L3f
                iq3.h0 r6 = iq3.h0.this
                xw.b r6 = r6.Y1()
                iq3.d$j$d r2 = iq3.d.j.C2256d.f96559a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f96673f = r0
                r5.f96672e = r4
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L56
                goto L55
            L3f:
                iq3.h0 r6 = iq3.h0.this
                xw.b r6 = r6.Y1()
                iq3.d$j$f r2 = iq3.d.j.f.f96561a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f96673f = r0
                r5.f96672e = r3
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L56
            L55:
                return r1
            L56:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: iq3.h0.r.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(iq3.d.h hVar, iq3.e.Initialized initialized, tq.e<? super oq.i0> eVar) {
            r rVar = h0.this.new r(eVar);
            rVar.f96673f = initialized;
            return rVar.J(oq.i0.f148189a);
        }
    }

    public h0(yy.a aVar, jq3.e eVar, po0.d dVar, a14.w wVar, i70.n nVar, ib4.c cVar, c54.b bVar, ac4.a aVar2) {
        this.voteIdeaListMapper = eVar;
        this.fetchIdeasUC = dVar;
        this.openUrlIntentUseCase = wVar;
        this.snackBarManagerStateHolder = nVar;
        this.genericDomainErrorMapper = cVar;
        this.isFeatureEnabledUseCase = bVar;
        this.callActionWithLoaderUC = aVar2;
        iq3.e.b bVar2 = iq3.e.b.f96567a;
        this.stateMachine = aVar.a(bVar2, new er.l() { // from class: iq3.v
            @Override // er.l
            public final Object b(Object obj) {
                return h0.N9(this.f96705a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new e(e9().getState(), this), F9(bVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B9(k10.c0<iq3.e.b> c0Var, tq.e<? super k10.l<? extends iq3.e>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUC, null, new b(c0Var, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C9(dx.b bVar, final er.a<oq.i0> aVar, final er.a<oq.i0> aVar2, k10.c0<iq3.e.b> c0Var, tq.e<? super k10.l<? extends iq3.e>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f96624l;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f96624l = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f96622j;
        Object objE = uq.b.e();
        int i16 = cVar.f96624l;
        if (i16 == 0) {
            oq.u.b(obj);
            if (bVar instanceof dx.b.g.c) {
                return c0Var.d(new er.l() { // from class: iq3.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return h0.D9(this.f96706a, (e.b) obj2);
                    }
                });
            }
            jb4.b bVarB = this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: iq3.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.E9(aVar, aVar2, (ib4.c.b) obj2);
                }
            }, 2, null));
            xw.b<iq3.d.j> bVarY1 = Y1();
            iq3.d.j.Error error = new iq3.d.j.Error(bVarB);
            cVar.f96617d = vq.j.a(bVar);
            cVar.f96618e = vq.j.a(aVar);
            cVar.f96619f = vq.j.a(aVar2);
            cVar.f96620g = c0Var;
            cVar.f96621h = vq.j.a(bVarB);
            cVar.f96624l = 1;
            if (bVarY1.F(error, cVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (k10.c0) cVar.f96620g;
            oq.u.b(obj);
        }
        return c0Var.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iq3.e.Empty D9(h0 h0Var, iq3.e.b bVar) {
        return new iq3.e.Empty(h0Var.isFeatureEnabledUseCase.a(b54.c.VOTE_IDEA_DEV).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(er.a aVar, er.a aVar2, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            aVar.a();
        } else {
            aVar2.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final iq3.f.a F9(iq3.e state) {
        return this.voteIdeaListMapper.b(new jq3.e.Params(state, b9(iq3.d.h.f96554a), new er.l() { // from class: iq3.y
            @Override // er.l
            public final Object b(Object obj) {
                return h0.G9(this.f96709a, (Idea) obj);
            }
        }, b9(iq3.d.i.f96555a), b9(iq3.d.e.f96551a), new er.l() { // from class: iq3.z
            @Override // er.l
            public final Object b(Object obj) {
                return h0.H9(this.f96710a, (kq3.a) obj);
            }
        }, new er.l() { // from class: iq3.a0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.I9(this.f96541a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: iq3.b0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.J9(this.f96542a, (String) obj);
            }
        }, b9(iq3.d.C2255d.f96550a), new er.l() { // from class: iq3.c0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.K9(this.f96546a, (String) obj);
            }
        }, b9(iq3.d.l.f96564a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(h0 h0Var, Idea idea) {
        h0Var.d9(new iq3.d.GoToDetails(idea));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(h0 h0Var, kq3.a aVar) {
        h0Var.d9(new iq3.d.ChangeFilterCategory(aVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(h0 h0Var, boolean z15) {
        h0Var.d9(new iq3.d.ChangeSearchState(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(h0 h0Var, String str) {
        h0Var.d9(new iq3.d.ChangeSearchQuery(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(h0 h0Var, String str) {
        h0Var.d9(new iq3.d.OpenUrlIntent(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L9(String url) {
        i00.a.a(this, new d(url, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(final h0 h0Var, k10.v vVar) {
        vVar.c(q0.c(iq3.e.class), new er.l() { // from class: iq3.d0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.O9(this.f96565a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(iq3.e.b.class), new er.l() { // from class: iq3.e0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.P9(this.f96573a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(iq3.e.Empty.class), new er.l() { // from class: iq3.f0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.Q9(this.f96592a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(iq3.e.Initialized.class), new er.l() { // from class: iq3.g0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.R9(this.f96595a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(h0 h0Var, k10.z zVar) {
        f fVar = h0Var.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(iq3.d.e.class), oVar, fVar);
        zVar.x(q0.c(iq3.d.i.class), oVar, h0Var.new g(null));
        zVar.x(q0.c(iq3.d.l.class), oVar, h0Var.new h(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(h0 h0Var, k10.z zVar) {
        zVar.C(h0Var.new i(null));
        j jVar = h0Var.new j(null);
        zVar.v(q0.c(iq3.d.f.class), k10.o.CANCEL_PREVIOUS, jVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(h0 h0Var, k10.z zVar) {
        k kVar = h0Var.new k(null);
        zVar.x(q0.c(iq3.d.h.class), k10.o.CANCEL_PREVIOUS, kVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(h0 h0Var, k10.z zVar) {
        l lVar = h0Var.new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(iq3.d.GoToDetails.class), oVar, lVar);
        zVar.x(q0.c(iq3.d.OpenUrlIntent.class), oVar, h0Var.new m(null));
        zVar.v(q0.c(iq3.d.ChangeFilterCategory.class), oVar, new n(null));
        zVar.v(q0.c(iq3.d.ChangeSearchState.class), oVar, new o(null));
        zVar.v(q0.c(iq3.d.ChangeSearchQuery.class), oVar, new p(null));
        zVar.v(q0.c(iq3.d.C2255d.class), oVar, new q(null));
        zVar.x(q0.c(iq3.d.h.class), oVar, h0Var.new r(null));
        return oq.i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: M9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<iq3.d.j> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<iq3.e, iq3.d> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<iq3.f.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
