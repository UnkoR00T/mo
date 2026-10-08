package h34;

import dx.b;
import dx.i;
import jr0.DrivingLicenceScope;
import jr0.NipipScope;
import jr0.PersonalDataScope8;
import k34.AdvocateDataModel;
import k34.DeputyCardModel;
import k34.FamilyDataModel;
import k34.JuniorSchoolCardData;
import k34.PensionerCardDocumentData;
import k34.RailwayCardDocumentData;
import k34.StudentCardDocumentData;
import l34.DynamicDocumentVerification;
import o34.c;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\n\u0010\bJ$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\f\u0010\bJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000e\u0010\bJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0010\u0010\bJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0012\u0010\bJ$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0014\u0010\bJ$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00150\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0016\u0010\bJ$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00170\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0018\u0010\bJ$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00190\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001a\u0010\bJ,\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u00042\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001f0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b \u0010\b¨\u0006!À\u0006\u0003"}, d2 = {"Lh34/a;", "", "", "data", "Ldx/i;", "Ldx/b;", "Ljr0/j;", "d", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ljr0/m;", "c", "Lk34/v;", "a", "Lk34/b;", "f", "Lk34/e;", "j", "Lk34/x;", "l", "Lk34/z;", "e", "Lk34/r;", "g", "Ljr0/d;", "b", "Lk34/c0;", "i", "schema", "Ll34/b;", "h", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lo34/c;", "k", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(String str, e<? super i<? extends b, JuniorSchoolCardData>> eVar);

    Object b(String str, e<? super i<? extends b, DrivingLicenceScope>> eVar);

    Object c(String str, e<? super i<? extends b, PersonalDataScope8>> eVar);

    Object d(String str, e<? super i<? extends b, NipipScope>> eVar);

    Object e(String str, e<? super i<? extends b, RailwayCardDocumentData>> eVar);

    Object f(String str, e<? super i<? extends b, AdvocateDataModel>> eVar);

    Object g(String str, e<? super i<? extends b, FamilyDataModel>> eVar);

    Object h(String str, String str2, e<? super i<? extends b, DynamicDocumentVerification>> eVar);

    Object i(String str, e<? super i<? extends b, StudentCardDocumentData>> eVar);

    Object j(String str, e<? super i<? extends b, DeputyCardModel>> eVar);

    Object k(String str, e<? super i<? extends b, c>> eVar);

    Object l(String str, e<? super i<? extends b, PensionerCardDocumentData>> eVar);
}
