package androidx.viewpager2.widget;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class b extends ViewPager2.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ViewPager2.i> f13703a;

    b(int i15) {
        this.f13703a = new ArrayList(i15);
    }

    private void f(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void a(int i15) {
        try {
            Iterator<ViewPager2.i> it = this.f13703a.iterator();
            while (it.hasNext()) {
                it.next().a(i15);
            }
        } catch (ConcurrentModificationException e15) {
            f(e15);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void b(int i15, float f15, int i16) {
        try {
            Iterator<ViewPager2.i> it = this.f13703a.iterator();
            while (it.hasNext()) {
                it.next().b(i15, f15, i16);
            }
        } catch (ConcurrentModificationException e15) {
            f(e15);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void c(int i15) {
        try {
            Iterator<ViewPager2.i> it = this.f13703a.iterator();
            while (it.hasNext()) {
                it.next().c(i15);
            }
        } catch (ConcurrentModificationException e15) {
            f(e15);
        }
    }

    void d(ViewPager2.i iVar) {
        this.f13703a.add(iVar);
    }

    void e(ViewPager2.i iVar) {
        this.f13703a.remove(iVar);
    }
}
