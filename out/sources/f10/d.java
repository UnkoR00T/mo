package f10;

import dx.i;
import dx.j;
import h10.DecodedPasswordKeyData;
import iy.a0;
import iy.b0;
import iy.c0;
import java.util.concurrent.CancellationException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import qy.MasterKeyModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00160\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001c0\u0018H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001f0\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b \u0010!J<\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001c0\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\"\u0010\u001bJ<\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020#0\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b$\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010+¨\u0006,"}, d2 = {"Lf10/d;", "Lf10/c;", "Lpy/b;", "aesKeyGenerator", "Lpy/a;", "aesKeyDecoder", "Lg10/c;", "passwordKeyGenerator", "Lf10/e;", "masterKeyWrapper", "Lg10/a;", "passwordDataDeviceKeyCipher", "Lwy/a;", "masterKeyProvider", "<init>", "(Lpy/b;Lpy/a;Lg10/c;Lf10/e;Lg10/a;Lwy/a;)V", "Liy/b0;", "password", "Lqy/b;", "wrappedMasterKey", "", "encryptedPasswordKeyData", "Ljavax/crypto/SecretKey;", "deviceKey", "Ldx/i;", "Ldx/b;", "f", "(Liy/b0;Liy/a0;[BLjavax/crypto/SecretKey;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "c", "(Ltq/e;)Ljava/lang/Object;", "Lqy/a;", "b", "(Liy/b0;Ljavax/crypto/SecretKey;Ltq/e;)Ljava/lang/Object;", "d", "", "a", "Lpy/b;", "Lpy/a;", "Lg10/c;", "Lf10/e;", "e", "Lg10/a;", "Lwy/a;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f10.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final py.b aesKeyGenerator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final py.a aesKeyDecoder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g10.c passwordKeyGenerator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f10.e masterKeyWrapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g10.a passwordDataDeviceKeyCipher;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final wy.a masterKeyProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f54974d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f54975e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f54976f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f54977g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f54978h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f54979j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f54980k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f54981l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f54982m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f54983n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f54984p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f54985q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f54986r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f54987s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f54988t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f54990w;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f54988t = obj;
            this.f54990w |= PKIFailureInfo.systemUnavail;
            return d.this.b(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f54991d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f54992e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f54993f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f54994g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f54995h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f54996j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f54997k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f54998l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f54999m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f55000n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f55002q;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f55000n = obj;
            this.f55002q |= PKIFailureInfo.systemUnavail;
            return d.this.c(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f55003d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f55004e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f55005f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f55006g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f55007h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f55008j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f55009k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f55010l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f55011m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f55012n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f55013p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f55014q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f55015r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f55016s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f55018v;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f55016s = obj;
            this.f55018v |= PKIFailureInfo.systemUnavail;
            return d.this.d(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: f10.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1298d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f55019d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f55020e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f55021f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f55022g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f55023h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f55024j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f55025k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f55026l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f55027m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f55028n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f55029p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f55030q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f55031r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f55032s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f55033t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f55034v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f55036x;

        C1298d(tq.e<? super C1298d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f55034v = obj;
            this.f55036x |= PKIFailureInfo.systemUnavail;
            return d.this.f(null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f55037d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f55038e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f55039f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f55040g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f55041h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f55042j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f55043k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f55044l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f55045m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f55046n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f55047p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f55048q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f55049r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f55050s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f55052v;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f55050s = obj;
            this.f55052v |= PKIFailureInfo.systemUnavail;
            return d.this.a(null, null, null, null, this);
        }
    }

    public d(py.b bVar, py.a aVar, g10.c cVar, f10.e eVar, g10.a aVar2, wy.a aVar3) {
        this.aesKeyGenerator = bVar;
        this.aesKeyDecoder = aVar;
        this.passwordKeyGenerator = cVar;
        this.masterKeyWrapper = eVar;
        this.passwordDataDeviceKeyCipher = aVar2;
        this.masterKeyProvider = aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:51:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:52:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:58:0x022e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0273  */
    /* JADX WARN: Code duplicated, block: B:88:0x0284  */
    /* JADX WARN: Code duplicated, block: B:89:0x0292  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:91:0x0296  */
    /* JADX WARN: Code duplicated, block: B:94:0x02a3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final Object f(b0 b0Var, a0 a0Var, byte[] bArr, SecretKey secretKey, tq.e<? super i<? extends dx.b, ? extends SecretKey>> eVar) throws Throwable {
        C1298d c1298d;
        String message;
        i iVarA;
        Object objB;
        b0 b0Var2;
        a0 a0Var2;
        byte[] bArr2;
        ex.b bVar;
        ex.b bVar2;
        ex.b bVar3;
        Object obj;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        SecretKey secretKey2;
        DecodedPasswordKeyData decodedPasswordKeyData;
        byte[] bArr3;
        Object objA;
        DecodedPasswordKeyData decodedPasswordKeyData2;
        byte[] bArr4;
        SecretKey secretKey3;
        ex.b bVar4;
        ex.b bVar5;
        if (eVar instanceof C1298d) {
            c1298d = (C1298d) eVar;
            int i25 = c1298d.f55036x;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                c1298d.f55036x = i25 - PKIFailureInfo.systemUnavail;
            } else {
                c1298d = new C1298d(eVar);
            }
        } else {
            c1298d = new C1298d(eVar);
        }
        C1298d c1298d2 = c1298d;
        Object objB2 = c1298d2.f55034v;
        Object objE = uq.b.e();
        ?? r15 = c1298d2.f55036x;
        try {
            try {
                try {
                    if (r15 == 0) {
                        u.b(objB2);
                        j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            g10.a aVar2 = this.passwordDataDeviceKeyCipher;
                            b0Var2 = b0Var;
                            c1298d2.f55019d = b0Var2;
                            a0Var2 = a0Var;
                            c1298d2.f55020e = a0Var2;
                            c1298d2.f55021f = vq.j.a(bArr);
                            c1298d2.f55022g = secretKey;
                            c1298d2.f55023h = jVarA;
                            c1298d2.f55024j = vq.j.a(aVar);
                            c1298d2.f55025k = aVar;
                            c1298d2.f55026l = aVar;
                            c1298d2.f55029p = 0;
                            c1298d2.f55030q = 0;
                            c1298d2.f55031r = 0;
                            c1298d2.f55032s = 0;
                            c1298d2.f55033t = 0;
                            c1298d2.f55036x = 1;
                            Object objC = g10.a.c(aVar2, bArr, secretKey, 0, c1298d2, 4, null);
                            if (objC != objE) {
                                bArr2 = bArr;
                                bVar = aVar;
                                bVar2 = bVar;
                                bVar3 = bVar2;
                                obj = objC;
                                r15 = jVarA;
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                                i19 = 0;
                                secretKey2 = secretKey;
                                decodedPasswordKeyData = (DecodedPasswordKeyData) bVar.a((i) obj);
                                g10.c cVar = this.passwordKeyGenerator;
                                bArr3 = bArr2;
                                g10.c.a.Specific specific = new g10.c.a.Specific(b0Var2, decodedPasswordKeyData.getIterations(), decodedPasswordKeyData.getSalt());
                                c1298d2.f55019d = vq.j.a(b0Var2);
                                c1298d2.f55020e = a0Var2;
                                c1298d2.f55021f = vq.j.a(bArr3);
                                c1298d2.f55022g = secretKey2;
                                c1298d2.f55023h = r15;
                                c1298d2.f55024j = vq.j.a(bVar3);
                                c1298d2.f55025k = bVar2;
                                c1298d2.f55026l = bVar2;
                                c1298d2.f55027m = vq.j.a(decodedPasswordKeyData);
                                c1298d2.f55029p = i19;
                                c1298d2.f55030q = i18;
                                c1298d2.f55031r = i17;
                                c1298d2.f55032s = i16;
                                c1298d2.f55033t = i15;
                                c1298d2.f55036x = 2;
                                objA = cVar.a(specific, c1298d2);
                                if (objA == objE) {
                                    decodedPasswordKeyData2 = decodedPasswordKeyData;
                                    bArr4 = bArr3;
                                    secretKey3 = secretKey2;
                                    bVar4 = bVar2;
                                    r15 = r15;
                                    g10.c.PasswordKeyResult passwordKeyResult = (g10.c.PasswordKeyResult) bVar4.a((i) objA);
                                    f10.e eVar2 = this.masterKeyWrapper;
                                    byte[] bArr5 = bArr4;
                                    SecretKey passwordKey = passwordKeyResult.getPasswordKey();
                                    c1298d2.f55019d = vq.j.a(b0Var2);
                                    c1298d2.f55020e = vq.j.a(a0Var2);
                                    c1298d2.f55021f = vq.j.a(bArr5);
                                    c1298d2.f55022g = vq.j.a(secretKey3);
                                    c1298d2.f55023h = r15;
                                    c1298d2.f55024j = vq.j.a(bVar3);
                                    c1298d2.f55025k = vq.j.a(bVar2);
                                    c1298d2.f55026l = bVar2;
                                    c1298d2.f55027m = vq.j.a(decodedPasswordKeyData2);
                                    c1298d2.f55028n = vq.j.a(passwordKeyResult);
                                    c1298d2.f55029p = i19;
                                    c1298d2.f55030q = i18;
                                    c1298d2.f55031r = i17;
                                    c1298d2.f55032s = i16;
                                    c1298d2.f55033t = i15;
                                    c1298d2.f55036x = 3;
                                    objB2 = eVar2.b(a0Var2, passwordKey, secretKey3, c1298d2);
                                    if (objB2 != objE) {
                                        bVar5 = bVar2;
                                        return new i.Right((SecretKey) bVar5.a((i) objB2));
                                    }
                                }
                            }
                            return objE;
                        } catch (ex.c e15) {
                            e = e15;
                            return new i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVarA;
                            px.f fVar = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(r15));
                            iVarA = r15.a(e);
                            if (iVarA instanceof i.Left) {
                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof i.Right) {
                                    throw new p();
                                }
                                objB = ((i.Right) iVarA).b();
                            }
                            return new i.Left(objB);
                        }
                    }
                    if (r15 != 1) {
                        if (r15 == 2) {
                            int i26 = c1298d2.f55033t;
                            int i27 = c1298d2.f55032s;
                            int i28 = c1298d2.f55031r;
                            int i29 = c1298d2.f55030q;
                            int i35 = c1298d2.f55029p;
                            decodedPasswordKeyData2 = (DecodedPasswordKeyData) c1298d2.f55027m;
                            ex.b bVar6 = (ex.b) c1298d2.f55026l;
                            ex.b bVar7 = (ex.b) c1298d2.f55025k;
                            ex.b bVar8 = (ex.b) c1298d2.f55024j;
                            j jVar = (j) c1298d2.f55023h;
                            SecretKey secretKey4 = (SecretKey) c1298d2.f55022g;
                            byte[] bArr6 = (byte[]) c1298d2.f55021f;
                            a0 a0Var3 = (a0) c1298d2.f55020e;
                            b0 b0Var3 = (b0) c1298d2.f55019d;
                            try {
                                u.b(objB2);
                                b0Var2 = b0Var3;
                                objA = objB2;
                                bVar3 = bVar8;
                                bVar4 = bVar6;
                                bArr4 = bArr6;
                                i19 = i35;
                                i18 = i29;
                                i17 = i28;
                                i16 = i27;
                                i15 = i26;
                                r15 = jVar;
                                secretKey3 = secretKey4;
                                bVar2 = bVar7;
                                a0Var2 = a0Var3;
                                g10.c.PasswordKeyResult passwordKeyResult2 = (g10.c.PasswordKeyResult) bVar4.a((i) objA);
                                try {
                                    f10.e eVar3 = this.masterKeyWrapper;
                                    byte[] bArr7 = bArr4;
                                    SecretKey passwordKey2 = passwordKeyResult2.getPasswordKey();
                                    c1298d2.f55019d = vq.j.a(b0Var2);
                                    c1298d2.f55020e = vq.j.a(a0Var2);
                                    c1298d2.f55021f = vq.j.a(bArr7);
                                    c1298d2.f55022g = vq.j.a(secretKey3);
                                    c1298d2.f55023h = r15;
                                    c1298d2.f55024j = vq.j.a(bVar3);
                                    c1298d2.f55025k = vq.j.a(bVar2);
                                    c1298d2.f55026l = bVar2;
                                    c1298d2.f55027m = vq.j.a(decodedPasswordKeyData2);
                                    c1298d2.f55028n = vq.j.a(passwordKeyResult2);
                                    c1298d2.f55029p = i19;
                                    c1298d2.f55030q = i18;
                                    c1298d2.f55031r = i17;
                                    c1298d2.f55032s = i16;
                                    c1298d2.f55033t = i15;
                                    c1298d2.f55036x = 3;
                                    objB2 = eVar3.b(a0Var2, passwordKey2, secretKey3, c1298d2);
                                    if (objB2 != objE) {
                                        bVar5 = bVar2;
                                    }
                                    return objE;
                                } catch (ex.c e18) {
                                    e = e18;
                                    return new i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e19) {
                                    throw e19;
                                }
                            } catch (ex.c e25) {
                                e = e25;
                                return new i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e26) {
                                throw e26;
                            } catch (Exception e27) {
                                e = e27;
                                r15 = jVar;
                                px.f fVar2 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar2.d(message, e, px.c.a(r15));
                                iVarA = r15.a(e);
                                if (iVarA instanceof i.Left) {
                                    objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof i.Right) {
                                        throw new p();
                                    }
                                    objB = ((i.Right) iVarA).b();
                                }
                                return new i.Left(objB);
                            }
                        }
                        if (r15 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar5 = (ex.b) c1298d2.f55026l;
                        u.b(objB2);
                        return new i.Right((SecretKey) bVar5.a((i) objB2));
                    }
                    int i36 = c1298d2.f55033t;
                    int i37 = c1298d2.f55032s;
                    int i38 = c1298d2.f55031r;
                    int i39 = c1298d2.f55030q;
                    int i45 = c1298d2.f55029p;
                    ex.b bVar9 = (ex.b) c1298d2.f55026l;
                    ex.b bVar10 = (ex.b) c1298d2.f55025k;
                    ex.b bVar11 = (ex.b) c1298d2.f55024j;
                    j jVar2 = (j) c1298d2.f55023h;
                    secretKey2 = (SecretKey) c1298d2.f55022g;
                    bArr2 = (byte[]) c1298d2.f55021f;
                    a0 a0Var4 = (a0) c1298d2.f55020e;
                    b0Var2 = (b0) c1298d2.f55019d;
                    try {
                        u.b(objB2);
                        i15 = i36;
                        obj = objB2;
                        bVar3 = bVar11;
                        i19 = i45;
                        i17 = i38;
                        i16 = i37;
                        r15 = jVar2;
                        a0Var2 = a0Var4;
                        bVar2 = bVar10;
                        bVar = bVar9;
                        i18 = i39;
                        decodedPasswordKeyData = (DecodedPasswordKeyData) bVar.a((i) obj);
                        g10.c cVar2 = this.passwordKeyGenerator;
                        bArr3 = bArr2;
                        try {
                            g10.c.a.Specific specific2 = new g10.c.a.Specific(b0Var2, decodedPasswordKeyData.getIterations(), decodedPasswordKeyData.getSalt());
                            c1298d2.f55019d = vq.j.a(b0Var2);
                            c1298d2.f55020e = a0Var2;
                            c1298d2.f55021f = vq.j.a(bArr3);
                            c1298d2.f55022g = secretKey2;
                            c1298d2.f55023h = r15;
                            c1298d2.f55024j = vq.j.a(bVar3);
                            c1298d2.f55025k = bVar2;
                            c1298d2.f55026l = bVar2;
                            c1298d2.f55027m = vq.j.a(decodedPasswordKeyData);
                            c1298d2.f55029p = i19;
                            c1298d2.f55030q = i18;
                            c1298d2.f55031r = i17;
                            c1298d2.f55032s = i16;
                            c1298d2.f55033t = i15;
                            c1298d2.f55036x = 2;
                            objA = cVar2.a(specific2, c1298d2);
                            if (objA == objE) {
                                decodedPasswordKeyData2 = decodedPasswordKeyData;
                                bArr4 = bArr3;
                                secretKey3 = secretKey2;
                                bVar4 = bVar2;
                                r15 = r15;
                                g10.c.PasswordKeyResult passwordKeyResult3 = (g10.c.PasswordKeyResult) bVar4.a((i) objA);
                                f10.e eVar4 = this.masterKeyWrapper;
                                byte[] bArr8 = bArr4;
                                SecretKey passwordKey3 = passwordKeyResult3.getPasswordKey();
                                c1298d2.f55019d = vq.j.a(b0Var2);
                                c1298d2.f55020e = vq.j.a(a0Var2);
                                c1298d2.f55021f = vq.j.a(bArr8);
                                c1298d2.f55022g = vq.j.a(secretKey3);
                                c1298d2.f55023h = r15;
                                c1298d2.f55024j = vq.j.a(bVar3);
                                c1298d2.f55025k = vq.j.a(bVar2);
                                c1298d2.f55026l = bVar2;
                                c1298d2.f55027m = vq.j.a(decodedPasswordKeyData2);
                                c1298d2.f55028n = vq.j.a(passwordKeyResult3);
                                c1298d2.f55029p = i19;
                                c1298d2.f55030q = i18;
                                c1298d2.f55031r = i17;
                                c1298d2.f55032s = i16;
                                c1298d2.f55033t = i15;
                                c1298d2.f55036x = 3;
                                objB2 = eVar4.b(a0Var2, passwordKey3, secretKey3, c1298d2);
                                if (objB2 != objE) {
                                    bVar5 = bVar2;
                                    return new i.Right((SecretKey) bVar5.a((i) objB2));
                                }
                            }
                            return objE;
                        } catch (ex.c e28) {
                            e = e28;
                            return new i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e29) {
                            throw e29;
                        } catch (Exception e35) {
                            e = e35;
                            px.f fVar3 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar3.d(message, e, px.c.a(r15));
                            iVarA = r15.a(e);
                            if (iVarA instanceof i.Left) {
                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof i.Right) {
                                    throw new p();
                                }
                                objB = ((i.Right) iVarA).b();
                            }
                            return new i.Left(objB);
                        }
                    } catch (ex.c e36) {
                        e = e36;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e37) {
                        throw e37;
                    } catch (Exception e38) {
                        e = e38;
                        r15 = jVar2;
                        px.f fVar4 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar4.d(message, e, px.c.a(r15));
                        iVarA = r15.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof i.Right) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                } catch (Exception e39) {
                    e = e39;
                }
            } catch (CancellationException e45) {
                throw e45;
            }
        } catch (ex.c e46) {
            e = e46;
        } catch (CancellationException e47) {
            throw e47;
        } catch (Exception e48) {
            e = e48;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [f10.d] */
    @Override // f10.c
    public Object a(b0 b0Var, a0 a0Var, byte[] bArr, SecretKey secretKey, tq.e<? super i<? extends dx.b, Boolean>> eVar) throws Throwable {
        e eVar2;
        Exception exc;
        ?? r15;
        Object objB;
        ex.c cVar;
        ex.b bVar;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f55052v;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f55052v = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        e eVar3 = eVar2;
        Object obj = eVar3.f55050s;
        Object objE = uq.b.e();
        int i16 = eVar3.f55052v;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        eVar3.f55037d = vq.j.a(b0Var);
                        eVar3.f55038e = vq.j.a(a0Var);
                        eVar3.f55039f = vq.j.a(bArr);
                        eVar3.f55040g = vq.j.a(secretKey);
                        eVar3.f55041h = jVarA;
                        eVar3.f55042j = vq.j.a(aVar);
                        eVar3.f55043k = vq.j.a(aVar);
                        eVar3.f55044l = aVar;
                        eVar3.f55045m = 0;
                        eVar3.f55046n = 0;
                        eVar3.f55047p = 0;
                        eVar3.f55048q = 0;
                        eVar3.f55049r = 0;
                        eVar3.f55052v = 1;
                        Object objF = f(b0Var, a0Var, bArr, secretKey, eVar3);
                        if (objF == objE) {
                            return objE;
                        }
                        obj = objF;
                        bVar = aVar;
                    } catch (ex.c e15) {
                        cVar = e15;
                        return new i.Left((dx.b) ex.d.a(cVar));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        exc = e17;
                        r15 = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = exc.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, exc, px.c.a(r15));
                        i iVarA = r15.a(exc);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof i.Right)) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) eVar3.f55044l;
                    try {
                        u.b(obj);
                    } catch (ex.c e18) {
                        cVar = e18;
                        return new i.Left((dx.b) ex.d.a(cVar));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                bVar.a((i) obj);
                return new i.Right(vq.b.a(true));
            } catch (Exception e25) {
                exc = e25;
                r15 = a0Var;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x020d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0241  */
    /* JADX WARN: Code duplicated, block: B:67:0x0252  */
    /* JADX WARN: Code duplicated, block: B:68:0x0260  */
    /* JADX WARN: Code duplicated, block: B:70:0x0264  */
    /* JADX WARN: Code duplicated, block: B:73:0x0270  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // f10.c
    public Object b(b0 b0Var, SecretKey secretKey, tq.e<? super i<? extends dx.b, MasterKeyModel>> eVar) throws Throwable {
        a aVar;
        String message;
        i iVarA;
        Object objB;
        ex.b aVar2;
        ex.b bVar;
        SecretKey secretKey2;
        b0 b0Var2;
        int i15;
        Object obj;
        ex.b bVar2;
        int i16;
        int i17;
        j<dx.b> jVarA;
        SecretKeySpec secretKeySpec;
        int i18;
        int i19;
        int i25;
        int i26;
        g10.c.PasswordKeyResult passwordKeyResult;
        SecretKeySpec secretKeySpec2;
        ex.b bVar3;
        j<dx.b> jVar;
        b0 b0Var3;
        Object obj2;
        int i27;
        a0 a0Var;
        ex.b bVar4;
        a0 value;
        Object objD;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i28 = aVar.f54990w;
            if ((i28 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f54990w = i28 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        a aVar3 = aVar;
        Object obj3 = aVar3.f54988t;
        Object objE = uq.b.e();
        int i29 = aVar3.f54990w;
        ?? r15 = 3;
        try {
            try {
                if (i29 == 0) {
                    u.b(obj3);
                    jVarA = xw.c.f221622a.a();
                    aVar2 = new ex.a();
                    SecretKeySpec secretKeySpec3 = (SecretKeySpec) aVar2.a(this.aesKeyDecoder.a(this.masterKeyProvider.c().getData()));
                    g10.c cVar = this.passwordKeyGenerator;
                    g10.c.a.New r16 = new g10.c.a.New(b0Var);
                    aVar3.f54974d = vq.j.a(b0Var);
                    aVar3.f54975e = secretKey;
                    aVar3.f54976f = jVarA;
                    aVar3.f54977g = vq.j.a(aVar2);
                    aVar3.f54978h = aVar2;
                    aVar3.f54979j = secretKeySpec3;
                    aVar3.f54980k = aVar2;
                    i16 = 0;
                    aVar3.f54983n = 0;
                    aVar3.f54984p = 0;
                    aVar3.f54985q = 0;
                    aVar3.f54986r = 0;
                    aVar3.f54987s = 0;
                    aVar3.f54990w = 1;
                    Object objA = cVar.a(r16, aVar3);
                    if (objA != objE) {
                        secretKeySpec = secretKeySpec3;
                        obj = objA;
                        bVar2 = aVar2;
                        b0Var2 = b0Var;
                        secretKey2 = secretKey;
                        i15 = 0;
                        i17 = 0;
                        i19 = 0;
                        i18 = 0;
                        bVar = bVar2;
                    }
                    return objE;
                }
                try {
                    if (i29 != 1) {
                        if (i29 == 2) {
                            int i35 = aVar3.f54987s;
                            i25 = aVar3.f54986r;
                            i17 = aVar3.f54985q;
                            i19 = aVar3.f54984p;
                            i26 = aVar3.f54983n;
                            passwordKeyResult = (g10.c.PasswordKeyResult) aVar3.f54981l;
                            bVar = (ex.b) aVar3.f54980k;
                            secretKeySpec2 = (SecretKeySpec) aVar3.f54979j;
                            bVar3 = (ex.b) aVar3.f54978h;
                            ex.b bVar5 = (ex.b) aVar3.f54977g;
                            jVar = (j) aVar3.f54976f;
                            SecretKey secretKey3 = (SecretKey) aVar3.f54975e;
                            b0 b0Var4 = (b0) aVar3.f54974d;
                            try {
                                u.b(obj3);
                                b0Var3 = b0Var4;
                                obj2 = obj3;
                                bVar2 = bVar5;
                                secretKey2 = secretKey3;
                                i27 = i35;
                                value = ((qy.b) bVar.a((i) obj2)).getValue();
                                b0 b0Var5 = b0Var3;
                                g10.a aVar4 = this.passwordDataDeviceKeyCipher;
                                int iterationsCount = passwordKeyResult.getIterationsCount();
                                a0 salt = passwordKeyResult.getSalt();
                                aVar3.f54974d = vq.j.a(b0Var5);
                                aVar3.f54975e = vq.j.a(secretKey2);
                                aVar3.f54976f = jVar;
                                aVar3.f54977g = vq.j.a(bVar2);
                                aVar3.f54978h = vq.j.a(bVar3);
                                aVar3.f54979j = vq.j.a(secretKeySpec2);
                                aVar3.f54980k = bVar3;
                                aVar3.f54981l = vq.j.a(passwordKeyResult);
                                aVar3.f54982m = value;
                                aVar3.f54983n = i26;
                                aVar3.f54984p = i19;
                                aVar3.f54985q = i17;
                                aVar3.f54986r = i25;
                                aVar3.f54987s = i27;
                                aVar3.f54990w = 3;
                                objD = g10.a.d(aVar4, secretKey2, iterationsCount, salt, 0, aVar3, 8, null);
                                if (objD != objE) {
                                    a0Var = value;
                                    obj3 = objD;
                                    bVar4 = bVar3;
                                }
                                return objE;
                            } catch (ex.c e15) {
                                e = e15;
                                return new i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVar;
                                px.f fVar = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(r15));
                                iVarA = r15.a(e);
                                if (iVarA instanceof i.Left) {
                                    objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof i.Right) {
                                        throw new p();
                                    }
                                    objB = ((i.Right) iVarA).b();
                                }
                                return new i.Left(objB);
                            }
                        }
                        if (i29 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a0Var = (a0) aVar3.f54982m;
                        bVar4 = (ex.b) aVar3.f54980k;
                        u.b(obj3);
                        return new i.Right(new MasterKeyModel(a0Var, ((sy.a) bVar4.a((i) obj3)).getValue(), null));
                    }
                    int i36 = aVar3.f54987s;
                    int i37 = aVar3.f54986r;
                    int i38 = aVar3.f54985q;
                    int i39 = aVar3.f54984p;
                    int i45 = aVar3.f54983n;
                    aVar2 = (ex.b) aVar3.f54980k;
                    SecretKeySpec secretKeySpec4 = (SecretKeySpec) aVar3.f54979j;
                    bVar = (ex.b) aVar3.f54978h;
                    ex.b bVar6 = (ex.b) aVar3.f54977g;
                    j<dx.b> jVar2 = (j) aVar3.f54976f;
                    secretKey2 = (SecretKey) aVar3.f54975e;
                    b0Var2 = (b0) aVar3.f54974d;
                    try {
                        u.b(obj3);
                        i15 = i36;
                        obj = obj3;
                        bVar2 = bVar6;
                        i16 = i37;
                        i17 = i38;
                        jVarA = jVar2;
                        secretKeySpec = secretKeySpec4;
                        i18 = i45;
                        i19 = i39;
                    } catch (ex.c e18) {
                        e = e18;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    } catch (Exception e25) {
                        e = e25;
                        r15 = jVar2;
                        px.f fVar2 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, e, px.c.a(r15));
                        iVarA = r15.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof i.Right) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                } catch (CancellationException e26) {
                    throw e26;
                }
                g10.c.PasswordKeyResult passwordKeyResult2 = (g10.c.PasswordKeyResult) aVar2.a((i) obj);
                f10.e eVar2 = this.masterKeyWrapper;
                SecretKey passwordKey = passwordKeyResult2.getPasswordKey();
                b0 b0Var6 = b0Var2;
                aVar3.f54974d = vq.j.a(b0Var6);
                aVar3.f54975e = secretKey2;
                aVar3.f54976f = jVarA;
                aVar3.f54977g = vq.j.a(bVar2);
                aVar3.f54978h = bVar;
                aVar3.f54979j = vq.j.a(secretKeySpec);
                aVar3.f54980k = bVar;
                aVar3.f54981l = passwordKeyResult2;
                aVar3.f54983n = i18;
                aVar3.f54984p = i19;
                aVar3.f54985q = i17;
                aVar3.f54986r = i16;
                aVar3.f54987s = i15;
                aVar3.f54990w = 2;
                Object objA2 = eVar2.a(secretKeySpec, passwordKey, secretKey2, aVar3);
                if (objA2 != objE) {
                    jVar = jVarA;
                    i26 = i18;
                    passwordKeyResult = passwordKeyResult2;
                    i27 = i15;
                    obj2 = objA2;
                    i25 = i16;
                    secretKeySpec2 = secretKeySpec;
                    b0Var3 = b0Var6;
                    bVar3 = bVar;
                    value = ((qy.b) bVar.a((i) obj2)).getValue();
                    b0 b0Var7 = b0Var3;
                    g10.a aVar5 = this.passwordDataDeviceKeyCipher;
                    int iterationsCount2 = passwordKeyResult.getIterationsCount();
                    a0 salt2 = passwordKeyResult.getSalt();
                    aVar3.f54974d = vq.j.a(b0Var7);
                    aVar3.f54975e = vq.j.a(secretKey2);
                    aVar3.f54976f = jVar;
                    aVar3.f54977g = vq.j.a(bVar2);
                    aVar3.f54978h = vq.j.a(bVar3);
                    aVar3.f54979j = vq.j.a(secretKeySpec2);
                    aVar3.f54980k = bVar3;
                    aVar3.f54981l = vq.j.a(passwordKeyResult);
                    aVar3.f54982m = value;
                    aVar3.f54983n = i26;
                    aVar3.f54984p = i19;
                    aVar3.f54985q = i17;
                    aVar3.f54986r = i25;
                    aVar3.f54987s = i27;
                    aVar3.f54990w = 3;
                    objD = g10.a.d(aVar5, secretKey2, iterationsCount2, salt2, 0, aVar3, 8, null);
                    if (objD != objE) {
                        a0Var = value;
                        obj3 = objD;
                        bVar4 = bVar3;
                        return new i.Right(new MasterKeyModel(a0Var, ((sy.a) bVar4.a((i) obj3)).getValue(), null));
                    }
                }
                return objE;
            } catch (Exception e27) {
                e = e27;
            }
        } catch (ex.c e28) {
            e = e28;
        } catch (CancellationException e29) {
            throw e29;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [f10.d$b, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [py.b] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // f10.c
    public Object c(tq.e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        ?? bVar;
        Object objB;
        ex.c e15;
        ex.b bVar2;
        if (eVar instanceof b) {
            b bVar3 = (b) eVar;
            int i15 = bVar3.f55002q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar3.f55002q = i15 - PKIFailureInfo.systemUnavail;
                bVar = bVar3;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f55000n;
        Object objE = uq.b.e();
        int i16 = bVar.f55002q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ?? r15 = this.aesKeyGenerator;
                        py.d.b bVar4 = py.d.b.f163155c;
                        bVar.f54996j = jVarA;
                        bVar.f54997k = vq.j.a(aVar);
                        bVar.f54998l = vq.j.a(aVar);
                        bVar.f54999m = aVar;
                        bVar.f54991d = 0;
                        bVar.f54992e = 0;
                        bVar.f54993f = 0;
                        bVar.f54994g = 0;
                        bVar.f54995h = 0;
                        bVar.f55002q = 1;
                        Object objA = r15.a(bVar4, bVar);
                        if (objA == objE) {
                            return objE;
                        }
                        obj = objA;
                        bVar2 = aVar;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        bVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(bVar));
                        i iVarA = bVar.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof i.Right)) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = (ex.b) bVar.f54999m;
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                this.masterKeyProvider.b(c0.f(((SecretKey) bVar2.a((i) obj)).getEncoded()));
                return new i.Right(i0.f148189a);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd A[Catch: Exception -> 0x00e9, c -> 0x00ec, CancellationException -> 0x00ef, TryCatch #6 {Exception -> 0x00e9, blocks: (B:30:0x00b6, B:36:0x00dd, B:33:0x00bd, B:35:0x00c1, B:43:0x00f2, B:44:0x00f7, B:57:0x010d, B:60:0x011c), top: B:75:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1 A[Catch: Exception -> 0x00e9, c -> 0x00ec, CancellationException -> 0x00ef, TryCatch #6 {Exception -> 0x00e9, blocks: (B:30:0x00b6, B:36:0x00dd, B:33:0x00bd, B:35:0x00c1, B:43:0x00f2, B:44:0x00f7, B:57:0x010d, B:60:0x011c), top: B:75:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f2 A[Catch: Exception -> 0x00e9, c -> 0x00ec, CancellationException -> 0x00ef, TryCatch #6 {Exception -> 0x00e9, blocks: (B:30:0x00b6, B:36:0x00dd, B:33:0x00bd, B:35:0x00c1, B:43:0x00f2, B:44:0x00f7, B:57:0x010d, B:60:0x011c), top: B:75:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0125  */
    /* JADX WARN: Code duplicated, block: B:66:0x0136  */
    /* JADX WARN: Code duplicated, block: B:67:0x0144  */
    /* JADX WARN: Code duplicated, block: B:69:0x0148  */
    /* JADX WARN: Code duplicated, block: B:72:0x0154  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v7 */
    @Override // f10.c
    public Object d(b0 b0Var, a0 a0Var, byte[] bArr, SecretKey secretKey, tq.e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        c cVar;
        Exception exc;
        ?? r15;
        String message;
        i iVarA;
        Object objB;
        ex.c cVar2;
        d dVar;
        ex.b bVar;
        Object right;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f55018v;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f55018v = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        c cVar3 = cVar;
        Object obj = cVar3.f55016s;
        Object objE = uq.b.e();
        int i16 = cVar3.f55018v;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        cVar3.f55003d = vq.j.a(b0Var);
                        cVar3.f55004e = vq.j.a(a0Var);
                        cVar3.f55005f = vq.j.a(bArr);
                        cVar3.f55006g = vq.j.a(secretKey);
                        cVar3.f55007h = jVarA;
                        cVar3.f55008j = vq.j.a(aVar);
                        cVar3.f55009k = vq.j.a(aVar);
                        cVar3.f55010l = aVar;
                        cVar3.f55011m = 0;
                        cVar3.f55012n = 0;
                        cVar3.f55013p = 0;
                        cVar3.f55014q = 0;
                        cVar3.f55015r = 0;
                        cVar3.f55018v = 1;
                        dVar = this;
                        try {
                            Object objF = dVar.f(b0Var, a0Var, bArr, secretKey, cVar3);
                            if (objF == objE) {
                                return objE;
                            }
                            obj = objF;
                            bVar = aVar;
                            right = (i) obj;
                            if (!(right instanceof i.Left)) {
                                if (right instanceof i.Right) {
                                    throw new p();
                                }
                                dVar.masterKeyProvider.b(c0.f(((SecretKey) ((i.Right) right).b()).getEncoded()));
                                right = new i.Right(i0.f148189a);
                            }
                            bVar.a(right);
                            return new i.Right(i0.f148189a);
                        } catch (ex.c e15) {
                            e = e15;
                            cVar2 = e;
                        } catch (CancellationException e16) {
                            e = e16;
                            throw e;
                        } catch (Exception e17) {
                            e = e17;
                            exc = e;
                            r15 = jVarA;
                            px.f fVar = px.f.f163100a;
                            message = exc.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, exc, px.c.a(r15));
                            iVarA = r15.a(exc);
                            if (iVarA instanceof i.Left) {
                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof i.Right) {
                                    throw new p();
                                }
                                objB = ((i.Right) iVarA).b();
                            }
                            return new i.Left(objB);
                        }
                    } catch (ex.c e18) {
                        e = e18;
                    } catch (CancellationException e19) {
                        e = e19;
                    } catch (Exception e25) {
                        e = e25;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) cVar3.f55010l;
                    j jVar = (j) cVar3.f55007h;
                    try {
                        u.b(obj);
                        dVar = this;
                        try {
                            right = (i) obj;
                            if (!(right instanceof i.Left)) {
                                if (right instanceof i.Right) {
                                    throw new p();
                                }
                                dVar.masterKeyProvider.b(c0.f(((SecretKey) ((i.Right) right).b()).getEncoded()));
                                right = new i.Right(i0.f148189a);
                            }
                            bVar.a(right);
                            return new i.Right(i0.f148189a);
                        } catch (ex.c e26) {
                            cVar2 = e26;
                        } catch (CancellationException e27) {
                            throw e27;
                        }
                    } catch (ex.c e28) {
                        cVar2 = e28;
                    } catch (CancellationException e29) {
                        throw e29;
                    } catch (Exception e35) {
                        exc = e35;
                        r15 = jVar;
                        px.f fVar2 = px.f.f163100a;
                        message = exc.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, exc, px.c.a(r15));
                        iVarA = r15.a(exc);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof i.Right) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                }
                return new i.Left((dx.b) ex.d.a(cVar2));
            } catch (Exception e36) {
                exc = e36;
                r15 = a0Var;
            }
        } catch (CancellationException e37) {
            throw e37;
        }
    }
}
