package lj0;

import ge4.x;
import ie4.o;
import ie4.p;
import nj0.ContactDetailDto;
import nj0.ContactDetailsConfirmationDto;
import nj0.ContactDetailsDto;
import nj0.EmailContactDetailRequestDto;
import nj0.EmailContactDetailsConfirmationRequestDto;
import nj0.PhoneContactDetailRequestDto;
import nj0.PhoneContactDetailsConfirmationRequestDto;
import nj0.WkAuthenticatedRequestDto;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004H§@¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u001e\u0010\u0010J \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u001f\u0010\u0014¨\u0006 À\u0006\u0003"}, d2 = {"Llj0/b;", "", "Lnj0/s;", "emailContactDetailsConfirmationRequestDto", "Lge4/x;", "Lnj0/l;", "g", "(Lnj0/s;Ltq/e;)Ljava/lang/Object;", "Lnj0/i0;", "phoneContactDetailsConfirmationRequestDto", "f", "(Lnj0/i0;Ltq/e;)Ljava/lang/Object;", "Lnj0/r;", "emailContactDetailRequestDto", "Lnj0/k;", "h", "(Lnj0/r;Ltq/e;)Ljava/lang/Object;", "Lnj0/h0;", "phoneContactDetailRequestDto", "i", "(Lnj0/h0;Ltq/e;)Ljava/lang/Object;", "Lnj0/o0;", "wkAuthenticatedRequestDto", "Loq/i0;", "e", "(Lnj0/o0;Ltq/e;)Ljava/lang/Object;", "d", "Lnj0/m;", "a", "(Ltq/e;)Ljava/lang/Object;", "c", "b", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    @ie4.f("citizen/mobile/api/contact-details")
    Object a(tq.e<? super x<ContactDetailsDto>> eVar);

    @p("citizen/mobile/api/contact-details/phone")
    Object b(@ie4.a PhoneContactDetailRequestDto phoneContactDetailRequestDto, tq.e<? super x<ContactDetailDto>> eVar);

    @p("citizen/mobile/api/contact-details/email")
    Object c(@ie4.a EmailContactDetailRequestDto emailContactDetailRequestDto, tq.e<? super x<ContactDetailDto>> eVar);

    @o("citizen/mobile/api/contact-details/phone/delete")
    Object d(@ie4.a WkAuthenticatedRequestDto wkAuthenticatedRequestDto, tq.e<? super x<i0>> eVar);

    @o("citizen/mobile/api/contact-details/email/delete")
    Object e(@ie4.a WkAuthenticatedRequestDto wkAuthenticatedRequestDto, tq.e<? super x<i0>> eVar);

    @o("citizen/mobile/api/contact-details/phone/confirm")
    Object f(@ie4.a PhoneContactDetailsConfirmationRequestDto phoneContactDetailsConfirmationRequestDto, tq.e<? super x<ContactDetailsConfirmationDto>> eVar);

    @o("citizen/mobile/api/contact-details/email/confirm")
    Object g(@ie4.a EmailContactDetailsConfirmationRequestDto emailContactDetailsConfirmationRequestDto, tq.e<? super x<ContactDetailsConfirmationDto>> eVar);

    @o("citizen/mobile/api/contact-details/email")
    Object h(@ie4.a EmailContactDetailRequestDto emailContactDetailRequestDto, tq.e<? super x<ContactDetailDto>> eVar);

    @o("citizen/mobile/api/contact-details/phone")
    Object i(@ie4.a PhoneContactDetailRequestDto phoneContactDetailRequestDto, tq.e<? super x<ContactDetailDto>> eVar);
}
