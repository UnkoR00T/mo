package nj1;

import androidx.compose.ui.graphics.Color;
import d60.ScrollControllerData;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.List;
import mj1.ContactDetailsFields;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import r30.CheckBoxRowData;
import vi1.ChildParticipant;
import w30.CheckBoxSingleData;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u0014*\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00142\b\b\u0001\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lnj1/f;", "Lxw/f;", "Lnj1/f$a;", "Lmj1/d$a;", "Lmx/c;", "labelProvider", "Lsi1/a;", "defenceTrainingEndpoints", "<init>", "(Lmx/c;Lsi1/a;)V", "", "Lvi1/a;", "Lkotlin/Function1;", "", "Loq/i0;", "onRemoveChild", "Ln50/g;", "l", "(Ljava/util/List;Ler/l;)Ljava/util/List;", "Liy/b0;", "Lmx/a;", "z", "(Liy/b0;)Lmx/a;", "stringId", "x", "(I)Lmx/a;", "params", "q", "(Lnj1/f$a;)Lmj1/d$a;", "a", "Lmx/c;", "b", "Lsi1/a;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, mj1.d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final si1.a defenceTrainingEndpoints;

    /* JADX INFO: renamed from: nj1.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\n\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b\u001c\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010\"R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\"R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b$\u0010)R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b#\u0010\"R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b'\u0010)R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b*\u0010)¨\u0006+"}, d2 = {"Lnj1/f$a;", "", "Lmj1/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "onAddOtherChildClick", "onGoNextClick", "onPointerTouch", "Lkotlin/Function1;", "Lmj1/g;", "onEditFields", "onCloseProcess", "", "onOpenUrl", "", "onRemoveChild", "<init>", "(Lmj1/c;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/a;Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmj1/c;", "i", "()Lmj1/c;", "b", "Ler/a;", "()Ler/a;", "c", "d", "e", "g", "f", "Ler/l;", "()Ler/l;", "h", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final mj1.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddOtherChildClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoNextClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onPointerTouch;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<ContactDetailsFields, i0> onEditFields;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseProcess;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onOpenUrl;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Integer, i0> onRemoveChild;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(mj1.c cVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, l<? super ContactDetailsFields, i0> lVar, er.a<i0> aVar5, l<? super String, i0> lVar2, l<? super Integer, i0> lVar3) {
            this.state = cVar;
            this.onBackClick = aVar;
            this.onAddOtherChildClick = aVar2;
            this.onGoNextClick = aVar3;
            this.onPointerTouch = aVar4;
            this.onEditFields = lVar;
            this.onCloseProcess = aVar5;
            this.onOpenUrl = lVar2;
            this.onRemoveChild = lVar3;
        }

        public final er.a<i0> a() {
            return this.onAddOtherChildClick;
        }

        public final er.a<i0> b() {
            return this.onBackClick;
        }

        public final er.a<i0> c() {
            return this.onCloseProcess;
        }

        public final l<ContactDetailsFields, i0> d() {
            return this.onEditFields;
        }

        public final er.a<i0> e() {
            return this.onGoNextClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onAddOtherChildClick, params.onAddOtherChildClick) && t.c(this.onGoNextClick, params.onGoNextClick) && t.c(this.onPointerTouch, params.onPointerTouch) && t.c(this.onEditFields, params.onEditFields) && t.c(this.onCloseProcess, params.onCloseProcess) && t.c(this.onOpenUrl, params.onOpenUrl) && t.c(this.onRemoveChild, params.onRemoveChild);
        }

        public final l<String, i0> f() {
            return this.onOpenUrl;
        }

        public final er.a<i0> g() {
            return this.onPointerTouch;
        }

        public final l<Integer, i0> h() {
            return this.onRemoveChild;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onAddOtherChildClick.hashCode()) * 31) + this.onGoNextClick.hashCode()) * 31) + this.onPointerTouch.hashCode()) * 31) + this.onEditFields.hashCode()) * 31) + this.onCloseProcess.hashCode()) * 31) + this.onOpenUrl.hashCode()) * 31) + this.onRemoveChild.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final mj1.c getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onAddOtherChildClick=" + this.onAddOtherChildClick + ", onGoNextClick=" + this.onGoNextClick + ", onPointerTouch=" + this.onPointerTouch + ", onEditFields=" + this.onEditFields + ", onCloseProcess=" + this.onCloseProcess + ", onOpenUrl=" + this.onOpenUrl + ", onRemoveChild=" + this.onRemoveChild + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f136848a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-272508614);
            if (p076m2.t.k()) {
                p076m2.t.o(-272508614, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.contactdetails.mapper.ContactDetailsScreenMapper.invoke.<anonymous>.<anonymous> (ContactDetailsScreenMapper.kt:162)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f136849a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-879704194);
            if (p076m2.t.k()) {
                p076m2.t.o(-879704194, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.contactdetails.mapper.ContactDetailsScreenMapper.invoke.<anonymous>.<anonymous> (ContactDetailsScreenMapper.kt:169)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    public f(mx.c cVar, si1.a aVar) {
        this.labelProvider = cVar;
        this.defenceTrainingEndpoints = aVar;
    }

    private final List<DefaultSingleCardData> l(List<ChildParticipant> list, final l<? super Integer, i0> lVar) {
        ArrayList arrayList = new ArrayList();
        final int i15 = 0;
        int i16 = 0;
        for (Object obj : list) {
            int i17 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            ChildParticipant childParticipant = (ChildParticipant) obj;
            DefaultSingleCardData defaultSingleCardData = null;
            if (childParticipant.getIsSelected()) {
                Label labelB = mx.b.b(childParticipant.d(), "");
                i16++;
                defaultSingleCardData = new DefaultSingleCardData("RemoveChildParticipantCard" + i16, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(labelB, null, null, 3, null)), null, 5, null), null, x0.IconButton.INSTANCE.a(x(ri1.b.F).o(Label.INSTANCE.d()).o(labelB), new er.a() { // from class: nj1.a
                    @Override // er.a
                    public final Object a() {
                        return f.m(lVar, i15);
                    }
                }), null, 2814, null);
            }
            if (defaultSingleCardData != null) {
                arrayList.add(defaultSingleCardData);
            }
            i15 = i17;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(l lVar, int i15) {
        lVar.b(Integer.valueOf(i15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params, ContactDetailsFields.a.EmailTextInput emailTextInput, ContactDetailsFields contactDetailsFields, String str) {
        params.d().b(ContactDetailsFields.b(contactDetailsFields, emailTextInput.b(hz.b.C2039b.f86846c, c0.g(str)), null, null, null, null, 22, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, ContactDetailsFields.a.PhoneNumberInput phoneNumberInput, ContactDetailsFields contactDetailsFields, String str) {
        params.d().b(ContactDetailsFields.b(contactDetailsFields, null, ContactDetailsFields.a.PhoneNumberInput.c(phoneNumberInput, null, hz.b.C2039b.f86846c, PhoneNumber.e(phoneNumberInput.getValue(), PhoneNumber.c.c(c0.g(str)), null, 2, null), 1, null), null, null, null, 21, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params, ContactDetailsFields.a.PhoneNumberInput phoneNumberInput, ContactDetailsFields contactDetailsFields, String str) {
        params.d().b(ContactDetailsFields.b(contactDetailsFields, null, ContactDetailsFields.a.PhoneNumberInput.c(phoneNumberInput, hz.b.C2039b.f86846c, null, PhoneNumber.e(phoneNumberInput.getValue(), null, PhoneNumber.b.c(c0.g(str)), 1, null), 2, null), null, null, null, 21, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params, ContactDetailsFields.a.StatementCheckBox statementCheckBox, ContactDetailsFields contactDetailsFields, boolean z15) {
        params.d().b(ContactDetailsFields.b(contactDetailsFields, null, null, statementCheckBox.b(z15, hz.b.C2039b.f86846c), null, null, 19, null));
        return i0.f148189a;
    }

    private final Label x(int stringId) {
        return this.labelProvider.c(stringId);
    }

    private final Label z(b0 b0Var) {
        String strE;
        if (b0Var == null || (strE = c0.e(b0Var)) == null) {
            strE = "";
        }
        return new Label(strE, "");
    }

    @Override // er.l
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public mj1.d.a b(final Params params) {
        mj1.c state = params.getState();
        if (state instanceof mj1.c.Error) {
            return new mj1.d.a.Error(((mj1.c.Error) state).getErrorVMSAdapter());
        }
        if (!(state instanceof mj1.c.a)) {
            throw new oq.p();
        }
        final ContactDetailsFields fields = ((mj1.c.a) params.getState()).getFields();
        er.a<i0> aVarB = params.b();
        er.a<i0> aVarG = params.g();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), x(ri1.b.S), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.c(), 6, null)), null, 20, null), null, null, null, new ScrollControllerData(fields.h(), false, true, 2, null), 29, null);
        Label labelX = x(ri1.b.f174377i);
        Label labelX2 = x(ri1.b.T);
        final ContactDetailsFields.a.EmailTextInput email = ((mj1.c.a) params.getState()).getFields().getEmail();
        v50.c.Text text = new v50.c.Text("EmailInput", x(ri1.b.f174380j), null, z(email.getValue()), email.getValidationState(), null, null, new l() { // from class: nj1.b
            @Override // er.l
            public final Object b(Object obj) {
                return f.r(params, email, fields, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, v50.c.Text.a.EMAIL, null, email.a(), 393060, null);
        final ContactDetailsFields.a.PhoneNumberInput phoneNumber = ((mj1.c.a) params.getState()).getFields().getPhoneNumber();
        v50.c.PhoneNumber phoneNumber2 = new v50.c.PhoneNumber("PhoneInput", null, x(ri1.b.f174422x), 0, null, phoneNumber.a(), z(phoneNumber.getValue().h()), 0, phoneNumber.getPrefixValidationState(), new l() { // from class: nj1.c
            @Override // er.l
            public final Object b(Object obj) {
                return f.s(params, phoneNumber, fields, (String) obj);
            }
        }, null, z(phoneNumber.getValue().g()), null, phoneNumber.getNumberValidationState(), new l() { // from class: nj1.d
            @Override // er.l
            public final Object b(Object obj) {
                return f.u(params, phoneNumber, fields, (String) obj);
            }
        }, null, 38042, null);
        Label labelX3 = x(ri1.b.Q);
        Label labelX4 = x(ri1.b.P);
        CardListData cardListData = new CardListData(l(((mj1.c.a) params.getState()).getFields().d(), params.h()), null, false, null, null, 30, null);
        DefaultSingleCardData defaultSingleCardData = new DefaultSingleCardData("ChooseChildrenCard", params.a(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(x(ri1.b.O), null, c.f136849a, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106760e0, null, b.f136848a, null, null, 26, null), 3, null), null, null, 3324, null);
        Label labelX5 = x(ri1.b.f174428z);
        final ContactDetailsFields.a.StatementCheckBox statement = ((mj1.c.a) params.getState()).getFields().getStatement();
        return new mj1.d.a.Initialized(aVarB, aVarG, baseScaffoldData, labelX, labelX2, text, phoneNumber2, labelX3, labelX4, cardListData, defaultSingleCardData, labelX5, new CheckBoxSingleData(new CheckBoxRowData("StatementCheckBox", statement.getIsChecked(), new l() { // from class: nj1.e
            @Override // er.l
            public final Object b(Object obj) {
                return f.v(params, statement, fields, ((Boolean) obj).booleanValue());
            }
        }, x(ri1.b.V), null, null, new r30.d.Link(new LinkData(null, x(ri1.b.U), this.defenceTrainingEndpoints.b0(), LinkData.EnumC5775a.WEBSITE, false, params.f(), 17, null)), null, 176, null), statement.getValidationState() instanceof hz.b.Invalid ? new r30.b.Error(null, ((hz.b.Invalid) statement.getValidationState()).getMessage(), 1, null) : r30.b.a.f171263a, null, false, statement.a(), 12, null), new ButtonData("NextButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(x(ri1.b.R), null, 2, null), k30.d.a.f107773a, null, params.e(), 34, null));
    }
}
