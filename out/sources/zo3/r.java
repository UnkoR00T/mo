package zo3;

import co3.QrCodeData;
import dn0.VerificationSession;
import fr.q0;
import go3.h0;
import go3.i0;
import go3.p0;
import go3.t0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u0099\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\b\b\u0001\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J$\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020/2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,H\u0082@¢\u0006\u0004\b0\u00101J\u0017\u00105\u001a\u0002042\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b5\u00106J$\u00107\u001a\b\u0012\u0004\u0012\u00020\u00020/2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,H\u0082@¢\u0006\u0004\b7\u00101J\u0010\u00108\u001a\u000204H\u0082@¢\u0006\u0004\b8\u00109J\u0018\u0010;\u001a\u0002042\u0006\u0010:\u001a\u00020\"H\u0082@¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\u0002042\u0006\u0010:\u001a\u00020\"H\u0082@¢\u0006\u0004\b=\u0010<J\u0018\u0010?\u001a\u0002042\u0006\u0010>\u001a\u00020\"H\u0082@¢\u0006\u0004\b?\u0010<J\u0018\u0010A\u001a\u0002042\u0006\u0010@\u001a\u00020\"H\u0082@¢\u0006\u0004\bA\u0010<J\u0016\u0010D\u001a\b\u0012\u0004\u0012\u00020C0BH\u0096\u0001¢\u0006\u0004\bD\u0010EJ\u0016\u0010G\u001a\b\u0012\u0004\u0012\u00020F0BH\u0096\u0001¢\u0006\u0004\bG\u0010ER\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u001a\u0010k\u001a\u00020f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR&\u0010q\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030l8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR \u0010x\u001a\b\u0012\u0004\u0012\u00020s0r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR \u0010.\u001a\b\u0012\u0004\u0012\u00020z0y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~¨\u0006\u007f"}, d2 = {"Lzo3/r;", "Ll00/g;", "Lzo3/b;", "Lzo3/a;", "Lzo3/c;", "", "Lnx/b;", "Lyy/a;", "stateMachineFactory", "Lap3/h;", "scannerScreenMapper", "Lap3/b;", "scannerErrorMapper", "Lgo3/i0;", "requestCameraPermissionUseCase", "Lgo3/p0;", "validateCodeUseCase", "Lgo3/t0;", "verificationSessionByCodeUseCase", "Lgo3/d;", "fetchQrCodeDataUseCase", "Lgo3/b;", "checkVerificationTypeUseCase", "Lpx/d;", "remoteLogger", "Lgo3/h0;", "parseQrWithoutSensitiveDataUseCase", "La14/m;", "goToApplicationDetailsSettingsUseCase", "La14/b;", "checkCameraPermissionUseCase", "Lsz/d;", "cameraPreviewViewConnector", "Lac4/r;", "", "scanCameraUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Loz/q;", "ownerViewLifecycleManager", "Lwn3/c;", "verificationEntryPoint", "<init>", "(Lyy/a;Lap3/h;Lap3/b;Lgo3/i0;Lgo3/p0;Lgo3/t0;Lgo3/d;Lgo3/b;Lpx/d;Lgo3/h0;La14/m;La14/b;Lsz/d;Lac4/r;Lac4/a;Loz/q;Lwn3/c;)V", "Lk10/c0;", "Lzo3/b$b;", "state", "Lk10/l;", "I9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "domainError", "Loq/i0;", "E9", "(Ldx/b;)V", "K9", "F9", "(Ltq/e;)Ljava/lang/Object;", "code", "D9", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "G9", "data", "C9", "qrCode", "H9", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "b", "Lap3/h;", "c", "Lap3/b;", "d", "Lgo3/i0;", "e", "Lgo3/p0;", "f", "Lgo3/t0;", "g", "Lgo3/d;", "h", "Lgo3/b;", "j", "Lpx/d;", "k", "Lgo3/h0;", "l", "La14/m;", "m", "La14/b;", "n", "Lsz/d;", "p", "Lac4/r;", "q", "Lac4/a;", "r", "Loz/q;", "Loz/j;", "s", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lk10/t;", "t", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lzo3/a$f;", "v", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Lzo3/c$a;", "w", "Lmu/p0;", "getState", "()Lmu/p0;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<zo3.b, zo3.a> implements zo3.c, zx.d, nx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ap3.h scannerScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ap3.b scannerErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i0 requestCameraPermissionUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0 validateCodeUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t0 verificationSessionByCodeUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final go3.d fetchQrCodeDataUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final go3.b checkVerificationTypeUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final h0 parseQrWithoutSensitiveDataUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final a14.b checkCameraPermissionUseCase;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final sz.d cameraPreviewViewConnector;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final ac4.r<String> scanCameraUseCase;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final k10.t<zo3.b, zo3.a> stateMachine;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final xw.b<zo3.a.f> navAction = new xw.b<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<zo3.c.a> state = a9(new g(e9().getState(), this), zo3.c.a.C6379a.f235934a);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f235992d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f235993e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f235994f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f235995g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f235996h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f235997j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f235999l;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f235997j = obj;
            this.f235999l |= PKIFailureInfo.systemUnavail;
            return r.this.C9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzo3/a$a;", "<unused var>", "Lzo3/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lzo3/a$a;Lzo3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.q<zo3.a.C6375a, zo3.b.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236000e;

        a0(tq.e<? super a0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f236000e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                this.f236000e = 1;
                if (rVar.F9(this) == objE) {
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
        public final Object w(zo3.a.C6375a c6375a, zo3.b.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return r.this.new a0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f236002d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f236003e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f236005g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f236003e = obj;
            this.f236005g |= PKIFailureInfo.systemUnavail;
            return r.this.D9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzo3/a$j;", "<unused var>", "Lzo3/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lzo3/a$j;Lzo3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b0 extends vq.k implements er.q<zo3.a.j, zo3.b.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236006e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236007f;

        b0(tq.e<? super b0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            zo3.b.Initialized initialized = (zo3.b.Initialized) this.f236007f;
            Object objE = uq.b.e();
            int i15 = this.f236006e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                String code = initialized.getCode();
                this.f236007f = vq.j.a(initialized);
                this.f236006e = 1;
                if (rVar.D9(code, this) == objE) {
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
        public final Object w(zo3.a.j jVar, zo3.b.Initialized initialized, tq.e<? super oq.i0> eVar) {
            b0 b0Var = r.this.new b0(eVar);
            b0Var.f236007f = initialized;
            return b0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236009e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f236011g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f236011g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f236009e;
            if (i15 == 0) {
                oq.u.b(obj);
                t0 t0Var = r.this.verificationSessionByCodeUseCase;
                t0.Params params = new t0.Params(this.f236011g);
                this.f236009e = 1;
                obj = t0Var.d(params, this);
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
            r rVar = r.this;
            if (iVar instanceof dx.i.Left) {
                rVar.E9((dx.b) ((dx.i.Left) iVar).b());
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                rVar.d9(new zo3.a.VerifyQrCode(((VerificationSession) ((dx.i.Right) iVar).b()).getQrCode()));
            }
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return r.this.new c(this.f236011g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((c) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzo3/a$h;", "<unused var>", "Lk10/c0;", "Lzo3/b$b;", "state", "Lk10/l;", "Lzo3/b;", "<anonymous>", "(Lzo3/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c0 extends vq.k implements er.q<zo3.a.h, k10.c0<zo3.b.Initialized>, tq.e<? super k10.l<? extends zo3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236012e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236013f;

        c0(tq.e<? super c0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zo3.b.Initialized O(zo3.b.Initialized initialized) {
            return zo3.b.Initialized.b(initialized, false, null, null, null, false, null, null, null, 239, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f236013f;
            uq.b.e();
            if (this.f236012e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: zo3.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.c0.O((b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zo3.a.h hVar, k10.c0<zo3.b.Initialized> c0Var, tq.e<? super k10.l<? extends zo3.b>> eVar) {
            c0 c0Var2 = new c0(eVar);
            c0Var2.f236013f = c0Var;
            return c0Var2.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f236014d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f236015e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f236017g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f236015e = obj;
            this.f236017g |= PKIFailureInfo.systemUnavail;
            return r.this.H9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f236018d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f236019e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f236021g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f236019e = obj;
            this.f236021g |= PKIFailureInfo.systemUnavail;
            return r.this.I9(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f236022d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f236023e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f236025g;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f236023e = obj;
            this.f236025g |= PKIFailureInfo.systemUnavail;
            return r.this.K9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class g implements mu.g<zo3.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f236026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f236027b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f236028a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f236029b;

            /* JADX INFO: renamed from: zo3.r$g$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6381a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f236030d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f236031e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f236032f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f236034h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f236035j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f236036k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f236037l;

                public C6381a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f236030d = obj;
                    this.f236031e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, r rVar) {
                this.f236028a = hVar;
                this.f236029b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6381a c6381a;
                if (eVar instanceof C6381a) {
                    c6381a = (C6381a) eVar;
                    int i15 = c6381a.f236031e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6381a.f236031e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6381a = new C6381a(eVar);
                    }
                } else {
                    c6381a = new C6381a(eVar);
                }
                Object obj2 = c6381a.f236030d;
                Object objE = uq.b.e();
                int i16 = c6381a.f236031e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f236028a;
                    zo3.c.a aVarB = this.f236029b.scannerScreenMapper.b(new ap3.h.Params((zo3.b) obj, this.f236029b.b9(zo3.a.C6375a.f235898a), this.f236029b.b9(zo3.a.n.f235919a), this.f236029b.b9(zo3.a.j.f235915a), this.f236029b.new h(), this.f236029b.b9(zo3.a.h.f235913a), this.f236029b.b9(zo3.a.d.f235901a), this.f236029b.new i()));
                    c6381a.f236032f = vq.j.a(obj);
                    c6381a.f236034h = vq.j.a(c6381a);
                    c6381a.f236035j = vq.j.a(obj);
                    c6381a.f236036k = vq.j.a(hVar);
                    c6381a.f236037l = 0;
                    c6381a.f236031e = 1;
                    if (hVar.F(aVarB, c6381a) == objE) {
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

        public g(mu.g gVar, r rVar) {
            this.f236026a = gVar;
            this.f236027b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super zo3.c.a> hVar, tq.e eVar) {
            Object objA = this.f236026a.a(new a(hVar, this.f236027b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h implements er.l<String, oq.i0> {
        h() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(String str) {
            c(str);
            return oq.i0.f148189a;
        }

        public final void c(String str) {
            r.this.d9(new zo3.a.OnCodeChange(str));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i implements er.l<g30.v, oq.i0> {
        i() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(g30.v vVar) {
            c(vVar);
            return oq.i0.f148189a;
        }

        public final void c(g30.v vVar) {
            r.this.d9(new zo3.a.BottomSheetVisibilityChanged(vVar));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lzo3/b$a;", "state", "Lk10/l;", "Lzo3/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<k10.c0<zo3.b.a>, tq.e<? super k10.l<? extends zo3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236040e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236041f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn3.c f236042g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ r f236043h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(wn3.c cVar, r rVar, tq.e<? super j> eVar) {
            super(2, eVar);
            this.f236042g = cVar;
            this.f236043h = rVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zo3.b.Initialized O(wn3.c cVar, r rVar, zo3.b.a aVar) {
            return new zo3.b.Initialized(false, null, null, cVar, false, null, rVar.cameraPreviewViewConnector, null, 183, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f236041f;
            uq.b.e();
            if (this.f236040e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final wn3.c cVar = this.f236042g;
            final r rVar = this.f236043h;
            return c0Var.d(new er.l() { // from class: zo3.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.j.O(cVar, rVar, (b.a) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<zo3.b.a> c0Var, tq.e<? super k10.l<? extends zo3.b>> eVar) {
            return ((j) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            j jVar = new j(this.f236042g, this.f236043h, eVar);
            jVar.f236041f = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzo3/a$i;", "action", "Lk10/c0;", "Lzo3/b$b;", "state", "Lk10/l;", "Lzo3/b;", "<anonymous>", "(Lzo3/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<zo3.a.OnCodeChange, k10.c0<zo3.b.Initialized>, tq.e<? super k10.l<? extends zo3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236044e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236045f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f236046g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zo3.b.Initialized O(zo3.a.OnCodeChange onCodeChange, zo3.b.Initialized initialized) {
            return zo3.b.Initialized.b(initialized, false, hz.b.C2039b.f86846c, onCodeChange.getCode(), null, false, null, null, null, 249, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final zo3.a.OnCodeChange onCodeChange = (zo3.a.OnCodeChange) this.f236045f;
            k10.c0 c0Var = (k10.c0) this.f236046g;
            uq.b.e();
            if (this.f236044e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: zo3.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.k.O(onCodeChange, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zo3.a.OnCodeChange onCodeChange, k10.c0<zo3.b.Initialized> c0Var, tq.e<? super k10.l<? extends zo3.b>> eVar) {
            k kVar = new k(eVar);
            kVar.f236045f = onCodeChange;
            kVar.f236046g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzo3/a$o;", "action", "Lk10/c0;", "Lzo3/b$b;", "state", "Lk10/l;", "Lzo3/b;", "<anonymous>", "(Lzo3/a$o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<zo3.a.UpdateCodeValidationState, k10.c0<zo3.b.Initialized>, tq.e<? super k10.l<? extends zo3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236047e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236048f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f236049g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zo3.b.Initialized O(zo3.a.UpdateCodeValidationState updateCodeValidationState, zo3.b.Initialized initialized) {
            return zo3.b.Initialized.b(initialized, false, updateCodeValidationState.getValidationState(), null, null, false, null, null, null, 253, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final zo3.a.UpdateCodeValidationState updateCodeValidationState = (zo3.a.UpdateCodeValidationState) this.f236048f;
            k10.c0 c0Var = (k10.c0) this.f236049g;
            uq.b.e();
            if (this.f236047e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: zo3.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.l.O(updateCodeValidationState, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zo3.a.UpdateCodeValidationState updateCodeValidationState, k10.c0<zo3.b.Initialized> c0Var, tq.e<? super k10.l<? extends zo3.b>> eVar) {
            l lVar = new l(eVar);
            lVar.f236048f = updateCodeValidationState;
            lVar.f236049g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzo3/a$e;", "action", "Lzo3/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lzo3/a$e;Lzo3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<zo3.a.HandlePersonCode, zo3.b.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236050e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236051f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            zo3.a.HandlePersonCode handlePersonCode = (zo3.a.HandlePersonCode) this.f236051f;
            Object objE = uq.b.e();
            int i15 = this.f236050e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                String code = handlePersonCode.getCode();
                this.f236051f = vq.j.a(handlePersonCode);
                this.f236050e = 1;
                if (rVar.G9(code, this) == objE) {
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
        public final Object w(zo3.a.HandlePersonCode handlePersonCode, zo3.b.Initialized initialized, tq.e<? super oq.i0> eVar) {
            m mVar = r.this.new m(eVar);
            mVar.f236051f = handlePersonCode;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzo3/a$p;", "action", "Lzo3/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lzo3/a$p;Lzo3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<zo3.a.VerifyQrCode, zo3.b.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236053e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236054f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            zo3.a.VerifyQrCode verifyQrCode = (zo3.a.VerifyQrCode) this.f236054f;
            Object objE = uq.b.e();
            int i15 = this.f236053e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                String data = verifyQrCode.getData();
                this.f236054f = vq.j.a(verifyQrCode);
                this.f236053e = 1;
                if (rVar.C9(data, this) == objE) {
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
        public final Object w(zo3.a.VerifyQrCode verifyQrCode, zo3.b.Initialized initialized, tq.e<? super oq.i0> eVar) {
            n nVar = r.this.new n(eVar);
            nVar.f236054f = verifyQrCode;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzo3/a$q;", "action", "Lzo3/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lzo3/a$q;Lzo3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<zo3.a.VerifyQrCodeFailed, zo3.b.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236056e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236057f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            zo3.a.VerifyQrCodeFailed verifyQrCodeFailed = (zo3.a.VerifyQrCodeFailed) this.f236057f;
            Object objE = uq.b.e();
            int i15 = this.f236056e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                String string = verifyQrCodeFailed.getError().toString();
                this.f236057f = vq.j.a(verifyQrCodeFailed);
                this.f236056e = 1;
                if (rVar.H9(string, this) == objE) {
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
        public final Object w(zo3.a.VerifyQrCodeFailed verifyQrCodeFailed, zo3.b.Initialized initialized, tq.e<? super oq.i0> eVar) {
            o oVar = r.this.new o(eVar);
            oVar.f236057f = verifyQrCodeFailed;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzo3/a$n;", "<unused var>", "Lzo3/b$b;", "Loq/i0;", "<anonymous>", "(Lzo3/a$n;Lzo3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<zo3.a.n, zo3.b.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236059e;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f236059e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<zo3.a.f> bVarY1 = r.this.Y1();
                zo3.a.f.e eVar = zo3.a.f.e.f235907a;
                this.f236059e = 1;
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
        public final Object w(zo3.a.n nVar, zo3.b.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return r.this.new p(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Ldx/i;", "Ldx/b;", "", "action", "Lk10/c0;", "Lzo3/b$b;", "state", "Lk10/l;", "Lzo3/b;", "<anonymous>", "(Ldx/i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<dx.i<? extends dx.b, ? extends String>, k10.c0<zo3.b.Initialized>, tq.e<? super k10.l<? extends zo3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236061e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236062f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f236063g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f236065e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ dx.i<dx.b, String> f236066f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ r f236067g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(dx.i<? extends dx.b, String> iVar, r rVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f236066f = iVar;
                this.f236067g = rVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f236065e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                dx.i<dx.b, String> iVar = this.f236066f;
                r rVar = this.f236067g;
                if (iVar instanceof dx.i.Left) {
                    rVar.d9(new zo3.a.VerifyQrCodeFailed((dx.b) ((dx.i.Left) iVar).b()));
                } else {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    rVar.d9(new zo3.a.VerifyQrCode((String) ((dx.i.Right) iVar).b()));
                }
                return oq.i0.f148189a;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f236066f, this.f236067g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zo3.b.Initialized O(String str, zo3.b.Initialized initialized) {
            return zo3.b.Initialized.b(initialized, false, null, null, null, false, null, null, str, CertificateBody.profileType, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i iVar = (dx.i) this.f236062f;
            k10.c0 c0Var = (k10.c0) this.f236063g;
            uq.b.e();
            if (this.f236061e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final String str = (String) iVar.a();
            px.d dVar = r.this.remoteLogger;
            String str2 = "Camera scanner - validation state: " + ((zo3.b.Initialized) c0Var.a()).getCodeValidationState();
            px.d.a aVar = px.d.a.GENERAL;
            dVar.F8(str2, aVar);
            if (str == null || !fr.t.c(str, ((zo3.b.Initialized) c0Var.a()).getLastCodeScanned())) {
                r rVar = r.this;
                i00.a.a(rVar, new a(iVar, rVar, null));
            }
            if (str != null) {
                return c0Var.b(new er.l() { // from class: zo3.v
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.q.O(str, (b.Initialized) obj2);
                    }
                });
            }
            r.this.remoteLogger.F8("Camera scanner - no result", aVar);
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(dx.i<? extends dx.b, String> iVar, k10.c0<zo3.b.Initialized> c0Var, tq.e<? super k10.l<? extends zo3.b>> eVar) {
            q qVar = r.this.new q(eVar);
            qVar.f236062f = iVar;
            qVar.f236063g = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: zo3.r$r, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzo3/a$g;", "action", "Lzo3/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lzo3/a$g;Lzo3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class C6382r extends vq.k implements er.q<zo3.a.NavigateToDocumentDetail, zo3.b.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236068e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236069f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f236070g;

        C6382r(tq.e<? super C6382r> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
        
            if (r8.F(r3, r7) == r2) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
        
            if (r8.F(r3, r7) == r2) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
        
            if (r8.F(r3, r7) == r2) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
        
            return r2;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f236069f
                zo3.a$g r0 = (zo3.a.NavigateToDocumentDetail) r0
                java.lang.Object r1 = r7.f236070g
                zo3.b$b r1 = (zo3.b.Initialized) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r7.f236068e
                r4 = 3
                r5 = 2
                r6 = 1
                if (r3 == 0) goto L27
                if (r3 == r6) goto L22
                if (r3 == r5) goto L22
                if (r3 != r4) goto L1a
                goto L22
            L1a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L22:
                oq.u.b(r8)
                goto Laf
            L27:
                oq.u.b(r8)
                co3.u r8 = r0.getVerificationType()
                boolean r3 = r8 instanceof co3.u.a
                if (r3 == 0) goto L5b
                zo3.r r8 = zo3.r.this
                xw.b r8 = r8.Y1()
                zo3.a$f$d r3 = new zo3.a$f$d
                jo3.a$a r4 = new jo3.a$a
                co3.e r5 = r0.getQrCodeData()
                r4.<init>(r5)
                r3.<init>(r4)
                java.lang.Object r0 = vq.j.a(r0)
                r7.f236069f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r7.f236070g = r0
                r7.f236068e = r6
                java.lang.Object r8 = r8.F(r3, r7)
                if (r8 != r2) goto Laf
                goto Lae
            L5b:
                boolean r3 = r8 instanceof co3.u.b
                if (r3 == 0) goto L87
                zo3.r r8 = zo3.r.this
                xw.b r8 = r8.Y1()
                zo3.a$f$f r3 = new zo3.a$f$f
                co3.e r4 = r0.getQrCodeData()
                wn3.c r6 = r1.getEntryPoint()
                r3.<init>(r4, r6)
                java.lang.Object r0 = vq.j.a(r0)
                r7.f236069f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r7.f236070g = r0
                r7.f236068e = r5
                java.lang.Object r8 = r8.F(r3, r7)
                if (r8 != r2) goto Laf
                goto Lae
            L87:
                boolean r8 = r8 instanceof co3.u.c
                if (r8 == 0) goto Lb2
                zo3.r r8 = zo3.r.this
                xw.b r8 = r8.Y1()
                zo3.a$f$g r3 = new zo3.a$f$g
                co3.e r5 = r0.getQrCodeData()
                r3.<init>(r5)
                java.lang.Object r0 = vq.j.a(r0)
                r7.f236069f = r0
                java.lang.Object r0 = vq.j.a(r1)
                r7.f236070g = r0
                r7.f236068e = r4
                java.lang.Object r8 = r8.F(r3, r7)
                if (r8 != r2) goto Laf
            Lae:
                return r2
            Laf:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            Lb2:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: zo3.r.C6382r.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(zo3.a.NavigateToDocumentDetail navigateToDocumentDetail, zo3.b.Initialized initialized, tq.e<? super oq.i0> eVar) {
            C6382r c6382r = r.this.new C6382r(eVar);
            c6382r.f236069f = navigateToDocumentDetail;
            c6382r.f236070g = initialized;
            return c6382r.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzo3/a$b;", "action", "Lk10/c0;", "Lzo3/b$b;", "state", "Lk10/l;", "Lzo3/b;", "<anonymous>", "(Lzo3/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<zo3.a.BottomSheetVisibilityChanged, k10.c0<zo3.b.Initialized>, tq.e<? super k10.l<? extends zo3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236072e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236073f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f236074g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zo3.b.Initialized O(zo3.a.BottomSheetVisibilityChanged bottomSheetVisibilityChanged, k10.c0 c0Var, zo3.b.Initialized initialized) {
            g30.v value = bottomSheetVisibilityChanged.getValue();
            return zo3.b.Initialized.b(initialized, false, hz.b.C2039b.f86846c, ((zo3.b.Initialized) c0Var.a()).getCode(), null, false, value, null, null, 217, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final zo3.a.BottomSheetVisibilityChanged bottomSheetVisibilityChanged = (zo3.a.BottomSheetVisibilityChanged) this.f236073f;
            final k10.c0 c0Var = (k10.c0) this.f236074g;
            uq.b.e();
            if (this.f236072e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: zo3.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.s.O(bottomSheetVisibilityChanged, c0Var, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(zo3.a.BottomSheetVisibilityChanged bottomSheetVisibilityChanged, k10.c0<zo3.b.Initialized> c0Var, tq.e<? super k10.l<? extends zo3.b>> eVar) {
            s sVar = new s(eVar);
            sVar.f236073f = bottomSheetVisibilityChanged;
            sVar.f236074g = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lzo3/b$b;", "state", "Lk10/l;", "Lzo3/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.p<k10.c0<zo3.b.Initialized>, tq.e<? super k10.l<? extends zo3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236075e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236076f;

        t(tq.e<? super t> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f236076f;
            Object objE = uq.b.e();
            int i15 = this.f236075e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            r rVar = r.this;
            this.f236076f = vq.j.a(c0Var);
            this.f236075e = 1;
            Object objK9 = rVar.K9(c0Var, this);
            return objK9 == objE ? objE : objK9;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<zo3.b.Initialized> c0Var, tq.e<? super k10.l<? extends zo3.b>> eVar) {
            return ((t) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            t tVar = r.this.new t(eVar);
            tVar.f236076f = obj;
            return tVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzo3/a$d;", "<unused var>", "Lzo3/b$b;", "Loq/i0;", "<anonymous>", "(Lzo3/a$d;Lzo3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<zo3.a.d, zo3.b.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236078e;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f236078e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            r.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(zo3.a.d dVar, zo3.b.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return r.this.new u(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnx/a;", "viewLifecycle", "Lzo3/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnx/a;Lzo3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<nx.a, zo3.b.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236080e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236081f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nx.a aVar = (nx.a) this.f236081f;
            uq.b.e();
            if (this.f236080e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (aVar == nx.a.RESUMED) {
                r.this.d9(zo3.a.k.f235916a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nx.a aVar, zo3.b.Initialized initialized, tq.e<? super oq.i0> eVar) {
            v vVar = r.this.new v(eVar);
            vVar.f236081f = aVar;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzo3/a$k;", "<unused var>", "Lk10/c0;", "Lzo3/b$b;", "state", "Lk10/l;", "Lzo3/b;", "<anonymous>", "(Lzo3/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<zo3.a.k, k10.c0<zo3.b.Initialized>, tq.e<? super k10.l<? extends zo3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236083e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236084f;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f236084f;
            Object objE = uq.b.e();
            int i15 = this.f236083e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            r rVar = r.this;
            this.f236084f = vq.j.a(c0Var);
            this.f236083e = 1;
            Object objI9 = rVar.I9(c0Var, this);
            return objI9 == objE ? objE : objI9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(zo3.a.k kVar, k10.c0<zo3.b.Initialized> c0Var, tq.e<? super k10.l<? extends zo3.b>> eVar) {
            w wVar = r.this.new w(eVar);
            wVar.f236084f = c0Var;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzo3/a$l;", "<unused var>", "Lk10/c0;", "Lzo3/b$b;", "state", "Lk10/l;", "Lzo3/b;", "<anonymous>", "(Lzo3/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<zo3.a.l, k10.c0<zo3.b.Initialized>, tq.e<? super k10.l<? extends zo3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236086e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236087f;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f236087f;
            Object objE = uq.b.e();
            int i15 = this.f236086e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            r rVar = r.this;
            this.f236087f = vq.j.a(c0Var);
            this.f236086e = 1;
            Object objK9 = rVar.K9(c0Var, this);
            return objK9 == objE ? objE : objK9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(zo3.a.l lVar, k10.c0<zo3.b.Initialized> c0Var, tq.e<? super k10.l<? extends zo3.b>> eVar) {
            x xVar = r.this.new x(eVar);
            xVar.f236087f = c0Var;
            return xVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzo3/a$m;", "action", "Lzo3/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lzo3/a$m;Lzo3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<zo3.a.ShowError, zo3.b.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236089e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f236090f;

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            zo3.a.ShowError showError = (zo3.a.ShowError) this.f236090f;
            Object objE = uq.b.e();
            int i15 = this.f236089e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<zo3.a.f> bVarY1 = r.this.Y1();
                zo3.a.f.Error error = new zo3.a.f.Error(showError.getErrorData());
                this.f236090f = vq.j.a(showError);
                this.f236089e = 1;
                if (bVarY1.F(error, this) == objE) {
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
        public final Object w(zo3.a.ShowError showError, zo3.b.Initialized initialized, tq.e<? super oq.i0> eVar) {
            y yVar = r.this.new y(eVar);
            yVar.f236090f = showError;
            return yVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzo3/a$c;", "<unused var>", "Lzo3/b$b;", "Loq/i0;", "<anonymous>", "(Lzo3/a$c;Lzo3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<zo3.a.c, zo3.b.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236092e;

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f236092e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<zo3.a.f> bVarY1 = r.this.Y1();
                zo3.a.f.b bVar = zo3.a.f.b.f235904a;
                this.f236092e = 1;
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
        public final Object w(zo3.a.c cVar, zo3.b.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return r.this.new z(eVar).J(oq.i0.f148189a);
        }
    }

    public r(yy.a aVar, ap3.h hVar, ap3.b bVar, i0 i0Var, p0 p0Var, t0 t0Var, go3.d dVar, go3.b bVar2, px.d dVar2, h0 h0Var, a14.m mVar, a14.b bVar3, sz.d dVar3, ac4.r<String> rVar, ac4.a aVar2, oz.q qVar, final wn3.c cVar) {
        this.scannerScreenMapper = hVar;
        this.scannerErrorMapper = bVar;
        this.requestCameraPermissionUseCase = i0Var;
        this.validateCodeUseCase = p0Var;
        this.verificationSessionByCodeUseCase = t0Var;
        this.fetchQrCodeDataUseCase = dVar;
        this.checkVerificationTypeUseCase = bVar2;
        this.remoteLogger = dVar2;
        this.parseQrWithoutSensitiveDataUseCase = h0Var;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.checkCameraPermissionUseCase = bVar3;
        this.cameraPreviewViewConnector = dVar3;
        this.scanCameraUseCase = rVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.ownerViewLifecycleManager = qVar;
        this.lifecycleConnector = qVar;
        this.stateMachine = aVar.a(zo3.b.a.f235925a, new er.l() { // from class: zo3.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.N9(cVar, this, (k10.v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C9(String str, tq.e<? super oq.i0> eVar) throws Throwable {
        a aVar;
        QrCodeData qrCodeData;
        dx.i iVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f235999l;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f235999l = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objD = aVar.f235997j;
        Object objE = uq.b.e();
        int i16 = aVar.f235999l;
        if (i16 == 0) {
            oq.u.b(objD);
            go3.d dVar = this.fetchQrCodeDataUseCase;
            go3.d.Params params = new go3.d.Params(str);
            aVar.f235992d = vq.j.a(str);
            aVar.f235999l = 1;
            objD = dVar.d(params, aVar);
            if (objD != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            str = (String) aVar.f235992d;
            oq.u.b(objD);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qrCodeData = (QrCodeData) aVar.f235994f;
            oq.u.b(objD);
        }
        iVar = (dx.i) objD;
        if (iVar instanceof dx.i.Left) {
            E9((dx.b) ((dx.i.Left) iVar).b());
        } else {
            if (iVar instanceof dx.i.Right) {
                throw new oq.p();
            }
            d9(new zo3.a.NavigateToDocumentDetail((co3.u) ((dx.i.Right) iVar).b(), qrCodeData));
        }
        return oq.i0.f148189a;
        dx.i iVar2 = (dx.i) objD;
        if (!(iVar2 instanceof dx.i.Left)) {
            if (!(iVar2 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            QrCodeData qrCodeData2 = (QrCodeData) ((dx.i.Right) iVar2).b();
            go3.b bVar = this.checkVerificationTypeUseCase;
            go3.b.Params params2 = new go3.b.Params(qrCodeData2);
            aVar.f235992d = vq.j.a(str);
            aVar.f235993e = vq.j.a(iVar2);
            aVar.f235994f = qrCodeData2;
            aVar.f235995g = 0;
            aVar.f235996h = 0;
            aVar.f235999l = 2;
            objD = bVar.d(params2, aVar);
            if (objD != objE) {
                qrCodeData = qrCodeData2;
                iVar = (dx.i) objD;
                if (iVar instanceof dx.i.Left) {
                    E9((dx.b) ((dx.i.Left) iVar).b());
                } else {
                    if (iVar instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    d9(new zo3.a.NavigateToDocumentDetail((co3.u) ((dx.i.Right) iVar).b(), qrCodeData));
                }
            }
            return objE;
        }
        E9((dx.b) ((dx.i.Left) iVar2).b());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D9(String str, tq.e<? super oq.i0> eVar) throws Throwable {
        b bVar;
        hz.b invalid;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f236005g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f236005g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objD = bVar.f236003e;
        Object objE = uq.b.e();
        int i16 = bVar.f236005g;
        if (i16 == 0) {
            oq.u.b(objD);
            p0 p0Var = this.validateCodeUseCase;
            p0.Params params = new p0.Params(str);
            bVar.f236002d = str;
            bVar.f236005g = 1;
            objD = p0Var.d(params, bVar);
            if (objD == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) bVar.f236002d;
            oq.u.b(objD);
        }
        hz.g gVar = (hz.g) objD;
        if (gVar instanceof hz.g.Invalid) {
            invalid = new hz.b.Invalid(((hz.g.Invalid) gVar).b().getErrorMessage());
        } else {
            if (!fr.t.c(gVar, hz.g.b.f86853b)) {
                throw new oq.p();
            }
            invalid = hz.b.d.f86848c;
        }
        if (invalid.a()) {
            for (int i17 = 0; i17 < str.length(); i17++) {
                if (!Character.isDigit(str.charAt(i17))) {
                    d9(new zo3.a.VerifyQrCode(str));
                }
            }
            d9(new zo3.a.HandlePersonCode(str));
        }
        d9(new zo3.a.UpdateCodeValidationState(invalid));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E9(dx.b domainError) {
        d9(new zo3.a.ShowError(this.scannerErrorMapper.b(new ap3.b.Params(domainError, b9(zo3.a.c.f235900a), b9(zo3.a.k.f235916a)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object F9(tq.e<? super oq.i0> eVar) {
        Object objF = Y1().F(zo3.a.f.C6376a.f235903a, eVar);
        return objF == uq.b.e() ? objF : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object G9(String str, tq.e<? super oq.i0> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new c(str, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H9(String str, tq.e<? super oq.i0> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f236017g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f236017g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objD = dVar.f236015e;
        Object objE = uq.b.e();
        int i16 = dVar.f236017g;
        if (i16 == 0) {
            oq.u.b(objD);
            h0 h0Var = this.parseQrWithoutSensitiveDataUseCase;
            h0.Params params = new h0.Params(str);
            dVar.f236014d = vq.j.a(str);
            dVar.f236017g = 1;
            objD = h0Var.d(params, dVar);
            if (objD == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objD);
        }
        dx.i iVar = (dx.i) objD;
        if (iVar instanceof dx.i.Left) {
            E9((dx.b) ((dx.i.Left) iVar).b());
        } else {
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            this.remoteLogger.u6((String) ((dx.i.Right) iVar).b(), px.c.a(this));
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I9(k10.c0<zo3.b.Initialized> c0Var, tq.e<? super k10.l<? extends zo3.b>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f236021g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f236021g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objC = eVar2.f236019e;
        Object objE = uq.b.e();
        int i16 = eVar2.f236021g;
        if (i16 == 0) {
            oq.u.b(objC);
            a14.b bVar = this.checkCameraPermissionUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            eVar2.f236018d = c0Var;
            eVar2.f236021g = 1;
            objC = bVar.c(c1792a, eVar2);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (k10.c0) eVar2.f236018d;
            oq.u.b(objC);
        }
        final boolean zC = fr.t.c(objC, gy.c.a.f78236a);
        return c0Var.b(new er.l() { // from class: zo3.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.J9(zC, (b.Initialized) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zo3.b.Initialized J9(boolean z15, zo3.b.Initialized initialized) {
        return zo3.b.Initialized.b(initialized, z15, null, null, null, z15, null, null, "", 110, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object K9(k10.c0<zo3.b.Initialized> c0Var, tq.e<? super k10.l<? extends zo3.b>> eVar) throws Throwable {
        f fVar;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f236025g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f236025g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object objA = fVar.f236023e;
        Object objE = uq.b.e();
        int i16 = fVar.f236025g;
        if (i16 == 0) {
            oq.u.b(objA);
            i0 i0Var = this.requestCameraPermissionUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            fVar.f236022d = c0Var;
            fVar.f236025g = 1;
            objA = i0Var.a(c1792a, fVar);
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (k10.c0) fVar.f236022d;
            oq.u.b(objA);
        }
        co3.h hVar = (co3.h) objA;
        final boolean zC = fr.t.c(hVar, co3.h.a.f28471a);
        this.remoteLogger.F8("Request camera permission result: " + hVar, px.d.a.GENERAL);
        return c0Var.b(new er.l() { // from class: zo3.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.L9(zC, (b.Initialized) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zo3.b.Initialized L9(boolean z15, zo3.b.Initialized initialized) {
        return zo3.b.Initialized.b(initialized, z15, null, null, null, z15, null, null, null, 238, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(final wn3.c cVar, final r rVar, k10.v vVar) {
        vVar.c(q0.c(zo3.b.a.class), new er.l() { // from class: zo3.k
            @Override // er.l
            public final Object b(Object obj) {
                return r.O9(cVar, rVar, (k10.z) obj);
            }
        });
        vVar.c(q0.c(zo3.b.Initialized.class), new er.l() { // from class: zo3.l
            @Override // er.l
            public final Object b(Object obj) {
                return r.P9(this.f235967a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(wn3.c cVar, r rVar, k10.z zVar) {
        zVar.A(new j(cVar, rVar, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(final r rVar, k10.z zVar) {
        zVar.A(rVar.new t(null));
        k10.k.s(zVar, rVar.x8(), null, rVar.new v(null), 2, null);
        w wVar = rVar.new w(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(zo3.a.k.class), oVar, wVar);
        zVar.v(q0.c(zo3.a.l.class), oVar, rVar.new x(null));
        zVar.x(q0.c(zo3.a.ShowError.class), oVar, rVar.new y(null));
        zVar.x(q0.c(zo3.a.c.class), oVar, rVar.new z(null));
        zVar.x(q0.c(zo3.a.C6375a.class), oVar, rVar.new a0(null));
        zVar.x(q0.c(zo3.a.j.class), oVar, rVar.new b0(null));
        zVar.v(q0.c(zo3.a.h.class), oVar, new c0(null));
        zVar.v(q0.c(zo3.a.OnCodeChange.class), oVar, new k(null));
        zVar.v(q0.c(zo3.a.UpdateCodeValidationState.class), oVar, new l(null));
        zVar.x(q0.c(zo3.a.HandlePersonCode.class), oVar, rVar.new m(null));
        zVar.x(q0.c(zo3.a.VerifyQrCode.class), oVar, rVar.new n(null));
        zVar.x(q0.c(zo3.a.VerifyQrCodeFailed.class), oVar, rVar.new o(null));
        zVar.x(q0.c(zo3.a.n.class), oVar, rVar.new p(null));
        zVar.L(new er.l() { // from class: zo3.m
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(r.Q9((b.Initialized) obj));
            }
        }, new er.l() { // from class: zo3.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.R9(this.f235968a, (k10.m) obj);
            }
        });
        zVar.x(q0.c(zo3.a.NavigateToDocumentDetail.class), oVar, rVar.new C6382r(null));
        zVar.v(q0.c(zo3.a.BottomSheetVisibilityChanged.class), oVar, new s(null));
        zVar.x(q0.c(zo3.a.d.class), oVar, rVar.new u(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Q9(zo3.b.Initialized initialized) {
        return initialized.getIsCameraPermissionGranted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(r rVar, k10.m mVar) {
        k10.k.m(mVar, (mu.g) rVar.scanCameraUseCase.a(new sx.b.Analyzer(sx.d.BACK, 0.0f, new sx.e.QrScanner(null, 1, null), 2, null)), null, rVar.new q(null), 2, null);
        return oq.i0.f148189a;
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: M9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(wn3.c cVar) {
        super.P5(cVar);
    }

    @Override // zx.b
    public xw.b<zo3.a.f> Y1() {
        return this.navAction;
    }

    @Override // zo3.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<zo3.b, zo3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<zo3.c.a> getState() {
        return this.state;
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }
}
