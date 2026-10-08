package oo;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h implements mo.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f147171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Map<String, Object> f147172b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected b f147173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected byte[][] f147174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected byte[][] f147175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private k.b f147176f;

    public void a(String str, Object obj) {
        if (obj != null) {
            this.f147172b.put(str, obj);
        }
    }

    public b d() {
        return this.f147173c;
    }

    public abstract v e(int i15);

    void f(b bVar) {
        this.f147173c = bVar;
    }

    final void g(k.b bVar) {
        this.f147176f = bVar;
    }

    @Override // mo.b
    public String getName() {
        return this.f147171a;
    }

    @Override // mo.b
    public uo.a h() {
        return new uo.a((List) this.f147172b.get("FontBBox"));
    }

    void i(byte[][] bArr) {
        this.f147175e = bArr;
    }

    void j(String str) {
        this.f147171a = str;
    }

    public String toString() {
        return getClass().getSimpleName() + "[name=" + this.f147171a + ", topDict=" + this.f147172b + ", charset=" + this.f147173c + ", charStrings=" + Arrays.deepToString(this.f147174d) + "]";
    }
}
