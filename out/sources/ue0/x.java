package ue0;

import k80.QrCode;
import k80.QrCodeData;
import k80.VerificationCertificate;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;
import we0.VerificationDataModel;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u0087\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J1\u0010.\u001a\u00020-*\u00020(2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)2\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020*0)H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020\u0002H\u0002¢\u0006\u0004\b2\u00103J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020504H\u0096\u0001¢\u0006\u0004\b6\u00107J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020804H\u0096\u0001¢\u0006\u0004\b9\u00107R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR \u0010\\\u001a\b\u0012\u0004\u0012\u00020W0V8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001a\u0010b\u001a\u00020]8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR&\u0010h\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030c8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR \u00100\u001a\b\u0012\u0004\u0012\u0002010i8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m¨\u0006n"}, d2 = {"Lue0/x;", "Ll00/g;", "Lue0/b;", "Lue0/a;", "Lue0/c;", "", "Lnx/b;", "Lyy/a;", "stateMachineFactory", "Lve0/k;", "mapper", "Lsz/d;", "cameraScannerPreviewViewConnector", "Lac4/r;", "", "scanCameraUseCase", "La14/x;", "requestCameraPermissionUseCase", "La14/b;", "checkCameraPermissionUseCase", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Loz/q;", "ownerViewLifecycleManager", "Lve0/e;", "qrScannerErrorMapper", "Lre0/a;", "fetchQrCodeDataUC", "Ll80/a;", "getVerificationCertificateUC", "Ll80/b;", "getVerificationSessionByCodeUC", "Lre0/d;", "validateCodeUseCase", "Lhb4/d;", "errorVMSFactory", "Lac4/a;", "callActionWithLoaderUseCase", "<init>", "(Lyy/a;Lve0/k;Lsz/d;Lac4/r;La14/x;La14/b;La14/m;Loz/q;Lve0/e;Lre0/a;Ll80/a;Ll80/b;Lre0/d;Lhb4/d;Lac4/a;)V", "Ldx/b;", "Lkotlin/Function0;", "Loq/i0;", "onRetry", "onClose", "Ljb4/b;", "B9", "(Ldx/b;Ler/a;Ler/a;)Ljb4/b;", "state", "Lue0/c$a;", "D9", "(Lue0/b;)Lue0/c$a;", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "b", "Lve0/k;", "c", "Lsz/d;", "d", "Lac4/r;", "e", "La14/x;", "f", "La14/b;", "g", "La14/m;", "h", "Loz/q;", "j", "Lve0/e;", "k", "Lre0/a;", "l", "Ll80/a;", "m", "Ll80/b;", "n", "Lre0/d;", "p", "Lhb4/d;", "q", "Lac4/a;", "Lxw/b;", "Lue0/a$f;", "r", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Loz/j;", "s", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lk10/t;", "t", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "v", "Lmu/p0;", "getState", "()Lmu/p0;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x extends l00.g<ue0.b, ue0.a> implements ue0.c, zx.b, nx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ve0.k mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final sz.d cameraScannerPreviewViewConnector;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.r<String> scanCameraUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a14.x requestCameraPermissionUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a14.b checkCameraPermissionUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ve0.e qrScannerErrorMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final re0.a fetchQrCodeDataUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final l80.a getVerificationCertificateUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final l80.b getVerificationSessionByCodeUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final re0.d validateCodeUseCase;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ue0.b, ue0.a> stateMachine;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ue0.a.f> navAction = new xw.b<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<ue0.c.a> state = a9(new a(e9().getState(), this), D9(new ue0.b.ScannerQrCode(new ue0.b.StateData(false, null, null, null, null, false, false, CertificateBody.profileType, null))));

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<ue0.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f197944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f197945b;

        /* JADX INFO: renamed from: ue0.x$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5144a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f197946a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x f197947b;

            /* JADX INFO: renamed from: ue0.x$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5145a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f197948d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f197949e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f197950f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f197952h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f197953j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f197954k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f197955l;

                public C5145a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f197948d = obj;
                    this.f197949e |= PKIFailureInfo.systemUnavail;
                    return C5144a.this.F(null, this);
                }
            }

            public C5144a(mu.h hVar, x xVar) {
                this.f197946a = hVar;
                this.f197947b = xVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5145a c5145a;
                if (eVar instanceof C5145a) {
                    c5145a = (C5145a) eVar;
                    int i15 = c5145a.f197949e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5145a.f197949e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5145a = new C5145a(eVar);
                    }
                } else {
                    c5145a = new C5145a(eVar);
                }
                Object obj2 = c5145a.f197948d;
                Object objE = uq.b.e();
                int i16 = c5145a.f197949e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f197946a;
                    ue0.c.a aVarD9 = this.f197947b.D9((ue0.b) obj);
                    c5145a.f197950f = vq.j.a(obj);
                    c5145a.f197952h = vq.j.a(c5145a);
                    c5145a.f197953j = vq.j.a(obj);
                    c5145a.f197954k = vq.j.a(hVar);
                    c5145a.f197955l = 0;
                    c5145a.f197949e = 1;
                    if (hVar.F(aVarD9, c5145a) == objE) {
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

        public a(mu.g gVar, x xVar) {
            this.f197944a = gVar;
            this.f197945b = xVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ue0.c.a> hVar, tq.e eVar) {
            Object objA = this.f197944a.a(new C5144a(hVar, this.f197945b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lue0/a$c;", "<unused var>", "Lue0/b;", "Loq/i0;", "<anonymous>", "(Lue0/a$c;Lue0/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ue0.a.c, ue0.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197956e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f197956e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ue0.a.f> bVarY1 = x.this.Y1();
                ue0.a.f.b bVar = ue0.a.f.b.f197810a;
                this.f197956e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(ue0.a.c cVar, ue0.b bVar, tq.e<? super oq.i0> eVar) {
            return x.this.new b(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lue0/a$e;", "<unused var>", "Lk10/c0;", "Lue0/b$e;", "state", "Lk10/l;", "Lue0/b;", "<anonymous>", "(Lue0/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ue0.a.e, k10.c0<ue0.b.ScannerQrCode>, tq.e<? super k10.l<? extends ue0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197958e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f197959f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ue0.b.Error O(k10.c0 c0Var, x xVar, dx.b.Business business, ue0.b.ScannerQrCode scannerQrCode) {
            return new ue0.b.Error(ue0.b.StateData.b(((ue0.b.ScannerQrCode) c0Var.a()).getData(), false, null, null, null, null, false, false, CertificateBody.profileType, null), xVar.errorVMSFactory.a(x.C9(xVar, business, xVar.b9(ue0.a.k.f197816a), null, 2, null)));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f197959f;
            uq.b.e();
            if (this.f197958e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends oq.i0> iVarA = x.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            final x xVar = x.this;
            if (iVarA instanceof dx.i.Left) {
                final dx.b.Business business = (dx.b.Business) ((dx.i.Left) iVarA).b();
                return c0Var.d(new er.l() { // from class: ue0.z
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x.c.O(c0Var, xVar, business, (b.ScannerQrCode) obj2);
                    }
                });
            }
            if (!(iVarA instanceof dx.i.Right)) {
                throw new oq.p();
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ue0.a.e eVar, k10.c0<ue0.b.ScannerQrCode> c0Var, tq.e<? super k10.l<? extends ue0.b>> eVar2) {
            c cVar = x.this.new c(eVar2);
            cVar.f197959f = c0Var;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lue0/a$d;", "<unused var>", "Lk10/c0;", "Lue0/b$e;", "state", "Lk10/l;", "Lue0/b;", "<anonymous>", "(Lue0/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ue0.a.d, k10.c0<ue0.b.ScannerQrCode>, tq.e<? super k10.l<? extends ue0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197961e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f197962f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ue0.b.ScannerQrCode O(k10.c0 c0Var, ue0.b.ScannerQrCode scannerQrCode) {
            return scannerQrCode.b(ue0.b.StateData.b(((ue0.b.ScannerQrCode) c0Var.a()).getData(), false, null, null, null, null, false, false, 63, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f197962f;
            uq.b.e();
            if (this.f197961e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ue0.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.d.O(c0Var, (b.ScannerQrCode) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ue0.a.d dVar, k10.c0<ue0.b.ScannerQrCode> c0Var, tq.e<? super k10.l<? extends ue0.b>> eVar) {
            d dVar2 = new d(eVar);
            dVar2.f197962f = c0Var;
            return dVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lue0/b$e;", "state", "Lk10/l;", "Lue0/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<k10.c0<ue0.b.ScannerQrCode>, tq.e<? super k10.l<? extends ue0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197963e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f197964f;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ue0.b.ScannerQrCode O(k10.c0 c0Var, boolean z15, ue0.b.ScannerQrCode scannerQrCode) {
            return scannerQrCode.b(ue0.b.StateData.b(((ue0.b.ScannerQrCode) c0Var.a()).getData(), false, null, null, null, null, z15, false, 95, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f197964f;
            Object objE = uq.b.e();
            int i15 = this.f197963e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.x xVar = x.this.requestCameraPermissionUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f197964f = c0Var;
                this.f197963e = 1;
                obj = xVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final boolean zC = fr.t.c(obj, u04.c.a.f194071a);
            return c0Var.b(new er.l() { // from class: ue0.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.e.O(c0Var, zC, (b.ScannerQrCode) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<ue0.b.ScannerQrCode> c0Var, tq.e<? super k10.l<? extends ue0.b>> eVar) {
            return ((e) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = x.this.new e(eVar);
            eVar2.f197964f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnx/a;", "viewLifecycle", "Lue0/b$e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnx/a;Lue0/b$e;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<nx.a, ue0.b.ScannerQrCode, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f197967f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nx.a aVar = (nx.a) this.f197967f;
            uq.b.e();
            if (this.f197966e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (aVar == nx.a.RESUMED) {
                x.this.d9(ue0.a.b.f197805a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nx.a aVar, ue0.b.ScannerQrCode scannerQrCode, tq.e<? super oq.i0> eVar) {
            f fVar = x.this.new f(eVar);
            fVar.f197967f = aVar;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lue0/a$b;", "<unused var>", "Lk10/c0;", "Lue0/b$e;", "state", "Lk10/l;", "Lue0/b;", "<anonymous>", "(Lue0/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ue0.a.b, k10.c0<ue0.b.ScannerQrCode>, tq.e<? super k10.l<? extends ue0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197969e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f197970f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ue0.b.ScannerQrCode O(k10.c0 c0Var, boolean z15, ue0.b.ScannerQrCode scannerQrCode) {
            return scannerQrCode.b(ue0.b.StateData.b(((ue0.b.ScannerQrCode) c0Var.a()).getData(), false, null, null, null, null, z15, false, 95, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f197970f;
            Object objE = uq.b.e();
            int i15 = this.f197969e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.b bVar = x.this.checkCameraPermissionUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f197970f = c0Var;
                this.f197969e = 1;
                obj = bVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final boolean zC = fr.t.c(obj, gy.c.a.f78236a);
            return c0Var.b(new er.l() { // from class: ue0.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.g.O(c0Var, zC, (b.ScannerQrCode) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ue0.a.b bVar, k10.c0<ue0.b.ScannerQrCode> c0Var, tq.e<? super k10.l<? extends ue0.b>> eVar) {
            g gVar = x.this.new g(eVar);
            gVar.f197970f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lue0/a$l;", "action", "Lk10/c0;", "Lue0/b$e;", "state", "Lk10/l;", "Lue0/b;", "<anonymous>", "(Lue0/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ue0.a.UpdateBottomSheetState, k10.c0<ue0.b.ScannerQrCode>, tq.e<? super k10.l<? extends ue0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197972e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f197973f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f197974g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ue0.b.ScannerQrCode O(k10.c0 c0Var, ue0.a.UpdateBottomSheetState updateBottomSheetState, ue0.b.ScannerQrCode scannerQrCode) {
            return scannerQrCode.b(ue0.b.StateData.b(((ue0.b.ScannerQrCode) c0Var.a()).getData(), updateBottomSheetState.getVisibility(), null, null, null, null, false, false, 126, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ue0.a.UpdateBottomSheetState updateBottomSheetState = (ue0.a.UpdateBottomSheetState) this.f197973f;
            final k10.c0 c0Var = (k10.c0) this.f197974g;
            uq.b.e();
            if (this.f197972e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ue0.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.h.O(c0Var, updateBottomSheetState, (b.ScannerQrCode) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ue0.a.UpdateBottomSheetState updateBottomSheetState, k10.c0<ue0.b.ScannerQrCode> c0Var, tq.e<? super k10.l<? extends ue0.b>> eVar) {
            h hVar = new h(eVar);
            hVar.f197973f = updateBottomSheetState;
            hVar.f197974g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lue0/a$g;", "action", "Lk10/c0;", "Lue0/b$e;", "state", "Lk10/l;", "Lue0/b;", "<anonymous>", "(Lue0/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ue0.a.OnCodeChange, k10.c0<ue0.b.ScannerQrCode>, tq.e<? super k10.l<? extends ue0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197975e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f197976f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f197977g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ue0.b.ScannerQrCode O(k10.c0 c0Var, ue0.a.OnCodeChange onCodeChange, ue0.b.ScannerQrCode scannerQrCode) {
            return scannerQrCode.b(ue0.b.StateData.b(((ue0.b.ScannerQrCode) c0Var.a()).getData(), false, onCodeChange.getCode(), null, null, hz.b.C2039b.f86846c, false, false, 109, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ue0.a.OnCodeChange onCodeChange = (ue0.a.OnCodeChange) this.f197976f;
            final k10.c0 c0Var = (k10.c0) this.f197977g;
            uq.b.e();
            if (this.f197975e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ue0.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.i.O(c0Var, onCodeChange, (b.ScannerQrCode) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ue0.a.OnCodeChange onCodeChange, k10.c0<ue0.b.ScannerQrCode> c0Var, tq.e<? super k10.l<? extends ue0.b>> eVar) {
            i iVar = new i(eVar);
            iVar.f197976f = onCodeChange;
            iVar.f197977g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lue0/a$m;", "<unused var>", "Lk10/c0;", "Lue0/b$e;", "state", "Lk10/l;", "Lue0/b;", "<anonymous>", "(Lue0/a$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ue0.a.m, k10.c0<ue0.b.ScannerQrCode>, tq.e<? super k10.l<? extends ue0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f197978e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f197979f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f197980g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ue0.b.GetVerificationSessionByCode X(k10.c0 c0Var, hz.b bVar, ue0.b.ScannerQrCode scannerQrCode) {
            return new ue0.b.GetVerificationSessionByCode(ue0.b.StateData.b(((ue0.b.ScannerQrCode) c0Var.a()).getData(), false, null, null, null, bVar, false, false, 111, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ue0.b.FetchQrCodeData Y(k10.c0 c0Var, hz.b bVar, ue0.b.ScannerQrCode scannerQrCode) {
            return new ue0.b.FetchQrCodeData(ue0.b.StateData.b(((ue0.b.ScannerQrCode) c0Var.a()).getData(), false, null, null, null, bVar, false, false, 111, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ue0.b.ScannerQrCode Z(k10.c0 c0Var, hz.b bVar, ue0.b.ScannerQrCode scannerQrCode) {
            return scannerQrCode.b(ue0.b.StateData.b(((ue0.b.ScannerQrCode) c0Var.a()).getData(), false, null, null, null, bVar, false, false, 111, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final hz.b invalid;
            final k10.c0 c0Var = (k10.c0) this.f197980g;
            Object objE = uq.b.e();
            int i15 = this.f197979f;
            if (i15 == 0) {
                oq.u.b(obj);
                String enteredCode = ((ue0.b.ScannerQrCode) c0Var.a()).getData().getEnteredCode();
                re0.d dVar = x.this.validateCodeUseCase;
                re0.d.Params params = new re0.d.Params(enteredCode);
                this.f197980g = c0Var;
                this.f197978e = vq.j.a(enteredCode);
                this.f197979f = 1;
                obj = dVar.d(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            hz.g gVar = (hz.g) obj;
            if (gVar instanceof hz.g.Invalid) {
                invalid = new hz.b.Invalid(((hz.g.Invalid) gVar).b().getErrorMessage());
            } else {
                if (!fr.t.c(gVar, hz.g.b.f86853b)) {
                    throw new oq.p();
                }
                invalid = hz.b.d.f86848c;
            }
            if (!invalid.a()) {
                return c0Var.b(new er.l() { // from class: ue0.g0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x.j.Z(c0Var, invalid, (b.ScannerQrCode) obj2);
                    }
                });
            }
            String enteredCode2 = ((ue0.b.ScannerQrCode) c0Var.a()).getData().getEnteredCode();
            for (int i16 = 0; i16 < enteredCode2.length(); i16++) {
                if (!Character.isDigit(enteredCode2.charAt(i16))) {
                    return c0Var.d(new er.l() { // from class: ue0.f0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return x.j.Y(c0Var, invalid, (b.ScannerQrCode) obj2);
                        }
                    });
                }
            }
            return c0Var.d(new er.l() { // from class: ue0.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.j.X(c0Var, invalid, (b.ScannerQrCode) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object w(ue0.a.m mVar, k10.c0<ue0.b.ScannerQrCode> c0Var, tq.e<? super k10.l<? extends ue0.b>> eVar) {
            j jVar = x.this.new j(eVar);
            jVar.f197980g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ldx/i;", "Ldx/b;", "", "action", "Lue0/b$e;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ldx/i;Lue0/b$e;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<dx.i<? extends dx.b, ? extends String>, ue0.b.ScannerQrCode, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197982e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f197983f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i iVar = (dx.i) this.f197983f;
            uq.b.e();
            if (this.f197982e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            x xVar = x.this;
            if (iVar instanceof dx.i.Right) {
                xVar.d9(new ue0.a.OnScannedQrCode((String) ((dx.i.Right) iVar).b()));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(dx.i<? extends dx.b, String> iVar, ue0.b.ScannerQrCode scannerQrCode, tq.e<? super oq.i0> eVar) {
            k kVar = x.this.new k(eVar);
            kVar.f197983f = iVar;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lue0/a$h;", "action", "Lk10/c0;", "Lue0/b$e;", "state", "Lk10/l;", "Lue0/b;", "<anonymous>", "(Lue0/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<ue0.a.OnScannedQrCode, k10.c0<ue0.b.ScannerQrCode>, tq.e<? super k10.l<? extends ue0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197985e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f197986f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f197987g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ue0.b.FetchQrCodeData O(k10.c0 c0Var, ue0.a.OnScannedQrCode onScannedQrCode, ue0.b.ScannerQrCode scannerQrCode) {
            return new ue0.b.FetchQrCodeData(ue0.b.StateData.b(((ue0.b.ScannerQrCode) c0Var.a()).getData(), false, null, onScannedQrCode.getCode(), onScannedQrCode.getCode(), null, false, false, 115, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ue0.a.OnScannedQrCode onScannedQrCode = (ue0.a.OnScannedQrCode) this.f197986f;
            final k10.c0 c0Var = (k10.c0) this.f197987g;
            uq.b.e();
            if (this.f197985e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return !fr.t.c(onScannedQrCode.getCode(), ((ue0.b.ScannerQrCode) c0Var.a()).getData().getLastScannedCode()) ? c0Var.d(new er.l() { // from class: ue0.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.l.O(c0Var, onScannedQrCode, (b.ScannerQrCode) obj2);
                }
            }) : c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ue0.a.OnScannedQrCode onScannedQrCode, k10.c0<ue0.b.ScannerQrCode> c0Var, tq.e<? super k10.l<? extends ue0.b>> eVar) {
            l lVar = new l(eVar);
            lVar.f197986f = onScannedQrCode;
            lVar.f197987g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lue0/a$a;", "<unused var>", "Lue0/b$e;", "Loq/i0;", "<anonymous>", "(Lue0/a$a;Lue0/b$e;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<ue0.a.C5140a, ue0.b.ScannerQrCode, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197988e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f197988e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ue0.a.f> bVarY1 = x.this.Y1();
                ue0.a.f.C5141a c5141a = ue0.a.f.C5141a.f197809a;
                this.f197988e = 1;
                if (bVarY1.F(c5141a, this) == objE) {
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
        public final Object w(ue0.a.C5140a c5140a, ue0.b.ScannerQrCode scannerQrCode, tq.e<? super oq.i0> eVar) {
            return x.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lue0/b$d;", "state", "Lk10/l;", "Lue0/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.p<k10.c0<ue0.b.GetVerificationSessionByCode>, tq.e<? super k10.l<? extends ue0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197990e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f197991f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lue0/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ue0.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f197993e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ x f197994f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<ue0.b.GetVerificationSessionByCode> f197995g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x xVar, k10.c0<ue0.b.GetVerificationSessionByCode> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f197994f = xVar;
                this.f197995g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ue0.b.Error X(k10.c0 c0Var, x xVar, dx.b bVar, ue0.b.GetVerificationSessionByCode getVerificationSessionByCode) {
                return new ue0.b.Error(ue0.b.StateData.b(((ue0.b.GetVerificationSessionByCode) c0Var.a()).getData(), false, null, null, null, null, false, false, CertificateBody.profileType, null), xVar.errorVMSFactory.a(x.C9(xVar, bVar, xVar.b9(ue0.a.j.f197815a), null, 2, null)));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ue0.b.FetchQrCodeData Y(k10.c0 c0Var, QrCode qrCode, ue0.b.GetVerificationSessionByCode getVerificationSessionByCode) {
                return new ue0.b.FetchQrCodeData(ue0.b.StateData.b(((ue0.b.GetVerificationSessionByCode) c0Var.a()).getData(), false, null, qrCode.getQrCode(), null, null, false, false, 123, null));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f197993e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    l80.b bVar = this.f197994f.getVerificationSessionByCodeUC;
                    l80.b.Params params = new l80.b.Params(this.f197995g.a().getData().getEnteredCode());
                    this.f197993e = 1;
                    obj = bVar.c(params, this);
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
                final k10.c0<ue0.b.GetVerificationSessionByCode> c0Var = this.f197995g;
                final x xVar = this.f197994f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: ue0.i0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return x.n.a.X(c0Var, xVar, bVar2, (b.GetVerificationSessionByCode) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final QrCode qrCode = (QrCode) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: ue0.j0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x.n.a.Y(c0Var, qrCode, (b.GetVerificationSessionByCode) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f197994f, this.f197995g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ue0.b>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        n(tq.e<? super n> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f197991f;
            Object objE = uq.b.e();
            int i15 = this.f197990e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = x.this.callActionWithLoaderUseCase;
            a aVar2 = new a(x.this, c0Var, null);
            this.f197991f = vq.j.a(c0Var);
            this.f197990e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<ue0.b.GetVerificationSessionByCode> c0Var, tq.e<? super k10.l<? extends ue0.b>> eVar) {
            return ((n) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            n nVar = x.this.new n(eVar);
            nVar.f197991f = obj;
            return nVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lue0/b$b;", "state", "Lk10/l;", "Lue0/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.p<k10.c0<ue0.b.FetchQrCodeData>, tq.e<? super k10.l<? extends ue0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197996e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f197997f;

        o(tq.e<? super o> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ue0.b.Error V(k10.c0 c0Var, x xVar, dx.b bVar, ue0.b.FetchQrCodeData fetchQrCodeData) {
            return new ue0.b.Error(ue0.b.StateData.b(((ue0.b.FetchQrCodeData) c0Var.a()).getData(), false, null, null, null, null, false, false, CertificateBody.profileType, null), xVar.errorVMSFactory.a(x.C9(xVar, bVar, xVar.b9(ue0.a.c.f197806a), null, 2, null)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ue0.b.GetVerificationCertificate X(k10.c0 c0Var, QrCodeData qrCodeData, ue0.b.FetchQrCodeData fetchQrCodeData) {
            return new ue0.b.GetVerificationCertificate(ue0.b.StateData.b(((ue0.b.FetchQrCodeData) c0Var.a()).getData(), false, null, null, null, null, false, false, CertificateBody.profileType, null), qrCodeData);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f197997f;
            Object objE = uq.b.e();
            int i15 = this.f197996e;
            if (i15 == 0) {
                oq.u.b(obj);
                re0.a aVar = x.this.fetchQrCodeDataUC;
                re0.a.Params params = new re0.a.Params(((ue0.b.FetchQrCodeData) c0Var.a()).getData().getScannedCode());
                this.f197997f = c0Var;
                this.f197996e = 1;
                obj = aVar.d(params, this);
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
            final x xVar = x.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: ue0.k0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x.o.V(c0Var, xVar, bVar, (b.FetchQrCodeData) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final QrCodeData qrCodeData = (QrCodeData) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: ue0.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.o.X(c0Var, qrCodeData, (b.FetchQrCodeData) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<ue0.b.FetchQrCodeData> c0Var, tq.e<? super k10.l<? extends ue0.b>> eVar) {
            return ((o) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            o oVar = x.this.new o(eVar);
            oVar.f197997f = obj;
            return oVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lue0/b$c;", "state", "Lk10/l;", "Lue0/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.p<k10.c0<ue0.b.GetVerificationCertificate>, tq.e<? super k10.l<? extends ue0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f197999e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198000f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lue0/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ue0.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f198002e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f198003f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f198004g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f198005h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f198006j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f198007k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ x f198008l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k10.c0<ue0.b.GetVerificationCertificate> f198009m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x xVar, k10.c0<ue0.b.GetVerificationCertificate> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f198008l = xVar;
                this.f198009m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ue0.b.Error X(k10.c0 c0Var, x xVar, dx.b bVar, ue0.b.GetVerificationCertificate getVerificationCertificate) {
                return new ue0.b.Error(ue0.b.StateData.b(((ue0.b.GetVerificationCertificate) c0Var.a()).getData(), false, null, null, null, null, false, false, CertificateBody.profileType, null), xVar.errorVMSFactory.a(x.C9(xVar, bVar, xVar.b9(new ue0.a.RetryGetVerificationCertificate(((ue0.b.GetVerificationCertificate) c0Var.a()).getQrCodeData())), null, 2, null)));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ue0.b.ScannerQrCode Y(k10.c0 c0Var, ue0.b.GetVerificationCertificate getVerificationCertificate) {
                return new ue0.b.ScannerQrCode(((ue0.b.GetVerificationCertificate) c0Var.a()).getData());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                final k10.c0<ue0.b.GetVerificationCertificate> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f198007k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    l80.a aVar = this.f198008l.getVerificationCertificateUC;
                    l80.a.Params params = new l80.a.Params(this.f198009m.a().getQrCodeData().getSecurityToken(), Long.parseLong(this.f198009m.a().getQrCodeData().getValidTime()));
                    this.f198007k = 1;
                    obj = aVar.c(params, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = (k10.c0) this.f198003f;
                    oq.u.b(obj);
                }
                return c0Var.d(new er.l() { // from class: ue0.n0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x.p.a.Y(c0Var, (b.GetVerificationCertificate) obj2);
                    }
                });
                dx.i iVar = (dx.i) obj;
                final k10.c0<ue0.b.GetVerificationCertificate> c0Var2 = this.f198009m;
                final x xVar = this.f198008l;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var2.d(new er.l() { // from class: ue0.m0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return x.p.a.X(c0Var2, xVar, bVar, (b.GetVerificationCertificate) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                VerificationCertificate verificationCertificate = (VerificationCertificate) ((dx.i.Right) iVar).b();
                xw.b<ue0.a.f> bVarY1 = xVar.Y1();
                ue0.a.f.GoToNextStep goToNextStep = new ue0.a.f.GoToNextStep(new VerificationDataModel(verificationCertificate, c0Var2.a().getQrCodeData()));
                this.f198002e = vq.j.a(iVar);
                this.f198003f = c0Var2;
                this.f198004g = vq.j.a(verificationCertificate);
                this.f198005h = 0;
                this.f198006j = 0;
                this.f198007k = 2;
                if (bVarY1.F(goToNextStep, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.d(new er.l() { // from class: ue0.n0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return x.p.a.Y(c0Var, (b.GetVerificationCertificate) obj2);
                        }
                    });
                }
                return objE;
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f198008l, this.f198009m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ue0.b>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        p(tq.e<? super p> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f198000f;
            Object objE = uq.b.e();
            int i15 = this.f197999e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = x.this.callActionWithLoaderUseCase;
            a aVar2 = new a(x.this, c0Var, null);
            this.f198000f = vq.j.a(c0Var);
            this.f197999e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<ue0.b.GetVerificationCertificate> c0Var, tq.e<? super k10.l<? extends ue0.b>> eVar) {
            return ((p) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            p pVar = x.this.new p(eVar);
            pVar.f198000f = obj;
            return pVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lue0/a$k;", "<unused var>", "Lk10/c0;", "Lue0/b$a;", "state", "Lk10/l;", "Lue0/b;", "<anonymous>", "(Lue0/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<ue0.a.k, k10.c0<ue0.b.Error>, tq.e<? super k10.l<? extends ue0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198010e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198011f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ue0.b.ScannerQrCode O(k10.c0 c0Var, ue0.b.Error error) {
            return new ue0.b.ScannerQrCode(((ue0.b.Error) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f198011f;
            uq.b.e();
            if (this.f198010e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ue0.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.q.O(c0Var, (b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ue0.a.k kVar, k10.c0<ue0.b.Error> c0Var, tq.e<? super k10.l<? extends ue0.b>> eVar) {
            q qVar = new q(eVar);
            qVar.f198011f = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lue0/a$j;", "<unused var>", "Lk10/c0;", "Lue0/b$a;", "state", "Lk10/l;", "Lue0/b;", "<anonymous>", "(Lue0/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<ue0.a.j, k10.c0<ue0.b.Error>, tq.e<? super k10.l<? extends ue0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198012e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198013f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ue0.b.ScannerQrCode O(k10.c0 c0Var, ue0.b.Error error) {
            return new ue0.b.ScannerQrCode(((ue0.b.Error) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f198013f;
            uq.b.e();
            if (this.f198012e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ue0.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.r.O(c0Var, (b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ue0.a.j jVar, k10.c0<ue0.b.Error> c0Var, tq.e<? super k10.l<? extends ue0.b>> eVar) {
            r rVar = new r(eVar);
            rVar.f198013f = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lue0/a$i;", "action", "Lk10/c0;", "Lue0/b$a;", "state", "Lk10/l;", "Lue0/b;", "<anonymous>", "(Lue0/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<ue0.a.RetryGetVerificationCertificate, k10.c0<ue0.b.Error>, tq.e<? super k10.l<? extends ue0.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198014e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198015f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f198016g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ue0.b.GetVerificationCertificate O(k10.c0 c0Var, ue0.a.RetryGetVerificationCertificate retryGetVerificationCertificate, ue0.b.Error error) {
            return new ue0.b.GetVerificationCertificate(((ue0.b.Error) c0Var.a()).getData(), retryGetVerificationCertificate.getQrCodeData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ue0.a.RetryGetVerificationCertificate retryGetVerificationCertificate = (ue0.a.RetryGetVerificationCertificate) this.f198015f;
            final k10.c0 c0Var = (k10.c0) this.f198016g;
            uq.b.e();
            if (this.f198014e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ue0.q0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.s.O(c0Var, retryGetVerificationCertificate, (b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ue0.a.RetryGetVerificationCertificate retryGetVerificationCertificate, k10.c0<ue0.b.Error> c0Var, tq.e<? super k10.l<? extends ue0.b>> eVar) {
            s sVar = new s(eVar);
            sVar.f198015f = retryGetVerificationCertificate;
            sVar.f198016g = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    public x(yy.a aVar, ve0.k kVar, sz.d dVar, ac4.r<String> rVar, a14.x xVar, a14.b bVar, a14.m mVar, oz.q qVar, ve0.e eVar, re0.a aVar2, l80.a aVar3, l80.b bVar2, re0.d dVar2, hb4.d dVar3, ac4.a aVar4) {
        this.mapper = kVar;
        this.cameraScannerPreviewViewConnector = dVar;
        this.scanCameraUseCase = rVar;
        this.requestCameraPermissionUseCase = xVar;
        this.checkCameraPermissionUseCase = bVar;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.ownerViewLifecycleManager = qVar;
        this.qrScannerErrorMapper = eVar;
        this.fetchQrCodeDataUC = aVar2;
        this.getVerificationCertificateUC = aVar3;
        this.getVerificationSessionByCodeUC = bVar2;
        this.validateCodeUseCase = dVar2;
        this.errorVMSFactory = dVar3;
        this.callActionWithLoaderUseCase = aVar4;
        this.lifecycleConnector = qVar;
        this.stateMachine = aVar.a(new ue0.b.ScannerQrCode(new ue0.b.StateData(false, null, null, null, null, false, false, CertificateBody.profileType, null)), new er.l() { // from class: ue0.o
            @Override // er.l
            public final Object b(Object obj) {
                return x.H9(this.f197912a, (k10.v) obj);
            }
        });
    }

    private final jb4.b B9(dx.b bVar, er.a<oq.i0> aVar, er.a<oq.i0> aVar2) {
        return this.qrScannerErrorMapper.b(new ve0.e.Params(bVar, aVar2, aVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ jb4.b C9(x xVar, dx.b bVar, er.a aVar, er.a aVar2, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            aVar2 = xVar.b9(ue0.a.c.f197806a);
        }
        return xVar.B9(bVar, aVar, aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ue0.c.a D9(ue0.b state) {
        return this.mapper.b(new ve0.k.Params(state, this.cameraScannerPreviewViewConnector, b9(new ue0.a.UpdateBottomSheetState(true)), new er.l() { // from class: ue0.p
            @Override // er.l
            public final Object b(Object obj) {
                return x.E9(this.f197914a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: ue0.q
            @Override // er.l
            public final Object b(Object obj) {
                return x.F9(this.f197916a, (String) obj);
            }
        }, b9(ue0.a.m.f197818a), b9(ue0.a.e.f197808a), b9(ue0.a.C5140a.f197804a), b9(ue0.a.d.f197807a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(x xVar, boolean z15) {
        xVar.d9(new ue0.a.UpdateBottomSheetState(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(x xVar, String str) {
        xVar.d9(new ue0.a.OnCodeChange(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(final x xVar, k10.v vVar) {
        vVar.c(fr.q0.c(ue0.b.class), new er.l() { // from class: ue0.r
            @Override // er.l
            public final Object b(Object obj) {
                return x.I9(this.f197919a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ue0.b.ScannerQrCode.class), new er.l() { // from class: ue0.s
            @Override // er.l
            public final Object b(Object obj) {
                return x.J9(this.f197920a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ue0.b.GetVerificationSessionByCode.class), new er.l() { // from class: ue0.t
            @Override // er.l
            public final Object b(Object obj) {
                return x.K9(this.f197922a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ue0.b.FetchQrCodeData.class), new er.l() { // from class: ue0.u
            @Override // er.l
            public final Object b(Object obj) {
                return x.L9(this.f197924a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ue0.b.GetVerificationCertificate.class), new er.l() { // from class: ue0.v
            @Override // er.l
            public final Object b(Object obj) {
                return x.M9(this.f197925a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ue0.b.Error.class), new er.l() { // from class: ue0.w
            @Override // er.l
            public final Object b(Object obj) {
                return x.N9((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(x xVar, k10.z zVar) {
        b bVar = xVar.new b(null);
        zVar.x(fr.q0.c(ue0.a.c.class), k10.o.CANCEL_PREVIOUS, bVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(x xVar, k10.z zVar) {
        zVar.A(xVar.new e(null));
        k10.k.s(zVar, xVar.x8(), null, xVar.new f(null), 2, null);
        g gVar = xVar.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ue0.a.b.class), oVar, gVar);
        zVar.v(fr.q0.c(ue0.a.UpdateBottomSheetState.class), oVar, new h(null));
        zVar.v(fr.q0.c(ue0.a.OnCodeChange.class), oVar, new i(null));
        zVar.v(fr.q0.c(ue0.a.m.class), oVar, xVar.new j(null));
        k10.k.s(zVar, (mu.g) xVar.scanCameraUseCase.a(new sx.b.Analyzer(sx.d.BACK, 0.0f, new sx.e.SingleQrScanner(null, 1, null), 2, null)), null, xVar.new k(null), 2, null);
        zVar.v(fr.q0.c(ue0.a.OnScannedQrCode.class), oVar, new l(null));
        zVar.x(fr.q0.c(ue0.a.C5140a.class), oVar, xVar.new m(null));
        zVar.v(fr.q0.c(ue0.a.e.class), oVar, xVar.new c(null));
        zVar.v(fr.q0.c(ue0.a.d.class), oVar, new d(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(x xVar, k10.z zVar) {
        zVar.A(xVar.new n(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(x xVar, k10.z zVar) {
        zVar.A(xVar.new o(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(x xVar, k10.z zVar) {
        zVar.A(xVar.new p(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(k10.z zVar) {
        q qVar = new q(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ue0.a.k.class), oVar, qVar);
        zVar.v(fr.q0.c(ue0.a.j.class), oVar, new r(null));
        zVar.v(fr.q0.c(ue0.a.RetryGetVerificationCertificate.class), oVar, new s(null));
        return oq.i0.f148189a;
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: G9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<ue0.a.f> Y1() {
        return this.navAction;
    }

    @Override // ue0.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<ue0.b, ue0.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<ue0.c.a> getState() {
        return this.state;
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }
}
