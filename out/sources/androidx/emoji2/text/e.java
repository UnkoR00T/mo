package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Object f12243o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Object f12244p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static volatile e f12245q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<f> f12247b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f12250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final h f12251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f12252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f12253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f12254i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int[] f12255j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f12256k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f12257l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f12258m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC0261e f12259n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f12246a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f12248c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f12249d = new Handler(Looper.getMainLooper());

    private static final class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile androidx.emoji2.text.h f12260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile m f12261c;

        /* JADX INFO: renamed from: androidx.emoji2.text.e$a$a, reason: collision with other inner class name */
        class C0260a extends i {
            C0260a() {
            }

            @Override // androidx.emoji2.text.e.i
            public void a(Throwable th4) {
                a.this.f12263a.p(th4);
            }

            @Override // androidx.emoji2.text.e.i
            public void b(m mVar) {
                a.this.f(mVar);
            }
        }

        a(e eVar) {
            super(eVar);
        }

        @Override // androidx.emoji2.text.e.b
        int a(CharSequence charSequence, int i15) {
            return this.f12260b.b(charSequence, i15);
        }

        @Override // androidx.emoji2.text.e.b
        int b(CharSequence charSequence, int i15) {
            return this.f12260b.c(charSequence, i15);
        }

        @Override // androidx.emoji2.text.e.b
        void c() {
            try {
                this.f12263a.f12251f.a(new C0260a());
            } catch (Throwable th4) {
                this.f12263a.p(th4);
            }
        }

        @Override // androidx.emoji2.text.e.b
        CharSequence d(CharSequence charSequence, int i15, int i16, int i17, boolean z15) {
            return this.f12260b.j(charSequence, i15, i16, i17, z15);
        }

        @Override // androidx.emoji2.text.e.b
        void e(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f12261c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f12263a.f12253h);
        }

        void f(m mVar) {
            if (mVar == null) {
                this.f12263a.p(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f12261c = mVar;
            m mVar2 = this.f12261c;
            j jVar = this.f12263a.f12252g;
            InterfaceC0261e interfaceC0261e = this.f12263a.f12259n;
            e eVar = this.f12263a;
            this.f12260b = new androidx.emoji2.text.h(mVar2, jVar, interfaceC0261e, eVar.f12254i, eVar.f12255j, androidx.emoji2.text.g.a());
            this.f12263a.q();
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final e f12263a;

        b(e eVar) {
            this.f12263a = eVar;
        }

        int a(CharSequence charSequence, int i15) {
            throw null;
        }

        int b(CharSequence charSequence, int i15) {
            throw null;
        }

        void c() {
            throw null;
        }

        CharSequence d(CharSequence charSequence, int i15, int i16, int i17, boolean z15) {
            throw null;
        }

        void e(EditorInfo editorInfo) {
            throw null;
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final h f12264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        j f12265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f12266c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f12267d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int[] f12268e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Set<f> f12269f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f12270g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f12271h = -16711936;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f12272i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        InterfaceC0261e f12273j = new androidx.emoji2.text.d();

        protected c(h hVar) {
            i6.i.h(hVar, "metadataLoader cannot be null.");
            this.f12264a = hVar;
        }

        protected final h a() {
            return this.f12264a;
        }

        public c b(int i15) {
            this.f12272i = i15;
            return this;
        }
    }

    public static class d implements j {
        @Override // androidx.emoji2.text.e.j
        public androidx.emoji2.text.i a(o oVar) {
            return new p(oVar);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.e$e, reason: collision with other inner class name */
    public interface InterfaceC0261e {
        boolean a(CharSequence charSequence, int i15, int i16, int i17);
    }

    public static abstract class f {
        public void a(Throwable th4) {
        }

        public void b() {
        }
    }

    private static class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<f> f12274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Throwable f12275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f12276c;

        g(f fVar, int i15) {
            this(Arrays.asList((f) i6.i.h(fVar, "initCallback cannot be null")), i15, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f12274a.size();
            int i15 = 0;
            if (this.f12276c != 1) {
                while (i15 < size) {
                    this.f12274a.get(i15).a(this.f12275b);
                    i15++;
                }
            } else {
                while (i15 < size) {
                    this.f12274a.get(i15).b();
                    i15++;
                }
            }
        }

        g(Collection<f> collection, int i15) {
            this(collection, i15, null);
        }

        g(Collection<f> collection, int i15, Throwable th4) {
            i6.i.h(collection, "initCallbacks cannot be null");
            this.f12274a = new ArrayList(collection);
            this.f12276c = i15;
            this.f12275b = th4;
        }
    }

    public interface h {
        void a(i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th4);

        public abstract void b(m mVar);
    }

    public interface j {
        androidx.emoji2.text.i a(o oVar);
    }

    private e(c cVar) {
        this.f12253h = cVar.f12266c;
        this.f12254i = cVar.f12267d;
        this.f12255j = cVar.f12268e;
        this.f12256k = cVar.f12270g;
        this.f12257l = cVar.f12271h;
        this.f12251f = cVar.f12264a;
        this.f12258m = cVar.f12272i;
        this.f12259n = cVar.f12273j;
        r0.b bVar = new r0.b();
        this.f12247b = bVar;
        j jVar = cVar.f12265b;
        this.f12252g = jVar == null ? new d() : jVar;
        Set<f> set = cVar.f12269f;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f12269f);
        }
        this.f12250e = new a(this);
        o();
    }

    public static e c() {
        e eVar;
        synchronized (f12243o) {
            eVar = f12245q;
            i6.i.j(eVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    public static boolean h(InputConnection inputConnection, Editable editable, int i15, int i16, boolean z15) {
        return androidx.emoji2.text.h.d(inputConnection, editable, i15, i16, z15);
    }

    public static boolean i(Editable editable, int i15, KeyEvent keyEvent) {
        return androidx.emoji2.text.h.e(editable, i15, keyEvent);
    }

    public static e j(c cVar) {
        e eVar;
        e eVar2 = f12245q;
        if (eVar2 != null) {
            return eVar2;
        }
        synchronized (f12243o) {
            try {
                eVar = f12245q;
                if (eVar == null) {
                    eVar = new e(cVar);
                    f12245q = eVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return eVar;
    }

    public static boolean k() {
        return f12245q != null;
    }

    private boolean m() {
        return g() == 1;
    }

    private void o() {
        this.f12246a.writeLock().lock();
        try {
            if (this.f12258m == 0) {
                this.f12248c = 0;
            }
            this.f12246a.writeLock().unlock();
            if (g() == 0) {
                this.f12250e.c();
            }
        } catch (Throwable th4) {
            this.f12246a.writeLock().unlock();
            throw th4;
        }
    }

    public int d(CharSequence charSequence, int i15) {
        i6.i.j(m(), "Not initialized yet");
        i6.i.h(charSequence, "charSequence cannot be null");
        return this.f12250e.a(charSequence, i15);
    }

    public int e() {
        return this.f12257l;
    }

    public int f(CharSequence charSequence, int i15) {
        i6.i.j(m(), "Not initialized yet");
        i6.i.h(charSequence, "charSequence cannot be null");
        return this.f12250e.b(charSequence, i15);
    }

    public int g() {
        this.f12246a.readLock().lock();
        try {
            return this.f12248c;
        } finally {
            this.f12246a.readLock().unlock();
        }
    }

    public boolean l() {
        return this.f12256k;
    }

    public void n() {
        i6.i.j(this.f12258m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m()) {
            return;
        }
        this.f12246a.writeLock().lock();
        try {
            if (this.f12248c == 0) {
                this.f12246a.writeLock().unlock();
                return;
            }
            this.f12248c = 0;
            this.f12246a.writeLock().unlock();
            this.f12250e.c();
        } catch (Throwable th4) {
            this.f12246a.writeLock().unlock();
            throw th4;
        }
    }

    void p(Throwable th4) {
        ArrayList arrayList = new ArrayList();
        this.f12246a.writeLock().lock();
        try {
            this.f12248c = 2;
            arrayList.addAll(this.f12247b);
            this.f12247b.clear();
            this.f12246a.writeLock().unlock();
            this.f12249d.post(new g(arrayList, this.f12248c, th4));
        } catch (Throwable th5) {
            this.f12246a.writeLock().unlock();
            throw th5;
        }
    }

    void q() {
        ArrayList arrayList = new ArrayList();
        this.f12246a.writeLock().lock();
        try {
            this.f12248c = 1;
            arrayList.addAll(this.f12247b);
            this.f12247b.clear();
            this.f12246a.writeLock().unlock();
            this.f12249d.post(new g(arrayList, this.f12248c));
        } catch (Throwable th4) {
            this.f12246a.writeLock().unlock();
            throw th4;
        }
    }

    public CharSequence r(CharSequence charSequence) {
        return s(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence s(CharSequence charSequence, int i15, int i16) {
        return t(charSequence, i15, i16, Integer.MAX_VALUE);
    }

    public CharSequence t(CharSequence charSequence, int i15, int i16, int i17) {
        return u(charSequence, i15, i16, i17, 0);
    }

    public CharSequence u(CharSequence charSequence, int i15, int i16, int i17, int i18) {
        boolean z15;
        i6.i.j(m(), "Not initialized yet");
        i6.i.e(i15, "start cannot be negative");
        i6.i.e(i16, "end cannot be negative");
        i6.i.e(i17, "maxEmojiCount cannot be negative");
        i6.i.b(i15 <= i16, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        i6.i.b(i15 <= charSequence.length(), "start should be < than charSequence length");
        i6.i.b(i16 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i15 == i16) {
            return charSequence;
        }
        if (i18 != 1) {
            z15 = i18 != 2 ? this.f12253h : false;
        } else {
            z15 = true;
        }
        return this.f12250e.d(charSequence, i15, i16, i17, z15);
    }

    public void v(f fVar) {
        i6.i.h(fVar, "initCallback cannot be null");
        this.f12246a.writeLock().lock();
        try {
            if (this.f12248c == 1 || this.f12248c == 2) {
                this.f12249d.post(new g(fVar, this.f12248c));
            } else {
                this.f12247b.add(fVar);
            }
        } finally {
            this.f12246a.writeLock().unlock();
        }
    }

    public void w(f fVar) {
        i6.i.h(fVar, "initCallback cannot be null");
        this.f12246a.writeLock().lock();
        try {
            this.f12247b.remove(fVar);
        } finally {
            this.f12246a.writeLock().unlock();
        }
    }

    public void x(EditorInfo editorInfo) {
        if (!m() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f12250e.e(editorInfo);
    }
}
