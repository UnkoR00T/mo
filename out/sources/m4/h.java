package m4;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import c5.n;
import c5.q;
import er.l;
import fr.w;
import java.util.function.Consumer;
import ju.q0;
import n3.s2;
import n4.a0;
import oq.i0;
import p036e4.c0;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0003R+\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lm4/h;", "Lm4/b$a;", "<init>", "()V", "Landroid/view/View;", "view", "Ln4/a0;", "semanticsOwner", "Ltq/i;", "coroutineContext", "Ljava/util/function/Consumer;", "Landroid/view/ScrollCaptureTarget;", "targets", "Loq/i0;", "d", "(Landroid/view/View;Ln4/a0;Ltq/i;Ljava/util/function/Consumer;)V", "a", "b", "", "<set-?>", "Lm2/a3;", "c", "()Z", "e", "(Z)V", "scrollCaptureInProgress", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements m4.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a3 scrollCaptureInProgress = c6.e(Boolean.FALSE, null, 2, null);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.a implements l<ScrollCaptureCandidate, i0> {
        a(Object obj) {
            super(1, obj, n2.c.class, "add", "add(Ljava/lang/Object;)Z", 8);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(ScrollCaptureCandidate scrollCaptureCandidate) {
            c(scrollCaptureCandidate);
            return i0.f148189a;
        }

        public final void c(ScrollCaptureCandidate scrollCaptureCandidate) {
            ((n2.c) this.f66376a).d(scrollCaptureCandidate);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4/i;", "it", "", "c", "(Lm4/i;)Ljava/lang/Comparable;"}, k = 3, mv = {2, 1, 0})
    static final class b extends w implements l<ScrollCaptureCandidate, Comparable<?>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f123711b = new b();

        b() {
            super(1);
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> b(ScrollCaptureCandidate scrollCaptureCandidate) {
            return Integer.valueOf(scrollCaptureCandidate.getDepth());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4/i;", "it", "", "c", "(Lm4/i;)Ljava/lang/Comparable;"}, k = 3, mv = {2, 1, 0})
    static final class c extends w implements l<ScrollCaptureCandidate, Comparable<?>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f123712b = new c();

        c() {
            super(1);
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Comparable<?> b(ScrollCaptureCandidate scrollCaptureCandidate) {
            return Integer.valueOf(scrollCaptureCandidate.getViewportBoundsInWindow().f());
        }
    }

    private final void e(boolean z15) {
        this.scrollCaptureInProgress.setValue(Boolean.valueOf(z15));
    }

    @Override // m4.b.a
    public void a() {
        e(true);
    }

    @Override // m4.b.a
    public void b() {
        e(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        return ((Boolean) this.scrollCaptureInProgress.getValue()).booleanValue();
    }

    public final void d(View view, a0 semanticsOwner, tq.i coroutineContext, Consumer<ScrollCaptureTarget> targets) {
        n2.c cVar = new n2.c(new ScrollCaptureCandidate[16], 0);
        j.e(semanticsOwner.d(), 0, new a(cVar), 2, null);
        cVar.B(sq.a.c(b.f123711b, c.f123712b));
        ScrollCaptureCandidate scrollCaptureCandidate = (ScrollCaptureCandidate) (cVar.getSize() != 0 ? cVar.content[cVar.getSize() - 1] : null);
        if (scrollCaptureCandidate == null) {
            return;
        }
        m4.b bVar = new m4.b(scrollCaptureCandidate.getNode(), scrollCaptureCandidate.getViewportBoundsInWindow(), q0.a(coroutineContext), this, view);
        m3.g gVarB = c0.b(scrollCaptureCandidate.getCoordinates());
        long j15 = scrollCaptureCandidate.getViewportBoundsInWindow().j();
        ScrollCaptureTarget scrollCaptureTargetA = g.a(view, s2.a(q.b(gVarB)), new Point(n.i(j15), n.j(j15)), bVar);
        scrollCaptureTargetA.setScrollBounds(s2.a(scrollCaptureCandidate.getViewportBoundsInWindow()));
        targets.accept(scrollCaptureTargetA);
    }
}
