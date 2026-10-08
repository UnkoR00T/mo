package ou1;

import fr.t;
import fu.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ou1.g, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001e\u0010\u0015R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010\u000e¨\u0006!"}, d2 = {"Lou1/g;", "", "", "parentId", "picture", "", "Lou1/f;", "documentsData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "b", "()Lou1/f;", "a", "c", "()Ljava/util/List;", "", "g", "()Z", "f", "h", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "e", "Ljava/util/List;", "getDocumentsData", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DrivingLicenceFullData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String parentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String picture;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DrivingLicenceData> documentsData;

    public DrivingLicenceFullData(String str, String str2, List<DrivingLicenceData> list) {
        this.parentId = str;
        this.picture = str2;
        this.documentsData = list;
    }

    public final DrivingLicenceData a() {
        Object next;
        Iterator<T> it = this.documentsData.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (t.c(((DrivingLicenceData) next).getScopeName(), "ACTIVE_TEMPORARY_DRIVING_LICENCE")) {
                return (DrivingLicenceData) next;
            }
        }
        next = null;
        return (DrivingLicenceData) next;
    }

    public final DrivingLicenceData b() {
        Object next;
        Iterator<T> it = this.documentsData.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (t.c(((DrivingLicenceData) next).getScopeName(), "DRIVING_LICENCE")) {
                return (DrivingLicenceData) next;
            }
        }
        next = null;
        return (DrivingLicenceData) next;
    }

    public final List<DrivingLicenceData> c() {
        List<DrivingLicenceData> list = this.documentsData;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (r.d0(((DrivingLicenceData) obj).getScopeName(), "INVALIDATED_TEMPORARY_DRIVING_LICENCE", false, 2, null)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPicture() {
        return this.picture;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrivingLicenceFullData)) {
            return false;
        }
        DrivingLicenceFullData drivingLicenceFullData = (DrivingLicenceFullData) other;
        return t.c(this.parentId, drivingLicenceFullData.parentId) && t.c(this.picture, drivingLicenceFullData.picture) && t.c(this.documentsData, drivingLicenceFullData.documentsData);
    }

    public final boolean f() {
        return a() != null;
    }

    public final boolean g() {
        return b() != null;
    }

    public final boolean h() {
        return !c().isEmpty();
    }

    public int hashCode() {
        String str = this.parentId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.picture;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.documentsData.hashCode();
    }

    public String toString() {
        return "DrivingLicenceFullData(parentId=" + this.parentId + ", picture=" + this.picture + ", documentsData=" + this.documentsData + ')';
    }
}
