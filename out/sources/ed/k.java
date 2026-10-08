package ed;

import java.io.FileNotFoundException;
import java.io.IOException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\"\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lvv/k;", "Lvv/b0;", "file", "", "mustCreate", "Loq/i0;", "a", "(Lvv/k;Lvv/b0;Z)V", "directory", "c", "(Lvv/k;Lvv/b0;)V", "", "d", "(Lvv/b0;)Ljava/lang/String;", "extension", "coil-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k {
    public static final void a(vv.k kVar, vv.b0 b0Var, boolean z15) {
        if (z15) {
            f0.h(kVar.N(b0Var, true));
        } else {
            if (kVar.H(b0Var)) {
                return;
            }
            f0.h(kVar.M(b0Var));
        }
    }

    public static /* synthetic */ void b(vv.k kVar, vv.b0 b0Var, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        a(kVar, b0Var, z15);
    }

    public static final void c(vv.k kVar, vv.b0 b0Var) throws IOException {
        try {
            IOException iOException = null;
            for (vv.b0 b0Var2 : kVar.I(b0Var)) {
                try {
                    if (kVar.J(b0Var2).getIsDirectory()) {
                        c(kVar, b0Var2);
                    }
                    kVar.C(b0Var2);
                } catch (IOException e15) {
                    if (iOException == null) {
                        iOException = e15;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final String d(vv.b0 b0Var) {
        return fu.r.h1(b0Var.k(), '.', "");
    }
}
