package h8;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicLong f81818h = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f81819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y7.j f81820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f81821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, List<String>> f81822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f81823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f81824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f81825g;

    public x(long j15, y7.j jVar, long j16) {
        this(j15, jVar, jVar.f224865a, Collections.EMPTY_MAP, j16, 0L, 0L);
    }

    public static long b() {
        return f81818h.getAndIncrement();
    }

    public x a(long j15, long j16) {
        return new x(j15, this.f81820b, this.f81821c, this.f81822d, this.f81823e, j16, this.f81825g);
    }

    public x(long j15, y7.j jVar, Uri uri, Map<String, List<String>> map, long j16, long j17, long j18) {
        this.f81819a = j15;
        this.f81820b = jVar;
        this.f81821c = uri;
        this.f81822d = map;
        this.f81823e = j16;
        this.f81824f = j17;
        this.f81825g = j18;
    }
}
