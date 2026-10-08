package td3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000î\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\fH\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\fH\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\fH\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010%\u001a\u00020\fH\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020,2\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020\u0011H\u0007¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u0002032\u0006\u0010/\u001a\u00020\u0011H\u0007¢\u0006\u0004\b4\u00105J\u001f\u0010;\u001a\u00020:2\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0007¢\u0006\u0004\b;\u0010<J\u001f\u0010>\u001a\u00020=2\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0007¢\u0006\u0004\b>\u0010?J'\u0010C\u001a\u00020B2\u0006\u0010A\u001a\u00020@2\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0007¢\u0006\u0004\bC\u0010DJ\u001f\u0010J\u001a\u00020I2\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020GH\u0007¢\u0006\u0004\bJ\u0010KJ'\u0010Q\u001a\u00020P2\u0006\u0010L\u001a\u00020=2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020IH\u0007¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\nH\u0007¢\u0006\u0004\bS\u0010TJ'\u0010Z\u001a\u00020Y2\u0006\u0010V\u001a\u00020U2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010X\u001a\u00020WH\u0007¢\u0006\u0004\bZ\u0010[J/\u0010e\u001a\u00020d2\u0006\u0010]\u001a\u00020\\2\u0006\u0010_\u001a\u00020^2\u0006\u0010a\u001a\u00020`2\u0006\u0010c\u001a\u00020bH\u0007¢\u0006\u0004\be\u0010fJ\u0017\u0010h\u001a\u00020g2\u0006\u0010]\u001a\u00020\\H\u0007¢\u0006\u0004\bh\u0010iJ/\u0010s\u001a\u00020r2\u0006\u0010k\u001a\u00020j2\u0006\u0010m\u001a\u00020l2\u0006\u0010o\u001a\u00020n2\u0006\u0010q\u001a\u00020pH\u0007¢\u0006\u0004\bs\u0010tJ/\u0010{\u001a\u00020z2\u0006\u0010u\u001a\u00020r2\u0006\u0010w\u001a\u00020v2\u0006\u0010m\u001a\u00020l2\u0006\u0010y\u001a\u00020xH\u0007¢\u0006\u0004\b{\u0010|J'\u0010~\u001a\u00020}2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020GH\u0007¢\u0006\u0004\b~\u0010\u007fJ\u0012\u0010\u0080\u0001\u001a\u00020GH\u0007¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J,\u0010\u0084\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u0082\u0001\u001a\u00020g2\u0006\u0010_\u001a\u00020^2\u0006\u0010c\u001a\u00020bH\u0007¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0013\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0007¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001d\u0010\u008c\u0001\u001a\u00030\u008b\u00012\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0007¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J@\u0010\u0094\u0001\u001a\u00030\u0093\u00012\b\u0010\u008f\u0001\u001a\u00030\u008e\u00012\u0006\u00107\u001a\u0002062\b\u0010\u0091\u0001\u001a\u00030\u0090\u00012\u0006\u00109\u001a\u0002082\u0007\u0010\u0092\u0001\u001a\u00020BH\u0007¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001d\u0010\u0099\u0001\u001a\u00030\u0098\u00012\b\u0010\u0097\u0001\u001a\u00030\u0096\u0001H\u0007¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001d\u0010\u009e\u0001\u001a\u00030\u009d\u00012\b\u0010\u009c\u0001\u001a\u00030\u009b\u0001H\u0007¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001d\u0010¢\u0001\u001a\u00030¡\u00012\b\u0010 \u0001\u001a\u00030\u009d\u0001H\u0007¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u001c\u0010¦\u0001\u001a\u00030¥\u00012\u0007\u0010¤\u0001\u001a\u00020\fH\u0007¢\u0006\u0006\b¦\u0001\u0010§\u0001J1\u0010¯\u0001\u001a\u00030®\u00012\b\u0010©\u0001\u001a\u00030¨\u00012\b\u0010«\u0001\u001a\u00030ª\u00012\b\u0010\u00ad\u0001\u001a\u00030¬\u0001H\u0007¢\u0006\u0006\b¯\u0001\u0010°\u0001JP\u0010»\u0001\u001a\u0002062\b\u0010²\u0001\u001a\u00030±\u00012\b\u0010´\u0001\u001a\u00030³\u00012\n\b\u0001\u0010¶\u0001\u001a\u00030µ\u00012\n\b\u0001\u0010¸\u0001\u001a\u00030·\u00012\b\u0010º\u0001\u001a\u00030¹\u00012\u0006\u0010c\u001a\u00020bH\u0007¢\u0006\u0006\b»\u0001\u0010¼\u0001¨\u0006½\u0001"}, d2 = {"Ltd3/a;", "", "<init>", "()V", "Law0/u;", "getOtherSideInitialConfirmationUC", "Law0/p;", "confirmOtherSideDataUC", "Law0/c0;", "rejectOtherSideDataUC", "Lae3/j;", "longPollUC", "Lwd3/a;", "d", "(Law0/u;Law0/p;Law0/c0;Lae3/j;)Lwd3/a;", "Law0/f;", "getSubscribeStatementDataUC", "Lwd3/c;", "w", "(Law0/f;Lae3/j;)Lwd3/c;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "Lae3/c0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lmx/c;Lhz/i;)Lae3/c0;", "Lae3/y;", "G", "(Lmx/c;Lhz/i;)Lae3/y;", "confirmationStatusesManager", "Lbe3/a;", "a", "(Lwd3/a;)Lbe3/a;", "Lbe3/e;", "r", "(Lwd3/a;)Lbe3/e;", "confirmationInitialInfoManager", "Lbe3/g;", "s", "(Lwd3/a;)Lbe3/g;", "Lbe3/i;", "E", "(Lwd3/a;)Lbe3/i;", "Lci3/f;", "l", "(Lmx/c;)Lci3/f;", "readyToSignManager", "Lee3/a;", "m", "(Lwd3/c;)Lee3/a;", "Lee3/c;", ip.a.f96138c, "(Lwd3/c;)Lee3/c;", "Lzd3/a;", "collisionStorageRepository", "Lvd3/a;", "vehicleCollisionContainersInteractor", "Lae3/r;", "A", "(Lzd3/a;Lvd3/a;)Lae3/r;", "Lae3/i;", "p", "(Lzd3/a;Lvd3/a;)Lae3/i;", "Lz04/a;", "fileStorageRepository", "Lae3/a;", "c", "(Lz04/a;Lzd3/a;Lvd3/a;)Lae3/a;", "Law0/m;", "subscribeDescriptionUC", "Lxd3/b;", "descriptionMapper", "Lae3/f;", "n", "(Law0/m;Lxd3/b;)Lae3/f;", "getSavedCollisionDataUC", "Law0/d;", "getReadyToSignStatementDataUC", "getDescriptionUC", "Lae3/m;", "x", "(Lae3/i;Law0/d;Lae3/f;)Lae3/m;", "t", "()Lae3/j;", "La14/y;", "requestPermissionUseCase", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lae3/q;", "z", "(La14/y;Lmx/c;La14/m;)Lae3/q;", "Lp04/a;", "downloadFileFromCloudUC", "La14/a0;", "saveFilesOnDeviceUseCase", "Laz/d;", "fileConverter", "Lpx/d;", "remoteLogger", "Lae3/c;", "j", "(Lp04/a;La14/a0;Laz/d;Lpx/d;)Lae3/c;", "Lae3/e;", "i", "(Lp04/a;)Lae3/e;", "Lp04/b;", "uploadFileToCloudUC", "Law0/s;", "getFileImageConfigurationUC", "Lez/a;", "currentTimeProvider", "Lbc4/e;", "createThumbnailUseCase", "Lae3/t;", "B", "(Lp04/b;Law0/s;Lez/a;Lbc4/e;)Lae3/t;", "sendImageUC", "Law0/b0;", "postVehicleCollisionStatementUC", "Law0/i;", "refreshParticipantCollisionImagesUC", "Lae3/u;", "C", "(Lae3/t;Law0/b0;Law0/s;Law0/i;)Lae3/u;", "Lae3/x;", "F", "(Lae3/j;Law0/m;Lxd3/b;)Lae3/x;", "g", "()Lxd3/b;", "downloadImageUC", "Lae3/d;", "h", "(Lae3/e;La14/a0;Lpx/d;)Lae3/d;", "Log3/a;", "f", "()Log3/a;", "Law0/j;", "bERegenerateStatementUC", "Lae3/n;", "y", "(Law0/j;)Lae3/n;", "Law0/b;", "beGetFirstPageUserCollisionsUC", "Law0/n;", "beVerifyStatusStatementsUC", "clearDraftNewCollisionDataUC", "Lae3/h;", "o", "(Law0/b;Lzd3/a;Law0/n;Lvd3/a;Lae3/a;)Lae3/h;", "Lxx/a;", "exifDataManager", "Lae3/b;", "e", "(Lxx/a;)Lae3/b;", "Luy/d;", "gpsManager", "Lzd3/b;", "q", "(Luy/d;)Lzd3/b;", "gpsCoordinateRepository", "Lae3/g;", "u", "(Lzd3/b;)Lae3/g;", "manager", "Lbe3/c;", "b", "(Lwd3/a;)Lbe3/c;", "Law0/h;", "bePostReadyStatementUC", "Lwz3/d;", "getBase64SignedValueUseCase", "Lwz3/e;", "getChallengeUC", "Lae3/l;", "v", "(Law0/h;Lwz3/d;Lwz3/e;)Lae3/l;", "Liy/a;", "base64Coder", "Lay/j;", "jsonSerializer", "Lq10/a;", "databaseRegistry", "Lp10/f;", "dbProvider", "Lay/h;", "jsonFactory", "k", "(Liy/a;Lay/j;Lq10/a;Lp10/f;Lay/h;Lpx/d;)Lzd3/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final ae3.r A(zd3.a collisionStorageRepository, vd3.a vehicleCollisionContainersInteractor) {
        return new ae3.r(collisionStorageRepository, vehicleCollisionContainersInteractor);
    }

    public final ae3.t B(p04.b uploadFileToCloudUC, aw0.s getFileImageConfigurationUC, ez.a currentTimeProvider, bc4.e createThumbnailUseCase) {
        return new ae3.t(uploadFileToCloudUC, getFileImageConfigurationUC, currentTimeProvider, createThumbnailUseCase);
    }

    public final ae3.u C(ae3.t sendImageUC, aw0.b0 postVehicleCollisionStatementUC, aw0.s getFileImageConfigurationUC, aw0.i refreshParticipantCollisionImagesUC) {
        return new ae3.u(sendImageUC, postVehicleCollisionStatementUC, getFileImageConfigurationUC, refreshParticipantCollisionImagesUC);
    }

    public final ee3.c D(wd3.c readyToSignManager) {
        return new ee3.d(readyToSignManager);
    }

    public final be3.i E(wd3.a confirmationInitialInfoManager) {
        return new be3.j(confirmationInitialInfoManager);
    }

    public final ae3.x F(ae3.j longPollUC, aw0.m subscribeDescriptionUC, xd3.b descriptionMapper) {
        return new ae3.x(longPollUC, subscribeDescriptionUC, descriptionMapper);
    }

    public final ae3.y G(mx.c labelProvider, hz.i validatorTextFactory) {
        return new ae3.y(labelProvider, validatorTextFactory);
    }

    public final ae3.c0 H(mx.c labelProvider, hz.i validatorTextFactory) {
        return new ae3.c0(labelProvider, validatorTextFactory);
    }

    public final be3.a a(wd3.a confirmationStatusesManager) {
        return new be3.b(confirmationStatusesManager);
    }

    public final be3.c b(wd3.a manager) {
        return new be3.d(manager);
    }

    public final ae3.a c(z04.a fileStorageRepository, zd3.a collisionStorageRepository, vd3.a vehicleCollisionContainersInteractor) {
        return new ae3.a(fileStorageRepository, collisionStorageRepository, vehicleCollisionContainersInteractor);
    }

    public final wd3.a d(aw0.u getOtherSideInitialConfirmationUC, aw0.p confirmOtherSideDataUC, aw0.c0 rejectOtherSideDataUC, ae3.j longPollUC) {
        return new wd3.b(getOtherSideInitialConfirmationUC, confirmOtherSideDataUC, rejectOtherSideDataUC, longPollUC);
    }

    public final ae3.b e(xx.a exifDataManager) {
        return new ae3.b(exifDataManager);
    }

    public final og3.a f() {
        return new og3.v();
    }

    public final xd3.b g() {
        return new xd3.b();
    }

    public final ae3.d h(ae3.e downloadImageUC, a14.a0 saveFilesOnDeviceUseCase, px.d remoteLogger) {
        return new ae3.d(downloadImageUC, saveFilesOnDeviceUseCase, remoteLogger);
    }

    public final ae3.e i(p04.a downloadFileFromCloudUC) {
        return new ae3.e(downloadFileFromCloudUC);
    }

    public final ae3.c j(p04.a downloadFileFromCloudUC, a14.a0 saveFilesOnDeviceUseCase, az.d fileConverter, px.d remoteLogger) {
        return new ae3.c(downloadFileFromCloudUC, saveFilesOnDeviceUseCase, fileConverter, remoteLogger);
    }

    public final zd3.a k(iy.a base64Coder, ay.j jsonSerializer, q10.a databaseRegistry, p10.f dbProvider, ay.h jsonFactory, px.d remoteLogger) {
        return new sd3.a(base64Coder, jsonSerializer, dbProvider, remoteLogger, databaseRegistry, jsonFactory);
    }

    public final ci3.f l(mx.c labelProvider) {
        return new ci3.f(labelProvider);
    }

    public final ee3.a m(wd3.c readyToSignManager) {
        return new ee3.b(readyToSignManager);
    }

    public final ae3.f n(aw0.m subscribeDescriptionUC, xd3.b descriptionMapper) {
        return new ae3.f(subscribeDescriptionUC, descriptionMapper);
    }

    public final ae3.h o(aw0.b beGetFirstPageUserCollisionsUC, zd3.a collisionStorageRepository, aw0.n beVerifyStatusStatementsUC, vd3.a vehicleCollisionContainersInteractor, ae3.a clearDraftNewCollisionDataUC) {
        return new ae3.h(beGetFirstPageUserCollisionsUC, collisionStorageRepository, beVerifyStatusStatementsUC, clearDraftNewCollisionDataUC, vehicleCollisionContainersInteractor);
    }

    public final ae3.i p(zd3.a collisionStorageRepository, vd3.a vehicleCollisionContainersInteractor) {
        return new ae3.i(collisionStorageRepository, vehicleCollisionContainersInteractor);
    }

    public final zd3.b q(uy.d gpsManager) {
        return new zd3.c(gpsManager);
    }

    public final be3.e r(wd3.a confirmationStatusesManager) {
        return new be3.f(confirmationStatusesManager);
    }

    public final be3.g s(wd3.a confirmationInitialInfoManager) {
        return new be3.h(confirmationInitialInfoManager);
    }

    public final ae3.j t() {
        return new ae3.k();
    }

    public final ae3.g u(zd3.b gpsCoordinateRepository) {
        return new ae3.g(gpsCoordinateRepository);
    }

    public final ae3.l v(aw0.h bePostReadyStatementUC, wz3.d getBase64SignedValueUseCase, wz3.e getChallengeUC) {
        return new ae3.l(bePostReadyStatementUC, getChallengeUC, getBase64SignedValueUseCase);
    }

    public final wd3.c w(aw0.f getSubscribeStatementDataUC, ae3.j longPollUC) {
        return new wd3.d(getSubscribeStatementDataUC, longPollUC);
    }

    public final ae3.m x(ae3.i getSavedCollisionDataUC, aw0.d getReadyToSignStatementDataUC, ae3.f getDescriptionUC) {
        return new ae3.m(getSavedCollisionDataUC, getReadyToSignStatementDataUC, getDescriptionUC);
    }

    public final ae3.n y(aw0.j bERegenerateStatementUC) {
        return new ae3.n(bERegenerateStatementUC);
    }

    public final ae3.q z(a14.y requestPermissionUseCase, mx.c labelProvider, a14.m goToApplicationDetailsSettingsUseCase) {
        return new ae3.q(requestPermissionUseCase, labelProvider, goToApplicationDetailsSettingsUseCase);
    }
}
