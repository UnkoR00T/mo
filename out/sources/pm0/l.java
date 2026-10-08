package pm0;

import al0.BEGenerateXmlResponse;
import al0.IdCardSuspensionChildData;
import gl0.GenerateChildXmlData;
import gl0.SubmitChildXmlData;
import iy.b0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00140\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lpm0/l;", "", "Liy/b0;", "firstName", "lastName", "Lxw/g;", "pesel", "Ldx/i;", "Ldx/b;", "Lal0/d0;", "b", "(Liy/b0;Liy/b0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lal0/a;", "accessToken", "Lgl0/b;", "data", "Lal0/m;", "a", "(Liy/b0;Lgl0/b;Ltq/e;)Ljava/lang/Object;", "Lgl0/d;", "Loq/i0;", "c", "(Liy/b0;Lgl0/d;Ltq/e;)Ljava/lang/Object;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface l {
    Object a(b0 b0Var, GenerateChildXmlData generateChildXmlData, tq.e<? super dx.i<? extends dx.b, BEGenerateXmlResponse>> eVar);

    Object b(b0 b0Var, b0 b0Var2, b0 b0Var3, tq.e<? super dx.i<? extends dx.b, IdCardSuspensionChildData>> eVar);

    Object c(b0 b0Var, SubmitChildXmlData submitChildXmlData, tq.e<? super dx.i<? extends dx.b, i0>> eVar);
}
