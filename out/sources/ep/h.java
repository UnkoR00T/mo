package ep;

import bp.o;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f52618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f52619d = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Long, Object> f52616a = new TreeMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<Long> f52617b = new TreeSet();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f52620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f52621b;

        a() {
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f52622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f52623b;

        b() {
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f52624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f52625b;
    }

    public h(bp.e eVar) {
        this.f52618c = eVar.A3();
    }

    private List<Long> c() {
        LinkedList linkedList = new LinkedList();
        TreeSet<Long> treeSet = new TreeSet();
        treeSet.add(0L);
        treeSet.addAll(this.f52617b);
        Long l15 = null;
        Long lValueOf = null;
        for (Long l16 : treeSet) {
            if (l15 == null) {
                lValueOf = 1L;
                l15 = l16;
            }
            if (l15.longValue() + lValueOf.longValue() == l16.longValue()) {
                lValueOf = Long.valueOf(lValueOf.longValue() + 1);
            }
            if (l15.longValue() + lValueOf.longValue() < l16.longValue()) {
                linkedList.add(l15);
                linkedList.add(lValueOf);
                lValueOf = 1L;
                l15 = l16;
            }
        }
        linkedList.add(l15);
        linkedList.add(lValueOf);
        return linkedList;
    }

    private int[] e() {
        long[] jArr = new long[3];
        Iterator<Object> it = this.f52616a.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                int[] iArr = new int[3];
                for (int i15 = 0; i15 < 3; i15++) {
                    while (true) {
                        long j15 = jArr[i15];
                        if (j15 > 0) {
                            iArr[i15] = iArr[i15] + 1;
                            jArr[i15] = j15 >> 8;
                        }
                    }
                }
                return iArr;
            }
            Object next = it.next();
            if (next instanceof a) {
                a aVar = (a) next;
                jArr[0] = Math.max(jArr[0], 0L);
                jArr[1] = Math.max(jArr[1], aVar.f52621b);
                jArr[2] = Math.max(jArr[2], aVar.f52620a);
            } else if (next instanceof b) {
                b bVar = (b) next;
                jArr[0] = Math.max(jArr[0], 1L);
                jArr[1] = Math.max(jArr[1], bVar.f52623b);
                jArr[2] = Math.max(jArr[2], bVar.f52622a);
            } else {
                if (!(next instanceof c)) {
                    throw new RuntimeException("unexpected reference type");
                }
                c cVar = (c) next;
                jArr[0] = Math.max(jArr[0], 2L);
                jArr[1] = Math.max(jArr[1], cVar.f52625b);
                jArr[2] = Math.max(jArr[2], cVar.f52624a);
            }
        }
    }

    private void g(OutputStream outputStream, long j15, int i15) throws IOException {
        byte[] bArr = new byte[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            bArr[i16] = (byte) (255 & j15);
            j15 >>= 8;
        }
        for (int i17 = 0; i17 < i15; i17++) {
            outputStream.write(bArr[(i15 - i17) - 1]);
        }
    }

    private void h(OutputStream outputStream, int[] iArr) throws IOException {
        g(outputStream, 0L, iArr[0]);
        g(outputStream, 0L, iArr[1]);
        g(outputStream, 65535L, iArr[2]);
        for (Object obj : this.f52616a.values()) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                g(outputStream, 0L, iArr[0]);
                g(outputStream, aVar.f52621b, iArr[1]);
                g(outputStream, aVar.f52620a, iArr[2]);
            } else if (obj instanceof b) {
                b bVar = (b) obj;
                g(outputStream, 1L, iArr[0]);
                g(outputStream, bVar.f52623b, iArr[1]);
                g(outputStream, bVar.f52622a, iArr[2]);
            } else {
                if (!(obj instanceof c)) {
                    throw new RuntimeException("unexpected reference type");
                }
                c cVar = (c) obj;
                g(outputStream, 2L, iArr[0]);
                g(outputStream, cVar.f52625b, iArr[1]);
                g(outputStream, cVar.f52624a, iArr[2]);
            }
        }
    }

    public void a(fp.c cVar) {
        this.f52617b.add(Long.valueOf(cVar.e().g()));
        if (!cVar.k()) {
            b bVar = new b();
            bVar.f52622a = cVar.e().e();
            bVar.f52623b = cVar.j();
            this.f52616a.put(Long.valueOf(cVar.e().g()), bVar);
            return;
        }
        a aVar = new a();
        aVar.f52620a = cVar.e().e();
        long jG = cVar.e().g();
        aVar.f52621b = jG;
        this.f52616a.put(Long.valueOf(jG), aVar);
    }

    public void b(bp.d dVar) {
        for (Map.Entry<bp.i, bp.b> entry : dVar.entrySet()) {
            bp.i key = entry.getKey();
            if (bp.i.A4.equals(key) || bp.i.D7.equals(key) || bp.i.f20766i3.equals(key) || bp.i.f20826o4.equals(key) || bp.i.X6.equals(key)) {
                this.f52618c.Y4(key, entry.getValue());
            }
        }
    }

    public o d() throws IOException {
        this.f52618c.Y4(bp.i.f20732e9, bp.i.O9);
        long j15 = this.f52619d;
        if (j15 == -1) {
            throw new IllegalArgumentException("size is not set in xrefstream");
        }
        this.f52618c.c5(bp.i.X7, j15);
        List<Long> listC = c();
        bp.a aVar = new bp.a();
        Iterator<Long> it = listC.iterator();
        while (it.hasNext()) {
            aVar.A3(bp.h.g4(it.next().longValue()));
        }
        this.f52618c.Y4(bp.i.f20934y4, aVar);
        int[] iArrE = e();
        bp.a aVar2 = new bp.a();
        for (int i15 : iArrE) {
            aVar2.A3(bp.h.g4(i15));
        }
        this.f52618c.Y4(bp.i.D9, aVar2);
        OutputStream outputStreamO5 = this.f52618c.o5(bp.i.E3);
        h(outputStreamO5, iArrE);
        outputStreamO5.flush();
        outputStreamO5.close();
        for (bp.i iVar : this.f52618c.O4()) {
            if (!bp.i.D7.equals(iVar) && !bp.i.A4.equals(iVar) && !bp.i.X6.equals(iVar) && !bp.i.f20766i3.equals(iVar)) {
                this.f52618c.p4(iVar).A2(true);
            }
        }
        return this.f52618c;
    }

    public void f(long j15) {
        this.f52619d = j15;
    }
}
