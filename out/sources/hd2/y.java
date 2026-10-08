package hd2;

import al0.IdentityCardSuspensionData;
import fr.q0;
import kd2.WelcomeResult;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006Bc\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J>\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020)*\n\u0012\u0006\b\u0001\u0012\u00020\u00020\"2\u0006\u0010$\u001a\u00020#2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%H\u0082@¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020\u0002H\u0002¢\u0006\u0004\b.\u0010/J\u0018\u00103\u001a\u0002022\u0006\u00101\u001a\u000200H\u0096\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u000202H\u0096\u0001¢\u0006\u0004\b5\u00106R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR \u0010S\u001a\b\u0012\u0004\u0012\u00020N0M8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR&\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030T8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR \u0010,\u001a\b\u0012\u0004\u0012\u00020-0Z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^¨\u0006_"}, d2 = {"Lhd2/y;", "Ll00/g;", "Lhd2/d;", "Lhd2/a;", "Lhd2/i;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Ljd2/c;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Ljj0/b;", "hasTrustedProfileUseCase", "La14/w;", "openUrlUseCase", "globalSnackBarManager", "Lml0/n;", "getIdentityCardSuspensionDataUC", "Ljd2/b;", "errorMapper", "Lhb4/d;", "errorVmsFactory", "Ll44/e;", "getUserEdorAddressUC", "Lid2/a;", "contract", "<init>", "(Lyy/a;Ljd2/c;Lac4/a;Ljj0/b;La14/w;Li70/e;Lml0/n;Ljd2/b;Lhb4/d;Ll44/e;Lid2/a;)V", "Ldx/b;", "Ljd2/b$b$a;", "O9", "(Ldx/b;)Ljd2/b$b$a;", "Lk10/c0;", "Ljd2/b$b;", "params", "Lkotlin/Function1;", "Lhb4/c;", "Lhd2/d$a;", "errorStateProvider", "Lk10/l;", "D9", "(Lk10/c0;Ljd2/b$b;Ler/l;Ltq/e;)Ljava/lang/Object;", "state", "Lhd2/i$a;", "B9", "(Lhd2/d;)Lhd2/i$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Ljd2/c;", "c", "Lac4/a;", "d", "Ljj0/b;", "e", "La14/w;", "f", "Li70/e;", "g", "Lml0/n;", "h", "Ljd2/b;", "j", "Lhb4/d;", "k", "Ll44/e;", "Lhd2/f;", "l", "Lhd2/f;", "initialState", "Lxw/b;", "Lhd2/a$b;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "n", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y extends l00.g<hd2.d, hd2.a> implements hd2.i, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jd2.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final jj0.b hasTrustedProfileUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ml0.n getIdentityCardSuspensionDataUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final jd2.b errorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVmsFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final l44.e getUserEdorAddressUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final hd2.f initialState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<hd2.a.b> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final k10.t<hd2.d, hd2.a> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p0<hd2.i.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f83822d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f83823e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f83824f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f83825g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f83826h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f83827j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f83828k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f83829l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f83831n;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f83829l = obj;
            this.f83831n |= PKIFailureInfo.systemUnavail;
            return y.this.D9(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<hd2.i.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f83832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f83833b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f83834a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f83835b;

            /* JADX INFO: renamed from: hd2.y$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1930a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f83836d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f83837e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f83838f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f83840h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f83841j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f83842k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f83843l;

                public C1930a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f83836d = obj;
                    this.f83837e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, y yVar) {
                this.f83834a = hVar;
                this.f83835b = yVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1930a c1930a;
                if (eVar instanceof C1930a) {
                    c1930a = (C1930a) eVar;
                    int i15 = c1930a.f83837e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1930a.f83837e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1930a = new C1930a(eVar);
                    }
                } else {
                    c1930a = new C1930a(eVar);
                }
                Object obj2 = c1930a.f83836d;
                Object objE = uq.b.e();
                int i16 = c1930a.f83837e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f83834a;
                    hd2.i.a aVarB9 = this.f83835b.B9((hd2.d) obj);
                    c1930a.f83838f = vq.j.a(obj);
                    c1930a.f83840h = vq.j.a(c1930a);
                    c1930a.f83841j = vq.j.a(obj);
                    c1930a.f83842k = vq.j.a(hVar);
                    c1930a.f83843l = 0;
                    c1930a.f83837e = 1;
                    if (hVar.F(aVarB9, c1930a) == objE) {
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

        public b(mu.g gVar, y yVar) {
            this.f83832a = gVar;
            this.f83833b = yVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super hd2.i.a> hVar, tq.e eVar) {
            Object objA = this.f83832a.a(new a(hVar, this.f83833b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhd2/a$c;", "<unused var>", "Lhd2/d;", "Loq/i0;", "<anonymous>", "(Lhd2/a$c;Lhd2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<hd2.a.c, hd2.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83844e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f83844e;
            if (i15 == 0) {
                oq.u.b(obj);
                y yVar = y.this;
                hd2.a.b.C1925a c1925a = hd2.a.b.C1925a.f83755a;
                this.f83844e = 1;
                if (yVar.F(c1925a, this) == objE) {
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
        public final Object w(hd2.a.c cVar, hd2.d dVar, tq.e<? super oq.i0> eVar) {
            return y.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lhd2/f;", "state", "Lk10/l;", "Lhd2/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<k10.c0<hd2.f>, tq.e<? super k10.l<? extends hd2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83846e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f83847f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lhd2/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends hd2.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f83849e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f83850f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f83851g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f83852h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f83853j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ y f83854k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ k10.c0<hd2.f> f83855l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y yVar, k10.c0<hd2.f> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f83854k = yVar;
                this.f83855l = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final hd2.d.a X(hb4.c cVar) {
                return new Error(cVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final hd2.d.Initialized Y(IdentityCardSuspensionData identityCardSuspensionData, hd2.f fVar) {
                return new hd2.d.Initialized(identityCardSuspensionData);
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
                    int r1 = r7.f83853j
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L26
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r0 = r7.f83850f
                    dx.b r0 = (dx.b) r0
                    java.lang.Object r0 = r7.f83849e
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
                    hd2.y r8 = r7.f83854k
                    ml0.n r8 = hd2.y.t9(r8)
                    gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                    r7.f83853j = r3
                    java.lang.Object r8 = r8.c(r1, r7)
                    if (r8 != r0) goto L3a
                    goto L6f
                L3a:
                    dx.i r8 = (dx.i) r8
                    hd2.y r1 = r7.f83854k
                    k10.c0<hd2.f> r3 = r7.f83855l
                    boolean r4 = r8 instanceof dx.i.Left
                    if (r4 == 0) goto L73
                    r4 = r8
                    dx.i$b r4 = (dx.i.Left) r4
                    java.lang.Object r4 = r4.b()
                    dx.b r4 = (dx.b) r4
                    jd2.b$b$a r5 = hd2.y.z9(r1, r4)
                    hd2.z r6 = new hd2.z
                    r6.<init>()
                    java.lang.Object r8 = vq.j.a(r8)
                    r7.f83849e = r8
                    java.lang.Object r8 = vq.j.a(r4)
                    r7.f83850f = r8
                    r8 = 0
                    r7.f83851g = r8
                    r7.f83852h = r8
                    r7.f83853j = r2
                    java.lang.Object r8 = hd2.y.y9(r1, r3, r5, r6, r7)
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
                    al0.f0 r8 = (al0.IdentityCardSuspensionData) r8
                    hd2.a0 r0 = new hd2.a0
                    r0.<init>()
                    k10.l r8 = r3.d(r0)
                    return r8
                L89:
                    oq.p r8 = new oq.p
                    r8.<init>()
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: hd2.y.d.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f83854k, this.f83855l, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends hd2.d>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f83847f;
            Object objE = uq.b.e();
            int i15 = this.f83846e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = y.this.callActionWithLoaderUseCase;
            a aVar2 = new a(y.this, c0Var, null);
            this.f83847f = vq.j.a(c0Var);
            this.f83846e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<hd2.f> c0Var, tq.e<? super k10.l<? extends hd2.d>> eVar) {
            return ((d) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            d dVar = y.this.new d(eVar);
            dVar.f83847f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhd2/b;", "<unused var>", "Lhd2/e;", "Loq/i0;", "<anonymous>", "(Lhd2/b;Lhd2/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<hd2.b, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83856e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f83856e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            y.this.d9(hd2.a.c.f83759a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(hd2.b bVar, Error error, tq.e<? super oq.i0> eVar) {
            return y.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhd2/c;", "<unused var>", "Lk10/c0;", "Lhd2/e;", "state", "Lk10/l;", "Lhd2/d;", "<anonymous>", "(Lhd2/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<hd2.c, k10.c0<Error>, tq.e<? super k10.l<? extends hd2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83858e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f83859f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hd2.f O(Error error) {
            return hd2.f.f83771a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f83859f;
            uq.b.e();
            if (this.f83858e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: hd2.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.f.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(hd2.c cVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends hd2.d>> eVar) {
            f fVar = new f(eVar);
            fVar.f83859f = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhd2/a$d;", "<unused var>", "Lk10/c0;", "Lhd2/d$d;", "state", "Lk10/l;", "Lhd2/d;", "<anonymous>", "(Lhd2/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<hd2.a.d, k10.c0<hd2.d.InterfaceC1927d>, tq.e<? super k10.l<? extends hd2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83860e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f83861f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loading O(hd2.d.InterfaceC1927d interfaceC1927d) {
            return new Loading(interfaceC1927d.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f83861f;
            uq.b.e();
            if (this.f83860e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: hd2.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.g.O((d.InterfaceC1927d) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(hd2.a.d dVar, k10.c0<hd2.d.InterfaceC1927d> c0Var, tq.e<? super k10.l<? extends hd2.d>> eVar) {
            g gVar = new g(eVar);
            gVar.f83861f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhd2/a$f;", "action", "Lhd2/d$d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lhd2/a$f;Lhd2/d$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<hd2.a.OnUrlClick, hd2.d.InterfaceC1927d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83862e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f83863f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            hd2.a.OnUrlClick onUrlClick = (hd2.a.OnUrlClick) this.f83863f;
            Object objE = uq.b.e();
            int i15 = this.f83862e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = y.this.openUrlUseCase;
                a14.w.Params params = new a14.w.Params(onUrlClick.getUrl(), false, 2, null);
                this.f83863f = vq.j.a(onUrlClick);
                this.f83862e = 1;
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
            y yVar = y.this;
            if (iVar instanceof dx.i.Left) {
                yVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(hd2.a.OnUrlClick onUrlClick, hd2.d.InterfaceC1927d interfaceC1927d, tq.e<? super oq.i0> eVar) {
            h hVar = y.this.new h(eVar);
            hVar.f83863f = onUrlClick;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lhd2/h;", "state", "Lk10/l;", "Lhd2/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<k10.c0<Loading>, tq.e<? super k10.l<? extends hd2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83865e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f83866f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lhd2/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends hd2.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f83868e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f83869f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f83870g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f83871h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            boolean f83872j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f83873k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ y f83874l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k10.c0<Loading> f83875m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y yVar, k10.c0<Loading> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f83874l = yVar;
                this.f83875m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final hd2.d.a Y(k10.c0 c0Var, hb4.c cVar) {
                return new Error(cVar, ((Loading) c0Var.a()).getData());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final hd2.d.InitializedWithTrustedProfile Z(Loading loading) {
                return new hd2.d.InitializedWithTrustedProfile(loading.getData());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final hd2.d.a a0(k10.c0 c0Var, hb4.c cVar) {
                return new Error(cVar, ((Loading) c0Var.a()).getData());
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
                throw new UnsupportedOperationException("Method not decompiled: hd2.y.i.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f83874l, this.f83875m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends hd2.d>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f83866f;
            Object objE = uq.b.e();
            int i15 = this.f83865e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = y.this.callActionWithLoaderUseCase;
            a aVar2 = new a(y.this, c0Var, null);
            this.f83866f = vq.j.a(c0Var);
            this.f83865e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Loading> c0Var, tq.e<? super k10.l<? extends hd2.d>> eVar) {
            return ((i) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            i iVar = y.this.new i(eVar);
            iVar.f83866f = obj;
            return iVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhd2/b;", "<unused var>", "Lhd2/g;", "Loq/i0;", "<anonymous>", "(Lhd2/b;Lhd2/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<hd2.b, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83876e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f83876e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            y.this.d9(hd2.a.c.f83759a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(hd2.b bVar, Error error, tq.e<? super oq.i0> eVar) {
            return y.this.new j(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhd2/c;", "<unused var>", "Lk10/c0;", "Lhd2/g;", "state", "Lk10/l;", "Lhd2/d;", "<anonymous>", "(Lhd2/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<hd2.c, k10.c0<Error>, tq.e<? super k10.l<? extends hd2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83878e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f83879f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loading O(Error error) {
            return new Loading(error.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f83879f;
            uq.b.e();
            if (this.f83878e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: hd2.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.k.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(hd2.c cVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends hd2.d>> eVar) {
            k kVar = new k(eVar);
            kVar.f83879f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhd2/d$c;", "it", "Loq/i0;", "<anonymous>", "(Lhd2/d$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<hd2.d.InitializedWithTrustedProfile, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83880e;

        l(tq.e<? super l> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f83880e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            iy.b0 b0VarA = y.this.getUserEdorAddressUC.a(gz.b.a.C1792a.f78542a);
            if (b0VarA != null) {
                y.this.d9(new hd2.a.OnNextScreen(b0VarA));
            } else {
                y.this.d9(hd2.a.C1924a.f83754a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(hd2.d.InitializedWithTrustedProfile initializedWithTrustedProfile, tq.e<? super oq.i0> eVar) {
            return ((l) v(initializedWithTrustedProfile, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return y.this.new l(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhd2/a$a;", "<unused var>", "Lhd2/d$c;", "Loq/i0;", "<anonymous>", "(Lhd2/a$a;Lhd2/d$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<hd2.a.C1924a, hd2.d.InitializedWithTrustedProfile, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83882e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(y yVar, iy.b0 b0Var) {
            yVar.d9(new hd2.a.OnNextScreen(b0Var));
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f83882e;
            if (i15 == 0) {
                oq.u.b(obj);
                y yVar = y.this;
                final y yVar2 = y.this;
                hd2.a.b.EdorAuth edorAuth = new hd2.a.b.EdorAuth(new mv3.a.EdorAddressRequired(new er.l() { // from class: hd2.h0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return y.m.O(yVar2, (iy.b0) obj2);
                    }
                }, null, 2, null));
                this.f83882e = 1;
                if (yVar.F(edorAuth, this) == objE) {
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
        public final Object w(hd2.a.C1924a c1924a, hd2.d.InitializedWithTrustedProfile initializedWithTrustedProfile, tq.e<? super oq.i0> eVar) {
            return y.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhd2/a$e;", "action", "Lhd2/d$c;", "state", "Loq/i0;", "<anonymous>", "(Lhd2/a$e;Lhd2/d$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<hd2.a.OnNextScreen, hd2.d.InitializedWithTrustedProfile, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83884e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f83885f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f83886g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ id2.a f83887h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ y f83888j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(id2.a aVar, y yVar, tq.e<? super n> eVar) {
            super(3, eVar);
            this.f83887h = aVar;
            this.f83888j = yVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            al0.c0 c0Var;
            hd2.a.OnNextScreen onNextScreen = (hd2.a.OnNextScreen) this.f83885f;
            hd2.d.InitializedWithTrustedProfile initializedWithTrustedProfile = (hd2.d.InitializedWithTrustedProfile) this.f83886g;
            Object objE = uq.b.e();
            int i15 = this.f83884e;
            if (i15 == 0) {
                oq.u.b(obj);
                id2.a aVar = this.f83887h;
                IdentityCardSuspensionData.a allowedAction = initializedWithTrustedProfile.getData().getAllowedAction();
                if (fr.t.c(allowedAction, IdentityCardSuspensionData.a.C0166a.f7353a)) {
                    c0Var = al0.c0.SUSPEND;
                } else {
                    if (!(allowedAction instanceof IdentityCardSuspensionData.a.Unsuspension)) {
                        throw new oq.p();
                    }
                    c0Var = al0.c0.UNSUSPEND;
                }
                aVar.a(new WelcomeResult(new WelcomeResult.Data(c0Var, initializedWithTrustedProfile.getData().getIdCardSeriesAndNumber(), onNextScreen.getUserEdorAddress())));
                y yVar = this.f83888j;
                hd2.a.b.d dVar = hd2.a.b.d.f83758a;
                this.f83885f = vq.j.a(onNextScreen);
                this.f83886g = vq.j.a(initializedWithTrustedProfile);
                this.f83884e = 1;
                if (yVar.F(dVar, this) == objE) {
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
        public final Object w(hd2.a.OnNextScreen onNextScreen, hd2.d.InitializedWithTrustedProfile initializedWithTrustedProfile, tq.e<? super oq.i0> eVar) {
            n nVar = new n(this.f83887h, this.f83888j, eVar);
            nVar.f83885f = onNextScreen;
            nVar.f83886g = initializedWithTrustedProfile;
            return nVar.J(oq.i0.f148189a);
        }
    }

    public y(yy.a aVar, jd2.c cVar, ac4.a aVar2, jj0.b bVar, a14.w wVar, i70.e eVar, ml0.n nVar, jd2.b bVar2, hb4.d dVar, l44.e eVar2, final id2.a aVar3) {
        this.mapper = cVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.hasTrustedProfileUseCase = bVar;
        this.openUrlUseCase = wVar;
        this.globalSnackBarManager = eVar;
        this.getIdentityCardSuspensionDataUC = nVar;
        this.errorMapper = bVar2;
        this.errorVmsFactory = dVar;
        this.getUserEdorAddressUC = eVar2;
        hd2.f fVar = hd2.f.f83771a;
        this.initialState = fVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(fVar, new er.l() { // from class: hd2.x
            @Override // er.l
            public final Object b(Object obj) {
                return y.G9(this.f83807a, aVar3, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), B9(fVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hd2.i.a B9(hd2.d state) {
        return this.mapper.b(new jd2.c.Params(state, new er.l() { // from class: hd2.v
            @Override // er.l
            public final Object b(Object obj) {
                return y.C9(this.f83803a, (String) obj);
            }
        }, b9(hd2.a.d.f83760a), b9(hd2.a.c.f83759a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(y yVar, String str) {
        yVar.d9(new hd2.a.OnUrlClick(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D9(k10.c0<? extends hd2.d> c0Var, jd2.b.InterfaceC2409b interfaceC2409b, final er.l<? super hb4.c, ? extends hd2.d.a> lVar, tq.e<? super k10.l<? extends hd2.d>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f83831n;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f83831n = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f83829l;
        Object objE = uq.b.e();
        int i16 = aVar.f83831n;
        if (i16 != 0) {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k10.l lVar2 = (k10.l) aVar.f83826h;
            oq.u.b(obj);
            return lVar2;
        }
        oq.u.b(obj);
        final jd2.b.c cVarB = this.errorMapper.b(interfaceC2409b);
        if (cVarB instanceof jd2.b.c.Error) {
            return c0Var.d(new er.l() { // from class: hd2.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.E9(lVar, this, cVarB, (d) obj2);
                }
            });
        }
        if (!(cVarB instanceof jd2.b.c.ProhibitedAccess)) {
            throw new oq.p();
        }
        Object objC = c0Var.c();
        Object prohibitedAccess = new hd2.a.b.ProhibitedAccess(((jd2.b.c.ProhibitedAccess) cVarB).getData());
        aVar.f83822d = vq.j.a(c0Var);
        aVar.f83823e = vq.j.a(interfaceC2409b);
        aVar.f83824f = vq.j.a(lVar);
        aVar.f83825g = vq.j.a(cVarB);
        aVar.f83826h = objC;
        aVar.f83827j = vq.j.a(objC);
        aVar.f83828k = 0;
        aVar.f83831n = 1;
        return F(prohibitedAccess, aVar) == objE ? objE : objC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hd2.d.a E9(er.l lVar, y yVar, jd2.b.c cVar, hd2.d dVar) {
        return (hd2.d.a) lVar.b(yVar.errorVmsFactory.a(((jd2.b.c.Error) cVar).getData()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(final y yVar, final id2.a aVar, k10.v vVar) {
        vVar.c(q0.c(hd2.d.class), new er.l() { // from class: hd2.o
            @Override // er.l
            public final Object b(Object obj) {
                return y.H9(this.f83795a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(hd2.f.class), new er.l() { // from class: hd2.p
            @Override // er.l
            public final Object b(Object obj) {
                return y.I9(this.f83796a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: hd2.q
            @Override // er.l
            public final Object b(Object obj) {
                return y.J9(this.f83797a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(hd2.d.InterfaceC1927d.class), new er.l() { // from class: hd2.r
            @Override // er.l
            public final Object b(Object obj) {
                return y.K9(this.f83798a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Loading.class), new er.l() { // from class: hd2.s
            @Override // er.l
            public final Object b(Object obj) {
                return y.L9(this.f83799a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: hd2.t
            @Override // er.l
            public final Object b(Object obj) {
                return y.M9(this.f83800a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(hd2.d.InitializedWithTrustedProfile.class), new er.l() { // from class: hd2.u
            @Override // er.l
            public final Object b(Object obj) {
                return y.N9(this.f83801a, aVar, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(y yVar, k10.z zVar) {
        c cVar = yVar.new c(null);
        zVar.x(q0.c(hd2.a.c.class), k10.o.CANCEL_PREVIOUS, cVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(y yVar, k10.z zVar) {
        zVar.A(yVar.new d(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(y yVar, k10.z zVar) {
        e eVar = yVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(hd2.b.class), oVar, eVar);
        zVar.v(q0.c(hd2.c.class), oVar, new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(y yVar, k10.z zVar) {
        g gVar = new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(hd2.a.d.class), oVar, gVar);
        zVar.x(q0.c(hd2.a.OnUrlClick.class), oVar, yVar.new h(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(y yVar, k10.z zVar) {
        zVar.A(yVar.new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(y yVar, k10.z zVar) {
        j jVar = yVar.new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(hd2.b.class), oVar, jVar);
        zVar.v(q0.c(hd2.c.class), oVar, new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(y yVar, id2.a aVar, k10.z zVar) {
        zVar.C(yVar.new l(null));
        m mVar = yVar.new m(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(hd2.a.C1924a.class), oVar, mVar);
        zVar.x(q0.c(hd2.a.OnNextScreen.class), oVar, new n(aVar, yVar, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jd2.b.InterfaceC2409b.Generic O9(dx.b bVar) {
        return new jd2.b.InterfaceC2409b.Generic(bVar, b9(hd2.c.f83766a), b9(hd2.b.f83765a));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(hd2.a.b bVar, tq.e<? super oq.i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: F9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(id2.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<hd2.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<hd2.d, hd2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<hd2.i.a> getState() {
        return this.state;
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
