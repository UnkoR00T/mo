package mz;

import android.content.Intent;
import androidx.p016lifecycle.DefaultLifecycleObserver;
import java.util.ArrayList;
import java.util.List;
import ju.p0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010%¨\u0006'"}, d2 = {"Lmz/n;", "Lmz/l;", "Lmz/m;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lpx/d;", "remoteLogger", "<init>", "(Lpx/d;)V", "LCON/p;", "activity", "Loq/i0;", "e", "(LCON/p;)V", "Landroidx/lifecycle/q;", "owner", "onDestroy", "(Landroidx/lifecycle/q;)V", "Landroid/content/Intent;", "intent", "b", "(Landroid/content/Intent;)V", "Lmz/k;", "handler", "", "c", "(Lmz/k;)Z", "a", "Lpx/d;", "", "Ljava/lang/Object;", "lock", "", "Ljava/util/List;", "intentHandlers", "d", "Landroidx/lifecycle/q;", "lifecycleOwner", "Landroid/content/Intent;", "lastUnhandledIntent", "intent_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n implements l, m, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<k> intentHandlers = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private androidx.p016lifecycle.q lifecycleOwner;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Intent lastUnhandledIntent;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f129642e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f129643f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f129644g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f129645h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f129646j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f129647k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f129648l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f129649m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f129650n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Intent f129652q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Intent intent, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f129652q = intent;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0050  */
        /* JADX WARN: Code duplicated, block: B:13:0x0077 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x0081  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0075 -> B:14:0x0078). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r10.f129650n
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L30
                if (r1 != r3) goto L28
                int r1 = r10.f129648l
                java.lang.Object r4 = r10.f129647k
                mz.k r4 = (mz.k) r4
                java.lang.Object r4 = r10.f129646j
                java.lang.Object r5 = r10.f129645h
                java.util.Iterator r5 = (java.util.Iterator) r5
                java.lang.Object r6 = r10.f129644g
                java.util.ArrayList r6 = (java.util.ArrayList) r6
                java.lang.Object r7 = r10.f129643f
                android.content.Intent r7 = (android.content.Intent) r7
                java.lang.Object r8 = r10.f129642e
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                oq.u.b(r11)
                goto L78
            L28:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L30:
                oq.u.b(r11)
                mz.n r11 = mz.n.this
                java.util.List r11 = mz.n.d(r11)
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                android.content.Intent r1 = r10.f129652q
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r5 = r11.iterator()
                r8 = r11
                r7 = r1
                r1 = r2
                r6 = r4
            L4a:
                boolean r11 = r5.hasNext()
                if (r11 == 0) goto L85
                java.lang.Object r4 = r5.next()
                r11 = r4
                mz.k r11 = (mz.k) r11
                java.lang.Object r9 = vq.j.a(r8)
                r10.f129642e = r9
                r10.f129643f = r7
                r10.f129644g = r6
                r10.f129645h = r5
                r10.f129646j = r4
                java.lang.Object r9 = vq.j.a(r11)
                r10.f129647k = r9
                r10.f129648l = r1
                r10.f129649m = r2
                r10.f129650n = r3
                java.lang.Object r11 = r11.a(r7, r10)
                if (r11 != r0) goto L78
                return r0
            L78:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto L81
                goto L85
            L81:
                r6.add(r4)
                goto L4a
            L85:
                oq.i0 r11 = oq.i0.f148189a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: mz.n.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return n.this.new a(this.f129652q, eVar);
        }
    }

    public n(px.d dVar) {
        this.remoteLogger = dVar;
    }

    @Override // mz.l
    public boolean a(k handler) {
        boolean z15;
        synchronized (this.lock) {
            if (this.intentHandlers.contains(handler)) {
                this.intentHandlers.remove(handler);
                z15 = true;
            } else {
                z15 = false;
            }
        }
        return z15;
    }

    @Override // mz.l
    public void b(Intent intent) {
        synchronized (this.lock) {
            try {
                px.f.f163100a.b("onNewIntent: " + intent, px.c.a(this));
                androidx.p016lifecycle.q qVar = this.lifecycleOwner;
                androidx.p016lifecycle.k kVarA = qVar != null ? androidx.p016lifecycle.r.a(qVar) : null;
                if (kVarA == null) {
                    this.remoteLogger.n7("Lifecycle scope unavailable, intent is temporarily unhandled.", px.c.a(this));
                    this.lastUnhandledIntent = intent;
                } else {
                    ju.k.d(kVarA, null, null, new a(intent, null), 3, null);
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // mz.l
    public boolean c(k handler) {
        boolean z15;
        synchronized (this.lock) {
            if (this.intentHandlers.contains(handler)) {
                z15 = false;
            } else {
                this.intentHandlers.add(handler);
                z15 = true;
            }
        }
        return z15;
    }

    @Override // oz.c
    public void e(CON.p activity) {
        androidx.p016lifecycle.j lifecycleRegistry;
        synchronized (this.lock) {
            try {
                this.intentHandlers.clear();
                androidx.p016lifecycle.q qVar = this.lifecycleOwner;
                if (qVar != null && (lifecycleRegistry = qVar.getLifecycleRegistry()) != null) {
                    lifecycleRegistry.d(this);
                }
                this.lifecycleOwner = activity;
                activity.getLifecycleRegistry().a(this);
                Intent intent = this.lastUnhandledIntent;
                if (intent != null) {
                    this.lastUnhandledIntent = null;
                    b(intent);
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // androidx.p016lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onCreate(androidx.p016lifecycle.q qVar) {
        super.onCreate(qVar);
    }

    @Override // androidx.p016lifecycle.DefaultLifecycleObserver
    public void onDestroy(androidx.p016lifecycle.q owner) {
        synchronized (this.lock) {
            this.intentHandlers.clear();
            i0 i0Var = i0.f148189a;
        }
    }

    @Override // androidx.p016lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(androidx.p016lifecycle.q qVar) {
        super.onPause(qVar);
    }

    @Override // androidx.p016lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(androidx.p016lifecycle.q qVar) {
        super.onResume(qVar);
    }

    @Override // androidx.p016lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStart(androidx.p016lifecycle.q qVar) {
        super.onStart(qVar);
    }

    @Override // androidx.p016lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(androidx.p016lifecycle.q qVar) {
        super.onStop(qVar);
    }
}
