package oo;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<a, String> f147229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<a, String> f147230c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f147231a = null;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(26);
        linkedHashMap.put(new a(1), "hstem");
        linkedHashMap.put(new a(3), "vstem");
        linkedHashMap.put(new a(4), "vmoveto");
        linkedHashMap.put(new a(5), "rlineto");
        linkedHashMap.put(new a(6), "hlineto");
        linkedHashMap.put(new a(7), "vlineto");
        linkedHashMap.put(new a(8), "rrcurveto");
        linkedHashMap.put(new a(9), "closepath");
        linkedHashMap.put(new a(10), "callsubr");
        linkedHashMap.put(new a(11), "return");
        linkedHashMap.put(new a(12), "escape");
        linkedHashMap.put(new a(12, 0), "dotsection");
        linkedHashMap.put(new a(12, 1), "vstem3");
        linkedHashMap.put(new a(12, 2), "hstem3");
        linkedHashMap.put(new a(12, 6), "seac");
        linkedHashMap.put(new a(12, 7), "sbw");
        linkedHashMap.put(new a(12, 12), "div");
        linkedHashMap.put(new a(12, 16), "callothersubr");
        linkedHashMap.put(new a(12, 17), "pop");
        linkedHashMap.put(new a(12, 33), "setcurrentpoint");
        linkedHashMap.put(new a(13), "hsbw");
        linkedHashMap.put(new a(14), "endchar");
        linkedHashMap.put(new a(21), "rmoveto");
        linkedHashMap.put(new a(22), "hmoveto");
        linkedHashMap.put(new a(30), "vhcurveto");
        linkedHashMap.put(new a(31), "hvcurveto");
        f147229b = Collections.unmodifiableMap(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(48);
        linkedHashMap2.put(new a(1), "hstem");
        linkedHashMap2.put(new a(3), "vstem");
        linkedHashMap2.put(new a(4), "vmoveto");
        linkedHashMap2.put(new a(5), "rlineto");
        linkedHashMap2.put(new a(6), "hlineto");
        linkedHashMap2.put(new a(7), "vlineto");
        linkedHashMap2.put(new a(8), "rrcurveto");
        linkedHashMap2.put(new a(10), "callsubr");
        linkedHashMap2.put(new a(11), "return");
        linkedHashMap2.put(new a(12), "escape");
        linkedHashMap2.put(new a(12, 3), "and");
        linkedHashMap2.put(new a(12, 4), "or");
        linkedHashMap2.put(new a(12, 5), "not");
        linkedHashMap2.put(new a(12, 9), "abs");
        linkedHashMap2.put(new a(12, 10), "add");
        linkedHashMap2.put(new a(12, 11), "sub");
        linkedHashMap2.put(new a(12, 12), "div");
        linkedHashMap2.put(new a(12, 14), "neg");
        linkedHashMap2.put(new a(12, 15), "eq");
        linkedHashMap2.put(new a(12, 18), "drop");
        linkedHashMap2.put(new a(12, 20), "put");
        linkedHashMap2.put(new a(12, 21), "get");
        linkedHashMap2.put(new a(12, 22), "ifelse");
        linkedHashMap2.put(new a(12, 23), "random");
        linkedHashMap2.put(new a(12, 24), "mul");
        linkedHashMap2.put(new a(12, 26), "sqrt");
        linkedHashMap2.put(new a(12, 27), "dup");
        linkedHashMap2.put(new a(12, 28), "exch");
        linkedHashMap2.put(new a(12, 29), "index");
        linkedHashMap2.put(new a(12, 30), "roll");
        linkedHashMap2.put(new a(12, 34), "hflex");
        linkedHashMap2.put(new a(12, 35), "flex");
        linkedHashMap2.put(new a(12, 36), "hflex1");
        linkedHashMap2.put(new a(12, 37), "flex1");
        linkedHashMap2.put(new a(14), "endchar");
        linkedHashMap2.put(new a(18), "hstemhm");
        linkedHashMap2.put(new a(19), "hintmask");
        linkedHashMap2.put(new a(20), "cntrmask");
        linkedHashMap2.put(new a(21), "rmoveto");
        linkedHashMap2.put(new a(22), "hmoveto");
        linkedHashMap2.put(new a(23), "vstemhm");
        linkedHashMap2.put(new a(24), "rcurveline");
        linkedHashMap2.put(new a(25), "rlinecurve");
        linkedHashMap2.put(new a(26), "vvcurveto");
        linkedHashMap2.put(new a(27), "hhcurveto");
        linkedHashMap2.put(new a(28), "shortint");
        linkedHashMap2.put(new a(29), "callgsubr");
        linkedHashMap2.put(new a(30), "vhcurveto");
        linkedHashMap2.put(new a(31), "hvcurveto");
        f147230c = Collections.unmodifiableMap(linkedHashMap2);
    }

    public p(int i15) {
        b(new a(i15));
    }

    private void b(a aVar) {
        this.f147231a = aVar;
    }

    public a a() {
        return this.f147231a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            return a().equals(((p) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        String str = f147230c.get(a());
        if (str == null) {
            str = f147229b.get(a());
        }
        if (str == null) {
            return a().toString() + '|';
        }
        return str + '|';
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int[] f147232a = null;

        public a(int i15) {
            b(new int[]{i15});
        }

        private void b(int[] iArr) {
            this.f147232a = iArr;
        }

        public int[] a() {
            return this.f147232a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                int[] iArr = this.f147232a;
                int i15 = iArr[0];
                if (i15 == 12) {
                    int[] iArr2 = aVar.f147232a;
                    if (iArr2[0] == 12) {
                        if (iArr.length <= 1 || iArr2.length <= 1) {
                            return iArr.length == iArr2.length;
                        }
                        return iArr[1] == iArr2[1];
                    }
                }
                if (i15 == aVar.f147232a[0]) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int[] iArr = this.f147232a;
            int i15 = iArr[0];
            return (i15 != 12 || iArr.length <= 1) ? i15 : iArr[1] ^ i15;
        }

        public String toString() {
            return Arrays.toString(a());
        }

        public a(int i15, int i16) {
            b(new int[]{i15, i16});
        }

        public a(int[] iArr) {
            b(iArr);
        }
    }

    public p(int i15, int i16) {
        b(new a(i15, i16));
    }

    public p(int[] iArr) {
        b(new a(iArr));
    }
}
