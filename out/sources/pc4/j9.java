package pc4;

import hd3.DataHeaderStandard;
import hd3.Document;
import hd3.RailwayCardData;
import hd3.RailwayCardScope;
import hd3.UserDocumentData;
import i24.RailwayCardContainerData;
import k34.RailwayCardDataModel;
import k34.RailwayCardDocumentData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\u0003*\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u0003*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0013\u001a\u00020\u0005*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\t*\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Li24/k0;", "Lhd3/h;", "userData", "Lhd3/c;", "documentStatus", "Lhd3/e;", "g", "(Li24/k0;Lhd3/h;Lhd3/c;)Lhd3/e;", "Li24/j0$a;", "Lhd3/d$a;", "f", "(Li24/j0$a;)Lhd3/d$a;", "Ler0/h;", "i", "(Ler0/h;)Lhd3/c;", "Lf24/h;", "j", "(Lf24/h;)Lhd3/c;", "Lk34/z;", "h", "(Lk34/z;Lhd3/h;Lhd3/c;)Lhd3/e;", "Lk34/y$a;", "e", "(Lk34/y$a;)Lhd3/d$a;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j9 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f155071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f155072c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f155073d;

        static {
            int[] iArr = new int[RailwayCardContainerData.a.values().length];
            try {
                iArr[RailwayCardContainerData.a.WORKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RailwayCardContainerData.a.PENSIONER_I_PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RailwayCardContainerData.a.PENSIONER_II_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RailwayCardContainerData.a.ANNUITY_I_PACKAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RailwayCardContainerData.a.ANNUITY_II_PACKAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RailwayCardContainerData.a.CHILD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RailwayCardContainerData.a.SPOUSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[RailwayCardContainerData.a.SCHOLAR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[RailwayCardContainerData.a.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f155070a = iArr;
            int[] iArr2 = new int[er0.h.values().length];
            try {
                iArr2[er0.h.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[er0.h.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[er0.h.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[er0.h.REVOKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[er0.h.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            f155071b = iArr2;
            int[] iArr3 = new int[f24.h.values().length];
            try {
                iArr3[f24.h.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[f24.h.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[f24.h.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[f24.h.REVOKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            f155072c = iArr3;
            int[] iArr4 = new int[RailwayCardDataModel.a.values().length];
            try {
                iArr4[RailwayCardDataModel.a.WORKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[RailwayCardDataModel.a.PENSIONER_I_PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[RailwayCardDataModel.a.PENSIONER_II_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[RailwayCardDataModel.a.ANNUITY_I_PACKAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[RailwayCardDataModel.a.ANNUITY_II_PACKAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[RailwayCardDataModel.a.CHILD.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[RailwayCardDataModel.a.SPOUSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[RailwayCardDataModel.a.SCHOLAR.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr4[RailwayCardDataModel.a.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
            f155073d = iArr4;
        }
    }

    private static final hd3.RailwayCardContainerData.a e(RailwayCardDataModel.a aVar) {
        switch (a.f155073d[aVar.ordinal()]) {
            case 1:
                return hd3.RailwayCardContainerData.a.WORKER;
            case 2:
                return hd3.RailwayCardContainerData.a.PENSIONER_I_PACKAGE;
            case 3:
                return hd3.RailwayCardContainerData.a.PENSIONER_II_PACKAGE;
            case 4:
                return hd3.RailwayCardContainerData.a.ANNUITY_I_PACKAGE;
            case 5:
                return hd3.RailwayCardContainerData.a.ANNUITY_II_PACKAGE;
            case 6:
                return hd3.RailwayCardContainerData.a.CHILD;
            case 7:
                return hd3.RailwayCardContainerData.a.SPOUSE;
            case 8:
                return hd3.RailwayCardContainerData.a.SCHOLAR;
            case 9:
                return hd3.RailwayCardContainerData.a.UNKNOWN;
            default:
                throw new oq.p();
        }
    }

    private static final hd3.RailwayCardContainerData.a f(RailwayCardContainerData.a aVar) {
        switch (a.f155070a[aVar.ordinal()]) {
            case 1:
                return hd3.RailwayCardContainerData.a.WORKER;
            case 2:
                return hd3.RailwayCardContainerData.a.PENSIONER_I_PACKAGE;
            case 3:
                return hd3.RailwayCardContainerData.a.PENSIONER_II_PACKAGE;
            case 4:
                return hd3.RailwayCardContainerData.a.ANNUITY_I_PACKAGE;
            case 5:
                return hd3.RailwayCardContainerData.a.ANNUITY_II_PACKAGE;
            case 6:
                return hd3.RailwayCardContainerData.a.CHILD;
            case 7:
                return hd3.RailwayCardContainerData.a.SPOUSE;
            case 8:
                return hd3.RailwayCardContainerData.a.SCHOLAR;
            case 9:
                return hd3.RailwayCardContainerData.a.UNKNOWN;
            default:
                throw new oq.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RailwayCardData g(i24.RailwayCardData railwayCardData, UserDocumentData userDocumentData, hd3.c cVar) {
        return new RailwayCardData(new Document(railwayCardData.getDocument().getDocumentId(), railwayCardData.getDocument().getParentCertificateId(), cVar, railwayCardData.getDocument().getExpirationDate(), railwayCardData.getDocument().getLastUpdateTimestamp()), new RailwayCardScope(new DataHeaderStandard(railwayCardData.getScope().getDataHeader().getDn(), railwayCardData.getScope().getDataHeader().getSn(), railwayCardData.getScope().getDataHeader().getIsr(), railwayCardData.getScope().getDataHeader().getTs(), railwayCardData.getScope().getDataHeader().getRId(), railwayCardData.getScope().getDataHeader().getTp(), railwayCardData.getScope().getDataHeader().getStp(), railwayCardData.getScope().getDataHeader().getVer(), railwayCardData.getScope().getDataHeader().getIid(), railwayCardData.getScope().getDataHeader().getPesel(), railwayCardData.getScope().getDataHeader().getIn(), railwayCardData.getScope().getDataHeader().getId()), new hd3.RailwayCardContainerData(railwayCardData.getScope().getData().getCardRelation(), railwayCardData.getScope().getData().getHolderType(), railwayCardData.getScope().getData().getBatch(), railwayCardData.getScope().getData().getNumber(), railwayCardData.getScope().getData().getFirstName(), railwayCardData.getScope().getData().getSecondName(), railwayCardData.getScope().getData().getLastName(), railwayCardData.getScope().getData().getPesel(), railwayCardData.getScope().getData().getEmployer(), f(railwayCardData.getScope().getData().getOuCategory()), railwayCardData.getScope().getData().getTrainClass(), railwayCardData.getScope().getData().getAnnotation(), railwayCardData.getScope().getData().getConcession(), railwayCardData.getScope().getData().getStatus(), railwayCardData.getScope().getData().getEmployerCode(), railwayCardData.getScope().getData().getValidFrom(), railwayCardData.getScope().getData().getExpiryDate(), railwayCardData.getScope().getData().getQrCode())), cVar, fr.t.c(railwayCardData.getScope().getData().getPesel(), userDocumentData.getPesel()) ? userDocumentData.getPhoto() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RailwayCardData h(RailwayCardDocumentData railwayCardDocumentData, UserDocumentData userDocumentData, hd3.c cVar) {
        return new RailwayCardData(null, new RailwayCardScope(new DataHeaderStandard(railwayCardDocumentData.getDataHeader().getDn(), railwayCardDocumentData.getDataHeader().getSn(), railwayCardDocumentData.getDataHeader().getIsr(), railwayCardDocumentData.getDataHeader().getTs(), railwayCardDocumentData.getDataHeader().getRId(), railwayCardDocumentData.getDataHeader().getTp(), railwayCardDocumentData.getDataHeader().getStp(), railwayCardDocumentData.getDataHeader().getVer(), railwayCardDocumentData.getDataHeader().getIid(), railwayCardDocumentData.getDataHeader().getPesel(), railwayCardDocumentData.getDataHeader().getIn(), railwayCardDocumentData.getDataHeader().getId()), new hd3.RailwayCardContainerData(railwayCardDocumentData.getDataContainer().getCardRelation(), railwayCardDocumentData.getDataContainer().getHolderType(), railwayCardDocumentData.getDataContainer().getBatch(), railwayCardDocumentData.getDataContainer().getNumber(), railwayCardDocumentData.getDataContainer().getFirstName(), railwayCardDocumentData.getDataContainer().getSecondName(), railwayCardDocumentData.getDataContainer().getLastName(), railwayCardDocumentData.getDataContainer().getPesel(), railwayCardDocumentData.getDataContainer().getEmployer(), e(railwayCardDocumentData.getDataContainer().getOuCategory()), railwayCardDocumentData.getDataContainer().getTrainClass(), railwayCardDocumentData.getDataContainer().getAnnotation(), railwayCardDocumentData.getDataContainer().getConcession(), railwayCardDocumentData.getDataContainer().getStatus(), railwayCardDocumentData.getDataContainer().getEmployerCode(), railwayCardDocumentData.getDataContainer().getValidFrom(), railwayCardDocumentData.getDataContainer().getExpiryDate(), railwayCardDocumentData.getDataContainer().getQrCode())), cVar, fr.t.c(railwayCardDocumentData.getDataContainer().getPesel(), userDocumentData.getPesel()) ? userDocumentData.getPhoto() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hd3.c i(er0.h hVar) {
        int i15 = a.f155071b[hVar.ordinal()];
        if (i15 == 1) {
            return hd3.c.ACTIVE;
        }
        if (i15 == 2) {
            return hd3.c.INACTIVE;
        }
        if (i15 == 3) {
            return hd3.c.EXPIRED;
        }
        if (i15 == 4) {
            return hd3.c.REVOKED;
        }
        if (i15 == 5) {
            return hd3.c.ACTIVE;
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hd3.c j(f24.h hVar) {
        int i15 = a.f155072c[hVar.ordinal()];
        if (i15 == 1) {
            return hd3.c.ACTIVE;
        }
        if (i15 == 2) {
            return hd3.c.INACTIVE;
        }
        if (i15 == 3) {
            return hd3.c.EXPIRED;
        }
        if (i15 == 4) {
            return hd3.c.REVOKED;
        }
        throw new oq.p();
    }
}
