package mw;

import fr.t;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;
import pq.n;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u000b\u001a\u00060\tR\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00020\u00062\n\u0010\u000b\u001a\u00060\tR\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lmw/h;", "Lkw/d;", "Liw/f$a;", "<init>", "()V", "Ljw/b;", "", "c", "(Ljw/b;)Ljava/lang/Boolean;", "Liw/d$a;", "Liw/d;", "pos", "Liw/h;", "productionHolder", "stateInfo", "", "Lkw/b;", "b", "(Liw/d$a;Liw/h;Liw/f$a;)Ljava/util/List;", CryptoServicesPermission.CONSTRAINTS, "a", "(Liw/d$a;Ljw/b;)Z", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class h implements kw.d<iw.f.a> {
    private final Boolean c(jw.b bVar) {
        return n.P0(bVar.getIsExplicit());
    }

    @Override // kw.d
    public boolean a(iw.d.a pos, jw.b constraints) {
        return false;
    }

    @Override // kw.d
    public List<kw.b> b(iw.d.a pos, iw.h productionHolder, iw.f.a stateInfo) {
        Character chQ0;
        jw.b currentConstraints = stateInfo.getCurrentConstraints();
        jw.b nextConstraints = stateInfo.getNextConstraints();
        if (!kw.d.INSTANCE.a(pos, currentConstraints)) {
            return v.n();
        }
        if (t.c(nextConstraints, currentConstraints) || (((chQ0 = n.Q0(nextConstraints.getTypes())) != null && chQ0.charValue() == '>') || !t.c(c(nextConstraints), Boolean.TRUE))) {
            return v.n();
        }
        ArrayList arrayList = new ArrayList();
        if (!(stateInfo.b() instanceof lw.i)) {
            arrayList.add(new lw.i(nextConstraints, productionHolder.e(), n.Q0(nextConstraints.getTypes()).charValue()));
        }
        arrayList.add(new lw.h(nextConstraints, productionHolder.e()));
        return arrayList;
    }
}
