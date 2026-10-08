package p076m2;

import c3.g;
import er.l;
import er.p;
import fr.t;
import java.util.Set;
import lu.k;
import lu.z;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import r0.i1;
import r0.u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J%\u0010\n\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0012\u0010\u0003J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001bR*\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u0010R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lm2/h5;", "Lm2/l5;", "<init>", "()V", "Loq/i0;", "j", "Llu/z;", "channel", "", "obj", "o", "(Llu/z;Ljava/lang/Object;)V", "Lkotlin/Function1;", "e", "(Llu/z;)Ler/l;", "a", "(Llu/z;)V", "b", "c", "Lm2/w2;", "l", "()Lm2/w2;", "Ljava/lang/Object;", "soleWatchedObject", "workingSoleWatchedObject", "Lr0/u0;", "d", "Lr0/u0;", "watchSet", "workingWatchSet", "f", "Llu/z;", "k", "()Llu/z;", "setSubscribedChannel", "subscribedChannel", "g", "Ler/l;", "readObserverCache", "Lc3/g;", "h", "Lc3/g;", "unregisterApplyObserver", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class h5 extends l5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Object soleWatchedObject;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Object workingSoleWatchedObject;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private u0<Object> watchSet;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private u0<Object> workingWatchSet;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private z<? super i0> subscribedChannel;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final l<Object, i0> readObserverCache = new l() { // from class: m2.f5
        @Override // er.l
        public final Object b(Object obj) {
            return h5.m(this.f122929a, obj);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final g unregisterApplyObserver = c3.l.INSTANCE.h(new p() { // from class: m2.g5
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return h5.n(this.f122939a, (Set) obj, (c3.l) obj2);
        }
    });

    private final void j() {
        this.workingSoleWatchedObject = null;
        this.workingWatchSet = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(h5 h5Var, Object obj) {
        h5Var.o(h5Var.subscribedChannel, obj);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[Catch: all -> 0x001a, LOOP:0: B:14:0x0027->B:26:0x0062, LOOP_END, TryCatch #0 {all -> 0x001a, blocks: (B:4:0x0009, B:6:0x000d, B:8:0x0017, B:28:0x0066, B:11:0x001c, B:14:0x0027, B:16:0x0037, B:18:0x0043, B:20:0x004c, B:22:0x0057, B:23:0x005a, B:26:0x0062), top: B:36:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0065 A[EDGE_INSN: B:27:0x0065->B:28:0x0066 BREAK  A[LOOP:0: B:14:0x0027->B:26:0x0062]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0065 A[SYNTHETIC] */
    public static final i0 n(h5 h5Var, Set set, c3.l lVar) {
        z<? super i0> zVar;
        synchronized (h5Var.getLock()) {
            try {
                u0<Object> u0Var = h5Var.watchSet;
                if (u0Var != null) {
                    Object[] objArr = u0Var.elements;
                    long[] jArr = u0Var.metadata;
                    int length = jArr.length - 2;
                    if (length < 0) {
                        zVar = null;
                        break;
                    }
                    int i15 = 0;
                    loop0: while (true) {
                        long j15 = jArr[i15];
                        if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i16 = 8 - ((~(i15 - length)) >>> 31);
                            for (int i17 = 0; i17 < i16; i17++) {
                                if ((255 & j15) < 128 && set.contains(objArr[(i15 << 3) + i17])) {
                                    zVar = h5Var.subscribedChannel;
                                    break loop0;
                                }
                                j15 >>= 8;
                            }
                            if (i16 == 8) {
                                if (i15 == length) {
                                    i15++;
                                }
                            }
                            zVar = null;
                            break;
                        }
                        if (i15 == length) {
                            zVar = null;
                            break;
                        }
                        i15++;
                    }
                } else {
                    if (!v.c0(set, h5Var.soleWatchedObject)) {
                        zVar = null;
                        break;
                    }
                    zVar = h5Var.subscribedChannel;
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (zVar != null) {
            k.b(zVar.d(i0.f148189a));
        }
        return i0.f148189a;
    }

    @Override // p076m2.l5
    public void a(z<? super i0> channel) {
        j();
    }

    @Override // p076m2.l5
    public void b() {
        synchronized (getLock()) {
            try {
                this.soleWatchedObject = this.workingSoleWatchedObject;
                if (this.workingWatchSet == null) {
                    this.watchSet = null;
                } else {
                    if (this.watchSet == null) {
                        this.watchSet = i1.b();
                    }
                    u0<Object> u0Var = this.watchSet;
                    this.watchSet = this.workingWatchSet;
                    this.workingWatchSet = u0Var;
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // p076m2.l5
    public void c() {
        this.unregisterApplyObserver.j();
        j();
        synchronized (getLock()) {
            this.subscribedChannel = null;
            this.soleWatchedObject = null;
            this.watchSet = null;
            i0 i0Var = i0.f148189a;
        }
    }

    @Override // p076m2.l5
    public l<Object, i0> e(z<? super i0> channel) {
        z<? super i0> zVar = this.subscribedChannel;
        if (!(zVar == null || t.c(zVar, channel))) {
            w3.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.subscribedChannel = channel;
        return this.readObserverCache;
    }

    public final z<i0> k() {
        return this.subscribedChannel;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005f A[LOOP:0: B:14:0x002a->B:24:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0062 A[EDGE_INSN: B:28:0x0062->B:25:0x0062 BREAK  A[LOOP:0: B:14:0x002a->B:24:0x005f], SYNTHETIC] */
    public final w2 l() {
        w2 w2Var = new w2();
        z<? super i0> zVar = this.subscribedChannel;
        if (!(zVar != null)) {
            w3.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
        }
        u0<Object> u0Var = this.watchSet;
        if (u0Var != null) {
            Object[] objArr = u0Var.elements;
            long[] jArr = u0Var.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i15 = 0;
                while (true) {
                    long j15 = jArr[i15];
                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i15 != length) {
                            break;
                            break;
                        }
                        i15++;
                    } else {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((255 & j15) < 128) {
                                w2Var.n(zVar, objArr[(i15 << 3) + i17]);
                            }
                            j15 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                        if (i15 != length) {
                            break;
                        }
                        i15++;
                    }
                }
            }
        } else {
            w2Var.n(zVar, this.soleWatchedObject);
        }
        w2Var.b();
        c();
        return w2Var;
    }

    public void o(z<? super i0> channel, Object obj) {
        if (!t.c(this.subscribedChannel, channel)) {
            w3.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        u0<Object> u0Var = this.workingWatchSet;
        Object obj2 = this.workingSoleWatchedObject;
        if (u0Var != null) {
            if (!(obj2 == null)) {
                w3.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
            }
            u0Var.i(obj);
        } else {
            if (obj2 == null) {
                this.workingSoleWatchedObject = obj;
                return;
            }
            u0<Object> u0VarB = i1.b();
            u0VarB.i(obj2);
            u0VarB.i(obj);
            this.workingWatchSet = u0VarB;
            this.workingSoleWatchedObject = null;
        }
    }
}
