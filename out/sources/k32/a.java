package k32;

import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import j32.g;
import java.util.List;
import k30.d;
import mx.Label;
import mx.c;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.b;
import n50.x0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lk32/a;", "Lxw/f;", "Lk32/a$a;", "Lj32/g$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "edorAddress", "Lkotlin/Function0;", "Loq/i0;", "onCopyAddressClick", "Ln30/b;", "c", "(Ljava/lang/String;Ler/a;)Ln30/b;", "params", "e", "(Lk32/a$a;)Lj32/g$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, g.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: k32.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0017\u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\u001b\u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Lk32/a$a;", "", "Lj32/f;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onLinkClick", "Lkotlin/Function0;", "onBackClick", "onCopyAddressClick", "onCopyEpuapIdClick", "<init>", "(Lj32/f;Ler/l;Ler/a;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj32/f;", "e", "()Lj32/f;", "b", "Ler/l;", "d", "()Ler/l;", "c", "Ler/a;", "()Ler/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final j32.f state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onLinkClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCopyAddressClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCopyEpuapIdClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(j32.f fVar, l<? super String, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = fVar;
            this.onLinkClick = lVar;
            this.onBackClick = aVar;
            this.onCopyAddressClick = aVar2;
            this.onCopyEpuapIdClick = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final er.a<i0> b() {
            return this.onCopyAddressClick;
        }

        public final er.a<i0> c() {
            return this.onCopyEpuapIdClick;
        }

        public final l<String, i0> d() {
            return this.onLinkClick;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final j32.f getState() {
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
            return t.c(this.state, params.state) && t.c(this.onLinkClick, params.onLinkClick) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onCopyAddressClick, params.onCopyAddressClick) && t.c(this.onCopyEpuapIdClick, params.onCopyEpuapIdClick);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onLinkClick.hashCode()) * 31) + this.onBackClick.hashCode()) * 31) + this.onCopyAddressClick.hashCode()) * 31) + this.onCopyEpuapIdClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onLinkClick=" + this.onLinkClick + ", onBackClick=" + this.onBackClick + ", onCopyAddressClick=" + this.onCopyAddressClick + ", onCopyEpuapIdClick=" + this.onCopyEpuapIdClick + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    private final CardListData c(String edorAddress, er.a<i0> onCopyAddressClick) {
        if (edorAddress == null) {
            return null;
        }
        List listQ = v.q(new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(e02.a.f46549i4), null, null, 0, 0, null, 62, null), new b.Title(new SingleCardLabel(mx.b.d(edorAddress, "ElectronicDeliverySettingsAddressValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(e02.a.f46574n), mx.b.b(this.labelProvider.c(e02.a.f46574n).getText() + ' ' + this.labelProvider.c(e02.a.f46549i4).getText(), "copyEdorAddress")), d.a.f107773a, null, onCopyAddressClick, 35, null)), null, 2815, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(e02.a.f46567l4), null, null, 0, 0, null, 62, null), new b.Title(new SingleCardLabel(this.labelProvider.c(e02.a.f46573m4), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(e02.a.f46585o4), null, null, 0, 0, null, 62, null), new b.Title(new SingleCardLabel(this.labelProvider.c(e02.a.f46591p4), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null));
        if (listQ != null) {
            return new CardListData(listQ, null, false, null, null, 30, null);
        }
        return null;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public g.a b(Params params) {
        j32.f state = params.getState();
        if (!(state instanceof j32.f.Initialized)) {
            if (t.c(state, j32.f.a.f99250a)) {
                return g.a.C2328a.f99256a;
            }
            throw new p();
        }
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(e02.a.f46593q0), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelB = mx.b.b(((j32.f.Initialized) params.getState()).getUserDocumentData().getFirstName() + ' ' + ((j32.f.Initialized) params.getState()).getUserDocumentData().getSurname(), "ElectronicDeliverySettingsNamesValue");
        b0 edorAddress = ((j32.f.Initialized) params.getState()).getEdorAddress();
        return new g.a.Initialized(baseScaffoldData, labelB, c(edorAddress != null ? c0.e(edorAddress) : null, params.b()), new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(e02.a.f46579n4), null, null, 0, 0, null, 62, null), new b.Title(new SingleCardLabel(mx.b.d(((j32.f.Initialized) params.getState()).getEpuapId(), "ElectronicDeliverySettingsEpuapValue"), null, null, 0, 0, null, 62, null)), null, 4, null), null, new x0.Button(new ButtonData(null, null, k30.a.b.f107765a, new k30.c.WithText(this.labelProvider.c(e02.a.f46574n), mx.b.b(this.labelProvider.c(e02.a.f46574n).getText() + ' ' + this.labelProvider.c(e02.a.f46579n4).getText(), "copyEpuap")), d.a.f107773a, null, params.c(), 35, null)), null, 2815, null), new LinkData(null, this.labelProvider.c(e02.a.f46561k4), ((j32.f.Initialized) params.getState()).getUrl(), LinkData.EnumC5775a.WEBSITE, false, params.d(), 17, null), this.labelProvider.c(e02.a.f46555j4));
    }
}
