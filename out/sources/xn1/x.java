package xn1;

import al0.ParentOrGuardData;
import fr.q0;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import qm1.WelcomeResult;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006Bc\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J>\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020)*\n\u0012\u0006\b\u0001\u0012\u00020\u00020\"2\u0006\u0010$\u001a\u00020#2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%H\u0082@¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020\u0002H\u0002¢\u0006\u0004\b.\u0010/J\u0018\u00103\u001a\u0002022\u0006\u00101\u001a\u000200H\u0096\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u000202H\u0096\u0001¢\u0006\u0004\b5\u00106R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR \u0010S\u001a\b\u0012\u0004\u0012\u00020N0M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR&\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030T8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR \u0010,\u001a\b\u0012\u0004\u0012\u00020-0Z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^¨\u0006_"}, d2 = {"Lxn1/x;", "Ll00/g;", "Lxn1/d;", "Lxn1/a;", "Lxn1/i;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lzn1/c;", "mapper", "Lac4/a;", "callActionWithLoaderUC", "Lml0/o;", "getParentOrGuardDataUseCase", "Lzn1/b;", "errorMapper", "La14/w;", "openUrlUseCase", "globalSnackBarManager", "Ljj0/b;", "hasTrustedProfileUC", "Lhb4/d;", "errorVmsFactory", "Ll44/e;", "getUserEdorAddressUC", "Lyn1/a;", "contract", "<init>", "(Lyy/a;Lzn1/c;Lac4/a;Lml0/o;Lzn1/b;La14/w;Li70/e;Ljj0/b;Lhb4/d;Ll44/e;Lyn1/a;)V", "Ldx/b;", "Lzn1/b$b$a;", "O9", "(Ldx/b;)Lzn1/b$b$a;", "Lk10/c0;", "Lzn1/b$b;", "params", "Lkotlin/Function1;", "Lhb4/c;", "Lxn1/d$a;", "errorStateProvider", "Lk10/l;", "D9", "(Lk10/c0;Lzn1/b$b;Ler/l;Ltq/e;)Ljava/lang/Object;", "state", "Lxn1/i$a;", "B9", "(Lxn1/d;)Lxn1/i$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lzn1/c;", "c", "Lac4/a;", "d", "Lml0/o;", "e", "Lzn1/b;", "f", "La14/w;", "g", "Li70/e;", "h", "Ljj0/b;", "j", "Lhb4/d;", "k", "Ll44/e;", "Lxn1/f;", "l", "Lxn1/f;", "initialState", "Lxw/b;", "Lxn1/a$b;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "n", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x extends l00.g<xn1.d, xn1.a> implements xn1.i, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zn1.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ml0.o getParentOrGuardDataUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final zn1.b errorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final jj0.b hasTrustedProfileUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVmsFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final l44.e getUserEdorAddressUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Loading initialState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<xn1.a.b> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final k10.t<xn1.d, xn1.a> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p0<xn1.i.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f220030d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f220031e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f220032f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f220033g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f220034h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f220035j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f220036k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f220037l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f220039n;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f220037l = obj;
            this.f220039n |= PKIFailureInfo.systemUnavail;
            return x.this.D9(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<xn1.i.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f220040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f220041b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f220042a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f220043b;

            /* JADX INFO: renamed from: xn1.x$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5875a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f220044d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f220045e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f220046f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f220048h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f220049j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f220050k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f220051l;

                public C5875a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f220044d = obj;
                    this.f220045e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, x xVar) {
                this.f220042a = hVar;
                this.f220043b = xVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5875a c5875a;
                if (eVar instanceof C5875a) {
                    c5875a = (C5875a) eVar;
                    int i15 = c5875a.f220045e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5875a.f220045e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5875a = new C5875a(eVar);
                    }
                } else {
                    c5875a = new C5875a(eVar);
                }
                Object obj2 = c5875a.f220044d;
                Object objE = uq.b.e();
                int i16 = c5875a.f220045e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f220042a;
                    xn1.i.a aVarB9 = this.f220043b.B9((xn1.d) obj);
                    c5875a.f220046f = vq.j.a(obj);
                    c5875a.f220048h = vq.j.a(c5875a);
                    c5875a.f220049j = vq.j.a(obj);
                    c5875a.f220050k = vq.j.a(hVar);
                    c5875a.f220051l = 0;
                    c5875a.f220045e = 1;
                    if (hVar.F(aVarB9, c5875a) == objE) {
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

        public b(mu.g gVar, x xVar) {
            this.f220040a = gVar;
            this.f220041b = xVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super xn1.i.a> hVar, tq.e eVar) {
            Object objA = this.f220040a.a(new a(hVar, this.f220041b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxn1/a$d;", "<unused var>", "Lxn1/d;", "Loq/i0;", "<anonymous>", "(Lxn1/a$d;Lxn1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<xn1.a.d, xn1.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220052e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f220052e;
            if (i15 == 0) {
                oq.u.b(obj);
                x xVar = x.this;
                xn1.a.b.C5872b c5872b = xn1.a.b.C5872b.f219961a;
                this.f220052e = 1;
                if (xVar.F(c5872b, this) == objE) {
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
        public final Object w(xn1.a.d dVar, xn1.d dVar2, tq.e<? super oq.i0> eVar) {
            return x.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lxn1/f;", "state", "Lk10/l;", "Lxn1/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<k10.c0<Loading>, tq.e<? super k10.l<? extends xn1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220054e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f220055f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ yn1.a f220057h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lxn1/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends xn1.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f220058e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f220059f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f220060g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f220061h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f220062j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ x f220063k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ k10.c0<Loading> f220064l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ yn1.a f220065m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x xVar, k10.c0<Loading> c0Var, yn1.a aVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f220063k = xVar;
                this.f220064l = c0Var;
                this.f220065m = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final xn1.d.a X(k10.c0 c0Var, hb4.c cVar) {
                return new Error(((Loading) c0Var.a()).getType(), cVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final xn1.d.Initialized Y(yn1.a aVar, ParentOrGuardData parentOrGuardData, Loading loading) {
                return new xn1.d.Initialized(aVar.getType(), parentOrGuardData);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
            
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
                    int r1 = r7.f220062j
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L26
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r0 = r7.f220059f
                    dx.b r0 = (dx.b) r0
                    java.lang.Object r0 = r7.f220058e
                    dx.i r0 = (dx.i) r0
                    oq.u.b(r8)
                    goto L72
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
                    xn1.x r8 = r7.f220063k
                    ml0.o r8 = xn1.x.t9(r8)
                    gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                    r7.f220062j = r3
                    java.lang.Object r8 = r8.c(r1, r7)
                    if (r8 != r0) goto L3a
                    goto L71
                L3a:
                    dx.i r8 = (dx.i) r8
                    xn1.x r1 = r7.f220063k
                    k10.c0<xn1.f> r3 = r7.f220064l
                    yn1.a r4 = r7.f220065m
                    boolean r5 = r8 instanceof dx.i.Left
                    if (r5 == 0) goto L75
                    r4 = r8
                    dx.i$b r4 = (dx.i.Left) r4
                    java.lang.Object r4 = r4.b()
                    dx.b r4 = (dx.b) r4
                    zn1.b$b$a r5 = xn1.x.z9(r1, r4)
                    xn1.y r6 = new xn1.y
                    r6.<init>()
                    java.lang.Object r8 = vq.j.a(r8)
                    r7.f220058e = r8
                    java.lang.Object r8 = vq.j.a(r4)
                    r7.f220059f = r8
                    r8 = 0
                    r7.f220060g = r8
                    r7.f220061h = r8
                    r7.f220062j = r2
                    java.lang.Object r8 = xn1.x.y9(r1, r3, r5, r6, r7)
                    if (r8 != r0) goto L72
                L71:
                    return r0
                L72:
                    k10.l r8 = (k10.l) r8
                    return r8
                L75:
                    boolean r0 = r8 instanceof dx.i.Right
                    if (r0 == 0) goto L8b
                    dx.i$c r8 = (dx.i.Right) r8
                    java.lang.Object r8 = r8.b()
                    al0.j0 r8 = (al0.ParentOrGuardData) r8
                    xn1.z r0 = new xn1.z
                    r0.<init>()
                    k10.l r8 = r3.d(r0)
                    return r8
                L8b:
                    oq.p r8 = new oq.p
                    r8.<init>()
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: xn1.x.d.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f220063k, this.f220064l, this.f220065m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends xn1.d>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(yn1.a aVar, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f220057h = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f220055f;
            Object objE = uq.b.e();
            int i15 = this.f220054e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = x.this.callActionWithLoaderUC;
            a aVar2 = new a(x.this, c0Var, this.f220057h, null);
            this.f220055f = vq.j.a(c0Var);
            this.f220054e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Loading> c0Var, tq.e<? super k10.l<? extends xn1.d>> eVar) {
            return ((d) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            d dVar = x.this.new d(this.f220057h, eVar);
            dVar.f220055f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxn1/b;", "<unused var>", "Lxn1/e;", "Loq/i0;", "<anonymous>", "(Lxn1/b;Lxn1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<xn1.b, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220066e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f220066e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            x.this.d9(xn1.a.d.f219966a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xn1.b bVar, Error error, tq.e<? super oq.i0> eVar) {
            return x.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxn1/c;", "<unused var>", "Lk10/c0;", "Lxn1/e;", "state", "Lk10/l;", "Lxn1/d;", "<anonymous>", "(Lxn1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<xn1.c, k10.c0<Error>, tq.e<? super k10.l<? extends xn1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220068e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f220069f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loading O(Error error) {
            return new Loading(error.getType());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f220069f;
            uq.b.e();
            if (this.f220068e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: xn1.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.f.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xn1.c cVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends xn1.d>> eVar) {
            f fVar = new f(eVar);
            fVar.f220069f = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxn1/a$c;", "<unused var>", "Lxn1/d$d;", "Loq/i0;", "<anonymous>", "(Lxn1/a$c;Lxn1/d$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<xn1.a.c, xn1.d.InterfaceC5873d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220070e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f220070e;
            if (i15 == 0) {
                oq.u.b(obj);
                x xVar = x.this;
                xn1.a.b.C5871a c5871a = xn1.a.b.C5871a.f219960a;
                this.f220070e = 1;
                if (xVar.F(c5871a, this) == objE) {
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
        public final Object w(xn1.a.c cVar, xn1.d.InterfaceC5873d interfaceC5873d, tq.e<? super oq.i0> eVar) {
            return x.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxn1/a$g;", "action", "Lxn1/d$d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lxn1/a$g;Lxn1/d$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<xn1.a.OpenUrl, xn1.d.InterfaceC5873d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220072e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f220073f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xn1.a.OpenUrl openUrl = (xn1.a.OpenUrl) this.f220073f;
            Object objE = uq.b.e();
            int i15 = this.f220072e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = x.this.openUrlUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f220073f = vq.j.a(openUrl);
                this.f220072e = 1;
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
            x xVar = x.this;
            if (iVar instanceof dx.i.Left) {
                xVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xn1.a.OpenUrl openUrl, xn1.d.InterfaceC5873d interfaceC5873d, tq.e<? super oq.i0> eVar) {
            h hVar = x.this.new h(eVar);
            hVar.f220073f = openUrl;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxn1/a$f;", "<unused var>", "Lk10/c0;", "Lxn1/d$d;", "state", "Lk10/l;", "Lxn1/d;", "<anonymous>", "(Lxn1/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<xn1.a.f, k10.c0<xn1.d.InterfaceC5873d>, tq.e<? super k10.l<? extends xn1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220075e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f220076f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loading O(xn1.d.InterfaceC5873d interfaceC5873d) {
            return new Loading(interfaceC5873d.getType(), interfaceC5873d.getParentOrGuardData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f220076f;
            uq.b.e();
            if (this.f220075e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: xn1.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.i.O((d.InterfaceC5873d) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xn1.a.f fVar, k10.c0<xn1.d.InterfaceC5873d> c0Var, tq.e<? super k10.l<? extends xn1.d>> eVar) {
            i iVar = new i(eVar);
            iVar.f220076f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lxn1/h;", "state", "Lk10/l;", "Lxn1/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<k10.c0<Loading>, tq.e<? super k10.l<? extends xn1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220077e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f220078f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lxn1/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends xn1.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f220080e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f220081f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f220082g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f220083h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            boolean f220084j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f220085k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ x f220086l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k10.c0<Loading> f220087m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x xVar, k10.c0<Loading> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f220086l = xVar;
                this.f220087m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final xn1.d.a Y(k10.c0 c0Var, hb4.c cVar) {
                return new Error(((Loading) c0Var.a()).getType(), cVar, ((Loading) c0Var.a()).getParentOrGuardData());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final xn1.d.InitializedWithTrustedProfile Z(Loading loading) {
                return new xn1.d.InitializedWithTrustedProfile(loading.getType(), loading.getParentOrGuardData());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final xn1.d.a a0(k10.c0 c0Var, hb4.c cVar) {
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
                throw new UnsupportedOperationException("Method not decompiled: xn1.x.j.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f220086l, this.f220087m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends xn1.d>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f220078f;
            Object objE = uq.b.e();
            int i15 = this.f220077e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = x.this.callActionWithLoaderUC;
            a aVar2 = new a(x.this, c0Var, null);
            this.f220078f = vq.j.a(c0Var);
            this.f220077e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Loading> c0Var, tq.e<? super k10.l<? extends xn1.d>> eVar) {
            return ((j) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            j jVar = x.this.new j(eVar);
            jVar.f220078f = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxn1/b;", "<unused var>", "Lxn1/g;", "Loq/i0;", "<anonymous>", "(Lxn1/b;Lxn1/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<xn1.b, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220088e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f220088e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            x.this.d9(xn1.a.d.f219966a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xn1.b bVar, Error error, tq.e<? super oq.i0> eVar) {
            return x.this.new k(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxn1/c;", "<unused var>", "Lk10/c0;", "Lxn1/g;", "state", "Lk10/l;", "Lxn1/d;", "<anonymous>", "(Lxn1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<xn1.c, k10.c0<Error>, tq.e<? super k10.l<? extends xn1.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220090e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f220091f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loading O(Error error) {
            return new Loading(error.getType(), error.getParentOrGuardData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f220091f;
            uq.b.e();
            if (this.f220090e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: xn1.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.l.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xn1.c cVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends xn1.d>> eVar) {
            l lVar = new l(eVar);
            lVar.f220091f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxn1/d$c;", "it", "Loq/i0;", "<anonymous>", "(Lxn1/d$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.p<xn1.d.InitializedWithTrustedProfile, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220092e;

        m(tq.e<? super m> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f220092e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            iy.b0 b0VarA = x.this.getUserEdorAddressUC.a(gz.b.a.C1792a.f78542a);
            if (b0VarA != null) {
                x.this.d9(new xn1.a.OnNext(b0VarA));
            } else {
                x.this.d9(xn1.a.C5870a.f219959a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(xn1.d.InitializedWithTrustedProfile initializedWithTrustedProfile, tq.e<? super oq.i0> eVar) {
            return ((m) v(initializedWithTrustedProfile, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return x.this.new m(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxn1/a$a;", "<unused var>", "Lxn1/d$c;", "Loq/i0;", "<anonymous>", "(Lxn1/a$a;Lxn1/d$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<xn1.a.C5870a, xn1.d.InitializedWithTrustedProfile, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220094e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(x xVar, iy.b0 b0Var) {
            xVar.d9(new xn1.a.OnNext(b0Var));
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f220094e;
            if (i15 == 0) {
                oq.u.b(obj);
                x xVar = x.this;
                final x xVar2 = x.this;
                xn1.a.b.EdorAuth edorAuth = new xn1.a.b.EdorAuth(new mv3.a.EdorAddressRequired(new er.l() { // from class: xn1.g0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x.n.O(xVar2, (iy.b0) obj2);
                    }
                }, null, 2, null));
                this.f220094e = 1;
                if (xVar.F(edorAuth, this) == objE) {
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
        public final Object w(xn1.a.C5870a c5870a, xn1.d.InitializedWithTrustedProfile initializedWithTrustedProfile, tq.e<? super oq.i0> eVar) {
            return x.this.new n(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxn1/a$e;", "action", "Lxn1/d$c;", "state", "Loq/i0;", "<anonymous>", "(Lxn1/a$e;Lxn1/d$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<xn1.a.OnNext, xn1.d.InitializedWithTrustedProfile, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220096e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f220097f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f220098g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ yn1.a f220099h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ x f220100j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(yn1.a aVar, x xVar, tq.e<? super o> eVar) {
            super(3, eVar);
            this.f220099h = aVar;
            this.f220100j = xVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xn1.a.OnNext onNext = (xn1.a.OnNext) this.f220097f;
            xn1.d.InitializedWithTrustedProfile initializedWithTrustedProfile = (xn1.d.InitializedWithTrustedProfile) this.f220098g;
            Object objE = uq.b.e();
            int i15 = this.f220096e;
            if (i15 == 0) {
                oq.u.b(obj);
                this.f220099h.i(new WelcomeResult(initializedWithTrustedProfile.getParentOrGuardData(), onNext.getUserEdorAddress()));
                x xVar = this.f220100j;
                xn1.a.b.e eVar = xn1.a.b.e.f219963a;
                this.f220097f = vq.j.a(onNext);
                this.f220098g = vq.j.a(initializedWithTrustedProfile);
                this.f220096e = 1;
                if (xVar.F(eVar, this) == objE) {
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
        public final Object w(xn1.a.OnNext onNext, xn1.d.InitializedWithTrustedProfile initializedWithTrustedProfile, tq.e<? super oq.i0> eVar) {
            o oVar = new o(this.f220099h, this.f220100j, eVar);
            oVar.f220097f = onNext;
            oVar.f220098g = initializedWithTrustedProfile;
            return oVar.J(oq.i0.f148189a);
        }
    }

    public x(yy.a aVar, zn1.c cVar, ac4.a aVar2, ml0.o oVar, zn1.b bVar, a14.w wVar, i70.e eVar, jj0.b bVar2, hb4.d dVar, l44.e eVar2, final yn1.a aVar3) {
        this.mapper = cVar;
        this.callActionWithLoaderUC = aVar2;
        this.getParentOrGuardDataUseCase = oVar;
        this.errorMapper = bVar;
        this.openUrlUseCase = wVar;
        this.globalSnackBarManager = eVar;
        this.hasTrustedProfileUC = bVar2;
        this.errorVmsFactory = dVar;
        this.getUserEdorAddressUC = eVar2;
        Loading loading = new Loading(aVar3.getType());
        this.initialState = loading;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(loading, new er.l() { // from class: xn1.w
            @Override // er.l
            public final Object b(Object obj) {
                return x.G9(this.f220015a, aVar3, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), B9(loading));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xn1.i.a B9(xn1.d state) {
        return this.mapper.b(new zn1.c.Params(state, b9(xn1.a.c.f219965a), b9(xn1.a.f.f219969a), new er.l() { // from class: xn1.n
            @Override // er.l
            public final Object b(Object obj) {
                return x.C9(this.f220002a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(x xVar, String str) {
        xVar.d9(new xn1.a.OpenUrl(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D9(k10.c0<? extends xn1.d> c0Var, zn1.b.InterfaceC6364b interfaceC6364b, final er.l<? super hb4.c, ? extends xn1.d.a> lVar, tq.e<? super k10.l<? extends xn1.d>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f220039n;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f220039n = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f220037l;
        Object objE = uq.b.e();
        int i16 = aVar.f220039n;
        if (i16 != 0) {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k10.l lVar2 = (k10.l) aVar.f220034h;
            oq.u.b(obj);
            return lVar2;
        }
        oq.u.b(obj);
        final zn1.b.c cVarB = this.errorMapper.b(interfaceC6364b);
        if (cVarB instanceof zn1.b.c.Error) {
            return c0Var.d(new er.l() { // from class: xn1.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.E9(lVar, this, cVarB, (d) obj2);
                }
            });
        }
        if (!(cVarB instanceof zn1.b.c.ProhibitedAccess)) {
            throw new oq.p();
        }
        Object objC = c0Var.c();
        Object prohibitedAccess = new xn1.a.b.ProhibitedAccess(((zn1.b.c.ProhibitedAccess) cVarB).getData());
        aVar.f220030d = vq.j.a(c0Var);
        aVar.f220031e = vq.j.a(interfaceC6364b);
        aVar.f220032f = vq.j.a(lVar);
        aVar.f220033g = vq.j.a(cVarB);
        aVar.f220034h = objC;
        aVar.f220035j = vq.j.a(objC);
        aVar.f220036k = 0;
        aVar.f220039n = 1;
        return F(prohibitedAccess, aVar) == objE ? objE : objC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn1.d.a E9(er.l lVar, x xVar, zn1.b.c cVar, xn1.d dVar) {
        return (xn1.d.a) lVar.b(xVar.errorVmsFactory.a(((zn1.b.c.Error) cVar).getData()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(final x xVar, final yn1.a aVar, k10.v vVar) {
        vVar.c(q0.c(xn1.d.class), new er.l() { // from class: xn1.o
            @Override // er.l
            public final Object b(Object obj) {
                return x.H9(this.f220003a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Loading.class), new er.l() { // from class: xn1.p
            @Override // er.l
            public final Object b(Object obj) {
                return x.I9(this.f220004a, aVar, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: xn1.q
            @Override // er.l
            public final Object b(Object obj) {
                return x.J9(this.f220006a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(xn1.d.InterfaceC5873d.class), new er.l() { // from class: xn1.r
            @Override // er.l
            public final Object b(Object obj) {
                return x.K9(this.f220007a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Loading.class), new er.l() { // from class: xn1.s
            @Override // er.l
            public final Object b(Object obj) {
                return x.L9(this.f220008a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: xn1.t
            @Override // er.l
            public final Object b(Object obj) {
                return x.M9(this.f220009a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(xn1.d.InitializedWithTrustedProfile.class), new er.l() { // from class: xn1.u
            @Override // er.l
            public final Object b(Object obj) {
                return x.N9(this.f220010a, aVar, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(x xVar, k10.z zVar) {
        c cVar = xVar.new c(null);
        zVar.x(q0.c(xn1.a.d.class), k10.o.CANCEL_PREVIOUS, cVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(x xVar, yn1.a aVar, k10.z zVar) {
        zVar.A(xVar.new d(aVar, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(x xVar, k10.z zVar) {
        e eVar = xVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(xn1.b.class), oVar, eVar);
        zVar.v(q0.c(xn1.c.class), oVar, new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(x xVar, k10.z zVar) {
        g gVar = xVar.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(xn1.a.c.class), oVar, gVar);
        zVar.x(q0.c(xn1.a.OpenUrl.class), oVar, xVar.new h(null));
        zVar.v(q0.c(xn1.a.f.class), oVar, new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(x xVar, k10.z zVar) {
        zVar.A(xVar.new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(x xVar, k10.z zVar) {
        k kVar = xVar.new k(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(xn1.b.class), oVar, kVar);
        zVar.v(q0.c(xn1.c.class), oVar, new l(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(x xVar, yn1.a aVar, k10.z zVar) {
        zVar.C(xVar.new m(null));
        n nVar = xVar.new n(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(xn1.a.C5870a.class), oVar, nVar);
        zVar.x(q0.c(xn1.a.OnNext.class), oVar, new o(aVar, xVar, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zn1.b.InterfaceC6364b.Generic O9(dx.b bVar) {
        return new zn1.b.InterfaceC6364b.Generic(bVar, b9(xn1.c.f219972a), b9(xn1.b.f219971a));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(xn1.a.b bVar, tq.e<? super oq.i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: F9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(yn1.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<xn1.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<xn1.d, xn1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<xn1.i.a> getState() {
        return this.state;
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
