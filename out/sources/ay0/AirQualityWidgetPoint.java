package ay0;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ay0.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0015\u0010 ¨\u0006!"}, d2 = {"Lay0/b;", "", "", "id", "Ljava/time/OffsetDateTime;", "timestamp", "Lay0/e;", "qualityRate", "Lay0/d;", "location", "<init>", "(Ljava/lang/String;Ljava/time/OffsetDateTime;Lay0/e;Lay0/d;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Ljava/time/OffsetDateTime;", "c", "()Ljava/time/OffsetDateTime;", "Lay0/e;", "()Lay0/e;", "d", "Lay0/d;", "()Lay0/d;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AirQualityWidgetPoint {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime timestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final e qualityRate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final WidgetLocation location;

    public AirQualityWidgetPoint(String str, OffsetDateTime offsetDateTime, e eVar, WidgetLocation widgetLocation) {
        this.id = str;
        this.timestamp = offsetDateTime;
        this.qualityRate = eVar;
        this.location = widgetLocation;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final WidgetLocation getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e getQualityRate() {
        return this.qualityRate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AirQualityWidgetPoint)) {
            return false;
        }
        AirQualityWidgetPoint airQualityWidgetPoint = (AirQualityWidgetPoint) other;
        return t.c(this.id, airQualityWidgetPoint.id) && t.c(this.timestamp, airQualityWidgetPoint.timestamp) && this.qualityRate == airQualityWidgetPoint.qualityRate && t.c(this.location, airQualityWidgetPoint.location);
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        OffsetDateTime offsetDateTime = this.timestamp;
        return ((((iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31) + this.qualityRate.hashCode()) * 31) + this.location.hashCode();
    }

    public String toString() {
        return "AirQualityWidgetPoint(id=" + this.id + ", timestamp=" + this.timestamp + ", qualityRate=" + this.qualityRate + ", location=" + this.location + ")";
    }
}
