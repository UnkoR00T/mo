package vs;

import fr.k;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import lr.i;
import pq.s0;
import pq.v;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends ws.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C5466a f208222g = new C5466a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f208223h = new a(1, 0, 7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f208224i = new a(new int[0]);

    /* JADX INFO: renamed from: vs.a$a, reason: collision with other inner class name */
    public static final class C5466a {
        public /* synthetic */ C5466a(k kVar) {
            this();
        }

        public final a a(InputStream inputStream) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            i iVar = new i(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(v.y(iVar, 10));
            Iterator<Integer> it = iVar.iterator();
            while (it.hasNext()) {
                ((s0) it).nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrE1 = v.e1(arrayList);
            return new a(Arrays.copyOf(iArrE1, iArrE1.length));
        }

        private C5466a() {
        }
    }

    public a(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
    }

    public boolean h() {
        return f(f208223h);
    }
}
