package h;

import android.view.Surface;
import io.sentry.android.core.c2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0003\u0012\u0007\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u001b\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00062\n\u0010\u0011\u001a\u00060\u0010R\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001c¨\u0006\u001e"}, d2 = {"Lh/e0;", "", "<init>", "()V", "Lh/e0$b;", "listener", "Loq/i0;", "b", "(Lh/e0$b;)V", "e", "Landroid/view/Surface;", "surface", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "d", "(Landroid/view/Surface;)Ljava/lang/AutoCloseable;", "Lh/e0$c;", "surfaceToken", "c", "(Lh/e0$c;)V", "a", "Ljava/lang/Object;", "lock", "", "", "Ljava/util/Map;", "useCountMap", "", "Ljava/util/Set;", "listeners", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final iu.c f78857e = iu.b.c(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<Surface, Integer> useCountMap = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Set<b> listeners = new LinkedHashSet();

    /* JADX INFO: renamed from: h.e0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lh/e0$a;", "", "<init>", "()V", "Liu/c;", "surfaceTokenDebugIds", "Liu/c;", "a", "()Liu/c;", "", "DEBUG", "Z", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final iu.c a() {
            return e0.f78857e;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lh/e0$b;", "", "Landroid/view/Surface;", "surface", "Loq/i0;", "a", "(Landroid/view/Surface;)V", "b", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        void a(Surface surface);

        void b(Surface surface);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lh/e0$c;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Landroid/view/Surface;", "surface", "<init>", "(Lh/e0;Landroid/view/Surface;)V", "Loq/i0;", "close", "()V", "", "toString", "()Ljava/lang/String;", "a", "Landroid/view/Surface;", "b", "()Landroid/view/Surface;", "", "I", "debugId", "Liu/a;", "c", "Liu/a;", "closed", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class c implements AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Surface surface;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int debugId = e0.INSTANCE.a().d();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final iu.a closed = iu.b.a(false);

        public c(Surface surface) {
            this.surface = surface;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Surface getSurface() {
            return this.surface;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            if (this.closed.a(false, true)) {
                e0.this.c(this);
            }
        }

        public String toString() {
            return "SurfaceToken-" + this.debugId;
        }
    }

    public final void b(b listener) {
        Set setKeySet;
        synchronized (this.lock) {
            try {
                this.listeners.add(listener);
                Map<Surface, Integer> map = this.useCountMap;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<Surface, Integer> entry : map.entrySet()) {
                    if (entry.getValue().intValue() > 0) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                setKeySet = linkedHashMap.keySet();
            } catch (Throwable th4) {
                throw th4;
            }
        }
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            listener.a((Surface) it.next());
        }
    }

    public final void c(c surfaceToken) {
        Surface surface;
        List listF1;
        synchronized (this.lock) {
            try {
                surface = surfaceToken.getSurface();
                Integer num = this.useCountMap.get(surface);
                if (num == null) {
                    throw new IllegalStateException(("Surface " + surface + " (" + surfaceToken + ") has no use count").toString());
                }
                int iIntValue = num.intValue() - 1;
                this.useCountMap.put(surface, Integer.valueOf(iIntValue));
                if (iIntValue == 0) {
                    listF1 = pq.v.f1(this.listeners);
                    this.useCountMap.remove(surface);
                } else {
                    listF1 = null;
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (listF1 != null) {
            Iterator it = listF1.iterator();
            while (it.hasNext()) {
                ((b) it.next()).b(surface);
            }
        }
    }

    public final AutoCloseable d(Surface surface) {
        c cVar;
        List listF1;
        if (!surface.isValid() && k.k.f107055a.d()) {
            c2.g("CXCP", "registerSurface: Surface " + surface + " isn't valid!");
        }
        synchronized (this.lock) {
            try {
                cVar = new c(surface);
                Integer num = this.useCountMap.get(surface);
                int iIntValue = (num != null ? num.intValue() : 0) + 1;
                this.useCountMap.put(surface, Integer.valueOf(iIntValue));
                listF1 = iIntValue == 1 ? pq.v.f1(this.listeners) : null;
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (listF1 != null) {
            Iterator it = listF1.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(surface);
            }
        }
        return cVar;
    }

    public final void e(b listener) {
        synchronized (this.lock) {
            this.listeners.remove(listener);
        }
    }
}
