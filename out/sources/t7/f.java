package t7;

import android.os.Build;
import android.os.IBinder;
import java.util.UUID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f188169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UUID f188170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final UUID f188171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final UUID f188172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final UUID f188173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final UUID f188174f;

    static {
        f188169a = Build.VERSION.SDK_INT >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : PKIFailureInfo.notAuthorized;
        f188170b = new UUID(0L, 0L);
        f188171c = new UUID(1186680826959645954L, -5988876978535335093L);
        f188172d = new UUID(-2129748144642739255L, 8654423357094679310L);
        f188173e = new UUID(-1301668207276963122L, -6645017420763422227L);
        f188174f = new UUID(-7348484286925749626L, -6083546864340672619L);
    }
}
