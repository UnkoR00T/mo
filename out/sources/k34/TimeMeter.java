package k34;

import java.util.Date;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: k34.e0, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lk34/e0;", "", "", "unit", "dataImporter", "Ljava/util/Date;", "saveDate", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/Date;", "()Ljava/util/Date;", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TimeMeter {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unit;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dataImporter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Date saveDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer value;

    public TimeMeter(String str, String str2, Date date, Integer num) {
        this.unit = str;
        this.dataImporter = str2;
        this.saveDate = date;
        this.value = num;
    }

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
        if (!(other instanceof TimeMeter)) {
            return false;
        }
        TimeMeter timeMeter = (TimeMeter) other;
        return fr.t.c(this.unit, timeMeter.unit) && fr.t.c(this.dataImporter, timeMeter.dataImporter) && fr.t.c(this.saveDate, timeMeter.saveDate) && fr.t.c(this.value, timeMeter.value);
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
        return "TimeMeter(unit=" + this.unit + ", dataImporter=" + this.dataImporter + ", saveDate=" + this.saveDate + ", value=" + this.value + ")";
    }
}
