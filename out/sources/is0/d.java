package is0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import js0.CommitmentTypeDto;
import js0.CreateStampDutyRequestDto;
import js0.InstitutionAddressDto;
import js0.InstitutionDto;
import js0.StampDutyAmountDto;
import js0.StampDutyDto;
import p071kotlin.Metadata;
import pq.v;
import zr0.BECommitmentType;
import zr0.BECreateStampDutyRequest;
import zr0.BEInstitution;
import zr0.BEInstitutionAddress;
import zr0.BEStampDuty;
import zr0.BEStampDutyAmount;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ljs0/q;", "Lzr0/a;", "a", "(Ljs0/q;)Lzr0/a;", "Ljs0/q0;", "Lzr0/f;", "e", "(Ljs0/q0;)Lzr0/f;", "Ljs0/x;", "Lzr0/c;", "b", "(Ljs0/x;)Lzr0/c;", "Lzr0/b;", "Ljs0/r;", "f", "(Lzr0/b;)Ljs0/r;", "Ljs0/r0;", "Lzr0/e;", "d", "(Ljs0/r0;)Lzr0/e;", "Ljs0/w;", "Lzr0/d;", "c", "(Ljs0/w;)Lzr0/d;", "paymentservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    public static final BECommitmentType a(CommitmentTypeDto commitmentTypeDto) {
        String code = commitmentTypeDto.getCode();
        String name = commitmentTypeDto.getName();
        List<StampDutyAmountDto> listC = commitmentTypeDto.c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(e((StampDutyAmountDto) it.next()));
        }
        return new BECommitmentType(code, name, arrayList);
    }

    public static final BEInstitution b(InstitutionDto institutionDto) {
        return new BEInstitution(c.l(institutionDto.getAddress()), institutionDto.getId(), institutionDto.getName());
    }

    public static final BEInstitutionAddress c(InstitutionAddressDto institutionAddressDto) {
        return new BEInstitutionAddress(institutionAddressDto.getBuildingNumber(), institutionAddressDto.getCity(), institutionAddressDto.getName(), institutionAddressDto.getPostalCode(), institutionAddressDto.getApartmentNumber(), institutionAddressDto.getStreet());
    }

    public static final BEStampDuty d(StampDutyDto stampDutyDto) {
        return new BEStampDuty(stampDutyDto.getAmount(), stampDutyDto.getCommitmentTypeCode(), stampDutyDto.getCreationTime(), stampDutyDto.getDescription(), stampDutyDto.getDueDate(), c(stampDutyDto.getInstitutionAddressDTO()), stampDutyDto.getInstitutionId(), stampDutyDto.getPaymentId(), stampDutyDto.getPesel(), stampDutyDto.getTitle());
    }

    public static final BEStampDutyAmount e(StampDutyAmountDto stampDutyAmountDto) {
        return new BEStampDutyAmount(stampDutyAmountDto.getAmount(), stampDutyAmountDto.getDescription());
    }

    public static final CreateStampDutyRequestDto f(BECreateStampDutyRequest bECreateStampDutyRequest) {
        return new CreateStampDutyRequestDto(bECreateStampDutyRequest.getAmount(), bECreateStampDutyRequest.getComitmentTypeCode(), bECreateStampDutyRequest.getInstitutionId(), bECreateStampDutyRequest.getName(), bECreateStampDutyRequest.getPesel(), bECreateStampDutyRequest.getSurname());
    }
}
