package md;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f125638c = new e("COMPOSITION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f125639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f125640b;

    public e(String... strArr) {
        this.f125639a = Arrays.asList(strArr);
    }

    private boolean b() {
        List<String> list = this.f125639a;
        return list.get(list.size() - 1).equals("**");
    }

    private boolean f(String str) {
        return "__container".equals(str);
    }

    public e a(String str) {
        e eVar = new e(this);
        eVar.f125639a.add(str);
        return eVar;
    }

    public boolean c(String str, int i15) {
        if (i15 >= this.f125639a.size()) {
            return false;
        }
        boolean z15 = i15 == this.f125639a.size() - 1;
        String str2 = this.f125639a.get(i15);
        if (!str2.equals("**")) {
            return (z15 || (i15 == this.f125639a.size() + (-2) && b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z15 && this.f125639a.get(i15 + 1).equals(str)) {
            return i15 == this.f125639a.size() + (-2) || (i15 == this.f125639a.size() + (-3) && b());
        }
        if (z15) {
            return true;
        }
        int i16 = i15 + 1;
        if (i16 < this.f125639a.size() - 1) {
            return false;
        }
        return this.f125639a.get(i16).equals(str);
    }

    public f d() {
        return this.f125640b;
    }

    public int e(String str, int i15) {
        if (f(str)) {
            return 0;
        }
        if (this.f125639a.get(i15).equals("**")) {
            return (i15 != this.f125639a.size() - 1 && this.f125639a.get(i15 + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e eVar = (e) obj;
            if (!this.f125639a.equals(eVar.f125639a)) {
                return false;
            }
            f fVar = this.f125640b;
            f fVar2 = eVar.f125640b;
            if (fVar != null) {
                return fVar.equals(fVar2);
            }
            if (fVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public boolean g(String str, int i15) {
        if (f(str)) {
            return true;
        }
        if (i15 >= this.f125639a.size()) {
            return false;
        }
        return this.f125639a.get(i15).equals(str) || this.f125639a.get(i15).equals("**") || this.f125639a.get(i15).equals("*");
    }

    public boolean h(String str, int i15) {
        return "__container".equals(str) || i15 < this.f125639a.size() - 1 || this.f125639a.get(i15).equals("**");
    }

    public int hashCode() {
        int iHashCode = this.f125639a.hashCode() * 31;
        f fVar = this.f125640b;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public e i(f fVar) {
        e eVar = new e(this);
        eVar.f125640b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("KeyPath{keys=");
        sb5.append(this.f125639a);
        sb5.append(",resolved=");
        sb5.append(this.f125640b != null);
        sb5.append('}');
        return sb5.toString();
    }

    private e(e eVar) {
        this.f125639a = new ArrayList(eVar.f125639a);
        this.f125640b = eVar.f125640b;
    }
}
