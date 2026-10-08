package on0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: on0.c0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0018"}, d2 = {"Lon0/c0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "date", "b", "I", "numberOfLessons", "", "Lon0/z;", "c", "Ljava/util/List;", "()Ljava/util/List;", "slots", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LessonsDayDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("date")
    private final String date;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("numberOfLessons")
    private final int numberOfLessons;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("slots")
    private final List<LessonPreviewDto> slots;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getNumberOfLessons() {
        return this.numberOfLessons;
    }

    public final List<LessonPreviewDto> c() {
        return this.slots;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LessonsDayDto)) {
            return false;
        }
        LessonsDayDto lessonsDayDto = (LessonsDayDto) other;
        return fr.t.c(this.date, lessonsDayDto.date) && this.numberOfLessons == lessonsDayDto.numberOfLessons && fr.t.c(this.slots, lessonsDayDto.slots);
    }

    public int hashCode() {
        return (((this.date.hashCode() * 31) + Integer.hashCode(this.numberOfLessons)) * 31) + this.slots.hashCode();
    }

    public String toString() {
        return "LessonsDayDto(date=" + this.date + ", numberOfLessons=" + this.numberOfLessons + ", slots=" + this.slots + ')';
    }
}
