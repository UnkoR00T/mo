package z92;

import fr.k;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lz92/d;", "Lgz/b;", "Lz92/d$a;", "Loq/i0;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends gz.b<Params, i0> {

    /* JADX INFO: renamed from: z92.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, d2 = {"Lz92/d$a;", "Lgz/b$a;", "", "olderThanDays", "exceedingCount", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int olderThanDays;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int exceedingCount;

        /* JADX WARN: Illegal instructions before constructor call */
        public Params() {
            int i15 = 0;
            this(i15, i15, 3, null);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getExceedingCount() {
            return this.exceedingCount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getOlderThanDays() {
            return this.olderThanDays;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.olderThanDays == params.olderThanDays && this.exceedingCount == params.exceedingCount;
        }

        public int hashCode() {
            return (Integer.hashCode(this.olderThanDays) * 31) + Integer.hashCode(this.exceedingCount);
        }

        public String toString() {
            return "Params(olderThanDays=" + this.olderThanDays + ", exceedingCount=" + this.exceedingCount + ")";
        }

        public Params(int i15, int i16) {
            this.olderThanDays = i15;
            this.exceedingCount = i16;
        }

        public /* synthetic */ Params(int i15, int i16, int i17, k kVar) {
            this((i17 & 1) != 0 ? 30 : i15, (i17 & 2) != 0 ? 50 : i16);
        }
    }
}
