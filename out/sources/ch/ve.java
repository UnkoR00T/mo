package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ve extends kg.a {
    public static final Parcelable.Creator<ve> CREATOR = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f26431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f26432b;

    public ve() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 2, this.f26431a, false);
        kg.c.u(parcel, 3, this.f26432b, false);
        kg.c.b(parcel, iA);
    }

    public ve(String str, String str2) {
        this.f26431a = str;
        this.f26432b = str2;
    }
}
