package y7;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j f224854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f224855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f224856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f224857h;

    public e() {
        super(false);
    }

    @Override // y7.f
    public Uri c() {
        j jVar = this.f224854e;
        if (jVar != null) {
            return jVar.f224865a;
        }
        return null;
    }

    @Override // y7.f
    public void close() {
        if (this.f224855f != null) {
            this.f224855f = null;
            r();
        }
        this.f224854e = null;
    }

    @Override // y7.f
    public long i(j jVar) throws g, t7.x {
        s(jVar);
        this.f224854e = jVar;
        Uri uriNormalizeScheme = jVar.f224865a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        zj.p.l("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String[] strArrZ0 = o0.Z0(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrZ0.length != 2) {
            throw t7.x.b("Unexpected URI format: " + uriNormalizeScheme, null);
        }
        String str = strArrZ0[1];
        if (strArrZ0[0].contains(";base64")) {
            try {
                this.f224855f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e15) {
                throw t7.x.b("Error while parsing Base64 encoded string: " + str, e15);
            }
        } else {
            this.f224855f = o0.p0(URLDecoder.decode(str, StandardCharsets.US_ASCII.name()));
        }
        long j15 = jVar.f224871g;
        byte[] bArr = this.f224855f;
        if (j15 > bArr.length) {
            this.f224855f = null;
            throw new g(2008);
        }
        int i15 = (int) j15;
        this.f224856g = i15;
        int length = bArr.length - i15;
        this.f224857h = length;
        long j16 = jVar.f224872h;
        if (j16 != -1) {
            this.f224857h = (int) Math.min(length, j16);
        }
        t(jVar);
        long j17 = jVar.f224872h;
        return j17 != -1 ? j17 : this.f224857h;
    }

    @Override // t7.h
    public int read(byte[] bArr, int i15, int i16) {
        if (i16 == 0) {
            return 0;
        }
        int i17 = this.f224857h;
        if (i17 == 0) {
            return -1;
        }
        int iMin = Math.min(i16, i17);
        System.arraycopy(o0.h(this.f224855f), this.f224856g, bArr, i15, iMin);
        this.f224856g += iMin;
        this.f224857h -= iMin;
        q(iMin);
        return iMin;
    }
}
