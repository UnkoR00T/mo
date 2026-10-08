package bo3;

import do3.DrivingLicencesData;
import do3.FamilyCardMemberData;
import do3.NipipCardData;
import do3.RailwayCardMemberData;
import do3.RefugeeFamilyData;
import dx.b;
import dx.i;
import eo3.DocumentSchemaAttribute;
import eo3.DocumentSchemaLabel;
import eo3.DynamicDocumentData;
import eo3.MultiDynamicDocumentData;
import iy.b0;
import java.util.List;
import java.util.Map;
import k34.a0;
import k34.u;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import ry.CertKeyPair;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\n\u0010\bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u0004H¦@¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u0015\u0010\u0014J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u0004H¦@¢\u0006\u0004\b\u0017\u0010\rJ0\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u00042\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0016H¦@¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u00042\u0006\u0010\u001d\u001a\u00020\u0016H¦@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020 0\u0004H¦@¢\u0006\u0004\b!\u0010\rJ\u001c\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\"0\u0004H¦@¢\u0006\u0004\b#\u0010\rJ$\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020%0\u00042\u0006\u0010\u0012\u001a\u00020$H¦@¢\u0006\u0004\b&\u0010'J*\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0\u00042\u0006\u0010\u0012\u001a\u00020(H¦@¢\u0006\u0004\b+\u0010,J$\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020*0\u00042\u0006\u0010\u0012\u001a\u00020(H¦@¢\u0006\u0004\b-\u0010,J,\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020*0\u00042\u0006\u0010\u0012\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\u0016H¦@¢\u0006\u0004\b.\u0010/J,\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0016H¦@¢\u0006\u0004\b0\u0010\u001cJ,\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0016H¦@¢\u0006\u0004\b1\u0010\u001cJ\u001f\u00104\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u00020\u0016H&¢\u0006\u0004\b4\u00105J+\u00109\u001a\b\u0012\u0004\u0012\u0002060)2\f\u00107\u001a\b\u0012\u0004\u0012\u0002060)2\u0006\u00108\u001a\u00020\u0006H&¢\u0006\u0004\b9\u0010:J!\u0010=\u001a\u0004\u0018\u00010\u00162\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010)H&¢\u0006\u0004\b=\u0010>J!\u0010@\u001a\u0004\u0018\u00010\u00162\u0006\u0010?\u001a\u0002062\u0006\u00103\u001a\u00020\u0016H&¢\u0006\u0004\b@\u0010AJ(\u0010D\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020C0B0\u0004H¦@¢\u0006\u0004\bD\u0010\rJ(\u0010F\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020E0B0\u0004H¦@¢\u0006\u0004\bF\u0010\rJ$\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020I0\u00042\u0006\u0010H\u001a\u00020GH¦@¢\u0006\u0004\bJ\u0010K¨\u0006LÀ\u0006\u0003"}, d2 = {"Lbo3/a;", "", "Lk34/u;", "identityType", "Ldx/i;", "Ldx/b;", "Liy/b0;", "g", "(Lk34/u;Ltq/e;)Ljava/lang/Object;", "Lry/c;", "b", "Lrq0/b;", "e", "(Ltq/e;)Ljava/lang/Object;", "", "withValidCert", "a", "(ZLtq/e;)Ljava/lang/Object;", "documentType", "y", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "k", "", "f", "Lk34/a0;", "scope", "documentPredicate", "p", "(Lk34/a0;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "documentId", "n", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ldo3/f;", "j", "Ldo3/a;", "w", "Lrq0/b$c;", "Leo3/r;", "s", "(Lrq0/b$c;Ltq/e;)Ljava/lang/Object;", "Lrq0/b$b;", "", "Leo3/j;", "t", "(Lrq0/b$b;Ltq/e;)Ljava/lang/Object;", "i", "h", "(Lrq0/b$b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "B", "o", "fieldReference", "jsonValue", "x", "(Ljava/lang/String;Ljava/lang/String;)Z", "Leo3/c;", "documentSchemaAttributes", "data", "u", "(Ljava/util/List;Liy/b0;)Ljava/util/List;", "Leo3/h;", AnnotatedPrivateKey.LABEL, "z", "(Ljava/util/List;)Ljava/lang/String;", "attribute", "q", "(Leo3/c;Ljava/lang/String;)Ljava/lang/String;", "", "Ldo3/b;", "r", "Ldo3/d;", "l", "Ldo3/c$a;", "pwzType", "Ldo3/c;", "m", "(Ldo3/c$a;Ltq/e;)Ljava/lang/Object;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    static /* synthetic */ Object A(a aVar, boolean z15, e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMainIdentityType");
        }
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        return aVar.a(z15, eVar);
    }

    static /* synthetic */ Object v(a aVar, a0 a0Var, String str, e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEncodedDataForScope");
        }
        if ((i15 & 2) != 0) {
            str = null;
        }
        return aVar.p(a0Var, str, eVar);
    }

    Object B(a0 a0Var, String str, e<? super i<? extends b, String>> eVar);

    Object a(boolean z15, e<? super i<? extends b, ? extends u>> eVar);

    Object b(u uVar, e<? super i<? extends b, CertKeyPair>> eVar);

    Object e(e<? super i<? extends b, ? extends rq0.b>> eVar);

    Object f(e<? super i<? extends b, String>> eVar);

    Object g(u uVar, e<? super i<? extends b, b0>> eVar);

    Object h(rq0.b.EnumC4479b enumC4479b, String str, e<? super i<? extends b, DynamicDocumentData>> eVar);

    Object i(rq0.b.EnumC4479b enumC4479b, e<? super i<? extends b, DynamicDocumentData>> eVar);

    Object j(e<? super i<? extends b, RefugeeFamilyData>> eVar);

    Object k(rq0.b bVar, e<? super i<? extends b, ? extends u>> eVar);

    Object l(e<? super i<? extends b, ? extends Map<String, RailwayCardMemberData>>> eVar);

    Object m(NipipCardData.a aVar, e<? super i<? extends b, NipipCardData>> eVar);

    Object n(String str, e<? super i<? extends b, String>> eVar);

    Object o(a0 a0Var, String str, e<? super i<? extends b, String>> eVar);

    Object p(a0 a0Var, String str, e<? super i<? extends b, String>> eVar);

    String q(DocumentSchemaAttribute attribute, String jsonValue);

    Object r(e<? super i<? extends b, ? extends Map<String, FamilyCardMemberData>>> eVar);

    Object s(rq0.b.c cVar, e<? super i<? extends b, MultiDynamicDocumentData>> eVar);

    Object t(rq0.b.EnumC4479b enumC4479b, e<? super i<? extends b, ? extends List<DynamicDocumentData>>> eVar);

    List<DocumentSchemaAttribute> u(List<DocumentSchemaAttribute> documentSchemaAttributes, b0 data);

    Object w(e<? super i<? extends b, DrivingLicencesData>> eVar);

    boolean x(String fieldReference, String jsonValue);

    Object y(rq0.b bVar, e<? super rq0.b> eVar);

    String z(List<DocumentSchemaLabel> label);
}
