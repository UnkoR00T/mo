package j2;

import n3.m2;
import n3.u0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"Lj2/b;", "", "<init>", "()V", "Ln3/m2;", "a", "()Ln3/m2;", "Ln3/m2;", "borderPath", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private m2 borderPath;

    public final m2 a() {
        m2 m2Var = this.borderPath;
        if (m2Var != null) {
            return m2Var;
        }
        m2 m2VarA = u0.a();
        this.borderPath = m2VarA;
        return m2VarA;
    }
}
