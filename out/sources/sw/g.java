package sw;

import android.os.Build;
import android.os.StrictMode;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0003¨\u0006\t"}, d2 = {"Lsw/g;", "Lsw/f;", "<init>", "()V", "Landroid/os/StrictMode$VmPolicy$Builder;", "b", "(Landroid/os/StrictMode$VmPolicy$Builder;)Landroid/os/StrictMode$VmPolicy$Builder;", "Loq/i0;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements f {
    private final StrictMode.VmPolicy.Builder b(StrictMode.VmPolicy.Builder builder) {
        return Build.VERSION.SDK_INT >= 28 ? builder.detectNonSdkApiUsage() : builder;
    }

    @Override // sw.f
    public void a() {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build());
        StrictMode.setVmPolicy(b(new StrictMode.VmPolicy.Builder().detectLeakedSqlLiteObjects().detectLeakedClosableObjects()).penaltyLog().build());
    }
}
