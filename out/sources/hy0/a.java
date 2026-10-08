package hy0;

import ay0.AirQualityWidgetPoint;
import fr.k;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0003\u0007R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lhy0/a;", "", "", "a", "()Ljava/lang/Long;", "lastWidgetUpdate", "c", "b", "Lhy0/a$a;", "Lhy0/a$b;", "Lhy0/a$c;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: hy0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lhy0/a$a;", "Lhy0/a;", "Lay0/b;", "widgetPoint", "", "lastWidgetUpdate", "<init>", "(Lay0/b;J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lay0/b;", "b", "()Lay0/b;", "J", "()Ljava/lang/Long;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Added implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AirQualityWidgetPoint widgetPoint;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long lastWidgetUpdate;

        public Added(AirQualityWidgetPoint airQualityWidgetPoint, long j15) {
            this.widgetPoint = airQualityWidgetPoint;
            this.lastWidgetUpdate = j15;
        }

        @Override // hy0.a
        /* JADX INFO: renamed from: a */
        public Long getLastWidgetUpdate() {
            return Long.valueOf(this.lastWidgetUpdate);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final AirQualityWidgetPoint getWidgetPoint() {
            return this.widgetPoint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Added)) {
                return false;
            }
            Added added = (Added) other;
            return t.c(this.widgetPoint, added.widgetPoint) && this.lastWidgetUpdate == added.lastWidgetUpdate;
        }

        public int hashCode() {
            return (this.widgetPoint.hashCode() * 31) + Long.hashCode(this.lastWidgetUpdate);
        }

        public String toString() {
            return "Added(widgetPoint=" + this.widgetPoint + ", lastWidgetUpdate=" + this.lastWidgetUpdate + ')';
        }
    }

    /* JADX INFO: renamed from: hy0.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lhy0/a$b;", "Lhy0/a;", "", "lastWidgetUpdate", "<init>", "(Ljava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NotAdded implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long lastWidgetUpdate;

        public NotAdded(Long l15) {
            this.lastWidgetUpdate = l15;
        }

        @Override // hy0.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public Long getLastWidgetUpdate() {
            return this.lastWidgetUpdate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NotAdded) && t.c(this.lastWidgetUpdate, ((NotAdded) other).lastWidgetUpdate);
        }

        public int hashCode() {
            Long l15 = this.lastWidgetUpdate;
            if (l15 == null) {
                return 0;
            }
            return l15.hashCode();
        }

        public String toString() {
            return "NotAdded(lastWidgetUpdate=" + this.lastWidgetUpdate + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    Long getLastWidgetUpdate();

    /* JADX INFO: renamed from: hy0.a$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lhy0/a$c;", "Lhy0/a;", "", "lastWidgetUpdate", "<init>", "(Ljava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Uninitialized implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long lastWidgetUpdate;

        public Uninitialized(Long l15) {
            this.lastWidgetUpdate = l15;
        }

        @Override // hy0.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public Long getLastWidgetUpdate() {
            return this.lastWidgetUpdate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Uninitialized) && t.c(this.lastWidgetUpdate, ((Uninitialized) other).lastWidgetUpdate);
        }

        public int hashCode() {
            Long l15 = this.lastWidgetUpdate;
            if (l15 == null) {
                return 0;
            }
            return l15.hashCode();
        }

        public String toString() {
            return "Uninitialized(lastWidgetUpdate=" + this.lastWidgetUpdate + ')';
        }

        public /* synthetic */ Uninitialized(Long l15, int i15, k kVar) {
            this((i15 & 1) != 0 ? null : l15);
        }
    }
}
