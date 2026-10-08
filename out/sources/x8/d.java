package x8;

import java.nio.ByteBuffer;
import t7.v;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements a {
    @Override // x8.a
    public final v a(b bVar) {
        ByteBuffer byteBuffer = (ByteBuffer) p.q(bVar.f233228d);
        p.d(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(bVar, byteBuffer);
    }

    protected abstract v b(b bVar, ByteBuffer byteBuffer);
}
