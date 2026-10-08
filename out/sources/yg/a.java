package yg;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IBinder f226798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f226799e;

    protected a(IBinder iBinder, String str) {
        this.f226798d = iBinder;
        this.f226799e = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f226798d;
    }
}
