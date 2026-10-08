package pl.gov.coi.mobywatel.technical.containers.data.model;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import java.util.Date;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/model/DistanceMeterDto;", "", "unit", "", "dataImporter", "saveDate", "Ljava/util/Date;", "value", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;)V", "getUnit", "()Ljava/lang/String;", "getDataImporter", "getSaveDate", "()Ljava/util/Date;", "getValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;)Lpl/gov/coi/mobywatel/technical/containers/data/model/DistanceMeterDto;", "equals", "", "other", "hashCode", "toString", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DistanceMeterDto {

    @c("dataImporter")
    private final String dataImporter;

    @c("saveDate")
    private final Date saveDate;

    @c("unit")
    private final String unit;

    @c("value")
    private final Integer value;

    public DistanceMeterDto() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ DistanceMeterDto copy$default(DistanceMeterDto distanceMeterDto, String str, String str2, Date date, Integer num, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = distanceMeterDto.unit;
        }
        if ((i15 & 2) != 0) {
            str2 = distanceMeterDto.dataImporter;
        }
        if ((i15 & 4) != 0) {
            date = distanceMeterDto.saveDate;
        }
        if ((i15 & 8) != 0) {
            num = distanceMeterDto.value;
        }
        return distanceMeterDto.copy(str, str2, date, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDataImporter() {
        return this.dataImporter;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getSaveDate() {
        return this.saveDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getValue() {
        return this.value;
    }

    public final DistanceMeterDto copy(String unit, String dataImporter, Date saveDate, Integer value) {
        return new DistanceMeterDto(unit, dataImporter, saveDate, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DistanceMeterDto)) {
            return false;
        }
        DistanceMeterDto distanceMeterDto = (DistanceMeterDto) other;
        return t.c(this.unit, distanceMeterDto.unit) && t.c(this.dataImporter, distanceMeterDto.dataImporter) && t.c(this.saveDate, distanceMeterDto.saveDate) && t.c(this.value, distanceMeterDto.value);
    }

    public final String getDataImporter() {
        return this.dataImporter;
    }

    public final Date getSaveDate() {
        return this.saveDate;
    }

    public final String getUnit() {
        return this.unit;
    }

    public final Integer getValue() {
        return this.value;
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
        return "DistanceMeterDto(unit=" + this.unit + ", dataImporter=" + this.dataImporter + ", saveDate=" + this.saveDate + ", value=" + this.value + ')';
    }

    public DistanceMeterDto(String str, String str2, Date date, Integer num) {
        this.unit = str;
        this.dataImporter = str2;
        this.saveDate = date;
        this.value = num;
    }

    public /* synthetic */ DistanceMeterDto(String str, String str2, Date date, Integer num, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? null : date, (i15 & 8) != 0 ? null : num);
    }
}
