package rk2;

import ez.e;
import fr.k;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k30.d;
import lk2.PersonalIdCardContainer;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.CustomSingleCardData;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import qk2.b;
import r50.g;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0018\u0016B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001a¨\u0006\u001c"}, d2 = {"Lrk2/a;", "Lxw/f;", "Lrk2/a$b;", "Lqk2/c$a;", "Lmx/c;", "labelProvider", "Lez/c;", "dateConverter", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/c;Lez/e;)V", "Lfz/b$c;", "date", "", "tag", "Lmx/a;", "c", "(Lfz/b$c;Ljava/lang/String;)Lmx/a;", "params", "e", "(Lrk2/a$b;)Lqk2/c$a;", "a", "Lmx/c;", "b", "Lez/c;", "Lez/e;", "d", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, qk2.c.Data> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C4455a f174686d = new C4455a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f174687e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: rk2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lrk2/a$a;", "", "<init>", "()V", "", "ID_CARD_TAG", "Ljava/lang/String;", "ID_CARD_NUMBER_VALUE_TAG", "ISSUER_VALUE_ID_CARD_TAG", "VALIDITY_TERM_VALUE_ID_CARD_TAG", "RELEASE_DATE_VALUE_ID_CARD_TAG", "REVOCATION_DATE_VALUE_ID_CARD_TAG", "SUSPENSION_DATE_VALUE_ID_CARD_TAG", "LAST_UPDATE_ID_CARD_VALUE_TAG", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class C4455a {
        public /* synthetic */ C4455a(k kVar) {
            this();
        }

        private C4455a() {
        }
    }

    /* JADX INFO: renamed from: rk2.a$b, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u0017\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006\""}, d2 = {"Lrk2/a$b;", "", "Lqk2/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onUpdateClicked", "onBack", "onCopySerialNumber", "onPinChangeClicked", "onElectronicLayerSettingsClicked", "<init>", "(Lqk2/b;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqk2/b;", "e", "()Lqk2/b;", "b", "Ler/a;", "d", "()Ler/a;", "c", "getOnPinChangeClicked", "f", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onUpdateClicked;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCopySerialNumber;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onPinChangeClicked;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onElectronicLayerSettingsClicked;

        public Params(b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = bVar;
            this.onUpdateClicked = aVar;
            this.onBack = aVar2;
            this.onCopySerialNumber = aVar3;
            this.onPinChangeClicked = aVar4;
            this.onElectronicLayerSettingsClicked = aVar5;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onCopySerialNumber;
        }

        public final er.a<i0> c() {
            return this.onElectronicLayerSettingsClicked;
        }

        public final er.a<i0> d() {
            return this.onUpdateClicked;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final b getState() {
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
            return t.c(this.state, params.state) && t.c(this.onUpdateClicked, params.onUpdateClicked) && t.c(this.onBack, params.onBack) && t.c(this.onCopySerialNumber, params.onCopySerialNumber) && t.c(this.onPinChangeClicked, params.onPinChangeClicked) && t.c(this.onElectronicLayerSettingsClicked, params.onElectronicLayerSettingsClicked);
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onUpdateClicked.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onCopySerialNumber.hashCode()) * 31) + this.onPinChangeClicked.hashCode()) * 31) + this.onElectronicLayerSettingsClicked.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onUpdateClicked=" + this.onUpdateClicked + ", onBack=" + this.onBack + ", onCopySerialNumber=" + this.onCopySerialNumber + ", onPinChangeClicked=" + this.onPinChangeClicked + ", onElectronicLayerSettingsClicked=" + this.onElectronicLayerSettingsClicked + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f174697a;

        static {
            int[] iArr = new int[lk2.k.values().length];
            try {
                iArr[lk2.k.ISSUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lk2.k.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lk2.k.NOT_ISSUED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[lk2.k.REVOKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[lk2.k.SUSPENDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f174697a = iArr;
        }
    }

    public a(mx.c cVar, ez.c cVar2, e eVar) {
        this.labelProvider = cVar;
        this.dateConverter = cVar2;
        this.dateFormatter = eVar;
    }

    private final Label c(fz.b.LocalDate date, String tag) {
        return mx.b.d(date != null ? this.dateConverter.a(date.getDate()) : null, tag);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x022d  */
    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public qk2.c.Data b(Params params) {
        CardListData cardListData;
        DefaultSingleCardData defaultSingleCardData;
        DefaultSingleCardData defaultSingleCardData2;
        DefaultSingleCardData defaultSingleCardData3;
        DefaultSingleCardData defaultSingleCardData4;
        DefaultSingleCardData defaultSingleCardData5;
        Label labelF;
        g gVar;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(ik2.a.J), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(ik2.a.U);
        Label labelC2 = this.labelProvider.c(ik2.a.T);
        er.a<i0> aVarA = params.a();
        if (params.getState() instanceof b.Initialized) {
            PersonalIdCardContainer personalIdCard = ((b.Initialized) params.getState()).getPersonalDataScope().getScope().getData().getPersonalIdCard();
            String number = personalIdCard.getNumber();
            CustomSingleCardData customSingleCardData = number != null ? new CustomSingleCardData("IdDocumentNumberCard", new ok2.b(Label.f(this.labelProvider.c(ik2.a.V).n("MdowodDocumentDetailsMdowodNumberLabel"), "IdCard", null, 2, null), mx.b.b(number, "MdowodDocumentDetailsMdowodNumberValueIdCard"), null, new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(Label.f(this.labelProvider.c(ik2.a.f93187c), "IdCard", null, 2, null), this.labelProvider.c(ik2.a.f93197h)), d.a.f107773a, null, params.b(), 35, null), 4, null), null, false, null, null, false, null, 252, null) : null;
            lk2.k status = personalIdCard.getStatus();
            if (status != null) {
                SingleCardLabel singleCardLabel = new SingleCardLabel(Label.f(this.labelProvider.c(ik2.a.f93193f), "IdCard", null, 2, null), null, null, 0, 0, null, 62, null);
                int[] iArr = c.f174697a;
                int i15 = iArr[status.ordinal()];
                if (i15 == 1 || i15 == 2) {
                    labelF = Label.f(this.labelProvider.c(ik2.a.f93222w), "IdCard", null, 2, null);
                } else if (i15 == 3) {
                    labelF = Label.f(this.labelProvider.c(ik2.a.f93223x), "IdCard", null, 2, null);
                } else if (i15 == 4) {
                    labelF = Label.f(this.labelProvider.c(ik2.a.f93224y), "IdCard", null, 2, null);
                } else {
                    if (i15 != 5) {
                        throw new p();
                    }
                    labelF = Label.f(this.labelProvider.c(ik2.a.f93225z), "IdCard", null, 2, null);
                }
                Label label = labelF;
                int i16 = iArr[status.ordinal()];
                if (i16 == 1 || i16 == 2) {
                    gVar = g.POSITIVE;
                } else if (i16 == 3) {
                    gVar = g.MINUS;
                } else {
                    if (i16 != 4 && i16 != 5) {
                        throw new p();
                    }
                    gVar = g.NEGATIVE;
                }
                defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.StatusBadge(new r50.a.WithIcon(null, label, null, 0, false, gVar, 13, null)), null, 4, null), null, null, null, 3839, null);
            } else {
                defaultSingleCardData4 = null;
            }
            String issuer = personalIdCard.getIssuer();
            if (issuer == null) {
                defaultSingleCardData5 = null;
            } else {
                if (issuer.length() <= 0) {
                    issuer = null;
                }
                if (issuer != null) {
                    defaultSingleCardData5 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(Label.f(this.labelProvider.c(ik2.a.N), "IdCard", null, 2, null), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(issuer, "MdowodDocumentDetailsDrawerOtherIssuerValueIdCard"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
                } else {
                    defaultSingleCardData5 = null;
                }
            }
            fz.b.LocalDate validTo = personalIdCard.getValidTo();
            DefaultSingleCardData defaultSingleCardData6 = validTo != null ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(Label.f(this.labelProvider.c(ik2.a.X).n("MdowodDocumentDetailsDrawerOtherValidityTerm"), "IdCard", null, 2, null), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(c(validTo, "MdowodDocumentDetailsDrawerOtherValidityTermValueIdCard"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null) : null;
            fz.b.LocalDate creationDate = personalIdCard.getCreationDate();
            DefaultSingleCardData defaultSingleCardData7 = creationDate != null ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(Label.f(this.labelProvider.c(ik2.a.W).n("MdowodDocumentDetailsDrawerOtherReleaseDate"), "IdCard", null, 2, null), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(c(creationDate, "MdowodDocumentDetailsDrawerOtherReleaseDateValueIdCard"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null) : null;
            fz.b.LocalDate revocationDate = personalIdCard.getRevocationDate();
            DefaultSingleCardData defaultSingleCardData8 = revocationDate != null ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(Label.f(this.labelProvider.c(ik2.a.Q), "IdCard", null, 2, null), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(c(revocationDate, "MdowodDocumentDetailsDrawerOtherRevocationDateValueIdCard"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null) : null;
            fz.b.LocalDate suspensionDate = personalIdCard.getSuspensionDate();
            cardListData = new CardListData(v.s(customSingleCardData, defaultSingleCardData4, defaultSingleCardData5, defaultSingleCardData6, defaultSingleCardData7, defaultSingleCardData8, suspensionDate != null ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(Label.f(this.labelProvider.c(ik2.a.R), "IdCard", null, 2, null), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(c(suspensionDate, "MdowodDocumentDetailsDrawerOtherSuspensionDateValueIdCard"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null) : null), null, false, null, null, 30, null);
        } else {
            cardListData = null;
        }
        if (params.getState() instanceof b.Initialized) {
            defaultSingleCardData = null;
            defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(ik2.a.f93211o), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(this.dateFormatter.d(new fz.b.OffsetDateTime(((b.Initialized) params.getState()).getPersonalDataScope().getScope().getDataHeader().getTs()), fz.c.DOTTED), "MdowodDocumentDetailsLastUpdateDateValueIdCard"), null, null, 0, 0, null, 62, null)), null, 4, null), null, new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(ik2.a.f93195g), null, 2, null), d.a.f107773a, null, params.d(), 35, null)), null, 2815, null);
        } else {
            defaultSingleCardData = null;
            defaultSingleCardData2 = null;
        }
        b state = params.getState();
        if (t.c(state, b.C4202b.f167061a)) {
            defaultSingleCardData3 = defaultSingleCardData;
        } else {
            if (!(state instanceof b.Initialized)) {
                throw new p();
            }
            defaultSingleCardData3 = new DefaultSingleCardData(null, params.c(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(ik2.a.F), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.T, null, null, null, null, 30, null), 3, null), new x0.Icon(jz.a.V, null, null, 6, null), null, 2301, null);
        }
        return new qk2.c.Data(baseScaffoldData, labelC, labelC2, cardListData, defaultSingleCardData2, defaultSingleCardData3, aVarA);
    }
}
