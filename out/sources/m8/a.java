package m8;

import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f124257a = ByteBuffer.allocateDirect(500);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x7.h.e f124258b;

    private boolean a(x7.h.d dVar, boolean z15) {
        x7.h.e eVar;
        x7.h.b bVarB;
        int i15 = dVar.f217243a;
        if (i15 == 2 || i15 == 15) {
            return true;
        }
        if (i15 != 3 || z15) {
            return ((i15 != 6 && i15 != 3) || (eVar = this.f124258b) == null || (bVarB = x7.h.b.b(eVar, dVar)) == null || bVarB.a()) ? false : true;
        }
        return false;
    }

    private void b() {
        ByteBuffer byteBuffer = this.f124257a;
        byteBuffer.position(byteBuffer.limit());
    }

    private void f(List<x7.h.d> list) {
        for (int i15 = 0; i15 < list.size(); i15++) {
            if (list.get(i15).f217243a == 1) {
                this.f124258b = x7.h.e.a(list.get(i15));
            }
        }
    }

    public void c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, iPosition + 500));
        this.f124257a.clear();
        this.f124257a.put(byteBuffer);
        this.f124257a.flip();
        byteBuffer.position(iPosition);
        byteBuffer.limit(iLimit);
    }

    public void d() {
        this.f124258b = null;
        b();
    }

    public int e(ByteBuffer byteBuffer, boolean z15) {
        if (this.f124257a.hasRemaining()) {
            f(x7.h.e(this.f124257a));
            b();
        }
        List<x7.h.d> listE = x7.h.e(byteBuffer);
        f(listE);
        int size = listE.size() - 1;
        int i15 = 0;
        while (size >= 0 && a(listE.get(size), z15)) {
            if (listE.get(size).f217243a == 6 || listE.get(size).f217243a == 3) {
                i15++;
            }
            size--;
        }
        if (i15 > 1 || size + 1 >= 8) {
            return byteBuffer.limit();
        }
        return size >= 0 ? listE.get(size).f217244b.limit() : byteBuffer.position();
    }
}
