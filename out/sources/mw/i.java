package mw;

import fr.t;
import fu.o;
import java.util.List;
import lw.k;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\u00142\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lmw/i;", "Lkw/d;", "Liw/f$a;", "<init>", "()V", "Liw/d$a;", "Liw/d;", "pos", "Ljw/b;", CryptoServicesPermission.CONSTRAINTS, "", "c", "(Liw/d$a;Ljw/b;)Ljava/lang/CharSequence;", "Liw/h;", "productionHolder", "stateInfo", "", "Lkw/b;", "b", "(Liw/d$a;Liw/h;Liw/f$a;)Ljava/util/List;", "", "a", "(Liw/d$a;Ljw/b;)Z", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class i implements kw.d<iw.f.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o f128706c = new o("^ {0,3}(-+|=+) *$");

    private final CharSequence c(iw.d.a pos, jw.b constraints) {
        String strE = pos.e();
        if (strE == null) {
            return null;
        }
        jw.b bVarE = constraints.e(pos.l());
        if (jw.c.e(bVarE, constraints)) {
            return jw.c.c(bVarE, strE);
        }
        return null;
    }

    @Override // kw.d
    public boolean a(iw.d.a pos, jw.b constraints) {
        return false;
    }

    @Override // kw.d
    public List<kw.b> b(iw.d.a pos, iw.h productionHolder, iw.f.a stateInfo) {
        CharSequence charSequenceC;
        if (stateInfo.d() != null) {
            return v.n();
        }
        jw.b currentConstraints = stateInfo.getCurrentConstraints();
        if (t.c(stateInfo.getNextConstraints(), currentConstraints)) {
            return (kw.d.INSTANCE.a(pos, currentConstraints) && (charSequenceC = c(pos, currentConstraints)) != null && f128706c.f(charSequenceC)) ? v.e(new k(currentConstraints, productionHolder)) : v.n();
        }
        return v.n();
    }
}
