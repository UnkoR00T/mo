package kp0;

import fp0.GetPackageResponse;
import fp0.InstitutionCardAndCertData;
import fp0.ReportData;
import fp0.SummaryData;
import fp0.k;
import fp0.l;
import fp0.m;
import fr.t;
import gu.b;
import iy.b0;
import iy.c0;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import lp0.AttachmentDto;
import lp0.CertificateIdDto;
import lp0.CoordinatesDto;
import lp0.DataHeaderDto;
import lp0.GeometryDto;
import lp0.GetPackageResponseDto;
import lp0.InstitutionCardDto;
import lp0.LocationDto;
import lp0.PropertiesDto;
import lp0.ReportSummaryFormDto;
import lp0.ReportSummaryRequestDto;
import lp0.UserDataRequestDto;
import oq.p;
import p071kotlin.Metadata;
import ry.CertKeyPair;
import vy.Coordinates;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\u0011\u001a\u00020\u0010*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0019\u001a\u00020\u0018*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\u0014*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a1\u0010!\u001a\u00020 *\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010&\u001a\u00020\u0014*\u00020#2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'\u001a\u001b\u0010(\u001a\u00020\u0014*\u00020#2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b(\u0010'\u001a\u0013\u0010+\u001a\u00020**\u00020)H\u0002¢\u0006\u0004\b+\u0010,\u001a\u0013\u0010/\u001a\u00020.*\u00020-H\u0002¢\u0006\u0004\b/\u00100\u001a\u0013\u00102\u001a\u00020\u0014*\u000201H\u0002¢\u0006\u0004\b2\u00103\u001a\u0013\u00105\u001a\u00020\u0014*\u000204H\u0002¢\u0006\u0004\b5\u00106\u001a)\u0010<\u001a\u00020;*\u0002072\u0006\u00108\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b<\u0010=¨\u0006>"}, d2 = {"Llp0/s;", "Lfp0/c;", "d", "(Llp0/s;)Lfp0/c;", "Llp0/x;", "Lfp0/f$a;", "e", "(Llp0/x;)Lfp0/f$a;", "Lfp0/i;", "Ljava/time/Instant;", "creationTimestamp", "Ljava/util/Locale;", "locale", "", "Llp0/b;", "attachments", "Llp0/f0;", "i", "(Lfp0/i;Ljava/time/Instant;Ljava/util/Locale;Ljava/util/List;)Llp0/f0;", "Lry/c;", "", "requestId", "Lxw/g;", "pesel", "Llp0/m;", "k", "(Lry/c;Ljava/lang/String;Liy/b0;Ljava/time/Instant;)Llp0/m;", "", "c", "(J)Ljava/lang/String;", "Lfp0/j;", "reportNumber", "Llp0/e0;", "h", "(Lfp0/j;Ljava/lang/String;Ljava/util/List;Ljava/util/Locale;)Llp0/e0;", "Lfp0/k;", "Lfp0/m;", "wasteTypeTag", "b", "(Lfp0/k;Lfp0/m;)Ljava/lang/String;", "a", "Lfp0/j$a;", "Llp0/c0;", "g", "(Lfp0/j$a;)Llp0/c0;", "Lvy/c;", "Llp0/q;", "f", "(Lvy/c;)Llp0/q;", "", "m", "(Z)Ljava/lang/String;", "Lfp0/l;", "l", "(Lfp0/l;)Ljava/lang/String;", "Lfp0/f;", "signedBase64Data", "Lgu/b;", "expirationDuration", "Llp0/l0;", "j", "(Lfp0/f;Ljava/lang/String;Ljava/time/Instant;J)Llp0/l0;", "frontsrv_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: kp0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C2706a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112141a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.UNSELECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f112141a = iArr;
        }
    }

    private static final String a(k kVar, m mVar) {
        if (t.c(kVar, k.e.f65842a) || t.c(kVar, k.f.f65843a) || t.c(kVar, k.b.f65839a) || t.c(kVar, k.a.f65838a)) {
            return mVar instanceof m.Others ? ((m.Others) mVar).getUserType().getText() : "";
        }
        return kVar instanceof k.Others ? ((k.Others) kVar).getUserType().getText() : "";
    }

    private static final String b(k kVar, m mVar) {
        if (t.c(kVar, k.e.f65842a)) {
            if (t.c(mVar, m.a.f65849a)) {
                return "porzucenie/nielegalne zdeponowanie/składowanie/zakopywanie odpadów niebezpiecznych";
            }
            return t.c(mVar, m.b.f65850a) ? "porzucenie/nielegalne zdeponowanie/składowanie/zakopywanie odpadów komunalnych" : "porzucenie/nielegalne zdeponowanie/składowanie/zakopywanie odpadów innych (wskaż jakie w dodatkowych informacjach)";
        }
        if (t.c(kVar, k.f.f65843a)) {
            if (t.c(mVar, m.a.f65849a)) {
                return "nielegalne przetwarzanie/odzysk/unieszkodliwianie/zakopywanie odpadów niebezpiecznych";
            }
            return t.c(mVar, m.b.f65850a) ? "nielegalne przetwarzanie/odzysk/unieszkodliwianie/zakopywanie odpadów komunalnych" : "nielegalne przetwarzanie/odzysk/unieszkodliwianie/zakopywanie odpadów innych (wskaż jakie w dodatkowych informacjach)";
        }
        if (t.c(kVar, k.b.f65839a)) {
            if (t.c(mVar, m.a.f65849a)) {
                return "nielegalny transport odpadów niebezpiecznych";
            }
            return t.c(mVar, m.b.f65850a) ? "nielegalny transport odpadów komunalnych" : "nielegalny transport odpadów innych (wskaż jakie w dodatkowych informacjach)";
        }
        if (t.c(kVar, k.a.f65838a)) {
            return "nielegalne przywiezienie z zagranicy odpadów (wskaż jakie w dodatkowych informacjach)";
        }
        if (t.c(kVar, k.d.f65841a)) {
            return "zanieczyszczenie wody, powietrza lub powierzchni ziemi substancjami";
        }
        if (kVar instanceof k.Others) {
            return "inna (wskaż przedmiot w dodatkowych informacjach)";
        }
        throw new p();
    }

    private static final String c(long j15) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j15));
    }

    public static final GetPackageResponse d(GetPackageResponseDto getPackageResponseDto) {
        return new GetPackageResponse(getPackageResponseDto.getPackage());
    }

    public static final InstitutionCardAndCertData.Card e(InstitutionCardDto institutionCardDto) {
        return new InstitutionCardAndCertData.Card(institutionCardDto.getId(), institutionCardDto.getName(), institutionCardDto.getUrl(), institutionCardDto.getScope(), institutionCardDto.getPurpose(), institutionCardDto.getPurposeName(), institutionCardDto.getInstitutionId(), institutionCardDto.getCardId());
    }

    private static final GeometryDto f(Coordinates coordinates) {
        return new GeometryDto("Point", new CoordinatesDto(coordinates.getLatitude(), coordinates.getLongitude()));
    }

    private static final LocationDto g(SummaryData.LocationDetails locationDetails) {
        return new LocationDto(f(locationDetails.getCoordinates()), new PropertiesDto(locationDetails.getFullAddress()));
    }

    private static final ReportSummaryFormDto h(SummaryData summaryData, String str, List<AttachmentDto> list, Locale locale) {
        return new ReportSummaryFormDto(str, b(summaryData.getViolationTypeTag(), summaryData.getWasteTypeTag()).toLowerCase(locale), a(summaryData.getViolationTypeTag(), summaryData.getWasteTypeTag()), c0.e(summaryData.getApplicantDetails().getFullName()), c0.e(summaryData.getApplicantDetails().getEmail()), c0.e(summaryData.getApplicantDetails().getAddress()), c0.e(summaryData.getApplicantDetails().getPhoneNumber()), summaryData.getViolationEntityName().getText(), summaryData.getViolationDescription().getText(), summaryData.getLocationDetails().getVoivodeshipName().toLowerCase(locale), g(summaryData.getLocationDetails()), l(summaryData.getWasReported()), summaryData.getOfficeReportedTo().getText(), m(true), m(false), null, list, 32768, null);
    }

    public static final ReportSummaryRequestDto i(ReportData reportData, Instant instant, Locale locale, List<AttachmentDto> list) {
        return new ReportSummaryRequestDto(k(reportData.getCertKeyPair(), reportData.getInstitutionCardAndCertData().getRequestId(), reportData.getPesel(), instant), h(reportData.getSummaryData(), reportData.getInstitutionCardAndCertData().getFormName(), list, locale));
    }

    public static final UserDataRequestDto j(InstitutionCardAndCertData institutionCardAndCertData, String str, Instant instant, long j15) {
        int scope = institutionCardAndCertData.getCard().getScope();
        long epochSecond = instant.getEpochSecond();
        long epochSecond2 = instant.getEpochSecond() + b.F(j15);
        String purpose = institutionCardAndCertData.getCard().getPurpose();
        String purposeName = institutionCardAndCertData.getCard().getPurposeName();
        return new UserDataRequestDto(scope, 2, 0L, institutionCardAndCertData.getCard().getCardId(), institutionCardAndCertData.getCard().getInstitutionId(), "8S", str, Long.valueOf(epochSecond), Long.valueOf(epochSecond2), purpose, purposeName, new CertificateIdDto(institutionCardAndCertData.getCertificate().getSubjectDN().toString(), institutionCardAndCertData.getCertificate().getSerialNumber().toString(16), institutionCardAndCertData.getCertificate().getIssuerDN().toString()), "1", null);
    }

    private static final DataHeaderDto k(CertKeyPair certKeyPair, String str, b0 b0Var, Instant instant) {
        return new DataHeaderDto(certKeyPair.getCertificate().getSubjectDN().toString(), certKeyPair.getCertificate().getSerialNumber().toString(16), certKeyPair.getCertificate().getIssuerDN().getName(), c(instant.toEpochMilli()), str, 9001000, "1", "1", c0.e(b0Var));
    }

    private static final String l(l lVar) {
        int i15 = C2706a.f112141a[lVar.ordinal()];
        if (i15 == 1) {
            return "T";
        }
        if (i15 == 2 || i15 == 3) {
            return "N";
        }
        throw new p();
    }

    private static final String m(boolean z15) {
        return z15 ? "T" : "N";
    }
}
