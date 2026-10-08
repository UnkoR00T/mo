package v24;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import f24.Document;
import f24.DocumentScope;
import f24.h;
import g24.DocumentSchema;
import h24.MultiDocumentSchema;
import i24.AdvocateCardData;
import i24.DeputyCardData;
import i24.DrivingLicenceFullData;
import i24.DynamicDocumentData;
import i24.DynamicMultiDocumentFullData;
import i24.FamilyCardFullData;
import i24.MIdCardData;
import i24.NipipCardData;
import i24.PensionerCardData;
import i24.RailwayCardFullData;
import i24.RefugeeCardData;
import i24.RefugeeChildrenCardFullData;
import i24.StudentCardData;
import i24.VehicleDocumentsFullData;
import i24.WruDocumentData;
import java.util.List;
import java.util.Map;
import oq.i0;
import org.bouncycastle.cms.CMSSignedData;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002H¦@¢\u0006\u0004\b\b\u0010\u0006J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0002H¦@¢\u0006\u0004\b\n\u0010\u0006J\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u0002H¦@¢\u0006\u0004\b\f\u0010\u0006J\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u0002H¦@¢\u0006\u0004\b\u000e\u0010\u0006J\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u0002H¦@¢\u0006\u0004\b\u000f\u0010\u0006J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u0002H¦@¢\u0006\u0004\b\u0011\u0010\u0006J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u0002H¦@¢\u0006\u0004\b\u0013\u0010\u0006J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u0002H¦@¢\u0006\u0004\b\u0015\u0010\u0006J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00160\u0002H¦@¢\u0006\u0004\b\u0017\u0010\u0006J\u001c\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u0002H¦@¢\u0006\u0004\b\u0019\u0010\u0006J\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a0\u0002H¦@¢\u0006\u0004\b\u001b\u0010\u0006J\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c0\u0002H¦@¢\u0006\u0004\b\u001d\u0010\u0006J$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020 0\u00022\u0006\u0010\u001f\u001a\u00020\u001eH¦@¢\u0006\u0004\b!\u0010\"J*\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0\u00022\u0006\u0010$\u001a\u00020#H¦@¢\u0006\u0004\b'\u0010(J$\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&0\u00022\u0006\u0010\u001f\u001a\u00020\u001eH¦@¢\u0006\u0004\b)\u0010\"J$\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020*0\u00022\u0006\u0010\u001f\u001a\u00020\u001eH¦@¢\u0006\u0004\b+\u0010\"JR\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002030\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020,2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020/0.2\b\u00102\u001a\u0004\u0018\u0001012\u0006\u0010$\u001a\u00020#H¦@¢\u0006\u0004\b4\u00105JR\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002030\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020,2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020/0.2\b\u00102\u001a\u0004\u0018\u0001012\u0006\u0010$\u001a\u00020#H¦@¢\u0006\u0004\b6\u00105JR\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002030\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020,2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020/0.2\b\u00102\u001a\u0004\u0018\u0001012\u0006\u0010$\u001a\u00020#H¦@¢\u0006\u0004\b7\u00105JZ\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002030\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020,2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020/0.2\b\u00102\u001a\u0004\u0018\u0001012\u0006\u0010$\u001a\u00020#H¦@¢\u0006\u0004\b9\u0010:JZ\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002030\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020;2\u0006\u0010-\u001a\u00020,2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020/0.2\b\u00102\u001a\u0004\u0018\u0001012\u0006\u0010$\u001a\u00020#H¦@¢\u0006\u0004\b=\u0010>Jb\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002030\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020;2\u0006\u0010-\u001a\u00020,2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020/0.2\b\u00102\u001a\u0004\u0018\u0001012\u0006\u0010$\u001a\u00020#H¦@¢\u0006\u0004\b?\u0010@J$\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020A0\u00022\u0006\u0010\u001f\u001a\u00020\u001eH¦@¢\u0006\u0004\bB\u0010\"J$\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020A0\u00022\u0006\u0010$\u001a\u00020#H¦@¢\u0006\u0004\bC\u0010(J$\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002030\u00022\u0006\u0010\u001f\u001a\u00020\u001eH¦@¢\u0006\u0004\bD\u0010\"J$\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002030\u00022\u0006\u0010$\u001a\u00020#H¦@¢\u0006\u0004\bE\u0010(J*\u0010G\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0%0\u00022\u0006\u0010-\u001a\u00020,H¦@¢\u0006\u0004\bG\u0010HJ\"\u0010I\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0%0\u0002H¦@¢\u0006\u0004\bI\u0010\u0006J$\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020F0\u00022\u0006\u0010\u001f\u001a\u00020\u001eH¦@¢\u0006\u0004\bJ\u0010\"J$\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020K0\u00022\u0006\u0010\u001f\u001a\u00020\u001eH¦@¢\u0006\u0004\bL\u0010\"J$\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020K0\u00022\u0006\u0010M\u001a\u00020\u001eH¦@¢\u0006\u0004\bN\u0010\"J0\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001e0\u00022\u0006\u0010$\u001a\u00020#2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u001eH¦@¢\u0006\u0004\bP\u0010QJ,\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002030\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010S\u001a\u00020RH¦@¢\u0006\u0004\bT\u0010UJ,\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002030\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010V\u001a\u000201H¦@¢\u0006\u0004\bW\u0010XJ,\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002030\u00022\u0006\u00108\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020YH¦@¢\u0006\u0004\bZ\u0010[¨\u0006\\À\u0006\u0003"}, d2 = {"Lv24/b;", "", "Ldx/i;", "Ldx/b;", "Li24/v;", "u", "(Ltq/e;)Ljava/lang/Object;", "Li24/o0;", "E", "Li24/s0;", "s", "Li24/l;", "m", "Li24/a0;", "o", "z", "Li24/d0;", "p", "Li24/b;", "n", "Li24/e;", "k", "Li24/q0;", "j", "Li24/t;", "C", "Li24/l0;", "K", "Li24/z0;", "J", "", "documentId", "Li24/b1;", "x", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lf24/i;", "documentType", "", "Li24/o;", "A", "(Lf24/i;Ltq/e;)Ljava/lang/Object;", "d", "Li24/q;", "I", "", "certificateId", "", "Lorg/bouncycastle/cms/CMSSignedData;", "scopes", "Lfz/b$c;", "expirationDate", "Loq/i0;", "q", "(Ljava/lang/String;ILjava/util/Map;Lfz/b$c;Lf24/i;Ltq/e;)Ljava/lang/Object;", "v", "t", "parentId", "F", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Lfz/b$c;Lf24/i;Ltq/e;)Ljava/lang/Object;", "Lg24/h;", "documentSchema", "w", "(Ljava/lang/String;Lg24/h;ILjava/util/Map;Lfz/b$c;Lf24/i;Ltq/e;)Ljava/lang/Object;", "l", "(Ljava/lang/String;Ljava/lang/String;Lg24/h;ILjava/util/Map;Lfz/b$c;Lf24/i;Ltq/e;)Ljava/lang/Object;", "", "g", "y", "b", "G", "Lf24/e;", "h", "(ILtq/e;)Ljava/lang/Object;", "a", "c", "Lf24/g;", "e", "scopeName", i.f37087n, "additionalKey", "f", "(Lf24/i;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lf24/h;", "newStatus", "r", "(Ljava/lang/String;Lf24/h;Ltq/e;)Ljava/lang/Object;", "newExpirationDate", "i", "(Ljava/lang/String;Lfz/b$c;Ltq/e;)Ljava/lang/Object;", "Lh24/a;", "B", "(Ljava/lang/String;Lh24/a;Ltq/e;)Ljava/lang/Object;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    static /* synthetic */ Object D(b bVar, f24.i iVar, String str, e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDocumentInternalOwnerScopeName");
        }
        if ((i15 & 2) != 0) {
            str = null;
        }
        return bVar.f(iVar, str, eVar);
    }

    Object A(f24.i iVar, e<? super dx.i<? extends dx.b, ? extends List<DynamicDocumentData>>> eVar);

    Object B(String str, MultiDocumentSchema multiDocumentSchema, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object C(e<? super dx.i<? extends dx.b, FamilyCardFullData>> eVar);

    Object E(e<? super dx.i<? extends dx.b, RefugeeCardData>> eVar);

    Object F(String str, String str2, int i15, Map<String, ? extends CMSSignedData> map, fz.b.LocalDate localDate, f24.i iVar, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object G(f24.i iVar, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object H(String str, e<? super dx.i<? extends dx.b, DocumentScope>> eVar);

    Object I(String str, e<? super dx.i<? extends dx.b, DynamicMultiDocumentFullData>> eVar);

    Object J(e<? super dx.i<? extends dx.b, VehicleDocumentsFullData>> eVar);

    Object K(e<? super dx.i<? extends dx.b, RailwayCardFullData>> eVar);

    Object a(e<? super dx.i<? extends dx.b, ? extends List<Document>>> eVar);

    Object b(String str, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object c(String str, e<? super dx.i<? extends dx.b, Document>> eVar);

    Object d(String str, e<? super dx.i<? extends dx.b, DynamicDocumentData>> eVar);

    Object e(String str, e<? super dx.i<? extends dx.b, DocumentScope>> eVar);

    Object f(f24.i iVar, String str, e<? super dx.i<? extends dx.b, String>> eVar);

    Object g(String str, e<? super dx.i<? extends dx.b, Boolean>> eVar);

    Object h(int i15, e<? super dx.i<? extends dx.b, ? extends List<Document>>> eVar);

    Object i(String str, fz.b.LocalDate localDate, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object j(e<? super dx.i<? extends dx.b, RefugeeChildrenCardFullData>> eVar);

    Object k(e<? super dx.i<? extends dx.b, DeputyCardData>> eVar);

    Object l(String str, String str2, DocumentSchema documentSchema, int i15, Map<String, ? extends CMSSignedData> map, fz.b.LocalDate localDate, f24.i iVar, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object m(e<? super dx.i<? extends dx.b, DrivingLicenceFullData>> eVar);

    Object n(e<? super dx.i<? extends dx.b, AdvocateCardData>> eVar);

    Object o(e<? super dx.i<? extends dx.b, NipipCardData>> eVar);

    Object p(e<? super dx.i<? extends dx.b, PensionerCardData>> eVar);

    Object q(String str, int i15, Map<String, ? extends CMSSignedData> map, fz.b.LocalDate localDate, f24.i iVar, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object r(String str, h hVar, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object s(e<? super dx.i<? extends dx.b, StudentCardData>> eVar);

    Object t(String str, int i15, Map<String, ? extends CMSSignedData> map, fz.b.LocalDate localDate, f24.i iVar, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object u(e<? super dx.i<? extends dx.b, MIdCardData>> eVar);

    Object v(String str, int i15, Map<String, ? extends CMSSignedData> map, fz.b.LocalDate localDate, f24.i iVar, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object w(String str, DocumentSchema documentSchema, int i15, Map<String, ? extends CMSSignedData> map, fz.b.LocalDate localDate, f24.i iVar, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object x(String str, e<? super dx.i<? extends dx.b, WruDocumentData>> eVar);

    Object y(f24.i iVar, e<? super dx.i<? extends dx.b, Boolean>> eVar);

    Object z(e<? super dx.i<? extends dx.b, NipipCardData>> eVar);
}
