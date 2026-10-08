package n03;

import fr.k;
import gz.b;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Ln03/a;", "Lgz/b;", "Ln03/a$a;", "Lm03/a;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a extends b<Params, m03.a> {

    /* JADX INFO: renamed from: n03.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Ln03/a$a;", "Lgz/b$a;", "Lm03/b;", "plateNumber", "", "wasPlateVerified", "<init>", "(Ljava/lang/String;ZLfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String plateNumber;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean wasPlateVerified;

        public /* synthetic */ Params(String str, boolean z15, k kVar) {
            this(str, z15);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPlateNumber() {
            return this.plateNumber;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getWasPlateVerified() {
            return this.wasPlateVerified;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return m03.b.b(this.plateNumber, params.plateNumber) && this.wasPlateVerified == params.wasPlateVerified;
        }

        public int hashCode() {
            return (m03.b.c(this.plateNumber) * 31) + Boolean.hashCode(this.wasPlateVerified);
        }

        public String toString() {
            return "Params(plateNumber=" + m03.b.d(this.plateNumber) + ", wasPlateVerified=" + this.wasPlateVerified + ")";
        }

        private Params(String str, boolean z15) {
            this.plateNumber = str;
            this.wasPlateVerified = z15;
        }
    }
}
