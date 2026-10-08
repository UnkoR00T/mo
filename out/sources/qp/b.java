package qp;

import android.graphics.BitmapFactory;
import bp.i;
import java.io.ByteArrayInputStream;
import op.e;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: qp.b$b, reason: collision with other inner class name */
    private static class C4232b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f167821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f167822b;

        private C4232b() {
        }
    }

    public static d a(gp.c cVar, byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        C4232b c4232bB = b(byteArrayInputStream);
        return new d(cVar, byteArrayInputStream, i.f20687a2, c4232bB.f167821a, c4232bB.f167822b, 8, e.f148062c);
    }

    private static C4232b b(ByteArrayInputStream byteArrayInputStream) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(byteArrayInputStream, null, options);
        byteArrayInputStream.reset();
        C4232b c4232b = new C4232b();
        c4232b.f167821a = options.outWidth;
        c4232b.f167822b = options.outHeight;
        return c4232b;
    }
}
