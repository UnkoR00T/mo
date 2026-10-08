package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;
import o.w0;

/* JADX INFO: loaded from: classes.dex */
public interface o extends AutoCloseable {

    public interface a {
        ByteBuffer v();

        int w();

        int x();
    }

    @Override // java.lang.AutoCloseable
    void close();

    int getFormat();

    int getHeight();

    int l();

    Image m0();

    @SuppressLint({"ArrayReturn"})
    a[] o2();

    w0 v3();

    void y1(Rect rect);
}
