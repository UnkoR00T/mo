package me;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import ve.l;

/* JADX INFO: loaded from: classes3.dex */
public class a implements zd.j<ByteBuffer, c> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C3092a f125897f = new C3092a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b f125898g = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f125899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<ImageHeaderParser> f125900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f125901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3092a f125902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final me.b f125903e;

    /* JADX INFO: renamed from: me.a$a, reason: collision with other inner class name */
    static class C3092a {
        C3092a() {
        }

        yd.a a(yd.a.InterfaceC6070a interfaceC6070a, yd.c cVar, ByteBuffer byteBuffer, int i15) {
            return new yd.e(interfaceC6070a, cVar, byteBuffer, i15);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue<yd.d> f125904a = l.f(0);

        b() {
        }

        synchronized yd.d a(ByteBuffer byteBuffer) {
            yd.d dVarPoll;
            try {
                dVarPoll = this.f125904a.poll();
                if (dVarPoll == null) {
                    dVarPoll = new yd.d();
                }
            } catch (Throwable th4) {
                throw th4;
            }
            return dVarPoll.p(byteBuffer);
        }

        synchronized void b(yd.d dVar) {
            dVar.a();
            this.f125904a.offer(dVar);
        }
    }

    public a(Context context, List<ImageHeaderParser> list, ce.d dVar, ce.b bVar) {
        this(context, list, dVar, bVar, f125898g, f125897f);
    }

    private e c(ByteBuffer byteBuffer, int i15, int i16, yd.d dVar, zd.h hVar) {
        long jB = ve.g.b();
        try {
            yd.c cVarC = dVar.c();
            if (cVarC.b() > 0 && cVarC.c() == 0) {
                Bitmap.Config config = hVar.c(i.f125944a) == zd.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                yd.a aVarA = this.f125902d.a(this.f125903e, cVarC, byteBuffer, e(cVarC, i15, i16));
                aVarA.d(config);
                aVarA.a();
                Bitmap bitmapB = aVarA.b();
                if (bitmapB == null) {
                    return null;
                }
                return new e(new c(this.f125899a, aVarA, he.c.c(), i15, i16, bitmapB));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                ve.g.a(jB);
            }
        }
    }

    private static int e(yd.c cVar, int i15, int i16) {
        int iMin = Math.min(cVar.a() / i16, cVar.d() / i15);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            cVar.d();
            cVar.a();
        }
        return iMax;
    }

    @Override // zd.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public e b(ByteBuffer byteBuffer, int i15, int i16, zd.h hVar) {
        yd.d dVarA = this.f125901c.a(byteBuffer);
        try {
            return c(byteBuffer, i15, i16, dVarA, hVar);
        } finally {
            this.f125901c.b(dVarA);
        }
    }

    @Override // zd.j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, zd.h hVar) {
        return !((Boolean) hVar.c(i.f125945b)).booleanValue() && com.bumptech.glide.load.a.g(this.f125900b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    a(Context context, List<ImageHeaderParser> list, ce.d dVar, ce.b bVar, b bVar2, C3092a c3092a) {
        this.f125899a = context.getApplicationContext();
        this.f125900b = list;
        this.f125902d = c3092a;
        this.f125903e = new me.b(dVar, bVar);
        this.f125901c = bVar2;
    }
}
