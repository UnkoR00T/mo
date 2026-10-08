package f43;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: f43.g, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lf43/g;", "", "", "lessonId", "title", "description", "Lf43/h;", "iconType", "Ljava/time/OffsetDateTime;", "fromTime", "toTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lf43/h;Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "e", "c", "Lf43/h;", "()Lf43/h;", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "f", "schooldashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NextLesson {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lessonId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final h iconType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime fromTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime toTime;

    public NextLesson(String str, String str2, String str3, h hVar, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2) {
        this.lessonId = str;
        this.title = str2;
        this.description = str3;
        this.iconType = hVar;
        this.fromTime = offsetDateTime;
        this.toTime = offsetDateTime2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OffsetDateTime getFromTime() {
        return this.fromTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h getIconType() {
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
        if (!(other instanceof NextLesson)) {
            return false;
        }
        NextLesson nextLesson = (NextLesson) other;
        return t.c(this.lessonId, nextLesson.lessonId) && t.c(this.title, nextLesson.title) && t.c(this.description, nextLesson.description) && this.iconType == nextLesson.iconType && t.c(this.fromTime, nextLesson.fromTime) && t.c(this.toTime, nextLesson.toTime);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final OffsetDateTime getToTime() {
        return this.toTime;
    }

    public int hashCode() {
        return (((((((((this.lessonId.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.iconType.hashCode()) * 31) + this.fromTime.hashCode()) * 31) + this.toTime.hashCode();
    }

    public String toString() {
        return "NextLesson(lessonId=" + this.lessonId + ", title=" + this.title + ", description=" + this.description + ", iconType=" + this.iconType + ", fromTime=" + this.fromTime + ", toTime=" + this.toTime + ')';
    }
}
