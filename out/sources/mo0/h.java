package mo0;

import eo0.CentralTokens;
import eo0.OwTokens;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J6\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H¦@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lmo0/h;", "", "", "url", "code", "codeVerifier", "Ldx/i;", "Ldx/b;", "Leo0/i0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Leo0/x;", "edorAddress", "Leo0/i0$c;", "token", "c", "(Ljava/lang/String;Liy/b0;Leo0/i0$c;Ltq/e;)Ljava/lang/Object;", "Leo0/i0$a;", "subjectToken", "Leo0/k;", "b", "(Ljava/lang/String;Leo0/i0$a;Ltq/e;)Ljava/lang/Object;", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h {
    Object a(String str, String str2, String str3, tq.e<? super dx.i<? extends dx.b, OwTokens>> eVar);

    Object b(String str, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, CentralTokens>> eVar);

    Object c(String str, b0 b0Var, OwTokens.Refresh refresh, tq.e<? super dx.i<? extends dx.b, OwTokens>> eVar);
}
