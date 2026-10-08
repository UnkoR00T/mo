package jo;

import io.c;
import java.io.Serializable;
import java.text.ParseException;
import sn.i;
import sn.r;
import sn.s;
import sn.y;

/* JADX INFO: loaded from: classes4.dex */
public class b extends s implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f103875g;

    public b(r rVar, a aVar) {
        super(rVar, aVar.j());
        this.f103875g = aVar;
    }

    public static b s(String str) throws ParseException {
        c[] cVarArrE = i.e(str);
        if (cVarArrE.length == 3) {
            return new b(cVarArrE[0], cVarArrE[1], cVarArrE[2]);
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be three", 0);
    }

    @Override // sn.i
    protected void d(y yVar) {
        this.f103875g = null;
        super.d(yVar);
    }

    public b(c cVar, c cVar2, c cVar3) {
        super(cVar, cVar2, cVar3);
    }
}
