package ng;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends vg.b implements h {
    public g() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // vg.b
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        if (i15 == 1) {
            Status status = (Status) vg.c.a(parcel, Status.CREATOR);
            mg.b bVar = (mg.b) vg.c.a(parcel, mg.b.CREATOR);
            vg.c.d(parcel);
            c2(status, bVar);
        } else if (i15 == 2) {
            Status status2 = (Status) vg.c.a(parcel, Status.CREATOR);
            mg.g gVar = (mg.g) vg.c.a(parcel, mg.g.CREATOR);
            vg.c.d(parcel);
            s0(status2, gVar);
        } else if (i15 == 3) {
            Status status3 = (Status) vg.c.a(parcel, Status.CREATOR);
            mg.e eVar = (mg.e) vg.c.a(parcel, mg.e.CREATOR);
            vg.c.d(parcel);
            m0(status3, eVar);
        } else {
            if (i15 != 4) {
                return false;
            }
            Status status4 = (Status) vg.c.a(parcel, Status.CREATOR);
            vg.c.d(parcel);
            h0(status4);
        }
        return true;
    }
}
