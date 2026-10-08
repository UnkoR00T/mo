package androidx.compose.ui.platform;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/p1;", "", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Ll3/g;", "Loq/i0;", "onMoveFocus", "<init>", "(Landroid/content/Context;Ler/l;)V", "Lx3/c;", "indirectPointerEvent", "", "isConsumed", "e", "(Lx3/c;Z)Z", "c", "()V", "a", "Ler/l;", "Lx3/d;", "b", "I", "d", "()I", "setPrimaryDirectionalMotionAxis-WQKaTuc", "(I)V", "primaryDirectionalMotionAxis", "Z", "ignoreCurrentGestureStream", "Landroid/view/GestureDetector;", "Landroid/view/GestureDetector;", "gestureDetector", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final er.l<l3.g, oq.i0> onMoveFocus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int primaryDirectionalMotionAxis = x3.d.INSTANCE.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean ignoreCurrentGestureStream;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final GestureDetector gestureDetector;

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J1\u0010\u0010\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\tJ1\u0010\u0015\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, d2 = {"androidx/compose/ui/platform/p1$a", "Landroid/view/GestureDetector$OnGestureListener;", "Landroid/view/MotionEvent;", "e", "", "onDown", "(Landroid/view/MotionEvent;)Z", "Loq/i0;", "onShowPress", "(Landroid/view/MotionEvent;)V", "onSingleTapUp", "e1", "e2", "", "distanceX", "distanceY", "onScroll", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "onLongPress", "velocityX", "velocityY", "onFling", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements GestureDetector.OnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e15) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent e15, MotionEvent e16, float velocityX, float velocityY) {
            if (p1.this.ignoreCurrentGestureStream) {
                return true;
            }
            int primaryDirectionalMotionAxis = p1.this.getPrimaryDirectionalMotionAxis();
            x3.d.Companion companion = x3.d.INSTANCE;
            if (x3.d.g(primaryDirectionalMotionAxis, companion.b())) {
                if (Math.abs(velocityX) > Math.abs(velocityY)) {
                    p1.this.onMoveFocus.b(l3.g.i(velocityX > 0.0f ? l3.g.INSTANCE.e() : l3.g.INSTANCE.f()));
                }
            } else if (x3.d.g(p1.this.getPrimaryDirectionalMotionAxis(), companion.c()) && Math.abs(velocityY) > Math.abs(velocityX)) {
                p1.this.onMoveFocus.b(l3.g.i(velocityY > 0.0f ? l3.g.INSTANCE.e() : l3.g.INSTANCE.f()));
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent e15) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent e15, MotionEvent e16, float distanceX, float distanceY) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent e15) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e15) {
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p1(Context context, er.l<? super l3.g, oq.i0> lVar) {
        this.onMoveFocus = lVar;
        this.gestureDetector = new GestureDetector(context, new a());
    }

    public final void c() {
        this.primaryDirectionalMotionAxis = x3.d.INSTANCE.a();
        this.ignoreCurrentGestureStream = true;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getPrimaryDirectionalMotionAxis() {
        return this.primaryDirectionalMotionAxis;
    }

    public final boolean e(x3.c indirectPointerEvent, boolean isConsumed) {
        MotionEvent motionEventB = x3.b.b(indirectPointerEvent);
        int action = motionEventB.getAction();
        if (action == 0) {
            this.primaryDirectionalMotionAxis = indirectPointerEvent.getPrimaryDirectionalMotionAxis();
            this.ignoreCurrentGestureStream = false;
        } else if ((action == 1 || action == 2) && isConsumed) {
            c();
        }
        return this.gestureDetector.onTouchEvent(motionEventB);
    }
}
