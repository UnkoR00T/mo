package fm0;

import gm0.ApplicationPassportStatusResponseDto;
import gm0.d;
import kl0.BEApplicationPassportStatusResponse;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgm0/e;", "Lkl0/b;", "b", "(Lgm0/e;)Lkl0/b;", "Lgm0/d;", "Lkl0/a;", "a", "(Lgm0/d;)Lkl0/a;", "documentmanagementservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: fm0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C1449a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65367a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.APPLICATION_IN_REVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.APPLICATION_CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.APPLICATION_REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.PASSPORT_IN_PRODUCTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.PASSPORT_READY_TO_DISPATCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d.PASSPORT_DISPATCHED_BY_COURIER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d.PASSPORT_READY_FOR_PICKUP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[d.APPLICATION_NOT_FOUND_OR_COMPLETED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[d.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f65367a = iArr;
        }
    }

    public static final kl0.a a(d dVar) {
        switch (C1449a.f65367a[dVar.ordinal()]) {
            case 1:
                return kl0.a.APPLICATION_IN_REVIEW;
            case 2:
                return kl0.a.APPLICATION_CANCELLED;
            case 3:
                return kl0.a.APPLICATION_REJECTED;
            case 4:
                return kl0.a.PASSPORT_IN_PRODUCTION;
            case 5:
                return kl0.a.PASSPORT_READY_TO_DISPATCH;
            case 6:
                return kl0.a.PASSPORT_DISPATCHED_BY_COURIER;
            case 7:
                return kl0.a.PASSPORT_READY_FOR_PICKUP;
            case 8:
                return kl0.a.APPLICATION_NOT_FOUND_OR_COMPLETED;
            case 9:
                return kl0.a.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final BEApplicationPassportStatusResponse b(ApplicationPassportStatusResponseDto applicationPassportStatusResponseDto) {
        d status = applicationPassportStatusResponseDto.getStatus();
        return new BEApplicationPassportStatusResponse(status != null ? a(status) : null);
    }
}
