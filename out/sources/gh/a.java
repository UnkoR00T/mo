package gh;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IBinder f72916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f72917e;

    protected a(IBinder iBinder, String str) {
        this.f72916d = iBinder;
        this.f72917e = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f72916d;
    }
}
