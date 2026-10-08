package t7;

import java.util.Collections;
import java.util.PriorityQueue;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f188116a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PriorityQueue<Integer> f188117b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f188118c = PKIFailureInfo.systemUnavail;

    public void a(int i15) {
        synchronized (this.f188116a) {
            this.f188117b.add(Integer.valueOf(i15));
            this.f188118c = Math.max(this.f188118c, i15);
        }
    }

    public void b(int i15) {
        synchronized (this.f188116a) {
            this.f188117b.remove(Integer.valueOf(i15));
            this.f188118c = this.f188117b.isEmpty() ? PKIFailureInfo.systemUnavail : ((Integer) o0.h(this.f188117b.peek())).intValue();
            this.f188116a.notifyAll();
        }
    }
}
