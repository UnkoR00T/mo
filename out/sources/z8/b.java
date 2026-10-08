package z8;

import java.nio.ByteBuffer;
import java.util.Arrays;
import t7.v;
import w7.c0;
import x8.d;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends d {
    @Override // x8.d
    protected v b(x8.b bVar, ByteBuffer byteBuffer) {
        return new v(c(new c0(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(c0 c0Var) {
        return new a((String) p.q(c0Var.K()), (String) p.q(c0Var.K()), c0Var.J(), c0Var.J(), Arrays.copyOfRange(c0Var.f(), c0Var.g(), c0Var.j()));
    }
}
