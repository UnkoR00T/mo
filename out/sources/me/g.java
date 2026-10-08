package me;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.k;
import com.bumptech.glide.l;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yd.a f125920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f125921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<b> f125922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final l f125923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ce.d f125924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f125925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f125926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f125927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private k<Bitmap> f125928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f125929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f125930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f125931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Bitmap f125932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private zd.l<Bitmap> f125933n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f125934o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f125935p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f125936q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f125937r;

    static class a extends se.c<Bitmap> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Handler f125938d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f125939e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f125940f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bitmap f125941g;

        a(Handler handler, int i15, long j15) {
            this.f125938d = handler;
            this.f125939e = i15;
            this.f125940f = j15;
        }

        @Override // se.h
        public void d(Drawable drawable) {
            this.f125941g = null;
        }

        Bitmap k() {
            return this.f125941g;
        }

        @Override // se.h
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void h(Bitmap bitmap, te.b<? super Bitmap> bVar) {
            this.f125941g = bitmap;
            this.f125938d.sendMessageAtTime(this.f125938d.obtainMessage(1, this), this.f125940f);
        }
    }

    public interface b {
        void a();
    }

    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i15 = message.what;
            if (i15 == 1) {
                g.this.m((a) message.obj);
                return true;
            }
            if (i15 != 2) {
                return false;
            }
            g.this.f125923d.o((a) message.obj);
            return false;
        }
    }

    g(com.bumptech.glide.b bVar, yd.a aVar, int i15, int i16, zd.l<Bitmap> lVar, Bitmap bitmap) {
        this(bVar.f(), com.bumptech.glide.b.t(bVar.h()), aVar, null, i(com.bumptech.glide.b.t(bVar.h()), i15, i16), lVar, bitmap);
    }

    private static zd.f g() {
        return new ue.d(Double.valueOf(Math.random()));
    }

    private static k<Bitmap> i(l lVar, int i15, int i16) {
        return lVar.l().b(re.g.z0(be.j.f18723b).w0(true).q0(true).h0(i15, i16));
    }

    private void l() {
        if (!this.f125925f || this.f125926g) {
            return;
        }
        if (this.f125927h) {
            ve.k.a(this.f125934o == null, "Pending target must be null when starting from the first frame");
            this.f125920a.f();
            this.f125927h = false;
        }
        a aVar = this.f125934o;
        if (aVar != null) {
            this.f125934o = null;
            m(aVar);
            return;
        }
        this.f125926g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) this.f125920a.e());
        this.f125920a.a();
        this.f125931l = new a(this.f125921b, this.f125920a.g(), jUptimeMillis);
        this.f125928i.b(re.g.A0(g())).N0(this.f125920a).G0(this.f125931l);
    }

    private void n() {
        Bitmap bitmap = this.f125932m;
        if (bitmap != null) {
            this.f125924e.c(bitmap);
            this.f125932m = null;
        }
    }

    private void p() {
        if (this.f125925f) {
            return;
        }
        this.f125925f = true;
        this.f125930k = false;
        l();
    }

    private void q() {
        this.f125925f = false;
    }

    void a() {
        this.f125922c.clear();
        n();
        q();
        a aVar = this.f125929j;
        if (aVar != null) {
            this.f125923d.o(aVar);
            this.f125929j = null;
        }
        a aVar2 = this.f125931l;
        if (aVar2 != null) {
            this.f125923d.o(aVar2);
            this.f125931l = null;
        }
        a aVar3 = this.f125934o;
        if (aVar3 != null) {
            this.f125923d.o(aVar3);
            this.f125934o = null;
        }
        this.f125920a.clear();
        this.f125930k = true;
    }

    ByteBuffer b() {
        return this.f125920a.getData().asReadOnlyBuffer();
    }

    Bitmap c() {
        a aVar = this.f125929j;
        return aVar != null ? aVar.k() : this.f125932m;
    }

    int d() {
        a aVar = this.f125929j;
        if (aVar != null) {
            return aVar.f125939e;
        }
        return -1;
    }

    Bitmap e() {
        return this.f125932m;
    }

    int f() {
        return this.f125920a.c();
    }

    int h() {
        return this.f125937r;
    }

    int j() {
        return this.f125920a.h() + this.f125935p;
    }

    int k() {
        return this.f125936q;
    }

    void m(a aVar) {
        this.f125926g = false;
        if (this.f125930k) {
            this.f125921b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f125925f) {
            if (this.f125927h) {
                this.f125921b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f125934o = aVar;
                return;
            }
        }
        if (aVar.k() != null) {
            n();
            a aVar2 = this.f125929j;
            this.f125929j = aVar;
            for (int size = this.f125922c.size() - 1; size >= 0; size--) {
                this.f125922c.get(size).a();
            }
            if (aVar2 != null) {
                this.f125921b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        l();
    }

    void o(zd.l<Bitmap> lVar, Bitmap bitmap) {
        this.f125933n = (zd.l) ve.k.d(lVar);
        this.f125932m = (Bitmap) ve.k.d(bitmap);
        this.f125928i = this.f125928i.b(new re.g().u0(lVar));
        this.f125935p = ve.l.h(bitmap);
        this.f125936q = bitmap.getWidth();
        this.f125937r = bitmap.getHeight();
    }

    void r(b bVar) {
        if (this.f125930k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f125922c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f125922c.isEmpty();
        this.f125922c.add(bVar);
        if (zIsEmpty) {
            p();
        }
    }

    void s(b bVar) {
        this.f125922c.remove(bVar);
        if (this.f125922c.isEmpty()) {
            q();
        }
    }

    g(ce.d dVar, l lVar, yd.a aVar, Handler handler, k<Bitmap> kVar, zd.l<Bitmap> lVar2, Bitmap bitmap) {
        this.f125922c = new ArrayList();
        this.f125923d = lVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f125924e = dVar;
        this.f125921b = handler;
        this.f125928i = kVar;
        this.f125920a = aVar;
        o(lVar2, bitmap);
    }
}
