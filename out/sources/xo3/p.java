package xo3;

import android.graphics.Bitmap;
import android.os.SystemClock;
import androidx.p016lifecycle.u0;
import dn0.StartVerificationSession;
import dn0.VerificationResponse;
import fr.q0;
import go3.v0;
import iy.b0;
import java.security.KeyPair;
import ju.h2;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 o2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0002DBBa\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0082@¢\u0006\u0004\b#\u0010$J+\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\"2\u0006\u0010&\u001a\u00020%2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020'0\u001fH\u0002¢\u0006\u0004\b(\u0010)J<\u00104\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000203012\u0006\u0010*\u001a\u00020%2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0082@¢\u0006\u0004\b4\u00105J4\u00106\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000203012\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0082@¢\u0006\u0004\b6\u00107J\u0018\u0010:\u001a\u0002092\u0006\u00108\u001a\u000202H\u0082@¢\u0006\u0004\b:\u0010;J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<H\u0096\u0001¢\u0006\u0004\b>\u0010?J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020@0<H\u0096\u0001¢\u0006\u0004\bA\u0010?R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010[\u001a\u00020V8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR&\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\\8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R \u0010h\u001a\b\u0012\u0004\u0012\u00020c0b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR \u0010!\u001a\b\u0012\u0004\u0012\u00020j0i8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n¨\u0006p"}, d2 = {"Lxo3/p;", "Ll00/g;", "Lxo3/y;", "Lxo3/x;", "Lxo3/z;", "", "Lnx/b;", "Lyy/a;", "stateMachineFactory", "Lac4/a;", "callActionWithLoaderUseCase", "Lgo3/e;", "fetchQrCodeUseCase", "Lgo3/v0;", "verifyQrCodeExpirationUseCase", "Len0/b;", "fetchTransferredDataUC", "Lib4/c;", "genericDomainErrorMapper", "Lwz/a;", "barcodeGenerator", "Lmx/c;", "labelProvider", "Lyo3/a;", "qrScreenMapper", "Loz/q;", "ownerViewLifecycleManager", "Lez/g;", "ticker", "<init>", "(Lyy/a;Lac4/a;Lgo3/e;Lgo3/v0;Len0/b;Lib4/c;Lwz/a;Lmx/c;Lyo3/a;Loz/q;Lez/g;)V", "Lk10/c0;", "Lxo3/y$a;", "state", "Lk10/l;", "x9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Lgu/b;", "startTime", "Lxo3/y$b;", "F9", "(JLk10/c0;)Lk10/l;", "timeLeft", "", "sessionUuid", "Liy/b0;", "secret", "Ljava/security/KeyPair;", "keyPair", "Ldx/i;", "Ldx/b;", "Lxo3/p$c;", "H9", "(JLjava/lang/String;Liy/b0;Ljava/security/KeyPair;Ltq/e;)Ljava/lang/Object;", "w9", "(Ljava/lang/String;Liy/b0;Ljava/security/KeyPair;Ltq/e;)Ljava/lang/Object;", "domainError", "Loq/i0;", "y9", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "Lnx/a;", "x8", "b", "Lac4/a;", "c", "Lgo3/e;", "d", "Lgo3/v0;", "e", "Len0/b;", "f", "Lib4/c;", "g", "Lwz/a;", "h", "Lmx/c;", "j", "Lyo3/a;", "k", "Loz/q;", "l", "Lez/g;", "Loz/j;", "m", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lk10/t;", "n", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lxo3/x$d;", "p", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Lxo3/z$a;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "r", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<y, x> implements z, zx.d, nx.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f220301s = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final go3.e fetchQrCodeUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final v0 verifyQrCodeExpirationUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final en0.b fetchTransferredDataUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wz.a barcodeGenerator;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final yo3.a qrScreenMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ez.g ticker;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final k10.t<y, x> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final xw.b<x.d> navAction;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p0<z.a> state;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220316e;

        /* JADX INFO: renamed from: xo3.p$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnx/a;", "viewLifecycle", "Loq/i0;", "<anonymous>", "(Lnx/a;)V"}, k = 3, mv = {2, 2, 0})
        static final class C5883a extends vq.k implements er.p<nx.a, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f220318e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f220319f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ p f220320g;

            /* JADX INFO: renamed from: xo3.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C5884a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f220321a;

                static {
                    int[] iArr = new int[nx.a.values().length];
                    try {
                        iArr[nx.a.RESUMED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[nx.a.PAUSED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f220321a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5883a(p pVar, tq.e<? super C5883a> eVar) {
                super(2, eVar);
                this.f220320g = pVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                nx.a aVar = (nx.a) this.f220319f;
                uq.b.e();
                if (this.f220318e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                int i15 = C5884a.f220321a[aVar.ordinal()];
                if (i15 == 1) {
                    this.f220320g.d9(x.f.f220391a);
                } else if (i15 == 2) {
                    this.f220320g.d9(x.e.f220390a);
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(nx.a aVar, tq.e<? super i0> eVar) {
                return ((C5883a) v(aVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                C5883a c5883a = new C5883a(this.f220320g, eVar);
                c5883a.f220319f = obj;
                return c5883a;
            }
        }

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f220316e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.g gVarS = mu.i.S(p.this.x8(), new C5883a(p.this, null));
                this.f220316e = 1;
                if (mu.i.i(gVarS, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return p.this.new a(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lxo3/p$c;", "", "a", "b", "Lxo3/p$c$a;", "Lxo3/p$c$b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private interface c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lxo3/p$c$a;", "Lxo3/p$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f220322a = new a();

            private a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 560056833;
            }

            public String toString() {
                return "NoChange";
            }
        }

        /* JADX INFO: renamed from: xo3.p$c$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lxo3/p$c$b;", "Lxo3/p$c;", "Ldn0/d;", "verificationResponse", "<init>", "(Ldn0/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldn0/d;", "()Ldn0/d;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Success implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final VerificationResponse verificationResponse;

            public Success(VerificationResponse verificationResponse) {
                this.verificationResponse = verificationResponse;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final VerificationResponse getVerificationResponse() {
                return this.verificationResponse;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && fr.t.c(this.verificationResponse, ((Success) other).verificationResponse);
            }

            public int hashCode() {
                return this.verificationResponse.hashCode();
            }

            public String toString() {
                return "Success(verificationResponse=" + this.verificationResponse + ')';
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f220324d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f220325e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f220326f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f220327g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f220329j;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f220327g = obj;
            this.f220329j |= PKIFailureInfo.systemUnavail;
            return p.this.w9(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lxo3/y$b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.l<tq.e<? super k10.l<? extends y.Initialized>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f220330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f220331f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f220332g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f220333h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f220334j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        long f220335k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        long f220336l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        long f220337m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f220338n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ c0<y.a> f220340q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(c0<y.a> c0Var, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f220340q = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y.Initialized V(StartVerificationSession startVerificationSession, long j15, Bitmap bitmap, y.a aVar) {
            String qrCode = startVerificationSession.getQrCode();
            String sessionId = startVerificationSession.getSessionId();
            b0 b0VarG = iy.c0.g(startVerificationSession.getSecret());
            KeyPair keyPair = startVerificationSession.getKeyPair();
            String code = startVerificationSession.getCode();
            gu.b.Companion companion = gu.b.INSTANCE;
            return new y.Initialized(qrCode, sessionId, b0VarG, keyPair, j15, gu.d.r(SystemClock.elapsedRealtime(), gu.e.MILLISECONDS), j15, code, bitmap, true, null);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:27:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:30:0x0102  */
        /* JADX WARN: Code duplicated, block: B:32:0x0117  */
        /* JADX WARN: Code duplicated, block: B:34:0x011b  */
        /* JADX WARN: Code duplicated, block: B:36:0x0122  */
        /* JADX WARN: Code duplicated, block: B:38:0x0128  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objA;
            Object right;
            final long jR;
            Object objA2;
            c0<y.a> c0Var;
            final StartVerificationSession startVerificationSession;
            p pVar;
            c0<y.a> c0Var2;
            Object objE = uq.b.e();
            int i15 = this.f220338n;
            if (i15 == 0) {
                oq.u.b(obj);
                go3.e eVar = p.this.fetchQrCodeUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f220338n = 1;
                objA = eVar.a(c1792a, this);
                if (objA != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                oq.u.b(obj);
                objA = obj;
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j15 = this.f220337m;
                startVerificationSession = (StartVerificationSession) this.f220332g;
                c0Var = (c0) this.f220331f;
                oq.u.b(obj);
                jR = j15;
                objA2 = obj;
            }
            right = (dx.i) objA2;
            if (!(right instanceof dx.i.Left)) {
                if (right instanceof dx.i.Right) {
                    throw new oq.p();
                }
                final Bitmap bitmap = (Bitmap) ((dx.i.Right) right).b();
                right = new dx.i.Right(c0Var.d(new er.l() { // from class: xo3.q
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.e.V(startVerificationSession, jR, bitmap, (y.a) obj2);
                    }
                }));
            }
            pVar = p.this;
            c0Var2 = this.f220340q;
            if (right instanceof dx.i.Left) {
                pVar.d9(new x.Error((dx.b) ((dx.i.Left) right).b()));
                return c0Var2.c();
            }
            if (right instanceof dx.i.Right) {
                return ((dx.i.Right) right).b();
            }
            throw new oq.p();
            right = (dx.i) objA;
            p pVar2 = p.this;
            c0<y.a> c0Var3 = this.f220340q;
            if (!(right instanceof dx.i.Left)) {
                if (!(right instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                StartVerificationSession startVerificationSession2 = (StartVerificationSession) ((dx.i.Right) right).b();
                long j16 = Long.parseLong((String) fu.r.V0(startVerificationSession2.getQrCode(), new String[]{";"}, false, 0, 6, null).get(8));
                long j17 = Long.parseLong((String) fu.r.V0(startVerificationSession2.getQrCode(), new String[]{";"}, false, 0, 6, null).get(9));
                gu.b.Companion companion = gu.b.INSTANCE;
                jR = gu.d.r(j17 - j16, gu.e.SECONDS);
                wz.a aVar = pVar2.barcodeGenerator;
                wz.b.QrCode qrCode = new wz.b.QrCode(startVerificationSession2.getQrCode(), 296);
                this.f220330e = vq.j.a(right);
                this.f220331f = c0Var3;
                this.f220332g = startVerificationSession2;
                this.f220333h = 0;
                this.f220334j = 0;
                this.f220335k = j16;
                this.f220336l = j17;
                this.f220337m = jR;
                this.f220338n = 2;
                objA2 = aVar.a(qrCode, this);
                if (objA2 != objE) {
                    c0Var = c0Var3;
                    startVerificationSession = startVerificationSession2;
                    right = (dx.i) objA2;
                    if (!(right instanceof dx.i.Left)) {
                        if (right instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        final Bitmap bitmap2 = (Bitmap) ((dx.i.Right) right).b();
                        right = new dx.i.Right(c0Var.d(new er.l() { // from class: xo3.q
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return p.e.V(startVerificationSession, jR, bitmap2, (y.a) obj2);
                            }
                        }));
                    }
                }
                return objE;
            }
            pVar = p.this;
            c0Var2 = this.f220340q;
            if (right instanceof dx.i.Left) {
                pVar.d9(new x.Error((dx.b) ((dx.i.Left) right).b()));
                return c0Var2.c();
            }
            if (right instanceof dx.i.Right) {
                return ((dx.i.Right) right).b();
            }
            throw new oq.p();
        }

        public final tq.e<i0> N(tq.e<?> eVar) {
            return p.this.new e(this.f220340q, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super k10.l<y.Initialized>> eVar) {
            return ((e) N(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements mu.g<z.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f220341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f220342b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f220343a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f220344b;

            /* JADX INFO: renamed from: xo3.p$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5885a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f220345d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f220346e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f220347f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f220349h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f220350j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f220351k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f220352l;

                public C5885a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f220345d = obj;
                    this.f220346e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, p pVar) {
                this.f220343a = hVar;
                this.f220344b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5885a c5885a;
                if (eVar instanceof C5885a) {
                    c5885a = (C5885a) eVar;
                    int i15 = c5885a.f220346e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5885a.f220346e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5885a = new C5885a(eVar);
                    }
                } else {
                    c5885a = new C5885a(eVar);
                }
                Object obj2 = c5885a.f220345d;
                Object objE = uq.b.e();
                int i16 = c5885a.f220346e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f220343a;
                    z.a aVarB = this.f220344b.qrScreenMapper.b(new yo3.a.Params((y) obj, this.f220344b.b9(x.a.f220384a)));
                    c5885a.f220347f = vq.j.a(obj);
                    c5885a.f220349h = vq.j.a(c5885a);
                    c5885a.f220350j = vq.j.a(obj);
                    c5885a.f220351k = vq.j.a(hVar);
                    c5885a.f220352l = 0;
                    c5885a.f220346e = 1;
                    if (hVar.F(aVarB, c5885a) == objE) {
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

        public f(mu.g gVar, p pVar) {
            this.f220341a = gVar;
            this.f220342b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super z.a> hVar, tq.e eVar) {
            Object objA = this.f220341a.a(new a(hVar, this.f220342b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxo3/x$a;", "<unused var>", "Lxo3/y;", "Loq/i0;", "<anonymous>", "(Lxo3/x$a;Lxo3/y;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<x.a, y, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220353e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f220353e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<x.d> bVarY1 = p.this.Y1();
                x.d.a aVar = x.d.a.f220387a;
                this.f220353e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(x.a aVar, y yVar, tq.e<? super i0> eVar) {
            return p.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxo3/x$b;", "action", "Lxo3/y;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lxo3/x$b;Lxo3/y;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<x.Error, y, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220355e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f220356f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            x.Error error = (x.Error) this.f220356f;
            Object objE = uq.b.e();
            int i15 = this.f220355e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                dx.b domainError = error.getDomainError();
                this.f220356f = vq.j.a(error);
                this.f220355e = 1;
                if (pVar.y9(domainError, this) == objE) {
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
        public final Object w(x.Error error, y yVar, tq.e<? super i0> eVar) {
            h hVar = p.this.new h(eVar);
            hVar.f220356f = error;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lxo3/y$a;", "it", "Lk10/l;", "Lxo3/y;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<c0<y.a>, tq.e<? super k10.l<? extends y>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220358e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f220359f;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f220359f;
            Object objE = uq.b.e();
            int i15 = this.f220358e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            p pVar = p.this;
            this.f220359f = vq.j.a(c0Var);
            this.f220358e = 1;
            Object objX9 = pVar.x9(c0Var, this);
            return objX9 == objE ? objE : objX9;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<y.a> c0Var, tq.e<? super k10.l<? extends y>> eVar) {
            return ((i) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            i iVar = p.this.new i(eVar);
            iVar.f220359f = obj;
            return iVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxo3/x$g;", "<unused var>", "Lk10/c0;", "Lxo3/y$a;", "state", "Lk10/l;", "Lxo3/y;", "<anonymous>", "(Lxo3/x$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<x.g, c0<y.a>, tq.e<? super k10.l<? extends y>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220361e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f220362f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f220362f;
            Object objE = uq.b.e();
            int i15 = this.f220361e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            p pVar = p.this;
            this.f220362f = vq.j.a(c0Var);
            this.f220361e = 1;
            Object objX9 = pVar.x9(c0Var, this);
            return objX9 == objE ? objE : objX9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(x.g gVar, c0<y.a> c0Var, tq.e<? super k10.l<? extends y>> eVar) {
            j jVar = p.this.new j(eVar);
            jVar.f220362f = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lgu/b;", "<unused var>", "Lxo3/y$b;", "state", "Loq/i0;", "<anonymous>", "(Lgu/b;Lxo3/y$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<gu.b, y.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220364e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f220365f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k kVar;
            y.Initialized initialized = (y.Initialized) this.f220365f;
            Object objE = uq.b.e();
            int i15 = this.f220364e;
            if (i15 == 0) {
                oq.u.b(obj);
                p.this.d9(x.h.f220393a);
                if (initialized.getShouldPollingRun()) {
                    String sessionUuid = initialized.getSessionUuid();
                    b0 secret = initialized.getSecret();
                    KeyPair keyPair = initialized.getKeyPair();
                    long timeLeft = initialized.getTimeLeft();
                    p pVar = p.this;
                    this.f220365f = vq.j.a(initialized);
                    this.f220364e = 1;
                    kVar = this;
                    obj = pVar.H9(timeLeft, sessionUuid, secret, keyPair, kVar);
                    if (obj == objE) {
                        return objE;
                    }
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            kVar = this;
            dx.i iVar = (dx.i) obj;
            p pVar2 = p.this;
            if (iVar instanceof dx.i.Left) {
                dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                h2.f(getContext(), null, 1, null);
                pVar2.d9(new x.Error(bVar));
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                c cVar = (c) ((dx.i.Right) iVar).b();
                if (!fr.t.c(cVar, c.a.f220322a)) {
                    if (!(cVar instanceof c.Success)) {
                        throw new oq.p();
                    }
                    h2.f(getContext(), null, 1, null);
                    pVar2.d9(new x.GoToVerificationDetail(((c.Success) cVar).getVerificationResponse()));
                }
            }
            return i0.f148189a;
        }

        public final Object M(long j15, y.Initialized initialized, tq.e<? super i0> eVar) {
            k kVar = p.this.new k(eVar);
            kVar.f220365f = initialized;
            return kVar.J(i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(gu.b bVar, y.Initialized initialized, tq.e<? super i0> eVar) {
            return M(bVar.getRawValue(), initialized, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxo3/x$h;", "<unused var>", "Lk10/c0;", "Lxo3/y$b;", "state", "Lk10/l;", "Lxo3/y;", "<anonymous>", "(Lxo3/x$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<x.h, c0<y.Initialized>, tq.e<? super k10.l<? extends y>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220367e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f220368f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f220368f;
            uq.b.e();
            if (this.f220367e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return p.this.F9(((y.Initialized) c0Var.a()).getStartTime(), c0Var);
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(x.h hVar, c0<y.Initialized> c0Var, tq.e<? super k10.l<? extends y>> eVar) {
            l lVar = p.this.new l(eVar);
            lVar.f220368f = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxo3/x$e;", "<unused var>", "Lk10/c0;", "Lxo3/y$b;", "state", "Lk10/l;", "Lxo3/y;", "<anonymous>", "(Lxo3/x$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<x.e, c0<y.Initialized>, tq.e<? super k10.l<? extends y>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220370e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f220371f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y.Initialized O(y.Initialized initialized) {
            return y.Initialized.b(initialized, null, null, null, null, 0L, 0L, 0L, null, null, false, 511, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f220371f;
            uq.b.e();
            if (this.f220370e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: xo3.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.m.O((y.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(x.e eVar, c0<y.Initialized> c0Var, tq.e<? super k10.l<? extends y>> eVar2) {
            m mVar = new m(eVar2);
            mVar.f220371f = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxo3/x$c;", "action", "Lxo3/y$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lxo3/x$c;Lxo3/y$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<x.GoToVerificationDetail, y.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220372e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f220373f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            x.GoToVerificationDetail goToVerificationDetail = (x.GoToVerificationDetail) this.f220373f;
            Object objE = uq.b.e();
            int i15 = this.f220372e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<x.d> bVarY1 = p.this.Y1();
                x.d.GoToVerificationDetail goToVerificationDetail2 = new x.d.GoToVerificationDetail(goToVerificationDetail.getResponse());
                this.f220373f = vq.j.a(goToVerificationDetail);
                this.f220372e = 1;
                if (bVarY1.F(goToVerificationDetail2, this) == objE) {
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
        public final Object w(x.GoToVerificationDetail goToVerificationDetail, y.Initialized initialized, tq.e<? super i0> eVar) {
            n nVar = p.this.new n(eVar);
            nVar.f220373f = goToVerificationDetail;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxo3/x$g;", "<unused var>", "Lk10/c0;", "Lxo3/y$b;", "state", "Lk10/l;", "Lxo3/y;", "<anonymous>", "(Lxo3/x$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<x.g, c0<y.Initialized>, tq.e<? super k10.l<? extends y>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220375e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f220376f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y.a O(y.Initialized initialized) {
            return y.a.f220394a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f220376f;
            uq.b.e();
            if (this.f220375e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: xo3.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.o.O((y.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(x.g gVar, c0<y.Initialized> c0Var, tq.e<? super k10.l<? extends y>> eVar) {
            o oVar = new o(eVar);
            oVar.f220376f = c0Var;
            return oVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: xo3.p$p, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxo3/x$f;", "<unused var>", "Lk10/c0;", "Lxo3/y$b;", "state", "Lk10/l;", "Lxo3/y;", "<anonymous>", "(Lxo3/x$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class C5886p extends vq.k implements er.q<x.f, c0<y.Initialized>, tq.e<? super k10.l<? extends y>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220377e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f220378f;

        C5886p(tq.e<? super C5886p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y.Initialized O(y.Initialized initialized) {
            return y.Initialized.b(initialized, null, null, null, null, 0L, 0L, 0L, null, null, true, 511, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f220378f;
            uq.b.e();
            if (this.f220377e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: xo3.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.C5886p.O((y.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(x.f fVar, c0<y.Initialized> c0Var, tq.e<? super k10.l<? extends y>> eVar) {
            C5886p c5886p = new C5886p(eVar);
            c5886p.f220378f = c0Var;
            return c5886p.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, ac4.a aVar2, go3.e eVar, v0 v0Var, en0.b bVar, ib4.c cVar, wz.a aVar3, mx.c cVar2, yo3.a aVar4, oz.q qVar, ez.g gVar) {
        this.callActionWithLoaderUseCase = aVar2;
        this.fetchQrCodeUseCase = eVar;
        this.verifyQrCodeExpirationUseCase = v0Var;
        this.fetchTransferredDataUC = bVar;
        this.genericDomainErrorMapper = cVar;
        this.barcodeGenerator = aVar3;
        this.labelProvider = cVar2;
        this.qrScreenMapper = aVar4;
        this.ownerViewLifecycleManager = qVar;
        this.ticker = gVar;
        this.lifecycleConnector = qVar;
        ju.k.d(u0.a(this), null, null, new a(null), 3, null);
        this.stateMachine = aVar.a(y.a.f220394a, new er.l() { // from class: xo3.j
            @Override // er.l
            public final Object b(Object obj) {
                return p.B9(this.f220293a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new f(e9().getState(), this), z.a.C5887a.f220405a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(y.class), new er.l() { // from class: xo3.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.C9(this.f220294a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(y.a.class), new er.l() { // from class: xo3.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.D9(this.f220295a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(y.Initialized.class), new er.l() { // from class: xo3.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.E9(this.f220296a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(p pVar, k10.z zVar) {
        g gVar = pVar.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(x.a.class), oVar, gVar);
        zVar.x(q0.c(x.Error.class), oVar, pVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(p pVar, k10.z zVar) {
        zVar.A(pVar.new i(null));
        j jVar = pVar.new j(null);
        zVar.v(q0.c(x.g.class), k10.o.CANCEL_PREVIOUS, jVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(p pVar, k10.z zVar) {
        k10.k.s(zVar, ez.g.b(pVar.ticker, 0L, 1, null), null, pVar.new k(null), 2, null);
        l lVar = pVar.new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(x.h.class), oVar, lVar);
        zVar.v(q0.c(x.e.class), oVar, new m(null));
        zVar.x(q0.c(x.GoToVerificationDetail.class), oVar, pVar.new n(null));
        zVar.v(q0.c(x.g.class), oVar, new o(null));
        zVar.v(q0.c(x.f.class), oVar, new C5886p(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<y.Initialized> F9(long startTime, c0<y.Initialized> state) {
        gu.b.Companion companion = gu.b.INSTANCE;
        final long jD = gu.b.v(startTime, companion.d()) ? companion.d() : ((gu.b) lr.m.g(gu.b.o(gu.b.W(gu.b.U(startTime, gu.d.r(SystemClock.elapsedRealtime(), gu.e.MILLISECONDS)), state.a().getMaxTime())), gu.b.o(companion.d()))).getRawValue();
        return state.b(new er.l() { // from class: xo3.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.G9(jD, (y.Initialized) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y.Initialized G9(long j15, y.Initialized initialized) {
        return y.Initialized.b(initialized, null, null, null, null, j15, 0L, 0L, null, null, false, 1007, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object H9(long j15, String str, b0 b0Var, KeyPair keyPair, tq.e<? super dx.i<? extends dx.b, ? extends c>> eVar) {
        dx.i<dx.b, i0> iVarB = this.verifyQrCodeExpirationUseCase.b(new v0.Params(0L, gu.b.A(j15), true));
        if (iVarB instanceof dx.i.Left) {
            return new dx.i.Left((dx.b) ((dx.i.Left) iVarB).b());
        }
        if (!(iVarB instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return gu.b.F(j15) % ((long) 2) == 0 ? w9(str, b0Var, keyPair, eVar) : new dx.i.Right(c.a.f220322a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w9(String str, b0 b0Var, KeyPair keyPair, tq.e<? super dx.i<? extends dx.b, ? extends c>> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f220329j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f220329j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objC = dVar.f220327g;
        Object objE = uq.b.e();
        int i16 = dVar.f220329j;
        if (i16 == 0) {
            oq.u.b(objC);
            en0.b bVar = this.fetchTransferredDataUC;
            en0.b.Params params = new en0.b.Params(str, b0Var, keyPair);
            dVar.f220324d = vq.j.a(str);
            dVar.f220325e = vq.j.a(b0Var);
            dVar.f220326f = vq.j.a(keyPair);
            dVar.f220329j = 1;
            objC = bVar.c(params, dVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
            return bVar2 instanceof dx.b.g.c ? new dx.i.Right(c.a.f220322a) : new dx.i.Left(bVar2);
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(new c.Success((VerificationResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object x9(c0<y.a> c0Var, tq.e<? super k10.l<? extends y>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new e(c0Var, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y9(dx.b bVar, tq.e<? super i0> eVar) {
        final dx.b business;
        if (bVar instanceof dx.b.Generic) {
            business = new dx.b.Business(null, null, this.labelProvider.c(un3.b.f199483s1), this.labelProvider.c(un3.b.f199483s1), null, this.labelProvider.c(un3.b.f199406d), null, 83, null);
        } else {
            business = bVar;
        }
        Object objF = Y1().F(new x.d.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(business, false, new er.l() { // from class: xo3.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.z9(this.f220297a, business, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(p pVar, dx.b bVar, ib4.c.b bVar2) {
        if ((bVar2 instanceof ib4.c.b.a.Close) || fr.t.c(bVar2, ib4.c.b.AbstractC2161b.a.f90859a)) {
            pVar.d9(x.a.f220384a);
        } else if (fr.t.c(bVar2, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            pVar.d9(x.g.f220392a);
        } else if (bVar2 instanceof ib4.c.b.a.Primary) {
            if ((bVar instanceof dx.b.Business) && ((dx.b.Business) bVar).getType() == co3.a.GENERATED_EXPIRED_QR) {
                pVar.d9(x.g.f220392a);
            } else {
                pVar.d9(x.a.f220384a);
            }
        } else {
            if (!(bVar2 instanceof ib4.c.b.a.Secondary)) {
                throw new oq.p();
            }
            pVar.d9(x.a.f220384a);
        }
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    public xw.b<x.d> Y1() {
        return this.navAction;
    }

    @Override // xo3.z
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<y, x> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<z.a> getState() {
        return this.state;
    }

    @Override // nx.b
    public mu.g<nx.a> x8() {
        return this.ownerViewLifecycleManager.x8();
    }
}
