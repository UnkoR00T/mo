package androidx.compose.foundation;

import a4.PointerInputChange;
import a4.k0;
import a4.o;
import a4.w0;
import a4.y0;
import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.f3;
import androidx.compose.ui.platform.g1;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.l;
import er.p;
import er.q;
import fr.t;
import g4.j1;
import java.util.List;
import ju.d2;
import ju.p0;
import ju.z0;
import n4.f0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import p143z0.b2;
import p143z0.b3;
import p143z0.c3;
import p143z0.i1;
import r0.m0;
import r0.x;
import vq.k;
import w0.g0;
import w0.r1;
import x3.IndirectPointerInputChange;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b'\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0084\u0001B\u007f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010'J}\u0010)\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b)\u0010*J\u0013\u0010,\u001a\u00020\u0004*\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\n2\u0006\u0010#\u001a\u00020.H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\n2\u0006\u0010#\u001a\u00020.H\u0014¢\u0006\u0004\b1\u00100J\u000f\u00102\u001a\u00020\u0004H\u0014¢\u0006\u0004\b2\u0010'J\u000f\u00103\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u0010'J\u0017\u00106\u001a\u00020\u00042\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00042\u0006\u00105\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u001f\u0010>\u001a\u00020\u00042\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u000204H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u00020\u00042\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u000208H\u0002¢\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\"H\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0004H\u0002¢\u0006\u0004\bG\u0010'J\u0017\u0010H\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\"H\u0002¢\u0006\u0004\bJ\u0010FJ\u0017\u0010L\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\nH\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u0004H\u0002¢\u0006\u0004\bN\u0010'R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010RR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010MR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020Z0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020^0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010\\R\u001a\u0010c\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\f\n\u0004\ba\u0010U\u0012\u0004\bb\u0010'R\u0018\u0010f\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010i\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010k\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010hR\u0016\u0010m\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010UR\u0016\u0010o\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010UR\u0016\u0010r\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010t\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010UR\u0018\u0010w\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010y\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010hR\u0018\u0010{\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010hR\u0016\u0010}\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010UR\u0016\u0010\u007f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010UR\u0018\u0010\u0081\u0001\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010qR\u0018\u0010\u0083\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010U¨\u0006\u0085\u0001"}, d2 = {"Landroidx/compose/foundation/e;", "Lg4/e;", "Landroidx/compose/foundation/a;", "Lkotlin/Function0;", "Loq/i0;", "onClick", "", "onLongClickLabel", "onLongClick", "onDoubleClick", "", "hapticFeedbackEnabled", "Lb1/l;", "interactionSource", "Lw0/r1;", "indicationNodeFactory", "useLocalIndication", "enabled", "onClickLabel", "Ln4/l;", "role", "<init>", "(Ler/a;Ljava/lang/String;Ler/a;Ler/a;ZLb1/l;Lw0/r1;ZZLjava/lang/String;Ln4/l;Lfr/k;)V", "La4/y0;", i.f37090q, "()La4/y0;", "La4/o;", "pointerEvent", "La4/q;", "pass", "Lc5/r;", "bounds", "Y", "(La4/o;La4/q;J)V", "Lx3/c;", "event", "v2", "(Lx3/c;La4/q;)V", "Z1", "()V", "m2", "J4", "(Ler/a;Ljava/lang/String;Ler/a;Ler/a;Lb1/l;Lw0/r1;ZZLjava/lang/String;Ln4/l;)V", "Ln4/i0;", "F3", "(Ln4/i0;)V", "Ly3/b;", "b4", "(Landroid/view/KeyEvent;)Z", "c4", "a4", "Y2", "La4/b0;", "down", "B4", "(La4/b0;)V", "Lx3/f;", "C4", "(Lx3/f;)V", "", "uptimeMillis", "downChange", "F4", "(JLa4/b0;)V", "G4", "(JLx3/f;)V", "E4", "(La4/o;J)V", "indirectPointerEvent", "D4", "(Lx3/c;)V", "A4", "x4", "(La4/o;)V", "y4", "indirectPointer", "w4", "(Z)V", i.f37091r, "r0", "Ljava/lang/String;", "s0", "Ler/a;", "t0", "u0", "Z", "z4", "()Z", "I4", "Lr0/m0;", "Lju/d2;", "v0", "Lr0/m0;", "longKeyPressJobs", "Landroidx/compose/foundation/e$a;", "w0", "doubleKeyClickStates", "x0", "isSuspendingPointerInputEnabled$annotations", "isSuspendingPointerInputEnabled", "y0", "La4/b0;", "downEvent", "z0", "Lju/d2;", "longPressJob", "A0", "tapJob", "B0", "isSecondTap", "C0", "longPressTriggered", "D0", "J", "firstTapUpTime", "E0", "ignoreNextUp", "F0", "Lx3/f;", "indirectDownEvent", "G0", "indirectLongPressJob", "H0", "indirectTapJob", "I0", "indirectIsSecondTap", "J0", "indirectLongPressTriggered", "K0", "indirectFirstTapUpTime", "L0", "indirectIgnoreNextUp", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e extends androidx.compose.foundation.a implements g4.e {

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    private d2 tapJob;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    private boolean isSecondTap;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    private boolean longPressTriggered;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    private long firstTapUpTime;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    private boolean ignoreNextUp;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private IndirectPointerInputChange indirectDownEvent;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    private d2 indirectLongPressJob;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    private d2 indirectTapJob;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private boolean indirectIsSecondTap;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private boolean indirectLongPressTriggered;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private long indirectFirstTapUpTime;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    private boolean indirectIgnoreNextUp;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    private String onLongClickLabel;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> onLongClick;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> onDoubleClick;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private boolean hapticFeedbackEnabled;

    /* JADX INFO: renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private final m0<d2> longKeyPressJobs;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private final m0<a> doubleKeyClickStates;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    private final boolean isSuspendingPointerInputEnabled;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    private PointerInputChange downEvent;

    /* JADX INFO: renamed from: z0, reason: collision with root package name and from kotlin metadata */
    private d2 longPressJob;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/e$a;", "", "Lju/d2;", "job", "<init>", "(Lju/d2;)V", "a", "Lju/d2;", "b", "()Lju/d2;", "", "Z", "()Z", "c", "(Z)V", "doubleTapMinTimeMillisElapsed", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final d2 job;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean doubleTapMinTimeMillisElapsed;

        public a(d2 d2Var) {
            this.job = d2Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getDoubleTapMinTimeMillisElapsed() {
            return this.doubleTapMinTimeMillisElapsed;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final d2 getJob() {
            return this.job;
        }

        public final void c(boolean z15) {
            this.doubleTapMinTimeMillisElapsed = z15;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements PointerInputEventHandler {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz0/b2;", "Lm3/e;", "offset", "Loq/i0;", "<anonymous>", "(Lz0/b2;Lm3/e;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends k implements q<b2, m3.e, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f9608e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f9609f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            /* synthetic */ long f9610g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ e f9611h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, tq.e<? super a> eVar2) {
                super(3, eVar2);
                this.f9611h = eVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f9608e;
                if (i15 == 0) {
                    u.b(obj);
                    b2 b2Var = (b2) this.f9609f;
                    long j15 = this.f9610g;
                    if (this.f9611h.getEnabled()) {
                        e eVar = this.f9611h;
                        this.f9608e = 1;
                        if (eVar.R3(b2Var, j15, this) == objE) {
                            return objE;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return i0.f148189a;
            }

            public final Object M(b2 b2Var, long j15, tq.e<? super i0> eVar) {
                a aVar = new a(this.f9611h, eVar);
                aVar.f9609f = b2Var;
                aVar.f9610g = j15;
                return aVar.J(i0.f148189a);
            }

            @Override // er.q
            public /* bridge */ /* synthetic */ Object w(b2 b2Var, m3.e eVar, tq.e<? super i0> eVar2) {
                return M(b2Var, eVar.getPackedValue(), eVar2);
            }
        }

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 d(e eVar, m3.e eVar2) {
            er.a aVar = eVar.onDoubleClick;
            if (aVar != null) {
                aVar.a();
            }
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 e(e eVar, m3.e eVar2) {
            er.a aVar = eVar.onLongClick;
            if (aVar != null) {
                aVar.a();
            }
            if (eVar.getHapticFeedbackEnabled()) {
                ((v3.a) g4.f.a(eVar, g1.j())).a(v3.b.INSTANCE.f());
            }
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 f(e eVar, m3.e eVar2) {
            if (eVar.getEnabled()) {
                eVar.Q3().a();
            }
            return i0.f148189a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(k0 k0Var, tq.e<? super i0> eVar) {
            l lVar;
            l lVar2;
            if (!e.this.getEnabled() || e.this.onDoubleClick == null) {
                lVar = null;
            } else {
                final e eVar2 = e.this;
                lVar = new l() { // from class: androidx.compose.foundation.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return e.b.d(eVar2, (m3.e) obj);
                    }
                };
            }
            if (!e.this.getEnabled() || e.this.onLongClick == null) {
                lVar2 = null;
            } else {
                final e eVar3 = e.this;
                lVar2 = new l() { // from class: androidx.compose.foundation.g
                    @Override // er.l
                    public final Object b(Object obj) {
                        return e.b.e(eVar3, (m3.e) obj);
                    }
                };
            }
            a aVar = new a(e.this, null);
            final e eVar4 = e.this;
            Object objH = b3.h(k0Var, lVar, lVar2, aVar, new l() { // from class: androidx.compose.foundation.h
                @Override // er.l
                public final Object b(Object obj) {
                    return e.b.f(eVar4, (m3.e) obj);
                }
            }, eVar);
            return objH == uq.b.e() ? objH : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9612e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f9612e;
            if (i15 == 0) {
                u.b(obj);
                long jC = ((f3) g4.f.a(e.this, g1.u())).c();
                this.f9612e = 1;
                if (z0.b(jC, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            er.a aVar = e.this.onLongClick;
            if (aVar != null) {
                aVar.a();
            }
            if (e.this.getHapticFeedbackEnabled()) {
                ((v3.a) g4.f.a(e.this, g1.j())).a(v3.b.INSTANCE.f());
            }
            e.this.longPressTriggered = true;
            d2 d2Var = e.this.tapJob;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            e.this.tapJob = null;
            e.this.longPressJob = null;
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return e.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9614e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f9614e;
            if (i15 == 0) {
                u.b(obj);
                long jC = ((f3) g4.f.a(e.this, g1.u())).c();
                this.f9614e = 1;
                if (z0.b(jC, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            er.a aVar = e.this.onLongClick;
            if (aVar != null) {
                aVar.a();
            }
            if (e.this.getHapticFeedbackEnabled()) {
                ((v3.a) g4.f.a(e.this, g1.j())).a(v3.b.INSTANCE.f());
            }
            e.this.indirectLongPressTriggered = true;
            d2 d2Var = e.this.indirectTapJob;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            e.this.indirectTapJob = null;
            e.this.indirectLongPressJob = null;
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return e.this.new d(eVar);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class C0197e extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9616e;

        C0197e(tq.e<? super C0197e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f9616e;
            if (i15 == 0) {
                u.b(obj);
                long jA = ((f3) g4.f.a(e.this, g1.u())).a();
                this.f9616e = 1;
                if (z0.b(jA, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            e.this.Q3().a();
            e.this.tapJob = null;
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((C0197e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return e.this.new C0197e(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class f extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9618e;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f9618e;
            if (i15 == 0) {
                u.b(obj);
                long jA = ((f3) g4.f.a(e.this, g1.u())).a();
                this.f9618e = 1;
                if (z0.b(jA, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            e.this.Q3().a();
            e.this.indirectTapJob = null;
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return e.this.new f(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class g extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9620e;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f9620e;
            if (i15 == 0) {
                u.b(obj);
                long jC = ((f3) g4.f.a(e.this, g1.u())).c();
                this.f9620e = 1;
                if (z0.b(jC, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            er.a aVar = e.this.onLongClick;
            if (aVar != null) {
                aVar.a();
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((g) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return e.this.new g(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class h extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f9622e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f9623f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f9624g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f9626j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(long j15, tq.e<? super h> eVar) {
            super(2, eVar);
            this.f9626j = j15;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
        
            if (ju.z0.b(r4 - r6, r10) == r0) goto L18;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r10.f9624g
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r11)
                goto L63
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                long r4 = r10.f9623f
                long r6 = r10.f9622e
                oq.u.b(r11)
                goto L46
            L22:
                oq.u.b(r11)
                androidx.compose.foundation.e r11 = androidx.compose.foundation.e.this
                m2.b4 r1 = androidx.compose.ui.platform.g1.u()
                java.lang.Object r11 = g4.f.a(r11, r1)
                androidx.compose.ui.platform.f3 r11 = (androidx.compose.ui.platform.f3) r11
                long r6 = r11.b()
                long r4 = r11.a()
                r10.f9622e = r6
                r10.f9623f = r4
                r10.f9624g = r3
                java.lang.Object r11 = ju.z0.b(r6, r10)
                if (r11 != r0) goto L46
                goto L62
            L46:
                androidx.compose.foundation.e r11 = androidx.compose.foundation.e.this
                r0.m0 r11 = androidx.compose.foundation.e.k4(r11)
                long r8 = r10.f9626j
                java.lang.Object r11 = r11.b(r8)
                androidx.compose.foundation.e$a r11 = (androidx.compose.foundation.e.a) r11
                if (r11 == 0) goto L59
                r11.c(r3)
            L59:
                long r4 = r4 - r6
                r10.f9624g = r2
                java.lang.Object r11 = ju.z0.b(r4, r10)
                if (r11 != r0) goto L63
            L62:
                return r0
            L63:
                androidx.compose.foundation.e r11 = androidx.compose.foundation.e.this
                er.a r11 = r11.Q3()
                r11.a()
                oq.i0 r11 = oq.i0.f148189a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.e.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((h) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return e.this.new h(this.f9626j, eVar);
        }
    }

    public /* synthetic */ e(er.a aVar, String str, er.a aVar2, er.a aVar3, boolean z15, b1.l lVar, r1 r1Var, boolean z16, boolean z17, String str2, n4.l lVar2, fr.k kVar) {
        this(aVar, str, aVar2, aVar3, z15, lVar, r1Var, z16, z17, str2, lVar2);
    }

    private final void A4() {
        if (this.longPressTriggered || !getEnabled() || this.onLongClick == null) {
            return;
        }
        d2 d2Var = this.longPressJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.longPressJob = null;
        er.a<i0> aVar = this.onLongClick;
        if (aVar != null) {
            aVar.a();
        }
        if (this.hapticFeedbackEnabled) {
            ((v3.a) g4.f.a(this, g1.j())).a(v3.b.INSTANCE.f());
        }
        this.longPressTriggered = true;
    }

    private final void B4(PointerInputChange down) {
        down.a();
        this.downEvent = down;
        if (getEnabled()) {
            d2 d2Var = this.tapJob;
            if (d2Var != null && d2Var.h()) {
                if (down.getUptimeMillis() - this.firstTapUpTime < ((f3) g4.f.a(this, g1.u())).b()) {
                    this.ignoreNextUp = true;
                    return;
                }
                this.isSecondTap = true;
                d2 d2Var2 = this.tapJob;
                if (d2Var2 != null) {
                    d2.a.a(d2Var2, null, 1, null);
                }
                this.tapJob = null;
            }
            this.longPressTriggered = false;
            if (g0.isDelayPressesUsingGestureConsumptionEnabled) {
                V3(down);
            } else {
                X3(down.getPosition(), false);
            }
            if (this.onLongClick != null) {
                this.longPressJob = ju.k.d(M2(), null, null, new c(null), 3, null);
            }
        }
    }

    private final void C4(IndirectPointerInputChange down) {
        down.a();
        this.indirectDownEvent = down;
        if (getEnabled()) {
            d2 d2Var = this.indirectTapJob;
            if (d2Var != null && d2Var.h()) {
                if (down.getUptimeMillis() - this.indirectFirstTapUpTime < ((f3) g4.f.a(this, g1.u())).b()) {
                    this.indirectIgnoreNextUp = true;
                    return;
                }
                this.indirectIsSecondTap = true;
                d2 d2Var2 = this.indirectTapJob;
                if (d2Var2 != null) {
                    d2.a.a(d2Var2, null, 1, null);
                }
                this.indirectTapJob = null;
            }
            this.indirectLongPressTriggered = false;
            if (g0.isDelayPressesUsingGestureConsumptionEnabled) {
                W3(down);
            } else {
                X3(down.getPosition(), true);
            }
            if (this.onLongClick != null) {
                this.indirectLongPressJob = ju.k.d(M2(), null, null, new d(null), 3, null);
            }
        }
    }

    private final void D4(x3.c indirectPointerEvent) {
        float fG = ((f3) g4.f.a(this, g1.u())).g();
        List<IndirectPointerInputChange> listB = indirectPointerEvent.b();
        int size = listB.size();
        for (int i15 = 0; i15 < size; i15++) {
            IndirectPointerInputChange indirectPointerInputChange = listB.get(i15);
            boolean z15 = Math.abs(m3.e.k(m3.e.p(indirectPointerInputChange.getPosition(), this.indirectDownEvent.getPosition()))) > fG;
            if (indirectPointerInputChange.getIsConsumed() || z15) {
                w4(true);
                return;
            }
        }
    }

    private final void E4(o pointerEvent, long bounds) {
        long jP3 = P3(bounds);
        List<PointerInputChange> listC = pointerEvent.c();
        int size = listC.size();
        for (int i15 = 0; i15 < size; i15++) {
            PointerInputChange pointerInputChange = listC.get(i15);
            if (pointerInputChange.q() || a4.p.f(pointerInputChange, bounds, jP3)) {
                w4(false);
                return;
            }
        }
    }

    private final void F4(long uptimeMillis, PointerInputChange downChange) {
        if (getEnabled() && !this.ignoreNextUp) {
            U3(downChange.getPosition(), false);
            this.firstTapUpTime = uptimeMillis;
            if (!this.longPressTriggered) {
                if (this.isSecondTap) {
                    er.a<i0> aVar = this.onDoubleClick;
                    if (aVar != null) {
                        aVar.a();
                    }
                } else if (this.onDoubleClick != null) {
                    this.tapJob = ju.k.d(M2(), null, null, new C0197e(null), 3, null);
                } else {
                    Q3().a();
                }
            }
        }
        this.downEvent = null;
        this.ignoreNextUp = false;
        this.isSecondTap = false;
        d2 d2Var = this.longPressJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.longPressJob = null;
        this.longPressTriggered = false;
    }

    private final void G4(long uptimeMillis, IndirectPointerInputChange downChange) {
        if (getEnabled() && !this.indirectIgnoreNextUp) {
            U3(downChange.getPosition(), true);
            this.indirectFirstTapUpTime = uptimeMillis;
            if (!this.indirectLongPressTriggered) {
                if (this.indirectIsSecondTap) {
                    er.a<i0> aVar = this.onDoubleClick;
                    if (aVar != null) {
                        aVar.a();
                    }
                } else if (this.onDoubleClick != null) {
                    this.indirectTapJob = ju.k.d(M2(), null, null, new f(null), 3, null);
                } else {
                    Q3().a();
                }
            }
        }
        this.indirectDownEvent = null;
        this.indirectIgnoreNextUp = false;
        this.indirectIsSecondTap = false;
        d2 d2Var = this.indirectLongPressJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.indirectLongPressJob = null;
        this.indirectLongPressTriggered = false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x004a A[LOOP:0: B:5:0x0018->B:15:0x004a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[LOOP:2: B:20:0x0065->B:30:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0056 A[EDGE_INSN: B:34:0x0056->B:17:0x0056 BREAK  A[LOOP:0: B:5:0x0018->B:15:0x004a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0099 A[EDGE_INSN: B:39:0x0099->B:31:0x0099 BREAK  A[LOOP:2: B:20:0x0065->B:30:0x0096], SYNTHETIC] */
    private final void H4() {
        long j15;
        long j16;
        long j17;
        m0<d2> m0Var = this.longKeyPressJobs;
        Object[] objArr = m0Var.values;
        long[] jArr = m0Var.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i15 = 0;
            j15 = 128;
            j16 = 255;
            while (true) {
                long j18 = jArr[i15];
                j17 = -9187201950435737472L;
                if ((((~j18) << 7) & j18 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i15 != length) {
                        break;
                        break;
                    }
                    i15++;
                } else {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((j18 & 255) < 128) {
                            d2.a.a((d2) objArr[(i15 << 3) + i17], null, 1, null);
                        }
                        j18 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    } else if (i15 != length) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        } else {
            j15 = 128;
            j16 = 255;
            j17 = -9187201950435737472L;
        }
        m0Var.g();
        m0<a> m0Var2 = this.doubleKeyClickStates;
        Object[] objArr2 = m0Var2.values;
        long[] jArr2 = m0Var2.metadata;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i18 = 0;
            while (true) {
                long j19 = jArr2[i18];
                if ((((~j19) << 7) & j19 & j17) == j17) {
                    if (i18 != length2) {
                        break;
                        break;
                    }
                    i18++;
                } else {
                    int i19 = 8 - ((~(i18 - length2)) >>> 31);
                    for (int i25 = 0; i25 < i19; i25++) {
                        if ((j19 & j16) < j15) {
                            d2.a.a(((a) objArr2[(i18 << 3) + i25]).getJob(), null, 1, null);
                        }
                        j19 >>= 8;
                    }
                    if (i19 != 8) {
                        break;
                    } else if (i18 != length2) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
        }
        m0Var2.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v4(e eVar) {
        er.a<i0> aVar = eVar.onLongClick;
        if (aVar == null) {
            return true;
        }
        aVar.a();
        return true;
    }

    private final void w4(boolean indirectPointer) {
        if (indirectPointer) {
            this.indirectDownEvent = null;
            d2 d2Var = this.indirectLongPressJob;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            this.indirectLongPressJob = null;
            d2 d2Var2 = this.indirectTapJob;
            if (d2Var2 != null) {
                d2.a.a(d2Var2, null, 1, null);
            }
            this.indirectTapJob = null;
            this.indirectIsSecondTap = false;
            this.indirectLongPressTriggered = false;
            this.indirectFirstTapUpTime = -1L;
            this.indirectIgnoreNextUp = false;
        } else {
            this.downEvent = null;
            d2 d2Var3 = this.longPressJob;
            if (d2Var3 != null) {
                d2.a.a(d2Var3, null, 1, null);
            }
            this.longPressJob = null;
            d2 d2Var4 = this.tapJob;
            if (d2Var4 != null) {
                d2.a.a(d2Var4, null, 1, null);
            }
            this.tapJob = null;
            this.isSecondTap = false;
            this.longPressTriggered = false;
            this.firstTapUpTime = -1L;
            this.ignoreNextUp = false;
        }
        S3(indirectPointer);
    }

    private final void x4(o pointerEvent) {
        if (this.downEvent == null || this.longPressTriggered) {
            return;
        }
        List<PointerInputChange> listC = pointerEvent.c();
        int size = listC.size();
        for (int i15 = 0; i15 < size; i15++) {
            PointerInputChange pointerInputChange = listC.get(i15);
            if (pointerInputChange.q() && !t.c(pointerInputChange, this.downEvent)) {
                w4(false);
                return;
            }
        }
    }

    private final void y4(x3.c indirectPointerEvent) {
        if (this.indirectDownEvent == null || this.indirectLongPressTriggered) {
            return;
        }
        List<IndirectPointerInputChange> listB = indirectPointerEvent.b();
        int size = listB.size();
        for (int i15 = 0; i15 < size; i15++) {
            IndirectPointerInputChange indirectPointerInputChange = listB.get(i15);
            if (indirectPointerInputChange.getIsConsumed() && !t.c(indirectPointerInputChange, this.indirectDownEvent)) {
                w4(true);
                return;
            }
        }
    }

    @Override // androidx.compose.foundation.a
    public void F3(n4.i0 i0Var) {
        if (this.onLongClick != null) {
            f0.D(i0Var, this.onLongClickLabel, new er.a() { // from class: androidx.compose.foundation.d
                @Override // er.a
                public final Object a() {
                    return Boolean.valueOf(e.v4(this.f9595a));
                }
            });
        }
    }

    @Override // androidx.compose.foundation.a
    public y0 H3() {
        if (this.isSuspendingPointerInputEnabled) {
            return w0.a(new b());
        }
        return null;
    }

    public final void I4(boolean z15) {
        this.hapticFeedbackEnabled = z15;
    }

    public final void J4(er.a<i0> onClick, String onLongClickLabel, er.a<i0> onLongClick, er.a<i0> onDoubleClick, b1.l interactionSource, r1 indicationNodeFactory, boolean useLocalIndication, boolean enabled, String onClickLabel, n4.l role) {
        boolean z15;
        if (!t.c(this.onLongClickLabel, onLongClickLabel)) {
            this.onLongClickLabel = onLongClickLabel;
            j1.d(this);
        }
        if ((this.onLongClick == null) != (onLongClick == null)) {
            L3();
            j1.d(this);
            z15 = true;
        } else {
            z15 = false;
        }
        this.onLongClick = onLongClick;
        if ((this.onDoubleClick == null) != (onDoubleClick == null)) {
            z15 = true;
        }
        this.onDoubleClick = onDoubleClick;
        if (getEnabled() != enabled) {
            z15 = true;
        }
        i4(interactionSource, indicationNodeFactory, useLocalIndication, enabled, onClickLabel, role, onClick);
        if (z15) {
            g4();
            w4(false);
            w4(true);
        }
    }

    @Override // androidx.compose.foundation.a, g4.f1
    public void Y(o pointerEvent, a4.q pass, long bounds) {
        super.Y(pointerEvent, pass, bounds);
        if (this.isSuspendingPointerInputEnabled) {
            return;
        }
        if (pass != a4.q.Main) {
            if (pass == a4.q.Final) {
                x4(pointerEvent);
                return;
            }
            return;
        }
        if (this.downEvent == null) {
            if (b3.k(pointerEvent, true, false, 2, null)) {
                B4(pointerEvent.c().get(0));
                return;
            }
            return;
        }
        if (c3.b(pointerEvent)) {
            A4();
        }
        if (!this.longPressTriggered) {
            List<PointerInputChange> listC = pointerEvent.c();
            int size = listC.size();
            for (int i15 = 0; i15 < size; i15++) {
                if (!a4.p.c(listC.get(i15))) {
                    E4(pointerEvent, bounds);
                    return;
                }
            }
            PointerInputChange pointerInputChange = pointerEvent.c().get(0);
            pointerInputChange.a();
            F4(pointerInputChange.getUptimeMillis(), this.downEvent);
            return;
        }
        List<PointerInputChange> listC2 = pointerEvent.c();
        int size2 = listC2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            if (!a4.p.d(listC2.get(i16))) {
                List<PointerInputChange> listC3 = pointerEvent.c();
                int size3 = listC3.size();
                for (int i17 = 0; i17 < size3; i17++) {
                    listC3.get(i17).a();
                }
                return;
            }
        }
        PointerInputChange pointerInputChange2 = pointerEvent.c().get(0);
        pointerInputChange2.a();
        F4(pointerInputChange2.getUptimeMillis(), this.downEvent);
    }

    @Override // f3.m.c
    public void Y2() {
        super.Y2();
        H4();
    }

    @Override // androidx.compose.foundation.a, g4.f1
    public void Z1() {
        super.Z1();
        w4(false);
    }

    @Override // androidx.compose.foundation.a
    protected void a4() {
        H4();
    }

    @Override // androidx.compose.foundation.a
    protected boolean b4(KeyEvent event) {
        boolean z15;
        long jA = y3.d.a(event);
        if (this.onLongClick == null || this.longKeyPressJobs.b(jA) != null) {
            z15 = false;
        } else {
            this.longKeyPressJobs.q(jA, ju.k.d(M2(), null, null, new g(null), 3, null));
            z15 = true;
        }
        a aVarB = this.doubleKeyClickStates.b(jA);
        if (aVarB != null) {
            if (aVarB.getJob().h()) {
                d2.a.a(aVarB.getJob(), null, 1, null);
                if (!aVarB.getDoubleTapMinTimeMillisElapsed()) {
                    Q3().a();
                    this.doubleKeyClickStates.n(jA);
                    return z15;
                }
            } else {
                this.doubleKeyClickStates.n(jA);
            }
        }
        return z15;
    }

    @Override // androidx.compose.foundation.a
    protected boolean c4(KeyEvent event) {
        er.a<i0> aVar;
        long jA = y3.d.a(event);
        boolean z15 = false;
        if (this.longKeyPressJobs.b(jA) != null) {
            d2 d2VarB = this.longKeyPressJobs.b(jA);
            if (d2VarB != null) {
                if (d2VarB.h()) {
                    d2.a.a(d2VarB, null, 1, null);
                } else {
                    z15 = true;
                }
            }
            this.longKeyPressJobs.n(jA);
        }
        if (this.onDoubleClick != null) {
            if (this.doubleKeyClickStates.b(jA) != null) {
                if (!z15 && (aVar = this.onDoubleClick) != null) {
                    aVar.a();
                }
                this.doubleKeyClickStates.n(jA);
            } else if (!z15) {
                this.doubleKeyClickStates.q(jA, new a(ju.k.d(M2(), null, null, new h(jA, null), 3, null)));
            }
        } else if (!z15) {
            Q3().a();
        }
        return true;
    }

    @Override // x3.g
    public void m2() {
        w4(true);
    }

    @Override // androidx.compose.foundation.a, x3.g
    public void v2(x3.c event, a4.q pass) {
        super.v2(event, pass);
        if (pass != a4.q.Main) {
            if (pass == a4.q.Final) {
                y4(event);
                return;
            }
            return;
        }
        if (this.indirectDownEvent == null) {
            List<IndirectPointerInputChange> listB = event.b();
            int size = listB.size();
            for (int i15 = 0; i15 < size; i15++) {
                if (i1.g(listB.get(i15))) {
                    C4(event.b().get(0));
                    return;
                }
            }
            return;
        }
        if (!this.indirectLongPressTriggered) {
            List<IndirectPointerInputChange> listB2 = event.b();
            int size2 = listB2.size();
            for (int i16 = 0; i16 < size2; i16++) {
                if (!androidx.compose.foundation.b.i(listB2.get(i16))) {
                    D4(event);
                    return;
                }
            }
            IndirectPointerInputChange indirectPointerInputChange = event.b().get(0);
            indirectPointerInputChange.a();
            G4(indirectPointerInputChange.getUptimeMillis(), this.indirectDownEvent);
            return;
        }
        List<IndirectPointerInputChange> listB3 = event.b();
        int size3 = listB3.size();
        for (int i17 = 0; i17 < size3; i17++) {
            if (!androidx.compose.foundation.b.j(listB3.get(i17))) {
                List<IndirectPointerInputChange> listB4 = event.b();
                int size4 = listB4.size();
                for (int i18 = 0; i18 < size4; i18++) {
                    listB4.get(i18).a();
                }
                return;
            }
        }
        IndirectPointerInputChange indirectPointerInputChange2 = event.b().get(0);
        indirectPointerInputChange2.a();
        G4(indirectPointerInputChange2.getUptimeMillis(), this.indirectDownEvent);
    }

    /* JADX INFO: renamed from: z4, reason: from getter */
    public final boolean getHapticFeedbackEnabled() {
        return this.hapticFeedbackEnabled;
    }

    private e(er.a<i0> aVar, String str, er.a<i0> aVar2, er.a<i0> aVar3, boolean z15, b1.l lVar, r1 r1Var, boolean z16, boolean z17, String str2, n4.l lVar2) {
        super(lVar, r1Var, z16, z17, str2, lVar2, aVar, null);
        this.onLongClickLabel = str;
        this.onLongClick = aVar2;
        this.onDoubleClick = aVar3;
        this.hapticFeedbackEnabled = z15;
        this.longKeyPressJobs = x.a();
        this.doubleKeyClickStates = x.a();
        this.isSuspendingPointerInputEnabled = !g0.isNonSuspendingPointerInputInCombinedClickableEnabled;
        this.firstTapUpTime = -1L;
        this.indirectFirstTapUpTime = -1L;
    }
}
