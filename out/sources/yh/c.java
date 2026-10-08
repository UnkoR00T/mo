package yh;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends kg.a {
    public static final Parcelable.Creator<c> CREATOR = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList f226813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f226814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f226815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f226816d;

    private c() {
        this.f226814b = true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.o(parcel, 1, this.f226813a, false);
        kg.c.c(parcel, 2, this.f226814b);
        kg.c.c(parcel, 3, this.f226815c);
        kg.c.m(parcel, 4, this.f226816d);
        kg.c.b(parcel, iA);
    }

    c(ArrayList arrayList, boolean z15, boolean z16, int i15) {
        this.f226813a = arrayList;
        this.f226814b = z15;
        this.f226815c = z16;
        this.f226816d = i15;
    }
}
