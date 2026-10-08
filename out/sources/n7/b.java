package n7;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import mu.b0;
import oq.r;
import oq.y;
import p071kotlin.Metadata;
import pq.v0;
import ua.g;
import ua.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\t\u0010\nJ(\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\nR%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R(\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00180\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012R+\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00180\u00108\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010 \u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001f¨\u0006!"}, d2 = {"Ln7/b;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "T", "key", "b", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "Loq/i0;", "f", "(Ljava/lang/String;Ljava/lang/Object;)V", "d", "", "a", "Ljava/util/Map;", "getRegular", "()Ljava/util/Map;", "regular", "Lua/g$b;", "providers", "Lmu/b0;", "c", "flows", "getMutableFlows", "mutableFlows", "e", "Lua/g$b;", "()Lua/g$b;", "savedStateProvider", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> regular;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, g.b> providers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, b0<Object>> flows;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<String, b0<Object>> mutableFlows;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g.b savedStateProvider;

    public b(Map<String, ? extends Object> map) {
        this.regular = v0.w(map);
        this.providers = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.mutableFlows = new LinkedHashMap();
        this.savedStateProvider = new g.b() { // from class: n7.a
            @Override // ua.g.b
            public final Bundle a() {
                return b.e(this.f133367a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle e(b bVar) {
        r[] rVarArr;
        for (Map.Entry entry : v0.u(bVar.mutableFlows).entrySet()) {
            bVar.f((String) entry.getKey(), ((b0) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : v0.u(bVar.providers).entrySet()) {
            bVar.f((String) entry2.getKey(), ((g.b) entry2.getValue()).a());
        }
        Map<String, Object> map = bVar.regular;
        if (map.isEmpty()) {
            rVarArr = new r[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, Object> entry3 : map.entrySet()) {
                arrayList.add(y.a(entry3.getKey(), entry3.getValue()));
            }
            rVarArr = (r[]) arrayList.toArray(new r[0]);
        }
        Bundle bundleA = e6.c.a((r[]) Arrays.copyOf(rVarArr, rVarArr.length));
        k.a(bundleA);
        return bundleA;
    }

    public final <T> T b(String key) {
        T t15;
        try {
            b0<Object> b0Var = this.mutableFlows.get(key);
            if (b0Var != null && (t15 = (T) b0Var.getValue()) != null) {
                return t15;
            }
            return (T) this.regular.get(key);
        } catch (ClassCastException unused) {
            d(key);
            return null;
        }
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g.b getSavedStateProvider() {
        return this.savedStateProvider;
    }

    public final <T> T d(String key) {
        T t15 = (T) this.regular.remove(key);
        this.flows.remove(key);
        this.mutableFlows.remove(key);
        return t15;
    }

    public final <T> void f(String key, T value) {
        this.regular.put(key, value);
        b0<Object> b0Var = this.flows.get(key);
        if (b0Var != null) {
            b0Var.setValue(value);
        }
        b0<Object> b0Var2 = this.mutableFlows.get(key);
        if (b0Var2 != null) {
            b0Var2.setValue(value);
        }
    }

    public /* synthetic */ b(Map map, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? v0.i() : map);
    }
}
