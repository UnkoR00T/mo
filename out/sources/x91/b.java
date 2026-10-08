package x91;

import al0.s0;
import al0.z;
import cl0.j0;
import er.l;
import ez.e;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import i61.ParentFormData;
import i61.q;
import i61.r;
import iy.b0;
import iy.c0;
import java.time.LocalDate;
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
import ru3.ContactDetailsData;
import t40.InfoRowListData;
import w30.CheckBoxSingleData;
import w91.d;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002XVB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b!\u0010\"J%\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010#\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J'\u00100\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0004\b0\u00101J7\u00104\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0006\u00103\u001a\u0002022\u0006\u0010#\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b4\u00105J\u00ad\u0001\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u000e\u00106\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00142\u0006\u00107\u001a\u00020\u00122\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00142\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00142\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00142\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00142\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00142\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00142\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00142\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014H\u0002¢\u0006\u0004\b@\u0010AJ1\u0010G\u001a\u0004\u0018\u00010F2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00142\u0006\u0010C\u001a\u00020\u00122\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020I2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\bJ\u0010KJ\u0019\u0010L\u001a\u00020I2\b\u0010/\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0004\bL\u0010MJ)\u0010P\u001a\u00020O2\b\u0010N\u001a\u0004\u0018\u00010(2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020F2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\bR\u0010SJ\u0018\u0010T\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\bT\u0010UR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010Y¨\u0006Z"}, d2 = {"Lx91/b;", "Lxw/f;", "Lx91/b$b;", "Lw91/d$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lw91/c$b;", "state", "params", "Lw91/d$a$c;", "r", "(Lw91/c$b;Lx91/b$b;)Lw91/d$a$c;", "Lal0/s0;", "passportType", "", "office", "", "Ln50/g;", "u", "(Lal0/s0;Ljava/lang/String;)Ljava/util/List;", "Li61/p;", "parentData", "Ln50/k;", "v", "(Li61/p;)Ljava/util/List;", "Lcl0/i0;", "childData", "Liy/b0;", "birthPlaceInput", "i", "(Lcl0/i0;Liy/b0;)Ljava/util/List;", "country", "Li61/d;", "correspondenceData", "m", "(Ljava/lang/String;Li61/d;)Ljava/util/List;", "Lru3/b;", "contactDetails", "E", "(Lru3/b;)Ljava/util/List;", "Li61/l;", "discountType", "Li61/q;", "paymentType", "x", "(Li61/l;Li61/q;)Ljava/util/List;", "Li61/r;", "pickupMethod", "F", "(Li61/r;Ljava/lang/String;Li61/d;Li61/p;)Ljava/util/List;", "temporaryPassportEligibility", "photo", "photoWithGlassesEligibility", "photoWithFaceCoverEligibility", "otherParentConsent", "otherParentNoConsentReason", "paymentConfirmation", "technicalIssueConfirmation", "abroadTreatmentConfirmation", "kdrConfirmation", "f", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "attachmentsNames", "testTag", "", "infoLabelRes", "Lx91/b$a;", "h", "(Ljava/util/List;Ljava/lang/String;I)Lx91/b$a;", "Lmx/a;", "q", "(Li61/l;)Lmx/a;", "z", "(Li61/q;)Lmx/a;", "contactData", "Ln30/b;", "l", "(Lru3/b;Ljava/lang/String;Li61/d;)Ln30/b;", "e", "(Li61/d;)Lx91/b$a;", "G", "(Lx91/b$b;)Lw91/d$a;", "a", "Lmx/c;", "b", "Lez/e;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: x91.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b \u0010\u001fR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b\"\u0010\u001fR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b!\u0010\u001f¨\u0006&"}, d2 = {"Lx91/b$b;", "", "Lw91/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "onCloseAction", "onCloseWithoutDialogAction", "Lkotlin/Function1;", "", "setStatementStateValueAction", "onSendAction", "onScrolledToStatementCheckbox", "<init>", "(Lw91/c;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lw91/c;", "g", "()Lw91/c;", "b", "Ler/a;", "()Ler/a;", "c", "d", "e", "Ler/l;", "f", "()Ler/l;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final w91.c state;

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
        public Params(w91.c cVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, l<? super Boolean, i0> lVar, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = cVar;
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
        public final w91.c getState() {
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
        public static final /* synthetic */ int[] f217605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f217606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f217607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f217608d;

        static {
            int[] iArr = new int[z.values().length];
            try {
                iArr[z.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[z.FEMALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f217605a = iArr;
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
            f217606b = iArr2;
            int[] iArr3 = new int[cl0.d.values().length];
            try {
                iArr3[cl0.d.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[cl0.d.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[cl0.d.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            f217607c = iArr3;
            int[] iArr4 = new int[i61.l.values().length];
            try {
                iArr4[i61.l.SCHOOL_AGED_CHILDREN.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[i61.l.KDR_OWNERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[i61.l.TECHNICAL_ISSUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[i61.l.CHILD_TREATED_ABROAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[i61.l.TEMPORARY_PASSPORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            f217608d = iArr4;
        }
    }

    public b(mx.c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final List<DefaultSingleCardData> E(ContactDetailsData contactDetails) {
        ChildPassportApplicationCards childPassportApplicationCards = new ChildPassportApplicationCards("contactTypeCard", this.labelProvider.c(w51.a.f210371l3), this.labelProvider.c(w51.a.f210385n3).getText(), null, 8, null);
        ChildPassportApplicationCards childPassportApplicationCards2 = new ChildPassportApplicationCards("contactPhoneCard", this.labelProvider.c(w51.a.f210428t4), contactDetails.getPhoneNumber().f(), null, 8, null);
        if (c0.e(contactDetails.getPhoneNumber().g()).length() <= 0) {
            childPassportApplicationCards2 = null;
        }
        List listS = v.s(childPassportApplicationCards, childPassportApplicationCards2, c0.e(contactDetails.getEmailAddress()).length() > 0 ? new ChildPassportApplicationCards("contactEmailCard", this.labelProvider.c(w51.a.T3), c0.e(contactDetails.getEmailAddress()), null, 8, null) : null);
        ArrayList arrayList = new ArrayList(v.y(listS, 10));
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            arrayList.add(((ChildPassportApplicationCards) it.next()).a());
        }
        return arrayList;
    }

    private final List<DefaultSingleCardData> F(r pickupMethod, String country, i61.d correspondenceData, ParentFormData parentData) {
        String address;
        ChildPassportApplicationCards childPassportApplicationCards = new ChildPassportApplicationCards("pickupMethodCard", this.labelProvider.c(w51.a.f210350i3), this.labelProvider.c(w51.a.f210357j3).getText(), null, 8, null);
        ChildPassportApplicationCards childPassportApplicationCards2 = new ChildPassportApplicationCards("correspondenceCountryCard", this.labelProvider.c(w51.a.S3), country, null, 8, null);
        if (correspondenceData instanceof i61.d.Domestic) {
            address = st3.c.a(((i61.d.Domestic) correspondenceData).getAddressData());
        } else {
            if (!(correspondenceData instanceof i61.d.Foreign)) {
                throw new p();
            }
            address = ((i61.d.Foreign) correspondenceData).getAddress();
        }
        List listQ = v.q(childPassportApplicationCards, childPassportApplicationCards2, new ChildPassportApplicationCards("correspondenceAddressCard", this.labelProvider.c(w51.a.E3), address, null, 8, null), new ChildPassportApplicationCards("recipientNameCard", this.labelProvider.c(w51.a.f210343h3), c0.e(parentData.getParentData().getFirstName()) + ' ' + c0.e(parentData.getParentData().getSurname()), null, 8, null));
        if (pickupMethod != r.DELIVERY) {
            listQ = null;
        }
        if (listQ == null) {
            return null;
        }
        List list = listQ;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ChildPassportApplicationCards) it.next()).a());
        }
        return arrayList;
    }

    private final ChildPassportApplicationCards e(i61.d correspondenceData) {
        String address;
        if (correspondenceData instanceof i61.d.Domestic) {
            address = st3.c.a(((i61.d.Domestic) correspondenceData).getAddressData());
        } else {
            if (!(correspondenceData instanceof i61.d.Foreign)) {
                throw new p();
            }
            address = ((i61.d.Foreign) correspondenceData).getAddress();
        }
        return new ChildPassportApplicationCards("correspondenceAddressCard", this.labelProvider.c(w51.a.E3), address, null, 8, null);
    }

    private final List<DefaultSingleCardData> f(List<String> temporaryPassportEligibility, String photo, List<String> photoWithGlassesEligibility, List<String> photoWithFaceCoverEligibility, List<String> otherParentConsent, List<String> otherParentNoConsentReason, List<String> paymentConfirmation, List<String> technicalIssueConfirmation, List<String> abroadTreatmentConfirmation, List<String> kdrConfirmation) {
        List listS = v.s(h(temporaryPassportEligibility, "temporaryPassportEligibilityProofCard", w51.a.f210301b3), new ChildPassportApplicationCards("photoCard", this.labelProvider.c(w51.a.f210294a3), photo, null, 8, null), h(photoWithGlassesEligibility, "photoWithGlassesEligibilityCard", w51.a.W2), h(photoWithFaceCoverEligibility, "photoWithFaceCoverEligibilityCard", w51.a.X2), h(otherParentConsent, "otherParentConsentCard", w51.a.f210308c3), h(otherParentNoConsentReason, "otherParentNoConsentReasonCard", w51.a.f210315d3), h(paymentConfirmation, "paymentConfirmationReasonCard", w51.a.Z2), h(technicalIssueConfirmation, "technicalIssueConfirmationCard", w51.a.f210322e3), h(abroadTreatmentConfirmation, "abroadTreatmentConfirmationCard", w51.a.f210329f3), h(kdrConfirmation, "kdrConfirmationCard", w51.a.Y2));
        ArrayList arrayList = new ArrayList(v.y(listS, 10));
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            arrayList.add(((ChildPassportApplicationCards) it.next()).a());
        }
        return arrayList;
    }

    private final ChildPassportApplicationCards h(List<String> attachmentsNames, String testTag, int infoLabelRes) {
        if (attachmentsNames != null) {
            return new ChildPassportApplicationCards(testTag, this.labelProvider.c(infoLabelRes), attachmentsNames.isEmpty() ? "-" : v.v0(attachmentsNames, "\n", null, null, 0, null, null, 62, null), null, 8, null);
        }
        return null;
    }

    private final List<DefaultSingleCardData> i(cl0.i0 childData, b0 birthPlaceInput) {
        String strD;
        LocalDate date;
        b0 firstName = childData.getFirstName();
        ChildPassportApplicationCards childPassportApplicationCards = firstName != null ? new ChildPassportApplicationCards("childFirstNameCard", this.labelProvider.c(w51.a.f210337g4), c0.e(firstName), null, 8, null) : null;
        b0 secondName = childData.getSecondName();
        ChildPassportApplicationCards childPassportApplicationCards2 = secondName != null ? new ChildPassportApplicationCards("childSecondNameCard", this.labelProvider.c(w51.a.f210468z4), c0.e(secondName), null, 8, null) : null;
        b0 otherName = childData.getOtherName();
        ChildPassportApplicationCards childPassportApplicationCards3 = otherName != null ? new ChildPassportApplicationCards("childNextNamesCard", this.labelProvider.c(w51.a.f210372l4), c0.e(otherName), null, 8, null) : null;
        b0 lastName = childData.getLastName();
        ChildPassportApplicationCards childPassportApplicationCards4 = lastName != null ? new ChildPassportApplicationCards("childLastNameCard", this.labelProvider.c(w51.a.f210358j4), c0.e(lastName), null, 8, null) : null;
        ChildPassportApplicationCards childPassportApplicationCards5 = new ChildPassportApplicationCards("childPeselNumberCard", this.labelProvider.c(w51.a.f210421s4), c0.e(childData.getPesel()), j70.a.LETTER_BY_LETTER);
        Label labelC = this.labelProvider.c(w51.a.G3);
        fz.b.LocalDate birthDate = childData.getBirthDate();
        if (birthDate == null || (date = birthDate.getDate()) == null || (strD = this.dateFormatter.d(new fz.b.LocalDate(date), fz.c.DOTTED)) == null) {
            strD = "";
        }
        ChildPassportApplicationCards childPassportApplicationCards6 = new ChildPassportApplicationCards("childBirthDateCard", labelC, strD, null, 8, null);
        b0 birthPlace = childData.getBirthPlace();
        if (birthPlace == null) {
            birthPlace = birthPlaceInput;
        }
        List listS = v.s(childPassportApplicationCards, childPassportApplicationCards2, childPassportApplicationCards3, childPassportApplicationCards4, childPassportApplicationCards5, childPassportApplicationCards6, birthPlace != null ? new ChildPassportApplicationCards("childPlaceOfBirthCard", this.labelProvider.c(w51.a.H3), c0.e(birthPlace), null, 8, null) : null);
        ArrayList arrayList = new ArrayList(v.y(listS, 10));
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            arrayList.add(((ChildPassportApplicationCards) it.next()).a());
        }
        return arrayList;
    }

    private final CardListData l(ContactDetailsData contactData, String country, i61.d correspondenceData) {
        if (contactData != null) {
            return new CardListData(E(contactData), null, false, null, null, 30, null);
        }
        List listS = v.s(new ChildPassportApplicationCards("contactTypeCard", this.labelProvider.c(w51.a.f210371l3), this.labelProvider.c(w51.a.f210378m3).getText(), null, 8, null), new ChildPassportApplicationCards("contactCountryCard", this.labelProvider.c(w51.a.S3), country, null, 8, null), e(correspondenceData));
        ArrayList arrayList = new ArrayList(v.y(listS, 10));
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            arrayList.add(((ChildPassportApplicationCards) it.next()).a());
        }
        return new CardListData(arrayList, null, false, null, null, 30, null);
    }

    private final List<DefaultSingleCardData> m(String country, i61.d correspondenceData) {
        String address;
        ChildPassportApplicationCards childPassportApplicationCards = new ChildPassportApplicationCards("correspondenceCountryCard", this.labelProvider.c(w51.a.S3), country, null, 8, null);
        if (correspondenceData instanceof i61.d.Domestic) {
            address = st3.c.a(((i61.d.Domestic) correspondenceData).getAddressData());
        } else {
            if (!(correspondenceData instanceof i61.d.Foreign)) {
                throw new p();
            }
            address = ((i61.d.Foreign) correspondenceData).getAddress();
        }
        List listQ = v.q(childPassportApplicationCards, new ChildPassportApplicationCards("correspondenceAddressCard", this.labelProvider.c(w51.a.E3), address, null, 8, null));
        ArrayList arrayList = new ArrayList(v.y(listQ, 10));
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            arrayList.add(((ChildPassportApplicationCards) it.next()).a());
        }
        return arrayList;
    }

    private final Label q(i61.l discountType) {
        int i15 = c.f217608d[discountType.ordinal()];
        if (i15 == 1) {
            return this.labelProvider.c(w51.a.f210340h0);
        }
        if (i15 == 2) {
            return this.labelProvider.c(w51.a.f210333g0);
        }
        if (i15 == 3) {
            return this.labelProvider.c(w51.a.f210347i0);
        }
        if (i15 == 4) {
            return this.labelProvider.c(w51.a.f210375m0);
        }
        if (i15 == 5) {
            return this.labelProvider.c(w51.a.f210361k0);
        }
        throw new p();
    }

    private final d.a.Initialized r(w91.c.b state, final Params params) {
        int i15;
        r30.b error;
        List<DefaultSingleCardData> listU = u(state.getData().getSummaryContractData().getPassportType(), state.getData().getSummaryContractData().getInstitutionData().getOfficeName());
        List<k> listV = v(state.getData().getSummaryContractData().getParentData());
        List<DefaultSingleCardData> listI = i(state.getData().getSummaryContractData().getChildData(), state.getData().getSummaryContractData().getBirthPlaceInput());
        List<DefaultSingleCardData> listM = m(state.getData().getSummaryContractData().getCorrespondenceCountry().getName(), state.getData().getSummaryContractData().getCorrespondenceAddress());
        List<DefaultSingleCardData> listX = x(state.getData().getSummaryContractData().getDiscountType(), state.getData().getSummaryContractData().getPaymentType());
        r pickUpMethod = state.getData().getSummaryContractData().getPickUpMethod();
        List<DefaultSingleCardData> listF = pickUpMethod != null ? F(pickUpMethod, state.getData().getSummaryContractData().getCorrespondenceCountry().getName(), state.getData().getSummaryContractData().getCorrespondenceAddress(), state.getData().getSummaryContractData().getParentData()) : null;
        y91.c.SummaryContractData summaryContractData = state.getData().getSummaryContractData();
        List<DefaultSingleCardData> listF2 = f(summaryContractData.z(), summaryContractData.getPhotoAttachmentName(), summaryContractData.v(), summaryContractData.u(), summaryContractData.m(), summaryContractData.n(), summaryContractData.r(), summaryContractData.y(), summaryContractData.a(), summaryContractData.l());
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(w51.a.H4), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        er.a<i0> aVarA = params.a();
        q paymentType = state.getData().getSummaryContractData().getPaymentType();
        q.a aVar = q.a.f89801a;
        Label labelC = t.c(paymentType, aVar) ? this.labelProvider.c(w51.a.O2) : this.labelProvider.c(w51.a.N2);
        CardListData cardListData = new CardListData(listU, null, false, null, null, 30, null);
        Label labelC2 = this.labelProvider.c(w51.a.Z4);
        CardListData cardListData2 = new CardListData(listV, null, false, null, null, 30, null);
        Label labelC3 = this.labelProvider.c(w51.a.L3);
        CardListData cardListData3 = new CardListData(listI, null, false, null, null, 30, null);
        Label labelC4 = this.labelProvider.c(w51.a.f210392o3);
        CardListData cardListData4 = new CardListData(listM, null, false, null, null, 30, null);
        Label labelC5 = this.labelProvider.c(w51.a.f210364k3);
        CardListData cardListDataL = l(state.getData().getSummaryContractData().getContactData(), state.getData().getSummaryContractData().getCorrespondenceCountry().getName(), state.getData().getSummaryContractData().getCorrespondenceAddress());
        Label labelC6 = this.labelProvider.c(w51.a.f210427t3);
        CardListData cardListData5 = new CardListData(listX, null, false, null, null, 30, null);
        Label labelC7 = this.labelProvider.c(w51.a.f210336g3);
        CardListData cardListData6 = listF != null ? new CardListData(listF, null, false, null, null, 30, null) : null;
        Label labelC8 = this.labelProvider.c(w51.a.F3);
        CardListData cardListData7 = new CardListData(listF2, null, false, null, null, 30, null);
        Label labelC9 = this.labelProvider.c(w51.a.E4);
        boolean value = state.getData().getStatementState().getValue();
        l lVar = new l() { // from class: x91.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.s(params, ((Boolean) obj).booleanValue());
            }
        };
        mx.c cVar = this.labelProvider;
        int i16 = c.f217605a[state.getData().getSummaryContractData().getParentData().getParentData().getGender().ordinal()];
        if (i16 == 1 || i16 == 2) {
            i15 = w51.a.f210420s3;
        } else {
            if (i16 != 3) {
                throw new p();
            }
            i15 = w51.a.f210413r3;
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
            error = new r30.b.Error(null, this.labelProvider.c(w51.a.F4), 1, null);
        }
        return new d.a.Initialized(baseScaffoldData, aVarA, labelC, cardListData, labelC2, cardListData2, labelC3, cardListData3, labelC4, cardListData4, labelC5, cardListDataL, labelC6, cardListData5, labelC7, cardListData6, labelC8, cardListData7, labelC9, state.getData().getSummaryContractData().getChildData().getEntryType() == j0.PICKER ? new CheckBoxSingleData(checkBoxRowData, error, cVar2, false, null, 24, null) : null, new c30.b.c(null, Label.INSTANCE.c(), null, this.labelProvider.c(w51.a.f210406q3), null, null, null, 117, null), new ButtonData("sendButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(t.c(state.getData().getSummaryContractData().getPaymentType(), aVar) ? this.labelProvider.c(w51.a.M2) : this.labelProvider.c(w51.a.C4), null, 2, null), k30.d.a.f107773a, null, params.e(), 34, null), state.getScrollToStatementCheckBox(), params.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, boolean z15) {
        params.f().b(Boolean.valueOf(z15));
        return i0.f148189a;
    }

    private final List<DefaultSingleCardData> u(s0 passportType, String office) {
        int i15;
        ChildPassportApplicationCards childPassportApplicationCards = new ChildPassportApplicationCards("officeReceiverCard", this.labelProvider.c(w51.a.f210399p3), office, null, 8, null);
        Label labelC = this.labelProvider.c(w51.a.U0);
        mx.c cVar = this.labelProvider;
        int i16 = c.f217606b[passportType.ordinal()];
        if (i16 == 1) {
            i15 = w51.a.f210393o4;
        } else if (i16 == 2) {
            i15 = w51.a.T0;
        } else {
            if (i16 != 3 && i16 != 4 && i16 != 5) {
                throw new p();
            }
            i15 = w51.a.K4;
        }
        List listQ = v.q(childPassportApplicationCards, new ChildPassportApplicationCards("officePassportCard", labelC, cVar.c(i15).getText(), null, 8, null));
        ArrayList arrayList = new ArrayList(v.y(listQ, 10));
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            arrayList.add(((ChildPassportApplicationCards) it.next()).a());
        }
        return arrayList;
    }

    private final List<k> v(ParentFormData parentData) {
        ChildPassportApplicationCards childPassportApplicationCards;
        String text;
        ChildPassportApplicationCards childPassportApplicationCards2 = new ChildPassportApplicationCards("parentFirstNameCard", this.labelProvider.c(w51.a.f210337g4), c0.e(parentData.getParentData().getFirstName()), null, 8, null);
        b0 secondName = parentData.getParentData().getSecondName();
        if (secondName != null) {
            childPassportApplicationCards = new ChildPassportApplicationCards("parentSecondNameCard", this.labelProvider.c(w51.a.f210468z4), c0.e(secondName), null, 8, null);
        } else {
            childPassportApplicationCards = null;
        }
        ChildPassportApplicationCards childPassportApplicationCards3 = childPassportApplicationCards;
        ChildPassportApplicationCards childPassportApplicationCards4 = new ChildPassportApplicationCards("parentLastNameCard", this.labelProvider.c(w51.a.f210358j4), c0.e(parentData.getParentData().getSurname()), null, 8, null);
        ChildPassportApplicationCards childPassportApplicationCards5 = new ChildPassportApplicationCards("parentPeselNumberCard", this.labelProvider.c(w51.a.f210421s4), c0.e(parentData.getParentData().getPesel()), j70.a.LETTER_BY_LETTER);
        Label labelC = this.labelProvider.c(w51.a.H3);
        b0 placeOfBirth = parentData.getParentData().getPlaceOfBirth();
        if (placeOfBirth == null) {
            placeOfBirth = parentData.getBirthPlaceFieldValue();
        }
        ChildPassportApplicationCards childPassportApplicationCards6 = new ChildPassportApplicationCards("parentPlaceOfBirthCard", labelC, c0.e(placeOfBirth), null, 8, null);
        Label labelC2 = this.labelProvider.c(w51.a.V2);
        cl0.d documentType = parentData.getDocumentType();
        int i15 = documentType == null ? -1 : c.f217607c[documentType.ordinal()];
        if (i15 == -1 || i15 == 1) {
            text = this.labelProvider.c(w51.a.f210351i4).getText();
        } else if (i15 == 2) {
            text = this.labelProvider.c(w51.a.f210393o4).getText();
        } else {
            if (i15 != 3) {
                throw new p();
            }
            text = c0.e(parentData.getIdCardNameFieldValue());
        }
        ChildPassportApplicationCards childPassportApplicationCards7 = new ChildPassportApplicationCards("parentDocumentTypeCard", labelC2, text, null, 8, null);
        Label labelC3 = this.labelProvider.c(w51.a.f210401p5);
        b0 idCardSeriesAndNumber = parentData.getParentData().getIdCardSeriesAndNumber();
        if (idCardSeriesAndNumber == null) {
            idCardSeriesAndNumber = parentData.getIdCardSeriesAndNumberFieldValue();
        }
        List listS = v.s(childPassportApplicationCards2, childPassportApplicationCards3, childPassportApplicationCards4, childPassportApplicationCards5, childPassportApplicationCards6, childPassportApplicationCards7, new ChildPassportApplicationCards("parentIdCardSeriesAndNumberCard", labelC3, c0.e(idCardSeriesAndNumber), null, 8, null));
        ArrayList arrayList = new ArrayList(v.y(listS, 10));
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            arrayList.add(((ChildPassportApplicationCards) it.next()).a());
        }
        return arrayList;
    }

    private final List<DefaultSingleCardData> x(i61.l discountType, q paymentType) {
        String text;
        ChildPassportApplicationCards childPassportApplicationCards = new ChildPassportApplicationCards("paymentDiscountCard", this.labelProvider.c(w51.a.f210441v3), q(discountType).getText(), null, 8, null);
        Label labelC = this.labelProvider.c(w51.a.f210448w3);
        int i15 = c.f217608d[discountType.ordinal()];
        if (i15 == 1 || i15 == 2) {
            text = z(paymentType).getText();
        } else if (i15 == 3 || i15 == 4) {
            text = this.labelProvider.c(w51.a.f210461y3).getText();
        } else {
            if (i15 != 5) {
                throw new p();
            }
            text = z(paymentType).getText();
        }
        List listQ = v.q(childPassportApplicationCards, new ChildPassportApplicationCards("paymentTypeCard", labelC, text, null, 8, null));
        ArrayList arrayList = new ArrayList(v.y(listQ, 10));
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            arrayList.add(((ChildPassportApplicationCards) it.next()).a());
        }
        return arrayList;
    }

    private final Label z(q paymentType) {
        if (t.c(paymentType, q.b.f89802a)) {
            return this.labelProvider.c(w51.a.f210434u3);
        }
        if (t.c(paymentType, q.a.f89801a)) {
            return this.labelProvider.c(w51.a.f210455x3);
        }
        if (paymentType == null) {
            return this.labelProvider.c(w51.a.f210461y3);
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public d.a b(Params params) {
        w91.c state = params.getState();
        if (state instanceof w91.c.a) {
            w91.c.a aVar = (w91.c.a) params.getState();
            if (t.c(aVar, w91.c.a.b.f211299a)) {
                return d.a.b.f211327a;
            }
            if (aVar instanceof w91.c.a.Error) {
                return new d.a.Error(((w91.c.a.Error) params.getState()).getErrorVMS());
            }
            throw new p();
        }
        if (state instanceof w91.c.b) {
            return r((w91.c.b) params.getState(), params);
        }
        if (state instanceof w91.c.InitializedError) {
            return new d.a.Error(((w91.c.InitializedError) params.getState()).getErrorVMS());
        }
        if (!(state instanceof w91.c.Success)) {
            throw new p();
        }
        return new d.a.Success(new BaseScaffoldData(null, null, null, null, null, null, 63, null), new IconPageData(j.b.c.f164688d, this.labelProvider.c(w51.a.L2), this.labelProvider.e(w51.a.G2, ((w91.c.Success) params.getState()).getApplicationNumber()), null, new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(w51.a.H2)), new t40.a.C4874a(this.labelProvider.c(w51.a.J2)), new t40.a.C4874a(this.labelProvider.c(w51.a.K2)), new t40.a.C4874a(this.labelProvider.c(w51.a.I2)))), new IconPageBottomContentData(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(w51.a.Q3), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null), null, null, 6, null), false, 72, null), params.c());
    }

    /* JADX INFO: renamed from: x91.b$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lx91/b$a;", "", "", "testTag", "Lmx/a;", "infoLabel", "titleString", "Lj70/a;", "accessibilityReadMode", "<init>", "(Ljava/lang/String;Lmx/a;Ljava/lang/String;Lj70/a;)V", "Ln50/g;", "a", "()Ln50/g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTestTag", "b", "Lmx/a;", "getInfoLabel", "()Lmx/a;", "c", "getTitleString", "d", "Lj70/a;", "getAccessibilityReadMode", "()Lj70/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChildPassportApplicationCards {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String testTag;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label infoLabel;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String titleString;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final j70.a accessibilityReadMode;

        public ChildPassportApplicationCards(String str, Label label, String str2, j70.a aVar) {
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
            if (!(other instanceof ChildPassportApplicationCards)) {
                return false;
            }
            ChildPassportApplicationCards childPassportApplicationCards = (ChildPassportApplicationCards) other;
            return t.c(this.testTag, childPassportApplicationCards.testTag) && t.c(this.infoLabel, childPassportApplicationCards.infoLabel) && t.c(this.titleString, childPassportApplicationCards.titleString) && this.accessibilityReadMode == childPassportApplicationCards.accessibilityReadMode;
        }

        public int hashCode() {
            return (((((this.testTag.hashCode() * 31) + this.infoLabel.hashCode()) * 31) + this.titleString.hashCode()) * 31) + this.accessibilityReadMode.hashCode();
        }

        public String toString() {
            return "ChildPassportApplicationCards(testTag=" + this.testTag + ", infoLabel=" + this.infoLabel + ", titleString=" + this.titleString + ", accessibilityReadMode=" + this.accessibilityReadMode + ')';
        }

        public /* synthetic */ ChildPassportApplicationCards(String str, Label label, String str2, j70.a aVar, int i15, fr.k kVar) {
            this(str, label, str2, (i15 & 8) != 0 ? j70.a.LOWER_CASE : aVar);
        }
    }
}
