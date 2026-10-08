package ah;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends a implements e {
    c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // ah.e
    public final String A() {
        Parcel parcelL3 = l3(8, m3());
        String string = parcelL3.readString();
        parcelL3.recycle();
        return string;
    }

    @Override // ah.e
    public final void B() {
        n3(1, m3());
    }

    @Override // ah.e
    public final void C(float f15) {
        Parcel parcelM3 = m3();
        parcelM3.writeFloat(f15);
        n3(22, parcelM3);
    }

    @Override // ah.e
    public final void D(boolean z15) {
        Parcel parcelM3 = m3();
        int i15 = m.f6293b;
        parcelM3.writeInt(z15 ? 1 : 0);
        n3(9, parcelM3);
    }

    @Override // ah.e
    public final void G(float f15, float f16) {
        Parcel parcelM3 = m3();
        parcelM3.writeFloat(f15);
        parcelM3.writeFloat(f16);
        n3(24, parcelM3);
    }

    @Override // ah.e
    public final void H2(float f15, float f16) {
        Parcel parcelM3 = m3();
        parcelM3.writeFloat(f15);
        parcelM3.writeFloat(f16);
        n3(19, parcelM3);
    }

    @Override // ah.e
    public final void I1(String str) {
        Parcel parcelM3 = m3();
        parcelM3.writeString(str);
        n3(5, parcelM3);
    }

    @Override // ah.e
    public final void J(boolean z15) {
        Parcel parcelM3 = m3();
        int i15 = m.f6293b;
        parcelM3.writeInt(z15 ? 1 : 0);
        n3(14, parcelM3);
    }

    @Override // ah.e
    public final void K2(String str) {
        Parcel parcelM3 = m3();
        parcelM3.writeString(str);
        n3(7, parcelM3);
    }

    @Override // ah.e
    public final void L(float f15) {
        Parcel parcelM3 = m3();
        parcelM3.writeFloat(f15);
        n3(27, parcelM3);
    }

    @Override // ah.e
    public final boolean Q(e eVar) {
        Parcel parcelM3 = m3();
        m.d(parcelM3, eVar);
        Parcel parcelL3 = l3(16, parcelM3);
        boolean zE = m.e(parcelL3);
        parcelL3.recycle();
        return zE;
    }

    @Override // ah.e
    public final void W(LatLng latLng) {
        Parcel parcelM3 = m3();
        m.c(parcelM3, latLng);
        n3(3, parcelM3);
    }

    @Override // ah.e
    public final void d3(float f15) {
        Parcel parcelM3 = m3();
        parcelM3.writeFloat(f15);
        n3(25, parcelM3);
    }

    @Override // ah.e
    public final int i() {
        Parcel parcelL3 = l3(17, m3());
        int i15 = parcelL3.readInt();
        parcelL3.recycle();
        return i15;
    }

    @Override // ah.e
    public final LatLng k() {
        Parcel parcelL3 = l3(4, m3());
        LatLng latLng = (LatLng) m.a(parcelL3, LatLng.CREATOR);
        parcelL3.recycle();
        return latLng;
    }

    @Override // ah.e
    public final String q() {
        Parcel parcelL3 = l3(6, m3());
        String string = parcelL3.readString();
        parcelL3.recycle();
        return string;
    }

    @Override // ah.e
    public final void t0(boolean z15) {
        Parcel parcelM3 = m3();
        int i15 = m.f6293b;
        parcelM3.writeInt(z15 ? 1 : 0);
        n3(20, parcelM3);
    }

    @Override // ah.e
    public final void t1(rg.b bVar) {
        Parcel parcelM3 = m3();
        m.d(parcelM3, bVar);
        n3(18, parcelM3);
    }

    @Override // ah.e
    public final void v0() {
        n3(11, m3());
    }

    @Override // ah.e
    public final boolean v1() {
        Parcel parcelL3 = l3(13, m3());
        boolean zE = m.e(parcelL3);
        parcelL3.recycle();
        return zE;
    }

    @Override // ah.e
    public final void y2(rg.b bVar) {
        Parcel parcelM3 = m3();
        m.d(parcelM3, bVar);
        n3(29, parcelM3);
    }
}
