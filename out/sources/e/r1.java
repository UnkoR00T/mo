package e;

import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p071kotlin.Metadata;
import v.j3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u00012B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u00122\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000eH\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010'\u001a\u00020\u000e¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010'\u001a\u00020\u001f¢\u0006\u0004\b*\u0010+J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010'\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b,\u0010-J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010'\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b.\u0010-J\u000f\u0010/\u001a\u00020\u0012H\u0016¢\u0006\u0004\b/\u00100J\u001d\u00102\u001a\u00020\u00122\f\u00101\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u000e¢\u0006\u0004\b4\u00105R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b2\u00106\u001a\u0004\b7\u00108R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010C\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010BR \u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120E0D8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010K\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010N\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010P\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bO\u0010MR\u0016\u0010R\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010QR\u0018\u0010U\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010TR(\u0010Z\u001a\u0004\u0018\u00010A2\b\u0010'\u001a\u0004\u0018\u00010A8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bW\u0010X\"\u0004\b9\u0010Y¨\u0006["}, d2 = {"Le/r1;", "Le/z1;", "Le/p2$a;", "Le/b0;", "cameraProperties", "Lc/a;", "aeModeDisabler", "Le/u2;", "threads", "<init>", "(Le/b0;Lc/a;Le/u2;)V", "", "Lo/j2;", "useCases", "", "l", "(Ljava/util/Set;)I", "Lju/w0;", "Loq/i0;", "v", "()Lju/w0;", "", "myRevision", "j", "(J)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "m", "(Ljava/lang/Exception;)V", "flashMode", "", "tryExternalFlashAeMode", "preferredAeMode", "o", "(IZLjava/lang/Integer;)I", "template", "n", "(I)I", "value", "r", "(I)Lju/w0;", "u", "(Z)Lju/w0;", "s", "(Ljava/lang/Integer;)Lju/w0;", "t", "reset", "()V", "runningUseCases", "a", "(Ljava/util/Set;)V", "p", "()I", "Le/b0;", "getCameraProperties", "()Le/b0;", "b", "Lc/a;", "c", "Le/u2;", "", "d", "Ljava/lang/Object;", "lock", "Le/f2;", "Le/f2;", "_requestControl", "", "Lju/x;", "f", "Ljava/util/List;", "pendingSignals", "g", "J", "currentRevision", "h", "I", "_flashMode", "i", "_template", "Z", "_tryExternalFlashAeMode", "k", "Ljava/lang/Integer;", "_preferredAeMode", "_preferredFocusMode", "q", "()Le/f2;", "(Le/f2;)V", "requestControl", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r1 implements z1, p2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 cameraProperties;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c.a aeModeDisabler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u2 threads;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private f2 _requestControl;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long currentRevision;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean _tryExternalFlashAeMode;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Integer _preferredAeMode;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Integer _preferredFocusMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<ju.x<oq.i0>> pendingSignals = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int _flashMode = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int _template = 1;

    /* JADX INFO: renamed from: e.r1$a, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0082\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0015\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"Le/r1$a;", "", "", "flashMode", "template", "", "tryExternalFlashAeMode", "preferredAeMode", "preferredFocusMode", "<init>", "(IIZLjava/lang/Integer;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "d", "c", "Z", "e", "()Z", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class StateSnapshot {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int flashMode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int template;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean tryExternalFlashAeMode;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer preferredAeMode;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer preferredFocusMode;

        public StateSnapshot(int i15, int i16, boolean z15, Integer num, Integer num2) {
            this.flashMode = i15;
            this.template = i16;
            this.tryExternalFlashAeMode = z15;
            this.preferredAeMode = num;
            this.preferredFocusMode = num2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getFlashMode() {
            return this.flashMode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getPreferredAeMode() {
            return this.preferredAeMode;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getPreferredFocusMode() {
            return this.preferredFocusMode;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getTemplate() {
            return this.template;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getTryExternalFlashAeMode() {
            return this.tryExternalFlashAeMode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StateSnapshot)) {
                return false;
            }
            StateSnapshot stateSnapshot = (StateSnapshot) other;
            return this.flashMode == stateSnapshot.flashMode && this.template == stateSnapshot.template && this.tryExternalFlashAeMode == stateSnapshot.tryExternalFlashAeMode && fr.t.c(this.preferredAeMode, stateSnapshot.preferredAeMode) && fr.t.c(this.preferredFocusMode, stateSnapshot.preferredFocusMode);
        }

        public int hashCode() {
            int iHashCode = ((((Integer.hashCode(this.flashMode) * 31) + Integer.hashCode(this.template)) * 31) + Boolean.hashCode(this.tryExternalFlashAeMode)) * 31;
            Integer num = this.preferredAeMode;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.preferredFocusMode;
            return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            return "StateSnapshot(flashMode=" + this.flashMode + ", template=" + this.template + ", tryExternalFlashAeMode=" + this.tryExternalFlashAeMode + ", preferredAeMode=" + this.preferredAeMode + ", preferredFocusMode=" + this.preferredFocusMode + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46254e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Set f46255f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ r1 f46256g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tq.e eVar, Set set, r1 r1Var) {
            super(2, eVar);
            this.f46255f = set;
            this.f46256g = r1Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            boolean z15;
            uq.b.e();
            if (this.f46254e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (!this.f46255f.isEmpty()) {
                int iL = this.f46256g.l(this.f46255f);
                synchronized (this.f46256g.lock) {
                    if (this.f46256g._template != iL) {
                        this.f46256g._template = iL;
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                }
                if (z15) {
                    this.f46256g.v();
                }
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new b(eVar, this.f46255f, this.f46256g);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class c extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46257e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ r1 f46258f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ fr.o0 f46259g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tq.e eVar, r1 r1Var, fr.o0 o0Var) {
            super(2, eVar);
            this.f46258f = r1Var;
            this.f46259g = o0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f46257e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f46258f.j(this.f46259g.f66408a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((c) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new c(eVar, this.f46258f, this.f46259g);
        }
    }

    public r1(b0 b0Var, c.a aVar, u2 u2Var) {
        this.cameraProperties = b0Var;
        this.aeModeDisabler = aVar;
        this.threads = u2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(long myRevision) {
        boolean z15;
        StateSnapshot stateSnapshot;
        final List listF1;
        f2 f2Var = get_requestControl();
        if (f2Var == null) {
            m(new o.j.a("Camera is not active."));
            return;
        }
        synchronized (this.lock) {
            z15 = myRevision == this.currentRevision;
        }
        if (z15) {
            synchronized (this.lock) {
                stateSnapshot = new StateSnapshot(this._flashMode, this._template, this._tryExternalFlashAeMode, this._preferredAeMode, this._preferredFocusMode);
            }
            int iO = o(stateSnapshot.getFlashMode(), stateSnapshot.getTryExternalFlashAeMode(), stateSnapshot.getPreferredAeMode());
            Integer preferredFocusMode = stateSnapshot.getPreferredFocusMode();
            try {
                ju.w0 w0VarJ = f2.j(f2Var, pq.v0.l(oq.y.a(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(z.d(this.cameraProperties.getMetadata(), iO))), oq.y.a(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(z.e(this.cameraProperties.getMetadata(), preferredFocusMode != null ? preferredFocusMode.intValue() : n(stateSnapshot.getTemplate())))), oq.y.a(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(z.f(this.cameraProperties.getMetadata(), 1)))), null, null, 6, null);
                synchronized (this.lock) {
                    listF1 = pq.v.f1(this.pendingSignals);
                }
                w0VarJ.C0(new er.l() { // from class: e.q1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return r1.k(listF1, this, (Throwable) obj);
                    }
                });
            } catch (Exception e15) {
                m(e15);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(List list, r1 r1Var, Throwable th4) {
        if (th4 != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ju.x) it.next()).p(th4);
            }
        } else {
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                ((ju.x) it4.next()).d0(oq.i0.f148189a);
            }
        }
        synchronized (r1Var.lock) {
            r1Var.pendingSignals.removeAll(list);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int l(Set<? extends o.j2> useCases) {
        v.n1 n1VarL;
        j3 j3VarN = new PRN.r0(useCases, false, 2, null).n();
        if (j3VarN == null || (n1VarL = j3VarN.l()) == null) {
            return 1;
        }
        Integer numValueOf = Integer.valueOf(n1VarL.j());
        Integer num = numValueOf.intValue() != -1 ? numValueOf : null;
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    private final void m(Exception e15) {
        List listF1;
        synchronized (this.lock) {
            listF1 = pq.v.f1(this.pendingSignals);
            this.pendingSignals.clear();
        }
        Iterator it = listF1.iterator();
        while (it.hasNext()) {
            ((ju.x) it.next()).p(e15);
        }
    }

    private final int n(int template) {
        return (template == 1 || template != 3) ? 4 : 3;
    }

    private final int o(int flashMode, boolean tryExternalFlashAeMode, Integer preferredAeMode) {
        int iA;
        if (preferredAeMode != null) {
            iA = preferredAeMode.intValue();
        } else if (flashMode != 0) {
            iA = flashMode != 1 ? 1 : 3;
        } else {
            iA = this.aeModeDisabler.a(2);
        }
        if (tryExternalFlashAeMode && z.h(this.cameraProperties.getMetadata())) {
            e.c cVar = e.c.f45719a;
            if (o.e1.f("CXCP")) {
                String unused = e.c.TRUNCATED_TAG;
            }
            iA = 5;
        }
        e.c cVar2 = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused2 = e.c.TRUNCATED_TAG;
        }
        return iA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ju.w0<oq.i0> v() {
        ju.x<oq.i0> xVarC = ju.z.c(null, 1, null);
        fr.o0 o0Var = new fr.o0();
        synchronized (this.lock) {
            this.pendingSignals.add(xVarC);
            long j15 = this.currentRevision + 1;
            this.currentRevision = j15;
            o0Var.f66408a = j15;
            oq.i0 i0Var = oq.i0.f148189a;
        }
        ju.k.d(this.threads.getSequentialScope(), null, null, new c(null, this, o0Var), 3, null);
        return xVarC;
    }

    @Override // e.p2.a
    public void a(Set<? extends o.j2> runningUseCases) {
        ju.k.d(this.threads.getSequentialScope(), null, null, new b(null, pq.v.k1(runningUseCases), this), 3, null);
    }

    @Override // e.z1
    public void b(f2 f2Var) {
        this._requestControl = f2Var;
        v();
    }

    public final int p() {
        int iD;
        synchronized (this.lock) {
            iD = z.d(this.cameraProperties.getMetadata(), o(this._flashMode, this._tryExternalFlashAeMode, this._preferredAeMode));
        }
        return iD;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public f2 get_requestControl() {
        return this._requestControl;
    }

    public final ju.w0<oq.i0> r(int value) {
        synchronized (this.lock) {
            this._flashMode = value;
            oq.i0 i0Var = oq.i0.f148189a;
        }
        return v();
    }

    @Override // e.z1
    public void reset() {
        synchronized (this.lock) {
            this._tryExternalFlashAeMode = false;
            this._preferredAeMode = null;
            this._preferredFocusMode = null;
            this._flashMode = 2;
            this._template = 1;
            oq.i0 i0Var = oq.i0.f148189a;
        }
        v();
    }

    public final ju.w0<oq.i0> s(Integer value) {
        synchronized (this.lock) {
            this._preferredAeMode = value;
            oq.i0 i0Var = oq.i0.f148189a;
        }
        return v();
    }

    public final ju.w0<oq.i0> t(Integer value) {
        synchronized (this.lock) {
            this._preferredFocusMode = value;
            oq.i0 i0Var = oq.i0.f148189a;
        }
        return v();
    }

    public final ju.w0<oq.i0> u(boolean value) {
        synchronized (this.lock) {
            this._tryExternalFlashAeMode = value;
            oq.i0 i0Var = oq.i0.f148189a;
        }
        return v();
    }
}
