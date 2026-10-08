package qm0;

import al0.BEFileInfo;
import al0.BEGenerateXmlResponse;
import dx.b;
import dx.i;
import hl0.IdCardInvalidationInitData;
import iy.b0;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J,\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H¦@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lqm0/a;", "", "Ldx/i;", "Ldx/b;", "Lhl0/b;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lal0/a;", "accessToken", "Lhl0/a$c;", "data", "Loq/i0;", "b", "(Liy/b0;Lhl0/a$c;Ltq/e;)Ljava/lang/Object;", "Lhl0/a$d;", "Lal0/m;", "c", "(Liy/b0;Lhl0/a$d;Ltq/e;)Ljava/lang/Object;", "Lry/a;", "signedBase64Xml", "", "Lal0/l;", "files", "d", "(Liy/b0;Lhl0/a$d;Liy/b0;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(e<? super i<? extends b, IdCardInvalidationInitData>> eVar);

    Object b(b0 b0Var, hl0.a.c cVar, e<? super i<? extends b, i0>> eVar);

    Object c(b0 b0Var, hl0.a.Theft theft, e<? super i<? extends b, BEGenerateXmlResponse>> eVar);

    Object d(b0 b0Var, hl0.a.Theft theft, b0 b0Var2, List<BEFileInfo> list, e<? super i<? extends b, i0>> eVar);
}
