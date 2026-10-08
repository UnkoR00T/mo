package wb4;

import er.p;
import iy.f0;
import iy.q;
import iy.s;
import iy.t;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import mx.Label;
import oq.i0;
import oq.r;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.n;
import pq.v;
import py.KeyStoreKeySpec;
import py.o;
import vq.j;
import vq.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010 \u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b \u0010!J,\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u001a0%2\u0006\u0010\u0019\u001a\u00020\"2\u0006\u0010$\u001a\u00020#H\u0082@¢\u0006\u0004\b'\u0010(J#\u0010,\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0006\u0010\u0019\u001a\u00020\u001fH\u0002¢\u0006\u0004\b,\u0010-J\u001d\u0010/\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0006\u0012\u0004\u0018\u00010.0%H\u0002¢\u0006\u0004\b/\u00100J\u001c\u00101\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020.0%H\u0082@¢\u0006\u0004\b1\u00102J\u0013\u00105\u001a\u000204*\u000203H\u0002¢\u0006\u0004\b5\u00106J\u0018\u00109\u001a\u0002082\u0006\u00107\u001a\u00020&H\u0082@¢\u0006\u0004\b9\u0010:J\u0018\u0010;\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\"H\u0096B¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010MR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010N¨\u0006O"}, d2 = {"Lwb4/b;", "Lqb4/b;", "Liy/t;", "keyStoreProvider", "Lpy/i;", "keyStoreAesKeyGenerator", "Liy/s;", "keyInspector", "Liy/g;", "cipherAes", "Lmx/c;", "labelProvider", "Lax/e;", "biometricManager", "Lqb4/e;", "deactivateBiometricUseCase", "Lqb4/c;", "checkBiometricRequirementsUseCase", "Ljx/h;", "systemInfoUpdater", "Lpx/d;", "remoteLogger", "<init>", "(Liy/t;Lpy/i;Liy/s;Liy/g;Lmx/c;Lax/e;Lqb4/e;Lqb4/c;Ljx/h;Lpx/d;)V", "Lqb4/b$b$b;", "params", "Ljavax/crypto/Cipher;", "initializedCipher", "Lpb4/a;", "j", "(Lqb4/b$b$b;Ljavax/crypto/Cipher;Ltq/e;)Ljava/lang/Object;", "Lqb4/b$b$a;", "i", "(Lqb4/b$b$a;Ljavax/crypto/Cipher;Ltq/e;)Ljava/lang/Object;", "Lqb4/b$b;", "", "allowDeactivation", "Ldx/i;", "Ldx/b;", "n", "(Lqb4/b$b;ZLtq/e;)Ljava/lang/Object;", "Loq/r;", "", "", "k", "(Lqb4/b$b$a;)Loq/r;", "Ljavax/crypto/SecretKey;", "p", "()Ldx/i;", "l", "(Ltq/e;)Ljava/lang/Object;", "Lqb4/b$a;", "Lmx/a;", "m", "(Lqb4/b$a;)Lmx/a;", "domainError", "Lpb4/a$c;", "q", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "o", "(Lqb4/b$b;Ltq/e;)Ljava/lang/Object;", "a", "Liy/t;", "b", "Lpy/i;", "c", "Liy/s;", "d", "Liy/g;", "e", "Lmx/c;", "f", "Lax/e;", "g", "Lqb4/e;", "h", "Lqb4/c;", "Ljx/h;", "Lpx/d;", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements qb4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t keyStoreProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final py.i keyStoreAesKeyGenerator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s keyInspector;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iy.g cipherAes;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ax.e biometricManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final qb4.e deactivateBiometricUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final qb4.c checkBiometricRequirementsUseCase;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final jx.h systemInfoUpdater;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f211900a;

        static {
            int[] iArr = new int[qb4.b.a.values().length];
            try {
                iArr[qb4.b.a.LOGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qb4.b.a.CHECK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f211900a = iArr;
        }
    }

    /* JADX INFO: renamed from: wb4.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5586b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f211901d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f211902e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f211903f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f211904g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f211905h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f211906j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f211907k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f211908l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f211909m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f211911p;

        C5586b(tq.e<? super C5586b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f211909m = obj;
            this.f211911p |= PKIFailureInfo.systemUnavail;
            return b.this.i(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f211912d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f211913e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f211914f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f211915g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f211916h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f211917j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f211918k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f211920m;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f211918k = obj;
            this.f211920m |= PKIFailureInfo.systemUnavail;
            return b.this.j(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f211921d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f211922e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f211923f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f211924g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f211925h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f211927k;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f211925h = obj;
            this.f211927k |= PKIFailureInfo.systemUnavail;
            return b.this.l(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f211928d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f211929e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f211930f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f211931g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f211932h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f211933j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f211934k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f211935l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f211936m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f211937n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f211938p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f211939q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f211940r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f211941s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f211942t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f211943v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f211944w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f211946y;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f211944w = obj;
            this.f211946y |= PKIFailureInfo.systemUnavail;
            return b.this.n(null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f211947d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f211948e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f211949f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f211950g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f211951h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f211952j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f211953k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f211954l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f211955m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f211956n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f211957p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f211958q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f211959r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f211961t;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f211959r = obj;
            this.f211961t |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "failedAttempts", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends k implements p<Integer, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f211962e;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Object B(Integer num, tq.e<? super Boolean> eVar) {
            return M(num.intValue(), eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f211962e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return vq.b.a(true);
        }

        public final Object M(int i15, tq.e<? super Boolean> eVar) {
            return ((g) v(Integer.valueOf(i15), eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new g(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f211963d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f211964e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f211965f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f211966g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f211968j;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f211966g = obj;
            this.f211968j |= PKIFailureInfo.systemUnavail;
            return b.this.q(null, this);
        }
    }

    public b(t tVar, py.i iVar, s sVar, iy.g gVar, mx.c cVar, ax.e eVar, qb4.e eVar2, qb4.c cVar2, jx.h hVar, px.d dVar) {
        this.keyStoreProvider = tVar;
        this.keyStoreAesKeyGenerator = iVar;
        this.keyInspector = sVar;
        this.cipherAes = gVar;
        this.labelProvider = cVar;
        this.biometricManager = eVar;
        this.deactivateBiometricUseCase = eVar2;
        this.checkBiometricRequirementsUseCase = cVar2;
        this.systemInfoUpdater = hVar;
        this.remoteLogger = dVar;
        gVar.b(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0131, code lost:
    
        if (r2 == r4) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(qb4.b.AbstractC4144b.Decrypt r17, javax.crypto.Cipher r18, tq.e<? super pb4.a> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wb4.b.i(qb4.b$b$a, javax.crypto.Cipher, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cf, code lost:
    
        if (r14 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(qb4.b.AbstractC4144b.Encrypt r12, javax.crypto.Cipher r13, tq.e<? super pb4.a> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wb4.b.j(qb4.b$b$b, javax.crypto.Cipher, tq.e):java.lang.Object");
    }

    private final r<Integer, byte[]> k(qb4.b.AbstractC4144b.Decrypt params) {
        px.d dVar = this.remoteLogger;
        px.d.a aVar = px.d.a.GENERAL;
        dVar.F8("Biometric IV extracting...", aVar);
        byte b15 = params.getData().getData()[0];
        byte[] bArrT = n.t(params.getData().getData(), 1, params.getData().getData().length);
        this.remoteLogger.F8("Biometric IV extracted", aVar);
        return new r<>(Integer.valueOf(b15), bArrT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object l(tq.e<? super dx.i<? extends dx.b, ? extends SecretKey>> eVar) throws Throwable {
        d dVar;
        dx.i iVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f211927k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f211927k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objA = dVar.f211925h;
        Object objE = uq.b.e();
        int i16 = dVar.f211927k;
        if (i16 != 0) {
            if (i16 == 1) {
                u.b(objA);
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iVar = (dx.i) dVar.f211921d;
                u.b(objA);
            }
            this.remoteLogger.F8("Biometric key generated", px.d.a.GENERAL);
            return iVar;
        }
        u.b(objA);
        py.i iVar2 = this.keyStoreAesKeyGenerator;
        KeyStoreKeySpec keyStoreKeySpec = new KeyStoreKeySpec("BiometricKey", new iy.h.a.b(0, new iy.r.a(0, 1, null), 0, 1, null), 0, py.g.STRONG_BIOMETRIC, v.e(py.h.ENCRYPT_AND_DECRYPT), o.PREFERRED, false, null, 132, null);
        dVar.f211927k = 1;
        objA = iVar2.a(keyStoreKeySpec, dVar);
        if (objA != objE) {
        }
        return objE;
        dx.i iVar3 = (dx.i) objA;
        if (iVar3 instanceof dx.i.Left) {
            this.remoteLogger.F8("Biometric key generate failed", px.d.a.ERROR);
        }
        if (!(iVar3 instanceof dx.i.Right)) {
            return iVar3;
        }
        SecretKey secretKey = (SecretKey) ((dx.i.Right) iVar3).b();
        s sVar = this.keyInspector;
        dVar.f211921d = iVar3;
        dVar.f211922e = j.a(secretKey);
        dVar.f211923f = 0;
        dVar.f211924g = 0;
        dVar.f211927k = 2;
        if (sVar.d(secretKey, true, dVar) != objE) {
            iVar = iVar3;
            this.remoteLogger.F8("Biometric key generated", px.d.a.GENERAL);
            return iVar;
        }
        return objE;
    }

    private final Label m(qb4.b.a aVar) {
        int i15;
        mx.c cVar = this.labelProvider;
        int i16 = a.f211900a[aVar.ordinal()];
        if (i16 == 1) {
            i15 = ob4.a.f144505d;
        } else {
            if (i16 != 2) {
                throw new oq.p();
            }
            i15 = ob4.a.f144504c;
        }
        return cVar.c(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:105:0x039d  */
    /* JADX WARN: Code duplicated, block: B:108:0x03a5 A[Catch: Exception -> 0x0394, c -> 0x0397, CancellationException -> 0x039a, TryCatch #13 {c -> 0x0397, CancellationException -> 0x039a, Exception -> 0x0394, blocks: (B:87:0x0341, B:83:0x02e2, B:106:0x03a1, B:108:0x03a5, B:110:0x03b0, B:111:0x03f2, B:119:0x0408, B:136:0x044a, B:137:0x044f), top: B:165:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x03f2 A[Catch: Exception -> 0x0394, c -> 0x0397, CancellationException -> 0x039a, TryCatch #13 {c -> 0x0397, CancellationException -> 0x039a, Exception -> 0x0394, blocks: (B:87:0x0341, B:83:0x02e2, B:106:0x03a1, B:108:0x03a5, B:110:0x03b0, B:111:0x03f2, B:119:0x0408, B:136:0x044a, B:137:0x044f), top: B:165:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0408 A[Catch: Exception -> 0x0394, c -> 0x0397, CancellationException -> 0x039a, TRY_LEAVE, TryCatch #13 {c -> 0x0397, CancellationException -> 0x039a, Exception -> 0x0394, blocks: (B:87:0x0341, B:83:0x02e2, B:106:0x03a1, B:108:0x03a5, B:110:0x03b0, B:111:0x03f2, B:119:0x0408, B:136:0x044a, B:137:0x044f), top: B:165:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0414 A[Catch: Exception -> 0x038b, c -> 0x038e, CancellationException -> 0x0391, TryCatch #2 {Exception -> 0x038b, blocks: (B:91:0x0386, B:123:0x0410, B:125:0x0414, B:127:0x0420, B:129:0x042b, B:130:0x042d, B:133:0x0438, B:131:0x0434, B:134:0x0444, B:135:0x0449, B:147:0x0463, B:150:0x0471, B:145:0x045d, B:146:0x0462), top: B:165:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0420 A[Catch: Exception -> 0x038b, c -> 0x038e, CancellationException -> 0x0391, TryCatch #2 {Exception -> 0x038b, blocks: (B:91:0x0386, B:123:0x0410, B:125:0x0414, B:127:0x0420, B:129:0x042b, B:130:0x042d, B:133:0x0438, B:131:0x0434, B:134:0x0444, B:135:0x0449, B:147:0x0463, B:150:0x0471, B:145:0x045d, B:146:0x0462), top: B:165:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0434 A[Catch: Exception -> 0x038b, c -> 0x038e, CancellationException -> 0x0391, TryCatch #2 {Exception -> 0x038b, blocks: (B:91:0x0386, B:123:0x0410, B:125:0x0414, B:127:0x0420, B:129:0x042b, B:130:0x042d, B:133:0x0438, B:131:0x0434, B:134:0x0444, B:135:0x0449, B:147:0x0463, B:150:0x0471, B:145:0x045d, B:146:0x0462), top: B:165:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0444 A[Catch: Exception -> 0x038b, c -> 0x038e, CancellationException -> 0x0391, TryCatch #2 {Exception -> 0x038b, blocks: (B:91:0x0386, B:123:0x0410, B:125:0x0414, B:127:0x0420, B:129:0x042b, B:130:0x042d, B:133:0x0438, B:131:0x0434, B:134:0x0444, B:135:0x0449, B:147:0x0463, B:150:0x0471, B:145:0x045d, B:146:0x0462), top: B:165:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x044a A[Catch: Exception -> 0x0394, c -> 0x0397, CancellationException -> 0x039a, TRY_ENTER, TryCatch #13 {c -> 0x0397, CancellationException -> 0x039a, Exception -> 0x0394, blocks: (B:87:0x0341, B:83:0x02e2, B:106:0x03a1, B:108:0x03a5, B:110:0x03b0, B:111:0x03f2, B:119:0x0408, B:136:0x044a, B:137:0x044f), top: B:165:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x045c  */
    /* JADX WARN: Code duplicated, block: B:153:0x047a  */
    /* JADX WARN: Code duplicated, block: B:156:0x048b  */
    /* JADX WARN: Code duplicated, block: B:157:0x0499  */
    /* JADX WARN: Code duplicated, block: B:159:0x049d  */
    /* JADX WARN: Code duplicated, block: B:162:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x01cc A[Catch: Exception -> 0x005b, c -> 0x005f, CancellationException -> 0x0063, TryCatch #10 {c -> 0x005f, CancellationException -> 0x0063, Exception -> 0x005b, blocks: (B:16:0x0055, B:49:0x0134, B:69:0x026b, B:61:0x01b4, B:63:0x01c8, B:65:0x01cc, B:70:0x0270, B:72:0x0276, B:55:0x0172, B:57:0x0183), top: B:165:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0268  */
    /* JADX WARN: Code duplicated, block: B:68:0x026a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0270 A[Catch: Exception -> 0x005b, c -> 0x005f, CancellationException -> 0x0063, TryCatch #10 {c -> 0x005f, CancellationException -> 0x0063, Exception -> 0x005b, blocks: (B:16:0x0055, B:49:0x0134, B:69:0x026b, B:61:0x01b4, B:63:0x01c8, B:65:0x01cc, B:70:0x0270, B:72:0x0276, B:55:0x0172, B:57:0x0183), top: B:165:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0276 A[Catch: Exception -> 0x005b, c -> 0x005f, CancellationException -> 0x0063, TRY_LEAVE, TryCatch #10 {c -> 0x005f, CancellationException -> 0x0063, Exception -> 0x005b, blocks: (B:16:0x0055, B:49:0x0134, B:69:0x026b, B:61:0x01b4, B:63:0x01c8, B:65:0x01cc, B:70:0x0270, B:72:0x0276, B:55:0x0172, B:57:0x0183), top: B:165:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:77:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x02d1 A[Catch: Exception -> 0x03f9, c -> 0x03fe, CancellationException -> 0x0403, TRY_LEAVE, TryCatch #11 {c -> 0x03fe, CancellationException -> 0x0403, Exception -> 0x03f9, blocks: (B:78:0x02cb, B:80:0x02d1), top: B:171:0x02cb }] */
    /* JADX WARN: Code duplicated, block: B:82:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:85:0x0331  */
    /* JADX WARN: Code duplicated, block: B:86:0x0332  */
    /* JADX WARN: Code duplicated, block: B:90:0x0384  */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x01cc, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    public final Object n(qb4.b.AbstractC4144b abstractC4144b, boolean z15, tq.e<? super dx.i<? extends dx.b, ? extends Cipher>> eVar) throws Throwable {
        e eVar2;
        String message;
        dx.i iVarA;
        Object objB;
        int i15;
        int i16;
        ex.b aVar;
        ex.b bVar;
        ex.b bVar2;
        int i17;
        dx.j<dx.b> jVar;
        int i18;
        qb4.b.AbstractC4144b abstractC4144b2;
        int i19;
        boolean z16;
        ex.b bVar3;
        ex.b bVar4;
        int i25;
        SecretKey secretKey;
        int i26;
        ex.b bVar5;
        boolean z17;
        int i27;
        int i28;
        qb4.b.AbstractC4144b abstractC4144b3;
        ex.b bVar6;
        int i29;
        SecretKey secretKey2;
        b bVar7;
        int i35;
        int i36;
        dx.i iVar;
        ?? r15;
        dx.b bVar8;
        boolean z18;
        int i37;
        ex.b bVar9;
        int i38;
        int i39;
        ex.b bVar10;
        ?? r16;
        dx.i left;
        ?? r17;
        ?? r18;
        dx.b bVar11;
        ex.b bVar12;
        ex.b bVar13;
        qb4.e eVar3;
        gz.b.a.C1792a c1792a;
        Object obj;
        SecretKey secretKey3;
        ex.b bVar14;
        Object objI;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i45 = eVar2.f211946y;
            if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f211946y = i45 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objN = eVar2.f211944w;
        Object objE = uq.b.e();
        ?? r19 = eVar2.f211946y;
        try {
            try {
                try {
                    try {
                        try {
                            if (r19 == 0) {
                                u.b(objN);
                                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                                aVar = new ex.a();
                                secretKey3 = (SecretKey) aVar.a(p());
                                if (secretKey3 == null) {
                                    abstractC4144b2 = abstractC4144b;
                                    eVar2.f211928d = abstractC4144b2;
                                    eVar2.f211929e = jVarA;
                                    eVar2.f211930f = j.a(aVar);
                                    eVar2.f211931g = aVar;
                                    eVar2.f211932h = aVar;
                                    z16 = z15;
                                    eVar2.f211936m = z16;
                                    eVar2.f211937n = 0;
                                    eVar2.f211938p = 0;
                                    eVar2.f211939q = 0;
                                    eVar2.f211940r = 0;
                                    eVar2.f211941s = 0;
                                    eVar2.f211946y = 1;
                                    objN = l(eVar2);
                                    if (objN != objE) {
                                        bVar = aVar;
                                        bVar2 = bVar;
                                        i19 = 0;
                                        i15 = 0;
                                        i16 = 0;
                                        i18 = 0;
                                        i17 = 0;
                                        jVar = jVarA;
                                    }
                                    return objE;
                                }
                                abstractC4144b2 = abstractC4144b;
                                z16 = z15;
                                bVar2 = aVar;
                                i19 = 0;
                                i15 = 0;
                                i16 = 0;
                                i18 = 0;
                                i17 = 0;
                                r19 = jVarA;
                                if (abstractC4144b2 instanceof qb4.b.AbstractC4144b.Decrypt) {
                                    r<Integer, byte[]> rVarK = k((qb4.b.AbstractC4144b.Decrypt) abstractC4144b2);
                                    int iIntValue = rVarK.a().intValue();
                                    byte[] bArrB = rVarK.b();
                                    ex.b bVar15 = bVar2;
                                    qb4.b.AbstractC4144b abstractC4144b4 = abstractC4144b2;
                                    px.f.f163100a.b("Biometric decrypt (init cipher):\nivSize: " + iIntValue + "\niv + data + gcmtag:\n" + Arrays.toString(bArrB), px.c.a(aVar));
                                    iy.g gVar = this.cipherAes;
                                    iy.h.a.b bVar16 = new iy.h.a.b(0, new iy.r.c(iIntValue, q.Prefix), 0, 1, null);
                                    eVar2.f211928d = j.a(abstractC4144b4);
                                    eVar2.f211929e = r19;
                                    eVar2.f211930f = j.a(bVar15);
                                    eVar2.f211931g = j.a(aVar);
                                    eVar2.f211932h = aVar;
                                    eVar2.f211933j = j.a(secretKey3);
                                    eVar2.f211934k = j.a(bArrB);
                                    eVar2.f211936m = z16;
                                    eVar2.f211937n = i16;
                                    eVar2.f211938p = i15;
                                    eVar2.f211939q = i19;
                                    eVar2.f211940r = i18;
                                    eVar2.f211941s = i17;
                                    eVar2.f211942t = iIntValue;
                                    eVar2.f211946y = 2;
                                    objN = gVar.e(bArrB, secretKey3, bVar16, eVar2);
                                    if (objN == objE) {
                                        objE = objE;
                                        bVar3 = aVar;
                                        left = (dx.i) objN;
                                        if (left instanceof dx.i.Left) {
                                            obj = (dx.b) ((dx.i.Left) left).b();
                                            if (obj instanceof dx.b.Generic) {
                                                obj = dx.b.j.c.f45087a;
                                            }
                                            left = new dx.i.Left(obj);
                                        } else if (!(left instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        return new dx.i.Right((Cipher) bVar3.a(left));
                                    }
                                    objE = objE;
                                } else {
                                    bVar14 = bVar2;
                                    if (abstractC4144b2 instanceof qb4.b.AbstractC4144b.Encrypt) {
                                        throw new oq.p();
                                    }
                                    iy.g gVar2 = this.cipherAes;
                                    try {
                                        iy.h.a.b bVar17 = new iy.h.a.b(0, new iy.r.c(12, q.Prefix), 0, 1, null);
                                        eVar2.f211928d = abstractC4144b2;
                                        eVar2.f211929e = r19;
                                        eVar2.f211930f = j.a(bVar14);
                                        eVar2.f211931g = aVar;
                                        eVar2.f211932h = aVar;
                                        eVar2.f211933j = j.a(secretKey3);
                                        eVar2.f211936m = z16;
                                        eVar2.f211937n = i16;
                                        eVar2.f211938p = i15;
                                        eVar2.f211939q = i19;
                                        eVar2.f211940r = i18;
                                        eVar2.f211941s = i17;
                                        eVar2.f211946y = 3;
                                        objI = gVar2.i(secretKey3, bVar17, eVar2);
                                        if (objI == objE) {
                                            bVar4 = bVar14;
                                            z17 = z16;
                                            i25 = i18;
                                            i26 = i15;
                                            i27 = i19;
                                            i28 = i17;
                                            r18 = r19;
                                            abstractC4144b3 = abstractC4144b2;
                                            secretKey = secretKey3;
                                            objN = objI;
                                            bVar5 = aVar;
                                            left = (dx.i) objN;
                                            if (left instanceof dx.i.Left) {
                                                bVar11 = (dx.b) ((dx.i.Left) left).b();
                                                if (z17) {
                                                    secretKey2 = secretKey;
                                                    bVar12 = aVar;
                                                    bVar7 = this;
                                                    bVar13 = bVar4;
                                                    bVar8 = bVar11;
                                                    bVar7.remoteLogger.F8("Biometric key migration (deactivation)", px.d.a.GENERAL);
                                                    eVar3 = bVar7.deactivateBiometricUseCase;
                                                    c1792a = gz.b.a.C1792a.f78542a;
                                                    eVar2.f211928d = abstractC4144b3;
                                                    eVar2.f211929e = r18;
                                                    eVar2.f211930f = j.a(bVar13);
                                                    eVar2.f211931g = j.a(bVar12);
                                                    eVar2.f211932h = bVar5;
                                                    eVar2.f211933j = j.a(secretKey2);
                                                    eVar2.f211934k = j.a(left);
                                                    eVar2.f211935l = j.a(bVar8);
                                                    eVar2.f211936m = z17;
                                                    eVar2.f211937n = i16;
                                                    eVar2.f211938p = i26;
                                                    eVar2.f211939q = i27;
                                                    eVar2.f211940r = i25;
                                                    eVar2.f211941s = i28;
                                                    eVar2.f211942t = 0;
                                                    eVar2.f211943v = 0;
                                                    eVar2.f211946y = 4;
                                                    if (eVar3.c(c1792a, eVar2) != objE) {
                                                        z18 = z17;
                                                        bVar6 = bVar13;
                                                        i29 = 0;
                                                        iVar = left;
                                                        i37 = i16;
                                                        i35 = i25;
                                                        i36 = 0;
                                                        i38 = i26;
                                                        i39 = i27;
                                                        bVar9 = bVar12;
                                                        r15 = r18;
                                                        int i46 = i28;
                                                        eVar2.f211928d = j.a(abstractC4144b3);
                                                        eVar2.f211929e = r15;
                                                        eVar2.f211930f = j.a(bVar6);
                                                        eVar2.f211931g = j.a(bVar9);
                                                        eVar2.f211932h = bVar5;
                                                        eVar2.f211933j = j.a(secretKey2);
                                                        eVar2.f211934k = j.a(iVar);
                                                        eVar2.f211935l = j.a(bVar8);
                                                        eVar2.f211936m = z18;
                                                        eVar2.f211937n = i37;
                                                        eVar2.f211938p = i38;
                                                        eVar2.f211939q = i39;
                                                        eVar2.f211940r = i35;
                                                        eVar2.f211941s = i46;
                                                        eVar2.f211942t = i36;
                                                        eVar2.f211943v = i29;
                                                        eVar2.f211946y = 5;
                                                        objN = bVar7.n(abstractC4144b3, false, eVar2);
                                                        if (objN != objE) {
                                                            bVar10 = bVar5;
                                                            r17 = r15;
                                                            left = (dx.i) objN;
                                                            bVar5 = bVar10;
                                                            r16 = r17;
                                                        }
                                                    }
                                                } else {
                                                    ex.b bVar18 = aVar;
                                                    if (bVar11 instanceof dx.b.Generic) {
                                                        left = new dx.i.Left(bVar11);
                                                        r16 = r18;
                                                    } else {
                                                        left = new dx.i.Left(bVar11);
                                                        r16 = r18;
                                                    }
                                                }
                                            } else if (!(left instanceof dx.i.Right)) {
                                                r16 = r18;
                                                throw new oq.p();
                                            }
                                            r16 = r18;
                                            bVar3 = bVar5;
                                            if (left instanceof dx.i.Left) {
                                                obj = (dx.b) ((dx.i.Left) left).b();
                                                if (obj instanceof dx.b.Generic) {
                                                    obj = dx.b.j.c.f45087a;
                                                }
                                                left = new dx.i.Left(obj);
                                            } else if (!(left instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            return new dx.i.Right((Cipher) bVar3.a(left));
                                        }
                                    } catch (ex.c e15) {
                                        e = e15;
                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                    } catch (CancellationException e16) {
                                        throw e16;
                                    } catch (Exception e17) {
                                        e = e17;
                                        px.f fVar = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar.d(message, e, px.c.a(r19));
                                        iVarA = r19.a(e);
                                        if (iVarA instanceof dx.i.Left) {
                                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                        } else {
                                            if (iVarA instanceof dx.i.Right) {
                                                throw new oq.p();
                                            }
                                            objB = ((dx.i.Right) iVarA).b();
                                        }
                                        return new dx.i.Left(objB);
                                    }
                                }
                                return objE;
                                return objE;
                            }
                            try {
                                if (r19 != 1) {
                                    if (r19 == 2) {
                                        bVar3 = (ex.b) eVar2.f211932h;
                                        u.b(objN);
                                        left = (dx.i) objN;
                                        if (left instanceof dx.i.Left) {
                                            obj = (dx.b) ((dx.i.Left) left).b();
                                            if (obj instanceof dx.b.Generic) {
                                                obj = dx.b.j.c.f45087a;
                                            }
                                            left = new dx.i.Left(obj);
                                        } else if (!(left instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        return new dx.i.Right((Cipher) bVar3.a(left));
                                    }
                                    if (r19 == 3) {
                                        int i47 = eVar2.f211941s;
                                        int i48 = eVar2.f211940r;
                                        int i49 = eVar2.f211939q;
                                        int i55 = eVar2.f211938p;
                                        int i56 = eVar2.f211937n;
                                        boolean z19 = eVar2.f211936m;
                                        SecretKey secretKey4 = (SecretKey) eVar2.f211933j;
                                        ex.b bVar19 = (ex.b) eVar2.f211932h;
                                        ex.b bVar20 = (ex.b) eVar2.f211931g;
                                        bVar4 = (ex.b) eVar2.f211930f;
                                        dx.j jVar2 = (dx.j) eVar2.f211929e;
                                        qb4.b.AbstractC4144b abstractC4144b5 = (qb4.b.AbstractC4144b) eVar2.f211928d;
                                        u.b(objN);
                                        i25 = i48;
                                        secretKey = secretKey4;
                                        i26 = i55;
                                        bVar5 = bVar19;
                                        aVar = bVar20;
                                        z17 = z19;
                                        i16 = i56;
                                        i27 = i49;
                                        i28 = i47;
                                        abstractC4144b3 = abstractC4144b5;
                                        r18 = jVar2;
                                        try {
                                            left = (dx.i) objN;
                                            if (left instanceof dx.i.Left) {
                                                bVar11 = (dx.b) ((dx.i.Left) left).b();
                                                if (z17) {
                                                    secretKey2 = secretKey;
                                                    bVar12 = aVar;
                                                    bVar7 = this;
                                                    bVar13 = bVar4;
                                                    bVar8 = bVar11;
                                                    bVar7.remoteLogger.F8("Biometric key migration (deactivation)", px.d.a.GENERAL);
                                                    eVar3 = bVar7.deactivateBiometricUseCase;
                                                    c1792a = gz.b.a.C1792a.f78542a;
                                                    eVar2.f211928d = abstractC4144b3;
                                                    eVar2.f211929e = r18;
                                                    eVar2.f211930f = j.a(bVar13);
                                                    eVar2.f211931g = j.a(bVar12);
                                                    eVar2.f211932h = bVar5;
                                                    eVar2.f211933j = j.a(secretKey2);
                                                    eVar2.f211934k = j.a(left);
                                                    eVar2.f211935l = j.a(bVar8);
                                                    eVar2.f211936m = z17;
                                                    eVar2.f211937n = i16;
                                                    eVar2.f211938p = i26;
                                                    eVar2.f211939q = i27;
                                                    eVar2.f211940r = i25;
                                                    eVar2.f211941s = i28;
                                                    eVar2.f211942t = 0;
                                                    eVar2.f211943v = 0;
                                                    eVar2.f211946y = 4;
                                                    if (eVar3.c(c1792a, eVar2) != objE) {
                                                        z18 = z17;
                                                        bVar6 = bVar13;
                                                        i29 = 0;
                                                        iVar = left;
                                                        i37 = i16;
                                                        i35 = i25;
                                                        i36 = 0;
                                                        i38 = i26;
                                                        i39 = i27;
                                                        bVar9 = bVar12;
                                                        r15 = r18;
                                                        int i410 = i28;
                                                        eVar2.f211928d = j.a(abstractC4144b3);
                                                        eVar2.f211929e = r15;
                                                        eVar2.f211930f = j.a(bVar6);
                                                        eVar2.f211931g = j.a(bVar9);
                                                        eVar2.f211932h = bVar5;
                                                        eVar2.f211933j = j.a(secretKey2);
                                                        eVar2.f211934k = j.a(iVar);
                                                        eVar2.f211935l = j.a(bVar8);
                                                        eVar2.f211936m = z18;
                                                        eVar2.f211937n = i37;
                                                        eVar2.f211938p = i38;
                                                        eVar2.f211939q = i39;
                                                        eVar2.f211940r = i35;
                                                        eVar2.f211941s = i410;
                                                        eVar2.f211942t = i36;
                                                        eVar2.f211943v = i29;
                                                        eVar2.f211946y = 5;
                                                        objN = bVar7.n(abstractC4144b3, false, eVar2);
                                                        if (objN != objE) {
                                                            bVar10 = bVar5;
                                                            r17 = r15;
                                                        }
                                                    }
                                                    return objE;
                                                }
                                                ex.b bVar110 = aVar;
                                                if ((bVar11 instanceof dx.b.Generic) || !(((dx.b.Generic) bVar11).getE() instanceof InvalidAlgorithmParameterException)) {
                                                    left = new dx.i.Left(bVar11);
                                                    r16 = r18;
                                                } else {
                                                    this.remoteLogger.T6("Biometric security requirements not fulfilled, encrypt failed", ((dx.b.Generic) bVar11).getE(), px.c.a(bVar110));
                                                    left = new dx.i.Left(new dx.b.Business(pb4.c.SECURITY_REQUIREMENTS_NOT_FULFILLED, null, this.labelProvider.c(ob4.a.f144507f), this.labelProvider.c(ob4.a.f144506e), null, this.labelProvider.c(ob4.a.f144503b), null, 82, null));
                                                    r16 = r18;
                                                }
                                            } else if (!(left instanceof dx.i.Right)) {
                                                r16 = r18;
                                                throw new oq.p();
                                            }
                                            r16 = r18;
                                            bVar3 = bVar5;
                                            if (left instanceof dx.i.Left) {
                                                obj = (dx.b) ((dx.i.Left) left).b();
                                                if ((obj instanceof dx.b.Generic) && (((dx.b.Generic) obj).getE() instanceof NullPointerException)) {
                                                    obj = dx.b.j.c.f45087a;
                                                }
                                                left = new dx.i.Left(obj);
                                            } else if (!(left instanceof dx.i.Right)) {
                                                throw new oq.p();
                                            }
                                            return new dx.i.Right((Cipher) bVar3.a(left));
                                        } catch (ex.c e18) {
                                            e = e18;
                                            return new dx.i.Left((dx.b) ex.d.a(e));
                                        } catch (CancellationException e19) {
                                            e = e19;
                                            throw e;
                                        } catch (Exception e25) {
                                            e = e25;
                                            r19 = r18;
                                            px.f fVar2 = px.f.f163100a;
                                            message = e.getMessage();
                                            if (message == null) {
                                                message = "";
                                            }
                                            fVar2.d(message, e, px.c.a(r19));
                                            iVarA = r19.a(e);
                                            if (iVarA instanceof dx.i.Left) {
                                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                            } else {
                                                if (iVarA instanceof dx.i.Right) {
                                                    throw new oq.p();
                                                }
                                                objB = ((dx.i.Right) iVarA).b();
                                            }
                                            return new dx.i.Left(objB);
                                        }
                                    }
                                    if (r19 == 4) {
                                        int i57 = eVar2.f211943v;
                                        int i58 = eVar2.f211942t;
                                        i28 = eVar2.f211941s;
                                        int i59 = eVar2.f211940r;
                                        int i65 = eVar2.f211939q;
                                        int i66 = eVar2.f211938p;
                                        int i67 = eVar2.f211937n;
                                        boolean z25 = eVar2.f211936m;
                                        dx.b bVar21 = (dx.b) eVar2.f211935l;
                                        dx.i iVar2 = (dx.i) eVar2.f211934k;
                                        SecretKey secretKey5 = (SecretKey) eVar2.f211933j;
                                        ex.b bVar22 = (ex.b) eVar2.f211932h;
                                        ex.b bVar23 = (ex.b) eVar2.f211931g;
                                        bVar6 = (ex.b) eVar2.f211930f;
                                        dx.j jVar3 = (dx.j) eVar2.f211929e;
                                        abstractC4144b3 = (qb4.b.AbstractC4144b) eVar2.f211928d;
                                        try {
                                            u.b(objN);
                                            i29 = i57;
                                            secretKey2 = secretKey5;
                                            bVar7 = this;
                                            bVar5 = bVar22;
                                            i35 = i59;
                                            i36 = i58;
                                            iVar = iVar2;
                                            r15 = jVar3;
                                            bVar8 = bVar21;
                                            z18 = z25;
                                            i37 = i67;
                                            bVar9 = bVar23;
                                            i38 = i66;
                                            i39 = i65;
                                            int i411 = i28;
                                            eVar2.f211928d = j.a(abstractC4144b3);
                                            eVar2.f211929e = r15;
                                            eVar2.f211930f = j.a(bVar6);
                                            eVar2.f211931g = j.a(bVar9);
                                            eVar2.f211932h = bVar5;
                                            eVar2.f211933j = j.a(secretKey2);
                                            eVar2.f211934k = j.a(iVar);
                                            eVar2.f211935l = j.a(bVar8);
                                            eVar2.f211936m = z18;
                                            eVar2.f211937n = i37;
                                            eVar2.f211938p = i38;
                                            eVar2.f211939q = i39;
                                            eVar2.f211940r = i35;
                                            eVar2.f211941s = i411;
                                            eVar2.f211942t = i36;
                                            eVar2.f211943v = i29;
                                            eVar2.f211946y = 5;
                                            objN = bVar7.n(abstractC4144b3, false, eVar2);
                                            if (objN != objE) {
                                                bVar10 = bVar5;
                                                r17 = r15;
                                            }
                                            return objE;
                                        } catch (ex.c e26) {
                                            e = e26;
                                            return new dx.i.Left((dx.b) ex.d.a(e));
                                        } catch (CancellationException e27) {
                                            throw e27;
                                        } catch (Exception e28) {
                                            e = e28;
                                            r19 = jVar3;
                                            px.f fVar3 = px.f.f163100a;
                                            message = e.getMessage();
                                            if (message == null) {
                                                message = "";
                                            }
                                            fVar3.d(message, e, px.c.a(r19));
                                            iVarA = r19.a(e);
                                            if (iVarA instanceof dx.i.Left) {
                                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                            } else {
                                                if (iVarA instanceof dx.i.Right) {
                                                    throw new oq.p();
                                                }
                                                objB = ((dx.i.Right) iVarA).b();
                                            }
                                            return new dx.i.Left(objB);
                                        }
                                    }
                                    if (r19 != 5) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    bVar10 = (ex.b) eVar2.f211932h;
                                    dx.j jVar4 = (dx.j) eVar2.f211929e;
                                    u.b(objN);
                                    r17 = jVar4;
                                    left = (dx.i) objN;
                                    bVar5 = bVar10;
                                    r16 = r17;
                                    r16 = r18;
                                    bVar3 = bVar5;
                                    if (left instanceof dx.i.Left) {
                                        obj = (dx.b) ((dx.i.Left) left).b();
                                        if (obj instanceof dx.b.Generic) {
                                            obj = dx.b.j.c.f45087a;
                                        }
                                        left = new dx.i.Left(obj);
                                    } else if (!(left instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    return new dx.i.Right((Cipher) bVar3.a(left));
                                }
                                int i68 = eVar2.f211941s;
                                int i69 = eVar2.f211940r;
                                int i75 = eVar2.f211939q;
                                i15 = eVar2.f211938p;
                                i16 = eVar2.f211937n;
                                boolean z26 = eVar2.f211936m;
                                aVar = (ex.b) eVar2.f211932h;
                                bVar = (ex.b) eVar2.f211931g;
                                bVar2 = (ex.b) eVar2.f211930f;
                                dx.j<dx.b> jVar5 = (dx.j) eVar2.f211929e;
                                qb4.b.AbstractC4144b abstractC4144b6 = (qb4.b.AbstractC4144b) eVar2.f211928d;
                                u.b(objN);
                                i17 = i68;
                                jVar = jVar5;
                                i18 = i69;
                                abstractC4144b2 = abstractC4144b6;
                                i19 = i75;
                                z16 = z26;
                            } catch (ex.c e29) {
                                e = e29;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e35) {
                                e = e35;
                                throw e;
                            } catch (Exception e36) {
                                e = e36;
                                r19 = r18;
                                px.f fVar4 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar4.d(message, e, px.c.a(r19));
                                iVarA = r19.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                            secretKey3 = (SecretKey) aVar.a((dx.i) objN);
                            aVar = bVar;
                            r19 = jVar;
                            if (abstractC4144b2 instanceof qb4.b.AbstractC4144b.Decrypt) {
                                r<Integer, byte[]> rVarK2 = k((qb4.b.AbstractC4144b.Decrypt) abstractC4144b2);
                                int iIntValue2 = rVarK2.a().intValue();
                                byte[] bArrB2 = rVarK2.b();
                                ex.b bVar111 = bVar2;
                                qb4.b.AbstractC4144b abstractC4144b7 = abstractC4144b2;
                                px.f.f163100a.b("Biometric decrypt (init cipher):\nivSize: " + iIntValue2 + "\niv + data + gcmtag:\n" + Arrays.toString(bArrB2), px.c.a(aVar));
                                iy.g gVar3 = this.cipherAes;
                                iy.h.a.b bVar112 = new iy.h.a.b(0, new iy.r.c(iIntValue2, q.Prefix), 0, 1, null);
                                eVar2.f211928d = j.a(abstractC4144b7);
                                eVar2.f211929e = r19;
                                eVar2.f211930f = j.a(bVar111);
                                eVar2.f211931g = j.a(aVar);
                                eVar2.f211932h = aVar;
                                eVar2.f211933j = j.a(secretKey3);
                                eVar2.f211934k = j.a(bArrB2);
                                eVar2.f211936m = z16;
                                eVar2.f211937n = i16;
                                eVar2.f211938p = i15;
                                eVar2.f211939q = i19;
                                eVar2.f211940r = i18;
                                eVar2.f211941s = i17;
                                eVar2.f211942t = iIntValue2;
                                eVar2.f211946y = 2;
                                objN = gVar3.e(bArrB2, secretKey3, bVar112, eVar2);
                                if (objN == objE) {
                                    objE = objE;
                                    bVar3 = aVar;
                                    left = (dx.i) objN;
                                    if (left instanceof dx.i.Left) {
                                        obj = (dx.b) ((dx.i.Left) left).b();
                                        if (obj instanceof dx.b.Generic) {
                                            obj = dx.b.j.c.f45087a;
                                        }
                                        left = new dx.i.Left(obj);
                                    } else if (!(left instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    return new dx.i.Right((Cipher) bVar3.a(left));
                                }
                                objE = objE;
                            } else {
                                bVar14 = bVar2;
                                if (abstractC4144b2 instanceof qb4.b.AbstractC4144b.Encrypt) {
                                    throw new oq.p();
                                }
                                iy.g gVar4 = this.cipherAes;
                                iy.h.a.b bVar113 = new iy.h.a.b(0, new iy.r.c(12, q.Prefix), 0, 1, null);
                                eVar2.f211928d = abstractC4144b2;
                                eVar2.f211929e = r19;
                                eVar2.f211930f = j.a(bVar14);
                                eVar2.f211931g = aVar;
                                eVar2.f211932h = aVar;
                                eVar2.f211933j = j.a(secretKey3);
                                eVar2.f211936m = z16;
                                eVar2.f211937n = i16;
                                eVar2.f211938p = i15;
                                eVar2.f211939q = i19;
                                eVar2.f211940r = i18;
                                eVar2.f211941s = i17;
                                eVar2.f211946y = 3;
                                objI = gVar4.i(secretKey3, bVar113, eVar2);
                                if (objI == objE) {
                                    bVar4 = bVar14;
                                    z17 = z16;
                                    i25 = i18;
                                    i26 = i15;
                                    i27 = i19;
                                    i28 = i17;
                                    r18 = r19;
                                    abstractC4144b3 = abstractC4144b2;
                                    secretKey = secretKey3;
                                    objN = objI;
                                    bVar5 = aVar;
                                    left = (dx.i) objN;
                                    if (left instanceof dx.i.Left) {
                                        bVar11 = (dx.b) ((dx.i.Left) left).b();
                                        if (z17) {
                                            secretKey2 = secretKey;
                                            bVar12 = aVar;
                                            bVar7 = this;
                                            bVar13 = bVar4;
                                            bVar8 = bVar11;
                                            bVar7.remoteLogger.F8("Biometric key migration (deactivation)", px.d.a.GENERAL);
                                            eVar3 = bVar7.deactivateBiometricUseCase;
                                            c1792a = gz.b.a.C1792a.f78542a;
                                            eVar2.f211928d = abstractC4144b3;
                                            eVar2.f211929e = r18;
                                            eVar2.f211930f = j.a(bVar13);
                                            eVar2.f211931g = j.a(bVar12);
                                            eVar2.f211932h = bVar5;
                                            eVar2.f211933j = j.a(secretKey2);
                                            eVar2.f211934k = j.a(left);
                                            eVar2.f211935l = j.a(bVar8);
                                            eVar2.f211936m = z17;
                                            eVar2.f211937n = i16;
                                            eVar2.f211938p = i26;
                                            eVar2.f211939q = i27;
                                            eVar2.f211940r = i25;
                                            eVar2.f211941s = i28;
                                            eVar2.f211942t = 0;
                                            eVar2.f211943v = 0;
                                            eVar2.f211946y = 4;
                                            if (eVar3.c(c1792a, eVar2) != objE) {
                                                z18 = z17;
                                                bVar6 = bVar13;
                                                i29 = 0;
                                                iVar = left;
                                                i37 = i16;
                                                i35 = i25;
                                                i36 = 0;
                                                i38 = i26;
                                                i39 = i27;
                                                bVar9 = bVar12;
                                                r15 = r18;
                                                int i412 = i28;
                                                eVar2.f211928d = j.a(abstractC4144b3);
                                                eVar2.f211929e = r15;
                                                eVar2.f211930f = j.a(bVar6);
                                                eVar2.f211931g = j.a(bVar9);
                                                eVar2.f211932h = bVar5;
                                                eVar2.f211933j = j.a(secretKey2);
                                                eVar2.f211934k = j.a(iVar);
                                                eVar2.f211935l = j.a(bVar8);
                                                eVar2.f211936m = z18;
                                                eVar2.f211937n = i37;
                                                eVar2.f211938p = i38;
                                                eVar2.f211939q = i39;
                                                eVar2.f211940r = i35;
                                                eVar2.f211941s = i412;
                                                eVar2.f211942t = i36;
                                                eVar2.f211943v = i29;
                                                eVar2.f211946y = 5;
                                                objN = bVar7.n(abstractC4144b3, false, eVar2);
                                                if (objN != objE) {
                                                    bVar10 = bVar5;
                                                    r17 = r15;
                                                    left = (dx.i) objN;
                                                    bVar5 = bVar10;
                                                    r16 = r17;
                                                }
                                            }
                                        } else {
                                            ex.b bVar114 = aVar;
                                            if (bVar11 instanceof dx.b.Generic) {
                                                left = new dx.i.Left(bVar11);
                                                r16 = r18;
                                            } else {
                                                left = new dx.i.Left(bVar11);
                                                r16 = r18;
                                            }
                                        }
                                    } else if (!(left instanceof dx.i.Right)) {
                                        r16 = r18;
                                        throw new oq.p();
                                    }
                                    r16 = r18;
                                    bVar3 = bVar5;
                                    if (left instanceof dx.i.Left) {
                                        obj = (dx.b) ((dx.i.Left) left).b();
                                        if (obj instanceof dx.b.Generic) {
                                            obj = dx.b.j.c.f45087a;
                                        }
                                        left = new dx.i.Left(obj);
                                    } else if (!(left instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    return new dx.i.Right((Cipher) bVar3.a(left));
                                }
                            }
                            return objE;
                        } catch (Exception e37) {
                            e = e37;
                        }
                    } catch (CancellationException e38) {
                        throw e38;
                    }
                } catch (ex.c e39) {
                    e = e39;
                } catch (CancellationException e45) {
                    throw e45;
                }
            } catch (ex.c e46) {
                e = e46;
            } catch (CancellationException e47) {
                e = e47;
            } catch (Exception e48) {
                e = e48;
            }
        } catch (ex.c e49) {
            e = e49;
        } catch (CancellationException e55) {
            throw e55;
        } catch (Exception e56) {
            e = e56;
        }
    }

    private final dx.i<dx.b, SecretKey> p() {
        Object objB;
        dx.i<dx.b, SecretKey> iVarA = t.a(this.keyStoreProvider, f0.ANDROID_KEY_STORE, null, null, 6, null);
        if (!(iVarA instanceof dx.i.Left)) {
            if (!(iVarA instanceof dx.i.Right)) {
                throw new oq.p();
            }
            KeyStore keyStore = (KeyStore) ((dx.i.Right) iVarA).b();
            dx.j<dx.b> jVarA = xw.c.f221622a.a();
            try {
                try {
                    try {
                        new ex.a();
                        Key key = keyStore.getKey("BiometricKey", null);
                        iVarA = new dx.i.Right<>(key instanceof SecretKey ? (SecretKey) key : null);
                    } catch (CancellationException e15) {
                        throw e15;
                    }
                } catch (ex.c e16) {
                    iVarA = new dx.i.Left((dx.b) ex.d.a(e16));
                } catch (CancellationException e17) {
                    throw e17;
                }
            } catch (Exception e18) {
                px.f fVar = px.f.f163100a;
                String message = e18.getMessage();
                if (message == null) {
                    message = "";
                }
                fVar.d(message, e18, px.c.a(jVarA));
                Object objA = jVarA.a(e18);
                if (objA instanceof dx.i.Left) {
                    objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                } else {
                    if (!(objA instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    objB = ((dx.i.Right) objA).b();
                }
                iVarA = new dx.i.Left<>(objB);
            }
        }
        if (iVarA instanceof dx.i.Right) {
            if (((SecretKey) ((dx.i.Right) iVarA).b()) == null) {
                this.remoteLogger.F8("Biometric key load failed, generating new one...", px.d.a.ERROR);
            } else {
                this.remoteLogger.F8("Biometric key loaded", px.d.a.GENERAL);
            }
        }
        if (iVarA instanceof dx.i.Left) {
            dx.b bVar = (dx.b) ((dx.i.Left) iVarA).b();
            this.remoteLogger.F8("Biometric key load failed, error: " + bVar, px.d.a.ERROR);
        }
        return iVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        if (r2.c(r5, r3) == r4) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e3, code lost:
    
        if (r2.c(r5, r3) == r4) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011c, code lost:
    
        if (r2 == r4) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016c, code lost:
    
        if (r2.c(r5, r3) == r4) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a0, code lost:
    
        if (r2.c(r5, r3) == r4) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(dx.b r20, tq.e<? super pb4.a.Error> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wb4.b.q(dx.b, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0378  */
    /* JADX WARN: Code duplicated, block: B:103:0x037c  */
    /* JADX WARN: Code duplicated, block: B:105:0x037f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0383  */
    /* JADX WARN: Code duplicated, block: B:112:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:114:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:116:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:35:0x0138  */
    /* JADX WARN: Code duplicated, block: B:40:0x0165  */
    /* JADX WARN: Code duplicated, block: B:42:0x0169  */
    /* JADX WARN: Code duplicated, block: B:44:0x017a  */
    /* JADX WARN: Code duplicated, block: B:45:0x017c  */
    /* JADX WARN: Code duplicated, block: B:49:0x019a  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:61:0x020c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0215  */
    /* JADX WARN: Code duplicated, block: B:66:0x0274  */
    /* JADX WARN: Code duplicated, block: B:69:0x0287  */
    /* JADX WARN: Code duplicated, block: B:71:0x028b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0294  */
    /* JADX WARN: Code duplicated, block: B:82:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:84:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:86:0x0306  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:95:0x036b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0371  */
    /* JADX WARN: Code duplicated, block: B:99:0x0375  */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x03be, code lost:
    
        if (r1 == r2) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x015e, code lost:
    
        if (r1 == r2) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01de, code lost:
    
        if (r1 == r2) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02d3, code lost:
    
        if (r1 == r2) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0345, code lost:
    
        if (r1 == r2) goto L109;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(qb4.b.AbstractC4144b r20, tq.e<? super pb4.a> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wb4.b.c(qb4.b$b, tq.e):java.lang.Object");
    }
}
