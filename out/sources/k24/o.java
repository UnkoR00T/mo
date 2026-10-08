package k24;

import fr.t;
import iy.a0;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lk24/o;", "", "Lk24/o$a;", "", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface o extends gz.b {

    /* JADX INFO: renamed from: k24.o$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006 "}, d2 = {"Lk24/o$a;", "Lgz/b$a;", "Lf24/c;", "certificateType", "Liy/b0;", "peselTicket", "Liy/a0;", "decryptedCert", "password", "<init>", "(Lf24/c;Liy/b0;Liy/a0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lf24/c;", "()Lf24/c;", "b", "Liy/b0;", "d", "()Liy/b0;", "c", "Liy/a0;", "()Liy/a0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final f24.c certificateType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 peselTicket;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final a0 decryptedCert;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 password;

        public Params(f24.c cVar, b0 b0Var, a0 a0Var, b0 b0Var2) {
            this.certificateType = cVar;
            this.peselTicket = b0Var;
            this.decryptedCert = a0Var;
            this.password = b0Var2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final f24.c getCertificateType() {
            return this.certificateType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final a0 getDecryptedCert() {
            return this.decryptedCert;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getPassword() {
            return this.password;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b0 getPeselTicket() {
            return this.peselTicket;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.certificateType == params.certificateType && t.c(this.peselTicket, params.peselTicket) && t.c(this.decryptedCert, params.decryptedCert) && t.c(this.password, params.password);
        }

        public int hashCode() {
            return (((((this.certificateType.hashCode() * 31) + this.peselTicket.hashCode()) * 31) + this.decryptedCert.hashCode()) * 31) + this.password.hashCode();
        }

        public String toString() {
            return "Params(certificateType=" + this.certificateType + ", peselTicket=" + this.peselTicket + ", decryptedCert=" + this.decryptedCert + ", password=" + this.password + ")";
        }
    }
}
