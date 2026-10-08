package ah;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends a implements h {
    f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolygonDelegate");
    }

    @Override // ah.h
    public final void B() {
        n3(1, m3());
    }

    @Override // ah.h
    public final void C(float f15) {
        Parcel parcelM3 = m3();
        parcelM3.writeFloat(f15);
        n3(7, parcelM3);
    }

    @Override // ah.h
    public final void D(boolean z15) {
        Parcel parcelM3 = m3();
        int i15 = m.f6293b;
        parcelM3.writeInt(z15 ? 1 : 0);
        n3(17, parcelM3);
    }

    @Override // ah.h
    public final void D0(float f15) {
        Parcel parcelM3 = m3();
        parcelM3.writeFloat(f15);
        n3(13, parcelM3);
    }

    @Override // ah.h
    public final void E2(int i15) {
        Parcel parcelM3 = m3();
        parcelM3.writeInt(i15);
        n3(11, parcelM3);
    }

    @Override // ah.h
    public final void K(int i15) {
        Parcel parcelM3 = m3();
        parcelM3.writeInt(i15);
        n3(23, parcelM3);
    }

    @Override // ah.h
    public final boolean L0(h hVar) {
        Parcel parcelM3 = m3();
        m.d(parcelM3, hVar);
        Parcel parcelL3 = l3(19, parcelM3);
        boolean zE = m.e(parcelL3);
        parcelL3.recycle();
        return zE;
    }

    @Override // ah.h
    public final void W0(List list) {
        Parcel parcelM3 = m3();
        parcelM3.writeTypedList(list);
        n3(3, parcelM3);
    }

    @Override // ah.h
    public final void b0(List list) {
        Parcel parcelM3 = m3();
        parcelM3.writeTypedList(list);
        n3(25, parcelM3);
    }

    @Override // ah.h
    public final void b1(boolean z15) {
        Parcel parcelM3 = m3();
        int i15 = m.f6293b;
        parcelM3.writeInt(z15 ? 1 : 0);
        n3(15, parcelM3);
    }

    @Override // ah.h
    public final void k3(boolean z15) {
        Parcel parcelM3 = m3();
        int i15 = m.f6293b;
        parcelM3.writeInt(z15 ? 1 : 0);
        n3(21, parcelM3);
    }

    @Override // ah.h
    public final void m1(List list) {
        Parcel parcelM3 = m3();
        parcelM3.writeList(list);
        n3(5, parcelM3);
    }

    @Override // ah.h
    public final int o() {
        Parcel parcelL3 = l3(20, m3());
        int i15 = parcelL3.readInt();
        parcelL3.recycle();
        return i15;
    }

    @Override // ah.h
    public final void p2(rg.b bVar) {
        Parcel parcelM3 = m3();
        m.d(parcelM3, bVar);
        n3(27, parcelM3);
    }

    @Override // ah.h
    public final void t(int i15) {
        Parcel parcelM3 = m3();
        parcelM3.writeInt(i15);
        n3(9, parcelM3);
    }
}
