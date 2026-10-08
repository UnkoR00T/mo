package oo;

import android.graphics.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class a extends h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f147150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f147151h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f147152j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private s f147155m;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<Map<String, Object>> f147153k = new LinkedList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<Map<String, Object>> f147154l = new LinkedList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map<Integer, o> f147156n = new ConcurrentHashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final b f147157p = new b();

    private class b implements to.c {
        private b() {
        }

        @Override // to.c
        public t a(String str) {
            return a.this.e(0);
        }
    }

    private int k(int i15) {
        int iA = this.f147155m.a(i15);
        if (iA == -1) {
            return 1000;
        }
        Map<String, Object> map = this.f147154l.get(iA);
        if (map.containsKey("defaultWidthX")) {
            return ((Number) map.get("defaultWidthX")).intValue();
        }
        return 1000;
    }

    private byte[][] n(int i15) {
        int iA = this.f147155m.a(i15);
        if (iA == -1) {
            return null;
        }
        return (byte[][]) this.f147154l.get(iA).get("Subrs");
    }

    private int o(int i15) {
        int iA = this.f147155m.a(i15);
        if (iA == -1) {
            return 0;
        }
        Map<String, Object> map = this.f147154l.get(iA);
        if (map.containsKey("nominalWidthX")) {
            return ((Number) map.get("nominalWidthX")).intValue();
        }
        return 0;
    }

    private int v(String str) {
        if (str.startsWith("\\")) {
            return Integer.parseInt(str.substring(1));
        }
        throw new IllegalArgumentException("Invalid selector");
    }

    void A(String str) {
        this.f147150g = str;
    }

    void B(int i15) {
        this.f147152j = i15;
    }

    @Override // mo.b
    public List<Number> b() {
        return (List) this.f147172b.get("FontMatrix");
    }

    public List<Map<String, Object>> l() {
        return this.f147153k;
    }

    @Override // mo.b
    public boolean m(String str) {
        return v(str) != 0;
    }

    @Override // mo.b
    public float p(String str) {
        return e(v(str)).e();
    }

    public String q() {
        return this.f147151h;
    }

    @Override // mo.b
    public Path r(String str) {
        return e(v(str)).d();
    }

    public String s() {
        return this.f147150g;
    }

    public int t() {
        return this.f147152j;
    }

    @Override // oo.h
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public o e(int i15) {
        o oVar = this.f147156n.get(Integer.valueOf(i15));
        if (oVar != null) {
            return oVar;
        }
        int iC = this.f147173c.c(i15);
        byte[][] bArr = this.f147174d;
        byte[] bArr2 = bArr[iC];
        if (bArr2 == null) {
            bArr2 = bArr[0];
        }
        o oVar2 = new o(this.f147157p, this.f147171a, i15, iC, new w(this.f147171a, i15).b(bArr2, this.f147175e, n(iC)), k(iC), o(iC));
        this.f147156n.put(Integer.valueOf(i15), oVar2);
        return oVar2;
    }

    void w(s sVar) {
        this.f147155m = sVar;
    }

    void x(List<Map<String, Object>> list) {
        this.f147153k = list;
    }

    void y(String str) {
        this.f147151h = str;
    }

    void z(List<Map<String, Object>> list) {
        this.f147154l = list;
    }
}
