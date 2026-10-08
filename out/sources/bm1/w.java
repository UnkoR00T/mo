package bm1;

import al0.ParentOrGuardData;
import fr.q0;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006Bc\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J>\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020(*\n\u0012\u0006\b\u0001\u0012\u00020\u00020\"2\u0006\u0010$\u001a\u00020#2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00020%H\u0082@¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020\u0002H\u0002¢\u0006\u0004\b-\u0010.J\u0018\u00102\u001a\u0002012\u0006\u00100\u001a\u00020/H\u0096\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u000201H\u0096\u0001¢\u0006\u0004\b4\u00105R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR \u0010T\u001a\b\u0012\u0004\u0012\u00020O0N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR&\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030U8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR \u0010+\u001a\b\u0012\u0004\u0012\u00020,0[8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_¨\u0006`"}, d2 = {"Lbm1/w;", "Ll00/g;", "Lbm1/d;", "Lbm1/a;", "Lbm1/i;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Ldm1/c;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lml0/o;", "getParentOrGuardDataUseCase", "Ldm1/b;", "errorMapper", "Lhb4/d;", "errorVMSFactory", "Ljj0/b;", "hasTrustedProfileUseCase", "Luk1/a;", "getOfficeSelectionInitialDataUC", "Ll44/e;", "getUserEdorAddressUC", "globalSnackBarManager", "Lcm1/a;", "contract", "<init>", "(Lyy/a;Ldm1/c;Lac4/a;Lml0/o;Ldm1/b;Lhb4/d;Ljj0/b;Luk1/a;Ll44/e;Li70/e;Lcm1/a;)V", "Ldx/b;", "Ldm1/b$b$a;", "N9", "(Ldx/b;)Ldm1/b$b$a;", "Lk10/c0;", "Ldm1/b$b;", "params", "Lkotlin/Function1;", "Lhb4/c;", "errorStateProvider", "Lk10/l;", "C9", "(Lk10/c0;Ldm1/b$b;Ler/l;Ltq/e;)Ljava/lang/Object;", "state", "Lbm1/i$a;", "B9", "(Lbm1/d;)Lbm1/i$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Ldm1/c;", "c", "Lac4/a;", "d", "Lml0/o;", "e", "Ldm1/b;", "f", "Lhb4/d;", "g", "Ljj0/b;", "h", "Luk1/a;", "j", "Ll44/e;", "k", "Li70/e;", "l", "Lcm1/a;", "Lbm1/f;", "m", "Lbm1/f;", "initialState", "Lxw/b;", "Lbm1/a$b;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w extends l00.g<bm1.d, bm1.a> implements bm1.i, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dm1.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ml0.o getParentOrGuardDataUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final dm1.b errorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final jj0.b hasTrustedProfileUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final uk1.a getOfficeSelectionInitialDataUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final l44.e getUserEdorAddressUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final cm1.a contract;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Loading initialState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<bm1.a.b> navAction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<bm1.d, bm1.a> stateMachine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p0<bm1.i.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f20167d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f20168e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f20169f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f20170g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f20171h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f20172j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f20173k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f20174l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f20176n;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f20174l = obj;
            this.f20176n |= PKIFailureInfo.systemUnavail;
            return w.this.C9(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<bm1.i.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f20177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f20178b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f20179a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f20180b;

            /* JADX INFO: renamed from: bm1.w$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0525a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f20181d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f20182e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f20183f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f20185h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f20186j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f20187k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f20188l;

                public C0525a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f20181d = obj;
                    this.f20182e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, w wVar) {
                this.f20179a = hVar;
                this.f20180b = wVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0525a c0525a;
                if (eVar instanceof C0525a) {
                    c0525a = (C0525a) eVar;
                    int i15 = c0525a.f20182e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0525a.f20182e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0525a = new C0525a(eVar);
                    }
                } else {
                    c0525a = new C0525a(eVar);
                }
                Object obj2 = c0525a.f20181d;
                Object objE = uq.b.e();
                int i16 = c0525a.f20182e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f20179a;
                    bm1.i.a aVarB9 = this.f20180b.B9((bm1.d) obj);
                    c0525a.f20183f = vq.j.a(obj);
                    c0525a.f20185h = vq.j.a(c0525a);
                    c0525a.f20186j = vq.j.a(obj);
                    c0525a.f20187k = vq.j.a(hVar);
                    c0525a.f20188l = 0;
                    c0525a.f20182e = 1;
                    if (hVar.F(aVarB9, c0525a) == objE) {
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

        public b(mu.g gVar, w wVar) {
            this.f20177a = gVar;
            this.f20178b = wVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super bm1.i.a> hVar, tq.e eVar) {
            Object objA = this.f20177a.a(new a(hVar, this.f20178b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbm1/a$d;", "<unused var>", "Lbm1/d;", "Loq/i0;", "<anonymous>", "(Lbm1/a$d;Lbm1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<bm1.a.d, bm1.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20189e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f20189e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                bm1.a.b.C0522a c0522a = bm1.a.b.C0522a.f20104a;
                this.f20189e = 1;
                if (wVar.F(c0522a, this) == objE) {
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
        public final Object w(bm1.a.d dVar, bm1.d dVar2, tq.e<? super oq.i0> eVar) {
            return w.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lbm1/f;", "state", "Lk10/l;", "Lbm1/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<k10.c0<Loading>, tq.e<? super k10.l<? extends bm1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20191e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f20192f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lbm1/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends bm1.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f20194e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f20195f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f20196g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f20197h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f20198j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ w f20199k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ k10.c0<Loading> f20200l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w wVar, k10.c0<Loading> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f20199k = wVar;
                this.f20200l = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final bm1.d X(k10.c0 c0Var, hb4.c cVar) {
                return new Error(((Loading) c0Var.a()).getType(), cVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final bm1.d.Initialized Y(k10.c0 c0Var, ParentOrGuardData parentOrGuardData, Loading loading) {
                return new bm1.d.Initialized(((Loading) c0Var.a()).getType(), parentOrGuardData);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
            
                if (r8 == r0) goto L17;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
                /*
                    r7 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r7.f20198j
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L26
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r0 = r7.f20195f
                    dx.b r0 = (dx.b) r0
                    java.lang.Object r0 = r7.f20194e
                    dx.i r0 = (dx.i) r0
                    oq.u.b(r8)
                    goto L70
                L1a:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L22:
                    oq.u.b(r8)
                    goto L3a
                L26:
                    oq.u.b(r8)
                    bm1.w r8 = r7.f20199k
                    ml0.o r8 = bm1.w.u9(r8)
                    gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                    r7.f20198j = r3
                    java.lang.Object r8 = r8.c(r1, r7)
                    if (r8 != r0) goto L3a
                    goto L6f
                L3a:
                    dx.i r8 = (dx.i) r8
                    bm1.w r1 = r7.f20199k
                    k10.c0<bm1.f> r3 = r7.f20200l
                    boolean r4 = r8 instanceof dx.i.Left
                    if (r4 == 0) goto L73
                    r4 = r8
                    dx.i$b r4 = (dx.i.Left) r4
                    java.lang.Object r4 = r4.b()
                    dx.b r4 = (dx.b) r4
                    dm1.b$b$a r5 = bm1.w.z9(r1, r4)
                    bm1.x r6 = new bm1.x
                    r6.<init>()
                    java.lang.Object r8 = vq.j.a(r8)
                    r7.f20194e = r8
                    java.lang.Object r8 = vq.j.a(r4)
                    r7.f20195f = r8
                    r8 = 0
                    r7.f20196g = r8
                    r7.f20197h = r8
                    r7.f20198j = r2
                    java.lang.Object r8 = bm1.w.y9(r1, r3, r5, r6, r7)
                    if (r8 != r0) goto L70
                L6f:
                    return r0
                L70:
                    k10.l r8 = (k10.l) r8
                    return r8
                L73:
                    boolean r0 = r8 instanceof dx.i.Right
                    if (r0 == 0) goto L89
                    dx.i$c r8 = (dx.i.Right) r8
                    java.lang.Object r8 = r8.b()
                    al0.j0 r8 = (al0.ParentOrGuardData) r8
                    bm1.y r0 = new bm1.y
                    r0.<init>()
                    k10.l r8 = r3.d(r0)
                    return r8
                L89:
                    oq.p r8 = new oq.p
                    r8.<init>()
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: bm1.w.d.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f20199k, this.f20200l, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends bm1.d>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f20192f;
            Object objE = uq.b.e();
            int i15 = this.f20191e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = w.this.callActionWithLoaderUseCase;
            a aVar2 = new a(w.this, c0Var, null);
            this.f20192f = vq.j.a(c0Var);
            this.f20191e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Loading> c0Var, tq.e<? super k10.l<? extends bm1.d>> eVar) {
            return ((d) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            d dVar = w.this.new d(eVar);
            dVar.f20192f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbm1/b;", "<unused var>", "Lbm1/e;", "state", "Loq/i0;", "<anonymous>", "(Lbm1/b;Lbm1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<bm1.b, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20201e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f20201e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            w.this.d9(bm1.a.d.f20110a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(bm1.b bVar, Error error, tq.e<? super oq.i0> eVar) {
            return w.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lbm1/c;", "<unused var>", "Lk10/c0;", "Lbm1/e;", "state", "Lk10/l;", "Lbm1/d;", "<anonymous>", "(Lbm1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<bm1.c, k10.c0<Error>, tq.e<? super k10.l<? extends bm1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20203e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f20204f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loading O(Error error) {
            return new Loading(error.getType());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f20204f;
            uq.b.e();
            if (this.f20203e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: bm1.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.f.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(bm1.c cVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends bm1.d>> eVar) {
            f fVar = new f(eVar);
            fVar.f20204f = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lbm1/a$e;", "<unused var>", "Lk10/c0;", "Lbm1/d$b;", "state", "Lk10/l;", "Lbm1/d;", "<anonymous>", "(Lbm1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<bm1.a.e, k10.c0<bm1.d.Initialized>, tq.e<? super k10.l<? extends bm1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20205e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f20206f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loading O(bm1.d.Initialized initialized) {
            return new Loading(initialized.getType(), initialized.getParentOrGuardData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f20206f;
            uq.b.e();
            if (this.f20205e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: bm1.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.g.O((d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(bm1.a.e eVar, k10.c0<bm1.d.Initialized> c0Var, tq.e<? super k10.l<? extends bm1.d>> eVar2) {
            g gVar = new g(eVar2);
            gVar.f20206f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lbm1/h;", "state", "Lk10/l;", "Lbm1/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<k10.c0<Loading>, tq.e<? super k10.l<? extends bm1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20207e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f20208f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lbm1/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends bm1.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f20210e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f20211f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f20212g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f20213h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            boolean f20214j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f20215k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ w f20216l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k10.c0<Loading> f20217m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(w wVar, k10.c0<Loading> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f20216l = wVar;
                this.f20217m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final bm1.d Y(k10.c0 c0Var, hb4.c cVar) {
                return new Error(((Loading) c0Var.a()).getType(), cVar, ((Loading) c0Var.a()).getParentOrGuardData());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final bm1.d.InitializedWithTrustedProfile Z(Loading loading) {
                return new bm1.d.InitializedWithTrustedProfile(loading.getType(), loading.getParentOrGuardData());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final bm1.d a0(k10.c0 c0Var, hb4.c cVar) {
                return new Error(((Loading) c0Var.a()).getType(), cVar, ((Loading) c0Var.a()).getParentOrGuardData());
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
            
                if (r9 == r0) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
            
                if (r9 == r0) goto L31;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 211
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: bm1.w.h.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f20216l, this.f20217m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends bm1.d>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f20208f;
            Object objE = uq.b.e();
            int i15 = this.f20207e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = w.this.callActionWithLoaderUseCase;
            a aVar2 = new a(w.this, c0Var, null);
            this.f20208f = vq.j.a(c0Var);
            this.f20207e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Loading> c0Var, tq.e<? super k10.l<? extends bm1.d>> eVar) {
            return ((h) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            h hVar = w.this.new h(eVar);
            hVar.f20208f = obj;
            return hVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbm1/b;", "<unused var>", "Lbm1/g;", "state", "Loq/i0;", "<anonymous>", "(Lbm1/b;Lbm1/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<bm1.b, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20218e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f20218e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            w.this.d9(bm1.a.d.f20110a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(bm1.b bVar, Error error, tq.e<? super oq.i0> eVar) {
            return w.this.new i(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lbm1/c;", "<unused var>", "Lk10/c0;", "Lbm1/g;", "state", "Lk10/l;", "Lbm1/d;", "<anonymous>", "(Lbm1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<bm1.c, k10.c0<Error>, tq.e<? super k10.l<? extends bm1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20220e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f20221f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loading O(Error error) {
            return new Loading(error.getType(), error.getParentOrGuardData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f20221f;
            uq.b.e();
            if (this.f20220e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: bm1.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.j.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(bm1.c cVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends bm1.d>> eVar) {
            j jVar = new j(eVar);
            jVar.f20221f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbm1/d$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lbm1/d$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<bm1.d.InitializedWithTrustedProfile, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20222e;

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f20222e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            iy.b0 b0VarA = w.this.getUserEdorAddressUC.a(gz.b.a.C1792a.f78542a);
            if (b0VarA != null) {
                w.this.d9(new bm1.a.OnAuth(b0VarA));
            } else {
                w.this.d9(bm1.a.C0521a.f20103a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(bm1.d.InitializedWithTrustedProfile initializedWithTrustedProfile, tq.e<? super oq.i0> eVar) {
            return ((k) v(initializedWithTrustedProfile, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return w.this.new k(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbm1/a$a;", "<unused var>", "Lbm1/d$c;", "Loq/i0;", "<anonymous>", "(Lbm1/a$a;Lbm1/d$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<bm1.a.C0521a, bm1.d.InitializedWithTrustedProfile, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20224e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(w wVar, iy.b0 b0Var) {
            wVar.d9(new bm1.a.OnAuth(b0Var));
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f20224e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                final w wVar2 = w.this;
                bm1.a.b.EdorAuth edorAuth = new bm1.a.b.EdorAuth(new mv3.a.EdorAddressRequired(new er.l() { // from class: bm1.f0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return w.l.O(wVar2, (iy.b0) obj2);
                    }
                }, null, 2, null));
                this.f20224e = 1;
                if (wVar.F(edorAuth, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(bm1.a.C0521a c0521a, bm1.d.InitializedWithTrustedProfile initializedWithTrustedProfile, tq.e<? super oq.i0> eVar) {
            return w.this.new l(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbm1/a$c;", "action", "Lbm1/d$c;", "state", "Loq/i0;", "<anonymous>", "(Lbm1/a$c;Lbm1/d$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<bm1.a.OnAuth, bm1.d.InitializedWithTrustedProfile, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f20226e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f20227f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f20228g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f20229h;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x008b, code lost:
        
            if (r3.F(r5, r8) == r2) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f20228g
                bm1.a$c r0 = (bm1.a.OnAuth) r0
                java.lang.Object r1 = r8.f20229h
                bm1.d$c r1 = (bm1.d.InitializedWithTrustedProfile) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r8.f20227f
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L2a
                if (r3 == r5) goto L22
                if (r3 != r4) goto L1a
                oq.u.b(r9)
                goto L8e
            L1a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L22:
                java.lang.Object r3 = r8.f20226e
                bm1.w r3 = (bm1.w) r3
                oq.u.b(r9)
                goto L6f
            L2a:
                oq.u.b(r9)
                bm1.w r9 = bm1.w.this
                cm1.a r9 = bm1.w.s9(r9)
                ok1.a r3 = new ok1.a
                al0.j0 r6 = r1.getParentOrGuardData()
                iy.b0 r7 = r0.getUserEdorAddress()
                r3.<init>(r6, r7)
                r9.v(r3)
                bm1.w r3 = bm1.w.this
                uk1.a r9 = bm1.w.t9(r3)
                uk1.a$a r6 = new uk1.a$a
                bm1.w r7 = bm1.w.this
                cm1.a r7 = bm1.w.s9(r7)
                al0.i r7 = r7.u()
                r6.<init>(r7)
                java.lang.Object r7 = vq.j.a(r0)
                r8.f20228g = r7
                java.lang.Object r7 = vq.j.a(r1)
                r8.f20229h = r7
                r8.f20226e = r3
                r8.f20227f = r5
                java.lang.Object r9 = r9.d(r6, r8)
                if (r9 != r2) goto L6f
                goto L8d
            L6f:
                py3.b r9 = (py3.OfficeSelectionData) r9
                bm1.a$b$c r5 = new bm1.a$b$c
                r5.<init>(r9)
                java.lang.Object r9 = vq.j.a(r0)
                r8.f20228g = r9
                java.lang.Object r9 = vq.j.a(r1)
                r8.f20229h = r9
                r9 = 0
                r8.f20226e = r9
                r8.f20227f = r4
                java.lang.Object r9 = r3.F(r5, r8)
                if (r9 != r2) goto L8e
            L8d:
                return r2
            L8e:
                oq.i0 r9 = oq.i0.f148189a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: bm1.w.m.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(bm1.a.OnAuth onAuth, bm1.d.InitializedWithTrustedProfile initializedWithTrustedProfile, tq.e<? super oq.i0> eVar) {
            m mVar = w.this.new m(eVar);
            mVar.f20228g = onAuth;
            mVar.f20229h = initializedWithTrustedProfile;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lbm1/a$e;", "<unused var>", "Lk10/c0;", "Lbm1/d$c;", "state", "Lk10/l;", "Lbm1/d;", "<anonymous>", "(Lbm1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<bm1.a.e, k10.c0<bm1.d.InitializedWithTrustedProfile>, tq.e<? super k10.l<? extends bm1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20231e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f20232f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loading O(bm1.d.InitializedWithTrustedProfile initializedWithTrustedProfile) {
            return new Loading(initializedWithTrustedProfile.getType(), initializedWithTrustedProfile.getParentOrGuardData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f20232f;
            uq.b.e();
            if (this.f20231e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: bm1.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.n.O((d.InitializedWithTrustedProfile) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(bm1.a.e eVar, k10.c0<bm1.d.InitializedWithTrustedProfile> c0Var, tq.e<? super k10.l<? extends bm1.d>> eVar2) {
            n nVar = new n(eVar2);
            nVar.f20232f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    public w(yy.a aVar, dm1.c cVar, ac4.a aVar2, ml0.o oVar, dm1.b bVar, hb4.d dVar, jj0.b bVar2, uk1.a aVar3, l44.e eVar, i70.e eVar2, cm1.a aVar4) {
        this.mapper = cVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.getParentOrGuardDataUseCase = oVar;
        this.errorMapper = bVar;
        this.errorVMSFactory = dVar;
        this.hasTrustedProfileUseCase = bVar2;
        this.getOfficeSelectionInitialDataUC = aVar3;
        this.getUserEdorAddressUC = eVar;
        this.globalSnackBarManager = eVar2;
        this.contract = aVar4;
        Loading loading = new Loading(aVar4.getType());
        this.initialState = loading;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(loading, new er.l() { // from class: bm1.v
            @Override // er.l
            public final Object b(Object obj) {
                return w.F9(this.f20152a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), B9(loading));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bm1.i.a B9(bm1.d state) {
        return this.mapper.b(new dm1.c.Params(state, b9(bm1.a.d.f20110a), b9(bm1.a.e.f20111a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C9(k10.c0<? extends bm1.d> c0Var, dm1.b.InterfaceC0970b interfaceC0970b, final er.l<? super hb4.c, ? extends bm1.d> lVar, tq.e<? super k10.l<? extends bm1.d>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f20176n;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f20176n = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f20174l;
        Object objE = uq.b.e();
        int i16 = aVar.f20176n;
        if (i16 != 0) {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k10.l lVar2 = (k10.l) aVar.f20171h;
            oq.u.b(obj);
            return lVar2;
        }
        oq.u.b(obj);
        final dm1.b.c cVarB = this.errorMapper.b(interfaceC0970b);
        if (cVarB instanceof dm1.b.c.Error) {
            return c0Var.d(new er.l() { // from class: bm1.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.D9(lVar, this, cVarB, (d) obj2);
                }
            });
        }
        if (!(cVarB instanceof dm1.b.c.ProhibitedAccess)) {
            throw new oq.p();
        }
        Object objC = c0Var.c();
        Object prohibitedAccess = new bm1.a.b.ProhibitedAccess(((dm1.b.c.ProhibitedAccess) cVarB).getData());
        aVar.f20167d = vq.j.a(c0Var);
        aVar.f20168e = vq.j.a(interfaceC0970b);
        aVar.f20169f = vq.j.a(lVar);
        aVar.f20170g = vq.j.a(cVarB);
        aVar.f20171h = objC;
        aVar.f20172j = vq.j.a(objC);
        aVar.f20173k = 0;
        aVar.f20176n = 1;
        return F(prohibitedAccess, aVar) == objE ? objE : objC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bm1.d D9(er.l lVar, w wVar, dm1.b.c cVar, bm1.d dVar) {
        return (bm1.d) lVar.b(wVar.errorVMSFactory.a(((dm1.b.c.Error) cVar).getData()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(final w wVar, k10.v vVar) {
        vVar.c(q0.c(bm1.d.class), new er.l() { // from class: bm1.n
            @Override // er.l
            public final Object b(Object obj) {
                return w.G9(this.f20143a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Loading.class), new er.l() { // from class: bm1.o
            @Override // er.l
            public final Object b(Object obj) {
                return w.H9(this.f20144a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: bm1.p
            @Override // er.l
            public final Object b(Object obj) {
                return w.I9(this.f20145a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(bm1.d.Initialized.class), new er.l() { // from class: bm1.q
            @Override // er.l
            public final Object b(Object obj) {
                return w.J9((k10.z) obj);
            }
        });
        vVar.c(q0.c(Loading.class), new er.l() { // from class: bm1.r
            @Override // er.l
            public final Object b(Object obj) {
                return w.K9(this.f20146a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: bm1.s
            @Override // er.l
            public final Object b(Object obj) {
                return w.L9(this.f20147a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(bm1.d.InitializedWithTrustedProfile.class), new er.l() { // from class: bm1.t
            @Override // er.l
            public final Object b(Object obj) {
                return w.M9(this.f20148a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(w wVar, k10.z zVar) {
        c cVar = wVar.new c(null);
        zVar.x(q0.c(bm1.a.d.class), k10.o.CANCEL_PREVIOUS, cVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(w wVar, k10.z zVar) {
        zVar.A(wVar.new d(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(w wVar, k10.z zVar) {
        e eVar = wVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(bm1.b.class), oVar, eVar);
        zVar.v(q0.c(bm1.c.class), oVar, new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(k10.z zVar) {
        g gVar = new g(null);
        zVar.v(q0.c(bm1.a.e.class), k10.o.CANCEL_PREVIOUS, gVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(w wVar, k10.z zVar) {
        zVar.A(wVar.new h(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(w wVar, k10.z zVar) {
        i iVar = wVar.new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(bm1.b.class), oVar, iVar);
        zVar.v(q0.c(bm1.c.class), oVar, new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(w wVar, k10.z zVar) {
        zVar.C(wVar.new k(null));
        l lVar = wVar.new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(bm1.a.C0521a.class), oVar, lVar);
        zVar.x(q0.c(bm1.a.OnAuth.class), oVar, wVar.new m(null));
        zVar.v(q0.c(bm1.a.e.class), oVar, new n(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dm1.b.InterfaceC0970b.Generic N9(dx.b bVar) {
        return new dm1.b.InterfaceC0970b.Generic(bVar, b9(bm1.c.f20114a), b9(bm1.b.f20112a));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(bm1.a.b bVar, tq.e<? super oq.i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: E9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(cm1.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<bm1.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<bm1.d, bm1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<bm1.i.a> getState() {
        return this.state;
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
