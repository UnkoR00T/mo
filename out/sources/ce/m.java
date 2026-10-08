package ce;

import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public class m implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Bitmap.Config[] f25525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Bitmap.Config[] f25526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Bitmap.Config[] f25527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Bitmap.Config[] f25528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Bitmap.Config[] f25529h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f25530a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g<b, Bitmap> f25531b = new g<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f25532c = new HashMap();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25533a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f25533a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25533a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25533a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25533a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static final class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f25534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f25535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap.Config f25536c;

        public b(c cVar) {
            this.f25534a = cVar;
        }

        @Override // ce.l
        public void a() {
            this.f25534a.c(this);
        }

        public void b(int i15, Bitmap.Config config) {
            this.f25535b = i15;
            this.f25536c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f25535b == bVar.f25535b && ve.l.d(this.f25536c, bVar.f25536c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i15 = this.f25535b * 31;
            Bitmap.Config config = this.f25536c;
            return i15 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return m.h(this.f25535b, this.f25536c);
        }
    }

    static class c extends ce.c<b> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ce.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i15, Bitmap.Config config) {
            b bVarB = b();
            bVarB.b(i15, config);
            return bVarB;
        }
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f25525d = configArr;
        f25526e = configArr;
        f25527f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f25528g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f25529h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void f(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapJ = j(bitmap.getConfig());
        Integer num2 = navigableMapJ.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapJ.remove(num);
                return;
            } else {
                navigableMapJ.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + a(bitmap) + ", this: " + this);
    }

    private b g(int i15, Bitmap.Config config) {
        b bVarE = this.f25530a.e(i15, config);
        for (Bitmap.Config config2 : i(config)) {
            Integer numCeilingKey = j(config2).ceilingKey(Integer.valueOf(i15));
            if (numCeilingKey != null && numCeilingKey.intValue() <= i15 * 8) {
                if (numCeilingKey.intValue() == i15 && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                this.f25530a.c(bVarE);
                return this.f25530a.e(numCeilingKey.intValue(), config2);
            }
        }
        return bVarE;
    }

    static String h(int i15, Bitmap.Config config) {
        return "[" + i15 + "](" + config + ")";
    }

    private static Bitmap.Config[] i(Bitmap.Config config) {
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            return f25526e;
        }
        int i15 = a.f25533a[config.ordinal()];
        if (i15 == 1) {
            return f25525d;
        }
        if (i15 == 2) {
            return f25527f;
        }
        if (i15 != 3) {
            return i15 != 4 ? new Bitmap.Config[]{config} : f25529h;
        }
        return f25528g;
    }

    private NavigableMap<Integer, Integer> j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f25532c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f25532c.put(config, treeMap);
        return treeMap;
    }

    @Override // ce.k
    public String a(Bitmap bitmap) {
        return h(ve.l.h(bitmap), bitmap.getConfig());
    }

    @Override // ce.k
    public String b(int i15, int i16, Bitmap.Config config) {
        return h(ve.l.g(i15, i16, config), config);
    }

    @Override // ce.k
    public void c(Bitmap bitmap) {
        b bVarE = this.f25530a.e(ve.l.h(bitmap), bitmap.getConfig());
        this.f25531b.d(bVarE, bitmap);
        NavigableMap<Integer, Integer> navigableMapJ = j(bitmap.getConfig());
        Integer num = navigableMapJ.get(Integer.valueOf(bVarE.f25535b));
        navigableMapJ.put(Integer.valueOf(bVarE.f25535b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // ce.k
    public Bitmap d(int i15, int i16, Bitmap.Config config) {
        b bVarG = g(ve.l.g(i15, i16, config), config);
        Bitmap bitmapA = this.f25531b.a(bVarG);
        if (bitmapA != null) {
            f(Integer.valueOf(bVarG.f25535b), bitmapA);
            bitmapA.reconfigure(i15, i16, config);
        }
        return bitmapA;
    }

    @Override // ce.k
    public int e(Bitmap bitmap) {
        return ve.l.h(bitmap);
    }

    @Override // ce.k
    public Bitmap removeLast() {
        Bitmap bitmapF = this.f25531b.f();
        if (bitmapF != null) {
            f(Integer.valueOf(ve.l.h(bitmapF)), bitmapF);
        }
        return bitmapF;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("SizeConfigStrategy{groupedMap=");
        sb5.append(this.f25531b);
        sb5.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f25532c.entrySet()) {
            sb5.append(entry.getKey());
            sb5.append('[');
            sb5.append(entry.getValue());
            sb5.append("], ");
        }
        if (!this.f25532c.isEmpty()) {
            sb5.replace(sb5.length() - 2, sb5.length(), "");
        }
        sb5.append(")}");
        return sb5.toString();
    }
}
