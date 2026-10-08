package a4;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0003R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0011"}, d2 = {"La4/c0;", "", "<init>", "()V", "La4/d0;", "pointerInputEvent", "La4/q0;", "positionCalculator", "La4/h;", "b", "(La4/d0;La4/q0;)La4/h;", "Loq/i0;", "a", "Lr0/a0;", "La4/c0$a;", "Lr0/a0;", "previousPointerInputData", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r0.a0<a> previousPointerInputData = new r0.a0<>(0, 1, null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0011"}, d2 = {"La4/c0$a;", "", "", "uptime", "Lm3/e;", "positionOnScreen", "", "down", "<init>", "(JJZLfr/k;)V", "a", "J", "c", "()J", "b", "Z", "()Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long uptime;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long positionOnScreen;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean down;

        public /* synthetic */ a(long j15, long j16, boolean z15, fr.k kVar) {
            this(j15, j16, z15);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getDown() {
            return this.down;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getPositionOnScreen() {
            return this.positionOnScreen;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getUptime() {
            return this.uptime;
        }

        private a(long j15, long j16, boolean z15) {
            this.uptime = j15;
            this.positionOnScreen = j16;
            this.down = z15;
        }
    }

    public final void a() {
        this.previousPointerInputData.b();
    }

    public final h b(d0 pointerInputEvent, q0 positionCalculator) {
        long uptime;
        boolean down;
        long jH;
        r0.a0 a0Var = new r0.a0(pointerInputEvent.b().size());
        List<PointerInputEventData> listB = pointerInputEvent.b();
        int size = listB.size();
        for (int i15 = 0; i15 < size; i15++) {
            PointerInputEventData pointerInputEventData = listB.get(i15);
            a aVarG = this.previousPointerInputData.g(pointerInputEventData.getId());
            if (aVarG == null) {
                down = false;
                uptime = pointerInputEventData.getUptime();
                jH = pointerInputEventData.getPosition();
            } else {
                uptime = aVarG.getUptime();
                down = aVarG.getDown();
                jH = positionCalculator.h(aVarG.getPositionOnScreen());
            }
            a0Var.m(pointerInputEventData.getId(), new PointerInputChange(pointerInputEventData.getId(), pointerInputEventData.getUptime(), pointerInputEventData.getPosition(), pointerInputEventData.getDown(), pointerInputEventData.getPressure(), uptime, jH, down, false, pointerInputEventData.getType(), pointerInputEventData.c(), pointerInputEventData.getScrollDelta(), pointerInputEventData.getScaleGestureFactor(), pointerInputEventData.getPanGestureOffset(), pointerInputEventData.getOriginalEventPosition(), null));
            if (pointerInputEventData.getDown()) {
                this.previousPointerInputData.m(pointerInputEventData.getId(), new a(pointerInputEventData.getUptime(), pointerInputEventData.getPositionOnScreen(), pointerInputEventData.getDown(), null));
            } else {
                this.previousPointerInputData.o(pointerInputEventData.getId());
            }
        }
        return new h(a0Var, pointerInputEvent);
    }
}
