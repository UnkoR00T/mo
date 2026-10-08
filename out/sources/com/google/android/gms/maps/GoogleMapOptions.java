package com.google.android.gms.maps;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import jg.r;
import kg.c;
import mh.g;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
public final class GoogleMapOptions extends kg.a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new a();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Integer f31398x = Integer.valueOf(Color.argb(GF2Field.MASK, 236, 233, 225));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Boolean f31399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f31400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CameraPosition f31402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f31403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f31404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f31405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f31406h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Boolean f31407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Boolean f31408k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Boolean f31409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Boolean f31410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Boolean f31411n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Float f31412p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Float f31413q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private LatLngBounds f31414r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Boolean f31415s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Integer f31416t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f31417v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f31418w;

    public GoogleMapOptions() {
        this.f31401c = -1;
        this.f31412p = null;
        this.f31413q = null;
        this.f31414r = null;
        this.f31416t = null;
        this.f31417v = null;
    }

    public Float C() {
        return this.f31413q;
    }

    public Float E() {
        return this.f31412p;
    }

    public Integer h() {
        return this.f31416t;
    }

    public CameraPosition m() {
        return this.f31402d;
    }

    public LatLngBounds p() {
        return this.f31414r;
    }

    public int r() {
        return this.f31418w;
    }

    public String toString() {
        return r.c(this).a("MapType", Integer.valueOf(this.f31401c)).a("LiteMode", this.f31409l).a("Camera", this.f31402d).a("CompassEnabled", this.f31404f).a("ZoomControlsEnabled", this.f31403e).a("ScrollGesturesEnabled", this.f31405g).a("ZoomGesturesEnabled", this.f31406h).a("TiltGesturesEnabled", this.f31407j).a("RotateGesturesEnabled", this.f31408k).a("ScrollGesturesEnabledDuringRotateOrZoom", this.f31415s).a("MapToolbarEnabled", this.f31410m).a("AmbientEnabled", this.f31411n).a("MinZoomPreference", this.f31412p).a("MaxZoomPreference", this.f31413q).a("BackgroundColor", this.f31416t).a("LatLngBoundsForCameraTarget", this.f31414r).a("ZOrderOnTop", this.f31399a).a("UseViewLifecycleInFragment", this.f31400b).a("mapColorScheme", Integer.valueOf(this.f31418w)).toString();
    }

    public String u() {
        return this.f31417v;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i15) {
        int iA = c.a(parcel);
        c.e(parcel, 2, g.a(this.f31399a));
        c.e(parcel, 3, g.a(this.f31400b));
        c.m(parcel, 4, y());
        c.t(parcel, 5, m(), i15, false);
        c.e(parcel, 6, g.a(this.f31403e));
        c.e(parcel, 7, g.a(this.f31404f));
        c.e(parcel, 8, g.a(this.f31405g));
        c.e(parcel, 9, g.a(this.f31406h));
        c.e(parcel, 10, g.a(this.f31407j));
        c.e(parcel, 11, g.a(this.f31408k));
        c.e(parcel, 12, g.a(this.f31409l));
        c.e(parcel, 14, g.a(this.f31410m));
        c.e(parcel, 15, g.a(this.f31411n));
        c.k(parcel, 16, E(), false);
        c.k(parcel, 17, C(), false);
        c.t(parcel, 18, p(), i15, false);
        c.e(parcel, 19, g.a(this.f31415s));
        c.p(parcel, 20, h(), false);
        c.u(parcel, 21, u(), false);
        c.m(parcel, 23, r());
        c.b(parcel, iA);
    }

    public int y() {
        return this.f31401c;
    }

    GoogleMapOptions(byte b15, byte b16, int i15, CameraPosition cameraPosition, byte b17, byte b18, byte b19, byte b25, byte b26, byte b27, byte b28, byte b29, byte b35, Float f15, Float f16, LatLngBounds latLngBounds, byte b36, Integer num, String str, int i16) {
        this.f31401c = -1;
        this.f31412p = null;
        this.f31413q = null;
        this.f31414r = null;
        this.f31416t = null;
        this.f31417v = null;
        this.f31399a = g.b(b15);
        this.f31400b = g.b(b16);
        this.f31401c = i15;
        this.f31402d = cameraPosition;
        this.f31403e = g.b(b17);
        this.f31404f = g.b(b18);
        this.f31405g = g.b(b19);
        this.f31406h = g.b(b25);
        this.f31407j = g.b(b26);
        this.f31408k = g.b(b27);
        this.f31409l = g.b(b28);
        this.f31410m = g.b(b29);
        this.f31411n = g.b(b35);
        this.f31412p = f15;
        this.f31413q = f16;
        this.f31414r = latLngBounds;
        this.f31415s = g.b(b36);
        this.f31416t = num;
        this.f31417v = str;
        this.f31418w = i16;
    }
}
