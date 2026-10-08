package f8;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface m {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f60009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaFormat f60010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t7.p f60011c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Surface f60012d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MediaCrypto f60013e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final k f60014f;

        private a(p pVar, MediaFormat mediaFormat, t7.p pVar2, Surface surface, MediaCrypto mediaCrypto, k kVar) {
            this.f60009a = pVar;
            this.f60010b = mediaFormat;
            this.f60011c = pVar2;
            this.f60012d = surface;
            this.f60013e = mediaCrypto;
            this.f60014f = kVar;
        }

        public static a a(p pVar, MediaFormat mediaFormat, t7.p pVar2, MediaCrypto mediaCrypto, k kVar) {
            return new a(pVar, mediaFormat, pVar2, null, mediaCrypto, kVar);
        }

        public static a b(p pVar, MediaFormat mediaFormat, t7.p pVar2, Surface surface, MediaCrypto mediaCrypto) {
            return new a(pVar, mediaFormat, pVar2, surface, mediaCrypto, null);
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Deprecated
        public static final b f60015a = new j();

        static b b(Context context) {
            return new j(context);
        }

        m a(a aVar);
    }

    public interface c {
        default void a() {
        }

        default void b() {
        }
    }

    public interface d {
        void a(m mVar, long j15, long j16);
    }

    void a(int i15, int i16, int i17, long j15, int i18);

    void b();

    void c(int i15, int i16, z7.c cVar, long j15, int i17);

    void d(Bundle bundle);

    void e(List<String> list);

    void f(d dVar, Handler handler);

    void flush();

    MediaFormat g();

    void h();

    void i(List<String> list);

    void j(int i15);

    ByteBuffer k(int i15);

    void l(Surface surface);

    boolean m();

    default void n(Runnable runnable) {
        runnable.run();
    }

    void o(int i15, long j15);

    int p();

    int q(MediaCodec.BufferInfo bufferInfo);

    default boolean r(c cVar) {
        return false;
    }

    void s(int i15, boolean z15);

    ByteBuffer t(int i15);
}
