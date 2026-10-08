package ct;

import java.util.ArrayList;
import vr.m1;
import vr.o0;

/* JADX INFO: loaded from: classes4.dex */
public interface b {

    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f37595a = new a();

        private a() {
        }

        @Override // ct.b
        public String a(vr.h hVar, n nVar) {
            return hVar instanceof m1 ? nVar.R(((m1) hVar).getName(), false) : nVar.Q(dt.i.m(hVar));
        }
    }

    /* JADX INFO: renamed from: ct.b$b, reason: collision with other inner class name */
    public static final class C0792b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0792b f37596a = new C0792b();

        private C0792b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [vr.h] */
        /* JADX WARN: Type inference failed for: r2v1, types: [vr.k0, vr.m] */
        /* JADX WARN: Type inference failed for: r2v2, types: [vr.m] */
        @Override // ct.b
        public String a(vr.h hVar, n nVar) {
            if (hVar instanceof m1) {
                return nVar.R(((m1) hVar).getName(), false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(hVar.getName());
                hVar = hVar.b();
            } while (hVar instanceof vr.e);
            return j0.g(pq.v.T(arrayList));
        }
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f37597a = new c();

        private c() {
        }

        private final String b(vr.h hVar) {
            String strC;
            String strC2 = j0.c(hVar.getName());
            if ((hVar instanceof m1) || (strC = c(hVar.b())) == null || fr.t.c(strC, "")) {
                return strC2;
            }
            return strC + '.' + strC2;
        }

        private final String c(vr.m mVar) {
            if (mVar instanceof vr.e) {
                return b((vr.h) mVar);
            }
            if (mVar instanceof o0) {
                return j0.b(((o0) mVar).g().i());
            }
            return null;
        }

        @Override // ct.b
        public String a(vr.h hVar, n nVar) {
            return b(hVar);
        }
    }

    String a(vr.h hVar, n nVar);
}
