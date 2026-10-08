package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public interface b extends IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f13444b = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: androidx.room.b$a$a, reason: collision with other inner class name */
        private static class C0282a implements b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private IBinder f13445d;

            C0282a(IBinder iBinder) {
                this.f13445d = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13445d;
            }

            @Override // androidx.room.b
            public int b2(androidx.room.a aVar, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f13444b);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeString(str);
                    this.f13445d.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.b
            public void e3(androidx.room.a aVar, int i15) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f13444b);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeInt(i15);
                    this.f13445d.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.b
            public void y1(int i15, String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f13444b);
                    parcelObtain.writeInt(i15);
                    parcelObtain.writeStringArray(strArr);
                    this.f13445d.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, b.f13444b);
        }

        public static b l3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.f13444b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0282a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i15, Parcel parcel, Parcel parcel2, int i16) {
            String str = b.f13444b;
            if (i15 >= 1 && i15 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i15 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i15 == 1) {
                int iB2 = b2(androidx.room.a.AbstractBinderC0280a.l3(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iB2);
            } else if (i15 == 2) {
                e3(androidx.room.a.AbstractBinderC0280a.l3(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i15 != 3) {
                    return super.onTransact(i15, parcel, parcel2, i16);
                }
                y1(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    int b2(androidx.room.a aVar, String str);

    void e3(androidx.room.a aVar, int i15);

    void y1(int i15, String[] strArr);
}
