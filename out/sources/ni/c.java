package ni;

import android.os.Parcel;
import android.os.Parcelable;
import fr.t;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f136412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f136413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f136414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f136415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f136416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f136417f;

    public c(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f136412a = str;
        this.f136413b = str2;
        this.f136414c = str3;
        this.f136415d = str4;
        this.f136416e = str5;
        this.f136417f = str6;
    }

    public final String a() {
        return this.f136412a;
    }

    public final String b() {
        return this.f136413b;
    }

    public final String c() {
        return this.f136414c;
    }

    public final String d() {
        return this.f136415d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f136416e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return t.c(this.f136412a, cVar.f136412a) && t.c(this.f136413b, cVar.f136413b) && t.c(this.f136414c, cVar.f136414c) && t.c(this.f136415d, cVar.f136415d) && t.c(this.f136416e, cVar.f136416e) && t.c(this.f136417f, cVar.f136417f);
    }

    public final String f() {
        return this.f136417f;
    }

    public final int hashCode() {
        int iHashCode = this.f136412a.hashCode() * 31;
        String str = this.f136413b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f136414c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f136415d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f136416e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f136417f;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f136412a;
        int length = String.valueOf(str).length();
        String str2 = this.f136413b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f136414c;
        int length3 = String.valueOf(str3).length();
        String str4 = this.f136415d;
        int length4 = String.valueOf(str4).length();
        String str5 = this.f136416e;
        int length5 = String.valueOf(str5).length();
        String str6 = this.f136417f;
        StringBuilder sb5 = new StringBuilder(length + 43 + length2 + 17 + length3 + 18 + length4 + 15 + length5 + 17 + String.valueOf(str6).length() + 1);
        sb5.append("PhotoPageData(photoUri=");
        sb5.append(str);
        sb5.append(", photoThumbnailUri=");
        sb5.append(str2);
        sb5.append(", reportPhotoUri=");
        sb5.append(str3);
        sb5.append(", userDisplayName=");
        sb5.append(str4);
        sb5.append(", userImageUri=");
        sb5.append(str5);
        sb5.append(", userProfileUri=");
        sb5.append(str6);
        sb5.append(")");
        return sb5.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        parcel.writeString(this.f136412a);
        parcel.writeString(this.f136413b);
        parcel.writeString(this.f136414c);
        parcel.writeString(this.f136415d);
        parcel.writeString(this.f136416e);
        parcel.writeString(this.f136417f);
    }
}
