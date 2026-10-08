package mj0;

import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nj0.ContactDetailAdditionalValueDto;
import nj0.ContactDetailDto;
import nj0.ContactDetailsConfirmationDto;
import nj0.ContactDetailsDto;
import nj0.WkAuthenticatedRequestDto;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import xi0.ContactDetail;
import xi0.ContactDetailAdditionalValue;
import xi0.ContactDetails;
import xi0.ContactDetailsConfirmation;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lnj0/l;", "Lxi0/f;", "f", "(Lnj0/l;)Lxi0/f;", "Lnj0/l$a;", "Lxi0/g;", "g", "(Lnj0/l$a;)Lxi0/g;", "Lnj0/m;", "Lxi0/e;", "e", "(Lnj0/m;)Lxi0/e;", "Lnj0/k;", "Lxi0/a;", "a", "(Lnj0/k;)Lxi0/a;", "Lnj0/k$b;", "Lxi0/d;", "d", "(Lnj0/k$b;)Lxi0/d;", "Lnj0/k$a;", "Lxi0/c;", "c", "(Lnj0/k$a;)Lxi0/c;", "Lnj0/j;", "Lxi0/b;", "b", "(Lnj0/j;)Lxi0/b;", "Lny/a;", "Lnj0/o0;", "h", "(Liy/b0;)Lnj0/o0;", "citizenservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f126722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f126723b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f126724c;

        static {
            int[] iArr = new int[ContactDetailsConfirmationDto.a.values().length];
            try {
                iArr[ContactDetailsConfirmationDto.a.CONFIRMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContactDetailsConfirmationDto.a.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContactDetailsConfirmationDto.a.INCORRECT_CONFIRMATION_CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ContactDetailsConfirmationDto.a.NOTHING_TO_CONFIRM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ContactDetailsConfirmationDto.a.ATTEMPT_LIMIT_EXCEEDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ContactDetailsConfirmationDto.a.EXPIRED_CODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ContactDetailsConfirmationDto.a.UNSPECIFIED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f126722a = iArr;
            int[] iArr2 = new int[ContactDetailDto.b.values().length];
            try {
                iArr2[ContactDetailDto.b.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ContactDetailDto.b.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ContactDetailDto.b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f126723b = iArr2;
            int[] iArr3 = new int[ContactDetailDto.a.values().length];
            try {
                iArr3[ContactDetailDto.a.IN_REGISTRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ContactDetailDto.a.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ContactDetailDto.a.NO_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[ContactDetailDto.a.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            f126724c = iArr3;
        }
    }

    public static final ContactDetail a(ContactDetailDto contactDetailDto) {
        List listN;
        String value = contactDetailDto.getValue();
        b0 b0VarG = value != null ? c0.g(value) : null;
        xi0.d dVarD = d(contactDetailDto.getType());
        xi0.c cVarC = c(contactDetailDto.getStatus());
        List<ContactDetailAdditionalValueDto> listA = contactDetailDto.a();
        if (listA != null) {
            List<ContactDetailAdditionalValueDto> list = listA;
            listN = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listN.add(b((ContactDetailAdditionalValueDto) it.next()));
            }
        } else {
            listN = v.n();
        }
        return new ContactDetail(b0VarG, dVarD, cVarC, listN);
    }

    public static final ContactDetailAdditionalValue b(ContactDetailAdditionalValueDto contactDetailAdditionalValueDto) {
        return new ContactDetailAdditionalValue(contactDetailAdditionalValueDto.getKey(), c0.g(contactDetailAdditionalValueDto.getValue()));
    }

    public static final xi0.c c(ContactDetailDto.a aVar) {
        int i15 = a.f126724c[aVar.ordinal()];
        if (i15 == 1) {
            return xi0.c.IN_REGISTRY;
        }
        if (i15 == 2) {
            return xi0.c.PENDING;
        }
        if (i15 == 3) {
            return xi0.c.NO_DATA;
        }
        if (i15 == 4) {
            return xi0.c.UNKNOWN;
        }
        throw new p();
    }

    public static final xi0.d d(ContactDetailDto.b bVar) {
        int i15 = a.f126723b[bVar.ordinal()];
        if (i15 == 1) {
            return xi0.d.PHONE;
        }
        if (i15 == 2) {
            return xi0.d.EMAIL;
        }
        if (i15 == 3) {
            return xi0.d.UNKNOWN;
        }
        throw new p();
    }

    public static final ContactDetails e(ContactDetailsDto contactDetailsDto) {
        List listN;
        List<ContactDetailDto> listA = contactDetailsDto.a();
        if (listA != null) {
            List<ContactDetailDto> list = listA;
            listN = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listN.add(a((ContactDetailDto) it.next()));
            }
        } else {
            listN = v.n();
        }
        return new ContactDetails(listN);
    }

    public static final ContactDetailsConfirmation f(ContactDetailsConfirmationDto contactDetailsConfirmationDto) {
        return new ContactDetailsConfirmation(g(contactDetailsConfirmationDto.getCode()), contactDetailsConfirmationDto.getTitle(), contactDetailsConfirmationDto.getMessage());
    }

    public static final xi0.g g(ContactDetailsConfirmationDto.a aVar) {
        switch (a.f126722a[aVar.ordinal()]) {
            case 1:
                return xi0.g.CONFIRMED;
            case 2:
                return xi0.g.UNKNOWN;
            case 3:
                return xi0.g.INCORRECT_CONFIRMATION_CODE;
            case 4:
                return xi0.g.NOTHING_TO_CONFIRM;
            case 5:
                return xi0.g.ATTEMPT_LIMIT_EXCEEDED;
            case 6:
                return xi0.g.EXPIRED_CODE;
            case 7:
                return xi0.g.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final WkAuthenticatedRequestDto h(b0 b0Var) {
        return new WkAuthenticatedRequestDto(c0.e(b0Var));
    }
}
