package rb;

import android.annotation.SuppressLint;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import er.l;
import fr.k;
import fr.t;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mb.h;
import mb.j;
import ob.u;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001\"B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000b\u001a\u00020\n2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00182\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00152\b\u0010\t\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lrb/e;", "", "Lmb/j;", "verificationMode", "<init>", "(Lmb/j;)V", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "first", "second", "", "g", "(Ljava/util/List;Ljava/util/List;)Z", "f", "(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDisplayFeature;)Z", "sidecarDisplayFeatures", "Landroidx/window/sidecar/SidecarDeviceState;", "deviceState", "Lob/a;", "i", "(Ljava/util/List;Landroidx/window/sidecar/SidecarDeviceState;)Ljava/util/List;", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "extensionInfo", "state", "Lob/u;", "j", "(Landroidx/window/sidecar/SidecarWindowLayoutInfo;Landroidx/window/sidecar/SidecarDeviceState;)Lob/u;", "e", "(Landroidx/window/sidecar/SidecarDeviceState;Landroidx/window/sidecar/SidecarDeviceState;)Z", "h", "(Landroidx/window/sidecar/SidecarWindowLayoutInfo;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)Z", "feature", "o", "(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDeviceState;)Lob/a;", "a", "Lmb/j;", "b", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f172838c = e.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j verificationMode;

    /* JADX INFO: renamed from: rb.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lrb/e$a;", "", "<init>", "()V", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "info", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "c", "(Landroidx/window/sidecar/SidecarWindowLayoutInfo;)Ljava/util/List;", "Landroidx/window/sidecar/SidecarDeviceState;", "sidecarDeviceState", "", "b", "(Landroidx/window/sidecar/SidecarDeviceState;)I", "a", "posture", "Loq/i0;", "d", "(Landroidx/window/sidecar/SidecarDeviceState;I)V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final int a(SidecarDeviceState sidecarDeviceState) {
            try {
                try {
                    return sidecarDeviceState.posture;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    return 0;
                }
            } catch (NoSuchFieldError unused2) {
                return ((Integer) SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null)).intValue();
            }
        }

        public final int b(SidecarDeviceState sidecarDeviceState) {
            int iA = a(sidecarDeviceState);
            if (iA < 0 || iA > 4) {
                return 0;
            }
            return iA;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final List<SidecarDisplayFeature> c(SidecarWindowLayoutInfo info) {
            try {
                try {
                    List<SidecarDisplayFeature> list = info.displayFeatures;
                    return list == null ? v.n() : list;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    return v.n();
                }
            } catch (NoSuchFieldError unused2) {
                return (List) SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(info, null);
            }
            return v.n();
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void d(SidecarDeviceState sidecarDeviceState, int posture) {
            try {
                try {
                    sidecarDeviceState.posture = posture;
                } catch (NoSuchFieldError unused) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(posture));
                }
            } catch (IllegalAccessException unused2) {
                i0 i0Var = i0.f148189a;
            } catch (NoSuchMethodException unused3) {
                i0 i0Var2 = i0.f148189a;
            } catch (InvocationTargetException unused4) {
                i0 i0Var3 = i0.f148189a;
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final boolean f(SidecarDisplayFeature first, SidecarDisplayFeature second) {
        if (t.c(first, second)) {
            return true;
        }
        if (first == null || second == null || first.getType() != second.getType()) {
            return false;
        }
        return t.c(first.getRect(), second.getRect());
    }

    private final boolean g(List<SidecarDisplayFeature> first, List<SidecarDisplayFeature> second) {
        if (first == second) {
            return true;
        }
        if (first == null || second == null || first.size() != second.size()) {
            return false;
        }
        int size = first.size();
        for (int i15 = 0; i15 < size; i15++) {
            if (!f(first.get(i15), second.get(i15))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(SidecarDisplayFeature sidecarDisplayFeature) {
        return sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(SidecarDisplayFeature sidecarDisplayFeature) {
        return (sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(SidecarDisplayFeature sidecarDisplayFeature) {
        return sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(SidecarDisplayFeature sidecarDisplayFeature) {
        return sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0;
    }

    public final boolean e(SidecarDeviceState first, SidecarDeviceState second) {
        if (t.c(first, second)) {
            return true;
        }
        if (first == null || second == null) {
            return false;
        }
        Companion companion = INSTANCE;
        return companion.b(first) == companion.b(second);
    }

    public final boolean h(SidecarWindowLayoutInfo first, SidecarWindowLayoutInfo second) {
        if (t.c(first, second)) {
            return true;
        }
        if (first == null || second == null) {
            return false;
        }
        Companion companion = INSTANCE;
        return g(companion.c(first), companion.c(second));
    }

    public final List<ob.a> i(List<SidecarDisplayFeature> sidecarDisplayFeatures, SidecarDeviceState deviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            ob.a aVarO = o((SidecarDisplayFeature) it.next(), deviceState);
            if (aVarO != null) {
                arrayList.add(aVarO);
            }
        }
        return arrayList;
    }

    public final u j(SidecarWindowLayoutInfo extensionInfo, SidecarDeviceState state) {
        if (extensionInfo == null) {
            return new u(v.n());
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        Companion companion = INSTANCE;
        companion.d(sidecarDeviceState, companion.b(state));
        return new u(i(companion.c(extensionInfo), sidecarDeviceState));
    }

    public final ob.a o(SidecarDisplayFeature feature, SidecarDeviceState deviceState) {
        ob.d.b bVarA;
        ob.c.C3575c c3575c;
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) h.Companion.b(h.INSTANCE, feature, f172838c, this.verificationMode, null, 4, null).c("Type must be either TYPE_FOLD or TYPE_HINGE", new l() { // from class: rb.a
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(e.k((SidecarDisplayFeature) obj));
            }
        }).c("Feature bounds must not be 0", new l() { // from class: rb.b
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(e.l((SidecarDisplayFeature) obj));
            }
        }).c("TYPE_FOLD must have 0 area", new l() { // from class: rb.c
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(e.m((SidecarDisplayFeature) obj));
            }
        }).c("Feature be pinned to either left or top", new l() { // from class: rb.d
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(e.n((SidecarDisplayFeature) obj));
            }
        }).a();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            bVarA = ob.d.b.INSTANCE.a();
        } else {
            if (type != 2) {
                return null;
            }
            bVarA = ob.d.b.INSTANCE.b();
        }
        int iB = INSTANCE.b(deviceState);
        if (iB == 0 || iB == 1) {
            return null;
        }
        if (iB == 2) {
            c3575c = ob.c.C3575c.f144160d;
        } else {
            if (iB != 3 && iB == 4) {
                return null;
            }
            c3575c = ob.c.C3575c.f144159c;
        }
        return new ob.d(new mb.b(feature.getRect()), bVarA, c3575c);
    }

    public e(j jVar) {
        this.verificationMode = jVar;
    }

    public /* synthetic */ e(j jVar, int i15, k kVar) {
        this((i15 & 1) != 0 ? j.QUIET : jVar);
    }
}
