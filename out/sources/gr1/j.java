package gr1;

import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0006*\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lgr1/j;", "Lxw/f;", "Lgr1/j$a;", "Lgr1/e$a;", "<init>", "()V", "", "Lg30/v;", "u", "(Z)Lg30/v;", "s", "(Lg30/v;)Z", "params", "i", "(Lgr1/j$a;)Lgr1/e$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements xw.f<Params, e.a> {

    /* JADX INFO: renamed from: gr1.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010(R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b)\u0010(R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b\"\u0010(R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010(R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b,\u0010%R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b.\u0010%R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b+\u0010(R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b \u0010'\u001a\u0004\b\u001e\u0010(¨\u0006/"}, d2 = {"Lgr1/j$a;", "", "Lgr1/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function1;", "", "dataToSignInputValueListener", "pinInputValueListener", "newPinInputValueListener", "canInputValueListener", "pukInputValueListener", "onStartButtonClick", "onStopButtonClick", "Lmx/a;", "onBottomSheetItemSelected", "", "bottomSheetVisibilityChange", "<init>", "(Lgr1/d;Ler/a;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lgr1/d;", "k", "()Lgr1/d;", "b", "Ler/a;", "e", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "d", "i", "f", "g", "j", "h", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, oq.i0> dataToSignInputValueListener;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, oq.i0> pinInputValueListener;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, oq.i0> newPinInputValueListener;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, oq.i0> canInputValueListener;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, oq.i0> pukInputValueListener;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onStartButtonClick;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onStopButtonClick;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Label, oq.i0> onBottomSheetItemSelected;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, oq.i0> bottomSheetVisibilityChange;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(d dVar, er.a<oq.i0> aVar, er.l<? super String, oq.i0> lVar, er.l<? super String, oq.i0> lVar2, er.l<? super String, oq.i0> lVar3, er.l<? super String, oq.i0> lVar4, er.l<? super String, oq.i0> lVar5, er.a<oq.i0> aVar2, er.a<oq.i0> aVar3, er.l<? super Label, oq.i0> lVar6, er.l<? super Boolean, oq.i0> lVar7) {
            this.state = dVar;
            this.onBackAction = aVar;
            this.dataToSignInputValueListener = lVar;
            this.pinInputValueListener = lVar2;
            this.newPinInputValueListener = lVar3;
            this.canInputValueListener = lVar4;
            this.pukInputValueListener = lVar5;
            this.onStartButtonClick = aVar2;
            this.onStopButtonClick = aVar3;
            this.onBottomSheetItemSelected = lVar6;
            this.bottomSheetVisibilityChange = lVar7;
        }

        public final er.l<Boolean, oq.i0> a() {
            return this.bottomSheetVisibilityChange;
        }

        public final er.l<String, oq.i0> b() {
            return this.canInputValueListener;
        }

        public final er.l<String, oq.i0> c() {
            return this.dataToSignInputValueListener;
        }

        public final er.l<String, oq.i0> d() {
            return this.newPinInputValueListener;
        }

        public final er.a<oq.i0> e() {
            return this.onBackAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.state, params.state) && fr.t.c(this.onBackAction, params.onBackAction) && fr.t.c(this.dataToSignInputValueListener, params.dataToSignInputValueListener) && fr.t.c(this.pinInputValueListener, params.pinInputValueListener) && fr.t.c(this.newPinInputValueListener, params.newPinInputValueListener) && fr.t.c(this.canInputValueListener, params.canInputValueListener) && fr.t.c(this.pukInputValueListener, params.pukInputValueListener) && fr.t.c(this.onStartButtonClick, params.onStartButtonClick) && fr.t.c(this.onStopButtonClick, params.onStopButtonClick) && fr.t.c(this.onBottomSheetItemSelected, params.onBottomSheetItemSelected) && fr.t.c(this.bottomSheetVisibilityChange, params.bottomSheetVisibilityChange);
        }

        public final er.l<Label, oq.i0> f() {
            return this.onBottomSheetItemSelected;
        }

        public final er.a<oq.i0> g() {
            return this.onStartButtonClick;
        }

        public final er.a<oq.i0> h() {
            return this.onStopButtonClick;
        }

        public int hashCode() {
            return (((((((((((((((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.dataToSignInputValueListener.hashCode()) * 31) + this.pinInputValueListener.hashCode()) * 31) + this.newPinInputValueListener.hashCode()) * 31) + this.canInputValueListener.hashCode()) * 31) + this.pukInputValueListener.hashCode()) * 31) + this.onStartButtonClick.hashCode()) * 31) + this.onStopButtonClick.hashCode()) * 31) + this.onBottomSheetItemSelected.hashCode()) * 31) + this.bottomSheetVisibilityChange.hashCode();
        }

        public final er.l<String, oq.i0> i() {
            return this.pinInputValueListener;
        }

        public final er.l<String, oq.i0> j() {
            return this.pukInputValueListener;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final d getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", dataToSignInputValueListener=" + this.dataToSignInputValueListener + ", pinInputValueListener=" + this.pinInputValueListener + ", newPinInputValueListener=" + this.newPinInputValueListener + ", canInputValueListener=" + this.canInputValueListener + ", pukInputValueListener=" + this.pukInputValueListener + ", onStartButtonClick=" + this.onStartButtonClick + ", onStopButtonClick=" + this.onStopButtonClick + ", onBottomSheetItemSelected=" + this.onBottomSheetItemSelected + ", bottomSheetVisibilityChange=" + this.bottomSheetVisibilityChange + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f76468b;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.PRESENCE_SIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.AUTHENTICATION_SIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.AUTHORIZATION_SIGN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.CHANGE_AUTHENTICATION_PIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.CHANGE_AUTHORIZATION_PIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.RESET_AUTHENTICATION_PIN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c.RESET_AUTHORIZATION_PIN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f76467a = iArr;
            int[] iArr2 = new int[g30.v.values().length];
            try {
                iArr2[g30.v.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[g30.v.HALF_EXPANDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[g30.v.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f76468b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(Params params, Label label) {
        params.f();
        params.a().b(Boolean.FALSE);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(Params params, j jVar, g30.v vVar) {
        params.a().b(Boolean.valueOf(jVar.s(vVar)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(Params params) {
        params.a().b(Boolean.FALSE);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(Params params, DropDownButtonData dropDownButtonData) {
        params.a().b(Boolean.TRUE);
        return oq.i0.f148189a;
    }

    private final boolean s(g30.v vVar) {
        int i15 = b.f76468b[vVar.ordinal()];
        if (i15 == 1 || i15 == 2) {
            return true;
        }
        if (i15 == 3) {
            return false;
        }
        throw new oq.p();
    }

    private final g30.v u(boolean z15) {
        if (z15) {
            return g30.v.EXPANDED;
        }
        if (z15) {
            throw new oq.p();
        }
        return g30.v.HIDDEN;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ed  */
    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public e.a b(final Params params) {
        String string;
        Label labelB;
        d state = params.getState();
        int i15 = 0;
        if (state instanceof d.FillingForm) {
            BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.e()), mx.b.b("Skaner eDowodu", ""), null, null, null, 28, null), null, null, null, null, 61, null);
            er.a<oq.i0> aVarE = params.e();
            c mode = ((d.FillingForm) params.getState()).getFormData().getMode();
            int[] iArr = b.f76467a;
            int i16 = iArr[mode.ordinal()];
            e.a.FillingForm.Input input = new e.a.FillingForm.Input(i16 == 1 || i16 == 2 || i16 == 3, mx.b.b(((d.FillingForm) params.getState()).getFormData().getDataToSign(), ""), mx.b.b("Dane do podpisu (format SHA384)", ""), null, params.c(), 8, null);
            int i17 = iArr[((d.FillingForm) params.getState()).getFormData().getMode().ordinal()];
            boolean z15 = i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5;
            Label labelB2 = mx.b.b(((d.FillingForm) params.getState()).getFormData().getPin(), "");
            int i18 = iArr[((d.FillingForm) params.getState()).getFormData().getMode().ordinal()];
            if (i18 == 2) {
                labelB = mx.b.b("PIN (4 cyfry)", "");
            } else if (i18 == 3) {
                labelB = mx.b.b("PIN (6 cyfr)", "");
            } else if (i18 == 4) {
                labelB = mx.b.b("PIN (4 cyfry)", "");
            } else if (i18 != 5) {
                labelB = mx.b.b("", "");
            } else {
                labelB = mx.b.b("PIN (6 cyfr)", "");
            }
            e.a.FillingForm.Input input2 = new e.a.FillingForm.Input(z15, labelB2, labelB, null, params.i(), 8, null);
            int i19 = iArr[((d.FillingForm) params.getState()).getFormData().getMode().ordinal()];
            e.a.FillingForm.Input input3 = new e.a.FillingForm.Input(i19 == 4 || i19 == 5 || i19 == 6 || i19 == 7, mx.b.b(((d.FillingForm) params.getState()).getFormData().getNewPin(), ""), mx.b.b("Nowy PIN", ""), null, params.d(), 8, null);
            e.a.FillingForm.Input input4 = new e.a.FillingForm.Input(true, mx.b.b(((d.FillingForm) params.getState()).getFormData().getCan(), ""), mx.b.b("CAN", ""), null, params.b(), 8, null);
            int i25 = iArr[((d.FillingForm) params.getState()).getFormData().getMode().ordinal()];
            e.a.FillingForm.Input input5 = new e.a.FillingForm.Input(i25 == 6 || i25 == 7, mx.b.b(((d.FillingForm) params.getState()).getFormData().getPuk(), ""), mx.b.b("PUK (8 cyfr)", ""), null, params.j(), 8, null);
            ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(mx.b.b("Start", ""), null, 2, null), k30.d.a.f107773a, null, params.g(), 35, null);
            wq.a<c> aVarE2 = c.e();
            ArrayList arrayList = new ArrayList(pq.v.y(aVarE2, 10));
            Iterator<c> it = aVarE2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String());
            }
            e.a.FillingForm.ListData listData = new e.a.FillingForm.ListData(arrayList, ((d.FillingForm) params.getState()).getFormData().getMode().getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String(), new er.l() { // from class: gr1.f
                @Override // er.l
                public final Object b(Object obj) {
                    return j.l(params, (Label) obj);
                }
            });
            ModalBottomSheetData modalBottomSheetData = new ModalBottomSheetData(new ModalSheetState(u(((d.FillingForm) params.getState()).getBottomSheetVisible()), true, new er.l() { // from class: gr1.g
                @Override // er.l
                public final Object b(Object obj) {
                    return j.m(params, this, (g30.v) obj);
                }
            }), mx.b.b("Wybierz tryb NFC", "BottomSheetContentNfcModeTitle"), new er.a() { // from class: gr1.h
                @Override // er.a
                public final Object a() {
                    return j.q(params);
                }
            }, null, 8, null);
            Label labelB3 = mx.b.b("Tryb NFC", "BottomSheetInputNfcModeTitle");
            wq.a<c> aVarE3 = c.e();
            ArrayList arrayList2 = new ArrayList(pq.v.y(aVarE3, 10));
            Iterator<c> it4 = aVarE3.iterator();
            while (it4.hasNext()) {
                arrayList2.add(it4.next().getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String());
            }
            Label labelB4 = mx.b.b("Wybierz tryb NFC", "BottomSheetContentNfcModeHint");
            wq.a<c> aVarE4 = c.e();
            ArrayList arrayList3 = new ArrayList(pq.v.y(aVarE4, 10));
            Iterator<c> it5 = aVarE4.iterator();
            while (it5.hasNext()) {
                arrayList3.add(it5.next().getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String());
            }
            Iterator it6 = arrayList3.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    i15 = -1;
                    break;
                }
                if (fr.t.c(((Label) it6.next()).getText(), ((d.FillingForm) params.getState()).getFormData().getMode().getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String().getText())) {
                    break;
                }
                i15++;
            }
            Integer numValueOf = Integer.valueOf(i15);
            return new e.a.FillingForm(baseScaffoldData, modalBottomSheetData, aVarE, input, input2, input3, input4, input5, buttonData, listData, new DropDownButtonData(labelB3, arrayList2, numValueOf.intValue() >= 0 ? numValueOf : null, null, labelB4, false, null, new er.l() { // from class: gr1.i
                @Override // er.l
                public final Object b(Object obj) {
                    return j.r(params, (DropDownButtonData) obj);
                }
            }, 104, null));
        }
        if (!(state instanceof d.NfcScanning)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData2 = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.e()), mx.b.b("Skaner eDowodu", ""), null, null, null, 28, null), null, null, null, null, 61, null);
        er.a<oq.i0> aVarE5 = params.e();
        List<cy.c> listD = ((d.NfcScanning) params.getState()).d();
        ArrayList arrayList4 = new ArrayList(pq.v.y(listD, 10));
        for (cy.c cVar : listD) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append('\n');
            sb5.append(cVar.getContent());
            sb5.append(" (");
            sb5.append(cVar.getCode());
            sb5.append(')');
            if (cVar instanceof cy.c.Finished) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("\nsigned data: ");
                cy.c.Finished finished = (cy.c.Finished) cVar;
                sb6.append(finished.getSignedDataBase64());
                sb6.append("\ns00: ");
                sb6.append(finished.getS00());
                sb6.append("\ndg1: ");
                sb6.append(finished.getDG1());
                sb6.append("\ndg2: ");
                sb6.append(finished.getDG2());
                sb6.append("\n11: ");
                sb6.append(finished.getDG11());
                sb6.append("\n12: ");
                sb6.append(finished.getDG12());
                sb6.append("\n13: ");
                sb6.append(finished.getDG13());
                sb6.append("\ncertificate: ");
                sb6.append(finished.getCertificate());
                sb6.append("\ncertificatePukCounter: ");
                sb6.append(finished.getCertificatePukCounter());
                sb6.append("\ncertificatePinCounter: ");
                sb6.append(finished.getCertificatePinCounter());
                sb6.append("\ncertificateIsActivated: ");
                sb6.append(finished.getCertificateIsActivated());
                string = sb6.toString();
            } else if (cVar instanceof cy.c.InvalidPinOrPukError) {
                string = ", tries left:" + ((cy.c.InvalidPinOrPukError) cVar).getTriesLeft();
            } else if (cVar instanceof cy.c.Progress) {
                string = ", " + ((cy.c.Progress) cVar).getProgress() + '%';
            } else {
                if (!(cVar instanceof cy.c.Started) && !(cVar instanceof cy.c.Error) && !(cVar instanceof cy.c.Info)) {
                    throw new oq.p();
                }
                string = "";
            }
            sb5.append(string);
            arrayList4.add(sb5.toString());
        }
        return new e.a.NfcScanning(baseScaffoldData2, aVarE5, mx.b.b(pq.v.v0(arrayList4, "", null, null, 0, null, null, 62, null), ""), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(mx.b.b("Stop", ""), null, 2, null), k30.d.a.f107773a, null, params.h(), 35, null));
    }
}
