package v;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public interface x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x3 f202907a = new a();

    class a implements x3 {
        a() {
        }

        @Override // v.x3
        public p1 a(b bVar, int i15) {
            return null;
        }
    }

    public enum b {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE,
        STREAM_SHARING,
        METERING_REPEATING
    }

    public interface c {
        x3 a(Context context);
    }

    p1 a(b bVar, int i15);
}
