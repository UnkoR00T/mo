package dx0;

import fr.t;
import iy.a0;
import iy.b0;
import iy.q;
import iy.r;
import java.security.PrivateKey;
import java.util.concurrent.CancellationException;
import javax.crypto.SecretKey;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import th0.CertContainer;
import y00.h0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0019\u001bB?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Ldx0/h;", "", "Ldx0/h$a;", "Ldx0/h$b;", "Lpy/a;", "aesKeyDecoder", "Liy/a;", "base64Coder", "Liy/c;", "bytesConverter", "Ly00/h0;", "securityProviderFactory", "Liy/i;", "cipherRsa", "Liy/g;", "cipherAes", "Lpx/d;", "remoteLogger", "<init>", "(Lpy/a;Liy/a;Liy/c;Ly00/h0;Liy/i;Liy/g;Lpx/d;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Ldx0/h$a;Ltq/e;)Ljava/lang/Object;", "a", "Lpy/a;", "b", "Liy/a;", "c", "Liy/c;", "Ly00/h0;", "e", "Liy/i;", "f", "Liy/g;", "g", "Lpx/d;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final py.a aesKeyDecoder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.c bytesConverter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h0 securityProviderFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final iy.i cipherRsa;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final iy.g cipherAes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: dx0.h$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Ldx0/h$a;", "Lgz/b$a;", "Lth0/f;", "userCertificate", "Ljava/security/PrivateKey;", "privateKey", "<init>", "(Lth0/f;Ljava/security/PrivateKey;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lth0/f;", "b", "()Lth0/f;", "Ljava/security/PrivateKey;", "()Ljava/security/PrivateKey;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CertContainer userCertificate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final PrivateKey privateKey;

        public Params(CertContainer certContainer, PrivateKey privateKey) {
            this.userCertificate = certContainer;
            this.privateKey = privateKey;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PrivateKey getPrivateKey() {
            return this.privateKey;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final CertContainer getUserCertificate() {
            return this.userCertificate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.userCertificate, params.userCertificate) && t.c(this.privateKey, params.privateKey);
        }

        public int hashCode() {
            return (this.userCertificate.hashCode() * 31) + this.privateKey.hashCode();
        }

        public String toString() {
            return "Params(userCertificate=" + this.userCertificate + ", privateKey=" + this.privateKey + ')';
        }
    }

    /* JADX INFO: renamed from: dx0.h$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Ldx0/h$b;", "", "Liy/a0;", "certPkcs12", "Liy/b0;", "password", "<init>", "(Liy/a0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/a0;", "()Liy/a0;", "b", "Liy/b0;", "()Liy/b0;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f45185c = b0.f97726c | a0.f97720c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final a0 certPkcs12;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 password;

        public Result(a0 a0Var, b0 b0Var) {
            this.certPkcs12 = a0Var;
            this.password = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a0 getCertPkcs12() {
            return this.certPkcs12;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getPassword() {
            return this.password;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return t.c(this.certPkcs12, result.certPkcs12) && t.c(this.password, result.password);
        }

        public int hashCode() {
            return (this.certPkcs12.hashCode() * 31) + this.password.hashCode();
        }

        public String toString() {
            return "Result(certPkcs12=" + this.certPkcs12 + ", password=" + this.password + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f45188d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f45189e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f45190f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f45191g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f45192h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f45193j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f45194k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f45195l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f45196m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f45197n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f45198p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f45199q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f45200r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f45201s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f45203v;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f45201s = obj;
            this.f45203v |= PKIFailureInfo.systemUnavail;
            return h.this.d(null, this);
        }
    }

    public h(py.a aVar, iy.a aVar2, iy.c cVar, h0 h0Var, iy.i iVar, iy.g gVar, px.d dVar) {
        this.aesKeyDecoder = aVar;
        this.base64Coder = aVar2;
        this.bytesConverter = cVar;
        this.securityProviderFactory = h0Var;
        this.cipherRsa = iVar;
        this.cipherAes = gVar;
        this.remoteLogger = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x015e A[Catch: Exception -> 0x0054, c -> 0x0057, CancellationException -> 0x005a, TryCatch #12 {Exception -> 0x0054, blocks: (B:14:0x004f, B:64:0x0270, B:66:0x0276, B:67:0x0288, B:69:0x029a, B:70:0x02ac, B:78:0x02d0, B:81:0x02df, B:47:0x0158, B:49:0x015e, B:51:0x0179), top: B:96:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0175  */
    /* JADX WARN: Code duplicated, block: B:55:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f7 A[Catch: Exception -> 0x0096, c -> 0x009a, CancellationException -> 0x009e, TryCatch #7 {c -> 0x009a, CancellationException -> 0x009e, Exception -> 0x0096, blocks: (B:25:0x008b, B:56:0x01f1, B:58:0x01f7, B:60:0x0212), top: B:102:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:59:0x020e  */
    /* JADX WARN: Code duplicated, block: B:63:0x026c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0276 A[Catch: Exception -> 0x0054, c -> 0x0057, CancellationException -> 0x005a, TryCatch #12 {Exception -> 0x0054, blocks: (B:14:0x004f, B:64:0x0270, B:66:0x0276, B:67:0x0288, B:69:0x029a, B:70:0x02ac, B:78:0x02d0, B:81:0x02df, B:47:0x0158, B:49:0x015e, B:51:0x0179), top: B:96:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x029a A[Catch: Exception -> 0x0054, c -> 0x0057, CancellationException -> 0x005a, TryCatch #12 {Exception -> 0x0054, blocks: (B:14:0x004f, B:64:0x0270, B:66:0x0276, B:67:0x0288, B:69:0x029a, B:70:0x02ac, B:78:0x02d0, B:81:0x02df, B:47:0x0158, B:49:0x015e, B:51:0x0179), top: B:96:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:84:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x0307  */
    /* JADX WARN: Code duplicated, block: B:90:0x030b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0317  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public Object d(Params params, tq.e<? super dx.i<? extends dx.b, Result>> eVar) {
        c cVar;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar;
        int i15;
        String str;
        dx.j<dx.b> jVar;
        ex.b bVar;
        ex.b bVar2;
        Params params2;
        int i16;
        int i17;
        int i18;
        int i19;
        dx.i iVar;
        byte[] bArr;
        int i25;
        int i26;
        ex.b bVar3;
        Params params3;
        String str2;
        dx.j<dx.b> jVar2;
        ex.b bVar4;
        dx.i iVar2;
        byte[] bArr2;
        Object objC;
        byte[] bArr3;
        ex.b bVar5;
        dx.i iVar3;
        dx.i<dx.b, char[]> iVarC;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i27 = cVar.f45203v;
            if ((i27 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f45203v = i27 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objD = cVar.f45201s;
        Object objE = uq.b.e();
        int i28 = cVar.f45203v;
        ?? r15 = 1;
        try {
            try {
                try {
                    if (i28 == 0) {
                        u.b(objD);
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            aVar = new ex.a();
                            String name = this.securityProviderFactory.b().getName();
                            this.cipherRsa.a(name);
                            this.cipherAes.a(name);
                            iy.i iVar4 = this.cipherRsa;
                            byte[] bArr4 = (byte[]) aVar.a(iy.a.c(this.base64Coder, params.getUserCertificate().getCertPKCS12AESSecretKeyBase64(), null, 2, null));
                            PrivateKey privateKey = params.getPrivateKey();
                            iy.h.c.C2299c c2299c = iy.h.c.C2299c.f97756b;
                            cVar.f45188d = params;
                            cVar.f45189e = jVarA;
                            cVar.f45190f = vq.j.a(aVar);
                            cVar.f45191g = aVar;
                            cVar.f45192h = vq.j.a(name);
                            cVar.f45193j = aVar;
                            i15 = 0;
                            cVar.f45196m = 0;
                            cVar.f45197n = 0;
                            cVar.f45198p = 0;
                            cVar.f45199q = 0;
                            cVar.f45200r = 0;
                            cVar.f45203v = 1;
                            Object objC2 = iVar4.c(bArr4, privateKey, c2299c, cVar);
                            if (objC2 != objE) {
                                str = name;
                                jVar = jVarA;
                                objD = objC2;
                                bVar = aVar;
                                bVar2 = bVar;
                                params2 = params;
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                                i19 = 0;
                                iVar = (dx.i) objD;
                                if (iVar instanceof dx.i.Left) {
                                    this.remoteLogger.F8("DecryptUserCertificateUseCase: RSA cert PKCS12AESSecretKey decryption failed", px.d.a.ERROR);
                                }
                                byte[] bArr5 = (byte[]) aVar.a(iVar);
                                iy.g gVar = this.cipherAes;
                                byte[] bArr6 = (byte[]) bVar2.a(iy.a.c(this.base64Coder, params2.getUserCertificate().getCertPKCS12Base64(), null, 2, null));
                                SecretKey secretKey = (SecretKey) bVar2.a(this.aesKeyDecoder.a(bArr5));
                                bArr = bArr5;
                                iy.h.a.C2298a c2298a = new iy.h.a.C2298a(new r.c(16, q.Suffix), 17);
                                cVar.f45188d = params2;
                                cVar.f45189e = jVar;
                                cVar.f45190f = vq.j.a(bVar);
                                cVar.f45191g = bVar2;
                                cVar.f45192h = vq.j.a(str);
                                cVar.f45193j = bVar2;
                                cVar.f45194k = vq.j.a(bArr);
                                cVar.f45196m = i19;
                                cVar.f45197n = i18;
                                cVar.f45198p = i17;
                                cVar.f45199q = i15;
                                cVar.f45200r = i16;
                                cVar.f45203v = 2;
                                objD = gVar.d(bArr6, secretKey, c2298a, cVar);
                                objE = objE;
                                if (objD != objE) {
                                    i25 = i16;
                                    i26 = i17;
                                    bVar3 = bVar2;
                                    params3 = params2;
                                    str2 = str;
                                    jVar2 = jVar;
                                    bVar4 = bVar;
                                    iVar2 = (dx.i) objD;
                                    if (iVar2 instanceof dx.i.Left) {
                                        this.remoteLogger.F8("DecryptUserCertificateUseCase: AES cert PKCS12 decryption failed", px.d.a.ERROR);
                                    }
                                    bArr2 = (byte[]) bVar2.a(iVar2);
                                    iy.i iVar5 = this.cipherRsa;
                                    String str3 = str2;
                                    byte[] bArr7 = (byte[]) bVar3.a(iy.a.c(this.base64Coder, params3.getUserCertificate().getPasswordPKCS12Base64(), null, 2, null));
                                    PrivateKey privateKey2 = params3.getPrivateKey();
                                    iy.h.c.C2299c c2299c2 = iy.h.c.C2299c.f97756b;
                                    cVar.f45188d = vq.j.a(params3);
                                    cVar.f45189e = jVar2;
                                    cVar.f45190f = vq.j.a(bVar4);
                                    cVar.f45191g = bVar3;
                                    cVar.f45192h = vq.j.a(str3);
                                    cVar.f45193j = bVar3;
                                    cVar.f45194k = bArr2;
                                    cVar.f45195l = vq.j.a(bArr);
                                    cVar.f45196m = i19;
                                    cVar.f45197n = i18;
                                    cVar.f45198p = i26;
                                    cVar.f45199q = i15;
                                    cVar.f45200r = i25;
                                    cVar.f45203v = 3;
                                    objC = iVar5.c(bArr7, privateKey2, c2299c2, cVar);
                                    if (objC != objE) {
                                        bArr3 = bArr2;
                                        objD = objC;
                                        bVar5 = bVar3;
                                        iVar3 = (dx.i) objD;
                                        if (iVar3 instanceof dx.i.Left) {
                                            this.remoteLogger.F8("DecryptUserCertificateUseCase: RSA passwordPKCS12 decryption failed", px.d.a.ERROR);
                                        }
                                        iVarC = this.bytesConverter.c((byte[]) bVar3.a(iVar3), iy.b.a.f97723a);
                                        if (iVarC instanceof dx.i.Left) {
                                            this.remoteLogger.F8("DecryptUserCertificateUseCase: decrypted password conversion failed", px.d.a.ERROR);
                                        }
                                        return new dx.i.Right(new Result(new a0(bArr3), new b0((char[]) bVar5.a(iVarC))));
                                    }
                                }
                            }
                            return objE;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
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
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i28 != 1) {
                        if (i28 == 2) {
                            int i29 = cVar.f45200r;
                            int i35 = cVar.f45199q;
                            i26 = cVar.f45198p;
                            i18 = cVar.f45197n;
                            i19 = cVar.f45196m;
                            byte[] bArr8 = (byte[]) cVar.f45194k;
                            bVar2 = (ex.b) cVar.f45193j;
                            str2 = (String) cVar.f45192h;
                            ex.b bVar6 = (ex.b) cVar.f45191g;
                            ex.b bVar7 = (ex.b) cVar.f45190f;
                            jVar2 = (dx.j) cVar.f45189e;
                            params3 = (Params) cVar.f45188d;
                            try {
                                u.b(objD);
                                bArr = bArr8;
                                i15 = i35;
                                bVar4 = bVar7;
                                i25 = i29;
                                bVar3 = bVar6;
                                iVar2 = (dx.i) objD;
                                if (iVar2 instanceof dx.i.Left) {
                                    this.remoteLogger.F8("DecryptUserCertificateUseCase: AES cert PKCS12 decryption failed", px.d.a.ERROR);
                                }
                                bArr2 = (byte[]) bVar2.a(iVar2);
                                iy.i iVar6 = this.cipherRsa;
                                String str4 = str2;
                                byte[] bArr9 = (byte[]) bVar3.a(iy.a.c(this.base64Coder, params3.getUserCertificate().getPasswordPKCS12Base64(), null, 2, null));
                                PrivateKey privateKey3 = params3.getPrivateKey();
                                iy.h.c.C2299c c2299c3 = iy.h.c.C2299c.f97756b;
                                cVar.f45188d = vq.j.a(params3);
                                cVar.f45189e = jVar2;
                                cVar.f45190f = vq.j.a(bVar4);
                                cVar.f45191g = bVar3;
                                cVar.f45192h = vq.j.a(str4);
                                cVar.f45193j = bVar3;
                                cVar.f45194k = bArr2;
                                cVar.f45195l = vq.j.a(bArr);
                                cVar.f45196m = i19;
                                cVar.f45197n = i18;
                                cVar.f45198p = i26;
                                cVar.f45199q = i15;
                                cVar.f45200r = i25;
                                cVar.f45203v = 3;
                                objC = iVar6.c(bArr9, privateKey3, c2299c3, cVar);
                                if (objC != objE) {
                                    bArr3 = bArr2;
                                    objD = objC;
                                    bVar5 = bVar3;
                                }
                                return objE;
                            } catch (ex.c e18) {
                                e = e18;
                                return new dx.i.Left((dx.b) ex.d.a(e));
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
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (i28 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bArr3 = (byte[]) cVar.f45194k;
                        bVar3 = (ex.b) cVar.f45193j;
                        bVar5 = (ex.b) cVar.f45191g;
                        u.b(objD);
                        iVar3 = (dx.i) objD;
                        if (iVar3 instanceof dx.i.Left) {
                            this.remoteLogger.F8("DecryptUserCertificateUseCase: RSA passwordPKCS12 decryption failed", px.d.a.ERROR);
                        }
                        iVarC = this.bytesConverter.c((byte[]) bVar3.a(iVar3), iy.b.a.f97723a);
                        if (iVarC instanceof dx.i.Left) {
                            this.remoteLogger.F8("DecryptUserCertificateUseCase: decrypted password conversion failed", px.d.a.ERROR);
                        }
                        return new dx.i.Right(new Result(new a0(bArr3), new b0((char[]) bVar5.a(iVarC))));
                    }
                    i16 = cVar.f45200r;
                    int i36 = cVar.f45199q;
                    int i37 = cVar.f45198p;
                    int i38 = cVar.f45197n;
                    int i39 = cVar.f45196m;
                    aVar = (ex.b) cVar.f45193j;
                    String str5 = (String) cVar.f45192h;
                    ex.b bVar8 = (ex.b) cVar.f45191g;
                    ex.b bVar9 = (ex.b) cVar.f45190f;
                    dx.j<dx.b> jVar3 = (dx.j) cVar.f45189e;
                    params2 = (Params) cVar.f45188d;
                    try {
                        u.b(objD);
                        i15 = i36;
                        bVar = bVar9;
                        i17 = i37;
                        jVar = jVar3;
                        bVar2 = bVar8;
                        i19 = i39;
                        str = str5;
                        i18 = i38;
                        iVar = (dx.i) objD;
                        if (iVar instanceof dx.i.Left) {
                            this.remoteLogger.F8("DecryptUserCertificateUseCase: RSA cert PKCS12AESSecretKey decryption failed", px.d.a.ERROR);
                        }
                        byte[] bArr10 = (byte[]) aVar.a(iVar);
                        iy.g gVar2 = this.cipherAes;
                        byte[] bArr11 = (byte[]) bVar2.a(iy.a.c(this.base64Coder, params2.getUserCertificate().getCertPKCS12Base64(), null, 2, null));
                        SecretKey secretKey2 = (SecretKey) bVar2.a(this.aesKeyDecoder.a(bArr10));
                        bArr = bArr10;
                        iy.h.a.C2298a c2298a2 = new iy.h.a.C2298a(new r.c(16, q.Suffix), 17);
                        cVar.f45188d = params2;
                        cVar.f45189e = jVar;
                        cVar.f45190f = vq.j.a(bVar);
                        cVar.f45191g = bVar2;
                        cVar.f45192h = vq.j.a(str);
                        cVar.f45193j = bVar2;
                        cVar.f45194k = vq.j.a(bArr);
                        cVar.f45196m = i19;
                        cVar.f45197n = i18;
                        cVar.f45198p = i17;
                        cVar.f45199q = i15;
                        cVar.f45200r = i16;
                        cVar.f45203v = 2;
                        objD = gVar2.d(bArr11, secretKey2, c2298a2, cVar);
                        objE = objE;
                        if (objD != objE) {
                            i25 = i16;
                            i26 = i17;
                            bVar3 = bVar2;
                            params3 = params2;
                            str2 = str;
                            jVar2 = jVar;
                            bVar4 = bVar;
                            iVar2 = (dx.i) objD;
                            if (iVar2 instanceof dx.i.Left) {
                                this.remoteLogger.F8("DecryptUserCertificateUseCase: AES cert PKCS12 decryption failed", px.d.a.ERROR);
                            }
                            bArr2 = (byte[]) bVar2.a(iVar2);
                            iy.i iVar7 = this.cipherRsa;
                            String str6 = str2;
                            byte[] bArr12 = (byte[]) bVar3.a(iy.a.c(this.base64Coder, params3.getUserCertificate().getPasswordPKCS12Base64(), null, 2, null));
                            PrivateKey privateKey4 = params3.getPrivateKey();
                            iy.h.c.C2299c c2299c4 = iy.h.c.C2299c.f97756b;
                            cVar.f45188d = vq.j.a(params3);
                            cVar.f45189e = jVar2;
                            cVar.f45190f = vq.j.a(bVar4);
                            cVar.f45191g = bVar3;
                            cVar.f45192h = vq.j.a(str6);
                            cVar.f45193j = bVar3;
                            cVar.f45194k = bArr2;
                            cVar.f45195l = vq.j.a(bArr);
                            cVar.f45196m = i19;
                            cVar.f45197n = i18;
                            cVar.f45198p = i26;
                            cVar.f45199q = i15;
                            cVar.f45200r = i25;
                            cVar.f45203v = 3;
                            objC = iVar7.c(bArr12, privateKey4, c2299c4, cVar);
                            if (objC != objE) {
                                bArr3 = bArr2;
                                objD = objC;
                                bVar5 = bVar3;
                                iVar3 = (dx.i) objD;
                                if (iVar3 instanceof dx.i.Left) {
                                    this.remoteLogger.F8("DecryptUserCertificateUseCase: RSA passwordPKCS12 decryption failed", px.d.a.ERROR);
                                }
                                iVarC = this.bytesConverter.c((byte[]) bVar3.a(iVar3), iy.b.a.f97723a);
                                if (iVarC instanceof dx.i.Left) {
                                    this.remoteLogger.F8("DecryptUserCertificateUseCase: decrypted password conversion failed", px.d.a.ERROR);
                                }
                                return new dx.i.Right(new Result(new a0(bArr3), new b0((char[]) bVar5.a(iVarC))));
                            }
                        }
                        return objE;
                    } catch (ex.c e26) {
                        e = e26;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e27) {
                        throw e27;
                    } catch (Exception e28) {
                        e = e28;
                        r15 = jVar3;
                        px.f fVar3 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar3.d(message, e, px.c.a(r15));
                        iVarA = r15.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } catch (CancellationException e29) {
                    throw e29;
                }
            } catch (Exception e35) {
                e = e35;
            }
        } catch (ex.c e36) {
            e = e36;
        } catch (CancellationException e37) {
            throw e37;
        }
    }
}
