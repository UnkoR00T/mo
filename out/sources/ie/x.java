package ie;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements zd.j<ParcelFileDescriptor, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f91959a;

    public x(o oVar) {
        this.f91959a = oVar;
    }

    private boolean e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    @Override // zd.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public be.v<Bitmap> b(ParcelFileDescriptor parcelFileDescriptor, int i15, int i16, zd.h hVar) {
        return this.f91959a.d(parcelFileDescriptor, i15, i16, hVar);
    }

    @Override // zd.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ParcelFileDescriptor parcelFileDescriptor, zd.h hVar) {
        return e(parcelFileDescriptor) && this.f91959a.o(parcelFileDescriptor);
    }
}
