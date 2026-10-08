package i53;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Li53/b;", "", "a", "Li53/b$a;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: i53.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Li53/b$a;", "Li53/b;", "Le04/e;", "biometricStatus", "<init>", "(Le04/e;)V", "a", "(Le04/e;)Li53/b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Le04/e;", "b", "()Le04/e;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e04.e biometricStatus;

        /* JADX WARN: Multi-variable type inference failed */
        public Initialized() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final Initialized a(e04.e biometricStatus) {
            return new Initialized(biometricStatus);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final e04.e getBiometricStatus() {
            return this.biometricStatus;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initialized) && t.c(this.biometricStatus, ((Initialized) other).biometricStatus);
        }

        public int hashCode() {
            return this.biometricStatus.hashCode();
        }

        public String toString() {
            return "Initialized(biometricStatus=" + this.biometricStatus + ')';
        }

        public Initialized(e04.e eVar) {
            this.biometricStatus = eVar;
        }

        public /* synthetic */ Initialized(e04.e eVar, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? new e04.e.a.App(false, 1, null) : eVar);
        }
    }
}
