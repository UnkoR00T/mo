package on0;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: on0.e0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0015\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001a\u0010\u0004R\u001a\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\r\u001a\u0004\b\u001e\u0010\u0004R\u001a\u0010#\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b \u0010\u0017¨\u0006$"}, d2 = {"Lon0/e0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getDateTime", "getDateTime$annotations", "()V", "dateTime", "b", "description", "Ljava/time/OffsetDateTime;", "c", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "fromTime", "Lon0/p0;", "d", "Lon0/p0;", "()Lon0/p0;", "iconType", "e", "lessonId", "f", "title", "g", "toTime", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NextLessonDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("dateTime")
    private final String dateTime;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("description")
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fromTime")
    private final OffsetDateTime fromTime;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("iconType")
    private final p0 iconType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("lessonId")
    private final String lessonId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("title")
    private final String title;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("toTime")
    private final OffsetDateTime toTime;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OffsetDateTime getFromTime() {
        return this.fromTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final p0 getIconType() {
        return this.iconType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLessonId() {
        return this.lessonId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NextLessonDto)) {
            return false;
        }
        NextLessonDto nextLessonDto = (NextLessonDto) other;
        return fr.t.c(this.dateTime, nextLessonDto.dateTime) && fr.t.c(this.description, nextLessonDto.description) && fr.t.c(this.fromTime, nextLessonDto.fromTime) && this.iconType == nextLessonDto.iconType && fr.t.c(this.lessonId, nextLessonDto.lessonId) && fr.t.c(this.title, nextLessonDto.title) && fr.t.c(this.toTime, nextLessonDto.toTime);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final OffsetDateTime getToTime() {
        return this.toTime;
    }

    public int hashCode() {
        return (((((((((((this.dateTime.hashCode() * 31) + this.description.hashCode()) * 31) + this.fromTime.hashCode()) * 31) + this.iconType.hashCode()) * 31) + this.lessonId.hashCode()) * 31) + this.title.hashCode()) * 31) + this.toTime.hashCode();
    }

    public String toString() {
        return "NextLessonDto(dateTime=" + this.dateTime + ", description=" + this.description + ", fromTime=" + this.fromTime + ", iconType=" + this.iconType + ", lessonId=" + this.lessonId + ", title=" + this.title + ", toTime=" + this.toTime + ')';
    }
}
