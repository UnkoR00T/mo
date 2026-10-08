package g10;

import dx.i;
import fr.t;
import iy.a0;
import iy.b0;
import javax.crypto.SecretKey;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u0007\tJ$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lg10/c;", "", "Lg10/c$a;", "params", "Ldx/i;", "Ldx/b;", "Lg10/c$b;", "a", "(Lg10/c$a;Ltq/e;)Ljava/lang/Object;", "b", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lg10/c$a;", "", "Liy/b0;", "getPassword", "()Liy/b0;", "password", "a", "b", "Lg10/c$a$a;", "Lg10/c$a$b;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: g10.c$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lg10/c$a$a;", "Lg10/c$a;", "Liy/b0;", "password", "<init>", "(Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "getPassword", "()Liy/b0;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class New implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final b0 password;

            public New(b0 b0Var) {
                this.password = b0Var;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof New) && t.c(this.password, ((New) other).password);
            }

            @Override // g10.c.a
            public b0 getPassword() {
                return this.password;
            }

            public int hashCode() {
                return this.password.hashCode();
            }

            public String toString() {
                return "New(password=" + this.password + ')';
            }
        }

        /* JADX INFO: renamed from: g10.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, d2 = {"Lg10/c$a$b;", "Lg10/c$a;", "Liy/b0;", "password", "", "iterationsCount", "Liy/a0;", "salt", "<init>", "(Liy/b0;ILiy/a0;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "getPassword", "()Liy/b0;", "b", "I", "c", "Liy/a0;", "()Liy/a0;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Specific implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final b0 password;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int iterationsCount;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final a0 salt;

            public Specific(b0 b0Var, int i15, a0 a0Var) {
                this.password = b0Var;
                this.iterationsCount = i15;
                this.salt = a0Var;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getIterationsCount() {
                return this.iterationsCount;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final a0 getSalt() {
                return this.salt;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Specific)) {
                    return false;
                }
                Specific specific = (Specific) other;
                return t.c(this.password, specific.password) && this.iterationsCount == specific.iterationsCount && t.c(this.salt, specific.salt);
            }

            @Override // g10.c.a
            public b0 getPassword() {
                return this.password;
            }

            public int hashCode() {
                return (((this.password.hashCode() * 31) + Integer.hashCode(this.iterationsCount)) * 31) + this.salt.hashCode();
            }

            public String toString() {
                return "Specific(password=" + this.password + ", iterationsCount=" + this.iterationsCount + ", salt=" + this.salt + ')';
            }
        }

        b0 getPassword();
    }

    /* JADX INFO: renamed from: g10.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lg10/c$b;", "", "Ljavax/crypto/SecretKey;", "passwordKey", "", "iterationsCount", "Liy/a0;", "salt", "<init>", "(Ljavax/crypto/SecretKey;ILiy/a0;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljavax/crypto/SecretKey;", "b", "()Ljavax/crypto/SecretKey;", "I", "c", "Liy/a0;", "()Liy/a0;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PasswordKeyResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final SecretKey passwordKey;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int iterationsCount;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final a0 salt;

        public PasswordKeyResult(SecretKey secretKey, int i15, a0 a0Var) {
            this.passwordKey = secretKey;
            this.iterationsCount = i15;
            this.salt = a0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getIterationsCount() {
            return this.iterationsCount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final SecretKey getPasswordKey() {
            return this.passwordKey;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final a0 getSalt() {
            return this.salt;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PasswordKeyResult)) {
                return false;
            }
            PasswordKeyResult passwordKeyResult = (PasswordKeyResult) other;
            return t.c(this.passwordKey, passwordKeyResult.passwordKey) && this.iterationsCount == passwordKeyResult.iterationsCount && t.c(this.salt, passwordKeyResult.salt);
        }

        public int hashCode() {
            return (((this.passwordKey.hashCode() * 31) + Integer.hashCode(this.iterationsCount)) * 31) + this.salt.hashCode();
        }

        public String toString() {
            return "PasswordKeyResult(passwordKey=" + this.passwordKey + ", iterationsCount=" + this.iterationsCount + ", salt=" + this.salt + ')';
        }
    }

    Object a(a aVar, e<? super i<? extends dx.b, PasswordKeyResult>> eVar);
}
