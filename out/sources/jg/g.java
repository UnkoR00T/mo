package jg;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes3.dex */
public class g extends kg.a {
    public static final Parcelable.Creator<g> CREATOR = new e1();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final Scope[] f102473q = new Scope[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final gg.c[] f102474r = new gg.c[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f102475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f102476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f102477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f102478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    IBinder f102479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Scope[] f102480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Bundle f102481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Account f102482h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    gg.c[] f102483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    gg.c[] f102484k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final boolean f102485l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final int f102486m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f102487n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f102488p;

    g(int i15, int i16, int i17, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, gg.c[] cVarArr, gg.c[] cVarArr2, boolean z15, int i18, boolean z16, String str2) {
        scopeArr = scopeArr == null ? f102473q : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        cVarArr = cVarArr == null ? f102474r : cVarArr;
        cVarArr2 = cVarArr2 == null ? f102474r : cVarArr2;
        this.f102475a = i15;
        this.f102476b = i16;
        this.f102477c = i17;
        if ("com.google.android.gms".equals(str)) {
            this.f102478d = "com.google.android.gms";
        } else {
            this.f102478d = str;
        }
        if (i15 < 2) {
            this.f102482h = iBinder != null ? a.n3(l.a.m3(iBinder)) : null;
        } else {
            this.f102479e = iBinder;
            this.f102482h = account;
        }
        this.f102480f = scopeArr;
        this.f102481g = bundle;
        this.f102483j = cVarArr;
        this.f102484k = cVarArr2;
        this.f102485l = z15;
        this.f102486m = i18;
        this.f102487n = z16;
        this.f102488p = str2;
    }

    public String h() {
        return this.f102488p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        e1.a(this, parcel, i15);
    }
}
