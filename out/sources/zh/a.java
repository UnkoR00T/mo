package zh;

import android.os.Parcel;
import android.os.Parcelable;
import kg.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends kg.a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f235242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f235243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f235244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f235245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f235246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f235247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f235248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f235249h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f235250j;

    private a() {
    }

    public String C() {
        return this.f235247f;
    }

    public String E() {
        return this.f235250j;
    }

    public String H() {
        return this.f235249h;
    }

    public boolean h() {
        return this.f235244c;
    }

    public int m() {
        return this.f235243b;
    }

    public String p() {
        return this.f235245d;
    }

    public String r() {
        return this.f235246e;
    }

    public String u() {
        return this.f235242a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = c.a(parcel);
        c.u(parcel, 1, u(), false);
        c.m(parcel, 2, m());
        c.c(parcel, 3, h());
        c.u(parcel, 4, p(), false);
        c.u(parcel, 5, r(), false);
        c.u(parcel, 6, C(), false);
        c.u(parcel, 7, y(), false);
        c.u(parcel, 8, H(), false);
        c.u(parcel, 9, E(), false);
        c.b(parcel, iA);
    }

    public String y() {
        return this.f235248g;
    }

    a(String str, int i15, boolean z15, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f235242a = str;
        this.f235243b = i15;
        this.f235244c = z15;
        this.f235245d = str2;
        this.f235246e = str3;
        this.f235247f = str4;
        this.f235248g = str5;
        this.f235249h = str6;
        this.f235250j = str7;
    }
}
