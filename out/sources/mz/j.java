package mz;

import kx.ByAddress;
import kx.ByCoordinates;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmz/j;", "Lkx/e;", "<init>", "()V", "Lkx/a;", "p1", "Lkx/g;", "c", "(Lkx/a;)Lkx/g;", "intent_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements kx.e {
    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public kx.g b(kx.a p15) {
        if (p15 instanceof kx.a.AddCalendarEvent) {
            kx.a.AddCalendarEvent addCalendarEvent = (kx.a.AddCalendarEvent) p15;
            return new a(addCalendarEvent.getEventTitle(), addCalendarEvent.getEventStartTimeMillis(), addCalendarEvent.getEventEndTimeMillis(), addCalendarEvent.getEventAllDay(), addCalendarEvent.getEventDescription(), addCalendarEvent.getEventLocation());
        }
        if (p15 instanceof kx.a.Dial) {
            return c.d(c.e(((kx.a.Dial) p15).getPhoneNumber()));
        }
        if (p15 instanceof kx.a.GoToApplicationDetailsSettings) {
            return new q(((kx.a.GoToApplicationDetailsSettings) p15).getPackageName());
        }
        if (fr.t.c(p15, kx.a.d.f112923a)) {
            return new r();
        }
        if (fr.t.c(p15, kx.a.e.f112924a)) {
            return new s();
        }
        if (p15 instanceof kx.a.GoToNotificationChannelsSettings) {
            kx.a.GoToNotificationChannelsSettings goToNotificationChannelsSettings = (kx.a.GoToNotificationChannelsSettings) p15;
            return new t(goToNotificationChannelsSettings.getPackageName(), goToNotificationChannelsSettings.getChannelId());
        }
        if (p15 instanceof kx.a.GoToNotificationSettings) {
            return u.d(u.e(((kx.a.GoToNotificationSettings) p15).getPackageName()));
        }
        if (p15 instanceof kx.a.GoToStore) {
            kx.a.GoToStore goToStore = (kx.a.GoToStore) p15;
            return new g(goToStore.getHasPlayStoreApp(), goToStore.getPackageName());
        }
        if (p15 instanceof ByCoordinates) {
            ByCoordinates byCoordinates = (ByCoordinates) p15;
            return new f.ByCoordinates(byCoordinates.getCoordinates(), byCoordinates.getPlaceLabel());
        }
        if (p15 instanceof ByAddress) {
            return new f.ByAddress(((ByAddress) p15).getAddress());
        }
        if (p15 instanceof kx.a.OpenUri) {
            return new v(((kx.a.OpenUri) p15).getUri());
        }
        if (p15 instanceof kx.a.OpenUrl) {
            return new w(((kx.a.OpenUrl) p15).getUrl());
        }
        if (p15 instanceof kx.a.SendEmail) {
            kx.a.SendEmail sendEmail = (kx.a.SendEmail) p15;
            return sendEmail.getAttachmentUri() != null ? new y(sendEmail.getAddressEmail(), sendEmail.getSubject(), sendEmail.getBody(), sendEmail.getAttachmentUri()) : new x(sendEmail.getAddressEmail(), sendEmail.getSubject(), sendEmail.getBody());
        }
        if (p15 instanceof kx.a.SharePdf) {
            return new z(((kx.a.SharePdf) p15).getUri());
        }
        if (p15 instanceof kx.a.ShareText) {
            return a0.d(a0.e(((kx.a.ShareText) p15).getText()));
        }
        if (p15 instanceof kx.a.i) {
            return new p();
        }
        throw new oq.p();
    }
}
