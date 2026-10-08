package d72;

import fr.t;
import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: d72.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001c\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b$\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b#\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b%\u0010\u0015R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b&\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010\u0015R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010\u0015R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b'\u0010)R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b*\u00101¨\u00062"}, d2 = {"Ld72/b;", "", "Ljava/time/OffsetDateTime;", "dateFrom", "publishedAt", "", "area", "comment", "dateTo", "description", "eventType", "", "level", "number", "office", "probability", "", "voivodeships", "<init>", "(Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/OffsetDateTime;", "b", "()Ljava/time/OffsetDateTime;", "h", "c", "Ljava/lang/String;", "d", "getComment", "e", "f", "g", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "i", "getNumber", "j", "getOffice", "k", "l", "Ljava/util/List;", "()Ljava/util/List;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HydroWarning {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime dateFrom;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime publishedAt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String area;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String comment;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime dateTo;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String eventType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer level;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String number;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String office;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer probability;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> voivodeships;

    public HydroWarning(OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str, String str2, OffsetDateTime offsetDateTime3, String str3, String str4, Integer num, String str5, String str6, Integer num2, List<String> list) {
        this.dateFrom = offsetDateTime;
        this.publishedAt = offsetDateTime2;
        this.area = str;
        this.comment = str2;
        this.dateTo = offsetDateTime3;
        this.description = str3;
        this.eventType = str4;
        this.level = num;
        this.number = str5;
        this.office = str6;
        this.probability = num2;
        this.voivodeships = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getArea() {
        return this.area;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OffsetDateTime getDateFrom() {
        return this.dateFrom;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final OffsetDateTime getDateTo() {
        return this.dateTo;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HydroWarning)) {
            return false;
        }
        HydroWarning hydroWarning = (HydroWarning) other;
        return t.c(this.dateFrom, hydroWarning.dateFrom) && t.c(this.publishedAt, hydroWarning.publishedAt) && t.c(this.area, hydroWarning.area) && t.c(this.comment, hydroWarning.comment) && t.c(this.dateTo, hydroWarning.dateTo) && t.c(this.description, hydroWarning.description) && t.c(this.eventType, hydroWarning.eventType) && t.c(this.level, hydroWarning.level) && t.c(this.number, hydroWarning.number) && t.c(this.office, hydroWarning.office) && t.c(this.probability, hydroWarning.probability) && t.c(this.voivodeships, hydroWarning.voivodeships);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getProbability() {
        return this.probability;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final OffsetDateTime getPublishedAt() {
        return this.publishedAt;
    }

    public int hashCode() {
        int iHashCode = ((this.dateFrom.hashCode() * 31) + this.publishedAt.hashCode()) * 31;
        String str = this.area;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.comment;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.dateTo;
        int iHashCode4 = (iHashCode3 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.eventType;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.level;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.number;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.office;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.probability;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list = this.voivodeships;
        return iHashCode10 + (list != null ? list.hashCode() : 0);
    }

    public final List<String> i() {
        return this.voivodeships;
    }

    public String toString() {
        return "HydroWarning(dateFrom=" + this.dateFrom + ", publishedAt=" + this.publishedAt + ", area=" + this.area + ", comment=" + this.comment + ", dateTo=" + this.dateTo + ", description=" + this.description + ", eventType=" + this.eventType + ", level=" + this.level + ", number=" + this.number + ", office=" + this.office + ", probability=" + this.probability + ", voivodeships=" + this.voivodeships + ')';
    }
}
