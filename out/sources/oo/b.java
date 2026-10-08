package oo;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f147159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Integer, Integer> f147160b = new HashMap(250);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Integer, Integer> f147161c = new HashMap(250);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, Integer> f147162d = new HashMap(250);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<Integer, Integer> f147163e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<Integer, String> f147164f = new HashMap(250);

    b(boolean z15) {
        this.f147159a = z15;
    }

    public void a(int i15, int i16) {
        if (!this.f147159a) {
            throw new IllegalStateException("Not a CIDFont");
        }
        this.f147160b.put(Integer.valueOf(i16), Integer.valueOf(i15));
        this.f147163e.put(Integer.valueOf(i15), Integer.valueOf(i16));
    }

    public void b(int i15, int i16, String str) {
        if (this.f147159a) {
            throw new IllegalStateException("Not a Type 1-equivalent font");
        }
        this.f147160b.put(Integer.valueOf(i16), Integer.valueOf(i15));
        this.f147161c.put(Integer.valueOf(i15), Integer.valueOf(i16));
        this.f147162d.put(str, Integer.valueOf(i16));
        this.f147164f.put(Integer.valueOf(i15), str);
    }

    public int c(int i15) {
        if (!this.f147159a) {
            throw new IllegalStateException("Not a CIDFont");
        }
        Integer num = this.f147160b.get(Integer.valueOf(i15));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    int d(int i15) {
        if (this.f147159a) {
            throw new IllegalStateException("Not a Type 1-equivalent font");
        }
        Integer num = this.f147160b.get(Integer.valueOf(i15));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    int e(String str) {
        if (this.f147159a) {
            throw new IllegalStateException("Not a Type 1-equivalent font");
        }
        Integer num = this.f147162d.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    int f(int i15) {
        if (this.f147159a) {
            throw new IllegalStateException("Not a Type 1-equivalent font");
        }
        Integer num = this.f147161c.get(Integer.valueOf(i15));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public boolean g() {
        return this.f147159a;
    }
}
