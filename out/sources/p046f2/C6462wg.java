package p046f2;

import android.content.Context;
import android.hardware.input.InputManager;
import android.view.InputDevice;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import er.l;
import er.p;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.b4;
import p076m2.c4;
import p076m2.c6;
import p076m2.d0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r;
import p076m2.r0;
import p076m2.s0;
import p076m2.t;
import r0.k0;
import r0.s;

/* JADX INFO: renamed from: f2.wg, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000e\u001a\u0004\u0018\u00010\u0006*\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0013\u001a\u0004\u0018\u00010\u0010*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0016\u001a\u00020\u000b*\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0015\u0010\u0018\u001a\u00020\u000b*\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017\u001a\u001b\u0010\u001a\u001a\u00020\u000b*\u00020\u00152\u0006\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\"\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "content", "d", "(Ler/p;Lm2/r;I)V", "Lm2/f6;", "Lf2/nb;", "m", "(Lm2/r;I)Lm2/f6;", "", "deviceId", "", "isKeyboard", "isMouse", "o", "(Lf2/nb;IZZ)Lf2/nb;", "Lr0/s;", "value", "shouldBePresent", "p", "(Lr0/s;IZ)Lr0/s;", "Landroid/view/InputDevice;", "k", "(Landroid/view/InputDevice;)Z", "l", "source", "j", "(Landroid/view/InputDevice;I)Z", "Lm2/b4;", "a", "Lm2/b4;", "LocalIsPrecisionPointerListenerRegistered", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class C6462wg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<Boolean> f58219a = d0.j(new er.a() { // from class: f2.tg
        @Override // er.a
        public final Object a() {
            return Boolean.valueOf(C6462wg.f());
        }
    });

    /* JADX INFO: renamed from: f2.wg$a */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"f2/wg$a", "Landroid/hardware/input/InputManager$InputDeviceListener;", "", "deviceId", "Loq/i0;", "a", "(I)V", "onInputDeviceAdded", "onInputDeviceRemoved", "onInputDeviceChanged", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements InputManager.InputDeviceListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputManager f58220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a3<Devices> f58221b;

        a(InputManager inputManager, a3<Devices> a3Var) {
            this.f58220a = inputManager;
            this.f58221b = a3Var;
        }

        private final void a(int deviceId) {
            InputDevice inputDevice = this.f58220a.getInputDevice(deviceId);
            Devices devicesO = C6462wg.o(this.f58221b.getValue(), deviceId, C6462wg.k(inputDevice), C6462wg.l(inputDevice));
            if (devicesO != null) {
                this.f58221b.setValue(devicesO);
            }
        }

        @Override // android.hardware.input.InputManager.InputDeviceListener
        public void onInputDeviceAdded(int deviceId) {
            a(deviceId);
        }

        @Override // android.hardware.input.InputManager.InputDeviceListener
        public void onInputDeviceChanged(int deviceId) {
            a(deviceId);
        }

        @Override // android.hardware.input.InputManager.InputDeviceListener
        public void onInputDeviceRemoved(int deviceId) {
            a(deviceId);
        }
    }

    /* JADX INFO: renamed from: f2.wg$b */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"f2/wg$b", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputManager f58222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f58223b;

        public b(InputManager inputManager, a aVar) {
            this.f58222a = inputManager;
            this.f58223b = aVar;
        }

        @Override // p076m2.r0
        public void j() {
            this.f58222a.unregisterInputDeviceListener(this.f58223b);
        }
    }

    public static final void d(final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15) {
        int i16;
        boolean z15;
        r rVarH = rVar.h(442516910);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(pVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z16 = false;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(442516910, i16, -1, "androidx.compose.material3.EnsurePrecisionPointerListenersRegistered (PrecisionPointer.android.kt:37)");
            }
            if (g4.isPrecisionPointerComponentSizingEnabled) {
                rVarH.X(56994752);
                z15 = !((Boolean) rVarH.N(f58219a)).booleanValue();
                rVarH.R();
            } else {
                rVarH.X(1766838549);
                rVarH.R();
                z15 = false;
            }
            if (z15) {
                rVarH.X(1766933538);
                Devices value = m(rVarH, 0).getValue();
                a3<Boolean> a3VarA = sg.a();
                if (value != null && value.getKeyboards().e() && value.getMice().e()) {
                    z16 = true;
                }
                a3VarA.setValue(Boolean.valueOf(z16));
                d0.c(f58219a.d(Boolean.TRUE), pVar, rVarH, ((i16 << 3) & 112) | c4.f122821i);
                rVarH.R();
            } else {
                rVarH.X(1767392772);
                pVar.B(rVarH, Integer.valueOf(i16 & 14));
                rVarH.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.ug
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return C6462wg.e(pVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(p pVar, int i15, r rVar, int i16) {
        d(pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f() {
        return false;
    }

    private static final boolean j(InputDevice inputDevice, int i15) {
        return (inputDevice.getSources() & i15) == i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(InputDevice inputDevice) {
        return inputDevice != null && !inputDevice.isVirtual() && j(inputDevice, 257) && inputDevice.getKeyboardType() == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(InputDevice inputDevice) {
        return (inputDevice == null || inputDevice.isVirtual() || !j(inputDevice, 8194) || j(inputDevice, 16386)) ? false : true;
    }

    private static final f6<Devices> m(r rVar, int i15) {
        rVar.X(57893307);
        if (t.k()) {
            t.o(57893307, i15, -1, "androidx.compose.material3.rememberDevicesState (PrecisionPointer.android.kt:56)");
        }
        Context context = (Context) rVar.N(AndroidCompositionLocals_androidKt.c());
        final InputManager inputManager = (InputManager) u5.a.k(context, InputManager.class);
        if (inputManager == null) {
            rVar.X(-1877171018);
            boolean zW = rVar.W(context);
            Object objE = rVar.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = c6.e(null, null, 2, null);
                rVar.v(objE);
            }
            a3 a3Var = (a3) objE;
            rVar.R();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return a3Var;
        }
        rVar.X(-199102972);
        rVar.R();
        boolean zW2 = rVar.W(context);
        Object objE2 = rVar.E();
        if (zW2 || objE2 == r.INSTANCE.a()) {
            k0 k0Var = new k0(0, 1, null);
            k0 k0Var2 = new k0(0, 1, null);
            for (int i16 : inputManager.getInputDeviceIds()) {
                InputDevice inputDevice = inputManager.getInputDevice(i16);
                if (k(inputDevice)) {
                    k0Var.h(i16);
                }
                if (l(inputDevice)) {
                    k0Var2.h(i16);
                }
            }
            objE2 = c6.e(new Devices(k0Var, k0Var2), null, 2, null);
            rVar.v(objE2);
        }
        final a3 a3Var2 = (a3) objE2;
        boolean zG = rVar.G(inputManager) | rVar.W(a3Var2);
        Object objE3 = rVar.E();
        if (zG || objE3 == r.INSTANCE.a()) {
            objE3 = new l() { // from class: f2.vg
                @Override // er.l
                public final Object b(Object obj) {
                    return C6462wg.n(inputManager, a3Var2, (s0) obj);
                }
            };
            rVar.v(objE3);
        }
        Function0.a(context, (l) objE3, rVar, 0);
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return a3Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 n(InputManager inputManager, a3 a3Var, s0 s0Var) {
        a aVar = new a(inputManager, a3Var);
        inputManager.registerInputDeviceListener(aVar, null);
        return new b(inputManager, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Devices o(Devices devices, int i15, boolean z15, boolean z16) {
        s sVarP = p(devices.getKeyboards(), i15, z15);
        s sVarP2 = p(devices.getMice(), i15, z16);
        if (sVarP == null && sVarP2 == null) {
            return null;
        }
        if (sVarP == null) {
            sVarP = devices.getKeyboards();
        }
        if (sVarP2 == null) {
            sVarP2 = devices.getMice();
        }
        return devices.a(sVarP, sVarP2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0055 A[LOOP:0: B:8:0x001e->B:20:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0058 A[EDGE_INSN: B:29:0x0058->B:21:0x0058 BREAK  A[LOOP:0: B:8:0x001e->B:20:0x0055], SYNTHETIC] */
    private static final s p(s sVar, int i15, boolean z15) {
        boolean zA = sVar.a(i15);
        if (!zA || z15) {
            if (zA || !z15) {
                return null;
            }
            k0 k0Var = new k0(sVar.get_size() + 1);
            k0Var.i(sVar);
            k0Var.h(i15);
            return k0Var;
        }
        k0 k0Var2 = new k0(sVar.get_size() - 1);
        int[] iArr = sVar.elements;
        long[] jArr = sVar.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i16 = 0;
            while (true) {
                long j15 = jArr[i16];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i16 != length) {
                        break;
                        break;
                    }
                    i16++;
                } else {
                    int i17 = 8 - ((~(i16 - length)) >>> 31);
                    for (int i18 = 0; i18 < i17; i18++) {
                        if ((255 & j15) < 128 && iArr[(i16 << 3) + i18] != i15) {
                            k0Var2.h(i15);
                        }
                        j15 >>= 8;
                    }
                    if (i17 != 8) {
                        break;
                    }
                    if (i16 != length) {
                        break;
                    }
                    i16++;
                }
            }
        }
        return k0Var2;
    }
}
