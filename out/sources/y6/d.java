package y6;

import fr.t;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import lr.m;
import oq.r;
import p071kotlin.Metadata;
import pq.n;
import pq.v;
import pq.v0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\fJ&\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0016\u001a\u00020\n\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0015\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\n2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0017J)\u0010\u001c\u001a\u00020\n2\u001a\u0010\u001b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u001a0\u0019\"\u0006\u0012\u0002\b\u00030\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u001e\u0010\u0011J\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\fJ\u001a\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R*\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b*\u0010\u0014R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010,¨\u0006."}, d2 = {"Ly6/d;", "Ly6/h;", "", "Ly6/h$a;", "", "preferencesMap", "", "startFrozen", "<init>", "(Ljava/util/Map;Z)V", "Loq/i0;", "f", "()V", "h", "T", "key", "b", "(Ly6/h$a;)Ljava/lang/Object;", "", "a", "()Ljava/util/Map;", "value", "k", "(Ly6/h$a;Ljava/lang/Object;)V", "l", "", "Ly6/h$b;", "pairs", "i", "([Ly6/h$b;)V", "j", "g", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getPreferencesMap$datastore_preferences_core", "Ly6/b;", "Ly6/b;", "frozen", "datastore-preferences-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<h.a<?>, Object> preferencesMap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b frozen;

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence m(Map.Entry entry) {
        Object value = entry.getValue();
        return "  " + ((h.a) entry.getKey()).getName() + " = " + (value instanceof byte[] ? n.K0((byte[]) value, ", ", "[", "]", 0, null, null, 56, null) : String.valueOf(entry.getValue()));
    }

    @Override // y6.h
    public Map<h.a<?>, Object> a() {
        r rVar;
        Set<Map.Entry<h.a<?>, Object>> setEntrySet = this.preferencesMap.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.e(v0.e(v.y(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                rVar = new r(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                rVar = new r(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(rVar.c(), rVar.d());
        }
        return a.b(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y6.h
    public <T> T b(h.a<T> key) {
        T t15 = (T) this.preferencesMap.get(key);
        if (!(t15 instanceof byte[])) {
            return t15;
        }
        byte[] bArr = (byte[]) t15;
        return (T) Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    public boolean equals(Object other) {
        boolean zC;
        if (!(other instanceof d)) {
            return false;
        }
        d dVar = (d) other;
        Map<h.a<?>, Object> map = dVar.preferencesMap;
        if (map == this.preferencesMap) {
            return true;
        }
        if (map.size() != this.preferencesMap.size()) {
            return false;
        }
        Map<h.a<?>, Object> map2 = dVar.preferencesMap;
        if (map2.isEmpty()) {
            return true;
        }
        for (Map.Entry<h.a<?>, Object> entry : map2.entrySet()) {
            Object obj = this.preferencesMap.get(entry.getKey());
            if (obj != null) {
                Object value = entry.getValue();
                if (!(value instanceof byte[])) {
                    zC = t.c(value, obj);
                } else if ((obj instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj)) {
                    zC = true;
                } else {
                    zC = false;
                }
            } else {
                zC = false;
            }
            if (!zC) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        if (this.frozen.a()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void g() {
        f();
        this.preferencesMap.clear();
    }

    public final void h() {
        this.frozen.b(true);
    }

    public int hashCode() {
        Iterator<T> it = this.preferencesMap.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final void i(h.b<?>... pairs) {
        f();
        for (h.b<?> bVar : pairs) {
            l(bVar.a(), bVar.b());
        }
    }

    public final <T> T j(h.a<T> key) {
        f();
        return (T) this.preferencesMap.remove(key);
    }

    public final <T> void k(h.a<T> key, T value) {
        l(key, value);
    }

    public final void l(h.a<?> key, Object value) {
        f();
        if (value == null) {
            j(key);
            return;
        }
        if (value instanceof Set) {
            this.preferencesMap.put(key, a.a((Set) value));
        } else if (!(value instanceof byte[])) {
            this.preferencesMap.put(key, value);
        } else {
            byte[] bArr = (byte[]) value;
            this.preferencesMap.put(key, Arrays.copyOf(bArr, bArr.length));
        }
    }

    public String toString() {
        return v.v0(this.preferencesMap.entrySet(), ",\n", "{\n", "\n}", 0, null, new er.l() { // from class: y6.c
            @Override // er.l
            public final Object b(Object obj) {
                return d.m((Map.Entry) obj);
            }
        }, 24, null);
    }

    public d(Map<h.a<?>, Object> map, boolean z15) {
        this.preferencesMap = map;
        this.frozen = new b(z15);
    }

    public /* synthetic */ d(Map map, boolean z15, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? new LinkedHashMap() : map, (i15 & 2) != 0 ? true : z15);
    }
}
