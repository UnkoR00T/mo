package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        private static class C0183a implements b {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static b f8082e;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private IBinder f8083d;

            C0183a(IBinder iBinder) {
                this.f8083d = iBinder;
            }

            @Override // android.support.v4.media.session.b
            public void K1(android.support.v4.media.session.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.f8083d.transact(3, parcelObtain, parcelObtain2, 0) || a.m3() == null) {
                        parcelObtain2.readException();
                    } else {
                        a.m3().K1(aVar);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f8083d;
            }
        }

        public static b l3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0183a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        public static b m3() {
            return C0183a.f8082e;
        }
    }

    void K1(android.support.v4.media.session.a aVar);
}
