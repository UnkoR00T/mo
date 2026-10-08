package t34;

import iy.b0;
import iy.c0;
import java.time.LocalDate;
import jr0.NipipDataContainer;
import jr0.NipipScope;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.documents.data.model.NipipDataContainerDto;
import pl.gov.coi.mobywatel.technical.documents.data.model.NipipScopeDto;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/NipipScopeDto;", "Ljr0/j;", "e", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/NipipScopeDto;)Ljr0/j;", "Lpl/gov/coi/mobywatel/technical/documents/data/model/NipipDataContainerDto;", "Ljr0/i;", "d", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/NipipDataContainerDto;)Ljr0/i;", "Lpl/gov/coi/mobywatel/technical/documents/data/model/NipipDataContainerDto$PwzType;", "Ljr0/i$a;", "a", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/NipipDataContainerDto$PwzType;)Ljr0/i$a;", "Lpl/gov/coi/mobywatel/technical/documents/data/model/NipipDataContainerDto$Restriction;", "Ljr0/i$b;", "b", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/NipipDataContainerDto$Restriction;)Ljr0/i$b;", "Lpl/gov/coi/mobywatel/technical/documents/data/model/NipipDataContainerDto$RestrictionType;", "Ljr0/i$c;", "c", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/NipipDataContainerDto$RestrictionType;)Ljr0/i$c;", "documents_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f187590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f187591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f187592c;

        static {
            int[] iArr = new int[NipipDataContainerDto.PwzType.values().length];
            try {
                iArr[NipipDataContainerDto.PwzType.MIDWIFE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NipipDataContainerDto.PwzType.NURSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f187590a = iArr;
            int[] iArr2 = new int[NipipDataContainerDto.Restriction.values().length];
            try {
                iArr2[NipipDataContainerDto.Restriction.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[NipipDataContainerDto.Restriction.PARTIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f187591b = iArr2;
            int[] iArr3 = new int[NipipDataContainerDto.RestrictionType.values().length];
            try {
                iArr3[NipipDataContainerDto.RestrictionType.RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[NipipDataContainerDto.RestrictionType.INDIVIDUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[NipipDataContainerDto.RestrictionType.UNDER_SUPERVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[NipipDataContainerDto.RestrictionType.FIXED_TERM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f187592c = iArr3;
        }
    }

    public static final NipipDataContainer.a a(NipipDataContainerDto.PwzType pwzType) {
        int i15 = a.f187590a[pwzType.ordinal()];
        if (i15 != 1) {
            return i15 != 2 ? NipipDataContainer.a.UNKNOWN : NipipDataContainer.a.NURSE;
        }
        return NipipDataContainer.a.MIDWIFE;
    }

    public static final NipipDataContainer.b b(NipipDataContainerDto.Restriction restriction) {
        int i15 = a.f187591b[restriction.ordinal()];
        if (i15 != 1) {
            return i15 != 2 ? NipipDataContainer.b.UNKNOWN : NipipDataContainer.b.PARTIAL;
        }
        return NipipDataContainer.b.FULL;
    }

    public static final NipipDataContainer.c c(NipipDataContainerDto.RestrictionType restrictionType) {
        int i15 = a.f187592c[restrictionType.ordinal()];
        if (i15 == 1) {
            return NipipDataContainer.c.RANGE;
        }
        if (i15 == 2) {
            return NipipDataContainer.c.INDIVIDUAL;
        }
        if (i15 != 3) {
            return i15 != 4 ? NipipDataContainer.c.UNKNOWN : NipipDataContainer.c.FIXED_TERM;
        }
        return NipipDataContainer.c.UNDER_SUPERVISION;
    }

    public static final NipipDataContainer d(NipipDataContainerDto nipipDataContainerDto) {
        b0 b0VarG = c0.g(nipipDataContainerDto.getName());
        b0 b0VarG2 = c0.g(nipipDataContainerDto.getSurname());
        b0 b0VarG3 = c0.g(nipipDataContainerDto.getPesel());
        String professionalTitle = nipipDataContainerDto.getProfessionalTitle();
        String documentName = nipipDataContainerDto.getDocumentName();
        String documentNumber = nipipDataContainerDto.getDocumentNumber();
        String issuerName = nipipDataContainerDto.getIssuerName();
        LocalDate creationDate = nipipDataContainerDto.getCreationDate();
        NipipDataContainer.a aVarA = a(nipipDataContainerDto.getPwzType());
        NipipDataContainer.b bVarB = b(nipipDataContainerDto.getRestriction());
        String secondName = nipipDataContainerDto.getSecondName();
        b0 b0VarG4 = secondName != null ? c0.g(secondName) : null;
        NipipDataContainerDto.RestrictionType restrictionType = nipipDataContainerDto.getRestrictionType();
        return new NipipDataContainer(b0VarG, b0VarG2, b0VarG3, professionalTitle, documentName, documentNumber, issuerName, creationDate, aVarA, bVarB, b0VarG4, restrictionType != null ? c(restrictionType) : null);
    }

    public static final NipipScope e(NipipScopeDto nipipScopeDto) {
        return new NipipScope(d.d(nipipScopeDto.getDh()), d(nipipScopeDto.getDc()));
    }
}
