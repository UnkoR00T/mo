package l9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class i {
    private static int a(k kVar, long j15) {
        if (j15 == -9223372036854775807L) {
            return 0;
        }
        int iB = kVar.b(j15);
        if (iB == -1) {
            iB = kVar.j();
        }
        return (iB <= 0 || kVar.g(iB + (-1)) != j15) ? iB : iB - 1;
    }

    private static void b(k kVar, int i15, w7.l<e> lVar) {
        long jG = kVar.g(i15);
        List<v7.a> listE = kVar.e(jG);
        if (listE.isEmpty()) {
            return;
        }
        if (i15 == kVar.j() - 1) {
            throw new IllegalStateException();
        }
        long jG2 = kVar.g(i15 + 1) - kVar.g(i15);
        if (jG2 > 0) {
            lVar.accept(new e(listE, jG, jG2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    public static void c(k kVar, s.b bVar, w7.l<e> lVar) {
        boolean z15;
        int iA = a(kVar, bVar.f117247a);
        if (bVar.f117247a == -9223372036854775807L || iA >= kVar.j()) {
            z15 = false;
        } else {
            List<v7.a> listE = kVar.e(bVar.f117247a);
            long jG = kVar.g(iA);
            if (listE.isEmpty()) {
                z15 = false;
            } else {
                long j15 = bVar.f117247a;
                if (j15 < jG) {
                    lVar.accept(new e(listE, j15, jG - j15));
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
        }
        for (int i15 = iA; i15 < kVar.j(); i15++) {
            b(kVar, i15, lVar);
        }
        if (bVar.f117248b) {
            if (z15) {
                iA--;
            }
            for (int i16 = 0; i16 < iA; i16++) {
                b(kVar, i16, lVar);
            }
            if (z15) {
                lVar.accept(new e(kVar.e(bVar.f117247a), kVar.g(iA), bVar.f117247a - kVar.g(iA)));
            }
        }
    }
}
