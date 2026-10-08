package d8;

import android.os.Build;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements z7.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f40191d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f40192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f40193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public final boolean f40194c;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z15;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z15 = true;
            } else {
                z15 = false;
            }
        } else {
            z15 = false;
        }
        f40191d = z15;
    }

    public b0(UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }

    @Deprecated
    public b0(UUID uuid, byte[] bArr, boolean z15) {
        this.f40192a = uuid;
        this.f40193b = bArr;
        this.f40194c = z15;
    }
}
