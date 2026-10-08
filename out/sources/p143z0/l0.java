package p143z0;

import a4.PointerInputChange;
import a4.a0;
import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lz0/l0;", "", "<init>", "()V", "a", "c", "b", "d", "Lz0/l0$a;", "Lz0/l0$b;", "Lz0/l0$c;", "Lz0/l0$d;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
abstract class l0 {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lz0/l0$a;", "Lz0/l0;", "Lz0/l0$a$a;", "awaitTouchSlop", "", "consumedOnInitial", "<init>", "(Lz0/l0$a$a;Z)V", "a", "Lz0/l0$a$a;", "()Lz0/l0$a$a;", "c", "(Lz0/l0$a$a;)V", "b", "Z", "()Z", "d", "(Z)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private EnumC6222a awaitTouchSlop;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean consumedOnInitial;

        /* JADX INFO: renamed from: z0.l0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lz0/l0$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum EnumC6222a {
            Yes,
            No,
            NotInitialized;


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ wq.a f231423e = wq.b.a(b());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC6222a getAwaitTouchSlop() {
            return this.awaitTouchSlop;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getConsumedOnInitial() {
            return this.consumedOnInitial;
        }

        public final void c(EnumC6222a enumC6222a) {
            this.awaitTouchSlop = enumC6222a;
        }

        public final void d(boolean z15) {
            this.consumedOnInitial = z15;
        }

        public a(EnumC6222a enumC6222a, boolean z15) {
            super(null);
            this.awaitTouchSlop = enumC6222a;
            this.consumedOnInitial = z15;
        }

        public /* synthetic */ a(EnumC6222a enumC6222a, boolean z15, int i15, k kVar) {
            this((i15 & 1) != 0 ? EnumC6222a.NotInitialized : enumC6222a, (i15 & 2) != 0 ? false : z15);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lz0/l0$b;", "Lz0/l0;", "La4/b0;", "initialDown", "La4/a0;", "pointerId", "Lz0/g3;", "touchSlopDetector", "<init>", "(La4/b0;JLz0/g3;Lfr/k;)V", "a", "La4/b0;", "()La4/b0;", "c", "(La4/b0;)V", "b", "J", "()J", "d", "(J)V", "Lz0/g3;", "getTouchSlopDetector", "()Lz0/g3;", "e", "(Lz0/g3;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private PointerInputChange initialDown;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private long pointerId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private g3 touchSlopDetector;

        public /* synthetic */ b(PointerInputChange pointerInputChange, long j15, g3 g3Var, k kVar) {
            this(pointerInputChange, j15, g3Var);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PointerInputChange getInitialDown() {
            return this.initialDown;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getPointerId() {
            return this.pointerId;
        }

        public final void c(PointerInputChange pointerInputChange) {
            this.initialDown = pointerInputChange;
        }

        public final void d(long j15) {
            this.pointerId = j15;
        }

        public final void e(g3 g3Var) {
            this.touchSlopDetector = g3Var;
        }

        private b(PointerInputChange pointerInputChange, long j15, g3 g3Var) {
            super(null);
            this.initialDown = pointerInputChange;
            this.pointerId = j15;
            this.touchSlopDetector = g3Var;
        }

        public /* synthetic */ b(PointerInputChange pointerInputChange, long j15, g3 g3Var, int i15, k kVar) {
            this((i15 & 1) != 0 ? null : pointerInputChange, (i15 & 2) != 0 ? a0.a(Long.MAX_VALUE) : j15, (i15 & 4) != 0 ? null : g3Var, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lz0/l0$c;", "Lz0/l0;", "La4/b0;", "initialDown", "La4/a0;", "pointerId", "", "verifyConsumptionInFinalPass", "<init>", "(La4/b0;JZLfr/k;)V", "a", "La4/b0;", "()La4/b0;", "d", "(La4/b0;)V", "b", "J", "()J", "e", "(J)V", "c", "Z", "()Z", "f", "(Z)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private PointerInputChange initialDown;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private long pointerId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean verifyConsumptionInFinalPass;

        public /* synthetic */ c(PointerInputChange pointerInputChange, long j15, boolean z15, k kVar) {
            this(pointerInputChange, j15, z15);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PointerInputChange getInitialDown() {
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

        public final void d(PointerInputChange pointerInputChange) {
            this.initialDown = pointerInputChange;
        }

        public final void e(long j15) {
            this.pointerId = j15;
        }

        public final void f(boolean z15) {
            this.verifyConsumptionInFinalPass = z15;
        }

        private c(PointerInputChange pointerInputChange, long j15, boolean z15) {
            super(null);
            this.initialDown = pointerInputChange;
            this.pointerId = j15;
            this.verifyConsumptionInFinalPass = z15;
        }

        public /* synthetic */ c(PointerInputChange pointerInputChange, long j15, boolean z15, int i15, k kVar) {
            this((i15 & 1) != 0 ? null : pointerInputChange, (i15 & 2) != 0 ? a0.a(Long.MAX_VALUE) : j15, (i15 & 4) != 0 ? false : z15, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lz0/l0$d;", "Lz0/l0;", "La4/a0;", "pointerId", "<init>", "(JLfr/k;)V", "a", "J", "()J", "b", "(J)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends l0 {

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

    public /* synthetic */ l0(k kVar) {
        this();
    }

    private l0() {
    }
}
