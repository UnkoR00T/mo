package ig;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public interface f extends IInterface {

    public static abstract class a extends vg.b implements f {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @Override // vg.b
        protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
            if (i15 != 1) {
                return false;
            }
            Status status = (Status) vg.c.a(parcel, Status.CREATOR);
            vg.c.d(parcel);
            d2(status);
            return true;
        }
    }

    void d2(Status status);
}
