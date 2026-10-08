package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ml extends kg.a {
    public static final Parcelable.Creator<ml> CREATOR = new gm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f26168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f26169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f26170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f26171g;

    public ml(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f26165a = str;
        this.f26166b = str2;
        this.f26167c = str3;
        this.f26168d = str4;
        this.f26169e = str5;
        this.f26170f = str6;
        this.f26171g = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f26165a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.u(parcel, 2, this.f26166b, false);
        kg.c.u(parcel, 3, this.f26167c, false);
        kg.c.u(parcel, 4, this.f26168d, false);
        kg.c.u(parcel, 5, this.f26169e, false);
        kg.c.u(parcel, 6, this.f26170f, false);
        kg.c.u(parcel, 7, this.f26171g, false);
        kg.c.b(parcel, iA);
    }
}
