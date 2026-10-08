package ew0;

import fw0.ActDto;
import fw0.MessageDto;
import fw0.PenaltyPointsDto;
import fw0.PenaltyPointsVehicleDto;
import fw0.PersonalDetailsDto;
import fw0.ViolationDto;
import fw0.ViolationPlaceDto;
import fw0.c1;
import iy.b0;
import iy.c0;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import qv0.Act;
import qv0.Message;
import qv0.PenaltyPoints;
import qv0.PenaltyPointsVehicle;
import qv0.PersonalDetails;
import qv0.Violation;
import qv0.ViolationPlace;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lfw0/e1;", "Lqv0/c;", "c", "(Lfw0/e1;)Lqv0/c;", "Lfw0/g1;", "Lqv0/e;", "e", "(Lfw0/g1;)Lqv0/e;", "Lfw0/e4;", "Lqv0/g;", "g", "(Lfw0/e4;)Lqv0/g;", "Lfw0/f1;", "Lqv0/d;", "d", "(Lfw0/f1;)Lqv0/d;", "Lfw0/f4;", "Lqv0/h;", "h", "(Lfw0/f4;)Lqv0/h;", "Lfw0/b1;", "Lqv0/b;", "b", "(Lfw0/b1;)Lqv0/b;", "Lfw0/c1;", "Lqv0/f;", "f", "(Lfw0/c1;)Lqv0/f;", "Lfw0/d;", "Lqv0/a;", "a", "(Lfw0/d;)Lqv0/a;", "vehicleservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53837a;

        static {
            int[] iArr = new int[c1.values().length];
            try {
                iArr[c1.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c1.DANGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c1.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f53837a = iArr;
        }
    }

    private static final Act a(ActDto actDto) {
        return new Act(actDto.getType(), actDto.getLegalQualification());
    }

    private static final Message b(MessageDto messageDto) {
        return new Message(f(messageDto.getType()), messageDto.getMessage());
    }

    public static final PenaltyPoints c(PenaltyPointsDto penaltyPointsDto) {
        ArrayList arrayList;
        ArrayList arrayList2;
        PersonalDetailsDto personalDetails = penaltyPointsDto.getPersonalDetails();
        ArrayList arrayList3 = null;
        PersonalDetails personalDetailsE = personalDetails != null ? e(personalDetails) : null;
        Integer activePenaltyPoints = penaltyPointsDto.getActivePenaltyPoints();
        Integer temporaryPenaltyPoints = penaltyPointsDto.getTemporaryPenaltyPoints();
        OffsetDateTime dataCheckTime = penaltyPointsDto.getDataCheckTime();
        List<ViolationDto> listB = penaltyPointsDto.b();
        if (listB != null) {
            List<ViolationDto> list = listB;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(g((ViolationDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        List<ViolationDto> listG = penaltyPointsDto.g();
        if (listG != null) {
            List<ViolationDto> list2 = listG;
            arrayList2 = new ArrayList(v.y(list2, 10));
            Iterator<T> it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(g((ViolationDto) it4.next()));
            }
        } else {
            arrayList2 = null;
        }
        List<MessageDto> listD = penaltyPointsDto.d();
        if (listD != null) {
            List<MessageDto> list3 = listD;
            arrayList3 = new ArrayList(v.y(list3, 10));
            Iterator<T> it5 = list3.iterator();
            while (it5.hasNext()) {
                arrayList3.add(b((MessageDto) it5.next()));
            }
        }
        return new PenaltyPoints(personalDetailsE, activePenaltyPoints, temporaryPenaltyPoints, dataCheckTime, arrayList, arrayList2, arrayList3);
    }

    private static final PenaltyPointsVehicle d(PenaltyPointsVehicleDto penaltyPointsVehicleDto) {
        return new PenaltyPointsVehicle(penaltyPointsVehicleDto.getRegistrationNumber(), penaltyPointsVehicleDto.getBrand(), penaltyPointsVehicleDto.getModel(), penaltyPointsVehicleDto.getType(), penaltyPointsVehicleDto.getCountryOfRegistration());
    }

    private static final PersonalDetails e(PersonalDetailsDto personalDetailsDto) {
        return new PersonalDetails(c0.g(personalDetailsDto.getPesel()), c0.g(personalDetailsDto.getNames()), c0.g(personalDetailsDto.getLastname()));
    }

    private static final qv0.f f(c1 c1Var) {
        int i15 = a.f53837a[c1Var.ordinal()];
        if (i15 == 1) {
            return qv0.f.INFO;
        }
        if (i15 == 2) {
            return qv0.f.DANGER;
        }
        if (i15 == 3) {
            return qv0.f.UNKNOWN;
        }
        throw new p();
    }

    private static final Violation g(ViolationDto violationDto) {
        Integer penaltyPoints = violationDto.getPenaltyPoints();
        String conclusion = violationDto.getConclusion();
        String registrationAuthority = violationDto.getRegistrationAuthority();
        OffsetDateTime violationDate = violationDto.getViolationDate();
        PenaltyPointsVehicleDto penaltyPointsVehicle = violationDto.getPenaltyPointsVehicle();
        ArrayList arrayList = null;
        PenaltyPointsVehicle penaltyPointsVehicleD = penaltyPointsVehicle != null ? d(penaltyPointsVehicle) : null;
        ViolationPlaceDto violationPlace = violationDto.getViolationPlace();
        ViolationPlace violationPlaceH = violationPlace != null ? h(violationPlace) : null;
        List<ActDto> listA = violationDto.a();
        if (listA != null) {
            List<ActDto> list = listA;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a((ActDto) it.next()));
            }
        }
        return new Violation(penaltyPoints, conclusion, registrationAuthority, violationDate, penaltyPointsVehicleD, violationPlaceH, arrayList);
    }

    private static final ViolationPlace h(ViolationPlaceDto violationPlaceDto) {
        String province = violationPlaceDto.getProvince();
        String district = violationPlaceDto.getDistrict();
        String commune = violationPlaceDto.getCommune();
        String city = violationPlaceDto.getCity();
        String street = violationPlaceDto.getStreet();
        b0 b0VarG = street != null ? c0.g(street) : null;
        String streetNumber = violationPlaceDto.getStreetNumber();
        b0 b0VarG2 = streetNumber != null ? c0.g(streetNumber) : null;
        String streetNumberContinuation = violationPlaceDto.getStreetNumberContinuation();
        b0 b0VarG3 = streetNumberContinuation != null ? c0.g(streetNumberContinuation) : null;
        String buildingNumber = violationPlaceDto.getBuildingNumber();
        return new ViolationPlace(province, district, commune, city, b0VarG, b0VarG2, b0VarG3, buildingNumber != null ? c0.g(buildingNumber) : null, violationPlaceDto.getRoadKilometer());
    }
}
