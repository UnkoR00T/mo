package gy1;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001`Bs\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010'\u001a\u00020&H\u0082@¢\u0006\u0004\b)\u0010*J!\u0010/\u001a\u00020.*\u00020(2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+H\u0002¢\u0006\u0004\b/\u00100J(\u00106\u001a\u00020\u00022\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b6\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR \u0010T\u001a\b\u0012\u0004\u0012\u00020O0N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR&\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030U8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR \u0010\"\u001a\b\u0012\u0004\u0012\u00020#0[8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_¨\u0006a"}, d2 = {"Lgy1/t;", "Ll00/g;", "Lgy1/c;", "Lgy1/b;", "Lgy1/d;", "", "Lyy/a;", "stateMachineFactory", "Lac4/b;", "checkNFCStatusUseCase", "Lxw1/b;", "nfcDialogMapper", "Lac4/i;", "goToNfcSettingsUseCase", "Lhy1/a;", "mapper", "Liy1/b;", "errorMapper", "Lhb4/d;", "errorVMSFactory", "Lac4/k;", "nfcDisableReadingUseCase", "Lrw1/e;", "compareCertDataWithUserDataUseCase", "Ljx/g;", "systemInfo", "Lic4/b;", "nfcEdoEnableReadingUseCase", "Lac4/l;", "nfcMonitorReadingUseCase", "Lgy1/e;", "setupContract", "<init>", "(Lyy/a;Lac4/b;Lxw1/b;Lac4/i;Lhy1/a;Liy1/b;Lhb4/d;Lac4/k;Lrw1/e;Ljx/g;Lic4/b;Lac4/l;Lgy1/e;)V", "state", "Lgy1/d$a;", "E9", "(Lgy1/c;)Lgy1/d$a;", "Lcy/c$a;", "error", "Liy1/c;", "D9", "(Lcy/c$a;Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function0;", "Loq/i0;", "onRetry", "Ljb4/b;", "C9", "(Liy1/c;Ler/a;)Ljb4/b;", "Liy/b0;", "x509Cert", "Lgy1/c$b$f;", "currentStateData", "nextState", "P9", "(Liy/b0;Lgy1/c$b$f;Lgy1/c;Ltq/e;)Ljava/lang/Object;", "b", "Lac4/b;", "c", "Lxw1/b;", "d", "Lac4/i;", "e", "Lhy1/a;", "f", "Liy1/b;", "g", "Lhb4/d;", "h", "Lac4/k;", "j", "Lrw1/e;", "k", "Lgy1/e;", "Lgy1/c$a;", "l", "Lgy1/c$a;", "initialState", "Lxw/b;", "Lgy1/b$d;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "n", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<gy1.c, gy1.b> implements gy1.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.b checkNFCStatusUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xw1.b nfcDialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.i goToNfcSettingsUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hy1.a mapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final iy1.b errorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ac4.k nfcDisableReadingUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final rw1.e compareCertDataWithUserDataUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final gy1.e setupContract;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final gy1.c.Init initialState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<gy1.b.d> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final k10.t<gy1.c, gy1.b> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<gy1.d.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lgy1/t$a;", "Lf00/j0;", "Lgy1/e;", "Lgy1/t;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f00.j0<gy1.e, t> {
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f78360b;

        static {
            int[] iArr = new int[ic4.c.values().length];
            try {
                iArr[ic4.c.INTERRUPTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ic4.c.INTERRUPTED_TAG_LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ic4.c.INTERRUPTED_TECHNICAL_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f78359a = iArr;
            int[] iArr2 = new int[ic4.a.values().length];
            try {
                iArr2[ic4.a.INTERRUPTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ic4.a.INCORRECT_CAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ic4.a.TIMEOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ic4.a.CERTIFICATE_INACTIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ic4.a.CERTIFICATE_MISSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ic4.a.DATA_MISSING.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            f78360b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f78361d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f78362e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78363f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f78365h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f78363f = obj;
            this.f78365h |= PKIFailureInfo.systemUnavail;
            return t.this.D9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<gy1.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f78366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f78367b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f78368a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f78369b;

            /* JADX INFO: renamed from: gy1.t$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1784a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f78370d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f78371e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f78372f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f78374h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f78375j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f78376k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f78377l;

                public C1784a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f78370d = obj;
                    this.f78371e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, t tVar) {
                this.f78368a = hVar;
                this.f78369b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1784a c1784a;
                if (eVar instanceof C1784a) {
                    c1784a = (C1784a) eVar;
                    int i15 = c1784a.f78371e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1784a.f78371e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1784a = new C1784a(eVar);
                    }
                } else {
                    c1784a = new C1784a(eVar);
                }
                Object obj2 = c1784a.f78370d;
                Object objE = uq.b.e();
                int i16 = c1784a.f78371e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f78368a;
                    gy1.d.a aVarE9 = this.f78369b.E9((gy1.c) obj);
                    c1784a.f78372f = vq.j.a(obj);
                    c1784a.f78374h = vq.j.a(c1784a);
                    c1784a.f78375j = vq.j.a(obj);
                    c1784a.f78376k = vq.j.a(hVar);
                    c1784a.f78377l = 0;
                    c1784a.f78371e = 1;
                    if (hVar.F(aVarE9, c1784a) == objE) {
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

        public d(mu.g gVar, t tVar) {
            this.f78366a = gVar;
            this.f78367b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super gy1.d.a> hVar, tq.e eVar) {
            Object objA = this.f78366a.a(new a(hVar, this.f78367b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lgy1/c$a;", "state", "Lk10/l;", "Lgy1/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<k10.c0<gy1.c.Init>, tq.e<? super k10.l<? extends gy1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78378e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78379f;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy1.c.b.CheckNfc O(t tVar, gy1.c.Init init) {
            return new gy1.c.b.CheckNfc(new gy1.c.b.StateData(tVar.setupContract.O(), null, null, null, init.getAreAnimationsEnabled(), 14, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f78379f;
            uq.b.e();
            if (this.f78378e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final t tVar = t.this;
            return c0Var.d(new er.l() { // from class: gy1.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.e.O(tVar, (c.Init) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<gy1.c.Init> c0Var, tq.e<? super k10.l<? extends gy1.c>> eVar) {
            return ((e) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = t.this.new e(eVar);
            eVar2.f78379f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lgy1/c$b$a;", "state", "Lk10/l;", "Lgy1/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<k10.c0<gy1.c.b.CheckNfc>, tq.e<? super k10.l<? extends gy1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78381e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78382f;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy1.c.b.ReadPresenceCert O(gy1.c.b.CheckNfc checkNfc) {
            return new gy1.c.b.ReadPresenceCert(checkNfc.getData(), null, 2, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
        
            if (r10.F(r2, r9) == r1) goto L21;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f78382f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r9.f78381e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r10)
                goto L89
            L16:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1e:
                oq.u.b(r10)
                goto L38
            L22:
                oq.u.b(r10)
                gy1.t r10 = gy1.t.this
                ac4.b r10 = gy1.t.s9(r10)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r9.f78382f = r0
                r9.f78381e = r4
                java.lang.Object r10 = r10.c(r2, r9)
                if (r10 != r1) goto L38
                goto L88
            L38:
                ac4.b$a r10 = (ac4.b.a) r10
                ac4.b$a$b r2 = ac4.b.a.C0108b.f5391a
                boolean r2 = fr.t.c(r10, r2)
                if (r2 == 0) goto L4c
                gy1.v r10 = new gy1.v
                r10.<init>()
                k10.l r10 = r0.d(r10)
                return r10
            L4c:
                ac4.b$a$a r2 = ac4.b.a.C0107a.f5390a
                boolean r10 = fr.t.c(r10, r2)
                if (r10 == 0) goto L8e
                gy1.t r10 = gy1.t.this
                xw.b r10 = r10.Y1()
                gy1.b$d$e r2 = new gy1.b$d$e
                gy1.t r4 = gy1.t.this
                xw1.b r4 = gy1.t.v9(r4)
                xw1.b$a r5 = new xw1.b$a
                gy1.t r6 = gy1.t.this
                gy1.b$e r7 = gy1.b.e.f78270a
                er.a r6 = gy1.t.q9(r6, r7)
                gy1.t r7 = gy1.t.this
                gy1.b$a r8 = gy1.b.a.f78262a
                er.a r7 = gy1.t.q9(r7, r8)
                r5.<init>(r6, r7)
                cb4.d r4 = r4.b(r5)
                r2.<init>(r4)
                r9.f78382f = r0
                r9.f78381e = r3
                java.lang.Object r10 = r10.F(r2, r9)
                if (r10 != r1) goto L89
            L88:
                return r1
            L89:
                k10.l r10 = r0.c()
                return r10
            L8e:
                oq.p r10 = new oq.p
                r10.<init>()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: gy1.t.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<gy1.c.b.CheckNfc> c0Var, tq.e<? super k10.l<? extends gy1.c>> eVar) {
            return ((f) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            f fVar = t.this.new f(eVar);
            fVar.f78382f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgy1/b$e;", "<unused var>", "Lk10/c0;", "Lgy1/c$b$a;", "state", "Lk10/l;", "Lgy1/c;", "<anonymous>", "(Lgy1/b$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<gy1.b.e, k10.c0<gy1.c.b.CheckNfc>, tq.e<? super k10.l<? extends gy1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78384e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78385f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy1.c.b.Error O(k10.c0 c0Var, t tVar, dx.b.Business business, gy1.c.b.CheckNfc checkNfc) {
            return new gy1.c.b.Error(((gy1.c.b.CheckNfc) c0Var.a()).getData(), tVar.errorVMSFactory.a(tVar.C9(new iy1.c.GenericError(business), tVar.b9(gy1.b.a.f78262a))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f78385f;
            Object objE = uq.b.e();
            int i15 = this.f78384e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.i iVar = t.this.goToNfcSettingsUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f78385f = c0Var;
                this.f78384e = 1;
                obj = iVar.c(c1792a, this);
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
            final t tVar = t.this;
            if (iVar2 instanceof dx.i.Left) {
                final dx.b.Business business = (dx.b.Business) ((dx.i.Left) iVar2).b();
                return c0Var.d(new er.l() { // from class: gy1.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.g.O(c0Var, tVar, business, (c.b.CheckNfc) obj2);
                    }
                });
            }
            if (!(iVar2 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            tVar.d9(gy1.b.a.f78262a);
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(gy1.b.e eVar, k10.c0<gy1.c.b.CheckNfc> c0Var, tq.e<? super k10.l<? extends gy1.c>> eVar2) {
            g gVar = t.this.new g(eVar2);
            gVar.f78385f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lgy1/c$b$e;", "state", "Lk10/l;", "Lgy1/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<k10.c0<gy1.c.b.ReadPresenceCert>, tq.e<? super k10.l<? extends gy1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f78387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f78388f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f78389g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ic4.b f78391j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ic4.b bVar, tq.e<? super h> eVar) {
            super(2, eVar);
            this.f78391j = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy1.c.b.Error V(k10.c0 c0Var, t tVar, gy1.c.b.ReadPresenceCert readPresenceCert) {
            return new gy1.c.b.Error(((gy1.c.b.ReadPresenceCert) c0Var.a()).getData(), tVar.errorVMSFactory.a(tVar.C9(iy1.c.b.GENERIC_ERROR, new er.a() { // from class: gy1.y
                @Override // er.a
                public final Object a() {
                    return t.h.X();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X() {
            return oq.i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
        
            if (r11 == r1) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = r10.f78389g
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r10.f78388f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 == r4) goto L22
                if (r2 != r3) goto L1a
                java.lang.Object r1 = r10.f78387e
                cy.b$a$h r1 = (cy.b.a.ReadCertificate) r1
                oq.u.b(r11)
                goto L6b
            L1a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L22:
                oq.u.b(r11)
                goto L3c
            L26:
                oq.u.b(r11)
                gy1.t r11 = gy1.t.this
                ac4.k r11 = gy1.t.w9(r11)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r10.f78389g = r0
                r10.f78388f = r4
                java.lang.Object r11 = r11.c(r2, r10)
                if (r11 != r1) goto L3c
                goto L6a
            L3c:
                cy.b$a$h r4 = new cy.b$a$h
                java.lang.Object r11 = r0.a()
                gy1.c$b$e r11 = (gy1.c.b.ReadPresenceCert) r11
                gy1.c$b$f r11 = r11.getData()
                iy.b0 r11 = r11.getCan()
                java.lang.String r5 = iy.c0.e(r11)
                cy.b$a$c r6 = cy.b.a.c.PRESENCE
                r8 = 4
                r9 = 0
                r7 = 0
                r4.<init>(r5, r6, r7, r8, r9)
                ic4.b r11 = r10.f78391j
                r10.f78389g = r0
                java.lang.Object r2 = vq.j.a(r4)
                r10.f78387e = r2
                r10.f78388f = r3
                java.lang.Object r11 = r11.c(r4, r10)
                if (r11 != r1) goto L6b
            L6a:
                return r1
            L6b:
                dx.i r11 = (dx.i) r11
                gy1.t r1 = gy1.t.this
                boolean r2 = r11 instanceof dx.i.Left
                if (r2 == 0) goto L85
                dx.i$b r11 = (dx.i.Left) r11
                java.lang.Object r11 = r11.b()
                dx.b r11 = (dx.b) r11
                gy1.x r11 = new gy1.x
                r11.<init>()
                k10.l r11 = r0.d(r11)
                return r11
            L85:
                boolean r1 = r11 instanceof dx.i.Right
                if (r1 == 0) goto L96
                dx.i$c r11 = (dx.i.Right) r11
                java.lang.Object r11 = r11.b()
                oq.i0 r11 = (oq.i0) r11
                k10.l r11 = r0.c()
                return r11
            L96:
                oq.p r11 = new oq.p
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: gy1.t.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<gy1.c.b.ReadPresenceCert> c0Var, tq.e<? super k10.l<? extends gy1.c>> eVar) {
            return ((h) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            h hVar = t.this.new h(this.f78391j, eVar);
            hVar.f78389g = obj;
            return hVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcy/c;", "value", "Lk10/c0;", "Lgy1/c$b$e;", "state", "Lk10/l;", "Lgy1/c;", "<anonymous>", "(Lcy/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<cy.c, k10.c0<gy1.c.b.ReadPresenceCert>, tq.e<? super k10.l<? extends gy1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78392e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78393f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f78394g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy1.c.b.Error c0(k10.c0 c0Var, t tVar, iy1.c cVar, gy1.c.b.ReadPresenceCert readPresenceCert) {
            return new gy1.c.b.Error(((gy1.c.b.ReadPresenceCert) c0Var.a()).getData(), tVar.errorVMSFactory.a(tVar.C9(cVar, new er.a() { // from class: gy1.f0
                @Override // er.a
                public final Object a() {
                    return t.i.d0();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 d0() {
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy1.c.b.ReadPresenceCert e0(cy.c cVar, gy1.c.b.ReadPresenceCert readPresenceCert) {
            return gy1.c.b.ReadPresenceCert.e(readPresenceCert, null, cVar, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy1.c.b.ReadAuthenticationCert f0(k10.c0 c0Var, iy1.c cVar, gy1.c.b.ReadPresenceCert readPresenceCert) {
            return new gy1.c.b.ReadAuthenticationCert(gy1.c.b.StateData.b(((gy1.c.b.ReadPresenceCert) c0Var.a()).getData(), null, new gy1.a.Error(cVar), null, null, false, 29, null), null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy1.c g0(gy1.c cVar, gy1.c.b.ReadPresenceCert readPresenceCert) {
            return cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy1.c.b.ReadPresenceCert h0(cy.c cVar, gy1.c.b.ReadPresenceCert readPresenceCert) {
            return gy1.c.b.ReadPresenceCert.e(readPresenceCert, null, cVar, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy1.c.b.Error i0(k10.c0 c0Var, t tVar, gy1.c.b.ReadPresenceCert readPresenceCert) {
            return new gy1.c.b.Error(((gy1.c.b.ReadPresenceCert) c0Var.a()).getData(), tVar.errorVMSFactory.a(tVar.C9(iy1.c.b.GENERIC_ERROR, new er.a() { // from class: gy1.g0
                @Override // er.a
                public final Object a() {
                    return t.i.j0();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 j0() {
            return oq.i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
        
            if (r4 == r3) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00d3, code lost:
        
            if (r1 == r3) goto L31;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 271
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: gy1.t.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public final Object w(cy.c cVar, k10.c0<gy1.c.b.ReadPresenceCert> c0Var, tq.e<? super k10.l<? extends gy1.c>> eVar) {
            i iVar = t.this.new i(eVar);
            iVar.f78393f = cVar;
            iVar.f78394g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lgy1/c$b$c;", "state", "Lk10/l;", "Lgy1/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<k10.c0<gy1.c.b.ReadAuthenticationCert>, tq.e<? super k10.l<? extends gy1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f78396e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f78397f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f78398g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ic4.b f78400j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ic4.b bVar, tq.e<? super j> eVar) {
            super(2, eVar);
            this.f78400j = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy1.c.b.Error V(k10.c0 c0Var, t tVar, gy1.c.b.ReadAuthenticationCert readAuthenticationCert) {
            return new gy1.c.b.Error(((gy1.c.b.ReadAuthenticationCert) c0Var.a()).getData(), tVar.errorVMSFactory.a(tVar.C9(iy1.c.b.GENERIC_ERROR, new er.a() { // from class: gy1.i0
                @Override // er.a
                public final Object a() {
                    return t.j.X();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X() {
            return oq.i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
        
            if (r11 == r1) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = r10.f78398g
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r10.f78397f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 == r4) goto L22
                if (r2 != r3) goto L1a
                java.lang.Object r1 = r10.f78396e
                cy.b$a$h r1 = (cy.b.a.ReadCertificate) r1
                oq.u.b(r11)
                goto L6b
            L1a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L22:
                oq.u.b(r11)
                goto L3c
            L26:
                oq.u.b(r11)
                gy1.t r11 = gy1.t.this
                ac4.k r11 = gy1.t.w9(r11)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r10.f78398g = r0
                r10.f78397f = r4
                java.lang.Object r11 = r11.c(r2, r10)
                if (r11 != r1) goto L3c
                goto L6a
            L3c:
                cy.b$a$h r4 = new cy.b$a$h
                java.lang.Object r11 = r0.a()
                gy1.c$b$c r11 = (gy1.c.b.ReadAuthenticationCert) r11
                gy1.c$b$f r11 = r11.getData()
                iy.b0 r11 = r11.getCan()
                java.lang.String r5 = iy.c0.e(r11)
                cy.b$a$c r6 = cy.b.a.c.AUTHENTICATION
                r8 = 4
                r9 = 0
                r7 = 0
                r4.<init>(r5, r6, r7, r8, r9)
                ic4.b r11 = r10.f78400j
                r10.f78398g = r0
                java.lang.Object r2 = vq.j.a(r4)
                r10.f78396e = r2
                r10.f78397f = r3
                java.lang.Object r11 = r11.c(r4, r10)
                if (r11 != r1) goto L6b
            L6a:
                return r1
            L6b:
                dx.i r11 = (dx.i) r11
                gy1.t r1 = gy1.t.this
                boolean r2 = r11 instanceof dx.i.Left
                if (r2 == 0) goto L85
                dx.i$b r11 = (dx.i.Left) r11
                java.lang.Object r11 = r11.b()
                dx.b r11 = (dx.b) r11
                gy1.h0 r11 = new gy1.h0
                r11.<init>()
                k10.l r11 = r0.d(r11)
                return r11
            L85:
                boolean r1 = r11 instanceof dx.i.Right
                if (r1 == 0) goto L96
                dx.i$c r11 = (dx.i.Right) r11
                java.lang.Object r11 = r11.b()
                oq.i0 r11 = (oq.i0) r11
                k10.l r11 = r0.c()
                return r11
            L96:
                oq.p r11 = new oq.p
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: gy1.t.j.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<gy1.c.b.ReadAuthenticationCert> c0Var, tq.e<? super k10.l<? extends gy1.c>> eVar) {
            return ((j) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            j jVar = t.this.new j(this.f78400j, eVar);
            jVar.f78398g = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcy/c;", "value", "Lk10/c0;", "Lgy1/c$b$c;", "state", "Lk10/l;", "Lgy1/c;", "<anonymous>", "(Lcy/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<cy.c, k10.c0<gy1.c.b.ReadAuthenticationCert>, tq.e<? super k10.l<? extends gy1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78401e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78402f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f78403g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy1.c.b.Error c0(k10.c0 c0Var, t tVar, iy1.c cVar, gy1.c.b.ReadAuthenticationCert readAuthenticationCert) {
            return new gy1.c.b.Error(((gy1.c.b.ReadAuthenticationCert) c0Var.a()).getData(), tVar.errorVMSFactory.a(tVar.C9(cVar, new er.a() { // from class: gy1.p0
                @Override // er.a
                public final Object a() {
                    return t.k.d0();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 d0() {
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy1.c.b.ReadAuthenticationCert e0(cy.c cVar, gy1.c.b.ReadAuthenticationCert readAuthenticationCert) {
            return gy1.c.b.ReadAuthenticationCert.e(readAuthenticationCert, null, cVar, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy1.c.b.ReadAuthorizationCert f0(k10.c0 c0Var, iy1.c cVar, gy1.c.b.ReadAuthenticationCert readAuthenticationCert) {
            return new gy1.c.b.ReadAuthorizationCert(gy1.c.b.StateData.b(((gy1.c.b.ReadAuthenticationCert) c0Var.a()).getData(), null, null, new gy1.a.Error(cVar), null, false, 27, null), null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy1.c g0(gy1.c cVar, gy1.c.b.ReadAuthenticationCert readAuthenticationCert) {
            return cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy1.c.b.ReadAuthenticationCert h0(cy.c cVar, gy1.c.b.ReadAuthenticationCert readAuthenticationCert) {
            return gy1.c.b.ReadAuthenticationCert.e(readAuthenticationCert, null, cVar, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy1.c.b.Error i0(k10.c0 c0Var, t tVar, gy1.c.b.ReadAuthenticationCert readAuthenticationCert) {
            return new gy1.c.b.Error(((gy1.c.b.ReadAuthenticationCert) c0Var.a()).getData(), tVar.errorVMSFactory.a(tVar.C9(iy1.c.b.GENERIC_ERROR, new er.a() { // from class: gy1.q0
                @Override // er.a
                public final Object a() {
                    return t.k.j0();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 j0() {
            return oq.i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
        
            if (r4 == r3) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00d3, code lost:
        
            if (r1 == r3) goto L31;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 271
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: gy1.t.k.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public final Object w(cy.c cVar, k10.c0<gy1.c.b.ReadAuthenticationCert> c0Var, tq.e<? super k10.l<? extends gy1.c>> eVar) {
            k kVar = t.this.new k(eVar);
            kVar.f78402f = cVar;
            kVar.f78403g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lgy1/c$b$d;", "state", "Lk10/l;", "Lgy1/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<k10.c0<gy1.c.b.ReadAuthorizationCert>, tq.e<? super k10.l<? extends gy1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f78405e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f78406f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f78407g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ ic4.b f78409j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(ic4.b bVar, tq.e<? super l> eVar) {
            super(2, eVar);
            this.f78409j = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy1.c.b.Error V(k10.c0 c0Var, t tVar, gy1.c.b.ReadAuthorizationCert readAuthorizationCert) {
            return new gy1.c.b.Error(((gy1.c.b.ReadAuthorizationCert) c0Var.a()).getData(), tVar.errorVMSFactory.a(tVar.C9(iy1.c.b.GENERIC_ERROR, new er.a() { // from class: gy1.s0
                @Override // er.a
                public final Object a() {
                    return t.l.X();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X() {
            return oq.i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
        
            if (r11 == r1) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = r10.f78407g
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r10.f78406f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 == r4) goto L22
                if (r2 != r3) goto L1a
                java.lang.Object r1 = r10.f78405e
                cy.b$a$h r1 = (cy.b.a.ReadCertificate) r1
                oq.u.b(r11)
                goto L6b
            L1a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L22:
                oq.u.b(r11)
                goto L3c
            L26:
                oq.u.b(r11)
                gy1.t r11 = gy1.t.this
                ac4.k r11 = gy1.t.w9(r11)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r10.f78407g = r0
                r10.f78406f = r4
                java.lang.Object r11 = r11.c(r2, r10)
                if (r11 != r1) goto L3c
                goto L6a
            L3c:
                cy.b$a$h r4 = new cy.b$a$h
                java.lang.Object r11 = r0.a()
                gy1.c$b$d r11 = (gy1.c.b.ReadAuthorizationCert) r11
                gy1.c$b$f r11 = r11.getData()
                iy.b0 r11 = r11.getCan()
                java.lang.String r5 = iy.c0.e(r11)
                cy.b$a$c r6 = cy.b.a.c.AUTHORIZATION
                r8 = 4
                r9 = 0
                r7 = 0
                r4.<init>(r5, r6, r7, r8, r9)
                ic4.b r11 = r10.f78409j
                r10.f78407g = r0
                java.lang.Object r2 = vq.j.a(r4)
                r10.f78405e = r2
                r10.f78406f = r3
                java.lang.Object r11 = r11.c(r4, r10)
                if (r11 != r1) goto L6b
            L6a:
                return r1
            L6b:
                dx.i r11 = (dx.i) r11
                gy1.t r1 = gy1.t.this
                boolean r2 = r11 instanceof dx.i.Left
                if (r2 == 0) goto L85
                dx.i$b r11 = (dx.i.Left) r11
                java.lang.Object r11 = r11.b()
                dx.b r11 = (dx.b) r11
                gy1.r0 r11 = new gy1.r0
                r11.<init>()
                k10.l r11 = r0.d(r11)
                return r11
            L85:
                boolean r1 = r11 instanceof dx.i.Right
                if (r1 == 0) goto L96
                dx.i$c r11 = (dx.i.Right) r11
                java.lang.Object r11 = r11.b()
                oq.i0 r11 = (oq.i0) r11
                k10.l r11 = r0.c()
                return r11
            L96:
                oq.p r11 = new oq.p
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: gy1.t.l.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<gy1.c.b.ReadAuthorizationCert> c0Var, tq.e<? super k10.l<? extends gy1.c>> eVar) {
            return ((l) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            l lVar = t.this.new l(this.f78409j, eVar);
            lVar.f78407g = obj;
            return lVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcy/c;", "value", "Lk10/c0;", "Lgy1/c$b$d;", "state", "Lk10/l;", "Lgy1/c;", "<anonymous>", "(Lcy/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<cy.c, k10.c0<gy1.c.b.ReadAuthorizationCert>, tq.e<? super k10.l<? extends gy1.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78410e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78411f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f78412g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy1.c.b.Error c0(k10.c0 c0Var, t tVar, iy1.c cVar, gy1.c.b.ReadAuthorizationCert readAuthorizationCert) {
            return new gy1.c.b.Error(((gy1.c.b.ReadAuthorizationCert) c0Var.a()).getData(), tVar.errorVMSFactory.a(tVar.C9(cVar, new er.a() { // from class: gy1.z0
                @Override // er.a
                public final Object a() {
                    return t.m.d0();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 d0() {
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy1.c.b.ReadAuthorizationCert e0(cy.c cVar, gy1.c.b.ReadAuthorizationCert readAuthorizationCert) {
            return gy1.c.b.ReadAuthorizationCert.e(readAuthorizationCert, null, cVar, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy1.c.b.Success f0(k10.c0 c0Var, iy1.c cVar, gy1.c.b.ReadAuthorizationCert readAuthorizationCert) {
            return new gy1.c.b.Success(gy1.c.b.StateData.b(((gy1.c.b.ReadAuthorizationCert) c0Var.a()).getData(), null, null, null, new gy1.a.Error(cVar), false, 23, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy1.c g0(gy1.c cVar, gy1.c.b.ReadAuthorizationCert readAuthorizationCert) {
            return cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy1.c.b.ReadAuthorizationCert h0(cy.c cVar, gy1.c.b.ReadAuthorizationCert readAuthorizationCert) {
            return gy1.c.b.ReadAuthorizationCert.e(readAuthorizationCert, null, cVar, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy1.c.b.Error i0(k10.c0 c0Var, t tVar, gy1.c.b.ReadAuthorizationCert readAuthorizationCert) {
            return new gy1.c.b.Error(((gy1.c.b.ReadAuthorizationCert) c0Var.a()).getData(), tVar.errorVMSFactory.a(tVar.C9(iy1.c.b.GENERIC_ERROR, new er.a() { // from class: gy1.a1
                @Override // er.a
                public final Object a() {
                    return t.m.j0();
                }
            })));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 j0() {
            return oq.i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
        
            if (r4 == r3) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00d2, code lost:
        
            if (r1 == r3) goto L31;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 270
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: gy1.t.m.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
        public final Object w(cy.c cVar, k10.c0<gy1.c.b.ReadAuthorizationCert> c0Var, tq.e<? super k10.l<? extends gy1.c>> eVar) {
            m mVar = t.this.new m(eVar);
            mVar.f78411f = cVar;
            mVar.f78412g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgy1/c$b$g;", "state", "Loq/i0;", "<anonymous>", "(Lgy1/c$b$g;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.p<gy1.c.b.Success, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78414e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78415f;

        n(tq.e<? super n> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            gy1.c.b.Success success = (gy1.c.b.Success) this.f78415f;
            Object objE = uq.b.e();
            int i15 = this.f78414e;
            if (i15 == 0) {
                oq.u.b(obj);
                t.this.setupContract.h5(new ElectronicLayerData(success.getData().getPresenceCert(), success.getData().getAuthenticationCert(), success.getData().getAuthorizationCert()));
                xw.b<gy1.b.d> bVarY1 = t.this.Y1();
                gy1.b.d.C1779d c1779d = gy1.b.d.C1779d.f78268a;
                this.f78415f = vq.j.a(success);
                this.f78414e = 1;
                if (bVarY1.F(c1779d, this) == objE) {
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
        public final Object B(gy1.c.b.Success success, tq.e<? super oq.i0> eVar) {
            return ((n) v(success, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            n nVar = t.this.new n(eVar);
            nVar.f78415f = obj;
            return nVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgy1/b$c;", "<unused var>", "Lgy1/c$b$b;", "Loq/i0;", "<anonymous>", "(Lgy1/b$c;Lgy1/c$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<gy1.b.c, gy1.c.b.Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78417e;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f78417e;
            if (i15 == 0) {
                oq.u.b(obj);
                t.this.setupContract.Z(iy.b0.INSTANCE.a());
                xw.b<gy1.b.d> bVarY1 = t.this.Y1();
                gy1.b.d.c cVar = gy1.b.d.c.f78267a;
                this.f78417e = 1;
                if (bVarY1.F(cVar, this) == objE) {
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
        public final Object w(gy1.b.c cVar, gy1.c.b.Error error, tq.e<? super oq.i0> eVar) {
            return t.this.new o(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgy1/b$b;", "<unused var>", "Lgy1/c;", "Loq/i0;", "<anonymous>", "(Lgy1/b$b;Lgy1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<gy1.b.C1777b, gy1.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78419e;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f78419e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<gy1.b.d> bVarY1 = t.this.Y1();
                gy1.b.d.C1778b c1778b = gy1.b.d.C1778b.f78266a;
                this.f78419e = 1;
                if (bVarY1.F(c1778b, this) == objE) {
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
        public final Object w(gy1.b.C1777b c1777b, gy1.c cVar, tq.e<? super oq.i0> eVar) {
            return t.this.new p(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgy1/b$a;", "<unused var>", "Lgy1/c;", "Loq/i0;", "<anonymous>", "(Lgy1/b$a;Lgy1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<gy1.b.a, gy1.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78421e;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f78421e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<gy1.b.d> bVarY1 = t.this.Y1();
                gy1.b.d.a aVar = gy1.b.d.a.f78265a;
                this.f78421e = 1;
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
        public final Object w(gy1.b.a aVar, gy1.c cVar, tq.e<? super oq.i0> eVar) {
            return t.this.new q(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class r extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f78423d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f78424e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f78425f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f78426g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f78428j;

        r(tq.e<? super r> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f78426g = obj;
            this.f78428j |= PKIFailureInfo.systemUnavail;
            return t.this.P9(null, null, null, this);
        }
    }

    public t(yy.a aVar, ac4.b bVar, xw1.b bVar2, ac4.i iVar, hy1.a aVar2, iy1.b bVar3, hb4.d dVar, ac4.k kVar, rw1.e eVar, jx.g gVar, final ic4.b bVar4, final ac4.l lVar, gy1.e eVar2) {
        this.checkNFCStatusUseCase = bVar;
        this.nfcDialogMapper = bVar2;
        this.goToNfcSettingsUseCase = iVar;
        this.mapper = aVar2;
        this.errorMapper = bVar3;
        this.errorVMSFactory = dVar;
        this.nfcDisableReadingUseCase = kVar;
        this.compareCertDataWithUserDataUseCase = eVar;
        this.setupContract = eVar2;
        gy1.c.Init init = new gy1.c.Init(gVar.r());
        this.initialState = init;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(init, new er.l() { // from class: gy1.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.G9(this.f78343a, lVar, bVar4, (k10.v) obj);
            }
        });
        this.state = a9(new d(e9().getState(), this), E9(init));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b C9(iy1.c cVar, er.a<oq.i0> aVar) {
        return this.errorMapper.b(new iy1.b.Params(cVar, b9(gy1.b.c.f78264a), b9(gy1.b.a.f78262a), b9(gy1.b.C1777b.f78263a), aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D9(cy.c.Error error, tq.e<? super iy1.c> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f78365h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f78365h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f78363f;
        Object objE = uq.b.e();
        int i16 = cVar.f78365h;
        if (i16 == 0) {
            oq.u.b(obj);
            ic4.a aVarA = ic4.a.INSTANCE.a(error.getCode());
            switch (b.f78360b[aVarA.ordinal()]) {
                case 1:
                    int i17 = b.f78359a[ic4.c.INSTANCE.a(error.getContent()).ordinal()];
                    if (i17 == 1 || i17 == 2) {
                        return null;
                    }
                    if (i17 != 3) {
                        throw new oq.p();
                    }
                    ac4.k kVar = this.nfcDisableReadingUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    cVar.f78361d = vq.j.a(error);
                    cVar.f78362e = vq.j.a(aVarA);
                    cVar.f78365h = 1;
                    if (kVar.c(c1792a, cVar) == objE) {
                        return objE;
                    }
                    break;
                case 2:
                    return iy1.c.b.WRONG_CAN;
                case 3:
                    return iy1.c.b.TIMEOUT;
                case 4:
                    return iy1.c.b.CERTIFICATE_INACTIVE;
                case 5:
                    return iy1.c.b.CERTIFICATE_MISSING;
                case 6:
                    return iy1.c.b.DATA_MISSING;
                default:
                    return iy1.c.b.GENERIC_ERROR;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
        }
        return iy1.c.b.TECHNICAL_ERROR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gy1.d.a E9(gy1.c state) {
        return this.mapper.b(new hy1.a.Params(state, b9(gy1.b.C1777b.f78263a), b9(gy1.b.a.f78262a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(final t tVar, final ac4.l lVar, final ic4.b bVar, k10.v vVar) {
        vVar.c(fr.q0.c(gy1.c.Init.class), new er.l() { // from class: gy1.j
            @Override // er.l
            public final Object b(Object obj) {
                return t.H9(this.f78317a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(gy1.c.b.CheckNfc.class), new er.l() { // from class: gy1.k
            @Override // er.l
            public final Object b(Object obj) {
                return t.I9(this.f78321a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(gy1.c.b.ReadPresenceCert.class), new er.l() { // from class: gy1.l
            @Override // er.l
            public final Object b(Object obj) {
                return t.J9(lVar, tVar, bVar, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(gy1.c.b.ReadAuthenticationCert.class), new er.l() { // from class: gy1.m
            @Override // er.l
            public final Object b(Object obj) {
                return t.K9(lVar, tVar, bVar, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(gy1.c.b.ReadAuthorizationCert.class), new er.l() { // from class: gy1.n
            @Override // er.l
            public final Object b(Object obj) {
                return t.L9(lVar, tVar, bVar, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(gy1.c.b.Success.class), new er.l() { // from class: gy1.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.M9(this.f78336a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(gy1.c.b.Error.class), new er.l() { // from class: gy1.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.N9(this.f78339a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(gy1.c.class), new er.l() { // from class: gy1.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.O9(this.f78340a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(t tVar, k10.z zVar) {
        zVar.A(tVar.new e(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(t tVar, k10.z zVar) {
        zVar.A(tVar.new f(null));
        g gVar = tVar.new g(null);
        zVar.v(fr.q0.c(gy1.b.e.class), k10.o.CANCEL_PREVIOUS, gVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(ac4.l lVar, t tVar, ic4.b bVar, k10.z zVar) {
        zVar.A(tVar.new h(bVar, null));
        k10.k.m(zVar, (mu.g) lVar.a(gz.b.a.C1792a.f78542a), null, tVar.new i(null), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(ac4.l lVar, t tVar, ic4.b bVar, k10.z zVar) {
        zVar.A(tVar.new j(bVar, null));
        k10.k.m(zVar, (mu.g) lVar.a(gz.b.a.C1792a.f78542a), null, tVar.new k(null), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(ac4.l lVar, t tVar, ic4.b bVar, k10.z zVar) {
        zVar.A(tVar.new l(bVar, null));
        k10.k.m(zVar, (mu.g) lVar.a(gz.b.a.C1792a.f78542a), null, tVar.new m(null), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(t tVar, k10.z zVar) {
        zVar.C(tVar.new n(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(t tVar, k10.z zVar) {
        o oVar = tVar.new o(null);
        zVar.x(fr.q0.c(gy1.b.c.class), k10.o.CANCEL_PREVIOUS, oVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(t tVar, k10.z zVar) {
        p pVar = tVar.new p(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(gy1.b.C1777b.class), oVar, pVar);
        zVar.x(fr.q0.c(gy1.b.a.class), oVar, tVar.new q(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P9(iy.b0 b0Var, gy1.c.b.StateData stateData, gy1.c cVar, tq.e<? super gy1.c> eVar) throws Throwable {
        r rVar;
        if (eVar instanceof r) {
            rVar = (r) eVar;
            int i15 = rVar.f78428j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                rVar.f78428j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                rVar = new r(eVar);
            }
        } else {
            rVar = new r(eVar);
        }
        Object objD = rVar.f78426g;
        Object objE = uq.b.e();
        int i16 = rVar.f78428j;
        if (i16 == 0) {
            oq.u.b(objD);
            rw1.e eVar2 = this.compareCertDataWithUserDataUseCase;
            rw1.e.Params params = new rw1.e.Params(b0Var);
            rVar.f78423d = vq.j.a(b0Var);
            rVar.f78424e = stateData;
            rVar.f78425f = cVar;
            rVar.f78428j = 1;
            objD = eVar2.d(params, rVar);
            if (objD == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (gy1.c) rVar.f78425f;
            stateData = (gy1.c.b.StateData) rVar.f78424e;
            oq.u.b(objD);
        }
        dx.i iVar = (dx.i) objD;
        if (iVar instanceof dx.i.Left) {
            return new gy1.c.b.Error(stateData, this.errorVMSFactory.a(C9(new iy1.c.GenericError((dx.b) ((dx.i.Left) iVar).b()), b9(gy1.b.c.f78264a))));
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        rw1.e.b bVar = (rw1.e.b) ((dx.i.Right) iVar).b();
        if (fr.t.c(bVar, rw1.e.b.a.f176572a)) {
            return cVar;
        }
        if (fr.t.c(bVar, rw1.e.b.C4507b.f176573a)) {
            return new gy1.c.b.Error(stateData, this.errorVMSFactory.a(C9(iy1.c.b.DATA_INCONSISTENCY, new er.a() { // from class: gy1.r
                @Override // er.a
                public final Object a() {
                    return t.Q9();
                }
            })));
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9() {
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: F9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(gy1.d.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<gy1.b.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<gy1.c, gy1.b> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<gy1.d.a> getState() {
        return this.state;
    }
}
