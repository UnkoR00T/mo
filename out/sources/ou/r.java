package ou;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \f*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u0018\u001bB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\f\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000b2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000b2\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000b2\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0014\u0010#\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u0011\u0010%\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b$\u0010\u001aR\u0011\u0010(\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010'R%\u0010*\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000b0)8\u0002X\u0082\u0004R\u000b\u0010,\u001a\u00020+8\u0002X\u0082\u0004R\u0013\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00018\u0002X\u0082\u0004¨\u0006."}, d2 = {"Lou/r;", "", "E", "", "capacity", "", "singleConsumer", "<init>", "(IZ)V", "index", "element", "Lkotlinx/coroutines/internal/Core;", "e", "(ILjava/lang/Object;)Lou/r;", "oldHead", "newHead", "n", "(II)Lou/r;", "", "k", "()J", "state", "c", "(J)Lou/r;", "b", "d", "()Z", "a", "(Ljava/lang/Object;)I", "m", "()Ljava/lang/Object;", "l", "()Lou/r;", "I", "Z", "mask", "j", "isEmpty", "g", "()I", "size", "Liu/e;", "_next", "Liu/d;", "_state", "array", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f150069f = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f150070g = AtomicLongFieldUpdater.newUpdater(r.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e0 f150071h = new e0("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean singleConsumer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int mask;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f150075d;

    /* JADX INFO: renamed from: ou.r$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000bJ\u0011\u0010\u000e\u001a\u00020\b*\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0014\u0010\u001f\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0011R\u0014\u0010\"\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0011R\u0014\u0010#\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0011¨\u0006$"}, d2 = {"Lou/r$a;", "", "<init>", "()V", "", "other", "d", "(JJ)J", "", "newHead", "b", "(JI)J", "newTail", "c", "a", "(J)I", "INITIAL_CAPACITY", "I", "CAPACITY_BITS", "MAX_CAPACITY_MASK", "HEAD_SHIFT", "HEAD_MASK", "J", "TAIL_SHIFT", "TAIL_MASK", "FROZEN_SHIFT", "FROZEN_MASK", "CLOSED_SHIFT", "CLOSED_MASK", "MIN_ADD_SPIN_CAPACITY", "Lou/e0;", "REMOVE_FROZEN", "Lou/e0;", "ADD_SUCCESS", "ADD_FROZEN", "ADD_CLOSED", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final int a(long j15) {
            return (j15 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j15, int i15) {
            return d(j15, 1073741823L) | ((long) i15);
        }

        public final long c(long j15, int i15) {
            return d(j15, 1152921503533105152L) | (((long) i15) << 30);
        }

        public final long d(long j15, long j16) {
            return j15 & (~j16);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lou/r$b;", "", "", "index", "<init>", "(I)V", "a", "I", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int index;

        public b(int i15) {
            this.index = i15;
        }
    }

    public r(int i15, boolean z15) {
        this.capacity = i15;
        this.singleConsumer = z15;
        int i16 = i15 - 1;
        this.mask = i16;
        this.f150075d = new AtomicReferenceArray(i15);
        if (i16 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i15 & i16) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final r<E> b(long state) {
        r<E> rVar = new r<>(this.capacity * 2, this.singleConsumer);
        int i15 = (int) (1073741823 & state);
        int i16 = (int) ((1152921503533105152L & state) >> 30);
        while (true) {
            int i17 = this.mask;
            if ((i15 & i17) == (i17 & i16)) {
                f150070g.set(rVar, INSTANCE.d(state, 1152921504606846976L));
                return rVar;
            }
            Object bVar = getF150075d().get(this.mask & i15);
            if (bVar == null) {
                bVar = new b(i15);
            }
            rVar.getF150075d().set(rVar.mask & i15, bVar);
            i15++;
        }
    }

    private final r<E> c(long state) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f150069f;
        while (true) {
            r<E> rVar = (r) atomicReferenceFieldUpdater.get(this);
            if (rVar != null) {
                return rVar;
            }
            androidx.concurrent.futures.b.a(f150069f, this, null, b(state));
        }
    }

    private final r<E> e(int index, E element) {
        Object obj = getF150075d().get(this.mask & index);
        if (!(obj instanceof b) || ((b) obj).index != index) {
            return null;
        }
        getF150075d().set(index & this.mask, element);
        return this;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    private final /* synthetic */ AtomicReferenceArray getF150075d() {
        return this.f150075d;
    }

    private final long k() {
        long j15;
        long j16;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f150070g;
        do {
            j15 = atomicLongFieldUpdater.get(this);
            if ((j15 & 1152921504606846976L) != 0) {
                return j15;
            }
            j16 = 1152921504606846976L | j15;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j15, j16));
        return j16;
    }

    private final r<E> n(int oldHead, int newHead) {
        long j15;
        int i15;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f150070g;
        do {
            j15 = atomicLongFieldUpdater.get(this);
            i15 = (int) (1073741823 & j15);
            if ((1152921504606846976L & j15) != 0) {
                return l();
            }
        } while (!f150070g.compareAndSet(this, j15, INSTANCE.b(j15, newHead)));
        getF150075d().set(this.mask & i15, null);
        return null;
    }

    public final int a(E element) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f150070g;
        while (true) {
            long j15 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j15) != 0) {
                return INSTANCE.a(j15);
            }
            int i15 = (int) (1073741823 & j15);
            int i16 = (int) ((1152921503533105152L & j15) >> 30);
            int i17 = this.mask;
            if (((i16 + 2) & i17) == (i15 & i17)) {
                return 1;
            }
            if (!this.singleConsumer && getF150075d().get(i16 & i17) != null) {
                int i18 = this.capacity;
                if (i18 < 1024 || ((i16 - i15) & 1073741823) > (i18 >> 1)) {
                    return 1;
                }
            } else if (f150070g.compareAndSet(this, j15, INSTANCE.c(j15, (i16 + 1) & 1073741823))) {
                getF150075d().set(i16 & i17, element);
                r<E> rVarE = this;
                while ((f150070g.get(rVarE) & 1152921504606846976L) != 0 && (rVarE = rVarE.l().e(i16, element)) != null) {
                }
                return 0;
            }
        }
    }

    public final boolean d() {
        long j15;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f150070g;
        do {
            j15 = atomicLongFieldUpdater.get(this);
            if ((j15 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j15) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j15, 2305843009213693952L | j15));
        return true;
    }

    public final int g() {
        long j15 = f150070g.get(this);
        return (((int) ((j15 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j15))) & 1073741823;
    }

    public final boolean j() {
        long j15 = f150070g.get(this);
        return ((int) (1073741823 & j15)) == ((int) ((j15 & 1152921503533105152L) >> 30));
    }

    public final r<E> l() {
        return c(k());
    }

    public final Object m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f150070g;
        while (true) {
            long j15 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j15) != 0) {
                return f150071h;
            }
            int i15 = (int) (1073741823 & j15);
            int i16 = this.mask;
            if ((((int) ((1152921503533105152L & j15) >> 30)) & i16) == (i16 & i15)) {
                return null;
            }
            Object obj = getF150075d().get(this.mask & i15);
            if (obj == null) {
                if (this.singleConsumer) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i17 = (i15 + 1) & 1073741823;
                if (f150070g.compareAndSet(this, j15, INSTANCE.b(j15, i17))) {
                    getF150075d().set(this.mask & i15, null);
                    return obj;
                }
                if (this.singleConsumer) {
                    r<E> rVarN = this;
                    do {
                        rVarN = rVarN.n(i15, i17);
                    } while (rVarN != null);
                    return obj;
                }
            }
        }
    }
}
