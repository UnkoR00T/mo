package an;

import fh.ak;
import fh.he;
import fh.ie;
import fh.je;
import fh.ke;
import fh.lj;
import fh.mh;
import fh.uh;
import fh.wj;
import fh.xj;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    static uh a(int i15) {
        switch (i15) {
            case 1:
                return uh.LATIN;
            case 2:
                return uh.LATIN_AND_CHINESE;
            case 3:
                return uh.LATIN_AND_DEVANAGARI;
            case 4:
                return uh.LATIN_AND_JAPANESE;
            case 5:
                return uh.LATIN_AND_KOREAN;
            case 6:
                return uh.CREDIT_CARD;
            case 7:
                return uh.DOCUMENT;
            case 8:
                return uh.PIXEL_AI;
            default:
                return uh.TYPE_UNKNOWN;
        }
    }

    static void b(xj xjVar, final boolean z15, final ie ieVar) {
        xjVar.f(new wj() { // from class: an.p
            @Override // fh.wj
            public final lj zza() {
                ke keVar = new ke();
                he heVar = z15 ? he.TYPE_THICK : he.TYPE_THIN;
                ie ieVar2 = ieVar;
                keVar.e(heVar);
                mh mhVar = new mh();
                mhVar.b(ieVar2);
                keVar.g(mhVar.c());
                return ak.e(keVar);
            }
        }, je.ON_DEVICE_TEXT_LOAD);
    }
}
