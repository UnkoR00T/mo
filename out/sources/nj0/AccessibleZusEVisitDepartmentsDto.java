package nj0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: nj0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u000e\u0010\u0019¨\u0006\u001b"}, d2 = {"Lnj0/a;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lnj0/q0;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "otherDepartments", "Lnj0/a$a;", "Lnj0/a$a;", "c", "()Lnj0/a$a;", "status", "Lnj0/q0;", "()Lnj0/q0;", "department", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccessibleZusEVisitDepartmentsDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("otherDepartments")
    private final List<ZusEVisitDepartmentDto> otherDepartments;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("status")
    private final EnumC3372a status;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("department")
    private final ZusEVisitDepartmentDto department;

    /* JADX INFO: renamed from: nj0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lnj0/a$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "b", "c", "d", "e", "f", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum EnumC3372a {
        FOUND("FOUND"),
        NOT_FOUND("NOT_FOUND"),
        NOT_FOUND_VISIT("NOT_FOUND_VISIT"),
        OTHER("OTHER"),
        UNKNOWN("UNKNOWN");


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ wq.a f136532h = wq.b.a(b());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        EnumC3372a(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ZusEVisitDepartmentDto getDepartment() {
        return this.department;
    }

    public final List<ZusEVisitDepartmentDto> b() {
        return this.otherDepartments;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC3372a getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessibleZusEVisitDepartmentsDto)) {
            return false;
        }
        AccessibleZusEVisitDepartmentsDto accessibleZusEVisitDepartmentsDto = (AccessibleZusEVisitDepartmentsDto) other;
        return fr.t.c(this.otherDepartments, accessibleZusEVisitDepartmentsDto.otherDepartments) && this.status == accessibleZusEVisitDepartmentsDto.status && fr.t.c(this.department, accessibleZusEVisitDepartmentsDto.department);
    }

    public int hashCode() {
        int iHashCode = ((this.otherDepartments.hashCode() * 31) + this.status.hashCode()) * 31;
        ZusEVisitDepartmentDto zusEVisitDepartmentDto = this.department;
        return iHashCode + (zusEVisitDepartmentDto == null ? 0 : zusEVisitDepartmentDto.hashCode());
    }

    public String toString() {
        return "AccessibleZusEVisitDepartmentsDto(otherDepartments=" + this.otherDepartments + ", status=" + this.status + ", department=" + this.department + ')';
    }
}
