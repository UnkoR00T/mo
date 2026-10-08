package t34;

import java.util.Date;
import k34.JuniorSchoolCardData;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.documents.data.model.JuniorSchoolCardDto;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/JuniorSchoolCardDto;", "Lk34/v;", "a", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/JuniorSchoolCardDto;)Lk34/v;", "documents_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final JuniorSchoolCardData a(JuniorSchoolCardDto juniorSchoolCardDto) {
        Date expirationDate = juniorSchoolCardDto.getContainer().getExpirationDate();
        String name = juniorSchoolCardDto.getContainer().getName();
        String surname = juniorSchoolCardDto.getContainer().getSurname();
        return new JuniorSchoolCardData(name, juniorSchoolCardDto.getContainer().getSecondName(), surname, expirationDate, juniorSchoolCardDto.getContainer().getPesel(), juniorSchoolCardDto.getContainer().getDateOfBirth(), juniorSchoolCardDto.getContainer().getIssueDate(), juniorSchoolCardDto.getContainer().getDisability());
    }
}
