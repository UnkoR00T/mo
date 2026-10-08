package l9;

import ak.n0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0<v7.a> f117218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f117219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f117220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f117221d;

    public e(List<v7.a> list, long j15, long j16) {
        this.f117218a = n0.v(list);
        this.f117219b = j15;
        this.f117220c = j16;
        long j17 = -9223372036854775807L;
        if (j15 != -9223372036854775807L && j16 != -9223372036854775807L) {
            j17 = j15 + j16;
        }
        this.f117221d = j17;
    }
}
