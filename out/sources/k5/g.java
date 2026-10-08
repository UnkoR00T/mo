package k5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import l5.i;
import l5.j;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Integer f108491k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k5.c f108492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f108493b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected HashMap<Object, f> f108494c = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected HashMap<Object, k5.e> f108495d = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    HashMap<String, ArrayList<String>> f108496e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k5.a f108497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f108498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ArrayList<Object> f108499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ArrayList<n5.e> f108500i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f108501j;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 k5.g$a, still in use, count: 1, list:
      (r0v0 k5.g$a) from 0x0044: INVOKE 
      (wrap java.util.Map<java.lang.String, k5.g$a>:0x0040: SGET  A[WRAPPED] k5.g.a.d java.util.Map)
      ("spread")
      (r0v0 k5.g$a)
     INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {
        SPREAD,
        SPREAD_INSIDE,
        PACKED;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static Map<String, a> f108505d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static Map<String, Integer> f108506e = new HashMap();

        static {
            f108505d.put("packed", new a());
            f108505d.put("spread_inside", new a());
            f108505d.put("spread", new a());
            f108506e.put("packed", 2);
            f108506e.put("spread_inside", 1);
            f108506e.put("spread", 0);
        }

        private a() {
            super(str, i);
        }

        public static int e(String str) {
            if (f108506e.containsKey(str)) {
                return f108506e.get(str).intValue();
            }
            return -1;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f108507f.clone();
        }
    }

    public enum b {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        TOP_TO_BASELINE,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BOTTOM_TO_BASELINE,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    public enum c {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    public enum d {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        HORIZONTAL_FLOW,
        VERTICAL_FLOW,
        GRID,
        ROW,
        COLUMN,
        FLOW
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 k5.g$e, still in use, count: 1, list:
      (r0v0 k5.g$e) from 0x0036: INVOKE (wrap java.util.Map<java.lang.String, k5.g$e>:0x0032: SGET  A[WRAPPED] k5.g.e.d java.util.Map), ("none"), (r0v0 k5.g$e) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class e {
        NONE,
        CHAIN,
        ALIGNED;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static Map<String, e> f108552d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static Map<String, Integer> f108553e = new HashMap();

        static {
            f108552d.put("none", new e());
            f108552d.put("chain", new e());
            f108552d.put("aligned", new e());
            f108553e.put("none", 0);
            f108553e.put("chain", 3);
            f108553e.put("aligned", 2);
        }

        private e() {
            super(str, i);
        }

        public static int e(String str) {
            if (f108553e.containsKey(str)) {
                return f108553e.get(str).intValue();
            }
            return -1;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f108554f.clone();
        }
    }

    public g() {
        k5.a aVar = new k5.a(this);
        this.f108497f = aVar;
        this.f108498g = 0;
        this.f108499h = new ArrayList<>();
        this.f108500i = new ArrayList<>();
        this.f108501j = true;
        Integer num = f108491k;
        aVar.c(num);
        this.f108494c.put(num, aVar);
    }

    private String g() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("__HELPER_KEY_");
        int i15 = this.f108498g;
        this.f108498g = i15 + 1;
        sb5.append(i15);
        sb5.append("__");
        return sb5.toString();
    }

    public j A() {
        return (j) n(null, d.VERTICAL_CHAIN);
    }

    public l5.h B(Object obj) {
        return l(obj, 1);
    }

    public g C(k5.d dVar) {
        return z(dVar);
    }

    public void a(n5.f fVar) {
        k5.e eVar;
        n5.j jVarU0;
        n5.j jVarU1;
        fVar.y1();
        this.f108497f.E().a(this, fVar, 0);
        this.f108497f.C().a(this, fVar, 1);
        for (Object obj : this.f108495d.keySet()) {
            n5.j jVarU2 = this.f108495d.get(obj).u0();
            if (jVarU2 != null) {
                f fVarD = this.f108494c.get(obj);
                if (fVarD == null) {
                    fVarD = d(obj);
                }
                fVarD.b(jVarU2);
            }
        }
        for (Object obj2 : this.f108494c.keySet()) {
            f fVar2 = this.f108494c.get(obj2);
            if (fVar2 != this.f108497f && (fVar2.d() instanceof k5.e) && (jVarU1 = ((k5.e) fVar2.d()).u0()) != null) {
                f fVarD2 = this.f108494c.get(obj2);
                if (fVarD2 == null) {
                    fVarD2 = d(obj2);
                }
                fVarD2.b(jVarU1);
            }
        }
        Iterator<Object> it = this.f108494c.keySet().iterator();
        while (it.hasNext()) {
            f fVar3 = this.f108494c.get(it.next());
            if (fVar3 != this.f108497f) {
                n5.e eVarA = fVar3.a();
                eVarA.F0(fVar3.getKey().toString());
                eVarA.f1(null);
                if (fVar3.d() instanceof l5.h) {
                    fVar3.apply();
                }
                fVar.a(eVarA);
            } else {
                fVar3.b(fVar);
            }
        }
        Iterator<Object> it4 = this.f108495d.keySet().iterator();
        while (it4.hasNext()) {
            k5.e eVar2 = this.f108495d.get(it4.next());
            if (eVar2.u0() != null) {
                Iterator<Object> it5 = eVar2.f108489o0.iterator();
                while (it5.hasNext()) {
                    eVar2.u0().a(this.f108494c.get(it5.next()).a());
                }
                eVar2.apply();
            } else {
                eVar2.apply();
            }
        }
        Iterator<Object> it6 = this.f108494c.keySet().iterator();
        while (it6.hasNext()) {
            f fVar4 = this.f108494c.get(it6.next());
            if (fVar4 != this.f108497f && (fVar4.d() instanceof k5.e) && (jVarU0 = (eVar = (k5.e) fVar4.d()).u0()) != null) {
                for (Object obj3 : eVar.f108489o0) {
                    f fVar5 = this.f108494c.get(obj3);
                    if (fVar5 != null) {
                        jVarU0.a(fVar5.a());
                    } else if (obj3 instanceof f) {
                        jVarU0.a(((f) obj3).a());
                    } else {
                        System.out.println("couldn't find reference for " + obj3);
                    }
                }
                fVar4.apply();
            }
        }
        for (Object obj4 : this.f108494c.keySet()) {
            f fVar6 = this.f108494c.get(obj4);
            fVar6.apply();
            n5.e eVarA2 = fVar6.a();
            if (eVarA2 != null && obj4 != null) {
                eVarA2.f131867o = obj4.toString();
            }
        }
    }

    public l5.c b(Object obj, c cVar) {
        k5.a aVarD = d(obj);
        if (aVarD.d() == null || !(aVarD.d() instanceof l5.c)) {
            l5.c cVar2 = new l5.c(this);
            cVar2.w0(cVar);
            aVarD.X(cVar2);
        }
        return (l5.c) aVarD.d();
    }

    public void c(Object obj) {
        this.f108499h.add(obj);
        this.f108501j = true;
    }

    public k5.a d(Object obj) {
        f fVarF = this.f108494c.get(obj);
        if (fVarF == null) {
            fVarF = f(obj);
            this.f108494c.put(obj, fVarF);
            fVarF.c(obj);
        }
        if (fVarF instanceof k5.a) {
            return (k5.a) fVarF;
        }
        return null;
    }

    public int e(Object obj) {
        if (obj instanceof Float) {
            return Math.round(((Float) obj).floatValue());
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public k5.a f(Object obj) {
        return new k5.a(this);
    }

    k5.c h() {
        return this.f108492a;
    }

    public l5.f i(Object obj, boolean z15) {
        k5.a aVarD = d(obj);
        if (aVarD.d() == null || !(aVarD.d() instanceof l5.f)) {
            aVarD.X(z15 ? new l5.f(this, d.VERTICAL_FLOW) : new l5.f(this, d.HORIZONTAL_FLOW));
        }
        return (l5.f) aVarD.d();
    }

    public l5.g j(Object obj, String str) {
        k5.a aVarD = d(obj);
        if (aVarD.d() == null || !(aVarD.d() instanceof l5.g)) {
            d dVar = d.GRID;
            if (str.charAt(0) == 'r') {
                dVar = d.ROW;
            } else if (str.charAt(0) == 'c') {
                dVar = d.COLUMN;
            }
            aVarD.X(new l5.g(this, dVar));
        }
        return (l5.g) aVarD.d();
    }

    public ArrayList<String> k(String str) {
        if (this.f108496e.containsKey(str)) {
            return this.f108496e.get(str);
        }
        return null;
    }

    public l5.h l(Object obj, int i15) {
        k5.a aVarD = d(obj);
        if (aVarD.d() == null || !(aVarD.d() instanceof l5.h)) {
            l5.h hVar = new l5.h(this);
            hVar.g(i15);
            hVar.c(obj);
            aVarD.X(hVar);
        }
        return (l5.h) aVarD.d();
    }

    public g m(k5.d dVar) {
        return w(dVar);
    }

    public k5.e n(Object obj, d dVar) {
        if (obj == null) {
            obj = g();
        }
        k5.e iVar = this.f108495d.get(obj);
        if (iVar == null) {
            switch (dVar) {
                case HORIZONTAL_CHAIN:
                    iVar = new i(this);
                    break;
                case VERTICAL_CHAIN:
                    iVar = new j(this);
                    break;
                case ALIGN_HORIZONTALLY:
                    iVar = new l5.a(this);
                    break;
                case ALIGN_VERTICALLY:
                    iVar = new l5.b(this);
                    break;
                case BARRIER:
                    iVar = new l5.c(this);
                    break;
                case LAYER:
                default:
                    iVar = new k5.e(this, dVar);
                    break;
                case HORIZONTAL_FLOW:
                case VERTICAL_FLOW:
                    iVar = new l5.f(this, dVar);
                    break;
                case GRID:
                case ROW:
                case COLUMN:
                    iVar = new l5.g(this, dVar);
                    break;
            }
            iVar.c(obj);
            this.f108495d.put(obj, iVar);
        }
        return iVar;
    }

    public i o() {
        return (i) n(null, d.HORIZONTAL_CHAIN);
    }

    public l5.h p(Object obj) {
        return l(obj, 0);
    }

    public boolean q(n5.e eVar) {
        if (this.f108501j) {
            this.f108500i.clear();
            Iterator<Object> it = this.f108499h.iterator();
            while (it.hasNext()) {
                n5.e eVarA = this.f108494c.get(it.next()).a();
                if (eVarA != null) {
                    this.f108500i.add(eVarA);
                }
            }
            this.f108501j = false;
        }
        return this.f108500i.contains(eVar);
    }

    public boolean r() {
        return !this.f108493b;
    }

    public void s(Object obj, Object obj2) {
        k5.a aVarD = d(obj);
        if (aVarD != null) {
            aVarD.e0(obj2);
        }
    }

    f t(Object obj) {
        return this.f108494c.get(obj);
    }

    public void u() {
        Iterator<Object> it = this.f108494c.keySet().iterator();
        while (it.hasNext()) {
            this.f108494c.get(it.next()).a().v0();
        }
        this.f108494c.clear();
        this.f108494c.put(f108491k, this.f108497f);
        this.f108495d.clear();
        this.f108496e.clear();
        this.f108499h.clear();
        this.f108501j = true;
    }

    public void v(k5.c cVar) {
        this.f108492a = cVar;
    }

    public g w(k5.d dVar) {
        this.f108497f.Y(dVar);
        return this;
    }

    public void x(boolean z15) {
        this.f108493b = !z15;
    }

    public void y(String str, String str2) {
        ArrayList<String> arrayList;
        k5.a aVarD = d(str);
        if (aVarD != null) {
            aVarD.b0(str2);
            if (this.f108496e.containsKey(str2)) {
                arrayList = this.f108496e.get(str2);
            } else {
                arrayList = new ArrayList<>();
                this.f108496e.put(str2, arrayList);
            }
            arrayList.add(str);
        }
    }

    public g z(k5.d dVar) {
        this.f108497f.f0(dVar);
        return this;
    }
}
