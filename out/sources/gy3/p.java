package gy3;

import fr.q0;
import iy3.GooglePayNavParams;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import xr0.BECheckWalletPaymentStatus;
import xr0.BEGooglePaySendPaymentTokenResponseModel;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 H2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001IBK\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R \u00109\u001a\b\u0012\u0004\u0012\u000204038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R&\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030=8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lgy3/p;", "Ll00/g;", "Lgy3/c;", "Lgy3/a;", "Lgy3/d;", "", "Lyy/a;", "stateMachineFactory", "Lhy3/a;", "mapper", "Lds0/c;", "sendPaymentTokenUC", "Lac4/a;", "callWithActionWithLoaderUseCase", "Lib4/c;", "genericErrorMapper", "Lhb4/d;", "errorVMSFactory", "Lds0/a;", "checkPaymentStatusUC", "Lgy3/b;", "setupData", "<init>", "(Lyy/a;Lhy3/a;Lds0/c;Lac4/a;Lib4/c;Lhb4/d;Lds0/a;Lgy3/b;)V", "Lmu/g;", "Liy3/c;", "z9", "()Lmu/g;", "state", "Lgy3/d$a;", "y9", "(Lgy3/c;)Lgy3/d$a;", "Ldx/b;", "domainError", "Lhb4/c;", "w9", "(Ldx/b;)Lhb4/c;", "b", "Lhy3/a;", "c", "Lds0/c;", "d", "Lac4/a;", "e", "Lib4/c;", "f", "Lhb4/d;", "g", "Lds0/a;", "h", "Lgy3/b;", "Lxw/b;", "Lgy3/a$b;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "k", "Lgy3/c;", "initialState", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "n", "a", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<gy3.c, a> implements gy3.d, zx.d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f78483p = 8;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f78484q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f78485r;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hy3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ds0.c sendPaymentTokenUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callWithActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ds0.a checkPaymentStatusUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private GooglePaySetupData setupData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a.b> navAction = new xw.b<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final gy3.c initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<gy3.c, a> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<gy3.d.a> state;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/h;", "Liy3/c;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<mu.h<? super iy3.c>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78497e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f78498f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.p<ju.p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f78499e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ mu.h<iy3.c> f78500f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(mu.h<? super iy3.c> hVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f78500f = hVar;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x001e  */
            /* JADX WARN: Code duplicated, block: B:13:0x0028  */
            /* JADX WARN: Code duplicated, block: B:16:0x0035  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003f -> B:11:0x001e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // vq.a
            public final java.lang.Object J(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r6.f78499e
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1b
                    if (r1 == r3) goto L17
                    if (r1 != r2) goto Lf
                    goto L1b
                Lf:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L17:
                    oq.u.b(r7)
                    goto L35
                L1b:
                    oq.u.b(r7)
                L1e:
                    tq.i r7 = r6.getContext()
                    boolean r7 = ju.g2.n(r7)
                    if (r7 == 0) goto L42
                    long r4 = gy3.p.q9()
                    r6.f78499e = r3
                    java.lang.Object r7 = ju.z0.c(r4, r6)
                    if (r7 != r0) goto L35
                    goto L41
                L35:
                    mu.h<iy3.c> r7 = r6.f78500f
                    iy3.c r1 = iy3.c.ACTIVE
                    r6.f78499e = r2
                    java.lang.Object r7 = r7.F(r1, r6)
                    if (r7 != r0) goto L1e
                L41:
                    return r0
                L42:
                    oq.i0 r7 = oq.i0.f148189a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: gy3.p.b.a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super i0> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f78500f, eVar);
            }
        }

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            if (r0.F(r8, r7) == r1) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f78498f
                mu.h r0 = (mu.h) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f78497e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r8)
                goto L4f
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                oq.u.b(r8)
                goto L3a
            L22:
                oq.u.b(r8)
                long r5 = gy3.p.r9()
                gy3.p$b$a r8 = new gy3.p$b$a
                r2 = 0
                r8.<init>(r0, r2)
                r7.f78498f = r0
                r7.f78497e = r4
                java.lang.Object r8 = ju.g3.f(r5, r8, r7)
                if (r8 != r1) goto L3a
                goto L4e
            L3a:
                oq.i0 r8 = (oq.i0) r8
                if (r8 != 0) goto L4f
                iy3.c r8 = iy3.c.TIMEOUT
                java.lang.Object r2 = vq.j.a(r0)
                r7.f78498f = r2
                r7.f78497e = r3
                java.lang.Object r8 = r0.F(r8, r7)
                if (r8 != r1) goto L4f
            L4e:
                return r1
            L4f:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: gy3.p.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mu.h<? super iy3.c> hVar, tq.e<? super i0> eVar) {
            return ((b) v(hVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(eVar);
            bVar.f78498f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<gy3.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f78501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f78502b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f78503a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f78504b;

            /* JADX INFO: renamed from: gy3.p$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1790a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f78505d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f78506e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f78507f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f78509h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f78510j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f78511k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f78512l;

                public C1790a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f78505d = obj;
                    this.f78506e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, p pVar) {
                this.f78503a = hVar;
                this.f78504b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1790a c1790a;
                if (eVar instanceof C1790a) {
                    c1790a = (C1790a) eVar;
                    int i15 = c1790a.f78506e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1790a.f78506e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1790a = new C1790a(eVar);
                    }
                } else {
                    c1790a = new C1790a(eVar);
                }
                Object obj2 = c1790a.f78505d;
                Object objE = uq.b.e();
                int i16 = c1790a.f78506e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f78503a;
                    gy3.d.a aVarY9 = this.f78504b.y9((gy3.c) obj);
                    c1790a.f78507f = vq.j.a(obj);
                    c1790a.f78509h = vq.j.a(c1790a);
                    c1790a.f78510j = vq.j.a(obj);
                    c1790a.f78511k = vq.j.a(hVar);
                    c1790a.f78512l = 0;
                    c1790a.f78506e = 1;
                    if (hVar.F(aVarY9, c1790a) == objE) {
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

        public c(mu.g gVar, p pVar) {
            this.f78501a = gVar;
            this.f78502b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super gy3.d.a> hVar, tq.e eVar) {
            Object objA = this.f78501a.a(new a(hVar, this.f78502b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgy3/a$d;", "action", "Lgy3/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lgy3/a$d;Lgy3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<gy3.a.ToResult, gy3.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f78513e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f78514f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f78515g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f78516h;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f78518a;

            static {
                int[] iArr = new int[iy3.b.values().length];
                try {
                    iArr[iy3.b.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[iy3.b.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[iy3.b.TIMEOUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f78518a = iArr;
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            my3.f.b success;
            gy3.a.ToResult toResult = (gy3.a.ToResult) this.f78516h;
            Object objE = uq.b.e();
            int i15 = this.f78515g;
            if (i15 == 0) {
                oq.u.b(obj);
                GooglePayNavParams googlePayNavParams = p.this.setupData.getGooglePayNavParams();
                p pVar = p.this;
                xw.b<gy3.a.b> bVarY1 = pVar.Y1();
                int i16 = a.f78518a[toResult.getGooglePayResult().ordinal()];
                if (i16 == 1) {
                    success = new my3.f.b.Success(googlePayNavParams.getPaymentId(), googlePayNavParams.getPaymentTitle(), googlePayNavParams.getPaymentAmount());
                } else if (i16 == 2) {
                    success = new my3.f.b.a.Generic(null, pVar.mapper.c(), googlePayNavParams.getPaymentId(), googlePayNavParams.getPaymentTitle(), googlePayNavParams.getPaymentAmount());
                } else {
                    if (i16 != 3) {
                        throw new oq.p();
                    }
                    success = new my3.f.b.PaymentInProcessing(googlePayNavParams.getPaymentId(), googlePayNavParams.getPaymentTitle(), googlePayNavParams.getPaymentAmount());
                }
                gy3.a.b.ToResult toResult2 = new gy3.a.b.ToResult(success);
                this.f78516h = vq.j.a(toResult);
                this.f78513e = vq.j.a(googlePayNavParams);
                this.f78514f = 0;
                this.f78515g = 1;
                if (bVarY1.F(toResult2, this) == objE) {
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
        public final Object w(gy3.a.ToResult toResult, gy3.c cVar, tq.e<? super i0> eVar) {
            d dVar = p.this.new d(eVar);
            dVar.f78516h = toResult;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgy3/a$a;", "<unused var>", "Lgy3/c;", "Loq/i0;", "<anonymous>", "(Lgy3/a$a;Lgy3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<a.C1785a, gy3.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78519e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f78519e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<a.b> bVarY1 = p.this.Y1();
                a.b.C1786a c1786a = a.b.C1786a.f78457a;
                this.f78519e = 1;
                if (bVarY1.F(c1786a, this) == objE) {
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
        public final Object w(a.C1785a c1785a, gy3.c cVar, tq.e<? super i0> eVar) {
            return p.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lgy3/c$c;", "state", "Lk10/l;", "Lgy3/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<c0<gy3.c.C1788c>, tq.e<? super k10.l<? extends gy3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78521e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78522f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lgy3/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends gy3.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f78524e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p f78525f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ c0<gy3.c.C1788c> f78526g;

            /* JADX INFO: renamed from: gy3.p$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C1791a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f78527a;

                static {
                    int[] iArr = new int[xr0.b.values().length];
                    try {
                        iArr[xr0.b.PENDING.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[xr0.b.ACCEPTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[xr0.b.REJECTED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[xr0.b.FAILED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[xr0.b.UNKNOWN.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f78527a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, c0<gy3.c.C1788c> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f78525f = pVar;
                this.f78526g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final gy3.c.Error X(p pVar, dx.b bVar, gy3.c.C1788c c1788c) {
                return new gy3.c.Error(pVar.w9(bVar));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final gy3.c.b Y(gy3.c.C1788c c1788c) {
                return gy3.c.b.f78464a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f78524e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ds0.c cVar = this.f78525f.sendPaymentTokenUC;
                    ds0.c.Params params = new ds0.c.Params(this.f78525f.setupData.getGooglePayNavParams().getGooglePaySendPaymentTokenRequestModel());
                    this.f78524e = 1;
                    obj = cVar.c(params, this);
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
                c0<gy3.c.C1788c> c0Var = this.f78526g;
                final p pVar = this.f78525f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: gy3.q
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p.f.a.X(pVar, bVar, (c.C1788c) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                int i16 = C1791a.f78527a[((BEGooglePaySendPaymentTokenResponseModel) ((dx.i.Right) iVar).b()).getPaymentStatus().ordinal()];
                if (i16 == 1) {
                    return c0Var.d(new er.l() { // from class: gy3.r
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p.f.a.Y((c.C1788c) obj2);
                        }
                    });
                }
                if (i16 == 2) {
                    pVar.d9(new gy3.a.ToResult(iy3.b.SUCCESS));
                    return c0Var.c();
                }
                if (i16 != 3 && i16 != 4 && i16 != 5) {
                    throw new oq.p();
                }
                pVar.d9(new gy3.a.ToResult(iy3.b.ERROR));
                return c0Var.c();
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f78525f, this.f78526g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends gy3.c>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f78522f;
            Object objE = uq.b.e();
            int i15 = this.f78521e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = p.this.callWithActionWithLoaderUseCase;
            a aVar2 = new a(p.this, c0Var, null);
            this.f78522f = vq.j.a(c0Var);
            this.f78521e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<gy3.c.C1788c> c0Var, tq.e<? super k10.l<? extends gy3.c>> eVar) {
            return ((f) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = p.this.new f(eVar);
            fVar.f78522f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Liy3/c;", "event", "Lk10/c0;", "Lgy3/c$b;", "state", "Lk10/l;", "Lgy3/c;", "<anonymous>", "(Liy3/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<iy3.c, c0<gy3.c.b>, tq.e<? super k10.l<? extends gy3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78528e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78529f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f78530g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f78532a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f78533b;

            static {
                int[] iArr = new int[xr0.i.values().length];
                try {
                    iArr[xr0.i.PENDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[xr0.i.ACCEPTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[xr0.i.REJECTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[xr0.i.FAILED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[xr0.i.UNKNOWN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f78532a = iArr;
                int[] iArr2 = new int[iy3.c.values().length];
                try {
                    iArr2[iy3.c.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[iy3.c.TIMEOUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused7) {
                }
                f78533b = iArr2;
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy3.c.Error O(p pVar, dx.b bVar, gy3.c.b bVar2) {
            return new gy3.c.Error(pVar.w9(bVar));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            iy3.c cVar = (iy3.c) this.f78529f;
            c0 c0Var = (c0) this.f78530g;
            Object objE = uq.b.e();
            int i15 = this.f78528e;
            if (i15 == 0) {
                oq.u.b(obj);
                int i16 = a.f78533b[cVar.ordinal()];
                if (i16 != 1) {
                    if (i16 != 2) {
                        throw new oq.p();
                    }
                    p.this.d9(new gy3.a.ToResult(iy3.b.TIMEOUT));
                    return c0Var.c();
                }
                ds0.a aVar = p.this.checkPaymentStatusUC;
                ds0.a.Params params = new ds0.a.Params(p.this.setupData.getGooglePayNavParams().getGooglePaySendPaymentTokenRequestModel().getTransactionId());
                this.f78529f = vq.j.a(cVar);
                this.f78530g = c0Var;
                this.f78528e = 1;
                obj = aVar.c(params, this);
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
            final p pVar = p.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: gy3.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.g.O(pVar, bVar, (c.b) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            int i17 = a.f78532a[((BECheckWalletPaymentStatus) ((dx.i.Right) iVar).b()).getWalletPaymentStatusModel().ordinal()];
            if (i17 != 1) {
                if (i17 == 2) {
                    pVar.d9(new gy3.a.ToResult(iy3.b.SUCCESS));
                } else {
                    if (i17 != 3 && i17 != 4 && i17 != 5) {
                        throw new oq.p();
                    }
                    pVar.d9(new gy3.a.ToResult(iy3.b.ERROR));
                }
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(iy3.c cVar, c0<gy3.c.b> c0Var, tq.e<? super k10.l<? extends gy3.c>> eVar) {
            g gVar = p.this.new g(eVar);
            gVar.f78529f = cVar;
            gVar.f78530g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lgy3/a$c;", "<unused var>", "Lk10/c0;", "Lgy3/c$a;", "state", "Lk10/l;", "Lgy3/c;", "<anonymous>", "(Lgy3/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<a.c, c0<gy3.c.Error>, tq.e<? super k10.l<? extends gy3.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f78534e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f78535f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gy3.c.C1788c O(gy3.c.Error error) {
            return gy3.c.C1788c.f78465a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f78535f;
            uq.b.e();
            if (this.f78534e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: gy3.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.h.O((c.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a.c cVar, c0<gy3.c.Error> c0Var, tq.e<? super k10.l<? extends gy3.c>> eVar) {
            h hVar = new h(eVar);
            hVar.f78535f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    static {
        gu.b.Companion companion = gu.b.INSTANCE;
        f78484q = gu.d.q(5, gu.e.SECONDS);
        f78485r = gu.d.q(1, gu.e.MINUTES);
    }

    public p(yy.a aVar, hy3.a aVar2, ds0.c cVar, ac4.a aVar3, ib4.c cVar2, hb4.d dVar, ds0.a aVar4, GooglePaySetupData googlePaySetupData) {
        this.mapper = aVar2;
        this.sendPaymentTokenUC = cVar;
        this.callWithActionWithLoaderUseCase = aVar3;
        this.genericErrorMapper = cVar2;
        this.errorVMSFactory = dVar;
        this.checkPaymentStatusUC = aVar4;
        this.setupData = googlePaySetupData;
        gy3.c.C1788c c1788c = gy3.c.C1788c.f78465a;
        this.initialState = c1788c;
        this.stateMachine = aVar.a(c1788c, new er.l() { // from class: gy3.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.B9(this.f78481a, (k10.v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), y9(c1788c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(gy3.c.class), new er.l() { // from class: gy3.j
            @Override // er.l
            public final Object b(Object obj) {
                return p.C9(this.f78477a, (z) obj);
            }
        });
        vVar.c(q0.c(gy3.c.C1788c.class), new er.l() { // from class: gy3.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.D9(this.f78478a, (z) obj);
            }
        });
        vVar.c(q0.c(gy3.c.b.class), new er.l() { // from class: gy3.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.E9(this.f78479a, (z) obj);
            }
        });
        vVar.c(q0.c(gy3.c.Error.class), new er.l() { // from class: gy3.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.F9((z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(p pVar, z zVar) {
        d dVar = pVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(a.ToResult.class), oVar, dVar);
        zVar.x(q0.c(a.C1785a.class), oVar, pVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(p pVar, z zVar) {
        zVar.A(pVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(p pVar, z zVar) {
        k10.k.m(zVar, pVar.z9(), null, pVar.new g(null), 2, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(z zVar) {
        h hVar = new h(null);
        zVar.v(q0.c(a.c.class), k10.o.CANCEL_PREVIOUS, hVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c w9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericErrorMapper.b(new ib4.c.Params(domainError, this.setupData.getPaymentSuccessResultType() != rx3.a.PAYMENT_AS_STEP_IN_PROCESS, new er.l() { // from class: gy3.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.x9(this.f78480a, (ib4.c.b) obj);
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(p pVar, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
            if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                pVar.d9(a.c.f78459a);
            } else {
                if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    throw new oq.p();
                }
                pVar.d9(a.C1785a.f78456a);
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gy3.d.a y9(gy3.c state) {
        return this.mapper.b(new hy3.a.Params(state, b9(a.C1785a.f78456a)));
    }

    private final mu.g<iy3.c> z9() {
        return mu.i.I(new b(null));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(GooglePaySetupData googlePaySetupData) {
        super.P5(googlePaySetupData);
    }

    @Override // zx.b
    public xw.b<a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<gy3.c, a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<gy3.d.a> getState() {
        return this.state;
    }
}
