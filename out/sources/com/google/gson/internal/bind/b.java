package com.google.gson.internal.bind;

import com.google.gson.i;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.r;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends zl.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Reader f36829x = new a();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Object f36830y = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Object[] f36831s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f36832t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String[] f36833v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int[] f36834w;

    class a extends Reader {
        a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i15, int i16) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.b$b, reason: collision with other inner class name */
    static /* synthetic */ class C0766b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36835a;

        static {
            int[] iArr = new int[zl.b.values().length];
            f36835a = iArr;
            try {
                iArr[zl.b.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36835a[zl.b.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36835a[zl.b.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36835a[zl.b.END_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public b(l lVar) {
        super(f36829x);
        this.f36831s = new Object[32];
        this.f36832t = 0;
        this.f36833v = new String[32];
        this.f36834w = new int[32];
        D1(lVar);
    }

    private String C(boolean z15) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append('$');
        int i15 = 0;
        while (true) {
            int i16 = this.f36832t;
            if (i15 >= i16) {
                return sb5.toString();
            }
            Object[] objArr = this.f36831s;
            Object obj = objArr[i15];
            if (obj instanceof i) {
                i15++;
                if (i15 < i16 && (objArr[i15] instanceof Iterator)) {
                    int i17 = this.f36834w[i15];
                    if (z15 && i17 > 0 && (i15 == i16 - 1 || i15 == i16 - 2)) {
                        i17--;
                    }
                    sb5.append('[');
                    sb5.append(i17);
                    sb5.append(']');
                }
            } else if ((obj instanceof o) && (i15 = i15 + 1) < i16 && (objArr[i15] instanceof Iterator)) {
                sb5.append('.');
                String str = this.f36833v[i15];
                if (str != null) {
                    sb5.append(str);
                }
            }
            i15++;
        }
    }

    private void D1(Object obj) {
        int i15 = this.f36832t;
        Object[] objArr = this.f36831s;
        if (i15 == objArr.length) {
            int i16 = i15 * 2;
            this.f36831s = Arrays.copyOf(objArr, i16);
            this.f36834w = Arrays.copyOf(this.f36834w, i16);
            this.f36833v = (String[]) Arrays.copyOf(this.f36833v, i16);
        }
        Object[] objArr2 = this.f36831s;
        int i17 = this.f36832t;
        this.f36832t = i17 + 1;
        objArr2[i17] = obj;
    }

    private String L() {
        return " at path " + W();
    }

    private void d1(zl.b bVar) {
        if (a0() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + a0() + L());
    }

    private String o1(boolean z15) {
        d1(zl.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) s1()).next();
        String str = (String) entry.getKey();
        this.f36833v[this.f36832t - 1] = z15 ? "<skipped>" : str;
        D1(entry.getValue());
        return str;
    }

    private Object s1() {
        return this.f36831s[this.f36832t - 1];
    }

    private Object x1() {
        Object[] objArr = this.f36831s;
        int i15 = this.f36832t - 1;
        this.f36832t = i15;
        Object obj = objArr[i15];
        objArr[i15] = null;
        return obj;
    }

    public void C1() {
        d1(zl.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) s1()).next();
        D1(entry.getValue());
        D1(new r((String) entry.getKey()));
    }

    @Override // zl.a
    public String E() {
        return C(true);
    }

    @Override // zl.a
    public void G0() throws zl.d {
        int i15 = C0766b.f36835a[a0().ordinal()];
        if (i15 == 1) {
            o1(true);
            return;
        }
        if (i15 == 2) {
            u();
            return;
        }
        if (i15 == 3) {
            h0();
            return;
        }
        if (i15 != 4) {
            x1();
            int i16 = this.f36832t;
            if (i16 > 0) {
                int[] iArr = this.f36834w;
                int i17 = i16 - 1;
                iArr[i17] = iArr[i17] + 1;
            }
        }
    }

    @Override // zl.a
    public boolean I() throws zl.d {
        zl.b bVarA0 = a0();
        return (bVarA0 == zl.b.END_OBJECT || bVarA0 == zl.b.END_ARRAY || bVarA0 == zl.b.END_DOCUMENT) ? false : true;
    }

    @Override // zl.a
    public boolean M() {
        d1(zl.b.BOOLEAN);
        boolean zS = ((r) x1()).s();
        int i15 = this.f36832t;
        if (i15 > 0) {
            int[] iArr = this.f36834w;
            int i16 = i15 - 1;
            iArr[i16] = iArr[i16] + 1;
        }
        return zS;
    }

    @Override // zl.a
    public void O() {
        d1(zl.b.NULL);
        x1();
        int i15 = this.f36832t;
        if (i15 > 0) {
            int[] iArr = this.f36834w;
            int i16 = i15 - 1;
            iArr[i16] = iArr[i16] + 1;
        }
    }

    @Override // zl.a
    public String W() {
        return C(false);
    }

    @Override // zl.a
    public void Y() {
        d1(zl.b.BEGIN_OBJECT);
        D1(((o) s1()).entrySet().iterator());
    }

    @Override // zl.a
    public zl.b a0() throws zl.d {
        if (this.f36832t == 0) {
            return zl.b.END_DOCUMENT;
        }
        Object objS1 = s1();
        if (objS1 instanceof Iterator) {
            boolean z15 = this.f36831s[this.f36832t - 2] instanceof o;
            Iterator it = (Iterator) objS1;
            if (!it.hasNext()) {
                return z15 ? zl.b.END_OBJECT : zl.b.END_ARRAY;
            }
            if (z15) {
                return zl.b.NAME;
            }
            D1(it.next());
            return a0();
        }
        if (objS1 instanceof o) {
            return zl.b.BEGIN_OBJECT;
        }
        if (objS1 instanceof i) {
            return zl.b.BEGIN_ARRAY;
        }
        if (objS1 instanceof r) {
            r rVar = (r) objS1;
            if (rVar.A()) {
                return zl.b.STRING;
            }
            if (rVar.w()) {
                return zl.b.BOOLEAN;
            }
            if (rVar.z()) {
                return zl.b.NUMBER;
            }
            throw new AssertionError();
        }
        if (objS1 instanceof n) {
            return zl.b.NULL;
        }
        if (objS1 == f36830y) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new zl.d("Custom JsonElement subclass " + objS1.getClass().getName() + " is not supported");
    }

    @Override // zl.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f36831s = new Object[]{f36830y};
        this.f36832t = 1;
    }

    @Override // zl.a
    public void h() {
        d1(zl.b.BEGIN_ARRAY);
        D1(((i) s1()).iterator());
        this.f36834w[this.f36832t - 1] = 0;
    }

    @Override // zl.a
    public void h0() {
        d1(zl.b.END_OBJECT);
        this.f36833v[this.f36832t - 1] = null;
        x1();
        x1();
        int i15 = this.f36832t;
        if (i15 > 0) {
            int[] iArr = this.f36834w;
            int i16 = i15 - 1;
            iArr[i16] = iArr[i16] + 1;
        }
    }

    @Override // zl.a
    public String h1() {
        return o1(false);
    }

    l i1() throws zl.d {
        zl.b bVarA0 = a0();
        if (bVarA0 != zl.b.NAME && bVarA0 != zl.b.END_ARRAY && bVarA0 != zl.b.END_OBJECT && bVarA0 != zl.b.END_DOCUMENT) {
            l lVar = (l) s1();
            G0();
            return lVar;
        }
        throw new IllegalStateException("Unexpected " + bVarA0 + " when reading a JsonElement.");
    }

    @Override // zl.a
    public double nextDouble() throws zl.d {
        zl.b bVarA0 = a0();
        zl.b bVar = zl.b.NUMBER;
        if (bVarA0 != bVar && bVarA0 != zl.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarA0 + L());
        }
        double dT = ((r) s1()).t();
        if (!J() && (Double.isNaN(dT) || Double.isInfinite(dT))) {
            throw new zl.d("JSON forbids NaN and infinities: " + dT);
        }
        x1();
        int i15 = this.f36832t;
        if (i15 > 0) {
            int[] iArr = this.f36834w;
            int i16 = i15 - 1;
            iArr[i16] = iArr[i16] + 1;
        }
        return dT;
    }

    @Override // zl.a
    public int nextInt() throws zl.d {
        zl.b bVarA0 = a0();
        zl.b bVar = zl.b.NUMBER;
        if (bVarA0 != bVar && bVarA0 != zl.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarA0 + L());
        }
        int iU = ((r) s1()).u();
        x1();
        int i15 = this.f36832t;
        if (i15 > 0) {
            int[] iArr = this.f36834w;
            int i16 = i15 - 1;
            iArr[i16] = iArr[i16] + 1;
        }
        return iU;
    }

    @Override // zl.a
    public long nextLong() throws zl.d {
        zl.b bVarA0 = a0();
        zl.b bVar = zl.b.NUMBER;
        if (bVarA0 != bVar && bVarA0 != zl.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarA0 + L());
        }
        long jV = ((r) s1()).v();
        x1();
        int i15 = this.f36832t;
        if (i15 > 0) {
            int[] iArr = this.f36834w;
            int i16 = i15 - 1;
            iArr[i16] = iArr[i16] + 1;
        }
        return jV;
    }

    @Override // zl.a
    public String q2() throws zl.d {
        zl.b bVarA0 = a0();
        zl.b bVar = zl.b.STRING;
        if (bVarA0 == bVar || bVarA0 == zl.b.NUMBER) {
            String strI = ((r) x1()).i();
            int i15 = this.f36832t;
            if (i15 > 0) {
                int[] iArr = this.f36834w;
                int i16 = i15 - 1;
                iArr[i16] = iArr[i16] + 1;
            }
            return strI;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + bVarA0 + L());
    }

    @Override // zl.a
    public String toString() {
        return b.class.getSimpleName() + L();
    }

    @Override // zl.a
    public void u() {
        d1(zl.b.END_ARRAY);
        x1();
        x1();
        int i15 = this.f36832t;
        if (i15 > 0) {
            int[] iArr = this.f36834w;
            int i16 = i15 - 1;
            iArr[i16] = iArr[i16] + 1;
        }
    }
}
