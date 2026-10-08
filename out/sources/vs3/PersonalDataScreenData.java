package vs3;

import er.l;
import fr.t;
import h30.ButtonData;
import mx.Label;
import n50.DefaultSingleCardData;
import n50.k;
import oq.i0;
import p071kotlin.Metadata;
import v50.c;

/* JADX INFO: renamed from: vs3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001:\u0001.B\u0099\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u000f2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b8\u00105R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u00103\u001a\u0004\b:\u00105R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u00103\u001a\u0004\b<\u00105R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u00103\u001a\u0004\b=\u00105R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b;\u00101R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010/\u001a\u0004\b6\u00101R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b2\u0010@R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b.\u0010CR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010/\u001a\u0004\bE\u00101R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010/\u001a\u0004\bG\u00101R\u0017\u0010\u0013\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bH\u0010?\u001a\u0004\bI\u0010@R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bJ\u0010B\u001a\u0004\bK\u0010CR\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bL\u0010?\u001a\u0004\b>\u0010@R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bM\u0010OR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b7\u0010P\u001a\u0004\b9\u0010QR\u0017\u0010\u001a\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bK\u0010P\u001a\u0004\bR\u0010QR#\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\bI\u0010S\u001a\u0004\bF\u0010TR#\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\bE\u0010S\u001a\u0004\bH\u0010TR#\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\b<\u0010S\u001a\u0004\bA\u0010TR#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bD\u0010TR#\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\bG\u0010S\u001a\u0004\bJ\u0010TR#\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\b=\u0010S\u001a\u0004\bL\u0010T¨\u0006U"}, d2 = {"Lvs3/a;", "", "Lmx/a;", "headline", "Lv50/c;", "emailTextInputData", "phoneTextInputData", "caregiverNameTextInputData", "caregiverSurnameTextInputData", "translatorNameTextInputData", "translatorSurnameTextInputData", "caregiverSubtitleLabel", "caregiverLabel", "Lh30/a;", "caregiverDeleteButtonData", "", "caregiverCardExpanded", "translatorLabel", "translatorSubtitleLabel", "translatorDeleteButtonData", "translatorCardExpanded", "nextButtonData", "Lvs3/a$a;", "peselSegmentData", "Ln50/g;", "caregiverSingleCardData", "translatorSingleCardData", "Lkotlin/Function1;", "Loq/i0;", "onEmailFocusChange", "onPhoneNumberFocusChange", "onCaregiverNameFocusChange", "onCaregiverSurnameFocusChange", "onTranslatorNameFocusChange", "onTranslatorSurnameFocusChange", "<init>", "(Lmx/a;Lv50/c;Lv50/c;Lv50/c;Lv50/c;Lv50/c;Lv50/c;Lmx/a;Lmx/a;Lh30/a;ZLmx/a;Lmx/a;Lh30/a;ZLh30/a;Lvs3/a$a;Ln50/g;Ln50/g;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "i", "()Lmx/a;", "b", "Lv50/c;", "h", "()Lv50/c;", "c", "r", "d", "e", "g", "f", "v", "y", "j", "Lh30/a;", "()Lh30/a;", "k", "Z", "()Z", "l", "u", "m", "x", "n", "t", "o", "s", "p", "q", "Lvs3/a$a;", "()Lvs3/a$a;", "Ln50/g;", "()Ln50/g;", "w", "Ler/l;", "()Ler/l;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalDataScreenData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label headline;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final c emailTextInputData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final c phoneTextInputData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final c caregiverNameTextInputData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final c caregiverSurnameTextInputData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final c translatorNameTextInputData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final c translatorSurnameTextInputData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label caregiverSubtitleLabel;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label caregiverLabel;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonData caregiverDeleteButtonData;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean caregiverCardExpanded;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label translatorLabel;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label translatorSubtitleLabel;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonData translatorDeleteButtonData;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean translatorCardExpanded;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonData nextButtonData;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final PeselSegmentData peselSegmentData;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final DefaultSingleCardData caregiverSingleCardData;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final DefaultSingleCardData translatorSingleCardData;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final l<Boolean, i0> onEmailFocusChange;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final l<Boolean, i0> onPhoneNumberFocusChange;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final l<Boolean, i0> onCaregiverNameFocusChange;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final l<Boolean, i0> onCaregiverSurnameFocusChange;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final l<Boolean, i0> onTranslatorNameFocusChange;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final l<Boolean, i0> onTranslatorSurnameFocusChange;

    /* JADX INFO: renamed from: vs3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lvs3/a$a;", "", "Lmx/a;", "title", "Ln50/k;", "singleCardData", "<init>", "(Lmx/a;Ln50/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Ln50/k;", "()Ln50/k;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PeselSegmentData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final k singleCardData;

        public PeselSegmentData(Label label, k kVar) {
            this.title = label;
            this.singleCardData = kVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final k getSingleCardData() {
            return this.singleCardData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PeselSegmentData)) {
                return false;
            }
            PeselSegmentData peselSegmentData = (PeselSegmentData) other;
            return t.c(this.title, peselSegmentData.title) && t.c(this.singleCardData, peselSegmentData.singleCardData);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.singleCardData.hashCode();
        }

        public String toString() {
            return "PeselSegmentData(title=" + this.title + ", singleCardData=" + this.singleCardData + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PersonalDataScreenData(Label label, c cVar, c cVar2, c cVar3, c cVar4, c cVar5, c cVar6, Label label2, Label label3, ButtonData buttonData, boolean z15, Label label4, Label label5, ButtonData buttonData2, boolean z16, ButtonData buttonData3, PeselSegmentData peselSegmentData, DefaultSingleCardData defaultSingleCardData, DefaultSingleCardData defaultSingleCardData2, l<? super Boolean, i0> lVar, l<? super Boolean, i0> lVar2, l<? super Boolean, i0> lVar3, l<? super Boolean, i0> lVar4, l<? super Boolean, i0> lVar5, l<? super Boolean, i0> lVar6) {
        this.headline = label;
        this.emailTextInputData = cVar;
        this.phoneTextInputData = cVar2;
        this.caregiverNameTextInputData = cVar3;
        this.caregiverSurnameTextInputData = cVar4;
        this.translatorNameTextInputData = cVar5;
        this.translatorSurnameTextInputData = cVar6;
        this.caregiverSubtitleLabel = label2;
        this.caregiverLabel = label3;
        this.caregiverDeleteButtonData = buttonData;
        this.caregiverCardExpanded = z15;
        this.translatorLabel = label4;
        this.translatorSubtitleLabel = label5;
        this.translatorDeleteButtonData = buttonData2;
        this.translatorCardExpanded = z16;
        this.nextButtonData = buttonData3;
        this.peselSegmentData = peselSegmentData;
        this.caregiverSingleCardData = defaultSingleCardData;
        this.translatorSingleCardData = defaultSingleCardData2;
        this.onEmailFocusChange = lVar;
        this.onPhoneNumberFocusChange = lVar2;
        this.onCaregiverNameFocusChange = lVar3;
        this.onCaregiverSurnameFocusChange = lVar4;
        this.onTranslatorNameFocusChange = lVar5;
        this.onTranslatorSurnameFocusChange = lVar6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCaregiverCardExpanded() {
        return this.caregiverCardExpanded;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ButtonData getCaregiverDeleteButtonData() {
        return this.caregiverDeleteButtonData;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getCaregiverLabel() {
        return this.caregiverLabel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getCaregiverNameTextInputData() {
        return this.caregiverNameTextInputData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final DefaultSingleCardData getCaregiverSingleCardData() {
        return this.caregiverSingleCardData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalDataScreenData)) {
            return false;
        }
        PersonalDataScreenData personalDataScreenData = (PersonalDataScreenData) other;
        return t.c(this.headline, personalDataScreenData.headline) && t.c(this.emailTextInputData, personalDataScreenData.emailTextInputData) && t.c(this.phoneTextInputData, personalDataScreenData.phoneTextInputData) && t.c(this.caregiverNameTextInputData, personalDataScreenData.caregiverNameTextInputData) && t.c(this.caregiverSurnameTextInputData, personalDataScreenData.caregiverSurnameTextInputData) && t.c(this.translatorNameTextInputData, personalDataScreenData.translatorNameTextInputData) && t.c(this.translatorSurnameTextInputData, personalDataScreenData.translatorSurnameTextInputData) && t.c(this.caregiverSubtitleLabel, personalDataScreenData.caregiverSubtitleLabel) && t.c(this.caregiverLabel, personalDataScreenData.caregiverLabel) && t.c(this.caregiverDeleteButtonData, personalDataScreenData.caregiverDeleteButtonData) && this.caregiverCardExpanded == personalDataScreenData.caregiverCardExpanded && t.c(this.translatorLabel, personalDataScreenData.translatorLabel) && t.c(this.translatorSubtitleLabel, personalDataScreenData.translatorSubtitleLabel) && t.c(this.translatorDeleteButtonData, personalDataScreenData.translatorDeleteButtonData) && this.translatorCardExpanded == personalDataScreenData.translatorCardExpanded && t.c(this.nextButtonData, personalDataScreenData.nextButtonData) && t.c(this.peselSegmentData, personalDataScreenData.peselSegmentData) && t.c(this.caregiverSingleCardData, personalDataScreenData.caregiverSingleCardData) && t.c(this.translatorSingleCardData, personalDataScreenData.translatorSingleCardData) && t.c(this.onEmailFocusChange, personalDataScreenData.onEmailFocusChange) && t.c(this.onPhoneNumberFocusChange, personalDataScreenData.onPhoneNumberFocusChange) && t.c(this.onCaregiverNameFocusChange, personalDataScreenData.onCaregiverNameFocusChange) && t.c(this.onCaregiverSurnameFocusChange, personalDataScreenData.onCaregiverSurnameFocusChange) && t.c(this.onTranslatorNameFocusChange, personalDataScreenData.onTranslatorNameFocusChange) && t.c(this.onTranslatorSurnameFocusChange, personalDataScreenData.onTranslatorSurnameFocusChange);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Label getCaregiverSubtitleLabel() {
        return this.caregiverSubtitleLabel;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final c getCaregiverSurnameTextInputData() {
        return this.caregiverSurnameTextInputData;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final c getEmailTextInputData() {
        return this.emailTextInputData;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((this.headline.hashCode() * 31) + this.emailTextInputData.hashCode()) * 31) + this.phoneTextInputData.hashCode()) * 31) + this.caregiverNameTextInputData.hashCode()) * 31) + this.caregiverSurnameTextInputData.hashCode()) * 31) + this.translatorNameTextInputData.hashCode()) * 31) + this.translatorSurnameTextInputData.hashCode()) * 31) + this.caregiverSubtitleLabel.hashCode()) * 31) + this.caregiverLabel.hashCode()) * 31) + this.caregiverDeleteButtonData.hashCode()) * 31) + Boolean.hashCode(this.caregiverCardExpanded)) * 31) + this.translatorLabel.hashCode()) * 31) + this.translatorSubtitleLabel.hashCode()) * 31) + this.translatorDeleteButtonData.hashCode()) * 31) + Boolean.hashCode(this.translatorCardExpanded)) * 31) + this.nextButtonData.hashCode()) * 31;
        PeselSegmentData peselSegmentData = this.peselSegmentData;
        return ((((((((((((((((iHashCode + (peselSegmentData == null ? 0 : peselSegmentData.hashCode())) * 31) + this.caregiverSingleCardData.hashCode()) * 31) + this.translatorSingleCardData.hashCode()) * 31) + this.onEmailFocusChange.hashCode()) * 31) + this.onPhoneNumberFocusChange.hashCode()) * 31) + this.onCaregiverNameFocusChange.hashCode()) * 31) + this.onCaregiverSurnameFocusChange.hashCode()) * 31) + this.onTranslatorNameFocusChange.hashCode()) * 31) + this.onTranslatorSurnameFocusChange.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Label getHeadline() {
        return this.headline;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final ButtonData getNextButtonData() {
        return this.nextButtonData;
    }

    public final l<Boolean, i0> k() {
        return this.onCaregiverNameFocusChange;
    }

    public final l<Boolean, i0> l() {
        return this.onCaregiverSurnameFocusChange;
    }

    public final l<Boolean, i0> m() {
        return this.onEmailFocusChange;
    }

    public final l<Boolean, i0> n() {
        return this.onPhoneNumberFocusChange;
    }

    public final l<Boolean, i0> o() {
        return this.onTranslatorNameFocusChange;
    }

    public final l<Boolean, i0> p() {
        return this.onTranslatorSurnameFocusChange;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final PeselSegmentData getPeselSegmentData() {
        return this.peselSegmentData;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final c getPhoneTextInputData() {
        return this.phoneTextInputData;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getTranslatorCardExpanded() {
        return this.translatorCardExpanded;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final ButtonData getTranslatorDeleteButtonData() {
        return this.translatorDeleteButtonData;
    }

    public String toString() {
        return "PersonalDataScreenData(headline=" + this.headline + ", emailTextInputData=" + this.emailTextInputData + ", phoneTextInputData=" + this.phoneTextInputData + ", caregiverNameTextInputData=" + this.caregiverNameTextInputData + ", caregiverSurnameTextInputData=" + this.caregiverSurnameTextInputData + ", translatorNameTextInputData=" + this.translatorNameTextInputData + ", translatorSurnameTextInputData=" + this.translatorSurnameTextInputData + ", caregiverSubtitleLabel=" + this.caregiverSubtitleLabel + ", caregiverLabel=" + this.caregiverLabel + ", caregiverDeleteButtonData=" + this.caregiverDeleteButtonData + ", caregiverCardExpanded=" + this.caregiverCardExpanded + ", translatorLabel=" + this.translatorLabel + ", translatorSubtitleLabel=" + this.translatorSubtitleLabel + ", translatorDeleteButtonData=" + this.translatorDeleteButtonData + ", translatorCardExpanded=" + this.translatorCardExpanded + ", nextButtonData=" + this.nextButtonData + ", peselSegmentData=" + this.peselSegmentData + ", caregiverSingleCardData=" + this.caregiverSingleCardData + ", translatorSingleCardData=" + this.translatorSingleCardData + ", onEmailFocusChange=" + this.onEmailFocusChange + ", onPhoneNumberFocusChange=" + this.onPhoneNumberFocusChange + ", onCaregiverNameFocusChange=" + this.onCaregiverNameFocusChange + ", onCaregiverSurnameFocusChange=" + this.onCaregiverSurnameFocusChange + ", onTranslatorNameFocusChange=" + this.onTranslatorNameFocusChange + ", onTranslatorSurnameFocusChange=" + this.onTranslatorSurnameFocusChange + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Label getTranslatorLabel() {
        return this.translatorLabel;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final c getTranslatorNameTextInputData() {
        return this.translatorNameTextInputData;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final DefaultSingleCardData getTranslatorSingleCardData() {
        return this.translatorSingleCardData;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final Label getTranslatorSubtitleLabel() {
        return this.translatorSubtitleLabel;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final c getTranslatorSurnameTextInputData() {
        return this.translatorSurnameTextInputData;
    }
}
