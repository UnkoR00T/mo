package androidx.room;

import android.content.Context;
import android.content.Intent;
import er.l;
import er.p;
import fr.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import ju.p0;
import mu.i;
import oa.g;
import oa.l0;
import oa.u;
import oq.i0;
import oq.r;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;
import vq.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 #2\u00020\u0001:\u0002?;BS\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004\u0012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\rH\u0080@¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\rH\u0001¢\u0006\u0004\b'\u0010\u000fJ\r\u0010(\u001a\u00020\r¢\u0006\u0004\b(\u0010\u000fJ9\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070+2\u0012\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u00052\b\b\u0002\u0010*\u001a\u00020\u0012H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b0\u0010/J\u000f\u00101\u001a\u00020\rH\u0016¢\u0006\u0004\b1\u0010\u000fJ\u001d\u00102\u001a\u00020\r2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0000¢\u0006\u0004\b2\u0010\u001cJ'\u00108\u001a\u00020\r2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u00052\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\rH\u0000¢\u0006\u0004\b:\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\"\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR \u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020K0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010@R\u0018\u0010R\u001a\u00060Nj\u0002`O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010SR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\r0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010UR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\r0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010UR\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010^R\u0014\u0010a\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010`¨\u0006b"}, d2 = {"Landroidx/room/c;", "", "Loa/u;", "database", "", "", "shadowTablesMap", "", "viewTables", "", "tableNames", "<init>", "(Loa/u;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V", "Loq/i0;", "r", "()V", "Landroidx/room/c$b;", "observer", "", "h", "(Landroidx/room/c$b;)Z", "x", "", "k", "()Ljava/util/List;", "", "tableIds", "p", "(Ljava/util/Set;)V", "Lsa/b;", "autoCloser", "y", "(Lsa/b;)V", "Lya/b;", "connection", "o", "(Lya/b;)V", "A", "(Ltq/e;)Ljava/lang/Object;", "B", "u", "tables", "emitInitialState", "Lmu/g;", "j", "([Ljava/lang/String;Z)Lmu/g;", "i", "(Landroidx/room/c$b;)V", "w", "v", "q", "Landroid/content/Context;", "context", "name", "Landroid/content/Intent;", "serviceIntent", "n", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "z", "a", "Loa/u;", "l", "()Loa/u;", "b", "Ljava/util/Map;", "c", "d", "[Ljava/lang/String;", "m", "()[Ljava/lang/String;", "Loa/l0;", "e", "Loa/l0;", "implementation", "", "Landroidx/room/e;", "f", "observerMap", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "g", "Ljava/util/concurrent/locks/ReentrantLock;", "observerMapLock", "Lsa/b;", "Lkotlin/Function0;", "Ler/a;", "onRefreshScheduled", "onRefreshCompleted", "Loa/g;", "Loa/g;", "invalidationLiveDataContainer", "Landroid/content/Intent;", "multiInstanceInvalidationIntent", "Landroidx/room/d;", "Landroidx/room/d;", "multiInstanceInvalidationClient", "Ljava/lang/Object;", "trackerLock", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u database;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> shadowTablesMap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Set<String>> viewTables;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String[] tableNames;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l0 implementation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Map<b, androidx.room.e> observerMap;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock observerMapLock;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private sa.b autoCloser;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final er.a<i0> onRefreshScheduled;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final er.a<i0> onRefreshCompleted;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final g invalidationLiveDataContainer;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Intent multiInstanceInvalidationIntent;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private androidx.room.d multiInstanceInvalidationClient;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Object trackerLock;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/room/c$b;", "", "", "", "tables", "<init>", "([Ljava/lang/String;)V", "", "Loq/i0;", "c", "(Ljava/util/Set;)V", "a", "[Ljava/lang/String;", "()[Ljava/lang/String;", "", "b", "()Z", "isRemote", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String[] tables;

        public b(String[] strArr) {
            this.tables = strArr;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String[] getTables() {
            return this.tables;
        }

        public boolean b() {
            return false;
        }

        public abstract void c(Set<String> tables);
    }

    /* JADX INFO: renamed from: androidx.room.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class C0283c extends q implements l<Set<? extends Integer>, i0> {
        C0283c(Object obj) {
            super(1, obj, c.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0);
        }

        public final void E(Set<Integer> set) {
            ((c) this.f66391b).p(set);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Set<? extends Integer> set) {
            E(set);
            return i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f13462e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f13462e;
            if (i15 == 0) {
                oq.u.b(obj);
                l0 l0Var = c.this.implementation;
                this.f13462e = 1;
                if (l0Var.x(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return c.this.new d(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class e extends q implements er.a<i0> {
        e(Object obj) {
            super(0, obj, c.class, "onAutoCloseCallback", "onAutoCloseCallback()V", 0);
        }

        public final void E() {
            ((c) this.f66391b).r();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class f extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f13464e;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f13464e;
            if (i15 == 0) {
                oq.u.b(obj);
                c cVar = c.this;
                this.f13464e = 1;
                if (cVar.A(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return c.this.new f(eVar);
        }
    }

    public c(u uVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.database = uVar;
        this.shadowTablesMap = map;
        this.viewTables = map2;
        this.tableNames = strArr;
        l0 l0Var = new l0(uVar, map, map2, strArr, uVar.getUseTempTrackingTable(), new C0283c(this));
        this.implementation = l0Var;
        this.observerMap = new LinkedHashMap();
        this.observerMapLock = new ReentrantLock();
        this.onRefreshScheduled = new er.a() { // from class: oa.h
            @Override // er.a
            public final Object a() {
                return androidx.room.c.t(this.f143650a);
            }
        };
        this.onRefreshCompleted = new er.a() { // from class: oa.i
            @Override // er.a
            public final Object a() {
                return androidx.room.c.s(this.f143651a);
            }
        };
        this.invalidationLiveDataContainer = new g(uVar);
        this.trackerLock = new Object();
        l0Var.u(new er.a() { // from class: oa.j
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(androidx.room.c.d(this.f143652a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(c cVar) {
        return !cVar.database.H() || cVar.database.O();
    }

    private final boolean h(b observer) {
        r<String[], int[]> rVarY = this.implementation.y(observer.getTables());
        String[] strArrA = rVarY.a();
        int[] iArrB = rVarY.b();
        androidx.room.e eVar = new androidx.room.e(observer, iArrB, strArrA);
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            androidx.room.e eVarPut = this.observerMap.containsKey(observer) ? (androidx.room.e) v0.j(this.observerMap, observer) : this.observerMap.put(observer, eVar);
            reentrantLock.unlock();
            return eVarPut == null && this.implementation.p(iArrB);
        } catch (Throwable th4) {
            reentrantLock.unlock();
            throw th4;
        }
    }

    private final List<b> k() {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            return v.f1(this.observerMap.keySet());
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Set<Integer> tableIds) {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            List listF1 = v.f1(this.observerMap.values());
            reentrantLock.unlock();
            Iterator it = listF1.iterator();
            while (it.hasNext()) {
                ((androidx.room.e) it.next()).c(tableIds);
            }
        } catch (Throwable th4) {
            reentrantLock.unlock();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        synchronized (this.trackerLock) {
            try {
                androidx.room.d dVar = this.multiInstanceInvalidationClient;
                if (dVar != null) {
                    List<b> listK = k();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listK) {
                        if (!((b) obj).b()) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        dVar.l();
                    }
                }
                this.implementation.s();
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(c cVar) {
        sa.b bVar = cVar.autoCloser;
        if (bVar != null) {
            bVar.g();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(c cVar) {
        sa.b bVar = cVar.autoCloser;
        if (bVar != null) {
            bVar.j();
        }
        return i0.f148189a;
    }

    private final boolean x(b observer) {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            androidx.room.e eVarRemove = this.observerMap.remove(observer);
            reentrantLock.unlock();
            return eVarRemove != null && this.implementation.q(eVarRemove.getTableIds());
        } catch (Throwable th4) {
            reentrantLock.unlock();
            throw th4;
        }
    }

    public final Object A(tq.e<? super i0> eVar) throws Throwable {
        Object objX = this.implementation.x(eVar);
        return objX == uq.b.e() ? objX : i0.f148189a;
    }

    public final void B() {
        qa.r.a(new f(null));
    }

    public final void i(b observer) {
        if (!observer.b()) {
            throw new IllegalStateException("isRemote was false of observer argument");
        }
        h(observer);
    }

    public final mu.g<Set<String>> j(String[] tables, boolean emitInitialState) {
        r<String[], int[]> rVarY = this.implementation.y(tables);
        String[] strArrA = rVarY.a();
        mu.g<Set<String>> gVarM = this.implementation.m(strArrA, rVarY.b(), emitInitialState);
        androidx.room.d dVar = this.multiInstanceInvalidationClient;
        mu.g<Set<String>> gVarH = dVar != null ? dVar.h(strArrA) : null;
        return gVarH != null ? i.Q(gVarM, gVarH) : gVarM;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final u getDatabase() {
        return this.database;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String[] getTableNames() {
        return this.tableNames;
    }

    public final void n(Context context, String name, Intent serviceIntent) {
        this.multiInstanceInvalidationIntent = serviceIntent;
        this.multiInstanceInvalidationClient = new androidx.room.d(context, name, this);
    }

    public final void o(ya.b connection) {
        this.implementation.l(connection);
        synchronized (this.trackerLock) {
            try {
                androidx.room.d dVar = this.multiInstanceInvalidationClient;
                if (dVar != null) {
                    Intent intent = this.multiInstanceInvalidationIntent;
                    if (intent == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    dVar.k(intent);
                    i0 i0Var = i0.f148189a;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void q(Set<String> tables) {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            List<androidx.room.e> listF1 = v.f1(this.observerMap.values());
            reentrantLock.unlock();
            for (androidx.room.e eVar : listF1) {
                if (!eVar.getObserver().b()) {
                    eVar.d(tables);
                }
            }
        } catch (Throwable th4) {
            reentrantLock.unlock();
            throw th4;
        }
    }

    public final void u() {
        this.implementation.r(this.onRefreshScheduled, this.onRefreshCompleted);
    }

    public void v() {
        this.implementation.r(this.onRefreshScheduled, this.onRefreshCompleted);
    }

    public void w(b observer) {
        if (x(observer)) {
            qa.r.a(new d(null));
        }
    }

    public final void y(sa.b autoCloser) {
        this.autoCloser = autoCloser;
        autoCloser.n(new e(this));
    }

    public final void z() {
        androidx.room.d dVar = this.multiInstanceInvalidationClient;
        if (dVar != null) {
            dVar.l();
        }
    }
}
