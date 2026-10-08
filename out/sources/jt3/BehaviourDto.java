package jt3;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jt3.g, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Ljt3/g;", "", "Ljt3/c0;", "message", "", "Ljt3/k;", "semesters", "<init>", "(Ljt3/c0;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljt3/c0;", "()Ljt3/c0;", "b", "Ljava/util/List;", "()Ljava/util/List;", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BehaviourDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("message")
    private final SchoolFamilyMessageDto message;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("semesters")
    private final List<BehaviourSemesterDto> semesters;

    /* JADX WARN: Multi-variable type inference failed */
    public BehaviourDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final SchoolFamilyMessageDto getMessage() {
        return this.message;
    }

    public final List<BehaviourSemesterDto> b() {
        return this.semesters;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BehaviourDto)) {
            return false;
        }
        BehaviourDto behaviourDto = (BehaviourDto) other;
        return fr.t.c(this.message, behaviourDto.message) && fr.t.c(this.semesters, behaviourDto.semesters);
    }

    public int hashCode() {
        SchoolFamilyMessageDto schoolFamilyMessageDto = this.message;
        int iHashCode = (schoolFamilyMessageDto == null ? 0 : schoolFamilyMessageDto.hashCode()) * 31;
        List<BehaviourSemesterDto> list = this.semesters;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "BehaviourDto(message=" + this.message + ", semesters=" + this.semesters + ')';
    }

    public BehaviourDto(SchoolFamilyMessageDto schoolFamilyMessageDto, List<BehaviourSemesterDto> list) {
        this.message = schoolFamilyMessageDto;
        this.semesters = list;
    }

    public /* synthetic */ BehaviourDto(SchoolFamilyMessageDto schoolFamilyMessageDto, List list, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : schoolFamilyMessageDto, (i15 & 2) != 0 ? null : list);
    }
}
