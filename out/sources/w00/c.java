package w00;

import android.os.Build;
import gy.d;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Lw00/c;", "Lgy/b;", "<init>", "()V", "Lgy/d;", "permissionType", "", "", "a", "(Lgy/d;)[Ljava/lang/String;", "[Ljava/lang/String;", "permissionsGranted", "permission_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gy.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String[] permissionsGranted = (String[]) v.e("android.permission.INTERNET").toArray(new String[0]);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f209138a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.EXTERNAL_STORAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLUETOOTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.BLUETOOTH_WITH_ADVERTISE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.CAMERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.GPS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d.NFC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d.POST_NOTIFICATIONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f209138a = iArr;
        }
    }

    @Override // gy.b
    public String[] a(d permissionType) {
        switch (a.f209138a[permissionType.ordinal()]) {
            case 1:
                return Build.VERSION.SDK_INT <= 30 ? (String[]) v.q("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").toArray(new String[0]) : this.permissionsGranted;
            case 2:
                return Build.VERSION.SDK_INT >= 31 ? (String[]) v.q("android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN").toArray(new String[0]) : this.permissionsGranted;
            case 3:
                return Build.VERSION.SDK_INT >= 31 ? (String[]) v.q("android.permission.BLUETOOTH_ADVERTISE", "android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN").toArray(new String[0]) : this.permissionsGranted;
            case 4:
                return (String[]) v.e("android.permission.CAMERA").toArray(new String[0]);
            case 5:
                return (String[]) v.q("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").toArray(new String[0]);
            case 6:
                return (String[]) v.e("android.permission.NFC").toArray(new String[0]);
            case 7:
                return Build.VERSION.SDK_INT >= 33 ? (String[]) v.e("android.permission.POST_NOTIFICATIONS").toArray(new String[0]) : this.permissionsGranted;
            default:
                throw new p();
        }
    }
}
