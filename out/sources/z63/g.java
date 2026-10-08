package z63;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import er.q;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import x50.NavigationButtonData;
import xi0.ContactDetail;
import xi0.ContactDetailAdditionalValue;
import y63.i;
import y63.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001!B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JG\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013JM\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lz63/g;", "Lxw/f;", "Lz63/g$a;", "Ly63/j$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lxi0/a;", "emailContactDetails", "Lkotlin/Function0;", "Loq/i0;", "addEmailAction", "Lkotlin/Function1;", "Liy/b0;", "editEmailAction", "pendingEmailAction", "Ly63/j$a$b$a;", "m", "(Lxi0/a;Ler/a;Ler/l;Ler/a;)Ly63/j$a$b$a;", "phoneContactDetails", "addPhoneAction", "Lkotlin/Function2;", "editPhoneAction", "pendingPhoneAction", "r", "(Lxi0/a;Ler/a;Ler/p;Ler/a;)Ly63/j$a$b$a;", "contactDetail", "u", "(Lxi0/a;)Liy/b0;", "params", "v", "(Lz63/g$a;)Ly63/j$a;", "a", "Lmx/c;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<Params, j.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: z63.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Bá\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\b\u0012 \u0010\u000f\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\r\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u0011\u0012 \u0010\u0013\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\r\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b)\u0010(R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b!\u0010,R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010,R1\u0010\u000f\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\r8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b*\u00100R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b%\u0010,R)\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\u00118\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b1\u00104R1\u0010\u0013\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\r8\u0006¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b-\u00100R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b5\u0010(R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b2\u0010(¨\u00066"}, d2 = {"Lz63/g$a;", "", "Ly63/i;", "state", "Lkotlin/Function0;", "Loq/i0;", "backAction", "moreAction", "Lkotlin/Function1;", "", "addEmailAction", "Liy/b0;", "editEmailAction", "Lkotlin/Function3;", "Lxi0/a;", "confirmEmailAction", "addPhoneAction", "Lkotlin/Function2;", "editPhoneAction", "confirmPhoneAction", "hideSnackBarAction", "goToInfoPageAction", "<init>", "(Ly63/i;Ler/a;Ler/a;Ler/l;Ler/l;Ler/q;Ler/l;Ler/p;Ler/q;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ly63/i;", "k", "()Ly63/i;", "b", "Ler/a;", "c", "()Ler/a;", "j", "d", "Ler/l;", "()Ler/l;", "e", "f", "Ler/q;", "()Ler/q;", "g", "h", "Ler/p;", "()Ler/p;", "i", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final i state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> moreAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> addEmailAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> editEmailAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final q<ContactDetail, ContactDetail, Boolean, i0> confirmEmailAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Boolean, i0> addPhoneAction;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<b0, b0, i0> editPhoneAction;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final q<ContactDetail, ContactDetail, Boolean, i0> confirmPhoneAction;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> hideSnackBarAction;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToInfoPageAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(i iVar, er.a<i0> aVar, er.a<i0> aVar2, l<? super Boolean, i0> lVar, l<? super b0, i0> lVar2, q<? super ContactDetail, ? super ContactDetail, ? super Boolean, i0> qVar, l<? super Boolean, i0> lVar3, p<? super b0, ? super b0, i0> pVar, q<? super ContactDetail, ? super ContactDetail, ? super Boolean, i0> qVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = iVar;
            this.backAction = aVar;
            this.moreAction = aVar2;
            this.addEmailAction = lVar;
            this.editEmailAction = lVar2;
            this.confirmEmailAction = qVar;
            this.addPhoneAction = lVar3;
            this.editPhoneAction = pVar;
            this.confirmPhoneAction = qVar2;
            this.hideSnackBarAction = aVar3;
            this.goToInfoPageAction = aVar4;
        }

        public final l<Boolean, i0> a() {
            return this.addEmailAction;
        }

        public final l<Boolean, i0> b() {
            return this.addPhoneAction;
        }

        public final er.a<i0> c() {
            return this.backAction;
        }

        public final q<ContactDetail, ContactDetail, Boolean, i0> d() {
            return this.confirmEmailAction;
        }

        public final q<ContactDetail, ContactDetail, Boolean, i0> e() {
            return this.confirmPhoneAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.backAction, params.backAction) && t.c(this.moreAction, params.moreAction) && t.c(this.addEmailAction, params.addEmailAction) && t.c(this.editEmailAction, params.editEmailAction) && t.c(this.confirmEmailAction, params.confirmEmailAction) && t.c(this.addPhoneAction, params.addPhoneAction) && t.c(this.editPhoneAction, params.editPhoneAction) && t.c(this.confirmPhoneAction, params.confirmPhoneAction) && t.c(this.hideSnackBarAction, params.hideSnackBarAction) && t.c(this.goToInfoPageAction, params.goToInfoPageAction);
        }

        public final l<b0, i0> f() {
            return this.editEmailAction;
        }

        public final p<b0, b0, i0> g() {
            return this.editPhoneAction;
        }

        public final er.a<i0> h() {
            return this.goToInfoPageAction;
        }

        public int hashCode() {
            return (((((((((((((((((((this.state.hashCode() * 31) + this.backAction.hashCode()) * 31) + this.moreAction.hashCode()) * 31) + this.addEmailAction.hashCode()) * 31) + this.editEmailAction.hashCode()) * 31) + this.confirmEmailAction.hashCode()) * 31) + this.addPhoneAction.hashCode()) * 31) + this.editPhoneAction.hashCode()) * 31) + this.confirmPhoneAction.hashCode()) * 31) + this.hideSnackBarAction.hashCode()) * 31) + this.goToInfoPageAction.hashCode();
        }

        public final er.a<i0> i() {
            return this.hideSnackBarAction;
        }

        public final er.a<i0> j() {
            return this.moreAction;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final i getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", backAction=" + this.backAction + ", moreAction=" + this.moreAction + ", addEmailAction=" + this.addEmailAction + ", editEmailAction=" + this.editEmailAction + ", confirmEmailAction=" + this.confirmEmailAction + ", addPhoneAction=" + this.addPhoneAction + ", editPhoneAction=" + this.editPhoneAction + ", confirmPhoneAction=" + this.confirmPhoneAction + ", hideSnackBarAction=" + this.hideSnackBarAction + ", goToInfoPageAction=" + this.goToInfoPageAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f233209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f233210b;

        static {
            int[] iArr = new int[xi0.c.values().length];
            try {
                iArr[xi0.c.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xi0.c.NO_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[xi0.c.IN_REGISTRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[xi0.c.PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f233209a = iArr;
            int[] iArr2 = new int[xi0.d.values().length];
            try {
                iArr2[xi0.d.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[xi0.d.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[xi0.d.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f233210b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f233211a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1809286133);
            if (p076m2.t.k()) {
                p076m2.t.o(1809286133, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.main.mapper.MainContactDetailsMapper.invoke.<anonymous> (MainContactDetailsMapper.kt:110)");
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
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f233212a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1324340884);
            if (p076m2.t.k()) {
                p076m2.t.o(1324340884, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.main.mapper.MainContactDetailsMapper.invoke.<anonymous> (MainContactDetailsMapper.kt:111)");
            }
            long secondary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getSecondary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return secondary;
        }
    }

    public g(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(Params params, i iVar) {
        params.b().b(Boolean.valueOf(((i.Initialized) iVar).getContactDetails().getIsSomeRegistryContactAdded()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(Params params, ContactDetail contactDetail, i iVar) {
        i.Initialized initialized = (i.Initialized) iVar;
        params.e().w(contactDetail, initialized.getContactDetails().getPreviousPhoneNumberData(), Boolean.valueOf(initialized.getContactDetails().getIsSomeRegistryContactAdded()));
        return i0.f148189a;
    }

    private final j.a.Initialized.AbstractC6025a m(final ContactDetail emailContactDetails, er.a<i0> addEmailAction, final l<? super b0, i0> editEmailAction, er.a<i0> pendingEmailAction) {
        int i15 = b.f233209a[emailContactDetails.getStatus().ordinal()];
        if (i15 == 1 || i15 == 2) {
            return new j.a.Initialized.AbstractC6025a.Add(this.labelProvider.c(c53.a.f23684e), this.labelProvider.c(c53.a.f23677b1), addEmailAction);
        }
        if (i15 == 3) {
            Label labelC = this.labelProvider.c(c53.a.f23684e);
            b0 b0VarU = u(emailContactDetails);
            return new j.a.Initialized.AbstractC6025a.Edit(labelC, mx.b.d(b0VarU != null ? c0.e(b0VarU) : null, "email"), new er.a() { // from class: z63.a
                @Override // er.a
                public final Object a() {
                    return g.q(editEmailAction, emailContactDetails);
                }
            });
        }
        if (i15 != 4) {
            throw new oq.p();
        }
        Label labelC2 = this.labelProvider.c(c53.a.f23692g1);
        Label labelC3 = this.labelProvider.c(c53.a.f23684e);
        b0 b0VarU2 = u(emailContactDetails);
        return new j.a.Initialized.AbstractC6025a.Pending(labelC2, labelC3, mx.b.d(b0VarU2 != null ? c0.e(b0VarU2) : null, "email"), pendingEmailAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(l lVar, ContactDetail contactDetail) {
        b0 value = contactDetail.getValue();
        if (value == null) {
            value = b0.INSTANCE.a();
        }
        lVar.b(value);
        return i0.f148189a;
    }

    private final j.a.Initialized.AbstractC6025a r(final ContactDetail phoneContactDetails, er.a<i0> addPhoneAction, final p<? super b0, ? super b0, i0> editPhoneAction, er.a<i0> pendingPhoneAction) {
        int i15 = b.f233209a[phoneContactDetails.getStatus().ordinal()];
        if (i15 == 1 || i15 == 2) {
            return new j.a.Initialized.AbstractC6025a.Add(this.labelProvider.c(c53.a.f23702k), this.labelProvider.c(c53.a.f23689f1), addPhoneAction);
        }
        if (i15 == 3) {
            Label labelC = this.labelProvider.c(c53.a.f23702k);
            b0 b0VarU = u(phoneContactDetails);
            return new j.a.Initialized.AbstractC6025a.Edit(labelC, mx.b.d(b0VarU != null ? c0.e(b0VarU) : null, "phone"), new er.a() { // from class: z63.b
                @Override // er.a
                public final Object a() {
                    return g.s(editPhoneAction, phoneContactDetails);
                }
            });
        }
        if (i15 != 4) {
            throw new oq.p();
        }
        Label labelC2 = this.labelProvider.c(c53.a.f23692g1);
        Label labelC3 = this.labelProvider.c(c53.a.f23702k);
        b0 b0VarU2 = u(phoneContactDetails);
        return new j.a.Initialized.AbstractC6025a.Pending(labelC2, labelC3, mx.b.d(b0VarU2 != null ? c0.e(b0VarU2) : null, "email"), pendingPhoneAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(p pVar, ContactDetail contactDetail) {
        Object next;
        b0 b0VarA;
        Iterator<T> it = contactDetail.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!t.c(((ContactDetailAdditionalValue) next).getKey(), "PREFIX"));
        ContactDetailAdditionalValue contactDetailAdditionalValue = (ContactDetailAdditionalValue) next;
        if (contactDetailAdditionalValue == null || (b0VarA = contactDetailAdditionalValue.getValue()) == null) {
            b0VarA = b0.INSTANCE.a();
        }
        b0 value = contactDetail.getValue();
        if (value == null) {
            value = b0.INSTANCE.a();
        }
        pVar.B(b0VarA, value);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    private final b0 u(ContactDetail contactDetail) {
        Object next;
        String str;
        int i15 = b.f233210b[contactDetail.getType().ordinal()];
        if (i15 != 1) {
            if (i15 == 2) {
                return contactDetail.getValue();
            }
            if (i15 == 3) {
                return null;
            }
            throw new oq.p();
        }
        StringBuilder sb5 = new StringBuilder();
        Iterator<T> it = contactDetail.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!t.c(((ContactDetailAdditionalValue) next).getKey(), "PREFIX"));
        ContactDetailAdditionalValue contactDetailAdditionalValue = (ContactDetailAdditionalValue) next;
        if (contactDetailAdditionalValue != null) {
            str = '+' + c0.e(contactDetailAdditionalValue.getValue()) + ' ';
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        sb5.append(str);
        b0 value = contactDetail.getValue();
        sb5.append(value != null ? c0.e(value) : null);
        return c0.g(sb5.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(Params params, i iVar) {
        params.a().b(Boolean.valueOf(((i.Initialized) iVar).getContactDetails().getIsSomeRegistryContactAdded()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Params params, ContactDetail contactDetail, i iVar) {
        i.Initialized initialized = (i.Initialized) iVar;
        params.d().w(contactDetail, initialized.getContactDetails().getPreviousEmailData(), Boolean.valueOf(initialized.getContactDetails().getIsSomeRegistryContactAdded()));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public j.a b(final Params params) {
        final i state = params.getState();
        if (t.c(state, i.a.f224783a)) {
            return j.a.C6024a.f224788a;
        }
        if (state instanceof i.NotAdult) {
            return new j.a.NoAccess(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.c()), null, null, null, null, 30, null), null, null, null, null, 61, null), ((i.NotAdult) state).getTitle(), null, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(c53.a.S0), null, 2, null), k30.d.a.f107773a, null, params.h(), 35, null), 4, null);
        }
        if (t.c(state, i.d.f224786a)) {
            return new j.a.NoAccess(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.c()), null, null, null, null, 30, null), null, null, null, null, 61, null), this.labelProvider.c(c53.a.f23683d1), this.labelProvider.c(c53.a.f23680c1), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(c53.a.f23675b), null, 2, null), k30.d.a.f107773a, null, params.c(), 35, null));
        }
        if (!(state instanceof i.Initialized)) {
            throw new oq.p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.c()), this.labelProvider.c(c53.a.f23707l1), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216848d, null, null, params.j(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        o40.a.Icon icon = new o40.a.Icon(jz.a.f106881v, c.f233211a, d.f233212a, this.labelProvider.c(c53.a.f23686e1), this.labelProvider.c(c53.a.T0), null, 32, null);
        i.Initialized initialized = (i.Initialized) state;
        final ContactDetail emailData = initialized.getContactDetails().getEmailData();
        if (emailData == null) {
            emailData = new ContactDetail(null, xi0.d.EMAIL, xi0.c.NO_DATA, v.n());
        }
        j.a.Initialized.AbstractC6025a abstractC6025aM = m(emailData, new er.a() { // from class: z63.c
            @Override // er.a
            public final Object a() {
                return g.x(params, state);
            }
        }, params.f(), new er.a() { // from class: z63.d
            @Override // er.a
            public final Object a() {
                return g.z(params, emailData, state);
            }
        });
        final ContactDetail phoneData = initialized.getContactDetails().getPhoneData();
        if (phoneData == null) {
            phoneData = new ContactDetail(null, xi0.d.PHONE, xi0.c.NO_DATA, v.n());
        }
        List listQ = v.q(abstractC6025aM, r(phoneData, new er.a() { // from class: z63.e
            @Override // er.a
            public final Object a() {
                return g.E(params, state);
            }
        }, params.g(), new er.a() { // from class: z63.f
            @Override // er.a
            public final Object a() {
                return g.F(params, phoneData, state);
            }
        }));
        ArrayList arrayList = new ArrayList(v.y(listQ, 10));
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            arrayList.add(((j.a.Initialized.AbstractC6025a) it.next()).a());
        }
        return new j.a.Initialized(baseScaffoldData, icon, arrayList, params.i());
    }
}
