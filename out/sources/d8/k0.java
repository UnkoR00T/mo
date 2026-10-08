package d8;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y7.j f40295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f40296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, List<String>> f40297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f40298d;

    public k0(y7.j jVar, Uri uri, Map<String, List<String>> map, long j15, Throwable th4) {
        super(th4);
        this.f40295a = jVar;
        this.f40296b = uri;
        this.f40297c = map;
        this.f40298d = j15;
    }
}
