package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u0004\u0018\u00010\b*\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u000f\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010JC\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0017\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 ¨\u0006#"}, d2 = {"Landroidx/fragment/app/d0;", "", "<init>", "()V", "Landroidx/fragment/app/f0;", "c", "()Landroidx/fragment/app/f0;", "Lr0/a;", "", "value", "b", "(Lr0/a;Ljava/lang/String;)Ljava/lang/String;", "Landroid/view/View;", "namedViews", "Loq/i0;", "d", "(Lr0/a;Lr0/a;)V", "Landroidx/fragment/app/o;", "inFragment", "outFragment", "", "isPop", "sharedElements", "isStart", "a", "(Landroidx/fragment/app/o;Landroidx/fragment/app/o;ZLr0/a;Z)V", "", "views", "", "visibility", "e", "(Ljava/util/List;I)V", "Landroidx/fragment/app/f0;", "PLATFORM_IMPL", "SUPPORT_IMPL", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f12448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final f0 PLATFORM_IMPL;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final f0 SUPPORT_IMPL;

    static {
        d0 d0Var = new d0();
        f12448a = d0Var;
        PLATFORM_IMPL = new e0();
        SUPPORT_IMPL = d0Var.c();
    }

    private d0() {
    }

    public static final void a(o inFragment, o outFragment, boolean isPop, r0.a<String, View> sharedElements, boolean isStart) {
        s5.v vVarC = isPop ? outFragment.C() : inFragment.C();
        if (vVarC != null) {
            ArrayList arrayList = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it = sharedElements.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            ArrayList arrayList2 = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it4 = sharedElements.entrySet().iterator();
            while (it4.hasNext()) {
                arrayList2.add(it4.next().getKey());
            }
            if (isStart) {
                vVarC.c(arrayList2, arrayList, null);
            } else {
                vVarC.b(arrayList2, arrayList, null);
            }
        }
    }

    public static final String b(r0.a<String, String> aVar, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : aVar.entrySet()) {
            if (fr.t.c(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) pq.v.n0(arrayList);
    }

    private final f0 c() {
        try {
            return (f0) fb.e.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void d(r0.a<String, String> aVar, r0.a<String, View> aVar2) {
        int size = aVar.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!aVar2.containsKey(aVar.k(size))) {
                aVar.h(size);
            }
        }
    }

    public static final void e(List<? extends View> views, int visibility) {
        Iterator<T> it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(visibility);
        }
    }
}
