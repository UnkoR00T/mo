package g3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.input.InputManager;
import android.os.Handler;
import android.os.Looper;
import android.view.InputDevice;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.n3;
import er.l;
import er.p;
import f3.t;
import fr.w;
import j6.f1;
import j6.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.p0;
import mu.g;
import mu.i;
import ob.n;
import ob.u;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.r;
import p076m2.r0;
import p076m2.s0;
import tq.e;
import vq.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a%\u0010\u001a\u001a\u00020\u0010*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0019\u0010\u001e\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\"\u001a\u0010#\u001a\u00020\u0010*\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Landroid/content/Context;", "context", "Landroid/view/View;", "view", "Landroidx/compose/ui/platform/n3;", "windowInfo", "Lf3/t;", "k", "(Landroid/content/Context;Landroid/view/View;Landroidx/compose/ui/platform/n3;Lm2/r;I)Lf3/t;", "Lob/u;", "layoutInfo", "Lf3/t$b;", "m", "(Lob/u;)Ljava/lang/String;", "Landroid/hardware/input/InputManager;", "inputManager", "", "f", "(Landroid/hardware/input/InputManager;)Z", "Lf3/t$a;", "l", "(Landroid/hardware/input/InputManager;)Ljava/lang/String;", "Landroid/view/InputDevice;", "", "source", "axis", "g", "(Landroid/view/InputDevice;II)Z", "Landroid/content/Intent;", "intent", "i", "(Landroid/content/Intent;)Z", "Lj6/f1;", "j", "(Lj6/f1;)Z", "isImeVisible", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: g3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class C1587a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f70122e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f70123f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ g3.c f70124g;

        /* JADX INFO: renamed from: g3.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lob/u;", "layout", "Loq/i0;", "<anonymous>", "(Lob/u;)V"}, k = 3, mv = {2, 1, 0})
        static final class C1588a extends k implements p<u, e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f70125e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f70126f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ g3.c f70127g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1588a(g3.c cVar, e<? super C1588a> eVar) {
                super(2, eVar);
                this.f70127g = cVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f70125e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                this.f70127g.f(a.m((u) this.f70126f));
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(u uVar, e<? super i0> eVar) {
                return ((C1588a) v(uVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final e<i0> v(Object obj, e<?> eVar) {
                C1588a c1588a = new C1588a(this.f70127g, eVar);
                c1588a.f70126f = obj;
                return c1588a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1587a(Context context, g3.c cVar, e<? super C1587a> eVar) {
            super(2, eVar);
            this.f70123f = context;
            this.f70124g = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f70122e;
            if (i15 == 0) {
                oq.u.b(obj);
                g<u> gVarB = n.INSTANCE.d(this.f70123f).b(this.f70123f);
                C1588a c1588a = new C1588a(this.f70124g, null);
                this.f70122e = 1;
                if (i.j(gVarB, c1588a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((C1587a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new C1587a(this.f70123f, this.f70124g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm2/s0;", "Lm2/r0;", "c", "(Lm2/s0;)Lm2/r0;"}, k = 3, mv = {2, 1, 0})
    static final class b extends w implements l<s0, r0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InputManager f70128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g3.c f70129c;

        /* JADX INFO: renamed from: g3.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"g3/a$b$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C1589a implements r0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InputManager f70130a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1590b f70131b;

            public C1589a(InputManager inputManager, C1590b c1590b) {
                this.f70130a = inputManager;
                this.f70131b = c1590b;
            }

            @Override // p076m2.r0
            public void j() {
                this.f70130a.unregisterInputDeviceListener(this.f70131b);
            }
        }

        /* JADX INFO: renamed from: g3.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"g3/a$b$b", "Landroid/hardware/input/InputManager$InputDeviceListener;", "", "id", "Loq/i0;", "onInputDeviceAdded", "(I)V", "onInputDeviceRemoved", "onInputDeviceChanged", "a", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C1590b implements InputManager.InputDeviceListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ g3.c f70132a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ InputManager f70133b;

            C1590b(g3.c cVar, InputManager inputManager) {
                this.f70132a = cVar;
                this.f70133b = inputManager;
            }

            public final void a() {
                this.f70132a.d(a.l(this.f70133b));
                this.f70132a.b(a.f(this.f70133b));
            }

            @Override // android.hardware.input.InputManager.InputDeviceListener
            public void onInputDeviceAdded(int id5) {
                a();
            }

            @Override // android.hardware.input.InputManager.InputDeviceListener
            public void onInputDeviceChanged(int id5) {
                a();
            }

            @Override // android.hardware.input.InputManager.InputDeviceListener
            public void onInputDeviceRemoved(int id5) {
                a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InputManager inputManager, g3.c cVar) {
            super(1);
            this.f70128b = inputManager;
            this.f70129c = cVar;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final r0 b(s0 s0Var) {
            C1590b c1590b = new C1590b(this.f70129c, this.f70128b);
            this.f70128b.registerInputDeviceListener(c1590b, new Handler(Looper.getMainLooper()));
            c1590b.a();
            return new C1589a(this.f70128b, c1590b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm2/s0;", "Lm2/r0;", "e", "(Lm2/s0;)Lm2/r0;"}, k = 3, mv = {2, 1, 0})
    static final class c extends w implements l<s0, r0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f70134b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g3.c f70135c;

        /* JADX INFO: renamed from: g3.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"g3/a$c$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C1591a implements r0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f70136a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f70137b;

            public C1591a(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f70136a = view;
                this.f70137b = onGlobalLayoutListener;
            }

            @Override // p076m2.r0
            public void j() {
                this.f70136a.getViewTreeObserver().removeOnGlobalLayoutListener(this.f70137b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(View view, g3.c cVar) {
            super(1);
            this.f70134b = view;
            this.f70135c = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(g3.c cVar, View view) {
            cVar.c(a.j(l0.C(view)));
        }

        @Override // er.l
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final r0 b(s0 s0Var) {
            final g3.c cVar = this.f70135c;
            final View view = this.f70134b;
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: g3.b
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    a.c.f(cVar, view);
                }
            };
            this.f70134b.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
            return new C1591a(this.f70134b, onGlobalLayoutListener);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm2/s0;", "Lm2/r0;", "c", "(Lm2/s0;)Lm2/r0;"}, k = 3, mv = {2, 1, 0})
    static final class d extends w implements l<s0, r0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f70138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g3.c f70139c;

        /* JADX INFO: renamed from: g3.a$d$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"g3/a$d$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C1592a implements r0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f70140a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f70141b;

            public C1592a(Context context, b bVar) {
                this.f70140a = context;
                this.f70141b = bVar;
            }

            @Override // p076m2.r0
            public void j() {
                this.f70140a.unregisterReceiver(this.f70141b);
            }
        }

        @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"g3/a$d$b", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Loq/i0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends BroadcastReceiver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ g3.c f70142a;

            b(g3.c cVar) {
                this.f70142a = cVar;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                this.f70142a.a(a.i(intent));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, g3.c cVar) {
            super(1);
            this.f70138b = context;
            this.f70139c = cVar;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final r0 b(s0 s0Var) {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.DOCK_EVENT");
            b bVar = new b(this.f70139c);
            this.f70139c.a(a.i(u5.a.m(this.f70138b, bVar, intentFilter, 2)));
            return new C1592a(this.f70138b, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(InputManager inputManager) {
        int[] inputDeviceIds;
        if (inputManager != null && (inputDeviceIds = inputManager.getInputDeviceIds()) != null) {
            for (int i15 : inputDeviceIds) {
                InputDevice inputDevice = inputManager.getInputDevice(i15);
                if (inputDevice != null && inputDevice.getKeyboardType() == 2 && !inputDevice.isVirtual()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean g(InputDevice inputDevice, int i15, int i16) {
        return (inputDevice.getSources() & i15) == i15 && inputDevice.getMotionRange(i16, i15) != null;
    }

    static /* synthetic */ boolean h(InputDevice inputDevice, int i15, int i16, int i17, Object obj) {
        if ((i17 & 2) != 0) {
            i16 = 0;
        }
        return g(inputDevice, i15, i16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(Intent intent) {
        return (intent == null || intent.getIntExtra("android.intent.extra.DOCK_STATE", 0) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(f1 f1Var) {
        return f1Var != null && f1Var.q(f1.p.d());
    }

    public static final t k(Context context, View view, n3 n3Var, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-590796729, i15, -1, "androidx.compose.ui.adaptive.obtainUiMediaScope (MediaQuery.android.kt:121)");
        }
        Object objE = rVar.E();
        r.Companion companion = r.INSTANCE;
        if (objE == companion.a()) {
            objE = (InputManager) context.getSystemService("input");
            rVar.v(objE);
        }
        InputManager inputManager = (InputManager) objE;
        Object objE2 = rVar.E();
        if (objE2 == companion.a()) {
            objE2 = Boolean.valueOf(j(l0.C(view)));
            rVar.v(objE2);
        }
        boolean zBooleanValue = ((Boolean) objE2).booleanValue();
        Object objE3 = rVar.E();
        if (objE3 == companion.a()) {
            objE3 = new g3.c(context, inputManager, n3Var, zBooleanValue);
            rVar.v(objE3);
        }
        g3.c cVar = (g3.c) objE3;
        cVar.e(n3Var);
        boolean zG = rVar.G(context);
        Object objE4 = rVar.E();
        if (zG || objE4 == companion.a()) {
            objE4 = new C1587a(context, cVar, null);
            rVar.v(objE4);
        }
        int i16 = i15 & 14;
        Function0.d(context, (p) objE4, rVar, i16);
        boolean zG2 = rVar.G(inputManager);
        Object objE5 = rVar.E();
        if (zG2 || objE5 == companion.a()) {
            objE5 = new b(inputManager, cVar);
            rVar.v(objE5);
        }
        Function0.a(context, (l) objE5, rVar, i16);
        boolean zG3 = rVar.G(view);
        Object objE6 = rVar.E();
        if (zG3 || objE6 == companion.a()) {
            objE6 = new c(view, cVar);
            rVar.v(objE6);
        }
        Function0.a(view, (l) objE6, rVar, (i15 >> 3) & 14);
        boolean zG4 = rVar.G(context);
        Object objE7 = rVar.E();
        if (zG4 || objE7 == companion.a()) {
            objE7 = new d(context, cVar);
            rVar.v(objE7);
        }
        Function0.a(context, (l) objE7, rVar, i16);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l(InputManager inputManager) {
        if (inputManager == null) {
            return t.a.INSTANCE.d();
        }
        String strD = t.a.INSTANCE.d();
        for (int i15 : inputManager.getInputDeviceIds()) {
            InputDevice inputDevice = inputManager.getInputDevice(i15);
            if (inputDevice != null) {
                if (h(inputDevice, 8194, 0, 2, null) || h(inputDevice, 16386, 0, 2, null) || h(inputDevice, 1048584, 0, 2, null)) {
                    return t.a.INSTANCE.c();
                }
                if (h(inputDevice, 4098, 0, 2, null)) {
                    strD = t.a.INSTANCE.b();
                } else {
                    t.a.Companion companion = t.a.INSTANCE;
                    if (t.a.h(strD, companion.d()) && (h(inputDevice, 16777232, 0, 2, null) || h(inputDevice, 1025, 0, 2, null))) {
                        strD = companion.a();
                    }
                }
            }
        }
        return strD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m(u uVar) {
        Object next;
        List<ob.a> listA = uVar.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (obj instanceof ob.c) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fr.t.c(((ob.c) next).getState(), ob.c.C3575c.f144160d));
        ob.c cVar = (ob.c) next;
        if (cVar == null) {
            return t.b.INSTANCE.b();
        }
        return fr.t.c(cVar.a(), ob.c.b.f144156d) ? t.b.INSTANCE.c() : t.b.INSTANCE.a();
    }
}
