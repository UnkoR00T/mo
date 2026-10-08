package yh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends kg.a {
    public static final Parcelable.Creator<g> CREATOR = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f226849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f226850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f226851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    CommonWalletObject f226852d;

    g() {
        this.f226849a = 3;
    }

    public int h() {
        return this.f226849a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, h());
        kg.c.u(parcel, 2, this.f226850b, false);
        kg.c.u(parcel, 3, this.f226851c, false);
        kg.c.t(parcel, 4, this.f226852d, i15, false);
        kg.c.b(parcel, iA);
    }

    g(int i15, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f226849a = i15;
        this.f226851c = str2;
        if (i15 >= 3) {
            this.f226852d = commonWalletObject;
            return;
        }
        com.google.android.gms.wallet.wobs.a aVarH = CommonWalletObject.h();
        aVarH.a(str);
        this.f226852d = aVarH.b();
    }
}
