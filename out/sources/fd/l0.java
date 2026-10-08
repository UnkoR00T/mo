package fd;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f61289a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<b> f61290b = new r0.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, td.i> f61291c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Comparator<i6.d<String, Float>> f61292d = new a();

    class a implements Comparator<i6.d<String, Float>> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i6.d<String, Float> dVar, i6.d<String, Float> dVar2) {
            float fFloatValue = dVar.f89683b.floatValue();
            float fFloatValue2 = dVar2.f89683b.floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    public interface b {
        void a(float f15);
    }

    public void a(String str, float f15) {
        if (this.f61289a) {
            td.i iVar = this.f61291c.get(str);
            if (iVar == null) {
                iVar = new td.i();
                this.f61291c.put(str, iVar);
            }
            iVar.a(f15);
            if (str.equals("__container")) {
                Iterator<b> it = this.f61290b.iterator();
                while (it.hasNext()) {
                    it.next().a(f15);
                }
            }
        }
    }

    void b(boolean z15) {
        this.f61289a = z15;
    }
}
