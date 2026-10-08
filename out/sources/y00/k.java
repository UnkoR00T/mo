package y00;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ=\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\u00140\u00142\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010!J!\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00130%2\n\u0010$\u001a\u00060\"j\u0002`#H\u0002¢\u0006\u0004\b&\u0010'J4\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e0\u00122\u0006\u0010(\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b)\u0010*J4\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e0\u00122\u0006\u0010(\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b+\u0010*J4\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e0\u00122\u0006\u0010(\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b-\u0010.J4\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e0\u00122\u0006\u0010(\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b/\u0010.J,\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b0\u00101J4\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010(\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b$\u0010*J4\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e0\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u0010\u001b\u001a\u000203H\u0096@¢\u0006\u0004\b4\u00105J4\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u00122\u0006\u00106\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001b\u001a\u000203H\u0096@¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010=R$\u0010B\u001a\u0004\u0018\u00010\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010>\u001a\u0004\b?\u0010@\"\u0004\b9\u0010AR\"\u0010H\u001a\u00020C8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010D\u001a\u0004\bE\u0010F\"\u0004\b;\u0010G¨\u0006I"}, d2 = {"Ly00/k;", "Liy/g;", "Liy/w;", "secureRandomFactory", "Ly00/c0;", "securityExceptionParser", "Liy/p;", "ivGenerator", "<init>", "(Liy/w;Ly00/c0;Liy/p;)V", "", "mode", "Ljavax/crypto/SecretKey;", "key", "", "transformation", "Ljava/security/spec/AlgorithmParameterSpec;", "spec", "Ldx/i;", "Ldx/b;", "Ljavax/crypto/Cipher;", "q", "(ILjavax/crypto/SecretKey;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;)Ldx/i;", "kotlin.jvm.PlatformType", "l", "(Ljava/lang/String;)Ljavax/crypto/Cipher;", "Liy/h$a;", "algorithm", "o", "(Liy/h$a;Ltq/e;)Ljava/lang/Object;", "", "encryptedData", "n", "([BLiy/h$a;)Ldx/i;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Ldx/i$b;", "r", "(Ljava/lang/Exception;)Ldx/i$b;", "data", "f", "([BLjavax/crypto/SecretKey;Liy/h$a;Ltq/e;)Ljava/lang/Object;", "d", "initializedCipher", "g", "([BLjavax/crypto/Cipher;Liy/h$a;Ltq/e;)Ljava/lang/Object;", "h", "i", "(Ljavax/crypto/SecretKey;Liy/h$a;Ltq/e;)Ljava/lang/Object;", "wrappingKey", "Liy/h$a$c;", "c", "(Ljavax/crypto/SecretKey;Ljavax/crypto/SecretKey;Liy/h$a$c;Ltq/e;)Ljava/lang/Object;", "wrappedKey", "j", "([BLjavax/crypto/SecretKey;Liy/h$a$c;Ltq/e;)Ljava/lang/Object;", "a", "Liy/w;", "b", "Ly00/c0;", "Liy/p;", "Ljava/lang/String;", "p", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "explicitProvider", "", "Z", "m", "()Z", "(Z)V", "debuggable", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements iy.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.w secureRandomFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c0 securityExceptionParser;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.p ivGenerator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String explicitProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean debuggable;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f222670a;

        static {
            int[] iArr = new int[iy.q.values().length];
            try {
                iArr[iy.q.Prefix.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[iy.q.Suffix.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[iy.q.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f222670a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f222671d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f222672e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f222673f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f222674g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f222675h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f222677k;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f222675h = obj;
            this.f222677k |= PKIFailureInfo.systemUnavail;
            return k.this.d(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f222678d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f222679e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f222680f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f222681g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f222682h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f222684k;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f222682h = obj;
            this.f222684k |= PKIFailureInfo.systemUnavail;
            return k.this.f(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f222685d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f222686e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f222687f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f222688g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f222689h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f222691k;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f222689h = obj;
            this.f222691k |= PKIFailureInfo.systemUnavail;
            return k.this.g(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f222692d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f222693e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f222694f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f222696h;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f222694f = obj;
            this.f222696h |= PKIFailureInfo.systemUnavail;
            return k.this.i(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f222697d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f222698e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f222699f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f222701h;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f222699f = obj;
            this.f222701h |= PKIFailureInfo.systemUnavail;
            return k.this.o(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f222702d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f222703e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f222704f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f222705g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f222706h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f222707j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f222708k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f222709l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f222710m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f222711n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f222712p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f222713q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f222714r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f222715s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f222716t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f222717v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f222718w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f222719x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f222721z;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f222719x = obj;
            this.f222721z |= PKIFailureInfo.systemUnavail;
            return k.this.j(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f222722d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f222723e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f222724f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f222725g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f222726h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f222727j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f222728k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f222729l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f222730m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f222731n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f222732p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f222733q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f222734r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f222735s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f222736t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f222737v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f222738w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f222739x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f222741z;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f222739x = obj;
            this.f222741z |= PKIFailureInfo.systemUnavail;
            return k.this.c(null, null, null, this);
        }
    }

    public k(iy.w wVar, c0 c0Var, iy.p pVar) {
        this.secureRandomFactory = wVar;
        this.securityExceptionParser = c0Var;
        this.ivGenerator = pVar;
    }

    private final Cipher l(String transformation) {
        return getExplicitProvider() == null ? Cipher.getInstance(transformation) : Cipher.getInstance(transformation, getExplicitProvider());
    }

    private final dx.i<dx.b, AlgorithmParameterSpec> n(byte[] encryptedData, iy.h.a algorithm) {
        byte[] ivBytes;
        Object gCMParameterSpec;
        try {
            iy.r ivType = algorithm.getIvType();
            if (ivType instanceof iy.r.a) {
                ivBytes = pq.v.a1(pq.n.d1(encryptedData, ((iy.r.a) ivType).getIvBytesLength()));
            } else if (ivType instanceof iy.r.c) {
                int i15 = a.f222670a[((iy.r.c) ivType).getIvPlace().ordinal()];
                if (i15 == 1) {
                    ivBytes = pq.v.a1(pq.n.c1(encryptedData, ((iy.r.c) ivType).getIvBytesLength()));
                } else if (i15 == 2) {
                    ivBytes = pq.v.a1(pq.n.d1(encryptedData, ((iy.r.c) ivType).getIvBytesLength()));
                } else {
                    if (i15 != 3) {
                        throw new oq.p();
                    }
                    ivBytes = new byte[0];
                }
            } else {
                if (!(ivType instanceof iy.r.b)) {
                    throw new oq.p();
                }
                ivBytes = ((iy.r.b) ivType).getIvBytes();
            }
            if (getDebuggable()) {
                px.f.f163100a.b("Cipher get decrypt spec:\nalgorithm: " + algorithm + "\niv: " + Arrays.toString(ivBytes), px.c.a(this));
            }
            if (algorithm instanceof iy.h.a.C2298a) {
                gCMParameterSpec = new IvParameterSpec(ivBytes);
            } else if (algorithm instanceof iy.h.a.b) {
                gCMParameterSpec = new GCMParameterSpec(((iy.h.a.b) algorithm).getTagLength(), ivBytes);
            } else {
                if (!(algorithm instanceof iy.h.a.c)) {
                    throw new oq.p();
                }
                gCMParameterSpec = null;
            }
            return new dx.i.Right(gCMParameterSpec);
        } catch (IllegalArgumentException e15) {
            return r(e15);
        } catch (NullPointerException e16) {
            return r(e16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
    
        if (r7 == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0140, code lost:
    
        if (r7 == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0142, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(iy.h.a r6, tq.e<? super dx.i<? extends dx.b, ? extends java.security.spec.AlgorithmParameterSpec>> r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.k.o(iy.h$a, tq.e):java.lang.Object");
    }

    private final dx.i<dx.b, Cipher> q(int mode, SecretKey key, String transformation, AlgorithmParameterSpec spec) {
        try {
            Cipher cipherL = l(transformation);
            if (spec == null) {
                cipherL.init(mode, key);
            } else {
                cipherL.init(mode, key, spec);
            }
            return new dx.i.Right(cipherL);
        } catch (NullPointerException e15) {
            return r(e15);
        } catch (InvalidAlgorithmParameterException e16) {
            return r(e16);
        } catch (InvalidKeyException e17) {
            return r(e17);
        } catch (NoSuchAlgorithmException e18) {
            return r(e18);
        } catch (NoSuchPaddingException e19) {
            return r(e19);
        }
    }

    private final dx.i.Left<dx.b> r(Exception e15) {
        dx.i<Exception, dx.b> iVarA = this.securityExceptionParser.a(e15);
        if (iVarA instanceof dx.i.Right) {
            return new dx.i.Left<>(((dx.i.Right) iVarA).b());
        }
        if (iVarA instanceof dx.i.Left) {
            return new dx.i.Left<>(new dx.b.Generic((Throwable) ((dx.i.Left) iVarA).b()));
        }
        throw new oq.p();
    }

    @Override // iy.g
    public void a(String str) {
        this.explicitProvider = str;
    }

    @Override // iy.g
    public void b(boolean z15) {
        this.debuggable = z15;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0110: INVOKE (r10 I:java.util.List) = (r4 I:java.lang.Object) STATIC call: px.c.a(java.lang.Object):java.util.List A[MD:(java.lang.Object):java.util.List<px.a$a> (m)], block:B:43:0x0110 */
    /* JADX WARN: Type inference failed for: r4v0, types: [dx.j, java.lang.Object] */
    @Override // iy.g
    public Object c(SecretKey secretKey, SecretKey secretKey2, iy.h.a.c cVar, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar) throws Throwable {
        h hVar;
        ?? A;
        Object objB;
        String transformation;
        SecretKey secretKey3;
        SecretKey secretKey4;
        ex.b bVar;
        ex.b bVar2;
        int i15;
        k kVar;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i16 = hVar.f222741z;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                hVar.f222741z = i16 - PKIFailureInfo.systemUnavail;
            } else {
                hVar = new h(eVar);
            }
        } else {
            hVar = new h(eVar);
        }
        Object obj = hVar.f222739x;
        Object objE = uq.b.e();
        int i17 = hVar.f222741z;
        try {
            try {
                if (i17 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    transformation = cVar.getTransformation();
                    hVar.f222722d = secretKey;
                    hVar.f222723e = vq.j.a(secretKey2);
                    hVar.f222724f = vq.j.a(cVar);
                    hVar.f222725g = jVarA;
                    hVar.f222726h = vq.j.a(aVar);
                    hVar.f222727j = vq.j.a(aVar);
                    hVar.f222728k = aVar;
                    hVar.f222729l = transformation;
                    hVar.f222730m = secretKey2;
                    hVar.f222731n = this;
                    hVar.f222732p = aVar;
                    hVar.f222733q = 0;
                    hVar.f222734r = 0;
                    hVar.f222735s = 0;
                    hVar.f222736t = 0;
                    hVar.f222737v = 0;
                    hVar.f222738w = 3;
                    hVar.f222741z = 1;
                    Object objO = o(cVar, hVar);
                    if (objO == objE) {
                        return objE;
                    }
                    secretKey3 = secretKey;
                    secretKey4 = secretKey2;
                    bVar = aVar;
                    bVar2 = bVar;
                    i15 = 3;
                    obj = objO;
                    kVar = this;
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i15 = hVar.f222738w;
                    bVar = (ex.b) hVar.f222732p;
                    kVar = (k) hVar.f222731n;
                    secretKey4 = (SecretKey) hVar.f222730m;
                    transformation = (String) hVar.f222729l;
                    bVar2 = (ex.b) hVar.f222728k;
                    secretKey3 = (SecretKey) hVar.f222722d;
                    try {
                        oq.u.b(obj);
                    } catch (CancellationException e15) {
                        throw e15;
                    }
                }
                dx.i<dx.b, Cipher> iVarQ = kVar.q(i15, secretKey4, transformation, (AlgorithmParameterSpec) bVar2.a((dx.i) obj));
                if (!(iVarQ instanceof dx.i.Left)) {
                    if (!(iVarQ instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    iVarQ = new dx.i.Right(((Cipher) ((dx.i.Right) iVarQ).b()).wrap(secretKey3));
                }
                return new dx.i.Right((byte[]) bVar.a(iVarQ));
            } catch (Exception e16) {
                px.f fVar = px.f.f163100a;
                String message = e16.getMessage();
                if (message == null) {
                    message = "";
                }
                fVar.d(message, e16, px.c.a(A));
                dx.i iVarA = A.a(e16);
                if (iVarA instanceof dx.i.Left) {
                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                } else {
                    if (!(iVarA instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    objB = ((dx.i.Right) iVarA).b();
                }
                return new dx.i.Left(objB);
            }
        } catch (ex.c e17) {
            return new dx.i.Left((dx.b) ex.d.a(e17));
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iy.g
    public Object d(byte[] bArr, SecretKey secretKey, iy.h.a aVar, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f222677k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f222677k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objE = bVar.f222675h;
        Object objE2 = uq.b.e();
        int i16 = bVar.f222677k;
        if (i16 == 0) {
            oq.u.b(objE);
            if (getDebuggable()) {
                px.f.f163100a.b("Cipher decrypt:\nencrypted data: " + Arrays.toString(bArr) + "\nkey: " + secretKey + "\nalgorithm: " + aVar, px.c.a(this));
            }
            bVar.f222671d = bArr;
            bVar.f222672e = vq.j.a(secretKey);
            bVar.f222673f = aVar;
            bVar.f222677k = 1;
            objE = e(bArr, secretKey, aVar, bVar);
            if (objE != objE2) {
            }
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objE);
            return objE;
        }
        aVar = (iy.h.a) bVar.f222673f;
        secretKey = (SecretKey) bVar.f222672e;
        bArr = (byte[]) bVar.f222671d;
        oq.u.b(objE);
        dx.i iVar = (dx.i) objE;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        Cipher cipher = (Cipher) ((dx.i.Right) iVar).b();
        bVar.f222671d = vq.j.a(bArr);
        bVar.f222672e = vq.j.a(secretKey);
        bVar.f222673f = vq.j.a(aVar);
        bVar.f222674g = vq.j.a(cipher);
        bVar.f222677k = 2;
        Object objH = h(bArr, cipher, aVar, bVar);
        return objH == objE2 ? objE2 : objH;
    }

    @Override // iy.g
    public Object e(byte[] bArr, SecretKey secretKey, iy.h.a aVar, tq.e<? super dx.i<? extends dx.b, ? extends Cipher>> eVar) {
        dx.i<dx.b, AlgorithmParameterSpec> iVarN = n(bArr, aVar);
        if (iVarN instanceof dx.i.Left) {
            return iVarN;
        }
        if (!(iVarN instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return q(2, secretKey, aVar.getTransformation(), (AlgorithmParameterSpec) ((dx.i.Right) iVarN).b());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iy.g
    public Object f(byte[] bArr, SecretKey secretKey, iy.h.a aVar, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f222684k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f222684k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objI = cVar.f222682h;
        Object objE = uq.b.e();
        int i16 = cVar.f222684k;
        if (i16 == 0) {
            oq.u.b(objI);
            if (getDebuggable()) {
                px.f.f163100a.b("Cipher encrypt:\nplain data: " + Arrays.toString(bArr) + "\nkey: " + secretKey + "\nalgorithm: " + aVar, px.c.a(this));
            }
            cVar.f222678d = bArr;
            cVar.f222679e = vq.j.a(secretKey);
            cVar.f222680f = aVar;
            cVar.f222684k = 1;
            objI = i(secretKey, aVar, cVar);
            if (objI != objE) {
            }
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objI);
            return objI;
        }
        aVar = (iy.h.a) cVar.f222680f;
        secretKey = (SecretKey) cVar.f222679e;
        bArr = (byte[]) cVar.f222678d;
        oq.u.b(objI);
        dx.i iVar = (dx.i) objI;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        Cipher cipher = (Cipher) ((dx.i.Right) iVar).b();
        cVar.f222678d = vq.j.a(bArr);
        cVar.f222679e = vq.j.a(secretKey);
        cVar.f222680f = vq.j.a(aVar);
        cVar.f222681g = vq.j.a(cipher);
        cVar.f222684k = 2;
        Object objG = g(bArr, cipher, aVar, cVar);
        return objG == objE ? objE : objG;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d7 A[Catch: IllegalArgumentException -> 0x003f, IllegalStateException -> 0x0042, IllegalBlockSizeException -> 0x0045, BadPaddingException -> 0x0048, TryCatch #2 {IllegalArgumentException -> 0x003f, IllegalStateException -> 0x0042, BadPaddingException -> 0x0048, IllegalBlockSizeException -> 0x0045, blocks: (B:12:0x0036, B:36:0x00b8, B:38:0x00c7, B:40:0x00d7, B:57:0x010b, B:41:0x00dc, B:44:0x00e1, B:46:0x00e5, B:53:0x00fc, B:54:0x0101, B:55:0x0102, B:56:0x0107, B:59:0x0111, B:60:0x0116, B:31:0x009f, B:33:0x00a5, B:37:0x00c4), top: B:66:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00dc A[Catch: IllegalArgumentException -> 0x003f, IllegalStateException -> 0x0042, IllegalBlockSizeException -> 0x0045, BadPaddingException -> 0x0048, TryCatch #2 {IllegalArgumentException -> 0x003f, IllegalStateException -> 0x0042, BadPaddingException -> 0x0048, IllegalBlockSizeException -> 0x0045, blocks: (B:12:0x0036, B:36:0x00b8, B:38:0x00c7, B:40:0x00d7, B:57:0x010b, B:41:0x00dc, B:44:0x00e1, B:46:0x00e5, B:53:0x00fc, B:54:0x0101, B:55:0x0102, B:56:0x0107, B:59:0x0111, B:60:0x0116, B:31:0x009f, B:33:0x00a5, B:37:0x00c4), top: B:66:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1 A[Catch: IllegalArgumentException -> 0x003f, IllegalStateException -> 0x0042, IllegalBlockSizeException -> 0x0045, BadPaddingException -> 0x0048, TryCatch #2 {IllegalArgumentException -> 0x003f, IllegalStateException -> 0x0042, BadPaddingException -> 0x0048, IllegalBlockSizeException -> 0x0045, blocks: (B:12:0x0036, B:36:0x00b8, B:38:0x00c7, B:40:0x00d7, B:57:0x010b, B:41:0x00dc, B:44:0x00e1, B:46:0x00e5, B:53:0x00fc, B:54:0x0101, B:55:0x0102, B:56:0x0107, B:59:0x0111, B:60:0x0116, B:31:0x009f, B:33:0x00a5, B:37:0x00c4), top: B:66:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5 A[Catch: IllegalArgumentException -> 0x003f, IllegalStateException -> 0x0042, IllegalBlockSizeException -> 0x0045, BadPaddingException -> 0x0048, TryCatch #2 {IllegalArgumentException -> 0x003f, IllegalStateException -> 0x0042, BadPaddingException -> 0x0048, IllegalBlockSizeException -> 0x0045, blocks: (B:12:0x0036, B:36:0x00b8, B:38:0x00c7, B:40:0x00d7, B:57:0x010b, B:41:0x00dc, B:44:0x00e1, B:46:0x00e5, B:53:0x00fc, B:54:0x0101, B:55:0x0102, B:56:0x0107, B:59:0x0111, B:60:0x0116, B:31:0x009f, B:33:0x00a5, B:37:0x00c4), top: B:66:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fc A[Catch: IllegalArgumentException -> 0x003f, IllegalStateException -> 0x0042, IllegalBlockSizeException -> 0x0045, BadPaddingException -> 0x0048, TryCatch #2 {IllegalArgumentException -> 0x003f, IllegalStateException -> 0x0042, BadPaddingException -> 0x0048, IllegalBlockSizeException -> 0x0045, blocks: (B:12:0x0036, B:36:0x00b8, B:38:0x00c7, B:40:0x00d7, B:57:0x010b, B:41:0x00dc, B:44:0x00e1, B:46:0x00e5, B:53:0x00fc, B:54:0x0101, B:55:0x0102, B:56:0x0107, B:59:0x0111, B:60:0x0116, B:31:0x009f, B:33:0x00a5, B:37:0x00c4), top: B:66:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0102 A[Catch: IllegalArgumentException -> 0x003f, IllegalStateException -> 0x0042, IllegalBlockSizeException -> 0x0045, BadPaddingException -> 0x0048, TryCatch #2 {IllegalArgumentException -> 0x003f, IllegalStateException -> 0x0042, BadPaddingException -> 0x0048, IllegalBlockSizeException -> 0x0045, blocks: (B:12:0x0036, B:36:0x00b8, B:38:0x00c7, B:40:0x00d7, B:57:0x010b, B:41:0x00dc, B:44:0x00e1, B:46:0x00e5, B:53:0x00fc, B:54:0x0101, B:55:0x0102, B:56:0x0107, B:59:0x0111, B:60:0x0116, B:31:0x009f, B:33:0x00a5, B:37:0x00c4), top: B:66:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0107 A[Catch: IllegalArgumentException -> 0x003f, IllegalStateException -> 0x0042, IllegalBlockSizeException -> 0x0045, BadPaddingException -> 0x0048, TryCatch #2 {IllegalArgumentException -> 0x003f, IllegalStateException -> 0x0042, BadPaddingException -> 0x0048, IllegalBlockSizeException -> 0x0045, blocks: (B:12:0x0036, B:36:0x00b8, B:38:0x00c7, B:40:0x00d7, B:57:0x010b, B:41:0x00dc, B:44:0x00e1, B:46:0x00e5, B:53:0x00fc, B:54:0x0101, B:55:0x0102, B:56:0x0107, B:59:0x0111, B:60:0x0116, B:31:0x009f, B:33:0x00a5, B:37:0x00c4), top: B:66:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0111 A[Catch: IllegalArgumentException -> 0x003f, IllegalStateException -> 0x0042, IllegalBlockSizeException -> 0x0045, BadPaddingException -> 0x0048, TryCatch #2 {IllegalArgumentException -> 0x003f, IllegalStateException -> 0x0042, BadPaddingException -> 0x0048, IllegalBlockSizeException -> 0x0045, blocks: (B:12:0x0036, B:36:0x00b8, B:38:0x00c7, B:40:0x00d7, B:57:0x010b, B:41:0x00dc, B:44:0x00e1, B:46:0x00e5, B:53:0x00fc, B:54:0x0101, B:55:0x0102, B:56:0x0107, B:59:0x0111, B:60:0x0116, B:31:0x009f, B:33:0x00a5, B:37:0x00c4), top: B:66:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iy.g
    public Object g(byte[] bArr, Cipher cipher, iy.h.a aVar, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar) throws Throwable {
        d dVar;
        byte[] iv4;
        byte[] bArr2;
        Object objC;
        byte[] bArrDoFinal;
        iy.r ivType;
        int i15;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i16 = dVar.f222691k;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f222691k = i16 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f222689h;
        Object objE = uq.b.e();
        int i17 = dVar.f222691k;
        try {
            if (i17 == 0) {
                oq.u.b(obj);
                iv4 = cipher.getIV();
                if (getDebuggable()) {
                    px.f fVar = px.f.f163100a;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Cipher encrypt:\nplain data: ");
                    sb5.append(Arrays.toString(bArr));
                    sb5.append("\ncipher: ");
                    sb5.append(cipher);
                    sb5.append("\nalgorithm: ");
                    sb5.append(aVar);
                    sb5.append("\niv: ");
                    sb5.append(iv4 != null ? Arrays.toString(iv4) : null);
                    fVar.b(sb5.toString(), px.c.a(this));
                }
                if (aVar.getSaltBytesLength() > 0) {
                    iy.w wVar = this.secureRandomFactory;
                    dVar.f222685d = bArr;
                    dVar.f222686e = cipher;
                    dVar.f222687f = aVar;
                    dVar.f222688g = iv4;
                    dVar.f222691k = 1;
                    objC = iy.w.c(wVar, null, dVar, 1, null);
                    if (objC == objE) {
                        return objE;
                    }
                } else {
                    bArr2 = new byte[0];
                }
                bArrDoFinal = cipher.doFinal(pq.n.H(bArr2, bArr));
                ivType = aVar.getIvType();
                if (ivType instanceof iy.r.a) {
                    bArrDoFinal = pq.n.H(bArrDoFinal, iv4);
                } else if (!(ivType instanceof iy.r.b)) {
                    if (ivType instanceof iy.r.c) {
                        throw new oq.p();
                    }
                    i15 = a.f222670a[((iy.r.c) ivType).getIvPlace().ordinal()];
                    if (i15 != 1) {
                        bArrDoFinal = pq.n.H(iv4, bArrDoFinal);
                    } else if (i15 != 2) {
                        bArrDoFinal = pq.n.H(bArrDoFinal, iv4);
                    } else if (i15 == 3) {
                        throw new oq.p();
                    }
                }
                return new dx.i.Right(bArrDoFinal);
            }
            if (i17 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byte[] bArr3 = (byte[]) dVar.f222688g;
            aVar = (iy.h.a) dVar.f222687f;
            cipher = (Cipher) dVar.f222686e;
            byte[] bArr4 = (byte[]) dVar.f222685d;
            oq.u.b(obj);
            iv4 = bArr3;
            bArr = bArr4;
            objC = obj;
            bArr2 = new byte[aVar.getSaltBytesLength()];
            ((SecureRandom) objC).nextBytes(bArr2);
            bArrDoFinal = cipher.doFinal(pq.n.H(bArr2, bArr));
            ivType = aVar.getIvType();
            if (ivType instanceof iy.r.a) {
                bArrDoFinal = pq.n.H(bArrDoFinal, iv4);
            } else if (!(ivType instanceof iy.r.b)) {
                if (ivType instanceof iy.r.c) {
                    throw new oq.p();
                }
                i15 = a.f222670a[((iy.r.c) ivType).getIvPlace().ordinal()];
                if (i15 != 1) {
                    bArrDoFinal = pq.n.H(iv4, bArrDoFinal);
                } else if (i15 != 2) {
                    bArrDoFinal = pq.n.H(bArrDoFinal, iv4);
                } else if (i15 == 3) {
                    throw new oq.p();
                }
            }
            return new dx.i.Right(bArrDoFinal);
        } catch (IllegalArgumentException e15) {
            return r(e15);
        } catch (IllegalStateException e16) {
            return r(e16);
        } catch (BadPaddingException e17) {
            return r(e17);
        } catch (IllegalBlockSizeException e18) {
            return r(e18);
        }
    }

    @Override // iy.g
    public Object h(byte[] bArr, Cipher cipher, iy.h.a aVar, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar) {
        byte[] bArrDoFinal;
        if (getDebuggable()) {
            px.f.f163100a.b("Cipher decrypt:\nencrypted data: " + Arrays.toString(bArr) + "\ncipher: " + cipher + "\nalgorithm: " + aVar + '\n', px.c.a(this));
        }
        try {
            if (!(aVar instanceof iy.h.a.b) && !(aVar instanceof iy.h.a.C2298a) && !(aVar instanceof iy.h.a.c)) {
                throw new oq.p();
            }
            iy.r ivType = aVar.getIvType();
            if (ivType instanceof iy.r.b) {
                bArrDoFinal = cipher.doFinal(bArr);
            } else if (ivType instanceof iy.r.c) {
                int i15 = a.f222670a[((iy.r.c) ivType).getIvPlace().ordinal()];
                if (i15 == 1) {
                    bArrDoFinal = cipher.doFinal(bArr, ((iy.r.c) ivType).getIvBytesLength(), bArr.length - ((iy.r.c) ivType).getIvBytesLength());
                } else if (i15 == 2) {
                    bArrDoFinal = cipher.doFinal(bArr, 0, bArr.length - ((iy.r.c) ivType).getIvBytesLength());
                } else {
                    if (i15 != 3) {
                        throw new oq.p();
                    }
                    bArrDoFinal = cipher.doFinal(bArr);
                }
            } else {
                if (!(ivType instanceof iy.r.a)) {
                    throw new oq.p();
                }
                bArrDoFinal = cipher.doFinal(bArr, 0, bArr.length - ((iy.r.a) ivType).getIvBytesLength());
            }
            return aVar.getSaltBytesLength() > 0 ? new dx.i.Right(pq.n.t(bArrDoFinal, aVar.getSaltBytesLength(), bArrDoFinal.length)) : new dx.i.Right(bArrDoFinal);
        } catch (IllegalArgumentException e15) {
            return r(e15);
        } catch (IndexOutOfBoundsException e16) {
            return r(e16);
        } catch (BadPaddingException e17) {
            return r(e17);
        } catch (IllegalBlockSizeException e18) {
            return r(e18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // iy.g
    public Object i(SecretKey secretKey, iy.h.a aVar, tq.e<? super dx.i<? extends dx.b, ? extends Cipher>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f222696h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f222696h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objO = eVar2.f222694f;
        Object objE = uq.b.e();
        int i16 = eVar2.f222696h;
        if (i16 == 0) {
            oq.u.b(objO);
            eVar2.f222692d = secretKey;
            eVar2.f222693e = aVar;
            eVar2.f222696h = 1;
            objO = o(aVar, eVar2);
            if (objO == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (iy.h.a) eVar2.f222693e;
            secretKey = (SecretKey) eVar2.f222692d;
            oq.u.b(objO);
        }
        dx.i iVar = (dx.i) objO;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        return q(1, secretKey, aVar.getTransformation(), (AlgorithmParameterSpec) ((dx.i.Right) iVar).b());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0117: INVOKE (r11 I:java.util.List) = (r4 I:java.lang.Object) STATIC call: px.c.a(java.lang.Object):java.util.List A[MD:(java.lang.Object):java.util.List<px.a$a> (m)], block:B:43:0x0117 */
    /* JADX WARN: Type inference failed for: r4v0, types: [dx.j, java.lang.Object] */
    @Override // iy.g
    public Object j(byte[] bArr, SecretKey secretKey, iy.h.a.c cVar, tq.e<? super dx.i<? extends dx.b, ? extends SecretKey>> eVar) throws Throwable {
        g gVar;
        ?? A;
        Object objB;
        String transformation;
        SecretKey secretKey2;
        ex.b bVar;
        ex.b bVar2;
        byte[] bArr2;
        int i15;
        iy.h.a.c cVar2;
        k kVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i16 = gVar.f222721z;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f222721z = i16 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object obj = gVar.f222719x;
        Object objE = uq.b.e();
        int i17 = gVar.f222721z;
        try {
            try {
                if (i17 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    ex.a aVar = new ex.a();
                    transformation = cVar.getTransformation();
                    gVar.f222702d = bArr;
                    gVar.f222703e = vq.j.a(secretKey);
                    gVar.f222704f = cVar;
                    gVar.f222705g = jVarA;
                    gVar.f222706h = vq.j.a(aVar);
                    gVar.f222707j = vq.j.a(aVar);
                    gVar.f222708k = aVar;
                    gVar.f222709l = transformation;
                    gVar.f222710m = secretKey;
                    gVar.f222711n = this;
                    gVar.f222712p = aVar;
                    gVar.f222713q = 0;
                    gVar.f222714r = 0;
                    gVar.f222715s = 0;
                    gVar.f222716t = 0;
                    gVar.f222717v = 0;
                    gVar.f222718w = 4;
                    gVar.f222721z = 1;
                    Object objO = o(cVar, gVar);
                    if (objO == objE) {
                        return objE;
                    }
                    secretKey2 = secretKey;
                    bVar = aVar;
                    bVar2 = bVar;
                    obj = objO;
                    bArr2 = bArr;
                    i15 = 4;
                    cVar2 = cVar;
                    kVar = this;
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i15 = gVar.f222718w;
                    bVar = (ex.b) gVar.f222712p;
                    kVar = (k) gVar.f222711n;
                    secretKey2 = (SecretKey) gVar.f222710m;
                    transformation = (String) gVar.f222709l;
                    bVar2 = (ex.b) gVar.f222708k;
                    cVar2 = (iy.h.a.c) gVar.f222704f;
                    bArr2 = (byte[]) gVar.f222702d;
                    try {
                        oq.u.b(obj);
                    } catch (CancellationException e15) {
                        throw e15;
                    }
                }
                dx.i<dx.b, Cipher> iVarQ = kVar.q(i15, secretKey2, transformation, (AlgorithmParameterSpec) bVar2.a((dx.i) obj));
                if (!(iVarQ instanceof dx.i.Left)) {
                    if (!(iVarQ instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    iVarQ = new dx.i.Right((SecretKey) ((Cipher) ((dx.i.Right) iVarQ).b()).unwrap(bArr2, cVar2.getWrappedKeyAlgorithm(), cVar2.getWrappedKeyType()));
                }
                return new dx.i.Right((SecretKey) bVar.a(iVarQ));
            } catch (Exception e16) {
                px.f fVar = px.f.f163100a;
                String message = e16.getMessage();
                if (message == null) {
                    message = "";
                }
                fVar.d(message, e16, px.c.a(A));
                dx.i iVarA = A.a(e16);
                if (iVarA instanceof dx.i.Left) {
                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                } else {
                    if (!(iVarA instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    objB = ((dx.i.Right) iVarA).b();
                }
                return new dx.i.Left(objB);
            }
        } catch (ex.c e17) {
            return new dx.i.Left((dx.b) ex.d.a(e17));
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public boolean getDebuggable() {
        return this.debuggable;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public String getExplicitProvider() {
        return this.explicitProvider;
    }
}
