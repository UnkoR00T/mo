package rs1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: rs1.i, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0004\b\u001a\u0010\u001bJN\u0010\u001c\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010'R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010)¨\u0006*"}, d2 = {"Lrs1/i;", "", "", "Lrs1/h;", "Lhz/b;", "validations", "", "values", "Ld60/j;", "scrollInstance", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ld60/j;)V", "updatedField", "newValidation", "f", "(Lrs1/h;Lhz/b;)Lrs1/i;", "newValue", "g", "(Lrs1/h;Ljava/lang/String;)Lrs1/i;", "h", "()Lrs1/i;", "field", "c", "(Lrs1/h;)Lhz/b;", "d", "(Lrs1/h;)Ljava/lang/String;", "e", "()Ld60/j;", "a", "(Ljava/util/Map;Ljava/util/Map;Ld60/j;)Lrs1/i;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "b", "Ld60/j;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<h, hz.b> validations;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<h, String> values;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final d60.j<h> scrollInstance;

    /* JADX INFO: renamed from: rs1.i$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f175775a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.PHONE_COUNTRY_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f175775a = iArr;
        }
    }

    public State() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, Map map, Map map2, d60.j jVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            map = state.validations;
        }
        if ((i15 & 2) != 0) {
            map2 = state.values;
        }
        if ((i15 & 4) != 0) {
            jVar = state.scrollInstance;
        }
        return state.a(map, map2, jVar);
    }

    public final State a(Map<h, ? extends hz.b> validations, Map<h, String> values, d60.j<h> scrollInstance) {
        return new State(validations, values, scrollInstance);
    }

    public final hz.b c(h field) {
        hz.b bVar = this.validations.get(field);
        return bVar == null ? hz.b.C2039b.f86846c : bVar;
    }

    public final String d(h field) {
        String str = this.values.get(field);
        return str == null ? "" : str;
    }

    public final d60.j<h> e() {
        return this.scrollInstance;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.validations, state.validations) && fr.t.c(this.values, state.values) && fr.t.c(this.scrollInstance, state.scrollInstance);
    }

    public final State f(h updatedField, hz.b newValidation) {
        Map<h, hz.b> map = this.validations;
        LinkedHashMap linkedHashMap = new LinkedHashMap(pq.v0.e(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            h hVar = (h) entry.getKey();
            hz.b bVar = (hz.b) entry.getValue();
            if (hVar == updatedField) {
                bVar = newValidation;
            }
            linkedHashMap.put(key, bVar);
        }
        return b(this, linkedHashMap, null, null, 6, null);
    }

    public final State g(h updatedField, String newValue) {
        Map<h, String> map = this.values;
        LinkedHashMap linkedHashMap = new LinkedHashMap(pq.v0.e(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            h hVar = (h) entry.getKey();
            String str = (String) entry.getValue();
            if (hVar == updatedField) {
                str = newValue;
            }
            linkedHashMap.put(key, str);
        }
        return b(this, null, linkedHashMap, null, 5, null);
    }

    public final State h() {
        d60.j jVar;
        Object next;
        h hVar;
        Iterator<T> it = this.validations.entrySet().iterator();
        do {
            jVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((hz.b) ((Map.Entry) next).getValue()) instanceof hz.b.Invalid));
        Map.Entry entry = (Map.Entry) next;
        if (entry != null && (hVar = (h) entry.getKey()) != null) {
            if (a.f175775a[hVar.ordinal()] == 1) {
                hVar = h.PHONE_NUMBER;
            }
            if (hVar != null) {
                jVar = new d60.j(hVar);
            }
        }
        return b(this, null, null, jVar, 3, null);
    }

    public int hashCode() {
        int iHashCode = ((this.validations.hashCode() * 31) + this.values.hashCode()) * 31;
        d60.j<h> jVar = this.scrollInstance;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public String toString() {
        return "State(validations=" + this.validations + ", values=" + this.values + ", scrollInstance=" + this.scrollInstance + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public State(Map<h, ? extends hz.b> map, Map<h, String> map2, d60.j<h> jVar) {
        this.validations = map;
        this.values = map2;
        this.scrollInstance = jVar;
    }

    public /* synthetic */ State(Map map, Map map2, d60.j jVar, int i15, fr.k kVar) {
        if ((i15 & 1) != 0) {
            wq.a<h> aVarE = h.e();
            LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(pq.v0.e(pq.v.y(aVarE, 10)), 16));
            Iterator<h> it = aVarE.iterator();
            while (it.hasNext()) {
                linkedHashMap.put(it.next(), hz.b.C2039b.f86846c);
            }
            map = linkedHashMap;
        }
        if ((i15 & 2) != 0) {
            wq.a<h> aVarE2 = h.e();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(lr.m.e(pq.v0.e(pq.v.y(aVarE2, 10)), 16));
            Iterator<h> it4 = aVarE2.iterator();
            while (it4.hasNext()) {
                linkedHashMap2.put(it4.next(), "");
            }
            map2 = linkedHashMap2;
        }
        this(map, map2, (i15 & 4) != 0 ? null : jVar);
    }
}
