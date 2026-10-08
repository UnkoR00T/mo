package lj3;

import er.l;
import fr.t;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.util.ArrayList;
import java.util.List;
import kj3.State;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import tj3.AbroadDetailsPayload;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Llj3/b;", "Lxw/f;", "Llj3/b$a;", "Lkj3/f$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Llj3/b$a;)Lkj3/f$a;", "a", "Lmx/c;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, kj3.f.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: lj3.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001e\u0010\u001d¨\u0006!"}, d2 = {"Llj3/b$a;", "", "Lkj3/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function1;", "Ltj3/a;", "showDetailsAction", "showInfoAboutData", "<init>", "(Lkj3/e;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkj3/e;", "d", "()Lkj3/e;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<AbroadDetailsPayload, i0> showDetailsAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> showInfoAboutData;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, l<? super AbroadDetailsPayload, i0> lVar, er.a<i0> aVar2) {
            this.state = state;
            this.onBackAction = aVar;
            this.showDetailsAction = lVar;
            this.showInfoAboutData = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final l<AbroadDetailsPayload, i0> b() {
            return this.showDetailsAction;
        }

        public final er.a<i0> c() {
            return this.showInfoAboutData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.showDetailsAction, params.showDetailsAction) && t.c(this.showInfoAboutData, params.showInfoAboutData);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.showDetailsAction.hashCode()) * 31) + this.showInfoAboutData.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", showDetailsAction=" + this.showDetailsAction + ", showInfoAboutData=" + this.showInfoAboutData + ')';
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, AbroadDetailsPayload abroadDetailsPayload) {
        params.b().b(abroadDetailsPayload);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public kj3.f.Data b(final Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(yi3.a.R), null, null, null, 28, null), null, null, null, null, 61, null);
        boolean showImportantInfo = params.getState().getShowImportantInfo();
        Boolean boolValueOf = Boolean.valueOf(showImportantInfo);
        if (!showImportantInfo) {
            boolValueOf = null;
        }
        c30.b.C0606b c0606b = boolValueOf != null ? new c30.b.C0606b(null, null, null, this.labelProvider.c(yi3.a.H), null, null, null, 119, null) : null;
        List<AbroadDetailsPayload> listA = params.getState().a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        for (final AbroadDetailsPayload abroadDetailsPayload : listA) {
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: lj3.a
                @Override // er.a
                public final Object a() {
                    return b.f(params, abroadDetailsPayload);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.e(yi3.a.Q, abroadDetailsPayload.getServiceName()), null, null, 0, 0, null, 62, null)), null, 5, null), null, x0.Icon.INSTANCE.b(), null, 2813, null));
        }
        return new kj3.f.Data(baseScaffoldData, c0606b, arrayList, new c30.b.c(null, null, null, this.labelProvider.c(yi3.a.N), null, null, new c30.a.ButtonText(new ButtonTextData(null, this.labelProvider.c(yi3.a.f227218d), null, null, params.c(), 13, null)), 55, null), params.a());
    }
}
