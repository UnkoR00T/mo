package a8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
final class l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f4551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w7.e<c> f4552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AudioManager f4553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f4554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f4555f;

    public interface b {
        void G(int i15, boolean z15);

        void b(int i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f4558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f4559d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f4560e;

        public c(int i15, int i16, boolean z15, int i17, int i18) {
            this.f4556a = i15;
            this.f4557b = i16;
            this.f4558c = z15;
            this.f4559d = i17;
            this.f4560e = i18;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class d extends BroadcastReceiver {
        private d() {
        }

        public static /* synthetic */ void a(d dVar) {
            if (l3.this.f4554e == null) {
                return;
            }
            l3.this.f4552c.g(l3.this.h(((c) l3.this.f4552c.d()).f4556a));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            l3.this.f4552c.e(new Runnable() { // from class: a8.m3
                @Override // java.lang.Runnable
                public final void run() {
                    l3.d.a(this.f4569a);
                }
            });
        }
    }

    public l3(Context context, b bVar, final int i15, Looper looper, Looper looper2, w7.h hVar) {
        this.f4550a = context.getApplicationContext();
        this.f4551b = bVar;
        w7.e<c> eVar = new w7.e<>(new c(i15, 0, false, 0, 0), looper, looper2, hVar, new w7.e.a() { // from class: a8.h3
            @Override // w7.e.a
            public final void a(Object obj, Object obj2) {
                this.f4497a.k((l3.c) obj, (l3.c) obj2);
            }
        });
        this.f4552c = eVar;
        eVar.e(new Runnable() { // from class: a8.i3
            @Override // java.lang.Runnable
            public final void run() {
                l3.d(this.f4506a, i15);
            }
        });
    }

    public static /* synthetic */ c a(c cVar) {
        return cVar;
    }

    public static /* synthetic */ c b(l3 l3Var, c cVar) {
        d dVar = l3Var.f4554e;
        if (dVar != null) {
            try {
                l3Var.f4550a.unregisterReceiver(dVar);
            } catch (RuntimeException e15) {
                w7.t.i("StreamVolumeManager", "Error unregistering stream volume receiver", e15);
            }
            l3Var.f4554e = null;
        }
        return cVar;
    }

    public static /* synthetic */ void d(l3 l3Var, int i15) {
        l3Var.f4553d = (AudioManager) zj.p.q((AudioManager) l3Var.f4550a.getSystemService("audio"));
        d dVar = new d();
        try {
            l3Var.f4550a.registerReceiver(dVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            l3Var.f4554e = dVar;
        } catch (RuntimeException e15) {
            w7.t.i("StreamVolumeManager", "Error registering stream volume receiver", e15);
        }
        l3Var.f4552c.g(l3Var.h(i15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c h(int i15) {
        zj.p.q(this.f4553d);
        return new c(i15, u7.j.f(this.f4553d, i15), u7.j.g(this.f4553d, i15), u7.j.e(this.f4553d, i15), u7.j.d(this.f4553d, i15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(c cVar, c cVar2) {
        boolean z15 = cVar.f4558c;
        if (!z15 && cVar2.f4558c) {
            this.f4555f = cVar.f4557b;
        }
        int i15 = cVar.f4557b;
        int i16 = cVar2.f4557b;
        if (i15 != i16 || z15 != cVar2.f4558c) {
            this.f4551b.G(i16, cVar2.f4558c);
        }
        int i17 = cVar.f4556a;
        int i18 = cVar2.f4556a;
        if (i17 == i18 && cVar.f4559d == cVar2.f4559d && cVar.f4560e == cVar2.f4560e) {
            return;
        }
        this.f4551b.b(i18);
    }

    public int i() {
        return this.f4552c.d().f4560e;
    }

    public int j() {
        return this.f4552c.d().f4559d;
    }

    public void l() {
        this.f4552c.h(new zj.g() { // from class: a8.j3
            @Override // zj.g
            public final Object apply(Object obj) {
                return l3.a((l3.c) obj);
            }
        }, new zj.g() { // from class: a8.k3
            @Override // zj.g
            public final Object apply(Object obj) {
                return l3.b(this.f4543a, (l3.c) obj);
            }
        });
    }
}
