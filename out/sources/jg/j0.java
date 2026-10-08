package jg;

import android.content.Context;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseIntArray f102514a = new SparseIntArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gg.e f102515b;

    public j0(gg.e eVar) {
        s.l(eVar);
        this.f102515b = eVar;
    }

    public final int a(Context context, hg.a.f fVar) {
        s.l(context);
        s.l(fVar);
        int iH = 0;
        if (!fVar.g()) {
            return 0;
        }
        int iL = fVar.l();
        int iB = b(context, iL);
        if (iB != -1) {
            return iB;
        }
        SparseIntArray sparseIntArray = this.f102514a;
        synchronized (sparseIntArray) {
            int i15 = 0;
            while (true) {
                try {
                    if (i15 >= sparseIntArray.size()) {
                        iH = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i15);
                    if (iKeyAt > iL && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    }
                    i15++;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            if (iH == -1) {
                iH = this.f102515b.h(context, iL);
            }
            sparseIntArray.put(iL, iH);
        }
        return iH;
    }

    public final int b(Context context, int i15) {
        int i16;
        SparseIntArray sparseIntArray = this.f102514a;
        synchronized (sparseIntArray) {
            i16 = sparseIntArray.get(i15, -1);
        }
        return i16;
    }

    public final void c() {
        SparseIntArray sparseIntArray = this.f102514a;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
    }
}
