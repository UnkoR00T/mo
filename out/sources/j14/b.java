package j14;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lj14/b;", "Lgz/a;", "Lj14/b$a;", "Lhz/g;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b extends gz.a<Params, hz.g> {

    /* JADX INFO: renamed from: j14.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lj14/b$a;", "Lgz/b$a;", "", "isRequired", "Liy/b0;", "seriesAndNumber", "<init>", "(ZLiy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Liy/b0;", "()Liy/b0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isRequired;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 seriesAndNumber;

        public Params(boolean z15, b0 b0Var) {
            this.isRequired = z15;
            this.seriesAndNumber = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getSeriesAndNumber() {
            return this.seriesAndNumber;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.isRequired == params.isRequired && t.c(this.seriesAndNumber, params.seriesAndNumber);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isRequired) * 31) + this.seriesAndNumber.hashCode();
        }

        public String toString() {
            return "Params(isRequired=" + this.isRequired + ", seriesAndNumber=" + this.seriesAndNumber + ")";
        }

        public /* synthetic */ Params(boolean z15, b0 b0Var, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? true : z15, b0Var);
        }
    }
}
