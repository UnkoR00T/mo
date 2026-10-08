package br0;

import dx.i;
import java.util.List;
import p071kotlin.Metadata;
import tq.e;
import tq0.BEFile;
import tq0.BEOrderDocumentRequest;
import tq0.BEOrderDocumentResponse;
import tq0.LandRegisterDocumentTypesFee;
import tq0.MyRegistry;
import tq0.OrderedDocumentByNumber;
import tq0.c;
import tq0.n;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0002H¦@¢\u0006\u0004\b\t\u0010\u0007J\"\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u0002H¦@¢\u0006\u0004\b\u000b\u0010\u0007J$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u00022\u0006\u0010\u0012\u001a\u00020\u0011H¦@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u00022\u0006\u0010\u0017\u001a\u00020\u0016H¦@¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u00022\u0006\u0010\u001c\u001a\u00020\u001bH¦@¢\u0006\u0004\b\u001d\u0010\u0015J$\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u00022\u0006\u0010\u001c\u001a\u00020\u001eH¦@¢\u0006\u0004\b\u001f\u0010\u0015J$\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0\u00022\u0006\u0010\u001c\u001a\u00020 H¦@¢\u0006\u0004\b\"\u0010\u0015¨\u0006#À\u0006\u0003"}, d2 = {"Lbr0/a;", "", "Ldx/i;", "Ldx/b;", "", "Ltq0/u;", "A0", "(Ltq/e;)Ljava/lang/Object;", "Ltq0/r;", "v0", "Ltq0/v;", "b", "Ltq0/h;", "request", "Ltq0/i;", "x0", "(Ltq0/h;Ltq/e;)Ljava/lang/Object;", "", "verificationCode", "Ltq0/n;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ltq0/b;", "documentId", "Ltq0/d;", "y0", "(Ltq0/b;Ltq/e;)Ljava/lang/Object;", "Ltq0/m;", "code", "B0", "Ltq0/a;", "z0", "Ltq0/j;", "Ltq0/c;", "w0", "nationalcourtregistryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object A0(e<? super i<? extends dx.b, ? extends List<MyRegistry>>> eVar);

    Object B0(String str, e<? super i<? extends dx.b, BEFile>> eVar);

    Object a(String str, e<? super i<? extends dx.b, n>> eVar);

    Object b(e<? super i<? extends dx.b, ? extends List<OrderedDocumentByNumber>>> eVar);

    Object v0(e<? super i<? extends dx.b, LandRegisterDocumentTypesFee>> eVar);

    Object w0(String str, e<? super i<? extends dx.b, ? extends c>> eVar);

    Object x0(BEOrderDocumentRequest bEOrderDocumentRequest, e<? super i<? extends dx.b, BEOrderDocumentResponse>> eVar);

    Object y0(tq0.b bVar, e<? super i<? extends dx.b, BEFile>> eVar);

    Object z0(String str, e<? super i<? extends dx.b, BEFile>> eVar);
}
