package cj0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: cj0.g, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcj0/g;", "", "", "Lcj0/h;", "allDepartments", "rumDepartments", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ZusEVisitCollectiveDepartments {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ZusEVisitDepartment> allDepartments;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ZusEVisitDepartment> rumDepartments;

    public ZusEVisitCollectiveDepartments(List<ZusEVisitDepartment> list, List<ZusEVisitDepartment> list2) {
        this.allDepartments = list;
        this.rumDepartments = list2;
    }

    public final List<ZusEVisitDepartment> a() {
        return this.allDepartments;
    }

    public final List<ZusEVisitDepartment> b() {
        return this.rumDepartments;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZusEVisitCollectiveDepartments)) {
            return false;
        }
        ZusEVisitCollectiveDepartments zusEVisitCollectiveDepartments = (ZusEVisitCollectiveDepartments) other;
        return t.c(this.allDepartments, zusEVisitCollectiveDepartments.allDepartments) && t.c(this.rumDepartments, zusEVisitCollectiveDepartments.rumDepartments);
    }

    public int hashCode() {
        return (this.allDepartments.hashCode() * 31) + this.rumDepartments.hashCode();
    }

    public String toString() {
        return "ZusEVisitCollectiveDepartments(allDepartments=" + this.allDepartments + ", rumDepartments=" + this.rumDepartments + ")";
    }
}
