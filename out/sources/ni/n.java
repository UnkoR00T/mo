package ni;

import android.os.Parcel;
import android.os.Parcelable;
import fr.t;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f136426a;

    public n(List list) {
        this.f136426a = list;
    }

    public final List a() {
        return this.f136426a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && t.c(this.f136426a, ((n) obj).f136426a);
    }

    public final int hashCode() {
        return this.f136426a.hashCode();
    }

    public final String toString() {
        List list = this.f136426a;
        StringBuilder sb5 = new StringBuilder(list.toString().length() + 43);
        sb5.append("ParcelablePhotoPageDataList(photoPageData=");
        sb5.append(list);
        sb5.append(")");
        return sb5.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        List list = this.f136426a;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((c) it.next()).writeToParcel(parcel, i15);
        }
    }
}
