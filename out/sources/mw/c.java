package mw;

import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J1\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\u00112\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmw/c;", "Lkw/d;", "Liw/f$a;", "<init>", "()V", "Liw/d$a;", "Liw/d;", "pos", "Liw/h;", "productionHolder", "stateInfo", "", "Lkw/b;", "b", "(Liw/d$a;Liw/h;Liw/f$a;)Ljava/util/List;", "Ljw/b;", CryptoServicesPermission.CONSTRAINTS, "", "a", "(Liw/d$a;Ljw/b;)Z", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class c implements kw.d<iw.f.a> {
    @Override // kw.d
    public boolean a(iw.d.a pos, jw.b constraints) {
        return false;
    }

    @Override // kw.d
    public List<kw.b> b(iw.d.a pos, iw.h productionHolder, iw.f.a stateInfo) {
        Integer numA;
        iw.d.a aVarM;
        if (jw.c.f(stateInfo.getNextConstraints(), pos.getCurrentLine()) <= pos.getLocalPos() && (numA = pos.a()) != null && (aVarM = pos.m(numA.intValue())) != null && kw.a.f112851a.d(aVarM, stateInfo.getCurrentConstraints())) {
            return v.e(new lw.c(stateInfo.getCurrentConstraints(), productionHolder, pos));
        }
        return v.n();
    }
}
