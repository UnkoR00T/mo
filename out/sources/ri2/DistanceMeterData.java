package ri2;

import fr.t;
import java.util.Date;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ri2.c, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, d2 = {"Lri2/c;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "unit", "b", "dataImporter", "Ljava/util/Date;", "Ljava/util/Date;", "()Ljava/util/Date;", "saveDate", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "value", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DistanceMeterData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("unit")
    private final String unit;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dataImporter")
    private final String dataImporter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("saveDate")
    private final Date saveDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("value")
    private final Integer value;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDataImporter() {
        return this.dataImporter;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Date getSaveDate() {
        return this.saveDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DistanceMeterData)) {
            return false;
        }
        DistanceMeterData distanceMeterData = (DistanceMeterData) other;
        return t.c(this.unit, distanceMeterData.unit) && t.c(this.dataImporter, distanceMeterData.dataImporter) && t.c(this.saveDate, distanceMeterData.saveDate) && t.c(this.value, distanceMeterData.value);
    }

    public int hashCode() {
        String str = this.unit;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dataImporter;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Date date = this.saveDate;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Integer num = this.value;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "DistanceMeterData(unit=" + this.unit + ", dataImporter=" + this.dataImporter + ", saveDate=" + this.saveDate + ", value=" + this.value + ")";
    }
}
