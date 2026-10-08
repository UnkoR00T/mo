package m4;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.View;
import c5.p;
import er.l;
import java.util.function.Consumer;
import ju.p0;
import ju.p2;
import ju.q0;
import n3.s2;
import n4.ScrollAxisRange;
import n4.c0;
import n4.w;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.n2;
import vq.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001#B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ5\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u001bH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010+R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lm4/b;", "Landroid/view/ScrollCaptureCallback;", "Ln4/w;", "node", "Lc5/p;", "viewportBoundsInWindow", "Lju/p0;", "coroutineScope", "Lm4/b$a;", "listener", "Landroid/view/View;", "composeView", "<init>", "(Ln4/w;Lc5/p;Lju/p0;Lm4/b$a;Landroid/view/View;)V", "Landroid/view/ScrollCaptureSession;", "session", "captureArea", "e", "(Landroid/view/ScrollCaptureSession;Lc5/p;Ltq/e;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "signal", "Ljava/util/function/Consumer;", "Landroid/graphics/Rect;", "onReady", "Loq/i0;", "onScrollCaptureSearch", "(Landroid/os/CancellationSignal;Ljava/util/function/Consumer;)V", "Ljava/lang/Runnable;", "onScrollCaptureStart", "(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Ljava/lang/Runnable;)V", "onComplete", "onScrollCaptureImageRequest", "(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Landroid/graphics/Rect;Ljava/util/function/Consumer;)V", "onScrollCaptureEnd", "(Ljava/lang/Runnable;)V", "a", "Ln4/w;", "b", "Lc5/p;", "c", "Lm4/b$a;", "d", "Landroid/view/View;", "Lju/p0;", "Lm4/f;", "f", "Lm4/f;", "scrollTracker", "", "g", "I", "requestCount", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w node;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p viewportBoundsInWindow;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a listener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final View composeView;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0 coroutineScope;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final m4.f scrollTracker;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int requestCount;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lm4/b$a;", "", "Loq/i0;", "a", "()V", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        void a();

        void b();
    }

    /* JADX INFO: renamed from: m4.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class C3025b extends k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f123681e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Runnable f123683g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3025b(Runnable runnable, tq.e<? super C3025b> eVar) {
            super(2, eVar);
            this.f123683g = runnable;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f123681e;
            if (i15 == 0) {
                u.b(obj);
                m4.f fVar = b.this.scrollTracker;
                this.f123681e = 1;
                if (fVar.g(0.0f, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            b.this.listener.b();
            this.f123683g.run();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((C3025b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new C3025b(this.f123683g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f123684e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ScrollCaptureSession f123686g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Rect f123687h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Consumer<Rect> f123688j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f123686g = scrollCaptureSession;
            this.f123687h = rect;
            this.f123688j = consumer;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f123684e;
            if (i15 == 0) {
                u.b(obj);
                b bVar = b.this;
                ScrollCaptureSession scrollCaptureSession = this.f123686g;
                p pVarD = s2.d(this.f123687h);
                this.f123684e = 1;
                obj = bVar.e(scrollCaptureSession, pVarD, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            this.f123688j.accept(s2.a((p) obj));
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new c(this.f123686g, this.f123687h, this.f123688j, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f123689d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f123690e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f123691f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f123692g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f123693h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f123695k;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f123693h = obj;
            this.f123695k |= PKIFailureInfo.systemUnavail;
            return b.this.e(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loq/i0;", "c", "(J)V"}, k = 3, mv = {2, 1, 0})
    static final class e extends fr.w implements l<Long, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f123696b = new e();

        e() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Long l15) {
            c(l15.longValue());
            return i0.f148189a;
        }

        public final void c(long j15) {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "delta"}, k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f extends k implements er.p<Float, tq.e<? super Float>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f123697e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f123698f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ float f123699g;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Object B(Float f15, tq.e<? super Float> eVar) {
            return M(f15.floatValue(), eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            boolean z15;
            Object objE = uq.b.e();
            int i15 = this.f123698f;
            if (i15 == 0) {
                u.b(obj);
                float f15 = this.f123699g;
                er.p<m3.e, tq.e<? super m3.e>, Object> pVarC = j.c(b.this.node);
                if (pVarC == null) {
                    d4.a.d("Required value was null.");
                    throw new oq.g();
                }
                boolean reverseScrolling = ((ScrollAxisRange) b.this.node.getUnmergedConfig().k(c0.f131174a.S())).getReverseScrolling();
                if (reverseScrolling) {
                    f15 = -f15;
                }
                m3.e eVarD = m3.e.d(m3.e.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f15)) & BodyPartID.bodyIdMax)));
                this.f123697e = reverseScrolling;
                this.f123698f = 1;
                obj = pVarC.B(eVarD, this);
                if (obj == objE) {
                    return objE;
                }
                z15 = reverseScrolling;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z15 = this.f123697e;
                u.b(obj);
            }
            long packedValue = ((m3.e) obj).getPackedValue();
            return vq.b.d(z15 ? -Float.intBitsToFloat((int) (packedValue & BodyPartID.bodyIdMax)) : Float.intBitsToFloat((int) (packedValue & BodyPartID.bodyIdMax)));
        }

        public final Object M(float f15, tq.e<? super Float> eVar) {
            return ((f) v(Float.valueOf(f15), eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = b.this.new f(eVar);
            fVar.f123699g = ((Number) obj).floatValue();
            return fVar;
        }
    }

    public b(w wVar, p pVar, p0 p0Var, a aVar, View view) {
        this.node = wVar;
        this.viewportBoundsInWindow = pVar;
        this.listener = aVar;
        this.composeView = view;
        this.coroutineScope = q0.h(p0Var, m4.e.f123703a);
        this.scrollTracker = new m4.f(pVar.f(), new f(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ScrollCaptureSession scrollCaptureSession, p pVar, tq.e<? super p> eVar) throws Throwable {
        d dVar;
        int top;
        int bottom;
        p pVar2;
        int i15;
        ScrollCaptureSession scrollCaptureSession2;
        int i16;
        int iC;
        int iC2;
        p pVarC;
        Canvas canvasLockHardwareCanvas;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i17 = dVar.f123695k;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f123695k = i17 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object obj = dVar.f123693h;
        Object objE = uq.b.e();
        int i18 = dVar.f123695k;
        if (i18 == 0) {
            u.b(obj);
            top = pVar.getTop();
            bottom = pVar.getBottom();
            m4.f fVar = this.scrollTracker;
            dVar.f123689d = scrollCaptureSession;
            dVar.f123690e = pVar;
            dVar.f123691f = top;
            dVar.f123692g = bottom;
            dVar.f123695k = 1;
            if (fVar.f(top, bottom, dVar) != objE) {
            }
            return objE;
        }
        if (i18 == 1) {
            int i19 = dVar.f123692g;
            int i25 = dVar.f123691f;
            p pVar3 = (p) dVar.f123690e;
            ScrollCaptureSession scrollCaptureSessionA = m4.a.a(dVar.f123689d);
            u.b(obj);
            top = i25;
            pVar = pVar3;
            bottom = i19;
            scrollCaptureSession = scrollCaptureSessionA;
        } else {
            if (i18 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i16 = dVar.f123692g;
            i15 = dVar.f123691f;
            p pVar4 = (p) dVar.f123690e;
            ScrollCaptureSession scrollCaptureSessionA2 = m4.a.a(dVar.f123689d);
            u.b(obj);
            scrollCaptureSession2 = scrollCaptureSessionA2;
            pVar2 = pVar4;
        }
        iC = this.scrollTracker.c(i15);
        iC2 = this.scrollTracker.c(i16);
        pVarC = p.c(pVar2, 0, iC, 0, iC2, 5, null);
        if (iC == iC2) {
            return p.INSTANCE.a();
        }
        canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-pVarC.getLeft(), -pVarC.getTop());
            canvasLockHardwareCanvas.translate(-this.viewportBoundsInWindow.getLeft(), -this.viewportBoundsInWindow.getTop());
            this.composeView.getRootView().draw(canvasLockHardwareCanvas);
            return pVarC.m(0, hr.a.d(this.scrollTracker.getScrollAmount()));
        } finally {
            scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        e eVar2 = e.f123696b;
        dVar.f123689d = scrollCaptureSession;
        dVar.f123690e = pVar;
        dVar.f123691f = top;
        dVar.f123692g = bottom;
        dVar.f123695k = 2;
        if (n2.c(eVar2, dVar) != objE) {
            pVar2 = pVar;
            i15 = top;
            scrollCaptureSession2 = scrollCaptureSession;
            i16 = bottom;
            iC = this.scrollTracker.c(i15);
            iC2 = this.scrollTracker.c(i16);
            pVarC = p.c(pVar2, 0, iC, 0, iC2, 5, null);
            if (iC == iC2) {
                return p.INSTANCE.a();
            }
            canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-pVarC.getLeft(), -pVarC.getTop());
            canvasLockHardwareCanvas.translate(-this.viewportBoundsInWindow.getLeft(), -this.viewportBoundsInWindow.getTop());
            this.composeView.getRootView().draw(canvasLockHardwareCanvas);
            return pVarC.m(0, hr.a.d(this.scrollTracker.getScrollAmount()));
        }
        return objE;
    }

    public void onScrollCaptureEnd(Runnable onReady) {
        ju.k.d(this.coroutineScope, p2.f105770b, null, new C3025b(onReady, null), 2, null);
    }

    public void onScrollCaptureImageRequest(ScrollCaptureSession session, CancellationSignal signal, Rect captureArea, Consumer<Rect> onComplete) {
        m4.d.c(this.coroutineScope, signal, new c(session, captureArea, onComplete, null));
    }

    public void onScrollCaptureSearch(CancellationSignal signal, Consumer<Rect> onReady) {
        onReady.accept(s2.a(this.viewportBoundsInWindow));
    }

    public void onScrollCaptureStart(ScrollCaptureSession session, CancellationSignal signal, Runnable onReady) {
        this.scrollTracker.d();
        this.requestCount = 0;
        this.listener.a();
        onReady.run();
    }
}
