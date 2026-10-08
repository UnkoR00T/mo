package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import er.p;
import fu.r;
import io.sentry.android.core.c2;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import ju.p0;
import mu.a0;
import mu.g;
import mu.h;
import mu.h0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.e1;
import vq.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u00017\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\fJ)\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00150\u00142\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0012¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\n  *\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0015048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010>¨\u0006@"}, d2 = {"Landroidx/room/d;", "", "Landroid/content/Context;", "context", "", "name", "Landroidx/room/c;", "invalidationTracker", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/room/c;)V", "Loq/i0;", "j", "()V", "Landroid/content/Intent;", "serviceIntent", "k", "(Landroid/content/Intent;)V", "l", "", "resolvedTableNames", "Lmu/g;", "", "h", "([Ljava/lang/String;)Lmu/g;", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "Landroidx/room/c;", "i", "()Landroidx/room/c;", "kotlin.jvm.PlatformType", "c", "Landroid/content/Context;", "appContext", "Lju/p0;", "d", "Lju/p0;", "coroutineScope", "Ljava/util/concurrent/atomic/AtomicBoolean;", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "stopped", "", "f", "I", "clientId", "Landroidx/room/b;", "g", "Landroidx/room/b;", "invalidationService", "Lmu/a0;", "Lmu/a0;", "invalidatedTables", "androidx/room/d$c", "Landroidx/room/d$c;", "observer", "Landroidx/room/a;", "Landroidx/room/a;", "invalidationCallback", "Landroid/content/ServiceConnection;", "Landroid/content/ServiceConnection;", "serviceConnection", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final androidx.room.c invalidationTracker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p0 coroutineScope;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int clientId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private androidx.room.b invalidationService;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final c observer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean stopped = new AtomicBoolean(true);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a0<Set<String>> invalidatedTables = h0.a(0, 0, lu.a.SUSPEND);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final androidx.room.a invalidationCallback = new b();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ServiceConnection serviceConnection = new ServiceConnectionC0286d();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements g<Set<? extends String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f13477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String[] f13478b;

        /* JADX INFO: renamed from: androidx.room.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Loq/i0;", "F", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        public static final class C0284a<T> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f13479a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String[] f13480b;

            /* JADX INFO: renamed from: androidx.room.d$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C0285a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f13481d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f13482e;

                public C0285a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f13481d = obj;
                    this.f13482e |= PKIFailureInfo.systemUnavail;
                    return C0284a.this.F(null, this);
                }
            }

            public C0284a(h hVar, String[] strArr) {
                this.f13479a = hVar;
                this.f13480b = strArr;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0285a c0285a;
                if (eVar instanceof C0285a) {
                    c0285a = (C0285a) eVar;
                    int i15 = c0285a.f13482e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0285a.f13482e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0285a = new C0285a(eVar);
                    }
                } else {
                    c0285a = new C0285a(eVar);
                }
                Object obj2 = c0285a.f13481d;
                Object objE = uq.b.e();
                int i16 = c0285a.f13482e;
                if (i16 == 0) {
                    u.b(obj2);
                    h hVar = this.f13479a;
                    Set set = (Set) obj;
                    Set setB = e1.b();
                    for (String str : this.f13480b) {
                        Iterator<T> it = set.iterator();
                        while (it.hasNext()) {
                            if (r.G(str, (String) it.next(), true)) {
                                setB.add(str);
                            }
                        }
                    }
                    Set setA = e1.a(setB);
                    if (setA.isEmpty()) {
                        setA = null;
                    }
                    if (setA != null) {
                        c0285a.f13482e = 1;
                        if (hVar.F(setA, c0285a) == objE) {
                            return objE;
                        }
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(g gVar, String[] strArr) {
            this.f13477a = gVar;
            this.f13478b = strArr;
        }

        @Override // mu.g
        public Object a(h<? super Set<? extends String>> hVar, tq.e eVar) {
            Object objA = this.f13477a.a(new C0284a(hVar, this.f13478b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/room/d$b", "Landroidx/room/a$a;", "", "", "tables", "Loq/i0;", "U", "([Ljava/lang/String;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends androidx.room.a.AbstractBinderC0280a {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends k implements p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f13485e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f13486f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String[] f13487g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ d f13488h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String[] strArr, d dVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f13487g = strArr;
                this.f13488h = dVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Set<String> set;
                Object objE = uq.b.e();
                int i15 = this.f13486f;
                if (i15 == 0) {
                    u.b(obj);
                    String[] strArr = this.f13487g;
                    Set<String> setI = e1.i(Arrays.copyOf(strArr, strArr.length));
                    a0 a0Var = this.f13488h.invalidatedTables;
                    this.f13485e = setI;
                    this.f13486f = 1;
                    if (a0Var.F(setI, this) == objE) {
                        return objE;
                    }
                    set = setI;
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    set = (Set) this.f13485e;
                    u.b(obj);
                }
                this.f13488h.getInvalidationTracker().q(set);
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f13487g, this.f13488h, eVar);
            }
        }

        b() {
        }

        @Override // androidx.room.a
        public void U(String[] tables) {
            ju.k.d(d.this.coroutineScope, null, null, new a(tables, d.this, null), 3, null);
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"androidx/room/d$c", "Landroidx/room/c$b;", "", "", "tables", "Loq/i0;", "c", "(Ljava/util/Set;)V", "", "b", "()Z", "isRemote", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends androidx.room.c.b {
        c(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.c.b
        public boolean b() {
            return true;
        }

        @Override // androidx.room.c.b
        public void c(Set<String> tables) {
            if (d.this.stopped.get()) {
                return;
            }
            try {
                androidx.room.b bVar = d.this.invalidationService;
                if (bVar != null) {
                    bVar.y1(d.this.clientId, (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException e15) {
                c2.h("ROOM", "Cannot broadcast invalidation", e15);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/room/d$d", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "service", "Loq/i0;", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ServiceConnectionC0286d implements ServiceConnection {
        ServiceConnectionC0286d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            d.this.invalidationService = androidx.room.b.a.l3(service);
            d.this.j();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            d.this.invalidationService = null;
        }
    }

    public d(Context context, String str, androidx.room.c cVar) {
        this.name = str;
        this.invalidationTracker = cVar;
        this.appContext = context.getApplicationContext();
        this.coroutineScope = cVar.getDatabase().t();
        this.observer = new c(cVar.getTableNames());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        try {
            androidx.room.b bVar = this.invalidationService;
            if (bVar != null) {
                this.clientId = bVar.b2(this.invalidationCallback, this.name);
            }
        } catch (RemoteException e15) {
            c2.h("ROOM", "Cannot register multi-instance invalidation callback", e15);
        }
    }

    public final g<Set<String>> h(String[] resolvedTableNames) {
        return new a(this.invalidatedTables, resolvedTableNames);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final androidx.room.c getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public final void k(Intent serviceIntent) {
        if (this.stopped.compareAndSet(true, false)) {
            this.appContext.bindService(serviceIntent, this.serviceConnection, 1);
            this.invalidationTracker.i(this.observer);
        }
    }

    public final void l() {
        if (this.stopped.compareAndSet(false, true)) {
            this.invalidationTracker.w(this.observer);
            try {
                androidx.room.b bVar = this.invalidationService;
                if (bVar != null) {
                    bVar.e3(this.invalidationCallback, this.clientId);
                }
            } catch (RemoteException e15) {
                c2.h("ROOM", "Cannot unregister multi-instance invalidation callback", e15);
            }
            this.appContext.unbindService(this.serviceConnection);
        }
    }
}
