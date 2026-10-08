package p143z0;

import a4.a0;
import a4.p0;
import a4.q;
import androidx.compose.ui.platform.f3;
import androidx.compose.ui.platform.g1;
import b4.g;
import c5.z;
import fr.k;
import g4.f;
import g4.h;
import java.util.List;
import m3.e;
import oq.p;
import p036e4.c0;
import p071kotlin.Metadata;
import pq.v;
import x3.IndirectPointerInputChange;
import x3.c;
import x3.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001:\u0001@B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010$\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J'\u0010'\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J'\u0010*\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J'\u0010-\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.J1\u00104\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u0001012\u0006\u00103\u001a\u00020\u0010H\u0002¢\u0006\u0004\b4\u00105J)\u00108\u001a\u00020\u00142\u0006\u00106\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u0001012\u0006\u00107\u001a\u00020\u0010H\u0002¢\u0006\u0004\b8\u00109J!\u0010:\u001a\u00020\u00142\u0006\u00106\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0014H\u0002¢\u0006\u0004\b<\u0010\u001aJ\u001d\u0010=\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0014¢\u0006\u0004\b?\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0018\u0010F\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010I\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010L\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010MR\u0018\u0010Q\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010RR\u0016\u0010V\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010WR\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010YR\u0014\u0010]\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\\R\u0016\u0010^\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010UR\u0014\u0010`\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010_R\u0014\u0010b\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010aR\u0014\u0010d\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010cR\u0014\u0010f\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010e¨\u0006g"}, d2 = {"Lz0/h1;", "", "Lz0/t0;", "node", "<init>", "(Lz0/t0;)V", "Lz0/g3;", "o", "()Lz0/g3;", "Lb4/g;", "p", "()Lb4/g;", "Lx3/f;", "initialDown", "La4/a0;", "pointerId", "Lm3/e;", "initialTouchSlopPositionChange", "", "verifyConsumptionInFinalPass", "Loq/i0;", "g", "(Lx3/f;JJZ)V", "i", "(J)V", "e", "()V", "touchSlopDetector", "f", "(Lx3/f;JLz0/g3;)V", "Lx3/c;", "indirectPointerInputEvent", "La4/q;", "pass", "Lz0/h1$a$a;", "state", "n", "(Lx3/c;La4/q;Lz0/h1$a$a;)V", "Lz0/h1$a$c;", "k", "(Lx3/c;La4/q;Lz0/h1$a$c;)V", "Lz0/h1$a$b;", "j", "(Lx3/c;La4/q;Lz0/h1$a$b;)V", "Lz0/h1$a$d;", "l", "(Lx3/c;La4/q;Lz0/h1$a$d;)V", "down", "slopTriggerChange", "Lx3/d;", "primaryDirectionalMotionAxis", "overSlopOffset", "t", "(Lx3/f;Lx3/f;Lx3/d;J)V", "change", "dragAmount", "s", "(Lx3/f;Lx3/d;J)V", "u", "(Lx3/f;Lx3/d;)V", "r", "m", "(Lx3/c;La4/q;)V", "q", "a", "Lz0/t0;", "getNode", "()Lz0/t0;", "b", "Lz0/h1$a$a;", "_awaitDownState", "c", "Lz0/h1$a$d;", "_draggingState", "d", "Lz0/h1$a$c;", "_awaitTouchSlopState", "Lz0/h1$a$b;", "_awaitGesturePickupState", "Lz0/h1$a;", "Lz0/h1$a;", "currentDragState", "Lb4/g;", "velocityTracker", "h", "J", "previousPositionOnScreen", "Lz0/g3;", "Lz0/l1;", "Lz0/l1;", "touchSmooth", "Lz0/y1;", "Lz0/y1;", "offsetSmoother", "nodeOffset", "()Lz0/h1$a$a;", "awaitDownState", "()Lz0/h1$a$d;", "draggingState", "()Lz0/h1$a$c;", "awaitTouchSlopState", "()Lz0/h1$a$b;", "awaitGesturePickupState", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t0 node;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private a.C6218a _awaitDownState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private a.d _draggingState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private a.c _awaitTouchSlopState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private a.b _awaitGesturePickupState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private a currentDragState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private g velocityTracker;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long previousPositionOnScreen;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private g3 touchSlopDetector;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final l1 touchSmooth;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final y1 offsetSmoother;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long nodeOffset;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lz0/h1$a;", "", "<init>", "()V", "a", "c", "b", "d", "Lz0/h1$a$a;", "Lz0/h1$a$b;", "Lz0/h1$a$c;", "Lz0/h1$a$d;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: z0.h1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lz0/h1$a$a;", "Lz0/h1$a;", "Lz0/h1$a$a$a;", "awaitTouchSlop", "", "consumedOnInitial", "<init>", "(Lz0/h1$a$a$a;Z)V", "a", "Lz0/h1$a$a$a;", "()Lz0/h1$a$a$a;", "c", "(Lz0/h1$a$a$a;)V", "b", "Z", "()Z", "d", "(Z)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C6218a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private EnumC6219a awaitTouchSlop;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private boolean consumedOnInitial;

            /* JADX INFO: renamed from: z0.h1$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lz0/h1$a$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public enum EnumC6219a {
                Yes,
                No,
                NotInitialized;


                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static final /* synthetic */ wq.a f231295e = wq.b.a(b());
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C6218a() {
                this(null, false, 3, 0 == true ? 1 : 0);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final EnumC6219a getAwaitTouchSlop() {
                return this.awaitTouchSlop;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getConsumedOnInitial() {
                return this.consumedOnInitial;
            }

            public final void c(EnumC6219a enumC6219a) {
                this.awaitTouchSlop = enumC6219a;
            }

            public final void d(boolean z15) {
                this.consumedOnInitial = z15;
            }

            public C6218a(EnumC6219a enumC6219a, boolean z15) {
                super(null);
                this.awaitTouchSlop = enumC6219a;
                this.consumedOnInitial = z15;
            }

            public /* synthetic */ C6218a(EnumC6219a enumC6219a, boolean z15, int i15, k kVar) {
                this((i15 & 1) != 0 ? EnumC6219a.NotInitialized : enumC6219a, (i15 & 2) != 0 ? false : z15);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lz0/h1$a$b;", "Lz0/h1$a;", "Lx3/f;", "initialDown", "La4/a0;", "pointerId", "Lz0/g3;", "touchSlopDetector", "<init>", "(Lx3/f;JLz0/g3;Lfr/k;)V", "a", "Lx3/f;", "()Lx3/f;", "c", "(Lx3/f;)V", "b", "J", "()J", "d", "(J)V", "Lz0/g3;", "getTouchSlopDetector", "()Lz0/g3;", "e", "(Lz0/g3;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private IndirectPointerInputChange initialDown;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private long pointerId;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private g3 touchSlopDetector;

            public /* synthetic */ b(IndirectPointerInputChange indirectPointerInputChange, long j15, g3 g3Var, k kVar) {
                this(indirectPointerInputChange, j15, g3Var);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final IndirectPointerInputChange getInitialDown() {
                return this.initialDown;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final long getPointerId() {
                return this.pointerId;
            }

            public final void c(IndirectPointerInputChange indirectPointerInputChange) {
                this.initialDown = indirectPointerInputChange;
            }

            public final void d(long j15) {
                this.pointerId = j15;
            }

            public final void e(g3 g3Var) {
                this.touchSlopDetector = g3Var;
            }

            private b(IndirectPointerInputChange indirectPointerInputChange, long j15, g3 g3Var) {
                super(null);
                this.initialDown = indirectPointerInputChange;
                this.pointerId = j15;
                this.touchSlopDetector = g3Var;
            }

            public /* synthetic */ b(IndirectPointerInputChange indirectPointerInputChange, long j15, g3 g3Var, int i15, k kVar) {
                this((i15 & 1) != 0 ? null : indirectPointerInputChange, (i15 & 2) != 0 ? a0.a(Long.MAX_VALUE) : j15, (i15 & 4) != 0 ? null : g3Var, null);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lz0/h1$a$c;", "Lz0/h1$a;", "Lx3/f;", "initialDown", "La4/a0;", "pointerId", "", "verifyConsumptionInFinalPass", "<init>", "(Lx3/f;JZLfr/k;)V", "a", "Lx3/f;", "()Lx3/f;", "d", "(Lx3/f;)V", "b", "J", "()J", "e", "(J)V", "c", "Z", "()Z", "f", "(Z)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private IndirectPointerInputChange initialDown;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private long pointerId;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private boolean verifyConsumptionInFinalPass;

            public /* synthetic */ c(IndirectPointerInputChange indirectPointerInputChange, long j15, boolean z15, k kVar) {
                this(indirectPointerInputChange, j15, z15);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final IndirectPointerInputChange getInitialDown() {
                return this.initialDown;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final long getPointerId() {
                return this.pointerId;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getVerifyConsumptionInFinalPass() {
                return this.verifyConsumptionInFinalPass;
            }

            public final void d(IndirectPointerInputChange indirectPointerInputChange) {
                this.initialDown = indirectPointerInputChange;
            }

            public final void e(long j15) {
                this.pointerId = j15;
            }

            public final void f(boolean z15) {
                this.verifyConsumptionInFinalPass = z15;
            }

            private c(IndirectPointerInputChange indirectPointerInputChange, long j15, boolean z15) {
                super(null);
                this.initialDown = indirectPointerInputChange;
                this.pointerId = j15;
                this.verifyConsumptionInFinalPass = z15;
            }

            public /* synthetic */ c(IndirectPointerInputChange indirectPointerInputChange, long j15, boolean z15, int i15, k kVar) {
                this((i15 & 1) != 0 ? null : indirectPointerInputChange, (i15 & 2) != 0 ? a0.a(Long.MAX_VALUE) : j15, (i15 & 4) != 0 ? false : z15, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lz0/h1$a$d;", "Lz0/h1$a;", "La4/a0;", "pointerId", "<init>", "(JLfr/k;)V", "a", "J", "()J", "b", "(J)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private long pointerId;

            public /* synthetic */ d(long j15, k kVar) {
                this(j15);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final long getPointerId() {
                return this.pointerId;
            }

            public final void b(long j15) {
                this.pointerId = j15;
            }

            private d(long j15) {
                super(null);
                this.pointerId = j15;
            }

            public /* synthetic */ d(long j15, int i15, k kVar) {
                this((i15 & 1) != 0 ? a0.a(Long.MAX_VALUE) : j15, null);
            }
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f231303a;

        static {
            int[] iArr = new int[a.C6218a.EnumC6219a.values().length];
            try {
                iArr[a.C6218a.EnumC6219a.NotInitialized.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f231303a = iArr;
        }
    }

    public h1(t0 t0Var) {
        this.node = t0Var;
        e.Companion companion = e.INSTANCE;
        this.previousPositionOnScreen = companion.b();
        this.touchSmooth = new l1();
        this.offsetSmoother = new y1();
        this.nodeOffset = companion.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final a.C6218a a() {
        a.C6218a c6218a = this._awaitDownState;
        if (c6218a != null) {
            return c6218a;
        }
        a.C6218a c6218a2 = new a.C6218a(null, false, 3, 0 == true ? 1 : 0);
        this._awaitDownState = c6218a2;
        return c6218a2;
    }

    private final a.b b() {
        a.b bVar = this._awaitGesturePickupState;
        if (bVar != null) {
            return bVar;
        }
        a.b bVar2 = new a.b(null, 0L, null, 7, null);
        this._awaitGesturePickupState = bVar2;
        return bVar2;
    }

    private final a.c c() {
        a.c cVar = this._awaitTouchSlopState;
        if (cVar != null) {
            return cVar;
        }
        a.c cVar2 = new a.c(null, 0L, false, 7, null);
        this._awaitTouchSlopState = cVar2;
        return cVar2;
    }

    private final a.d d() {
        a.d dVar = this._draggingState;
        if (dVar != null) {
            return dVar;
        }
        a.d dVar2 = new a.d(0L, 1, null);
        this._draggingState = dVar2;
        return dVar2;
    }

    private final void e() {
        a.C6218a c6218aA = a();
        c6218aA.c(a.C6218a.EnumC6219a.NotInitialized);
        c6218aA.d(false);
        this.currentDragState = c6218aA;
    }

    private final void f(IndirectPointerInputChange initialDown, long pointerId, g3 touchSlopDetector) {
        a.b bVarB = b();
        bVarB.c(initialDown);
        bVarB.d(pointerId);
        g3.h(touchSlopDetector, 0L, 1, null);
        bVarB.e(touchSlopDetector);
        this.currentDragState = bVarB;
    }

    private final void g(IndirectPointerInputChange initialDown, long pointerId, long initialTouchSlopPositionChange, boolean verifyConsumptionInFinalPass) {
        a.c cVarC = c();
        cVarC.d(initialDown);
        cVarC.e(pointerId);
        g3 g3Var = this.touchSlopDetector;
        if (g3Var == null) {
            this.touchSlopDetector = new g3(this.node.getOrientationLock(), 0L, 2, null);
        } else {
            if (g3Var != null) {
                g3Var.i(this.node.getOrientationLock());
            }
            g3 g3Var2 = this.touchSlopDetector;
            if (g3Var2 != null) {
                g3Var2.g(initialTouchSlopPositionChange);
            }
        }
        cVarC.f(verifyConsumptionInFinalPass);
        this.currentDragState = cVarC;
    }

    static /* synthetic */ void h(h1 h1Var, IndirectPointerInputChange indirectPointerInputChange, long j15, long j16, boolean z15, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            j16 = e.INSTANCE.c();
        }
        long j17 = j16;
        if ((i15 & 8) != 0) {
            z15 = false;
        }
        h1Var.g(indirectPointerInputChange, j15, j17, z15);
    }

    private final void i(long pointerId) {
        a.d dVarD = d();
        dVarD.b(pointerId);
        this.currentDragState = dVarD;
    }

    private final void j(c indirectPointerInputEvent, q pass, a.b state) {
        boolean z15;
        if (pass != q.Final) {
            return;
        }
        List<IndirectPointerInputChange> listB = indirectPointerInputEvent.b();
        int size = listB.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                z15 = true;
                break;
            } else {
                if (listB.get(i15).getIsConsumed()) {
                    z15 = false;
                    break;
                }
                i15++;
            }
        }
        List<IndirectPointerInputChange> listB2 = indirectPointerInputEvent.b();
        int size2 = listB2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            if (listB2.get(i16).getPressed()) {
                if (indirectPointerInputEvent.b().isEmpty()) {
                    break;
                }
                if (z15) {
                    long jP = e.p(i1.l((IndirectPointerInputChange) v.l0(indirectPointerInputEvent.b()), this.node.getOrientationLock(), d.d(indirectPointerInputEvent.getPrimaryDirectionalMotionAxis())), i1.l(state.getInitialDown(), this.node.getOrientationLock(), d.d(indirectPointerInputEvent.getPrimaryDirectionalMotionAxis())));
                    IndirectPointerInputChange initialDown = state.getInitialDown();
                    if (initialDown == null) {
                        throw new IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.");
                    }
                    h(this, initialDown, state.getPointerId(), jP, false, 8, null);
                    return;
                }
                return;
            }
        }
        e();
    }

    private final void k(c indirectPointerInputEvent, q pass, a.c state) {
        IndirectPointerInputChange indirectPointerInputChange;
        IndirectPointerInputChange indirectPointerInputChange2;
        IndirectPointerInputChange indirectPointerInputChange3;
        if (pass == q.Initial) {
            return;
        }
        List<IndirectPointerInputChange> listB = indirectPointerInputEvent.b();
        int size = listB.size();
        int i15 = 0;
        while (true) {
            indirectPointerInputChange = null;
            if (i15 >= size) {
                indirectPointerInputChange2 = null;
                break;
            }
            indirectPointerInputChange2 = listB.get(i15);
            if (a0.b(indirectPointerInputChange2.getId(), state.getPointerId())) {
                break;
            } else {
                i15++;
            }
        }
        IndirectPointerInputChange indirectPointerInputChange4 = indirectPointerInputChange2;
        if (indirectPointerInputChange4 == null) {
            List<IndirectPointerInputChange> listB2 = indirectPointerInputEvent.b();
            int size2 = listB2.size();
            int i16 = 0;
            while (true) {
                if (i16 >= size2) {
                    indirectPointerInputChange3 = null;
                    break;
                }
                indirectPointerInputChange3 = listB2.get(i16);
                if (indirectPointerInputChange3.getPressed()) {
                    break;
                } else {
                    i16++;
                }
            }
            indirectPointerInputChange4 = indirectPointerInputChange3;
            if (indirectPointerInputChange4 == null) {
                e();
                return;
            }
            state.e(indirectPointerInputChange4.getId());
        }
        IndirectPointerInputChange indirectPointerInputChange5 = indirectPointerInputChange4;
        if (pass == q.Main) {
            if (indirectPointerInputChange5.getIsConsumed()) {
                IndirectPointerInputChange initialDown = state.getInitialDown();
                if (initialDown == null) {
                    throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                }
                long pointerId = state.getPointerId();
                g3 g3Var = this.touchSlopDetector;
                if (g3Var == null) {
                    throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
                f(initialDown, pointerId, g3Var);
            } else if (i1.h(indirectPointerInputChange5)) {
                List<IndirectPointerInputChange> listB3 = indirectPointerInputEvent.b();
                int size3 = listB3.size();
                for (int i17 = 0; i17 < size3; i17++) {
                    IndirectPointerInputChange indirectPointerInputChange6 = listB3.get(i17);
                    if (indirectPointerInputChange6.getPressed()) {
                        indirectPointerInputChange = indirectPointerInputChange6;
                        break;
                    }
                }
                IndirectPointerInputChange indirectPointerInputChange7 = indirectPointerInputChange;
                if (indirectPointerInputChange7 == null) {
                    e();
                } else {
                    state.e(indirectPointerInputChange7.getId());
                }
            } else {
                long jD = g3.d(o(), i1.j(indirectPointerInputChange5, this.node.getOrientationLock(), d.d(indirectPointerInputEvent.getPrimaryDirectionalMotionAxis())), q0.p((f3) f.a(this.node, g1.u()), p0.INSTANCE.d()), false, 4, null);
                if ((9223372034707292159L & jD) != 9205357640488583168L) {
                    indirectPointerInputChange5.a();
                    t(state.getInitialDown(), indirectPointerInputChange5, d.d(indirectPointerInputEvent.getPrimaryDirectionalMotionAxis()), jD);
                    s(indirectPointerInputChange5, d.d(indirectPointerInputEvent.getPrimaryDirectionalMotionAxis()), jD);
                    i(indirectPointerInputChange5.getId());
                } else {
                    state.f(true);
                }
            }
        }
        if (pass == q.Final && state.getVerifyConsumptionInFinalPass()) {
            if (!indirectPointerInputChange5.getIsConsumed()) {
                state.f(false);
                return;
            }
            IndirectPointerInputChange initialDown2 = state.getInitialDown();
            if (initialDown2 == null) {
                throw new IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
            }
            long pointerId2 = state.getPointerId();
            g3 g3Var2 = this.touchSlopDetector;
            if (g3Var2 == null) {
                throw new IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
            }
            f(initialDown2, pointerId2, g3Var2);
        }
    }

    private final void l(c indirectPointerInputEvent, q pass, a.d state) {
        IndirectPointerInputChange indirectPointerInputChange;
        IndirectPointerInputChange indirectPointerInputChange2;
        if (pass != q.Main) {
            return;
        }
        long pointerId = state.getPointerId();
        List<IndirectPointerInputChange> listB = indirectPointerInputEvent.b();
        int size = listB.size();
        int i15 = 0;
        while (true) {
            indirectPointerInputChange = null;
            if (i15 >= size) {
                indirectPointerInputChange2 = null;
                break;
            }
            indirectPointerInputChange2 = listB.get(i15);
            if (a0.b(indirectPointerInputChange2.getId(), pointerId)) {
                break;
            } else {
                i15++;
            }
        }
        IndirectPointerInputChange indirectPointerInputChange3 = indirectPointerInputChange2;
        if (indirectPointerInputChange3 == null) {
            return;
        }
        if (!i1.h(indirectPointerInputChange3)) {
            if (indirectPointerInputChange3.getIsConsumed()) {
                r();
                return;
            } else {
                if (e.k(i1.j(indirectPointerInputChange3, this.node.getOrientationLock(), d.d(indirectPointerInputEvent.getPrimaryDirectionalMotionAxis()))) == 0.0f) {
                    return;
                }
                s(indirectPointerInputChange3, d.d(indirectPointerInputEvent.getPrimaryDirectionalMotionAxis()), i1.i(indirectPointerInputChange3, this.node.getOrientationLock(), d.d(indirectPointerInputEvent.getPrimaryDirectionalMotionAxis())));
                indirectPointerInputChange3.a();
                return;
            }
        }
        List<IndirectPointerInputChange> listB2 = indirectPointerInputEvent.b();
        int size2 = listB2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            IndirectPointerInputChange indirectPointerInputChange4 = listB2.get(i16);
            if (indirectPointerInputChange4.getPressed()) {
                indirectPointerInputChange = indirectPointerInputChange4;
                break;
            }
        }
        IndirectPointerInputChange indirectPointerInputChange5 = indirectPointerInputChange;
        if (indirectPointerInputChange5 != null) {
            state.b(indirectPointerInputChange5.getId());
            return;
        }
        if (indirectPointerInputChange3.getIsConsumed() || !i1.h(indirectPointerInputChange3)) {
            r();
        } else {
            u(indirectPointerInputChange3, d.d(indirectPointerInputEvent.getPrimaryDirectionalMotionAxis()));
        }
        e();
    }

    private final void n(c indirectPointerInputEvent, q pass, a.C6218a state) {
        if (!indirectPointerInputEvent.b().isEmpty()) {
            List<IndirectPointerInputChange> listB = indirectPointerInputEvent.b();
            int size = listB.size();
            for (int i15 = 0; i15 < size; i15++) {
                if (!i1.g(listB.get(i15))) {
                    return;
                }
            }
            IndirectPointerInputChange indirectPointerInputChange = (IndirectPointerInputChange) v.l0(indirectPointerInputEvent.b());
            a.C6218a.EnumC6219a awaitTouchSlop = b.f231303a[state.getAwaitTouchSlop().ordinal()] == 1 ? !this.node.getStartDragImmediately() ? a.C6218a.EnumC6219a.Yes : a.C6218a.EnumC6219a.No : state.getAwaitTouchSlop();
            state.c(awaitTouchSlop);
            if (pass == q.Initial && awaitTouchSlop == a.C6218a.EnumC6219a.No) {
                indirectPointerInputChange.a();
                state.d(true);
            }
            if (pass == q.Main) {
                if (awaitTouchSlop == a.C6218a.EnumC6219a.Yes) {
                    h(this, indirectPointerInputChange, indirectPointerInputChange.getId(), 0L, false, 12, null);
                } else if (state.getConsumedOnInitial()) {
                    d dVarD = d.d(indirectPointerInputEvent.getPrimaryDirectionalMotionAxis());
                    e.Companion companion = e.INSTANCE;
                    t(indirectPointerInputChange, indirectPointerInputChange, dVarD, companion.c());
                    s(indirectPointerInputChange, d.d(indirectPointerInputEvent.getPrimaryDirectionalMotionAxis()), companion.c());
                    i(indirectPointerInputChange.getId());
                }
            }
        }
    }

    private final g3 o() {
        g3 g3Var = this.touchSlopDetector;
        if (g3Var != null) {
            return g3Var;
        }
        throw new IllegalArgumentException("Touch slop detector not initialized.");
    }

    private final g p() {
        g gVar = this.velocityTracker;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalArgumentException("Velocity Tracker not initialized.");
    }

    private final void r() {
        this.node.P3(m0.a.f231448a);
    }

    private final void s(IndirectPointerInputChange change, d primaryDirectionalMotionAxis, long dragAmount) {
        long jI = c0.i(h.q(this.node));
        if (!e.j(this.previousPositionOnScreen, e.INSTANCE.b()) && !e.j(jI, this.previousPositionOnScreen)) {
            this.nodeOffset = e.q(this.nodeOffset, e.p(jI, this.previousPositionOnScreen));
        }
        this.previousPositionOnScreen = jI;
        if (Math.abs(Function1.j(dragAmount, this.node.getOrientationLock())) > 2.0f) {
            i1.f(p(), change, this.node.getOrientationLock(), primaryDirectionalMotionAxis, this.touchSmooth, this.nodeOffset);
            this.node.P3(new m0.b(this.offsetSmoother.d(dragAmount), true, null));
        }
    }

    private final void t(IndirectPointerInputChange down, IndirectPointerInputChange slopTriggerChange, d primaryDirectionalMotionAxis, long overSlopOffset) {
        if (this.velocityTracker == null) {
            this.velocityTracker = new g();
        }
        this.nodeOffset = e.INSTANCE.c();
        i1.f(p(), down, this.node.getOrientationLock(), primaryDirectionalMotionAxis, this.touchSmooth, this.nodeOffset);
        long jP = e.p(i1.l(slopTriggerChange, this.node.getOrientationLock(), primaryDirectionalMotionAxis), overSlopOffset);
        if (this.node.E3().b(p0.f(p0.INSTANCE.d())).booleanValue()) {
            this.previousPositionOnScreen = c0.i(h.q(this.node));
            this.node.P3(new m0.c(jP, null));
        }
        this.offsetSmoother.c();
    }

    private final void u(IndirectPointerInputChange change, d primaryDirectionalMotionAxis) {
        i1.f(p(), change, this.node.getOrientationLock(), primaryDirectionalMotionAxis, this.touchSmooth, this.nodeOffset);
        float f15 = ((f3) f.a(this.node, g1.u())).f();
        long jB = p().b(z.a(f15, f15));
        p().d();
        this.node.P3(new m0.d(Function1.l(jB), true, null));
    }

    public final void m(c indirectPointerInputEvent, q pass) {
        if (this.currentDragState == null) {
            this.currentDragState = a();
        }
        a aVar = this.currentDragState;
        if (aVar == null) {
            throw new IllegalArgumentException("currentDragState should not be null");
        }
        if (aVar instanceof a.C6218a) {
            n(indirectPointerInputEvent, pass, (a.C6218a) aVar);
            return;
        }
        if (aVar instanceof a.c) {
            k(indirectPointerInputEvent, pass, (a.c) aVar);
        } else if (aVar instanceof a.b) {
            j(indirectPointerInputEvent, pass, (a.b) aVar);
        } else {
            if (!(aVar instanceof a.d)) {
                throw new p();
            }
            l(indirectPointerInputEvent, pass, (a.d) aVar);
        }
    }

    public final void q() {
        e();
        if (this.node.getIsListeningForEvents()) {
            r();
        }
        this.velocityTracker = null;
        this.offsetSmoother.c();
    }
}
