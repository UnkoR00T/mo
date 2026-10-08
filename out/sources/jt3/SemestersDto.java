package jt3;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jt3.h0, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Ljt3/h0;", "", "Ljt3/e0;", "currentSemester", "Ljt3/c0;", "message", "", "Ljt3/g0;", "previousSemesters", "<init>", "(Ljt3/e0;Ljt3/c0;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljt3/e0;", "()Ljt3/e0;", "b", "Ljt3/c0;", "()Ljt3/c0;", "c", "Ljava/util/List;", "()Ljava/util/List;", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SemestersDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("currentSemester")
    private final SemesterDetailsDto currentSemester;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("message")
    private final SchoolFamilyMessageDto message;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("previousSemesters")
    private final List<SemesterPreviewDto> previousSemesters;

    public SemestersDto() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final SemesterDetailsDto getCurrentSemester() {
        return this.currentSemester;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final SchoolFamilyMessageDto getMessage() {
        return this.message;
    }

    public final List<SemesterPreviewDto> c() {
        return this.previousSemesters;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SemestersDto)) {
            return false;
        }
        SemestersDto semestersDto = (SemestersDto) other;
        return fr.t.c(this.currentSemester, semestersDto.currentSemester) && fr.t.c(this.message, semestersDto.message) && fr.t.c(this.previousSemesters, semestersDto.previousSemesters);
    }

    public int hashCode() {
        SemesterDetailsDto semesterDetailsDto = this.currentSemester;
        int iHashCode = (semesterDetailsDto == null ? 0 : semesterDetailsDto.hashCode()) * 31;
        SchoolFamilyMessageDto schoolFamilyMessageDto = this.message;
        int iHashCode2 = (iHashCode + (schoolFamilyMessageDto == null ? 0 : schoolFamilyMessageDto.hashCode())) * 31;
        List<SemesterPreviewDto> list = this.previousSemesters;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "SemestersDto(currentSemester=" + this.currentSemester + ", message=" + this.message + ", previousSemesters=" + this.previousSemesters + ')';
    }

    public SemestersDto(SemesterDetailsDto semesterDetailsDto, SchoolFamilyMessageDto schoolFamilyMessageDto, List<SemesterPreviewDto> list) {
        this.currentSemester = semesterDetailsDto;
        this.message = schoolFamilyMessageDto;
        this.previousSemesters = list;
    }

    public /* synthetic */ SemestersDto(SemesterDetailsDto semesterDetailsDto, SchoolFamilyMessageDto schoolFamilyMessageDto, List list, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : semesterDetailsDto, (i15 & 2) != 0 ? null : schoolFamilyMessageDto, (i15 & 4) != 0 ? null : list);
    }
}
