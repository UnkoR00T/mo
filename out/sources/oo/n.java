package oo;

import android.graphics.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class n extends h implements mo.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f147224h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, Object> f147223g = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map<Integer, v> f147225j = new ConcurrentHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b f147226k = new b();

    private class b implements to.c {
        private b() {
        }

        @Override // to.c
        public t a(String str) {
            return n.this.t(str);
        }
    }

    private int l() {
        Number number = (Number) s("defaultWidthX");
        if (number == null) {
            return 1000;
        }
        return number.intValue();
    }

    private byte[][] o() {
        return (byte[][]) this.f147223g.get("Subrs");
    }

    private int q() {
        Number number = (Number) s("nominalWidthX");
        if (number == null) {
            return 0;
        }
        return number.intValue();
    }

    private Object s(String str) {
        Object obj = this.f147172b.get(str);
        return obj != null ? obj : this.f147223g.get(str);
    }

    private v u(int i15, String str) {
        v vVar = this.f147225j.get(Integer.valueOf(i15));
        if (vVar != null) {
            return vVar;
        }
        byte[][] bArr = this.f147174d;
        byte[] bArr2 = i15 < bArr.length ? bArr[i15] : null;
        if (bArr2 == null) {
            bArr2 = bArr[0];
        }
        v vVar2 = new v(this.f147226k, this.f147171a, str, i15, new w(this.f147171a, str).b(bArr2, this.f147175e, o()), l(), q());
        this.f147225j.put(Integer.valueOf(i15), vVar2);
        return vVar2;
    }

    @Override // mo.b
    public List<Number> b() {
        return (List) this.f147172b.get("FontMatrix");
    }

    @Override // oo.h
    public v e(int i15) {
        return u(i15, "GID+" + i15);
    }

    void k(String str, Object obj) {
        if (obj != null) {
            this.f147223g.put(str, obj);
        }
    }

    @Override // mo.b
    public boolean m(String str) {
        return this.f147173c.d(this.f147173c.e(str)) != 0;
    }

    @Override // mo.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public d c() {
        return this.f147224h;
    }

    @Override // mo.b
    public float p(String str) {
        return t(str).e();
    }

    @Override // mo.b
    public Path r(String str) {
        return t(str).d();
    }

    public t t(String str) {
        return u(v(str), str);
    }

    public int v(String str) {
        return this.f147173c.d(this.f147173c.e(str));
    }

    void w(d dVar) {
        this.f147224h = dVar;
    }
}
