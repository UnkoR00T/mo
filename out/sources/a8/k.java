package a8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class k implements n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n3 f4527a;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b implements n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AudioManager f4528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AudioDeviceCallback f4529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private w7.e<Boolean> f4530c;

        class a extends AudioDeviceCallback {
            a() {
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                b.this.f4530c.g(Boolean.valueOf(b.this.i()));
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                b.this.f4530c.g(Boolean.valueOf(b.this.i()));
            }
        }

        private b() {
        }

        public static /* synthetic */ void e(b bVar, Context context) {
            AudioManager audioManager;
            zj.p.q(bVar.f4530c);
            if (w7.o0.E0(context) && (audioManager = (AudioManager) context.getSystemService("audio")) != null) {
                bVar.f4528a = audioManager;
                a aVar = bVar.new a();
                bVar.f4529b = aVar;
                audioManager.registerAudioDeviceCallback(aVar, new Handler((Looper) zj.p.q(Looper.myLooper())));
                bVar.f4530c.g(Boolean.valueOf(bVar.i()));
            }
        }

        public static /* synthetic */ void f(b bVar) {
            AudioManager audioManager = bVar.f4528a;
            if (audioManager != null) {
                audioManager.unregisterAudioDeviceCallback((AudioDeviceCallback) zj.p.q(bVar.f4529b));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean i() {
            for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) zj.p.q(this.f4528a)).getDevices(2)) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i15 = Build.VERSION.SDK_INT;
                if (audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i15 >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i15 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i15 >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }

        @Override // a8.n3
        public void a(final n3.a aVar, final Context context, Looper looper, Looper looper2, w7.h hVar) {
            w7.e<Boolean> eVar = new w7.e<>(Boolean.TRUE, looper2, looper, hVar, new w7.e.a() { // from class: a8.m
                @Override // w7.e.a
                public final void a(Object obj, Object obj2) {
                    aVar.a(((Boolean) obj2).booleanValue());
                }
            });
            this.f4530c = eVar;
            eVar.e(new Runnable() { // from class: a8.n
                @Override // java.lang.Runnable
                public final void run() {
                    k.b.e(this.f4570a, context);
                }
            });
        }

        @Override // a8.n3
        public boolean b() {
            w7.e<Boolean> eVar = this.f4530c;
            if (eVar == null) {
                return true;
            }
            return eVar.d().booleanValue();
        }

        @Override // a8.n3
        public void c() {
            ((w7.e) zj.p.q(this.f4530c)).e(new Runnable() { // from class: a8.l
                @Override // java.lang.Runnable
                public final void run() {
                    k.b.f(this.f4544a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c implements n3 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final RouteDiscoveryPreference f4532e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MediaRouter2 f4533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MediaRouter2$RouteCallback f4534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private MediaRouter2$ControllerCallback f4535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private w7.e<Boolean> f4536d;

        class a extends MediaRouter2$RouteCallback {
            a() {
            }
        }

        class b extends MediaRouter2$ControllerCallback {
            b() {
            }

            public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
                c.this.f4536d.g(Boolean.valueOf(c.k(c.this.f4533a)));
            }
        }

        static {
            p.a();
            f4532e = o.a(ak.n0.C(), false).build();
        }

        private c() {
        }

        public static /* synthetic */ void d(c cVar) {
            ((MediaRouter2) zj.p.q(cVar.f4533a)).unregisterControllerCallback((MediaRouter2$ControllerCallback) zj.p.q(cVar.f4535c));
            cVar.f4535c = null;
            cVar.f4533a.unregisterRouteCallback((MediaRouter2$RouteCallback) zj.p.q(cVar.f4534b));
        }

        public static /* synthetic */ void f(c cVar, Context context) {
            zj.p.q(cVar.f4536d);
            cVar.f4533a = MediaRouter2.getInstance(context);
            cVar.f4534b = cVar.new a();
            final w7.e<Boolean> eVar = cVar.f4536d;
            Objects.requireNonNull(eVar);
            Executor executor = new Executor() { // from class: a8.v
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    eVar.e(runnable);
                }
            };
            cVar.f4533a.registerRouteCallback(executor, cVar.f4534b, f4532e);
            b bVar = cVar.new b();
            cVar.f4535c = bVar;
            cVar.f4533a.registerControllerCallback(executor, bVar);
            cVar.f4536d.g(Boolean.valueOf(k(cVar.f4533a)));
        }

        private static boolean j(MediaRoute2Info mediaRoute2Info, int i15, boolean z15) {
            int suitabilityStatus = mediaRoute2Info.getSuitabilityStatus();
            if (suitabilityStatus == 1) {
                return (i15 == 1 || i15 == 2) && z15;
            }
            return suitabilityStatus == 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean k(MediaRouter2 mediaRouter2) {
            int transferReason = q.a(zj.p.q(mediaRouter2)).getSystemController().getRoutingSessionInfo().getTransferReason();
            boolean zWasTransferInitiatedBySelf = mediaRouter2.getSystemController().wasTransferInitiatedBySelf();
            Iterator<MediaRoute2Info> it = mediaRouter2.getSystemController().getSelectedRoutes().iterator();
            while (it.hasNext()) {
                if (j(r.a(it.next()), transferReason, zWasTransferInitiatedBySelf)) {
                    return true;
                }
            }
            return false;
        }

        @Override // a8.n3
        @SuppressLint({"ThreadSafe"})
        public void a(final n3.a aVar, final Context context, Looper looper, Looper looper2, w7.h hVar) {
            w7.e<Boolean> eVar = new w7.e<>(Boolean.TRUE, looper2, looper, hVar, new w7.e.a() { // from class: a8.t
                @Override // w7.e.a
                public final void a(Object obj, Object obj2) {
                    aVar.a(((Boolean) obj2).booleanValue());
                }
            });
            this.f4536d = eVar;
            eVar.e(new Runnable() { // from class: a8.u
                @Override // java.lang.Runnable
                public final void run() {
                    k.c.f(this.f4617a, context);
                }
            });
        }

        @Override // a8.n3
        public boolean b() {
            w7.e<Boolean> eVar = this.f4536d;
            if (eVar == null) {
                return true;
            }
            return eVar.d().booleanValue();
        }

        @Override // a8.n3
        public void c() {
            ((w7.e) zj.p.q(this.f4536d)).e(new Runnable() { // from class: a8.s
                @Override // java.lang.Runnable
                public final void run() {
                    k.c.d(this.f4604a);
                }
            });
        }
    }

    public k() {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f4527a = new c();
        } else {
            this.f4527a = new b();
        }
    }

    @Override // a8.n3
    public void a(n3.a aVar, Context context, Looper looper, Looper looper2, w7.h hVar) {
        this.f4527a.a(aVar, context, looper, looper2, hVar);
    }

    @Override // a8.n3
    public boolean b() {
        return this.f4527a.b();
    }

    @Override // a8.n3
    public void c() {
        this.f4527a.c();
    }
}
