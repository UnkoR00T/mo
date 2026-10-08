package p025cON;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface k1 extends IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f24716c = "android$support$v4$os$IResultReceiver".replace('$', '.');

    public static abstract class a extends Binder implements k1 {

        /* JADX INFO: renamed from: cON.k1$a$a, reason: collision with other inner class name */
        private static class C0660a implements k1 {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private IBinder f24717d;

            C0660a(IBinder iBinder) {
                this.f24717d = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f24717d;
            }
        }

        public a() {
            attachInterface(this, k1.f24716c);
        }

        public static k1 l3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(k1.f24716c);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof k1)) ? new C0660a(iBinder) : (k1) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i15, Parcel parcel, Parcel parcel2, int i16) {
            String str = k1.f24716c;
            if (i15 >= 1 && i15 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i15 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i15 != 1) {
                return super.onTransact(i15, parcel, parcel2, i16);
            }
            D1(parcel.readInt(), (Bundle) b.b(parcel, Bundle.CREATOR));
            return true;
        }
    }

    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T b(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void D1(int i15, Bundle bundle);
}
