package r7;

import androidx.p016lifecycle.t0;
import androidx.p016lifecycle.w0;
import p071kotlin.Metadata;
import p7.CreationExtras;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/lifecycle/t0;", "VM", "Landroidx/lifecycle/w0$c;", "factory", "Lmr/c;", "modelClass", "Lp7/a;", "extras", "a", "(Landroidx/lifecycle/w0$c;Lmr/c;Lp7/a;)Landroidx/lifecycle/t0;", "lifecycle-viewmodel"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class i {
    public static final <VM extends t0> VM a(w0.c cVar, mr.c<VM> cVar2, CreationExtras creationExtras) {
        try {
            try {
                return (VM) cVar.c(cVar2, creationExtras);
            } catch (AbstractMethodError unused) {
                return (VM) cVar.b(dr.a.b(cVar2));
            }
        } catch (AbstractMethodError unused2) {
            return (VM) cVar.a(dr.a.b(cVar2), creationExtras);
        }
    }
}
