package rj;

import android.app.PendingIntent;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f174562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f174563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f174564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f174565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f174566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f174567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f174568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f174569h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f174570i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f174571j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final PendingIntent f174572k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PendingIntent f174573l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final PendingIntent f174574m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final PendingIntent f174575n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Map f174576o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f174577p = false;

    private a(String str, int i15, int i16, int i17, Integer num, int i18, long j15, long j16, long j17, long j18, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        this.f174562a = str;
        this.f174563b = i15;
        this.f174564c = i16;
        this.f174565d = i17;
        this.f174566e = num;
        this.f174567f = i18;
        this.f174568g = j15;
        this.f174569h = j16;
        this.f174570i = j17;
        this.f174571j = j18;
        this.f174572k = pendingIntent;
        this.f174573l = pendingIntent2;
        this.f174574m = pendingIntent3;
        this.f174575n = pendingIntent4;
        this.f174576o = map;
    }

    public static a c(String str, int i15, int i16, int i17, Integer num, int i18, long j15, long j16, long j17, long j18, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        return new a(str, i15, i16, i17, num, i18, j15, j16, j17, j18, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map);
    }

    public int a() {
        return this.f174563b;
    }

    public int b() {
        return this.f174564c;
    }
}
