package so;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class y extends l0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<x> f182833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<Integer, Map<Integer, Map<Integer, Map<Integer, String>>>> f182834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f182835i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f182836j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f182837k;

    y(n0 n0Var) {
        super(n0Var);
        this.f182835i = null;
        this.f182836j = null;
        this.f182837k = null;
    }

    private String j(int i15) {
        for (int i16 = 4; i16 >= 0; i16--) {
            String strM = m(i15, 0, i16, 0);
            if (strM != null) {
                return strM;
            }
        }
        String strM2 = m(i15, 3, 1, 1033);
        return strM2 != null ? strM2 : m(i15, 1, 0, 0);
    }

    @Override // so.l0
    void e(n0 n0Var, i0 i0Var) {
        i0Var.N();
        int iN = i0Var.N();
        i0Var.N();
        this.f182833g = new ArrayList(iN);
        for (int i15 = 0; i15 < iN; i15++) {
            x xVar = new x();
            xVar.h(n0Var, i0Var);
            this.f182833g.add(xVar);
        }
        for (x xVar2 : this.f182833g) {
            if (xVar2.g() > b()) {
                xVar2.i(null);
            } else {
                i0Var.seek(c() + 6 + ((long) (iN * 12)) + ((long) xVar2.g()));
                int iD = xVar2.d();
                int iC = xVar2.c();
                Charset charset = uo.b.f199525a;
                if ((iD == 3 && (iC == 0 || iC == 1)) || iD == 0) {
                    charset = uo.b.f199526b;
                } else if (iD == 2) {
                    if (iC == 0) {
                        charset = uo.b.f199528d;
                    } else if (iC == 1) {
                        charset = uo.b.f199529e;
                    }
                }
                xVar2.i(i0Var.I(xVar2.f(), charset));
            }
        }
        this.f182834h = new HashMap(this.f182833g.size());
        for (x xVar3 : this.f182833g) {
            Map<Integer, Map<Integer, Map<Integer, String>>> map = this.f182834h.get(Integer.valueOf(xVar3.b()));
            if (map == null) {
                map = new HashMap<>();
                this.f182834h.put(Integer.valueOf(xVar3.b()), map);
            }
            Map<Integer, Map<Integer, String>> map2 = map.get(Integer.valueOf(xVar3.d()));
            if (map2 == null) {
                map2 = new HashMap<>();
                map.put(Integer.valueOf(xVar3.d()), map2);
            }
            Map<Integer, String> map3 = map2.get(Integer.valueOf(xVar3.c()));
            if (map3 == null) {
                map3 = new HashMap<>();
                map2.put(Integer.valueOf(xVar3.c()), map3);
            }
            map3.put(Integer.valueOf(xVar3.a()), xVar3.e());
        }
        this.f182835i = j(1);
        this.f182836j = j(2);
        String strM = m(6, 1, 0, 0);
        this.f182837k = strM;
        if (strM == null) {
            this.f182837k = m(6, 3, 1, 1033);
        }
        String str = this.f182837k;
        if (str != null) {
            this.f182837k = str.trim();
        }
        this.f182681e = true;
    }

    public String k() {
        return this.f182835i;
    }

    public String l() {
        return this.f182836j;
    }

    public String m(int i15, int i16, int i17, int i18) {
        Map<Integer, Map<Integer, String>> map;
        Map<Integer, String> map2;
        Map<Integer, Map<Integer, Map<Integer, String>>> map3 = this.f182834h.get(Integer.valueOf(i15));
        if (map3 == null || (map = map3.get(Integer.valueOf(i16))) == null || (map2 = map.get(Integer.valueOf(i17))) == null) {
            return null;
        }
        return map2.get(Integer.valueOf(i18));
    }

    public List<x> n() {
        return this.f182833g;
    }

    public String o() {
        return this.f182837k;
    }
}
