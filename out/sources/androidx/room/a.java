package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f13442a = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    /* JADX INFO: renamed from: androidx.room.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0280a extends Binder implements a {

        /* JADX INFO: renamed from: androidx.room.a$a$a, reason: collision with other inner class name */
        private static class C0281a implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private IBinder f13443d;

            C0281a(IBinder iBinder) {
                this.f13443d = iBinder;
            }

            @Override // androidx.room.a
            public void U(String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f13442a);
                    parcelObtain.writeStringArray(strArr);
                    this.f13443d.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13443d;
            }
        }

        public AbstractBinderC0280a() {
            attachInterface(this, a.f13442a);
        }

        public static a l3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.f13442a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0281a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i15, Parcel parcel, Parcel parcel2, int i16) {
            String str = a.f13442a;
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
            U(parcel.createStringArray());
            return true;
        }
    }

    void U(String[] strArr);
}
