package xl0;

import al0.BankRestrictionPassport;
import al0.BankRestrictionPassportDocumentRestriction;
import al0.BankRestrictionsSettings;
import al0.BanksRestriction;
import al0.DocumentRestrictions;
import al0.MObywatelRestriction;
import al0.PhysicalIdCard;
import al0.PhysicalIdCardRestrictions;
import al0.q;
import dl0.BEBankRestrictionDrivingLicence;
import dl0.BEBankRestrictionDrivingLicenceResponseDrivingLicence;
import gm0.BankRestrictionDrivingLicenceResponse;
import gm0.BankRestrictionDrivingLicenceResponseDrivingLicenceDto;
import gm0.BankRestrictionPassportDocumentRestrictionDto;
import gm0.BankRestrictionPassportDto;
import gm0.BankRestrictionsSettingsDto;
import gm0.BanksRestrictionDto;
import gm0.DocumentRestrictionsDto;
import gm0.MObywatelRestrictionDto;
import gm0.PhysicalIdCardDto;
import gm0.PhysicalIdCardRestrictionsDto;
import gm0.o;
import gm0.x1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010\"\u001a\u00020!*\u00020 H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010*\u001a\u00020)*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0011\u0010.\u001a\u00020-*\u00020,¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"Lgm0/m6;", "Lal0/v0;", "j", "(Lgm0/m6;)Lal0/v0;", "Lgm0/y5;", "Lal0/u0;", "i", "(Lgm0/y5;)Lal0/u0;", "Lgm0/w1;", "Lal0/x;", "g", "(Lgm0/w1;)Lal0/x;", "Lgm0/q;", "Lal0/s;", "f", "(Lgm0/q;)Lal0/s;", "Lgm0/u2;", "Lal0/i0;", "h", "(Lgm0/u2;)Lal0/i0;", "Lgm0/p;", "Lal0/r;", "e", "(Lgm0/p;)Lal0/r;", "Lgm0/x1;", "Lal0/n;", "a", "(Lgm0/x1;)Lal0/n;", "Lgm0/n;", "Lal0/o;", "b", "(Lgm0/n;)Lal0/o;", "Lgm0/o;", "Lal0/q;", "d", "(Lgm0/o;)Lal0/q;", "Lgm0/m;", "Lal0/p;", "c", "(Lgm0/m;)Lal0/p;", "Lgm0/k;", "Ldl0/a;", "k", "(Lgm0/k;)Ldl0/a;", "Lgm0/l;", "Ldl0/b;", "l", "(Lgm0/l;)Ldl0/b;", "documentmanagementservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f219282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f219283b;

        static {
            int[] iArr = new int[x1.values().length];
            try {
                iArr[x1.PHYSICAL_ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x1.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x1.DRIVING_LICENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x1.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f219282a = iArr;
            int[] iArr2 = new int[o.values().length];
            try {
                iArr2[o.BIOMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[o.TEMPORARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[o.BUSINESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[o.DIPLOMATIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[o.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            f219283b = iArr2;
        }
    }

    private static final al0.n a(x1 x1Var) {
        int i15 = a.f219282a[x1Var.ordinal()];
        if (i15 == 1) {
            return al0.n.PHYSICAL_ID_CARD;
        }
        if (i15 == 2) {
            return al0.n.PASSPORT;
        }
        if (i15 == 3) {
            return al0.n.DRIVING_LICENCE;
        }
        if (i15 == 4) {
            return al0.n.UNKNOWN;
        }
        throw new p();
    }

    public static final BankRestrictionPassport b(BankRestrictionPassportDto bankRestrictionPassportDto) {
        String documentId = bankRestrictionPassportDto.getDocumentId();
        String number = bankRestrictionPassportDto.getNumber();
        o type = bankRestrictionPassportDto.getType();
        return new BankRestrictionPassport(documentId, number, type != null ? d(type) : null);
    }

    public static final BankRestrictionPassportDocumentRestriction c(BankRestrictionPassportDocumentRestrictionDto bankRestrictionPassportDocumentRestrictionDto) {
        String documentId = bankRestrictionPassportDocumentRestrictionDto.getDocumentId();
        String documentNumber = bankRestrictionPassportDocumentRestrictionDto.getDocumentNumber();
        DocumentRestrictionsDto restrictions = bankRestrictionPassportDocumentRestrictionDto.getRestrictions();
        return new BankRestrictionPassportDocumentRestriction(documentId, documentNumber, restrictions != null ? g(restrictions) : null);
    }

    private static final q d(o oVar) {
        int i15 = a.f219283b[oVar.ordinal()];
        if (i15 == 1) {
            return q.BIOMETRIC;
        }
        if (i15 == 2) {
            return q.TEMPORARY;
        }
        if (i15 == 3) {
            return q.BUSINESS;
        }
        if (i15 == 4) {
            return q.DIPLOMATIC;
        }
        if (i15 == 5) {
            return q.UNKNOWN;
        }
        throw new p();
    }

    public static final BankRestrictionsSettings e(BankRestrictionsSettingsDto bankRestrictionsSettingsDto) {
        boolean adult = bankRestrictionsSettingsDto.getAdult();
        List<x1> listB = bankRestrictionsSettingsDto.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(a((x1) it.next()));
        }
        return new BankRestrictionsSettings(adult, arrayList);
    }

    private static final BanksRestriction f(BanksRestrictionDto banksRestrictionDto) {
        return new BanksRestriction(banksRestrictionDto.getRestrictionsCount());
    }

    private static final DocumentRestrictions g(DocumentRestrictionsDto documentRestrictionsDto) {
        BanksRestrictionDto banksRestrictions = documentRestrictionsDto.getBanksRestrictions();
        BanksRestriction banksRestrictionF = banksRestrictions != null ? f(banksRestrictions) : null;
        MObywatelRestrictionDto mobywatelRestriction = documentRestrictionsDto.getMobywatelRestriction();
        return new DocumentRestrictions(banksRestrictionF, mobywatelRestriction != null ? h(mobywatelRestriction) : null);
    }

    private static final MObywatelRestriction h(MObywatelRestrictionDto mObywatelRestrictionDto) {
        return new MObywatelRestriction(mObywatelRestrictionDto.getRestrictedAt());
    }

    private static final PhysicalIdCard i(PhysicalIdCardDto physicalIdCardDto) {
        return new PhysicalIdCard(physicalIdCardDto.getNumber(), physicalIdCardDto.getSeries());
    }

    public static final PhysicalIdCardRestrictions j(PhysicalIdCardRestrictionsDto physicalIdCardRestrictionsDto) {
        PhysicalIdCardDto document = physicalIdCardRestrictionsDto.getDocument();
        PhysicalIdCard physicalIdCardI = document != null ? i(document) : null;
        String documentId = physicalIdCardRestrictionsDto.getDocumentId();
        DocumentRestrictionsDto restrictions = physicalIdCardRestrictionsDto.getRestrictions();
        return new PhysicalIdCardRestrictions(physicalIdCardI, documentId, restrictions != null ? g(restrictions) : null);
    }

    public static final BEBankRestrictionDrivingLicence k(BankRestrictionDrivingLicenceResponse bankRestrictionDrivingLicenceResponse) {
        BankRestrictionDrivingLicenceResponseDrivingLicenceDto drivingLicence = bankRestrictionDrivingLicenceResponse.getDrivingLicence();
        return new BEBankRestrictionDrivingLicence(drivingLicence != null ? l(drivingLicence) : null);
    }

    public static final BEBankRestrictionDrivingLicenceResponseDrivingLicence l(BankRestrictionDrivingLicenceResponseDrivingLicenceDto bankRestrictionDrivingLicenceResponseDrivingLicenceDto) {
        String documentId = bankRestrictionDrivingLicenceResponseDrivingLicenceDto.getDocumentId();
        String documentNumber = bankRestrictionDrivingLicenceResponseDrivingLicenceDto.getDocumentNumber();
        DocumentRestrictionsDto restrictions = bankRestrictionDrivingLicenceResponseDrivingLicenceDto.getRestrictions();
        return new BEBankRestrictionDrivingLicenceResponseDrivingLicence(documentId, documentNumber, restrictions != null ? g(restrictions) : null);
    }
}
