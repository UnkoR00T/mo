package th;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends vg.b implements f {
    public e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // vg.b
    protected final boolean l3(int i15, Parcel parcel, Parcel parcel2, int i16) {
        switch (i15) {
            case 3:
                vg.c.d(parcel);
                break;
            case 4:
                vg.c.d(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                vg.c.d(parcel);
                break;
            case 7:
                vg.c.d(parcel);
                break;
            case 8:
                l lVar = (l) vg.c.a(parcel, l.CREATOR);
                vg.c.d(parcel);
                k2(lVar);
                break;
            case 9:
                vg.c.d(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
