package a4;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR.\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010$\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010\u0003\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"La4/l0;", "La4/i0;", "<init>", "()V", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "d", "Ler/l;", "l", "()Ler/l;", "o", "(Ler/l;)V", "onTouchEvent", "La4/s0;", "value", "e", "La4/s0;", "getRequestDisallowInterceptTouchEvent", "()La4/s0;", "p", "(La4/s0;)V", "requestDisallowInterceptTouchEvent", "f", "Z", "a", "()Z", "m", "(Z)V", "disallowIntercept", "La4/h0;", "g", "La4/h0;", "w", "()La4/h0;", "getPointerInputFilter$annotations", "pointerInputFilter", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l0 implements i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public er.l<? super MotionEvent, Boolean> onTouchEvent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private s0 requestDisallowInterceptTouchEvent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean disallowIntercept;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final h0 pointerInputFilter = new b();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"La4/l0$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private enum a {
        Unknown,
        Dispatching,
        NotDispatching;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f2700e = wq.b.a(b());
    }

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001d"}, d2 = {"a4/l0$b", "La4/h0;", "Loq/i0;", "i", "()V", "La4/o;", "pointerEvent", "", "shouldConsume", "h", "(La4/o;Z)V", "j", "(La4/o;)V", "La4/q;", "pass", "Lc5/r;", "bounds", "e", "(La4/o;La4/q;J)V", "d", "La4/l0$a;", "b", "La4/l0$a;", "state", "c", "La4/o;", "lastEventDispatchedToInitialPass", "()Z", "shareWithSiblings", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends h0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private a state = a.Unknown;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private o lastEventDispatchedToInitialPass;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "Loq/i0;", "c", "(Landroid/view/MotionEvent;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends fr.w implements er.l<MotionEvent, oq.i0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ l0 f2705c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l0 l0Var) {
                super(1);
                this.f2705c = l0Var;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ oq.i0 b(MotionEvent motionEvent) {
                c(motionEvent);
                return oq.i0.f148189a;
            }

            public final void c(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    this.f2705c.l().b(motionEvent);
                } else {
                    b.this.state = this.f2705c.l().b(motionEvent).booleanValue() ? a.Dispatching : a.NotDispatching;
                }
            }
        }

        /* JADX INFO: renamed from: a4.l0$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "Loq/i0;", "c", "(Landroid/view/MotionEvent;)V"}, k = 3, mv = {2, 1, 0})
        static final class C0038b extends fr.w implements er.l<MotionEvent, oq.i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l0 f2706b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0038b(l0 l0Var) {
                super(1);
                this.f2706b = l0Var;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ oq.i0 b(MotionEvent motionEvent) {
                c(motionEvent);
                return oq.i0.f148189a;
            }

            public final void c(MotionEvent motionEvent) {
                this.f2706b.l().b(motionEvent);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "Loq/i0;", "c", "(Landroid/view/MotionEvent;)V"}, k = 3, mv = {2, 1, 0})
        static final class c extends fr.w implements er.l<MotionEvent, oq.i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l0 f2707b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(l0 l0Var) {
                super(1);
                this.f2707b = l0Var;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ oq.i0 b(MotionEvent motionEvent) {
                c(motionEvent);
                return oq.i0.f148189a;
            }

            public final void c(MotionEvent motionEvent) {
                this.f2707b.l().b(motionEvent);
            }
        }

        b() {
        }

        private final void h(o pointerEvent, boolean shouldConsume) {
            List<PointerInputChange> listC = pointerEvent.c();
            List<PointerInputChange> list = listC;
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                if (listC.get(i15).q()) {
                    j(pointerEvent);
                    return;
                }
            }
            p036e4.b0 layoutCoordinates = getLayoutCoordinates();
            if (layoutCoordinates == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            n0.c(pointerEvent, layoutCoordinates.A0(m3.e.INSTANCE.c()), new a(l0.this));
            if (this.state == a.Dispatching) {
                if (shouldConsume) {
                    int size2 = list.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        listC.get(i16).a();
                    }
                }
                h internalPointerEvent = pointerEvent.getInternalPointerEvent();
                if (internalPointerEvent != null) {
                    internalPointerEvent.e(!l0.this.getDisallowIntercept());
                }
            }
        }

        private final void i() {
            this.state = a.Unknown;
            l0.this.m(false);
            this.lastEventDispatchedToInitialPass = null;
        }

        private final void j(o pointerEvent) {
            if (this.state == a.Dispatching) {
                p036e4.b0 layoutCoordinates = getLayoutCoordinates();
                if (layoutCoordinates == null) {
                    throw new IllegalStateException("layoutCoordinates not set");
                }
                n0.b(pointerEvent, layoutCoordinates.A0(m3.e.INSTANCE.c()), new c(l0.this));
            }
            this.state = a.NotDispatching;
        }

        @Override // a4.h0
        public boolean c() {
            return true;
        }

        @Override // a4.h0
        public void d() {
            if (this.state == a.Dispatching) {
                n0.a(SystemClock.uptimeMillis(), new C0038b(l0.this));
                i();
            }
        }

        @Override // a4.h0
        public void e(o pointerEvent, q pass, long bounds) {
            boolean z15;
            boolean z16;
            boolean z17;
            List<PointerInputChange> listC = pointerEvent.c();
            List<PointerInputChange> list = listC;
            int size = list.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size) {
                    z15 = true;
                    break;
                }
                PointerInputChange pointerInputChange = listC.get(i15);
                if (p.b(pointerInputChange) || p.d(pointerInputChange)) {
                    z15 = false;
                    break;
                }
                i15++;
            }
            if (!z15) {
                z16 = false;
                break;
            }
            int size2 = list.size();
            int i16 = 0;
            while (true) {
                if (i16 >= size2) {
                    z16 = true;
                    break;
                } else {
                    if (listC.get(i16).q()) {
                        z16 = false;
                        break;
                    }
                    i16++;
                }
            }
            if (l0.this.getDisallowIntercept()) {
                z17 = true;
                break;
            }
            int size3 = list.size();
            int i17 = 0;
            while (true) {
                if (i17 >= size3) {
                    if (!z16) {
                        z17 = false;
                        break;
                    }
                    break;
                } else {
                    PointerInputChange pointerInputChange2 = listC.get(i17);
                    if (!p.b(pointerInputChange2) && !p.d(pointerInputChange2)) {
                        i17++;
                    }
                }
                z17 = true;
                break;
            }
            if (this.state != a.NotDispatching) {
                if (pass == q.Initial && z17) {
                    this.lastEventDispatchedToInitialPass = pointerEvent;
                    h(pointerEvent, !z15 || l0.this.getDisallowIntercept());
                }
                if (pass == q.Main && z15 && fr.t.c(pointerEvent, this.lastEventDispatchedToInitialPass) && l0.this.getDisallowIntercept()) {
                    int size4 = list.size();
                    for (int i18 = 0; i18 < size4; i18++) {
                        listC.get(i18).a();
                    }
                }
                if (pass == q.Final && !z17 && !fr.t.c(pointerEvent, this.lastEventDispatchedToInitialPass)) {
                    h(pointerEvent, true);
                }
            }
            if (pass == q.Final) {
                int size5 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size5) {
                        i();
                        break;
                    } else if (!p.d(listC.get(i19))) {
                        break;
                    } else {
                        i19++;
                    }
                }
                if (fr.t.c(pointerEvent, this.lastEventDispatchedToInitialPass) && z15) {
                    int size6 = list.size();
                    for (int i25 = 0; i25 < size6; i25++) {
                        if (listC.get(i25).q()) {
                            if (l0.this.getDisallowIntercept()) {
                                break;
                            }
                            j(pointerEvent);
                            return;
                        }
                    }
                    int size7 = list.size();
                    for (int i26 = 0; i26 < size7; i26++) {
                        listC.get(i26).a();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getDisallowIntercept() {
        return this.disallowIntercept;
    }

    public final er.l<MotionEvent, Boolean> l() {
        er.l lVar = this.onTouchEvent;
        if (lVar != null) {
            return lVar;
        }
        return null;
    }

    public final void m(boolean z15) {
        this.disallowIntercept = z15;
    }

    public final void o(er.l<? super MotionEvent, Boolean> lVar) {
        this.onTouchEvent = lVar;
    }

    public final void p(s0 s0Var) {
        s0 s0Var2 = this.requestDisallowInterceptTouchEvent;
        if (s0Var2 != null) {
            s0Var2.e(null);
        }
        this.requestDisallowInterceptTouchEvent = s0Var;
        if (s0Var != null) {
            s0Var.e(this);
        }
    }

    @Override // a4.i0
    /* JADX INFO: renamed from: w, reason: from getter */
    public h0 getPointerInputFilter() {
        return this.pointerInputFilter;
    }
}
