package ad3;

import b30.AccordionData;
import b30.AccordionElement;
import er.l;
import ez.e;
import fr.t;
import fu.r;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.CustomSingleCardData;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.i;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import uc3.PassportDiplomaticData;
import uc3.PassportRevocationData;
import uc3.g;
import x50.NavigationButtonData;
import xw.f;
import zc3.CustomPassportSingleCardContent;
import zc3.State;
import zc3.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001#B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0016*\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lad3/b;", "Lxw/f;", "Lad3/b$a;", "Lzc3/h$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "", "isValid", "Lr50/a$b;", "h", "(Z)Lr50/a$b;", "Luc3/g;", "Lkotlin/Function0;", "Loq/i0;", "onRevokePassport", "Ln50/g;", "q", "(Luc3/g;Ler/a;)Ln50/g;", "Lmx/a;", "m", "(Luc3/g;)Lmx/a;", "Luc3/e;", "l", "(Luc3/e;)Lmx/a;", "Luc3/c;", "", "e", "(Luc3/c;)Ljava/lang/String;", "params", "i", "(Lad3/b$a;)Lzc3/h$a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "Z", "isInPreview", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, h.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isInPreview;

    /* JADX INFO: renamed from: ad3.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lad3/b$a;", "", "Lzc3/g;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBack", "onRevokePassport", "<init>", "(Lzc3/g;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzc3/g;", "c", "()Lzc3/g;", "b", "Ler/a;", "()Ler/a;", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRevokePassport;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = state;
            this.onBack = aVar;
            this.onRevokePassport = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onRevokePassport;
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
            return t.c(this.state, params.state) && t.c(this.onBack, params.onBack) && t.c(this.onRevokePassport, params.onRevokePassport);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onBack.hashCode()) * 31) + this.onRevokePassport.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBack=" + this.onBack + ", onRevokePassport=" + this.onRevokePassport + ')';
        }
    }

    /* JADX INFO: renamed from: ad3.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0112b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f5457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f5458c;

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
            f5456a = iArr;
            int[] iArr2 = new int[g.values().length];
            try {
                iArr2[g.BIOMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[g.TEMPORARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[g.BUSINESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[g.DIPLOMATIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[g.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            f5457b = iArr2;
            int[] iArr3 = new int[uc3.e.values().length];
            try {
                iArr3[uc3.e.PERSONALIZATION_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[uc3.e.INVALIDITY_DECLARATION_CITIZENSHIP_MISSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[uc3.e.INVALIDITY_DECLARATION_FORGERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[uc3.e.INVALIDITY_DECLARATION_OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[uc3.e.INVALIDITY_DECLARATION_WRONG_DATA.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[uc3.e.INVALIDITY_DECLARATION_PERSONALIZATION_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[uc3.e.UNAUTHORIZED_USING_PERSONAL_DATA.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[uc3.e.CITIZEN_REQUEST.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[uc3.e.OFFICE_REQUEST.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[uc3.e.INVALID_DATA.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[uc3.e.THIRD_PARTY_FOUND_DOCUMENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[uc3.e.COMPLIANT.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[uc3.e.EXPIRED.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[uc3.e.DAMAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[uc3.e.LOSS.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[uc3.e.RENUNCIATION_OF_CITIZENSHIP.ordinal()] = 16;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[uc3.e.LOSS_RIGHT_FOR_USING_PASSPORT.ordinal()] = 17;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[uc3.e.TECHNICAL_FAULTS.ordinal()] = 18;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[uc3.e.ISSUING_NEW_PASSPORT.ordinal()] = 19;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[uc3.e.DIED.ordinal()] = 20;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[uc3.e.DATA_CHANGED.ordinal()] = 21;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[uc3.e.DATA_MIGRATION.ordinal()] = 22;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[uc3.e.UNKNOWN.ordinal()] = 23;
            } catch (NoSuchFieldError unused30) {
            }
            f5458c = iArr3;
        }
    }

    public b(c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final String e(PassportDiplomaticData passportDiplomaticData) {
        List listV0;
        String body = passportDiplomaticData.getBody();
        if (body == null || (listV0 = r.V0(body, new String[]{"/"}, false, 0, 6, null)) == null) {
            return null;
        }
        return v.v0(listV0, "\n", null, null, 0, null, new l() { // from class: ad3.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.f((String) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence f(String str) {
        return r.u1(str).toString();
    }

    private final r50.a.WithIcon h(boolean isValid) {
        if (isValid) {
            return new r50.a.WithIcon(null, this.labelProvider.c(mc3.a.f125573i0), null, 0, false, r50.g.POSITIVE, 13, null);
        }
        if (isValid) {
            throw new p();
        }
        return new r50.a.WithIcon(null, this.labelProvider.c(mc3.a.f125577k0), null, 0, false, r50.g.NEGATIVE, 13, null);
    }

    private final Label l(uc3.e eVar) {
        int i15;
        c cVar = this.labelProvider;
        switch (C0112b.f5458c[eVar.ordinal()]) {
            case 1:
                i15 = mc3.a.f125557a0;
                break;
            case 2:
                i15 = mc3.a.R;
                break;
            case 3:
                i15 = mc3.a.S;
                break;
            case 4:
                i15 = mc3.a.T;
                break;
            case 5:
                i15 = mc3.a.V;
                break;
            case 6:
                i15 = mc3.a.U;
                break;
            case 7:
                i15 = mc3.a.f125565e0;
                break;
            case 8:
                i15 = mc3.a.J;
                break;
            case 9:
                i15 = mc3.a.Z;
                break;
            case 10:
                i15 = mc3.a.Q;
                break;
            case 11:
                i15 = mc3.a.f125563d0;
                break;
            case 12:
                i15 = mc3.a.K;
                break;
            case 13:
                i15 = mc3.a.P;
                break;
            case 14:
                i15 = mc3.a.L;
                break;
            case 15:
                i15 = mc3.a.X;
                break;
            case 16:
                i15 = mc3.a.f125559b0;
                break;
            case 17:
                i15 = mc3.a.Y;
                break;
            case 18:
                i15 = mc3.a.f125561c0;
                break;
            case 19:
                i15 = mc3.a.W;
                break;
            case 20:
                i15 = mc3.a.O;
                break;
            case 21:
                i15 = mc3.a.M;
                break;
            case 22:
                i15 = mc3.a.N;
                break;
            case 23:
                i15 = mc3.a.f125567f0;
                break;
            default:
                throw new p();
        }
        return cVar.c(i15);
    }

    private final Label m(g gVar) {
        int i15;
        c cVar = this.labelProvider;
        int i16 = C0112b.f5457b[gVar.ordinal()];
        if (i16 == 1) {
            i15 = mc3.a.f125581m0;
        } else if (i16 == 2) {
            i15 = mc3.a.f125587p0;
        } else if (i16 == 3) {
            i15 = mc3.a.f125583n0;
        } else if (i16 == 4) {
            i15 = mc3.a.f125585o0;
        } else {
            if (i16 != 5) {
                throw new p();
            }
            i15 = mc3.a.f125581m0;
        }
        return cVar.c(i15);
    }

    private final DefaultSingleCardData q(g gVar, er.a<i0> aVar) {
        int i15 = C0112b.f5457b[gVar.ordinal()];
        if (i15 == 1 || i15 == 2) {
            return new DefaultSingleCardData("RevokePassportButtonCard", aVar, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(mc3.a.A), null, null, 0, 0, null, 62, null)), null, 5, null), new LeadingSection(false, null, new i.Icon(jz.a.f106804k, null, null, d40.i.e.f39708e, null, 22, null), 3, null), x0.Icon.INSTANCE.b(), null, 2300, null);
        }
        if (i15 == 3 || i15 == 4 || i15 == 5) {
            return null;
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public h.Data b(Params params) {
        String text;
        String text2;
        Label labelB;
        Label labelB2;
        Label labelB3;
        DefaultSingleCardData defaultSingleCardData;
        DefaultSingleCardData defaultSingleCardData2;
        Label labelB4;
        AccordionData accordionData;
        Label labelB5;
        Label labelB6;
        Label labelB7;
        State state = params.getState();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(mc3.a.f125597z), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(mc3.a.f125593v);
        Label labelC2 = this.labelProvider.c(mc3.a.f125584o);
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData("PassportNumberCard", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(mc3.a.f125596y), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(state.getData().getPassport().getNumber()), ""), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData("StatusCard", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(mc3.a.f125578l), null, null, 0, 0, null, 62, null), new n50.b.StatusBadge(h(state.getData().getIsPassportValid())), null, 4, null), null, null, null, 3838, null);
        SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.c(mc3.a.f125574j), null, null, 0, 0, null, 62, null);
        StringBuilder sb5 = new StringBuilder();
        b0 nameFirstLine = state.getData().getPassport().getNameFirstLine();
        if (nameFirstLine == null || (text = c0.e(nameFirstLine)) == null) {
            text = Label.INSTANCE.b().getText();
        }
        sb5.append(text);
        b0 nameSecondLine = state.getData().getPassport().getNameSecondLine();
        if (nameSecondLine != null) {
            sb5.append("\n");
            sb5.append(c0.e(nameSecondLine));
            i0 i0Var = i0.f148189a;
        }
        i0 i0Var2 = i0.f148189a;
        DefaultSingleCardData defaultSingleCardData5 = new DefaultSingleCardData("NamesCard", null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.Title(new SingleCardLabel(mx.b.b(sb5.toString(), ""), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        SingleCardLabel singleCardLabel2 = new SingleCardLabel(this.labelProvider.c(mc3.a.f125570h), null, null, 0, 0, null, 62, null);
        StringBuilder sb6 = new StringBuilder();
        b0 surnameFirstLine = state.getData().getPassport().getSurnameFirstLine();
        if (surnameFirstLine == null || (text2 = c0.e(surnameFirstLine)) == null) {
            text2 = Label.INSTANCE.b().getText();
        }
        sb6.append(text2);
        b0 surnameSecondLine = state.getData().getPassport().getSurnameSecondLine();
        if (surnameSecondLine != null) {
            sb6.append("\n");
            sb6.append(c0.e(surnameSecondLine));
        }
        DefaultSingleCardData defaultSingleCardData6 = new DefaultSingleCardData("SurnameCard", null, false, null, null, false, null, null, new BodySection(singleCardLabel2, new n50.b.Title(new SingleCardLabel(mx.b.b(sb6.toString(), ""), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        SingleCardLabel singleCardLabel3 = new SingleCardLabel(this.labelProvider.c(mc3.a.f125576k), null, null, 0, 0, null, 62, null);
        b0 pesel = state.getData().getPassport().getPesel();
        DefaultSingleCardData defaultSingleCardData7 = new DefaultSingleCardData("PeselCard", null, false, null, null, false, null, null, new BodySection(singleCardLabel3, new n50.b.Title(new SingleCardLabel(mx.b.d(pesel != null ? c0.e(pesel) : null, ""), null, null, 0, 0, j70.a.LETTER_BY_LETTER, 30, null)), null, 4, null), null, null, null, 3838, null);
        SingleCardLabel singleCardLabel4 = new SingleCardLabel(this.labelProvider.c(mc3.a.f125556a), null, null, 0, 0, null, 62, null);
        fz.b.LocalDate birthDate = state.getData().getPassport().getBirthDate();
        if (birthDate == null || (labelB = mx.b.b(this.dateFormatter.d(birthDate, fz.c.DOTTED), "")) == null) {
            labelB = Label.INSTANCE.b();
        }
        DefaultSingleCardData defaultSingleCardData8 = new DefaultSingleCardData("BirthDateCard", null, false, null, null, false, null, null, new BodySection(singleCardLabel4, new n50.b.Title(new SingleCardLabel(labelB, null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        SingleCardLabel singleCardLabel5 = new SingleCardLabel(this.labelProvider.c(mc3.a.f125558b), null, null, 0, 0, null, 62, null);
        StringBuilder sb7 = new StringBuilder();
        sb7.append(state.getData().getPassport().getBirthPlaceFirstLine());
        String birthPlaceSecondLine = state.getData().getPassport().getBirthPlaceSecondLine();
        if (birthPlaceSecondLine != null) {
            sb7.append("\n");
            sb7.append(birthPlaceSecondLine);
        }
        DefaultSingleCardData defaultSingleCardData9 = new DefaultSingleCardData("BirthPlaceCard", null, false, null, null, false, null, null, new BodySection(singleCardLabel5, new n50.b.Title(new SingleCardLabel(mx.b.b(sb7.toString(), ""), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        SingleCardLabel singleCardLabel6 = new SingleCardLabel(this.labelProvider.c(mc3.a.f125568g), null, null, 0, 0, null, 62, null);
        xw.e gender = state.getData().getPassport().getGender();
        int i15 = gender == null ? -1 : C0112b.f5456a[gender.ordinal()];
        if (i15 == -1) {
            labelB2 = Label.INSTANCE.b();
        } else if (i15 == 1) {
            labelB2 = this.labelProvider.c(mc3.a.f125572i);
        } else {
            if (i15 != 2) {
                throw new p();
            }
            labelB2 = this.labelProvider.c(mc3.a.f125566f);
        }
        DefaultSingleCardData defaultSingleCardData10 = new DefaultSingleCardData("GenderCard", null, false, null, null, false, null, null, new BodySection(singleCardLabel6, new n50.b.Title(new SingleCardLabel(labelB2, null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        DefaultSingleCardData defaultSingleCardData11 = new DefaultSingleCardData("CitizenshipCard", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(mc3.a.f125560c), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(state.getData().getPassport().getCitizenship(), ""), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        SingleCardLabel singleCardLabel7 = new SingleCardLabel(this.labelProvider.c(mc3.a.f125595x), null, null, 0, 0, null, 62, null);
        fz.b.LocalDate expiryDate = state.getData().getPassport().getExpiryDate();
        if (expiryDate == null || (labelB3 = mx.b.b(this.dateFormatter.d(expiryDate, fz.c.DOTTED), "")) == null) {
            labelB3 = Label.INSTANCE.b();
        }
        DefaultSingleCardData defaultSingleCardData12 = new DefaultSingleCardData("ExpiryDateCard", null, false, null, null, false, null, null, new BodySection(singleCardLabel7, new n50.b.Title(new SingleCardLabel(labelB3, null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        PassportRevocationData revocationData = state.getData().getPassport().getRevocationData();
        if (revocationData != null) {
            SingleCardLabel singleCardLabel8 = new SingleCardLabel(this.labelProvider.c(mc3.a.f125592u), null, null, 0, 0, null, 62, null);
            uc3.e revocationReason = revocationData.getRevocationReason();
            if (revocationReason == null || (labelB7 = l(revocationReason)) == null) {
                labelB7 = Label.INSTANCE.b();
            }
            defaultSingleCardData = new DefaultSingleCardData("RevokeReasonCard", null, false, null, null, false, null, null, new BodySection(singleCardLabel8, new n50.b.Title(new SingleCardLabel(labelB7, null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        } else {
            defaultSingleCardData = null;
        }
        PassportRevocationData revocationData2 = state.getData().getPassport().getRevocationData();
        if (revocationData2 != null) {
            SingleCardLabel singleCardLabel9 = new SingleCardLabel(this.labelProvider.c(mc3.a.f125591t), null, null, 0, 0, null, 62, null);
            fz.b.OffsetDateTime revocationDate = revocationData2.getRevocationDate();
            if (revocationDate == null || (labelB6 = mx.b.b(this.dateFormatter.d(revocationDate, fz.c.DOTTED), "")) == null) {
                labelB6 = Label.INSTANCE.b();
            }
            defaultSingleCardData2 = new DefaultSingleCardData("RevokeDateCard", null, false, null, null, false, null, null, new BodySection(singleCardLabel9, new n50.b.Title(new SingleCardLabel(labelB6, null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        } else {
            defaultSingleCardData2 = null;
        }
        SingleCardLabel singleCardLabel10 = new SingleCardLabel(this.labelProvider.c(mc3.a.f125589r), null, null, 0, 0, null, 62, null);
        fz.b.OffsetDateTime issueDate = state.getData().getPassport().getIssueDate();
        if (issueDate == null || (labelB4 = mx.b.b(this.dateFormatter.d(issueDate, fz.c.DOTTED), "")) == null) {
            labelB4 = Label.INSTANCE.b();
        }
        DefaultSingleCardData defaultSingleCardData13 = new DefaultSingleCardData("IssueDateCard", null, false, null, null, false, null, null, new BodySection(singleCardLabel10, new n50.b.Title(new SingleCardLabel(labelB4, null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null);
        SingleCardLabel singleCardLabel11 = new SingleCardLabel(this.labelProvider.c(mc3.a.f125590s), null, null, 0, 0, null, 62, null);
        StringBuilder sb8 = new StringBuilder();
        sb8.append(state.getData().getPassport().getIssuerNameFirstLine());
        String issuerNameSecondLine = state.getData().getPassport().getIssuerNameSecondLine();
        if (issuerNameSecondLine != null) {
            sb8.append("\n");
            sb8.append(issuerNameSecondLine);
        }
        CardListData cardListData = new CardListData(v.s(defaultSingleCardData3, defaultSingleCardData4, defaultSingleCardData5, defaultSingleCardData6, defaultSingleCardData7, defaultSingleCardData8, defaultSingleCardData9, defaultSingleCardData10, defaultSingleCardData11, defaultSingleCardData12, defaultSingleCardData, defaultSingleCardData2, defaultSingleCardData13, new DefaultSingleCardData("IssuerNameCard", null, false, null, null, false, null, null, new BodySection(singleCardLabel11, new n50.b.Title(new SingleCardLabel(mx.b.b(sb8.toString(), ""), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData("PassportTypeCard", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(mc3.a.f125594w), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(m(state.getData().getPassport().getType()), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null), new DefaultSingleCardData("CountryCodeCard", null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(mc3.a.f125588q), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(state.getData().getPassport().getCountryCode().name(), ""), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null)), null, false, null, null, 30, null);
        g type = state.getData().getPassport().getType();
        if (!state.getData().getIsPassportValid()) {
            type = null;
        }
        DefaultSingleCardData defaultSingleCardDataQ = type != null ? q(type, params.b()) : null;
        List<PassportDiplomaticData> listF = state.getData().getPassport().f();
        ArrayList arrayList = new ArrayList();
        Iterator it = listF.iterator();
        int i16 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i17 = i16 + 1;
            if (i16 < 0) {
                v.x();
            }
            PassportDiplomaticData passportDiplomaticData = (PassportDiplomaticData) next;
            String title = passportDiplomaticData.getTitle();
            if (title == null || title.length() == 0) {
                it = it;
                accordionData = null;
            } else {
                Label labelB8 = mx.b.b(title, "title");
                boolean z15 = this.isInPreview;
                List listC = v.c();
                String strE = e(passportDiplomaticData);
                if (strE != null) {
                    CustomPassportSingleCardContent customPassportSingleCardContent = new CustomPassportSingleCardContent(new SingleCardLabel(mx.b.b(strE, ""), null, null, 0, 0, null, 62, null), "CustomPassportSingleCard" + i16 + "InfoBox");
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append("AdditionalDataDescriptionCard");
                    sb9.append(i16);
                    listC.add(new CustomSingleCardData(sb9.toString(), customPassportSingleCardContent, null, false, null, null, false, null, 252, null));
                }
                String str = "AdditionalDataIssueDateCard" + i16;
                SingleCardLabel singleCardLabel12 = new SingleCardLabel(this.labelProvider.c(mc3.a.f125582n), null, null, 0, 0, null, 62, null);
                fz.b.LocalDate personalizationDate = passportDiplomaticData.getPersonalizationDate();
                if (personalizationDate == null || (labelB5 = mx.b.b(this.dateFormatter.d(personalizationDate, fz.c.DOTTED), "")) == null) {
                    labelB5 = Label.INSTANCE.b();
                }
                listC.add(new DefaultSingleCardData(str, null, false, null, null, false, null, null, new BodySection(singleCardLabel12, new n50.b.Title(new SingleCardLabel(labelB5, null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null));
                listC.add(new DefaultSingleCardData("AdditionalDataNumberCard" + i16, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(mc3.a.f125586p), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.d(passportDiplomaticData.getNumber(), ""), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3838, null));
                i0 i0Var3 = i0.f148189a;
                accordionData = new AccordionData(v.e(new AccordionElement(null, labelB8, null, z15, null, false, new yc3.b(new CardListData(v.a(listC), null, false, null, null, 30, null)), 21, null)));
            }
            if (accordionData != null) {
                arrayList.add(accordionData);
            }
            i16 = i17;
            it = it;
        }
        return new h.Data(baseScaffoldData, labelC, labelC2, cardListData, arrayList, defaultSingleCardDataQ, params.a());
    }
}
