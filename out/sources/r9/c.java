package r9;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f172359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f172360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f172361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f172362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f172363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String[] f172364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f172365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f172366i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f172367j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final HashMap<String, Integer> f172368k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final HashMap<String, Integer> f172369l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<c> f172370m;

    private c(String str, String str2, long j15, long j16, g gVar, String[] strArr, String str3, String str4, c cVar) {
        this.f172358a = str;
        this.f172359b = str2;
        this.f172366i = str4;
        this.f172363f = gVar;
        this.f172364g = strArr;
        this.f172360c = str2 != null;
        this.f172361d = j15;
        this.f172362e = j16;
        this.f172365h = (String) p.q(str3);
        this.f172367j = cVar;
        this.f172368k = new HashMap<>();
        this.f172369l = new HashMap<>();
    }

    private void b(Map<String, g> map, v7.a.b bVar, int i15, int i16, int i17) {
        g gVarF = f.f(this.f172363f, this.f172364g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.o(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (gVarF != null) {
            f.a(spannableStringBuilder2, i15, i16, gVarF, this.f172367j, map, i17);
            if ("p".equals(this.f172358a)) {
                if (gVarF.m() != Float.MAX_VALUE) {
                    bVar.m((gVarF.m() * (-90.0f)) / 100.0f);
                }
                if (gVarF.o() != null) {
                    bVar.p(gVarF.o());
                }
                if (gVarF.i() != null) {
                    bVar.j(gVarF.i());
                }
            }
        }
    }

    public static c c(String str, long j15, long j16, g gVar, String[] strArr, String str2, String str3, c cVar) {
        return new c(str, null, j15, j16, gVar, strArr, str2, str3, cVar);
    }

    public static c d(String str) {
        return new c(null, f.b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static void e(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i15 = 0; i15 < spannableStringBuilder.length(); i15++) {
            if (spannableStringBuilder.charAt(i15) == ' ') {
                int i16 = i15 + 1;
                int i17 = i16;
                while (i17 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i17) == ' ') {
                    i17++;
                }
                int i18 = i17 - i16;
                if (i18 > 0) {
                    spannableStringBuilder.delete(i15, i18 + i15);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i19 = 0; i19 < spannableStringBuilder.length() - 1; i19++) {
            if (spannableStringBuilder.charAt(i19) == '\n') {
                int i25 = i19 + 1;
                if (spannableStringBuilder.charAt(i25) == ' ') {
                    spannableStringBuilder.delete(i25, i19 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i26 = 0; i26 < spannableStringBuilder.length() - 1; i26++) {
            if (spannableStringBuilder.charAt(i26) == ' ') {
                int i27 = i26 + 1;
                if (spannableStringBuilder.charAt(i27) == '\n') {
                    spannableStringBuilder.delete(i26, i27);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    private void i(TreeSet<Long> treeSet, boolean z15) {
        boolean zEquals = "p".equals(this.f172358a);
        boolean zEquals2 = "div".equals(this.f172358a);
        if (z15 || zEquals || (zEquals2 && this.f172366i != null)) {
            long j15 = this.f172361d;
            if (j15 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j15));
            }
            long j16 = this.f172362e;
            if (j16 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j16));
            }
        }
        if (this.f172370m == null) {
            return;
        }
        for (int i15 = 0; i15 < this.f172370m.size(); i15++) {
            this.f172370m.get(i15).i(treeSet, z15 || zEquals);
        }
    }

    private static SpannableStringBuilder k(String str, Map<String, v7.a.b> map) {
        if (!map.containsKey(str)) {
            v7.a.b bVar = new v7.a.b();
            bVar.o(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) p.q(map.get(str).e());
    }

    private void n(long j15, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f172365h)) {
            str = this.f172365h;
        }
        if (m(j15) && "div".equals(this.f172358a) && this.f172366i != null) {
            list.add(new Pair<>(str, this.f172366i));
            return;
        }
        for (int i15 = 0; i15 < g(); i15++) {
            f(i15).n(j15, str, list);
        }
    }

    private void o(long j15, Map<String, g> map, Map<String, e> map2, String str, Map<String, v7.a.b> map3) {
        if (m(j15)) {
            String str2 = "".equals(this.f172365h) ? str : this.f172365h;
            Iterator<Map.Entry<String, Integer>> it = this.f172369l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.f172368k.containsKey(key) ? this.f172368k.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    b(map, (v7.a.b) p.q(map3.get(key)), iIntValue, iIntValue2, ((e) p.q(map2.get(str2))).f172394j);
                }
            }
            for (int i15 = 0; i15 < g(); i15++) {
                f(i15).o(j15, map, map2, str2, map3);
            }
        }
    }

    private void p(long j15, boolean z15, String str, Map<String, v7.a.b> map) {
        this.f172368k.clear();
        this.f172369l.clear();
        if ("metadata".equals(this.f172358a)) {
            return;
        }
        if (!"".equals(this.f172365h)) {
            str = this.f172365h;
        }
        String str2 = str;
        if (this.f172360c && z15) {
            k(str2, map).append((CharSequence) p.q(this.f172359b));
            return;
        }
        if ("br".equals(this.f172358a) && z15) {
            k(str2, map).append('\n');
            return;
        }
        if (m(j15)) {
            for (Map.Entry<String, v7.a.b> entry : map.entrySet()) {
                this.f172368k.put(entry.getKey(), Integer.valueOf(((CharSequence) p.q(entry.getValue().e())).length()));
            }
            boolean zEquals = "p".equals(this.f172358a);
            int i15 = 0;
            while (i15 < g()) {
                f(i15).p(j15, z15 || zEquals, str2, map);
                i15++;
                j15 = j15;
                map = map;
            }
            Map<String, v7.a.b> map2 = map;
            if (zEquals) {
                f.c(k(str2, map2));
            }
            for (Map.Entry<String, v7.a.b> entry2 : map2.entrySet()) {
                this.f172369l.put(entry2.getKey(), Integer.valueOf(((CharSequence) p.q(entry2.getValue().e())).length()));
            }
        }
    }

    public void a(c cVar) {
        if (this.f172370m == null) {
            this.f172370m = new ArrayList();
        }
        this.f172370m.add(cVar);
    }

    public c f(int i15) {
        List<c> list = this.f172370m;
        if (list != null) {
            return list.get(i15);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<c> list = this.f172370m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<v7.a> h(long j15, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        n(j15, this.f172365h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j15, false, this.f172365h, treeMap);
        o(j15, map, map2, this.f172365h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                e eVar = (e) p.q(map2.get(pair.first));
                arrayList2.add(new v7.a.b().f(bitmapDecodeByteArray).k(eVar.f172386b).l(0).h(eVar.f172387c, 0).i(eVar.f172389e).n(eVar.f172390f).g(eVar.f172391g).r(eVar.f172394j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) p.q(map2.get(entry.getKey()));
            v7.a.b bVar = (v7.a.b) entry.getValue();
            e((SpannableStringBuilder) p.q(bVar.e()));
            bVar.h(eVar2.f172387c, eVar2.f172388d);
            bVar.i(eVar2.f172389e);
            bVar.k(eVar2.f172386b);
            bVar.n(eVar2.f172390f);
            bVar.q(eVar2.f172393i, eVar2.f172392h);
            bVar.r(eVar2.f172394j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    public long[] j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i15 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i15] = it.next().longValue();
            i15++;
        }
        return jArr;
    }

    public String[] l() {
        return this.f172364g;
    }

    public boolean m(long j15) {
        long j16 = this.f172361d;
        if (j16 == -9223372036854775807L && this.f172362e == -9223372036854775807L) {
            return true;
        }
        if (j16 <= j15 && this.f172362e == -9223372036854775807L) {
            return true;
        }
        if (j16 != -9223372036854775807L || j15 >= this.f172362e) {
            return j16 <= j15 && j15 < this.f172362e;
        }
        return true;
    }
}
