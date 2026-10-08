package androidx.compose.ui.semantics;

import androidx.compose.ui.platform.y1;
import fr.t;
import gr.a;
import java.util.Iterator;
import java.util.Map;
import n4.AccessibilityAction;
import n4.h0;
import n4.i0;
import oq.e;
import p071kotlin.Metadata;
import r0.g1;
import r0.h1;
import r0.i1;
import r0.t0;
import r0.u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f¢\u0006\u0004\b\u0010\u0010\u000fJ(\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0000H\u0000¢\u0006\u0004\b!\u0010\u001fJ\r\u0010\"\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,R,\u00102\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R*\u00106\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\"\u0010:\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\"\u0010@\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010\u001c\"\u0004\b>\u0010?R\"\u0010C\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010<\u001a\u0004\bA\u0010\u001c\"\u0004\bB\u0010?R \u0010G\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010D8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006H"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsConfiguration;", "Ln4/i0;", "", "", "Ln4/h0;", "", "<init>", "()V", "T", "key", "k", "(Ln4/h0;)Ljava/lang/Object;", "Lkotlin/Function0;", "defaultValue", "n", "(Ln4/h0;Ler/a;)Ljava/lang/Object;", "o", "", "iterator", "()Ljava/util/Iterator;", "value", "Loq/i0;", "e", "(Ln4/h0;Ljava/lang/Object;)V", "", "g", "(Ln4/h0;)Z", "h", "()Z", "child", "u", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "peer", "f", "i", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lr0/t0;", "a", "Lr0/t0;", "q", "()Lr0/t0;", "props", "", "b", "Ljava/util/Map;", "mapWrapper", "Lr0/u0;", "c", "Lr0/u0;", "_accessibilityExtraKeys", "d", "Z", "t", "w", "(Z)V", "isMergingSemanticsOfDescendants", "s", "v", "isClearingSemantics", "Lr0/h1;", "l", "()Lr0/h1;", "accessibilityExtraKeys", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SemanticsConfiguration implements i0, Iterable<Map.Entry<? extends h0<?>, ? extends Object>>, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t0<h0<?>, Object> props = g1.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Map<h0<?>, ? extends Object> mapWrapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private u0<h0<?>> _accessibilityExtraKeys;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isMergingSemanticsOfDescendants;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isClearingSemantics;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n4.i0
    public <T> void e(h0<T> key, T value) {
        if ((value instanceof AccessibilityAction) && g(key)) {
            AccessibilityAction accessibilityAction = (AccessibilityAction) this.props.e(key);
            t0<h0<?>, Object> t0Var = this.props;
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) value;
            String label = accessibilityAction2.getLabel();
            if (label == null) {
                label = accessibilityAction.getLabel();
            }
            e eVarA = accessibilityAction2.a();
            if (eVarA == null) {
                eVarA = accessibilityAction.a();
            }
            t0Var.x(key, new AccessibilityAction(label, eVarA));
        } else {
            this.props.x(key, value);
        }
        if (key.getAccessibilityExtraKey() != null) {
            if (this._accessibilityExtraKeys == null) {
                this._accessibilityExtraKeys = i1.b();
            }
            u0<h0<?>> u0Var = this._accessibilityExtraKeys;
            if (u0Var != null) {
                u0Var.i(key);
            }
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SemanticsConfiguration)) {
            return false;
        }
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) other;
        return t.c(this.props, semanticsConfiguration.props) && this.isMergingSemanticsOfDescendants == semanticsConfiguration.isMergingSemanticsOfDescendants && this.isClearingSemantics == semanticsConfiguration.isClearingSemantics;
    }

    public final void f(SemanticsConfiguration peer) {
        if (peer.isMergingSemanticsOfDescendants) {
            this.isMergingSemanticsOfDescendants = true;
        }
        if (peer.isClearingSemantics) {
            this.isClearingSemantics = true;
        }
        t0<h0<?>, Object> t0Var = peer.props;
        Object[] objArr = t0Var.keys;
        Object[] objArr2 = t0Var.values;
        long[] jArr = t0Var.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j15 = jArr[i15];
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8;
                int i17 = 8 - ((~(i15 - length)) >>> 31);
                int i18 = 0;
                while (i18 < i17) {
                    if ((255 & j15) < 128) {
                        int i19 = (i15 << 3) + i18;
                        Object obj = objArr[i19];
                        Object obj2 = objArr2[i19];
                        h0<?> h0Var = (h0) obj;
                        if (!this.props.b(h0Var)) {
                            this.props.x(h0Var, obj2);
                        } else if (obj2 instanceof AccessibilityAction) {
                            AccessibilityAction accessibilityAction = (AccessibilityAction) this.props.e(h0Var);
                            t0<h0<?>, Object> t0Var2 = this.props;
                            String label = accessibilityAction.getLabel();
                            if (label == null) {
                                label = ((AccessibilityAction) obj2).getLabel();
                            }
                            String str = label;
                            e eVarA = accessibilityAction.a();
                            if (eVarA == null) {
                                eVarA = ((AccessibilityAction) obj2).a();
                            }
                            t0Var2.x(h0Var, new AccessibilityAction(str, eVarA));
                        }
                    }
                    j15 >>= i16;
                    i18++;
                    i16 = i16;
                }
                if (i17 != i16) {
                    return;
                }
            }
            if (i15 == length) {
                return;
            } else {
                i15++;
            }
        }
    }

    public final <T> boolean g(h0<T> key) {
        return this.props.c(key);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004d A[LOOP:0: B:5:0x000f->B:18:0x004d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0050 A[SYNTHETIC] */
    public final boolean h() {
        t0<h0<?>, Object> t0Var = this.props;
        Object[] objArr = t0Var.keys;
        Object[] objArr2 = t0Var.values;
        long[] jArr = t0Var.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j15 = jArr[i15];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((255 & j15) < 128) {
                            int i18 = (i15 << 3) + i17;
                            Object obj = objArr[i18];
                            Object obj2 = objArr2[i18];
                            if (((h0) obj).getIsImportantForAccessibility()) {
                                return true;
                            }
                        }
                        j15 >>= 8;
                    }
                    if (i16 == 8) {
                        if (i15 != length) {
                            i15++;
                        }
                    }
                } else if (i15 != length) {
                    i15++;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.props.hashCode() * 31) + Boolean.hashCode(this.isMergingSemanticsOfDescendants)) * 31) + Boolean.hashCode(this.isClearingSemantics);
    }

    public final SemanticsConfiguration i() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.isMergingSemanticsOfDescendants = this.isMergingSemanticsOfDescendants;
        semanticsConfiguration.isClearingSemantics = this.isClearingSemantics;
        semanticsConfiguration.props.t(this.props);
        return semanticsConfiguration;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<? extends h0<?>, ? extends Object>> iterator() {
        Map<h0<?>, ? extends Object> mapA = this.mapWrapper;
        if (mapA == null) {
            mapA = this.props.a();
            this.mapWrapper = mapA;
        }
        return mapA.entrySet().iterator();
    }

    public final <T> T k(h0<T> key) {
        T t15 = (T) this.props.e(key);
        if (t15 != null) {
            return t15;
        }
        throw new IllegalStateException("Key not present: " + key + " - consider getOrElse or getOrNull");
    }

    public final h1<h0<?>> l() {
        return this._accessibilityExtraKeys;
    }

    public final <T> T n(h0<T> key, er.a<? extends T> defaultValue) {
        T t15 = (T) this.props.e(key);
        return t15 == null ? defaultValue.a() : t15;
    }

    public final <T> T o(h0<T> key, er.a<? extends T> defaultValue) {
        T t15 = (T) this.props.e(key);
        return t15 == null ? defaultValue.a() : t15;
    }

    public final t0<h0<?>, Object> q() {
        return this.props;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getIsClearingSemantics() {
        return this.isClearingSemantics;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getIsMergingSemanticsOfDescendants() {
        return this.isMergingSemanticsOfDescendants;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007b A[DONT_INVERT, PHI: r4
      0x007b: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v5 java.lang.String) binds: [B:12:0x0042, B:19:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x007d A[LOOP:0: B:11:0x0034->B:21:0x007d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0080 A[EDGE_INSN: B:25:0x0080->B:22:0x0080 BREAK  A[LOOP:0: B:11:0x0034->B:21:0x007d], SYNTHETIC] */
    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        String str = "";
        if (this.isMergingSemanticsOfDescendants) {
            sb5.append("");
            sb5.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.isClearingSemantics) {
            sb5.append(str);
            sb5.append("isClearingSemantics=true");
            str = ", ";
        }
        t0<h0<?>, Object> t0Var = this.props;
        Object[] objArr = t0Var.keys;
        Object[] objArr2 = t0Var.values;
        long[] jArr = t0Var.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j15 = jArr[i15];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i15 != length) {
                        break;
                        break;
                    }
                    i15++;
                } else {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((255 & j15) < 128) {
                            int i18 = (i15 << 3) + i17;
                            Object obj = objArr[i18];
                            Object obj2 = objArr2[i18];
                            sb5.append(str);
                            sb5.append(((h0) obj).getName());
                            sb5.append(" : ");
                            sb5.append(obj2);
                            str = ", ";
                        }
                        j15 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    }
                    if (i15 != length) {
                        break;
                    }
                    i15++;
                }
            }
        }
        return y1.a(this, null) + "{ " + ((Object) sb5) + " }";
    }

    public final void u(SemanticsConfiguration child) {
        t0<h0<?>, Object> t0Var = child.props;
        Object[] objArr = t0Var.keys;
        Object[] objArr2 = t0Var.values;
        long[] jArr = t0Var.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j15 = jArr[i15];
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j15) < 128) {
                        int i18 = (i15 << 3) + i17;
                        h0<?> h0Var = (h0) objArr[i18];
                        Object objD = h0Var.d(this.props.e(h0Var), objArr2[i18]);
                        if (objD != null) {
                            this.props.x(h0Var, objD);
                        }
                    }
                    j15 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length) {
                return;
            } else {
                i15++;
            }
        }
    }

    public final void v(boolean z15) {
        this.isClearingSemantics = z15;
    }

    public final void w(boolean z15) {
        this.isMergingSemanticsOfDescendants = z15;
    }
}
