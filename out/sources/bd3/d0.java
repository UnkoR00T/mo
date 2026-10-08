package bd3;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.q0;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import uc3.PassportVisualization;
import uc3.PassportsData;
import zc3.SetupData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B[\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u0013\u0010*\u001a\u00020)*\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010+J\u0018\u0010.\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020,H\u0096\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\b0\u00101R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR&\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030H8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR \u0010T\u001a\b\u0012\u0004\u0012\u00020O0N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR \u0010Z\u001a\b\u0012\u0004\u0012\u00020)0U8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\\0[8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b@\u0010]¨\u0006_"}, d2 = {"Lbd3/d0;", "Ll00/g;", "Lbd3/d;", "Lbd3/a;", "Lbd3/e;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lwc3/b;", "getOrFetchPassportsUseCase", "Lwc3/i;", "updatePassportsDataUC", "Lcd3/d;", "mapper", "Lib4/c;", "domainErrorMapper", "snackBarManagerStateHolder", "Lmx/c;", "labelProvider", "Lwc3/a;", "fetchAndSavePassportsUC", "Ltc3/c;", "userDataMobileInteractor", "Lbd3/b;", "setupData", "<init>", "(Lyy/a;Lwc3/b;Lwc3/i;Lcd3/d;Lib4/c;Li70/n;Lmx/c;Lwc3/a;Ltc3/c;Lbd3/b;)V", "Ldx/b;", "domainError", "retryAction", "Loq/i0;", "B9", "(Ldx/b;Lbd3/a;)V", "", "wasUpdated", "C9", "(Z)V", "Lcb4/d;", "z9", "()Lcb4/d;", "Lbd3/e$a;", "D9", "(Lbd3/d;)Lbd3/e$a;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lwc3/b;", "c", "Lwc3/i;", "d", "Lcd3/d;", "e", "Lib4/c;", "f", "Li70/n;", "g", "Lmx/c;", "h", "Lwc3/a;", "j", "Ltc3/c;", "k", "Lbd3/b;", "Lbd3/d$b;", "l", "Lbd3/d$b;", "initialState", "Lk10/t;", "m", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lbd3/a$e;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d0 extends l00.g<bd3.d, bd3.a> implements bd3.e, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wc3.b getOrFetchPassportsUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wc3.i updatePassportsDataUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final cd3.d mapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final wc3.a fetchAndSavePassportsUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final tc3.c userDataMobileInteractor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final bd3.d.b initialState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k10.t<bd3.d, bd3.a> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<bd3.a.e> navAction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p0<bd3.e.a> state;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18455e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ dx.b f18457g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ bd3.a f18458h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(dx.b bVar, bd3.a aVar, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f18457g = bVar;
            this.f18458h = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 V(d0 d0Var, bd3.a aVar, ib4.c.b bVar) {
            if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                d0Var.d9(aVar);
            } else if (bVar instanceof ib4.c.b.AbstractC2161b.a) {
                d0Var.d9(bd3.a.C0465a.f18421a);
            }
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f18455e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                ib4.c cVar = d0.this.domainErrorMapper;
                dx.b bVar = this.f18457g;
                final d0 d0Var2 = d0.this;
                final bd3.a aVar = this.f18458h;
                bd3.a.e.Error error = new bd3.a.e.Error(cVar.b(new ib4.c.Params(bVar, false, new er.l() { // from class: bd3.c0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.a.V(d0Var2, aVar, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f18455e = 1;
                if (d0Var.F(error, this) == objE) {
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

        public final tq.e<oq.i0> N(tq.e<?> eVar) {
            return d0.this.new a(this.f18457g, this.f18458h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((a) N(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<bd3.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f18459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f18460b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f18461a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d0 f18462b;

            /* JADX INFO: renamed from: bd3.d0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0467a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f18463d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f18464e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f18465f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f18467h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f18468j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f18469k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f18470l;

                public C0467a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f18463d = obj;
                    this.f18464e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, d0 d0Var) {
                this.f18461a = hVar;
                this.f18462b = d0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0467a c0467a;
                if (eVar instanceof C0467a) {
                    c0467a = (C0467a) eVar;
                    int i15 = c0467a.f18464e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0467a.f18464e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0467a = new C0467a(eVar);
                    }
                } else {
                    c0467a = new C0467a(eVar);
                }
                Object obj2 = c0467a.f18463d;
                Object objE = uq.b.e();
                int i16 = c0467a.f18464e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f18461a;
                    bd3.e.a aVarD9 = this.f18462b.D9((bd3.d) obj);
                    c0467a.f18465f = vq.j.a(obj);
                    c0467a.f18467h = vq.j.a(c0467a);
                    c0467a.f18468j = vq.j.a(obj);
                    c0467a.f18469k = vq.j.a(hVar);
                    c0467a.f18470l = 0;
                    c0467a.f18464e = 1;
                    if (hVar.F(aVarD9, c0467a) == objE) {
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

        public b(mu.g gVar, d0 d0Var) {
            this.f18459a = gVar;
            this.f18460b = d0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super bd3.e.a> hVar, tq.e eVar) {
            Object objA = this.f18459a.a(new a(hVar, this.f18460b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbd3/d$b;", "it", "Loq/i0;", "<anonymous>", "(Lbd3/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<bd3.d.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18471e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f18471e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            d0.this.d9(bd3.a.b.f18422a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(bd3.d.b bVar, tq.e<? super oq.i0> eVar) {
            return ((c) v(bVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return d0.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lbd3/a$b;", "action", "Lk10/c0;", "Lbd3/d$b;", "state", "Lk10/l;", "Lbd3/d;", "<anonymous>", "(Lbd3/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<bd3.a.b, k10.c0<bd3.d.b>, tq.e<? super k10.l<? extends bd3.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f18474f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f18475g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bd3.d.Initialized O(PassportsData passportsData, bd3.d.b bVar) {
            return new bd3.d.Initialized(null, passportsData, 1, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
        
            if (r7 == r2) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
        
            if (r7 == r2) goto L21;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f18474f
                bd3.a$b r0 = (bd3.a.b) r0
                java.lang.Object r1 = r6.f18475g
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r6.f18473e
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L26
                if (r3 == r5) goto L22
                if (r3 != r4) goto L1a
                oq.u.b(r7)
                goto L77
            L1a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L22:
                oq.u.b(r7)
                goto L4a
            L26:
                oq.u.b(r7)
                bd3.d0 r7 = bd3.d0.this
                bd3.b r7 = bd3.d0.s9(r7)
                boolean r7 = r7.getForceFetchNewPassports()
                if (r7 == 0) goto L62
                bd3.d0 r7 = bd3.d0.this
                wc3.a r7 = bd3.d0.p9(r7)
                gz.b$a$a r3 = gz.b.a.C1792a.f78542a
                r6.f18474f = r0
                r6.f18475g = r1
                r6.f18473e = r5
                java.lang.Object r7 = r7.a(r3, r6)
                if (r7 != r2) goto L4a
                goto L76
            L4a:
                dx.i r7 = (dx.i) r7
                bd3.d0 r3 = bd3.d0.this
                boolean r5 = r7 instanceof dx.i.Left
                if (r5 == 0) goto L62
                dx.i$b r7 = (dx.i.Left) r7
                java.lang.Object r7 = r7.b()
                dx.b r7 = (dx.b) r7
                bd3.d0.v9(r3, r7, r0)
                k10.l r7 = r1.c()
                return r7
            L62:
                bd3.d0 r7 = bd3.d0.this
                wc3.b r7 = bd3.d0.q9(r7)
                gz.b$a$a r3 = gz.b.a.C1792a.f78542a
                r6.f18474f = r0
                r6.f18475g = r1
                r6.f18473e = r4
                java.lang.Object r7 = r7.a(r3, r6)
                if (r7 != r2) goto L77
            L76:
                return r2
            L77:
                dx.i r7 = (dx.i) r7
                bd3.d0 r2 = bd3.d0.this
                boolean r3 = r7 instanceof dx.i.Left
                if (r3 == 0) goto L8f
                dx.i$b r7 = (dx.i.Left) r7
                java.lang.Object r7 = r7.b()
                dx.b r7 = (dx.b) r7
                bd3.d0.v9(r2, r7, r0)
                k10.l r7 = r1.c()
                return r7
            L8f:
                boolean r0 = r7 instanceof dx.i.Right
                if (r0 == 0) goto La5
                dx.i$c r7 = (dx.i.Right) r7
                java.lang.Object r7 = r7.b()
                uc3.i r7 = (uc3.PassportsData) r7
                bd3.e0 r0 = new bd3.e0
                r0.<init>()
                k10.l r7 = r1.d(r0)
                return r7
            La5:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: bd3.d0.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(bd3.a.b bVar, k10.c0<bd3.d.b> c0Var, tq.e<? super k10.l<? extends bd3.d>> eVar) {
            d dVar = d0.this.new d(eVar);
            dVar.f18474f = bVar;
            dVar.f18475g = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbd3/a$a;", "<unused var>", "Lbd3/d;", "Loq/i0;", "<anonymous>", "(Lbd3/a$a;Lbd3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<bd3.a.C0465a, bd3.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18477e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f18477e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<bd3.a.e> bVarY1 = d0.this.Y1();
                bd3.a.e.C0466a c0466a = bd3.a.e.C0466a.f18425a;
                this.f18477e = 1;
                if (bVarY1.F(c0466a, this) == objE) {
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
        public final Object w(bd3.a.C0465a c0465a, bd3.d dVar, tq.e<? super oq.i0> eVar) {
            return d0.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbd3/a$g;", "<unused var>", "Lbd3/d;", "Loq/i0;", "<anonymous>", "(Lbd3/a$g;Lbd3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<bd3.a.g, bd3.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18479e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f18479e;
            if (i15 == 0) {
                oq.u.b(obj);
                boolean zA = d0.this.userDataMobileInteractor.a();
                if (zA) {
                    d0.this.d9(bd3.a.c.f18423a);
                } else {
                    if (zA) {
                        throw new oq.p();
                    }
                    d0 d0Var = d0.this;
                    bd3.a.e.ShowDialog showDialog = new bd3.a.e.ShowDialog(d0.this.z9());
                    this.f18479e = 1;
                    if (d0Var.F(showDialog, this) == objE) {
                        return objE;
                    }
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
        public final Object w(bd3.a.g gVar, bd3.d dVar, tq.e<? super oq.i0> eVar) {
            return d0.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lbd3/a$c;", "action", "Lk10/c0;", "Lbd3/d;", "state", "Lk10/l;", "<anonymous>", "(Lbd3/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<bd3.a.c, k10.c0<bd3.d>, tq.e<? super k10.l<? extends bd3.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18481e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f18482f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f18483g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bd3.d.Initialized O(wc3.i.b bVar, bd3.d dVar) {
            return new bd3.d.Initialized(null, ((wc3.i.b.Updated) bVar).getData(), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            bd3.a.c cVar = (bd3.a.c) this.f18482f;
            k10.c0 c0Var = (k10.c0) this.f18483g;
            Object objE = uq.b.e();
            int i15 = this.f18481e;
            if (i15 == 0) {
                oq.u.b(obj);
                wc3.i iVar = d0.this.updatePassportsDataUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f18482f = cVar;
                this.f18483g = c0Var;
                this.f18481e = 1;
                obj = iVar.a(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar2 = (dx.i) obj;
            d0 d0Var = d0.this;
            if (iVar2 instanceof dx.i.Left) {
                d0Var.B9((dx.b) ((dx.i.Left) iVar2).b(), cVar);
                return c0Var.c();
            }
            if (!(iVar2 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final wc3.i.b bVar = (wc3.i.b) ((dx.i.Right) iVar2).b();
            if (bVar instanceof wc3.i.b.Updated) {
                d0Var.C9(true);
                return c0Var.d(new er.l() { // from class: bd3.f0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.g.O(bVar, (d) obj2);
                    }
                });
            }
            if (!(bVar instanceof wc3.i.b.a)) {
                throw new oq.p();
            }
            d0Var.C9(false);
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(bd3.a.c cVar, k10.c0<bd3.d> c0Var, tq.e<? super k10.l<? extends bd3.d>> eVar) {
            g gVar = d0.this.new g(eVar);
            gVar.f18482f = cVar;
            gVar.f18483g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lbd3/a$f;", "action", "Lk10/c0;", "Lbd3/d$a;", "state", "Lk10/l;", "Lbd3/d;", "<anonymous>", "(Lbd3/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<bd3.a.SwitchTab, k10.c0<bd3.d.Initialized>, tq.e<? super k10.l<? extends bd3.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18485e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f18486f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f18487g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bd3.d.Initialized O(bd3.a.SwitchTab switchTab, bd3.d.Initialized initialized) {
            return bd3.d.Initialized.b(initialized, switchTab.getTab(), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final bd3.a.SwitchTab switchTab = (bd3.a.SwitchTab) this.f18486f;
            k10.c0 c0Var = (k10.c0) this.f18487g;
            uq.b.e();
            if (this.f18485e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: bd3.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.h.O(switchTab, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(bd3.a.SwitchTab switchTab, k10.c0<bd3.d.Initialized> c0Var, tq.e<? super k10.l<? extends bd3.d>> eVar) {
            h hVar = new h(eVar);
            hVar.f18486f = switchTab;
            hVar.f18487g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbd3/a$d;", "action", "Lbd3/d$a;", "state", "Loq/i0;", "<anonymous>", "(Lbd3/a$d;Lbd3/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<bd3.a.GoToPassportDetails, bd3.d.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18488e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f18489f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f18490g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            bd3.a.GoToPassportDetails goToPassportDetails = (bd3.a.GoToPassportDetails) this.f18489f;
            bd3.d.Initialized initialized = (bd3.d.Initialized) this.f18490g;
            Object objE = uq.b.e();
            int i15 = this.f18488e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                bd3.a.e.GoToPassportDetails goToPassportDetails2 = new bd3.a.e.GoToPassportDetails(new SetupData(initialized.getTab() == bd3.c.VALID, goToPassportDetails.getPassport()));
                this.f18489f = vq.j.a(goToPassportDetails);
                this.f18490g = vq.j.a(initialized);
                this.f18488e = 1;
                if (d0Var.F(goToPassportDetails2, this) == objE) {
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
        public final Object w(bd3.a.GoToPassportDetails goToPassportDetails, bd3.d.Initialized initialized, tq.e<? super oq.i0> eVar) {
            i iVar = d0.this.new i(eVar);
            iVar.f18489f = goToPassportDetails;
            iVar.f18490g = initialized;
            return iVar.J(oq.i0.f148189a);
        }
    }

    public d0(yy.a aVar, wc3.b bVar, wc3.i iVar, cd3.d dVar, ib4.c cVar, i70.n nVar, mx.c cVar2, wc3.a aVar2, tc3.c cVar3, SetupData setupData) {
        this.getOrFetchPassportsUseCase = bVar;
        this.updatePassportsDataUC = iVar;
        this.mapper = dVar;
        this.domainErrorMapper = cVar;
        this.snackBarManagerStateHolder = nVar;
        this.labelProvider = cVar2;
        this.fetchAndSavePassportsUC = aVar2;
        this.userDataMobileInteractor = cVar3;
        this.setupData = setupData;
        bd3.d.b bVar2 = bd3.d.b.f18441a;
        this.initialState = bVar2;
        this.stateMachine = aVar.a(bVar2, new er.l() { // from class: bd3.b0
            @Override // er.l
            public final Object b(Object obj) {
                return d0.H9(this.f18432a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), D9(bVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A9() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B9(dx.b domainError, bd3.a retryAction) {
        i00.a.a(this, new a(domainError, retryAction, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C9(boolean wasUpdated) {
        y(new p50.a.DefaultWithIcon(this.labelProvider.c(wasUpdated ? mc3.a.f125580m : mc3.a.f125564e), false, null, null, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bd3.e.a D9(bd3.d dVar) {
        return this.mapper.b(new cd3.d.Params(dVar, b9(bd3.a.C0465a.f18421a), new er.l() { // from class: bd3.v
            @Override // er.l
            public final Object b(Object obj) {
                return d0.E9(this.f18539a, (PassportVisualization) obj);
            }
        }, b9(bd3.a.g.f18430a), new er.l() { // from class: bd3.w
            @Override // er.l
            public final Object b(Object obj) {
                return d0.F9(this.f18540a, (c) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(d0 d0Var, PassportVisualization passportVisualization) {
        d0Var.d9(new bd3.a.GoToPassportDetails(passportVisualization));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(d0 d0Var, bd3.c cVar) {
        d0Var.d9(new bd3.a.SwitchTab(cVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(final d0 d0Var, k10.v vVar) {
        vVar.c(q0.c(bd3.d.b.class), new er.l() { // from class: bd3.x
            @Override // er.l
            public final Object b(Object obj) {
                return d0.I9(this.f18541a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(bd3.d.class), new er.l() { // from class: bd3.y
            @Override // er.l
            public final Object b(Object obj) {
                return d0.J9(this.f18542a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(bd3.d.Initialized.class), new er.l() { // from class: bd3.z
            @Override // er.l
            public final Object b(Object obj) {
                return d0.K9(this.f18543a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(d0 d0Var, k10.z zVar) {
        zVar.C(d0Var.new c(null));
        d dVar = d0Var.new d(null);
        zVar.v(q0.c(bd3.a.b.class), k10.o.CANCEL_PREVIOUS, dVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(d0 d0Var, k10.z zVar) {
        e eVar = d0Var.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(bd3.a.C0465a.class), oVar, eVar);
        zVar.x(q0.c(bd3.a.g.class), oVar, d0Var.new f(null));
        zVar.v(q0.c(bd3.a.c.class), oVar, d0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(d0 d0Var, k10.z zVar) {
        h hVar = new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(bd3.a.SwitchTab.class), oVar, hVar);
        zVar.x(q0.c(bd3.a.GoToPassportDetails.class), oVar, d0Var.new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData z9() {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(mc3.a.f125571h0), this.labelProvider.c(mc3.a.f125569g0), new DialogButtonTextData(this.labelProvider.c(mc3.a.f125562d), null, new er.a() { // from class: bd3.a0
            @Override // er.a
            public final Object a() {
                return d0.A9();
            }
        }, 2, null), null, null, null, 112, null);
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: G9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<bd3.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<bd3.d, bd3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<bd3.e.a> getState() {
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

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(bd3.a.e eVar, tq.e<? super oq.i0> eVar2) {
        return super.F(eVar, eVar2);
    }
}
