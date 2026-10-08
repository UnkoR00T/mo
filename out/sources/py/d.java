package py;

import fr.t;
import iy.a0;
import iy.b0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u000f\b\fB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lpy/d;", "Lpy/c;", "", "algorithm", "", "keyLength", "<init>", "(Ljava/lang/String;I)V", "a", "Ljava/lang/String;", "getAlgorithm", "()Ljava/lang/String;", "b", "I", "()I", "c", "Lpy/d$a;", "Lpy/d$b;", "Lpy/d$c;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String algorithm;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int keyLength;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lpy/d$a;", "Lpy/d;", "", "iterationCount", "I", "b", "()I", "memoryAsKB", "c", "parallelism", "d", "Liy/a0;", "salt", "Liy/a0;", "f", "()Liy/a0;", "Liy/b0;", "password", "Liy/b0;", "e", "()Liy/b0;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends d {
        public final int b() {
            throw null;
        }

        public final int c() {
            throw null;
        }

        public final int d() {
            throw null;
        }

        public final b0 e() {
            throw null;
        }

        public final a0 f() {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpy/d$b;", "Lpy/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f163155c = new b();

        private b() {
            super("AES", 256, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -604044117;
        }

        public String toString() {
            return "Default";
        }
    }

    public /* synthetic */ d(String str, int i15, fr.k kVar) {
        this(str, i15);
    }

    @Override // py.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getKeyLength() {
        return this.keyLength;
    }

    @Override // py.c
    public String getAlgorithm() {
        return this.algorithm;
    }

    private d(String str, int i15) {
        this.algorithm = str;
        this.keyLength = i15;
    }

    /* JADX INFO: renamed from: py.d$c, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lpy/d$c;", "Lpy/d;", "", "iterationCount", "Liy/a0;", "salt", "Liy/b0;", "password", "<init>", "(ILiy/a0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "I", "b", "d", "Liy/a0;", "()Liy/a0;", "e", "Liy/b0;", "()Liy/b0;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PBEKeySpec extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int iterationCount;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final a0 salt;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 password;

        public PBEKeySpec(int i15, a0 a0Var, b0 b0Var) {
            super("PBKDF2WithHmacSHA256", 256, null);
            this.iterationCount = i15;
            this.salt = a0Var;
            this.password = b0Var;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIterationCount() {
            return this.iterationCount;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getPassword() {
            return this.password;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final a0 getSalt() {
            return this.salt;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PBEKeySpec)) {
                return false;
            }
            PBEKeySpec pBEKeySpec = (PBEKeySpec) other;
            return this.iterationCount == pBEKeySpec.iterationCount && t.c(this.salt, pBEKeySpec.salt) && t.c(this.password, pBEKeySpec.password);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.iterationCount) * 31) + this.salt.hashCode()) * 31) + this.password.hashCode();
        }

        public String toString() {
            return "PBEKeySpec(iterationCount=" + this.iterationCount + ", salt=" + this.salt + ", password=" + this.password + ")";
        }

        public /* synthetic */ PBEKeySpec(int i15, a0 a0Var, b0 b0Var, int i16, fr.k kVar) {
            this((i16 & 1) != 0 ? PKIFailureInfo.notAuthorized : i15, a0Var, b0Var);
        }
    }
}
