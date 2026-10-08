package yh3;

import androidx.compose.ui.graphics.Color;
import d60.ScrollControllerData;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import j30.ButtonTextData;
import java.util.Map;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import wh3.State;
import wh3.q;
import x50.NavigationButtonData;
import xw.PhoneNumber;
import y30.n;
import zh3.CompanyFieldsData;
import zh3.CompanyOwner;
import zh3.PersonFieldsData;
import zh3.PhysicalOwner;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0018\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u0011*\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lyh3/j;", "Lxw/f;", "Lyh3/j$b;", "Lwh3/q$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "Ltv0/l$c;", "vehicleOwnerDetails", "Ltv0/l$c$c;", "physicalOwnerType", "Lzh3/a$b$b;", "s", "(Lmx/c;Lyh3/j$b;Ltv0/l$c;Ltv0/l$c$c;)Lzh3/a$b$b;", "Liy/b0;", "Lmx/a;", "K", "(Liy/b0;)Lmx/a;", "F", "(Lyh3/j$b;)Lwh3/q$a;", "a", "Lmx/c;", "b", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements xw.f<Params, q.Data> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f227116c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: yh3.j$b, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\f\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\f\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\f\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\f\u0012\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\f\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b+\u00101R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b'\u00101R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00101R)\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R)\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u00108R)\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b-\u00106\u001a\u0004\b;\u00108R)\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b<\u00106\u001a\u0004\b=\u00108R)\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\f8\u0006¢\u0006\f\n\u0004\b>\u00106\u001a\u0004\b?\u00108R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b?\u0010,\u001a\u0004\b3\u0010.R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b7\u0010,\u001a\u0004\b9\u0010.R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b=\u0010,\u001a\u0004\b5\u0010.R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b;\u0010,\u001a\u0004\b2\u0010.R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b>\u00101R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b/\u00101R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b)\u00100\u001a\u0004\b<\u00101¨\u0006@"}, d2 = {"Lyh3/j$b;", "", "Lwh3/p;", "state", "Lkotlin/Function1;", "Ly30/n$b$b;", "Loq/i0;", "onControllersSwitchChange", "Lkotlin/Function0;", "onBack", "onAddCoOwner", "onRemoveCoOwner", "Lkotlin/Function2;", "Ltv0/l$c$c;", "Liy/b0;", "onPhysicalOwnerNameChange", "onPhysicalOwnerSurnameChange", "onPhysicalOwnerPhonePrefixChange", "onPhysicalOwnerPhoneNumberChange", "onPhysicalOwnerEmailChange", "onCompanyNameChange", "onCompanyPhonePrefixChange", "onCompanyPhoneNumberChange", "onCompanyEmailChange", "onNextButtonClick", "onBackAction", "onExitAction", "<init>", "(Lwh3/p;Ler/l;Ler/a;Ler/a;Ler/a;Ler/p;Ler/p;Ler/p;Ler/p;Ler/p;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwh3/p;", "q", "()Lwh3/p;", "b", "Ler/l;", "h", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "d", "e", "p", "f", "Ler/p;", "l", "()Ler/p;", "g", "o", "n", "i", "m", "j", "k", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<n.Switch.EnumC5973b, i0> onControllersSwitchChange;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onAddCoOwner;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRemoveCoOwner;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<tv0.l.PhysicalOwner.EnumC5029c, b0, i0> onPhysicalOwnerNameChange;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<tv0.l.PhysicalOwner.EnumC5029c, b0, i0> onPhysicalOwnerSurnameChange;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<tv0.l.PhysicalOwner.EnumC5029c, b0, i0> onPhysicalOwnerPhonePrefixChange;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<tv0.l.PhysicalOwner.EnumC5029c, b0, i0> onPhysicalOwnerPhoneNumberChange;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<tv0.l.PhysicalOwner.EnumC5029c, b0, i0> onPhysicalOwnerEmailChange;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onCompanyNameChange;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onCompanyPhonePrefixChange;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onCompanyPhoneNumberChange;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onCompanyEmailChange;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClick;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onExitAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super n.Switch.EnumC5973b, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, p<? super tv0.l.PhysicalOwner.EnumC5029c, ? super b0, i0> pVar, p<? super tv0.l.PhysicalOwner.EnumC5029c, ? super b0, i0> pVar2, p<? super tv0.l.PhysicalOwner.EnumC5029c, ? super b0, i0> pVar3, p<? super tv0.l.PhysicalOwner.EnumC5029c, ? super b0, i0> pVar4, p<? super tv0.l.PhysicalOwner.EnumC5029c, ? super b0, i0> pVar5, l<? super b0, i0> lVar2, l<? super b0, i0> lVar3, l<? super b0, i0> lVar4, l<? super b0, i0> lVar5, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6) {
            this.state = state;
            this.onControllersSwitchChange = lVar;
            this.onBack = aVar;
            this.onAddCoOwner = aVar2;
            this.onRemoveCoOwner = aVar3;
            this.onPhysicalOwnerNameChange = pVar;
            this.onPhysicalOwnerSurnameChange = pVar2;
            this.onPhysicalOwnerPhonePrefixChange = pVar3;
            this.onPhysicalOwnerPhoneNumberChange = pVar4;
            this.onPhysicalOwnerEmailChange = pVar5;
            this.onCompanyNameChange = lVar2;
            this.onCompanyPhonePrefixChange = lVar3;
            this.onCompanyPhoneNumberChange = lVar4;
            this.onCompanyEmailChange = lVar5;
            this.onNextButtonClick = aVar4;
            this.onBackAction = aVar5;
            this.onExitAction = aVar6;
        }

        public final er.a<i0> a() {
            return this.onAddCoOwner;
        }

        public final er.a<i0> b() {
            return this.onBack;
        }

        public final er.a<i0> c() {
            return this.onBackAction;
        }

        public final l<b0, i0> d() {
            return this.onCompanyEmailChange;
        }

        public final l<b0, i0> e() {
            return this.onCompanyNameChange;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onControllersSwitchChange, params.onControllersSwitchChange) && t.c(this.onBack, params.onBack) && t.c(this.onAddCoOwner, params.onAddCoOwner) && t.c(this.onRemoveCoOwner, params.onRemoveCoOwner) && t.c(this.onPhysicalOwnerNameChange, params.onPhysicalOwnerNameChange) && t.c(this.onPhysicalOwnerSurnameChange, params.onPhysicalOwnerSurnameChange) && t.c(this.onPhysicalOwnerPhonePrefixChange, params.onPhysicalOwnerPhonePrefixChange) && t.c(this.onPhysicalOwnerPhoneNumberChange, params.onPhysicalOwnerPhoneNumberChange) && t.c(this.onPhysicalOwnerEmailChange, params.onPhysicalOwnerEmailChange) && t.c(this.onCompanyNameChange, params.onCompanyNameChange) && t.c(this.onCompanyPhonePrefixChange, params.onCompanyPhonePrefixChange) && t.c(this.onCompanyPhoneNumberChange, params.onCompanyPhoneNumberChange) && t.c(this.onCompanyEmailChange, params.onCompanyEmailChange) && t.c(this.onNextButtonClick, params.onNextButtonClick) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onExitAction, params.onExitAction);
        }

        public final l<b0, i0> f() {
            return this.onCompanyPhoneNumberChange;
        }

        public final l<b0, i0> g() {
            return this.onCompanyPhonePrefixChange;
        }

        public final l<n.Switch.EnumC5973b, i0> h() {
            return this.onControllersSwitchChange;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((this.state.hashCode() * 31) + this.onControllersSwitchChange.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onAddCoOwner.hashCode()) * 31) + this.onRemoveCoOwner.hashCode()) * 31) + this.onPhysicalOwnerNameChange.hashCode()) * 31) + this.onPhysicalOwnerSurnameChange.hashCode()) * 31) + this.onPhysicalOwnerPhonePrefixChange.hashCode()) * 31) + this.onPhysicalOwnerPhoneNumberChange.hashCode()) * 31) + this.onPhysicalOwnerEmailChange.hashCode()) * 31) + this.onCompanyNameChange.hashCode()) * 31) + this.onCompanyPhonePrefixChange.hashCode()) * 31) + this.onCompanyPhoneNumberChange.hashCode()) * 31) + this.onCompanyEmailChange.hashCode()) * 31) + this.onNextButtonClick.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onExitAction.hashCode();
        }

        public final er.a<i0> i() {
            return this.onExitAction;
        }

        public final er.a<i0> j() {
            return this.onNextButtonClick;
        }

        public final p<tv0.l.PhysicalOwner.EnumC5029c, b0, i0> k() {
            return this.onPhysicalOwnerEmailChange;
        }

        public final p<tv0.l.PhysicalOwner.EnumC5029c, b0, i0> l() {
            return this.onPhysicalOwnerNameChange;
        }

        public final p<tv0.l.PhysicalOwner.EnumC5029c, b0, i0> m() {
            return this.onPhysicalOwnerPhoneNumberChange;
        }

        public final p<tv0.l.PhysicalOwner.EnumC5029c, b0, i0> n() {
            return this.onPhysicalOwnerPhonePrefixChange;
        }

        public final p<tv0.l.PhysicalOwner.EnumC5029c, b0, i0> o() {
            return this.onPhysicalOwnerSurnameChange;
        }

        public final er.a<i0> p() {
            return this.onRemoveCoOwner;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onControllersSwitchChange=" + this.onControllersSwitchChange + ", onBack=" + this.onBack + ", onAddCoOwner=" + this.onAddCoOwner + ", onRemoveCoOwner=" + this.onRemoveCoOwner + ", onPhysicalOwnerNameChange=" + this.onPhysicalOwnerNameChange + ", onPhysicalOwnerSurnameChange=" + this.onPhysicalOwnerSurnameChange + ", onPhysicalOwnerPhonePrefixChange=" + this.onPhysicalOwnerPhonePrefixChange + ", onPhysicalOwnerPhoneNumberChange=" + this.onPhysicalOwnerPhoneNumberChange + ", onPhysicalOwnerEmailChange=" + this.onPhysicalOwnerEmailChange + ", onCompanyNameChange=" + this.onCompanyNameChange + ", onCompanyPhonePrefixChange=" + this.onCompanyPhonePrefixChange + ", onCompanyPhoneNumberChange=" + this.onCompanyPhoneNumberChange + ", onCompanyEmailChange=" + this.onCompanyEmailChange + ", onNextButtonClick=" + this.onNextButtonClick + ", onBackAction=" + this.onBackAction + ", onExitAction=" + this.onExitAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f227135a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-537661704);
            if (p076m2.t.k()) {
                p076m2.t.o(-537661704, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehicleownership.mapper.VehicleOwnershipScreenMapper.invoke.<anonymous>.<anonymous> (VehicleOwnershipScreenMapper.kt:88)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f227136a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1487453484);
            if (p076m2.t.k()) {
                p076m2.t.o(1487453484, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehicleownership.mapper.VehicleOwnershipScreenMapper.invoke.<anonymous>.<anonymous> (VehicleOwnershipScreenMapper.kt:127)");
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
    static final class e implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f227137a = new e();

        e() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-611917610);
            if (p076m2.t.k()) {
                p076m2.t.o(-611917610, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.vehicleownership.mapper.VehicleOwnershipScreenMapper.invoke.<anonymous>.<anonymous> (VehicleOwnershipScreenMapper.kt:134)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    public j(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(Params params, tv0.l.PhysicalOwner.EnumC5029c enumC5029c, String str) {
        params.k().B(enumC5029c, c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(Params params, String str) {
        params.e().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(Params params, String str) {
        params.g().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(Params params, String str) {
        params.f().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(Params params, String str) {
        params.d().b(c0.g(str));
        return i0.f148189a;
    }

    private final Label K(b0 b0Var) {
        String strE;
        if (b0Var == null || (strE = c0.e(b0Var)) == null) {
            strE = "";
        }
        return new Label(strE, "");
    }

    private final zh3.a.PhysicalOwner.PersonScreenModel s(mx.c labelProvider, final Params params, tv0.l.PhysicalOwner vehicleOwnerDetails, final tv0.l.PhysicalOwner.EnumC5029c physicalOwnerType) {
        hz.b validationState;
        hz.b validationState2;
        hz.b validationState3;
        hz.b validationState4;
        hz.b validationState5;
        PhoneNumber phoneNumber;
        PhoneNumber phoneNumber2;
        PersonFieldsData.Data phoneNumberField;
        PersonFieldsData.Data phonePrefixField;
        int iOrdinal = physicalOwnerType.ordinal();
        PersonFieldsData personFieldsData = params.getState().d().get(physicalOwnerType);
        if (personFieldsData == null || (phonePrefixField = personFieldsData.getPhonePrefixField()) == null || (validationState = phonePrefixField.getValidationState()) == null) {
            validationState = hz.b.C2039b.f86846c;
        }
        hz.b bVar = validationState;
        PersonFieldsData personFieldsData2 = params.getState().d().get(physicalOwnerType);
        if (personFieldsData2 == null || (phoneNumberField = personFieldsData2.getPhoneNumberField()) == null || (validationState2 = phoneNumberField.getValidationState()) == null) {
            validationState2 = hz.b.C2039b.f86846c;
        }
        hz.b bVar2 = validationState2;
        PersonFieldsData personFieldsData3 = params.getState().d().get(physicalOwnerType);
        PersonFieldsData.Data nameField = personFieldsData3 != null ? personFieldsData3.getNameField() : null;
        Label labelN = labelProvider.c(md3.b.D).n("physicalOwnerName");
        tv0.l.PhysicalOwner.PersonData personData = vehicleOwnerDetails.c().get(physicalOwnerType);
        Label labelK = K(personData != null ? personData.getName() : null);
        PhysicalOwner physicalOwner = new PhysicalOwner(physicalOwnerType, nameField != null ? nameField.getField() : null);
        if (nameField == null || (validationState3 = nameField.getValidationState()) == null) {
            validationState3 = hz.b.C2039b.f86846c;
        }
        v50.c.Text text = new v50.c.Text(null, labelN, null, labelK, validationState3, null, null, new l() { // from class: yh3.a
            @Override // er.l
            public final Object b(Object obj) {
                return j.u(params, physicalOwnerType, (String) obj);
            }
        }, null, false, 0, null, false, null, false, Integer.valueOf(iOrdinal), null, null, null, physicalOwner, 491365, null);
        PersonFieldsData personFieldsData4 = params.getState().d().get(physicalOwnerType);
        PersonFieldsData.Data surnameField = personFieldsData4 != null ? personFieldsData4.getSurnameField() : null;
        Label labelN2 = labelProvider.c(md3.b.H).n("physicalOwnerSurname");
        tv0.l.PhysicalOwner.PersonData personData2 = vehicleOwnerDetails.c().get(physicalOwnerType);
        Label labelK2 = K(personData2 != null ? personData2.getSurname() : null);
        PhysicalOwner physicalOwner2 = new PhysicalOwner(physicalOwnerType, surnameField != null ? surnameField.getField() : null);
        if (surnameField == null || (validationState4 = surnameField.getValidationState()) == null) {
            validationState4 = hz.b.C2039b.f86846c;
        }
        v50.c.Text text2 = new v50.c.Text(null, labelN2, null, labelK2, validationState4, null, null, new l() { // from class: yh3.b
            @Override // er.l
            public final Object b(Object obj) {
                return j.v(params, physicalOwnerType, (String) obj);
            }
        }, null, false, 0, null, false, null, false, Integer.valueOf(iOrdinal), null, null, null, physicalOwner2, 491365, null);
        PersonFieldsData personFieldsData5 = params.getState().d().get(physicalOwnerType);
        PersonFieldsData.Data phoneNumberField2 = personFieldsData5 != null ? personFieldsData5.getPhoneNumberField() : null;
        Label labelN3 = labelProvider.c(md3.b.O).n("physicalOwnerPhoneNumber");
        tv0.l.PhysicalOwner.PersonData personData3 = vehicleOwnerDetails.c().get(physicalOwnerType);
        Label labelK3 = K((personData3 == null || (phoneNumber2 = personData3.getPhoneNumber()) == null) ? null : phoneNumber2.h());
        tv0.l.PhysicalOwner.PersonData personData4 = vehicleOwnerDetails.c().get(physicalOwnerType);
        v50.c.PhoneNumber phoneNumber3 = new v50.c.PhoneNumber(null, Integer.valueOf(iOrdinal), labelN3, 0, null, new PhysicalOwner(physicalOwnerType, phoneNumberField2 != null ? phoneNumberField2.getField() : null), labelK3, 0, bVar, new l() { // from class: yh3.c
            @Override // er.l
            public final Object b(Object obj) {
                return j.x(params, physicalOwnerType, (String) obj);
            }
        }, null, K((personData4 == null || (phoneNumber = personData4.getPhoneNumber()) == null) ? null : phoneNumber.g()), null, bVar2, new l() { // from class: yh3.d
            @Override // er.l
            public final Object b(Object obj) {
                return j.z(params, physicalOwnerType, (String) obj);
            }
        }, null, 38041, null);
        PersonFieldsData personFieldsData6 = params.getState().d().get(physicalOwnerType);
        PersonFieldsData.Data emailField = personFieldsData6 != null ? personFieldsData6.getEmailField() : null;
        Label labelN4 = labelProvider.c(md3.b.f125827t).n("physicalOwnerEmail");
        tv0.l.PhysicalOwner.PersonData personData5 = vehicleOwnerDetails.c().get(physicalOwnerType);
        Label labelK4 = K(personData5 != null ? personData5.getEmail() : null);
        PhysicalOwner physicalOwner3 = new PhysicalOwner(physicalOwnerType, emailField != null ? emailField.getField() : null);
        if (emailField == null || (validationState5 = emailField.getValidationState()) == null) {
            validationState5 = hz.b.C2039b.f86846c;
        }
        return new zh3.a.PhysicalOwner.PersonScreenModel(text, text2, phoneNumber3, new v50.c.Text(null, labelN4, null, labelK4, validationState5, null, null, new l() { // from class: yh3.e
            @Override // er.l
            public final Object b(Object obj) {
                return j.E(params, physicalOwnerType, (String) obj);
            }
        }, null, false, 0, null, false, null, false, Integer.valueOf(iOrdinal), null, v50.c.Text.a.EMAIL, null, physicalOwner3, 360293, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params, tv0.l.PhysicalOwner.EnumC5029c enumC5029c, String str) {
        params.l().B(enumC5029c, c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params, tv0.l.PhysicalOwner.EnumC5029c enumC5029c, String str) {
        params.o().B(enumC5029c, c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(Params params, tv0.l.PhysicalOwner.EnumC5029c enumC5029c, String str) {
        params.n().B(enumC5029c, c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Params params, tv0.l.PhysicalOwner.EnumC5029c enumC5029c, String str) {
        params.m().B(enumC5029c, c0.g(str));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public q.Data b(final Params params) {
        n.Switch.EnumC5973b enumC5973b;
        zh3.a companyOwner;
        boolean zF;
        Label labelC;
        zh3.a.PhysicalOwner.InterfaceC6342a expanded;
        mx.c cVar = this.labelProvider;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(md3.b.f125847v3), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, c.f227135a, null, params.i(), 4, null)), null, 20, null), null, null, null, new ScrollControllerData(params.getState().e(), false, false, 6, null), 29, null);
        Label labelC2 = cVar.c(md3.b.f125738h6);
        Label labelC3 = cVar.c(md3.b.f125714e6);
        Label labelC4 = cVar.c(md3.b.f125730g6);
        n.Switch.EnumC5973b enumC5973b2 = n.Switch.EnumC5973b.LEFT;
        n.Switch.TabItem tabItem = new n.Switch.TabItem(labelC4, enumC5973b2);
        Label labelC5 = cVar.c(md3.b.f125722f6);
        n.Switch.EnumC5973b enumC5973b3 = n.Switch.EnumC5973b.RIGHT;
        n.Switch.TabItem tabItem2 = new n.Switch.TabItem(labelC5, enumC5973b3);
        tv0.l vehicleOwnerDetails = params.getState().getVehicleOwnerDetails();
        if (vehicleOwnerDetails instanceof tv0.l.PhysicalOwner) {
            enumC5973b = enumC5973b2;
        } else {
            if (!(vehicleOwnerDetails instanceof tv0.l.CompanyOwner)) {
                throw new oq.p();
            }
            enumC5973b = enumC5973b3;
        }
        n.Switch r15 = new n.Switch(tabItem, tabItem2, enumC5973b, false, params.h(), 8, null);
        tv0.l vehicleOwnerDetails2 = params.getState().getVehicleOwnerDetails();
        if (vehicleOwnerDetails2 instanceof tv0.l.PhysicalOwner) {
            tv0.l.PhysicalOwner physicalOwner = (tv0.l.PhysicalOwner) vehicleOwnerDetails2;
            zh3.a.PhysicalOwner.PersonScreenModel personScreenModelS = s(this.labelProvider, params, physicalOwner, tv0.l.PhysicalOwner.EnumC5029c.OWNER);
            Map<tv0.l.PhysicalOwner.EnumC5029c, tv0.l.PhysicalOwner.PersonData> mapC = physicalOwner.c();
            tv0.l.PhysicalOwner.EnumC5029c enumC5029c = tv0.l.PhysicalOwner.EnumC5029c.CO_OWNER;
            boolean z15 = mapC.get(enumC5029c) == null;
            if (z15) {
                expanded = new zh3.a.PhysicalOwner.InterfaceC6342a.Folded(new DefaultSingleCardData(null, params.a(), false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(cVar.c(md3.b.f125698c6), null, e.f227137a, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(jz.a.f106760e0, null, d.f227136a, null, null, 26, null), 3, null), null, null, 3325, null));
            } else {
                if (z15) {
                    throw new oq.p();
                }
                expanded = new zh3.a.PhysicalOwner.InterfaceC6342a.Expanded(cVar.c(md3.b.f125706d6), new ButtonTextData(null, cVar.c(md3.b.f125771m), null, null, params.p(), 13, null), s(this.labelProvider, params, physicalOwner, enumC5029c));
            }
            companyOwner = new zh3.a.PhysicalOwner(personScreenModelS, expanded);
        } else {
            if (!(vehicleOwnerDetails2 instanceof tv0.l.CompanyOwner)) {
                throw new oq.p();
            }
            hz.b validationState = params.getState().getCompanyOwnerFieldsData().getPhonePrefixField().getValidationState();
            hz.b validationState2 = params.getState().getCompanyOwnerFieldsData().getPhoneNumberField().getValidationState();
            CompanyFieldsData.Data nameField = params.getState().getCompanyOwnerFieldsData().getNameField();
            tv0.l.CompanyOwner companyOwner2 = (tv0.l.CompanyOwner) vehicleOwnerDetails2;
            v50.c.Text text = new v50.c.Text(null, cVar.c(md3.b.f125835u).n("companyOwnerName"), null, K(companyOwner2.getName()), nameField.getValidationState(), null, null, new l() { // from class: yh3.f
                @Override // er.l
                public final Object b(Object obj) {
                    return j.G(params, (String) obj);
                }
            }, null, false, 0, null, false, null, false, null, null, null, null, new CompanyOwner(nameField.getField()), 524133, null);
            v50.c.PhoneNumber phoneNumber = new v50.c.PhoneNumber(null, null, cVar.c(md3.b.O).n("companyOwnerPhoneNumber"), 0, null, new CompanyOwner(params.getState().getCompanyOwnerFieldsData().getPhoneNumberField().getField()), K(companyOwner2.getPhoneNumber().h()), 0, validationState, new l() { // from class: yh3.g
                @Override // er.l
                public final Object b(Object obj) {
                    return j.H(params, (String) obj);
                }
            }, null, K(companyOwner2.getPhoneNumber().g()), null, validationState2, new l() { // from class: yh3.h
                @Override // er.l
                public final Object b(Object obj) {
                    return j.I(params, (String) obj);
                }
            }, null, 38043, null);
            CompanyFieldsData.Data emailField = params.getState().getCompanyOwnerFieldsData().getEmailField();
            companyOwner = new zh3.a.CompanyOwner(text, phoneNumber, new v50.c.Text(null, cVar.c(md3.b.f125827t).n("companyOwnerEmail"), null, K(companyOwner2.getEmail()), emailField.getValidationState(), null, null, new l() { // from class: yh3.i
                @Override // er.l
                public final Object b(Object obj) {
                    return j.J(params, (String) obj);
                }
            }, null, false, 0, null, false, null, false, null, null, v50.c.Text.a.EMAIL, null, new CompanyOwner(emailField.getField()), 393061, null));
        }
        k30.d.a aVar = k30.d.a.f107773a;
        k30.a.Large large = new k30.a.Large(false, 1, null);
        tv0.l vehicleOwnerDetails3 = params.getState().getVehicleOwnerDetails();
        if (vehicleOwnerDetails3 instanceof tv0.l.PhysicalOwner) {
            zF = ((tv0.l.PhysicalOwner) vehicleOwnerDetails3).d();
        } else {
            if (!(vehicleOwnerDetails3 instanceof tv0.l.CompanyOwner)) {
                throw new oq.p();
            }
            zF = ((tv0.l.CompanyOwner) vehicleOwnerDetails3).f();
        }
        if (zF) {
            labelC = cVar.c(md3.b.K);
        } else {
            if (zF) {
                throw new oq.p();
            }
            labelC = cVar.c(md3.b.W);
        }
        return new q.Data(baseScaffoldData, labelC2, labelC3, r15, companyOwner, new ButtonData(null, null, large, new k30.c.WithText(labelC, null, 2, null), aVar, null, params.j(), 35, null), params.b());
    }
}
