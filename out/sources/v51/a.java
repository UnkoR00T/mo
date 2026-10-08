package v51;

import b30.AccordionData;
import b30.AccordionElement;
import bl0.BEChildBirthChildData;
import bl0.BEChildBirthParents;
import bl0.BEChildBirthPlaceOfBirthOffices;
import bl0.BEChildBirthRegistration;
import bl0.BEChildBirthRegistrationCivilRegistryOffices;
import bl0.BEGeneratedXmlChildBirth;
import bl0.d;
import bl0.m;
import bl0.s;
import fr.k;
import fr.t;
import g51.ReceiveDocumentAddressData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n31.RegistrationChildrenResult;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import oq.p;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import s51.AccordionDataLabeled;
import s51.g;
import s51.h;
import st3.AddressData;
import st3.AddressTerytDetail;
import t40.InfoRowListData;
import t51.b;
import x50.NavigationButtonData;
import x50.i;
import xw.PhoneNumber;
import xw.e;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002_aB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0015\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\f2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJA\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001b0\f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0\f2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J/\u00102\u001a\b\u0012\u0004\u0012\u00020\u001b0\f2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u000100H\u0002¢\u0006\u0004\b2\u00103J\u001d\u00106\u001a\b\u0012\u0004\u0012\u00020\u001b0\f2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J%\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001b0\f2\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J!\u0010A\u001a\u0004\u0018\u00010@2\u0006\u0010?\u001a\u00020>2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020@2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\bC\u0010DJ\u0019\u0010E\u001a\u0004\u0018\u00010@2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\bE\u0010DJ\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001b0\f2\u0006\u0010F\u001a\u00020\u001eH\u0002¢\u0006\u0004\bG\u0010HJ%\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001b0\f2\u0006\u0010F\u001a\u00020I2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\bJ\u0010KJ/\u0010O\u001a\u00020N2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010L\u001a\u00020\u00102\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001b0\fH\u0002¢\u0006\u0004\bO\u0010PJ3\u0010W\u001a\u00020V2\b\b\u0001\u0010Q\u001a\u00020\u00102\b\u0010R\u001a\u0004\u0018\u00010@2\u0006\u0010S\u001a\u00020@2\u0006\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bW\u0010XJ\u0013\u0010Z\u001a\u00020@*\u00020YH\u0002¢\u0006\u0004\bZ\u0010[J\u0018\u0010]\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b]\u0010^R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010b¨\u0006c"}, d2 = {"Lv51/a;", "Lxw/f;", "Lv51/a$a;", "Ls51/h$a;", "Lmx/c;", "labelProvider", "Lez/c;", "dateConverter", "<init>", "(Lmx/c;Lez/c;)V", "Lu51/a$a;", "summaryData", "", "Ls51/e;", "l", "(Lu51/a$a;)Ljava/util/List;", "", "index", "Lbl0/b;", "childData", "Lb30/a;", "i", "(Ljava/lang/Integer;Lu51/a$a;Lbl0/b;)Lb30/a;", "Lbl0/m;", "contactData", "Liy/b0;", "edorAddress", "Lv51/a$b;", "s", "(Lbl0/m;Liy/b0;)Ljava/util/List;", "Lbl0/h$a;", "personalData", "Lbl0/g;", "receiveDocumentsMethod", "Lg51/a;", "receiveDocumentAddressData", "Lbl0/l$a;", "chosenCivilRegistryOffice", "F", "(Lbl0/h$a;Lbl0/g;Lg51/a;Liy/b0;Lbl0/l$a;)Ljava/util/List;", "Lst3/b;", "addressData", "e", "(Lst3/b;)Ljava/util/List;", "Lxw/e;", "gender", "Lbl0/s;", "typeAddressChild", "Lq51/a$a;", "registeredAddressData", "r", "(Lxw/e;Lbl0/s;Lq51/a$a;)Ljava/util/List;", "Lbl0/f;", "placeOfBirthOffices", "m", "(Lbl0/f;)Ljava/util/List;", "Lc41/a$a;", "birthPlaceType", "Lf41/a$a;", "birthPlaceCity", "q", "(Lc41/a$a;Lf41/a$a;)Ljava/util/List;", "Lbl0/d;", "maritalStatusType", "", "x", "(Lbl0/d;Lxw/e;)Ljava/lang/String;", "v", "(Lbl0/d;)Ljava/lang/String;", "u", "data", "E", "(Lbl0/h$a;)Ljava/util/List;", "Lbl0/e;", "z", "(Lbl0/e;Lbl0/d;)Ljava/util/List;", "headerResId", "items", "Lb30/c;", "c", "(Ljava/lang/Integer;ILjava/util/List;)Lb30/c;", AnnotatedPrivateKey.LABEL, "value", "testTagSection", "Lj70/a;", "accessibilityReadMode", "Ln50/g;", "f", "(ILjava/lang/String;Ljava/lang/String;Lj70/a;)Ln50/g;", "Lbl0/u;", "h", "(Lbl0/u;)Ljava/lang/String;", "params", "G", "(Lv51/a$a;)Ls51/h$a;", "a", "Lmx/c;", "b", "Lez/c;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, h.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: v51.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, d2 = {"Lv51/a$a;", "", "Ls51/g;", "state", "Lkotlin/Function0;", "Loq/i0;", "onSend", "onClose", "onBack", "<init>", "(Ls51/g;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ls51/g;", "d", "()Ls51/g;", "b", "Ler/a;", "c", "()Ler/a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final g state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSend;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        public Params(g gVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = gVar;
            this.onSend = aVar;
            this.onClose = aVar2;
            this.onBack = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final er.a<i0> c() {
            return this.onSend;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final g getState() {
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
            return t.c(this.state, params.state) && t.c(this.onSend, params.onSend) && t.c(this.onClose, params.onClose) && t.c(this.onBack, params.onBack);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onSend.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onSend=" + this.onSend + ", onClose=" + this.onClose + ", onBack=" + this.onBack + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f204035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f204036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f204037c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f204038d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f204039e;

        static {
            int[] iArr = new int[bl0.t.values().length];
            try {
                iArr[bl0.t.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bl0.t.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f204035a = iArr;
            int[] iArr2 = new int[e.values().length];
            try {
                iArr2[e.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[e.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f204036b = iArr2;
            int[] iArr3 = new int[bl0.g.values().length];
            try {
                iArr3[bl0.g.InOffice.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[bl0.g.MyEdorBox.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[bl0.g.MyRegisteredAddress.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[bl0.g.SpecifiedAddress.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f204037c = iArr3;
            int[] iArr4 = new int[s.values().length];
            try {
                iArr4[s.MyPermanentAddress.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[s.MyTemporaryAddress.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[s.PermanentMotherAddress.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[s.TemporaryMotherAddress.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[s.MeAndMotherAreNotRegistered.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[s.DoesNotRegisterChild.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[s.PermanentFatherAddress.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[s.TemporaryFatherAddress.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[s.IAmNotRegistered.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[s.MeAndFatherAreNotRegistered.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            f204038d = iArr4;
            int[] iArr5 = new int[d.values().length];
            try {
                iArr5[d.InMarriage.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[d.NoMarriageAndAcceptChild.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[d.NoMarriageAndNoAcceptChild.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[d.MarriageEnded.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            f204039e = iArr5;
        }
    }

    public a(mx.c cVar, ez.c cVar2) {
        this.labelProvider = cVar;
        this.dateConverter = cVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<SummaryItem> E(BEChildBirthRegistration.BEApplicantData data) {
        SummaryItem summaryItem = new SummaryItem(j31.a.f99221u2, c0.e(data.getFirstName()), null, 4, null);
        int i15 = j31.a.T2;
        b0 secondName = data.getSecondName();
        SummaryItem summaryItem2 = new SummaryItem(i15, secondName != null ? c0.e(secondName) : null, null, 4, null);
        int i16 = j31.a.f99239y2;
        b0 nextNames = data.getNextNames();
        return v.q(summaryItem, summaryItem2, new SummaryItem(i16, nextNames != null ? c0.e(nextNames) : null, null, 4, null), new SummaryItem(j31.a.f99231w2, c0.e(data.getSurname()), null, 4, null), new SummaryItem(j31.a.f99216t2, c0.e(data.getFamilyName()), null, 4, null), new SummaryItem(j31.a.F2, c0.e(data.getPesel()), j70.a.LETTER_BY_LETTER), new SummaryItem(j31.a.V1, this.dateConverter.a(data.getBirthDate().getDate()), null, 4, null), new SummaryItem(j31.a.W1, c0.e(data.getBirthPlace()), null, 4, 0 == true ? 1 : 0), new SummaryItem(j31.a.f99156h2, c0.e(data.getNationality()), null, 4, null));
    }

    private final List<SummaryItem> F(BEChildBirthRegistration.BEApplicantData personalData, bl0.g receiveDocumentsMethod, ReceiveDocumentAddressData receiveDocumentAddressData, b0 edorAddress, BEChildBirthRegistrationCivilRegistryOffices.Office chosenCivilRegistryOffice) {
        int i15;
        b0 surname;
        b0 name;
        int i16 = j31.a.K1;
        mx.c cVar = this.labelProvider;
        int[] iArr = c.f204037c;
        int i17 = iArr[receiveDocumentsMethod.ordinal()];
        if (i17 == 1) {
            i15 = j31.a.R0;
        } else if (i17 == 2) {
            i15 = j31.a.P0;
        } else if (i17 == 3) {
            i15 = j31.a.S0;
        } else {
            if (i17 != 4) {
                throw new p();
            }
            i15 = j31.a.U0;
        }
        List listE = v.e(new SummaryItem(i16, cVar.c(i15).getText(), null, 4, null));
        ArrayList arrayList = new ArrayList();
        int i18 = iArr[receiveDocumentsMethod.ordinal()];
        if (i18 == 1) {
            arrayList.add(new SummaryItem(j31.a.Q0, chosenCivilRegistryOffice.getName(), null, 4, null));
        } else if (i18 != 2) {
            if (i18 != 3) {
                if (i18 != 4) {
                    throw new p();
                }
                String strE = null;
                SummaryItem summaryItem = new SummaryItem(j31.a.f99221u2, (receiveDocumentAddressData == null || (name = receiveDocumentAddressData.getName()) == null) ? null : c0.e(name), null, 4, null);
                int i19 = j31.a.f99231w2;
                if (receiveDocumentAddressData != null && (surname = receiveDocumentAddressData.getSurname()) != null) {
                    strE = c0.e(surname);
                }
                arrayList.addAll(v.q(summaryItem, new SummaryItem(i19, strE, null, 4, null)));
                if (receiveDocumentAddressData != null) {
                    arrayList.addAll(e(receiveDocumentAddressData.getAddress()));
                }
            } else if (receiveDocumentAddressData != null) {
                arrayList.addAll(v.q(new SummaryItem(j31.a.f99221u2, c0.e(personalData.getFirstName()), null, 4, null), new SummaryItem(j31.a.f99231w2, c0.e(personalData.getSurname()), null, 4, null)));
                arrayList.addAll(e(receiveDocumentAddressData.getAddress()));
            }
        }
        return v.L0(listE, arrayList);
    }

    private final AccordionElement c(Integer index, int headerResId, List<SummaryItem> items) {
        Label labelC = this.labelProvider.c(headerResId);
        Label labelE = index != null ? this.labelProvider.e(j31.a.f99123b, String.valueOf(index.intValue() + 1)) : null;
        List<SummaryItem> list = items;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        for (SummaryItem summaryItem : list) {
            arrayList.add(f(summaryItem.getLabelResId(), summaryItem.getValue(), this.labelProvider.c(headerResId).getTag(), summaryItem.getAccessibilityReadMode()));
        }
        return new AccordionElement(null, labelC, labelE, false, null, false, new b(arrayList), 25, null);
    }

    private final List<SummaryItem> e(AddressData addressData) {
        SummaryItem summaryItem = new SummaryItem(j31.a.L2, addressData.getProvince().getName(), null, 4, null);
        SummaryItem summaryItem2 = new SummaryItem(j31.a.f99186n2, addressData.getCounty().getName(), null, 4, null);
        SummaryItem summaryItem3 = new SummaryItem(j31.a.f99176l2, addressData.getCommunity().getName(), null, 4, null);
        SummaryItem summaryItem4 = new SummaryItem(j31.a.f99161i2, addressData.getCity().getName(), null, 4, null);
        SummaryItem summaryItem5 = new SummaryItem(j31.a.K2, addressData.getPostalCode(), null, 4, null);
        int i15 = j31.a.Z2;
        AddressTerytDetail street = addressData.getStreet();
        return v.q(summaryItem, summaryItem2, summaryItem3, summaryItem4, summaryItem5, new SummaryItem(i15, street != null ? street.getName() : null, null, 4, null), new SummaryItem(j31.a.Y1, addressData.getBuildingNumber(), null, 4, null), new SummaryItem(j31.a.U1, addressData.getApartmentNumber(), null, 4, null));
    }

    private final DefaultSingleCardData f(int label, String value, String testTagSection, j70.a accessibilityReadMode) {
        return new DefaultSingleCardData(testTagSection + this.labelProvider.c(label).getTag(), null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(label), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(Label.f(this.labelProvider.b(mx.b.d(value, "").getText(), label), "Value", null, 2, null), null, null, 0, 0, accessibilityReadMode, 30, null)), null, 4, null), null, null, null, 3838, null);
    }

    private final String h(BEGeneratedXmlChildBirth bEGeneratedXmlChildBirth) {
        if (bEGeneratedXmlChildBirth.getChildSecondName() == null) {
            return c0.e(bEGeneratedXmlChildBirth.getChildFirstName()) + ' ' + c0.e(bEGeneratedXmlChildBirth.getChildSurname());
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(c0.e(bEGeneratedXmlChildBirth.getChildFirstName()));
        sb5.append(' ');
        b0 childSecondName = bEGeneratedXmlChildBirth.getChildSecondName();
        sb5.append(childSecondName != null ? c0.e(childSecondName) : null);
        sb5.append(' ');
        sb5.append(c0.e(bEGeneratedXmlChildBirth.getChildSurname()));
        return sb5.toString();
    }

    private final AccordionData i(Integer index, u51.a.Data summaryData, BEChildBirthChildData childData) {
        int i15;
        int i16;
        int i17;
        b0 number;
        b0 place;
        b0 number2;
        b0 place2;
        b0 number3;
        b0 place3;
        b0 number4;
        b0 place4;
        e gender = summaryData.getApplicantData().getGender();
        int[] iArr = c.f204036b;
        int i18 = iArr[gender.ordinal()];
        if (i18 == 1) {
            i15 = j31.a.f99229w0;
        } else {
            if (i18 != 2) {
                throw new p();
            }
            i15 = j31.a.f99224v0;
        }
        AccordionElement accordionElementC = c(index, i15, E(summaryData.getApplicantData()));
        int i19 = iArr[summaryData.getApplicantData().getGender().ordinal()];
        if (i19 == 1) {
            i16 = j31.a.f99224v0;
        } else {
            if (i19 != 2) {
                throw new p();
            }
            i16 = j31.a.f99229w0;
        }
        AccordionElement accordionElementC2 = c(index, i16, z(summaryData.getParentData(), summaryData.getMaritalStatusType()));
        AccordionElement accordionElementC3 = c(index, j31.a.I1, v.e(new SummaryItem(j31.a.X2, x(summaryData.getMaritalStatusType(), summaryData.getApplicantData().getGender()), null, 4, null)));
        int i25 = j31.a.E0;
        int i26 = j31.a.I2;
        BEChildBirthParents.MarriageCertificate marriageCertificate = summaryData.getParentData().getMarriageCertificate();
        SummaryItem summaryItem = new SummaryItem(i26, (marriageCertificate == null || (place4 = marriageCertificate.getPlace()) == null) ? null : c0.e(place4), null, 4, null);
        int i27 = j31.a.D1;
        BEChildBirthParents.MarriageCertificate marriageCertificate2 = summaryData.getParentData().getMarriageCertificate();
        AccordionElement accordionElementC4 = summaryData.getParentData().getMarriageCertificate() != null ? c(index, i25, v.q(summaryItem, new SummaryItem(i27, (marriageCertificate2 == null || (number4 = marriageCertificate2.getNumber()) == null) ? null : c0.e(number4), null, 4, null))) : null;
        int i28 = j31.a.A0;
        int i29 = j31.a.I2;
        BEChildBirthParents.BirthCertificate fatherPlaceOfBirthCertificate = summaryData.getParentData().getFatherPlaceOfBirthCertificate();
        SummaryItem summaryItem2 = new SummaryItem(i29, (fatherPlaceOfBirthCertificate == null || (place3 = fatherPlaceOfBirthCertificate.getPlace()) == null) ? null : c0.e(place3), null, 4, null);
        int i35 = j31.a.D1;
        BEChildBirthParents.BirthCertificate fatherPlaceOfBirthCertificate2 = summaryData.getParentData().getFatherPlaceOfBirthCertificate();
        AccordionElement accordionElementC5 = summaryData.getParentData().getFatherPlaceOfBirthCertificate() != null ? c(index, i28, v.q(summaryItem2, new SummaryItem(i35, (fatherPlaceOfBirthCertificate2 == null || (number3 = fatherPlaceOfBirthCertificate2.getNumber()) == null) ? null : c0.e(number3), null, 4, null))) : null;
        int i36 = j31.a.F0;
        int i37 = j31.a.I2;
        BEChildBirthParents.BirthCertificate motherPlaceOfBirthCertificate = summaryData.getParentData().getMotherPlaceOfBirthCertificate();
        SummaryItem summaryItem3 = new SummaryItem(i37, (motherPlaceOfBirthCertificate == null || (place2 = motherPlaceOfBirthCertificate.getPlace()) == null) ? null : c0.e(place2), null, 4, null);
        int i38 = j31.a.D1;
        BEChildBirthParents.BirthCertificate motherPlaceOfBirthCertificate2 = summaryData.getParentData().getMotherPlaceOfBirthCertificate();
        AccordionElement accordionElementC6 = summaryData.getParentData().getMotherPlaceOfBirthCertificate() != null ? c(index, i36, v.q(summaryItem3, new SummaryItem(i38, (motherPlaceOfBirthCertificate2 == null || (number2 = motherPlaceOfBirthCertificate2.getNumber()) == null) ? null : c0.e(number2), null, 4, null))) : null;
        int i39 = iArr[summaryData.getApplicantData().getGender().ordinal()];
        if (i39 == 1) {
            i17 = j31.a.F0;
        } else {
            if (i39 != 2) {
                throw new p();
            }
            i17 = j31.a.A0;
        }
        int i45 = j31.a.I2;
        BEChildBirthParents.BirthCertificate yourBirthPlaceOfBirthCertificate = summaryData.getParentData().getYourBirthPlaceOfBirthCertificate();
        SummaryItem summaryItem4 = new SummaryItem(i45, (yourBirthPlaceOfBirthCertificate == null || (place = yourBirthPlaceOfBirthCertificate.getPlace()) == null) ? null : c0.e(place), null, 4, null);
        int i46 = j31.a.D1;
        BEChildBirthParents.BirthCertificate yourBirthPlaceOfBirthCertificate2 = summaryData.getParentData().getYourBirthPlaceOfBirthCertificate();
        int i47 = 4;
        k kVar = null;
        j70.a aVar = null;
        return new AccordionData(v.s(accordionElementC, accordionElementC2, accordionElementC3, accordionElementC4, accordionElementC5, accordionElementC6, summaryData.getParentData().getYourBirthPlaceOfBirthCertificate() != null ? c(index, i17, v.q(summaryItem4, new SummaryItem(i46, (yourBirthPlaceOfBirthCertificate2 == null || (number = yourBirthPlaceOfBirthCertificate2.getNumber()) == null) ? null : c0.e(number), null, 4, null))) : null, c(index, j31.a.G1, v.q(new SummaryItem(j31.a.f99221u2, c0.e(childData.getName()), aVar, i47, kVar), new SummaryItem(j31.a.T2, c0.e(childData.getSecondName()), aVar, i47, kVar), new SummaryItem(j31.a.f99231w2, c0.e(childData.getSurname()), aVar, i47, kVar), new SummaryItem(j31.a.V1, this.dateConverter.a(childData.getBirthDate().getDate()), aVar, i47, kVar), new SummaryItem(j31.a.f99156h2, c0.e(childData.getNationality()), aVar, i47, kVar))), c(index, j31.a.F1, q(summaryData.getBirthPlaceType(), summaryData.getBirthPlaceCity())), c(index, j31.a.L1, m(summaryData.getRegistrationOffice())), c(index, j31.a.H1, r(summaryData.getApplicantData().getGender(), summaryData.getTypeAddressChild(), summaryData.getRegisteredAddress())), c(index, j31.a.J1, F(summaryData.getApplicantData(), summaryData.getReceivedDocumentsMethod(), summaryData.getReceiveDocumentAddress(), summaryData.getEdorAddress(), summaryData.getRegistrationOffice().getChosenCivilRegistryOffice())), c(index, j31.a.f99181m2, s(summaryData.getContactData(), summaryData.getEdorAddress()))));
    }

    private final List<AccordionDataLabeled> l(u51.a.Data summaryData) {
        int i15 = 0;
        boolean z15 = summaryData.d().size() > 1;
        List<BEChildBirthChildData> listD = summaryData.d();
        ArrayList arrayList = new ArrayList(v.y(listD, 10));
        for (Object obj : listD) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            BEChildBirthChildData bEChildBirthChildData = (BEChildBirthChildData) obj;
            Integer numValueOf = null;
            Label labelB = z15 ? mx.b.b(this.labelProvider.c(j31.a.O2).getText() + Label.INSTANCE.d().getText() + i16, "subtitle_" + i16) : null;
            if (z15) {
                numValueOf = Integer.valueOf(i15);
            }
            arrayList.add(new AccordionDataLabeled(labelB, i(numValueOf, summaryData, bEChildBirthChildData)));
            i15 = i16;
        }
        return arrayList;
    }

    private final List<SummaryItem> m(BEChildBirthPlaceOfBirthOffices placeOfBirthOffices) {
        return v.q(new SummaryItem(j31.a.M1, placeOfBirthOffices.getChosenMunicipalOffice().getName(), null, 4, null), new SummaryItem(j31.a.N1, placeOfBirthOffices.getChosenCivilRegistryOffice().getName(), null, 4, null));
    }

    private final List<SummaryItem> q(c41.a.InterfaceC0617a birthPlaceType, f41.a.Data birthPlaceCity) {
        List<SummaryItem> listT = v.t(new SummaryItem(j31.a.L2, birthPlaceCity.getProvince().getName(), null, 4, null), new SummaryItem(j31.a.f99186n2, birthPlaceCity.getCounty().getName(), null, 4, null), new SummaryItem(j31.a.f99176l2, birthPlaceCity.getCommunity().getName(), null, 4, null), new SummaryItem(j31.a.f99161i2, birthPlaceCity.getCity().getName(), null, 4, null));
        if (birthPlaceType instanceof c41.a.InterfaceC0617a.MedicalCenter) {
            listT.add(new SummaryItem(j31.a.E1, ((c41.a.InterfaceC0617a.MedicalCenter) birthPlaceType).getFacilityName(), null, 4, null));
        }
        return listT;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    private final List<SummaryItem> r(e gender, s typeAddressChild, q51.a.Data registeredAddressData) {
        Integer numValueOf;
        fz.b.LocalDate temporaryAddressEndDate;
        AddressData addressData;
        AddressData addressData2;
        AddressData addressData3;
        AddressTerytDetail street;
        AddressData addressData4;
        AddressData addressData5;
        AddressTerytDetail city;
        AddressData addressData6;
        AddressTerytDetail community;
        AddressData addressData7;
        AddressTerytDetail county;
        AddressData addressData8;
        AddressTerytDetail province;
        int i15 = c.f204036b[gender.ordinal()];
        if (i15 == 1) {
            int i16 = c.f204038d[typeAddressChild.ordinal()];
            if (i16 == 1) {
                numValueOf = Integer.valueOf(j31.a.f99175l1);
            } else if (i16 != 2) {
                switch (i16) {
                    case 6:
                        numValueOf = Integer.valueOf(j31.a.P1);
                        break;
                    case 7:
                        numValueOf = Integer.valueOf(j31.a.f99180m1);
                        break;
                    case 8:
                        numValueOf = Integer.valueOf(j31.a.R1);
                        break;
                    case 9:
                        numValueOf = Integer.valueOf(j31.a.S);
                        break;
                    case 10:
                        numValueOf = Integer.valueOf(j31.a.H);
                        break;
                    default:
                        numValueOf = null;
                        break;
                }
            } else {
                numValueOf = Integer.valueOf(j31.a.f99200q1);
            }
        } else {
            if (i15 != 2) {
                throw new p();
            }
            switch (c.f204038d[typeAddressChild.ordinal()]) {
                case 1:
                    numValueOf = Integer.valueOf(j31.a.f99175l1);
                    break;
                case 2:
                    numValueOf = Integer.valueOf(j31.a.f99200q1);
                    break;
                case 3:
                    numValueOf = Integer.valueOf(j31.a.Q1);
                    break;
                case 4:
                    numValueOf = Integer.valueOf(j31.a.S1);
                    break;
                case 5:
                    numValueOf = Integer.valueOf(j31.a.f99232x);
                    break;
                case 6:
                    numValueOf = Integer.valueOf(j31.a.P1);
                    break;
                default:
                    numValueOf = null;
                    break;
            }
        }
        List listS = v.s(new SummaryItem(j31.a.L2, (registeredAddressData == null || (addressData8 = registeredAddressData.getAddressData()) == null || (province = addressData8.getProvince()) == null) ? null : province.getName(), null, 4, null), new SummaryItem(j31.a.f99186n2, (registeredAddressData == null || (addressData7 = registeredAddressData.getAddressData()) == null || (county = addressData7.getCounty()) == null) ? null : county.getName(), null, 4, null), new SummaryItem(j31.a.f99176l2, (registeredAddressData == null || (addressData6 = registeredAddressData.getAddressData()) == null || (community = addressData6.getCommunity()) == null) ? null : community.getName(), null, 4, null), new SummaryItem(j31.a.f99161i2, (registeredAddressData == null || (addressData5 = registeredAddressData.getAddressData()) == null || (city = addressData5.getCity()) == null) ? null : city.getName(), null, 4, null), new SummaryItem(j31.a.K2, (registeredAddressData == null || (addressData4 = registeredAddressData.getAddressData()) == null) ? null : addressData4.getPostalCode(), null, 4, null), new SummaryItem(j31.a.Z2, (registeredAddressData == null || (addressData3 = registeredAddressData.getAddressData()) == null || (street = addressData3.getStreet()) == null) ? null : street.getName(), null, 4, null), new SummaryItem(j31.a.Y1, (registeredAddressData == null || (addressData2 = registeredAddressData.getAddressData()) == null) ? null : addressData2.getBuildingNumber(), null, 4, null), new SummaryItem(j31.a.U1, (registeredAddressData == null || (addressData = registeredAddressData.getAddressData()) == null) ? null : addressData.getApartmentNumber(), null, 4, null), (registeredAddressData == null || (temporaryAddressEndDate = registeredAddressData.getTemporaryAddressEndDate()) == null) ? null : new SummaryItem(j31.a.f99165j1, this.dateConverter.a(temporaryAddressEndDate.getDate()), null, 4, null));
        int i17 = c.f204038d[typeAddressChild.ordinal()];
        boolean z15 = (i17 == 5 || i17 == 6 || i17 == 9 || i17 == 10) ? false : true;
        List<SummaryItem> listE = v.e(new SummaryItem(j31.a.O1, numValueOf != null ? this.labelProvider.c(numValueOf.intValue()).getText() : null, null, 4, null));
        if (z15) {
            return v.L0(listE, listS);
        }
        if (z15) {
            throw new p();
        }
        return listE;
    }

    private final List<SummaryItem> s(m contactData, b0 edorAddress) {
        String str;
        boolean z15 = contactData instanceof m.EmailOrPhone;
        m.EmailOrPhone emailOrPhone = z15 ? (m.EmailOrPhone) contactData : null;
        b0 email = emailOrPhone != null ? emailOrPhone.getEmail() : null;
        m.EmailOrPhone emailOrPhone2 = z15 ? (m.EmailOrPhone) contactData : null;
        PhoneNumber phoneNumber = emailOrPhone2 != null ? emailOrPhone2.getPhoneNumber() : null;
        SummaryItem summaryItem = new SummaryItem(j31.a.f99201q2, email != null ? c0.e(email) : null, null, 4, null);
        int i15 = j31.a.H2;
        boolean z16 = phoneNumber == null;
        if (z16) {
            str = null;
        } else {
            if (z16) {
                throw new p();
            }
            str = c0.e(phoneNumber.h()) + c0.e(phoneNumber.g());
        }
        List<SummaryItem> listT = v.t(summaryItem, new SummaryItem(i15, str, null, 4, null), edorAddress != null ? new SummaryItem(j31.a.f99196p2, c0.e(edorAddress), null, 4, null) : null);
        ArrayList arrayList = new ArrayList();
        for (SummaryItem summaryItem2 : listT) {
            if (summaryItem2 != null) {
                arrayList.add(summaryItem2);
            }
        }
        return arrayList;
    }

    private final String u(d maritalStatusType) {
        int i15 = c.f204039e[maritalStatusType.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(j31.a.f99164j0).getText();
        }
        if (i15 == 2) {
            return this.labelProvider.c(j31.a.f99169k0).getText();
        }
        if (i15 != 4) {
            return null;
        }
        return this.labelProvider.c(j31.a.f99174l0).getText();
    }

    private final String v(d maritalStatusType) {
        int i15;
        mx.c cVar = this.labelProvider;
        int i16 = c.f204039e[maritalStatusType.ordinal()];
        if (i16 == 1) {
            i15 = j31.a.f99199q0;
        } else if (i16 == 2) {
            i15 = j31.a.f99209s0;
        } else if (i16 == 3) {
            i15 = j31.a.f99214t0;
        } else {
            if (i16 != 4) {
                throw new p();
            }
            i15 = j31.a.f99204r0;
        }
        return cVar.c(i15).getText();
    }

    private final String x(d maritalStatusType, e gender) {
        int i15 = c.f204036b[gender.ordinal()];
        if (i15 == 1) {
            return v(maritalStatusType);
        }
        if (i15 == 2) {
            return u(maritalStatusType);
        }
        throw new p();
    }

    private final List<SummaryItem> z(BEChildBirthParents data, d maritalStatusType) {
        b0 citizenship;
        b0 placeOfBirth;
        fz.b.LocalDate dateOfBirth;
        b0 pesel;
        b0 familyName;
        b0 lastName;
        b0 nextName;
        b0 secondName;
        b0 firstName;
        int i15 = j31.a.f99221u2;
        BEChildBirthParents.SecondParent secondParent = data.getSecondParent();
        String strE = null;
        List<SummaryItem> listE = v.e(new SummaryItem(i15, (secondParent == null || (firstName = secondParent.getFirstName()) == null) ? null : c0.e(firstName), null, 4, null));
        if (maritalStatusType == d.NoMarriageAndNoAcceptChild) {
            return listE;
        }
        int i16 = j31.a.T2;
        BEChildBirthParents.SecondParent secondParent2 = data.getSecondParent();
        SummaryItem summaryItem = new SummaryItem(i16, (secondParent2 == null || (secondName = secondParent2.getSecondName()) == null) ? null : c0.e(secondName), null, 4, null);
        int i17 = j31.a.f99239y2;
        BEChildBirthParents.SecondParent secondParent3 = data.getSecondParent();
        SummaryItem summaryItem2 = new SummaryItem(i17, (secondParent3 == null || (nextName = secondParent3.getNextName()) == null) ? null : c0.e(nextName), null, 4, null);
        int i18 = j31.a.f99231w2;
        BEChildBirthParents.SecondParent secondParent4 = data.getSecondParent();
        SummaryItem summaryItem3 = new SummaryItem(i18, (secondParent4 == null || (lastName = secondParent4.getLastName()) == null) ? null : c0.e(lastName), null, 4, null);
        int i19 = j31.a.f99216t2;
        BEChildBirthParents.SecondParent secondParent5 = data.getSecondParent();
        SummaryItem summaryItem4 = new SummaryItem(i19, (secondParent5 == null || (familyName = secondParent5.getFamilyName()) == null) ? null : c0.e(familyName), null, 4, null);
        int i25 = j31.a.F2;
        BEChildBirthParents.SecondParent secondParent6 = data.getSecondParent();
        SummaryItem summaryItem5 = new SummaryItem(i25, (secondParent6 == null || (pesel = secondParent6.getPesel()) == null) ? null : c0.e(pesel), j70.a.LETTER_BY_LETTER);
        int i26 = j31.a.V1;
        BEChildBirthParents.SecondParent secondParent7 = data.getSecondParent();
        SummaryItem summaryItem6 = new SummaryItem(i26, (secondParent7 == null || (dateOfBirth = secondParent7.getDateOfBirth()) == null) ? null : this.dateConverter.a(dateOfBirth.getDate()), null, 4, null);
        int i27 = j31.a.W1;
        BEChildBirthParents.SecondParent secondParent8 = data.getSecondParent();
        SummaryItem summaryItem7 = new SummaryItem(i27, (secondParent8 == null || (placeOfBirth = secondParent8.getPlaceOfBirth()) == null) ? null : c0.e(placeOfBirth), null, 4, null);
        int i28 = j31.a.f99156h2;
        BEChildBirthParents.SecondParent secondParent9 = data.getSecondParent();
        if (secondParent9 != null && (citizenship = secondParent9.getCitizenship()) != null) {
            strE = c0.e(citizenship);
        }
        return v.L0(listE, v.q(summaryItem, summaryItem2, summaryItem3, summaryItem4, summaryItem5, summaryItem6, summaryItem7, new SummaryItem(i28, strE, null, 4, null)));
    }

    @Override // er.l
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public h.a b(Params params) {
        int i15;
        r50.g gVar;
        Label labelE;
        Label labelC;
        Label labelC2;
        Label labelC3;
        mx.c cVar = this.labelProvider;
        g state = params.getState();
        if (state instanceof g.b.Error) {
            return new h.a.Error(((g.b.Error) state).getErrorVMSAdapter());
        }
        if (state instanceof g.a.Error) {
            return new h.a.Error(((g.a.Error) state).getErrorVMSAdapter());
        }
        int i16 = 2;
        if (state instanceof g.b.Content) {
            return new h.a.Summary(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), cVar.c(j31.a.f99127b3), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null), cVar.c(j31.a.f99131c2), l(((g.b.Content) params.getState()).getSummaryData()), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(cVar.c(j31.a.W2), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null), params.a());
        }
        if (!(state instanceof g.a.Content)) {
            throw new p();
        }
        g.a.Content content = (g.a.Content) state;
        boolean zD = content.getResult().d();
        if (zD) {
            boolean z15 = content.getResult().c().size() > 1;
            boolean z16 = content.getResult().getInstitutionName() == null;
            if (z16) {
                labelE = null;
            } else {
                if (z16) {
                    throw new p();
                }
                labelE = cVar.e(j31.a.f99238y1, content.getResult().getInstitutionName());
            }
            er.a<i0> aVarA = params.a();
            BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), null, null, null, null, 30, null), null, null, null, null, 61, null);
            j.b.c cVar2 = j.b.c.f164688d;
            if (z15) {
                labelC = cVar.c(j31.a.Q2);
            } else {
                if (z15) {
                    throw new p();
                }
                labelC = cVar.c(j31.a.P2);
            }
            Label label = labelC;
            t40.a.C4874a c4874a = labelE != null ? new t40.a.C4874a(labelE) : null;
            if (z15) {
                labelC2 = cVar.c(j31.a.A1);
            } else {
                if (z15) {
                    throw new p();
                }
                labelC2 = cVar.c(j31.a.f99242z1);
            }
            t40.a.C4874a c4874a2 = new t40.a.C4874a(labelC2);
            if (z15) {
                labelC3 = cVar.c(j31.a.C1);
            } else {
                if (z15) {
                    throw new p();
                }
                labelC3 = cVar.c(j31.a.B1);
            }
            return new h.a.Result(aVarA, baseScaffoldData, new IconPageData(cVar2, label, null, null, new t51.c.AllSuccess(new InfoRowListData(v.s(c4874a, c4874a2, new t40.a.C4874a(labelC3)))), new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(cVar.c(j31.a.f99171k2), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null), null, null, 6, null), true, 12, null));
        }
        if (zD) {
            throw new p();
        }
        er.a<i0> aVarA2 = params.a();
        BaseScaffoldData baseScaffoldData2 = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), null, null, null, null, 30, null), null, null, null, null, 61, null);
        j.b.d dVar = j.b.d.f164690d;
        Label labelC4 = cVar.c(j31.a.f99225v1);
        List<RegistrationChildrenResult.Child> listC = content.getResult().c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        int i17 = 0;
        for (Object obj : listC) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                v.x();
            }
            RegistrationChildrenResult.Child child = (RegistrationChildrenResult.Child) obj;
            String str = "child_" + i17;
            bl0.t status = child.getStatus();
            int[] iArr = c.f204035a;
            int i19 = iArr[status.ordinal()];
            if (i19 == 1) {
                i15 = j31.a.f99234x1;
            } else {
                if (i19 != i16) {
                    throw new p();
                }
                i15 = j31.a.f99230w1;
            }
            SingleCardLabel singleCardLabel = new SingleCardLabel(cVar.c(i15), null, null, 0, 0, null, 62, null);
            Label labelB = mx.b.b(h(child.getXml()), "name");
            int i25 = iArr[child.getStatus().ordinal()];
            if (i25 == 1) {
                gVar = r50.g.POSITIVE;
            } else {
                if (i25 != 2) {
                    throw new p();
                }
                gVar = r50.g.NEGATIVE;
            }
            arrayList.add(new DefaultSingleCardData(str, null, false, null, null, false, null, null, new BodySection(singleCardLabel, new n50.b.StatusBadge(new r50.a.WithIcon(null, labelB, null, 0, false, gVar, 13, null)), null, 4, null), null, null, null, 3838, null));
            i17 = i18;
            i16 = 2;
        }
        return new h.a.Result(aVarA2, baseScaffoldData2, new IconPageData(dVar, labelC4, null, null, new t51.c.PartialSuccess(new CardListData(arrayList, null, false, null, null, 30, null)), new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(j31.a.f99132c3), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(j31.a.f99171k2), null, 2, null), new k30.d.Secondary(null, 1, null), null, params.b(), 35, null), null, 4, null), true, 12, null));
    }

    /* JADX INFO: renamed from: v51.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lv51/a$b;", "", "", "labelResId", "", "value", "Lj70/a;", "accessibilityReadMode", "<init>", "(ILjava/lang/String;Lj70/a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "c", "Lj70/a;", "()Lj70/a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final /* data */ class SummaryItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int labelResId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final j70.a accessibilityReadMode;

        public SummaryItem(int i15, String str, j70.a aVar) {
            this.labelResId = i15;
            this.value = str;
            this.accessibilityReadMode = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final j70.a getAccessibilityReadMode() {
            return this.accessibilityReadMode;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getLabelResId() {
            return this.labelResId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SummaryItem)) {
                return false;
            }
            SummaryItem summaryItem = (SummaryItem) other;
            return this.labelResId == summaryItem.labelResId && t.c(this.value, summaryItem.value) && this.accessibilityReadMode == summaryItem.accessibilityReadMode;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.labelResId) * 31;
            String str = this.value;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.accessibilityReadMode.hashCode();
        }

        public String toString() {
            return "SummaryItem(labelResId=" + this.labelResId + ", value=" + this.value + ", accessibilityReadMode=" + this.accessibilityReadMode + ')';
        }

        public /* synthetic */ SummaryItem(int i15, String str, j70.a aVar, int i16, k kVar) {
            this(i15, str, (i16 & 4) != 0 ? j70.a.LOWER_CASE : aVar);
        }
    }
}
