package ju;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0005¢\u0006\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lju/n2;", "Lju/l0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "parallelism", "name", "S1", "(ILjava/lang/String;)Lju/l0;", "i2", "d2", "()Lju/n2;", "immediate", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class n2 extends l0 {
    @Override // ju.l0
    public l0 S1(int parallelism, String name) {
        ou.m.a(parallelism);
        return ou.m.b(this, name);
    }

    public abstract n2 d2();

    protected final String i2() {
        n2 n2VarD2;
        n2 n2VarC = g1.c();
        if (this == n2VarC) {
            return "Dispatchers.Main";
        }
        try {
            n2VarD2 = n2VarC.d2();
        } catch (UnsupportedOperationException unused) {
            n2VarD2 = null;
        }
        if (this == n2VarD2) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // ju.l0
    public String toString() {
        String strI2 = i2();
        if (strI2 != null) {
            return strI2;
        }
        return t0.a(this) + '@' + t0.b(this);
    }
}
