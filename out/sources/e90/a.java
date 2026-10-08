package e90;

import h90.BENotificationSettingsEntry;
import h90.BENotificationSettingsSection;
import h90.BENotificationSettingsUpdateEntry;
import h90.BENotificationsSettings;
import h90.BEPushHistory;
import h90.BEPushHistoryEntry;
import h90.BEPushParameters;
import h90.BERegisterDeviceRequest;
import h90.BERegisterDeviceResponse;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nt3.ExternalQualifiedSignatureAuthorizationParametersDto;
import nt3.PaymentParametersDto;
import nt3.PushHistoryDto;
import nt3.PushHistoryEntryDto;
import nt3.PushParametersDto;
import nt3.PushSettingsDto;
import nt3.PushSettingsEntryDto;
import nt3.PushSettingsEntryPresentationDto;
import nt3.PushSettingsPresentationDto;
import nt3.PushSettingsSectionPresentationDto;
import nt3.RegisterDeviceRequestDto;
import nt3.RegisterDeviceResponseDto;
import nt3.TrustedProfileAuthorizationParametersDto;
import nt3.m;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010#\u001a\u00020\"*\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lh90/h;", "Lnt3/n;", "i", "(Lh90/h;)Lnt3/n;", "Lnt3/o;", "Lh90/i;", "g", "(Lnt3/o;)Lh90/i;", "Lnt3/e;", "Lh90/e;", "d", "(Lnt3/e;)Lh90/e;", "Lnt3/f;", "Lh90/f;", "e", "(Lnt3/f;)Lh90/f;", "Lnt3/g;", "Lh90/g;", "f", "(Lnt3/g;)Lh90/g;", "Lnt3/k;", "Lh90/d;", "c", "(Lnt3/k;)Lh90/d;", "Lnt3/l;", "Lh90/b;", "b", "(Lnt3/l;)Lh90/b;", "Lnt3/j;", "Lh90/a;", "a", "(Lnt3/j;)Lh90/a;", "", "Lh90/c;", "Lnt3/h;", "h", "(Ljava/util/List;)Lnt3/h;", "notificationsservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final BENotificationSettingsEntry a(PushSettingsEntryPresentationDto pushSettingsEntryPresentationDto) {
        return new BENotificationSettingsEntry(pushSettingsEntryPresentationDto.getType(), pushSettingsEntryPresentationDto.getTitle(), pushSettingsEntryPresentationDto.getDescription(), pushSettingsEntryPresentationDto.getEnabled());
    }

    public static final BENotificationSettingsSection b(PushSettingsSectionPresentationDto pushSettingsSectionPresentationDto) {
        String title = pushSettingsSectionPresentationDto.getTitle();
        List<PushSettingsEntryPresentationDto> listA = pushSettingsSectionPresentationDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(a((PushSettingsEntryPresentationDto) it.next()));
        }
        return new BENotificationSettingsSection(title, arrayList);
    }

    public static final BENotificationsSettings c(PushSettingsPresentationDto pushSettingsPresentationDto) {
        List<PushSettingsSectionPresentationDto> listA = pushSettingsPresentationDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(b((PushSettingsSectionPresentationDto) it.next()));
        }
        return new BENotificationsSettings(arrayList);
    }

    public static final BEPushHistory d(PushHistoryDto pushHistoryDto) {
        ArrayList arrayList;
        List<PushHistoryEntryDto> listA = pushHistoryDto.a();
        if (listA != null) {
            List<PushHistoryEntryDto> list = listA;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(e((PushHistoryEntryDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new BEPushHistory(arrayList);
    }

    public static final BEPushHistoryEntry e(PushHistoryEntryDto pushHistoryEntryDto) {
        String id5 = pushHistoryEntryDto.getId();
        String title = pushHistoryEntryDto.getTitle();
        String content = pushHistoryEntryDto.getContent();
        String privateContent = pushHistoryEntryDto.getPrivateContent();
        OffsetDateTime sendingDateTime = pushHistoryEntryDto.getSendingDateTime();
        boolean displayed = pushHistoryEntryDto.getDisplayed();
        m pushType = pushHistoryEntryDto.getPushType();
        return new BEPushHistoryEntry(id5, title, content, privateContent, sendingDateTime, displayed, pushType != null ? pushType.getValue() : null, f(pushHistoryEntryDto.getParameters()));
    }

    public static final BEPushParameters f(PushParametersDto pushParametersDto) {
        TrustedProfileAuthorizationParametersDto trustedProfileAuthorization = pushParametersDto.getTrustedProfileAuthorization();
        BEPushParameters.BETrustedProfileAuthorizationParams bETrustedProfileAuthorizationParams = trustedProfileAuthorization != null ? new BEPushParameters.BETrustedProfileAuthorizationParams(trustedProfileAuthorization.getAuthorizationId(), trustedProfileAuthorization.getExpirationDateTime()) : null;
        ExternalQualifiedSignatureAuthorizationParametersDto externalQualifiedSignatureAuthorization = pushParametersDto.getExternalQualifiedSignatureAuthorization();
        BEPushParameters.BEQualifiedSignatureAuthorizationParams bEQualifiedSignatureAuthorizationParams = externalQualifiedSignatureAuthorization != null ? new BEPushParameters.BEQualifiedSignatureAuthorizationParams(externalQualifiedSignatureAuthorization.getAuthorizationId(), externalQualifiedSignatureAuthorization.getExpirationDateTime(), externalQualifiedSignatureAuthorization.getProcessId()) : null;
        PaymentParametersDto payment = pushParametersDto.getPayment();
        return new BEPushParameters(bETrustedProfileAuthorizationParams, bEQualifiedSignatureAuthorizationParams, payment != null ? new BEPushParameters.BEPaymentParams(payment.getPaymentId()) : null);
    }

    public static final BERegisterDeviceResponse g(RegisterDeviceResponseDto registerDeviceResponseDto) {
        return new BERegisterDeviceResponse(registerDeviceResponseDto.getEncryptingKey());
    }

    public static final PushSettingsDto h(List<BENotificationSettingsUpdateEntry> list) {
        List<BENotificationSettingsUpdateEntry> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (BENotificationSettingsUpdateEntry bENotificationSettingsUpdateEntry : list2) {
            arrayList.add(new PushSettingsEntryDto(bENotificationSettingsUpdateEntry.getEnabled(), bENotificationSettingsUpdateEntry.getType()));
        }
        return new PushSettingsDto(arrayList);
    }

    public static final RegisterDeviceRequestDto i(BERegisterDeviceRequest bERegisterDeviceRequest) {
        return new RegisterDeviceRequestDto(bERegisterDeviceRequest.getPushNotificationsEnabled(), bERegisterDeviceRequest.getPushToken());
    }
}
