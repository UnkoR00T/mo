package yh;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class s extends kg.a {
    public static final Parcelable.Creator<s> CREATOR = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f226909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f226910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f226911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f226912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f226913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f226914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f226915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f226916h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f226917j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f226918k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    String f226919l;

    s() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f226909a, false);
        kg.c.u(parcel, 3, this.f226910b, false);
        kg.c.u(parcel, 4, this.f226911c, false);
        kg.c.u(parcel, 5, this.f226912d, false);
        kg.c.u(parcel, 6, this.f226913e, false);
        kg.c.u(parcel, 7, this.f226914f, false);
        kg.c.u(parcel, 8, this.f226915g, false);
        kg.c.u(parcel, 9, this.f226916h, false);
        kg.c.u(parcel, 10, this.f226917j, false);
        kg.c.c(parcel, 11, this.f226918k);
        kg.c.u(parcel, 12, this.f226919l, false);
        kg.c.b(parcel, iA);
    }

    s(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z15, String str10) {
        this.f226909a = str;
        this.f226910b = str2;
        this.f226911c = str3;
        this.f226912d = str4;
        this.f226913e = str5;
        this.f226914f = str6;
        this.f226915g = str7;
        this.f226916h = str8;
        this.f226917j = str9;
        this.f226918k = z15;
        this.f226919l = str10;
    }
}
