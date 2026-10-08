package ad;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import ju.n;
import ju.p;
import oq.i0;
import oq.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ)\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006 À\u0006\u0001"}, d2 = {"Lad/k;", "Landroid/view/View;", "T", "Lad/i;", "Lad/g;", "getSize", "()Lad/g;", "Lad/a;", "l", "()Lad/a;", "getHeight", "", "paramSize", "viewSize", "paddingSize", "r", "(III)Lad/a;", "Landroid/view/ViewTreeObserver;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "victim", "Loq/i0;", "s", "(Landroid/view/ViewTreeObserver;Landroid/view/ViewTreeObserver$OnPreDrawListener;)V", "a", "(Ltq/e;)Ljava/lang/Object;", "m", "()Landroid/view/View;", "view", "", "t", "()Z", "subtractPadding", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface k<T extends View> extends i {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements er.l<Throwable, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k<T> f5433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver f5434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f5435c;

        a(k<T> kVar, ViewTreeObserver viewTreeObserver, b bVar) {
            this.f5433a = kVar;
            this.f5434b = viewTreeObserver;
            this.f5435c = bVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Throwable th4) {
            c(th4);
            return i0.f148189a;
        }

        public final void c(Throwable th4) {
            this.f5433a.s(this.f5434b, this.f5435c);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"ad/k$b", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "onPreDraw", "()Z", "a", "Z", "isResumed", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean isResumed;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k<T> f5437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver f5438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n<Size> f5439d;

        /* JADX WARN: Multi-variable type inference failed */
        b(k<T> kVar, ViewTreeObserver viewTreeObserver, n<? super Size> nVar) {
            this.f5437b = kVar;
            this.f5438c = viewTreeObserver;
            this.f5439d = nVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            Size size = this.f5437b.getSize();
            if (size != null) {
                this.f5437b.s(this.f5438c, this);
                if (!this.isResumed) {
                    this.isResumed = true;
                    this.f5439d.i(t.b(size));
                }
            }
            return true;
        }
    }

    static /* synthetic */ <T extends View> Object A(k<T> kVar, tq.e<? super Size> eVar) {
        Size size = kVar.getSize();
        if (size != null) {
            return size;
        }
        p pVar = new p(uq.b.c(eVar), 1);
        pVar.D();
        ViewTreeObserver viewTreeObserver = kVar.m().getViewTreeObserver();
        b bVar = new b(kVar, viewTreeObserver, pVar);
        viewTreeObserver.addOnPreDrawListener(bVar);
        pVar.E(new a(kVar, viewTreeObserver, bVar));
        Object objX = pVar.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX;
    }

    private default ad.a getHeight() {
        ViewGroup.LayoutParams layoutParams = m().getLayoutParams();
        return r(layoutParams != null ? layoutParams.height : -1, m().getHeight(), t() ? m().getPaddingTop() + m().getPaddingBottom() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    default Size getSize() {
        ad.a height;
        ad.a aVarL = l();
        if (aVarL == null || (height = getHeight()) == null) {
            return null;
        }
        return new Size(aVarL, height);
    }

    private default ad.a l() {
        ViewGroup.LayoutParams layoutParams = m().getLayoutParams();
        return r(layoutParams != null ? layoutParams.width : -1, m().getWidth(), t() ? m().getPaddingLeft() + m().getPaddingRight() : 0);
    }

    private default ad.a r(int paramSize, int viewSize, int paddingSize) {
        if (paramSize == -2) {
            return ad.a.b.f5414a;
        }
        int i15 = paramSize - paddingSize;
        if (i15 > 0) {
            return ad.a.C0109a.a(ad.b.a(i15));
        }
        int i16 = viewSize - paddingSize;
        if (i16 > 0) {
            return ad.a.C0109a.a(ad.b.a(i16));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    default void s(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            m().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }

    @Override // ad.i
    default Object a(tq.e<? super Size> eVar) {
        return A(this, eVar);
    }

    T m();

    default boolean t() {
        return true;
    }
}
