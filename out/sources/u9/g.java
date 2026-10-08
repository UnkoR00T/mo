package u9;

import android.text.TextUtils;
import java.util.ArrayList;
import l9.s;
import t7.x;
import w7.c0;
import w7.l;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f196568a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f196569b = new b();

    private static int d(c0 c0Var) {
        int i15 = -1;
        int iG = 0;
        while (i15 == -1) {
            iG = c0Var.g();
            String strB = c0Var.B();
            if (strB == null) {
                i15 = 0;
            } else if ("STYLE".equals(strB)) {
                i15 = 2;
            } else {
                i15 = strB.startsWith("NOTE") ? 1 : 3;
            }
        }
        c0Var.f0(iG);
        return i15;
    }

    private static void e(c0 c0Var) {
        while (!TextUtils.isEmpty(c0Var.B())) {
        }
    }

    @Override // l9.s
    public void b(byte[] bArr, int i15, int i16, s.b bVar, l<l9.e> lVar) {
        d dVarO;
        this.f196568a.d0(bArr, i16 + i15);
        this.f196568a.f0(i15);
        ArrayList arrayList = new ArrayList();
        try {
            h.d(this.f196568a);
            while (!TextUtils.isEmpty(this.f196568a.B())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iD = d(this.f196568a);
                if (iD == 0) {
                    l9.i.c(new j(arrayList2), bVar, lVar);
                    return;
                }
                if (iD == 1) {
                    e(this.f196568a);
                } else if (iD == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.f196568a.B();
                    arrayList.addAll(this.f196569b.d(this.f196568a));
                } else if (iD == 3 && (dVarO = e.o(this.f196568a, arrayList)) != null) {
                    arrayList2.add(dVarO);
                }
            }
        } catch (x e15) {
            throw new IllegalArgumentException(e15);
        }
    }

    @Override // l9.s
    public int c() {
        return 1;
    }
}
