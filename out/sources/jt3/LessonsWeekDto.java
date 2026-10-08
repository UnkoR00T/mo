package jt3;

import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jt3.z, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\r\u0010\u0018R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c¨\u0006\u001e"}, d2 = {"Ljt3/z;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/OffsetDateTime;", "a", "Ljava/time/OffsetDateTime;", "b", "()Ljava/time/OffsetDateTime;", "maxSelectionDate", "d", "minSelectionDate", "", "Ljt3/y;", "c", "Ljava/util/List;", "()Ljava/util/List;", "days", "Ljt3/c0;", "Ljt3/c0;", "()Ljt3/c0;", "message", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LessonsWeekDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("maxSelectionDate")
    private final OffsetDateTime maxSelectionDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("minSelectionDate")
    private final OffsetDateTime minSelectionDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("days")
    private final List<LessonsDayDto> days;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("message")
    private final SchoolFamilyMessageDto message;

    public final List<LessonsDayDto> a() {
        return this.days;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OffsetDateTime getMaxSelectionDate() {
        return this.maxSelectionDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final SchoolFamilyMessageDto getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final OffsetDateTime getMinSelectionDate() {
        return this.minSelectionDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LessonsWeekDto)) {
            return false;
        }
        LessonsWeekDto lessonsWeekDto = (LessonsWeekDto) other;
        return fr.t.c(this.maxSelectionDate, lessonsWeekDto.maxSelectionDate) && fr.t.c(this.minSelectionDate, lessonsWeekDto.minSelectionDate) && fr.t.c(this.days, lessonsWeekDto.days) && fr.t.c(this.message, lessonsWeekDto.message);
    }

    public int hashCode() {
        int iHashCode = ((this.maxSelectionDate.hashCode() * 31) + this.minSelectionDate.hashCode()) * 31;
        List<LessonsDayDto> list = this.days;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        SchoolFamilyMessageDto schoolFamilyMessageDto = this.message;
        return iHashCode2 + (schoolFamilyMessageDto != null ? schoolFamilyMessageDto.hashCode() : 0);
    }

    public String toString() {
        return "LessonsWeekDto(maxSelectionDate=" + this.maxSelectionDate + ", minSelectionDate=" + this.minSelectionDate + ", days=" + this.days + ", message=" + this.message + ')';
    }
}
