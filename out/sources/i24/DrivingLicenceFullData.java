package i24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: i24.l, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0010J*\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\r¨\u0006\""}, d2 = {"Li24/l;", "", "", "parentId", "", "Li24/k;", "documentsData", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "e", "()Li24/k;", "c", "f", "()Ljava/util/List;", "", "i", "()Z", "h", "j", "a", "(Ljava/lang/String;Ljava/util/List;)Li24/l;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "g", "b", "Ljava/util/List;", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DrivingLicenceFullData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String parentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DrivingLicenceData> documentsData;

    public DrivingLicenceFullData(String str, List<DrivingLicenceData> list) {
        this.parentId = str;
        this.documentsData = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DrivingLicenceFullData b(DrivingLicenceFullData drivingLicenceFullData, String str, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = drivingLicenceFullData.parentId;
        }
        if ((i15 & 2) != 0) {
            list = drivingLicenceFullData.documentsData;
        }
        return drivingLicenceFullData.a(str, list);
    }

    public final DrivingLicenceFullData a(String parentId, List<DrivingLicenceData> documentsData) {
        return new DrivingLicenceFullData(parentId, documentsData);
    }

    public final DrivingLicenceData c() {
        Object next;
        Iterator<T> it = this.documentsData.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (fr.t.c(((DrivingLicenceData) next).getScopeName(), "ACTIVE_TEMPORARY_DRIVING_LICENCE")) {
                return (DrivingLicenceData) next;
            }
        }
        next = null;
        return (DrivingLicenceData) next;
    }

    public final List<DrivingLicenceData> d() {
        return this.documentsData;
    }

    public final DrivingLicenceData e() {
        Object next;
        Iterator<T> it = this.documentsData.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (fr.t.c(((DrivingLicenceData) next).getScopeName(), "DRIVING_LICENCE")) {
                return (DrivingLicenceData) next;
            }
        }
        next = null;
        return (DrivingLicenceData) next;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrivingLicenceFullData)) {
            return false;
        }
        DrivingLicenceFullData drivingLicenceFullData = (DrivingLicenceFullData) other;
        return fr.t.c(this.parentId, drivingLicenceFullData.parentId) && fr.t.c(this.documentsData, drivingLicenceFullData.documentsData);
    }

    public final List<DrivingLicenceData> f() {
        List<DrivingLicenceData> list = this.documentsData;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (fu.r.d0(((DrivingLicenceData) obj).getScopeName(), "INVALIDATED_TEMPORARY_DRIVING_LICENCE", false, 2, null)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    public final boolean h() {
        return c() != null;
    }

    public int hashCode() {
        return (this.parentId.hashCode() * 31) + this.documentsData.hashCode();
    }

    public final boolean i() {
        return e() != null;
    }

    public final boolean j() {
        return !f().isEmpty();
    }

    public String toString() {
        return "DrivingLicenceFullData(parentId=" + this.parentId + ", documentsData=" + this.documentsData + ")";
    }
}
