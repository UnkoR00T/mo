package p076m2;

import er.l;
import er.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import lu.z;
import n2.g;
import oq.i0;
import p071kotlin.Metadata;
import r0.g1;
import r0.i1;
import r0.t0;
import r0.u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0003\u0011\u000e\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0010¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u0011\u0010\u0003R(\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR2\u0010\u001e\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u000b0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lm2/w2;", "Lm2/l5;", "<init>", "()V", "Llu/z;", "Loq/i0;", "channel", "", "obj", "n", "(Llu/z;Ljava/lang/Object;)V", "Lkotlin/Function1;", "e", "(Llu/z;)Ler/l;", "a", "(Llu/z;)V", "b", "c", "Ln2/g;", "Lr0/t0;", "subscriptions", "", "Lm2/w2$c;", "Ljava/util/List;", "pendingChanges", "Lr0/u0;", "d", "Lr0/u0;", "toNotify", "Lr0/t0;", "readObserverCache", "Lc3/g;", "f", "Lc3/g;", "unregisterApplyObserver", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class w2 extends l5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private t0<Object, Object> subscriptions = g.e(null, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<c> pendingChanges = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u0<z<i0>> toNotify = i1.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t0<z<i0>, l<Object, i0>> readObserverCache = g1.c();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final c3.g unregisterApplyObserver = c3.l.INSTANCE.h(new p() { // from class: m2.u2
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return w2.l(this.f123189a, (Set) obj, (c3.l) obj2);
        }
    });

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\t\u0010\u000e¨\u0006\u000f"}, d2 = {"Lm2/w2$a;", "Lm2/w2$c;", "", "obj", "Llu/z;", "Loq/i0;", "channel", "<init>", "(Ljava/lang/Object;Llu/z;)V", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Llu/z;", "()Llu/z;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Object obj;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final z<i0> channel;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, z<? super i0> zVar) {
            this.obj = obj;
            this.channel = zVar;
        }

        public final z<i0> a() {
            return this.channel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Object getObj() {
            return this.obj;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lm2/w2$b;", "Lm2/w2$c;", "Llu/z;", "Loq/i0;", "channel", "<init>", "(Llu/z;)V", "a", "Llu/z;", "()Llu/z;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final z<i0> channel;

        /* JADX WARN: Multi-variable type inference failed */
        public b(z<? super i0> zVar) {
            this.channel = zVar;
        }

        public final z<i0> a() {
            return this.channel;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lm2/w2$c;", "", "Lm2/w2$a;", "Lm2/w2$b;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private interface c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(w2 w2Var, z zVar, Object obj) {
        w2Var.n(zVar, obj);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0058 A[Catch: all -> 0x004e, LOOP:0: B:7:0x001c->B:19:0x0058, LOOP_END, TryCatch #0 {all -> 0x004e, blocks: (B:4:0x0005, B:7:0x001c, B:9:0x002c, B:11:0x0038, B:13:0x0041, B:16:0x0050, B:19:0x0058, B:20:0x005b), top: B:26:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x005b A[EDGE_INSN: B:29:0x005b->B:20:0x005b BREAK  A[LOOP:0: B:7:0x001c->B:19:0x0058], SYNTHETIC] */
    public static final i0 l(final w2 w2Var, final Set set, c3.l lVar) {
        synchronized (w2Var.getLock()) {
            try {
                g.g(w2Var.subscriptions, new l() { // from class: m2.v2
                    @Override // er.l
                    public final Object b(Object obj) {
                        return w2.m(set, w2Var, obj);
                    }
                });
                u0<z<i0>> u0Var = w2Var.toNotify;
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
                                    ((z) objArr[(i15 << 3) + i17]).d(i0.f148189a);
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
                w2Var.toNotify.n();
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0058 A[LOOP:0: B:11:0x001f->B:21:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[EDGE_INSN: B:26:0x0062->B:23:0x0062 BREAK  A[LOOP:0: B:11:0x001f->B:21:0x0058], SYNTHETIC] */
    public static final i0 m(Set set, w2 w2Var, Object obj) {
        Object objE;
        if (set.contains(obj) && (objE = w2Var.subscriptions.e(obj)) != null) {
            if (objE instanceof u0) {
                u0 u0Var = (u0) objE;
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
                                    w2Var.toNotify.i((z) objArr[(i15 << 3) + i17]);
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
                w2Var.toNotify.i((z) objE);
            }
        }
        return i0.f148189a;
    }

    @Override // p076m2.l5
    public void a(z<? super i0> channel) {
        this.pendingChanges.add(new b(channel));
    }

    @Override // p076m2.l5
    public void b() {
        synchronized (getLock()) {
            try {
                List<c> list = this.pendingChanges;
                int size = list.size();
                for (int i15 = 0; i15 < size; i15++) {
                    c cVar = list.get(i15);
                    if (cVar instanceof a) {
                        g.a(this.subscriptions, ((a) cVar).getObj(), ((a) cVar).a());
                    } else {
                        if (!(cVar instanceof b)) {
                            throw new oq.p();
                        }
                        g.n(this.subscriptions, ((b) cVar).a());
                    }
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.pendingChanges.clear();
    }

    @Override // p076m2.l5
    public void c() {
        this.unregisterApplyObserver.j();
        this.pendingChanges.clear();
        this.readObserverCache.k();
        synchronized (getLock()) {
            g.c(this.subscriptions);
            i0 i0Var = i0.f148189a;
        }
    }

    @Override // p076m2.l5
    public l<Object, i0> e(final z<? super i0> channel) {
        l<Object, i0> lVarE = this.readObserverCache.e(channel);
        if (lVarE != null) {
            return lVarE;
        }
        l<Object, i0> lVar = new l() { // from class: m2.t2
            @Override // er.l
            public final Object b(Object obj) {
                return w2.k(this.f123164a, channel, obj);
            }
        };
        this.readObserverCache.r(channel, lVar);
        return lVar;
    }

    public void n(z<? super i0> channel, Object obj) {
        this.pendingChanges.add(new a(obj, channel));
    }
}
