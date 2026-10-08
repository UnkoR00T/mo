package xd1;

import a50.RadioButtonData;
import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import b50.d;
import b50.e;
import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.List;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import t40.InfoRowListData;
import wd1.h;
import wd1.i;
import x40.LinkData;
import x50.NavigationButtonData;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lxd1/c;", "Lxw/f;", "Lxd1/c$a;", "Lwd1/i$a;", "Lmx/c;", "labelProvider", "Lia1/a;", "companyEndpoints", "<init>", "(Lmx/c;Lia1/a;)V", "params", "f", "(Lxd1/c$a;)Lwd1/i$a;", "a", "Lmx/c;", "b", "Lia1/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, i.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ia1.a companyEndpoints;

    /* JADX INFO: renamed from: xd1.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010&R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b$\u0010&R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\u001a\u0010&R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b\u001e\u0010&¨\u0006'"}, d2 = {"Lxd1/c$a;", "", "Lwd1/h;", "state", "Lkotlin/Function1;", "Lrd1/c;", "Loq/i0;", "onSelectElectronicDeliveryOption", "", "onUrlClick", "Lkotlin/Function0;", "moreInfoAction", "nextAction", "backAction", "closeAction", "<init>", "(Lwd1/h;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwd1/h;", "g", "()Lwd1/h;", "b", "Ler/l;", "e", "()Ler/l;", "c", "f", "d", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final h state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<rd1.c, i0> onSelectElectronicDeliveryOption;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onUrlClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> moreInfoAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(h hVar, l<? super rd1.c, i0> lVar, l<? super String, i0> lVar2, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = hVar;
            this.onSelectElectronicDeliveryOption = lVar;
            this.onUrlClick = lVar2;
            this.moreInfoAction = aVar;
            this.nextAction = aVar2;
            this.backAction = aVar3;
            this.closeAction = aVar4;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.closeAction;
        }

        public final er.a<i0> c() {
            return this.moreInfoAction;
        }

        public final er.a<i0> d() {
            return this.nextAction;
        }

        public final l<rd1.c, i0> e() {
            return this.onSelectElectronicDeliveryOption;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onSelectElectronicDeliveryOption, params.onSelectElectronicDeliveryOption) && t.c(this.onUrlClick, params.onUrlClick) && t.c(this.moreInfoAction, params.moreInfoAction) && t.c(this.nextAction, params.nextAction) && t.c(this.backAction, params.backAction) && t.c(this.closeAction, params.closeAction);
        }

        public final l<String, i0> f() {
            return this.onUrlClick;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final h getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onSelectElectronicDeliveryOption.hashCode()) * 31) + this.onUrlClick.hashCode()) * 31) + this.moreInfoAction.hashCode()) * 31) + this.nextAction.hashCode()) * 31) + this.backAction.hashCode()) * 31) + this.closeAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onSelectElectronicDeliveryOption=" + this.onSelectElectronicDeliveryOption + ", onUrlClick=" + this.onUrlClick + ", moreInfoAction=" + this.moreInfoAction + ", nextAction=" + this.nextAction + ", backAction=" + this.backAction + ", closeAction=" + this.closeAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f218050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f218051b;

        static {
            int[] iArr = new int[ld1.l.values().length];
            try {
                iArr[ld1.l.APPLICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ld1.l.MANAGEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f218050a = iArr;
            int[] iArr2 = new int[rd1.c.values().length];
            try {
                iArr2[rd1.c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            f218051b = iArr2;
        }
    }

    public c(mx.c cVar, ia1.a aVar) {
        this.labelProvider = cVar;
        this.companyEndpoints = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params) {
        params.e().b(rd1.c.CREATE_NEW_ADDRESS);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params) {
        params.e().b(rd1.c.OWN_NOT_PUBLIC_ADDRESS);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public i.a b(final Params params) {
        int i15;
        h state = params.getState();
        if (state instanceof h.InfoPage) {
            return new i.a.InfoPage(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), this.labelProvider.c(ha1.a.H), null, null, null, 28, null), null, null, null, null, 61, null), this.labelProvider.c(ha1.a.G1), this.labelProvider.c(ha1.a.A1), this.labelProvider.c(ha1.a.B1), this.labelProvider.c(ha1.a.C1), new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(ha1.a.E1)), new t40.a.C4874a(this.labelProvider.c(ha1.a.F1)))), this.labelProvider.c(ha1.a.D1), this.labelProvider.c(ha1.a.M1), new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(ha1.a.J1)), new t40.a.C4874a(this.labelProvider.c(ha1.a.K1)))), this.labelProvider.c(ha1.a.L1), new LinkData(null, this.labelProvider.c(ha1.a.J4), this.companyEndpoints.m0(), LinkData.EnumC5775a.WEBSITE, false, params.f(), 17, null), params.a());
        }
        if (!(state instanceof h.Initialized)) {
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(ha1.a.f82475p2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(ha1.a.f82509u1);
        mx.c cVar = this.labelProvider;
        int i16 = b.f218050a[((h.Initialized) params.getState()).getProcessType().ordinal()];
        if (i16 == 1) {
            i15 = ha1.a.f82495s1;
        } else {
            if (i16 != 2) {
                throw new p();
            }
            i15 = ha1.a.f82502t1;
        }
        Label labelC2 = cVar.c(i15);
        ButtonTextData buttonTextData = new ButtonTextData(null, this.labelProvider.c(ha1.a.f82474p1), null, null, params.c(), 13, null);
        boolean z15 = false;
        if (((h.Initialized) params.getState()).getAnswer() == rd1.c.CREATE_NEW_ADDRESS) {
            z15 = true;
        }
        List listQ = v.q(new RadioButtonRow(new RadioButtonItemData(false, z15, false, 5, null), new er.a() { // from class: xd1.a
            @Override // er.a
            public final Object a() {
                return c.h(params);
            }
        }, this.labelProvider.c(ha1.a.f82481q1), null, null, 24, null), new RadioButtonRow(new RadioButtonItemData(false, ((h.Initialized) params.getState()).getAnswer() == rd1.c.OWN_NOT_PUBLIC_ADDRESS ? true : z15, false, 5, null), new er.a() { // from class: xd1.b
            @Override // er.a
            public final Object a() {
                return c.i(params);
            }
        }, this.labelProvider.c(ha1.a.f82488r1), null, null, 24, null));
        e.a aVar = e.a.f16684a;
        rd1.c answer = ((h.Initialized) params.getState()).getAnswer();
        return new i.a.Initialized(baseScaffoldData, labelC, labelC2, buttonTextData, new RadioButtonData(listQ, aVar, (answer == null ? -1 : b.f218051b[answer.ordinal()]) == 1 ? new d.Error(this.labelProvider.c(ha1.a.f82426j)) : d.c.f16683a, null, null, null, null, 120, null), params.a(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.E), null, 2, null), k30.d.a.f107773a, null, params.d(), 35, null));
    }
}
