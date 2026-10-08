package m04;

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
import pq.v;
import py.KeyStoreKeySpec;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001@BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010#\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b#\u0010$J \u0010&\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020%2\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b&\u0010'J,\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020 0)2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b+\u0010,J#\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020.0-2\u0006\u0010\u0019\u001a\u00020%H\u0002¢\u0006\u0004\b/\u00100J\u001d\u00102\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0006\u0012\u0004\u0018\u0001010)H\u0002¢\u0006\u0004\b2\u00103J\u001c\u00104\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u0002010)H\u0082@¢\u0006\u0004\b4\u00105J\u0013\u00108\u001a\u000207*\u000206H\u0002¢\u0006\u0004\b8\u00109J\u0018\u0010<\u001a\u00020;2\u0006\u0010:\u001a\u00020*H\u0082@¢\u0006\u0004\b<\u0010=J\u0018\u0010>\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096B¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010R¨\u0006S"}, d2 = {"Lm04/b;", "Lg04/b;", "Liy/t;", "keyStoreProvider", "Lpy/i;", "keyStoreAesKeyGenerator", "Liy/s;", "keyInspector", "Liy/g;", "cipherAes", "Lmx/c;", "labelProvider", "Lax/e;", "biometricManager", "Lg04/i;", "deactivateBiometricUseCase", "Lg04/f;", "checkBiometricRequirementsUseCase", "Ljx/h;", "systemInfoUpdater", "Lpx/d;", "remoteLogger", "<init>", "(Liy/t;Lpy/i;Liy/s;Liy/g;Lmx/c;Lax/e;Lg04/i;Lg04/f;Ljx/h;Lpx/d;)V", "Lg04/b$b;", "params", "", "failedAttempts", "", "p", "(Lg04/b$b;ILtq/e;)Ljava/lang/Object;", "Lg04/b$b$b;", "Ljavax/crypto/Cipher;", "initializedCipher", "Le04/a;", "k", "(Lg04/b$b$b;Ljavax/crypto/Cipher;Ltq/e;)Ljava/lang/Object;", "Lg04/b$b$a;", "j", "(Lg04/b$b$a;Ljavax/crypto/Cipher;Ltq/e;)Ljava/lang/Object;", "allowDeactivation", "Ldx/i;", "Ldx/b;", "o", "(Lg04/b$b;ZLtq/e;)Ljava/lang/Object;", "Loq/r;", "", "l", "(Lg04/b$b$a;)Loq/r;", "Ljavax/crypto/SecretKey;", "r", "()Ldx/i;", "m", "(Ltq/e;)Ljava/lang/Object;", "Lg04/b$a;", "Lmx/a;", "n", "(Lg04/b$a;)Lmx/a;", "domainError", "Le04/a$c;", "s", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "q", "(Lg04/b$b;Ltq/e;)Ljava/lang/Object;", "a", "Liy/t;", "b", "Lpy/i;", "c", "Liy/s;", "d", "Liy/g;", "e", "Lmx/c;", "f", "Lax/e;", "g", "Lg04/i;", "h", "Lg04/f;", "i", "Ljx/h;", "Lpx/d;", "biometric_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements g04.b {

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
    private final g04.i deactivateBiometricUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final g04.f checkBiometricRequirementsUseCase;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final jx.h systemInfoUpdater;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: m04.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C2990b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f122108a;

        static {
            int[] iArr = new int[g04.b.a.values().length];
            try {
                iArr[g04.b.a.CHECK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g04.b.a.LOGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f122108a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f122109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f122110e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f122111f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f122112g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f122113h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f122114j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f122115k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f122116l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f122117m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f122119p;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f122117m = obj;
            this.f122119p |= PKIFailureInfo.systemUnavail;
            return b.this.j(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f122120d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f122121e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f122122f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f122123g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f122124h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f122125j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f122126k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f122128m;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f122126k = obj;
            this.f122128m |= PKIFailureInfo.systemUnavail;
            return b.this.k(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f122129d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f122130e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f122131f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f122132g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f122133h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f122135k;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f122133h = obj;
            this.f122135k |= PKIFailureInfo.systemUnavail;
            return b.this.m(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f122136d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f122137e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f122138f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f122139g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f122140h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f122141j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f122142k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f122143l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f122144m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f122145n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f122146p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f122147q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f122148r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f122149s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f122150t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f122151v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f122152w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f122154y;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f122152w = obj;
            this.f122154y |= PKIFailureInfo.systemUnavail;
            return b.this.o(null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f122155d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f122156e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f122157f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f122158g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f122159h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f122160j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f122161k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f122162l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f122163m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f122164n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f122165p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f122166q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f122167r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f122169t;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f122167r = obj;
            this.f122169t |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "failedAttempts", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h extends vq.k implements p<Integer, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122170e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ int f122171f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ g04.b.AbstractC1552b f122173h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(g04.b.AbstractC1552b abstractC1552b, tq.e<? super h> eVar) {
            super(2, eVar);
            this.f122173h = abstractC1552b;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Object B(Integer num, tq.e<? super Boolean> eVar) {
            return M(num.intValue(), eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            int i15 = this.f122171f;
            Object objE = uq.b.e();
            int i16 = this.f122170e;
            if (i16 != 0) {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            b bVar = b.this;
            g04.b.AbstractC1552b abstractC1552b = this.f122173h;
            this.f122171f = i15;
            this.f122170e = 1;
            Object objP = bVar.p(abstractC1552b, i15, this);
            return objP == objE ? objE : objP;
        }

        public final Object M(int i15, tq.e<? super Boolean> eVar) {
            return ((h) v(Integer.valueOf(i15), eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            h hVar = b.this.new h(this.f122173h, eVar);
            hVar.f122171f = ((Number) obj).intValue();
            return hVar;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f122174d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f122175e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f122176f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f122177g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f122179j;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f122177g = obj;
            this.f122179j |= PKIFailureInfo.systemUnavail;
            return b.this.s(null, this);
        }
    }

    public b(t tVar, py.i iVar, s sVar, iy.g gVar, mx.c cVar, ax.e eVar, g04.i iVar2, g04.f fVar, jx.h hVar, px.d dVar) {
        this.keyStoreProvider = tVar;
        this.keyStoreAesKeyGenerator = iVar;
        this.keyInspector = sVar;
        this.cipherAes = gVar;
        this.labelProvider = cVar;
        this.biometricManager = eVar;
        this.deactivateBiometricUseCase = iVar2;
        this.checkBiometricRequirementsUseCase = fVar;
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
    public final java.lang.Object j(g04.b.AbstractC1552b.Decrypt r17, javax.crypto.Cipher r18, tq.e<? super e04.a> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m04.b.j(g04.b$b$a, javax.crypto.Cipher, tq.e):java.lang.Object");
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
    public final java.lang.Object k(g04.b.AbstractC1552b.Encrypt r12, javax.crypto.Cipher r13, tq.e<? super e04.a> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m04.b.k(g04.b$b$b, javax.crypto.Cipher, tq.e):java.lang.Object");
    }

    private final r<Integer, byte[]> l(g04.b.AbstractC1552b.Decrypt params) {
        px.d dVar = this.remoteLogger;
        px.d.a aVar = px.d.a.GENERAL;
        dVar.F8("Biometric IV extracting...", aVar);
        byte b15 = params.getData().getData()[0];
        byte[] bArrT = pq.n.t(params.getData().getData(), 1, params.getData().getData().length);
        this.remoteLogger.F8("Biometric IV extracted", aVar);
        return new r<>(Integer.valueOf(b15), bArrT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object m(tq.e<? super dx.i<? extends dx.b, ? extends SecretKey>> eVar) throws Throwable {
        e eVar2;
        dx.i iVar;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f122135k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f122135k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objA = eVar2.f122133h;
        Object objE = uq.b.e();
        int i16 = eVar2.f122135k;
        if (i16 != 0) {
            if (i16 == 1) {
                u.b(objA);
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iVar = (dx.i) eVar2.f122129d;
                u.b(objA);
            }
            this.remoteLogger.F8("Biometric key generated", px.d.a.GENERAL);
            return iVar;
        }
        u.b(objA);
        py.i iVar2 = this.keyStoreAesKeyGenerator;
        KeyStoreKeySpec keyStoreKeySpec = new KeyStoreKeySpec("BiometricKey", new iy.h.a.b(0, new iy.r.a(0, 1, null), 0, 1, null), 0, py.g.STRONG_BIOMETRIC, v.e(py.h.ENCRYPT_AND_DECRYPT), py.o.DISABLED, false, null, 132, null);
        eVar2.f122135k = 1;
        objA = iVar2.a(keyStoreKeySpec, eVar2);
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
        eVar2.f122129d = iVar3;
        eVar2.f122130e = vq.j.a(secretKey);
        eVar2.f122131f = 0;
        eVar2.f122132g = 0;
        eVar2.f122135k = 2;
        if (sVar.d(secretKey, true, eVar2) != objE) {
            iVar = iVar3;
            this.remoteLogger.F8("Biometric key generated", px.d.a.GENERAL);
            return iVar;
        }
        return objE;
    }

    private final Label n(g04.b.a aVar) {
        int i15;
        mx.c cVar = this.labelProvider;
        int i16 = C2990b.f122108a[aVar.ordinal()];
        if (i16 == 1) {
            i15 = d04.a.f38993c;
        } else {
            if (i16 != 2) {
                throw new oq.p();
            }
            i15 = d04.a.f38995e;
        }
        return cVar.c(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:105:0x0399  */
    /* JADX WARN: Code duplicated, block: B:108:0x03a1 A[Catch: Exception -> 0x0390, c -> 0x0393, CancellationException -> 0x0396, TryCatch #14 {c -> 0x0393, CancellationException -> 0x0396, Exception -> 0x0390, blocks: (B:87:0x033d, B:83:0x02de, B:106:0x039d, B:108:0x03a1, B:110:0x03ac, B:111:0x03ee, B:119:0x0404, B:136:0x0446, B:137:0x044b), top: B:165:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x03ee A[Catch: Exception -> 0x0390, c -> 0x0393, CancellationException -> 0x0396, TryCatch #14 {c -> 0x0393, CancellationException -> 0x0396, Exception -> 0x0390, blocks: (B:87:0x033d, B:83:0x02de, B:106:0x039d, B:108:0x03a1, B:110:0x03ac, B:111:0x03ee, B:119:0x0404, B:136:0x0446, B:137:0x044b), top: B:165:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0404 A[Catch: Exception -> 0x0390, c -> 0x0393, CancellationException -> 0x0396, TRY_LEAVE, TryCatch #14 {c -> 0x0393, CancellationException -> 0x0396, Exception -> 0x0390, blocks: (B:87:0x033d, B:83:0x02de, B:106:0x039d, B:108:0x03a1, B:110:0x03ac, B:111:0x03ee, B:119:0x0404, B:136:0x0446, B:137:0x044b), top: B:165:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0410 A[Catch: Exception -> 0x0387, c -> 0x038a, CancellationException -> 0x038d, TryCatch #18 {Exception -> 0x0387, blocks: (B:91:0x0382, B:123:0x040c, B:125:0x0410, B:127:0x041c, B:129:0x0427, B:130:0x0429, B:133:0x0434, B:131:0x0430, B:134:0x0440, B:135:0x0445, B:147:0x045f, B:150:0x046d, B:145:0x0459, B:146:0x045e), top: B:165:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x041c A[Catch: Exception -> 0x0387, c -> 0x038a, CancellationException -> 0x038d, TryCatch #18 {Exception -> 0x0387, blocks: (B:91:0x0382, B:123:0x040c, B:125:0x0410, B:127:0x041c, B:129:0x0427, B:130:0x0429, B:133:0x0434, B:131:0x0430, B:134:0x0440, B:135:0x0445, B:147:0x045f, B:150:0x046d, B:145:0x0459, B:146:0x045e), top: B:165:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0430 A[Catch: Exception -> 0x0387, c -> 0x038a, CancellationException -> 0x038d, TryCatch #18 {Exception -> 0x0387, blocks: (B:91:0x0382, B:123:0x040c, B:125:0x0410, B:127:0x041c, B:129:0x0427, B:130:0x0429, B:133:0x0434, B:131:0x0430, B:134:0x0440, B:135:0x0445, B:147:0x045f, B:150:0x046d, B:145:0x0459, B:146:0x045e), top: B:165:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0440 A[Catch: Exception -> 0x0387, c -> 0x038a, CancellationException -> 0x038d, TryCatch #18 {Exception -> 0x0387, blocks: (B:91:0x0382, B:123:0x040c, B:125:0x0410, B:127:0x041c, B:129:0x0427, B:130:0x0429, B:133:0x0434, B:131:0x0430, B:134:0x0440, B:135:0x0445, B:147:0x045f, B:150:0x046d, B:145:0x0459, B:146:0x045e), top: B:165:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0446 A[Catch: Exception -> 0x0390, c -> 0x0393, CancellationException -> 0x0396, TRY_ENTER, TryCatch #14 {c -> 0x0393, CancellationException -> 0x0396, Exception -> 0x0390, blocks: (B:87:0x033d, B:83:0x02de, B:106:0x039d, B:108:0x03a1, B:110:0x03ac, B:111:0x03ee, B:119:0x0404, B:136:0x0446, B:137:0x044b), top: B:165:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0458  */
    /* JADX WARN: Code duplicated, block: B:153:0x0476  */
    /* JADX WARN: Code duplicated, block: B:156:0x0487  */
    /* JADX WARN: Code duplicated, block: B:157:0x0495  */
    /* JADX WARN: Code duplicated, block: B:159:0x0499  */
    /* JADX WARN: Code duplicated, block: B:162:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x01cc A[Catch: Exception -> 0x005b, c -> 0x005f, CancellationException -> 0x0063, TryCatch #10 {c -> 0x005f, CancellationException -> 0x0063, Exception -> 0x005b, blocks: (B:16:0x0055, B:49:0x0134, B:69:0x0267, B:61:0x01b4, B:63:0x01c8, B:65:0x01cc, B:70:0x026c, B:72:0x0272, B:55:0x0172, B:57:0x0183), top: B:165:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0264  */
    /* JADX WARN: Code duplicated, block: B:68:0x0266  */
    /* JADX WARN: Code duplicated, block: B:70:0x026c A[Catch: Exception -> 0x005b, c -> 0x005f, CancellationException -> 0x0063, TryCatch #10 {c -> 0x005f, CancellationException -> 0x0063, Exception -> 0x005b, blocks: (B:16:0x0055, B:49:0x0134, B:69:0x0267, B:61:0x01b4, B:63:0x01c8, B:65:0x01cc, B:70:0x026c, B:72:0x0272, B:55:0x0172, B:57:0x0183), top: B:165:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0272 A[Catch: Exception -> 0x005b, c -> 0x005f, CancellationException -> 0x0063, TRY_LEAVE, TryCatch #10 {c -> 0x005f, CancellationException -> 0x0063, Exception -> 0x005b, blocks: (B:16:0x0055, B:49:0x0134, B:69:0x0267, B:61:0x01b4, B:63:0x01c8, B:65:0x01cc, B:70:0x026c, B:72:0x0272, B:55:0x0172, B:57:0x0183), top: B:165:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:77:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x02cd A[Catch: Exception -> 0x03f5, c -> 0x03fa, CancellationException -> 0x03ff, TRY_LEAVE, TryCatch #13 {c -> 0x03fa, CancellationException -> 0x03ff, Exception -> 0x03f5, blocks: (B:78:0x02c7, B:80:0x02cd), top: B:169:0x02c7 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:85:0x032d  */
    /* JADX WARN: Code duplicated, block: B:86:0x032e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0380  */
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
    public final Object o(g04.b.AbstractC1552b abstractC1552b, boolean z15, tq.e<? super dx.i<? extends dx.b, ? extends Cipher>> eVar) throws Throwable {
        f fVar;
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
        g04.b.AbstractC1552b abstractC1552b2;
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
        g04.b.AbstractC1552b abstractC1552b3;
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
        g04.i iVar2;
        gz.b.a.C1792a c1792a;
        Object obj;
        SecretKey secretKey3;
        ex.b bVar14;
        Object objI;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i45 = fVar.f122154y;
            if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f122154y = i45 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object objO = fVar.f122152w;
        Object objE = uq.b.e();
        ?? r19 = fVar.f122154y;
        try {
            try {
                try {
                    try {
                        try {
                            if (r19 == 0) {
                                u.b(objO);
                                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                                aVar = new ex.a();
                                secretKey3 = (SecretKey) aVar.a(r());
                                if (secretKey3 == null) {
                                    abstractC1552b2 = abstractC1552b;
                                    fVar.f122136d = abstractC1552b2;
                                    fVar.f122137e = jVarA;
                                    fVar.f122138f = vq.j.a(aVar);
                                    fVar.f122139g = aVar;
                                    fVar.f122140h = aVar;
                                    z16 = z15;
                                    fVar.f122144m = z16;
                                    fVar.f122145n = 0;
                                    fVar.f122146p = 0;
                                    fVar.f122147q = 0;
                                    fVar.f122148r = 0;
                                    fVar.f122149s = 0;
                                    fVar.f122154y = 1;
                                    objO = m(fVar);
                                    if (objO != objE) {
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
                                abstractC1552b2 = abstractC1552b;
                                z16 = z15;
                                bVar2 = aVar;
                                i19 = 0;
                                i15 = 0;
                                i16 = 0;
                                i18 = 0;
                                i17 = 0;
                                r19 = jVarA;
                                if (abstractC1552b2 instanceof g04.b.AbstractC1552b.Decrypt) {
                                    r<Integer, byte[]> rVarL = l((g04.b.AbstractC1552b.Decrypt) abstractC1552b2);
                                    int iIntValue = rVarL.a().intValue();
                                    byte[] bArrB = rVarL.b();
                                    ex.b bVar15 = bVar2;
                                    px.f.f163100a.b("Biometric decrypt (init cipher):\nivSize: " + iIntValue + "\niv + data + gcmtag:\n" + Arrays.toString(bArrB), px.c.a(aVar));
                                    iy.g gVar = this.cipherAes;
                                    iy.h.a.b bVar16 = new iy.h.a.b(0, new iy.r.c(iIntValue, q.Prefix), 0, 1, null);
                                    fVar.f122136d = vq.j.a(abstractC1552b2);
                                    fVar.f122137e = r19;
                                    fVar.f122138f = vq.j.a(bVar15);
                                    fVar.f122139g = vq.j.a(aVar);
                                    fVar.f122140h = aVar;
                                    fVar.f122141j = vq.j.a(secretKey3);
                                    fVar.f122142k = vq.j.a(bArrB);
                                    fVar.f122144m = z16;
                                    fVar.f122145n = i16;
                                    fVar.f122146p = i15;
                                    fVar.f122147q = i19;
                                    fVar.f122148r = i18;
                                    fVar.f122149s = i17;
                                    fVar.f122150t = iIntValue;
                                    fVar.f122154y = 2;
                                    objO = gVar.e(bArrB, secretKey3, bVar16, fVar);
                                    if (objO == objE) {
                                        objE = objE;
                                        bVar3 = aVar;
                                        left = (dx.i) objO;
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
                                    if (abstractC1552b2 instanceof g04.b.AbstractC1552b.Encrypt) {
                                        throw new oq.p();
                                    }
                                    iy.g gVar2 = this.cipherAes;
                                    try {
                                        iy.h.a.b bVar17 = new iy.h.a.b(0, new iy.r.c(12, q.Prefix), 0, 1, null);
                                        fVar.f122136d = abstractC1552b2;
                                        fVar.f122137e = r19;
                                        fVar.f122138f = vq.j.a(bVar14);
                                        fVar.f122139g = aVar;
                                        fVar.f122140h = aVar;
                                        fVar.f122141j = vq.j.a(secretKey3);
                                        fVar.f122144m = z16;
                                        fVar.f122145n = i16;
                                        fVar.f122146p = i15;
                                        fVar.f122147q = i19;
                                        fVar.f122148r = i18;
                                        fVar.f122149s = i17;
                                        fVar.f122154y = 3;
                                        objI = gVar2.i(secretKey3, bVar17, fVar);
                                        if (objI == objE) {
                                            bVar4 = bVar14;
                                            z17 = z16;
                                            i25 = i18;
                                            i26 = i15;
                                            i27 = i19;
                                            i28 = i17;
                                            r18 = r19;
                                            abstractC1552b3 = abstractC1552b2;
                                            secretKey = secretKey3;
                                            objO = objI;
                                            bVar5 = aVar;
                                            left = (dx.i) objO;
                                            if (left instanceof dx.i.Left) {
                                                bVar11 = (dx.b) ((dx.i.Left) left).b();
                                                if (z17) {
                                                    secretKey2 = secretKey;
                                                    bVar12 = aVar;
                                                    bVar7 = this;
                                                    bVar13 = bVar4;
                                                    bVar8 = bVar11;
                                                    bVar7.remoteLogger.F8("Biometric key migration (deactivation)", px.d.a.GENERAL);
                                                    iVar2 = bVar7.deactivateBiometricUseCase;
                                                    c1792a = gz.b.a.C1792a.f78542a;
                                                    fVar.f122136d = abstractC1552b3;
                                                    fVar.f122137e = r18;
                                                    fVar.f122138f = vq.j.a(bVar13);
                                                    fVar.f122139g = vq.j.a(bVar12);
                                                    fVar.f122140h = bVar5;
                                                    fVar.f122141j = vq.j.a(secretKey2);
                                                    fVar.f122142k = vq.j.a(left);
                                                    fVar.f122143l = vq.j.a(bVar8);
                                                    fVar.f122144m = z17;
                                                    fVar.f122145n = i16;
                                                    fVar.f122146p = i26;
                                                    fVar.f122147q = i27;
                                                    fVar.f122148r = i25;
                                                    fVar.f122149s = i28;
                                                    fVar.f122150t = 0;
                                                    fVar.f122151v = 0;
                                                    fVar.f122154y = 4;
                                                    if (iVar2.c(c1792a, fVar) != objE) {
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
                                                        fVar.f122136d = vq.j.a(abstractC1552b3);
                                                        fVar.f122137e = r15;
                                                        fVar.f122138f = vq.j.a(bVar6);
                                                        fVar.f122139g = vq.j.a(bVar9);
                                                        fVar.f122140h = bVar5;
                                                        fVar.f122141j = vq.j.a(secretKey2);
                                                        fVar.f122142k = vq.j.a(iVar);
                                                        fVar.f122143l = vq.j.a(bVar8);
                                                        fVar.f122144m = z18;
                                                        fVar.f122145n = i37;
                                                        fVar.f122146p = i38;
                                                        fVar.f122147q = i39;
                                                        fVar.f122148r = i35;
                                                        fVar.f122149s = i46;
                                                        fVar.f122150t = i36;
                                                        fVar.f122151v = i29;
                                                        fVar.f122154y = 5;
                                                        objO = bVar7.o(abstractC1552b3, false, fVar);
                                                        if (objO != objE) {
                                                            bVar10 = bVar5;
                                                            r17 = r15;
                                                            left = (dx.i) objO;
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
                                return objE;
                                return objE;
                            }
                            try {
                                if (r19 != 1) {
                                    if (r19 == 2) {
                                        bVar3 = (ex.b) fVar.f122140h;
                                        u.b(objO);
                                        left = (dx.i) objO;
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
                                        int i47 = fVar.f122149s;
                                        int i48 = fVar.f122148r;
                                        int i49 = fVar.f122147q;
                                        int i55 = fVar.f122146p;
                                        int i56 = fVar.f122145n;
                                        boolean z19 = fVar.f122144m;
                                        SecretKey secretKey4 = (SecretKey) fVar.f122141j;
                                        ex.b bVar19 = (ex.b) fVar.f122140h;
                                        ex.b bVar20 = (ex.b) fVar.f122139g;
                                        bVar4 = (ex.b) fVar.f122138f;
                                        dx.j jVar2 = (dx.j) fVar.f122137e;
                                        g04.b.AbstractC1552b abstractC1552b4 = (g04.b.AbstractC1552b) fVar.f122136d;
                                        u.b(objO);
                                        i25 = i48;
                                        secretKey = secretKey4;
                                        i26 = i55;
                                        bVar5 = bVar19;
                                        aVar = bVar20;
                                        z17 = z19;
                                        i16 = i56;
                                        i27 = i49;
                                        i28 = i47;
                                        abstractC1552b3 = abstractC1552b4;
                                        r18 = jVar2;
                                        try {
                                            left = (dx.i) objO;
                                            if (left instanceof dx.i.Left) {
                                                bVar11 = (dx.b) ((dx.i.Left) left).b();
                                                if (z17) {
                                                    secretKey2 = secretKey;
                                                    bVar12 = aVar;
                                                    bVar7 = this;
                                                    bVar13 = bVar4;
                                                    bVar8 = bVar11;
                                                    bVar7.remoteLogger.F8("Biometric key migration (deactivation)", px.d.a.GENERAL);
                                                    iVar2 = bVar7.deactivateBiometricUseCase;
                                                    c1792a = gz.b.a.C1792a.f78542a;
                                                    fVar.f122136d = abstractC1552b3;
                                                    fVar.f122137e = r18;
                                                    fVar.f122138f = vq.j.a(bVar13);
                                                    fVar.f122139g = vq.j.a(bVar12);
                                                    fVar.f122140h = bVar5;
                                                    fVar.f122141j = vq.j.a(secretKey2);
                                                    fVar.f122142k = vq.j.a(left);
                                                    fVar.f122143l = vq.j.a(bVar8);
                                                    fVar.f122144m = z17;
                                                    fVar.f122145n = i16;
                                                    fVar.f122146p = i26;
                                                    fVar.f122147q = i27;
                                                    fVar.f122148r = i25;
                                                    fVar.f122149s = i28;
                                                    fVar.f122150t = 0;
                                                    fVar.f122151v = 0;
                                                    fVar.f122154y = 4;
                                                    if (iVar2.c(c1792a, fVar) != objE) {
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
                                                        fVar.f122136d = vq.j.a(abstractC1552b3);
                                                        fVar.f122137e = r15;
                                                        fVar.f122138f = vq.j.a(bVar6);
                                                        fVar.f122139g = vq.j.a(bVar9);
                                                        fVar.f122140h = bVar5;
                                                        fVar.f122141j = vq.j.a(secretKey2);
                                                        fVar.f122142k = vq.j.a(iVar);
                                                        fVar.f122143l = vq.j.a(bVar8);
                                                        fVar.f122144m = z18;
                                                        fVar.f122145n = i37;
                                                        fVar.f122146p = i38;
                                                        fVar.f122147q = i39;
                                                        fVar.f122148r = i35;
                                                        fVar.f122149s = i410;
                                                        fVar.f122150t = i36;
                                                        fVar.f122151v = i29;
                                                        fVar.f122154y = 5;
                                                        objO = bVar7.o(abstractC1552b3, false, fVar);
                                                        if (objO != objE) {
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
                                                    left = new dx.i.Left(new dx.b.Business(k04.a.SECURITY_REQUIREMENTS_NOT_FULFILLED, null, this.labelProvider.c(d04.a.f38997g), this.labelProvider.c(d04.a.f38996f), null, this.labelProvider.c(d04.a.f38992b), null, 82, null));
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
                                    if (r19 == 4) {
                                        int i57 = fVar.f122151v;
                                        int i58 = fVar.f122150t;
                                        i28 = fVar.f122149s;
                                        int i59 = fVar.f122148r;
                                        int i65 = fVar.f122147q;
                                        int i66 = fVar.f122146p;
                                        int i67 = fVar.f122145n;
                                        boolean z25 = fVar.f122144m;
                                        dx.b bVar21 = (dx.b) fVar.f122143l;
                                        dx.i iVar3 = (dx.i) fVar.f122142k;
                                        SecretKey secretKey5 = (SecretKey) fVar.f122141j;
                                        ex.b bVar22 = (ex.b) fVar.f122140h;
                                        ex.b bVar23 = (ex.b) fVar.f122139g;
                                        bVar6 = (ex.b) fVar.f122138f;
                                        dx.j jVar3 = (dx.j) fVar.f122137e;
                                        abstractC1552b3 = (g04.b.AbstractC1552b) fVar.f122136d;
                                        try {
                                            u.b(objO);
                                            i29 = i57;
                                            secretKey2 = secretKey5;
                                            bVar7 = this;
                                            bVar5 = bVar22;
                                            i35 = i59;
                                            i36 = i58;
                                            iVar = iVar3;
                                            r15 = jVar3;
                                            bVar8 = bVar21;
                                            z18 = z25;
                                            i37 = i67;
                                            bVar9 = bVar23;
                                            i38 = i66;
                                            i39 = i65;
                                            int i411 = i28;
                                            fVar.f122136d = vq.j.a(abstractC1552b3);
                                            fVar.f122137e = r15;
                                            fVar.f122138f = vq.j.a(bVar6);
                                            fVar.f122139g = vq.j.a(bVar9);
                                            fVar.f122140h = bVar5;
                                            fVar.f122141j = vq.j.a(secretKey2);
                                            fVar.f122142k = vq.j.a(iVar);
                                            fVar.f122143l = vq.j.a(bVar8);
                                            fVar.f122144m = z18;
                                            fVar.f122145n = i37;
                                            fVar.f122146p = i38;
                                            fVar.f122147q = i39;
                                            fVar.f122148r = i35;
                                            fVar.f122149s = i411;
                                            fVar.f122150t = i36;
                                            fVar.f122151v = i29;
                                            fVar.f122154y = 5;
                                            objO = bVar7.o(abstractC1552b3, false, fVar);
                                            if (objO != objE) {
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
                                    }
                                    if (r19 != 5) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    bVar10 = (ex.b) fVar.f122140h;
                                    dx.j jVar4 = (dx.j) fVar.f122137e;
                                    u.b(objO);
                                    r17 = jVar4;
                                    left = (dx.i) objO;
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
                                int i68 = fVar.f122149s;
                                int i69 = fVar.f122148r;
                                int i75 = fVar.f122147q;
                                i15 = fVar.f122146p;
                                i16 = fVar.f122145n;
                                boolean z26 = fVar.f122144m;
                                aVar = (ex.b) fVar.f122140h;
                                bVar = (ex.b) fVar.f122139g;
                                bVar2 = (ex.b) fVar.f122138f;
                                dx.j<dx.b> jVar5 = (dx.j) fVar.f122137e;
                                g04.b.AbstractC1552b abstractC1552b5 = (g04.b.AbstractC1552b) fVar.f122136d;
                                u.b(objO);
                                i17 = i68;
                                jVar = jVar5;
                                i18 = i69;
                                abstractC1552b2 = abstractC1552b5;
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
                                px.f fVar5 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar5.d(message, e, px.c.a(r19));
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
                            secretKey3 = (SecretKey) aVar.a((dx.i) objO);
                            aVar = bVar;
                            r19 = jVar;
                            if (abstractC1552b2 instanceof g04.b.AbstractC1552b.Decrypt) {
                                r<Integer, byte[]> rVarL2 = l((g04.b.AbstractC1552b.Decrypt) abstractC1552b2);
                                int iIntValue2 = rVarL2.a().intValue();
                                byte[] bArrB2 = rVarL2.b();
                                ex.b bVar111 = bVar2;
                                px.f.f163100a.b("Biometric decrypt (init cipher):\nivSize: " + iIntValue2 + "\niv + data + gcmtag:\n" + Arrays.toString(bArrB2), px.c.a(aVar));
                                iy.g gVar3 = this.cipherAes;
                                iy.h.a.b bVar112 = new iy.h.a.b(0, new iy.r.c(iIntValue2, q.Prefix), 0, 1, null);
                                fVar.f122136d = vq.j.a(abstractC1552b2);
                                fVar.f122137e = r19;
                                fVar.f122138f = vq.j.a(bVar111);
                                fVar.f122139g = vq.j.a(aVar);
                                fVar.f122140h = aVar;
                                fVar.f122141j = vq.j.a(secretKey3);
                                fVar.f122142k = vq.j.a(bArrB2);
                                fVar.f122144m = z16;
                                fVar.f122145n = i16;
                                fVar.f122146p = i15;
                                fVar.f122147q = i19;
                                fVar.f122148r = i18;
                                fVar.f122149s = i17;
                                fVar.f122150t = iIntValue2;
                                fVar.f122154y = 2;
                                objO = gVar3.e(bArrB2, secretKey3, bVar112, fVar);
                                if (objO == objE) {
                                    objE = objE;
                                    bVar3 = aVar;
                                    left = (dx.i) objO;
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
                                if (abstractC1552b2 instanceof g04.b.AbstractC1552b.Encrypt) {
                                    throw new oq.p();
                                }
                                iy.g gVar4 = this.cipherAes;
                                iy.h.a.b bVar113 = new iy.h.a.b(0, new iy.r.c(12, q.Prefix), 0, 1, null);
                                fVar.f122136d = abstractC1552b2;
                                fVar.f122137e = r19;
                                fVar.f122138f = vq.j.a(bVar14);
                                fVar.f122139g = aVar;
                                fVar.f122140h = aVar;
                                fVar.f122141j = vq.j.a(secretKey3);
                                fVar.f122144m = z16;
                                fVar.f122145n = i16;
                                fVar.f122146p = i15;
                                fVar.f122147q = i19;
                                fVar.f122148r = i18;
                                fVar.f122149s = i17;
                                fVar.f122154y = 3;
                                objI = gVar4.i(secretKey3, bVar113, fVar);
                                if (objI == objE) {
                                    bVar4 = bVar14;
                                    z17 = z16;
                                    i25 = i18;
                                    i26 = i15;
                                    i27 = i19;
                                    i28 = i17;
                                    r18 = r19;
                                    abstractC1552b3 = abstractC1552b2;
                                    secretKey = secretKey3;
                                    objO = objI;
                                    bVar5 = aVar;
                                    left = (dx.i) objO;
                                    if (left instanceof dx.i.Left) {
                                        bVar11 = (dx.b) ((dx.i.Left) left).b();
                                        if (z17) {
                                            secretKey2 = secretKey;
                                            bVar12 = aVar;
                                            bVar7 = this;
                                            bVar13 = bVar4;
                                            bVar8 = bVar11;
                                            bVar7.remoteLogger.F8("Biometric key migration (deactivation)", px.d.a.GENERAL);
                                            iVar2 = bVar7.deactivateBiometricUseCase;
                                            c1792a = gz.b.a.C1792a.f78542a;
                                            fVar.f122136d = abstractC1552b3;
                                            fVar.f122137e = r18;
                                            fVar.f122138f = vq.j.a(bVar13);
                                            fVar.f122139g = vq.j.a(bVar12);
                                            fVar.f122140h = bVar5;
                                            fVar.f122141j = vq.j.a(secretKey2);
                                            fVar.f122142k = vq.j.a(left);
                                            fVar.f122143l = vq.j.a(bVar8);
                                            fVar.f122144m = z17;
                                            fVar.f122145n = i16;
                                            fVar.f122146p = i26;
                                            fVar.f122147q = i27;
                                            fVar.f122148r = i25;
                                            fVar.f122149s = i28;
                                            fVar.f122150t = 0;
                                            fVar.f122151v = 0;
                                            fVar.f122154y = 4;
                                            if (iVar2.c(c1792a, fVar) != objE) {
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
                                                fVar.f122136d = vq.j.a(abstractC1552b3);
                                                fVar.f122137e = r15;
                                                fVar.f122138f = vq.j.a(bVar6);
                                                fVar.f122139g = vq.j.a(bVar9);
                                                fVar.f122140h = bVar5;
                                                fVar.f122141j = vq.j.a(secretKey2);
                                                fVar.f122142k = vq.j.a(iVar);
                                                fVar.f122143l = vq.j.a(bVar8);
                                                fVar.f122144m = z18;
                                                fVar.f122145n = i37;
                                                fVar.f122146p = i38;
                                                fVar.f122147q = i39;
                                                fVar.f122148r = i35;
                                                fVar.f122149s = i412;
                                                fVar.f122150t = i36;
                                                fVar.f122151v = i29;
                                                fVar.f122154y = 5;
                                                objO = bVar7.o(abstractC1552b3, false, fVar);
                                                if (objO != objE) {
                                                    bVar10 = bVar5;
                                                    r17 = r15;
                                                    left = (dx.i) objO;
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
                        } catch (CancellationException e37) {
                            throw e37;
                        }
                    } catch (Exception e38) {
                        e = e38;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final Object p(g04.b.AbstractC1552b abstractC1552b, int i15, tq.e<? super Boolean> eVar) {
        int i16 = C2990b.f122108a[abstractC1552b.getReason().ordinal()];
        boolean z15 = true;
        if (i16 != 1) {
            if (i16 != 2) {
                throw new oq.p();
            }
            if (i15 >= 3) {
                z15 = false;
            }
        }
        return vq.b.a(z15);
    }

    private final dx.i<dx.b, SecretKey> r() {
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
                this.remoteLogger.F8("Biometric key load null", px.d.a.ERROR);
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
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
    
        if (r2.c(r5, r3) == r4) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ed, code lost:
    
        if (r2.c(r5, r3) == r4) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012b, code lost:
    
        if (r2 == r4) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017b, code lost:
    
        if (r2.c(r5, r3) == r4) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01af, code lost:
    
        if (r2.c(r5, r3) == r4) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(dx.b r20, tq.e<? super e04.a.Error> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m04.b.s(dx.b, tq.e):java.lang.Object");
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
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(g04.b.AbstractC1552b r20, tq.e<? super e04.a> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m04.b.c(g04.b$b, tq.e):java.lang.Object");
    }
}
