package qu;

import fr.p0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001f*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\"\u0010\u001eJ!\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\r¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014¢\u0006\u0004\b&\u0010\u0018J\u000f\u0010'\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010\u001eJ\u0015\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0019¢\u0006\u0004\b)\u0010*R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010,R\u0014\u00100\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0013\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004038\u0002X\u0082\u0004R\u000b\u00106\u001a\u0002058\u0002X\u0082\u0004R\u000b\u00107\u001a\u0002058\u0002X\u0082\u0004R\u000b\u00108\u001a\u0002058\u0002X\u0082\u0004¨\u00069"}, d2 = {"Lqu/l;", "", "<init>", "()V", "Lqu/h;", "task", "b", "(Lqu/h;)Lqu/h;", "", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "p", "(I)Lqu/h;", "", "onlyBlocking", "o", "(Z)Lqu/h;", "index", "q", "(IZ)Lqu/h;", "Lfr/p0;", "stolenTaskRef", "", "s", "(ILfr/p0;)J", "Lqu/d;", "queue", "n", "(Lqu/d;)Z", "m", "()Lqu/h;", "Loq/i0;", "c", "(Lqu/h;)V", "k", "fair", "a", "(Lqu/h;Z)Lqu/h;", "r", "l", "globalQueue", "j", "(Lqu/d;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "e", "()I", "bufferSize", "i", "size", "Liu/e;", "lastScheduledTask", "Liu/c;", "producerIndex", "consumerIndex", "blockingTasksInBuffer", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f168942b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f168943c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f168944d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f168945e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicReferenceArray<h> buffer = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    private final h b(h task) {
        if (e() == 127) {
            return task;
        }
        if (task.taskContext) {
            f168945e.incrementAndGet(this);
        }
        int i15 = f168943c.get(this) & CertificateBody.profileType;
        while (this.buffer.get(i15) != null) {
            Thread.yield();
        }
        this.buffer.lazySet(i15, task);
        f168943c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar == null || !hVar.taskContext) {
            return;
        }
        f168945e.decrementAndGet(this);
    }

    private final int e() {
        return f168943c.get(this) - f168944d.get(this);
    }

    private final h m() {
        h andSet;
        while (true) {
            int i15 = f168944d.get(this);
            if (i15 - f168943c.get(this) == 0) {
                return null;
            }
            int i16 = i15 & CertificateBody.profileType;
            if (f168944d.compareAndSet(this, i15, i15 + 1) && (andSet = this.buffer.getAndSet(i16, null)) != null) {
                c(andSet);
                return andSet;
            }
        }
    }

    private final boolean n(d queue) {
        h hVarM = m();
        if (hVarM == null) {
            return false;
        }
        queue.a(hVarM);
        return true;
    }

    private final h o(boolean onlyBlocking) {
        h hVar;
        do {
            hVar = (h) f168942b.get(this);
            if (hVar == null || hVar.taskContext != onlyBlocking) {
                int i15 = f168944d.get(this);
                int i16 = f168943c.get(this);
                while (i15 != i16) {
                    if (onlyBlocking && f168945e.get(this) == 0) {
                        return null;
                    }
                    i16--;
                    h hVarQ = q(i16, onlyBlocking);
                    if (hVarQ != null) {
                        return hVarQ;
                    }
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f168942b, this, hVar, null));
        return hVar;
    }

    private final h p(int stealingMode) {
        int i15 = f168944d.get(this);
        int i16 = f168943c.get(this);
        boolean z15 = stealingMode == 1;
        while (i15 != i16) {
            if (z15 && f168945e.get(this) == 0) {
                return null;
            }
            int i17 = i15 + 1;
            h hVarQ = q(i15, z15);
            if (hVarQ != null) {
                return hVarQ;
            }
            i15 = i17;
        }
        return null;
    }

    private final h q(int index, boolean onlyBlocking) {
        int i15 = index & CertificateBody.profileType;
        h hVar = this.buffer.get(i15);
        if (hVar == null || hVar.taskContext != onlyBlocking || !lu.l.a(this.buffer, i15, hVar, null)) {
            return null;
        }
        if (onlyBlocking) {
            f168945e.decrementAndGet(this);
        }
        return hVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object, qu.h] */
    private final long s(int stealingMode, p0<h> stolenTaskRef) {
        ?? r15;
        do {
            r15 = (h) f168942b.get(this);
            if (r15 == 0) {
                return -2L;
            }
            if (((r15.taskContext ? 1 : 2) & stealingMode) == 0) {
                return -2L;
            }
            long jA = j.f168940f.a() - r15.submissionTime;
            long j15 = j.f168936b;
            if (jA < j15) {
                return j15 - jA;
            }
        } while (!androidx.concurrent.futures.b.a(f168942b, this, r15, null));
        stolenTaskRef.f66410a = r15;
        return -1L;
    }

    public final h a(h task, boolean fair) {
        if (fair) {
            return b(task);
        }
        h hVar = (h) f168942b.getAndSet(this, task);
        if (hVar == null) {
            return null;
        }
        return b(hVar);
    }

    public final int i() {
        return f168942b.get(this) != null ? e() + 1 : e();
    }

    public final void j(d globalQueue) {
        h hVar = (h) f168942b.getAndSet(this, null);
        if (hVar != null) {
            globalQueue.a(hVar);
        }
        while (n(globalQueue)) {
        }
    }

    public final h k() {
        h hVar = (h) f168942b.getAndSet(this, null);
        return hVar == null ? m() : hVar;
    }

    public final h l() {
        return o(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long r(int stealingMode, p0<h> stolenTaskRef) {
        h hVarP;
        T t15;
        h hVarM;
        if (stealingMode == 3) {
            hVarM = m();
        } else {
            hVarP = p(stealingMode);
        }
        if (t15 == 0) {
            t15 = hVarP;
            t15 = hVarM;
            return s(stealingMode, stolenTaskRef);
        }
        t15 = hVarP;
        t15 = hVarM;
        stolenTaskRef.f66410a = t15;
        return -1L;
    }
}
