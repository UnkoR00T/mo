package pa3;

import ia3.SummaryData;
import iy.b0;
import iy.c0;
import p071kotlin.Metadata;
import xw.PhoneNumber;
import y93.TripDetailsEditableData;
import z93.Applicant;
import z93.PhoneContactDetails;
import z93.TravelRequestModel;
import z93.r;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a!\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lia3/a;", "Lz93/q;", "b", "(Lia3/a;)Lz93/q;", "Lz93/s;", "tripUuid", "Lz93/r;", "tripType", "Ly93/a;", "a", "(Lia3/a;Ljava/lang/String;Lz93/r;)Ly93/a;", "travelabroad_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    public static final TripDetailsEditableData a(SummaryData summaryData, String str, r rVar) {
        return new TripDetailsEditableData(str, rVar, summaryData.getPersonalData(), summaryData.getContactDetails(), summaryData.getChosenParticipantsData(), summaryData.d(), null);
    }

    public static final TravelRequestModel b(SummaryData summaryData) {
        String firstName = summaryData.getPersonalData().getFirstName();
        String surname = summaryData.getPersonalData().getSurname();
        b0 pesel = summaryData.getPersonalData().getPesel();
        boolean isUserParticipant = summaryData.getChosenParticipantsData().getIsUserParticipant();
        String email = summaryData.getContactDetails().getEmail();
        if (!summaryData.getContactDetails().getIsEmailChecked()) {
            email = null;
        }
        PhoneNumber phoneNumber = summaryData.getContactDetails().getPhoneNumber();
        if (!summaryData.getContactDetails().getIsPhoneNumberChecked()) {
            phoneNumber = null;
        }
        return new TravelRequestModel(new Applicant(firstName, surname, pesel, isUserParticipant, email, phoneNumber != null ? new PhoneContactDetails(c0.e(phoneNumber.g()), c0.e(phoneNumber.h())) : null, null), summaryData.d(), summaryData.getChosenParticipantsData().b());
    }
}
