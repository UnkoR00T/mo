package oh;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.oss_licenses.b0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends com.google.android.gms.internal.oss_licenses.a implements IInterface {
    e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.oss.licenses.IOSSLicenseService");
    }

    public final String n3(String str) {
        Parcel parcelL3 = l3();
        parcelL3.writeString(str);
        Parcel parcelM3 = m3(2, parcelL3);
        String string = parcelM3.readString();
        parcelM3.recycle();
        return string;
    }

    public final String o3(String str) {
        Parcel parcelL3 = l3();
        parcelL3.writeString(str);
        Parcel parcelM3 = m3(4, parcelL3);
        String string = parcelM3.readString();
        parcelM3.recycle();
        return string;
    }

    public final List p3(List list) {
        Parcel parcelL3 = l3();
        parcelL3.writeList(list);
        Parcel parcelM3 = m3(5, parcelL3);
        ArrayList arrayListA = b0.a(parcelM3);
        parcelM3.recycle();
        return arrayListA;
    }
}
