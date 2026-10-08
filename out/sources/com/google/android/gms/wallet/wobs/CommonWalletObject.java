package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import ei.f;
import java.util.ArrayList;
import kg.c;

/* JADX INFO: loaded from: classes3.dex */
@KeepName
public class CommonWalletObject extends kg.a {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f31504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f31505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f31506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f31507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f31508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f31509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f31510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Deprecated
    String f31511h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f31512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final ArrayList f31513k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    f f31514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ArrayList f31515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Deprecated
    String f31516n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Deprecated
    String f31517p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final ArrayList f31518q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f31519r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final ArrayList f31520s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final ArrayList f31521t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final ArrayList f31522v;

    CommonWalletObject() {
        this.f31513k = com.google.android.gms.common.util.b.c();
        this.f31515m = com.google.android.gms.common.util.b.c();
        this.f31518q = com.google.android.gms.common.util.b.c();
        this.f31520s = com.google.android.gms.common.util.b.c();
        this.f31521t = com.google.android.gms.common.util.b.c();
        this.f31522v = com.google.android.gms.common.util.b.c();
    }

    public static a h() {
        return new a(new CommonWalletObject(), null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = c.a(parcel);
        c.u(parcel, 2, this.f31504a, false);
        c.u(parcel, 3, this.f31505b, false);
        c.u(parcel, 4, this.f31506c, false);
        c.u(parcel, 5, this.f31507d, false);
        c.u(parcel, 6, this.f31508e, false);
        c.u(parcel, 7, this.f31509f, false);
        c.u(parcel, 8, this.f31510g, false);
        c.u(parcel, 9, this.f31511h, false);
        c.m(parcel, 10, this.f31512j);
        c.y(parcel, 11, this.f31513k, false);
        c.t(parcel, 12, this.f31514l, i15, false);
        c.y(parcel, 13, this.f31515m, false);
        c.u(parcel, 14, this.f31516n, false);
        c.u(parcel, 15, this.f31517p, false);
        c.y(parcel, 16, this.f31518q, false);
        c.c(parcel, 17, this.f31519r);
        c.y(parcel, 18, this.f31520s, false);
        c.y(parcel, 19, this.f31521t, false);
        c.y(parcel, 20, this.f31522v, false);
        c.b(parcel, iA);
    }

    CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i15, ArrayList arrayList, f fVar, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z15, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.f31504a = str;
        this.f31505b = str2;
        this.f31506c = str3;
        this.f31507d = str4;
        this.f31508e = str5;
        this.f31509f = str6;
        this.f31510g = str7;
        this.f31511h = str8;
        this.f31512j = i15;
        this.f31513k = arrayList;
        this.f31514l = fVar;
        this.f31515m = arrayList2;
        this.f31516n = str9;
        this.f31517p = str10;
        this.f31518q = arrayList3;
        this.f31519r = z15;
        this.f31520s = arrayList4;
        this.f31521t = arrayList5;
        this.f31522v = arrayList6;
    }
}
