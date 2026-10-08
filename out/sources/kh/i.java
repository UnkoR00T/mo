package kh;

import android.os.Parcel;
import android.os.Parcelable;
import zg.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends kg.a {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f110940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f0 f110941b;

    i(boolean z15, f0 f0Var) {
        this.f110940a = z15;
        this.f110941b = f0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f110940a == iVar.f110940a && jg.r.a(this.f110941b, iVar.f110941b);
    }

    public final int hashCode() {
        return jg.r.b(Boolean.valueOf(this.f110940a));
    }

    public final String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("LocationAvailabilityRequest[");
        if (this.f110940a) {
            sb5.append("bypass, ");
        }
        if (this.f110941b != null) {
            sb5.append("impersonation=");
            sb5.append(this.f110941b);
            sb5.append(", ");
        }
        sb5.setLength(sb5.length() - 2);
        sb5.append(']');
        return sb5.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        boolean z15 = this.f110940a;
        int iA = kg.c.a(parcel);
        kg.c.c(parcel, 1, z15);
        kg.c.t(parcel, 2, this.f110941b, i15, false);
        kg.c.b(parcel, iA);
    }
}
