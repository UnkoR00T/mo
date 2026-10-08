package r51;

import bl0.s;
import d60.ScrollControllerData;
import ez.e;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.time.LocalDate;
import k30.d;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import p51.RegisteredAddressFields;
import p51.State;
import p51.c;
import st3.g;
import v40.InputDateTimeData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lr51/a;", "Lxw/f;", "Lr51/a$a;", "Lp51/c$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lbl0/s;", "", "multipleChildren", "", "c", "(Lbl0/s;Z)I", "Ljava/time/LocalDate;", "", "f", "(Ljava/time/LocalDate;)Ljava/lang/String;", "params", "e", "(Lr51/a$a;)Lp51/c$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "b", "Lez/e;", "getDateFormatter", "()Lez/e;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: r51.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0016\u0010\u001d¨\u0006\u001f"}, d2 = {"Lr51/a$a;", "", "Lp51/b;", "state", "Lkotlin/Function0;", "Loq/i0;", "onDateFieldClicked", "onNextButtonClick", "onClose", "onBack", "<init>", "(Lp51/b;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lp51/b;", "e", "()Lp51/b;", "b", "Ler/a;", "c", "()Ler/a;", "d", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDateFieldClicked;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = state;
            this.onDateFieldClicked = aVar;
            this.onNextButtonClick = aVar2;
            this.onClose = aVar3;
            this.onBack = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final er.a<i0> c() {
            return this.onDateFieldClicked;
        }

        public final er.a<i0> d() {
            return this.onNextButtonClick;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onDateFieldClicked, params.onDateFieldClicked) && t.c(this.onNextButtonClick, params.onNextButtonClick) && t.c(this.onClose, params.onClose) && t.c(this.onBack, params.onBack);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onDateFieldClicked.hashCode()) * 31) + this.onNextButtonClick.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onDateFieldClicked=" + this.onDateFieldClicked + ", onNextButtonClick=" + this.onNextButtonClick + ", onClose=" + this.onClose + ", onBack=" + this.onBack + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f171915a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.MyPermanentAddress.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.MyTemporaryAddress.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.PermanentFatherAddress.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s.TemporaryFatherAddress.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s.PermanentMotherAddress.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s.TemporaryMotherAddress.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[s.MeAndMotherAreNotRegistered.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[s.MeAndFatherAreNotRegistered.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[s.IAmNotRegistered.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[s.DoesNotRegisterChild.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f171915a = iArr;
        }
    }

    public a(mx.c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    private final int c(s sVar, boolean z15) {
        switch (b.f171915a[sVar.ordinal()]) {
            case 1:
                return j31.a.f99175l1;
            case 2:
                return j31.a.f99200q1;
            case 3:
                if (!z15) {
                    return j31.a.f99180m1;
                }
                if (z15) {
                    return j31.a.f99185n1;
                }
                throw new p();
            case 4:
                if (!z15) {
                    return j31.a.f99205r1;
                }
                if (z15) {
                    return j31.a.f99210s1;
                }
                throw new p();
            case 5:
                if (!z15) {
                    return j31.a.f99190o1;
                }
                if (z15) {
                    return j31.a.f99195p1;
                }
                throw new p();
            case 6:
                if (!z15) {
                    return j31.a.f99215t1;
                }
                if (z15) {
                    return j31.a.f99220u1;
                }
                throw new p();
            case 7:
            case 8:
            case 9:
            case 10:
                return j31.a.f99175l1;
            default:
                throw new p();
        }
    }

    private final String f(LocalDate localDate) {
        if (localDate != null) {
            return this.dateFormatter.d(new fz.b.LocalDate(localDate), fz.c.DOTTED);
        }
        return null;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c.Data b(Params params) {
        InputDateTimeData inputDateTimeData;
        mx.c cVar = this.labelProvider;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(j31.a.O1), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, new ScrollControllerData(params.getState().f(), false, false, 6, null), 29, null);
        Label labelC = this.labelProvider.c(c(params.getState().getTypeAddressChild(), params.getState().getAreMultipleChildren()));
        ButtonData buttonData = new ButtonData("NextButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(cVar.c(j31.a.f99235x2), null, 2, null), d.a.f107773a, null, params.d(), 34, null);
        g addressFormVMS = params.getState().getAddressFormVMS();
        RegisteredAddressFields.a.TemporaryAddressEndDate temporaryAddressEndDateField = params.getState().getFields().getTemporaryAddressEndDateField();
        if (temporaryAddressEndDateField != null) {
            Label labelC2 = this.labelProvider.c(j31.a.f99165j1);
            fz.b.LocalDate date = temporaryAddressEndDateField.getDate();
            inputDateTimeData = new InputDateTimeData("StayDurationDateInput", labelC2, f(date != null ? date.getDate() : null), InputDateTimeData.b.C5303a.f203783c, temporaryAddressEndDateField.getValidationState(), null, null, null, false, temporaryAddressEndDateField.getIndex(), params.c(), 480, null);
        } else {
            inputDateTimeData = null;
        }
        return new c.Data(baseScaffoldData, labelC, buttonData, addressFormVMS, inputDateTimeData, params.a());
    }
}
