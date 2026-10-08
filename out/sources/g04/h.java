package g04;

import fr.t;
import iy.a0;
import iy.b0;
import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lg04/h;", "", "Lg04/h$a;", "Lg04/n;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h extends gz.b {

    /* JADX INFO: renamed from: g04.h$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lg04/h$a;", "Lgz/b$a;", "Liy/a0;", "biometricResult", "Liy/b0;", "providedPin", "<init>", "(Liy/a0;Liy/b0;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Liy/a0;", "()Liy/a0;", "b", "Liy/b0;", "()Liy/b0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final a0 biometricResult;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 providedPin;

        public Params(a0 a0Var, b0 b0Var) {
            this.biometricResult = a0Var;
            this.providedPin = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a0 getBiometricResult() {
            return this.biometricResult;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getProvidedPin() {
            return this.providedPin;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!t.c(Params.class, other != null ? other.getClass() : null)) {
                return false;
            }
            l.Params params = (l.Params) other;
            return this.biometricResult.b(params.getBiometricResult()) && this.providedPin.c(params.getCurrentPin());
        }

        public int hashCode() {
            return (Arrays.hashCode(this.biometricResult.getData()) * 31) + this.providedPin.hashCode();
        }

        public String toString() {
            return "Params(biometricResult=" + this.biometricResult + ", providedPin=" + this.providedPin + ")";
        }
    }
}
