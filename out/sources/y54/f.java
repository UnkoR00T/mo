package y54;

import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u000b\b\u000eB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Ly54/f;", "", "", "days", "", "uniqueId", "<init>", "(JLjava/lang/String;)V", "a", "J", "()J", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "Ly54/f$a;", "Ly54/f$b;", "Ly54/f$c;", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long days;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String uniqueId;

    /* JADX INFO: renamed from: y54.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ly54/f$a;", "Ly54/f;", "", "days", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "J", "a", "()J", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class After extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long days;

        public After(long j15) {
            super(j15, "AF", null);
            this.days = j15;
        }

        @Override // y54.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public long getDays() {
            return this.days;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof After) && this.days == ((After) other).days;
        }

        public int hashCode() {
            return Long.hashCode(this.days);
        }

        public String toString() {
            return "After(days=" + this.days + ')';
        }
    }

    /* JADX INFO: renamed from: y54.f$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ly54/f$b;", "Ly54/f;", "", "days", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "J", "a", "()J", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Before extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long days;

        public Before(long j15) {
            super(j15, "BF", null);
            this.days = j15;
        }

        @Override // y54.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public long getDays() {
            return this.days;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Before) && this.days == ((Before) other).days;
        }

        public int hashCode() {
            return Long.hashCode(this.days);
        }

        public String toString() {
            return "Before(days=" + this.days + ')';
        }
    }

    /* JADX INFO: renamed from: y54.f$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ly54/f$c;", "Ly54/f;", "", "days", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "J", "a", "()J", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OnTime extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long days;

        public OnTime(long j15) {
            super(j15, "OT", null);
            this.days = j15;
        }

        @Override // y54.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public long getDays() {
            return this.days;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnTime) && this.days == ((OnTime) other).days;
        }

        public int hashCode() {
            return Long.hashCode(this.days);
        }

        public String toString() {
            return "OnTime(days=" + this.days + ')';
        }

        public /* synthetic */ OnTime(long j15, int i15, k kVar) {
            this((i15 & 1) != 0 ? 0L : j15);
        }
    }

    public /* synthetic */ f(long j15, String str, k kVar) {
        this(j15, str);
    }

    /* JADX INFO: renamed from: a */
    public abstract long getDays();

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getUniqueId() {
        return this.uniqueId;
    }

    private f(long j15, String str) {
        this.days = j15;
        this.uniqueId = str;
    }
}
