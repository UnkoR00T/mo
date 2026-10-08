package kd4;

import a84.d;
import a84.f;
import iy.w;
import pl.gov.mc.fringers.mobywatel.pushNotification.FirebaseService;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static void a(FirebaseService firebaseService, d dVar) {
        firebaseService.decryptNotificationMessageUseCase = dVar;
    }

    public static void b(FirebaseService firebaseService, f fVar) {
        firebaseService.isDeviceRegisteredToNotificationsUseCase = fVar;
    }

    public static void c(FirebaseService firebaseService, px.d dVar) {
        firebaseService.remoteLogger = dVar;
    }

    public static void d(FirebaseService firebaseService, w wVar) {
        firebaseService.secureRandomFactory = wVar;
    }

    public static void e(FirebaseService firebaseService, t74.a aVar) {
        firebaseService.setupNotificationsChannelsUseCase = aVar;
    }

    public static void f(FirebaseService firebaseService, t74.b bVar) {
        firebaseService.updateNotDisplayedPushCountUC = bVar;
    }
}
