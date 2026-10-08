package y1;

import a4.k0;
import a4.w0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import oq.i0;
import p071kotlin.Metadata;
import p079n1.l4;
import z1.o1;
import z1.p0;
import z1.q1;
import z1.x0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lz1/o1;", "", "selectableId", "Lkotlin/Function0;", "Le4/b0;", "layoutCoordinates", "Lf3/m;", "a", "(Lz1/o1;JLer/a;)Lf3/m;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f223110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f223111b;

        a(c cVar, b bVar) {
            this.f223110a = cVar;
            this.f223111b = bVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(k0 k0Var, tq.e<? super i0> eVar) {
            Object objI = x0.i(k0Var, this.f223110a, this.f223111b, eVar);
            return objI == uq.b.e() ? objI : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\bR\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0006R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0006R\"\u0010\u001f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"y1/l$b", "Ln1/l4;", "Lm3/e;", "point", "Loq/i0;", "a", "(J)V", "c", "()V", "startPoint", "Lz1/p0;", "selectionAdjustment", "b", "(JLz1/p0;)V", "delta", "d", "e", "onCancel", "J", "getLastPosition", "()J", "setLastPosition", "lastPosition", "getDragTotalDistance", "setDragTotalDistance", "dragTotalDistance", "Lz1/p0;", "getSelectionAdjustmentMode", "()Lz1/p0;", "setSelectionAdjustmentMode", "(Lz1/p0;)V", "selectionAdjustmentMode", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements l4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private long lastPosition;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private long dragTotalDistance;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private p0 selectionAdjustmentMode;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ er.a<p036e4.b0> f223115d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ o1 f223116e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f223117f;

        /* JADX WARN: Multi-variable type inference failed */
        b(er.a<? extends p036e4.b0> aVar, o1 o1Var, long j15) {
            this.f223115d = aVar;
            this.f223116e = o1Var;
            this.f223117f = j15;
            m3.e.Companion companion = m3.e.INSTANCE;
            this.lastPosition = companion.c();
            this.dragTotalDistance = companion.c();
            this.selectionAdjustmentMode = p0.INSTANCE.l();
        }

        @Override // p079n1.l4
        public void a(long point) {
        }

        @Override // p079n1.l4
        public void b(long startPoint, p0 selectionAdjustment) {
            this.selectionAdjustmentMode = selectionAdjustment;
            p036e4.b0 b0VarA = this.f223115d.a();
            if (b0VarA != null) {
                o1 o1Var = this.f223116e;
                if (!b0VarA.c()) {
                    return;
                }
                o1Var.h(b0VarA, startPoint, this.selectionAdjustmentMode, true);
                this.lastPosition = startPoint;
            }
            if (q1.d(this.f223116e, this.f223117f)) {
                this.dragTotalDistance = m3.e.INSTANCE.c();
            }
        }

        @Override // p079n1.l4
        public void c() {
        }

        @Override // p079n1.l4
        public void d(long delta) {
            p036e4.b0 b0VarA = this.f223115d.a();
            if (b0VarA != null) {
                o1 o1Var = this.f223116e;
                long j15 = this.f223117f;
                if (b0VarA.c() && q1.d(o1Var, j15)) {
                    long jQ = m3.e.q(this.dragTotalDistance, delta);
                    this.dragTotalDistance = jQ;
                    long jQ2 = m3.e.q(this.lastPosition, jQ);
                    if (o1Var.b(b0VarA, jQ2, this.lastPosition, false, this.selectionAdjustmentMode, true)) {
                        this.lastPosition = jQ2;
                        this.dragTotalDistance = m3.e.INSTANCE.c();
                    }
                }
            }
        }

        @Override // p079n1.l4
        public void e() {
            if (q1.d(this.f223116e, this.f223117f)) {
                this.f223116e.i();
            }
        }

        @Override // p079n1.l4
        public void onCancel() {
            if (q1.d(this.f223116e, this.f223117f)) {
                this.f223116e.i();
            }
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J'\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"y1/l$c", "Lz1/u;", "Lm3/e;", "downPosition", "", "e", "(J)Z", "dragPosition", "c", "Lz1/p0;", "adjustment", "", "clickCount", "d", "(JLz1/p0;I)Z", "b", "(JLz1/p0;)Z", "Loq/i0;", "a", "()V", "J", "getLastPosition", "()J", "setLastPosition", "(J)V", "lastPosition", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements z1.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private long lastPosition = m3.e.INSTANCE.c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.a<p036e4.b0> f223119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ o1 f223120c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f223121d;

        /* JADX WARN: Multi-variable type inference failed */
        c(er.a<? extends p036e4.b0> aVar, o1 o1Var, long j15) {
            this.f223119b = aVar;
            this.f223120c = o1Var;
            this.f223121d = j15;
        }

        @Override // z1.u
        public void a() {
            this.f223120c.i();
        }

        @Override // z1.u
        public boolean b(long dragPosition, p0 adjustment) {
            p036e4.b0 b0VarA = this.f223119b.a();
            if (b0VarA == null) {
                return true;
            }
            o1 o1Var = this.f223120c;
            long j15 = this.f223121d;
            if (!b0VarA.c() || !q1.d(o1Var, j15)) {
                return false;
            }
            if (!o1Var.b(b0VarA, dragPosition, this.lastPosition, false, adjustment, false)) {
                return true;
            }
            this.lastPosition = dragPosition;
            return true;
        }

        @Override // z1.u
        public boolean c(long dragPosition) {
            p036e4.b0 b0VarA = this.f223119b.a();
            if (b0VarA == null) {
                return true;
            }
            o1 o1Var = this.f223120c;
            long j15 = this.f223121d;
            if (!b0VarA.c() || !q1.d(o1Var, j15)) {
                return false;
            }
            if (!o1Var.b(b0VarA, dragPosition, this.lastPosition, false, p0.INSTANCE.l(), false)) {
                return true;
            }
            this.lastPosition = dragPosition;
            return true;
        }

        @Override // z1.u
        public boolean d(long downPosition, p0 adjustment, int clickCount) {
            p036e4.b0 b0VarA = this.f223119b.a();
            if (b0VarA == null) {
                return false;
            }
            o1 o1Var = this.f223120c;
            long j15 = this.f223121d;
            if (!b0VarA.c()) {
                return false;
            }
            o1Var.h(b0VarA, downPosition, adjustment, false);
            this.lastPosition = downPosition;
            return q1.d(o1Var, j15);
        }

        @Override // z1.u
        public boolean e(long downPosition) {
            p036e4.b0 b0VarA = this.f223119b.a();
            if (b0VarA == null) {
                return false;
            }
            o1 o1Var = this.f223120c;
            long j15 = this.f223121d;
            if (!b0VarA.c()) {
                return false;
            }
            if (o1Var.b(b0VarA, downPosition, this.lastPosition, false, p0.INSTANCE.l(), false)) {
                this.lastPosition = downPosition;
            }
            return q1.d(o1Var, j15);
        }
    }

    public static final f3.m a(o1 o1Var, long j15, er.a<? extends p036e4.b0> aVar) {
        b bVar = new b(aVar, o1Var, j15);
        c cVar = new c(aVar, o1Var, j15);
        return w0.d(f3.m.INSTANCE, cVar, bVar, new a(cVar, bVar));
    }
}
