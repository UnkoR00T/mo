package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import p076m2.x5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00130\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00020\u0011*\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00130\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\"\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroid/view/View;", "view", "Lua/j;", "owner", "Landroidx/compose/ui/platform/j1;", "b", "(Landroid/view/View;Lua/j;)Landroidx/compose/ui/platform/j1;", "", "id", "savedStateRegistryOwner", "c", "(Ljava/lang/String;Lua/j;)Landroidx/compose/ui/platform/j1;", "", "value", "", "f", "(Ljava/lang/Object;)Z", "Landroid/os/Bundle;", "", "", "h", "(Landroid/os/Bundle;)Ljava/util/Map;", "g", "(Ljava/util/Map;)Landroid/os/Bundle;", "", "Ljava/lang/Class;", "a", "[Ljava/lang/Class;", "AcceptableClasses", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<? extends Object>[] f10665a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.a<oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f10666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ua.g f10667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f10668d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z15, ua.g gVar, String str) {
            super(0);
            this.f10666b = z15;
            this.f10667c = gVar;
            this.f10668d = str;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            c();
            return oq.i0.f148189a;
        }

        public final void c() {
            if (this.f10666b) {
                this.f10667c.e(this.f10668d);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "c", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class b extends fr.w implements er.l<Object, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f10669b = new b();

        b() {
            super(1);
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(Object obj) {
            return Boolean.valueOf(l1.f(obj));
        }
    }

    public static final j1 b(View view, ua.j jVar) {
        View view2 = (View) view.getParent();
        Object tag = view2.getTag(f3.p.J);
        String strValueOf = tag instanceof String ? (String) tag : null;
        if (strValueOf == null) {
            strValueOf = String.valueOf(view2.getId());
        }
        return c(strValueOf, jVar);
    }

    public static final j1 c(String str, ua.j jVar) {
        String str2 = "SaveableStateRegistry:" + str;
        ua.g gVarK = jVar.k();
        Bundle bundleA = gVarK.a(str2);
        final b3.r rVarC = b3.u.c(bundleA != null ? h(bundleA) : null, b.f10669b);
        boolean z15 = false;
        if (gVarK.b(str2) == null) {
            try {
                gVarK.c(str2, new ua.g.b() { // from class: androidx.compose.ui.platform.k1
                    @Override // ua.g.b
                    public final Bundle a() {
                        return l1.d(rVarC);
                    }
                });
                z15 = true;
            } catch (IllegalArgumentException unused) {
            }
        }
        return new j1(rVarC, new a(z15, gVarK, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(b3.r rVar) {
        return g(rVar.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Object obj) {
        if (obj instanceof c3.b0) {
            c3.b0 b0Var = (c3.b0) obj;
            if (b0Var.c() != x5.k() && b0Var.c() != x5.r() && b0Var.c() != x5.o()) {
                return false;
            }
            T value = b0Var.getValue();
            if (value == 0) {
                return true;
            }
            return f(value);
        }
        if ((obj instanceof oq.e) && (obj instanceof Serializable)) {
            return false;
        }
        for (Class<? extends Object> cls : f10665a) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    private static final Bundle g(Map<String, ? extends List<? extends Object>> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
        }
        return bundle;
    }

    private static final Map<String, List<Object>> h(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            linkedHashMap.put(str, bundle.getParcelableArrayList(str));
        }
        return linkedHashMap;
    }
}
