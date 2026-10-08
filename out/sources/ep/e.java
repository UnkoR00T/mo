package ep;

import bp.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public class e extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<bp.l> f52611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f52612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f52613g;

    public e(o oVar, bp.e eVar) throws IOException {
        super(new d(oVar.l5()));
        this.f52611e = null;
        this.f52582c = eVar;
        int iX4 = oVar.x4(bp.i.L5);
        this.f52612f = iX4;
        if (iX4 == -1) {
            throw new IOException("/N entry missing in object stream");
        }
        if (iX4 < 0) {
            throw new IOException("Illegal /N entry in object stream: " + iX4);
        }
        int iX5 = oVar.x4(bp.i.f20944z3);
        this.f52613g = iX5;
        if (iX5 == -1) {
            throw new IOException("/First entry missing in object stream");
        }
        if (iX5 >= 0) {
            return;
        }
        throw new IOException("Illegal /First entry in object stream: " + iX5);
    }

    private bp.b N(int i15) {
        long position = this.f52581b.getPosition();
        int i16 = this.f52613g + i15;
        if (i16 > 0 && position < i16) {
            this.f52581b.j0(i16 - ((int) position));
        }
        return x();
    }

    private Map<Integer, Long> O() throws IOException {
        TreeMap treeMap = new TreeMap();
        long position = (this.f52581b.getPosition() + ((long) this.f52613g)) - 1;
        for (int i15 = 0; i15 < this.f52612f && this.f52581b.getPosition() < position; i15++) {
            treeMap.put(Integer.valueOf((int) E()), Long.valueOf(F()));
        }
        return treeMap;
    }

    public List<bp.l> L() {
        return this.f52611e;
    }

    public void M() {
        try {
            Map<Integer, Long> mapO = O();
            this.f52611e = new ArrayList(mapO.size());
            for (Map.Entry<Integer, Long> entry : mapO.entrySet()) {
                bp.l lVar = new bp.l(N(entry.getKey().intValue()));
                lVar.h4(0);
                lVar.j4(entry.getValue().longValue());
                this.f52611e.add(lVar);
                if (yo.a.b()) {
                    lVar.toString();
                }
            }
            this.f52581b.close();
        } catch (Throwable th4) {
            this.f52581b.close();
            throw th4;
        }
    }
}
