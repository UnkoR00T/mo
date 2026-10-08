package kx3;

import dx.i;
import fr.k;
import fr.t;
import iy.l;
import iy.o;
import iy.w;
import java.security.SecureRandom;
import java.util.UUID;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0018\u0015B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u0014\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lkx3/c;", "", "Lgz/b$a$a;", "Lkx3/c$b;", "Liy/w;", "secureRandomFactory", "Liy/a;", "base64Coder", "Liy/l;", CMSAttributeTableGenerator.DIGEST, "<init>", "(Liy/w;Liy/a;Liy/l;)V", "", "f", "(Ltq/e;)Ljava/lang/Object;", "codeVerifier", "Ldx/i;", "Ldx/b;", "e", "(Ljava/lang/String;)Ldx/i;", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Liy/w;", "b", "Liy/a;", "c", "Liy/l;", "d", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f113061d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f113062e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w secureRandomFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l digest;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkx3/c$a;", "", "<init>", "()V", "", "VERIFIER_LENGTH", "I", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: kx3.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0015"}, d2 = {"Lkx3/c$b;", "", "", "stateParameterValue", "codeVerifier", "codeChallenge", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SecretProperties {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stateParameterValue;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String codeVerifier;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String codeChallenge;

        public SecretProperties(String str, String str2, String str3) {
            this.stateParameterValue = str;
            this.codeVerifier = str2;
            this.codeChallenge = str3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCodeChallenge() {
            return this.codeChallenge;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCodeVerifier() {
            return this.codeVerifier;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getStateParameterValue() {
            return this.stateParameterValue;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SecretProperties)) {
                return false;
            }
            SecretProperties secretProperties = (SecretProperties) other;
            return t.c(this.stateParameterValue, secretProperties.stateParameterValue) && t.c(this.codeVerifier, secretProperties.codeVerifier) && t.c(this.codeChallenge, secretProperties.codeChallenge);
        }

        public int hashCode() {
            return (((this.stateParameterValue.hashCode() * 31) + this.codeVerifier.hashCode()) * 31) + this.codeChallenge.hashCode();
        }

        public String toString() {
            return "SecretProperties(stateParameterValue=" + this.stateParameterValue + ", codeVerifier=" + this.codeVerifier + ", codeChallenge=" + this.codeChallenge + ')';
        }
    }

    /* JADX INFO: renamed from: kx3.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C2740c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f113069d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f113070e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f113072g;

        C2740c(tq.e<? super C2740c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f113070e = obj;
            this.f113072g |= PKIFailureInfo.systemUnavail;
            return c.this.f(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f113073d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f113074e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f113076g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f113074e = obj;
            this.f113076g |= PKIFailureInfo.systemUnavail;
            return c.this.a(null, this);
        }
    }

    public c(w wVar, iy.a aVar, l lVar) {
        this.secureRandomFactory = wVar;
        this.base64Coder = aVar;
        this.digest = lVar;
    }

    private final i<dx.b, String> e(String codeVerifier) {
        i iVarB = this.digest.b(codeVerifier.getBytes(fu.d.US_ASCII), o.SHA_256);
        if (iVarB instanceof i.Left) {
            return iVarB;
        }
        if (!(iVarB instanceof i.Right)) {
            throw new p();
        }
        return new i.Right(this.base64Coder.d((byte[]) ((i.Right) iVarB).b(), ry.b.URL_SAFE_NO_PADDING));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(tq.e<? super String> eVar) throws Throwable {
        C2740c c2740c;
        byte[] bArr;
        if (eVar instanceof C2740c) {
            c2740c = (C2740c) eVar;
            int i15 = c2740c.f113072g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c2740c.f113072g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c2740c = new C2740c(eVar);
            }
        } else {
            c2740c = new C2740c(eVar);
        }
        Object obj = c2740c.f113070e;
        Object objE = uq.b.e();
        int i16 = c2740c.f113072g;
        if (i16 == 0) {
            u.b(obj);
            byte[] bArr2 = new byte[32];
            w wVar = this.secureRandomFactory;
            c2740c.f113069d = bArr2;
            c2740c.f113072g = 1;
            Object objC = w.c(wVar, null, c2740c, 1, null);
            if (objC == objE) {
                return objE;
            }
            bArr = bArr2;
            obj = objC;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr = (byte[]) c2740c.f113069d;
            u.b(obj);
        }
        ((SecureRandom) obj).nextBytes(bArr);
        return this.base64Coder.d(bArr, ry.b.URL_SAFE_NO_PADDING);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(gz.b.a.C1792a c1792a, tq.e<? super i<? extends dx.b, SecretProperties>> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f113076g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f113076g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objF = dVar.f113074e;
        Object objE = uq.b.e();
        int i16 = dVar.f113076g;
        if (i16 == 0) {
            u.b(objF);
            dVar.f113073d = j.a(c1792a);
            dVar.f113076g = 1;
            objF = f(dVar);
            if (objF == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objF);
        }
        String str = (String) objF;
        i<dx.b, String> iVarE = e(str);
        if (iVarE instanceof i.Left) {
            return iVarE;
        }
        if (!(iVarE instanceof i.Right)) {
            throw new p();
        }
        return new i.Right(new SecretProperties(UUID.randomUUID().toString(), str, (String) ((i.Right) iVarE).b()));
    }
}
