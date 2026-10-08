package ng;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j extends vg.b implements k {
    public j() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    @Override // vg.b
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 != 1) {
            return false;
        }
        mg.h hVar = (mg.h) vg.c.a(parcel, mg.h.CREATOR);
        vg.c.d(parcel);
        p1(hVar);
        return true;
    }
}
