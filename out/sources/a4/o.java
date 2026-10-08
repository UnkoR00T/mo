package a4;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u001c\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u001b\u0010\fR*\u0010!\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010 R\u0013\u0010%\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"La4/o;", "", "", "La4/b0;", "changes", "La4/h;", "internalPointerEvent", "<init>", "(Ljava/util/List;La4/h;)V", "(Ljava/util/List;)V", "La4/s;", "a", "()I", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "La4/h;", "e", "()La4/h;", "", "I", "d", "classification", "La4/n;", "buttons", "La4/o0;", "f", "keyboardModifiers", "value", "h", "i", "(I)V", "type", "Landroid/view/MotionEvent;", "g", "()Landroid/view/MotionEvent;", "motionEvent", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<PointerInputChange> changes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h internalPointerEvent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int classification;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int buttons;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int keyboardModifiers;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int type;

    public o(List<PointerInputChange> list, h hVar) {
        MotionEvent motionEventG;
        this.changes = list;
        this.internalPointerEvent = hVar;
        this.classification = (Build.VERSION.SDK_INT < 29 || (motionEventG = g()) == null) ? 0 : motionEventG.getClassification();
        MotionEvent motionEventG2 = g();
        this.buttons = n.a(motionEventG2 != null ? motionEventG2.getButtonState() : 0);
        MotionEvent motionEventG3 = g();
        this.keyboardModifiers = o0.b(motionEventG3 != null ? motionEventG3.getMetaState() : 0);
        this.type = a();
    }

    private final int a() {
        MotionEvent motionEventG = g();
        int i15 = 0;
        if (motionEventG == null) {
            List<PointerInputChange> list = this.changes;
            int size = list.size();
            while (i15 < size) {
                PointerInputChange b0Var = list.get(i15);
                if (p.d(b0Var)) {
                    return s.INSTANCE.h();
                }
                if (p.b(b0Var)) {
                    return s.INSTANCE.g();
                }
                i15++;
            }
            return s.INSTANCE.c();
        }
        int i16 = Build.VERSION.SDK_INT;
        boolean z15 = i16 >= 29 && motionEventG.getClassification() == 3;
        if (i16 >= 29 && motionEventG.getClassification() == 5) {
            i15 = 1;
        }
        int actionMasked = motionEventG.getActionMasked();
        if (actionMasked == 0) {
            if (z15 && f3.h.isTrackpadGestureHandlingEnabled) {
                return s.INSTANCE.f();
            }
            return (i15 == 0 || !f3.h.isTrackpadGestureHandlingEnabled) ? s.INSTANCE.g() : s.INSTANCE.k();
        }
        if (actionMasked == 1) {
            if (z15 && f3.h.isTrackpadGestureHandlingEnabled) {
                return s.INSTANCE.d();
            }
            return (i15 == 0 || !f3.h.isTrackpadGestureHandlingEnabled) ? s.INSTANCE.h() : s.INSTANCE.j();
        }
        if (actionMasked != 2) {
            switch (actionMasked) {
                case 5:
                    if (z15 && f3.h.isTrackpadGestureHandlingEnabled) {
                        return s.INSTANCE.f();
                    }
                    return (i15 == 0 || !f3.h.isTrackpadGestureHandlingEnabled) ? s.INSTANCE.g() : s.INSTANCE.i();
                case 6:
                    if (z15 && f3.h.isTrackpadGestureHandlingEnabled) {
                        return s.INSTANCE.d();
                    }
                    return (i15 == 0 || !f3.h.isTrackpadGestureHandlingEnabled) ? s.INSTANCE.h() : s.INSTANCE.i();
                case 7:
                    break;
                case 8:
                    return s.INSTANCE.l();
                case 9:
                    return s.INSTANCE.a();
                case 10:
                    return s.INSTANCE.b();
                default:
                    return s.INSTANCE.m();
            }
        }
        if (z15 && f3.h.isTrackpadGestureHandlingEnabled) {
            return s.INSTANCE.e();
        }
        return (i15 == 0 || !f3.h.isTrackpadGestureHandlingEnabled) ? s.INSTANCE.c() : s.INSTANCE.i();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getButtons() {
        return this.buttons;
    }

    public final List<PointerInputChange> c() {
        return this.changes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getClassification() {
        return this.classification;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h getInternalPointerEvent() {
        return this.internalPointerEvent;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getKeyboardModifiers() {
        return this.keyboardModifiers;
    }

    public final MotionEvent g() {
        h hVar = this.internalPointerEvent;
        if (hVar != null) {
            return hVar.c();
        }
        return null;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final void i(int i15) {
        this.type = i15;
    }

    public o(List<PointerInputChange> list) {
        this(list, null);
    }
}
