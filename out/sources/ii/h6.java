package ii;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
final class h6 extends u2 {
    public static final Parcelable.Creator<h6> CREATOR = new g6();

    h6(String str, String str2, String str3, String str4, String str5, Double d15, f fVar, String str6, String str7, Uri uri, a0 a0Var) {
        super(str, str2, str3, str4, str5, d15, fVar, str6, str7, uri, a0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        if (i() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(i());
        }
        if (j() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(j());
        }
        if (k() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(k());
        }
        if (e() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(e());
        }
        if (f() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(f());
        }
        parcel.writeDouble(h().doubleValue());
        parcel.writeParcelable(c(), i15);
        parcel.writeString(b());
        if (g() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(g());
        }
        parcel.writeParcelable(d(), i15);
        parcel.writeParcelable(l(), i15);
    }
}
