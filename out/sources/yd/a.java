package yd;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface a {

    /* JADX INFO: renamed from: yd.a$a, reason: collision with other inner class name */
    public interface InterfaceC6070a {
        void a(Bitmap bitmap);

        byte[] b(int i15);

        Bitmap c(int i15, int i16, Bitmap.Config config);

        int[] d(int i15);

        void e(byte[] bArr);

        void f(int[] iArr);
    }

    void a();

    Bitmap b();

    int c();

    void clear();

    void d(Bitmap.Config config);

    int e();

    void f();

    int g();

    ByteBuffer getData();

    int h();
}
