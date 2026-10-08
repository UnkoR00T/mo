package xl0;

import el0.PhysicalIdCardApplicationStatusResponse;
import gm0.w5;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgm0/x5;", "Lel0/b;", "b", "(Lgm0/x5;)Lel0/b;", "Lgm0/w5;", "Lel0/a;", "a", "(Lgm0/w5;)Lel0/a;", "documentmanagementservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f219295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f219296b;

        static {
            int[] iArr = new int[w5.values().length];
            try {
                iArr[w5.APPLICATION_PROCESSED_AT_OFFICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w5.APPLICATION_PROCESSED_TO_COMPLETE_AT_OFFICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w5.ID_CARD_IN_PRODUCTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[w5.APPLICATION_SUSPENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[w5.APPLICATION_REJECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[w5.ID_CARD_FOR_COLLECTION_WITHOUT_PUK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[w5.ID_CARD_FOR_COLLECTION_WITH_PUK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[w5.ID_CARD_COLLECTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[w5.ID_CARD_COLLECTED_WAIT_FOR_PUK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[w5.ID_CARD_COLLECTED_GET_PUK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[w5.ID_CARD_CANNOT_BE_ISSUED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[w5.APPLICATION_NOT_FOUND.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[w5.UNKNOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f219295a = iArr;
            int[] iArr2 = new int[el0.a.values().length];
            try {
                iArr2[el0.a.APPLICATION_PROCESSED_AT_OFFICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[el0.a.APPLICATION_PROCESSED_TO_COMPLETE_AT_OFFICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[el0.a.ID_CARD_IN_PRODUCTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[el0.a.APPLICATION_SUSPENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[el0.a.APPLICATION_REJECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[el0.a.ID_CARD_FOR_COLLECTION_WITHOUT_PUK.ordinal()] = 6;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[el0.a.ID_CARD_FOR_COLLECTION_WITH_PUK.ordinal()] = 7;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[el0.a.ID_CARD_COLLECTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[el0.a.ID_CARD_COLLECTED_WAIT_FOR_PUK.ordinal()] = 9;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[el0.a.ID_CARD_COLLECTED_GET_PUK.ordinal()] = 10;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[el0.a.ID_CARD_CANNOT_BE_ISSUED.ordinal()] = 11;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[el0.a.APPLICATION_NOT_FOUND.ordinal()] = 12;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[el0.a.UNKNOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused26) {
            }
            f219296b = iArr2;
        }
    }

    public static final el0.a a(w5 w5Var) {
        switch (a.f219295a[w5Var.ordinal()]) {
            case 1:
                return el0.a.APPLICATION_PROCESSED_AT_OFFICE;
            case 2:
                return el0.a.APPLICATION_PROCESSED_TO_COMPLETE_AT_OFFICE;
            case 3:
                return el0.a.ID_CARD_IN_PRODUCTION;
            case 4:
                return el0.a.APPLICATION_SUSPENDED;
            case 5:
                return el0.a.APPLICATION_REJECTED;
            case 6:
                return el0.a.ID_CARD_FOR_COLLECTION_WITHOUT_PUK;
            case 7:
                return el0.a.ID_CARD_FOR_COLLECTION_WITH_PUK;
            case 8:
                return el0.a.ID_CARD_COLLECTED;
            case 9:
                return el0.a.ID_CARD_COLLECTED_WAIT_FOR_PUK;
            case 10:
                return el0.a.ID_CARD_COLLECTED_GET_PUK;
            case 11:
                return el0.a.ID_CARD_CANNOT_BE_ISSUED;
            case 12:
                return el0.a.APPLICATION_NOT_FOUND;
            case 13:
                return el0.a.UNKNOWN;
            default:
                throw new p();
        }
    }

    public static final PhysicalIdCardApplicationStatusResponse b(gm0.PhysicalIdCardApplicationStatusResponse physicalIdCardApplicationStatusResponse) {
        w5 status = physicalIdCardApplicationStatusResponse.getStatus();
        return new PhysicalIdCardApplicationStatusResponse(status != null ? a(status) : null);
    }
}
