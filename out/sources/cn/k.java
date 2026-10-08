package cn;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.mp;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.td;
import java.nio.ByteBuffer;
import qi.f0;
import qi.g0;

/* JADX INFO: loaded from: classes4.dex */
final class k {
    static g0 a(ByteBuffer byteBuffer, mp mpVar) {
        f0 f0Var = new f0();
        f0Var.a(byteBuffer.array());
        f0Var.f(b(mpVar.p()));
        f0Var.b(new td(mpVar.r(), mpVar.h()));
        f0Var.c(mpVar.u() * 1000);
        f0Var.e(2);
        return f0Var.d();
    }

    static int b(int i15) {
        if (i15 == 1) {
            return 4;
        }
        if (i15 != 2) {
            return i15 != 3 ? 1 : 2;
        }
        return 3;
    }
}
