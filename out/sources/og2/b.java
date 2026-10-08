package og2;

import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k30.d;
import mx.Label;
import mx.c;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.j0;
import ng2.e;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import tq0.LandRegisterSubDocument;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Log2/b;", "Lxw/f;", "Log2/b$a;", "Lng2/f$a;", "Lmx/c;", "labelProvider", "Ldz/a;", "currencyFormatter", "<init>", "(Lmx/c;Ldz/a;)V", "params", "f", "(Log2/b$a;)Lng2/f$a;", "Ltq0/s;", "Lmx/a;", "e", "(Ltq0/s;)Lmx/a;", "a", "Lmx/c;", "b", "Ldz/a;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, ng2.f.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dz.a currencyFormatter;

    /* JADX INFO: renamed from: og2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006!"}, d2 = {"Log2/b$a;", "", "Lng2/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lkotlin/Function1;", "Ltq0/s;", "onSelectedItem", "onGoNextClick", "<init>", "(Lng2/e;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lng2/e;", "d", "()Lng2/e;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<LandRegisterSubDocument, i0> onSelectedItem;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoNextClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(e eVar, er.a<i0> aVar, l<? super LandRegisterSubDocument, i0> lVar, er.a<i0> aVar2) {
            this.state = eVar;
            this.onBackClick = aVar;
            this.onSelectedItem = lVar;
            this.onGoNextClick = aVar2;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final er.a<i0> b() {
            return this.onGoNextClick;
        }

        public final l<LandRegisterSubDocument, i0> c() {
            return this.onSelectedItem;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final e getState() {
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
            return t.c(this.state, params.state) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onSelectedItem, params.onSelectedItem) && t.c(this.onGoNextClick, params.onGoNextClick);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onSelectedItem.hashCode()) * 31) + this.onGoNextClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackClick=" + this.onBackClick + ", onSelectedItem=" + this.onSelectedItem + ", onGoNextClick=" + this.onGoNextClick + ')';
        }
    }

    public b(c cVar, dz.a aVar) {
        this.labelProvider = cVar;
        this.currencyFormatter = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, LandRegisterSubDocument landRegisterSubDocument) {
        params.c().b(landRegisterSubDocument);
        return i0.f148189a;
    }

    public final Label e(LandRegisterSubDocument landRegisterSubDocument) {
        int i15;
        c cVar = this.labelProvider;
        tq0.f subtype = landRegisterSubDocument.getSubtype();
        if (subtype instanceof tq0.f.c) {
            i15 = xf2.a.f218413x0;
        } else if (subtype instanceof tq0.f.b) {
            i15 = xf2.a.f218410w0;
        } else if (subtype instanceof tq0.f.d) {
            i15 = xf2.a.f218416y0;
        } else {
            if (!(subtype instanceof tq0.f.a)) {
                throw new p();
            }
            i15 = xf2.a.f218407v0;
        }
        return cVar.c(i15);
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ng2.f.a b(final Params params) {
        j0 error;
        e state = params.getState();
        if (t.c(state, e.b.f136171a)) {
            return ng2.f.a.C3357a.f136173a;
        }
        if (!(state instanceof e.Initialized)) {
            if (state instanceof e.LoadingError) {
                return new ng2.f.a.Error(((e.LoadingError) state).getError());
            }
            throw new p();
        }
        er.a<i0> aVarA = params.a();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(xf2.a.A0), null, null, null, 28, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(xf2.a.f218419z0);
        e.Initialized initialized = (e.Initialized) state;
        List<LandRegisterSubDocument> listD = initialized.d();
        ArrayList arrayList = new ArrayList(v.y(listD, 10));
        Iterator<T> it = listD.iterator();
        while (true) {
            if (!it.hasNext()) {
                return new ng2.f.a.Initialized(aVarA, baseScaffoldData, labelC, arrayList, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(xf2.a.f218388p), null, 2, null), d.a.f107773a, null, params.b(), 35, null), initialized.getShowError() ? this.labelProvider.c(xf2.a.f218358f) : null, mx.b.b(this.labelProvider.c(xf2.a.f218404u0).getText() + ' ' + this.currencyFormatter.b(initialized.getCalculatedAmount(), "PLN"), "sum"));
            }
            final LandRegisterSubDocument landRegisterSubDocument = (LandRegisterSubDocument) it.next();
            boolean showError = initialized.getShowError();
            if (showError) {
                error = new j0.Error(null, 1, null);
            } else {
                if (showError) {
                    throw new p();
                }
                error = j0.a.f132074a;
            }
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: og2.a
                @Override // er.a
                public final Object a() {
                    return b.h(params, landRegisterSubDocument);
                }
            }, false, error, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(lg2.c.d(landRegisterSubDocument.getSubtype())), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(e(landRegisterSubDocument), null, null, 0, 0, null, 62, null)), null, 4, null), new LeadingSection(false, new n50.d.CheckBox(initialized.e().contains(landRegisterSubDocument)), null, 5, null), null, null, 3317, null));
        }
    }
}
