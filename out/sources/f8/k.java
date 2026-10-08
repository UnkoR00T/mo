package f8;

import android.media.LoudnessCodecController;
import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet<MediaCodec> f60004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f60005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LoudnessCodecController f60006c;

    class a implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
        a() {
        }

        public Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
            return k.this.f60005b.a(bundle);
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f60008a = new b() { // from class: f8.l
            @Override // f8.k.b
            public final Bundle a(Bundle bundle) {
                return k.b.b(bundle);
            }
        };

        static /* synthetic */ Bundle b(Bundle bundle) {
            return bundle;
        }

        Bundle a(Bundle bundle);
    }

    public k() {
        this(b.f60008a);
    }

    public void b(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f60006c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            zj.p.w(this.f60004a.add(mediaCodec));
        }
    }

    public void c() {
        this.f60004a.clear();
        LoudnessCodecController loudnessCodecController = this.f60006c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public void d(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f60004a.remove(mediaCodec) || (loudnessCodecController = this.f60006c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void e(int i15) {
        LoudnessCodecController loudnessCodecController = this.f60006c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f60006c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i15, com.google.common.util.concurrent.u.a(), new a());
        this.f60006c = loudnessCodecControllerCreate;
        Iterator<MediaCodec> it = this.f60004a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec(it.next())) {
                it.remove();
            }
        }
    }

    public k(b bVar) {
        this.f60004a = new HashSet<>();
        this.f60005b = bVar;
    }
}
