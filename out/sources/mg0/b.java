package mg0;

import ag0.DynamicParentDocument;
import cg0.SchoolCardDocument;
import dg0.UutCardParentDocument;
import dx.i;
import java.util.List;
import java.util.Map;
import mu.g;
import oq.i0;
import org.bouncycastle.cms.CMSSignedData;
import p071kotlin.Metadata;
import tq.e;
import vf0.Document;
import vf0.DocumentScope;
import vf0.c;
import xf0.d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JD\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H¦@¢\u0006\u0004\b\f\u0010\rJL\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H¦@¢\u0006\u0004\b\u000f\u0010\u0010JL\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H¦@¢\u0006\u0004\b\u0011\u0010\u0010JL\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H¦@¢\u0006\u0004\b\u0012\u0010\u0010JT\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0013\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00160\t2\u0006\u0010\u000e\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00190\t2\u0006\u0010\u000e\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u001a\u0010\u0018J$\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001b0\t2\u0006\u0010\u000e\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u001c\u0010\u0018J$\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\t2\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u001e\u0010\u0018J\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\tH¦@¢\u0006\u0004\b\u001f\u0010 J$\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020!0\t2\u0006\u0010\u000e\u001a\u00020\u0004H¦@¢\u0006\u0004\b\"\u0010\u0018J$\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020#0\t2\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b$\u0010\u0018J$\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b%\u0010\u0018J$\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010&\u001a\u00020\u0004H¦@¢\u0006\u0004\b'\u0010\u0018J,\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H¦@¢\u0006\u0004\b*\u0010+J\u001b\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0,H&¢\u0006\u0004\b/\u00100J\"\u00101\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\tH¦@¢\u0006\u0004\b1\u0010 J\u001c\u00102\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH¦@¢\u0006\u0004\b2\u0010 J,\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002040\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0004H¦@¢\u0006\u0004\b5\u00106J,\u00108\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0004H¦@¢\u0006\u0004\b8\u00106J&\u00109\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t2\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b9\u0010\u0018¨\u0006:À\u0006\u0003"}, d2 = {"Lmg0/b;", "", "", "certificateId", "", "documentId", "", "Lorg/bouncycastle/cms/CMSSignedData;", "scopeData", "Ldx/i;", "Ldx/b;", "Loq/i0;", "u", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ltq/e;)Ljava/lang/Object;", "parentId", "k", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ltq/e;)Ljava/lang/Object;", "r", "l", "schemaData", "s", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lag0/b;", "d", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ldg0/b;", "o", "Lbg0/b;", "f", "Lcg0/d;", "q", "i", "(Ltq/e;)Ljava/lang/Object;", "Lxf0/d;", "t", "", "g", "b", "parentOrChildId", "n", "Lvf0/c;", "newStatus", "p", "(Ljava/lang/String;Lvf0/c;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "", "Lvf0/a;", "h", "()Lmu/g;", "a", "e", "name", "Lvf0/b;", "j", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "schema", "c", "m", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    Object a(e<? super i<? extends dx.b, ? extends List<Document>>> eVar);

    Object b(String str, e<? super i<? extends dx.b, i0>> eVar);

    Object c(String str, String str2, e<? super i<? extends dx.b, i0>> eVar);

    Object d(String str, e<? super i<? extends dx.b, DynamicParentDocument>> eVar);

    Object e(e<? super i<? extends dx.b, i0>> eVar);

    Object f(String str, e<? super i<? extends dx.b, bg0.b>> eVar);

    Object g(String str, e<? super i<? extends dx.b, Boolean>> eVar);

    g<List<Document>> h();

    Object i(e<? super i<? extends dx.b, SchoolCardDocument>> eVar);

    Object j(String str, String str2, e<? super i<? extends dx.b, DocumentScope>> eVar);

    Object k(Integer num, String str, String str2, Map<String, ? extends CMSSignedData> map, e<? super i<? extends dx.b, i0>> eVar);

    Object l(Integer num, String str, String str2, Map<String, ? extends CMSSignedData> map, e<? super i<? extends dx.b, i0>> eVar);

    Object m(String str, e<? super i<? extends dx.b, String>> eVar);

    Object n(String str, e<? super i<? extends dx.b, i0>> eVar);

    Object o(String str, e<? super i<? extends dx.b, UutCardParentDocument>> eVar);

    Object p(String str, c cVar, e<? super i<? extends dx.b, i0>> eVar);

    Object q(String str, e<? super i<? extends dx.b, SchoolCardDocument>> eVar);

    Object r(Integer num, String str, String str2, Map<String, ? extends CMSSignedData> map, e<? super i<? extends dx.b, i0>> eVar);

    Object s(Integer num, String str, String str2, Map<String, ? extends CMSSignedData> map, String str3, e<? super i<? extends dx.b, i0>> eVar);

    Object t(String str, e<? super i<? extends dx.b, d>> eVar);

    Object u(Integer num, String str, Map<String, ? extends CMSSignedData> map, e<? super i<? extends dx.b, i0>> eVar);
}
