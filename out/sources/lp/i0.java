package lp;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Integer, String> f119108a = new TreeMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f119109b = 0;

    i0() {
    }

    static boolean b(Map.Entry<Integer, String> entry, Map.Entry<Integer, String> entry2) {
        return entry != null && entry2 != null && c(entry.getKey().intValue(), entry2.getKey().intValue()) && d(entry.getValue(), entry2.getValue());
    }

    static boolean c(int i15, int i16) {
        if (i15 + 1 != i16) {
            return false;
        }
        return ((i15 >> 8) & GF2Field.MASK) == ((i16 >> 8) & GF2Field.MASK) && (i15 & GF2Field.MASK) < (i16 & GF2Field.MASK);
    }

    static boolean d(String str, String str2) {
        return !str.isEmpty() && !str2.isEmpty() && c(str.codePointAt(0), str2.codePointAt(0)) && str.codePointCount(0, str.length()) == 1;
    }

    private void e(BufferedWriter bufferedWriter, String str) throws IOException {
        bufferedWriter.write(str);
        bufferedWriter.write(10);
    }

    public void a(int i15, String str) {
        if (i15 < 0 || i15 > 65535) {
            throw new IllegalArgumentException("CID is not valid");
        }
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Text is null or empty");
        }
        this.f119108a.put(Integer.valueOf(i15), str);
    }

    public void f(OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, xp.a.f220412a));
        e(bufferedWriter, "/CIDInit /ProcSet findresource begin");
        e(bufferedWriter, "12 dict begin\n");
        e(bufferedWriter, "begincmap");
        e(bufferedWriter, "/CIDSystemInfo");
        e(bufferedWriter, "<< /Registry (Adobe)");
        e(bufferedWriter, "/Ordering (UCS)");
        e(bufferedWriter, "/Supplement 0");
        e(bufferedWriter, ">> def\n");
        e(bufferedWriter, "/CMapName /Adobe-Identity-UCS def");
        e(bufferedWriter, "/CMapType 2 def\n");
        if (this.f119109b != 0) {
            e(bufferedWriter, "/WMode /" + this.f119109b + " def");
        }
        e(bufferedWriter, "1 begincodespacerange");
        e(bufferedWriter, "<0000> <FFFF>");
        e(bufferedWriter, "endcodespacerange\n");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Map.Entry<Integer, String> entry = null;
        for (Map.Entry<Integer, String> entry2 : this.f119108a.entrySet()) {
            if (b(entry, entry2)) {
                arrayList2.set(arrayList2.size() - 1, entry2.getKey());
            } else {
                arrayList.add(entry2.getKey());
                arrayList2.add(entry2.getKey());
                arrayList3.add(entry2.getValue());
            }
            entry = entry2;
        }
        int iCeil = (int) Math.ceil(((double) arrayList.size()) / 100.0d);
        int i15 = 0;
        while (i15 < iCeil) {
            int size = i15 == iCeil + (-1) ? arrayList.size() - (i15 * 100) : 100;
            bufferedWriter.write(size + " beginbfrange\n");
            for (int i16 = 0; i16 < size; i16++) {
                int i17 = (i15 * 100) + i16;
                bufferedWriter.write(60);
                bufferedWriter.write(xp.c.a(((Integer) arrayList.get(i17)).shortValue()));
                bufferedWriter.write("> ");
                bufferedWriter.write(60);
                bufferedWriter.write(xp.c.a(((Integer) arrayList2.get(i17)).shortValue()));
                bufferedWriter.write("> ");
                bufferedWriter.write(60);
                bufferedWriter.write(xp.c.b((String) arrayList3.get(i17)));
                bufferedWriter.write(">\n");
            }
            e(bufferedWriter, "endbfrange\n");
            i15++;
        }
        e(bufferedWriter, "endcmap");
        e(bufferedWriter, "CMapName currentdict /CMap defineresource pop");
        e(bufferedWriter, "end");
        e(bufferedWriter, "end");
        bufferedWriter.flush();
    }
}
