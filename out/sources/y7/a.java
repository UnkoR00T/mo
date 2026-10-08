package y7;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AssetManager f224839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f224840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InputStream f224841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f224842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f224843i;

    /* JADX INFO: renamed from: y7.a$a, reason: collision with other inner class name */
    public static final class C6028a extends g {
        public C6028a(Throwable th4, int i15) {
            super(th4, i15);
        }
    }

    public a(Context context) {
        super(false);
        this.f224839e = context.getAssets();
    }

    @Override // y7.f
    public Uri c() {
        return this.f224840f;
    }

    @Override // y7.f
    public void close() {
        this.f224840f = null;
        try {
            try {
                InputStream inputStream = this.f224841g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f224841g = null;
                if (this.f224843i) {
                    this.f224843i = false;
                    r();
                }
            } catch (IOException e15) {
                throw new C6028a(e15, 2000);
            }
        } catch (Throwable th4) {
            this.f224841g = null;
            if (this.f224843i) {
                this.f224843i = false;
                r();
            }
            throw th4;
        }
    }

    @Override // y7.f
    public long i(j jVar) throws C6028a {
        try {
            Uri uri = jVar.f224865a;
            this.f224840f = uri;
            String strSubstring = (String) zj.p.q(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            s(jVar);
            InputStream inputStreamOpen = this.f224839e.open(strSubstring, 1);
            this.f224841g = inputStreamOpen;
            if (inputStreamOpen.skip(jVar.f224871g) < jVar.f224871g) {
                throw new C6028a(null, 2008);
            }
            long j15 = jVar.f224872h;
            if (j15 != -1) {
                this.f224842h = j15;
            } else {
                long jAvailable = this.f224841g.available();
                this.f224842h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f224842h = -1L;
                }
            }
            this.f224843i = true;
            t(jVar);
            return this.f224842h;
        } catch (C6028a e15) {
            throw e15;
        } catch (IOException e16) {
            throw new C6028a(e16, e16 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // t7.h
    public int read(byte[] bArr, int i15, int i16) throws C6028a {
        if (i16 == 0) {
            return 0;
        }
        long j15 = this.f224842h;
        if (j15 == 0) {
            return -1;
        }
        if (j15 != -1) {
            try {
                i16 = (int) Math.min(j15, i16);
            } catch (IOException e15) {
                throw new C6028a(e15, 2000);
            }
        }
        int i17 = ((InputStream) o0.h(this.f224841g)).read(bArr, i15, i16);
        if (i17 == -1) {
            return -1;
        }
        long j16 = this.f224842h;
        if (j16 != -1) {
            this.f224842h = j16 - ((long) i17);
        }
        q(i17);
        return i17;
    }
}
