package ce;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.util.Log;
import io.sentry.android.core.c2;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class j implements d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Bitmap.Config f25514k = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f25515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<Bitmap.Config> f25516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f25517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f25518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f25519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f25520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f25521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25522h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f25523i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f25524j;

    private interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    private static final class b implements a {
        b() {
        }

        @Override // ce.j.a
        public void a(Bitmap bitmap) {
        }

        @Override // ce.j.a
        public void b(Bitmap bitmap) {
        }
    }

    j(long j15, k kVar, Set<Bitmap.Config> set) {
        this.f25517c = j15;
        this.f25519e = j15;
        this.f25515a = kVar;
        this.f25516b = set;
        this.f25518d = new b();
    }

    @TargetApi(26)
    private static void f(Bitmap.Config config) {
        if (config != Bitmap.Config.HARDWARE) {
            return;
        }
        throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
    }

    private static Bitmap g(int i15, int i16, Bitmap.Config config) {
        if (config == null) {
            config = f25514k;
        }
        return Bitmap.createBitmap(i15, i16, config);
    }

    private void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private void i() {
        Objects.toString(this.f25515a);
    }

    private void j() {
        q(this.f25519e);
    }

    @TargetApi(26)
    private static Set<Bitmap.Config> k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        return Collections.unmodifiableSet(hashSet);
    }

    private static k l() {
        return new m();
    }

    private synchronized Bitmap m(int i15, int i16, Bitmap.Config config) {
        Bitmap bitmapD;
        try {
            f(config);
            bitmapD = this.f25515a.d(i15, i16, config != null ? config : f25514k);
            if (bitmapD == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f25515a.b(i15, i16, config);
                }
                this.f25522h++;
            } else {
                this.f25521g++;
                this.f25520f -= (long) this.f25515a.e(bitmapD);
                this.f25518d.a(bitmapD);
                p(bitmapD);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f25515a.b(i15, i16, config);
            }
            h();
        } catch (Throwable th4) {
            throw th4;
        }
        return bitmapD;
    }

    @TargetApi(19)
    private static void o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    private synchronized void q(long j15) {
        while (this.f25520f > j15) {
            try {
                Bitmap bitmapRemoveLast = this.f25515a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        c2.g("LruBitmapPool", "Size mismatch, resetting");
                        i();
                    }
                    this.f25520f = 0L;
                    return;
                }
                this.f25518d.a(bitmapRemoveLast);
                this.f25520f -= (long) this.f25515a.e(bitmapRemoveLast);
                this.f25524j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f25515a.a(bitmapRemoveLast);
                }
                h();
                bitmapRemoveLast.recycle();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // ce.d
    @SuppressLint({"InlinedApi"})
    public void a(int i15) {
        if (i15 >= 40 || i15 >= 20) {
            b();
        } else if (i15 >= 20 || i15 == 15) {
            q(n() / 2);
        }
    }

    @Override // ce.d
    public void b() {
        q(0L);
    }

    @Override // ce.d
    public synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f25515a.e(bitmap) <= this.f25519e && this.f25516b.contains(bitmap.getConfig())) {
                int iE = this.f25515a.e(bitmap);
                this.f25515a.c(bitmap);
                this.f25518d.b(bitmap);
                this.f25523i++;
                this.f25520f += (long) iE;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    this.f25515a.a(bitmap);
                }
                h();
                j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f25515a.a(bitmap);
                bitmap.isMutable();
                this.f25516b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // ce.d
    public Bitmap d(int i15, int i16, Bitmap.Config config) {
        Bitmap bitmapM = m(i15, i16, config);
        if (bitmapM == null) {
            return g(i15, i16, config);
        }
        bitmapM.eraseColor(0);
        return bitmapM;
    }

    @Override // ce.d
    public Bitmap e(int i15, int i16, Bitmap.Config config) {
        Bitmap bitmapM = m(i15, i16, config);
        return bitmapM == null ? g(i15, i16, config) : bitmapM;
    }

    public long n() {
        return this.f25519e;
    }

    public j(long j15) {
        this(j15, l(), k());
    }
}
