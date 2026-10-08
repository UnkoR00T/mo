package jt3;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jt3.e0, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0011\u0010\u001a¨\u0006\u001c"}, d2 = {"Ljt3/e0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "id", "", "Ljt3/i0;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "subjects", "d", "title", "Ljt3/c0;", "Ljt3/c0;", "()Ljt3/c0;", "message", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SemesterDetailsDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("id")
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("subjects")
    private final List<SubjectEntryDto> subjects;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("title")
    private final String title;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("message")
    private final SchoolFamilyMessageDto message;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final SchoolFamilyMessageDto getMessage() {
        return this.message;
    }

    public final List<SubjectEntryDto> c() {
        return this.subjects;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SemesterDetailsDto)) {
            return false;
        }
        SemesterDetailsDto semesterDetailsDto = (SemesterDetailsDto) other;
        return fr.t.c(this.id, semesterDetailsDto.id) && fr.t.c(this.subjects, semesterDetailsDto.subjects) && fr.t.c(this.title, semesterDetailsDto.title) && fr.t.c(this.message, semesterDetailsDto.message);
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + this.subjects.hashCode()) * 31) + this.title.hashCode()) * 31;
        SchoolFamilyMessageDto schoolFamilyMessageDto = this.message;
        return iHashCode + (schoolFamilyMessageDto == null ? 0 : schoolFamilyMessageDto.hashCode());
    }

    public String toString() {
        return "SemesterDetailsDto(id=" + this.id + ", subjects=" + this.subjects + ", title=" + this.title + ", message=" + this.message + ')';
    }
}
