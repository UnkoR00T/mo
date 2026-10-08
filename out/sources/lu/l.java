package lu;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l {
    public static /* synthetic */ boolean a(AtomicReferenceArray atomicReferenceArray, int i15, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i15, obj, obj2)) {
            if (atomicReferenceArray.get(i15) != obj) {
                return false;
            }
        }
        return true;
    }
}
