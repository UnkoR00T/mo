package ac0;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.Color;
import bc0.FamilyCardBottomSheetData;
import cb4.DialogButtonTextData;
import cb4.DialogData;
import cc0.l;
import cc0.m;
import er.p;
import fr.t;
import g30.ModalBottomSheetData;
import g30.ModalSheetState;
import g30.v;
import g70.ShortcutMoreData;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import l60.KeyValueData;
import mx.Label;
import n20.State;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import o20.BaseDocumentData;
import o20.DocumentGiloshData;
import o20.s2;
import o20.u2;
import o50.SmallCardData;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import vb0.FamilyCardDocument;
import vb0.FamilyDataContainer;
import x50.NavigationButtonData;
import x50.i;
import y30.n;
import zb0.SetHologramTextThemeColor;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lac0/g;", "Lxw/f;", "Lac0/g$a;", "Lcc0/m$a;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "Lp20/c;", "giloshMapper", "<init>", "(Lmx/c;Lez/e;Lp20/c;)V", "Lvb0/f;", "data", "", "Ll60/c;", "m", "(Lvb0/f;)Ljava/util/List;", "params", "r", "(Lac0/g$a;)Lcc0/m$a;", "Lmx/a;", "q", "()Lmx/a;", "a", "Lmx/c;", "b", "Lez/e;", "c", "Lp20/c;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<Params, m.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p20.c giloshMapper;

    /* JADX INFO: renamed from: ac0.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BÛ\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\n\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\n\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\n\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\b)\u00101R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b2\u00101R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00101R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00101R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b5\u00101R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b6\u0010*\u001a\u0004\b7\u0010,R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b8\u0010*\u001a\u0004\b3\u0010,R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b9\u00101R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b9\u0010*\u001a\u0004\b%\u0010,R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b'\u0010*\u001a\u0004\b8\u0010,¨\u0006:"}, d2 = {"Lac0/g$a;", "", "Ln20/b;", "Lcc0/l;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lo20/s2;", "documentVMS", "Lkotlin/Function1;", "Ln20/a;", "dispatchAction", "", "onChangeBottomSheetVisibility", "", "onVerificationAction", "Ly30/n$b$b;", "onSwitchItemChangedAction", "Lvb0/b;", "onSelectedCardAction", "onShowCardPartnersAction", "onDeleteAction", "Lcb4/d;", "showDialog", "closeDialog", "onUpdateAction", "<init>", "(Ln20/b;Ler/a;Lo20/s2;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/l;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ln20/b;", "m", "()Ln20/b;", "b", "Ler/a;", "d", "()Ler/a;", "c", "Lo20/s2;", "()Lo20/s2;", "Ler/l;", "()Ler/l;", "e", "f", "k", "g", "i", "h", "j", "l", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State<l> state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final s2 documentVMS;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<n20.a, i0> dispatchAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onChangeBottomSheetVisibility;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onVerificationAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<n.Switch.EnumC5973b, i0> onSwitchItemChangedAction;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<FamilyCardDocument, i0> onSelectedCardAction;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onShowCardPartnersAction;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDeleteAction;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<DialogData, i0> showDialog;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeDialog;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onUpdateAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State<l> state, er.a<i0> aVar, s2 s2Var, er.l<? super n20.a, i0> lVar, er.l<? super Boolean, i0> lVar2, er.l<? super String, i0> lVar3, er.l<? super n.Switch.EnumC5973b, i0> lVar4, er.l<? super FamilyCardDocument, i0> lVar5, er.a<i0> aVar2, er.a<i0> aVar3, er.l<? super DialogData, i0> lVar6, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = state;
            this.onBackAction = aVar;
            this.documentVMS = s2Var;
            this.dispatchAction = lVar;
            this.onChangeBottomSheetVisibility = lVar2;
            this.onVerificationAction = lVar3;
            this.onSwitchItemChangedAction = lVar4;
            this.onSelectedCardAction = lVar5;
            this.onShowCardPartnersAction = aVar2;
            this.onDeleteAction = aVar3;
            this.showDialog = lVar6;
            this.closeDialog = aVar4;
            this.onUpdateAction = aVar5;
        }

        public final er.a<i0> a() {
            return this.closeDialog;
        }

        public final er.l<n20.a, i0> b() {
            return this.dispatchAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final s2 getDocumentVMS() {
            return this.documentVMS;
        }

        public final er.a<i0> d() {
            return this.onBackAction;
        }

        public final er.l<Boolean, i0> e() {
            return this.onChangeBottomSheetVisibility;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.documentVMS, params.documentVMS) && t.c(this.dispatchAction, params.dispatchAction) && t.c(this.onChangeBottomSheetVisibility, params.onChangeBottomSheetVisibility) && t.c(this.onVerificationAction, params.onVerificationAction) && t.c(this.onSwitchItemChangedAction, params.onSwitchItemChangedAction) && t.c(this.onSelectedCardAction, params.onSelectedCardAction) && t.c(this.onShowCardPartnersAction, params.onShowCardPartnersAction) && t.c(this.onDeleteAction, params.onDeleteAction) && t.c(this.showDialog, params.showDialog) && t.c(this.closeDialog, params.closeDialog) && t.c(this.onUpdateAction, params.onUpdateAction);
        }

        public final er.a<i0> f() {
            return this.onDeleteAction;
        }

        public final er.l<FamilyCardDocument, i0> g() {
            return this.onSelectedCardAction;
        }

        public final er.a<i0> h() {
            return this.onShowCardPartnersAction;
        }

        public int hashCode() {
            return (((((((((((((((((((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.documentVMS.hashCode()) * 31) + this.dispatchAction.hashCode()) * 31) + this.onChangeBottomSheetVisibility.hashCode()) * 31) + this.onVerificationAction.hashCode()) * 31) + this.onSwitchItemChangedAction.hashCode()) * 31) + this.onSelectedCardAction.hashCode()) * 31) + this.onShowCardPartnersAction.hashCode()) * 31) + this.onDeleteAction.hashCode()) * 31) + this.showDialog.hashCode()) * 31) + this.closeDialog.hashCode()) * 31) + this.onUpdateAction.hashCode();
        }

        public final er.l<n.Switch.EnumC5973b, i0> i() {
            return this.onSwitchItemChangedAction;
        }

        public final er.a<i0> j() {
            return this.onUpdateAction;
        }

        public final er.l<String, i0> k() {
            return this.onVerificationAction;
        }

        public final er.l<DialogData, i0> l() {
            return this.showDialog;
        }

        public final State<l> m() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", documentVMS=" + this.documentVMS + ", dispatchAction=" + this.dispatchAction + ", onChangeBottomSheetVisibility=" + this.onChangeBottomSheetVisibility + ", onVerificationAction=" + this.onVerificationAction + ", onSwitchItemChangedAction=" + this.onSwitchItemChangedAction + ", onSelectedCardAction=" + this.onSelectedCardAction + ", onShowCardPartnersAction=" + this.onShowCardPartnersAction + ", onDeleteAction=" + this.onDeleteAction + ", showDialog=" + this.showDialog + ", closeDialog=" + this.closeDialog + ", onUpdateAction=" + this.onUpdateAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f5371b;

        static {
            int[] iArr = new int[vb0.a.values().length];
            try {
                iArr[vb0.a.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f5370a = iArr;
            int[] iArr2 = new int[v.values().length];
            try {
                iArr2[v.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[v.HALF_EXPANDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[v.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f5371b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f5372a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return c(rVar, num.intValue());
        }

        public final Color c(r rVar, int i15) {
            rVar.X(-60141132);
            if (p076m2.t.k()) {
                p076m2.t.o(-60141132, i15, -1, "pl.gov.coi.mjunior.feature.familycard.presentation.mapper.FamilyCardMapper.invoke.<anonymous>.<anonymous> (FamilyCardMapper.kt:122)");
            }
            long hologramTextColor = ((SetHologramTextThemeColor) rVar.N(zb0.b.c())).getHologramTextColor();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return Color.m0boximpl(hologramTextColor);
        }
    }

    public g(mx.c cVar, ez.e eVar, p20.c cVar2) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
        this.giloshMapper = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(Params params, v vVar) {
        int i15 = b.f5371b[vVar.ordinal()];
        if (i15 != 1 && i15 != 2) {
            if (i15 != 3) {
                throw new oq.p();
            }
            params.e().b(Boolean.FALSE);
        }
        return i0.f148189a;
    }

    private final List<KeyValueData> m(FamilyDataContainer data) {
        Label labelB;
        String strD;
        String strH = data.h();
        Locale locale = Locale.ROOT;
        KeyValueData keyValueData = new KeyValueData(mx.b.d(strH.toUpperCase(locale), "namesValue"), this.labelProvider.c(tb0.b.f189405p), false, 4, null);
        KeyValueData keyValueData2 = new KeyValueData(mx.b.d(data.getSu().toUpperCase(locale), "surnameValue"), this.labelProvider.c(tb0.b.f189408s), false, 4, null);
        KeyValueData keyValueData3 = new KeyValueData(mx.b.d(data.getP(), "peselValue"), this.labelProvider.c(tb0.b.f189407r), false, 4, null);
        KeyValueData keyValueData4 = new KeyValueData(mx.b.d(data.getNo(), "cardNumber"), this.labelProvider.c(tb0.b.f189415z), false, 4, null);
        LocalDate ed5 = data.getED();
        if (ed5 == null || (strD = this.dateFormatter.d(new fz.b.LocalDate(ed5), fz.c.DOTTED)) == null || (labelB = mx.b.b(strD, "expirationDateValue")) == null) {
            labelB = mx.b.b(this.labelProvider.c(tb0.b.D).getText(), "expirationDateValue");
        }
        return pq.v.q(keyValueData, keyValueData2, keyValueData3, keyValueData4, new KeyValueData(labelB, this.labelProvider.c(tb0.b.f189397h), false, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params) {
        params.e().b(Boolean.TRUE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(l lVar, Params params, g gVar) {
        l.d dVar = (l.d) lVar;
        if (b.f5370a[dVar.getStateData().getSelectedCard().getDocumentStatus().ordinal()] == 1) {
            params.k().b(dVar.getStateData().getSelectedCard().getScopeData().getData().getNo());
        } else {
            params.l().b(new DialogData(cb4.h.b.f24985a, gVar.labelProvider.c(tb0.b.f189411v), gVar.labelProvider.c(tb0.b.f189410u), new DialogButtonTextData(gVar.labelProvider.c(tb0.b.f189396g), null, params.j(), 2, null), new DialogButtonTextData(gVar.labelProvider.c(tb0.b.f189392c), null, params.a(), 2, null), null, null, 96, null));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params, g gVar) {
        er.l<DialogData, i0> lVarL = params.l();
        cb4.h.b bVar = cb4.h.b.f24985a;
        mx.c cVar = gVar.labelProvider;
        lVarL.b(new DialogData(bVar, cVar.e(tb0.b.f189413x, cVar.c(tb0.b.f189414y).getText()), gVar.labelProvider.c(tb0.b.f189412w), new DialogButtonTextData(gVar.labelProvider.c(tb0.b.f189394e), null, params.f(), 2, null), new DialogButtonTextData(gVar.labelProvider.c(tb0.b.f189392c), null, params.a(), 2, null), null, null, 96, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(List list) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Params params, FamilyCardDocument familyCardDocument) {
        params.g().b(familyCardDocument);
        return i0.f148189a;
    }

    public final Label q() {
        return this.labelProvider.c(tb0.b.f189395f);
    }

    @Override // er.l
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public m.a b(final Params params) {
        final l lVarD = params.m().d();
        if ((lVarD instanceof l.Initial) || (lVarD instanceof l.DeleteDocument)) {
            return m.a.b.f25238a;
        }
        if ((lVarD instanceof l.b.ErrorUpdating) || (lVarD instanceof l.b.ErrorInitial) || (lVarD instanceof l.b.ErrorLoading)) {
            return new m.a.Error(((l.b) lVarD).getErrorVMSAdapter());
        }
        if (!(lVarD instanceof l.d.Updating) && !(lVarD instanceof l.d.Displaying)) {
            throw new oq.p();
        }
        l.d dVar = (l.d) lVarD;
        Bitmap bitmap = dVar.getStateData().c().get(dVar.getStateData().getSelectedCard().getScopeData().getData().getNo());
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.d()), this.labelProvider.c(tb0.b.G), null, null, null, 28, null), null, null, null, null, 61, null);
        n.Switch r15 = (dVar.getStateData().getFamilyCards().b().isEmpty() || !dVar.getStateData().getSelectedCard().getScopeData().getData().g()) ? null : new n.Switch(new n.Switch.TabItem(this.labelProvider.c(tb0.b.C), n.Switch.EnumC5973b.LEFT), new n.Switch.TabItem(this.labelProvider.c(tb0.b.B), n.Switch.EnumC5973b.RIGHT), dVar.getStateData().getSelectedItem(), false, params.i(), 8, null);
        p20.c cVar = this.giloshMapper;
        List listQ = pq.v.q(new u2.Logo(tb0.a.f189389a, this.labelProvider.c(tb0.b.f189399j)), new u2.Hologram(null, c.f5372a, 1, null));
        State<l> stateM = params.m();
        o20.p.u uVar = o20.p.u.f140955c;
        Bitmap imageBitmap = dVar.getStateData().getSelectedCard().getScopeData().getData().g() ? dVar.getStateData().getImageBitmap() : null;
        Label labelC = this.labelProvider.c(tb0.b.f189406q);
        vb0.a documentStatus = dVar.getStateData().getSelectedCard().getDocumentStatus();
        vb0.a aVar = vb0.a.ACTIVE;
        DocumentGiloshData documentGiloshDataB = cVar.b(new p20.c.Params(listQ, stateM, uVar, imageBitmap, labelC, null, null, documentStatus == aVar, b.f5370a[dVar.getStateData().getSelectedCard().getDocumentStatus().ordinal()] == 1 ? this.labelProvider.c(tb0.b.f189404o) : this.labelProvider.c(tb0.b.f189401l), this.labelProvider.c(tb0.b.f189398i), params.j(), m(dVar.getStateData().getSelectedCard().getScopeData().getData()), null, null, params.b(), params.getDocumentVMS(), 12384, null));
        o20.l.SingleCardImageButton singleCardImageButton = new o20.l.SingleCardImageButton(bitmap, this.labelProvider.c(tb0.b.F), new er.a() { // from class: ac0.a
            @Override // er.a
            public final Object a() {
                return g.s(params);
            }
        });
        Label labelC2 = this.labelProvider.c(tb0.b.A);
        int i15 = jz.a.f106785h1;
        o50.f.c cVar2 = o50.f.c.f142478a;
        BaseDocumentData baseDocumentData = new BaseDocumentData(null, null, null, documentGiloshDataB, pq.v.s(singleCardImageButton, new o20.l.Shortcuts(new ShortcutsLayoutData(pq.v.s(new SmallCardData(null, labelC2, null, i15, cVar2, false, new er.a() { // from class: ac0.b
            @Override // er.a
            public final Object a() {
                return g.u(lVarD, params, this);
            }
        }, 37, null), new SmallCardData(null, this.labelProvider.c(tb0.b.E), null, jz.a.f106895x, cVar2, false, params.h(), 37, null), dVar.getStateData().getSelectedCard().getScopeData().getData().g() ? new SmallCardData(null, this.labelProvider.c(tb0.b.f189400k), null, jz.a.f106727a, o50.f.b.f142477a, false, new er.a() { // from class: ac0.c
            @Override // er.a
            public final Object a() {
                return g.v(params, this);
            }
        }, 37, null) : null), new ShortcutMoreData(this.labelProvider.c(tb0.b.f189409t), new er.l() { // from class: ac0.d
            @Override // er.l
            public final Object b(Object obj) {
                return g.x((List) obj);
            }
        }))), new o20.l.UpdateDataItem(this.labelProvider.c(tb0.b.f189402m), mx.b.d(this.dateFormatter.d(new fz.b.OffsetDateTime(dVar.getStateData().getSelectedCard().getScopeData().getHeader().getTs()), fz.c.DOTTED), "lastUpdateDate"), (dVar.getStateData().getSelectedCard().getScopeData().getData().g() && dVar.getStateData().getSelectedCard().getDocumentStatus() == aVar) ? this.labelProvider.c(tb0.b.f189403n) : null, null, params.j(), 8, null)), null, null, 103, null);
        List<FamilyCardDocument> listB = dVar.getStateData().getFamilyCards().b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        for (final FamilyCardDocument familyCardDocument : listB) {
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: ac0.e
                @Override // er.a
                public final Object a() {
                    return g.z(params, familyCardDocument);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.d(familyCardDocument.getScopeData().getData().a(), "fullNameValue"), null, null, 0, 0, null, 62, null)), null, 5, null), null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2813, null));
        }
        return new m.a.Initialized(baseScaffoldData, r15, baseDocumentData, arrayList, new ModalBottomSheetData(new ModalSheetState(dVar.getStateData().getIsBottomSheetVisible() ? v.EXPANDED : v.HIDDEN, false, new er.l() { // from class: ac0.f
            @Override // er.l
            public final Object b(Object obj) {
                return g.E(params, (v) obj);
            }
        }, 2, null), this.labelProvider.c(tb0.b.f189390a), null, null, 12, null), new FamilyCardBottomSheetData(bitmap, this.labelProvider.c(tb0.b.f189393d)), params.e(), dVar.getDialogVMSAdapter(), params.d());
    }
}
