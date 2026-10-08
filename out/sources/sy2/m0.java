package sy2;

import cb4.DialogData;
import n20.State;
import o20.t2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import qy2.Document;
import qy2.NipipCardContainerData;
import qy2.NipipCardData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007B\u0083\u0001\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0001\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\u00020(2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b)\u0010*J'\u00101\u001a\u000200*\u00020+2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0,H\u0002¢\u0006\u0004\b1\u00102J\u0018\u00105\u001a\u00020.2\u0006\u00104\u001a\u000203H\u0096\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b7\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R \u0010c\u001a\b\u0012\u0004\u0012\u00020^0]8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR,\u0010i\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040d8\u0014X\u0094\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR \u0010'\u001a\b\u0012\u0004\u0012\u00020(0j8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020p0o8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010q¨\u0006s"}, d2 = {"Lsy2/m0;", "Ll00/g;", "Ln20/b;", "Lsy2/n;", "Ln20/a;", "Lsy2/q;", "", "Li70/n;", "Ln20/j;", "stateMachineFactory", "Lty2/b;", "mapper", "Lib4/c;", "genericDomainErrorMapper", "snackBarManagerStateHolder", "La14/w;", "openUrlIntentUseCase", "Lty2/c;", "pwzDialogMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lmz3/z;", "updateDocumentAsyncUC", "Lmz3/w;", "shouldDisplayDownloadLoaderUC", "Lhb4/d;", "errorVMSFactory", "Lcb4/j;", "dialogVMSFactory", "Lo20/t2$a;", "deps", "Lmx/c;", "labelProvider", "Lpy2/a;", "pwzCardContainersInteractor", "Lsy2/m;", "setupData", "<init>", "(Ln20/j;Lty2/b;Lib4/c;Li70/n;La14/w;Lty2/c;Lac4/a;Lmz3/z;Lmz3/w;Lhb4/d;Lcb4/j;Lo20/t2$a;Lmx/c;Lpy2/a;Lsy2/m;)V", "state", "Lsy2/q$a;", "M9", "(Ln20/b;)Lsy2/q$a;", "Ldx/b;", "Lkotlin/Function1;", "Lib4/c$b;", "Loq/i0;", "resultAction", "Lhb4/c;", "L9", "(Ldx/b;Ler/l;)Lhb4/c;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lty2/b;", "c", "Lib4/c;", "d", "Li70/n;", "e", "La14/w;", "f", "Lty2/c;", "g", "Lac4/a;", "h", "Lmz3/z;", "j", "Lmz3/w;", "k", "Lhb4/d;", "l", "Lcb4/j;", "m", "Lo20/t2$a;", "n", "Lmx/c;", "p", "Lpy2/a;", "q", "Lsy2/m;", "Lsy2/n$d;", "r", "Lsy2/n$d;", "initialState", "Lrq0/b;", "s", "Lrq0/b;", "documentType", "Lxw/b;", "Lsy2/e;", "t", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "v", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "w", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "pwzcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m0 extends l00.g<State<sy2.n>, n20.a> implements sy2.q, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ty2.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ty2.c pwzDialogMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mz3.z updateDocumentAsyncUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mz3.w shouldDisplayDownloadLoaderUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final t2.a deps;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final py2.a pwzCardContainersInteractor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final sy2.n.d initialState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final rq0.b documentType;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final xw.b<sy2.e> navAction;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State<sy2.n>, n20.a> stateMachine;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<sy2.q.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<sy2.q.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f185721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f185722b;

        /* JADX INFO: renamed from: sy2.m0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4798a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f185723a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m0 f185724b;

            /* JADX INFO: renamed from: sy2.m0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4799a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f185725d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f185726e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f185727f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f185729h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f185730j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f185731k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f185732l;

                public C4799a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f185725d = obj;
                    this.f185726e |= PKIFailureInfo.systemUnavail;
                    return C4798a.this.F(null, this);
                }
            }

            public C4798a(mu.h hVar, m0 m0Var) {
                this.f185723a = hVar;
                this.f185724b = m0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4799a c4799a;
                if (eVar instanceof C4799a) {
                    c4799a = (C4799a) eVar;
                    int i15 = c4799a.f185726e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4799a.f185726e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4799a = new C4799a(eVar);
                    }
                } else {
                    c4799a = new C4799a(eVar);
                }
                Object obj2 = c4799a.f185725d;
                Object objE = uq.b.e();
                int i16 = c4799a.f185726e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f185723a;
                    sy2.q.a aVarM9 = this.f185724b.M9((State) obj);
                    c4799a.f185727f = vq.j.a(obj);
                    c4799a.f185729h = vq.j.a(c4799a);
                    c4799a.f185730j = vq.j.a(obj);
                    c4799a.f185731k = vq.j.a(hVar);
                    c4799a.f185732l = 0;
                    c4799a.f185726e = 1;
                    if (hVar.F(aVarM9, c4799a) == objE) {
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

        public a(mu.g gVar, m0 m0Var) {
            this.f185721a = gVar;
            this.f185722b = m0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super sy2.q.a> hVar, tq.e eVar) {
            Object objA = this.f185721a.a(new C4798a(hVar, this.f185722b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lsy2/n$d;", "state", "Lk10/l;", "Lsy2/n;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<k10.c0<sy2.n.d>, tq.e<? super k10.l<? extends sy2.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185733e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185734f;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sy2.p O(sy2.n.d dVar) {
            return sy2.p.f185824a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
        
            if (r8.F(r2, r7) == r1) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f185734f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f185733e
                r3 = 1
                r4 = 2
                if (r2 == 0) goto L22
                if (r2 == r3) goto L1e
                if (r2 != r4) goto L16
                oq.u.b(r8)
                goto L65
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                oq.u.b(r8)
                goto L41
            L22:
                oq.u.b(r8)
                sy2.m0 r8 = sy2.m0.this
                mz3.w r8 = sy2.m0.G9(r8)
                mz3.w$a r2 = new mz3.w$a
                sy2.m0 r5 = sy2.m0.this
                rq0.b r5 = sy2.m0.A9(r5)
                r2.<init>(r5)
                r7.f185734f = r0
                r7.f185733e = r3
                java.lang.Object r8 = r8.c(r2, r7)
                if (r8 != r1) goto L41
                goto L64
            L41:
                mz3.w$b r8 = (mz3.w.b) r8
                boolean r2 = r8 instanceof mz3.w.b.NotReady
                if (r2 == 0) goto L6a
                sy2.m0 r8 = sy2.m0.this
                sy2.e$c r2 = new sy2.e$c
                gv3.b$b r3 = new gv3.b$b
                sy2.m0 r5 = sy2.m0.this
                rq0.b r5 = sy2.m0.A9(r5)
                r6 = 0
                r3.<init>(r5, r6, r4, r6)
                r2.<init>(r3)
                r7.f185734f = r0
                r7.f185733e = r4
                java.lang.Object r8 = r8.F(r2, r7)
                if (r8 != r1) goto L65
            L64:
                return r1
            L65:
                k10.l r8 = r0.c()
                return r8
            L6a:
                mz3.w$b$b r1 = mz3.w.b.C3231b.f129717a
                boolean r8 = fr.t.c(r8, r1)
                if (r8 == 0) goto L7c
                sy2.n0 r8 = new sy2.n0
                r8.<init>()
                k10.l r8 = r0.d(r8)
                return r8
            L7c:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: sy2.m0.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<sy2.n.d> c0Var, tq.e<? super k10.l<? extends sy2.n>> eVar) {
            return ((b) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b bVar = m0.this.new b(eVar);
            bVar.f185734f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsy2/a;", "<unused var>", "Lsy2/n$d;", "Loq/i0;", "<anonymous>", "(Lsy2/a;Lsy2/n$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<sy2.a, sy2.n.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185736e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f185736e;
            if (i15 == 0) {
                oq.u.b(obj);
                m0 m0Var = m0.this;
                sy2.e.a aVar = sy2.e.a.f185682a;
                this.f185736e = 1;
                if (m0Var.F(aVar, this) == objE) {
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
        public final Object w(sy2.a aVar, sy2.n.d dVar, tq.e<? super oq.i0> eVar) {
            return m0.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsy2/p;", "it", "Loq/i0;", "<anonymous>", "(Lsy2/p;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<sy2.p, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185738e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f185738e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            m0.this.d9(sy2.d.f185680a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(sy2.p pVar, tq.e<? super oq.i0> eVar) {
            return ((d) v(pVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return m0.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsy2/h;", "action", "Lk10/c0;", "Lsy2/p;", "state", "Lk10/l;", "Lsy2/n;", "<anonymous>", "(Lsy2/h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ShowError, k10.c0<sy2.p>, tq.e<? super k10.l<? extends sy2.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185740e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185741f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f185742g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error V(final m0 m0Var, ShowError showError, sy2.p pVar) {
            return new Error(m0Var.L9(showError.getDomainError(), new er.l() { // from class: sy2.p0
                @Override // er.l
                public final Object b(Object obj) {
                    return m0.e.X(m0Var, (ib4.c.b) obj);
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X(m0 m0Var, ib4.c.b bVar) {
            if ((bVar instanceof ib4.c.b.a.Secondary) || (bVar instanceof ib4.c.b.AbstractC2161b.a) || (bVar instanceof ib4.c.b.a.Close)) {
                m0Var.d9(sy2.a.f185670a);
            } else {
                if (!(bVar instanceof ib4.c.b.AbstractC2161b.C2162b) && !(bVar instanceof ib4.c.b.a.Primary)) {
                    throw new oq.p();
                }
                m0Var.d9(sy2.d.f185680a);
            }
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ShowError showError = (ShowError) this.f185741f;
            k10.c0 c0Var = (k10.c0) this.f185742g;
            uq.b.e();
            if (this.f185740e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final m0 m0Var = m0.this;
            return c0Var.d(new er.l() { // from class: sy2.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return m0.e.V(m0Var, showError, (p) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowError showError, k10.c0<sy2.p> c0Var, tq.e<? super k10.l<? extends sy2.n>> eVar) {
            e eVar2 = m0.this.new e(eVar);
            eVar2.f185741f = showError;
            eVar2.f185742g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsy2/a;", "<unused var>", "Lsy2/p;", "Loq/i0;", "<anonymous>", "(Lsy2/a;Lsy2/p;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<sy2.a, sy2.p, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185744e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f185744e;
            if (i15 == 0) {
                oq.u.b(obj);
                m0 m0Var = m0.this;
                sy2.e.a aVar = sy2.e.a.f185682a;
                this.f185744e = 1;
                if (m0Var.F(aVar, this) == objE) {
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
        public final Object w(sy2.a aVar, sy2.p pVar, tq.e<? super oq.i0> eVar) {
            return m0.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsy2/d;", "<unused var>", "Lk10/c0;", "Lsy2/p;", "state", "Lk10/l;", "Lsy2/n;", "<anonymous>", "(Lsy2/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<sy2.d, k10.c0<sy2.p>, tq.e<? super k10.l<? extends sy2.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185746e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185747f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sy2.n.a.Screen O(m0 m0Var, NipipCardData nipipCardData, sy2.p pVar) {
            return new sy2.n.a.Screen(new DocumentStateData(nipipCardData, new t2(m0Var.deps, androidx.p016lifecycle.u0.a(m0Var))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f185747f;
            Object objE = uq.b.e();
            int i15 = this.f185746e;
            if (i15 == 0) {
                oq.u.b(obj);
                py2.a aVar = m0.this.pwzCardContainersInteractor;
                NipipCardContainerData.a pwzType = m0.this.setupData.getPwzType();
                this.f185747f = c0Var;
                this.f185746e = 1;
                obj = aVar.a(pwzType, this);
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
            final m0 m0Var = m0.this;
            if (iVar instanceof dx.i.Left) {
                m0Var.d9(new ShowError((dx.b) ((dx.i.Left) iVar).b()));
                return c0Var.c();
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final NipipCardData nipipCardData = (NipipCardData) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: sy2.q0
                @Override // er.l
                public final Object b(Object obj2) {
                    return m0.g.O(m0Var, nipipCardData, (p) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sy2.d dVar, k10.c0<sy2.p> c0Var, tq.e<? super k10.l<? extends sy2.n>> eVar) {
            g gVar = m0.this.new g(eVar);
            gVar.f185747f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsy2/d;", "<unused var>", "Lk10/c0;", "Lsy2/o;", "state", "Lk10/l;", "Lsy2/n;", "<anonymous>", "(Lsy2/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<sy2.d, k10.c0<Error>, tq.e<? super k10.l<? extends sy2.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185749e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185750f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sy2.p O(Error error) {
            return sy2.p.f185824a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f185750f;
            uq.b.e();
            if (this.f185749e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: sy2.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return m0.h.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sy2.d dVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends sy2.n>> eVar) {
            h hVar = new h(eVar);
            hVar.f185750f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsy2/a;", "<unused var>", "Lsy2/o;", "Loq/i0;", "<anonymous>", "(Lsy2/a;Lsy2/o;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<sy2.a, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185751e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f185751e;
            if (i15 == 0) {
                oq.u.b(obj);
                m0 m0Var = m0.this;
                sy2.e.a aVar = sy2.e.a.f185682a;
                this.f185751e = 1;
                if (m0Var.F(aVar, this) == objE) {
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
        public final Object w(sy2.a aVar, Error error, tq.e<? super oq.i0> eVar) {
            return m0.this.new i(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsy2/a;", "<unused var>", "Lsy2/n$a$b;", "Loq/i0;", "<anonymous>", "(Lsy2/a;Lsy2/n$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<sy2.a, sy2.n.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185753e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f185753e;
            if (i15 == 0) {
                oq.u.b(obj);
                m0 m0Var = m0.this;
                sy2.e.a aVar = sy2.e.a.f185682a;
                this.f185753e = 1;
                if (m0Var.F(aVar, this) == objE) {
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
        public final Object w(sy2.a aVar, sy2.n.a.Screen screen, tq.e<? super oq.i0> eVar) {
            return m0.this.new j(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsy2/k;", "action", "Lk10/c0;", "Lsy2/n$a$b;", "state", "Lk10/l;", "Lsy2/n;", "<anonymous>", "(Lsy2/k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<UpdateDocument, k10.c0<sy2.n.a.Screen>, tq.e<? super k10.l<? extends sy2.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185755e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185756f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f185757g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sy2.n.c.Screen O(UpdateDocument updateDocument, k10.c0 c0Var, sy2.n.a.Screen screen) {
            return new sy2.n.c.Screen(updateDocument.getUpdateMethodType(), ((sy2.n.a.Screen) c0Var.a()).getDocumentStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final UpdateDocument updateDocument = (UpdateDocument) this.f185756f;
            final k10.c0 c0Var = (k10.c0) this.f185757g;
            uq.b.e();
            if (this.f185755e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: sy2.s0
                @Override // er.l
                public final Object b(Object obj2) {
                    return m0.k.O(updateDocument, c0Var, (n.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(UpdateDocument updateDocument, k10.c0<sy2.n.a.Screen> c0Var, tq.e<? super k10.l<? extends sy2.n>> eVar) {
            k kVar = new k(eVar);
            kVar.f185756f = updateDocument;
            kVar.f185757g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsy2/f;", "action", "Lsy2/n$a$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lsy2/f;Lsy2/n$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<OnUrlClick, sy2.n.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185758e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185759f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OnUrlClick onUrlClick = (OnUrlClick) this.f185759f;
            Object objE = uq.b.e();
            int i15 = this.f185758e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = m0.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(onUrlClick.getUrl(), false, 2, null);
                this.f185759f = vq.j.a(onUrlClick);
                this.f185758e = 1;
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
            m0 m0Var = m0.this;
            if (iVar instanceof dx.i.Left) {
                m0Var.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OnUrlClick onUrlClick, sy2.n.a.Screen screen, tq.e<? super oq.i0> eVar) {
            l lVar = m0.this.new l(eVar);
            lVar.f185759f = onUrlClick;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsy2/g;", "<unused var>", "Lk10/c0;", "Lsy2/n$a$b;", "state", "Lk10/l;", "Lsy2/n;", "<anonymous>", "(Lsy2/g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<sy2.g, k10.c0<sy2.n.a.Screen>, tq.e<? super k10.l<? extends sy2.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185761e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185762f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sy2.n.a.Dialog O(k10.c0 c0Var, m0 m0Var, DialogData dialogData, sy2.n.a.Screen screen) {
            return new sy2.n.a.Dialog(((sy2.n.a.Screen) c0Var.a()).getDocumentStateData(), m0Var.dialogVMSFactory.a(dialogData));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f185762f;
            Object objE = uq.b.e();
            int i15 = this.f185761e;
            if (i15 == 0) {
                oq.u.b(obj);
                py2.a aVar = m0.this.pwzCardContainersInteractor;
                rq0.b bVar = m0.this.documentType;
                er.a<oq.i0> aVarB9 = m0.this.b9(sy2.b.f185673a);
                this.f185762f = c0Var;
                this.f185761e = 1;
                obj = aVar.f(bVar, aVarB9, this);
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
            final m0 m0Var = m0.this;
            if (iVar instanceof dx.i.Left) {
                return c0Var.c();
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final DialogData dialogData = (DialogData) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: sy2.t0
                @Override // er.l
                public final Object b(Object obj2) {
                    return m0.m.O(c0Var, m0Var, dialogData, (n.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sy2.g gVar, k10.c0<sy2.n.a.Screen> c0Var, tq.e<? super k10.l<? extends sy2.n>> eVar) {
            m mVar = m0.this.new m(eVar);
            mVar.f185762f = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsy2/i;", "<unused var>", "Lk10/c0;", "Lsy2/n$a$b;", "state", "Lk10/l;", "Lsy2/n;", "<anonymous>", "(Lsy2/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<sy2.i, k10.c0<sy2.n.a.Screen>, tq.e<? super k10.l<? extends sy2.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185764e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185765f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sy2.n.a.Dialog O(k10.c0 c0Var, m0 m0Var, sy2.n.a.Screen screen) {
            return new sy2.n.a.Dialog(((sy2.n.a.Screen) c0Var.a()).getDocumentStateData(), m0Var.dialogVMSFactory.a(m0Var.pwzDialogMapper.b(new ty2.c.Params(new ty2.d.Refresh(m0Var.b9(new UpdateDocument(mz3.z.b.UPDATE)), m0Var.b9(sy2.a.f185670a))))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f185765f;
            uq.b.e();
            if (this.f185764e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final m0 m0Var = m0.this;
            return c0Var.d(new er.l() { // from class: sy2.u0
                @Override // er.l
                public final Object b(Object obj2) {
                    return m0.n.O(c0Var, m0Var, (n.a.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sy2.i iVar, k10.c0<sy2.n.a.Screen> c0Var, tq.e<? super k10.l<? extends sy2.n>> eVar) {
            n nVar = m0.this.new n(eVar);
            nVar.f185765f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsy2/c;", "<unused var>", "Lsy2/n$a$b;", "state", "Loq/i0;", "<anonymous>", "(Lsy2/c;Lsy2/n$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<DocumentVerification, sy2.n.a.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185767e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185768f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sy2.n.a.Screen screen = (sy2.n.a.Screen) this.f185768f;
            Object objE = uq.b.e();
            int i15 = this.f185767e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (screen.getDocumentStateData().getData().getStatus().e()) {
                    m0 m0Var = m0.this;
                    sy2.e.b bVar = sy2.e.b.f185683a;
                    this.f185768f = vq.j.a(screen);
                    this.f185767e = 1;
                    if (m0Var.F(bVar, this) == objE) {
                        return objE;
                    }
                } else {
                    m0.this.d9(sy2.i.f185693a);
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
        public final Object w(DocumentVerification documentVerification, sy2.n.a.Screen screen, tq.e<? super oq.i0> eVar) {
            o oVar = m0.this.new o(eVar);
            oVar.f185768f = screen;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsy2/b;", "<unused var>", "Lk10/c0;", "Lsy2/n$a$a;", "state", "Lk10/l;", "Lsy2/n;", "<anonymous>", "(Lsy2/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<sy2.b, k10.c0<sy2.n.a.Dialog>, tq.e<? super k10.l<? extends sy2.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185771f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sy2.n.b.Screen O(sy2.n.a.Dialog dialog) {
            return new sy2.n.b.Screen(dialog.getDocumentStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f185771f;
            uq.b.e();
            if (this.f185770e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: sy2.v0
                @Override // er.l
                public final Object b(Object obj2) {
                    return m0.p.O((n.a.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sy2.b bVar, k10.c0<sy2.n.a.Dialog> c0Var, tq.e<? super k10.l<? extends sy2.n>> eVar) {
            p pVar = new p(eVar);
            pVar.f185771f = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsy2/k;", "action", "Lk10/c0;", "Lsy2/n$a$a;", "state", "Lk10/l;", "Lsy2/n;", "<anonymous>", "(Lsy2/k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<UpdateDocument, k10.c0<sy2.n.a.Dialog>, tq.e<? super k10.l<? extends sy2.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185772e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185773f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f185774g;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sy2.n.c.Screen O(UpdateDocument updateDocument, k10.c0 c0Var, sy2.n.a.Dialog dialog) {
            return new sy2.n.c.Screen(updateDocument.getUpdateMethodType(), ((sy2.n.a.Dialog) c0Var.a()).getDocumentStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final UpdateDocument updateDocument = (UpdateDocument) this.f185773f;
            final k10.c0 c0Var = (k10.c0) this.f185774g;
            uq.b.e();
            if (this.f185772e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: sy2.w0
                @Override // er.l
                public final Object b(Object obj2) {
                    return m0.q.O(updateDocument, c0Var, (n.a.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(UpdateDocument updateDocument, k10.c0<sy2.n.a.Dialog> c0Var, tq.e<? super k10.l<? extends sy2.n>> eVar) {
            q qVar = new q(eVar);
            qVar.f185773f = updateDocument;
            qVar.f185774g = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsy2/a;", "<unused var>", "Lk10/c0;", "Lsy2/n$a$a;", "state", "Lk10/l;", "Lsy2/n;", "<anonymous>", "(Lsy2/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<sy2.a, k10.c0<sy2.n.a.Dialog>, tq.e<? super k10.l<? extends sy2.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185775e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185776f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sy2.n.a.Screen O(k10.c0 c0Var, sy2.n.a.Dialog dialog) {
            return new sy2.n.a.Screen(((sy2.n.a.Dialog) c0Var.a()).getDocumentStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f185776f;
            uq.b.e();
            if (this.f185775e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: sy2.x0
                @Override // er.l
                public final Object b(Object obj2) {
                    return m0.r.O(c0Var, (n.a.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sy2.a aVar, k10.c0<sy2.n.a.Dialog> c0Var, tq.e<? super k10.l<? extends sy2.n>> eVar) {
            r rVar = new r(eVar);
            rVar.f185776f = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsy2/n$c$a;", "state", "Loq/i0;", "<anonymous>", "(Lsy2/n$c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.p<sy2.n.c.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185778f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f185780e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f185781f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f185782g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f185783h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f185784j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ m0 f185785k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ sy2.n.c.Screen f185786l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m0 m0Var, sy2.n.c.Screen screen, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f185785k = m0Var;
                this.f185786l = screen;
            }

            /* JADX WARN: Code restructure failed: missing block: B:28:0x00bf, code lost:
            
                if (r1.F(r5, r12) == r0) goto L29;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 209
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: sy2.m0.s.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f185785k, this.f185786l, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        s(tq.e<? super s> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sy2.n.c.Screen screen = (sy2.n.c.Screen) this.f185778f;
            Object objE = uq.b.e();
            int i15 = this.f185777e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = m0.this.callActionWithLoaderUseCase;
                a aVar2 = new a(m0.this, screen, null);
                this.f185778f = vq.j.a(screen);
                this.f185777e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(sy2.n.c.Screen screen, tq.e<? super oq.i0> eVar) {
            return ((s) v(screen, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            s sVar = m0.this.new s(eVar);
            sVar.f185778f = obj;
            return sVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsy2/a;", "<unused var>", "Lsy2/n$c$a;", "Loq/i0;", "<anonymous>", "(Lsy2/a;Lsy2/n$c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<sy2.a, sy2.n.c.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185787e;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f185787e;
            if (i15 == 0) {
                oq.u.b(obj);
                m0 m0Var = m0.this;
                sy2.e.a aVar = sy2.e.a.f185682a;
                this.f185787e = 1;
                if (m0Var.F(aVar, this) == objE) {
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
        public final Object w(sy2.a aVar, sy2.n.c.Screen screen, tq.e<? super oq.i0> eVar) {
            return m0.this.new t(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsy2/h;", "action", "Lk10/c0;", "Lsy2/n$c$a;", "state", "Lk10/l;", "Lsy2/n;", "<anonymous>", "(Lsy2/h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<ShowError, k10.c0<sy2.n.c.Screen>, tq.e<? super k10.l<? extends sy2.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185789e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185790f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f185791g;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sy2.n.c.UpdateError V(final k10.c0 c0Var, final m0 m0Var, ShowError showError, sy2.n.c.Screen screen) {
            return new sy2.n.c.UpdateError(((sy2.n.c.Screen) c0Var.a()).getUpdateMethodType(), ((sy2.n.c.Screen) c0Var.a()).getDocumentStateData(), m0Var.L9(showError.getDomainError(), new er.l() { // from class: sy2.z0
                @Override // er.l
                public final Object b(Object obj) {
                    return m0.u.X(m0Var, c0Var, (ib4.c.b) obj);
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X(m0 m0Var, k10.c0 c0Var, ib4.c.b bVar) {
            if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                m0Var.d9(new UpdateDocument(((sy2.n.c.Screen) c0Var.a()).getUpdateMethodType()));
            } else {
                if (!(bVar instanceof ib4.c.b.AbstractC2161b.a) && !(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                    throw new oq.p();
                }
                m0Var.d9(sy2.a.f185670a);
            }
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ShowError showError = (ShowError) this.f185790f;
            final k10.c0 c0Var = (k10.c0) this.f185791g;
            uq.b.e();
            if (this.f185789e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final m0 m0Var = m0.this;
            return c0Var.d(new er.l() { // from class: sy2.y0
                @Override // er.l
                public final Object b(Object obj2) {
                    return m0.u.V(c0Var, m0Var, showError, (n.c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowError showError, k10.c0<sy2.n.c.Screen> c0Var, tq.e<? super k10.l<? extends sy2.n>> eVar) {
            u uVar = m0.this.new u(eVar);
            uVar.f185790f = showError;
            uVar.f185791g = c0Var;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsy2/j;", "<unused var>", "Lk10/c0;", "Lsy2/n$c$a;", "state", "Lk10/l;", "Lsy2/n;", "<anonymous>", "(Lsy2/j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<sy2.j, k10.c0<sy2.n.c.Screen>, tq.e<? super k10.l<? extends sy2.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185793e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185794f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sy2.n.a.Screen O(k10.c0 c0Var, sy2.n.c.Screen screen) {
            return new sy2.n.a.Screen(((sy2.n.c.Screen) c0Var.a()).getDocumentStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f185794f;
            uq.b.e();
            if (this.f185793e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            m0.this.y(new p50.a.DefaultWithIcon(m0.this.labelProvider.c(oy2.a.f150686n), false, null, null, 14, null));
            return c0Var.d(new er.l() { // from class: sy2.a1
                @Override // er.l
                public final Object b(Object obj2) {
                    return m0.v.O(c0Var, (n.c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sy2.j jVar, k10.c0<sy2.n.c.Screen> c0Var, tq.e<? super k10.l<? extends sy2.n>> eVar) {
            v vVar = m0.this.new v(eVar);
            vVar.f185794f = c0Var;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsy2/a;", "<unused var>", "Lk10/c0;", "Lsy2/n$c$b;", "state", "Lk10/l;", "Lsy2/n;", "<anonymous>", "(Lsy2/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<sy2.a, k10.c0<sy2.n.c.UpdateError>, tq.e<? super k10.l<? extends sy2.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185796e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185797f;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sy2.n.a.Screen O(k10.c0 c0Var, sy2.n.c.UpdateError updateError) {
            return new sy2.n.a.Screen(((sy2.n.c.UpdateError) c0Var.a()).getDocumentStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f185797f;
            uq.b.e();
            if (this.f185796e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: sy2.b1
                @Override // er.l
                public final Object b(Object obj2) {
                    return m0.w.O(c0Var, (n.c.UpdateError) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sy2.a aVar, k10.c0<sy2.n.c.UpdateError> c0Var, tq.e<? super k10.l<? extends sy2.n>> eVar) {
            w wVar = new w(eVar);
            wVar.f185797f = c0Var;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsy2/k;", "action", "Lk10/c0;", "Lsy2/n$c$b;", "state", "Lk10/l;", "Lsy2/n;", "<anonymous>", "(Lsy2/k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<UpdateDocument, k10.c0<sy2.n.c.UpdateError>, tq.e<? super k10.l<? extends sy2.n>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185798e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185799f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f185800g;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sy2.n.c.Screen O(UpdateDocument updateDocument, k10.c0 c0Var, sy2.n.c.UpdateError updateError) {
            return new sy2.n.c.Screen(updateDocument.getUpdateMethodType(), ((sy2.n.c.UpdateError) c0Var.a()).getDocumentStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final UpdateDocument updateDocument = (UpdateDocument) this.f185799f;
            final k10.c0 c0Var = (k10.c0) this.f185800g;
            uq.b.e();
            if (this.f185798e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: sy2.c1
                @Override // er.l
                public final Object b(Object obj2) {
                    return m0.x.O(updateDocument, c0Var, (n.c.UpdateError) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(UpdateDocument updateDocument, k10.c0<sy2.n.c.UpdateError> c0Var, tq.e<? super k10.l<? extends sy2.n>> eVar) {
            x xVar = new x(eVar);
            xVar.f185799f = updateDocument;
            xVar.f185800g = c0Var;
            return xVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsy2/n$b$a;", "state", "Loq/i0;", "<anonymous>", "(Lsy2/n$b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.p<sy2.n.b.Screen, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185801e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185802f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends oq.i0>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f185804e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ m0 f185805f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ sy2.n.b.Screen f185806g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m0 m0Var, sy2.n.b.Screen screen, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f185805f = m0Var;
                this.f185806g = screen;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f185804e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                py2.a aVar = this.f185805f.pwzCardContainersInteractor;
                Document document = this.f185806g.getDocumentStateData().getData().getDocument();
                String documentId = document != null ? document.getDocumentId() : null;
                NipipCardContainerData.a pwzType = this.f185805f.setupData.getPwzType();
                this.f185804e = 1;
                Object objB = aVar.b(documentId, pwzType, this);
                return objB == objE ? objE : objB;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f185805f, this.f185806g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        y(tq.e<? super y> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
        
            if (r12.F(r2, r11) == r1) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = r11.f185802f
                sy2.n$b$a r0 = (sy2.n.b.Screen) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r11.f185801e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L24
                if (r2 == r4) goto L1f
                if (r2 != r3) goto L17
                oq.u.b(r12)
                r8 = r11
                goto L5b
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                oq.u.b(r12)
                r8 = r11
                goto L48
            L24:
                oq.u.b(r12)
                sy2.m0 r12 = sy2.m0.this
                ac4.a r5 = sy2.m0.x9(r12)
                sy2.m0$y$a r7 = new sy2.m0$y$a
                sy2.m0 r12 = sy2.m0.this
                r2 = 0
                r7.<init>(r12, r0, r2)
                java.lang.Object r12 = vq.j.a(r0)
                r11.f185802f = r12
                r11.f185801e = r4
                r6 = 0
                r9 = 1
                r10 = 0
                r8 = r11
                java.lang.Object r12 = ac4.a.a(r5, r6, r7, r8, r9, r10)
                if (r12 != r1) goto L48
                goto L5a
            L48:
                sy2.m0 r12 = sy2.m0.this
                sy2.e$a r2 = sy2.e.a.f185682a
                java.lang.Object r0 = vq.j.a(r0)
                r8.f185802f = r0
                r8.f185801e = r3
                java.lang.Object r12 = r12.F(r2, r11)
                if (r12 != r1) goto L5b
            L5a:
                return r1
            L5b:
                oq.i0 r12 = oq.i0.f148189a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: sy2.m0.y.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(sy2.n.b.Screen screen, tq.e<? super oq.i0> eVar) {
            return ((y) v(screen, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            y yVar = m0.this.new y(eVar);
            yVar.f185802f = obj;
            return yVar;
        }
    }

    public m0(n20.j jVar, ty2.b bVar, ib4.c cVar, i70.n nVar, a14.w wVar, ty2.c cVar2, ac4.a aVar, mz3.z zVar, mz3.w wVar2, hb4.d dVar, cb4.j jVar2, t2.a aVar2, mx.c cVar3, py2.a aVar3, SetupData setupData) {
        this.mapper = bVar;
        this.genericDomainErrorMapper = cVar;
        this.snackBarManagerStateHolder = nVar;
        this.openUrlIntentUseCase = wVar;
        this.pwzDialogMapper = cVar2;
        this.callActionWithLoaderUseCase = aVar;
        this.updateDocumentAsyncUC = zVar;
        this.shouldDisplayDownloadLoaderUC = wVar2;
        this.errorVMSFactory = dVar;
        this.dialogVMSFactory = jVar2;
        this.deps = aVar2;
        this.labelProvider = cVar3;
        this.pwzCardContainersInteractor = aVar3;
        this.setupData = setupData;
        sy2.n.d dVar2 = sy2.n.d.f185820a;
        this.initialState = dVar2;
        this.documentType = qy2.f.a(setupData.getPwzType());
        this.navAction = new xw.b<>();
        this.stateMachine = jVar.a(dVar2, new er.l() { // from class: sy2.c0
            @Override // er.l
            public final Object b(Object obj) {
                return m0.U9(this.f185677a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), M9(new State<>(dVar2, null, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c L9(dx.b bVar, er.l<? super ib4.c.b, oq.i0> lVar) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, lVar, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sy2.q.a M9(State<sy2.n> state) {
        return this.mapper.b(new ty2.b.Params(state.d(), state.getAnimationsState(), new ty2.b.Params.ActionHandler(new er.a() { // from class: sy2.k0
            @Override // er.a
            public final Object a() {
                return m0.N9(this.f185697a);
            }
        }, new er.a() { // from class: sy2.l0
            @Override // er.a
            public final Object a() {
                return m0.P9(this.f185700a);
            }
        }, new er.a() { // from class: sy2.y
            @Override // er.a
            public final Object a() {
                return m0.Q9(this.f185855a);
            }
        }, new er.l() { // from class: sy2.z
            @Override // er.l
            public final Object b(Object obj) {
                return m0.R9(this.f185859a, (String) obj);
            }
        }, b9(sy2.g.f185690a), new er.l() { // from class: sy2.a0
            @Override // er.l
            public final Object b(Object obj) {
                return m0.S9(this.f185671a, (n20.a) obj);
            }
        }, b9(sy2.a.f185670a))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(final m0 m0Var) {
        m0Var.d9(new DocumentVerification(new er.a() { // from class: sy2.b0
            @Override // er.a
            public final Object a() {
                return m0.O9(this.f185674a);
            }
        }));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(m0 m0Var) {
        m0Var.d9(new UpdateDocument(mz3.z.b.UPDATE));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(m0 m0Var) {
        m0Var.d9(new UpdateDocument(mz3.z.b.UPDATE));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(m0 m0Var) {
        m0Var.d9(new UpdateDocument(mz3.z.b.DOWNLOAD));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(m0 m0Var, String str) {
        m0Var.d9(new OnUrlClick(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(m0 m0Var, n20.a aVar) {
        m0Var.d9(aVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(final m0 m0Var, k10.v vVar) {
        vVar.c(fr.q0.c(sy2.n.d.class), new er.l() { // from class: sy2.x
            @Override // er.l
            public final Object b(Object obj) {
                return m0.V9(this.f185853a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(sy2.p.class), new er.l() { // from class: sy2.d0
            @Override // er.l
            public final Object b(Object obj) {
                return m0.W9(this.f185681a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: sy2.e0
            @Override // er.l
            public final Object b(Object obj) {
                return m0.X9(this.f185685a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(sy2.n.a.Screen.class), new er.l() { // from class: sy2.f0
            @Override // er.l
            public final Object b(Object obj) {
                return m0.Y9(this.f185688a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(sy2.n.a.Dialog.class), new er.l() { // from class: sy2.g0
            @Override // er.l
            public final Object b(Object obj) {
                return m0.Z9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(sy2.n.c.Screen.class), new er.l() { // from class: sy2.h0
            @Override // er.l
            public final Object b(Object obj) {
                return m0.aa(this.f185692a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(sy2.n.c.UpdateError.class), new er.l() { // from class: sy2.i0
            @Override // er.l
            public final Object b(Object obj) {
                return m0.ba((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(sy2.n.b.Screen.class), new er.l() { // from class: sy2.j0
            @Override // er.l
            public final Object b(Object obj) {
                return m0.ca(this.f185695a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(m0 m0Var, k10.z zVar) {
        zVar.A(m0Var.new b(null));
        c cVar = m0Var.new c(null);
        zVar.x(fr.q0.c(sy2.a.class), k10.o.CANCEL_PREVIOUS, cVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(m0 m0Var, k10.z zVar) {
        zVar.C(m0Var.new d(null));
        e eVar = m0Var.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ShowError.class), oVar, eVar);
        zVar.x(fr.q0.c(sy2.a.class), oVar, m0Var.new f(null));
        zVar.v(fr.q0.c(sy2.d.class), oVar, m0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(m0 m0Var, k10.z zVar) {
        h hVar = new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(sy2.d.class), oVar, hVar);
        zVar.x(fr.q0.c(sy2.a.class), oVar, m0Var.new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(m0 m0Var, k10.z zVar) {
        j jVar = m0Var.new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(sy2.a.class), oVar, jVar);
        zVar.v(fr.q0.c(UpdateDocument.class), oVar, new k(null));
        zVar.x(fr.q0.c(OnUrlClick.class), oVar, m0Var.new l(null));
        zVar.v(fr.q0.c(sy2.g.class), oVar, m0Var.new m(null));
        zVar.v(fr.q0.c(sy2.i.class), oVar, m0Var.new n(null));
        zVar.x(fr.q0.c(DocumentVerification.class), oVar, m0Var.new o(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(k10.z zVar) {
        p pVar = new p(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(sy2.b.class), oVar, pVar);
        zVar.v(fr.q0.c(UpdateDocument.class), oVar, new q(null));
        zVar.v(fr.q0.c(sy2.a.class), oVar, new r(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(m0 m0Var, k10.z zVar) {
        zVar.C(m0Var.new s(null));
        t tVar = m0Var.new t(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(sy2.a.class), oVar, tVar);
        zVar.v(fr.q0.c(ShowError.class), oVar, m0Var.new u(null));
        zVar.v(fr.q0.c(sy2.j.class), oVar, m0Var.new v(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(k10.z zVar) {
        w wVar = new w(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(sy2.a.class), oVar, wVar);
        zVar.v(fr.q0.c(UpdateDocument.class), oVar, new x(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(m0 m0Var, k10.z zVar) {
        zVar.C(m0Var.new y(null));
        return oq.i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: K9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(sy2.e eVar, tq.e<? super oq.i0> eVar2) {
        return super.F(eVar, eVar2);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: T9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<sy2.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State<sy2.n>, n20.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<sy2.q.a> getState() {
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
