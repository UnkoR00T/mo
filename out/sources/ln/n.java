package ln;

import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n implements en.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f118894a = Pattern.compile("[0-9]+");

    protected static int b(boolean[] zArr, int i15, int[] iArr, boolean z15) {
        int i16 = 0;
        for (int i17 : iArr) {
            int i18 = 0;
            while (i18 < i17) {
                zArr[i15] = z15;
                i18++;
                i15++;
            }
            i16 += i17;
            z15 = !z15;
        }
        return i16;
    }

    protected static void c(String str) {
        if (!f118894a.matcher(str).matches()) {
            throw new IllegalArgumentException("Input should only contain digits 0-9");
        }
    }

    private static hn.b h(boolean[] zArr, int i15, int i16, int i17) {
        int length = zArr.length;
        int i18 = i17 + length;
        int iMax = Math.max(i15, i18);
        int iMax2 = Math.max(1, i16);
        int i19 = iMax / i18;
        int i25 = (iMax - (length * i19)) / 2;
        hn.b bVar = new hn.b(iMax, iMax2);
        int i26 = 0;
        while (i26 < length) {
            if (zArr[i26]) {
                bVar.m(i25, 0, i19, iMax2);
            }
            i26++;
            i25 += i19;
        }
        return bVar;
    }

    @Override // en.g
    public hn.b a(String str, en.a aVar, int i15, int i16, Map<en.c, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i15 < 0 || i16 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i15 + 'x' + i16);
        }
        Collection<en.a> collectionG = g();
        if (collectionG == null || collectionG.contains(aVar)) {
            int iF = f();
            if (map != null) {
                en.c cVar = en.c.MARGIN;
                if (map.containsKey(cVar)) {
                    iF = Integer.parseInt(map.get(cVar).toString());
                }
            }
            return h(e(str, map), i15, i16, iF);
        }
        throw new IllegalArgumentException("Can only encode " + collectionG + ", but got " + aVar);
    }

    public abstract boolean[] d(String str);

    public boolean[] e(String str, Map<en.c, ?> map) {
        return d(str);
    }

    public int f() {
        return 10;
    }

    protected abstract Collection<en.a> g();
}
