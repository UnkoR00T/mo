package ou;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ju.r2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ou.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\rR\u000b\u0010!\u001a\u00020 8\u0002X\u0082\u0004¨\u0006\""}, d2 = {"Lou/b0;", ip.a.f96137b, "Lou/c;", "Lju/r2;", "", "id", "prev", "", "pointers", "<init>", "(JLou/b0;I)V", "", "u", "()Z", "p", "index", "", "cause", "Ltq/i;", "context", "Loq/i0;", "s", "(ILjava/lang/Throwable;Ltq/i;)V", "t", "()V", "c", "J", "r", "()I", "numberOfSlots", "k", "isRemoved", "Liu/c;", "cleanedAndPointers", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b0<S extends b0<S>> extends c<S> implements r2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f150025d = AtomicIntegerFieldUpdater.newUpdater(b0.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long id;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public b0(long j15, S s15, int i15) {
        super(s15);
        this.id = j15;
        this.cleanedAndPointers$volatile = i15 << 16;
    }

    @Override // ou.c
    public boolean k() {
        return f150025d.get(this) == r() && !l();
    }

    public final boolean p() {
        return f150025d.addAndGet(this, -65536) == r() && !l();
    }

    public abstract int r();

    public abstract void s(int index, Throwable cause, tq.i context);

    public final void t() {
        if (f150025d.incrementAndGet(this) == r()) {
            n();
        }
    }

    public final boolean u() {
        int i15;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f150025d;
        do {
            i15 = atomicIntegerFieldUpdater.get(this);
            if (i15 == r() && !l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i15, PKIFailureInfo.notAuthorized + i15));
        return true;
    }
}
