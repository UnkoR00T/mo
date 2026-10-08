package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import o.w0;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final o f9235b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f9234a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<a> f9236c = new HashSet();

    public interface a {
        void b(o oVar);
    }

    protected e(o oVar) {
        this.f9235b = oVar;
    }

    public void b(a aVar) {
        synchronized (this.f9234a) {
            this.f9236c.add(aVar);
        }
    }

    @Override // androidx.camera.core.o, java.lang.AutoCloseable
    public void close() {
        this.f9235b.close();
        h();
    }

    @Override // androidx.camera.core.o
    public int getFormat() {
        return this.f9235b.getFormat();
    }

    @Override // androidx.camera.core.o
    public int getHeight() {
        return this.f9235b.getHeight();
    }

    protected void h() {
        HashSet hashSet;
        synchronized (this.f9234a) {
            hashSet = new HashSet(this.f9236c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b(this);
        }
    }

    @Override // androidx.camera.core.o
    public int l() {
        return this.f9235b.l();
    }

    @Override // androidx.camera.core.o
    public Image m0() {
        return this.f9235b.m0();
    }

    @Override // androidx.camera.core.o
    public o.a[] o2() {
        return this.f9235b.o2();
    }

    @Override // androidx.camera.core.o
    public w0 v3() {
        return this.f9235b.v3();
    }

    @Override // androidx.camera.core.o
    public void y1(Rect rect) {
        this.f9235b.y1(rect);
    }
}
