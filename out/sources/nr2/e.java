package nr2;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import lr2.State;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import r50.g;
import uq2.PassportVisualization;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lnr2/e;", "Lxw/f;", "Lnr2/e$a;", "Llr2/c$a;", "Lmx/c;", "labelProvider", "Lez/c;", "dateConverter", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/c;Lez/e;)V", "Luq2/g;", "passport", "Ln30/b;", "c", "(Luq2/g;)Ln30/b;", "", "titleResId", "", "descString", "descTag", "Lj70/a;", "accessibilityReadMode", "Ln50/g;", "e", "(ILjava/lang/String;Ljava/lang/String;Lj70/a;)Ln50/g;", "main", "optional", "h", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "params", "i", "(Lnr2/e$a;)Llr2/c$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "b", "Lez/c;", "getDateConverter", "()Lez/c;", "Lez/e;", "getDateFormatter", "()Lez/e;", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, lr2.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: nr2.e$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lnr2/e$a;", "", "Llr2/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onNextButtonClick", "onBack", "<init>", "(Llr2/b;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llr2/b;", "c", "()Llr2/b;", "b", "Ler/a;", "()Ler/a;", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = state;
            this.onNextButtonClick = aVar;
            this.onBack = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onNextButtonClick;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onNextButtonClick, params.onNextButtonClick) && t.c(this.onBack, params.onBack);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onNextButtonClick.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onNextButtonClick=" + this.onNextButtonClick + ", onBack=" + this.onBack + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f137980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f137981b;

        static {
            int[] iArr = new int[xw.e.values().length];
            try {
                iArr[xw.e.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xw.e.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f137980a = iArr;
            int[] iArr2 = new int[uq2.f.values().length];
            try {
                iArr2[uq2.f.BIOMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[uq2.f.TEMPORARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f137981b = iArr2;
        }
    }

    public e(mx.c cVar, ez.c cVar2, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateConverter = cVar2;
        this.dateFormatter = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0175  */
    private final CardListData c(PassportVisualization passport) {
        String text;
        String text2;
        String text3;
        String text4;
        Label labelB;
        String text5;
        String text6;
        Label labelC;
        OffsetDateTime date;
        LocalDate date2;
        int i15;
        LocalDate date3;
        DefaultSingleCardData defaultSingleCardDataF = f(this, qq2.a.G, c0.e(passport.getNumber()), "passportLabel", null, 8, null);
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(qq2.a.f168130u), null, null, 0, 0, null, 62, null), new n50.b.StatusBadge(new r50.a.WithIcon(null, this.labelProvider.c(qq2.a.f168133x), null, 0, false, g.POSITIVE, 13, null)), null, 4, null), null, null, null, 3839, null);
        int i16 = qq2.a.F;
        b0 nameFirstLine = passport.getNameFirstLine();
        if (nameFirstLine == null || (text = c0.e(nameFirstLine)) == null) {
            text = Label.INSTANCE.b().getText();
        }
        b0 nameSecondLine = passport.getNameSecondLine();
        DefaultSingleCardData defaultSingleCardDataF2 = f(this, i16, h(text, nameSecondLine != null ? c0.e(nameSecondLine) : null), "firstNames", null, 8, null);
        int i17 = qq2.a.f168119j;
        b0 surnameFirstLine = passport.getSurnameFirstLine();
        if (surnameFirstLine == null || (text2 = c0.e(surnameFirstLine)) == null) {
            text2 = Label.INSTANCE.b().getText();
        }
        b0 surnameSecondLine = passport.getSurnameSecondLine();
        DefaultSingleCardData defaultSingleCardDataF3 = f(this, i17, h(text2, surnameSecondLine != null ? c0.e(surnameSecondLine) : null), "lastname", null, 8, null);
        int i18 = qq2.a.f168123n;
        b0 pesel = passport.getPesel();
        if (pesel == null || (text3 = c0.e(pesel)) == null) {
            text3 = Label.INSTANCE.b().getText();
        }
        DefaultSingleCardData defaultSingleCardDataE = e(i18, text3, "pesel", j70.a.LETTER_BY_LETTER);
        int i19 = qq2.a.f168103a;
        fz.b.LocalDate birthDate = passport.getBirthDate();
        if (birthDate == null || (date3 = birthDate.getDate()) == null || (text4 = this.dateConverter.a(date3)) == null) {
            text4 = Label.INSTANCE.b().getText();
        }
        DefaultSingleCardData defaultSingleCardDataF4 = f(this, i19, text4, "birthDate", null, 8, null);
        int i25 = qq2.a.f168105b;
        String birthPlaceFirstLine = passport.getBirthPlaceFirstLine();
        if (birthPlaceFirstLine == null) {
            birthPlaceFirstLine = Label.INSTANCE.b().getText();
        }
        DefaultSingleCardData defaultSingleCardDataF5 = f(this, i25, h(birthPlaceFirstLine, passport.getBirthPlaceSecondLine()), "birthPlace", null, 8, null);
        SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(qq2.a.f168117h), null, null, 0, 0, null, 62, null);
        xw.e gender = passport.getGender();
        if (gender != null) {
            mx.c cVar = this.labelProvider;
            int i26 = b.f137980a[gender.ordinal()];
            if (i26 == 1) {
                i15 = qq2.a.f168120k;
            } else {
                if (i26 != 2) {
                    throw new p();
                }
                i15 = qq2.a.f168115g;
            }
            labelB = cVar.c(i15);
            if (labelB == null) {
                labelB = Label.INSTANCE.b();
            }
        } else {
            labelB = Label.INSTANCE.b();
        }
        DefaultSingleCardData defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(labelB.n("genderValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        int i27 = qq2.a.f168111e;
        String citizenship = passport.getCitizenship();
        if (citizenship == null) {
            citizenship = Label.INSTANCE.b().getText();
        }
        DefaultSingleCardData defaultSingleCardDataF6 = f(this, i27, citizenship, "citizenship", null, 8, null);
        int i28 = qq2.a.C;
        fz.b.LocalDate expiryDate = passport.getExpiryDate();
        if (expiryDate == null || (date2 = expiryDate.getDate()) == null || (text5 = this.dateConverter.a(date2)) == null) {
            text5 = Label.INSTANCE.b().getText();
        }
        DefaultSingleCardData defaultSingleCardDataF7 = f(this, i28, text5, "expiryDate", null, 8, null);
        int i29 = qq2.a.D;
        fz.b.OffsetDateTime issueDate = passport.getIssueDate();
        if (issueDate == null || (date = issueDate.getDate()) == null || (text6 = this.dateFormatter.d(new fz.b.OffsetDateTime(date), fz.c.DOTTED)) == null) {
            text6 = Label.INSTANCE.b().getText();
        }
        DefaultSingleCardData defaultSingleCardDataF8 = f(this, i29, text6, "issueDate", null, 8, null);
        int i35 = qq2.a.E;
        String issuerNameFirstLine = passport.getIssuerNameFirstLine();
        if (issuerNameFirstLine == null) {
            issuerNameFirstLine = Label.INSTANCE.b().getText();
        }
        DefaultSingleCardData defaultSingleCardDataF9 = f(this, i35, h(issuerNameFirstLine, passport.getIssuerNameSecondLine()), "issuer", null, 8, null);
        SingleCardLabel singleCardLabel2 = new SingleCardLabel(this.labelProvider.c(qq2.a.J), null, null, 0, 0, null, 62, null);
        int i36 = b.f137981b[passport.getType().ordinal()];
        if (i36 != 1) {
            labelC = i36 != 2 ? Label.INSTANCE.b() : this.labelProvider.c(qq2.a.I);
        } else {
            labelC = this.labelProvider.c(qq2.a.f168122m);
        }
        return new CardListData(v.q(defaultSingleCardDataF, defaultSingleCardData, defaultSingleCardDataF2, defaultSingleCardDataF3, defaultSingleCardDataE, defaultSingleCardDataF4, defaultSingleCardDataF5, defaultSingleCardData2, defaultSingleCardDataF6, defaultSingleCardDataF7, defaultSingleCardDataF8, defaultSingleCardDataF9, new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel2, new n50.b.Title(new SingleCardLabel(labelC.n("passportTitle"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), f(this, qq2.a.B, passport.getCountryCode().name(), "code", null, 8, null)), null, false, null, null, 30, null);
    }

    private final DefaultSingleCardData e(int titleResId, String descString, String descTag, j70.a accessibilityReadMode) {
        return new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(titleResId), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(descString, descTag), null, null, 0, 0, accessibilityReadMode, 30, null)), null, 4, null), null, null, null, 3839, null);
    }

    static /* synthetic */ DefaultSingleCardData f(e eVar, int i15, String str, String str2, j70.a aVar, int i16, Object obj) {
        if ((i16 & 8) != 0) {
            aVar = j70.a.LOWER_CASE;
        }
        return eVar.e(i15, str, str2, aVar);
    }

    private final String h(String main, String optional) {
        if (optional == null || optional.length() == 0) {
            return main;
        }
        return main + '\n' + optional;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public lr2.c.Data b(Params params) {
        mx.c cVar = this.labelProvider;
        return new lr2.c.Data(new BaseScaffoldData(null, null, null, null, null, null, 63, null), cVar.c(qq2.a.f168109d), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(cVar.c(qq2.a.f168129t), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null), c(params.getState().getSummaryData().getChoosePassportData().getPassport()), params.a());
    }
}
