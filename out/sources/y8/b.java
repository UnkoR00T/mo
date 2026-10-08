package y8;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import t7.v;
import w7.b0;
import x8.d;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends d {
    private static v c(b0 b0Var) {
        b0Var.r(12);
        int iD = (b0Var.d() + b0Var.h(12)) - 4;
        b0Var.r(44);
        b0Var.s(b0Var.h(12));
        b0Var.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strL = null;
            if (b0Var.d() >= iD) {
                break;
            }
            b0Var.r(48);
            int iH = b0Var.h(8);
            b0Var.r(4);
            int iD2 = b0Var.d() + b0Var.h(12);
            String strL2 = null;
            while (b0Var.d() < iD2) {
                int iH2 = b0Var.h(8);
                int iH3 = b0Var.h(8);
                int iD3 = b0Var.d() + iH3;
                if (iH2 == 2) {
                    int iH4 = b0Var.h(16);
                    b0Var.r(8);
                    if (iH4 == 3) {
                        while (b0Var.d() < iD3) {
                            strL = b0Var.l(b0Var.h(8), StandardCharsets.US_ASCII);
                            int iH5 = b0Var.h(8);
                            for (int i15 = 0; i15 < iH5; i15++) {
                                b0Var.s(b0Var.h(8));
                            }
                        }
                    }
                } else if (iH2 == 21) {
                    strL2 = b0Var.l(iH3, StandardCharsets.US_ASCII);
                }
                b0Var.p(iD3 * 8);
            }
            b0Var.p(iD2 * 8);
            if (strL != null && strL2 != null) {
                arrayList.add(new a(iH, strL + strL2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new v(arrayList);
    }

    @Override // x8.d
    protected v b(x8.b bVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new b0(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
