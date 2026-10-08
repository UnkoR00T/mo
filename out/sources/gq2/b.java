package gq2;

import al0.s0;
import al0.z;
import eq2.YourDataValidatedData;
import er.l;
import fq2.d;
import fq2.e;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.k;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import r30.CheckBoxRowData;
import w30.CheckBoxSingleData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;
import xw.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002)+B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00122\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lgq2/b;", "Lxw/f;", "Lgq2/b$a;", "Lfq2/e$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lfq2/d$b;", "state", "params", "Lfq2/e$a$c;", "i", "(Lfq2/d$b;Lgq2/b$a;)Lfq2/e$a$c;", "Lal0/s0;", "passportType", "", "Ln50/g;", "m", "(Lal0/s0;)Ljava/util/List;", "Leq2/c;", "parentData", "Ln50/k;", "q", "(Leq2/c;)Ljava/util/List;", "Leq2/a;", "childDataResult", "f", "(Leq2/a;)Ljava/util/List;", "", "guardianAttachmentsNames", "privilegeAttachmentsNames", "e", "(Ljava/util/List;Ljava/util/List;Lal0/s0;)Ljava/util/List;", "", "h", "(Lal0/s0;)Ljava/lang/Integer;", "r", "(Lgq2/b$a;)Lfq2/e$a;", "a", "Lmx/c;", "b", "Lez/e;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: gq2.b$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b \u0010\u001fR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b\"\u0010\u001fR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b!\u0010\u001f¨\u0006&"}, d2 = {"Lgq2/b$a;", "", "Lfq2/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "onCloseAction", "onCloseWithoutDialogAction", "Lkotlin/Function1;", "", "setStatementStateValueAction", "onSendAction", "onScrolledToStatementCheckbox", "<init>", "(Lfq2/d;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lfq2/d;", "g", "()Lfq2/d;", "b", "Ler/a;", "()Ler/a;", "c", "d", "e", "Ler/l;", "f", "()Ler/l;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseWithoutDialogAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> setStatementStateValueAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSendAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToStatementCheckbox;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(d dVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super Boolean, i0> lVar, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = dVar;
            this.onBackAction = aVar;
            this.onCloseAction = aVar2;
            this.onCloseWithoutDialogAction = aVar3;
            this.setStatementStateValueAction = lVar;
            this.onSendAction = aVar4;
            this.onScrolledToStatementCheckbox = aVar5;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final er.a<i0> b() {
            return this.onCloseAction;
        }

        public final er.a<i0> c() {
            return this.onCloseWithoutDialogAction;
        }

        public final er.a<i0> d() {
            return this.onScrolledToStatementCheckbox;
        }

        public final er.a<i0> e() {
            return this.onSendAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onCloseAction, params.onCloseAction) && t.c(this.onCloseWithoutDialogAction, params.onCloseWithoutDialogAction) && t.c(this.setStatementStateValueAction, params.setStatementStateValueAction) && t.c(this.onSendAction, params.onSendAction) && t.c(this.onScrolledToStatementCheckbox, params.onScrolledToStatementCheckbox);
        }

        public final l<Boolean, i0> f() {
            return this.setStatementStateValueAction;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final d getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.onCloseAction.hashCode()) * 31) + this.onCloseWithoutDialogAction.hashCode()) * 31) + this.setStatementStateValueAction.hashCode()) * 31) + this.onSendAction.hashCode()) * 31) + this.onScrolledToStatementCheckbox.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", onCloseAction=" + this.onCloseAction + ", onCloseWithoutDialogAction=" + this.onCloseWithoutDialogAction + ", setStatementStateValueAction=" + this.setStatementStateValueAction + ", onSendAction=" + this.onSendAction + ", onScrolledToStatementCheckbox=" + this.onScrolledToStatementCheckbox + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f76243b;

        static {
            int[] iArr = new int[z.values().length];
            try {
                iArr[z.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[z.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f76242a = iArr;
            int[] iArr2 = new int[s0.values().length];
            try {
                iArr2[s0.BIOMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[s0.TEMPORARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[s0.BUSINESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[s0.DIPLOMATIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[s0.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f76243b = iArr2;
        }
    }

    public b(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final List<DefaultSingleCardData> e(List<String> guardianAttachmentsNames, List<String> privilegeAttachmentsNames, s0 passportType) {
        PassportAgreementCards passportAgreementCards;
        Integer numH;
        PassportAgreementCards passportAgreementCards2 = null;
        if (privilegeAttachmentsNames == null || (numH = h(passportType)) == null) {
            passportAgreementCards = null;
        } else {
            passportAgreementCards = new PassportAgreementCards("passportEligibilityProofCard", this.labelProvider.c(numH.intValue()), privilegeAttachmentsNames.isEmpty() ? "-" : v.v0(privilegeAttachmentsNames, "\n", null, null, 0, null, null, 62, null), null, 8, null);
        }
        if (guardianAttachmentsNames != null) {
            passportAgreementCards2 = new PassportAgreementCards("guardianCertificateCard", this.labelProvider.c(bp2.a.I0), guardianAttachmentsNames.isEmpty() ? "-" : v.v0(guardianAttachmentsNames, "\n", null, null, 0, null, null, 62, null), null, 8, null);
        }
        List listS = v.s(passportAgreementCards, passportAgreementCards2);
        ArrayList arrayList = new ArrayList(v.y(listS, 10));
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            arrayList.add(((PassportAgreementCards) it.next()).a());
        }
        return arrayList;
    }

    private final List<DefaultSingleCardData> f(eq2.a childDataResult) {
        PassportAgreementCards passportAgreementCards;
        PassportAgreementCards passportAgreementCards2;
        PassportAgreementCards passportAgreementCards3;
        PassportAgreementCards passportAgreementCards4;
        b0 firstName = childDataResult.getFirstName();
        PassportAgreementCards passportAgreementCards5 = null;
        if (firstName != null) {
            passportAgreementCards = new PassportAgreementCards("childFirstNameCard", this.labelProvider.c(bp2.a.f21088q), c0.e(firstName), null, 8, null);
        } else {
            passportAgreementCards = null;
        }
        b0 secondName = childDataResult.getSecondName();
        if (secondName != null) {
            passportAgreementCards2 = new PassportAgreementCards("childSecondNameCard", this.labelProvider.c(bp2.a.B), c0.e(secondName), null, 8, null);
        } else {
            passportAgreementCards2 = null;
        }
        b0 otherName = childDataResult.getOtherName();
        if (otherName != null) {
            passportAgreementCards3 = new PassportAgreementCards("childNextNamesCard", this.labelProvider.c(bp2.a.f21098v), c0.e(otherName), null, 8, null);
        } else {
            passportAgreementCards3 = null;
        }
        b0 lastName = childDataResult.getLastName();
        if (lastName != null) {
            passportAgreementCards4 = new PassportAgreementCards("childLastNameCard", this.labelProvider.c(bp2.a.f21094t), c0.e(lastName), null, 8, null);
        } else {
            passportAgreementCards4 = null;
        }
        b0 pesel = childDataResult.getPesel();
        if (pesel != null) {
            passportAgreementCards5 = new PassportAgreementCards("childPeselNumberCard", this.labelProvider.c(bp2.a.f21104y), c0.e(g.b(pesel).getValue()), j70.a.LETTER_BY_LETTER);
        }
        List listS = v.s(passportAgreementCards, passportAgreementCards2, passportAgreementCards3, passportAgreementCards4, passportAgreementCards5, new PassportAgreementCards("childBirthDateCard", this.labelProvider.c(bp2.a.f21054b), this.dateFormatter.d(new fz.b.LocalDate(childDataResult.getBirthDate().getDate()), fz.c.DOTTED), null, 8, null), new PassportAgreementCards("childPlaceOfBirthCard", this.labelProvider.c(bp2.a.f21057c), c0.e(childDataResult.getBirthPlace()), null, 8, null));
        ArrayList arrayList = new ArrayList(v.y(listS, 10));
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            arrayList.add(((PassportAgreementCards) it.next()).a());
        }
        return arrayList;
    }

    private final Integer h(s0 passportType) {
        int i15 = c.f76243b[passportType.ordinal()];
        if (i15 == 3) {
            return Integer.valueOf(bp2.a.K0);
        }
        if (i15 != 4) {
            return null;
        }
        return Integer.valueOf(bp2.a.H0);
    }

    private final e.a.Initialized i(d.b state, final Params params) {
        int i15;
        r30.b error;
        List<DefaultSingleCardData> listM = m(state.getData().getSummaryContractData().getPassportType());
        List<k> listQ = q(state.getData().getSummaryContractData().getYourDataValidatedData());
        List<DefaultSingleCardData> listF = f(state.getData().getSummaryContractData().getChildData());
        List<DefaultSingleCardData> listE = e(state.getData().getSummaryContractData().b(), state.getData().getSummaryContractData().d(), state.getData().getSummaryContractData().getPassportType());
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(bp2.a.G), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        er.a<i0> aVarA = params.a();
        Label labelC = this.labelProvider.c(bp2.a.J0);
        CardListData cardListData = new CardListData(listM, null, false, null, null, 30, null);
        Label labelC2 = this.labelProvider.c(bp2.a.S);
        CardListData cardListData2 = new CardListData(listQ, null, false, null, null, 30, null);
        Label labelC3 = this.labelProvider.c(bp2.a.f21066f);
        CardListData cardListData3 = new CardListData(listF, null, false, null, null, 30, null);
        Label labelC4 = this.labelProvider.c(bp2.a.f21051a);
        CardListData cardListData4 = new CardListData(listE, null, false, null, null, 30, null);
        Label labelC5 = this.labelProvider.c(bp2.a.E);
        boolean value = state.getData().getStatementState().getValue();
        l lVar = new l() { // from class: gq2.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.l(params, ((Boolean) obj).booleanValue());
            }
        };
        mx.c cVar = this.labelProvider;
        int i16 = c.f76242a[state.getData().getSummaryContractData().getYourDataValidatedData().getGender().ordinal()];
        if (i16 == 1) {
            i15 = bp2.a.f21075j0;
        } else if (i16 == 2) {
            i15 = bp2.a.f21073i0;
        } else {
            if (i16 != 3) {
                throw new p();
            }
            i15 = bp2.a.f21077k0;
        }
        CheckBoxRowData checkBoxRowData = new CheckBoxRowData("statementCheckBox", value, lVar, cVar.c(i15), null, null, null, null, 240, null);
        r30.c cVar2 = r30.c.CONTENT_BOX;
        hz.b validationState = state.getData().getStatementState().getValidationState();
        if (t.c(validationState, hz.b.d.f86848c) || t.c(validationState, hz.b.C2039b.f86846c)) {
            error = r30.b.a.f171263a;
        } else {
            if (!(validationState instanceof hz.b.Invalid)) {
                throw new p();
            }
            error = new r30.b.Error(null, this.labelProvider.c(bp2.a.F), 1, null);
        }
        CheckBoxSingleData checkBoxSingleData = new CheckBoxSingleData(checkBoxRowData, error, cVar2, false, null, 24, null);
        if (state.getData().getSummaryContractData().getChildData().getEntryType() != eq2.b.PICKER) {
            checkBoxSingleData = null;
        }
        return new e.a.Initialized(baseScaffoldData, aVarA, labelC, cardListData, labelC2, cardListData2, labelC3, cardListData3, labelC4, cardListData4, labelC5, checkBoxSingleData, new ButtonData("sendButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(bp2.a.D), null, 2, null), k30.d.a.f107773a, null, params.e(), 34, null), state.getScrollToStatementCheckBox(), params.d(), new c30.b.c(null, Label.INSTANCE.c(), null, this.labelProvider.c(bp2.a.N0), null, null, null, 117, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, boolean z15) {
        params.f().b(Boolean.valueOf(z15));
        return i0.f148189a;
    }

    private final List<DefaultSingleCardData> m(s0 passportType) {
        int i15;
        PassportAgreementCards passportAgreementCards = new PassportAgreementCards("officeReceiverCard", this.labelProvider.c(bp2.a.M0), this.labelProvider.c(bp2.a.L0).getText(), null, 8, null);
        Label labelC = this.labelProvider.c(bp2.a.f21071h0);
        mx.c cVar = this.labelProvider;
        int i16 = c.f76243b[passportType.ordinal()];
        if (i16 == 1) {
            i15 = bp2.a.f21099v0;
        } else if (i16 == 2) {
            i15 = bp2.a.f21105y0;
        } else if (i16 == 3) {
            i15 = bp2.a.f21103x0;
        } else if (i16 == 4) {
            i15 = bp2.a.f21097u0;
        } else {
            if (i16 != 5) {
                throw new p();
            }
            i15 = bp2.a.H;
        }
        List listQ = v.q(passportAgreementCards, new PassportAgreementCards("officePassportCard", labelC, cVar.c(i15).getText(), null, 8, null));
        ArrayList arrayList = new ArrayList(v.y(listQ, 10));
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            arrayList.add(((PassportAgreementCards) it.next()).a());
        }
        return arrayList;
    }

    private final List<k> q(YourDataValidatedData parentData) {
        PassportAgreementCards passportAgreementCards;
        PassportAgreementCards passportAgreementCards2;
        PassportAgreementCards passportAgreementCards3 = new PassportAgreementCards("parentFirstNameCard", this.labelProvider.c(bp2.a.f21088q), c0.e(parentData.getFirstName()), null, 8, null);
        b0 secondName = parentData.getSecondName();
        if (secondName != null) {
            passportAgreementCards = new PassportAgreementCards("parentSecondNameCard", this.labelProvider.c(bp2.a.B), c0.e(secondName), null, 8, null);
        } else {
            passportAgreementCards = null;
        }
        PassportAgreementCards passportAgreementCards4 = new PassportAgreementCards("parentLastNameCard", this.labelProvider.c(bp2.a.f21094t), c0.e(parentData.getSurname()), null, 8, null);
        PassportAgreementCards passportAgreementCards5 = new PassportAgreementCards("parentPeselNumberCard", this.labelProvider.c(bp2.a.f21104y), c0.e(parentData.getPesel()), j70.a.LETTER_BY_LETTER);
        PassportAgreementCards passportAgreementCards6 = new PassportAgreementCards("parentDocumentTypeCard", this.labelProvider.c(bp2.a.Y0), this.labelProvider.c(parentData.getDocumentType().getResId()).getText(), null, 8, null);
        b0 idCardNameFieldValue = parentData.getIdCardNameFieldValue();
        if (idCardNameFieldValue != null) {
            passportAgreementCards2 = new PassportAgreementCards("parentDocumentNameCard", this.labelProvider.c(bp2.a.f21059c1), c0.e(idCardNameFieldValue), null, 8, null);
        } else {
            passportAgreementCards2 = null;
        }
        int i15 = 8;
        fr.k kVar = null;
        j70.a aVar = null;
        List listS = v.s(passportAgreementCards3, passportAgreementCards, passportAgreementCards4, passportAgreementCards5, passportAgreementCards6, passportAgreementCards2, new PassportAgreementCards("parentIdCardSeriesAndNumberCard", this.labelProvider.c(bp2.a.X0), c0.e(parentData.getIdCardSeriesAndNumber()), aVar, i15, kVar), new PassportAgreementCards("parentPlaceOfBirthCard", this.labelProvider.c(bp2.a.f21057c), c0.e(parentData.getPlaceOfBirth()), aVar, i15, kVar));
        ArrayList arrayList = new ArrayList(v.y(listS, 10));
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            arrayList.add(((PassportAgreementCards) it.next()).a());
        }
        return arrayList;
    }

    @Override // er.l
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public e.a b(Params params) {
        d state = params.getState();
        if (state instanceof d.a) {
            d.a aVar = (d.a) params.getState();
            if (t.c(aVar, d.a.b.f66164a)) {
                return e.a.b.f66188a;
            }
            if (aVar instanceof d.a.Error) {
                return new e.a.Error(((d.a.Error) params.getState()).getErrorVMS());
            }
            throw new p();
        }
        if (state instanceof d.b) {
            return i((d.b) params.getState(), params);
        }
        if (state instanceof d.InitializedError) {
            return new e.a.Error(((d.InitializedError) params.getState()).getErrorVMS());
        }
        if (!(state instanceof d.C1473d)) {
            throw new p();
        }
        return new e.a.Success(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.c()), null, null, null, null, 30, null), null, null, null, null, 61, null), new IconPageData(j.b.c.f164688d, this.labelProvider.c(bp2.a.G0), null, null, null, new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(bp2.a.f21072i), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null), null, null, 6, null), false, 76, null), params.c());
    }

    /* JADX INFO: renamed from: gq2.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lgq2/b$b;", "", "", "testTag", "Lmx/a;", "infoLabel", "titleString", "Lj70/a;", "accessibilityReadMode", "<init>", "(Ljava/lang/String;Lmx/a;Ljava/lang/String;Lj70/a;)V", "Ln50/g;", "a", "()Ln50/g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTestTag", "b", "Lmx/a;", "getInfoLabel", "()Lmx/a;", "c", "getTitleString", "d", "Lj70/a;", "getAccessibilityReadMode", "()Lj70/a;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PassportAgreementCards {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String testTag;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label infoLabel;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String titleString;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final j70.a accessibilityReadMode;

        public PassportAgreementCards(String str, Label label, String str2, j70.a aVar) {
            this.testTag = str;
            this.infoLabel = label;
            this.titleString = str2;
            this.accessibilityReadMode = aVar;
        }

        public final DefaultSingleCardData a() {
            return new DefaultSingleCardData(this.testTag, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.infoLabel, null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(this.titleString, this.testTag + "Title"), null, null, 0, 0, this.accessibilityReadMode, 30, null)), null, 4, null), null, null, null, 3838, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PassportAgreementCards)) {
                return false;
            }
            PassportAgreementCards passportAgreementCards = (PassportAgreementCards) other;
            return t.c(this.testTag, passportAgreementCards.testTag) && t.c(this.infoLabel, passportAgreementCards.infoLabel) && t.c(this.titleString, passportAgreementCards.titleString) && this.accessibilityReadMode == passportAgreementCards.accessibilityReadMode;
        }

        public int hashCode() {
            return (((((this.testTag.hashCode() * 31) + this.infoLabel.hashCode()) * 31) + this.titleString.hashCode()) * 31) + this.accessibilityReadMode.hashCode();
        }

        public String toString() {
            return "PassportAgreementCards(testTag=" + this.testTag + ", infoLabel=" + this.infoLabel + ", titleString=" + this.titleString + ", accessibilityReadMode=" + this.accessibilityReadMode + ')';
        }

        public /* synthetic */ PassportAgreementCards(String str, Label label, String str2, j70.a aVar, int i15, fr.k kVar) {
            this(str, label, str2, (i15 & 8) != 0 ? j70.a.LOWER_CASE : aVar);
        }
    }
}
