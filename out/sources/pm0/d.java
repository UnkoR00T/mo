package pm0;

import al0.Adult;
import al0.ApplicantDataModel;
import al0.ApplicationReason;
import al0.BEFileInfo;
import al0.BEGenerateXmlResponse;
import iy.b0;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J,\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00022\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0012\u0010\u0013JT\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c0\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0010H¦@¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lpm0/d;", "", "Ldx/i;", "Ldx/b;", "Lal0/e;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lal0/a;", "accessToken", "Lal0/d;", "data", "Lal0/m;", "d", "(Liy/b0;Lal0/d;Ltq/e;)Ljava/lang/Object;", "Lal0/g;", "ownerWithAge", "", "Lal0/h;", "c", "(Lal0/g;Ltq/e;)Ljava/lang/Object;", "Lal0/b0;", "idCardApplicationData", "Lry/a;", "signedBase64Xml", "", "officeEdorAddress", "Lal0/l;", "filesInfo", "Loq/i0;", "b", "(Liy/b0;Lal0/b0;Liy/b0;Lal0/g;Ljava/lang/String;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {
    Object a(tq.e<? super dx.i<? extends dx.b, ApplicantDataModel>> eVar);

    Object b(b0 b0Var, al0.b0 b0Var2, b0 b0Var3, al0.g gVar, String str, List<BEFileInfo> list, tq.e<? super dx.i<? extends dx.b, i0>> eVar);

    Object c(al0.g gVar, tq.e<? super dx.i<? extends dx.b, ? extends List<ApplicationReason>>> eVar);

    Object d(b0 b0Var, Adult adult, tq.e<? super dx.i<? extends dx.b, BEGenerateXmlResponse>> eVar);
}
