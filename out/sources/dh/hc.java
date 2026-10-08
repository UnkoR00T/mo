package dh;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class hc {
    public static void a(wb wbVar, int i15, int i16, long j15, int i17, int i18, int i19, int i25) {
        wbVar.c(b(i15, i16, j15, i17, i18, i19, i25), e8.INPUT_IMAGE_CONSTRUCTION);
    }

    private static gc b(int i15, int i16, long j15, int i17, int i18, int i19, int i25) {
        return new gc(i15, i16, i19, i17, i18, SystemClock.elapsedRealtime() - j15, i25);
    }
}
