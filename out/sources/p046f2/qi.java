package p046f2;

import c5.n;
import fr.k;
import h2.CalendarDate;
import h2.CalendarMonth;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\nB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0013"}, d2 = {"Lf2/qi;", "", "Lc5/n;", "gridStartCoordinates", "gridEndCoordinates", "", "firstIsSelectionStart", "lastIsSelectionEnd", "<init>", "(JJZZLfr/k;)V", "a", "J", "c", "()J", "b", "Z", "()Z", "d", "e", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class qi {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long gridStartCoordinates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long gridEndCoordinates;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean firstIsSelectionStart;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean lastIsSelectionEnd;

    /* JADX INFO: renamed from: f2.qi$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lf2/qi$a;", "", "<init>", "()V", "Lh2/p0;", "month", "Lh2/k0;", "startDate", "endDate", "Lf2/qi;", "a", "(Lh2/p0;Lh2/k0;Lh2/k0;)Lf2/qi;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final qi a(CalendarMonth month, CalendarDate startDate, CalendarDate endDate) {
            if (startDate.getUtcTimeMillis() > month.getEndUtcTimeMillis() || endDate.getUtcTimeMillis() < month.getStartUtcTimeMillis()) {
                return null;
            }
            boolean z15 = startDate.getUtcTimeMillis() >= month.getStartUtcTimeMillis();
            boolean z16 = endDate.getUtcTimeMillis() <= month.getEndUtcTimeMillis();
            int daysFromStartOfWeekToFirstOfMonth = z15 ? (month.getDaysFromStartOfWeekToFirstOfMonth() + startDate.getDayOfMonth()) - 1 : month.getDaysFromStartOfWeekToFirstOfMonth();
            int daysFromStartOfWeekToFirstOfMonth2 = z16 ? (month.getDaysFromStartOfWeekToFirstOfMonth() + endDate.getDayOfMonth()) - 1 : (month.getDaysFromStartOfWeekToFirstOfMonth() + month.getNumberOfDays()) - 1;
            return new qi(n.d((((long) (daysFromStartOfWeekToFirstOfMonth % 7)) << 32) | (((long) (daysFromStartOfWeekToFirstOfMonth / 7)) & BodyPartID.bodyIdMax)), n.d((((long) (daysFromStartOfWeekToFirstOfMonth2 % 7)) << 32) | (((long) (daysFromStartOfWeekToFirstOfMonth2 / 7)) & BodyPartID.bodyIdMax)), z15, z16, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ qi(long j15, long j16, boolean z15, boolean z16, k kVar) {
        this(j15, j16, z15, z16);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getFirstIsSelectionStart() {
        return this.firstIsSelectionStart;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getGridEndCoordinates() {
        return this.gridEndCoordinates;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getGridStartCoordinates() {
        return this.gridStartCoordinates;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getLastIsSelectionEnd() {
        return this.lastIsSelectionEnd;
    }

    private qi(long j15, long j16, boolean z15, boolean z16) {
        this.gridStartCoordinates = j15;
        this.gridEndCoordinates = j16;
        this.firstIsSelectionStart = z15;
        this.lastIsSelectionEnd = z16;
    }
}
