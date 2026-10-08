package a4;

import android.view.MotionEvent;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001e"}, d2 = {"La4/h;", "", "Lr0/a0;", "La4/b0;", "changes", "La4/d0;", "pointerInputEvent", "<init>", "(Lr0/a0;La4/d0;)V", "La4/a0;", "pointerId", "", "a", "(J)Z", "Lr0/a0;", "b", "()Lr0/a0;", "La4/d0;", "getPointerInputEvent", "()La4/d0;", "c", "Z", "d", "()Z", "e", "(Z)V", "suppressMovementConsumption", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "motionEvent", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r0.a0<PointerInputChange> changes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d0 pointerInputEvent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean suppressMovementConsumption;

    public h(r0.a0<PointerInputChange> a0Var, d0 d0Var) {
        this.changes = a0Var;
        this.pointerInputEvent = d0Var;
    }

    public final boolean a(long pointerId) {
        PointerInputEventData pointerInputEventData;
        List<PointerInputEventData> listB = this.pointerInputEvent.b();
        int size = listB.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                pointerInputEventData = null;
                break;
            }
            pointerInputEventData = listB.get(i15);
            if (a0.b(pointerInputEventData.getId(), pointerId)) {
                break;
            }
            i15++;
        }
        PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        if (pointerInputEventData2 != null) {
            return pointerInputEventData2.getActiveHover();
        }
        return false;
    }

    public final r0.a0<PointerInputChange> b() {
        return this.changes;
    }

    public final MotionEvent c() {
        return this.pointerInputEvent.getMotionEvent();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getSuppressMovementConsumption() {
        return this.suppressMovementConsumption;
    }

    public final void e(boolean z15) {
        this.suppressMovementConsumption = z15;
    }
}
