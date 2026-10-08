package p00;

import fr.t;
import fv.b0;
import fv.d0;
import fv.w;
import java.io.IOException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lp00/a;", "Lfv/w;", "<init>", "()V", "Lfv/w$a;", "chain", "Lfv/d0;", "a", "(Lfv/w$a;)Lfv/d0;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements w {
    @Override // fv.w
    public d0 a(w.a chain) throws IOException {
        b0 b0VarC = chain.C();
        if (t.c(b0VarC.getUrl().getScheme(), "http")) {
            throw new IOException("Cleartext HTTP is not permitted for this profile.");
        }
        return chain.a(b0VarC);
    }
}
