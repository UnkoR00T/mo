package nh;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public class i extends kg.a {
    public static final Parcelable.Creator<i> CREATOR = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LatLng f136275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f136276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f136277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f136278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f136279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f136280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f136281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f136282h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f136283j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f136284k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f136285l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f136286m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f136287n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f136288p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f136289q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private View f136290r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f136291s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f136292t;

    public i() {
        this.f136279e = 0.5f;
        this.f136280f = 1.0f;
        this.f136282h = true;
        this.f136283j = false;
        this.f136284k = 0.0f;
        this.f136285l = 0.5f;
        this.f136286m = 0.0f;
        this.f136287n = 1.0f;
        this.f136289q = 0;
    }

    public float C() {
        return this.f136279e;
    }

    public i C0(float f15) {
        this.f136288p = f15;
        return this;
    }

    public float E() {
        return this.f136280f;
    }

    public float H() {
        return this.f136285l;
    }

    public final int H0() {
        return this.f136291s;
    }

    public float I() {
        return this.f136286m;
    }

    public LatLng J() {
        return this.f136275a;
    }

    public float K() {
        return this.f136284k;
    }

    public String L() {
        return this.f136277c;
    }

    public String M() {
        return this.f136276b;
    }

    public float N() {
        return this.f136288p;
    }

    public i O(b bVar) {
        this.f136278d = bVar;
        return this;
    }

    public i V(float f15, float f16) {
        this.f136285l = f15;
        this.f136286m = f16;
        return this;
    }

    public boolean Z() {
        return this.f136281g;
    }

    public boolean a0() {
        return this.f136283j;
    }

    public boolean b0() {
        return this.f136282h;
    }

    public i c0(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.f136275a = latLng;
        return this;
    }

    public i d0(float f15) {
        this.f136284k = f15;
        return this;
    }

    public i h(float f15) {
        this.f136287n = f15;
        return this;
    }

    public i m(float f15, float f16) {
        this.f136279e = f15;
        this.f136280f = f16;
        return this;
    }

    public i n0(String str) {
        this.f136277c = str;
        return this;
    }

    public i p(String str) {
        this.f136292t = str;
        return this;
    }

    public i r(boolean z15) {
        this.f136281g = z15;
        return this;
    }

    public i t0(String str) {
        this.f136276b = str;
        return this;
    }

    public i u(boolean z15) {
        this.f136283j = z15;
        return this;
    }

    public i u0(boolean z15) {
        this.f136282h = z15;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.t(parcel, 2, J(), i15, false);
        kg.c.u(parcel, 3, M(), false);
        kg.c.u(parcel, 4, L(), false);
        b bVar = this.f136278d;
        kg.c.l(parcel, 5, bVar == null ? null : bVar.a().asBinder(), false);
        kg.c.i(parcel, 6, C());
        kg.c.i(parcel, 7, E());
        kg.c.c(parcel, 8, Z());
        kg.c.c(parcel, 9, b0());
        kg.c.c(parcel, 10, a0());
        kg.c.i(parcel, 11, K());
        kg.c.i(parcel, 12, H());
        kg.c.i(parcel, 13, I());
        kg.c.i(parcel, 14, y());
        kg.c.i(parcel, 15, N());
        kg.c.m(parcel, 17, this.f136289q);
        kg.c.l(parcel, 18, rg.d.o3(this.f136290r).asBinder(), false);
        kg.c.m(parcel, 19, this.f136291s);
        kg.c.u(parcel, 20, this.f136292t, false);
        kg.c.b(parcel, iA);
    }

    public float y() {
        return this.f136287n;
    }

    i(LatLng latLng, String str, String str2, IBinder iBinder, float f15, float f16, boolean z15, boolean z16, boolean z17, float f17, float f18, float f19, float f25, float f26, int i15, IBinder iBinder2, int i16, String str3) {
        this.f136279e = 0.5f;
        this.f136280f = 1.0f;
        this.f136282h = true;
        this.f136283j = false;
        this.f136284k = 0.0f;
        this.f136285l = 0.5f;
        this.f136286m = 0.0f;
        this.f136287n = 1.0f;
        this.f136289q = 0;
        this.f136275a = latLng;
        this.f136276b = str;
        this.f136277c = str2;
        if (iBinder == null) {
            this.f136278d = null;
        } else {
            this.f136278d = new b(rg.b.a.m3(iBinder));
        }
        this.f136279e = f15;
        this.f136280f = f16;
        this.f136281g = z15;
        this.f136282h = z16;
        this.f136283j = z17;
        this.f136284k = f17;
        this.f136285l = f18;
        this.f136286m = f19;
        this.f136287n = f25;
        this.f136288p = f26;
        this.f136291s = i16;
        this.f136289q = i15;
        rg.b bVarM3 = rg.b.a.m3(iBinder2);
        this.f136290r = bVarM3 != null ? (View) rg.d.n3(bVarM3) : null;
        this.f136292t = str3;
    }
}
