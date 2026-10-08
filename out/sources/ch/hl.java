package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class hl extends kg.a {
    public static final Parcelable.Creator<hl> CREATOR = new xl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f25937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f25939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final gl f25940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final gl f25941g;

    public hl(String str, String str2, String str3, String str4, String str5, gl glVar, gl glVar2) {
        this.f25935a = str;
        this.f25936b = str2;
        this.f25937c = str3;
        this.f25938d = str4;
        this.f25939e = str5;
        this.f25940f = glVar;
        this.f25941g = glVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f25935a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.u(parcel, 2, this.f25936b, false);
        kg.c.u(parcel, 3, this.f25937c, false);
        kg.c.u(parcel, 4, this.f25938d, false);
        kg.c.u(parcel, 5, this.f25939e, false);
        kg.c.t(parcel, 6, this.f25940f, i15, false);
        kg.c.t(parcel, 7, this.f25941g, i15, false);
        kg.c.b(parcel, iA);
    }
}
