package t34;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jr0.CategoryContainer;
import jr0.DrivingLicenceDataContainer;
import jr0.DrivingLicenceScope;
import jr0.StatusChangedReasonContainer;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.documents.data.model.CategoryContainerDto;
import pl.gov.coi.mobywatel.technical.documents.data.model.DrivingLicenceDataContainerDto;
import pl.gov.coi.mobywatel.technical.documents.data.model.DrivingLicenceScopeDto;
import pl.gov.coi.mobywatel.technical.documents.data.model.StatusChangedReasonContainerDto;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/DrivingLicenceScopeDto;", "Ljr0/d;", "c", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/DrivingLicenceScopeDto;)Ljr0/d;", "Lpl/gov/coi/mobywatel/technical/documents/data/model/DrivingLicenceDataContainerDto;", "Ljr0/c;", "b", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/DrivingLicenceDataContainerDto;)Ljr0/c;", "Lpl/gov/coi/mobywatel/technical/documents/data/model/CategoryContainerDto;", "Ljr0/a;", "a", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/CategoryContainerDto;)Ljr0/a;", "Lpl/gov/coi/mobywatel/technical/documents/data/model/StatusChangedReasonContainerDto;", "Ljr0/s;", "d", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/StatusChangedReasonContainerDto;)Ljr0/s;", "documents_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final CategoryContainer a(CategoryContainerDto categoryContainerDto) {
        return new CategoryContainer(categoryContainerDto.getCN(), categoryContainerDto.getFRD(), categoryContainerDto.getResC(), categoryContainerDto.getED(), categoryContainerDto.getCS());
    }

    public static final DrivingLicenceDataContainer b(DrivingLicenceDataContainerDto drivingLicenceDataContainerDto) {
        ArrayList arrayList;
        String name = drivingLicenceDataContainerDto.getName();
        String surname = drivingLicenceDataContainerDto.getSurname();
        LocalDate birthday = drivingLicenceDataContainerDto.getBirthday();
        String birthplace = drivingLicenceDataContainerDto.getBirthplace();
        String ds4 = drivingLicenceDataContainerDto.getDS();
        String dsc = drivingLicenceDataContainerDto.getDSC();
        String ldId = drivingLicenceDataContainerDto.getLdId();
        String pn4 = drivingLicenceDataContainerDto.getPn();
        LocalDate rd5 = drivingLicenceDataContainerDto.getRD();
        List<String> resG = drivingLicenceDataContainerDto.getResG();
        List<CategoryContainerDto> cat = drivingLicenceDataContainerDto.getCat();
        ArrayList arrayList2 = null;
        if (cat != null) {
            List<CategoryContainerDto> list = cat;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a((CategoryContainerDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        String secondName = drivingLicenceDataContainerDto.getSecondName();
        List<StatusChangedReasonContainerDto> tcS = drivingLicenceDataContainerDto.getTcS();
        if (tcS != null) {
            List<StatusChangedReasonContainerDto> list2 = tcS;
            arrayList2 = new ArrayList(v.y(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(d((StatusChangedReasonContainerDto) it4.next()));
            }
        }
        return new DrivingLicenceDataContainer(name, surname, birthday, birthplace, ds4, dsc, ldId, pn4, rd5, resG, arrayList, secondName, arrayList2, drivingLicenceDataContainerDto.getED());
    }

    public static final DrivingLicenceScope c(DrivingLicenceScopeDto drivingLicenceScopeDto) {
        return new DrivingLicenceScope(d.d(drivingLicenceScopeDto.getDh()), b(drivingLicenceScopeDto.getDc()));
    }

    public static final StatusChangedReasonContainer d(StatusChangedReasonContainerDto statusChangedReasonContainerDto) {
        return new StatusChangedReasonContainer(statusChangedReasonContainerDto.getCSC(), statusChangedReasonContainerDto.getCSD());
    }
}
