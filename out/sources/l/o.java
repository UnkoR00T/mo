package l;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import h.m0;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0097\u0001\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0019\u0012\u0004\u0012\u00020\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010%\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Ll/o;", "", "<init>", "()V", "Lh/a;", "aeMode", "Lh/b;", "afMode", "Lh/d;", "awbMode", "Lh/m0;", "flashMode", "", "Landroid/hardware/camera2/params/MeteringRectangle;", "aeRegions", "afRegions", "awbRegions", "", "aeLock", "afLock", "awbLock", "Loq/i0;", "c", "(Lh/a;Lh/b;Lh/d;Lh/m0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "b", "()Ljava/util/Map;", "Liu/e;", "Ll/w;", "a", "Liu/e;", "_state", "value", "()Ll/w;", "setCurrent", "(Ll/w;)V", "current", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iu.e<State3A> _state = iu.b.g(new State3A(null, null, null, null, null, null, null, null, null, null, 1023, null));

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(o oVar, h.a aVar, h.b bVar, h.d dVar, m0 m0Var, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            aVar = null;
        }
        if ((i15 & 2) != 0) {
            bVar = null;
        }
        if ((i15 & 4) != 0) {
            dVar = null;
        }
        if ((i15 & 8) != 0) {
            m0Var = null;
        }
        if ((i15 & 16) != 0) {
            list = null;
        }
        if ((i15 & 32) != 0) {
            list2 = null;
        }
        if ((i15 & 64) != 0) {
            list3 = null;
        }
        if ((i15 & 128) != 0) {
            bool = null;
        }
        if ((i15 & 256) != 0) {
            bool2 = null;
        }
        if ((i15 & 512) != 0) {
            bool3 = null;
        }
        oVar.c(aVar, bVar, dVar, m0Var, list, list2, list3, bool, bool2, bool3);
    }

    public final State3A a() {
        return this._state.c();
    }

    public final Map<CaptureRequest.Key<?>, Object> b() {
        return p.a(a());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    public final void c(h.a aeMode, h.b afMode, h.d awbMode, m0 flashMode, List<MeteringRectangle> aeRegions, List<MeteringRectangle> afRegions, List<MeteringRectangle> awbRegions, Boolean aeLock, Boolean afLock, Boolean awbLock) {
        State3A state3AC;
        State3A state3A;
        h.a aeMode2;
        h.b afMode2;
        h.d awbMode2;
        m0 flashMode2;
        List<MeteringRectangle> listD;
        List<MeteringRectangle> listG;
        List<MeteringRectangle> listJ;
        Boolean aeLock2;
        Boolean afLock2;
        List<MeteringRectangle> list;
        Boolean awbLock2;
        iu.e<State3A> eVar = this._state;
        do {
            state3AC = eVar.c();
            state3A = state3AC;
            aeMode2 = aeMode == null ? state3A.getAeMode() : aeMode;
            afMode2 = afMode == null ? state3A.getAfMode() : afMode;
            awbMode2 = awbMode == null ? state3A.getAwbMode() : awbMode;
            flashMode2 = flashMode == null ? state3A.getFlashMode() : flashMode;
            if (aeRegions != null) {
                List<MeteringRectangle> list2 = aeRegions;
                if (list2.isEmpty()) {
                    list2 = null;
                }
                listD = list2;
                if (listD == null) {
                    listD = state3A.d();
                }
            } else {
                listD = state3A.d();
            }
            if (afRegions != null) {
                List<MeteringRectangle> list3 = afRegions;
                if (list3.isEmpty()) {
                    list3 = null;
                }
                listG = list3;
                if (listG == null) {
                    listG = state3A.g();
                }
            } else {
                listG = state3A.g();
            }
            if (awbRegions != null) {
                List<MeteringRectangle> list4 = awbRegions;
                listJ = list4.isEmpty() ? null : list4;
                if (listJ == null) {
                    listJ = state3A.j();
                }
            } else {
                listJ = state3A.j();
            }
            aeLock2 = aeLock == null ? state3A.getAeLock() : aeLock;
            afLock2 = afLock == null ? state3A.getAfLock() : afLock;
            if (awbLock == null) {
                awbLock2 = state3A.getAwbLock();
                list = listG;
            } else {
                list = listG;
                awbLock2 = awbLock;
            }
        } while (!eVar.a(state3AC, state3A.a(aeMode2, afMode2, awbMode2, flashMode2, listD, list, listJ, aeLock2, afLock2, awbLock2)));
    }
}
