package y7;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f224947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f224948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f224949c = Uri.EMPTY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, List<String>> f224950d = Collections.EMPTY_MAP;

    public w(f fVar) {
        this.f224947a = (f) zj.p.q(fVar);
    }

    @Override // y7.f
    public Uri c() {
        return this.f224947a.c();
    }

    @Override // y7.f
    public void close() {
        this.f224947a.close();
    }

    @Override // y7.f
    public Map<String, List<String>> f() {
        return this.f224947a.f();
    }

    @Override // y7.f
    public long i(j jVar) {
        this.f224949c = jVar.f224865a;
        this.f224950d = Collections.EMPTY_MAP;
        try {
            return this.f224947a.i(jVar);
        } finally {
            Uri uriC = c();
            if (uriC != null) {
                this.f224949c = uriC;
            }
            this.f224950d = f();
        }
    }

    @Override // y7.f
    public void m(x xVar) {
        zj.p.q(xVar);
        this.f224947a.m(xVar);
    }

    public long q() {
        return this.f224948b;
    }

    public Uri r() {
        return this.f224949c;
    }

    @Override // t7.h
    public int read(byte[] bArr, int i15, int i16) {
        int i17 = this.f224947a.read(bArr, i15, i16);
        if (i17 != -1) {
            this.f224948b += (long) i17;
        }
        return i17;
    }

    public Map<String, List<String>> s() {
        return this.f224950d;
    }

    public void t() {
        this.f224948b = 0L;
    }
}
