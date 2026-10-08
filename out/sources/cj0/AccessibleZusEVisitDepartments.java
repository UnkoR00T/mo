package cj0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: cj0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcj0/a;", "", "Lcj0/a$a;", "status", "", "Lcj0/h;", "otherDepartments", "department", "<init>", "(Lcj0/a$a;Ljava/util/List;Lcj0/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcj0/a$a;", "c", "()Lcj0/a$a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "Lcj0/h;", "()Lcj0/h;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccessibleZusEVisitDepartments {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC0702a status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ZusEVisitDepartment> otherDepartments;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ZusEVisitDepartment department;

    /* JADX INFO: renamed from: cj0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcj0/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum EnumC0702a {
        FOUND,
        NOT_FOUND,
        NOT_FOUND_VISIT,
        OTHER,
        UNKNOWN;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ wq.a f27236g = wq.b.a(b());
    }

    public AccessibleZusEVisitDepartments(EnumC0702a enumC0702a, List<ZusEVisitDepartment> list, ZusEVisitDepartment zusEVisitDepartment) {
        this.status = enumC0702a;
        this.otherDepartments = list;
        this.department = zusEVisitDepartment;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ZusEVisitDepartment getDepartment() {
        return this.department;
    }

    public final List<ZusEVisitDepartment> b() {
        return this.otherDepartments;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC0702a getStatus() {
        return this.status;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessibleZusEVisitDepartments)) {
            return false;
        }
        AccessibleZusEVisitDepartments accessibleZusEVisitDepartments = (AccessibleZusEVisitDepartments) other;
        return this.status == accessibleZusEVisitDepartments.status && t.c(this.otherDepartments, accessibleZusEVisitDepartments.otherDepartments) && t.c(this.department, accessibleZusEVisitDepartments.department);
    }

    public int hashCode() {
        int iHashCode = ((this.status.hashCode() * 31) + this.otherDepartments.hashCode()) * 31;
        ZusEVisitDepartment zusEVisitDepartment = this.department;
        return iHashCode + (zusEVisitDepartment == null ? 0 : zusEVisitDepartment.hashCode());
    }

    public String toString() {
        return "AccessibleZusEVisitDepartments(status=" + this.status + ", otherDepartments=" + this.otherDepartments + ", department=" + this.department + ")";
    }
}
