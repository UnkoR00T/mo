package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import hg.d;
import hg.l;
import jg.r;
import kg.c;

/* JADX INFO: loaded from: classes3.dex */
public final class Status extends kg.a implements l, ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PendingIntent f29016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final gg.a f29017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Status f29006e = new Status(-1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Status f29007f = new Status(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Status f29008g = new Status(14);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Status f29009h = new Status(8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Status f29010j = new Status(15);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Status f29011k = new Status(16);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Status f29012l = new Status(17);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Status f29013m = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new b();

    Status(int i15, String str, PendingIntent pendingIntent, gg.a aVar) {
        this.f29014a = i15;
        this.f29015b = str;
        this.f29016c = pendingIntent;
        this.f29017d = aVar;
    }

    public boolean C() {
        return this.f29014a <= 0;
    }

    public final String E() {
        String str = this.f29015b;
        return str != null ? str : d.a(this.f29014a);
    }

    @Override // hg.l
    public Status b() {
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f29014a == status.f29014a && r.a(this.f29015b, status.f29015b) && r.a(this.f29016c, status.f29016c) && r.a(this.f29017d, status.f29017d);
    }

    public gg.a h() {
        return this.f29017d;
    }

    public int hashCode() {
        return r.b(Integer.valueOf(this.f29014a), this.f29015b, this.f29016c, this.f29017d);
    }

    public PendingIntent m() {
        return this.f29016c;
    }

    public int p() {
        return this.f29014a;
    }

    public String r() {
        return this.f29015b;
    }

    public String toString() {
        r.a aVarC = r.c(this);
        aVarC.a("statusCode", E());
        aVarC.a("resolution", this.f29016c);
        return aVarC.toString();
    }

    public boolean u() {
        return this.f29016c != null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = c.a(parcel);
        c.m(parcel, 1, p());
        c.u(parcel, 2, r(), false);
        c.t(parcel, 3, this.f29016c, i15, false);
        c.t(parcel, 4, h(), i15, false);
        c.b(parcel, iA);
    }

    public boolean y() {
        return this.f29014a == 16;
    }

    public Status(int i15) {
        this(i15, (String) null);
    }

    public Status(gg.a aVar, String str) {
        this(aVar, str, 17);
    }

    public Status(int i15, String str) {
        this(i15, str, (PendingIntent) null);
    }

    @Deprecated
    public Status(gg.a aVar, String str, int i15) {
        this(i15, str, aVar.r(), aVar);
    }

    public Status(int i15, String str, PendingIntent pendingIntent) {
        this(i15, str, pendingIntent, null);
    }
}
