package ng0;

import java.security.PrivateKey;
import java.util.concurrent.CancellationException;
import javax.crypto.SecretKey;
import ju.g1;
import ju.p0;
import oq.i0;
import p071kotlin.Metadata;
import y00.h0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0017\u0019B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lng0/d;", "", "Lng0/d$a;", "Lng0/d$b;", "Lpy/a;", "aesKeyDecoder", "Liy/a;", "base64Coder", "Liy/c;", "bytesConverter", "Ly00/h0;", "securityProviderFactory", "Liy/i;", "cipherRsa", "Liy/g;", "cipherAes", "<init>", "(Lpy/a;Liy/a;Liy/c;Ly00/h0;Liy/i;Liy/g;)V", "params", "Ldx/i;", "Ldx/b;", "j", "(Lng0/d$a;Ltq/e;)Ljava/lang/Object;", "a", "Lpy/a;", "b", "Liy/a;", "c", "Liy/c;", "d", "Ly00/h0;", "e", "Liy/i;", "f", "Liy/g;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gz.b {

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

    /* JADX INFO: renamed from: ng0.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lng0/d$a;", "Lgz/b$a;", "", "certPKCS12Base64", "certPKCS12AESSecretKeyBase64", "passwordPKCS12Base64", "Ljava/security/PrivateKey;", "privateKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/security/PrivateKey;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "Ljava/security/PrivateKey;", "()Ljava/security/PrivateKey;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String certPKCS12Base64;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String certPKCS12AESSecretKeyBase64;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String passwordPKCS12Base64;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final PrivateKey privateKey;

        public Params(String str, String str2, String str3, PrivateKey privateKey) {
            this.certPKCS12Base64 = str;
            this.certPKCS12AESSecretKeyBase64 = str2;
            this.passwordPKCS12Base64 = str3;
            this.privateKey = privateKey;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCertPKCS12AESSecretKeyBase64() {
            return this.certPKCS12AESSecretKeyBase64;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCertPKCS12Base64() {
            return this.certPKCS12Base64;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPasswordPKCS12Base64() {
            return this.passwordPKCS12Base64;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final PrivateKey getPrivateKey() {
            return this.privateKey;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.certPKCS12Base64, params.certPKCS12Base64) && fr.t.c(this.certPKCS12AESSecretKeyBase64, params.certPKCS12AESSecretKeyBase64) && fr.t.c(this.passwordPKCS12Base64, params.passwordPKCS12Base64) && fr.t.c(this.privateKey, params.privateKey);
        }

        public int hashCode() {
            return (((((this.certPKCS12Base64.hashCode() * 31) + this.certPKCS12AESSecretKeyBase64.hashCode()) * 31) + this.passwordPKCS12Base64.hashCode()) * 31) + this.privateKey.hashCode();
        }

        public String toString() {
            return "Params(certPKCS12Base64=" + this.certPKCS12Base64 + ", certPKCS12AESSecretKeyBase64=" + this.certPKCS12AESSecretKeyBase64 + ", passwordPKCS12Base64=" + this.passwordPKCS12Base64 + ", privateKey=" + this.privateKey + ')';
        }
    }

    /* JADX INFO: renamed from: ng0.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lng0/d$b;", "", "Liy/a0;", "certPkcs12", "Liy/b0;", "password", "<init>", "(Liy/a0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/a0;", "()Liy/a0;", "b", "Liy/b0;", "()Liy/b0;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.a0 certPkcs12;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 password;

        public Result(iy.a0 a0Var, iy.b0 b0Var) {
            this.certPkcs12 = a0Var;
            this.password = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final iy.a0 getCertPkcs12() {
            return this.certPkcs12;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final iy.b0 getPassword() {
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
            return fr.t.c(this.certPkcs12, result.certPkcs12) && fr.t.c(this.password, result.password);
        }

        public int hashCode() {
            return (this.certPkcs12.hashCode() * 31) + this.password.hashCode();
        }

        public String toString() {
            return "Result(certPkcs12=" + this.certPkcs12 + ", password=" + this.password + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Lng0/d$b;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b, ? extends Result>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f135989e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f135990f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f135991g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f135992h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f135993j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f135994k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f135995l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f135996m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f135997n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f135998p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f135999q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f136000r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f136001s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f136002t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ Params f136004w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Params params, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f136004w = params;
        }

        /* JADX WARN: Code duplicated, block: B:45:0x01cc  */
        /* JADX WARN: Code duplicated, block: B:64:0x0283  */
        /* JADX WARN: Code duplicated, block: B:67:0x0294  */
        /* JADX WARN: Code duplicated, block: B:68:0x02a2  */
        /* JADX WARN: Code duplicated, block: B:70:0x02a6  */
        /* JADX WARN: Code duplicated, block: B:73:0x02b2  */
        /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v19 */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v7 */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            String message;
            dx.i iVarA;
            Object objB;
            d dVar;
            ex.b aVar;
            Object objC;
            String str;
            ex.b bVar;
            ex.b bVar2;
            int i15;
            int i16;
            int i17;
            int i18;
            dx.j<dx.b> jVar;
            Params params;
            int i19;
            byte[] bArr;
            String str2;
            ex.b bVar3;
            Object objD;
            Object obj2;
            int i25;
            int i26;
            int i27;
            dx.j<dx.b> jVar2;
            byte[] bArr2;
            String str3;
            Params params2;
            int i28;
            ex.b bVar4;
            byte[] bArr3;
            Object objC2;
            ex.b bVar5;
            d dVar2;
            Object objE = uq.b.e();
            int i29 = this.f136002t;
            ?? r15 = 1;
            try {
                try {
                    if (i29 == 0) {
                        oq.u.b(obj);
                        dVar = d.this;
                        Params params3 = this.f136004w;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            aVar = new ex.a();
                            String name = dVar.securityProviderFactory.b().getName();
                            dVar.cipherRsa.a(name);
                            dVar.cipherAes.a(name);
                            iy.i iVar = dVar.cipherRsa;
                            byte[] bArr4 = (byte[]) aVar.a(iy.a.c(dVar.base64Coder, params3.getCertPKCS12AESSecretKeyBase64(), null, 2, null));
                            PrivateKey privateKey = params3.getPrivateKey();
                            iy.h.c.C2299c c2299c = iy.h.c.C2299c.f97756b;
                            this.f135989e = dVar;
                            this.f135990f = params3;
                            this.f135991g = jVarA;
                            this.f135992h = vq.j.a(aVar);
                            this.f135993j = aVar;
                            this.f135994k = vq.j.a(name);
                            this.f135995l = aVar;
                            this.f135997n = 0;
                            this.f135998p = 0;
                            this.f135999q = 0;
                            this.f136000r = 0;
                            this.f136001s = 0;
                            this.f136002t = 1;
                            objC = iVar.c(bArr4, privateKey, c2299c, this);
                            if (objC == objE) {
                                return objE;
                            }
                            str = name;
                            bVar = aVar;
                            bVar2 = bVar;
                            i15 = 0;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            jVar = jVarA;
                            params = params3;
                            i19 = 0;
                            bArr = (byte[]) aVar.a((dx.i) objC);
                            iy.g gVar = dVar.cipherAes;
                            str2 = str;
                            bVar3 = bVar2;
                            byte[] bArr5 = (byte[]) bVar.a(iy.a.c(dVar.base64Coder, params.getCertPKCS12Base64(), null, 2, null));
                            SecretKey secretKey = (SecretKey) bVar.a(dVar.aesKeyDecoder.a(bArr));
                            iy.h.a.C2298a c2298a = new iy.h.a.C2298a(new iy.r.c(16, iy.q.Suffix), 17);
                            this.f135989e = dVar;
                            this.f135990f = params;
                            this.f135991g = jVar;
                            this.f135992h = vq.j.a(bVar3);
                            this.f135993j = bVar;
                            this.f135994k = vq.j.a(str2);
                            this.f135995l = bVar;
                            this.f135996m = vq.j.a(bArr);
                            this.f135997n = i18;
                            this.f135998p = i17;
                            this.f135999q = i16;
                            this.f136000r = i15;
                            this.f136001s = i19;
                            this.f136002t = 2;
                            objD = gVar.d(bArr5, secretKey, c2298a, this);
                            obj2 = objE;
                            if (objD == obj2) {
                                return obj2;
                            }
                            i25 = i15;
                            i26 = i17;
                            i27 = i18;
                            jVar2 = jVar;
                            bArr2 = bArr;
                            str3 = str2;
                            params2 = params;
                            i28 = i19;
                            bVar4 = bVar;
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
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else if (i29 == 1) {
                        i19 = this.f136001s;
                        int i35 = this.f136000r;
                        int i36 = this.f135999q;
                        int i37 = this.f135998p;
                        int i38 = this.f135997n;
                        aVar = (ex.b) this.f135995l;
                        String str4 = (String) this.f135994k;
                        ex.b bVar6 = (ex.b) this.f135993j;
                        ex.b bVar7 = (ex.b) this.f135992h;
                        jVar = (dx.j) this.f135991g;
                        Params params4 = (Params) this.f135990f;
                        dVar = (d) this.f135989e;
                        try {
                            oq.u.b(obj);
                            i15 = i35;
                            params = params4;
                            str = str4;
                            i17 = i37;
                            bVar2 = bVar7;
                            bVar = bVar6;
                            i18 = i38;
                            i16 = i36;
                            objC = obj;
                            bArr = (byte[]) aVar.a((dx.i) objC);
                            iy.g gVar2 = dVar.cipherAes;
                            str2 = str;
                            bVar3 = bVar2;
                            byte[] bArr6 = (byte[]) bVar.a(iy.a.c(dVar.base64Coder, params.getCertPKCS12Base64(), null, 2, null));
                            SecretKey secretKey2 = (SecretKey) bVar.a(dVar.aesKeyDecoder.a(bArr));
                            iy.h.a.C2298a c2298a2 = new iy.h.a.C2298a(new iy.r.c(16, iy.q.Suffix), 17);
                            this.f135989e = dVar;
                            this.f135990f = params;
                            this.f135991g = jVar;
                            this.f135992h = vq.j.a(bVar3);
                            this.f135993j = bVar;
                            this.f135994k = vq.j.a(str2);
                            this.f135995l = bVar;
                            this.f135996m = vq.j.a(bArr);
                            this.f135997n = i18;
                            this.f135998p = i17;
                            this.f135999q = i16;
                            this.f136000r = i15;
                            this.f136001s = i19;
                            this.f136002t = 2;
                            objD = gVar2.d(bArr6, secretKey2, c2298a2, this);
                            obj2 = objE;
                            if (objD == obj2) {
                                return obj2;
                            }
                            i25 = i15;
                            i26 = i17;
                            i27 = i18;
                            jVar2 = jVar;
                            bArr2 = bArr;
                            str3 = str2;
                            params2 = params;
                            i28 = i19;
                            bVar4 = bVar;
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            e = e25;
                            r15 = jVar;
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
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i29 != 2) {
                            if (i29 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bArr3 = (byte[]) this.f135996m;
                            bVar4 = (ex.b) this.f135994k;
                            ex.b bVar8 = (ex.b) this.f135992h;
                            dx.j<dx.b> jVar3 = (dx.j) this.f135990f;
                            dVar2 = (d) this.f135989e;
                            try {
                                oq.u.b(obj);
                                jVar2 = jVar3;
                                bVar5 = bVar8;
                                objC2 = obj;
                                return new dx.i.Right(new Result(new iy.a0(bArr3), new iy.b0((char[]) bVar5.a(dVar2.bytesConverter.c((byte[]) bVar4.a((dx.i) objC2), iy.b.a.f97723a)))));
                            } catch (ex.c e26) {
                                e = e26;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e27) {
                                throw e27;
                            }
                        }
                        int i39 = this.f136001s;
                        int i45 = this.f136000r;
                        i16 = this.f135999q;
                        i26 = this.f135998p;
                        i27 = this.f135997n;
                        bArr2 = (byte[]) this.f135996m;
                        bVar = (ex.b) this.f135995l;
                        str3 = (String) this.f135994k;
                        ex.b bVar9 = (ex.b) this.f135993j;
                        ex.b bVar10 = (ex.b) this.f135992h;
                        jVar2 = (dx.j) this.f135991g;
                        Params params5 = (Params) this.f135990f;
                        d dVar3 = (d) this.f135989e;
                        try {
                            oq.u.b(obj);
                            i25 = i45;
                            bVar3 = bVar10;
                            obj2 = objE;
                            dVar = dVar3;
                            objD = obj;
                            params2 = params5;
                            i28 = i39;
                            bVar4 = bVar9;
                        } catch (ex.c e28) {
                            e = e28;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e29) {
                            throw e29;
                        } catch (Exception e35) {
                            e = e35;
                            r15 = jVar2;
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
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    bArr3 = (byte[]) bVar.a((dx.i) objD);
                    iy.i iVar2 = dVar.cipherRsa;
                    Params params6 = params2;
                    byte[] bArr7 = bArr2;
                    String str5 = str3;
                    byte[] bArr8 = (byte[]) bVar4.a(iy.a.c(dVar.base64Coder, params6.getPasswordPKCS12Base64(), null, 2, null));
                    PrivateKey privateKey2 = params6.getPrivateKey();
                    iy.h.c.C2299c c2299c2 = iy.h.c.C2299c.f97756b;
                    this.f135989e = dVar;
                    this.f135990f = jVar2;
                    this.f135991g = vq.j.a(bVar3);
                    this.f135992h = bVar4;
                    this.f135993j = vq.j.a(str5);
                    this.f135994k = bVar4;
                    this.f135995l = vq.j.a(bArr7);
                    this.f135996m = bArr3;
                    this.f135997n = i27;
                    this.f135998p = i26;
                    this.f135999q = i16;
                    this.f136000r = i25;
                    this.f136001s = i28;
                    this.f136002t = 3;
                    objC2 = iVar2.c(bArr8, privateKey2, c2299c2, this);
                    if (objC2 == obj2) {
                        return obj2;
                    }
                    bVar5 = bVar4;
                    dVar2 = dVar;
                    return new dx.i.Right(new Result(new iy.a0(bArr3), new iy.b0((char[]) bVar5.a(dVar2.bytesConverter.c((byte[]) bVar4.a((dx.i) objC2), iy.b.a.f97723a)))));
                } catch (Exception e36) {
                    e = e36;
                }
            } catch (CancellationException e37) {
                throw e37;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, Result>> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return d.this.new c(this.f136004w, eVar);
        }
    }

    public d(py.a aVar, iy.a aVar2, iy.c cVar, h0 h0Var, iy.i iVar, iy.g gVar) {
        this.aesKeyDecoder = aVar;
        this.base64Coder = aVar2;
        this.bytesConverter = cVar;
        this.securityProviderFactory = h0Var;
        this.cipherRsa = iVar;
        this.cipherAes = gVar;
    }

    public Object j(Params params, tq.e<? super dx.i<? extends dx.b, Result>> eVar) {
        return ju.i.g(g1.b(), new c(params, null), eVar);
    }
}
