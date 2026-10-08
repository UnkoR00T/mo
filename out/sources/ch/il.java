package ch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class il extends kg.a {
    public static final Parcelable.Creator<il> CREATOR = new yl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ml f25959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f25961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nl[] f25962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final kl[] f25963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String[] f25964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final fl[] f25965g;

    public il(ml mlVar, String str, String str2, nl[] nlVarArr, kl[] klVarArr, String[] strArr, fl[] flVarArr) {
        this.f25959a = mlVar;
        this.f25960b = str;
        this.f25961c = str2;
        this.f25962d = nlVarArr;
        this.f25963e = klVarArr;
        this.f25964f = strArr;
        this.f25965g = flVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.t(parcel, 1, this.f25959a, i15, false);
        kg.c.u(parcel, 2, this.f25960b, false);
        kg.c.u(parcel, 3, this.f25961c, false);
        kg.c.x(parcel, 4, this.f25962d, i15, false);
        kg.c.x(parcel, 5, this.f25963e, i15, false);
        kg.c.v(parcel, 6, this.f25964f, false);
        kg.c.x(parcel, 7, this.f25965g, i15, false);
        kg.c.b(parcel, iA);
    }
}
