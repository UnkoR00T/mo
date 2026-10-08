package jt3;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jt3.s, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u0004R\u001a\u0010\"\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010&\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0007R\u001a\u0010(\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\r\u001a\u0004\b'\u0010\u0004R\u001a\u0010+\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\r\u001a\u0004\b*\u0010\u0004R\u001a\u0010-\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b,\u0010!R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\r\u001a\u0004\b\u0015\u0010\u0004R\u001c\u00103\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b#\u00102R\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\r\u001a\u0004\b)\u0010\u0004R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\r\u001a\u0004\b0\u0010\u0004¨\u00068"}, d2 = {"Ljt3/s;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "attendanceDescription", "Ljt3/r;", "b", "Ljt3/r;", "()Ljt3/r;", "attendanceStatus", "Ljava/time/LocalDate;", "c", "Ljava/time/LocalDate;", "d", "()Ljava/time/LocalDate;", "date", "e", "getDuration$annotations", "()V", "duration", "Ljava/time/OffsetDateTime;", "Ljava/time/OffsetDateTime;", "getFromTime", "()Ljava/time/OffsetDateTime;", "fromTime", "f", "I", "g", "number", "i", "teacher", "h", "j", "title", "getToTime", "toTime", "classNumber", "Ljt3/t;", "k", "Ljt3/t;", "()Ljt3/t;", "info", "l", "previousTeacher", "m", "topic", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LessonDetailsDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("attendanceDescription")
    private final String attendanceDescription;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("attendanceStatus")
    private final r attendanceStatus;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("date")
    private final LocalDate date;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("duration")
    private final String duration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fromTime")
    private final OffsetDateTime fromTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("number")
    private final int number;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("teacher")
    private final String teacher;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("title")
    private final String title;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("toTime")
    private final OffsetDateTime toTime;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("classNumber")
    private final String classNumber;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("info")
    private final LessonInfoDto info;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("previousTeacher")
    private final String previousTeacher;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("topic")
    private final String topic;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAttendanceDescription() {
        return this.attendanceDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final r getAttendanceStatus() {
        return this.attendanceStatus;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getClassNumber() {
        return this.classNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalDate getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LessonDetailsDto)) {
            return false;
        }
        LessonDetailsDto lessonDetailsDto = (LessonDetailsDto) other;
        return fr.t.c(this.attendanceDescription, lessonDetailsDto.attendanceDescription) && this.attendanceStatus == lessonDetailsDto.attendanceStatus && fr.t.c(this.date, lessonDetailsDto.date) && fr.t.c(this.duration, lessonDetailsDto.duration) && fr.t.c(this.fromTime, lessonDetailsDto.fromTime) && this.number == lessonDetailsDto.number && fr.t.c(this.teacher, lessonDetailsDto.teacher) && fr.t.c(this.title, lessonDetailsDto.title) && fr.t.c(this.toTime, lessonDetailsDto.toTime) && fr.t.c(this.classNumber, lessonDetailsDto.classNumber) && fr.t.c(this.info, lessonDetailsDto.info) && fr.t.c(this.previousTeacher, lessonDetailsDto.previousTeacher) && fr.t.c(this.topic, lessonDetailsDto.topic);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final LessonInfoDto getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPreviousTeacher() {
        return this.previousTeacher;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.attendanceDescription.hashCode() * 31) + this.attendanceStatus.hashCode()) * 31) + this.date.hashCode()) * 31) + this.duration.hashCode()) * 31) + this.fromTime.hashCode()) * 31) + Integer.hashCode(this.number)) * 31) + this.teacher.hashCode()) * 31) + this.title.hashCode()) * 31) + this.toTime.hashCode()) * 31;
        String str = this.classNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        LessonInfoDto lessonInfoDto = this.info;
        int iHashCode3 = (iHashCode2 + (lessonInfoDto == null ? 0 : lessonInfoDto.hashCode())) * 31;
        String str2 = this.previousTeacher;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.topic;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTeacher() {
        return this.teacher;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    public String toString() {
        return "LessonDetailsDto(attendanceDescription=" + this.attendanceDescription + ", attendanceStatus=" + this.attendanceStatus + ", date=" + this.date + ", duration=" + this.duration + ", fromTime=" + this.fromTime + ", number=" + this.number + ", teacher=" + this.teacher + ", title=" + this.title + ", toTime=" + this.toTime + ", classNumber=" + this.classNumber + ", info=" + this.info + ", previousTeacher=" + this.previousTeacher + ", topic=" + this.topic + ')';
    }
}
