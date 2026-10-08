package c8;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f24164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f24165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f24166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BroadcastReceiver f24167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f24168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private l8.c f24169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c8.b f24170h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AudioDeviceInfo f24171i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private t7.b f24172j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f24173k;

    private final class b extends AudioDeviceCallback {
        private b() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            d.this.o();
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (w7.o0.r(audioDeviceInfoArr, d.this.f24171i)) {
                d.this.f24171i = null;
            }
            d.this.o();
        }
    }

    private final class c extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f24175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f24176b;

        public c(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f24175a = contentResolver;
            this.f24176b = uri;
        }

        public void a() {
            this.f24175a.registerContentObserver(this.f24176b, false, this);
        }

        public void b() {
            this.f24175a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z15) {
            d.this.o();
        }
    }

    /* JADX INFO: renamed from: c8.d$d, reason: collision with other inner class name */
    private final class C0646d extends BroadcastReceiver {
        private C0646d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            List listH = d.this.h();
            d dVar = d.this;
            dVar.i(c8.b.e(context, intent, dVar.f24172j, d.this.f24171i, listH));
        }
    }

    public interface e {
        void a(c8.b bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(Context context, e eVar, t7.b bVar, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.f24163a = applicationContext;
        this.f24164b = (e) zj.p.q(eVar);
        this.f24172j = bVar;
        this.f24171i = audioDeviceInfo;
        Handler handlerB = w7.o0.B();
        this.f24165c = handlerB;
        this.f24166d = new b();
        this.f24167e = new C0646d();
        Uri uriI = c8.b.i();
        this.f24168f = uriI != null ? new c(handlerB, applicationContext.getContentResolver(), uriI) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Integer> h() {
        l8.c cVar;
        return (Build.VERSION.SDK_INT < 32 || (cVar = this.f24169g) == null) ? ak.n0.C() : cVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(c8.b bVar) {
        if (!this.f24173k || bVar.equals(this.f24170h)) {
            return;
        }
        this.f24170h = bVar;
        this.f24164b.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        i(c8.b.f(this.f24163a, this.f24172j, this.f24171i, h()));
    }

    public void j(c8.b bVar) {
        i(bVar);
    }

    public c8.b k() {
        if (this.f24173k) {
            return (c8.b) zj.p.q(this.f24170h);
        }
        this.f24173k = true;
        c cVar = this.f24168f;
        if (cVar != null) {
            cVar.a();
        }
        u7.j.c(this.f24163a).registerAudioDeviceCallback(this.f24166d, this.f24165c);
        if (Build.VERSION.SDK_INT >= 32 && this.f24169g == null) {
            this.f24169g = new l8.c(this.f24163a, new Runnable() { // from class: c8.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24162a.o();
                }
            }, Boolean.valueOf(w7.o0.D0(this.f24163a)));
        }
        c8.b bVarE = c8.b.e(this.f24163a, this.f24163a.registerReceiver(this.f24167e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f24165c), this.f24172j, this.f24171i, h());
        this.f24170h = bVarE;
        return bVarE;
    }

    public void l(t7.b bVar) {
        if (Objects.equals(bVar, this.f24172j)) {
            return;
        }
        this.f24172j = bVar;
        i(c8.b.f(this.f24163a, bVar, this.f24171i, h()));
    }

    public void m(AudioDeviceInfo audioDeviceInfo) {
        if (Objects.equals(audioDeviceInfo, this.f24171i)) {
            return;
        }
        this.f24171i = audioDeviceInfo;
        i(c8.b.f(this.f24163a, this.f24172j, audioDeviceInfo, h()));
    }

    public void n() {
        l8.c cVar;
        if (this.f24173k) {
            this.f24170h = null;
            u7.j.c(this.f24163a).unregisterAudioDeviceCallback(this.f24166d);
            if (Build.VERSION.SDK_INT >= 32 && (cVar = this.f24169g) != null) {
                cVar.g();
                this.f24169g = null;
            }
            this.f24163a.unregisterReceiver(this.f24167e);
            c cVar2 = this.f24168f;
            if (cVar2 != null) {
                cVar2.b();
            }
            this.f24173k = false;
        }
    }
}
