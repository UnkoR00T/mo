package y41;

import bl0.BEChildBirthRegistrationAuthority;
import bl0.BEChildBirthRegistrationBirth;
import bl0.BEChildBirthRegistrationMarital;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\r\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ly41/s0;", "", "<init>", "()V", "Lxw/e;", "gender", "Lbl0/d;", "maritalStatusType", "", "Lb51/a;", "c", "(Lxw/e;Lbl0/d;)Ljava/util/List;", "Lb51/a$e;", "section", "Lbl0/o;", "maritalData", "b", "(Lb51/a$e;Lbl0/d;Lbl0/o;)Lb51/a;", "Lb51/a$h;", "Lbl0/k;", "birthData", "a", "(Lb51/a$h;Lbl0/k;)Lb51/a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f223961a = new s0();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f223962a;

        static {
            int[] iArr = new int[bl0.d.values().length];
            try {
                iArr[bl0.d.MarriageEnded.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f223962a = iArr;
        }
    }

    private s0() {
    }

    public final b51.a<?> a(b51.a.YourBirthCertificate section, BEChildBirthRegistrationBirth birthData) {
        Map<?, b51.a.FieldData> mapW = v0.w(section.b());
        BEChildBirthRegistrationAuthority registrationAuthority = birthData.getRegistrationAuthority();
        iy.b0 place = registrationAuthority != null ? registrationAuthority.getPlace() : null;
        if (place != null && iy.c0.e(place).length() > 0) {
            b51.a.YourBirthCertificate.EnumC0406a enumC0406a = b51.a.YourBirthCertificate.EnumC0406a.Place;
            mapW.put(enumC0406a, new b51.a.FieldData(enumC0406a, new b51.a.FieldData.InterfaceC0401a.Text(place, null, 2, null), hz.b.C2039b.f86846c, false));
        }
        iy.b0 certificateNumber = birthData.getCertificateNumber();
        if (certificateNumber != null && iy.c0.e(certificateNumber).length() > 0) {
            b51.a.YourBirthCertificate.EnumC0406a enumC0406a2 = b51.a.YourBirthCertificate.EnumC0406a.Number;
            mapW.put(enumC0406a2, new b51.a.FieldData(enumC0406a2, new b51.a.FieldData.InterfaceC0401a.Text(certificateNumber, null, 2, null), hz.b.C2039b.f86846c, false));
        }
        return section.c(mapW);
    }

    public final b51.a<?> b(b51.a.MarriageCertificate section, bl0.d maritalStatusType, BEChildBirthRegistrationMarital maritalData) {
        boolean z15 = a.f223962a[maritalStatusType.ordinal()] == 1;
        Map<?, b51.a.FieldData> mapW = v0.w(section.b());
        BEChildBirthRegistrationAuthority registrationAuthority = maritalData.getRegistrationAuthority();
        iy.b0 place = registrationAuthority != null ? registrationAuthority.getPlace() : null;
        if (place != null) {
            b51.a.MarriageCertificate.EnumC0403a enumC0403a = b51.a.MarriageCertificate.EnumC0403a.Place;
            mapW.put(enumC0403a, new b51.a.FieldData(enumC0403a, new b51.a.FieldData.InterfaceC0401a.Text(place, null, 2, null), hz.b.C2039b.f86846c, z15));
        }
        iy.b0 certificateNumber = maritalData.getCertificateNumber();
        if (certificateNumber != null) {
            b51.a.MarriageCertificate.EnumC0403a enumC0403a2 = b51.a.MarriageCertificate.EnumC0403a.Number;
            mapW.put(enumC0403a2, new b51.a.FieldData(enumC0403a2, new b51.a.FieldData.InterfaceC0401a.Text(certificateNumber, null, 2, null), hz.b.C2039b.f86846c, z15));
        }
        return section.c(mapW);
    }

    public final List<b51.a<?>> c(xw.e gender, bl0.d maritalStatusType) {
        xw.e eVar = xw.e.FEMALE;
        if (gender == eVar && maritalStatusType == bl0.d.InMarriage) {
            return pq.v.q(new b51.a.SecondDataParent(null, 1, null), new b51.a.MarriageCertificate(null, 1, null));
        }
        if (gender == eVar && maritalStatusType == bl0.d.NoMarriageAndAcceptChild) {
            return pq.v.q(new b51.a.SecondDataParent(null, 1, null), new b51.a.FatherPlaceOfBirthCertificate(null, 1, null), new b51.a.YourBirthCertificate(null, 1, null));
        }
        if (gender == eVar && maritalStatusType == bl0.d.MarriageEnded) {
            return pq.v.q(new b51.a.SecondDataParent(null, 1, null), new b51.a.MarriageCertificate(null, 1, null));
        }
        if (gender == eVar && maritalStatusType == bl0.d.NoMarriageAndNoAcceptChild) {
            return pq.v.q(new b51.a.FatherName(null, 1, null), new b51.a.YourBirthCertificate(null, 1, null));
        }
        xw.e eVar2 = xw.e.MALE;
        if (gender == eVar2 && maritalStatusType == bl0.d.InMarriage) {
            return pq.v.q(new b51.a.SecondDataParent(null, 1, null), new b51.a.MarriageCertificate(null, 1, null));
        }
        if (gender == eVar2 && maritalStatusType == bl0.d.NoMarriageAndAcceptChild) {
            return pq.v.q(new b51.a.SecondDataParent(null, 1, null), new b51.a.MotherPlaceOfBirthCertificate(null, 1, null), new b51.a.YourBirthCertificate(null, 1, null));
        }
        return (gender == eVar2 && maritalStatusType == bl0.d.MarriageEnded) ? pq.v.q(new b51.a.SecondDataParent(null, 1, null), new b51.a.MarriageCertificate(null, 1, null)) : pq.v.n();
    }
}
