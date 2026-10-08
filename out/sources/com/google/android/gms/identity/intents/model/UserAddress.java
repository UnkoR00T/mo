package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import kg.c;

/* JADX INFO: loaded from: classes3.dex */
public final class UserAddress extends kg.a implements ReflectedParcelable {
    public static final Parcelable.Creator<UserAddress> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f29100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f29101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f29102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f29103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f29104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f29105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f29106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f29107h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f29108j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    String f29109k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    String f29110l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    String f29111m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f29112n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    String f29113p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    String f29114q;

    UserAddress() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = c.a(parcel);
        c.u(parcel, 2, this.f29100a, false);
        c.u(parcel, 3, this.f29101b, false);
        c.u(parcel, 4, this.f29102c, false);
        c.u(parcel, 5, this.f29103d, false);
        c.u(parcel, 6, this.f29104e, false);
        c.u(parcel, 7, this.f29105f, false);
        c.u(parcel, 8, this.f29106g, false);
        c.u(parcel, 9, this.f29107h, false);
        c.u(parcel, 10, this.f29108j, false);
        c.u(parcel, 11, this.f29109k, false);
        c.u(parcel, 12, this.f29110l, false);
        c.u(parcel, 13, this.f29111m, false);
        c.c(parcel, 14, this.f29112n);
        c.u(parcel, 15, this.f29113p, false);
        c.u(parcel, 16, this.f29114q, false);
        c.b(parcel, iA);
    }

    UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z15, String str13, String str14) {
        this.f29100a = str;
        this.f29101b = str2;
        this.f29102c = str3;
        this.f29103d = str4;
        this.f29104e = str5;
        this.f29105f = str6;
        this.f29106g = str7;
        this.f29107h = str8;
        this.f29108j = str9;
        this.f29109k = str10;
        this.f29110l = str11;
        this.f29111m = str12;
        this.f29112n = z15;
        this.f29113p = str13;
        this.f29114q = str14;
    }
}
