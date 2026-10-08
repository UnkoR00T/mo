package g04;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lg04/a;", "", "Lg04/a$a;", "Le04/a;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a extends gz.b {

    /* JADX INFO: renamed from: g04.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lg04/a$a;", "Lgz/b$a;", "Liy/b0;", "password", "pin", "Le04/e$b;", "biometricStatus", "<init>", "(Liy/b0;Liy/b0;Le04/e$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "c", "Le04/e$b;", "()Le04/e$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 password;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 pin;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final e04.e.b biometricStatus;

        public Params(b0 b0Var, b0 b0Var2, e04.e.b bVar) {
            this.password = b0Var;
            this.pin = b0Var2;
            this.biometricStatus = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final e04.e.b getBiometricStatus() {
            return this.biometricStatus;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getPassword() {
            return this.password;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getPin() {
            return this.pin;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.password, params.password) && t.c(this.pin, params.pin) && t.c(this.biometricStatus, params.biometricStatus);
        }

        public int hashCode() {
            return (((this.password.hashCode() * 31) + this.pin.hashCode()) * 31) + this.biometricStatus.hashCode();
        }

        public String toString() {
            return "Params(password=" + this.password + ", pin=" + this.pin + ", biometricStatus=" + this.biometricStatus + ")";
        }
    }
}
