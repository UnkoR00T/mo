package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends kg.a {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25943b;

    public i() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f25942a == iVar.f25942a && jg.r.a(Boolean.valueOf(this.f25943b), Boolean.valueOf(iVar.f25943b));
    }

    public final int hashCode() {
        return jg.r.b(Integer.valueOf(this.f25942a), Boolean.valueOf(this.f25943b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 2, this.f25942a);
        kg.c.c(parcel, 3, this.f25943b);
        kg.c.b(parcel, iA);
    }

    public i(int i15, boolean z15) {
        this.f25942a = i15;
        this.f25943b = z15;
    }
}
